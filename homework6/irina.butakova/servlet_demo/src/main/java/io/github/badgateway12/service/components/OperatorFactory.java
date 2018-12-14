package io.github.badgateway12.service.components;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

class OperatorFactory {
    private final static Map<String, Supplier<Operator>> map = new HashMap<>();

    static {
        map.put("+", Add::new);
        map.put("-", Subtract::new);
        map.put("*", Multiply::new);
        map.put("/", Divide::new);
    }

    static Operator getOperator(String sequence) {
        Supplier<Operator> operator = map.get(sequence);
        if(operator != null) {
            return operator.get();
        }
        return null;
    }
}
