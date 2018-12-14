package io.github.badgateway12.service;

import io.github.badgateway12.service.components.Calculator;
import io.github.badgateway12.service.components.Tokenizer;
import io.github.badgateway12.service.components.Validator;


public class EvaluatorService {

	private final Validator validator;
	private final Tokenizer tokenizer;
	private final Calculator calculator;

    public EvaluatorService(Validator validator, Tokenizer tokenizer, Calculator calculator) {
        this.validator = validator;
        this.tokenizer = tokenizer;
        this.calculator = calculator;
    }


    public String evaluate(String input) {
        validator.validate(input);
        return String.valueOf(calculator.calculate(tokenizer.tokenize(input)));
    }
}
