package proj.pd.services;

import proj.pd.dtos.EventDto;

import java.util.List;

public interface EventService {
    void addEvent(EventDto event);
    List<EventDto> allEvents();
    void removeEvent(String id);
    void updateEvent(String id,EventDto newEvent);
    EventDto getEvent(String id);
}
