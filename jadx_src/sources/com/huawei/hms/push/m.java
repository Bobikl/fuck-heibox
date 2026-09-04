package com.huawei.hms.push;

import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.log.HMSLog;
import com.max.xiaoheihe.module.mall.MallPurchaseDetailDialogFragment;
import com.tencent.connect.common.Constants;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PushSelfShowMessage.java */
/* JADX INFO: loaded from: classes7.dex */
public class m {
    private int B;
    private String D;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f61255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f61256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f61257d;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f61265l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f61266m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f61267n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f61268o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f61269p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f61271r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f61272s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f61279z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f61254a = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f61258e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f61259f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f61260g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f61261h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f61262i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f61263j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f61264k = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f61270q = "";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f61273t = i.STYLE_DEFAULT.ordinal();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f61274u = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f61275v = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f61276w = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f61277x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f61278y = 0;
    private String A = "";
    private String C = "";
    private String E = "";
    private String F = "";

    public m(byte[] bArr, byte[] bArr2) {
        Charset charset = k.f61252a;
        this.f61271r = new String(bArr, charset);
        this.f61272s = new String(bArr2, charset);
    }

    private JSONObject a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(RemoteMessageConst.MessageBody.MSG_CONTENT, jSONObject);
        jSONObject2.put(MallPurchaseDetailDialogFragment.f89681y1, this.f61254a);
        jSONObject2.put("tag", this.A);
        jSONObject2.put(RemoteMessageConst.Notification.AUTO_CANCEL, this.f61277x);
        jSONObject2.put("visibility", this.f61278y);
        jSONObject2.put("when", this.f61279z);
        return jSONObject2;
    }

    private JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("dispPkgName", this.f61259f);
        jSONObject3.put(RemoteMessageConst.MSGID, this.f61258e);
        jSONObject3.put("ap", this.f61257d);
        jSONObject3.put(RemoteMessageConst.Notification.NOTIFY_ID, this.B);
        jSONObject3.put(RemoteMessageConst.MessageBody.PS_CONTENT, jSONObject);
        jSONObject3.put(RemoteMessageConst.MessageBody.NOTIFY_DETAIL, jSONObject2);
        jSONObject3.put(RemoteMessageConst.Notification.TICKER, this.D);
        jSONObject3.put("data", this.C);
        return jSONObject3;
    }

    private JSONObject b(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(com.taobao.agoo.a.a.b.JSON_CMD, this.f61260g);
        jSONObject2.put("content", this.f61261h);
        jSONObject2.put(RemoteMessageConst.Notification.NOTIFY_ICON, this.f61262i);
        jSONObject2.put(RemoteMessageConst.Notification.NOTIFY_TITLE, this.f61263j);
        jSONObject2.put("notifySummary", this.f61264k);
        jSONObject2.put(RemoteMessageConst.MessageBody.PARAM, jSONObject);
        return jSONObject2;
    }

    private void c(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("ap")) {
            String string = jSONObject.getString("ap");
            StringBuilder sb2 = new StringBuilder();
            if (TextUtils.isEmpty(string) || string.length() >= 48) {
                this.f61257d = string.substring(0, 48);
                return;
            }
            int length = 48 - string.length();
            for (int i10 = 0; i10 < length; i10++) {
                sb2.append("0");
            }
            sb2.append(string);
            this.f61257d = sb2.toString();
        }
    }

    private boolean d(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return false;
        }
        if (jSONObject.has(RemoteMessageConst.Notification.CLICK_ACTION)) {
            this.f61266m = jSONObject.getString(RemoteMessageConst.Notification.CLICK_ACTION);
        }
        if (jSONObject.has(RemoteMessageConst.Notification.INTENT_URI)) {
            this.f61256c = jSONObject.getString(RemoteMessageConst.Notification.INTENT_URI);
        }
        if (jSONObject.has("appPackageName")) {
            this.f61265l = jSONObject.getString("appPackageName");
            return true;
        }
        HMSLog.d("PushSelfShowLog", "appPackageName is null");
        return false;
    }

    private boolean e(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has(RemoteMessageConst.MSGID)) {
            HMSLog.i("PushSelfShowLog", "msgId == null");
            return false;
        }
        Object obj = jSONObject.get(RemoteMessageConst.MSGID);
        if (obj instanceof String) {
            this.f61258e = (String) obj;
            return true;
        }
        if (!(obj instanceof Integer)) {
            return true;
        }
        this.f61258e = String.valueOf(((Integer) obj).intValue());
        return true;
    }

    private boolean f(JSONObject jSONObject) {
        HMSLog.d("PushSelfShowLog", "enter parseNotifyParam");
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(RemoteMessageConst.MessageBody.NOTIFY_DETAIL);
            if (jSONObject2.has("style")) {
                this.f61273t = jSONObject2.getInt("style");
            }
            this.f61274u = jSONObject2.optString("bigTitle");
            this.f61275v = jSONObject2.optString("bigContent");
            this.E = jSONObject2.optString("icon");
            return true;
        } catch (JSONException e10) {
            HMSLog.i("PushSelfShowLog", e10.toString());
            return false;
        }
    }

    private void g(JSONObject jSONObject) {
        this.f61254a = jSONObject.optString(MallPurchaseDetailDialogFragment.f89681y1);
        HMSLog.d("PushSelfShowLog", "NOTIFY_GROUP:" + this.f61254a);
        this.f61277x = jSONObject.optInt(RemoteMessageConst.Notification.AUTO_CANCEL, 1);
        HMSLog.d("PushSelfShowLog", "autoCancel: " + this.f61277x);
        this.f61278y = jSONObject.optInt("visibility", 0);
        this.f61279z = jSONObject.optString("when");
        this.A = jSONObject.optString("tag");
    }

    private boolean h(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(RemoteMessageConst.MessageBody.PARAM);
            if (jSONObject2.has("autoClear")) {
                this.f61255b = jSONObject2.getInt("autoClear");
            } else {
                this.f61255b = 0;
            }
            if (!Constants.JumpUrlConstants.SRC_TYPE_APP.equals(this.f61260g) && !"cosa".equals(this.f61260g)) {
                if ("url".equals(this.f61260g)) {
                    k(jSONObject2);
                    return true;
                }
                if (!"rp".equals(this.f61260g)) {
                    return true;
                }
                j(jSONObject2);
                return true;
            }
            d(jSONObject2);
            return true;
        } catch (Exception e10) {
            HMSLog.e("PushSelfShowLog", "ParseParam error ", e10);
            return false;
        }
    }

    private boolean i(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has(RemoteMessageConst.MessageBody.PS_CONTENT)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(RemoteMessageConst.MessageBody.PS_CONTENT);
            this.f61260g = jSONObject2.getString(com.taobao.agoo.a.a.b.JSON_CMD);
            this.f61261h = jSONObject2.optString("content");
            this.f61262i = jSONObject2.optString(RemoteMessageConst.Notification.NOTIFY_ICON);
            this.f61263j = jSONObject2.optString(RemoteMessageConst.Notification.NOTIFY_TITLE);
            this.f61264k = jSONObject2.optString("notifySummary");
            this.D = jSONObject2.optString(RemoteMessageConst.Notification.TICKER);
            if ((!jSONObject2.has(RemoteMessageConst.MessageBody.NOTIFY_DETAIL) || f(jSONObject2)) && jSONObject2.has(RemoteMessageConst.MessageBody.PARAM)) {
                return h(jSONObject2);
            }
        }
        return false;
    }

    private boolean j(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return false;
        }
        if (jSONObject.has("appPackageName")) {
            this.f61265l = jSONObject.getString("appPackageName");
        }
        if (!jSONObject.has("rpt") || !jSONObject.has("rpl")) {
            HMSLog.d("PushSelfShowLog", "rpl or rpt is null");
            return false;
        }
        this.f61268o = jSONObject.getString("rpl");
        this.f61269p = jSONObject.getString("rpt");
        if (!jSONObject.has("rpct")) {
            return true;
        }
        this.f61270q = jSONObject.getString("rpct");
        return true;
    }

    private boolean k(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return false;
        }
        if (!jSONObject.has("url")) {
            HMSLog.d("PushSelfShowLog", "url is null");
            return false;
        }
        this.f61267n = jSONObject.getString("url");
        if (jSONObject.has("appPackageName")) {
            this.f61265l = jSONObject.getString("appPackageName");
        }
        if (!jSONObject.has("rpt") || !jSONObject.has("rpl")) {
            return true;
        }
        this.f61268o = jSONObject.getString("rpl");
        this.f61269p = jSONObject.getString("rpt");
        if (!jSONObject.has("rpct")) {
            return true;
        }
        this.f61270q = jSONObject.getString("rpct");
        return true;
    }

    private JSONObject r() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("style", this.f61273t);
        jSONObject.put("bigTitle", this.f61274u);
        jSONObject.put("bigContent", this.f61275v);
        jSONObject.put("bigPic", this.f61276w);
        return jSONObject;
    }

    private JSONObject v() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("autoClear", this.f61255b);
        jSONObject.put("url", this.f61267n);
        jSONObject.put("rpl", this.f61268o);
        jSONObject.put("rpt", this.f61269p);
        jSONObject.put("rpct", this.f61270q);
        jSONObject.put("appPackageName", this.f61265l);
        jSONObject.put(RemoteMessageConst.Notification.CLICK_ACTION, this.f61266m);
        jSONObject.put(RemoteMessageConst.Notification.INTENT_URI, this.f61256c);
        return jSONObject;
    }

    public String a() {
        return this.f61266m;
    }

    public void a(int i10) {
        this.B = i10;
    }

    public String b() {
        return this.F;
    }

    public String c() {
        return this.f61257d;
    }

    public String d() {
        return this.f61265l;
    }

    public int e() {
        return this.f61277x;
    }

    public int f() {
        return this.f61255b;
    }

    public String g() {
        return this.f61275v;
    }

    public String h() {
        return this.f61274u;
    }

    public String i() {
        return this.f61260g;
    }

    public String j() {
        return this.f61261h;
    }

    public String k() {
        return this.f61259f;
    }

    public String l() {
        return this.f61254a;
    }

    public String m() {
        return this.E;
    }

    public String n() {
        return this.f61256c;
    }

    public byte[] o() {
        try {
            return a(a(b(v()), r())).toString().getBytes(k.f61252a);
        } catch (JSONException e10) {
            HMSLog.e("PushSelfShowLog", "getMsgData failed JSONException:", e10);
            return new byte[0];
        }
    }

    public String p() {
        HMSLog.d("PushSelfShowLog", "msgId =" + this.f61258e);
        return this.f61258e;
    }

    public String q() {
        return this.A;
    }

    public int s() {
        return this.B;
    }

    public String t() {
        return this.f61264k;
    }

    public String u() {
        return this.f61263j;
    }

    public int w() {
        return this.f61273t;
    }

    public String x() {
        return this.D;
    }

    public byte[] y() {
        return this.f61272s.getBytes(k.f61252a);
    }

    public boolean z() {
        try {
            if (TextUtils.isEmpty(this.f61271r)) {
                HMSLog.d("PushSelfShowLog", "msg is null");
                return false;
            }
            JSONObject jSONObject = new JSONObject(this.f61271r);
            g(jSONObject);
            JSONObject jSONObject2 = jSONObject.getJSONObject(RemoteMessageConst.MessageBody.MSG_CONTENT);
            if (!e(jSONObject2)) {
                return false;
            }
            this.f61259f = jSONObject2.optString("dispPkgName");
            c(jSONObject2);
            this.B = jSONObject2.optInt(RemoteMessageConst.Notification.NOTIFY_ID, -1);
            this.C = jSONObject2.optString("data");
            this.F = jSONObject2.optString(RemoteMessageConst.ANALYTIC_INFO);
            return i(jSONObject2);
        } catch (JSONException unused) {
            HMSLog.d("PushSelfShowLog", "parse message exception.");
            return false;
        } catch (Exception e10) {
            HMSLog.d("PushSelfShowLog", e10.toString());
            return false;
        }
    }
}
