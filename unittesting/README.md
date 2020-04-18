## Unit Testing

A JAVA application for the Unit Testing practice project. This is a project for practicing Unit Testing.

### Installing

A step by step series of examples that tell you how to get a development env running

Since there is no main method in the unittesting module,

to run the tests, use this command:

```
mvn test
```

You should now be able to see which tests are passing the tests.

If you want to explore the code coverage of the project run:

```
mavn test jacoco:report
```

Change to unittesting module by running:

```
cd unittesting/
```

Change to jacoco folder by running:

```
cd target/site/jacoco
```

There you should see an index.html file. If you open this file on browser
you will be able to explore the code coverage of the unittesting module.
