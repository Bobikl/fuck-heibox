package com.taobao.aranger.utils;

import com.taobao.aranger.intf.IObjectProxy;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class ObjectCenter {
    private static volatile ObjectCenter sInstance;
    private final ConcurrentHashMap<String, IObjectProxy> mObjectMap = new ConcurrentHashMap<>();

    private ObjectCenter() {
    }

    public static ObjectCenter getInstance() {
        if (sInstance == null) {
            synchronized (ObjectCenter.class) {
                if (sInstance == null) {
                    sInstance = new ObjectCenter();
                }
            }
        }
        return sInstance;
    }

    public void deleteObjects(List<String> list) {
        if (list == null) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.mObjectMap.remove(it.next());
        }
    }

    public IObjectProxy getObject(String str) {
        return this.mObjectMap.get(str);
    }

    public void putObject(String str, IObjectProxy iObjectProxy) {
        this.mObjectMap.putIfAbsent(str, iObjectProxy);
    }
}
