import javax.swing.JOptionPane;


public class TestSibling {


public static void main(String[] args) {
	String in, out; 
	String name;
	int age;
	int weight;
//input first sibling data 
	name = JOptionPane.showInputDialog("Enter name");
	in = JOptionPane.showInputDialog("Enter age");
	age = Integer.parseInt(in);
	in = JOptionPane.showInputDialog("Enter weight");
	weight = Integer.parseInt(in);
	Sibling sib1;
	sib1 = new Sibling(name,age,weight, weight);
		
// input second sibling data 
		name = JOptionPane.showInputDialog("Enter name");
		in = JOptionPane.showInputDialog("Enter age");
		age = Integer.parseInt(in);
		in = JOptionPane.showInputDialog("Enter weight");
		weight = Integer.parseInt(in);
		Sibling sib2;
		sib2 = new Sibling(name,age,weight, weight);
		
// input third sibling data 
			name = JOptionPane.showInputDialog("Enter name");
			in = JOptionPane.showInputDialog("Enter age");
			age = Integer.parseInt(in);
			in = JOptionPane.showInputDialog("Enter weight");
			weight = Integer.parseInt(in);
			Sibling sib3;
			sib3 = new Sibling(name,age,weight, weight);
// IF Statements
Sibling lightest, youngest;
if (sib1.getAge() < sib2.getAge() &&
	sib1.getAge() < sib3.getAge()){
	youngest = sib1;
}
else if (sib2.getAge() < sib1.getAge() &&
		sib2.getAge() < sib3.getAge()){
		youngest = sib2;	
}
else {
		youngest = sib3;	
}
if (sib1.getWeight() < sib2.getWeight() &&
	sib1.getWeight() < sib3.getWeight()){
	lightest = sib1;	
}
else if (sib2.getWeight() < sib1.getWeight() &&
		sib2.getWeight() < sib3.getWeight()){
		lightest = sib2;
}
else {
	lightest = sib3;
}
{}
//Output Values
out = "The lightest sibling: " + lightest.getName() + " " + lightest.getAge() + " " +lightest.getWeight() + "\n" ; 
out = out + "The youngest sibling: " + youngest.getName() + " " + youngest.getAge() + " " +youngest.getWeight() + "\n" ; 

JOptionPane.showMessageDialog(null, out);
}}
