public class Loop {
    public static void main(String[] args) {

    String name = "Fahad";

        for(int i = 0 ; i < name.length() ; i++){
            for(int j = 0 ; j <= i ;j++){
                System.out.print(name.charAt(i));
            }
            System.out.println();
        }
    }
}
