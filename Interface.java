interface Stack{
	void push(int x);
	void pop();
}

class Interface implements Stack {
	int a[]=new int[5];
	int top=-1;

	public void push(int x){
		a[++top]=x;
		System.out.println("Pushed:"+x);
	}
	
	public void pop(){
		System.out.println("Popped:"+a[top--]);
	}

	public static void main(String[] args){
		Interface s=new Interface();
		s.push(10);
		s.push(20);
		s.push(30);
		s.pop();
	}
}