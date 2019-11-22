package git_assignment_initial;

import java.util.ArrayList;
import java.util.List;

public class Topic {
	private List<ITopic> TopicList;

	public Topic() {
		TopicList = new ArrayList<ITopic>();
	}

	public void AddTopic(ITopic topic) {
		TopicList.add(topic);
	}

	public List<ITopic> GetTopics() {
		return TopicList;
	}

	public void DoEvent(int input) {
		for (ITopic topic : TopicList) {
			topic.NotifyTopic(input);
		}
	}
}
