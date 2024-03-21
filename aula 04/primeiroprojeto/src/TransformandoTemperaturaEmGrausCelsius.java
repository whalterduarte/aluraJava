public class TransformandoTemperaturaEmGrausCelsius {
    public static void main(String[] args) {
        double temperaturaEmCelsius = 25.0;
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

        String resultado = String.format("A temperatura %f Cº é equivalente a %f Fahrenheit", temperaturaEmCelsius, temperaturaEmFahrenheit);

        System.out.println(resultado);

        int temperaturaFahrenheitEmInteiro = (int) temperaturaEmFahrenheit;
        System.out.println("A temperatura Fahrenheit em inteiro é " + temperaturaFahrenheitEmInteiro + "°F");
    }
}
