package com.xiaomi.push;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class bu extends JSONObject implements bs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f106894a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f106895b = 3;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final LinkedHashMap<String, Integer> f221a = new LinkedHashMap<>();

    @Override // com.xiaomi.push.bs
    public int a() {
        int iIntValue = f106894a;
        Iterator<Integer> it = this.f221a.values().iterator();
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return iIntValue + (length() - 1);
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, double d10) {
        if (!TextUtils.isEmpty(str)) {
            this.f221a.put(str, Integer.valueOf(str.length() + String.valueOf(d10).length() + f106895b));
        }
        return super.put(str, d10);
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, int i10) {
        if (!TextUtils.isEmpty(str)) {
            this.f221a.put(str, Integer.valueOf(str.length() + String.valueOf(i10).length() + f106895b));
        }
        return super.put(str, i10);
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, long j10) {
        if (!TextUtils.isEmpty(str)) {
            this.f221a.put(str, Integer.valueOf(str.length() + String.valueOf(j10).length() + f106895b));
        }
        return super.put(str, j10);
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, Object obj) throws JSONException {
        JSONObject jSONObjectPut = super.put(str, obj);
        if (!TextUtils.isEmpty(str) && obj != null) {
            if (obj instanceof bs) {
                this.f221a.put(str, Integer.valueOf(str.length() + ((bs) obj).a() + f106895b));
            } else {
                this.f221a.put(str, Integer.valueOf(str.length() + String.valueOf(obj).getBytes(StandardCharsets.UTF_8).length + f106895b + f106894a));
            }
        }
        return jSONObjectPut;
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, boolean z10) {
        if (!TextUtils.isEmpty(str)) {
            this.f221a.put(str, Integer.valueOf(str.length() + String.valueOf(z10).length() + f106895b));
        }
        return super.put(str, z10);
    }

    @Override // org.json.JSONObject
    public Object remove(String str) {
        this.f221a.remove(str);
        return super.remove(str);
    }
}
