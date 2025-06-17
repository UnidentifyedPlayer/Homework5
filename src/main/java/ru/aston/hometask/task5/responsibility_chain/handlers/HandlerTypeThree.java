package ru.aston.hometask.task5.responsibility_chain.handlers;

import ru.aston.hometask.task5.responsibility_chain.AbstractEventHandler;
import ru.aston.hometask.task5.responsibility_chain.events.Event;
import ru.aston.hometask.task5.responsibility_chain.events.EventHandler;
import ru.aston.hometask.task5.responsibility_chain.events.EventType;

public class HandlerTypeThree extends AbstractEventHandler {

    public HandlerTypeThree( EventHandler eventHandler ) {
        super(eventHandler);
    }

    public HandlerTypeThree() {}

    @Override
    public boolean isRightHandler(Event event) {
        return (event.getEventType() == EventType.TYPE_THREE);
    }

    @Override
    public void setConclusion(Event event) {
        event.setResponseMessage("Handled by handler type three");
    }

}