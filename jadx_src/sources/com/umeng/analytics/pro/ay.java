package com.umeng.analytics.pro;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: TEnumHelper.java */
/* JADX INFO: loaded from: classes4.dex */
public class ay {
    public static ax a(Class<? extends ax> cls, int i10) {
        try {
            return (ax) cls.getMethod("findByValue", Integer.TYPE).invoke(null, Integer.valueOf(i10));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}
