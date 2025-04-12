package arvorebinaria;


public class ArvoreTAD {
    private Nodo raiz;
    private int num;//variável para contar a quantidade de elementos

    public ArvoreTAD() {
        this.raiz = null;
        this.num = 0;
    }


    public void insere(char elem) {
        if (raiz == null){
            this.raiz = new Nodo(elem);
        }
        else {
            this.insereRec(elem, raiz);
        }
        this.num += 1;
    }

    private void insereRec(char elem, Nodo n) {
        if (elem == n.elem){
            System.out.println("O elemento já está na árvore");
        }
        else if (elem < n.elem){
            if (n.esq == null){
                n.esq = new Nodo(elem);
            }
            else{
                this.insereRec(elem,n.esq);
            }
        }
        else if (elem > n.elem){
            if (n.dir == null){
                n.dir = new Nodo(elem);
            }
            else {
                this.insereRec(elem, n.dir);
            }
        }
    }//insere um elemento

    public boolean pesquisa(char elem) {
        return  this.pesquisaRec(elem, getRaiz());
    }

    private boolean pesquisaRec(char elem, Nodo n) {
        if(n == null) return  false;
        if(elem == n.elem) return true;
        if (elem < n.elem) 
            return pesquisaRec(elem, n.esq);
        else 
            return  pesquisaRec(elem, n.dir);
    }
    
    public void imprimeEmOrdem() {
        this.imprimeEmOrdemRec(this.raiz);
    }

    private void imprimeEmOrdemRec(Nodo n) {
        if(n == null){
            return;
        }
        this.imprimeEmOrdemRec(n.esq);
        System.out.print(n.elem+" ");
        this.imprimeEmOrdemRec(n.dir);
    }//imprime em ordem crescente, em linhas separadas

    public  void imprimePreOrdem(){ this.imprimePreOrdemRec(this.raiz);}

    private void imprimePreOrdemRec(Nodo n) {
        if(n == null){
            return;
        }
        System.out.print(n.elem+" ");
        this.imprimeEmOrdemRec(n.esq);
        this.imprimeEmOrdemRec(n.dir);
    }//imprime em formato pré-ordem (raiz-esq-dir)

    public void PosOrdem(Nodo node) {
        imprimePosOrdem(getRaiz());
    }

    public Nodo getRaiz(){
        return this.raiz;
    }


    public void imprimePosOrdem(Nodo node) {
        if (node != null) {
            imprimePosOrdem(node.esq);
            imprimePosOrdem(node.dir);
            System.out.print(node.elem+ " ");
        }

    }


}
