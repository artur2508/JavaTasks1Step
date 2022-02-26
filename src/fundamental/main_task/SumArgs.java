package fundamental.main_task;

public class SumArgs {
    public static void main(String[] args) {
        int sum = 0;
        int count = args.length;
        for (int i = 0; i < count; i++) {
            sum += Integer.parseInt(args[i]);
        }
        System.out.println("Sum from arguments  = " + sum);
    }

}
