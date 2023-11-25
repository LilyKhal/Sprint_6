import com.example.Cat;
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTest {

    Feline feline = new Feline();
    private final String sex;
    private final boolean expectedHasMane;

    public LionTest (String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }
    @Test
    public void hasManeTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean hasMane = lion.doesHaveMane();
        assertEquals(hasMane, expectedHasMane);
    }
    @Test
    public void getKittensTest() throws Exception {
       Lion lion = new Lion(sex, feline);
       assertEquals(lion.getKittens(), 1);
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals(lion.getFood(), List.of("Животные", "Птицы", "Рыба"));
    }
}
