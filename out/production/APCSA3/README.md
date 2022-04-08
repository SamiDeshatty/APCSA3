## Replit Link
[Sami Individual Repl](https://replit.com/@SamiDeshatty/APCSA3#src/Main.java)


 ```
 Calculator simpleMath = new Calculator("100 + 200  * 3");
        System.out.println("Simple Math\n" + simpleMath);

        // what is simpleMath? simpleMath is an object of the Calculator class
        // you can do scanner, but that's a seperate option. we want it so that we can calculate testing
        // consider parenthesis, we want to break down a string of numbers
        System.out.println();

        Calculator parenthesisMath = new Calculator("(100 + 200)  * 3"); // The stuff in the parenthesis is a token
        System.out.println("Parenthesis Math\n" + parenthesisMath);

        //
  ```
  
  
    // 1. get the notations
    // 2. split the token
    // 3. tokenize the expression
    // 4. reverse polish notation
    // this splits by number and operator. if its an operator, it goes into one array. if its a number, that's a seperate array.
    // you also need to set an order of precedence. for example, * is above +.
    // when you're order of precedence, you're just popping the stack
    // the first operator will take two guys off of the stack, and then calculate. two of the tokens go out.
    // then the new number and the other operator work on the next in the stack, and we have a new number.
    // if that stack has nothing left, it will return the current number.
    // 5. rpn result on the result of the above
    // what rpn does is convert everything into tokens
    // we're passing in a string
    // we tokenize by number, sign and operation
