package org.finley.inshur;

import java.util.HashMap;

import static org.mockito.Mockito.mock;

public class ScenarioContext {
    private static ScenarioContext _current = null;

    private final HashMap<String, Object> _map = new HashMap<>();

    // NOTE: When using the static context you need to reset it in @Before function of the steps class
    // so that it clears it's internal state between test runs
    public static ScenarioContext getCurrent() {
        if(_current == null) {
            reset();
        }
        return _current;
    }

    public static void reset() {
        _current = new ScenarioContext();
    }

    public void put(String key, Object value) {
        _map.put(key, value);
    }

    public <T> void put(Object value, Class<T> clazz) {
        String key = clazz.getName();
        _map.put(key, value);
    }

    @SuppressWarnings("unchecked")
    public <T> T get(String key) {
        return (T) _map.get(key);
    }

    @SuppressWarnings("unchecked")
    public <T> T get(Class<T> clazz) {
        return (T) _map.get(clazz.getName());
    }

    public <T> T getOrMock(Class<T> clazz) {
        T mock = get(clazz);
        if(mock == null) {
            mock = mock(clazz);
            put(mock, clazz);
        }
        return mock;
    }

    public <T> boolean contains(Class<T> clazz) {
        return contains(clazz.getName());
    }

    public boolean contains(String key) {
        return _map.containsKey(key);
    }
}
