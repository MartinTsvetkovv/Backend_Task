# backend_task

The application starts when you run the main method of the Main class (src/ app/ Main). When the application starts running the result will be printed on the console.
The abstract class (BaseCard) implements interface (Card). It contains all field getters and two methods that calculate the discount of the current purchase and total purchase value for every child class.    
The common properties for all cards (our child classes) will be inherited from our parent class BaseCard. Every single card comes with different discount rate based on the turnover for the previous month. We are using setter to set the proper discount for every card.
In the Main class we have created instance with simple data of every child class. With the static method from the PayDesk class (result) the output will be printed on the console.

#simple setup guide
1. Create new java project in eclipse or IntelliJ IDEA.
2. Copy the app folder and paste it in the src folder.
3. Find the Main class(src/ app/ Main) and run the application.

