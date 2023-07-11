import com.project.repository.HibernateSpeakerRepositoryImpl;
import com.project.repository.SpeakerRepository;
import com.project.service.SpeakerService;
import com.project.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com.project"})
public class AppConfig {


    // coz now we're using stereotypes for sully autowiring
//    @Bean(name = "speakerService")
//    @Scope(value = BeanDefinition.SCOPE_SINGLETON)    //wrote this to remember where to add scope in code
//    public SpeakerService getSpeakerService(){
//         SpeakerServiceImpl speakerService = new SpeakerServiceImpl();
//         //speakerService.setSpeakerRepository(getSpeakerRepository());
//         return speakerService;
//    }

//    @Bean(name = "speakerRepository")
//    public SpeakerRepository getSpeakerRepository(){
//        return new HibernateSpeakerRepositoryImpl();
//    }
}
