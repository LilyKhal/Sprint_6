import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;


public class FelineTest {
    Feline feline = new Feline();

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

}

