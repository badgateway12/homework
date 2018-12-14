package io.github.badgateway12.service.components;

import java.util.ArrayDeque;

class OperandStack {
    private ArrayDeque<Operand> stack;

    OperandStack() {
        stack = new ArrayDeque<>();
    }

    Operand pop() {
        return stack.pop();
    }

    void push(Operand operand) {
        stack.push(operand);
    }

    void clear() {
        stack = new ArrayDeque<>();
    }
}
