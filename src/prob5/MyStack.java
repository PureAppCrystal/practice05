package prob5;

import java.lang.reflect.Array;
import java.util.Objects;

//import java.io.IOException;

import prob5.MyStackException;

public class MyStack<T> {
	private T[] buffer;
	private int size;
	private int top = -1;
	
	@SuppressWarnings("unchecked")
	public MyStack ( int size ) {
		this.size = size;
		//buffer = new T[ size ];
		
		//Array.newInstance(objects.getClass(), size ) ;
		//buffer = (T[])Array.newInstance(Objects.class, size ) ;
		buffer= (T[])new Object[ size ] ;  //제너릭 배열 동적 생성 
		
	}
	
	
	public void push(T s) {
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
			result =  (String) buffer[top];
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
		
		//return top == -1;
	}
	
	
	
}


/* 내가 만든 일반 버전 - 170804
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
*/
