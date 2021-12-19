package com.dangvandat.util;

import com.dangvandat.enums.*;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class DataUtil {

    public static Map<String, String> getStatus() {
        Map<String, String> result = new HashMap<>();
        Stream.of(Status.values()).forEach(item -> {
            result.put(item.name(), item.getValue());
        });
        return result;
    }
}
