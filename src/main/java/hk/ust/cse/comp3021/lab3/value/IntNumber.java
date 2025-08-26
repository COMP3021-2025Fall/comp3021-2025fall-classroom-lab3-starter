package hk.ust.cse.comp3021.lab3.value;


import java.math.BigInteger;

import hk.ust.cse.comp3021.lab3.structure.Value;


/**
 * TODO implement this class as needed.
 * This class implement {@link Value} (since an integer number is technically a value in expression).
 * There can be other type of values, e.g. float number, but in this lab we only implement integer numbers.
 *
 */
public class IntNumber implements Value {
    private final BigInteger val;

    public IntNumber(BigInteger val) {
        this.val = val;
    }

    public IntNumber(String val) {
        this.val = new BigInteger(val);
    }
}