package org.system;

public class Desktop extends Computer {

	public void DesktopSize() {
	
		System.out.println("Show the desktop size  ");

	}
	
	
	public static void main(String[] args) {
		
		
		Desktop obj=new Desktop();
		
		obj.computerModel();
		
		obj.DesktopSize();
		
	}

}
