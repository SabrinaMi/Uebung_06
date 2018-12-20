import javax.swing.*;

public class Aufgabe1
{
    public static void main(String[] args)
    {

        String a = JOptionPane.showInputDialog(null, "Gib einen Wert ein");
        String b = JOptionPane.showInputDialog(null, "Gib noch einen Wert ein");
        String c = JOptionPane.showInputDialog(null, "Gib einen weiteren Wert ein");

        String sub1 = a.substring(0, 3); //Substring sagt er/sie will nur einen Teil des kompletten Strings
        System.out.println(sub1);
        String sub2 = b.substring(0, 3);
        System.out.println(sub2);
        String sub3 = c.substring(0, 3);
        System.out.println(sub3);

        if (sub1.equals(sub2) || sub2.equals(sub3) || sub1.equals(sub3)) //Vergleich mit einer ODER-Abfrage
        {
            System.out.println("Die ersten drei Zeichen von drei Variablen sind gleich");
        } else
        {
            System.out.println("Keines der eingegeben Werte stimmt überein");
        }

    }
}
