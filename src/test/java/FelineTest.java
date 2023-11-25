import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineTest {
    Feline feline = new Feline();
    private final int kittensCount;
    public FelineTest(int kittensCount){
        this.kittensCount=kittensCount;
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
    public  void eatMeatTest() throws Exception{
        assertEquals(feline.eatMeat(), List.of("Животные", "Птицы", "Рыба"));
    }
    @Test
    public void getFamilyTest() {
        assertEquals(feline.getFamily(), "Кошачьи");
    }
    @Test
    public void getKittensTest() {
        assertEquals(feline.getKittens(), 1);
    }
    @Test
    public void getKittensTest1() {
        assertEquals(feline.getKittens(kittensCount),kittensCount );
    }
}

