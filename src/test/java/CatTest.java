import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline mockFeline;

    @Test
    public void getSoundTest() {
        Cat cat = new Cat(mockFeline);
        assertEquals(cat.getSound(), "Мяу");
    }

}
