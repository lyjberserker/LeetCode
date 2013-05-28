package question;

import java.util.ArrayList;

public class InsertInterval {
	public ArrayList<Interval> insert(ArrayList<Interval> intervals,
			Interval newInterval) {
		// Start typing your Java solution below
		// DO NOT write main() function
		for (int i = 0; i < intervals.size(); i++) {
			Interval tmp = intervals.get(i);
			if (newInterval.end < tmp.start) {
				intervals.add(i, newInterval);
				return intervals;
			} else if (newInterval.start <= tmp.end) {
				newInterval.start = Math.min(tmp.start, newInterval.start);
				newInterval.end = Math.max(tmp.end, newInterval.end);
				intervals.remove(tmp);
				i--;
			}
		}
		intervals.add(newInterval);
		return intervals;
	}

	public ArrayList<Interval> insert2(ArrayList<Interval> intervals,
			Interval newInterval) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<Interval> res = new ArrayList<Interval>();
		for (Interval i : intervals) {
			if (newInterval.end < i.start) {
				res.add(newInterval);
				newInterval = i;
			} else if (newInterval.start > i.end)
				res.add(i);
			else {
				newInterval.start = Math.min(i.start, newInterval.start);
				newInterval.end = Math.max(i.end, newInterval.end);
			}
		}
		res.add(newInterval);
		return res;
	}
}
