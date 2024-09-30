class TotalHeight {
    public static void main(String args[]) {
        int feet = 5;
        double inches = 2.5;
        double totalInch = (feet * 12) + inches;
        double centimeters = (totalInch * 2.54);

        System.out.println("your height (the feet part) is " + feet);
        System.out.println("and the inches part is " + inches);
        System.out.println("your total height is " + totalInch);
        System.out.println("your total in centimeters is " + centimeters);
    }
}
