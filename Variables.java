import static java.sql.Types.NULL;

public class Variables {

    private static String TEXT = "The end.";

    public static void main (String[] args){
        System.out.println("Hi");
        String s = "Hi!";

        System.out.println(s);
        if (args != null){

            System.out.println(s);
        }
        Variables variables = new Variables();
        System.out.println(variables.instanceVariable);
        System.out.println(TEXT);
    }
    public String instanceVariable;
    public Variables(){
        instanceVariable = "Instance variable test.";
    }
}
