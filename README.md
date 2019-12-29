# API_TESTING
BASIC JAVA PROJECT FOR TESTING REST API

The main task of our project is to test working functionality of the weather web service(https://weather.api.here.com).

# Introduction
In our project we want to do validation and functional tests to confirm that the web service (https://weather.api.here.com) is working properly. Our test strategy will be based on methodical and analytical approach to check if the API is responding properly according to the documentation. Most of the tests will be focused on testing path and query parameters.

# Prerequisites
You need to have installed:
 * ```Java 1.8+ sdk ```
 * ```Maven 3.6.x```

Also you need to set up following system variables:
 * ```JAVA_HOME```
 * ```MAVEN_HOME```
 
You need to add ```JAVA_HOME/bin``` and ```MAVEN_HOME/bin```  to ```Path``` system variable.  

# Test Execution
To execute the tests you need to perform following Maven command :
```clean test allure:report```

# Reporting
As reporting engine we are using Allure 2.x framework. After Maven test execution, test results are stored under ```target/site/allure-maven-plugin``` directory. To open report directly in a web browser please use Microsoft Edge, in other way you can use ```allure:serve``` in Maven command line.