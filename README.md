# BingoGenerator

The bingoGenerator helps create a number of Bingo-like cards, with the "numbers" being taken from a file-based list supplied at invocation of the application.


## Development
The BingoGenerator relies on Java 8.

### Noteworthy Libraries

#### JCommander
JCommander ([Github][jcommander]) is a library for parsing command line parameters. It is featured in the [November/December issue][jcommmander.javamagazine] of Oracle's Java Magazine and looked nice, so it is included here.

#### Apache FOP

## Build
This project uses Gradle ([www.gradle.org][gradle]) as its main build tool. To ensure identical installations, I recommend using the Gradle wrapper included in the repository by calling `./gradlew` (or `./gradlew.bat` if using Windows) to run a build.

### Eclipse IDE and Gradle
Nowadays, it is rather easy to use Gradle with Eclipse. I use Eclipse 4.5 (Mars) with the Buildship Gradle Integration 1.0 plugin available at the standard Eclipse Market Place. 


[gradle]: www.gradle.org
[jcommander]: https://github.com/cbeust/jcommander
[jcommmander.javamagazine]: http://www.oraclejavamagazine-digital.com/javamagazine/november_december_2015?Sub_Id=379330376&pg=14#pg14