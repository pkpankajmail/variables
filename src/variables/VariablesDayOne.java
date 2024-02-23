package variables;

public class VariablesDayOne {
    public static void main(String[] args) {
        // 1 declare a variable ---------SYNTAX : Datatype varName;

        String name; // we have declared a variable String datatype with name name

        // 2  how to assign data into variable------------varName=value; Assigning data to a variable
        name="Java World"; // we need to use "" with only String data


        // 3 How to print a variable System.out.println("massage :  " + varName);
        System.out.println(" Printing variable name: "+name);




        int age; // we have declared a variable of int datatype with name age.
        age=44;
        System.out.println("Printing  age:"+age);



        double salary; // we have declared a variable of double datatype with name  salary
        salary=89433.21;
        System.out.println("Printing salary : "+salary);

        /// todo... you can not create duplicate variable  in  java ..

        String cityname; // declare with city name
        cityname="Agra TajMahal"; // we have assigned agra value to cityName variable
        System.out.println(" Printing city name : "+cityname);




    }
}
