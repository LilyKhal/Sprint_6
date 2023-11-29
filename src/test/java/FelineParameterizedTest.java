import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;



@RunWith(Parameterized.class)
public class FelineParameterizedTest {

    Feline feline = new Feline();
    private final int kittensCount;

    public FelineParameterizedTest(int kittensCount) {
        this.kittensCount = kittensCount;
    }
    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {2},
                {4},
                {0},
                {100}
        };
    }
    @Test
    public void getKittensTest1() {
        assertEquals(feline.getKittens(kittensCount),kittensCount );
    }
}
