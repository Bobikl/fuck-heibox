package com.tencent.qmsp.sdk.b;

import android.text.TextUtils;
import com.tencent.qmsp.sdk.f.h;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static g f101729c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f101730a = "Qp.netImp";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f f101731b = null;

    public class a implements f {
        a() {
        }

        @Override // com.tencent.qmsp.sdk.b.f
        public void a(int i10, String str, int i11, JSONObject jSONObject, e eVar) {
            try {
                JSONObject jSONObjectB = g.this.b(8, jSONObject);
                if (jSONObjectB == null) {
                    eVar.a(163, null);
                    return;
                }
                com.tencent.qmsp.sdk.b.a.d dVarA = com.tencent.qmsp.sdk.b.a.a(i10, str, i11, jSONObjectB);
                if (dVarA.f101720b != 0) {
                    eVar.a(162, dVarA.f101719a);
                } else {
                    JSONObject jSONObject2 = dVarA.f101719a;
                    eVar.a(161, (jSONObject2 == null || !(jSONObject2 instanceof JSONObject)) ? null : g.this.b(9, jSONObject2));
                }
            } catch (Exception e10) {
                com.tencent.qmsp.sdk.f.g.b(g.this.f101730a, 0, "send fail！");
                eVar.a(162, null);
                e10.printStackTrace();
            }
        }
    }

    private g() {
    }

    private JSONObject a(int i10, JSONObject jSONObject) {
        String strA;
        if ((jSONObject instanceof JSONObject) && jSONObject != null) {
            try {
                if (i10 != 8) {
                    if (i10 == 9 && (strA = com.tencent.qmsp.sdk.c.f.a(i10, 0, 0, 0, a(jSONObject), "")) != null && !TextUtils.isEmpty(strA)) {
                        return new JSONObject(strA);
                    }
                    return null;
                }
                String strA2 = com.tencent.qmsp.sdk.c.f.a(i10, 0, 0, 0, jSONObject.toString(), "");
                if (strA2 != null && !TextUtils.isEmpty(strA2)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(com.tencent.qmsp.sdk.a.e.a(17), strA2);
                    return jSONObject2;
                }
                return null;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    public static g b() {
        if (f101729c == null) {
            synchronized (g.class) {
                if (f101729c == null) {
                    f101729c = new g();
                }
            }
        }
        return f101729c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject b(int i10, JSONObject jSONObject) {
        if (!(jSONObject instanceof JSONObject) || jSONObject == null) {
            return null;
        }
        return a(i10, jSONObject);
    }

    public String a(JSONObject jSONObject) {
        try {
            return jSONObject.optString(com.tencent.qmsp.sdk.a.e.a(17));
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public void a() {
        this.f101731b = new a();
    }

    public void a(int i10, String str, int i11, JSONObject jSONObject, e eVar) {
        f fVar;
        if (!(jSONObject instanceof JSONObject) || jSONObject == null || eVar == null || (fVar = this.f101731b) == null) {
            com.tencent.qmsp.sdk.f.g.d(this.f101730a, 0, h.a(h.f101942a));
        } else {
            fVar.a(i10, str, i11, jSONObject, eVar);
        }
    }

    public void a(f fVar) {
        if (fVar != null) {
            this.f101731b = fVar;
        } else {
            com.tencent.qmsp.sdk.f.g.d(this.f101730a, 0, h.a(h.f101942a));
        }
    }
}
