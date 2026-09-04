package com.umeng.analytics.pro;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: FieldMetaData.java */
/* JADX INFO: loaded from: classes4.dex */
public class bf implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Map<Class<? extends at>, Map<? extends ba, bf>> f104566d = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f104568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bg f104569c;

    public bf(String str, byte b10, bg bgVar) {
        this.f104567a = str;
        this.f104568b = b10;
        this.f104569c = bgVar;
    }

    public static Map<? extends ba, bf> a(Class<? extends at> cls) {
        if (!f104566d.containsKey(cls)) {
            try {
                cls.newInstance();
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("IllegalAccessException for TBase class: " + cls.getName() + ", message: " + e10.getMessage());
            } catch (InstantiationException e11) {
                throw new RuntimeException("InstantiationException for TBase class: " + cls.getName() + ", message: " + e11.getMessage());
            }
        }
        return f104566d.get(cls);
    }

    public static void a(Class<? extends at> cls, Map<? extends ba, bf> map) {
        f104566d.put(cls, map);
    }
}
