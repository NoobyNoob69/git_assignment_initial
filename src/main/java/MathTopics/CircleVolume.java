package MathTopics;

import git_assignment_initial.*;


public class CircleVolume implements ITopic {

	public static double GetCircleVolume(int r) {
		return (double)(22/7) * (double)(4/3) * r * r * r;
	}

	@Override
	public String NotifyTopic(int input) {
		double ans = GetCircleVolume(input);

		String output = PrintStyle.print(input, "Circle Volume") + ans;

		return output;
	}
}

