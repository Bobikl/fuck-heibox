package cn.fly.verify;

import android.net.Network;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.app.o0;
import com.taobao.accs.common.Constants;
import com.tencent.qcloud.core.http.HttpConstants;
import com.umeng.socialize.common.SocializeConstants;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;
import org.android.agoo.common.AgooConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f37018a = "AID";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f37019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f37020c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f37025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Network f37026i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f37031n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f37021d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f37022e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f37023f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f37024g = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f37027j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f37028k = new byte[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private byte[] f37029l = new byte[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f37030m = "";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private HashMap<String, String> f37032o = new HashMap<>();

    public x(String str, String str2) {
        this.f37019b = "";
        this.f37020c = "";
        this.f37025h = "";
        this.f37025h = ab.b();
        this.f37019b = str;
        this.f37020c = str2;
        this.f37032o.put("CMCC", "1");
        this.f37032o.put("CUCC", "2");
        this.f37032o.put("CTCC", "3");
    }

    private JSONObject r() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appid", this.f37019b);
            jSONObject.put("traceId", this.f37025h);
            jSONObject.put("appName", al.i());
            jSONObject.put("appVersion", fz.d.c() + "&" + fz.d.f());
            jSONObject.put("sdkVersion", this.f37023f);
            jSONObject.put("clientType", "android");
            jSONObject.put("timeOut", "8000");
            jSONObject.put("requestTime", "");
            jSONObject.put("responseTime", "");
            jSONObject.put("elapsedTime", System.currentTimeMillis() + "");
            jSONObject.put("requestType", "eventTracking5");
            jSONObject.put("interfaceType", "");
            jSONObject.put("interfaceCode", (Object) null);
            jSONObject.put("interfaceElasped", (Object) null);
            jSONObject.put("loginType", (Object) null);
            jSONObject.put("exceptionStackTrace", (Object) null);
            jSONObject.put("operatorType", this.f37032o.get(as.b()));
            jSONObject.put("networkType", t());
            jSONObject.put("brand", fz.d.l());
            jSONObject.put("reqDevice", fz.d.j());
            jSONObject.put("reqSystem", "android" + Build.VERSION.RELEASE);
            jSONObject.put("simCardNum", "");
            jSONObject.put("imsiState", "0");
            jSONObject.put(com.taobao.agoo.a.a.b.JSON_ERRORCODE, (Object) null);
            jSONObject.put("AID", (Object) null);
            jSONObject.put("sysOperType", (Object) null);
            jSONObject.put("scripType", (Object) null);
            jSONObject.put(o0.I0, s());
            jSONObject.put("exceptionStackTrace", (Object) null);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private JSONObject s() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("authPageOut", "1");
            jSONObject.put("authPageIn", "1");
            jSONObject.put("authClickSuccess", "1");
            jSONObject.put("timeOnAuthPage", String.valueOf(new Random().nextInt(5000) + 800));
            jSONObject.put("authClickFailed", "0");
            jSONObject.put("authPrivacyState", "1");
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private int t() {
        String strJ = al.j();
        if (!TextUtils.isEmpty(strJ) && !"none".equalsIgnoreCase(strJ)) {
            boolean zB = as.b(ax.g());
            if ("wifi".equalsIgnoreCase(strJ) && zB) {
                return 3;
            }
            if ("wifi".equalsIgnoreCase(strJ) && !zB) {
                return 2;
            }
            if (zB) {
                return 1;
            }
        }
        return 0;
    }

    private String u() {
        String strA = ah.a(f37018a, null);
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String str = "%" + ab.a();
        ah.b(f37018a, str);
        return str;
    }

    public String a() {
        return this.f37025h;
    }

    public void a(Network network) {
        this.f37026i = network;
    }

    public void a(String str) {
        this.f37025h = str;
    }

    public String b() {
        return this.f37027j;
    }

    public void b(String str) {
        this.f37027j = str;
    }

    public Network c() {
        return this.f37026i;
    }

    public void c(String str) {
        this.f37024g = str;
    }

    public String d() {
        return this.f37024g;
    }

    public void d(String str) {
        this.f37021d = str;
    }

    public String e() {
        JSONObject jSONObject;
        String str;
        String str2;
        JSONObject jSONObject2 = new JSONObject();
        try {
            String str3 = this.f37032o.get(as.b());
            int iT = t();
            String strEncode = URLEncoder.encode(fz.d.l());
            String strEncode2 = URLEncoder.encode(fz.d.j());
            String strEncode3 = URLEncoder.encode("android" + Build.VERSION.RELEASE);
            String str4 = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date(System.currentTimeMillis()));
            String strC = fz.d.c();
            String upperCase = al.a().toUpperCase();
            String[] strArrA = aa.a(true);
            if (strArrA == null || strArrA.length <= 0) {
                str = "";
                str2 = str;
            } else {
                str2 = strArrA[0];
                str = strArrA[1];
            }
            try {
                String strA = ab.a();
                String strB = ga.b(this.f37023f + this.f37019b + "" + str3 + iT + strEncode + strEncode2 + strEncode3 + "0" + strA + str4 + this.f37020c + "" + strC + upperCase + str2 + str + "001" + u() + this.f37021d + "200authz" + this.f37022e);
                String str5 = str;
                String str6 = str2;
                jSONObject = jSONObject2;
                try {
                    jSONObject.put("ver", "1.0");
                    jSONObject.put("sdkver", this.f37023f);
                    jSONObject.put("appid", this.f37019b);
                    jSONObject.put(Constants.KEY_IMSI, "");
                    jSONObject.put("operatortype", str3);
                    jSONObject.put("networktype", iT);
                    jSONObject.put("mobilebrand", strEncode);
                    jSONObject.put("mobilemodel", strEncode2);
                    jSONObject.put("mobilesystem", strEncode3);
                    jSONObject.put("clienttype", "0");
                    jSONObject.put("interfacever", SocializeConstants.PROTOCOL_VERSON);
                    jSONObject.put("expandparams", "");
                    jSONObject.put("msgid", strA);
                    jSONObject.put("timestamp", str4);
                    jSONObject.put("subimsi", "");
                    jSONObject.put("sign", strB);
                    jSONObject.put("apppackage", strC);
                    jSONObject.put("appsign", upperCase);
                    jSONObject.put("ipv4_list", str6);
                    jSONObject.put("ipv6_list", str5);
                    jSONObject.put("sdkType", "001");
                    jSONObject.put("tempPDR", u());
                    jSONObject.put("scrip", this.f37021d);
                    jSONObject.put("userCapaid", "200");
                    jSONObject.put("funcType", "authz");
                    jSONObject.put("socketip", this.f37022e);
                } catch (JSONException unused) {
                }
            } catch (JSONException unused2) {
                jSONObject = jSONObject2;
            }
        } catch (JSONException unused3) {
            jSONObject = jSONObject2;
        }
        return jSONObject.toString();
    }

    public void e(String str) {
        this.f37022e = str;
    }

    public String f() {
        String str;
        String str2;
        String str3;
        try {
            String strU = u();
            String str4 = this.f37032o.get(as.b());
            int iT = t();
            JSONObject jSONObject = new JSONObject();
            try {
                this.f37028k = UUID.randomUUID().toString().substring(0, 16).getBytes("utf-8");
            } catch (Exception unused) {
            }
            jSONObject.put(AgooConstants.MESSAGE_ENCRYPTED, y.a().a(this.f37028k));
            byte[] bArrA = w.a();
            this.f37029l = bArrA;
            jSONObject.put("encryptedIV", Base64.encodeToString(bArrA, 0));
            String strEncode = URLEncoder.encode(fz.d.l());
            String strEncode2 = URLEncoder.encode(fz.d.j());
            String strEncode3 = URLEncoder.encode("android" + Build.VERSION.RELEASE);
            String strA = ab.a();
            String str5 = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date(System.currentTimeMillis()));
            String strC = fz.d.c();
            String upperCase = al.a().toUpperCase();
            String[] strArrA = aa.a(true);
            if (strArrA != null) {
                str = "pre";
                if (strArrA.length > 0) {
                    str2 = strArrA[0];
                    str3 = strArrA[1];
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f37023f);
                sb2.append(this.f37019b);
                sb2.append("");
                sb2.append(str4);
                sb2.append(iT);
                sb2.append(strEncode);
                sb2.append(strEncode2);
                sb2.append(strEncode3);
                sb2.append("0");
                sb2.append(strA);
                sb2.append(str5);
                sb2.append(this.f37020c);
                sb2.append("");
                sb2.append(strC);
                sb2.append(upperCase);
                sb2.append(str2);
                sb2.append(str3);
                sb2.append("001");
                sb2.append(strU);
                sb2.append(this.f37021d);
                sb2.append("");
                String str6 = str;
                sb2.append(str6);
                sb2.append(this.f37022e);
                jSONObject.put(Constants.KEY_SEND_REQDATA, w.a(this.f37028k, "1.0&" + this.f37023f + "&" + this.f37019b + "&&" + str4 + "&" + iT + "&" + strEncode + "&" + strEncode2 + "&" + strEncode3 + "&0&" + SocializeConstants.PROTOCOL_VERSON + "&&" + strA + "&" + str5 + "&&" + ga.b(sb2.toString()) + "&" + strC + "&" + upperCase + "&&" + str2 + "&" + str3 + "&001&" + strU + "&" + this.f37021d + "&&" + str6 + "&" + this.f37022e, this.f37029l));
                jSONObject.put("securityreinforce", "");
                return jSONObject.toString();
            }
            str = "pre";
            str2 = "";
            str3 = str2;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f37023f);
            sb3.append(this.f37019b);
            sb3.append("");
            sb3.append(str4);
            sb3.append(iT);
            sb3.append(strEncode);
            sb3.append(strEncode2);
            sb3.append(strEncode3);
            sb3.append("0");
            sb3.append(strA);
            sb3.append(str5);
            sb3.append(this.f37020c);
            sb3.append("");
            sb3.append(strC);
            sb3.append(upperCase);
            sb3.append(str2);
            sb3.append(str3);
            sb3.append("001");
            sb3.append(strU);
            sb3.append(this.f37021d);
            sb3.append("");
            String str7 = str;
            sb3.append(str7);
            sb3.append(this.f37022e);
            jSONObject.put(Constants.KEY_SEND_REQDATA, w.a(this.f37028k, "1.0&" + this.f37023f + "&" + this.f37019b + "&&" + str4 + "&" + iT + "&" + strEncode + "&" + strEncode2 + "&" + strEncode3 + "&0&" + SocializeConstants.PROTOCOL_VERSON + "&&" + strA + "&" + str5 + "&&" + ga.b(sb3.toString()) + "&" + strC + "&" + upperCase + "&&" + str2 + "&" + str3 + "&001&" + strU + "&" + this.f37021d + "&&" + str7 + "&" + this.f37022e, this.f37029l));
            jSONObject.put("securityreinforce", "");
            return jSONObject.toString();
        } catch (Throwable unused2) {
            return null;
        }
    }

    public void f(String str) {
        this.f37023f = str;
    }

    public String g() {
        JSONObject jSONObjectI = i();
        try {
            jSONObjectI.put("data", this.f37030m);
            jSONObjectI.put("funcType", "pre");
        } catch (JSONException unused) {
        }
        return jSONObjectI.toString();
    }

    public void g(String str) {
        this.f37030m = str;
    }

    public String h() {
        JSONObject jSONObjectI = i();
        try {
            jSONObjectI.put("data", this.f37030m);
            jSONObjectI.put("funcType", "authz");
        } catch (JSONException unused) {
        }
        return jSONObjectI.toString();
    }

    public void h(String str) {
        this.f37031n = str;
    }

    public JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ver", "1.0");
            jSONObject.put("userCapaid", "");
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String j() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", "1.0");
            jSONObject.put("apptype", "Android");
            jSONObject.put("phone_ID", u());
            jSONObject.put("certflag", "0");
            jSONObject.put("sdkversion", this.f37023f);
            jSONObject.put("appid", this.f37019b);
            jSONObject.put("expandparams", "");
            jSONObject.put("sign", ga.b("1.0" + this.f37023f + this.f37019b + "iYm0HAnkxQtpvN44"));
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public String k() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            String strA = ab.a();
            String str = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date(System.currentTimeMillis()));
            jSONObject2.put("sign", ga.b(org.apache.tools.ant.taskdefs.optional.ejb.g.a.f134950d + this.f37019b + str + strA + "@Fdiwmxy7CBDDQNUI"));
            jSONObject2.put("msgid", strA);
            jSONObject2.put("systemtime", str);
            jSONObject2.put("appid", this.f37019b);
            jSONObject2.put("version", org.apache.tools.ant.taskdefs.optional.ejb.g.a.f134950d);
            jSONObject.put("header", jSONObject2);
            jSONObject3.put("log", r());
            jSONObject.put("body", jSONObject3);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject.toString();
    }

    public byte[] l() {
        return this.f37028k;
    }

    public byte[] m() {
        return this.f37029l;
    }

    public HashMap<String, String> n() {
        HashMap<String, String> mapP = p();
        mapP.put("defendEOF", "1");
        return mapP;
    }

    public HashMap<String, String> o() {
        HashMap<String, String> mapP = p();
        mapP.put("defendEOF", "0");
        return mapP;
    }

    public HashMap<String, String> p() {
        HashMap<String, String> map = new HashMap<>();
        map.put("sdkVersion", this.f37023f);
        map.put("Content-Type", HttpConstants.ContentType.JSON);
        map.put("CMCC-EncryptType", "STD");
        map.put("traceId", this.f37025h);
        map.put("appid", this.f37019b);
        map.put(com.alipay.zoloz.android.phone.mrpc.core.f.f39665q, com.google.common.net.c.f58866u0);
        map.put("interfaceVersion", SocializeConstants.PROTOCOL_VERSON);
        return map;
    }

    public String q() {
        return this.f37031n;
    }
}
