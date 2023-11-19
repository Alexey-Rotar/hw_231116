FROM bellsoft/liberica-openjdk-alpine:11.0.9
COPY ./java ./src
RUN mkdir ./out
RUN javac -sourcepath ./src -d out src/ru/ar/ex1/Main.java
CMD java -classpath ./out ru.ar.ex1.Main