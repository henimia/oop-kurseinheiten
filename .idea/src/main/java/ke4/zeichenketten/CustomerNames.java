package ke4.zeichenketten;

/*Im Datenlexikon in Abschnitt 2.7 hatten wir Namen als eine Folge von Buchstaben,
die auch Bindestriche enthalten kann, aber mit einem Buchstaben beginnen muss,
vorgegeben.
Schreiben Sie eine Methode boolean checkName(String name), die für
eine gegebene Zeichenkette name überprüft, ob sie den o.g. Namenskonventionen
genügt. Bei der Eingabe akzeptieren wir Klein- und Großbuchstaben. Die Methode
soll zudem einen gültigen Namen auf der Konsole so ausdrucken, dass der erste
Buchstabe groß und der Rest klein geschrieben wird.
Zur Vereinfachung wollen wir es zulassen, dass ein Name mehrere Bindestriche
hintereinander enthalten darf. Umlaute und andere Sonderzeichen wie ’ß’ vernachlässigen wir*/


public class CustomerNames {

    public boolean checkName (String name) {
        if (!isEmptyString(name)) &&
        firstIsChar(name)&&
                restIsNameChar(name)) {
    printName(name);
    return true; {
        else {
                    System.out.println("Illegal name!");
                    return false;

        }
    }


}

    private void isEmptyString() {
    }