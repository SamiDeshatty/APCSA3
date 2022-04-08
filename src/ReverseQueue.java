package src;

public class ReverseQueue {
    QueueManager inputQueue;

    public Stack reverse(QueueManager inputQueue){
        Stack outputStack = new Stack();
        this.inputQueue = inputQueue;
        while (inputQueue.queue.getHead() != null){
            outputStack.push(inputQueue.queue.getHead().getData());
            inputQueue.queue.delete();
        }
        return outputStack;
    }


    public static void main (String[]args){
        Object[] nums = new Integer[] { 1, 4, 5, 8 };
        QueueManager inputNums = new QueueManager("Queue 1", nums);
        inputNums.printQueue();
        ReverseQueue output = new ReverseQueue();
        Stack outputStack;
        outputStack = output.reverse(inputNums);
        System.out.println("Reversed Queue: " + outputStack);
    }
}
