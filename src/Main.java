//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        int[]arrayOfNumbers = new int[10];

        IntList list1 = new arrayIntList();
        IntList list2 = new LinkedIntList();

        list1.addBack(42);
        list1.addBack(82);
        list1.addBack(97);
        list1.addBack(42);
        list1.addBack(82);
        list1.addBack(97);
        list1.addBack(42);
        list1.addBack(82);
        list1.addBack(97);
        list1.addBack(42);
        list1.addBack(82);
        list1.addBack(97);
        list1.addBack(42);
        list1.addBack(82);
        list1.addBack(97);
        list1.remove(4);
        System.out.println(list1);
        System.out.println("size: "+list1.size());
        list1.clear();
        list1.addBack(1);
        list1.addBack(2);
        list1.addBack(3);
        list1.addBack(4);
        System.out.println(list1);
        System.out.println("size: "+list1.size());
        list1.clear();
        list1.addBack(2);
        list1.removeBack();
        System.out.println(list1);


    }
}