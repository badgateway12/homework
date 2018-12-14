package io.github.badgateway12.service.components;

public class Subtract implements BinaryOperator {
    @Override
    public void execute(OperandStack stack) {
        Operand rho = stack.pop();
        Operand lho = stack.pop();
        stack.push(lho.subtract(rho));
    }

    @Override
    public int getPrecedence() {
        return 1;
    }
}
