package com.alipay.deviceid.module.x;

import com.meituan.robust.Constants;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: JSONDeserializer.java */
/* JADX INFO: loaded from: classes6.dex */
public final class af {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static List<aj> f38222a;

    static {
        ArrayList arrayList = new ArrayList();
        f38222a = arrayList;
        arrayList.add(new am());
        f38222a.add(new ae());
        f38222a.add(new ad());
        f38222a.add(new ai());
        f38222a.add(new al());
        f38222a.add(new ac());
        f38222a.add(new ab());
        f38222a.add(new ah());
    }

    public static final <T> T a(Object obj, Type type) {
        T t10;
        for (aj ajVar : f38222a) {
            if (ajVar.a(an.a(type)) && (t10 = (T) ajVar.a(obj, type)) != null) {
                return t10;
            }
        }
        return null;
    }

    public static final Object a(String str, Type type) {
        if (str == null || str.length() == 0) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.startsWith(Constants.ARRAY_TYPE) && strTrim.endsWith("]")) {
            return a(new y(strTrim), type);
        }
        return (strTrim.startsWith("{") && strTrim.endsWith(z5.g.f141884d)) ? a(new z(strTrim), type) : a((Object) strTrim, type);
    }
}
