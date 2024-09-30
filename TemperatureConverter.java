class TemperatureConverter {
    public static void main(String args[]) {
        double degreesF = 47.5;
        double degreesC;

        degreesC = (5.0/9.0) * ((double)degreesF - 32);
        System.out.println("The temperature " + degreesF + " degrees F " + "and is " + degreesC + " degrees C");
    }
}
