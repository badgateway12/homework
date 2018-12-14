package io.github.badgateway12.service.components;

import java.util.Objects;

class Token
{
    private final String sequence;

    private final static String operatorPattern = "[+-/*]";
    private final static String operandPattern = "[-]?\\d*\\.?\\d+";
    private final static String openParenthesis = "(";
    private final static String closeParenthesis = ")";


    public Token(String sequence)
    {
        this.sequence = sequence;
    }

    public String getSequence()
    {
        return sequence;
    }

    public boolean isOperator()
    {
        return sequence.matches(operatorPattern);
    }

    public boolean isOpenParenthesis()
    {
        return sequence.equals(openParenthesis);
    }

    public boolean isCloseParenthesis()
    {
        return sequence.equals(closeParenthesis);
    }

    public boolean isOperand()
    {
        return sequence.matches(operandPattern);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Token token = (Token) other;
        return Objects.equals(sequence, token.sequence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sequence);
    }
}
