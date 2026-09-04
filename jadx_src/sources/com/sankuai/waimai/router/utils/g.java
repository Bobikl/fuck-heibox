package com.sankuai.waimai.router.utils;

import androidx.annotation.n0;
import com.sankuai.waimai.router.components.h;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: SingletonPool.java */
/* JADX INFO: loaded from: classes8.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Class, Object> f96572a = new HashMap();

    public static <I, T extends I> T a(Class<I> cls, com.sankuai.waimai.router.service.d dVar) throws Exception {
        if (cls == null) {
            return null;
        }
        if (dVar == null) {
            dVar = h.a();
        }
        T t10 = (T) b(cls, dVar);
        com.sankuai.waimai.router.core.c.f("[SingletonPool]   get instance of class = %s, result = %s", cls, t10);
        return t10;
    }

    @n0
    private static Object b(@n0 Class cls, @n0 com.sankuai.waimai.router.service.d dVar) throws Exception {
        Object objA;
        Map<Class, Object> map = f96572a;
        Object obj = map.get(cls);
        if (obj != null) {
            return obj;
        }
        synchronized (map) {
            objA = map.get(cls);
            if (objA == null) {
                com.sankuai.waimai.router.core.c.f("[SingletonPool] >>> create instance: %s", cls);
                objA = dVar.a(cls);
                if (objA != null) {
                    map.put(cls, objA);
                }
            }
        }
        return objA;
    }
}
