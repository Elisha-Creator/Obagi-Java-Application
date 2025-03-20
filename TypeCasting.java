public class TypeCasting{
	public static void main(String[] args){
		//widening Type Casting
		double weight = 678;
		System.out.printf("Your weight is %f%n",weight);
		
		//Narrowing Type Casting ASCII Code ? = 63
		char alpha = '?';
		
		int asciiCode = (char)alpha;
		System.out.printf("The ASCII code for ? is %d%n",asciiCode);
		
		double hieght = 5.8;
		
		int myHieght = (int)hieght;
		System.out.printf("My faculty's hieght is %d",myHieght); 
	}
}