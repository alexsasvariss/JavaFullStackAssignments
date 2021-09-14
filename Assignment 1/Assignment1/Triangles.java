/**
 * @author aesas
 *
 */
public class Triangles {

	static void firstTriangle()
	{
		System.out.println("1)");
		for (int i = 1; i < 5; i++)
		{
			for (int j = 0; j < i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println(".........");
	}
	
	static void secondTriangle()
	{
		System.out.println("2)");
		System.out.println(".........");
		for (int i = 4; i > 0; i--)
		{
			for (int j = 0; j < i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void thirdTriangle()
	{
		final int spacing = 4;
		int stars = 1;
		System.out.println("3)");
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < (spacing-i); j++)
			{
				System.out.print(" ");
			}
			for (int j = 0; j < stars; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			stars += 2;
		}
		System.out.println(".........");
	}
	
	static void fourthTriangle()
	{
		System.out.println("4)");
		System.out.println(".........");
		final int spacing = 5;
		int stars = 7;
		for (int i = 4; i > 0; i--)
		{
			for (int j = 0; j < (spacing-i); j++)
			{
				System.out.print(" ");
			}
			for (int j = 0; j < stars; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			stars -= 2;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		firstTriangle();
		secondTriangle();
		thirdTriangle();
		fourthTriangle();
	}

}
