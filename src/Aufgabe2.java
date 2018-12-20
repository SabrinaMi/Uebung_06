public class Aufgabe2
{
    public static void main(String[] args)
    {
        int [] array;
        int length = 10;
        array = new int [length];
        for (int i=0; i<length; i++)
            array [i] = 1+i;

        for (int aufzählung: array)
        {
            System.out.println(aufzählung);
        }


    }
}
