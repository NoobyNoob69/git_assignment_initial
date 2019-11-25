package git_assignment_initial;

import java.util.ArrayList;
import java.util.List;

public class Topic {
	private List<ITopic> TopicList;

	public Topic() {
		this.TopicList = new ArrayList<ITopic>();
	}

	public void AddTopic(ITopic topic) {
		this.TopicList.add(topic);
	}

	public List<ITopic> GetTopics() {
		return this.TopicList;
	}

	public String DoEvent(int input) {
		String[] output = new String[TopicList.size()];
		int i = 0;
		for (ITopic topic : TopicList) {
			output[i] = topic.NotifyTopic(input);
			i++;
		}

		String res = new String();
		for (String str : output) {
			res += str + "\n";
		}

		return res;
	}
}
