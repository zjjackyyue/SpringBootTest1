package top.zjjacky.springboottest1.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.Map;

@Data
//拿到IOC容器里面的person对象（@Component可抑制爆红）
@Component
@ConfigurationProperties(prefix = "person")
//数据校验
@Validated
public class Person {

    @Email(message = "邮件格式错误")//检查name属性的值是否为电子邮件地址
    private String name;
    private Integer age;
    private Boolean happy;
    private Date birth;
    private Map<String,Object> list;
    @Autowired
    private Dog dog;
}
