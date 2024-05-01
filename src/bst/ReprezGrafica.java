
package bst;

 
import java.awt.*;
import java.util.*;
import javax.swing.*;


public class ReprezGrafica extends JPanel 
{
    private BinarySearchTrees arbore;
    private HashMap nodPrecizie = null;
    private HashMap subtreeSizes = null;
    private boolean dirty = true;
    private int parent2child = 20, child2child = 30;
    private Dimension empty = new Dimension(0,0);
    private FontMetrics fm = null;
    
    
 
    public ReprezGrafica(BinarySearchTrees arbore) 
    {
          this.arbore = arbore;
          this.setBackground(Color.WHITE);
          nodPrecizie = new HashMap();
          subtreeSizes = new HashMap();
          dirty = true;
          repaint();      
    }


    
    private void calculeazaPoz() 
    {
         nodPrecizie.clear();
         subtreeSizes.clear();
         Nod root = this.arbore.getSursa();
         if (root != null) 
         {
             DimSubarbore(root);
             calPozitie(root, Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
         }
    }
    
  
    private Dimension DimSubarbore(Nod n) 
    {
          if (n == null) 
              return new Dimension(0,0);
 
          Dimension ld = DimSubarbore(n.getSt());
          Dimension rd = DimSubarbore(n.getDr());
          
          int h = fm.getHeight() + parent2child + Math.max(ld.height, rd.height);
          int w = ld.width + child2child + rd.width;
          
          Dimension d = new Dimension(w, h);
          subtreeSizes.put(n, d);
          
          return d;
    }
    
    
  
    private void calPozitie(Nod n, int left, int right, int top) 
    {
      if (n == null) 
          return;
      
      Dimension ld = (Dimension) subtreeSizes.get(n.getSt());
      if (ld == null) 
          ld = empty;
      
      Dimension rd = (Dimension) subtreeSizes.get(n.getDr());
      if (rd == null) 
          rd = empty;
      
      int center = 0;
      
      if (right != Integer.MAX_VALUE)
          center = right - rd.width - child2child/2;
      else if (left != Integer.MAX_VALUE)
          center = left + ld.width + child2child/2;
      int width = fm.stringWidth(n.getData()+"");
 
      nodPrecizie.put(n,new Rectangle(center - width/2 - 3, top, width + 6, fm.getHeight()));
      
      calPozitie(n.getSt(), Integer.MAX_VALUE, center - child2child/2, top + fm.getHeight() + parent2child);
      calPozitie(n.getDr(), center + child2child/2, Integer.MAX_VALUE, top + fm.getHeight() + parent2child);
    }
    
    
    private void dezeneazaArbore(Graphics2D g, Nod n, int pctX, int pctY, int yoffs) 
    {
     if (n == null) 
         return;
     
     Rectangle r = (Rectangle) nodPrecizie.get(n);
     g.draw(r);
     g.drawString(n.getData()+"", r.x + 3, r.y + yoffs);
   
     if (pctX != Integer.MAX_VALUE)
       
     g.drawLine(pctX, pctY, (int)(r.x + r.width/2), r.y);
     
     dezeneazaArbore(g, n.getSt(), (int)(r.x + r.width/2), r.y + r.height, yoffs);
     dezeneazaArbore(g, n.getDr(), (int)(r.x + r.width/2), r.y + r.height, yoffs);
     
   }
    

 
    @Override
   public void paint(Graphics g) 
   {
         super.paint(g);
         fm = g.getFontMetrics();

         if (dirty) 
         {
           calculeazaPoz();
           dirty = false;
         }
         
         Graphics2D g2d = (Graphics2D) g;
         g2d.translate(getWidth() / 2, parent2child);
         dezeneazaArbore(g2d, this.arbore.getSursa(), Integer.MAX_VALUE, Integer.MAX_VALUE, 
                  fm.getLeading() + fm.getAscent());
         fm = null;
   }
   
 }




