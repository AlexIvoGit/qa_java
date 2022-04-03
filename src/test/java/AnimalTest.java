import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalTest {

    private final Animal animal = new Animal();

    private final String animalKind;
    private final List<String> expectedResultList;

    public AnimalTest(String animalKind, List<String> expectedResultList) {
        this.animalKind = animalKind;
        this.expectedResultList = expectedResultList;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")}
                , {"Хищник", List.of("Животные", "Птицы", "Рыба")}
                , {"Дикое", List.of()}
        };
    }

    @Test
    public void getFoodTest() {
        try {
            List<String> actualFoodList = animal.getFood(animalKind);
            assertEquals(expectedResultList, actualFoodList);
        } catch (Exception actual) {
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", actual.getMessage());
        }
    }

    @Test
    public void getFamilyTest() {
        String expectedResult = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actualResult = animal.getFamily();
        assertEquals(expectedResult, actualResult);
    }
}
