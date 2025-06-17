package ru.aston.hometask.task5.responsibility_chain.events;

public interface EventHandler {
    void handleEvent(Event event);
}
