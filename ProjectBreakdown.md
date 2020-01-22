# ChangeCalc
Wednesday 1/22 Project


In the getChange() method:<br>

Step Prime: Initialize the method. Since this method does not need to return a value, set to void. The method
          needs the change amount parameters given by the user. <br>

Step 1: Display a line explain to the user that the following lines are the amount of change/coins to be tendered to customer.<br> 
Step 2: Beginning with quarters, calculate the most efficient coin amount. 
        We begin with quarters as that is the coin with the highest dollar amount. If the change total (hereby ref as changeGive) 
        is less than the current coin we are calculating, the dividened of the changeGive divided by the coin's dollar 
        amount will be zero, thus not displaying. <br>
  Step 2a: initialize variable for the coin we are currently <br>
  Step 2b: Set the coin amount we are giving equal to the changeGive divided by the coin's dollar amount.<br>
  Step 2c: Set the changeGive vale to equal the original changeGive minus the amount of coins we are tendering multiplied by its dollar amount.<br> 
  Step 2d: Create an if statement, checking if the amount of coins we are giving is greater.<br>
    Step 2d-1: if statement is true, display the amount of the coins we are tendering to the customer. <br>
  Step 2e: Repeat this block of code, updating the coin and the coins dollar amount. <br>
  
  
In the main() :

Step 1: Include the Scanner class. <br>
Step 2: Prompt user to enter the change amount, with the max amount being 99. <br>
Step 3: Initialize the variable "changeGive" equal to the next int the user inputs. <br>
Step 4: Call the getChange method, with the parameters changeGive included.<br>
Step 5: I added a space here just for visual clarity and cleanliness. <br>
Step 6: Added main(args) so the user can quickly repeat/test the program.
