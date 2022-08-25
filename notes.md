# important notes
1.change in passing active profile parameter in spring-boot:run -Dspring.profiles.active=dev to 
spring-boot:run -Dspring-boot.run.profiles=dev from spring boot 2.0.1 on ward.


2.we can pass active profile value from docker like below

docker run -p 8080:7070 --network app-net --name mycont -e "SPRING_PROFILES_ACTIVE=docker" infoiv/mytestimg
