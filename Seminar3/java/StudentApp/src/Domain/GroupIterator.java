package Domain;

import java.util.Iterator;
import java.util.List;

public class GroupIterator implements Iterator<GroupIterator> {
    private int count;
    private List<GroupIterator> groups;

    public GroupIterator(List<GroupIterator> groups) {
        this.groups = groups;
    }

    @Override
    public boolean hasNext() {
        return count<groups.size();
    }

    @Override
    public GroupIterator next() {
        return groups.get(count++);
    }
}
