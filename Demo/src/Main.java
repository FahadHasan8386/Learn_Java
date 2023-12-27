public class Main {
    public static void main(String[] args) {

        String[] name = new String[3];
        name[0] = "Fahad";
        name[1] = "Hasan";
        name[2] = "Niloy";

        System.out.println(name.length);
        for (int i = 0 ; i < name.length ; i++){
            System.out.println(name[i]);
        }

        //Each Loop
        String [] name1 = {"Atik" , "Sadman" , "Tanvir"};

        for (String x : name1){
            System.out.println(x);
        }



    }
}
