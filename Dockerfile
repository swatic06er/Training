From openjdk:11.0.16
copy ./target/springpractice-0.0.1-SNAPSHOT.jar springpractice-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","springpractice-0.0.1-SNAPSHOT.jar"]