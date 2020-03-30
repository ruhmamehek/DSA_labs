import java.util.Scanner;

class Node{
	public int data;
	public Node next;
	

	Node(int n, Node p){
		data=n;
		next=p;
	}
	Node (int n){
		data =n;
		next = null;
	}
	Node(){
		data=0;
		next=null;
	}
}

class LinkedList
{
	Node front;
	Node rear;

	public LinkedList()
	{
	
	front=new Node(1); 
	rear=front;
	rear.next=front;

	}


	public void addNode(int num){

		
		Node ptr=new Node(num);
		rear.next=ptr;
		rear=ptr;
		ptr.next=front;

	}
}


class Output{


	static void func(LinkedList L, int q, int[] a)
	{
		Node curr=L.front;
		int j=0;

		while (j<(2*q)){

			if (a[j]==1){
				L.addNode(a[j+1]);
				j+=1;
			}

			else if (a[j]==2){
				curr=curr.next;
			}

			else if (a[j]==3){
				System.out.println(curr.data);
			}
			j++;
		}
	}

public static void main(String args[]){
	LinkedList L = new LinkedList();
	Scanner s = new Scanner(System.in);
    int q = s.nextInt();
	int a[] = new int[3*q];
	int i=0;
	int j=0;
    while(i<q)
        {
            a[j] = s.nextInt();
            if (a[j]==1){a[j+1]=s.nextInt(); j++;}
            i++;
            j++;
        } 
  
	func(L,q,a);
	}



}
