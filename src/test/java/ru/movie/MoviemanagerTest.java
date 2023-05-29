package ru.movie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoviemanagerTest {
    @Test
    public void testall3() {
        Moviemanager manager = new Moviemanager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");

        String[] expected = {"Film 1", "Film 2", "Film 3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void testall1() {
        Moviemanager manager = new Moviemanager();

        manager.addMovie("Film 1");

        String[] expected = {"Film 1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void testall0() {
        Moviemanager manager = new Moviemanager();


        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void testlast3() {
        Moviemanager manager = new Moviemanager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");

        String[] expected = {"Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void testlast6() {
        Moviemanager manager = new Moviemanager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");
        String[] expected = {"Film 6", "Film 5", "Film 4", "Film 3", "Film 2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void testlast5() {
        Moviemanager manager = new Moviemanager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");

        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(actual, expected);
    }
}
