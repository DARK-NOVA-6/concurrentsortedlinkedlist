import junit.framework.TestCase;

public class SyncListTest extends TestCase {

    public void testAddList(){

        SyncList syncList = new SyncList();

        syncList.add(1);
        syncList.add(2);
        syncList.add(3);
        syncList.add(Integer.MIN_VALUE);
        syncList.add(3);
        System.out.println(syncList.contain(5));
        System.out.println(syncList.contain(2));
        syncList.remove(3);

        syncList.printList();


    }
}
