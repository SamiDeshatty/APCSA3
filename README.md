### AP EXAM PREP 
## WEEK 1: STUDY PLAN

- Monday: In class ~ Make review plan for next two weeks. At home ~ Unit 1 collegeboard practice (videos, quizzes, progress checks)
- Tuesday: In class ~ 40 question MCQ exam. At home ~ Unit 2 collegeboard
- Wednesday: In class + at home ~ Unit 3 collegeboard and MCQ corrections
- Thursday: In class ~ 4 question FRQ exam. At home ~ Unit 4 collegeboard
- Friday: In class + at home ~ Unit 5 collegeboard 

## WEEK 2: STUDY PLAN

- Monday: In class + At home ~ Unit 6 collegeboard practice (videos, quizzes, progress checks)
- Tuesday: In class ~ 40 question MCQ exam. At home ~ Unit 7 collegeboard
- Wednesday: In class + at home ~ Unit 8 collegeboard and MCQ corrections
- Thursday: In class ~ 4 question FRQ exam. At home ~ Unit 9 collegeboard
- Friday: In class + at home ~ Unit 10 collegeboard 
- Weekend: Take one full length practice test each day plus review individual study guide on Monday and Tuesday of next week.


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
 
 
## [Week 1 - Linked Lists](https://github.com/nighthawkcoders/nighthawk_csa/wiki/Tri-3:-Tech-Talk-1:-Linked-Lists-Part-2)
# What are Linked Lists?
- This class is an implementation of the LinkedList data structure which is a linear data structure where the elements are not stored in contiguous locations and every element is a separate object with a data part and address part. The elements are linked using pointers and addresses. Each element is known as a node. Due to the dynamicity and ease of insertions and deletions, they are preferred over the arrays. It also has a few disadvantages like the nodes cannot be accessed directly instead we need to start from the head and follow through the link to reach a node we wish to access.
- [More information on Linked Lists from an external source](https://www.geeksforgeeks.org/linked-list-in-java/)

# Task Code Examples: 
- Linked List Class
- A new element is constructed
```
 public LinkedList(T data, LinkedList<T> node){
        this.setData(data);
        this.setPrevNode(node);
        this.setNextNode(null);
    }
```

- Explained in comments

```
/**
     *  Returns reference to previous object in list
     *
     * @return  the previous object in the list
     */
    public LinkedList<T> getPrevious(){
        return this.prevNode;
    }

    /**
     *  Returns reference to next object in list
     *
     * @return  the next object in the list
     */
    public LinkedList<T> getNext(){
        return this.nextNode;
    }
    
   ```
- Queue:

``` 
// remove a list of objects to queue
    public void removeList(T[]... seriesOfObjects) {
        for (T[] objects: seriesOfObjects)
            for (T data : objects) {
                this.queue.delete();
                this.count--;
            }
    }

    /**
     * Print any array objects from queue
     */
    public void printQueue() {
        System.out.print(this.name + " count: " + count + ", data: ");
        for (T data : queue)
            System.out.print(data + " ");
        System.out.println();
    }
}

```

```
 /**
     *  Queue constructor
     *  Title with series of Arrays of Objects
     */
    public QueueManager(String name, T[]... seriesOfObjects) {
        this.name = name;
        this.addList(seriesOfObjects);
    }

    /**
     * Add a list of objects to queue
     */
    public void addList(T[]... seriesOfObjects) {
        for (T[] objects: seriesOfObjects)
            for (T data : objects) {
                this.queue.add(data);
                this.count++;
            }
    }

    // remove a list of objects to queue
    public void removeList(T[]... seriesOfObjects) {
        for (T[] objects: seriesOfObjects)
            for (T data : objects) {
                this.queue.delete();
                this.count--;
            }
    }
```
   Runtime Examples- 
   ![image](https://user-images.githubusercontent.com/43257337/163697861-b33e336b-a56c-4db9-9621-64e499d06295.png)
![image](https://user-images.githubusercontent.com/43257337/163697873-5d446edb-a2f9-428c-9abb-2aee15d1b05a.png)

## [Week 2 -  Calculator](https://github.com/nighthawkcoders/nighthawk_csa/wiki/Tri-3:-Tech-Talk-2:-Calculator)
# What is Calculator Theory?
    - In mathematics, an expression or mathematical expression is a finite combination of symbols that is well-formed according to rules that depend on the context.
    - In computers, expression can be hard to calculate with precedence rules. In computer math we often convert strings into Reverse Polish Notation (RPN, 3 + 4 becomes 3 4 +) using the [Shunting-yard algorithm](https://en.wikipedia.org/wiki/Shunting_yard_algorithm)
    ![image](https://user-images.githubusercontent.com/43257337/163697949-15e96d4a-0d30-4a9f-9d74-0e57dd466ac3.png)

Code Examples: 
```
// Takes tokens and converts to Reverse Polish Notation (RPN), this is one where the operator follows its operands.
    private void tokensToReversePolishNotation () {
        // contains final list of tokens in RPN
        this.reverse_polish = new ArrayList<>();

        // stack is used to reorder for appropriate grouping and precedence
        Stack tokenStack = new Stack();
 ```
 
- Test class to test some possible user input expressions
```
 Calculator simpleMath = new Calculator("100 + 200  * 3");
 System.out.println("Simple Math\n" + simpleMath);

 Calculator parenthesisMath = new Calculator("(100 + 200)  * 3");
 System.out.println("Parenthesis Math\n" + parenthesisMath);

 Calculator allMath = new Calculator("200 % 300 + 5 + 300 / 200 + 1 * 100");
 System.out.println("All Math\n" + allMath);

 Calculator allMath2 = new Calculator("200 % (300 + 5 + 300) / 200 + 1 * 100");
 System.out.println("All Math2\n" + allMath2);
 ```
 
 - In a hashmap all the operators are defined by precedence
 ```
  // Helper definition for supported operators
    private final Map<String, Integer> OPERATORS = new HashMap<>();
    {
        // Map<"token", precedence>
        OPERATORS.put("*", 3);
        OPERATORS.put("/", 3);
        OPERATORS.put("%", 3);
        OPERATORS.put("+", 4);
        OPERATORS.put("-", 4);
    }
 ```
 - Here we can see that multiplication "*" takes precedence over addition"+"

[Outside Resources on Reverse Polish Notations](https://www.geeksforgeeks.org/evaluate-the-value-of-an-arithmetic-expression-in-reverse-polish-notation-in-java/)

Runtime Example: 
![image](https://user-images.githubusercontent.com/43257337/163698049-2cd892d1-8bdc-46c0-92cd-32a141f1335e.png)
![image](https://user-images.githubusercontent.com/43257337/163698053-1f5ebe4a-71d7-45bf-9693-48cb1e908076.png)
![image](https://user-images.githubusercontent.com/43257337/163698060-d6ea4e7c-3d2a-4ae7-801f-2babe3742ebb.png)

## [Week 3- Sorts](https://github.com/nighthawkcoders/nighthawk_csa/wiki/Tri-3:-Tech-Talk-3:-Sorts)
# What are sorts? 
- [Teck Talk 7](https://github.com/nighthawkcoders/nighthawk_csa/wiki/Tri-2:-Tech-Talk-7-Sorts)
- Selection Sort is a linear sort algorithm as it moves from index [0] to [n-1]. In an inner loop it in a second linear loop that compares two elements (like seen in the visual below) and notes which is smallest, after cycling to the end it swaps the smallest number to the lowest in the round.
- Insertion sort is another linear algorithm that sorts elements from index [0] to index [n-1]. In the inner loop of this algorithm, it find the gap, insertion point for the next item and inserts it. Each inner loop leave the list partially sorted according to outer loops index.
- Merge sort > This algorithm uses a divide and conquer algorithm, versus linear algorithm of insertion or selection sort. Looking at it can be complicated, but it is more simple than it looks. It divides the array into two different groups recursively, until it gets only two to compare, swaps if necessary. Then it pops out of the recursion, observe the cascading and then the inverted assembly in illustration, after pop it puts each split group back together using a sorted comparison.

Code Examples: 

- From the imported java library, duration from begining to end is stored in this.timeElapsed to determine the time in nanoseconds
- A for loop is used to run through the data as seen in data.add and a Math.Random
```
public class Sorts {
    private final ArrayList<Integer> data = new ArrayList<>();
    private final Duration timeElapsed;

    public Sorts(int size) {
        Instant start = Instant.now();  // time capture -- start
        // build an array
        for (int i = 0; i < size; i++) {
            data.add((int)(Math.random() * (size+1)));
        }
        // use Inheritance and Polymorphism to replace data.sort with your own algorithm
        data.sort(Comparator.naturalOrder());
        Instant end = Instant.now();    // time capture -- end
        this.timeElapsed = Duration.between(start, end);
    }
```
Runtime Example: 
![image](https://user-images.githubusercontent.com/43257337/163698367-6c44dda6-8117-4883-8423-8108d9d97c46.png)

- Notice how both Total Time is present in seconds and nanoseconds
[Outside Resource of Java Sorts](https://stackabuse.com/sorting-algorithms-in-java/)





