package com.tencent.qimei.i;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: BaseParser.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a<T> implements c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.tencent.qimei.g.a<?>[] f101257a;

    public a(com.tencent.qimei.g.a<?>... aVarArr) {
        this.f101257a = aVarArr;
    }

    public String a(String str, com.tencent.qimei.g.a<?>... aVarArr) {
        if (str != null && !str.isEmpty() && aVarArr.length >= 1) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                for (int i10 = 0; i10 < aVarArr.length && jSONObject != null; i10++) {
                    com.tencent.qimei.g.a<?> aVar = aVarArr[i10];
                    if (aVar == aVarArr[aVarArr.length - 1]) {
                        str = jSONObject.optString(aVar.b());
                        return str;
                    }
                    jSONObject = jSONObject.optJSONObject(aVar.b());
                }
                return "";
            } catch (JSONException e10) {
                com.tencent.qimei.n.a.b("error json: %s", str);
                e10.printStackTrace();
            }
        }
        return "";
    }

    public com.tencent.qimei.g.a<?>[] a(com.tencent.qimei.g.a<?> aVar) {
        com.tencent.qimei.g.a<?>[] aVarArr = this.f101257a;
        int length = aVarArr.length + 1;
        com.tencent.qimei.g.a<?>[] aVarArr2 = new com.tencent.qimei.g.a[length];
        System.arraycopy(aVarArr, 0, aVarArr2, 0, aVarArr.length);
        aVarArr2[length - 1] = aVar;
        return aVarArr2;
    }
}
