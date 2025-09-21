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
 * Division should implement {@link Operator}, and will be used to construct {@link Operation} objects.
 * All operands are instances of {@link IntNumber}.
 * Note: if there is only one operand, return 1 / the operand (integer division).
 * Otherwise, divide the first operand by the rest of operands.
 */

public class Division implements Operator {
    /**
     * @return The result of the division
     */
    @Override
    public Value operate(List<Expression> operands) {
        if (operands.size() == 1) {
            var result = BigInteger.ONE;
            return new IntNumber(result.divide(((IntNumber) operands.get(0).eval()).getVal()));
        } else {
            var result = ((IntNumber) operands.get(0).eval()).getVal();
            for (var operand : operands.subList(1, operands.size())) {
                var value = (IntNumber) operand.eval();
                result = result.divide(value.getVal());
            }
            return new IntNumber(result);
        }
    }

    @Override
    public String symbol() {
        return "/";
    }
}