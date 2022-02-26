package fundamental.main_task;

public class FindMonth {
    public static void main(String[] args) {

        String[] monthArr = new String[]{"Jan", "Feb", "March", "april" ,"May", "june", "july", "august", "sept", "oct", "nov","Dec"};

        String str = args[0];
        int index = Integer.parseInt(str);
        if (index>=1 && index<13) {
            System.out.println(index + " month is: " + monthArr[index - 1]);
        }else {
            System.out.println("The number will be beetwen 1-12");
        }
    }

}
