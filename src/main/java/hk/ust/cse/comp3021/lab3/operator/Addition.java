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
 * Addition should implement {@link Operator}, and will be used to construct {@link Operation} objects.
 * All operands are instances of {@link IntNumber}.
 */
public class Addition implements Operator {
 @Override
    public Value operate(List<Expression> operands) {
        var sum = BigInteger.ZERO;
        for (var operand : operands) {
            var value = (IntNumber) operand.eval();
            sum = sum.add(value.getVal());
        }
        return new IntNumber(sum);
    }

    @Override
    public String symbol() {
        return "+";
    }

}
