package com.umeng.message.proguard;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.MsgConstant;
import com.umeng.message.PushAgent;
import com.umeng.message.api.UPushMessageNotifyApi;
import com.umeng.message.common.UPLog;
import com.umeng.message.common.inter.ITagManager;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    UPushMessageNotifyApi.Callback f105722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final al f105723b = new al();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f105724c;

    static boolean a(Context context, String str, String str2, String str3, String str4) {
        try {
            String messageAppkey = PushAgent.getInstance(context).getMessageAppkey();
            ComponentName componentName = new ComponentName(str3, str4);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("trace_id", str2);
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("appkey", messageAppkey);
            jSONObject2.put("pkg", context.getPackageName());
            jSONObject2.put(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, str);
            jSONObject2.put(ITagManager.SUCCESS, 1);
            jSONArray.put(jSONObject2);
            jSONObject.put("pusor", jSONArray);
            String string = jSONObject.toString();
            String str5 = new String(as.a(new String(new byte[]{100, 85, org.apache.tools.tar.c.Q, 112, 78, 67, 57, 109, 78, 67, 116, 81, 89, 106, 77, org.apache.tools.tar.c.K, org.apache.tools.tar.c.O, 108, 81, org.apache.tools.tar.c.Q, 79, 81, 61, 61})));
            byte[] bArrA = as.a(new String(new byte[]{98, 109, org.apache.tools.tar.c.G, 108, 100, 87, 99, 117, 90, 106, 107, 118, 84, org.apache.tools.tar.c.H, org.apache.tools.tar.c.F, 114, 84, 68, org.apache.tools.tar.c.S, 121, 77, 119, 61, 61}));
            String strA = ax.a(context.getPackageName(), str5, bArrA);
            String strA2 = ax.a(string, str5, bArrA);
            Intent intent = new Intent();
            intent.putExtra("data", strA2);
            intent.putExtra("pkg", strA);
            intent.setPackage(str3);
            intent.setComponent(componentName);
            intent.setFlags(268468224);
            context.startActivity(intent);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean a(boolean z10) throws Exception {
        Application applicationA = x.a();
        String zid = UMUtils.getZid(applicationA);
        if (TextUtils.isEmpty(zid)) {
            UPLog.d("Notify", "zid skip.");
            return false;
        }
        String messageAppkey = PushAgent.getInstance(applicationA).getMessageAppkey();
        if (TextUtils.isEmpty(messageAppkey)) {
            UPLog.d("Notify", "appkey skip.");
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(com.umeng.analytics.pro.ak.f104429al, zid);
        jSONObject.put("ts", System.currentTimeMillis());
        jSONObject.put("appkey", messageAppkey);
        jSONObject.put("dps", z10 ? 1 : 0);
        JSONObject jSONObjectA = null;
        try {
            jSONObjectA = g.a(jSONObject, "https://offmsg.umeng.com/v2/offmsg/switch", messageAppkey, false);
        } catch (Exception e10) {
            UPLog.d("Notify", "uploadEnableState error:", e10.getMessage());
        }
        return jSONObjectA != null;
    }

    public final void a() {
        if (this.f105723b.e()) {
            b.b(new Runnable() { // from class: com.umeng.message.proguard.ak.1
                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    boolean zA = ak.this.f105723b.a();
                    boolean zA2 = false;
                    try {
                        if (d.h(x.a())) {
                            zA2 = ak.a(zA);
                        }
                    } catch (Throwable th2) {
                        UPLog.e("Notify", th2);
                    }
                    ak.this.f105723b.b(!zA2);
                }
            });
        }
    }

    public final void a(Activity activity, final Intent intent) {
        this.f105724c = true;
        if (activity == null || intent == null) {
            return;
        }
        final Context applicationContext = activity.getApplicationContext();
        final String name = activity.getClass().getName();
        b.b(new Runnable() { // from class: com.umeng.message.proguard.ak.3
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    ak akVar = ak.this;
                    Context context = applicationContext;
                    Intent intent2 = intent;
                    String str = name;
                    akVar.f105723b.a(System.currentTimeMillis());
                    String stringExtra = intent2.getStringExtra("data");
                    String stringExtra2 = intent2.getStringExtra("pkg");
                    intent2.removeExtra("data");
                    intent2.removeExtra("pkg");
                    if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(stringExtra2)) {
                        String str2 = new String(as.a(new String(new byte[]{100, 85, org.apache.tools.tar.c.Q, 112, 78, 67, 57, 109, 78, 67, 116, 81, 89, 106, 77, org.apache.tools.tar.c.K, org.apache.tools.tar.c.O, 108, 81, org.apache.tools.tar.c.Q, 79, 81, 61, 61})));
                        byte[] bArrA = as.a(new String(new byte[]{98, 109, org.apache.tools.tar.c.G, 108, 100, 87, 99, 117, 90, 106, 107, 118, 84, org.apache.tools.tar.c.H, org.apache.tools.tar.c.F, 114, 84, 68, org.apache.tools.tar.c.S, 121, 77, 119, 61, 61}));
                        String strB = ax.b(stringExtra2, str2, bArrA);
                        String strB2 = ax.b(stringExtra, str2, bArrA);
                        if (!TextUtils.isEmpty(strB2) && !TextUtils.isEmpty(strB)) {
                            JSONObject jSONObject = new JSONObject(strB2);
                            jSONObject.put(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, str);
                            al alVar = akVar.f105723b;
                            String string = jSONObject.toString();
                            String strA = null;
                            if (string != null) {
                                try {
                                    strA = as.a(string.getBytes());
                                } catch (Exception unused) {
                                }
                            }
                            alVar.f105734a.a("info", strA);
                            jSONObject.put("action_type", 71);
                            jSONObject.put(RemoteMessageConst.DEVICE_TOKEN, PushAgent.getInstance(context).getRegistrationId());
                            jSONObject.put("msg_id", "");
                            jSONObject.put(j5.b.f124286k, "");
                            jSONObject.put("ts", System.currentTimeMillis());
                            JSONObject jSONObject2 = new JSONObject();
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("din", d.c(context));
                            jSONObject3.put(com.umeng.analytics.pro.ak.aK, MsgConstant.SDK_VERSION);
                            jSONObject3.put("push_switch", d.p(context));
                            jSONObject2.put("header", jSONObject3);
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(jSONObject);
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("push", jSONArray);
                            jSONObject2.put("content", jSONObject4);
                            UMWorkDispatch.sendEvent(context, 16385, v.a(), jSONObject2.toString());
                            try {
                                UPushMessageNotifyApi.Callback callback = akVar.f105722a;
                                if (callback != null) {
                                    callback.onNotified();
                                    akVar.f105724c = false;
                                    return;
                                }
                                return;
                            } catch (Throwable unused2) {
                                return;
                            }
                        }
                        akVar.f105723b.a(0L);
                        return;
                    }
                    akVar.f105723b.a(0L);
                } catch (Throwable th2) {
                    UPLog.e("Notify", th2);
                }
            }
        });
    }

    public final void a(JSONObject jSONObject) {
        try {
            if (this.f105723b.c()) {
                String strD = this.f105723b.d();
                if (TextUtils.isEmpty(strD)) {
                    return;
                }
                JSONObject jSONObject2 = new JSONObject(strD);
                jSONObject.put(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, jSONObject2.optString(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY));
                jSONObject.put("pusor", jSONObject2.optJSONArray("pusor"));
                jSONObject.put("trace_id", jSONObject2.optString("trace_id"));
            }
        } catch (Throwable th2) {
            UPLog.e("Notify", "handle msg arrived error:", th2);
        }
    }
}
