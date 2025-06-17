import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.aston.hometask.task5.builder.ConstructableObject;

public class BuilderTests {

    @Test
    public void SimpleBuilderTest() {
        ConstructableObject object = new ConstructableObject.ConstructableObjectBuilder()
                .partA("this is part A")
                .partB("this is part B")
                .partC("this is part C")
                .build();
        Assertions.assertEquals("this is part A", object.getPartA());
        Assertions.assertEquals("this is part B", object.getPartB());
        Assertions.assertEquals("this is part C", object.getPartC());
    }
}
