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
        alunos.remove(0);
        System.out.println("removendo " + alunos.remove(2) + " (Terceiro(a) aluno(a))");

        System.out.println("agora a lista tem " + alunos.size() + " alunos");
        System.out.println("Lista de alunos: " + alunos);
    }
}
