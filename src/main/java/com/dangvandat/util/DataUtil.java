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

    public static Map<String, String> getProductStatus() {
        Map<String, String> results = new HashMap<>();
        Stream.of(ProductStatus.values()).forEach(item -> {
            results.put(item.name(), item.getValue());
        });
        return results;
    }

    public static Map<String, String> getIntroductionType() {
        Map<String, String> results = new HashMap<>();
        Stream.of(IntroductionType.values()).forEach(item -> {
            results.put(item.name(), item.getValue());
        });
        return results;
    }

    public static Map<String, String> getCodeNews() {
        Map<String, String> results = new HashMap<>();
        Stream.of(CodeNews.values()).forEach(item -> {
            results.put(item.name(), item.getValue());
        });
        return results;
    }
}
