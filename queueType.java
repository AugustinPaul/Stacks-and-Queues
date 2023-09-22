public class queueType {

    Node queueFront;
    Node queueBack;


    public queueType() {
        this.queueBack = null;
        this.queueFront = null;

    }

    public boolean isQueueEmpty() {

        return (queueFront == null);
    }

    public boolean isQueueFull() {

        return false;
    }

    public void addQueue(int x) {

        Node newNode = new Node();
        newNode.data = x;
        newNode.next = null;

        if (this.isQueueEmpty())
        {
            this.queueFront = newNode;
            this.queueBack = newNode;
        }
        else
        {
            this.queueBack.next = newNode;
            queueBack = newNode;
        }

    }

    public void deleteQueue() {

        if (!this.isQueueEmpty())
        {
            this.queueFront = this.queueFront.next;
        }
        else
            System.out.println("Queue Empty");

        if (this.queueFront == null)
            this.queueBack = null;

    }

    public int front() {

        if (!isQueueEmpty()){
            return queueFront.data;
        }
        else
            System.out.println("Queue Empty");
        return -1;

    }

    public int back() {

        if (!isQueueEmpty()){
            return queueBack.data;
        }
        else
            System.out.println("Queue Empty");
        return -1;

    }





}
