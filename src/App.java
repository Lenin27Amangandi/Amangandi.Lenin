import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner scCaracter = new Scanner(System.in);
        loadingLenin loading = new loadingLenin();
        int tamanio;
        char caracter;
        String caracterIngresado;

        System.out.println();
        System.out.println();
        System.out.println("***************************************");
        System.out.println("*                                     *");
        System.out.println("*    Escuela Politécnica Nacional     *");
        System.out.println("*                                     *");
        System.out.println("*    Nombre: Amangandi.Lenin          *");
        System.out.println("*    Cedula: 1753193828               *");
        System.out.println("*                                     *");
        System.out.println("***************************************");
        System.out.println();

        System.out.print("Ingrese el tamaño de la figura: ");
        tamanio = sc.nextInt();
        System.out.print("Por favor ingrese un caracter: ");
        caracterIngresado = scCaracter.nextLine();
        caracter = caracterIngresado.charAt(0);

        // loading.crearLoading3('*');
        // loading.crearLoading3(caracter);
        loading.crearLoading3(caracterIngresado);
        loading.crearFigura8(tamanio, caracter);

    }
}
