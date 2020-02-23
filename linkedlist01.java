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
	 public void mid(){
	     int index=0;
        Node n=head;
        Node a=head;
        
            while(n.next!=null){
                index++;
                n=n.next;
            }
        
        index++;
        int k=(index)/2;
        for(int j=0;j<k;j++){
            a=a.next;
        }
        System.out.println(a.data);
        
        
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
         l.mid();
    }
    }
}