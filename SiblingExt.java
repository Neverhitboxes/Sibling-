//Name: Jeffrey Barron
//Assignment: 9 Inheritance
//Class: CS255

import javax.swing.JOptionPane;
public class SiblingExt extends Sibling{

	public SiblingExt(String n, int a, int w, int h) {
		super(n, a, w, h);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String in, out; 
		String name;
		int age;
		int weight;
		int height;
	//input first sibling data 
		name = JOptionPane.showInputDialog("Enter name");
		in = JOptionPane.showInputDialog("Enter age");
		age = Integer.parseInt(in);
		in = JOptionPane.showInputDialog("Enter weight");
		weight = Integer.parseInt(in);
		in = JOptionPane.showInputDialog("Enter Height:");
		height = Integer.parseInt(in);
		Sibling sibe1;
		sibe1 = new Sibling(name,age,weight, height);
		
			//second data
			name = JOptionPane.showInputDialog("Enter name");
			in = JOptionPane.showInputDialog("Enter age");
			age = Integer.parseInt(in);
			in = JOptionPane.showInputDialog("Enter weight");
			weight = Integer.parseInt(in);
			in = JOptionPane.showInputDialog("Enter Height:");
			height = Integer.parseInt(in);
			Sibling sibe2;
			sibe2 = new Sibling(name,age,weight, height);
		
				//third data
				name = JOptionPane.showInputDialog("Enter name");
				in = JOptionPane.showInputDialog("Enter age");
				age = Integer.parseInt(in);
				in = JOptionPane.showInputDialog("Enter weight");
				weight = Integer.parseInt(in);
				in = JOptionPane.showInputDialog("Enter Height:");
				height = Integer.parseInt(in);
				Sibling sibe3;
				sibe3 = new Sibling(name,age,weight, height);
		
// Age IF Statements
Sibling lightest, youngest, tallest;
	if (sibe1.getAge() < sibe2.getAge() && 
			sibe1.getAge() < sibe3.getAge()){youngest = sibe1;
				}
	else if (sibe2.getAge() < sibe1.getAge() &&
				sibe2.getAge() < sibe3.getAge()){youngest = sibe2;
		}
	else {youngest = sibe3;
		}
	{
//Weight IF Statements
	if (sibe1.getWeight() < sibe2.getWeight() &&
			sibe1.getWeight() < sibe3.getWeight()){
		lightest = sibe1;
		
	}
	else if (sibe2.getWeight() < sibe1.getWeight() &&
			sibe2.getWeight() < sibe3.getWeight()){
		lightest = sibe2;
	
	}
	
	else {
		lightest = sibe3;
	}
//Tallest IF Statements
	if (sibe1.getHeight() > sibe2.getHeight() &&
			sibe1.getHeight() > sibe3.getHeight()){
		tallest = sibe1;
		
	}
	else if (sibe2.getHeight() > sibe1.getHeight() &&
			sibe2.getHeight() > sibe3.getHeight()){
		tallest = sibe2;
	
	}
	
	else {
		tallest = sibe3;
	}

//Output 
out = "The lightest sibling: " + lightest.getName() + " " + lightest.getAge() + " " +lightest.getWeight() + "\n" ; 
out = out + "The youngest sibling: " + youngest.getName() + " " + youngest.getAge() + " " +youngest.getWeight() + "\n" ; 
out = out + "The tallest sibling: " + tallest.getName() + " " + tallest.getAge() + " " + tallest.getWeight() + "\n";

JOptionPane.showMessageDialog(null, out);
	}
}
}

