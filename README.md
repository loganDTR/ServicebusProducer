# Azure Service Bus with spring JMS
Codice di esempio che consente di utilizzare azure service bus.

Approfondimento:

- [Use JMS in Spring to access Azure Service Bus](https://learn.microsoft.com/en-us/azure/developer/java/spring-framework/configure-spring-boot-starter-java-app-with-azure-service-bus)
- [Spring Cloud Stream with Azure Service Bus](https://learn.microsoft.com/en-us/azure/developer/java/spring-framework/configure-spring-cloud-stream-binder-java-app-with-service-bus)


# How to run?

Run as a spring application:

``` bash
mvn clean spring-boot:run
```

and then try it:

```bash
curl -X POST localhost:8080/messages?message=hello
```

you should see this result on console log:

```bash
[nio-8080-exec-1] com.wingtiptoys.servicebus.SendController : Sending message
[enerContainer-1] com.wingtiptoys.servicebus.ReceiveController : Received message: hello
```