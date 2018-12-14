package io.github.badgateway12.service.components;

import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tokenizer {
    private final Pattern lexemes = Pattern.compile("\\(|\\)|(?<!\\d)[-]?\\d*\\.?\\d+|[-+/*]");

    public Collection<Token> tokenize(String input) {
        ArrayList<Token> tokens = new ArrayList<>();

        Matcher matcher = lexemes.matcher(input);

        while (matcher.find()) tokens.add(new Token(matcher.group()));

        return tokens;
    }
}
