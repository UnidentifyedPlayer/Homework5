package ru.aston.hometask.task5.responsibility_chain.events;

public class Event {
    private final EventType eventType;
    private String responseMessage;

    public Event(EventType eventType) {
        this.eventType = eventType;
        responseMessage = "";
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }
}
