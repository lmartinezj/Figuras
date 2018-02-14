public final class Utilitaria {

    public static final String CARACTER = "*";
    public static final char ESPACIO_EN_BLANCO = ' ';
    public static final String SALTO_DE_LINEA = "%n";

    public static void imprimirSaltoDeLinea(StringBuilder cuadradoImpreso) {
        cuadradoImpreso.append(String.format(SALTO_DE_LINEA));
    }

    public static void imprimirLineaDeCaracteres(int tamañoCuadrado, StringBuilder cuadradoImpreso) {
        for (int columnas = 1; columnas <= tamañoCuadrado; ++columnas) {
            cuadradoImpreso.append(CARACTER);
        }
    }

    public static int calcularInicio(int centro, int lineas) {
        return centro - lineas + 1;
    }

    public static int calcularCentro(int base) {
        return (base / 2) + 1;
    }

    public static int calcularBase(int altura) {
        return (altura * 2) - 1;
    }

    public static void imprimirEspacio(StringBuilder figuraImpresa) {
        figuraImpresa.append(ESPACIO_EN_BLANCO);
    }

    public static void imprimirCaracter(StringBuilder figuraImpresa) {
        figuraImpresa.append(CARACTER);
    }

    public static int calcularFin(int centro, int lineas) {
        return centro + lineas - 1;
    }

    public static int calcularFinRombo(int base, int inicio) {
        return base - inicio + 1;
    }

    public static void imprimirLineaTriangulo(int base, int inicio, int fin, StringBuilder figuraImpresa) {
        for (int columnas = 1; columnas <= base; ++columnas) {
            if (columnas < inicio || columnas > fin) {
                imprimirEspacio(figuraImpresa);
            } else {
                imprimirCaracter(figuraImpresa);
            }
        }
    }

    public static void imprimirNLineasTriangulo(int tamaño, StringBuilder figuraImpresa) {
        int base = Utilitaria.calcularBase(tamaño);
        int centro = Utilitaria.calcularCentro(base);

        for (int lineas = 1; lineas <= tamaño; ++lineas) {
            int inicio = Utilitaria.calcularInicio(centro, lineas);
            int fin = Utilitaria.calcularFin(centro, lineas);
            Utilitaria.imprimirLineaTriangulo(base, inicio, fin, figuraImpresa);
            Utilitaria.imprimirSaltoDeLinea(figuraImpresa);
        }
    }

    public static void imprimirLineaRombo(int base, int lineas, StringBuilder figuraImpresa) {
        for (int columnas = 1; columnas <= base; ++columnas) {
            int fin = base - lineas;
            int inicio = lineas + 1;

            if (columnas < inicio || columnas > fin ) {
                Utilitaria.imprimirEspacio(figuraImpresa);
            } else {
                Utilitaria.imprimirCaracter(figuraImpresa);
            }
        }
    }

    public static void imprimirNLineasRombo(int tamaño, StringBuilder figuraImpresa) {
        int base = Utilitaria.calcularBase(tamaño);
        int centro = Utilitaria.calcularCentro(base);

        for (int lineas = 1; lineas <= tamaño - 1; ++lineas) {
            Utilitaria.imprimirLineaRombo(base, lineas, figuraImpresa);
            Utilitaria.imprimirSaltoDeLinea(figuraImpresa);
        }
    }

    public static void imprimirLineaCuadrado(int tamañoCuadrado, StringBuilder figuraImpresa) {
        for (int lineas = 1; lineas <= tamañoCuadrado; ++lineas) {
            Utilitaria.imprimirLineaDeCaracteres(tamañoCuadrado, figuraImpresa);
            Utilitaria.imprimirSaltoDeLinea(figuraImpresa);
        }
    }
}
