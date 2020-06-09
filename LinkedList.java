public class LinkedList<T> 
{
   protected LLNode<T> list;

   public LinkedList()
   {
      list = null;
   }

   public void addFirst(T info)
   {
      LLNode<T> node = new LLNode<T>(info);
      node.setLink(list);
      list = node;
   }

   public void addLast(T info)
   {
      LLNode<T> curr = list;

      LLNode<T> newNode = new LLNode<T>(info);
      if(curr == null)
      {
         list = newNode;
      }
      else
      {
         while(curr.getLink() != null)
         {
            curr = curr.getLink();
         }
         curr.setLink(newNode);
      }
   }

   public void add(T afterThis, T info)
   {
      if (list != null) {
        LLNode<T> after = new LLNode<T>(afterThis);
        LLNode<T> curr = list;
        while (curr.getLink() != null) {
          if (curr.getInfo() == after.getInfo()) {
            after = curr;
            break;
          }
          curr = curr.getLink();
        }
        curr = list;
        while (curr.getLink() != null) {
          if (curr.getInfo() == after.getInfo()) {
            LLNode<T> newNode = new LLNode<T>(info);
            newNode.setLink(after.getLink());
            after.setLink(newNode);
            break;
          }
          curr = curr.getLink();
        }
      } else {
        System.out.println("List is empty.");
      }

   }

   public void removeFirst()
   {
      if (list != null) {
        list = list.getLink();
      } else {
        System.out.println("List is empty.");
      }
   }

   public void removeLast()
   {
      if (list != null) {
        int pos = 0;
        LLNode<T> curr = list;
        while (curr.getLink() != null) {
          curr = curr.getLink();
          pos++;
        }
        curr = list;
        int num = 1;
        while (num != pos) {
          curr = curr.getLink();
          num++;
        }
        curr.setLink(null);
        //This works but please let me know if there is a better way
      } else {
        System.out.println("List is empty.");
      }
   }

   public int size()
   {
      int size = 0;
      // if (list == null) {
      //   return size;
      // }

      LLNode<T> curr = list;
      while (curr != null) {
        curr = curr.getLink();
        size++;
      }
      return size;
   }

   public boolean isEmpty()
   {
      return (list == null); // Will print true because this method is called before anything gets added to the list
   }

   public boolean contains(T item)
   {
     LLNode<T> curr = list;
     LLNode<T> contains = new LLNode<T>(item);
     while (curr != null) {
       if (curr.getInfo() == contains.getInfo()) {
         return true;
       }
       curr = curr.getLink();
     }
     return false;
   }

   public void display()
   {
      LLNode<T> currNode = list;
      while(currNode != null)
      {
         System.out.println(currNode.getInfo());
         currNode = currNode.getLink();
      }
   }
}
