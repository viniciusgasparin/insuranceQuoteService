FROM openjdk:17
ADD target/insuranceQuoteService.jar insuranceQuoteService.jar
ENTRYPOINT ["java", "-jar", "insuranceQuoteService.jar"]
