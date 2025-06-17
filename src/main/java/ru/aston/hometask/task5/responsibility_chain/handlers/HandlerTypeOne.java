package ru.aston.hometask.task5.responsibility_chain.handlers;


import ru.aston.hometask.task5.responsibility_chain.AbstractEventHandler;
import ru.aston.hometask.task5.responsibility_chain.events.Event;
import ru.aston.hometask.task5.responsibility_chain.events.EventHandler;
import ru.aston.hometask.task5.responsibility_chain.events.EventType;

public class HandlerTypeOne extends AbstractEventHandler {

    public HandlerTypeOne( EventHandler eventHandler ) {
        super(eventHandler);
    }

    public HandlerTypeOne() {}

    @Override
    public boolean isRightHandler(Event event) {
        return (event.getEventType() == EventType.TYPE_ONE);
    }

    @Override
    public void setConclusion(Event event) {
        event.setResponseMessage("Handled by handler type one");
    }

}
