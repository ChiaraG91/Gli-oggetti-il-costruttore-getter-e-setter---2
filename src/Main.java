public class Main {
    public static void main(String[] args) {

        Automobile auto1 = new Automobile("Chrevolet","Impala 1967", "BT456G",396);
        Automobile auto2 = new Automobile("Chrevolet","Bel Air 1958", "BT457G",315);
        Automobile auto3 = new Automobile("Chrevolet","Camaro 1966", "BT458G",298);
        Automobile auto4 = new Automobile("Chrevolet","Chevelle 1970", "BT459G",450);

        System.out.println(auto1.getMarca() + " " + auto1.getModello() + " " + auto1.getTarga() + " " + auto1.getCilindrata());
        System.out.println(auto2.getMarca() + " " + auto2.getModello() + " " + auto2.getTarga() + " " + auto2.getCilindrata());
        System.out.println(auto3.getMarca() + " " + auto3.getModello() + " " + auto3.getTarga() + " " + auto3.getCilindrata());
        System.out.println(auto4.getMarca() + " " + auto4.getModello() + " " + auto4.getTarga() + " " + auto4.getCilindrata());


    }
}
