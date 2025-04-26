package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        //TODO Tady bude kód pro kreslení želví grafiky.

        double delkaStranyCtverce = 50;
        double delkaObdelniku = 100;
        double vyskaObdelniku = 50;
        double delkaRamen = 60;
        double delkaZakladny = 80;

        //zmrzlina
        double polomerKruznice = 80;
        double delkaStranyTrojuhelniku = polomerKruznice*2;
        nakresliKruznici(polomerKruznice);
        zofka.penUp();
        zofka.move((polomerKruznice/3)*2);
        zofka.turnLeft(180);
        nakresliRovnostrannyTrojuhelnik(delkaStranyTrojuhelniku);

    }

    public void nakresliKruznici(double polomerKruznice) {
        //kruznice se kresli odspoda a Zofka konci v jejim presnem prostredku smerem nahoru
        zofka.penDown();
        zofka.turnLeft(90);
        for (int i = 0; i < 24; i++) {
            zofka.move(polomerKruznice/4);
            zofka.turnRight(15);
        }
        zofka.move(polomerKruznice/8);
        zofka.turnRight(90);
    }

    public void nakresliRovnostrannyTrojuhelnik (double delkaStranyRovnostrannehoTrojuhelniku) { //nejdelsi nazev promenne ever
        //trojuhelnik se kresli od prostredka zakladny a Zofka konci v pozici, v jake zacinala, otocena nahoru
        zofka.penDown();
        zofka.turnRight(90);
        zofka.move(delkaStranyRovnostrannehoTrojuhelniku/2);
        zofka.turnLeft(120);
        zofka.move(delkaStranyRovnostrannehoTrojuhelniku);
        zofka.turnLeft(120);
        zofka.move(delkaStranyRovnostrannehoTrojuhelniku);
        zofka.turnLeft(120);
        zofka.move(delkaStranyRovnostrannehoTrojuhelniku/2);
        zofka.turnLeft(90);
    }

    public void nakresliPravouhlyRovnoramennyTrojuhelnik (double delkaRamen, double delkaZakladny){
        //zakladna je dole, pravy uhel je nahore, zofka kresli od praveho dolniho rohu
        zofka.penDown();
        zofka.turnLeft(45);
        zofka.move(delkaRamen);
        zofka.turnLeft(90);
        zofka.move(delkaRamen);
        zofka.turnLeft(135);
        zofka.move(delkaZakladny);
        zofka.turnLeft(90);
    }

    public void nakresliCtverec (double delkaStranyCtverce) {
        //ctverec se kresli od praveho dolniho rohu, Zofka konci v pozici, v jake zacinala, otocena nahoru
        zofka.penDown();
        for (int i = 0; i < 4; i++) {
            zofka.move(delkaStranyCtverce);
            zofka.turnLeft(90);
        }
    }

    public void nakresliObdelnik (double delkaObdelniku, double vyskaObdelniku) {
        //obdelnik se kresli od praveho dolniho rohu, Zofka konci v pozici, v jake zacinala, otocena nahoru
        zofka.penDown();
        for (int i = 0; i < 2; i++) {
            zofka.move(vyskaObdelniku);
            zofka.turnLeft(90);
            zofka.move(delkaObdelniku);
            zofka.turnLeft(90);
        }
    }

}
