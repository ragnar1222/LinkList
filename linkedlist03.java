import java.util.*;
public class Node{
    int data;
    Node next;
}
 class LinkedList 
{
	Node head;
	
	public void insert(int data)
	{
		Node node = new Node();
		node.data = data;
		
		if(head==null)
		{
			head = node;
		}
		else
		{
			Node n = head;
			while(n.next!=null)
			{
				n = n.next;
			}
			n.next =  node;
		}
		
	}
public void Atstart(int data){
 Node node=new Node();
 node.data=data;
 node.next=head;
 head=node;
}
	public void show()
	{
		Node node = head;
		
		while(node.next!=null)
		{
			System.out.print(node.data);
			node = node.next;
		}
		System.out.print(node.data);
	}
	 public void mid(int p){
	   
	    
      for(int i=0;i<p;i++){
          Node node=head;
           while(node.next.next!=null){
              node=node.next;
          }
       
          Atstart(node.next.data);
          node.next=null;
          
         
      }
          
          
      }
	  
        
    
}
class gfg{
    public static void main(String args[]){
      
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
   
    for(int i=0;i<n;i++){
       LinkedList l=new LinkedList();
         int k=sc.nextInt();
    
         for(int h=0;h<k;h++){
             
             int r=sc.nextInt();
             l.insert(r);
         }
          int p=sc.nextInt();
         l.mid(p);
         l.show();
         System.out.println();
    }
    }
}