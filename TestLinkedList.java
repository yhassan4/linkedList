public class TestLinkedList 
{
   public static void main(String[] args)
   {
      LinkedList<String> list = new LinkedList<String>();

      System.out.println("Empty list? " + list.isEmpty());
      System.out.println();

      list.addLast("Smith, John");
      list.addLast("Davids, Tim");
      list.addLast("Lee, Kelvin");
      list.addLast("Willis, Linda");
      list.addLast("Wilton, Lisa");

      list.add("Lee, Kelvin", "Hunter, Roy");
      list.display();
      System.out.println();

      System.out.println(list.contains("Willis, Linda"));
      System.out.println();

      System.out.println("After remove first:");
      list.removeFirst();
      list.display();
      System.out.println();

      System.out.println("After remove last:");
      list.removeLast();
      list.display();
      System.out.println();

      System.out.println("Size: " + list.size());

   }
}
