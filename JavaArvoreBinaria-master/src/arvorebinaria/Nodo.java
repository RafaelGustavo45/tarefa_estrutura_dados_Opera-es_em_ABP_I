package arvorebinaria;

public class Nodo {
    public char elem;
    public Nodo esq, dir;

    public Nodo(char elem) {
        this.elem = elem;
        this.esq = null;
        this.dir = null;
    }
}
