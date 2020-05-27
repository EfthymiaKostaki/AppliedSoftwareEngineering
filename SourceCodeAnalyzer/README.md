# Source Code Analyzer 

A JAVA application that reads a Java source code file that is stored locally or on the web, 
calculates the LOC, NOM and NOC metrics and finally, exports these metrics to an output file.

## Installing

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
java –jar  SourceCodeAnalyzer-0.0.1-SNAPSHOT-jar-with-dependencies.jar arg0 arg1 arg2 arg3 arg4
```
were args translate to: 	
+ arg0 = “JavaSourceCodeInputFile” (e.g., src/test/resources/TestClass.java)
+ arg1 = “sourceCodeAnalyzerType” [regex|strcomp]
+ arg2 = “SourceCodeLocationType” [local|web]
+ arg3 = “OutputFilePath” (e.g., ../output_metrics_file)
+ arg4 = “OutputFileType” [csv|json]

Below there is an example:
```
java –jar SourceCodeAnalyzer-0.0.1-SNAPSHOT-jar-with-dependencies.jar ./src/test/resources/TestClass.java regex local metrics_results csv
```
## Class Diagram
This is the Class Diagram of this module.

![class diagram](SourceCodeAnalyzer/images/classDiagram.png "Class Diagram")

## Design Patterns used in this module

### Facade Pattern
The FacadeAnalyzer class serves as a front-facing interface masking more complex underlying or
structural code of codeanalyzer subpackages. 

#### Benefits
1. According to the requirements, the plan is to use the system as an independent library and thus hide any
implementation details from the DemoClient. This requirement is fully covered with the created FacadeAnalyzer class.
2. Since the codeAnalyzer package is a complex system with many different objects such as FileExporters, SourceFileReaders and SourceCodeAnalyzers, the 
FacadeAnalyzer class provides a simple interface to this complex system.
3. Since the FacadeAnalyzer class separates the DemoClient from implementation details, the applied Facade pattern de-couples the subsystem for clients and other
subsystems, thereby promoting subsystem independence and portability.
4. codeAnalyzer package which is a system can now be used as an independent library which can be used by a project as the main system or as a subsystem
and communicate easily with other packages through the FacadeAnalyzer class.

#### Tradeoffs
This implementation of the facade pattern doesn't force us to unwanted tradeoffs, because it only adds additional layers of abstraction.
Sometimes the pattern can be overused in simple scenarios, which will lead to redundant implementations but this is not the case in this situation 
since it was explicitly specified in the requirements of the system.

### Strategy Pattern

#### Benefits

#### Tradeoffs

### Bridge Pattern

#### Benefits

#### Tradeoffs

## Design patterns not used in this module and why

### Null Object Pattern

### Composite Pattern
