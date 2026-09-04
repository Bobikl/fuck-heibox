package com.alipay.zoloz.jsoncodec.codec;

import com.meituan.robust.Constants;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.json.alipay.zoloz.JSONArray;
import org.json.alipay.zoloz.JSONObject;

/* JADX INFO: compiled from: JSONDeserializer.java */
/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static List<i> f39775a;

    static {
        ArrayList arrayList = new ArrayList();
        f39775a = arrayList;
        arrayList.add(new l());
        f39775a.add(new d());
        f39775a.add(new c());
        f39775a.add(new h());
        f39775a.add(new k());
        f39775a.add(new b());
        f39775a.add(new a());
        f39775a.add(new g());
    }

    public static final Object a(String str, Type type) throws Exception {
        if (str == null || str.length() == 0) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.startsWith(Constants.ARRAY_TYPE) && strTrim.endsWith("]")) {
            return b(new JSONArray(strTrim), type);
        }
        return (strTrim.startsWith("{") && strTrim.endsWith(z5.g.f141884d)) ? b(new JSONObject(strTrim), type) : b(strTrim, type);
    }

    public static final <T> T b(Object obj, Type type) throws Exception {
        T t10;
        for (i iVar : f39775a) {
            if (iVar.a(com.alipay.zoloz.jsoncodec.util.a.a(type)) && (t10 = (T) iVar.b(obj, type)) != null) {
                return t10;
            }
        }
        return null;
    }
}
