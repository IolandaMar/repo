import java.util.Scanner;
import java.lang.Math;
public class Apartat2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introdueix el preu del pc i el sou d'en Pere (separats per un espai): ");
            double preuPc = scanner.nextDouble();
            double souPere = scanner.nextDouble();

            double descompte = 0.05 * preuPc;
            double preuFinal = preuPc - descompte;
            double estalviDiari = souPere * 0.1;
            int diesNecessaris = (int) Math.ceil(preuFinal / estalviDiari);

            System.out.println("En Pere ha d'estalviar durant " + diesNecessaris + " dies");
        }
    }


