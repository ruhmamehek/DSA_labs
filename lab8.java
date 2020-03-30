import java.io.*;
import java.util.*;
import java.lang.*;
	
class Node
{
	int data;
	Node left;
	Node right;
	int parent;

	Node(int x)
	{
		data=x;
		left=null;
		right=null;
	}

	Node(int x, int y)

	{
		data=x;
		if (y<x){ left.data=y;}
		else{right.data=y;}
	}

	Node()
	{
		data=0;
		left=null;
		right=null;
	}

	Node(int x, int i, int j)

	{
		data=x;
		left.data=i;
		right.data=j;
	}

}

class bst
{
	Node root;
	
	public bst()
	{
		root=new Node(); //Dummy start node which is not considered as part of the list
		
	}
	public bst(int n)
	{
		root=new Node(n); //Dummy start node which is not considered as part of the list
		
	}

	public Node insert (Node root, int value) {

	if (root == null)
	root = new Node (value);

	else {
	if (value < root.data)
	root.left = insert (root.left, value);
	else
	root.right = insert (root.right, value);
	}
	return root;
	}

	/* preorder display */
	public void display (Node root) {

	if (root!=null) {
	System.out.print (" " + root.data);

	display (root.left);
	display (root.right);
	}
	}

}


class L8_2

// 3 4 5 6 7 8 9
{
	static void func(int[] a, int n)
	{
		
		for (int i=0; i<n; i++)
		{	
			bst B= new bst (a[i]);	
			for (int j=0; j<n; j++) if(i!=j){
			B.insert(B.root, a[j]);
			}

			B.display(B.root); 
			System.out.println("done");
		}

		for (int i=n-1; i>=0; i--)
		{	
			bst B= new bst (a[i]);	
			for (int j=n-1; j>=0; j--) if(i!=j){
			B.insert(B.root, a[j]);
			}
			
			B.display(B.root);
			System.out.println("done");
		}

		// display(B.root)
		
	}

public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a= new int[n];


    for (int k=0; k<n; k++)
        {	
        	a[k]=sc.nextInt();
        }
    func(a,n);  

	}

}
