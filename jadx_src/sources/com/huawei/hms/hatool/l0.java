package com.huawei.hms.hatool;

import android.text.TextUtils;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f60983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f60984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f60985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<b1> f60986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f60987e;

    public l0(String str, String str2, String str3, List<b1> list, String str4) {
        this.f60983a = str;
        this.f60984b = str2;
        this.f60985c = str3;
        this.f60986d = list;
        this.f60987e = str4;
    }

    private String a(String str, String str2) {
        String str3;
        String strF = a1.f(str, str2);
        if (TextUtils.isEmpty(strF)) {
            v.a("hmsSdk", "No report address,TAG : %s,TYPE: %s ", str, str2);
            return "";
        }
        if ("oper".equals(str2)) {
            str3 = "{url}/common/hmshioperqrt";
        } else if ("maint".equals(str2)) {
            str3 = "{url}/common/hmshimaintqrt";
        } else {
            if (!"diffprivacy".equals(str2)) {
                return "";
            }
            str3 = "{url}/common/common2";
        }
        return str3.replace("{url}", strF);
    }

    private byte[] a(h1 h1Var) {
        String str;
        try {
            JSONObject jSONObjectA = h1Var.a();
            if (jSONObjectA != null) {
                return k1.a(jSONObjectA.toString().getBytes("UTF-8"));
            }
            v.e("hmsSdk", "uploadEvents is null");
            return new byte[0];
        } catch (UnsupportedEncodingException unused) {
            str = "sendData(): getBytes - Unsupported coding format!!";
            v.e("hmsSdk", str);
            return new byte[0];
        } catch (JSONException unused2) {
            str = "uploadEvents to json error";
            v.e("hmsSdk", str);
            return new byte[0];
        }
    }

    private void b() {
        if (c0.a(q0.i(), "backup_event", CommonNetImpl.MAX_SIZE_IN_KB)) {
            v.d("hmsSdk", "backup file reach max limited size, discard new event ");
            return;
        }
        JSONArray jSONArrayC = c();
        String strA = n1.a(this.f60983a, this.f60984b, this.f60987e);
        v.c("hmsSdk", "Update data cached into backup,spKey: " + strA);
        d.b(q0.i(), "backup_event", strA, jSONArrayC.toString());
    }

    private JSONArray c() {
        JSONArray jSONArray = new JSONArray();
        Iterator<b1> it = this.f60986d.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(it.next().d());
            } catch (JSONException unused) {
                v.c("hmsSdk", "handleEvents: json error,Abandon this data");
            }
        }
        return jSONArray;
    }

    private h1 d() {
        return k.a(this.f60986d, this.f60983a, this.f60984b, this.f60987e, this.f60985c);
    }

    public void a() {
        g d1Var;
        b0 b0VarC;
        String str;
        String strA = a(this.f60983a, this.f60984b);
        if (!TextUtils.isEmpty(strA) || "preins".equals(this.f60984b)) {
            if (!"_hms_config_tag".equals(this.f60983a) && !"_openness_config_tag".equals(this.f60983a)) {
                b();
            }
            h1 h1VarD = d();
            if (h1VarD != null) {
                byte[] bArrA = a(h1VarD);
                if (bArrA.length == 0) {
                    str = "request body is empty";
                } else {
                    d1Var = new f(bArrA, strA, this.f60983a, this.f60984b, this.f60987e, this.f60986d);
                    b0VarC = b0.b();
                }
            } else {
                d1Var = new d1(this.f60986d, this.f60983a, this.f60987e, this.f60984b);
                b0VarC = b0.c();
            }
            b0VarC.a(d1Var);
            return;
        }
        str = "collectUrl is empty";
        v.e("hmsSdk", str);
    }
}
