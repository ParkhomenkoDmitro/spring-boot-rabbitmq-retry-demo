# spring-boot-rabbitmq-retry-demo
Demo spring boot &amp; rabbitmq with retry project

See https://dzone.com/articles/spring-boot-rabbitmq-tutorial-retry-and-error-hand

Steps:
1) docker run -d --hostname my-rabbit2 --name some-rabbit2 -p 8080:15672 -p 5672:5672 rabbitmq:3-management

- rabbitmq will be available on localhost:5672
- admin panel will be available on localhost:8080 with quest/quest credentials

2) run the app by either your IDE or "mvn spring-boot:run"