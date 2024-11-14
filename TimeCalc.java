public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);

            //System.out.println("hours : " + hours);
            //System.out.println("minutes : " + minutes);
            //System.out.println("minuts to add : " + minutesToAdd);

        int totalMinuts = ((hours * 60) + minutesToAdd + minutes);
        int totalHours = (totalMinuts / 60);
        int newHours = (totalHours % 24);
        int newMinuts = (totalMinuts - (totalHours * 60));

        if (newHours <= 9 ){
            System.out.print("0" + newHours + ":");
        }
            else{
                System.out.print(newHours + " ");
             }

        if (newMinuts <=9 ){
            System.out.print("0" + newMinuts);
        }
            else{
                System.out.print(newMinuts);
            }

        //System.out.println(newHours + " : " + newMinuts);
    }
}
