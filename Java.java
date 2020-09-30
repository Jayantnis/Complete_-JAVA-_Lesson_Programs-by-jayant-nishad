class outeaddition
{ //create the outer class method
	public void outAdd()
	{ double x,y=54,z=523;
	 x=y+z;
	 System.out.println("A outAdd :- "+x);
	}
	
	//create the inner class method 
	class InnerAddition
	{
		public void inadd()
		{	int x,y=56,z=78;
			x=y+z;
			System.out.println("InAdd:- "+x);
		}
	}
	
	class Go
	{
		public void  Ree()//new method
		{ int x=45,y=32,z;
			z=x+y;
			System.out.println("Access the new 3rd method"+z);//call
		}
	}
}
public class Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outeaddition obj=new outeaddition();
		obj.outAdd();
		
		outeaddition.InnerAddition obj2=obj.new InnerAddition();
	obj2.inadd();	
		outeaddition.Go obj3=obj.new Go();
		obj3.Ree();
		
	}

}
