package general;

public class Main<i> {
    public static void main(String[] args) {
        SheRa[] characters;

        {
            characters = new SheRa[]{new Skeletor(), new HeMan(), new SheRa(), new BattleCat()};
        }

        for (int i = 0; i < characters.length; i++) {
            characters[i].train();
            System.out.println();
            characters[i].attack();
            System.out.println();
            System.out.println(characters[i]);
            System.out.println();
        }
    }
}