package sungard;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	String name = "World";

	if (args.length > 0) {
		name = args[0];
	}

        System.out.println( "Hello " + name +  "!" );
    }
}
