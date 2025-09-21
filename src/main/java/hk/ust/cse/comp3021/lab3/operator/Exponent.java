package hk.ust.cse.comp3021.lab3.operator;

import java.util.List;

import hk.ust.cse.comp3021.lab3.structure.Expression;
import hk.ust.cse.comp3021.lab3.structure.Operation;
import hk.ust.cse.comp3021.lab3.structure.Operator;
import hk.ust.cse.comp3021.lab3.structure.Value;
import hk.ust.cse.comp3021.lab3.value.IntNumber;


/**
 * TODO implement this class as needed.
 * Exponent should implement {@link Operator}, and will be used to construct {@link Operation} objects.
 * All operands are instances of {@link IntNumber}.
 * Hint: BigInteger.pow(int)
 */

public class Exponent implements Operator {
    /**
     * @return The result of the exponentiation
     */
    @Override
    public Value operate(List<Expression> operands) {
        var result = ((IntNumber) operands.get(0).eval()).getVal();
        var value = (IntNumber) operands.get(1).eval();
        result = result.pow(value.getVal().intValue());
        return new IntNumber(result);
    }

    @Override
    public String symbol() {
        return "^";
    }
}