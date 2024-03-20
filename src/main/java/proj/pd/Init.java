package proj.pd;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import proj.pd.entities.Event;
import proj.pd.entities.User;
import proj.pd.repositories.EventRepository;
import proj.pd.repositories.UserRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class Init implements CommandLineRunner {

    private final EventRepository eventRepository;
    private final UserRepository userRepository;


    public Init(EventRepository eventRepository, UserRepository userRepository) {
        this.eventRepository = eventRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
//        init();
    }

//    private void init(){
//        Event event = new Event();
//        event.setName("123");
//        event.setDate(LocalDate.now());
//        event.setDescription("123");
//        event.setId(UUID.randomUUID());
//        eventRepository.save(event);
//
//        User user = new User();
//        user.setId(UUID.randomUUID());
//        user.setCourse(2);
//        user.setFirstName("123");
//        user.setLastName("123");
//        user.setMail("123");
//        user.setPhone("123");
//        user.setPost("123");
//        user.setUniversity("123");
//        user.setUsername("123");
//        userRepository.save(user);
//
//        List<Event> list = new ArrayList<>();
//        list.add(event);
//        user.setEvents(list);
//
//        userRepository.save(user);
//    }
}
