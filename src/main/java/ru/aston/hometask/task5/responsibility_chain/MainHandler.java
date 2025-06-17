package ru.aston.hometask.task5.responsibility_chain;

import ru.aston.hometask.task5.responsibility_chain.events.Event;
import ru.aston.hometask.task5.responsibility_chain.events.EventHandler;

public class MainHandler implements EventHandler {
    EventHandler handler;

    public void setHandler(EventHandler handler) {
        this.handler = handler;
    }

    @Override
    public void handleEvent(Event request) {
        handler.handleEvent(request);
    }
}
