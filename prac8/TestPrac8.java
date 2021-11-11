package mirea.prac8;


public class TestPrac8 {
    public static void main(String[] args) {
        WaitList<Integer> waitList = new WaitList<>();

        fillWaitListWithNumbers(waitList, 10);

        System.out.println("Wait List");
        System.out.println(waitList);

        waitList.add(123);
        waitList.contains(4);

        System.out.println(waitList.remove());
        System.out.println(waitList);

        System.out.println("BoundedWaitList");

        BoundedWaitList<Integer> boundedList = new BoundedWaitList<>(5);

        fillWaitListWithNumbers(boundedList, boundedList.getCapacity());

        System.out.println(boundedList);
        System.out.println(boundedList.remove());
        System.out.println(boundedList);

        System.out.println("UnfairWaitList");

        UnfairWaitList<Integer> unfairList = new UnfairWaitList<>();

        fillWaitListWithNumbers(unfairList, 10);

        System.out.println(unfairList);

        unfairList.remove(0);

        System.out.println(unfairList);

        unfairList.remove(6);

        System.out.println(unfairList);
    }

    private static void fillWaitListWithNumbers(IWaitList<Integer> waitList, int size){
        for (int i = 0; i < size; i++){
            waitList.add(i);
        }
    }
}
