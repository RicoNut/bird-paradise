package task3;

import java.util.Arrays;
import java.util.List;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/1 10:23 AM
 */
public class BirdSchedule {
    List<Bird> birdList;

    public BirdSchedule() {
        birdList = initBirdList();
    }

    private List<Bird> initBirdList() {
        return Arrays.asList(new WildGoose(), new Swallow(), new Penguin());
    }

    public String eating(String clock) {
        StringBuilder printer = new StringBuilder();
        for (Bird bird : birdList) {
            printer.append(bird.eating(clock)).append("\n");
        }
        return printer.toString();
    }

    public String walking(String clock) {
        StringBuilder printer = new StringBuilder();
        for (Bird bird : birdList) {
            printer.append(bird.walking(clock)).append("\n");
        }
        return printer.toString();
    }

    public String performing(String clock) {
        StringBuilder printer = new StringBuilder();
        for (Bird bird : birdList) {
            printer.append(bird.performing(clock)).append("\n");
        }
        return printer.toString();
    }

    public String flying(String clock) {
        StringBuilder printer = new StringBuilder();
        for (Bird bird : birdList) {
            if (bird instanceof IFly)
                printer.append(bird.flying(clock)).append("\n");
        }
        return printer.toString();
    }

    public String swimming(String clock) {
        StringBuilder printer = new StringBuilder();
        for (Bird bird : birdList) {
            if (bird instanceof Swallow) continue;
            printer.append(bird.swimming(clock)).append("\n");
        }
        return printer.toString();
    }
}