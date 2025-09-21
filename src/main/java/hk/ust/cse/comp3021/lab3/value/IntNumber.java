package hk.ust.cse.comp3021.lab3.value;


import java.math.BigInteger;
import java.util.Objects;

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

    public BigInteger getVal() {
        return val;
    }

    /**
     * TODO 2.2
     *
     * @return the value as a string.
     */
    @Override
    public String toString() {
        return val.toString();
    }

    @Override
    public int compareTo(Value o) {
        var other = (IntNumber) o;
        return this.getVal().compareTo(other.getVal());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntNumber intNumber = (IntNumber) o;
        return val.equals(intNumber.val);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val);
    }
}