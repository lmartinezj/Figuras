public final class Figura {

    public static final String CADENA_VACIA = "";
    private static StringBuilder figuraImpresa = new StringBuilder();

    private Figura() {
        throw new AssertionError("Esta clase no puede ser instanciada");
    }


    public static StringBuilder imprimirFiguraVacia() {
        return new StringBuilder(CADENA_VACIA);
    }

    public static StringBuilder imprimirFiguraDeUnCaracter() {
        return new StringBuilder("*");
    }


    //Impresion del Cuadrado
    public static StringBuilder imprimirCuadradoVacio() {
        return imprimirFiguraVacia();
    }

    public static StringBuilder imprimirCuadradoDeUnCaracter() {
        return imprimirFiguraDeUnCaracter();
    }

    public static StringBuilder imprimirCuadradoDe3Caracteres() {
        figuraImpresa = imprimirCuadradoDeNCaracteres(3);
        return figuraImpresa;
    }

    public static StringBuilder imprimirCuadradoDeNCaracteres(int tamañoCuadrado) {
        Utilitaria.imprimirLineaCuadrado(tamañoCuadrado, figuraImpresa);
        return figuraImpresa;
    }


    //Impresion Triangulo
    public static StringBuilder imprimirTrianguloVacio() {
        return imprimirFiguraVacia();
    }

    public static StringBuilder imprimirTrianguloDeUnCaracter() {
        return imprimirFiguraDeUnCaracter();
    }

    public static StringBuilder imprimirTrianguloDe3Caracteres() {
        figuraImpresa = new StringBuilder();
        return imprimirTrianguloDeNCaracteres(3);
    }

    public static StringBuilder imprimirTrianguloDeNCaracteres(int tamaño) {


        Utilitaria.imprimirNLineasTriangulo(tamaño, figuraImpresa);
        return figuraImpresa;
    }


    //Impresion del Rombo
    public static StringBuilder imprimirRomboVacio() {
        return imprimirFiguraVacia();
    }

    public static StringBuilder imprimirRomboDeUnCaracter() {
        return imprimirFiguraDeUnCaracter();
    }

    public static StringBuilder imprimirRomboDe3Caracteres() {
        figuraImpresa = new StringBuilder();
        return imprimirRomboDeNCaracteres(3);
    }

    public static StringBuilder imprimirRomboDeNCaracteres(int tamaño) {
        imprimirTrianguloDeNCaracteres(3);
        Utilitaria.imprimirNLineasRombo(tamaño, figuraImpresa);
        return figuraImpresa;
    }

}
