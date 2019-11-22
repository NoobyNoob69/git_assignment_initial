package git_assignment_initial;

import MathTopics.*;

public class Main {

	public static void main(String[] args) {

		// Driver Code
		Topic topic = new Topic();
		topic.AddTopic(new CircleArea());
		topic.DoEvent(1);
		topic.DoEvent(5);
		topic.DoEvent(10);
	}
}
