### Data Structures Trimester 3

## [Week 0- Intro to Data Structures](https://github.com/nighthawkcoders/nighthawk_csa/wiki/Tri-3:-Tech-Talk-0---Data-Structures)

# What is Data Structures? 
- A data structure is a method of organizing data. Think of a variable holding a single integer value(ex: int n=4;) or sequences of numbers(ex: int[] numbers=new int[]{ 1,2,3 };) or tables of data, or databases: these are all well-defined data structures. Data Structures and organizing data will require students to become more algorithmic in coding.
- Together, data structures and algorithms combine and allow programmers to build whatever computer programs they’d like. Well managed data structures and algorithms ensures well-optimized and efficient code.

# Paradigm = A paradigm is an approach or a methodology or a strategy to be followed for writing software applications.
- Imperative =  imperative programming is a programming paradigm that uses statements that change a program's state. An imperative program consists of commands for the computer to perform to achieve a result. Imperative programming focuses on describing "how" a program code works.
- Object = Object Oriented programming (OOP) is a programming paradigm that relies on the concept of classes and objects. It is used to structure a software program into simple, reusable pieces of code blueprints (usually called classes), which are used to create individual instances of objects.

# Task Code Examples: 

Menu:
- Create a HashMap integer that has Integer key and Menu value.
- Each Menu has a title and task. The task is the program that will be run (main methods of other classes)
```
        Map<Integer, Menu> menu = new HashMap<>();
        menu.put(1, new Menu("IntByReference", () -> IntByReference.main(null)));
        menu.put(2, new Menu("Matrix", () -> Matrix.main(null)));
        menu.put(3, new Menu("Queue", () -> QueueTester.main(null)));
        menu.put(4, new Menu("Reverse Queue", () -> ReverseQueue.main(null)));
        
 ```
 IntByRefernce:
- Switches values so they are in low to high order
```
    public void swapToLowHighOrder (IntByReference b) {
        if (this.value > b.value){
            int temp = b.value;
            b.value = this.value;
            this.value = temp;
        }
    }
 ```
 - static method that swaps the numbers by refernce
 ```
 public static void swapper(int n0, int n1) {
        IntByReference a = new IntByReference(n0);
        IntByReference b = new IntByReference(n1);
        System.out.println("Before: "+ a.toString(b));
        a.swapToLowHighOrder(b);  
        System.out.println("After: " + a.toString(b));
        System.out.println();
    }
 ```
 Runtime: ![image](https://user-images.githubusercontent.com/43257337/162393472-ead4cb5c-5014-4d3d-a221-50a754a01eb1.png)

 
 

