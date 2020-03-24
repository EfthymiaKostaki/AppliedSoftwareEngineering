# Applied Software Engineering Lab Projects

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

Run the .jar project

```
java -jar jarFileExample.jar arg[0]

```

Please keep in mind that some child projects require a system argument when running the jar file while other do not. See the specific section for each project for more details.

## HistogramGenerator

A JAVA application for creating a histogram of the frequency of given grades. The path to the grades file is given as a system argument input.

After running the commands mentioned to run the .jar project, where arg[0] can be a single file or the path to the input file.

```
java -jar HistogramGenerator/target/HistogramGenerator-0.0.1-SNAPSHOT.jar arg[0]
```


## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **Efthymia Kostaki** [EfthymiaKostaki](https://github.com/EfthymiaKostaki)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details

## Acknowledgments
This project receives frequently technical reviews from the Management Science and Technology Lab Personnel of the Athens University of Economics and Business.
