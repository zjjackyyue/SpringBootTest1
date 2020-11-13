package top.zjjacky.springboottest1.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Dog {

    //@Value给Dog初始对象赋默认值
    @Value("旺财")
    private String name;
    @Value("3")
    private Integer age;
}
