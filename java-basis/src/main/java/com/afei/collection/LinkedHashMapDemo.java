package com.afei.collection;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * linkHashMap 源码分析
 * @author shihengfei
 */
public class LinkedHashMapDemo {

    /**
     * lru缓存，指的是最近最少使用，是一种缓存淘汰算法
     * @param <K>
     * @param <V>
     */
    static class LruCache<K,V> extends LinkedHashMap<K,V> {
        private final int maxSize;
        // 构造函数设置初始大小与缓存池最大值
        public LruCache(int initialCapacity,int maxSize){
            // accessOrder属性为true时，元素按访问顺序排列，即最近访问的元素会被移动到双向列表的末尾
            super(initialCapacity,0.75f,true);
            this.maxSize = maxSize;
        }
        @Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            // 重写 remove 方法
            return size() > maxSize;
        }
    }

    public static void main(String[] args) {
        LruCache<String, String> cache = new LruCache<String, String>(3, 3);
        cache.put("1", "a");
        cache.put("2", "b");
        cache.put("3", "c");
        cache.put("4", "d");
        cache.put("5", "e");
        cache.get("3");
        cache.put("6", "f");
        System.out.println(cache);
    }

}
