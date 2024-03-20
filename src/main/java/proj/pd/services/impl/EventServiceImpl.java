package proj.pd.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proj.pd.dtos.EventDto;
import proj.pd.entities.Event;
import proj.pd.repositories.EventRepository;
import proj.pd.services.EventService;

import java.util.List;
import java.util.UUID;

@Service
public class EventServiceImpl implements EventService {

    private EventRepository eventRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public EventServiceImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }


    @Override
    public void addEvent(EventDto eventDto) {
        Event event = modelMapper.map(eventDto, Event.class);
        event.setId(UUID.randomUUID());
        event.setDate(eventDto.getDate());
        event.setDescription(eventDto.getDescription());
        event.setName(event.getName());

        eventRepository.saveAndFlush(event);
    }

    @Override
    public List<EventDto> allEvents() {
        return null;
    }

    @Override
    public void removeEvent(String id) {

    }

    @Override
    public void updateEvent(String id, EventDto newEvent) {

    }

    @Override
    public EventDto getEvent(String id) {
        return null;
    }

    @Autowired
    public void setEventRepository(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }
}
