import java.math.*;

class Equation{
	int a,b,c,x;
	
	double interieurParentheses()
	{
		pow(2,equa.b)-4*equa.a*equa.c;
	}
	
	void resolution()
	{
		float Rep;
		Rep=((-b)+sqrt(interieurParentheses())))/2*a;
		System.out.println("Racine 1:"+Rep);
		Rep=((-b)-sqrt(interieurParentheses())))/2*a;
		System.out.println("Racine 2:"+Rep);
	}
	
}
