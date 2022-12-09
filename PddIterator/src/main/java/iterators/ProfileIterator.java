package iterators;

/**
 *
 * @author Bryan
 */

import profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
