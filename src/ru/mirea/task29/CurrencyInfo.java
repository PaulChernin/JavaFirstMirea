package ru.mirea.task29;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CurrencyInfo implements Serializable {
    public Map<String, Integer> currencies = new HashMap<>(){{
        put("Dollar", 74);
        put("Euro", 83);
        put("Frank", 80);
    }};
}
