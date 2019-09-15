## Make Change Project

### First week homework for Skill Distillery

### Overview

This program simulates a cash transaction interface. The program sums the price
of items purchased, asks the user to insert the amount tendered, and finally
displays the correct amount of change to dispense - decrementing from largest
bills to smallest coin change.

For example: A total bill of $0.67 and an amount tendered of $2.00
will yield a result of: 1 dollar, 1 quarter, 1 nickel, 3 pennies.

### How to run

  1. The program first prompts the user to insert the price of the first item.
  2. The user will be asked if there is another item to add.
        1. If the user selects 'Y', the program will repeat steps 1 and 2.
  3. If 'N' is selected, the program will ask how much was tendered.
  4. The program will display the difference of amount tendered and total cost.
        1. If there is no change required, the program will inform the user.
        2. if there is not enough tendered, the program will inform the user
           and display the amount the user is short.
  5. The program finally displays the amount to dispense - starting with the
     largest paper bills and decrementing down to the smallest coin change.


### Technologies/ topics used

  I used three additional methods; the first to prompt the user to insert the
  price of each item and configure the amount to return to the user - and
  return that as a double.

  The second method was used to find the correct order of paper bills.
  The last method was used find the correct order of coin change to return.

### Lessons learned

  I found that - in addition to properly named variables and methods - the use
  of methods made the program easier follow.

  Another issue that came up was rounding with using a double. I had to
  add 0.005 to the double variable that had the value of the total amount to
  return to the user, and then subtract the casted (int) value of the variable
  from itself. This gave the the right side of the double (the change), and I
  multiplied it by 100 so that it was easier to work with as an integer.
