package arvorebinaria;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ArvoreTAD arv = new ArvoreTAD();
        Scanner scan = new Scanner(System.in);

        boolean repetir = true;

        while (repetir) {
            System.out.print("Digite o comando: "); // Adicione um prompt para o usuário
            String linha = scan.nextLine().trim(); // Lê a linha inteira e remove espaços em branco extras

            if (linha.equals("INFIXA")) {
                arv.imprimeEmOrdem();
            } else if (linha.equals("PREFIXA")) {
                arv.imprimePreOrdem();
            } else if (linha.equals("POSFIXA")) {
                arv.imprimePosOrdem(arv.getRaiz());
            } else if (linha.startsWith("I ") && linha.length() > 2) {
                char convertido = linha.charAt(2); // O caractere a ser inserido estará no índice 2 (após "I ")
                arv.insere(convertido);
                System.out.println("Inserindo: " + convertido); // Feedback para o usuário
            } else if (linha.startsWith("P ") && linha.length() > 2) {
                char convertido = linha.charAt(2); // O caractere a ser pesquisado estará no índice 2 (após "P ")
                arv.pesquisa(convertido);
                System.out.println("Pesquisando: " + convertido); // Feedback para o usuário
                System.out.println(arv.pesquisa(convertido));
            } else if (!linha.isEmpty()) {
                System.out.println("Comando inválido ou formato incorreto.");
                repetir=false;
            } else {
                repetir = false; // Se o usuário digitar apenas Enter (linha vazia), sai do loop
            }
        }
        System.out.println("Encerrando o programa."); // Mensagem de encerramento mais amigável
        scan.close();
    }
}



        /*while (op < 6){
            System.out.println("MENU DE OPERAÇÕES: ");
            System.out.println("1 - Insere elemento na árvore");
            System.out.println("2 - Pesquisa por um elemento na árvore");
            System.out.println("3 - Imprime elementos da árvore (em ordem)");
            System.out.println("4 - Imprime elementos da árvore (pré ordem)");
            System.out.println("5 - Imprime elementos da árvore (pós ordem)");


            op = scan.nextInt();

            if (op == 1){
               System.out.println("Insira o Elemento: ");

               String insere = scan.next();
               char letra = insere.charAt(0);
               arv.insere(letra);

            }
            else if (op == 2){
                System.out.println("Pesquisa valor: ");
                String insere = scan.next();
                char letra = insere.charAt(0);
                System.out.println(arv.pesquisa(letra));
            }
            else if (op == 3){
                arv.imprimeEmOrdem();
            }
            else if (op == 4){
                arv.imprimePreOrdem();
            }
            else if (op == 5){
                arv.PosOrdem(arv.getRaiz());
            }

        }

    }
} */

