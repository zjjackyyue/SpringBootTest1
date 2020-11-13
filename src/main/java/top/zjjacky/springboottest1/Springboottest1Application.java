package top.zjjacky.springboottest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//程序的主入口
//标注这个类是一个springboot的应用
@SpringBootApplication
/*点进去之后重要的注解有两个
1@SpringBootConfiguration：SpringBoot的配置
1.1@Configuration
1.1.1@Component
2@EnableAutoConfiguration自动导入配置
2.1@AutoConfigurationPackage自动配置包
2.2@Import({AutoConfigurationImportSelector.class})导入选择器
*/
public class Springboottest1Application {

    public static void main(String[] args) {
        //将springboot应用启动
        SpringApplication.run(Springboottest1Application.class, args);
    }

}
