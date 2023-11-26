import com.example.Feline;
import com.example.Lion;
import com.example.AlexLion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AlexLionTest {

    @Mock
    Feline feline;
    AlexLion alex;
    @Before
    public void init() throws Exception {
         alex = new AlexLion(feline);
    }
    @Test
    public void getKittensTest() throws Exception {
            assertEquals(alex.getKittens(), 0);
        }
      @Test
    public void  getFriendsTest(){
        assertEquals(alex.getFriends(), List.of("Марти","Глория","Мелман"));
      }
      @Test
    public void getPlaceOfLivingTest(){
        assertEquals(alex.getPlaceOfLiving(),"Нью-Йоркский зоопарк");
      }
      @Test
    public void getFoodTest() throws Exception{
        Mockito.when(feline.getFood("Хищник")).thenReturn( List.of("Животные", "Птицы", "Рыба"));
        assertEquals(alex.getFood(), List.of("Животные", "Птицы", "Рыба"));
      }
}
