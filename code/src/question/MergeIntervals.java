package question;

import java.util.ArrayList;

public class MergeIntervals {
	public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<Interval> res = new ArrayList<Interval>();
		for (Interval i : intervals)
			res = insert(res, i);
		return res;
	}

	public ArrayList<Interval> insert(ArrayList<Interval> intervals,
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
