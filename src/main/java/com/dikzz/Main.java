package com.dikzz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {

    public static void main(String[] args) {

    }

    public Set<String> test(String lt) {
        try {
            List<String> strings = Files.readAllLines(Paths.get("./test.txt"));
            NavigableSet<String> treeSet = new TreeSet<>();
            treeSet.addAll(strings);
            return treeSet.headSet(lt, false);
        } catch (IOException e) {
            return Collections.emptySet();
        }
    }
}
