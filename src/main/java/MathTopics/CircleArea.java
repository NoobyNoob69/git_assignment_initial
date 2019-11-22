package MathTopics;

import git_assignment_initial.*;
import java.lang.Math;

public class CircleArea implements ITopic {

	public static double GetCircleArea(int r) {
		return Math.PI * r * r;
	}

	@Override
	public void NotifyTopic(int input) {
		double ans = GetCircleArea(input);

		PrintStyle.print(input);

		System.out.println(ans);
	}
}
