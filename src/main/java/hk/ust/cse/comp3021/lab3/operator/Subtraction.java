package hk.ust.cse.comp3021.lab3.operator;

import java.math.BigInteger;
import java.util.List;

import hk.ust.cse.comp3021.lab3.structure.Expression;
import hk.ust.cse.comp3021.lab3.structure.Operation;
import hk.ust.cse.comp3021.lab3.structure.Operator;
import hk.ust.cse.comp3021.lab3.structure.Value;
import hk.ust.cse.comp3021.lab3.value.IntNumber;

/**
 * TODO implement this class as needed.
 * Subtraction should implement {@link Operator}, and will be used to construct {@link Operation} objects.
 * All operands are instances of {@link IntNumber}.
 * Hint: BigInteger.subtract(BigInteger) are useful for implementing eval()
 * Note: If the number of operands is 1, return the negation. Otherwise, subtract the rest of the operands from
 * the first operand
 */

public class Subtraction implements Operator {
    @Override
    public Value operate(List<Expression> operands) {
        if (operands.size() == 1) {
            var result = BigInteger.ZERO;
            return new IntNumber(result.subtract(((IntNumber) operands.get(0).eval()).getVal()));
        } else {
            var result = ((IntNumber) operands.get(0).eval()).getVal();
            for (var operand : operands.subList(1, operands.size())) {
                var value = (IntNumber) operand.eval();
                result = result.subtract(value.getVal());
            }
            return new IntNumber(result);
        }
    }

    @Override
    public String symbol() {
        return "-";
    }
}
