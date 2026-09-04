package com.igexin.assist.action;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.igexin.assist.MessageBean;
import com.igexin.assist.sdk.AssistPushConsts;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f63295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f63296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f63297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f63298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f63299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f63300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f63301g;

    d() {
    }

    private void a(Context context) {
        try {
            String str = com.igexin.push.core.d.f63655a;
            this.f63298d = str;
            if (TextUtils.isEmpty(str) && context != null) {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                String strA = com.igexin.push.util.b.a(applicationInfo);
                this.f63298d = strA;
                if (TextUtils.isEmpty(strA)) {
                    this.f63298d = applicationInfo.metaData.getString(AssistPushConsts.GETUI_APPID);
                }
                if (TextUtils.isEmpty(this.f63298d)) {
                    this.f63298d = com.igexin.push.core.b.a.a(context);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public void a(MessageBean messageBean) {
        try {
            Context context = messageBean.getContext();
            String stringMessage = messageBean.getStringMessage();
            if (!TextUtils.isEmpty(stringMessage) && context != null) {
                a(context);
                com.igexin.a.a.c.b.a("PayloadMessageAction|appID = " + this.f63298d, new Object[0]);
                if (TextUtils.isEmpty(this.f63298d)) {
                    return;
                }
                this.f63299e = context.getPackageName();
                this.f63297c = (TextUtils.isEmpty(messageBean.getMessageSource()) ? "" : messageBean.getMessageSource()) + UUID.randomUUID().toString();
                String strA = com.igexin.assist.util.a.a(stringMessage, new StringBuilder(this.f63298d).reverse().toString().getBytes());
                com.igexin.a.a.c.b.a("PayloadMessageAction|payloadStr = " + strA, new Object[0]);
                if (TextUtils.isEmpty(strA)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(strA);
                if (jSONObject.has(AssistPushConsts.MSG_KEY_TASKID)) {
                    this.f63296b = jSONObject.getString(AssistPushConsts.MSG_KEY_TASKID);
                }
                if (jSONObject.has(AssistPushConsts.MSG_KEY_ACTION)) {
                    this.f63300f = jSONObject.getString(AssistPushConsts.MSG_KEY_ACTION);
                }
                if (jSONObject.has(AssistPushConsts.MSG_KEY_CONTENT) && !TextUtils.isEmpty(jSONObject.getString(AssistPushConsts.MSG_KEY_CONTENT))) {
                    this.f63295a = jSONObject.getString(AssistPushConsts.MSG_KEY_CONTENT).getBytes();
                }
                if (jSONObject.has(AssistPushConsts.MSG_KEY_ACTION_CHAINS)) {
                    String string = jSONObject.getString(AssistPushConsts.MSG_KEY_ACTION_CHAINS);
                    this.f63301g = string;
                    if (TextUtils.isEmpty(string)) {
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject(this.f63301g);
                    jSONObject2.put("extra_actionid", "40550");
                    this.f63301g = jSONObject2.toString();
                }
            }
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a("PayloadMessageAction|error = " + th2.toString(), new Object[0]);
        }
    }

    public boolean a(boolean z10) {
        return ((this.f63295a == null && (this.f63301g == null || !z10)) || TextUtils.isEmpty(this.f63296b) || TextUtils.isEmpty(this.f63299e) || TextUtils.isEmpty(this.f63298d) || TextUtils.isEmpty(this.f63300f) || TextUtils.isEmpty(this.f63297c)) ? false : true;
    }

    public byte[] a() {
        return this.f63295a;
    }

    public String b() {
        return this.f63296b;
    }

    public String c() {
        return this.f63297c;
    }

    public String d() {
        return this.f63298d;
    }

    public String e() {
        return this.f63300f;
    }

    public String f() {
        return this.f63299e;
    }

    public String g() {
        return this.f63301g;
    }
}
