package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.clientreport.manager.ClientReportClient;
import com.xiaomi.push.BuildConfig;
import com.xiaomi.push.C1339r;
import com.xiaomi.push.ax;
import com.xiaomi.push.bg;
import com.xiaomi.push.bp;
import com.xiaomi.push.ed;
import com.xiaomi.push.en;
import com.xiaomi.push.eo;
import com.xiaomi.push.fl;
import com.xiaomi.push.fm;
import com.xiaomi.push.fn;
import com.xiaomi.push.fy;
import com.xiaomi.push.in;
import com.xiaomi.push.ir;
import com.xiaomi.push.is;
import com.xiaomi.push.ix;
import com.xiaomi.push.ja;
import com.xiaomi.push.jb;
import com.xiaomi.push.jh;
import com.xiaomi.push.jm;
import com.xiaomi.push.jn;
import com.xiaomi.push.jr;
import com.xiaomi.push.jt;
import com.xiaomi.push.jv;
import com.xiaomi.push.service.az;
import com.xiaomi.push.service.bc;
import com.xiaomi.push.service.receivers.NetworkStatusReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MiPushClient {
    public static final String COMMAND_REGISTER = "register";
    public static final String COMMAND_SET_ACCEPT_TIME = "accept-time";
    public static final String COMMAND_SET_ACCOUNT = "set-account";
    public static final String COMMAND_SET_ALIAS = "set-alias";
    public static final String COMMAND_SUBSCRIBE_TOPIC = "subscribe-topic";
    public static final String COMMAND_UNREGISTER = "unregister";
    public static final String COMMAND_UNSET_ACCOUNT = "unset-account";
    public static final String COMMAND_UNSET_ALIAS = "unset-alias";
    public static final String COMMAND_UNSUBSCRIBE_TOPIC = "unsubscibe-topic";
    public static final String PREF_EXTRA = "mipush_extra";
    private static Context sContext;
    private static long sCurMsgId = System.currentTimeMillis();

    public static class CodeResult {
        private long resultCode = -1;

        public long getResultCode() {
            return this.resultCode;
        }

        protected void setResultCode(long j10) {
            this.resultCode = j10;
        }
    }

    public interface ICallbackResult<R> {
        void onResult(R r10);
    }

    @Deprecated
    public static abstract class MiPushClientCallback {
        private String category;

        protected String getCategory() {
            return this.category;
        }

        public void onCommandResult(String str, long j10, String str2, List<String> list) {
        }

        public void onInitializeResult(long j10, String str, String str2) {
        }

        public void onReceiveMessage(MiPushMessage miPushMessage) {
        }

        public void onReceiveMessage(String str, String str2, String str3, boolean z10) {
        }

        public void onSubscribeResult(long j10, String str, String str2) {
        }

        public void onUnsubscribeResult(long j10, String str, String str2) {
        }

        protected void setCategory(String str) {
            this.category = str;
        }
    }

    public static class TokenResult {
        private String token = null;
        private long resultCode = -1;

        public long getResultCode() {
            return this.resultCode;
        }

        public String getToken() {
            return this.token;
        }

        protected void setResultCode(long j10) {
            this.resultCode = j10;
        }

        protected void setToken(String str) {
            this.token = str;
        }
    }

    public interface UPSRegisterCallBack extends ICallbackResult<TokenResult> {
    }

    public interface UPSTurnCallBack extends ICallbackResult<CodeResult> {
    }

    public interface UPSUnRegisterCallBack extends ICallbackResult<TokenResult> {
    }

    private static boolean acceptTimeSet(Context context, String str, String str2) {
        return TextUtils.equals(getAcceptTime(context), str + Constants.ACCEPT_TIME_SEPARATOR_SP + str2);
    }

    public static long accountSetTime(Context context, String str) {
        return context.getSharedPreferences("mipush_extra", 0).getLong("account_" + str, -1L);
    }

    static synchronized void addAcceptTime(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_extra", 0).edit();
        editorEdit.putString(Constants.EXTRA_KEY_ACCEPT_TIME, str + Constants.ACCEPT_TIME_SEPARATOR_SP + str2);
        com.xiaomi.push.p.a(editorEdit);
    }

    static synchronized void addAccount(Context context, String str) {
        context.getSharedPreferences("mipush_extra", 0).edit().putLong("account_" + str, System.currentTimeMillis()).commit();
    }

    static synchronized void addAlias(Context context, String str) {
        context.getSharedPreferences("mipush_extra", 0).edit().putLong("alias_" + str, System.currentTimeMillis()).commit();
    }

    private static void addPullNotificationTime(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_extra", 0).edit();
        editorEdit.putLong("last_pull_notification", System.currentTimeMillis());
        com.xiaomi.push.p.a(editorEdit);
    }

    private static void addRegRequestTime(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_extra", 0).edit();
        editorEdit.putLong("last_reg_request", System.currentTimeMillis());
        com.xiaomi.push.p.a(editorEdit);
    }

    static synchronized void addTopic(Context context, String str) {
        context.getSharedPreferences("mipush_extra", 0).edit().putLong("topic_" + str, System.currentTimeMillis()).commit();
    }

    public static long aliasSetTime(Context context, String str) {
        return context.getSharedPreferences("mipush_extra", 0).getLong("alias_" + str, -1L);
    }

    public static void awakeApps(final Context context, final String[] strArr) {
        com.xiaomi.push.ah.a(context).a(new Runnable() { // from class: com.xiaomi.mipush.sdk.MiPushClient.4
            @Override // java.lang.Runnable
            public void run() {
                PackageInfo packageInfo;
                try {
                    for (String str : strArr) {
                        if (!TextUtils.isEmpty(str) && (packageInfo = context.getPackageManager().getPackageInfo(str, 4)) != null) {
                            MiPushClient.awakePushServiceByPackageInfo(context, packageInfo);
                        }
                    }
                } catch (Throwable th2) {
                    com.xiaomi.channel.commonutils.logger.b.a(th2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void awakePushServiceByPackageInfo(Context context, PackageInfo packageInfo) {
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                if (serviceInfo.exported && serviceInfo.enabled && "com.xiaomi.mipush.sdk.PushMessageHandler".equals(serviceInfo.name) && !context.getPackageName().equals(serviceInfo.packageName)) {
                    try {
                        Thread.sleep(((long) ((Math.random() * 2.0d) + 1.0d)) * 1000);
                        Intent intent = new Intent();
                        intent.setClassName(serviceInfo.packageName, serviceInfo.name);
                        intent.setAction("com.xiaomi.mipush.sdk.WAKEUP");
                        intent.putExtra("waker_pkgname", context.getPackageName());
                        PushMessageHandler.a(context, intent);
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
            }
        }
    }

    private static void checkNotNull(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new IllegalArgumentException("param " + str + " is not nullable");
    }

    protected static void clearExtras(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_extra", 0).edit();
        editorEdit.clear();
        editorEdit.commit();
    }

    private static void clearExtrasForInitialize(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_extra", 0).edit();
        Iterator<String> it = getAllAlias(context).iterator();
        while (it.hasNext()) {
            editorEdit.remove("alias_" + it.next());
        }
        Iterator<String> it2 = getAllUserAccount(context).iterator();
        while (it2.hasNext()) {
            editorEdit.remove("account_" + it2.next());
        }
        Iterator<String> it3 = getAllTopic(context).iterator();
        while (it3.hasNext()) {
            editorEdit.remove("topic_" + it3.next());
        }
        editorEdit.remove(Constants.EXTRA_KEY_ACCEPT_TIME);
        editorEdit.commit();
    }

    public static void clearLocalNotificationType(Context context) {
        ao.a(context).f();
    }

    public static void clearNotification(Context context) {
        ao.a(context).a(-1);
    }

    public static void clearNotification(Context context, int i10) {
        ao.a(context).a(i10);
    }

    public static void clearNotification(Context context, String str, String str2) {
        ao.a(context).a(str, str2);
    }

    public static void disablePush(Context context) {
        ao.a(context).a(true);
    }

    public static void enablePush(Context context) {
        ao.a(context).a(false);
    }

    protected static String getAcceptTime(Context context) {
        return context.getSharedPreferences("mipush_extra", 0).getString(Constants.EXTRA_KEY_ACCEPT_TIME, "00:00-23:59");
    }

    public static List<String> getAllAlias(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences("mipush_extra", 0).getAll().keySet()) {
            if (str.startsWith("alias_")) {
                arrayList.add(str.substring(6));
            }
        }
        return arrayList;
    }

    public static List<String> getAllTopic(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences("mipush_extra", 0).getAll().keySet()) {
            if (str.startsWith("topic_") && !str.contains("**ALL**")) {
                arrayList.add(str.substring(6));
            }
        }
        return arrayList;
    }

    public static List<String> getAllUserAccount(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences("mipush_extra", 0).getAll().keySet()) {
            if (str.startsWith("account_")) {
                arrayList.add(str.substring(8));
            }
        }
        return arrayList;
    }

    public static String getAppRegion(Context context) {
        if (b.m111a(context).m120c()) {
            return b.m111a(context).f();
        }
        return null;
    }

    private static boolean getDefaultSwitch() {
        return com.xiaomi.push.j.m524b();
    }

    protected static boolean getOpenFCMPush(Context context) {
        checkNotNull(context, com.umeng.analytics.pro.d.R);
        return f.a(context).b(e.ASSEMBLE_PUSH_FCM);
    }

    protected static boolean getOpenHmsPush(Context context) {
        checkNotNull(context, com.umeng.analytics.pro.d.R);
        return f.a(context).b(e.ASSEMBLE_PUSH_HUAWEI);
    }

    protected static boolean getOpenOPPOPush(Context context) {
        checkNotNull(context, com.umeng.analytics.pro.d.R);
        return f.a(context).b(e.ASSEMBLE_PUSH_COS);
    }

    protected static boolean getOpenVIVOPush(Context context) {
        return f.a(context).b(e.ASSEMBLE_PUSH_FTOS);
    }

    public static String getRegId(Context context) {
        if (b.m111a(context).m120c()) {
            return b.m111a(context).m119c();
        }
        return null;
    }

    private static void initEventPerfLogic(final Context context) {
        fn.a(new fn.a() { // from class: com.xiaomi.mipush.sdk.MiPushClient.5
            @Override // com.xiaomi.push.fn.a
            public void uploader(Context context2, ir irVar) {
                MiTinyDataClient.upload(context2, irVar);
            }
        });
        Config configA = fn.a(context);
        com.xiaomi.clientreport.manager.a.a(context).a(BuildConfig.VERSION_NAME);
        ClientReportClient.init(context, configA, new fl(context), new fm(context));
        a.a(context);
        t.a(context, configA);
        az.a(context).a(new az.a(100, "perf event job update") { // from class: com.xiaomi.mipush.sdk.MiPushClient.6
            @Override // com.xiaomi.push.service.az.a
            protected void onCallback() {
                fn.m376a(context);
            }
        });
    }

    @Deprecated
    public static void initialize(Context context, String str, String str2, MiPushClientCallback miPushClientCallback) {
        initialize(context, str, str2, miPushClientCallback, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void initialize(Context context, String str, String str2, MiPushClientCallback miPushClientCallback, String str3, ICallbackResult iCallbackResult) {
        try {
            com.xiaomi.channel.commonutils.logger.b.a(context.getApplicationContext());
            com.xiaomi.channel.commonutils.logger.b.e("sdk_version = 5_6_2-C");
            ax.a(context).a();
            ed.a(context);
            if (miPushClientCallback != null) {
                PushMessageHandler.a(miPushClientCallback);
            }
            if (iCallbackResult != null) {
                PushMessageHandler.a(iCallbackResult);
            }
            if (C1339r.m658a(sContext)) {
                v.a(sContext);
            }
            boolean z10 = b.m111a(sContext).a() != Constants.a();
            if (!z10 && !shouldSendRegRequest(sContext)) {
                ao.a(sContext).m101a();
                com.xiaomi.channel.commonutils.logger.b.m62a("Could not send  register message within 5s repeatly .");
                return;
            }
            if (z10 || !b.m111a(sContext).a(str, str2) || b.m111a(sContext).m123f()) {
                String strA = bp.a(6);
                b.m111a(sContext).m113a();
                b.m111a(sContext).a(Constants.a());
                b.m111a(sContext).a(str, str2, strA);
                MiTinyDataClient.a.a().b(MiTinyDataClient.PENDING_REASON_APPID);
                clearExtras(sContext);
                clearNotification(context);
                jn jnVar = new jn();
                jnVar.a(bc.b());
                jnVar.b(str);
                jnVar.e(str2);
                jnVar.d(sContext.getPackageName());
                jnVar.f(strA);
                Context context2 = sContext;
                jnVar.c(com.xiaomi.push.g.m393a(context2, context2.getPackageName()));
                Context context3 = sContext;
                jnVar.b(com.xiaomi.push.g.a(context3, context3.getPackageName()));
                jnVar.h(BuildConfig.VERSION_NAME);
                jnVar.a(BuildConfig.VERSION_CODE);
                jnVar.a(jb.Init);
                if (!TextUtils.isEmpty(str3)) {
                    jnVar.g(str3);
                }
                if (!com.xiaomi.push.j.m526d()) {
                    String strD = com.xiaomi.push.i.d(sContext);
                    if (!TextUtils.isEmpty(strD)) {
                        jnVar.i(bp.a(strD) + Constants.ACCEPT_TIME_SEPARATOR_SP + com.xiaomi.push.i.f(sContext));
                    }
                }
                int iA = com.xiaomi.push.i.a();
                if (iA >= 0) {
                    jnVar.c(iA);
                }
                ao.a(sContext).a(jnVar, z10);
                sContext.getSharedPreferences("mipush_extra", 4).getBoolean("mipush_registed", true);
            } else {
                if (1 == PushMessageHelper.getPushMode(sContext)) {
                    checkNotNull(miPushClientCallback, "callback");
                    miPushClientCallback.onInitializeResult(0L, null, b.m111a(sContext).m119c());
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(b.m111a(sContext).m119c());
                    PushMessageHelper.sendCommandMessageBroadcast(sContext, PushMessageHelper.generateCommandMessage(fy.COMMAND_REGISTER.f447a, arrayList, 0L, null, null, null));
                }
                ao.a(sContext).m101a();
                if (b.m111a(sContext).m115a()) {
                    jm jmVar = new jm();
                    jmVar.b(b.m111a(sContext).m112a());
                    jmVar.c(ix.ClientInfoUpdate.f623a);
                    jmVar.a(bc.a());
                    HashMap map = new HashMap();
                    jmVar.f763a = map;
                    Context context4 = sContext;
                    map.put("app_version", com.xiaomi.push.g.m393a(context4, context4.getPackageName()));
                    Map<String, String> map2 = jmVar.f763a;
                    Context context5 = sContext;
                    map2.put("app_version_code", Integer.toString(com.xiaomi.push.g.a(context5, context5.getPackageName())));
                    jmVar.f763a.put("push_sdk_vn", BuildConfig.VERSION_NAME);
                    jmVar.f763a.put("push_sdk_vc", Integer.toString(BuildConfig.VERSION_CODE));
                    String strE = b.m111a(sContext).e();
                    if (!TextUtils.isEmpty(strE)) {
                        jmVar.f763a.put("deviceid", strE);
                    }
                    ao.a(sContext).a(jmVar, in.Notification, false, (ja) null);
                    ao.a(sContext).m102a(sContext);
                }
                if (!com.xiaomi.push.k.m636a(sContext, "update_devId", false)) {
                    updateImeiOrOaid();
                    com.xiaomi.push.k.a(sContext, "update_devId", true);
                }
                if (shouldUseMIUIPush(sContext) && shouldPullNotification(sContext)) {
                    jm jmVar2 = new jm();
                    jmVar2.b(b.m111a(sContext).m112a());
                    jmVar2.c(ix.PullOfflineMessage.f623a);
                    jmVar2.a(bc.a());
                    jmVar2.a(false);
                    ao.a(sContext).a(jmVar2, in.Notification, false, (ja) null, false);
                    addPullNotificationTime(sContext);
                }
            }
            addRegRequestTime(sContext);
            scheduleOcVersionCheckJob();
            scheduleDataCollectionJobs(sContext);
            initEventPerfLogic(sContext);
            av.a(sContext);
            if (!sContext.getPackageName().equals("com.xiaomi.xmsf")) {
                if (Logger.getUserLogger() != null) {
                    Logger.setLogger(sContext, Logger.getUserLogger());
                }
                com.xiaomi.channel.commonutils.logger.b.a(2);
            }
            operateSyncAction(context);
        } catch (Throwable th2) {
            com.xiaomi.channel.commonutils.logger.b.a(th2);
        }
    }

    private static void operateSyncAction(Context context) {
        if ("syncing".equals(af.a(sContext).a(au.DISABLE_PUSH))) {
            disablePush(sContext);
        }
        if ("syncing".equals(af.a(sContext).a(au.ENABLE_PUSH))) {
            enablePush(sContext);
        }
        af afVarA = af.a(sContext);
        au auVar = au.UPLOAD_HUAWEI_TOKEN;
        if ("syncing".equals(afVarA.a(auVar))) {
            ao.a(sContext).a((String) null, auVar, e.ASSEMBLE_PUSH_HUAWEI, lg.a.f131415h);
        }
        if ("syncing".equals(af.a(sContext).a(au.UPLOAD_FCM_TOKEN))) {
            syncAssembleFCMPushToken(sContext);
        }
        af afVarA2 = af.a(sContext);
        au auVar2 = au.UPLOAD_COS_TOKEN;
        if ("syncing".equals(afVarA2.a(auVar2))) {
            ao.a(sContext).a((String) null, auVar2, e.ASSEMBLE_PUSH_COS, lg.a.f131415h);
        }
        af afVarA3 = af.a(sContext);
        au auVar3 = au.UPLOAD_FTOS_TOKEN;
        if ("syncing".equals(afVarA3.a(auVar3))) {
            ao.a(context).a((String) null, auVar3, e.ASSEMBLE_PUSH_FTOS, lg.a.f131415h);
        }
    }

    public static void pausePush(Context context, String str) {
        setAcceptTime(context, 0, 0, 0, 0, str);
    }

    static void reInitialize(Context context, jb jbVar) {
        com.xiaomi.channel.commonutils.logger.b.e("re-register reason: " + jbVar);
        String strA = bp.a(6);
        String strM112a = b.m111a(context).m112a();
        String strB = b.m111a(context).b();
        b.m111a(context).m113a();
        clearExtrasForInitialize(context);
        clearNotification(context);
        b.m111a(context).a(Constants.a());
        b.m111a(context).a(strM112a, strB, strA);
        jn jnVar = new jn();
        jnVar.a(bc.b());
        jnVar.b(strM112a);
        jnVar.e(strB);
        jnVar.f(strA);
        jnVar.d(context.getPackageName());
        jnVar.c(com.xiaomi.push.g.m393a(context, context.getPackageName()));
        jnVar.b(com.xiaomi.push.g.a(context, context.getPackageName()));
        jnVar.h(BuildConfig.VERSION_NAME);
        jnVar.a(BuildConfig.VERSION_CODE);
        jnVar.a(jbVar);
        int iA = com.xiaomi.push.i.a();
        if (iA >= 0) {
            jnVar.c(iA);
        }
        ao.a(context).a(jnVar, false);
    }

    @Deprecated
    public static void registerCrashHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
    }

    private static void registerNetworkReceiver(Context context) {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            com.xiaomi.push.l.a(context.getApplicationContext(), new NetworkStatusReceiver(null), intentFilter, 2);
        } catch (Throwable th2) {
            com.xiaomi.channel.commonutils.logger.b.m62a("dynamic register network status receiver failed:" + th2);
        }
        bg.m174a(sContext);
    }

    public static void registerPush(Context context, String str, String str2) {
        registerPush(context, str, str2, new PushConfiguration());
    }

    public static void registerPush(Context context, String str, String str2, PushConfiguration pushConfiguration) {
        registerPush(context, str, str2, pushConfiguration, null, null);
    }

    private static void registerPush(Context context, final String str, final String str2, PushConfiguration pushConfiguration, final String str3, final ICallbackResult iCallbackResult) {
        checkNotNull(context, com.umeng.analytics.pro.d.R);
        checkNotNull(str, x9.b.f141156u);
        checkNotNull(str2, "appToken");
        Context applicationContext = context.getApplicationContext();
        sContext = applicationContext;
        if (applicationContext == null) {
            sContext = context;
        }
        Context context2 = sContext;
        C1339r.a(context2);
        if (!NetworkStatusReceiver.a()) {
            registerNetworkReceiver(sContext);
        }
        f.a(sContext).a(pushConfiguration);
        com.xiaomi.push.ah.a(context2).a(new Runnable() { // from class: com.xiaomi.mipush.sdk.MiPushClient.1
            @Override // java.lang.Runnable
            public void run() {
                MiPushClient.initialize(MiPushClient.sContext, str, str2, null, str3, iCallbackResult);
            }
        });
    }

    public static void registerPush(Context context, String str, String str2, String str3) {
        registerPush(context, str, str2, new PushConfiguration(), str3, null);
    }

    public static void registerToken(Context context, String str, String str2, String str3, UPSRegisterCallBack uPSRegisterCallBack) {
        registerPush(context, str, str2, new PushConfiguration(), null, uPSRegisterCallBack);
    }

    static synchronized void removeAcceptTime(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_extra", 0).edit();
        editorEdit.remove(Constants.EXTRA_KEY_ACCEPT_TIME);
        com.xiaomi.push.p.a(editorEdit);
    }

    static synchronized void removeAccount(Context context, String str) {
        context.getSharedPreferences("mipush_extra", 0).edit().remove("account_" + str).commit();
    }

    static synchronized void removeAlias(Context context, String str) {
        context.getSharedPreferences("mipush_extra", 0).edit().remove("alias_" + str).commit();
    }

    static synchronized void removeAllAccounts(Context context) {
        Iterator<String> it = getAllUserAccount(context).iterator();
        while (it.hasNext()) {
            removeAccount(context, it.next());
        }
    }

    static synchronized void removeAllAliases(Context context) {
        Iterator<String> it = getAllAlias(context).iterator();
        while (it.hasNext()) {
            removeAlias(context, it.next());
        }
    }

    static synchronized void removeAllTopics(Context context) {
        Iterator<String> it = getAllTopic(context).iterator();
        while (it.hasNext()) {
            removeTopic(context, it.next());
        }
    }

    static synchronized void removeTopic(Context context, String str) {
        context.getSharedPreferences("mipush_extra", 0).edit().remove("topic_" + str).commit();
    }

    public static void removeWindow(Context context) {
        ao.a(context).m110e();
    }

    public static void reportAppRunInBackground(Context context, boolean z10) {
        if (b.m111a(context).m118b()) {
            ix ixVar = z10 ? ix.APP_SLEEP : ix.APP_WAKEUP;
            jm jmVar = new jm();
            jmVar.b(b.m111a(context).m112a());
            jmVar.c(ixVar.f623a);
            jmVar.d(context.getPackageName());
            jmVar.a(bc.a());
            jmVar.a(false);
            ao.a(context).a(jmVar, in.Notification, false, (ja) null, false);
        }
    }

    static void reportIgnoreRegMessageClicked(Context context, String str, ja jaVar, String str2, String str3) {
        jm jmVar = new jm();
        if (TextUtils.isEmpty(str3)) {
            com.xiaomi.channel.commonutils.logger.b.d("do not report clicked message");
            return;
        }
        jmVar.b(str3);
        jmVar.c("bar:click");
        jmVar.a(str);
        jmVar.a(false);
        ao.a(context).a(jmVar, in.Notification, false, true, jaVar, true, str2, str3);
    }

    public static void reportMessageClicked(Context context, MiPushMessage miPushMessage) {
        ja jaVar = new ja();
        jaVar.a(miPushMessage.getMessageId());
        jaVar.b(miPushMessage.getTopic());
        jaVar.d(miPushMessage.getDescription());
        jaVar.c(miPushMessage.getTitle());
        jaVar.c(miPushMessage.getNotifyId());
        jaVar.a(miPushMessage.getNotifyType());
        jaVar.b(miPushMessage.getPassThrough());
        jaVar.a(miPushMessage.getExtra());
        reportMessageClicked(context, miPushMessage.getMessageId(), jaVar, null);
    }

    @Deprecated
    public static void reportMessageClicked(Context context, String str) {
        reportMessageClicked(context, str, null, null);
    }

    static void reportMessageClicked(Context context, String str, ja jaVar, String str2) {
        jm jmVar = new jm();
        if (!TextUtils.isEmpty(str2)) {
            jmVar.b(str2);
        } else {
            if (!b.m111a(context).m118b()) {
                com.xiaomi.channel.commonutils.logger.b.d("do not report clicked message");
                return;
            }
            jmVar.b(b.m111a(context).m112a());
        }
        jmVar.c("bar:click");
        jmVar.a(str);
        jmVar.a(false);
        ao.a(context).a(jmVar, in.Notification, false, jaVar);
    }

    public static void resumePush(Context context, String str) {
        setAcceptTime(context, 0, 0, 23, 59, str);
    }

    private static void scheduleDataCollectionJobs(Context context) {
        if (az.a(sContext).a(is.DataCollectionSwitch.a(), getDefaultSwitch())) {
            en.a().a(new r(context));
            com.xiaomi.push.ah.a(sContext).a(new Runnable() { // from class: com.xiaomi.mipush.sdk.MiPushClient.2
                @Override // java.lang.Runnable
                public void run() {
                    eo.a(MiPushClient.sContext);
                }
            }, 10);
        }
    }

    private static void scheduleOcVersionCheckJob() {
        com.xiaomi.push.ah.a(sContext).a(new ae(sContext), az.a(sContext).a(is.OcVersionCheckFrequency.a(), 86400), 5);
    }

    public static void setAcceptTime(Context context, int i10, int i11, int i12, int i13, String str) {
        if (i10 < 0 || i10 >= 24 || i12 < 0 || i12 >= 24 || i11 < 0 || i11 >= 60 || i13 < 0 || i13 >= 60) {
            throw new IllegalArgumentException("the input parameter is not valid.");
        }
        long rawOffset = ((TimeZone.getTimeZone("GMT+08").getRawOffset() - TimeZone.getDefault().getRawOffset()) / 1000) / 60;
        long j10 = ((((long) ((i10 * 60) + i11)) + rawOffset) + 1440) % 1440;
        long j11 = ((((long) ((i12 * 60) + i13)) + rawOffset) + 1440) % 1440;
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(j10 / 60), Long.valueOf(j10 % 60)));
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(j11 / 60), Long.valueOf(j11 % 60)));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(String.format("%1$02d:%2$02d", Integer.valueOf(i10), Integer.valueOf(i11)));
        arrayList2.add(String.format("%1$02d:%2$02d", Integer.valueOf(i12), Integer.valueOf(i13)));
        if (!acceptTimeSet(context, (String) arrayList.get(0), (String) arrayList.get(1))) {
            setCommand(context, fy.COMMAND_SET_ACCEPT_TIME.f447a, (ArrayList<String>) arrayList, str);
        } else if (1 == PushMessageHelper.getPushMode(context)) {
            PushMessageHandler.a(context, str, fy.COMMAND_SET_ACCEPT_TIME.f447a, 0L, null, arrayList2);
        } else {
            PushMessageHelper.sendCommandMessageBroadcast(context, PushMessageHelper.generateCommandMessage(fy.COMMAND_SET_ACCEPT_TIME.f447a, arrayList2, 0L, null, null, null));
        }
    }

    public static void setAlias(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setCommand(context, fy.COMMAND_SET_ALIAS.f447a, str, str2);
    }

    protected static void setCommand(Context context, String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
        }
        fy fyVar = fy.COMMAND_SET_ALIAS;
        if (fyVar.f447a.equalsIgnoreCase(str) && Math.abs(System.currentTimeMillis() - aliasSetTime(context, str2)) < 86400000) {
            if (1 == PushMessageHelper.getPushMode(context)) {
                PushMessageHandler.a(context, str3, str, 0L, null, arrayList);
                return;
            } else {
                PushMessageHelper.sendCommandMessageBroadcast(context, PushMessageHelper.generateCommandMessage(fyVar.f447a, arrayList, 0L, null, str3, null));
                return;
            }
        }
        if (fy.COMMAND_UNSET_ALIAS.f447a.equalsIgnoreCase(str) && aliasSetTime(context, str2) < 0) {
            com.xiaomi.channel.commonutils.logger.b.m62a("Don't cancel alias for " + bp.a(arrayList.toString(), 3) + " is unseted");
            return;
        }
        fy fyVar2 = fy.COMMAND_SET_ACCOUNT;
        if (fyVar2.f447a.equalsIgnoreCase(str) && Math.abs(System.currentTimeMillis() - accountSetTime(context, str2)) < 3600000) {
            if (1 == PushMessageHelper.getPushMode(context)) {
                PushMessageHandler.a(context, str3, str, 0L, null, arrayList);
                return;
            } else {
                PushMessageHelper.sendCommandMessageBroadcast(context, PushMessageHelper.generateCommandMessage(fyVar2.f447a, arrayList, 0L, null, str3, null));
                return;
            }
        }
        if (!fy.COMMAND_UNSET_ACCOUNT.f447a.equalsIgnoreCase(str) || accountSetTime(context, str2) >= 0) {
            setCommand(context, str, (ArrayList<String>) arrayList, str3);
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.m62a("Don't cancel account for " + bp.a(arrayList.toString(), 3) + " is unseted");
    }

    protected static void setCommand(Context context, String str, ArrayList<String> arrayList, String str2) {
        if (TextUtils.isEmpty(b.m111a(context).m112a())) {
            return;
        }
        jh jhVar = new jh();
        String strA = bc.a();
        jhVar.a(strA);
        jhVar.b(b.m111a(context).m112a());
        jhVar.c(str);
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            jhVar.m555a(it.next());
        }
        jhVar.e(str2);
        jhVar.d(context.getPackageName());
        com.xiaomi.channel.commonutils.logger.b.e("cmd:" + str + ", " + strA);
        ao.a(context).a(jhVar, in.Command, (ja) null);
    }

    public static void setLocalNotificationType(Context context, int i10) {
        ao.a(context).b(i10 & (-1));
    }

    public static void setUserAccount(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setCommand(context, fy.COMMAND_SET_ACCOUNT.f447a, str, str2);
    }

    private static boolean shouldPullNotification(Context context) {
        return Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_pull_notification", -1L)) > 300000;
    }

    private static boolean shouldSendRegRequest(Context context) {
        return Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_reg_request", -1L)) > 5000;
    }

    public static boolean shouldUseMIUIPush(Context context) {
        return ao.a(context).m104a();
    }

    public static void subscribe(Context context, String str, String str2) {
        if (TextUtils.isEmpty(b.m111a(context).m112a()) || TextUtils.isEmpty(str)) {
            return;
        }
        if (Math.abs(System.currentTimeMillis() - topicSubscribedTime(context, str)) <= 86400000) {
            if (1 == PushMessageHelper.getPushMode(context)) {
                PushMessageHandler.a(context, str2, 0L, null, str);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            PushMessageHelper.sendCommandMessageBroadcast(context, PushMessageHelper.generateCommandMessage(fy.COMMAND_SUBSCRIBE_TOPIC.f447a, arrayList, 0L, null, null, null));
            return;
        }
        jr jrVar = new jr();
        String strA = bc.a();
        jrVar.a(strA);
        jrVar.b(b.m111a(context).m112a());
        jrVar.c(str);
        jrVar.d(context.getPackageName());
        jrVar.e(str2);
        com.xiaomi.channel.commonutils.logger.b.e("cmd:" + fy.COMMAND_SUBSCRIBE_TOPIC + ", " + strA);
        ao.a(context).a(jrVar, in.Subscription, (ja) null);
    }

    @Deprecated
    public static void syncAssembleCOSPushToken(Context context) {
    }

    public static void syncAssembleFCMPushToken(Context context) {
        ao.a(context).a((String) null, au.UPLOAD_FCM_TOKEN, e.ASSEMBLE_PUSH_FCM, "");
    }

    @Deprecated
    public static void syncAssembleFTOSPushToken(Context context) {
    }

    @Deprecated
    public static void syncAssemblePushToken(Context context) {
    }

    public static long topicSubscribedTime(Context context, String str) {
        return context.getSharedPreferences("mipush_extra", 0).getLong("topic_" + str, -1L);
    }

    public static void turnOffPush(Context context, UPSTurnCallBack uPSTurnCallBack) {
        disablePush(context);
        if (uPSTurnCallBack != null) {
            CodeResult codeResult = new CodeResult();
            codeResult.setResultCode(0L);
            codeResult.getResultCode();
            uPSTurnCallBack.onResult(codeResult);
        }
    }

    public static void turnOnPush(Context context, UPSTurnCallBack uPSTurnCallBack) {
        enablePush(context);
        if (uPSTurnCallBack != null) {
            CodeResult codeResult = new CodeResult();
            codeResult.setResultCode(0L);
            codeResult.getResultCode();
            uPSTurnCallBack.onResult(codeResult);
        }
    }

    public static void unRegisterToken(Context context, UPSUnRegisterCallBack uPSUnRegisterCallBack) {
        unregisterPush(context);
        if (uPSUnRegisterCallBack != null) {
            TokenResult tokenResult = new TokenResult();
            tokenResult.setToken(null);
            tokenResult.getToken();
            tokenResult.setResultCode(0L);
            tokenResult.getResultCode();
            uPSUnRegisterCallBack.onResult(tokenResult);
        }
    }

    public static void unregisterPush(Context context) {
        i.c(context);
        az.a(context).a();
        if (b.m111a(context).m118b()) {
            jt jtVar = new jt();
            jtVar.a(bc.a());
            jtVar.b(b.m111a(context).m112a());
            jtVar.c(b.m111a(context).m119c());
            jtVar.e(b.m111a(context).b());
            jtVar.d(context.getPackageName());
            ao.a(context).a(jtVar);
            PushMessageHandler.a();
            PushMessageHandler.b();
            b.m111a(context).m117b();
            clearLocalNotificationType(context);
            clearNotification(context);
            clearExtras(context);
        }
    }

    public static void unsetAlias(Context context, String str, String str2) {
        setCommand(context, fy.COMMAND_UNSET_ALIAS.f447a, str, str2);
    }

    public static void unsetUserAccount(Context context, String str, String str2) {
        setCommand(context, fy.COMMAND_UNSET_ACCOUNT.f447a, str, str2);
    }

    public static void unsubscribe(Context context, String str, String str2) {
        if (b.m111a(context).m118b()) {
            if (topicSubscribedTime(context, str) < 0) {
                com.xiaomi.channel.commonutils.logger.b.m62a("Don't cancel subscribe for " + bp.a(str, 3) + " is unsubscribed");
                return;
            }
            jv jvVar = new jv();
            String strA = bc.a();
            jvVar.a(strA);
            jvVar.b(b.m111a(context).m112a());
            jvVar.c(str);
            jvVar.d(context.getPackageName());
            jvVar.e(str2);
            com.xiaomi.channel.commonutils.logger.b.e("cmd:" + fy.COMMAND_UNSUBSCRIBE_TOPIC + ", " + strA);
            ao.a(context).a(jvVar, in.UnSubscription, (ja) null);
        }
    }

    private static void updateImeiOrOaid() {
        new Thread(new Runnable() { // from class: com.xiaomi.mipush.sdk.MiPushClient.3
            @Override // java.lang.Runnable
            public void run() {
                if (com.xiaomi.push.j.m526d()) {
                    return;
                }
                if (com.xiaomi.push.i.c(MiPushClient.sContext) != null || ax.a(MiPushClient.sContext).mo151a()) {
                    jm jmVar = new jm();
                    jmVar.b(b.m111a(MiPushClient.sContext).m112a());
                    jmVar.c(ix.ClientInfoUpdate.f623a);
                    jmVar.a(bc.a());
                    jmVar.a(new HashMap());
                    String str = "";
                    String strC = com.xiaomi.push.i.c(MiPushClient.sContext);
                    if (!TextUtils.isEmpty(strC)) {
                        str = "" + bp.a(strC);
                    }
                    String strE = com.xiaomi.push.i.e(MiPushClient.sContext);
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(strE)) {
                        str = str + Constants.ACCEPT_TIME_SEPARATOR_SP + strE;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        jmVar.m580a().put(Constants.EXTRA_KEY_IMEI_MD5, str);
                    }
                    ax.a(MiPushClient.sContext).a(jmVar.m580a());
                    int iA = com.xiaomi.push.i.a();
                    if (iA >= 0) {
                        jmVar.m580a().put("space_id", Integer.toString(iA));
                    }
                    ao.a(MiPushClient.sContext).a(jmVar, in.Notification, false, (ja) null);
                }
            }
        }).start();
    }
}
