package multiplicationTable;

import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

public class MultiplicationTable {
    Set<String> setTasks = new HashSet<>();

    public MultiplicationTable() {
    }
    public String task(){
        Random random = new Random();
        int x = random.nextInt(10);
        int y = random.nextInt(10);
        return x + "*" + y;
    }


    public void addSetTasks(){
        for (int i = 0; i < 15; i++){
            String task = task();
            String inverseTask = task.charAt(2) + "*" + task.charAt(0);
            if(!setTasks.contains(task) && !setTasks.contains(inverseTask)) {
                setTasks.add(task);
            }
        }
        System.out.println(setTasks);
    }


    public Set<String> getTasks() {
        return setTasks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MultiplicationTable that = (MultiplicationTable) o;
        return Objects.equals(setTasks, that.setTasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(setTasks);
    }

    @Override
    public String toString() {
        return "MultiplicationTable{" +
                "tasks=" + setTasks +
                '}';
    }
}
