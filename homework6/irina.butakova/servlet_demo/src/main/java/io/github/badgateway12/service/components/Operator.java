package io.github.badgateway12.service.components;

interface Operator {
    void execute(OperandStack stack);
    int getPrecedence();
}
