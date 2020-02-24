package Main;
public class Main {
    public static void main(String [] args)
    {
        boolean flag = true;
        Menu menu = new Menu();
        while (flag) {
            int n = menu.showChoice();
            switch(n) {
                //creating the switch cases in main class
                case 1:
                    menu.addChoice();
                    break;
                case 2:
                    menu.viewChoice();
                    break;
                case 3:
                    menu.searchChoice();
                    break;
                case 4:
                    menu.deleteChoice();
                    break;
                case 5:
                    menu.exitChoice();
                    flag = false;
                    break;
                    // main class completed
            }
        }
    }
}
