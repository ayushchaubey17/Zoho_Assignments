public class IfStatementProgram {
    public static void main(String[] args) {


        if (true) {
            int variableInside = 20;

            System.out.println(variableInside);

//            cannot find Symbol variableOutside
            System.out.println(variableOutside);
        }

        int variableOutside = 30;

        System.out.println(variableOutside);


//            cannot find Symbol variableInside
        System.out.println(variableInside);

    }
}
