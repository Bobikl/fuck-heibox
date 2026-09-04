package com.umeng.message.proguard;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
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
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final t f105871a = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<Activity> f105872b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private s f105877g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f105873c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f105874d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f105875e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f105876f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f105878h = new Runnable() { // from class: com.umeng.message.proguard.t.1
        @Override // java.lang.Runnable
        public final void run() {
            t tVar = t.this;
            tVar.f105875e = !(tVar.f105875e && t.this.f105874d) && t.this.f105875e;
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f105879i = new Application.ActivityLifecycleCallbacks() { // from class: com.umeng.message.proguard.t.2
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            s unused = t.this.f105877g;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            try {
                t.this.f105874d = true;
                t.this.f105873c.removeCallbacks(t.this.f105878h);
                t.this.f105873c.postDelayed(t.this.f105878h, 1000L);
            } catch (Throwable unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            try {
                t.this.f105872b = new WeakReference(activity);
                t.this.f105874d = false;
                t.this.f105873c.removeCallbacks(t.this.f105878h);
                t.this.f105875e = true;
            } catch (Throwable unused) {
            }
            s unused2 = t.this.f105877g;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            if (t.this.f105877g != null) {
                try {
                    aj ajVarA = aj.a();
                    if (ajVarA.f105721b) {
                        final String name = activity.getClass().getName();
                        final ak akVar = ajVarA.f105720a;
                        if (akVar.f105723b.a()) {
                            boolean z10 = true;
                            if (!akVar.f105723b.f105734a.b("e_s", true)) {
                                if (!(Math.abs(System.currentTimeMillis() - akVar.f105723b.b()) > 86400000)) {
                                    return;
                                }
                            }
                            al alVar = akVar.f105723b;
                            if (Math.abs(System.currentTimeMillis() - alVar.b()) <= Math.max(600L, Math.min(alVar.f105734a.b("req_interval", 1800L), 86400L)) * 1000) {
                                z10 = false;
                            }
                            if (z10) {
                                akVar.f105723b.f105734a.a("req_ts", System.currentTimeMillis());
                                b.c(new Runnable() { // from class: com.umeng.message.proguard.ak.2

                                    /* JADX INFO: renamed from: a */
                                    final /* synthetic */ String f105726a;

                                    public AnonymousClass2() {
                                        str = name;
                                    }

                                    /* JADX WARN: Not initialized variable reg: 19, insn: 0x02ca: MOVE (r1 I:??[OBJECT, ARRAY]) = (r19 I:??[OBJECT, ARRAY]), block:B:106:0x02ca */
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        String str;
                                        String str2;
                                        int length;
                                        String str3;
                                        String str4;
                                        String str5 = "trace_id";
                                        String str6 = "ts";
                                        String str7 = "appkey";
                                        String str8 = "Notify";
                                        try {
                                            if (!d.h(x.a())) {
                                                return;
                                            }
                                            ak akVar2 = ak.this;
                                            String str9 = str;
                                            Application applicationA = x.a();
                                            String zid = UMUtils.getZid(applicationA);
                                            if (TextUtils.isEmpty(zid)) {
                                                UPLog.d("Notify", "zid skip.");
                                                return;
                                            }
                                            String registrationId = PushAgent.getInstance(applicationA).getRegistrationId();
                                            if (TextUtils.isEmpty(registrationId)) {
                                                UPLog.d("Notify", "deviceToken skip.");
                                                return;
                                            }
                                            String messageAppkey = PushAgent.getInstance(applicationA).getMessageAppkey();
                                            if (TextUtils.isEmpty(messageAppkey)) {
                                                UPLog.d("Notify", "appkey skip.");
                                                return;
                                            }
                                            String packageName = applicationA.getPackageName();
                                            if (TextUtils.isEmpty(packageName)) {
                                                UPLog.d("Notify", "pkgName skip.");
                                                return;
                                            }
                                            JSONObject jSONObject = new JSONObject();
                                            jSONObject.put(com.umeng.analytics.pro.ak.f104429al, zid);
                                            jSONObject.put("appkey", messageAppkey);
                                            jSONObject.put("package_name", packageName);
                                            jSONObject.put(com.umeng.analytics.pro.ak.F, d.f());
                                            jSONObject.put("device_model", d.d());
                                            jSONObject.put(com.umeng.analytics.pro.ak.f104417a, registrationId);
                                            jSONObject.put("os_version", Build.VERSION.RELEASE);
                                            jSONObject.put("sdk_version", MsgConstant.SDK_VERSION);
                                            jSONObject.put("app_version", d.b(applicationA));
                                            jSONObject.put("version_code", d.a(applicationA));
                                            jSONObject.put("ts", System.currentTimeMillis());
                                            if (d.i()) {
                                                jSONObject.put("harmony_ver", d.j());
                                            }
                                            JSONObject jSONObjectA = null;
                                            try {
                                                jSONObjectA = g.a(jSONObject, "https://offmsg.umeng.com/v2/offmsg/req", messageAppkey, false);
                                            } catch (Exception e10) {
                                                UPLog.d("Notify", "request fail:", e10.getMessage());
                                            }
                                            if (jSONObjectA == null || jSONObjectA.optInt("code") == 13043) {
                                                return;
                                            }
                                            JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject("data");
                                            if (jSONObjectOptJSONObject == null) {
                                                akVar2.f105723b.a(false);
                                                return;
                                            }
                                            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("config");
                                            try {
                                                if (jSONObjectOptJSONObject2 == null) {
                                                    akVar2.f105723b.a(false);
                                                    return;
                                                }
                                                int iOptInt = jSONObjectOptJSONObject2.optInt("ipad");
                                                boolean z11 = jSONObjectOptJSONObject2.optInt("aps") == 1;
                                                akVar2.f105723b.f105734a.a("req_interval", iOptInt);
                                                akVar2.f105723b.a(z11);
                                                String strOptString = jSONObjectOptJSONObject.optString("trace_id");
                                                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("action");
                                                if (jSONArrayOptJSONArray == null || (length = jSONArrayOptJSONArray.length()) == 0) {
                                                    return;
                                                }
                                                int i10 = 5;
                                                if (length > 5) {
                                                    int i11 = 5;
                                                    while (i11 < length) {
                                                        JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i11);
                                                        String str10 = str8;
                                                        if (jSONObjectOptJSONObject3 != null) {
                                                            jSONObjectOptJSONObject3.put(ITagManager.SUCCESS, 0);
                                                        }
                                                        i11++;
                                                        str8 = str10;
                                                        i10 = 5;
                                                    }
                                                }
                                                int iMin = Math.min(i10, length);
                                                int i12 = 0;
                                                boolean z12 = false;
                                                while (i12 < iMin) {
                                                    ak akVar3 = akVar2;
                                                    JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray.optJSONObject(i12);
                                                    if (jSONObjectOptJSONObject4 != null) {
                                                        str3 = str6;
                                                        String strOptString2 = jSONObjectOptJSONObject4.optString("pkg");
                                                        String strOptString3 = jSONObjectOptJSONObject4.optString(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY);
                                                        String strOptString4 = jSONObjectOptJSONObject4.optString(str7);
                                                        if (TextUtils.isEmpty(strOptString2)) {
                                                            jSONObjectOptJSONObject4.put(ITagManager.SUCCESS, 0);
                                                        } else {
                                                            str4 = str7;
                                                            if (TextUtils.equals(strOptString2, packageName) || TextUtils.isEmpty(strOptString3) || TextUtils.isEmpty(strOptString4)) {
                                                                jSONObjectOptJSONObject4.put(ITagManager.SUCCESS, 0);
                                                                strOptString = strOptString;
                                                                str5 = str5;
                                                            } else {
                                                                boolean zA = ak.a(applicationA, str9, strOptString, strOptString2, strOptString3);
                                                                if (!zA) {
                                                                    jSONObjectOptJSONObject4.put("msg", "cur:" + packageName + " start failed:" + strOptString2);
                                                                }
                                                                boolean z13 = z12 | zA;
                                                                jSONObjectOptJSONObject4.put(ITagManager.SUCCESS, zA ? 1 : 0);
                                                                if (i12 < iMin - 1) {
                                                                    try {
                                                                        Thread.sleep(500L);
                                                                    } catch (InterruptedException unused) {
                                                                    }
                                                                }
                                                                z12 = z13;
                                                            }
                                                        }
                                                        i12++;
                                                        akVar2 = akVar3;
                                                        str6 = str3;
                                                        strOptString = strOptString;
                                                        str7 = str4;
                                                        str5 = str5;
                                                    } else {
                                                        str3 = str6;
                                                    }
                                                    str4 = str7;
                                                    i12++;
                                                    akVar2 = akVar3;
                                                    str6 = str3;
                                                    strOptString = strOptString;
                                                    str7 = str4;
                                                    str5 = str5;
                                                }
                                                String str11 = strOptString;
                                                String str12 = str5;
                                                String str13 = str6;
                                                ak akVar4 = akVar2;
                                                JSONObject jSONObject2 = new JSONObject();
                                                JSONObject jSONObject3 = new JSONObject();
                                                jSONObject3.put("din", d.c(applicationA));
                                                jSONObject3.put(com.umeng.analytics.pro.ak.aK, MsgConstant.SDK_VERSION);
                                                jSONObject3.put("push_switch", d.p(applicationA));
                                                jSONObject2.put("header", jSONObject3);
                                                JSONObject jSONObject4 = new JSONObject();
                                                jSONObject4.put(j5.b.f124286k, "");
                                                jSONObject4.put("action_type", 70);
                                                jSONObject4.put(RemoteMessageConst.DEVICE_TOKEN, PushAgent.getInstance(applicationA).getRegistrationId());
                                                jSONObject4.put("msg_id", "");
                                                jSONObject4.put(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, str9);
                                                jSONObject4.put("putar", jSONArrayOptJSONArray);
                                                jSONObject4.put(str12, str11);
                                                jSONObject4.put(str13, System.currentTimeMillis());
                                                JSONArray jSONArray = new JSONArray();
                                                jSONArray.put(jSONObject4);
                                                JSONObject jSONObject5 = new JSONObject();
                                                jSONObject5.put("push", jSONArray);
                                                jSONObject2.put("content", jSONObject5);
                                                UMWorkDispatch.sendEvent(applicationA, 16385, v.a(), jSONObject2.toString());
                                                if (z12) {
                                                    try {
                                                        UPushMessageNotifyApi.Callback callback = akVar4.f105722a;
                                                        if (callback != null) {
                                                            callback.onNotifying();
                                                            return;
                                                        }
                                                        return;
                                                    } catch (Throwable unused2) {
                                                        return;
                                                    }
                                                }
                                                return;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                str = str2;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            str = "Notify";
                                        }
                                        UPLog.e(str, th);
                                    }
                                });
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    };

    private t() {
    }

    public static void a() {
        t tVar = f105871a;
        if (tVar.f105876f) {
            return;
        }
        try {
            Application applicationA = x.a();
            if (applicationA != null) {
                applicationA.registerActivityLifecycleCallbacks(tVar.f105879i);
                tVar.f105876f = true;
            }
        } catch (Throwable unused) {
        }
    }

    public static void b() {
        t tVar = f105871a;
        synchronized (tVar) {
            if (tVar.f105877g == null) {
                tVar.f105877g = new s();
            }
        }
    }

    public static boolean c() {
        return f105871a.f105875e;
    }
}
