package com.umeng.commonsdk.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.aa;
import com.umeng.analytics.pro.ak;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.an;
import com.umeng.analytics.pro.ao;
import com.umeng.analytics.pro.l;
import com.umeng.commonsdk.UMConfigureImpl;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.SelfChecker;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.listener.OnGetOaidListener;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.stateless.d;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.idtracking.h;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.commonsdk.utils.onMessageSendListener;
import com.umeng.commonsdk.vchannel.Sender;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: UMInternalDataProtocol.java */
/* JADX INFO: loaded from: classes4.dex */
public class c implements UMLogDataProtocol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f105220a = "um_policy_grant";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f105221b = "preInitInvokedFlag";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f105222c = "policyGrantInvokedFlag";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f105223d = "policyGrantResult";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f105224f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f105225g = "info";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f105226h = "stat";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static Class<?> f105227i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Method f105228j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Method f105229k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Method f105230l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static boolean f105231m = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f105232e;

    static {
        c();
    }

    public c(Context context) {
        if (context != null) {
            this.f105232e = context.getApplicationContext();
        }
    }

    private static Class<?> a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private void a(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appkey", UMGlobalContext.getInstance(context).getAppkey());
            jSONObject.put("app_version", UMGlobalContext.getInstance(context).getAppVersion());
            jSONObject.put("os", "Android");
            JSONObject jSONObjectBuildZeroEnvelopeWithExtHeader = UMEnvelopeBuild.buildZeroEnvelopeWithExtHeader(context, jSONObject, null, UMServerURL.ZCFG_PATH);
            if (jSONObjectBuildZeroEnvelopeWithExtHeader == null || !jSONObjectBuildZeroEnvelopeWithExtHeader.has("exception")) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 构建零号报文 成功!!!");
            } else {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 构建零号报文失败.");
            }
        } catch (Throwable unused) {
        }
    }

    private static void a(Context context, final OnGetOaidListener onGetOaidListener) {
        if (context == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        new Thread(new Runnable() { // from class: com.umeng.commonsdk.internal.c.2
            @Override // java.lang.Runnable
            public void run() {
                String strA = aa.a(applicationContext);
                OnGetOaidListener onGetOaidListener2 = onGetOaidListener;
                if (onGetOaidListener2 != null) {
                    onGetOaidListener2.onGetOaid(strA);
                }
            }
        }).start();
    }

    public static String b() {
        Method method;
        Class<?> cls = f105227i;
        if (cls == null || (method = f105228j) == null || f105230l == null) {
            return "";
        }
        try {
            Object objInvoke = method.invoke(cls, new Object[0]);
            return objInvoke != null ? (String) f105230l.invoke(objInvoke, new Object[0]) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    private static void b(final Context context) {
        new Thread(new Runnable() { // from class: com.umeng.commonsdk.internal.c.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SharedPreferences sharedPreferences = context.getSharedPreferences(h.f105367a, 0);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strA = aa.a(context);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (!TextUtils.isEmpty(strA) && sharedPreferences != null) {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putString(h.f105369c, (jCurrentTimeMillis2 - jCurrentTimeMillis) + "");
                        editorEdit.commit();
                    }
                    if (sharedPreferences != null) {
                        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                        editorEdit2.putString(h.f105368b, strA);
                        editorEdit2.commit();
                    }
                    if (Build.VERSION.SDK_INT > 28) {
                        UMConfigureImpl.removeInterruptFlag();
                    }
                } catch (Throwable unused) {
                }
            }
        }).start();
    }

    private static void c() {
        try {
            Class<?> cls = Class.forName("com.umeng.umzid.ZIDManager");
            f105227i = cls;
            Method declaredMethod = cls.getDeclaredMethod("getInstance", new Class[0]);
            if (declaredMethod != null) {
                f105228j = declaredMethod;
            }
            Method declaredMethod2 = f105227i.getDeclaredMethod("getZID", Context.class);
            if (declaredMethod2 != null) {
                f105229k = declaredMethod2;
            }
            Method declaredMethod3 = f105227i.getDeclaredMethod("getSDKVersion", new Class[0]);
            if (declaredMethod3 != null) {
                f105230l = declaredMethod3;
            }
        } catch (Throwable unused) {
        }
    }

    private static void c(final Context context) {
        if (!FieldManager.allow(com.umeng.commonsdk.utils.b.G) || Build.VERSION.SDK_INT <= 28) {
            return;
        }
        a(context, new OnGetOaidListener() { // from class: com.umeng.commonsdk.internal.c.3
            @Override // com.umeng.commonsdk.listener.OnGetOaidListener
            public void onGetOaid(String str) {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                try {
                    SharedPreferences sharedPreferences = context.getSharedPreferences(h.f105367a, 0);
                    if (sharedPreferences == null || sharedPreferences.getString(h.f105368b, "").equalsIgnoreCase(str)) {
                        return;
                    }
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 更新本地缓存OAID");
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putString(h.f105368b, str);
                    editorEdit.commit();
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void d() {
        am amVarA = am.a(this.f105232e);
        an anVarA = amVarA.a(ao.f104521c);
        if (anVarA != null) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存记录构建成真正信封。");
            try {
                String str = anVarA.f104513a;
                String str2 = anVarA.f104514b;
                JSONObject jSONObjectA = new com.umeng.commonsdk.statistics.b().a(this.f105232e.getApplicationContext(), new JSONObject(anVarA.f104515c), new JSONObject(anVarA.f104516d), anVarA.f104517e, str2, anVarA.f104518f);
                if (jSONObjectA == null || !jSONObjectA.has("exception")) {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存记录构建真正信封 成功! 删除二级缓存记录。");
                } else {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存记录构建真正信封 失败。删除二级缓存记录");
                }
                amVarA.a(ao.f104521c, str);
                amVarA.b();
            } catch (Throwable unused) {
            }
        }
    }

    private void d(Context context) {
        Object objInvoke;
        Method declaredMethod;
        Context applicationContext = context.getApplicationContext();
        String appkey = UMUtils.getAppkey(context);
        try {
            Class<?> clsA = a("com.umeng.umzid.ZIDManager");
            Method declaredMethod2 = clsA.getDeclaredMethod("getInstance", new Class[0]);
            if (declaredMethod2 == null || (objInvoke = declaredMethod2.invoke(clsA, new Object[0])) == null || (declaredMethod = clsA.getDeclaredMethod(lg.a.f131415h, Context.class, String.class, a("com.umeng.umzid.IZIDCompletionCallback"))) == null) {
                return;
            }
            declaredMethod.invoke(objInvoke, applicationContext, appkey, null);
        } catch (Throwable unused) {
        }
    }

    private void e() {
        if (f105231m) {
            if (FieldManager.allow(com.umeng.commonsdk.utils.b.G)) {
                return;
            }
            f105231m = false;
        } else {
            if (!FieldManager.allow(com.umeng.commonsdk.utils.b.G) || Build.VERSION.SDK_INT <= 28) {
                return;
            }
            f105231m = true;
            a(this.f105232e, new OnGetOaidListener() { // from class: com.umeng.commonsdk.internal.c.4
                @Override // com.umeng.commonsdk.listener.OnGetOaidListener
                public void onGetOaid(String str) {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> OAID云控参数更新(不采集->采集)：采集完成");
                    if (TextUtils.isEmpty(str)) {
                        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> oaid返回null或者空串，不需要 伪冷启动。");
                        return;
                    }
                    try {
                        SharedPreferences sharedPreferences = c.this.f105232e.getSharedPreferences(h.f105367a, 0);
                        if (sharedPreferences != null) {
                            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                            editorEdit.putString(h.f105368b, str);
                            editorEdit.commit();
                        }
                    } catch (Throwable unused) {
                    }
                    UMWorkDispatch.sendEvent(c.this.f105232e, a.f105213w, b.a(c.this.f105232e).a(), null);
                }
            });
        }
    }

    private static void e(Context context) {
        File file = new File(context.getFilesDir().getAbsolutePath() + File.separator + ao.f104530l);
        if (file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (Throwable unused) {
        }
    }

    private void f() {
        if (!FieldManager.allow(com.umeng.commonsdk.utils.b.G) || Build.VERSION.SDK_INT <= 28) {
            return;
        }
        f105231m = true;
        UMConfigureImpl.registerInterruptFlag();
        UMConfigureImpl.init(this.f105232e);
        f105224f++;
        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 要读取 oaid，需等待读取结果.");
        UMConfigureImpl.registerMessageSendListener(new onMessageSendListener() { // from class: com.umeng.commonsdk.internal.c.5
            @Override // com.umeng.commonsdk.utils.onMessageSendListener
            public void onMessageSend() {
                if (c.this.f105232e != null) {
                    UMWorkDispatch.sendEvent(c.this.f105232e, a.f105214x, b.a(c.this.f105232e).a(), null);
                }
                UMConfigureImpl.removeMessageSendListener(this);
            }
        });
        b(this.f105232e);
    }

    private void g() {
        if (f105224f <= 0) {
            h();
            d(this.f105232e);
        }
    }

    private void h() {
        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 真实构建条件满足，开始构建业务信封。");
        if (UMUtils.isMainProgress(this.f105232e)) {
            e(this.f105232e);
            com.umeng.commonsdk.a.a(this.f105232e);
            Context context = this.f105232e;
            UMWorkDispatch.sendEvent(context, 8208, CoreProtocol.getInstance(context), null);
            Context context2 = this.f105232e;
            UMWorkDispatch.sendEvent(context2, a.f105210t, b.a(context2).a(), null);
        }
    }

    public String a() {
        Method method;
        Class<?> cls = f105227i;
        if (cls == null || (method = f105228j) == null || f105229k == null) {
            return "";
        }
        try {
            Object objInvoke = method.invoke(cls, new Object[0]);
            return objInvoke != null ? (String) f105229k.invoke(objInvoke, this.f105232e) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void removeCacheData(Object obj) {
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public JSONObject setupReportData(long j10) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x01a1  */
    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void workEvent(Object obj, int i10) throws JSONException, IllegalAccessException, ClassNotFoundException, InvocationTargetException {
        SharedPreferences.Editor editorEdit;
        boolean z10 = true;
        boolean z11 = false;
        ULog.i("walle", "[internal] workEvent");
        try {
            switch (i10) {
                case a.f105196f /* 32769 */:
                    ULog.i("walle", "[internal] workEvent send envelope");
                    Class<?> cls = Class.forName("com.umeng.commonsdk.internal.UMInternalManagerAgent");
                    cls.getMethod("sendInternalEnvelopeByStateful2", Context.class).invoke(cls, this.f105232e);
                    break;
                case a.f105198h /* 32771 */:
                    ULog.i("walle", "[internal] workEvent cache battery, event is " + obj.toString());
                    Class<?> cls2 = Class.forName("com.umeng.commonsdk.internal.utils.UMInternalUtilsAgent");
                    cls2.getMethod("saveBattery", Context.class, String.class).invoke(cls2, this.f105232e, (String) obj);
                    break;
                case a.f105201k /* 32774 */:
                    Class<?> cls3 = Class.forName("com.umeng.commonsdk.internal.utils.ApplicationLayerUtilAgent");
                    cls3.getMethod("wifiChange", Context.class).invoke(cls3, this.f105232e);
                    break;
                case a.f105202l /* 32775 */:
                    Class<?> cls4 = Class.forName("com.umeng.commonsdk.internal.utils.InfoPreferenceAgent");
                    cls4.getMethod("saveUA", Context.class, String.class).invoke(cls4, this.f105232e, (String) obj);
                    break;
                case a.f105203m /* 32776 */:
                    SharedPreferences sharedPreferences = this.f105232e.getApplicationContext().getSharedPreferences(f105225g, 0);
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().putString(f105226h, (String) obj).commit();
                    }
                    break;
                case a.f105204n /* 32777 */:
                    ULog.i("walle", "[internal] workEvent send envelope");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(ak.aM, a.f105195e);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(ak.au, new JSONObject());
                    JSONObject jSONObjectBuildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(this.f105232e, jSONObject, jSONObject2);
                    if (jSONObjectBuildEnvelopeWithExtHeader != null && !jSONObjectBuildEnvelopeWithExtHeader.has("exception")) {
                        ULog.i("walle", "[internal] workEvent send envelope back, result is ok");
                        break;
                    }
                    break;
                case a.f105205o /* 32779 */:
                    Sender.handleEvent(this.f105232e, (com.umeng.commonsdk.vchannel.b) obj);
                    break;
                case a.f105206p /* 32781 */:
                    if (!UMFrUtils.hasEnvelopeFile(this.f105232e, UMLogDataProtocol.UMBusinessType.U_ZeroEnv)) {
                        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 构建零号报文");
                        a(this.f105232e);
                    } else {
                        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 零号报文信封文件已存在，尝试发送之!");
                    }
                    break;
                case a.f105209s /* 32784 */:
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 零号报文流程，接收到云控配置加载成功通知(成功收到零号报文应答)。");
                    f();
                    f105224f--;
                    g();
                    break;
                case a.f105210t /* 32785 */:
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]接收到消费二级缓存数据通知.");
                    if (!am.a(this.f105232e).c()) {
                        d();
                        if (!UMWorkDispatch.eventHasExist(a.f105210t)) {
                            Context context = this.f105232e;
                            UMWorkDispatch.sendEvent(context, a.f105210t, b.a(context).a(), null);
                        }
                    } else {
                        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]已消费完毕,二级缓存数据库为空.");
                    }
                    break;
                case a.f105211u /* 32786 */:
                    UMCrashManager.buildEnvelope(this.f105232e, obj);
                    break;
                case a.f105212v /* 32787 */:
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 触发2号仓遗留信封检查动作。");
                    String strA = d.a(this.f105232e, false);
                    String strA2 = d.a(this.f105232e, true);
                    if (!TextUtils.isEmpty(strA)) {
                        File file = new File(strA);
                        if (file.exists() && file.isDirectory()) {
                            z11 = true;
                        }
                    }
                    if (TextUtils.isEmpty(strA2)) {
                        z10 = z11;
                    } else {
                        File file2 = new File(strA2);
                        if (!file2.exists() || !file2.isDirectory()) {
                            z10 = z11;
                        }
                    }
                    if (!z10) {
                        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 触发2号仓遗留信封检查，没有需要处理的目录，不需要处理。");
                    } else if (!com.umeng.commonsdk.stateless.b.a()) {
                        new com.umeng.commonsdk.stateless.b(this.f105232e);
                        com.umeng.commonsdk.stateless.b.b();
                    } else {
                        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 触发2号仓遗留信封检查，Sender已创建，不需要处理。");
                    }
                    break;
                case a.f105213w /* 32788 */:
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 云控下发参数更新，触发 伪冷启动。");
                    com.umeng.commonsdk.statistics.b.a();
                    e();
                    if (FieldManager.allow(com.umeng.commonsdk.utils.b.E) && !UMWorkDispatch.eventHasExist()) {
                        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 云控下发参数更新 前台计数器功能 打开，触发 5秒周期检查机制");
                        Context context2 = this.f105232e;
                        UMWorkDispatch.sendEventEx(context2, 8213, CoreProtocol.getInstance(context2), null, 5000L);
                    }
                    if (FieldManager.allow(com.umeng.commonsdk.utils.b.F)) {
                        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 云控下发参数更新 FirstResume功能 打开，触发 trigger");
                        l.a(this.f105232e).b(this.f105232e);
                    }
                    break;
                case a.f105214x /* 32790 */:
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 成功接收到(OAID)读取结束通知。");
                    f105224f--;
                    g();
                    break;
                case a.f105215y /* 32791 */:
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 正常冷启动流程，接收到云控配置加载成功通知。");
                    c(this.f105232e);
                    com.umeng.commonsdk.a.a(this.f105232e);
                    d(this.f105232e);
                    break;
                case a.f105216z /* 32792 */:
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 保存隐私授权结果.");
                    if (obj instanceof Integer) {
                        int iIntValue = ((Integer) obj).intValue();
                        SharedPreferences sharedPreferences2 = this.f105232e.getApplicationContext().getSharedPreferences(f105220a, 0);
                        if (sharedPreferences2 != null) {
                            sharedPreferences2.edit().putInt("policyGrantResult", iIntValue).commit();
                        }
                    }
                    break;
                case a.A /* 32793 */:
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 保存preInit执行结果及授权API是否调用结果.");
                    if (obj instanceof JSONObject) {
                        JSONObject jSONObject3 = (JSONObject) obj;
                        if (jSONObject3.has(a.G)) {
                            int i11 = jSONObject3.getInt(a.G);
                            int i12 = jSONObject3.getInt(a.H);
                            int i13 = jSONObject3.getInt("policyGrantResult");
                            SharedPreferences sharedPreferences3 = this.f105232e.getApplicationContext().getSharedPreferences(f105220a, 0);
                            if (sharedPreferences3 != null && (editorEdit = sharedPreferences3.edit()) != null) {
                                editorEdit.putInt(f105221b, i11);
                                editorEdit.putInt(f105222c, i12);
                                editorEdit.putInt("policyGrantResult", i13);
                                editorEdit.commit();
                            }
                            File file3 = new File(this.f105232e.getFilesDir().getAbsolutePath() + File.separator + ao.f104531m);
                            if (!file3.exists()) {
                                file3.createNewFile();
                            }
                        }
                    }
                    break;
                case a.B /* 32800 */:
                    File file4 = new File(this.f105232e.getFilesDir().getAbsolutePath() + File.separator + ao.f104531m);
                    if (file4.exists()) {
                        file4.delete();
                    }
                    break;
                case a.C /* 32801 */:
                    SelfChecker.doCheck(this.f105232e);
                    break;
            }
        } catch (Throwable unused) {
        }
    }
}
