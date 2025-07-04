package helloworl;

interface IntStack {
    void push(int value);
    int pop();
}

class FixedLengthStack implements IntStack {
     int stack[];
     int top;
     int capacity;
    
    public FixedLengthStack(int capacity) {
        stack = new int[capacity];
        top = -1;
    }
    
    public void push(int value) {
        if (top < stack.length - 1) 
        {
            stack[++top] = value;
        } 
        else 
        {
            System.out.println("Stack is full " + value);
        }
    }
    
    public int pop() 
    {
        if (top >= 0)
        {
            return stack[top--];
        } else
{
            System.out.println("Stack is empty.");
            return -1;
        }
    }
    public void display()
    {
    	for(int i = 0; i<= capacity ;i++)
    	{
    		System.out.println(stack[i]);
    	}
    }
}

 
	   class DynamicLengthStack implements IntStack {
		      
			int stack[];
		     int top;
		     int initialCapacity;
		      
		    
		    public DynamicLengthStack(int initialCapacity) {
		        stack = new int[initialCapacity];
		        top = -1;
		    }
		    
		    
		    public void push(int value) 
		    {
		        if (top < stack.length - 1)
		        {
		            stack[++top] = value;
		        } else
		        {
		            
		        	System.out.println("stack capacity reached,multiplying current lenght by 2");
		            int newCapacity = stack.length * 2;
		            int newStack[] = new int[newCapacity];
		            System.arraycopy(stack, 0, newStack, 0, stack.length);
		            stack = newStack;
		            stack[++top] = value;
		            
		        	 
			    	
		        }
		    }
		    
		    
		    public int pop() {
		        if (top >= 0) {
		            return stack[top--];
		        } else {
		            System.out.println("Stack is empty.");
		            return -1;  
		        }
		    }


			public void display() 
			{
				for(int i = 0; i<= initialCapacity ;i++)
		    	{
		    		System.out.println(stack[i]);
		    	}
				 
				
			}
	   }
  

public class frappe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FixedLengthStack A = new FixedLengthStack(10);
		A.push(1);
		A.push(3);
		A.push(6);
		
		A.pop();
		A.pop();
		
		A.display();
		
		DynamicLengthStack B = new DynamicLengthStack(3);
		B.push(1);
		B.push(3);
		
        B.pop();
		
		
		B.display();
        
	}

}
