
package bst;

import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Simulare {

    BinarySearchTrees arbore = new BinarySearchTrees();

    public Simulare() {
    }
  

public boolean stergere(Integer data) {
    return this.arbore.sterge(data);
}
    public boolean inserare(Integer data) {
        return (this.arbore.adauga(data));
    }
    public String preOrder() {
        LinkedList it = this.arbore.preOrder();
            return (traseu(it, "Traseu PreOrder"));
    }

    public String inOrder() {
        LinkedList it = this.arbore.inOrder();
        return (traseu(it, "Traseu InOrder"));
    }

    public String postOrder() {
        LinkedList it = this.arbore.postOrder();
        return (traseu(it, "Traseu PostOrder"));
    }
    
    private String traseu(LinkedList it, String msg) {
        int i = 0;
        String r = msg + "\n";
        while (i < it.size()) {
            r += "\t" + it.get(i).toString() + "";
            i++;
        }
        return (r);
    }
    
    
    public String cauta(Integer data) {
        boolean ok = this.arbore.exista(data);
        String r = "Data:" + data.toString() + "\n";
        r += ok ? " Se găsește în copac" : "Nu se găsește în copac";
        return (r);
    }

    public JPanel getDesen() {
        return this.arbore.getdesen();
    }

    private void reprintare() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
