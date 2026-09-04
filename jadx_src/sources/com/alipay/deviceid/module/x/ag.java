package com.alipay.deviceid.module.x;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: JSONSerializer.java */
/* JADX INFO: loaded from: classes6.dex */
public final class ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static List<ak> f38223a;

    static {
        ArrayList arrayList = new ArrayList();
        f38223a = arrayList;
        arrayList.add(new am());
        f38223a.add(new ae());
        f38223a.add(new ad());
        f38223a.add(new ai());
        f38223a.add(new ac());
        f38223a.add(new ab());
        f38223a.add(new ah());
    }

    public static String a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object objB = b(obj);
        if (an.a(objB.getClass())) {
            return z.b(objB.toString());
        }
        if (Collection.class.isAssignableFrom(objB.getClass())) {
            return new y((Collection) objB).toString();
        }
        if (Map.class.isAssignableFrom(objB.getClass())) {
            return new z((Map) objB).toString();
        }
        throw new IllegalArgumentException("Unsupported Class : " + objB.getClass());
    }

    public static Object b(Object obj) {
        Object objA;
        if (obj == null) {
            return null;
        }
        for (ak akVar : f38223a) {
            if (akVar.a(obj.getClass()) && (objA = akVar.a(obj)) != null) {
                return objA;
            }
        }
        throw new IllegalArgumentException("Unsupported Class : " + obj.getClass());
    }
}
