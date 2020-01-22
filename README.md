# SISELab4C - Webservices with SOAP - Client

Make sure your calculator SOAP server is running. Then open a terminal 
(execute the windows command “cmd” or open the terminal tab of your IDE), 
and change to the root directory of your project. Inside that directory you will 
find the following folders: src, scripts and libs. Change to the folder “scripts”.

Generate the stub classes:

### Windows:
``` 
wsimport.bat -s ..\src -keep -p cs.calc.client http://localhost:8090/calcservice?wsdl
``` 

### OSX/Linux:
``` 
wsimport.sh -s ../src -keep -p cs.calc.client http://localhost:8090/calcservice?wsdl
``` 

You should see that some code has been generated. 
Right-click on your project and select “Refresh”.
Your IDE will show a new package with code for the client appeared (cs.calc.client).

As you can see the class CalculatorClient has three methods:
• main: where the client connects to the web service.
• runCalculator: a method to prompt the user to write an
expression, and uses the parser to evaluate that expression. • eval: the method that runs the parser.

## Task
Implement the runCalculator method so that the Client keeps prompting the user to type in an 
arithmetic expression, until the user types “exit”.

Suggestion: Use the class Scanner to read from the terminal or a JOptionPane to use the graphic interface. You should read a line at a time.