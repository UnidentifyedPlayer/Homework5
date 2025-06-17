package ru.aston.hometask.task5.responsibility_chain;

import ru.aston.hometask.task5.responsibility_chain.events.Event;
import ru.aston.hometask.task5.responsibility_chain.events.EventHandler;

public abstract class AbstractEventHandler implements EventHandler {
    EventHandler nextHandler;

    public AbstractEventHandler(EventHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public AbstractEventHandler() {}

    public abstract boolean isRightHandler(Event event);

    public abstract void setConclusion(Event event);

    public void setNextHandler(EventHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleEvent(Event event) {
        if (isRightHandler(event)) {
            setConclusion(event);
        } else if (nextHandler != null) {
            nextHandler.handleEvent(event);
        } else {
            event.setResponseMessage("Unhandled event type: " + event.getEventType());
            throw new IllegalArgumentException("Unhandled event type: " + event.getEventType());
        }
    }
}
