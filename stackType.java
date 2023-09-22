public class stackType {

    Node stackTop;

    public stackType(){

        this.stackTop = null;
    }

    public boolean isStackFull() {

        return false;

    }

    public boolean isStackEmpty() {

        return (stackTop == null);

    }

    public void push(int x)
    {
        if (!this.isStackFull())
        {
            Node newNode = new Node();
            newNode.data = x;
            newNode.next = stackTop;
            stackTop = newNode;

        }

    }

    public int top() {

        if (!this.isStackEmpty())
        {
            return stackTop.data;
        }
        else
            System.out.println("Stack Empty");

        return -1;

    }

    public void pop() {

        if (!this.isStackEmpty())
        {
            stackTop = stackTop.next;
        }
        else
            System.out.println("Stack Empty");

    }

}
