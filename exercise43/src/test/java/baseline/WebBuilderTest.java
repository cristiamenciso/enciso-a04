package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Cristiam Enciso
 */

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class WebBuilderTest {

    @Test
    void makeSite() throws IOException {
        WebBuilder builder = new WebBuilder();
        builder.makeSite("chinigang", "chini", "n", "n");
        Path file = new File("chinigang/index.html").toPath();
        assertTrue(Files.exists(file));
    }

    @Test
    void makeSiteWithJS() throws IOException {
        WebBuilder builder = new WebBuilder();
        builder.makeSite("chinigang2", "chini", "y", "n");
        Path file = new File("chinigang2/js").toPath();
        assertTrue(Files.isDirectory(file));
    }
    @Test
    void makeSiteWithCSS() throws IOException {
        WebBuilder builder = new WebBuilder();
        builder.makeSite("chinigang3", "chini", "n", "y");
        Path file = new File("chinigang3/css").toPath();
        assertTrue(Files.isDirectory(file));
    }
}