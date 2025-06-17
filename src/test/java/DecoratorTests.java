import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.aston.hometask.task5.decorator.Coffee;
import ru.aston.hometask.task5.decorator.SimpleCoffee;
import ru.aston.hometask.task5.decorator.decorators.CoffeeWithMilk;
import ru.aston.hometask.task5.decorator.decorators.CoffeeWithSugar;

public class DecoratorTests {

    @Test
    public void testDecorator() {
        Coffee coffee = new CoffeeWithMilk(20, new CoffeeWithSugar(2, new SimpleCoffee()));
        Assertions.assertEquals(
                "Simple coffee, with 2 spoon(s) of sugar, with 20 milliliter(s) of milk", coffee.getDescription());
    }
}
