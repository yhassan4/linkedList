public class LLNode<T> 
{
   protected T info;
   protected LLNode<T> link;

   public LLNode(T info)
   {
      this.info = info;
      this.link = null;
   }

   public void setInfo(T info)
   {
      this.info = info;
   }

   public T getInfo()
   {
      return this.info;
   }

   public void setLink(LLNode<T> link)
   {
      this.link = link;
   }

   public LLNode<T> getLink()
   {
      return this.link;
   }
}
