import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MoviesManagerTest {

    @Test
    public void test() {
        MoviesManager manager = new MoviesManager();
        manager.add("F1");
        manager.add("F2");
        manager.add("F3");
        manager.add("F4");
        manager.add("F5");
        manager.add("F6");
        manager.add("F7");
        manager.add("F8");
        manager.add("F9");
        manager.add("F10");
        manager.add("F11");
        manager.add("F12");

        String[] actual = manager.findLast();
        String[] expected = {
                "F12",
                "F11",
                "F10",
                "F9",
                "F8",
                "F7",
                "F6",
                "F5",
                "F4",
                "F3"
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        MoviesManager manager = new MoviesManager();
        manager.add("F1");
        manager.add("F2");
        manager.add("F3");
        manager.add("F4");
        manager.add("F5");
        manager.add("F6");
        manager.add("F7");
        manager.add("F8");
        manager.add("F9");
        manager.add("F10");
        manager.add("F11");
        manager.add("F12");

        String[] actual = manager.findAll();
        String[] expected = {
                "F1",
                "F2",
                "F3",
                "F4",
                "F5",
                "F6",
                "F7",
                "F8",
                "F9",
                "F10",
                "F11",
                "F12"
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        MoviesManager manager = new MoviesManager();
        manager.add("F1");
        manager.add("F2");
        manager.add("F3");
        manager.add("F4");
        manager.add("F5");
        manager.add("F6");
        manager.add("F7");
        manager.add("F8");
        manager.add("F9");


        String[] actual = manager.findLast();
        String[] expected = {
                "F9",
                "F8",
                "F7",
                "F6",
                "F5",
                "F4",
                "F3",
                "F2",
                "F1"
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test4() {
        MoviesManager manager = new MoviesManager();
        String[] actual = ;
        String[] expected = {
                "F1",
                "F2",
                "F3",
                "F4",
                "F5",
                "F6",
                "F7",
                "F8",
                "F9",
                "F10"
        };
        assertArrayEquals(expected, actual);
    }
}