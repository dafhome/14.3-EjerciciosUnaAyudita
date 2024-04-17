import java.util.Scanner;

import javax.swing.text.html.Option;

public class Sonidos {
    // 3- SWITCH - WHILE:
    // El archivo sonoro!
    // Usando una variable byte, preguntas cuál de los sonidos quieres escuchar.
    // Cuando eligen un número, aparece la onomatopeya de ese sonido. Luego le
    // preguntas: quieres escuchar otro? Y sigue hasta que diga no.
    // Ejemplo: elige 1- cohete, y suena ziuuum!, elige 3- moto, y suena brrrmmm!
    // Puedes probar la opción do...while para asegurar de que prueba al menos una
    // vez.
    public static void main(String[] args) throws Exception {

        byte option=0;
        String optionString;
        int optionInt;
        boolean validar = false;
        int contador = 0;
        Scanner teclado = new Scanner(System.in);
        boolean si;


        while (!validar) {

            System.out.println("Elige una de las siguientes opciones y te mostraré el sonido que hace:");
            System.out.println("1.Cohete");
            System.out.println("2.Moto");
            System.out.println("3.Tambor");
            System.out.println("4.Teléfono");
            System.out.println("5.Gato");
            System.out.println("6.Pájaro");
            // System.out.println("0.Salir");

            if (teclado.hasNextByte()) {
                option = teclado.nextByte();
            }
            else{
                option=0;
            }

            int validarUnaVez = 0;
            // do{
            si=false;
            switch (option) {
                case 1:
                    System.out.println("¡ziuuum!");
                    contador++;
                    break;
                case 2:
                    System.out.println("¡brrrmmm!");
                    contador++;
                    break;
                case 3:
                    System.out.println("¡ratatatá!");
                    contador++;
                    break;
                case 4:
                    System.out.println("¡ring ring!");
                    contador++;
                    break;
                case 5:
                    System.out.println("¡miau!");
                    contador++;
                    break;
                case 6:
                    System.out.println("¡pio pio!");
                    contador++;
                    break;
                default:
                System.out.println("----------------------------------------------------------------------------");

                    System.out.println("Valor incorrecto! Introduce uno de los valores sugeridos entre 1 y 6.");
                    si = true;
                    break;
            }
            teclado.nextLine();

            // validarUnaVez++;

            // }while(validarUnaVez<1);


            while (!si) {
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("¿Quieres que te muestre otro sonido? Indica si/no.");
                String respuesta = teclado.nextLine();
                if ("no".equalsIgnoreCase(respuesta)) {

                    validar = true;
                    si = true;
                } else if ("si".equalsIgnoreCase(respuesta)) {
                    System.out.println("----------------------------------------------------------------------------");

                    si = true;
                } else {
                    System.out.println("Introduce si/no como respuesta de la pregunta.");
                }

            }

        }
        if (contador > 1) {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("Parece que te ha gustado! Lo has probado " + contador + " veces.");
            System.out.println("----------------------------------------------------------------------------");


        }

        // do {
        // System.out.println("Elige una de las siguientes opciones y te mostraré el
        // sonido que hace:");
        // System.out.println("1.Cohete");
        // System.out.println("2.Moto");
        // System.out.println("3.Tambor");
        // System.out.println("4.Teléfono");
        // System.out.println("5.Gato");
        // System.out.println("6.Pájaro");
        // System.out.println("0.Salir");

        // option = teclado.nextByte();

        // switch (option) {
        // case 0:
        // break;
        // case 1:
        // System.out.println("¡ziuuum!");
        // contador++;
        // break;
        // case 2:
        // System.out.println("¡brrrmmm!");
        // contador++;
        // break;
        // case 3:
        // System.out.println("¡ratatatá!");
        // contador++;
        // break;
        // case 4:
        // System.out.println("¡ring ring!");
        // contador++;
        // break;
        // case 5:
        // System.out.println("¡miau!");
        // contador++;
        // break;
        // case 6:
        // System.out.println("¡pio pio!");
        // contador++;
        // break;
        // default:
        // break;
        // }

        // } while (option != 0);

    }
}
