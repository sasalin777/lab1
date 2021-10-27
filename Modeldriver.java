package Lab1;

public class Modeldriver {
    public static void main(String[] args) {
        Model m1 = new Model();
        Model m2 = new Model("Susan"," Smith", 70, 120, true, false);
        Model m3 = new Model("Tiger"," Woods", 72, 190);
        Model[] models = { m1,m2, m3,c1};
        for (Model model : models) {
            System.out.println();
            System.out.println(model.t());
            System.out.println();
            System.out.println(model.displayModelDetails());
            System.out.print("=====================================================");
        }
    }
}
