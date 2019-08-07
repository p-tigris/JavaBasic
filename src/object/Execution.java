package object;

import base.Variables;

public class Execution {

    // Naming convention:
    // - PackageName / variableName - starts with lower case
    // - Class - starts with upper case
    public static void main(String[] args) {
        //Object creation
        Laptop laptop = new Laptop();
        Car car = new Car();
        Variables variables = new Variables();

        System.out.println(car.brand);
        System.out.println(variables.name);


        System.out.println(laptop.brand);
        System.out.println(laptop.model);
        System.out.println(laptop.productionYear);
    }
}
