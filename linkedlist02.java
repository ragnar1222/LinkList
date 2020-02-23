import java.util.Scanner;
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
	 public void mid(int q){
	  Node n=head;
	  for(int i=0;i<q;i++){
	      n=n.next;
	  }
	  if(q>0){
	  System.out.println(n.data);}
	  else{
	      System.out.println(-1);
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
         int p=sc.nextInt();
         int q=k-p;
         for(int h=0;h<k;h++){
             
             int r=sc.nextInt();
             l.insert(r);
         }
         l.mid(q);
    }
    }
}