import java.util.*;

public class Main {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        stackType evenStack = new stackType();
        queueType oddQueue = new queueType();
        queueType tempQueue = new queueType();
        stackType tempStack = new stackType();

        System.out.println("Enter 10 Numbers: ");

        int answers = 0;

        for (int i = 0; i < 10; i++)
        {
            answers = input.nextInt();

            if (answers % 2 == 1)
            {
                evenStack.push(answers);
            }
            else
            {
                if (answers / 2 != 1);
                {
                    oddQueue.addQueue(answers);
                }

            }

        }


        System.out.println();
        System.out.println("Even Stack (Incorrect)");

        while (!evenStack.isStackEmpty())
        {
            System.out.print(evenStack.top()+ " ");
            tempQueue.addQueue(evenStack.top());
            evenStack.pop();
        }

        System.out.println();
        System.out.println("Odd Queue (Incorrect)");

        while (!oddQueue.isQueueEmpty())
        {
            System.out.print(oddQueue.front()+ " <--- ");
            evenStack.push(oddQueue.front());
            oddQueue.deleteQueue();
        }
        System.out.print("End of Queue");

        System.out.println();
        System.out.println("Temp Queue");


        while (!tempQueue.isQueueEmpty())
        {
            System.out.print(tempQueue.front()+ " <--- ");
            oddQueue.addQueue(tempQueue.front());
            tempQueue.deleteQueue();
        }

        System.out.print("End of Queue");

        System.out.println();
        System.out.println("Even Stack (Correct)");

        while (!evenStack.isStackEmpty())
        {
            System.out.print(evenStack.top()+ " ");
            evenStack.pop();
        }

        System.out.println();
        System.out.println("Odd Queue (Correct)");

        while (!oddQueue.isQueueEmpty())
        {
            System.out.print(oddQueue.front()+ " <--- ");
            oddQueue.deleteQueue();
        }

        System.out.print("End of Queue");

        while (!evenStack.isStackEmpty()){
            evenStack.push(tempStack.top());
        }

    }
}