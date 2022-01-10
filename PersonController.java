import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @GetMapping("/myinfo")
    public Person getCourses() {
        Person person = new Person();
        person.setName("Paul");
        person.setAge(36);
        person.setAddress("The USA");
        return person;
    }
}
