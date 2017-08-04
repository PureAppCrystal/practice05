package prob5;

import java.io.IOException;

import prob5.MyStackException;

public class MyStack {
	private String[] buffer = null;
	private int size;
	private int top = -1;
	
	public MyStack ( int size ) {
		this.size = size;
		buffer = new String[size];
	}
	
	
	public void push(String s) {
		int nowSize = top+1;
		
		if (nowSize >= size) {
			return;
		} 
		
		top++;
		buffer[top] = s;
		
	}
	
	public String pop() throws MyStackException {
		String result = null;
		
		if ( top > -1) {
			result = buffer[top];
			top--;
		} else {
			throw new MyStackException("스택에 pop() 할 수 있는 데이터가 없습니다.");
			
		}
		
		return result;
	}
	
	public boolean isEmpty () {
		boolean result = false;
		
		if (top < 0) {
			result =  true;
		}
		return result;
	}
	
	
	
}
