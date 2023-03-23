package Task1;

public class Flows {


        public void methodA(String input) {
            System.out.print("J");
            if(input.equals("v")){
                System.out.print("a");
            }
            System.out.print(input);
        }
        public void methodB(String input) {
            if (!input.equals("start")) {
                System.out.print("carrot");
            }else{
                System.out.print("a" + " " + "er");
            }
        }
        public void methodC(String start) {
            System.out.print(" "+"sj");
        }
        public void methodD(String input) {
            if (input.length() < 7) {
                System.out.print("ovt");
            } else {
                System.out.println("lot");
            }
        }
}
