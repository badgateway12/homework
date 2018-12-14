package io.github.badgateway12.stringHelper;

import java.util.Map;
import java.util.regex.Pattern;

public class StringHelper {
    private static final String REGEX_BEGIN = Pattern.quote("{{");
    private static final String REGEX_END = Pattern.quote("}}");
    private static final String SPACE = "\\s+";

    public static String replace(String layout, Map<String, String> replacement ) {
        String result = layout;
        for (Map.Entry<String, String> entry : replacement.entrySet()) {
            var pattern = Pattern.compile(REGEX_BEGIN + SPACE + entry.getKey() + SPACE + REGEX_END);
            result = pattern.matcher(result).replaceAll(entry.getValue());
        }
        return result;
    }
}
