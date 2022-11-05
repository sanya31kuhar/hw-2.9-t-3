import java.util.HashSet;
import java.util.Set;

public class Main {

    private final Set<String> tasks = new HashSet<>(15);

    public Main() {
        while (tasks.size() < 16) {
            String s = String.format("%d * %d", (int) (Math.random() * 8 + 2),
                    (int) (Math.random() * 8 + 2));
            if (tasks.contains(new StringBuilder(s).reverse().toString())) {
                continue;
            } else {
                tasks.add(s);
            }
        }
    }

    public void printTasks() {
        for (String task : tasks) {
            System.out.println(task);
        }
    }

    public static void main(String[] args) {
        Main st = new Main();
        st.printTasks();
    }

}
