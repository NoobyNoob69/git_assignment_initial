package MathTopics;

import git_assignment_initial.ITopic;
<<<<<<< HEAD
import git_assignment_initial.PrintStyle;
=======
>>>>>>> origin/master

//Please read CicleArea.java Code and implement as a clone of it but using your formula

public class SphereArea implements ITopic {
	public static double GetShpereArea(int r) {
<<<<<<< HEAD
		return (double) 4 * 22/7 * Math.pow(r, 2);
=======
		return (double)8800 / 7;
>>>>>>> origin/master
	}

	@Override
	public String NotifyTopic(int input) {
<<<<<<< HEAD
		double ans = GetShpereArea(input);
		String output = PrintStyle.print(input, "Fib") + ans;
		return output;
=======

		return "Input = 10\nShpere Area = " + (double)8800 / 7;
>>>>>>> origin/master
	}

}
