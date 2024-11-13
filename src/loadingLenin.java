public class loadingLenin {

    private int tamaño;
    private char caracter;

    public void crearFigura8(int nivel, char caracter) {
        System.out.println("\n Figura 8: ");
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
        System.out.println();
    }


    public void crearLoading31(String caracter) {
        System.out.println("\n loading 3:");
        int espaciosAdelante = 20, espaciosAtras = 0;
        boolean haciaDerecha = true;
    
        for (int i = 1; i <= 100; i++) {
            System.out.print("\r " + "[" + " ".repeat(espaciosAtras) + caracter + " ".repeat(espaciosAdelante) + "] " + i + "%");
    
            if (haciaDerecha) {
                espaciosAtras++;
                espaciosAdelante--;
                if (espaciosAtras == 20) {
                    haciaDerecha = false;
                }
            } else {
                espaciosAtras--;
                espaciosAdelante++;
                if (espaciosAtras == 0) {
                    haciaDerecha = true;
                }
            }
            
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        if (tamaño<0) {
            System.out.println("El tamaño no puede ser negativo");
        }
        this.tamaño = tamaño;
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }
    
    
}
