package com.igexin.push.core.bean;

import android.os.Build;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.igexin.push.core.CoreConsts;
import com.igexin.push.core.x;
import com.igexin.push.util.n;
import com.taobao.accs.common.Constants;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f63575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f63576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f63577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f63578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f63579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f63580f = "open";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f63581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f63582h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f63583i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f63584j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f63585k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f63586l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f63587m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f63588n;

    public a() {
        if (com.igexin.push.core.d.f63669c != null) {
            this.f63580f += ":" + com.igexin.push.core.d.f63669c;
        }
        this.f63579e = "4.4.3.15";
        this.f63576b = com.igexin.push.core.d.f63688v;
        this.f63577c = com.igexin.push.core.d.f63687u;
        this.f63578d = com.igexin.push.core.d.f63690x;
        this.f63575a = com.igexin.push.core.d.f63689w;
        this.f63582h = "ANDROID";
        this.f63584j = "android" + Build.VERSION.RELEASE;
        this.f63585k = "MDP";
        this.f63581g = com.igexin.push.core.d.f63691y;
        this.f63588n = System.currentTimeMillis();
        this.f63586l = com.igexin.push.core.d.f63692z;
        this.f63587m = n.a();
        if (com.igexin.assist.sdk.a.j(com.igexin.push.core.d.f63671e) && com.igexin.push.config.l.H) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("FCM-");
            String str = this.f63587m;
            sb2.append(str == null ? "" : str);
            this.f63587m = sb2.toString();
        }
    }

    public static String a(a aVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = aVar.f63575a;
        if (str == null) {
            str = "";
        }
        jSONObject.put(Constants.KEY_MODEL, str);
        String str2 = aVar.f63576b;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("sim", str2);
        String str3 = aVar.f63577c;
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put("imei", str3);
        String str4 = aVar.f63578d;
        if (str4 == null) {
            str4 = "";
        }
        jSONObject.put("mac", str4);
        String str5 = aVar.f63579e;
        if (str5 == null) {
            str5 = "";
        }
        jSONObject.put("version", str5);
        String str6 = aVar.f63580f;
        if (str6 == null) {
            str6 = "";
        }
        jSONObject.put("channelid", str6);
        jSONObject.put("type", "ANDROID");
        String str7 = aVar.f63585k;
        if (str7 == null) {
            str7 = "";
        }
        jSONObject.put(com.tencent.connect.common.Constants.JumpUrlConstants.SRC_TYPE_APP, str7);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ANDROID-");
        String str8 = aVar.f63581g;
        if (str8 == null) {
            str8 = "";
        }
        sb2.append(str8);
        jSONObject.put("deviceid", sb2.toString());
        String str9 = aVar.f63586l;
        if (str9 == null) {
            str9 = "";
        }
        jSONObject.put(RemoteMessageConst.DEVICE_TOKEN, str9);
        String str10 = aVar.f63587m;
        if (str10 == null) {
            str10 = "";
        }
        jSONObject.put("brand", str10);
        String str11 = aVar.f63584j;
        if (str11 == null) {
            str11 = "";
        }
        jSONObject.put("system_version", str11);
        String str12 = aVar.f63583i;
        if (str12 == null) {
            str12 = "";
        }
        jSONObject.put("cell", str12);
        jSONObject.put(CommonNetImpl.AID, "");
        jSONObject.put("adid", "");
        String name = x.a().b(com.igexin.push.core.d.f63671e).getName();
        if (!CoreConsts.f63466p.equals(name)) {
            jSONObject.put("us", name);
        }
        jSONObject.put("ua", x.a().d(com.igexin.push.core.d.f63671e));
        String str13 = com.igexin.push.core.d.av;
        jSONObject.put("oaid", str13 != null ? str13 : "");
        jSONObject.put("notification_enabled", com.igexin.push.util.a.a(com.igexin.push.core.d.f63671e) ? 1 : 0);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("action", "addphoneinfo");
        jSONObject2.put("id", String.valueOf(aVar.f63588n));
        jSONObject2.put("info", jSONObject);
        return jSONObject2.toString();
    }
}
