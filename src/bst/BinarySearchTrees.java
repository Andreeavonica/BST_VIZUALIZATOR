
package bst;

import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class BinarySearchTrees {

    private Nod sursa;
    int num_nod;
    int alt;

    public BinarySearchTrees() {
        sursa = null;
    }
    public boolean sterge(int data) {
    sursa = stergeNod(sursa, data);
    return true;
}

private Nod stergeNod(Nod radacina, int data) {
    if (radacina == null) {
        return radacina;
    }

    if (data < radacina.getData()) {
        radacina.setSt(stergeNod(radacina.getSt(), data));
    } else if (data > radacina.getData()) {
        radacina.setDer(stergeNod(radacina.getDr(), data));
    } else {
     
        if (radacina.getSt() == null) {
            return radacina.getDr();
        } else if (radacina.getDr() == null) {
            return radacina.getSt();
        }

      
        radacina.setData(minimValue(radacina.getDr()));


        radacina.setDer(stergeNod(radacina.getDr(), radacina.getData()));
    }

    return radacina;
}

private int minimValue(Nod node) {
    int minValue = node.getData();
    while (node.getSt() != null) {
        minValue = node.getSt().getData();
        node = node.getSt();
    }
    return minValue;
}


    
    public boolean adauga(int data) {
        Nod nou = new Nod(data, null, null);
        inserare(nou, sursa);
        return true;
    }
    
    
  public void inserare(Nod nou, Nod pivot) {
    if (this.sursa == null) {
        sursa = nou;
    } else {
        if (nou.getData() < pivot.getData()) {
            if (pivot.getSt() == null) {
                pivot.setSt(nou);
            } else {
                inserare(nou, pivot.getSt());
            }
        } else if (nou.getData() > pivot.getData()) {
            if (pivot.getDr() == null) {
                pivot.setDer(nou);
            } else {
                inserare(nou, pivot.getDr());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Valoarea introdusa exista deja!", "", 0);
        }
    }
}  


    public Nod getSursa() {
        return sursa;
    }

    public void setSursa(Nod sursa) {
        this.sursa = sursa;
    }

    public LinkedList preOrder() {
        LinkedList rec = new LinkedList();
        preorder(sursa, rec);
        return rec;
    }
    
    public void preorder(Nod aux, LinkedList traseu) {
        if (aux != null) {
            traseu.add(aux.getData());
            preorder(aux.getSt(), traseu);
            preorder(aux.getDr(), traseu);
        }
    }

    public LinkedList inOrder() {
        LinkedList rec = new LinkedList();
        inorder(sursa, rec);
        return rec;
    }
    
    public void inorder(Nod aux, LinkedList traseu) {
        if (aux != null) {
            inorder(aux.getSt(), traseu);
            traseu.add(aux.getData());
            inorder(aux.getDr(), traseu);
        }
    }

    public LinkedList postOrder() {
        LinkedList rec = new LinkedList();
        postorder(sursa, rec);
        return rec;
    }
    public void postorder(Nod aux, LinkedList traseu) {
        if (aux != null) {
            postorder(aux.getSt(), traseu);
            postorder(aux.getDr(), traseu);
            traseu.add(aux.getData());
        }
    }

    public boolean exista(int data) {
        Nod aux = sursa;
        while (aux != null) {
            if (data == aux.getData()) {
                return true;
            } else if (data > aux.getData()) {
                aux = aux.getDr();
            } else {
                aux = aux.getSt();
            }
        }
        return false;
    }

    private void inaltime(Nod aux, int nivel) {
        if (aux != null) {
            inaltime(aux.getSt(), nivel + 1);
            alt = nivel;
            inaltime(aux.getDr(), nivel + 1);
        }
    }

   
    public int getInaltime() {
        inaltime(sursa, 1);
        return alt;
    }
    
     public JPanel getdesen() {
        return new ReprezGrafica(this);
    }
}
