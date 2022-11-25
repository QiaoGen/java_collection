# Spring Native Demo 

### Environment

Preparation Work:

* [GraalVM 22.3.0](https://www.graalvm.org/22.0/docs/getting-started/macos/)
* [Native image](https://www.graalvm.org/22.0/reference-manual/native-image/#install-native-image)
* [Sdkman for mac](https://sdkman.io/install)
* [spring-native](https://docs.spring.io/spring-native/docs/current/reference/htmlsingle/)

### Tips

* Docker
* spring-native version 0.12.1 require SpringBoot version > 2.7.1
* Don't support spring-cloud and spring-gateway

### How to build

```shell
1.cd project root path
2.mvn clean
3.mvn mvn '-Dmaven.test.skip=true' spring-boot:build-image
```

### try 
```shell
docker pull zgdrogon/native-demo:v1.0 
docker run -rm -d -p 8080:8080 --name=native-demo zgdrogon/native-demo:v1.0

# logs
.   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.7.5)

2022-11-24 09:33:25.810  INFO 1 --- [           main] c.e.nativedemo.NativeDemoApplication     : Starting NativeDemoApplication using Java 11.0.17 on 5546a2999aef with PID 1 (/workspace/com.example.nativedemo.NativeDemoApplication started by cnb in /workspace)
2022-11-24 09:33:25.810  INFO 1 --- [           main] c.e.nativedemo.NativeDemoApplication     : No active profile set, falling back to 1 default profile: "default"
2022-11-24 09:33:25.825  INFO 1 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2022-11-24 09:33:25.826  INFO 1 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2022-11-24 09:33:25.826  INFO 1 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.68]
2022-11-24 09:33:25.831  INFO 1 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2022-11-24 09:33:25.831  INFO 1 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 21 ms
2022-11-24 09:33:25.862  INFO 1 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2022-11-24 09:33:25.863  INFO 1 --- [           main] c.e.nativedemo.NativeDemoApplication     : Started NativeDemoApplication in 0.067 seconds (JVM running for 0.07)
2022-11-24 09:37:34.612  INFO 1 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2022-11-24 09:37:34.612  INFO 1 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2022-11-24 09:37:34.613  INFO 1 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 1 ms
```