package Lista_05;
/*
Implemente a classe Pilha para armazenar valores inteiros, utilizando referências para interligar os elementos armazenados.
Crie um método para criar uma pilha vazia.
Crie um método responsável por inserir um elemento na pilha.
Crie um método responsável por remover um elemento da pilha.
Crie um método para exibir o conteúdo de uma pilha.
Crie um método que retorne o número de elementos existentes na pilha.*/

public class Pilha {

    private Nodo topo;
    private int tamanho;

    public Pilha(){
        this.tamanho = 0;
        this.topo = null;

    }

    public void push(int elemento){

        Nodo nodo = new Nodo(elemento);

        if(this.tamanho == 0){
            this.topo = nodo;
            this.tamanho++;
            nodo.setProximo(null);
        }
        else{
            this.topo.setProximo(nodo);
            nodo.setAnterior(this.topo);
            this.topo = nodo;
            this.tamanho++;
        }
    }

    public void pop(){
        if(this.tamanho > 0){
            this.topo = this.topo.getAnterior();
            this.tamanho--;
        }
        else{
            System.out.println("A lista está vazia! Insira um elemento antes de remover outros!");
        }
    }

    public void exibirPilha(){
        if(this.tamanho > 0){
            Nodo atual = this.topo;
            System.out.println("Elementos da pilha:");
            for (int i = 0; i < this.tamanho; i++){
                System.out.println(atual.getElemento());
                atual = atual.getAnterior();
            }
        }
        else{
            System.out.println("A lista está vazia! Insira um elemento antes de exibir!");
        }
    }

    public void size(){
        System.out.printf("A pilha possui %d elemento(s).\n", this.tamanho);
    }

}