// Aaron Zeng 20120514
// In-class test review for ch. 07

public class ArrayIt2dTest
{
    public static void main( String[] args )
    {
        ArrayIt2d array = new ArrayIt2d();
        array.doubleIndex();
        array.arrayPrint();
        System.out.printf( "Sum: %d\n", array.arraySum() );
        System.out.println( "Average: " + array.arrayAverage() );
        array.random199();
        array.arrayPrint();
        System.out.printf( "Sum: %d\n", array.arraySum() );
        System.out.println( "Average: " + array.arrayAverage() );
    }
}
