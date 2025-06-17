import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.aston.hometask.task5.responsibility_chain.MainHandler;
import ru.aston.hometask.task5.responsibility_chain.events.Event;
import ru.aston.hometask.task5.responsibility_chain.events.EventType;
import ru.aston.hometask.task5.responsibility_chain.handlers.HandlerTypeOne;
import ru.aston.hometask.task5.responsibility_chain.handlers.HandlerTypeThree;
import ru.aston.hometask.task5.responsibility_chain.handlers.HandlerTypeTwo;

public class ResponsibilityChainTests {

    @Test
    public void ResponsibilityChainTest() {
        var event = new Event(EventType.TYPE_THREE);
        var mainHandler = new MainHandler();
        mainHandler.setHandler(new HandlerTypeOne(new HandlerTypeTwo(new HandlerTypeThree())));
        mainHandler.handleEvent(event);

        Assertions.assertEquals("Handled by handler type three", event.getResponseMessage());
    }
}
