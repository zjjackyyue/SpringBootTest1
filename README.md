# ReadMe

## 介绍

这是一个非常简陋的SpringBoot项目，里面只有一些配置文件、一些pojo类、一个controller类。目的是熟悉创建SpringBoot的流程、SpringBoot配置文件的玩法，因此不存在具体的业务代码。

## 具体文件的介绍

### resources/config文件夹

这个文件夹底下装着三个配置文件，三个都是SpringBoot的配置文件。其中application.properties是主配置文件，在主配置文件中，你可以指定你具体想用哪个配置文件

application.yml文件，里面定义了很多对象，项目中已通过注解将他们和实体类类绑定在一起。

### pojo文件夹

这个文件夹底下装的是实体类：Dog和Person。Dog对象属于Person对象属性中的一员。

在Person对象里面介绍了数据校验的使用、与yml文件对象绑定的方法。

