import java.util.Scanner;

public class StackExample {
	static Scanner sc=new Scanner(System.in);
	static int stack[], top =-1,item=0,size=0;
	
	static
	{
		StackExample.create();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		while(true)
		{
		System.out.println("1      :        Push");
		System.out.println("2      :        Pop");
		System.out.println("3      :        Peek");
		System.out.println("4      :        Traverse");
		System.out.println("5      :        Quit");
		
		System.out.println("Enter your choice :\n");
		ch=StackExample.sc.nextInt();
			switch(ch)
			{
				case 1: System.out.println("Enter the stack elements\n");
				        item=StackExample.sc.nextInt();
						StackExample.push(item);
						break;
				case 2: item=StackExample.pop();
						if(item==0)
						{
							System.out.println("Srack is Empty");
						}
						else
						{
							System.out.println("The Poped Element is:"+item);
						}
						break;
				case 3: item=StackExample.peek();
						if(item==0)
						{
							System.out.println("Srack is Empty");
						}
						else
						{
							System.out.println("The Poped Element is:"+item);
						}
						break;
				case 4: StackExample.traverse();
						break;
				case 5: System.exit(1);
				default: System.out.println("Invalid Choice:");
						
			}
		}
	}
	static void create()
	{
		int size;
		System.out.println("Enter the Size of the Stack");
		size=StackExample.sc.nextInt();
		StackExample.stack= new int[size];
		System.out.println("Stack Created Successfully:"+size);
	}
	static void push(int item)
	{
		if(StackExample.isFull())
		{
			System.out.println("Stack is Overflow");
		}
		else
		{
			stack[++top]=item;
		}
	}
	static boolean isFull()
	{
		if(top==size-1)
		{
			return true;
		}
		
			return false;
		
	}
	static int pop()
	{
		if(StackExample.isEmpty())
		{
			return 0;
		}
		else
		{
			return StackExample.stack[top--];
		}
	}
	static boolean isEmpty()
	{
		if(top == -1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	static int peek()
	{
		if(StackExample.isEmpty())
		{
			return 0;
		}
		else
		{
			return StackExample.stack[top];
		}
	}
	static void traverse()
	{
		if(StackExample.isEmpty())
		{
			System.out.println("Stack is Empty\n");
		}
		else
		{
			System.out.println("Stack Elements are:\n");
			for(int i=top;i>=top;i--)
			{
				System.out.println(stack[i]);
			}
		}
	}
}
