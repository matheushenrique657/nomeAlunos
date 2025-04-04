import java.util.ArrayList;
import java.util.Scanner;

public class nomeAlunos {
    public static void main(String[] args) {

        ArrayList<String> alunos = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos deseja colocar na lista? ");
        int quantidade = sc.nextInt();

        System.out.print("Digite o nome de " + quantidade + " alunos: ");

        while (alunos.size() <= quantidade) {
            alunos.add(sc.nextLine());
        }
        System.out.println("Qual aluno deseja remover da lista?");
        String remover = sc.nextLine();
        alunos.remove(remover);
        alunos.removeFirst();
        System.out.println("agora a lista tem " + alunos.size() + " alunos");
        System.out.println("Lista de alunos: " + alunos);
    }
}
