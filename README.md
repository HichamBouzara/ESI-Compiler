#### Compile and execute :

    javacc lexical.jj
    javac *.java
    java Lexical <input.ihm

#### Generate jar:

    jar -cvf EsiParser.jar *.class

#### Compile and execute jar:

    java -cp ./EsiParser.jar EsiParser <input.ihm
