package hk.ust.cse.comp3021.lab3.structure;

import java.util.ArrayList;
import java.util.StringJoiner;


/**
 * TODO implement this class as needed.
 * Operation should implement {@link Expression}.
 * Operation consists of {@link Operator} and a list of {@link Expression} as its operands.
 */

public class Operation implements Expression {
    protected Operator operator;
    protected ArrayList<Expression> operands;

    public Operation(Operator operator, ArrayList<Expression> operands) {
        super();
        this.operator = operator;
        this.operands = operands;
    }

    @Override
    public Value eval() {
        return this.operator.operate(operands);
    }

    /**
     * An operation has a operator and multiple operands
     * Override the toString method to convert the operation to a string.
     * The format is "(operator operand1 operand2 operand3 ...)".
     * E.g.
     * If the operator is "+", and the operands are "2, 3, 5".
     * Then the string representation of this operation is (+ 2 3 5).
     *
     * @return the string representation of the operation
     */
    @Override
    public String toString() {
        var joiner = new StringJoiner(" ", "(", ")");
        joiner.add(operator.symbol());
        this.operands.forEach(expression -> joiner.add(expression.toString()));
        return joiner.toString();
    }
}