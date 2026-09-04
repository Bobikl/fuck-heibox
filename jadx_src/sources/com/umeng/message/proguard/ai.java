package com.umeng.message.proguard;

import android.content.Context;
import android.text.TextUtils;
import com.max.xiaoheihe.module.account.SendToFriendActivity;
import com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.common.UPLog;
import com.umeng.message.common.inter.ITagManager;
import com.umeng.message.entity.UInAppMessage;
import com.umeng.message.inapp.InAppMessageManager;
import com.umeng.message.proguard.ae;
import com.umeng.message.proguard.h;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class ai {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f105700b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile ai f105701c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f105702a;

    private ai(Context context) {
        this.f105702a = context.getApplicationContext();
    }

    public static ai a(Context context) {
        if (f105701c == null) {
            synchronized (ai.class) {
                if (f105701c == null) {
                    f105701c = new ai(context);
                }
            }
        }
        return f105701c;
    }

    static /* synthetic */ JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("header", e.a());
        jSONObject.put("pmode", InAppMessageManager.f105583a ? "0" : "1");
        return jSONObject;
    }

    static /* synthetic */ JSONObject b(String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("header", e.a());
        jSONObject.put("msg_id", str);
        jSONObject.put(SendToFriendActivity.R, i10);
        jSONObject.put("num_display", i11);
        jSONObject.put("num_open_full", i12);
        jSONObject.put("num_open_top", i13);
        jSONObject.put("num_open_bottom", i14);
        jSONObject.put("num_close", i15);
        jSONObject.put("num_duration", i16);
        jSONObject.put("num_custom", i17);
        return g.a(jSONObject, "https://msg.umengcloud.com/admsg/v3/stats", UMUtils.getAppkey(x.a()), true);
    }

    static /* synthetic */ boolean b() {
        f105700b = false;
        return false;
    }

    private void c() {
        if (f105700b) {
            UMLog.mutlInfo("UmengInAppMessageTracker", 2, "sendInAppCacheLog已经在队列里，忽略该请求");
            return;
        }
        f105700b = true;
        UMLog.mutlInfo("UmengInAppMessageTracker", 2, "sendInAppCacheLog开始");
        b.c(new Runnable() { // from class: com.umeng.message.proguard.ai.4
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    for (ae aeVar : InAppMessageManager.getInstance(ai.this.f105702a).b()) {
                        JSONObject jSONObjectB = ai.b(aeVar.f105674b, aeVar.f105675c, aeVar.f105676d, aeVar.f105677e, aeVar.f105678f, aeVar.f105679g, aeVar.f105680h, aeVar.f105681i, aeVar.f105682j);
                        if (jSONObjectB != null && TextUtils.equals(jSONObjectB.getString("success"), ITagManager.SUCCESS)) {
                            InAppMessageManager inAppMessageManager = InAppMessageManager.getInstance(ai.this.f105702a);
                            inAppMessageManager.f105587b.getContentResolver().delete(h.e(inAppMessageManager.f105587b), "MsgId=?", new String[]{aeVar.f105674b});
                        }
                    }
                } catch (Exception e10) {
                    UPLog.w("UmengInAppMessageTracker", "sendInAppCacheLog error:" + e10.getMessage());
                } finally {
                    ai.b();
                }
            }
        });
    }

    public final void a(final ad adVar) {
        if (f.b()) {
            UPLog.d("UmengInAppMessageTracker", "getSplashMsg failed, silent mode!");
        } else {
            c();
            b.c(new Runnable() { // from class: com.umeng.message.proguard.ai.1
                @Override // java.lang.Runnable
                public final void run() {
                    UInAppMessage uInAppMessage;
                    UMLog.mutlInfo("UmengInAppMessageTracker", 2, "get splash message begin");
                    try {
                        JSONObject jSONObjectA = g.a(ai.a(), "https://msg.umengcloud.com/admsg/v3/launch", UMUtils.getAppkey(x.a()), true);
                        if (TextUtils.equals(jSONObjectA.getString("success"), ITagManager.SUCCESS)) {
                            UMLog.mutlInfo("UmengInAppMessageTracker", 2, "get splash message success".concat(String.valueOf(jSONObjectA)));
                            JSONObject jSONObject = jSONObjectA.getJSONObject("data");
                            InAppMessageManager.f105584d = jSONObject.getInt("pduration") * 1000;
                            InAppMessageManager.f105585e = jSONObject.getInt("sduration") * 1000;
                            adVar.a(new UInAppMessage(jSONObject.getJSONObject("launch")));
                            InAppMessageManager inAppMessageManager = InAppMessageManager.getInstance(ai.this.f105702a);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(System.currentTimeMillis());
                            inAppMessageManager.b("KEY_SPLASH_TS", sb2.toString());
                            return;
                        }
                        if (!TextUtils.equals(jSONObjectA.getString("success"), "fail") || !TextUtils.equals(jSONObjectA.getString("error"), "no message")) {
                            adVar.a(null);
                            return;
                        }
                        String strA = InAppMessageManager.getInstance(ai.this.f105702a).a();
                        if (TextUtils.isEmpty(strA)) {
                            return;
                        }
                        try {
                            uInAppMessage = new UInAppMessage(new JSONObject(strA));
                        } catch (JSONException e10) {
                            e10.printStackTrace();
                            uInAppMessage = null;
                        }
                        if (uInAppMessage != null) {
                            InAppMessageManager.getInstance(ai.this.f105702a).a(new File(f.a(ai.this.f105702a, uInAppMessage.msg_id)));
                            InAppMessageManager.getInstance(ai.this.f105702a).a((UInAppMessage) null);
                        }
                    } catch (Exception e11) {
                        UPLog.w("UmengInAppMessageTracker", "getSplashMsg error: ", e11.getMessage());
                        adVar.a(null);
                    }
                }
            });
        }
    }

    public final void a(final String str, final int i10, final int i11, final int i12, final int i13, final int i14, final int i15, final int i16, final int i17) {
        b.c(new Runnable() { // from class: com.umeng.message.proguard.ai.3
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    UMLog.mutlInfo("UmengInAppMessageTracker", 2, "track in app msg begin");
                    JSONObject jSONObjectB = ai.b(str, i10, i11, i12, i13, i14, i15, i16, i17);
                    if (jSONObjectB == null || !TextUtils.equals(jSONObjectB.getString("success"), ITagManager.SUCCESS)) {
                        return;
                    }
                    UMLog.mutlInfo("UmengInAppMessageTracker", 2, "track in app msg success");
                } catch (Exception e10) {
                    UPLog.w("UmengInAppMessageTracker", "trackInAppMessage error:" + e10.getMessage());
                    final InAppMessageManager inAppMessageManager = InAppMessageManager.getInstance(ai.this.f105702a);
                    final String str2 = str;
                    final int i18 = i10;
                    final int i19 = i11;
                    final int i20 = i12;
                    final int i21 = i13;
                    final int i22 = i14;
                    final int i23 = i15;
                    final int i24 = i16;
                    final int i25 = i17;
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    b.c(new Runnable() { // from class: com.umeng.message.inapp.InAppMessageManager.1

                        /* JADX INFO: renamed from: a */
                        final /* synthetic */ String f105591a;

                        /* JADX INFO: renamed from: b */
                        final /* synthetic */ int f105592b;

                        /* JADX INFO: renamed from: c */
                        final /* synthetic */ int f105593c;

                        /* JADX INFO: renamed from: d */
                        final /* synthetic */ int f105594d;

                        /* JADX INFO: renamed from: e */
                        final /* synthetic */ int f105595e;

                        /* JADX INFO: renamed from: f */
                        final /* synthetic */ int f105596f;

                        /* JADX INFO: renamed from: g */
                        final /* synthetic */ int f105597g;

                        /* JADX INFO: renamed from: h */
                        final /* synthetic */ int f105598h;

                        /* JADX INFO: renamed from: i */
                        final /* synthetic */ int f105599i;

                        public AnonymousClass1() {
                            str = str2;
                            i = i18;
                            i = i19;
                            i = i20;
                            i = i21;
                            i = i22;
                            i = i23;
                            i = i24;
                            i = i25;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                ae aeVarA = InAppMessageManager.a(InAppMessageManager.this, str);
                                if (aeVarA != null) {
                                    InAppMessageManager.this.f105587b.getContentResolver().update(h.e(InAppMessageManager.this.f105587b), new ae(str, i, aeVarA.f105676d + i, aeVarA.f105677e + i, aeVarA.f105678f + i, aeVarA.f105679g + i, aeVarA.f105680h + i, aeVarA.f105681i + i, aeVarA.f105682j).a(), "MsgId=?", new String[]{str});
                                } else {
                                    InAppMessageManager.this.f105587b.getContentResolver().insert(h.e(InAppMessageManager.this.f105587b), new ae(str, i, i, i, i, i, i, i, i).a());
                                }
                                UMLog.mutlInfo("InAppMessageManager", 2, "store in app cache log success");
                            } catch (Exception e11) {
                                UMLog.mutlInfo("InAppMessageManager", 0, "store in app cache log fail");
                                e11.printStackTrace();
                            }
                        }
                    });
                }
            }
        });
    }

    public final void a(final String str, final ad adVar) {
        if (f.b()) {
            UPLog.d("UmengInAppMessageTracker", "getCardMsg failed, silent mode!");
        } else {
            c();
            b.c(new Runnable() { // from class: com.umeng.message.proguard.ai.2
                @Override // java.lang.Runnable
                public final void run() {
                    UInAppMessage uInAppMessage;
                    UMLog.mutlInfo("UmengInAppMessageTracker", 2, "get card message begin");
                    try {
                        JSONObject jSONObjectA = ai.a();
                        jSONObjectA.put(BasePuzzleInfo.PUZZLE_TYPE_LABEL, str);
                        JSONObject jSONObjectA2 = g.a(jSONObjectA, "https://msg.umengcloud.com/admsg/v3/getmsg", UMUtils.getAppkey(x.a()), true);
                        if (TextUtils.equals(jSONObjectA2.getString("success"), ITagManager.SUCCESS)) {
                            UMLog.mutlInfo("UmengInAppMessageTracker", 2, "get card message success".concat(String.valueOf(jSONObjectA2)));
                            JSONObject jSONObject = jSONObjectA2.getJSONObject("data");
                            InAppMessageManager.f105584d = jSONObject.getInt("pduration") * 1000;
                            InAppMessageManager.f105585e = jSONObject.getInt("sduration") * 1000;
                            adVar.b(new UInAppMessage(jSONObject.getJSONObject(sd.b.f139392j)));
                            InAppMessageManager inAppMessageManager = InAppMessageManager.getInstance(ai.this.f105702a);
                            String strConcat = "KEY_CARD_TS_".concat(String.valueOf(jSONObjectA.optString(BasePuzzleInfo.PUZZLE_TYPE_LABEL, "")));
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(System.currentTimeMillis());
                            inAppMessageManager.b(strConcat, sb2.toString());
                            return;
                        }
                        if (!TextUtils.equals(jSONObjectA2.getString("success"), "fail") || !TextUtils.equals(jSONObjectA2.getString("error"), "no message")) {
                            adVar.b(null);
                            return;
                        }
                        String strA = InAppMessageManager.getInstance(ai.this.f105702a).a(str);
                        if (TextUtils.isEmpty(strA)) {
                            return;
                        }
                        try {
                            uInAppMessage = new UInAppMessage(new JSONObject(strA));
                        } catch (JSONException e10) {
                            e10.printStackTrace();
                            uInAppMessage = null;
                        }
                        if (uInAppMessage != null) {
                            InAppMessageManager.getInstance(ai.this.f105702a).a(new File(f.a(ai.this.f105702a, uInAppMessage.msg_id)));
                            InAppMessageManager.getInstance(ai.this.f105702a).a((UInAppMessage) null, str);
                        }
                    } catch (Exception e11) {
                        UPLog.w("UmengInAppMessageTracker", "getCardMsg error: ", e11.getMessage());
                        adVar.b(null);
                    }
                }
            });
        }
    }
}
