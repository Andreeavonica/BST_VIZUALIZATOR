
package bst;


public class Nod {
    private int data;
    private Nod St,Dr;

    public Nod(int data, Nod St, Nod Dr) {
        this.data = data;
        this.St = St;
        this.Dr = Dr;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Nod getSt() {
        return St;
    }

    public void setSt(Nod St) {
        this.St = St;
    }

    public Nod getDr() {
        return Dr;
    }

    public void setDer(Nod Dr) {
        this.Dr = Dr;
    }
 
}
