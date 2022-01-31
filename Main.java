import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner it=new Scanner (System.in);

    ArrayList <String> lastNames = new ArrayList <String>();
    lastNames.add("Smith");
     lastNames.add("Ali");
    lastNames.add("Shawver");
    System.out.println(lastNames);

    //adding a name at index value 1, other values move to the right
lastNames.add(1, "Singley");
    System.out.println(lastNames);
    //prints the size of arrayList, similar to length command
  System.out.println("Size of lastNames is " + lastNames.size());
  //lastNames.remove(2);    Following code removes the value at index 2, and prints what that value is. Java fills the gap by moving the remaining values over to the left
    System.out.println("String removed is " + lastNames.remove(2));

  System.out.println(lastNames);
    System.out.println("Size of lastNames is " + lastNames.size());

System.out.println("Removed String using set is " + lastNames.set(0, "Gorsline"));

System.out.println(lastNames);
    System.out.println("Size of lastNames is " + lastNames.size());

    lastNames.clear();
    System.out.println(lastNames);
        System.out.println("Size of lastNames is " + lastNames.size());

        Integer one=new Integer(1);
        Double two=new Double(2.0);
        String three="3";
        //lastNames.add(one);
        //lastNames.add(two);
       // lastNames.add(three);

       ArrayList demo = new ArrayList();
        demo.add(one);
        demo.add(two);
       demo.add(three);
    System.out.println(demo);


  }
}