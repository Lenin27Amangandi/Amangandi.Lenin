public class loadingLenin {

    public void crearLoading3(char caracter) {
        System.out.println("Loading 3: ");
        int porcentaje, longitudBarra = 20;
        String barrAnterios, barraposterior;
        for (int i = 0; i < longitudBarra; i++) {
            barrAnterios = " ".repeat(i);
            barraposterior = " ".repeat(longitudBarra - i - 1);
            porcentaje = ((i + 1) * 100 / longitudBarra);
            System.out.print("\r[" + barrAnterios + caracter + barraposterior + "] " + porcentaje + " %");
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    public void crearFigura8(int nivel, char caracter) {
        System.out.println("Figura 8: ");
        System.out.println();
        for (int fila = 1; fila <= nivel; fila++) {
            for (int columna = 1; columna <= nivel; columna++) {
                if ((fila == ((nivel / 2) + 1) || fila == 1) || (columna == 1 || columna == nivel)
                        || fila == nivel) {
                    System.out.print(caracter + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

}
