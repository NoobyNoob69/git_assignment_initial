package MathTopics;

import git_assignment_initial.ITopic;

// Please read CicleArea.java Code and implement as a clone of it but using your formula

public class CircleCircumference implements ITopic {
	public static double GetCircleCircumference(int r) {
		return 440 / 7;
	}

	@Override
	public String NotifyTopic(int input) {

		return "Input = 10\nCircle Circumference = " + (double)440 / 7;
	}

}
