# Chain of responsibility

An example of chain of responsibility pattern using filters from spring boot 

## Installation

In order to run this application, you need to have a java version 8+ and maven version 3+

It is also recommended to add java and maven to path

## Usage

1. Open an ide of preference and configure the entry point to be the main method

2. Prior to running the application, you need to get all dependencies through maven.
   Assuming you have the maven added to path, run following command
```python
maven clean install
```

3. Run the application from the ide. Once started, application will run at localhost:8080

4. In order to test the application through the controller, open any API platform and send
   a get request with the following url: http://localhost:8080/info
