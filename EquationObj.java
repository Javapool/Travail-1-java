import java.io.*;

class EquationObj{

	public static void main(String[] args) {
        Equation UneEquation=new Equation();
        int loop=1;
        while(loop==1){
		    {
                System.out.println("Veuillez entrer un premier entier : ");
                UneEquation.a = input.next();
                System.out.println("Veuillez entrer un premier entier : ");
                UneEquation.b = input.next();
                System.out.println("Veuillez entrer un premier entier : ");
                UneEquation.c = input.next();
		    }

            if(UneEquation.a>0&&UneEquation.b>=0&&UneEquation.c>0)
            {
                UneEquation.resolution();
            }
            else
            {
                System.out.println("Valeurs Entrees Invalides. Veuillez Entrer des entiers superieurs a zero");
            }
            System.out.println("Recommencer? O/N");
            loop = input.next();
        }
    }
}
