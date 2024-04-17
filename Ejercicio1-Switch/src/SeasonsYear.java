import java.util.Scanner;

public class SeasonsYear {
    public static void main(String[] args) throws Exception {
        System.out.println("¿En que estación estamos?");
        Scanner teclado = new Scanner(System.in);
        String season = teclado.nextLine();
        teclado.close();
        switch (season.toLowerCase()) {
            case "primavera":
                System.out.println("En la primavera, la naturaleza despierta de su sueño invernal, pintando el mundo con colores vibrantes y perfumando el aire con esperanza.");
                break;

            case "verano":
            System.out.println("El verano llega con el sol radiante y el susurro de las olas, invitándonos a sumergirnos en la frescura del momento y a saborear la dulzura de la vida.");
                break;

            case "otoño":
                System.out.println("En el otoño, la tierra se viste de tonos cálidos y el viento susurra secretos entre las hojas que caen, recordándonos que la belleza está en la transformación.");
                break;

            case "invierno":
                System.out.println("Bajo el manto blanco del invierno, la tierra se acurruca en su letargo, mientras el frío nos invita a buscar calor en el abrazo de los seres queridos y en el resplandor de las chimeneas.");
                break;
        
            default:
                System.out.println("Lo siento, no me has indicado una estación. Por esto, no te puedo explicar nada.");
                break;
        }

    }
}
