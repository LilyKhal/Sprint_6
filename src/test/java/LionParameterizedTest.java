import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    @Mock
    Feline feline;
    private final String sex;
    private final boolean expectedHasMane;
    private final int kittensCount;

    public LionParameterizedTest(String sex, boolean expectedHasMane, int kittensCount) throws Exception {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
        this.kittensCount = kittensCount;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Самец", true, 2},
                {"Самка", false, 4},
        };
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
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
        Mockito.when(feline.getKittens()).thenReturn(kittensCount);
        assertEquals(lion.getKittens(), kittensCount);

    }
}