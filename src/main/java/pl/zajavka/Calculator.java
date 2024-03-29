package pl.zajavka;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Calculator {
    public int add(int left, int right) {
        log.debug("DEBUG message");
        log.info("INFO message");
        log.warn("WARN message");
        log.error("ERROR message");
        return left + right;
    }
    public int subtract(int left, int right) {
        return left - right;
    }
    public int multiply(int left, int right) {
        return left * right;
    }
    public int divide(int left, int right) {
        return left / right;
    }

}
