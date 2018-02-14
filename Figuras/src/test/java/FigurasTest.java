import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class FigurasTest {

    private StringBuilder figuraImpresa;

    @Before
    public void setUp() throws Exception {
        figuraImpresa = new StringBuilder();
    }

    @Test
    public void imprimirCuadradoVacioTest() throws Exception {
        assertThat(Figura.imprimirCuadradoVacio().toString(),
                equalTo(""));
    }

    @Test
    public void imprimirCuadradoDeUnCaracterTest() throws Exception {
        assertThat(Figura.imprimirCuadradoDeUnCaracter().toString(),
                equalTo(figuraImpresa.append('*').toString()));
    }

    @Test
    public void imprimirTrianguloVacioTest() throws Exception {
        assertThat(Figura.imprimirTrianguloVacio().toString(),
                equalTo(""));
    }

    @Test
    public void imprimirTrianguloDeUnCaracterTest() throws Exception {
        assertThat(Figura.imprimirTrianguloDeUnCaracter().toString(),
                equalTo(figuraImpresa.append('*').toString()));
    }

    @Test
    public void imprimirRomboVacioTest() throws Exception {
        assertThat(Figura.imprimirRomboVacio().toString(),
                equalTo(""));
    }

    @Test
    public void imprimirRomboDeUnCaracterTest() throws Exception {
        assertThat(Figura.imprimirRomboDeUnCaracter().toString(),
                equalTo(figuraImpresa.append('*').toString()));
    }

    @Test
    public void imprimirCuadradoDe3CaracteresTest() throws Exception {
        figuraImpresa.append("***").append(String.format("%n"));
        figuraImpresa.append("***").append(String.format("%n"));
        figuraImpresa.append("***").append(String.format("%n"));
        assertThat(Figura.imprimirCuadradoDe3Caracteres().toString(),
                equalTo(figuraImpresa.toString()));
    }

    @Test
    public void imprimirTrianguloDe3CaracteresTest() throws Exception {
        figuraImpresa.append("  *  ").append(String.format("%n"));
        figuraImpresa.append(" *** ").append(String.format("%n"));
        figuraImpresa.append("*****").append(String.format("%n"));
        assertThat(Figura.imprimirTrianguloDe3Caracteres().toString(),
                equalTo(figuraImpresa.toString()));

    }

    @Test
    public void imprimirRomboDe3CaracteresTest() throws Exception {
        figuraImpresa.append("  *  ").append(String.format("%n"));
        figuraImpresa.append(" *** ").append(String.format("%n"));
        figuraImpresa.append("*****").append(String.format("%n"));
        figuraImpresa.append(" *** ").append(String.format("%n"));
        figuraImpresa.append("  *  ").append(String.format("%n"));
        assertThat(Figura.imprimirRomboDe3Caracteres().toString(),
                equalTo(figuraImpresa.toString()));
    }
}
