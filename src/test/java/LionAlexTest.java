import com.example.Feline;
import com.example.LionAlex;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {

    @Mock
    Feline feline;

    private final LionAlex lionAlex = new LionAlex(feline);

    public LionAlexTest() throws Exception {
    }

    @Test
    public void getFriendsTest() {
        List<String> actualFriends = lionAlex.getFriends();
        List<String> expectedFriends = List.of("Зебра Марти", "Бегемотиха Глория", "Жираф Мелман");
        assertEquals(expectedFriends, actualFriends);
    }

    @Test
    public void getPlaceOfLivingTest() {
        String actualPlaceOfLiving = lionAlex.getPlaceOfLiving();
        String expectedPlaceOfLiving = "Нью-Йоркский зоопарк";
        assertEquals(expectedPlaceOfLiving, actualPlaceOfLiving);
    }

    @Test
    public void getKittensTest() {
        int actualKittens = lionAlex.getKittens();
        int expectedKittens = 0;
        assertEquals(expectedKittens, actualKittens);
    }

    @Test
    public void createLionAlexEntity() {
        boolean actualHasMane = lionAlex.doesHaveMane();
        assertTrue(actualHasMane);
    }
}
