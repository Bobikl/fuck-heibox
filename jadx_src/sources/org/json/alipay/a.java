package org.json.alipay;

import com.meituan.robust.Constants;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f137818a;

    public a() {
        this.f137818a = new ArrayList();
    }

    public a(Object obj) throws JSONException {
        this();
        if (!obj.getClass().isArray()) {
            throw new JSONException("JSONArray initial value should be a string or collection or array.");
        }
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f137818a.add(Array.get(obj, i10));
        }
    }

    public a(String str) {
        this(new c(str));
    }

    public a(Collection collection) {
        this.f137818a = collection == null ? new ArrayList() : new ArrayList(collection);
    }

    public a(c cVar) throws JSONException {
        char c10;
        ArrayList arrayList;
        Object objD;
        this();
        char c11 = cVar.c();
        if (c11 == '[') {
            c10 = ']';
        } else {
            if (c11 != '(') {
                throw cVar.a("A JSONArray text must start with '['");
            }
            c10 = ')';
        }
        if (cVar.c() == ']') {
            return;
        }
        do {
            cVar.a();
            char c12 = cVar.c();
            cVar.a();
            if (c12 == ',') {
                arrayList = this.f137818a;
                objD = null;
            } else {
                arrayList = this.f137818a;
                objD = cVar.d();
            }
            arrayList.add(objD);
            char c13 = cVar.c();
            if (c13 != ')') {
                if (c13 != ',' && c13 != ';') {
                    if (c13 != ']') {
                        throw cVar.a("Expected a ',' or ']'");
                    }
                }
            }
            if (c10 == c13) {
                return;
            }
            throw cVar.a("Expected a '" + new Character(c10) + "'");
        } while (cVar.c() != ']');
    }

    private String a(String str) {
        int size = this.f137818a.size();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                stringBuffer.append(str);
            }
            stringBuffer.append(b.a(this.f137818a.get(i10)));
        }
        return stringBuffer.toString();
    }

    public final int a() {
        return this.f137818a.size();
    }

    public final Object a(int i10) throws JSONException {
        Object obj = (i10 < 0 || i10 >= this.f137818a.size()) ? null : this.f137818a.get(i10);
        if (obj != null) {
            return obj;
        }
        throw new JSONException("JSONArray[" + i10 + "] not found.");
    }

    public String toString() {
        try {
            return Constants.ARRAY_TYPE + a(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP) + ']';
        } catch (Exception unused) {
            return null;
        }
    }
}
