public class Main {
    public static void main(String[] args) {
        var estacion = "otoño";

        switch (estacion) {
            case "verano":
                System.out.println("verano");
                break;
            case "invierno":
                System.out.println("invierno");
                break;
            case "otoño":
                System.out.println("otoño");
                break;
            case "primavera":
                System.out.println("primavera");
                break;
            default:
                System.out.println("no es una estacion");
        }
    }
}