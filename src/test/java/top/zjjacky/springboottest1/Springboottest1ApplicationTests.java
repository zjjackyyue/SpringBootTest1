package top.zjjacky.springboottest1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.zjjacky.springboottest1.pojo.Dog;
import top.zjjacky.springboottest1.pojo.Person;

@SpringBootTest
class Springboottest1ApplicationTests {

    @Autowired
    private Person person;

    @Test
    void contextLoads() {

        System.out.println(person);

    }

}
