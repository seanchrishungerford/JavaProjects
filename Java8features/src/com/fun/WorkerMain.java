package com.fun;

public class WorkerMain {
	public static void execute(WorkerInterface workerInterface) {
		workerInterface.doSomeWork();
	}
	
	public static void main(String[] args) {
		execute(()-> System.out.println("I am inside the class"));
	}
	
	
}
