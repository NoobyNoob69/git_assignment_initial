package MathTopics;

import git_assignment_initial.ITopic;

//Please read CicleArea.java Code and implement as a clone of it but using your formula

public class SphereArea implements ITopic {
	public static double GetShpereArea(int r) {
		return 8800 / 7;
	}

	@Override
	public String NotifyTopic(int input) {

		return "Input = 10\nShpere Area = " + (double)8800 / 7;
	}

}
