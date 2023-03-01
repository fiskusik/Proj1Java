import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AlgorytmTest {

    Algorytm calculator;

    @BeforeEach
    void setUp() {
        calculator = new Algorytm();
        System.out.print("Informacja dotycząca obliczenia od lewej strony do prawej strony. \n");
        int al = 2;
        int bl = 2;
        int cl = ((al + bl) / 2);
        System.out.println("Test -> :"  + cl);

    }

    @Test
    @DisplayName("Modół")
    void testModel() {
        int w = 2;
        int a = 2;
        int b = 2;
        Assertions.assertEquals(w, calculator.model_math(a, b));

        int inf1 = w;
        int ct = 2;
        if (inf1 == ct) {
            System.out.println("Ok!");
        }
        System.out.print("Niniejszy test został przeprowadzony prawidłowo. Lewa strona równa sie prawej stronie. \n");
    }
}
