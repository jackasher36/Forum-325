import org.example.controller.FirstController;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Jackasher
 * @version 1.0
 * @className AppTest
 * @since 1.0
 **/
public class AppTest {
    @Test
    public void classTest(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("springmvc-servlet.xml");
        FirstController firstController = applicationContext.getBean("firstController", FirstController.class);
        System.out.println(firstController);
        System.out.println(firstController.hehe());
    }
}
