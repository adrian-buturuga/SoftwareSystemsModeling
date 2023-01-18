# Observer 

An example of observer pattern with the help of kafka event streaming platform

## Installation

In order to run this application, you need to have a java version 8+, maven version 3+ and kafka version 3+

It is also recommended to add java and maven to path

Follow https://kafka.apache.org/quickstart for kafka installation

## Usage

1. To start zookeeper and kafka, run following commands in 2 separate terminal windows

macOS
```bash
$ bin/zookeeper-server-start.sh config/zookeeper.properties
```
```bash
$ bin/kafka-server-start.sh config/server.properties
```

windows
```bash
bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
```
```bash
bin\windows\kafka-server-start.bat .\config\server.properties
```

2. Open an ide of preference and configure the entry point to be the main method

3. Prior to running the application, you need to get all dependencies through maven.
Assuming you have the maven added to path, run following command 
```python
maven clean install
```

4. Run the application from the ide. Once started, application will run at localhost:9000

5. In order to test the application through the controller, open any API platform and send
a post request with the following url: http://localhost:9000/kafka/publish?message=John
