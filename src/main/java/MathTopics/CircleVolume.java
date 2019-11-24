package MathTopics;

import git_assignment_initial.*;
import java.lang.Math;

public class CircleVolume implements ITopic {

	public static double GetCircleVolume(int r) {
		return Math.PI * (4/3) * Math.pow(r, 3);
	}

	@Override
	public String NotifyTopic(int input) {
		double ans = GetCircleVolume(input);

		String output = PrintStyle.print(input, "Circle Volume") + ans;

		return output;
	}
}

