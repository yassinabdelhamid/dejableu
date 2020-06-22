package application;

public class Shots {
	
  private static int schluecke;
  private static String[] alleSpieler = { "Maurice", "Julian", "Savan", "Yassin", "Samuel"};
	
	public void randomshotgame() {

        schluecke = (int) (Math.random() * ((alleSpieler.length - 1) + 1)) + 1;

        String person = alleSpieler[((int) (Math.random() * ((5 - 1) + 1)) + 1)-1];

        if(schluecke % 2 != 0) {
            System.out.println(person + " trinkt " + schluecke + " Schluck");
        }
        else {
            System.out.println(person + " trinkt " + schluecke + " Schlücke");
        }

	}

}
