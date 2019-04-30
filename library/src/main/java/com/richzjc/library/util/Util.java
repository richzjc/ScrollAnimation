package com.richzjc.library.util;

public class Util {
    //求三个数的中间大小的一个数。
    public static float clamp(float value, float max, float min) {
        return Math.max(Math.min(value, max), min);
    }
}
