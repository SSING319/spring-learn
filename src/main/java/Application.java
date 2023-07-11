import com.project.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application {
    public static void main(String[] args) {
        //without using spring power
        //SpeakerService service = new SpeakerServiceImpl();

        //this is loading spring and its loading configuration files in our application context container
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        SpeakerService service = applicationContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service.findAll().get(0).getFirstName());
    }
}
