package com.coogie.calcengine;

public class Main {

	public static void main(String[] args) {
		MathEquation[] equations = new MathEquation[4];
		equations[0] = create(100.0, 50.0, 'd');
		equations[1] = create(25.0,  92.0, 'a');
		equations[2] = create(225.0, 17.0, 's');
		equations[3] = create(11.0,  3.0,  'm');

		for(MathEquation equation : equations) {
			equation.execute();
			System.out.print("Result equals: ");
			System.out.println(equation.getResult());
		}
	}

	public static MathEquation create(double leftVal, double rightVal, char opCode) {
		MathEquation equation = new MathEquation();
		equation.setLeftVal(leftVal);
		equation.setRightVal(rightVal);
		equation.setOpCode(opCode);

		return equation;
	}
}
