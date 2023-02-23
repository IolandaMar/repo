import java.util.Scanner;

public class Joc {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String resposta;
        int[] arr= {1,2,3,4,5,6};
        int ns= (int) (Math.random()*6+1);
        for(int i=0;i<arr.length;i++) {
            System.out.println("Do you pull the trigger?");
            resposta = entrada.nextLine();
            if(resposta.equals("NO") || resposta.equals("No") || resposta.equals("no")) {
                System.out.println("Oh, that's a shame, Sayonara baby...");
                i=arr.length;
            }else {
                if (ns==arr[i]) {
                    System.out.println("You die.");
                    i=arr.length;
                }else {
                    System.out.println("so lucky");
                }

            }
        }

    }

}

