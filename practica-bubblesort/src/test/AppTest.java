import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AppTest {

    @Test
    void unElemento() {
        BubbleSort algoritmo = new BubbleSort();
        assertArrayEquals(new int[]{7}, algoritmo.ordenar(new int[]{7}));
    }

    @Test
    void dosOrdenados() {
        BubbleSort algoritmo = new BubbleSort();
        assertArrayEquals(new int[]{1, 2}, algoritmo.ordenar(new int[]{1, 2}));
    }

    @Test
    void dosInvertidos() {
        BubbleSort algoritmo = new BubbleSort();
        assertArrayEquals(new int[]{1, 2}, algoritmo.ordenar(new int[]{2, 1}));
    }

    @Test
    void variosDesordenados() {
        BubbleSort algoritmo = new BubbleSort();
        assertArrayEquals(
            new int[]{1, 2, 3, 4, 9},
            algoritmo.ordenar(new int[]{3, 4, 9, 2, 1})
        );
    }
}