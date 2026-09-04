package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.e.f;
import com.taobao.accs.common.Constants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    public static Map<String, String> a(Context context) {
        o4.c cVarF = o4.c.f();
        HashMap map = new HashMap();
        f fVarA = com.alipay.apmobilesecuritysdk.e.e.a(context);
        String strB = cVarF.b(context);
        String strE = cVarF.e(context);
        String strB2 = o4.c.B(context);
        if (fVarA != null) {
            if (e6.a.c(strB)) {
                strB = fVarA.a();
            }
            if (e6.a.c(strE)) {
                strE = fVarA.b();
            }
            if (e6.a.c(strB2)) {
                strB2 = fVarA.e();
            }
        }
        f fVar = new f(strB, strE, "", "", strB2);
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("imei", fVar.a());
                jSONObject.put(Constants.KEY_IMSI, fVar.b());
                jSONObject.put("mac", fVar.c());
                jSONObject.put("bluetoothmac", fVar.d());
                jSONObject.put("gsi", fVar.e());
                String string = jSONObject.toString();
                com.alipay.apmobilesecuritysdk.f.a.a("device_feature_file_name", "device_feature_file_key", string);
                com.alipay.apmobilesecuritysdk.f.a.a(context, "device_feature_prefs_name", "device_feature_prefs_key", string);
            } catch (Exception e10) {
                com.alipay.apmobilesecuritysdk.c.a.a(e10);
            }
        }
        map.put("AD1", strB);
        map.put("AD2", strE);
        map.put("AD3", o4.c.r(context));
        map.put("AD5", o4.c.v(context));
        map.put("AD6", o4.c.x(context));
        map.put("AD7", o4.c.z(context));
        map.put("AD9", cVarF.h(context));
        map.put("AD10", strB2);
        map.put("AD11", o4.c.k());
        map.put("AD12", cVarF.a());
        map.put("AD13", o4.c.m());
        map.put("AD14", o4.c.q());
        map.put("AD15", o4.c.s());
        map.put("AD16", o4.c.u());
        map.put("AD17", "");
        map.put("AD19", o4.c.D(context));
        map.put("AD20", o4.c.w());
        map.put("AD22", "");
        map.put("AD23", o4.c.F(context));
        map.put("AD24", e6.a.k(o4.c.t(context)));
        map.put("AD26", o4.c.p(context));
        map.put("AD27", o4.c.G());
        map.put("AD28", o4.c.K());
        map.put("AD29", o4.c.N());
        map.put("AD30", o4.c.I());
        map.put("AD31", o4.c.M());
        map.put("AD32", o4.c.C());
        map.put("AD33", o4.c.E());
        map.put("AD34", o4.c.H(context));
        map.put("AD35", o4.c.J(context));
        map.put("AD36", cVarF.j(context));
        map.put("AD37", o4.c.A());
        map.put("AD38", o4.c.y());
        map.put("AD39", o4.c.l(context));
        map.put("AD40", o4.c.n(context));
        map.put("AD41", o4.c.g());
        map.put("AD42", o4.c.i());
        return map;
    }
}
