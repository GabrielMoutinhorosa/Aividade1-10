import java.util.Scanner;

public class MainRobo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Robo robo = new Robo();
        robo.ligar();

        while (robo.ligado) {
            System.out.println("\nComandos: 1-Andar 2-Esq 3-Dir 4-Desligar");
            int cmd = sc.nextInt();
            switch (cmd) {
                case 1: robo.andar(); break;
                case 2: robo.virarEsquerda(); break;
                case 3: robo.virarDireita(); break;
                case 4: robo.desligar(); break;
                default: System.out.println("Comando inválido.");
            }
        }
        sc.close();
    }
}