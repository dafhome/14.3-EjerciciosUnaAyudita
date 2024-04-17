import java.util.Scanner;

public class AsociacionBenefica {
    public static void main(String[] args) throws Exception {
        Boolean validar = false;
        int personas = 0;
        int dinero = 0;
        Scanner teclado = new Scanner(System.in);

        while (!validar) {
            System.out.println("¿Una ayudita? Indica salir cuando no haya más personas.");
            String respuesta = teclado.nextLine();
            if ("salir".equalsIgnoreCase(respuesta)) {
                validar=true;
            }
            else if ("si".equalsIgnoreCase(respuesta)){
                System.out.println("Muchas gracias! Cuanto dinero quieres aportar?");
                personas++;

                int dineroDonado = teclado.nextInt();
                dinero = dinero + dineroDonado;
                // teclado.nextLine();
            }
            else if ("no".equalsIgnoreCase(respuesta)){
                System.out.println("Me quedo triste, voy a preguntarle a otro.");
            }
            else {
                System.out.println("Recuerda que solo si/no/salir son respuestas validas.");
            }
            // teclado.nextLine();
        }
        teclado.close();
        if (dinero>0) {
            System.out.println("Enhorabuena! Has conseguido que "+personas+" donen dinero y has recaudado "+dinero+"€");    
        }
        else{
            System.out.println("Lo siento, no has conseguido nada de dinero. Otro día tendrás más suerte.");
        }
    }
}
