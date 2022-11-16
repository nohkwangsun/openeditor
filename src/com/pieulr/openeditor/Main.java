package com.pieulr.openeditor;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");
        boolean isWindows = System.getProperty("os.name").equalsIgnoreCase("windows");
        openEditor("vi");
    }

    public static void openEditor(String command) throws Exception {
        ProcessBuilder builder = new ProcessBuilder();
        builder.command(Stream.concat(Arrays.stream(command.split("\\s+")), Stream.of("MESSAGE.tmp")).toList());
//        builder.redirectInput(ProcessBuilder.Redirect.INHERIT);
//        builder.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        builder.inheritIO();
        Process process = builder.start();
        int exitCode = process.waitFor();
        assert exitCode == 0;
    }
}
//