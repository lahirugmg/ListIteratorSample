public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        CollectionHolder collectionHolder = new CollectionHolder();
        collectionHolder.moveItemFromOneToTwo("" + 3);
        System.out.println("List 1");
        for (String list1 : collectionHolder.getMyList1()){
            System.out.println(list1);
        }
        System.out.println("List 2");
        for (String list2 : collectionHolder.getMyList2()){
            System.out.println(list2);
        }
    }
}
