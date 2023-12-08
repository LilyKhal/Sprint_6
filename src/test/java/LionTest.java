import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getFoodTest() throws Exception {

            Lion lion = new Lion("Самец", feline);
            Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
            assertEquals(lion.getFood(), List.of("Животные", "Птицы", "Рыба"));

    }
    @Test
    public void invalidSexTest() throws Exception {
        try {
            Lion lion = new Lion("Самей", feline);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
