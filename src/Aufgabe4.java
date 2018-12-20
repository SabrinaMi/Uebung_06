import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Aufgabe4
{
    public static void main(String[] args)
    {
        List<Integer> arrayList = new ArrayList<>();
        Random rnd = new Random();
        int zufallszahl = rnd.nextInt(1000) + 1; //mindestens 1 max. 1000

        for (int i = 0; i < zufallszahl; i++) //STart mir bei 0 und lauf sooft wie es die Zufallszahl sagt
        {
        int zufallszahl2 = rnd.nextInt(1000) +1; //neue Zufallszahl da es verschiedene Zahlen ausgeben soll
        arrayList.add(zufallszahl2); //füg mir diese Zahl in meiner Liste dazu/ein
        }
        for (int aufzählung: arrayList) //für jedes Item dass sich in der ArrayListe befindet, läuft es einmal durch
        {
            System.out.println(aufzählung); // gibt mir den Wert aus
        }
    }
}
