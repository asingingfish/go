# 记录

## spring

### spring-dao.xml
用来配置数据库驱动以及集成 mybatis

### spring-service.xml
用来配置事务相关

### spring-web.xml
- 配置注解驱动
- 配置自动扫描Controller
- 配置视图解析
- 配置处理静态资源

## maven
- java.lang.NoClassDefFoundError: org/springframework/ui/velocity/VelocityEngine, 是因为需要在 pom 中增加
```xml
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context-support</artifactId>
            <version>4.1.7.RELEASE</version>
        </dependency>
```

## web.xml
用来配置 servlet 及 servlet 对应的 url 映射

使用 springMVC 后，配置了一个拦截 servlet 会拦截所有请求，再转交给 controller