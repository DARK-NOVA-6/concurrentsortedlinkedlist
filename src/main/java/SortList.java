public abstract class SortList {

    public Entry head;
    public long successfulRemove, failureRemove, successfulAdd, failureAdd,
            successfulContains, failureContains;
    public SortList() {
        successfulRemove = 0;
        failureRemove = 0;
        successfulAdd = 0;
        failureAdd = 0;
        successfulContains = 0;
        failureContains = 0;
        this.head = new Entry(Integer.MIN_VALUE);
       this.head.next =new Entry(Integer.MAX_VALUE);
    }

    public  abstract  boolean add(Integer obj);
    public  abstract  boolean remove(Integer obj);
    public  abstract  boolean contain(Integer obj);

    public void printList(){
        Entry curr = this.head;
        while (curr != null){
            System.out.println(curr.object);
            curr = curr.next;

        }
    }

    public int size() {
        Entry curr = this.head;
        int res = 0;
        while (curr != null){
            res++;
            curr = curr.next;
        }
        return res;
    }
}
