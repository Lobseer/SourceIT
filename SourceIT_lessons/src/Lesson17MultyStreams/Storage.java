package Lesson17MultyStreams;

import java.util.HashMap;
import java.util.Map;

/**
 * Class description
 *
 * @author lobseer
 * @version 28.11.2016
 */

public class Storage {
    private Map<String, Number> map = new HashMap<>();

    public void store(String name, Number value)
    {
        map.put(name, value);
    }
}
