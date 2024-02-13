/*Scrivere un programma che contenga una classe che definisce un Auto che abbia come proprietà cilindrata, targa, marca e modello.
Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Auto.*/

public class Main {
    public static void main(String[] args) {
        Car id = new Car(1242, "BL124AF", "Fiat", "Punto");

        System.out.println("- Cilindrata: " + id.getEngineSize());
        System.out.println("- Targa: " + id.getPlate());
        System.out.println("- Marca: " + id.getBrand());
        System.out.println("- Modello: " + id.getModel());
    }
}
