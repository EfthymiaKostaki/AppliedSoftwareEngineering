## Source Code Analyzer 

A JAVA application that reads a Java source code file that is stored locally or on the web, 
calculates the LOC, NOM and NOC metrics and finally, exports these metrics to an output file.

### Installing

A step by step series of examples that tell you how to get a development env running

Build Maven Project by running:

```
mvn install
```

Change to child directory of your preference

```
cd SourceCodeAnalyzer/
```

Change to target directory by

```
cd target/
```

Locate the .jar file by running

```
ls
```

Run the executable by executing
```
java –jar  SourceCodeAnalyzer/target/SourceCodeAnalyzer-0.0.1-SNAPSHOT-jar-with-dependencies.jar arg0 arg1 arg2 arg3 arg4
```
were args translate to: 	
+ arg0 = “JavaSourceCodeInputFile” (e.g., src/test/resources/TestClass.java)
+ arg1 = “sourceCodeAnalyzerType” [regex|strcomp]
+ arg2 = “SourceCodeLocationType” [local|web]
+ arg3 = “OutputFilePath” (e.g., ../output_metrics_file)
+ arg4 = “OutputFileType” [csv|json]

Below there is an example:
```
java –jar ./target/sourcecodeanalyzer-0.0.1-SNAPSHOT-jar-with-dependencies.jar ./src/test/resources/TestClass.java regex local metrics_results csv
```

### Design Patterns used in this module

#### Facade Pattern

**Benefits**
**Tradeoffs**

