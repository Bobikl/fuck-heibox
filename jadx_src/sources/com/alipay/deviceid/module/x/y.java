package com.alipay.deviceid.module.x;

import com.alipay.deviceid.module.rpc.json.JSONException;
import com.meituan.robust.Constants;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: JSONArray.java */
/* JADX INFO: loaded from: classes6.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f38380a;

    public y() {
        this.f38380a = new ArrayList();
    }

    public y(aa aaVar) throws JSONException {
        char c10;
        char c11;
        this();
        char c12 = aaVar.c();
        if (c12 == '[') {
            c10 = ']';
        } else {
            if (c12 != '(') {
                throw aaVar.a("A JSONArray text must start with '['");
            }
            c10 = ')';
        }
        if (aaVar.c() == ']') {
            return;
        }
        aaVar.a();
        while (true) {
            if (aaVar.c() == ',') {
                aaVar.a();
                this.f38380a.add(null);
            } else {
                aaVar.a();
                this.f38380a.add(aaVar.d());
            }
            c11 = aaVar.c();
            if (c11 != ')') {
                if (c11 != ',' && c11 != ';') {
                    if (c11 == ']') {
                        break;
                    } else {
                        throw aaVar.a("Expected a ',' or ']'");
                    }
                } else if (aaVar.c() == ']') {
                    return;
                } else {
                    aaVar.a();
                }
            } else {
                break;
            }
        }
        if (c10 == c11) {
            return;
        }
        throw aaVar.a("Expected a '" + new Character(c10) + "'");
    }

    public y(Object obj) throws JSONException {
        this();
        if (!obj.getClass().isArray()) {
            throw new JSONException("JSONArray initial value should be a string or collection or array.");
        }
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f38380a.add(Array.get(obj, i10));
        }
    }

    public y(String str) {
        this(new aa(str));
    }

    public y(Collection collection) {
        this.f38380a = collection == null ? new ArrayList() : new ArrayList(collection);
    }

    private String a(String str) {
        int size = this.f38380a.size();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                stringBuffer.append(str);
            }
            stringBuffer.append(z.a(this.f38380a.get(i10)));
        }
        return stringBuffer.toString();
    }

    public final Object a(int i10) throws JSONException {
        Object obj = (i10 < 0 || i10 >= this.f38380a.size()) ? null : this.f38380a.get(i10);
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
