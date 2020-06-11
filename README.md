# Applied Software Engineering Lab Projects

[![Build Status](https://travis-ci.com/EfthymiaKostaki/AppliedSoftwareEngineering.svg?token=AvLEFzGby86rqSftyr5s&branch=master)](https://travis-ci.com/EfthymiaKostaki/AppliedSoftwareEngineering)
[![codecov](https://codecov.io/gh/EfthymiaKostaki/AppliedSoftwareEngineering/branch/master/graph/badge.svg)](https://codecov.io/gh/EfthymiaKostaki/AppliedSoftwareEngineering)

This is the main repository for delivery of all the individual projects for the course "Applied Software Engineering".

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. 

### Prerequisites

What things you need to install the software and how to install them

```
Maven 3.6.3
```
Maven distribution from Apache can be found here: [Install Maven](https://maven.apache.org/install.html)

```
JDK 1.8
```
Java SE Development Kit can be found here: [JDK Install](https://www.oracle.com/java/technologies/javase-downloads.html)

### Installing

A step by step series of examples that tell you how to get a development env running

Open Git Bash and clone this repository

```
git clone https://github.com/EfthymiaKostaki/AppliedSoftwareEngineering.git
```

Change to the main repository by running

```
cd AppliedSoftwareEngineering
```

Build Maven Project by running:

```
mvn install
```

Change to child directory of your preference

```
cd childDirectory/
```

Change to target directory by

```
cd target/
```

Locate the .jar file by running

```
ls
```

Run the .jar project with an argument if needed.

```
java -jar jarFileExample.jar arg[0]

```

Please keep in mind that some child projects require a system argument when running the jar file while other do not. See the specific section for each project for more details.

## Project Structure

This repository consists of a parent Maven project and three sub-project (modules), that handle the dependencies in a different way.

1) [Histogram Generator](HistogramGenerator) - creates a histogram from a given set of numbers
2) [Unit Testing](unittesting) - a project for practicing Unit Testing
3) [Source Code Analyzer](SourceCodeAnalyzer) - a project for applying design patterns

## HistogramGenerator

A JAVA application for creating a histogram of the frequency of given grades. The path to the grades file is given as a system argument input.

After running the commands mentioned to run the .jar project, where arg[0] can be a single file or the path to the input file.

```
java -jar HistogramGenerator/target/HistogramGenerator-0.0.1-SNAPSHOT.jar arg[0]
```

## Unit Testing

A JAVA application for the Unit Testing practice project. This is a project for practicing Unit Testing.

After running the commands mentioned to run the .jar project: 

```
java -jar unittesting/target/unittesting-0.0.1-SNAPSHOT.jar 
```

## Source Code Analyzer

A JAVA application that reads a Java source code file that is stored locally or on the
web, calculates the LOC, NOM and NOC metrics and finally, exports these metrics to an output file.

You can execute the system (after building with maven) with the following command:

```
java –jar  SourceCodeAnalyzer/target/SourceCodeAnalyzer-0.0.1-SNAPSHOT-jar-with-dependencies.jar arg0 arg1 arg2 arg3 arg4
```
where:
+ arg0 = “JavaSourceCodeInputFile” (e.g., ../src/test/resources/TestClass.java)
+ arg1 = “sourceCodeAnalyzerType” [regex|strcomp]
+ arg2 = “SourceCodeLocationType” [local|web]
+ arg3 = “OutputFilePath” (e.g., ../output_metrics_file)
+ arg4 = “OutputFileType” [csv|json]

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **Efthymia Kostaki** [EfthymiaKostaki](https://github.com/EfthymiaKostaki)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details

## Acknowledgments
This project receives frequently technical reviews from the Management Science and Technology Lab Personnel of the Athens University of Economics and Business.
