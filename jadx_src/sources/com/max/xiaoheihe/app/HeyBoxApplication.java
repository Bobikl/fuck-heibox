package com.max.xiaoheihe.app;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.Notification;
import android.content.Context;
import android.content.IntentFilter;
import android.net.http.HttpResponseCache;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.i0;
import com.bumptech.glide.Glide;
import com.google.gson.JsonObject;
import com.huawei.hms.hmsscankit.DetailRect;
import com.igexin.sdk.PushManager;
import com.ishumei.smantifraud.SmAntiFraud;
import com.jd.jdcache.JDCache;
import com.lzy.okgo.model.Progress;
import com.max.hbcoco.HBCoCoUtilKt;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.base.hblifeevent.activity.HBActivityLifecycleCallbacks;
import com.max.hbcommon.component.inappnotification.InAppNotificationManager;
import com.max.hbexpression.RecentEmojiManger;
import com.max.hbmmkv.MMKVManager;
import com.max.hbuikit.utils.UiKitTemplateManager;
import com.max.hbutils.core.BaseApplication;
import com.max.hbutils.utils.w;
import com.max.network.HBNetworkManager;
import com.max.security.SecurityTool;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.accelworld.AccelWorldScreenShotKt;
import com.max.xiaoheihe.bean.AdsInfoObj;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.flutter.HBMessageHandler;
import com.max.xiaoheihe.flutter.HBNetworkRequestExecutor;
import com.max.xiaoheihe.flutter.HBProtocolExecutor;
import com.max.xiaoheihe.loader.dynamic_so.DynamicSoManager;
import com.max.xiaoheihe.module.account.RegisterOrLoginActivityV2;
import com.max.xiaoheihe.module.ads.AdsActivity;
import com.max.xiaoheihe.module.copyedtoken.CopyedTokenManager;
import com.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.module.signin.SignInManager;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.max.xiaoheihe.okflutter.FlutterHelper;
import com.max.xiaoheihe.utils.l0;
import com.max.xiaoheihe.utils.m0;
import com.max.xiaoheihe.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.network.ImageEditorConfigProvider;
import com.tencent.msdk.dns.DnsConfig;
import com.tencent.msdk.dns.MSDKDnsResolver;
import com.tencent.rtmp.TXPlayerGlobalSetting;
import com.tencent.tauth.Tencent;
import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.message.PushAgent;
import com.umeng.message.UTrack;
import com.umeng.message.UmengMessageHandler;
import com.umeng.message.UmengNotificationClickHandler;
import com.umeng.message.api.UPushRegisterCallback;
import com.umeng.message.api.UPushSettingCallback;
import com.umeng.message.api.UPushThirdTokenCallback;
import com.umeng.message.entity.UMessage;
import com.umeng.socialize.PlatformConfig;
import com.umeng.umcrash.UMCrash;
import com.umeng.umcrash.UMCrashCallback;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import kotlin.b2;
import org.android.agoo.honor.HonorRegister;
import org.android.agoo.huawei.HuaWeiRegister;
import org.android.agoo.oppo.OppoRegister;
import org.android.agoo.vivo.VivoRegister;
import org.android.agoo.xiaomi.MiPushRegistar;
import yh.q;

/* JADX INFO: loaded from: classes3.dex */
public class HeyBoxApplication extends BaseApplication {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f76787i = 60000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static HeyBoxApplication f76788j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f76789k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f76790l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static long f76791m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static long f76792n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static long f76793o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static long f76794p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static boolean f76795q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static i0<Boolean> f76796r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final LinkedList<WeakReference<Activity>> f76797s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static i0<Boolean> f76798t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference<Activity> f76799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.max.hbcommon.analytics.n f76800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f76801e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Handler f76802f = new Handler();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f76803g = new h();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f76804h = new i();

    public class a implements Application.ActivityLifecycleCallbacks {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.app.HeyBoxApplication$a$a, reason: collision with other inner class name */
        public class C0622a implements com.max.hbcommon.analytics.n.a {
            public static ChangeQuickRedirect changeQuickRedirect;

            C0622a() {
            }

            /* JADX WARN: Code duplicated, block: B:15:0x0070  */
            @Override // com.max.hbcommon.analytics.n.a
            public void a(long j10, String str, String str2) {
                CharSequence title;
                if (PatchProxy.proxy(new Object[]{new Long(j10), str, str2}, this, changeQuickRedirect, false, bb.c.m.cG, new Class[]{Long.TYPE, String.class, String.class}, Void.TYPE).isSupported) {
                    return;
                }
                JsonObject jsonObject = new JsonObject();
                AccelWorldScreenShotKt.c(str2);
                com.max.hbcommon.analytics.l lVar = com.max.hbcommon.analytics.l.f66572a;
                com.max.hbcommon.analytics.d.f fVarB = lVar.b();
                if (fVarB instanceof BaseActivity) {
                    BaseActivity baseActivity = (BaseActivity) fVarB;
                    if (baseActivity.c1().getVisibility() == 0) {
                        title = baseActivity.c1().getTitle();
                    } else {
                        title = "";
                    }
                } else if (fVarB instanceof com.max.hbcommon.base.d) {
                    com.max.hbcommon.base.d dVar = (com.max.hbcommon.base.d) fVarB;
                    if (dVar.getTitleBar().getVisibility() == 0) {
                        title = dVar.getTitleBar().getTitle();
                    } else {
                        title = "";
                    }
                } else {
                    title = "";
                }
                if (fVarB != null) {
                    jsonObject.addProperty("class_name", fVarB.getClass().getSimpleName());
                    if (fVarB instanceof WebviewFragment) {
                        jsonObject.addProperty("page", ((WebviewFragment) fVarB).N6());
                    } else if (fVarB.getPagePath() != null) {
                        jsonObject.addProperty("page", fVarB.getPagePath());
                    }
                }
                if (title != null && !com.max.hbcommon.utils.c.u(title.toString())) {
                    jsonObject.addProperty("title", title.toString());
                }
                lVar.l(lb.d.I, jsonObject);
            }
        }

        public class b implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.dG, new Class[0], Void.TYPE).isSupported && "1".equals(com.max.hbcache.c.j(lb.a.f130931a1))) {
                    HeyBoxApplication.t(HeyBoxApplication.this);
                }
            }
        }

        a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (PatchProxy.proxy(new Object[]{activity, bundle}, this, changeQuickRedirect, false, bb.c.m.XF, new Class[]{Activity.class, Bundle.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!ad.a.a(ad.a.F, false)) {
                com.max.xiaoheihe.accelworld.h.a(activity);
            }
            boolean zB = Build.VERSION.SDK_INT >= 33 ? com.max.hbpermission.d.b(BaseApplication.a(), "android.permission.READ_MEDIA_IMAGES") : com.max.hbpermission.d.b(BaseApplication.a(), "android.permission.READ_EXTERNAL_STORAGE");
            if (HeyBoxApplication.this.f76800d == null && "1".equals(com.max.hbcache.c.j(lb.a.f130931a1)) && zB) {
                HeyBoxApplication.this.f76800d = new com.max.hbcommon.analytics.n(HeyBoxApplication.this.getContentResolver(), new C0622a());
            }
            HeyBoxApplication.f76797s.add(new WeakReference(activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, bb.c.m.bG, new Class[]{Activity.class}, Void.TYPE).isSupported) {
                return;
            }
            Iterator it = HeyBoxApplication.f76797s.iterator();
            while (it.hasNext()) {
                if (activity == ((WeakReference) it.next()).get()) {
                    it.remove();
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, bb.c.m.ZF, new Class[]{Activity.class}, Void.TYPE).isSupported) {
                return;
            }
            HeyBoxApplication.this.f76799c = new WeakReference(activity);
            com.max.hbutils.utils.e.b().d(activity);
            if ((activity instanceof MainActivity) && HeyBoxApplication.f76789k == 2) {
                ((MainActivity) activity).R3();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, bb.c.m.YF, new Class[]{Activity.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.heybox.hblog.g.W("onActivityStarted count = " + HeyBoxApplication.f76789k + "  activity=" + activity.getClass().getName());
            if (HeyBoxApplication.this.f76799c == null) {
                HeyBoxApplication.this.f76799c = new WeakReference(activity);
            }
            if (HeyBoxApplication.f76789k == 0) {
                if (HeyBoxApplication.this.f76800d != null) {
                    HeyBoxApplication.this.f76800d.c();
                }
                HeyBoxApplication.f76792n = System.currentTimeMillis();
                if ("1".equals(com.max.hbcache.c.j(lb.a.f130931a1))) {
                    com.max.heybox.hblog.g.W("onActivityStarted resumeRequest");
                    HeyBoxApplication.this.Y();
                }
                CopyedTokenManager.f83565a.c(activity, true);
                com.max.heybox.hblog.g.W("enter foreground");
                if (com.max.xiaoheihe.utils.i0.s() && "1".equals(com.max.hbcache.c.o("valid_ws", ""))) {
                    com.max.hbcommon.utils.d.b("zzzzconntest", "切回前台 尝试重连");
                    m0.x().G();
                }
                HeyBoxApplication.p(HeyBoxApplication.this, activity);
                if ("1".equals(com.max.hbcache.c.j(lb.a.f130931a1))) {
                    HeyBoxApplication.q(HeyBoxApplication.this);
                }
                if (activity instanceof com.max.xiaoheihe.app.c) {
                    ((com.max.xiaoheihe.app.c) activity).u(activity);
                }
                com.max.xiaoheihe.module.littleprogram.b.u(activity, false);
                HeyBoxApplication.this.f76802f.removeCallbacks(HeyBoxApplication.this.f76803g);
                HeyBoxApplication.this.f76802f.postDelayed(new b(), activity instanceof AdsActivity ? 10000 : 2000);
                long unused = HeyBoxApplication.f76793o = System.currentTimeMillis();
                long unused2 = HeyBoxApplication.f76794p = HeyBoxApplication.g(HeyBoxApplication.this);
                if (HeyBoxApplication.f76794p > 0) {
                    HeyBoxApplication.this.f76802f.postDelayed(HeyBoxApplication.this.f76804h, HeyBoxApplication.f76794p);
                }
            } else if (activity instanceof com.max.xiaoheihe.app.c) {
                ((com.max.xiaoheihe.app.c) activity).P(activity);
            }
            HeyBoxApplication.l();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, bb.c.m.aG, new Class[]{Activity.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.heybox.hblog.g.W("onActivityStopped count = " + HeyBoxApplication.f76789k + "  activity=" + activity.getClass().getName());
            bb.a.f30447b = activity.getClass().getSimpleName();
            HeyBoxApplication.m();
            if (HeyBoxApplication.f76789k != 0) {
                if (activity instanceof com.max.xiaoheihe.app.c) {
                    ((com.max.xiaoheihe.app.c) activity).b0(activity);
                    return;
                }
                return;
            }
            if (HeyBoxApplication.this.f76800d != null) {
                HeyBoxApplication.this.f76800d.d();
            }
            HeyBoxApplication.f76791m = System.currentTimeMillis();
            com.max.heybox.hblog.g.W("enter background");
            if (!m0.x().E()) {
                HeyBoxApplication.this.f76802f.postDelayed(HeyBoxApplication.this.f76803g, 60000L);
            }
            if (activity instanceof com.max.xiaoheihe.app.c) {
                ((com.max.xiaoheihe.app.c) activity).Y(activity);
            }
            if (HBCoCoUtilKt.f66169a && !(activity instanceof com.max.hbcoco.b)) {
                HBCoCoUtilKt.e();
            }
            com.max.xiaoheihe.module.littleprogram.b.u(activity, true);
            if (HeyBoxApplication.f76794p > 0) {
                if (HeyBoxApplication.f76793o > 0) {
                    HeyBoxApplication.i(HeyBoxApplication.this, System.currentTimeMillis() - HeyBoxApplication.f76793o);
                    long unused = HeyBoxApplication.f76793o = 0L;
                }
                HeyBoxApplication.this.f76802f.removeCallbacks(HeyBoxApplication.this.f76804h);
            }
            if (activity instanceof RegisterOrLoginActivityV2) {
                return;
            }
            com.max.hbcommon.utils.k.q();
        }
    }

    public class b implements UPushRegisterCallback {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.umeng.message.api.UPushRegisterCallback
        public void onFailure(String str, String str2) {
            if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, bb.c.m.fG, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.heybox.hblog.g.W("zzzzupush    注册失败：-------->  s:" + str + ",s1:" + str2);
        }

        @Override // com.umeng.message.api.UPushRegisterCallback
        public void onSuccess(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.m.eG, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.heybox.hblog.g.W("zzzzupush    注册成功：deviceToken：-------->  " + str);
            HeyBoxApplication.j(HeyBoxApplication.this);
        }
    }

    public class c extends UmengNotificationClickHandler {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.umeng.message.UmengNotificationClickHandler
        public void dealWithCustomAction(Context context, UMessage uMessage) {
            if (PatchProxy.proxy(new Object[]{context, uMessage}, this, changeQuickRedirect, false, bb.c.m.hG, new Class[]{Context.class, UMessage.class}, Void.TYPE).isSupported) {
                return;
            }
            String strP = com.max.hbutils.utils.k.p(uMessage.extra);
            com.max.heybox.hblog.g.W("zzzzupush    dealWithCustomAction  extra==" + strP);
            v.g(context, strP);
        }

        @Override // com.umeng.message.UmengNotificationClickHandler
        public void launchApp(Context context, UMessage uMessage) {
            if (PatchProxy.proxy(new Object[]{context, uMessage}, this, changeQuickRedirect, false, bb.c.m.gG, new Class[]{Context.class, UMessage.class}, Void.TYPE).isSupported) {
                return;
            }
            String strP = com.max.hbutils.utils.k.p(uMessage.extra);
            com.max.heybox.hblog.g.W("zzzzupush    launchApp  extra==" + strP);
            v.g(context, strP);
        }
    }

    public class d extends UmengMessageHandler {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ WebProtocolObj f76811b;

            a(WebProtocolObj webProtocolObj) {
                this.f76811b = webProtocolObj;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.jG, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.module.team.b.f92383a.d(this.f76811b);
            }
        }

        d() {
        }

        @Override // com.umeng.message.UmengMessageHandler
        public Notification getNotification(Context context, UMessage uMessage) {
            WebProtocolObj webProtocolObjE0;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, uMessage}, this, changeQuickRedirect, false, bb.c.m.iG, new Class[]{Context.class, UMessage.class}, Notification.class);
            if (patchProxyResultProxy.isSupported) {
                return (Notification) patchProxyResultProxy.result;
            }
            String strP = com.max.hbutils.utils.k.p(uMessage.extra);
            com.max.heybox.hblog.g.W("zzzzupush    getNotification  extra==" + strP);
            if (HeyBoxApplication.S() && "13".equals(com.max.hbutils.utils.k.e(strP, "id")) && (webProtocolObjE0 = l0.e0(com.max.hbutils.utils.k.e(strP, SwitchDetailActivity.P))) != null && "openChatRoom".equals(webProtocolObjE0.getProtocol_type())) {
                new Handler(Looper.getMainLooper()).post(new a(webProtocolObjE0));
            }
            return super.getNotification(context, uMessage);
        }
    }

    public class e implements UTrack.ICallBack {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.umeng.message.api.UPushAliasCallback
        public void onMessage(boolean z10, String str) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), str}, this, changeQuickRedirect, false, bb.c.m.kG, new Class[]{Boolean.TYPE, String.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.heybox.hblog.g.W("[UPush] addAlias: success: " + z10 + "message: " + str);
            com.max.heybox.hblog.g.W("zzzzupush    setAlias   " + str + "   isSuccess==" + z10);
        }
    }

    public class f implements q<String, String, Integer, b2> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f76814b;

        f(Context context) {
            this.f76814b = context;
        }

        public b2 a(String str, String str2, Integer num) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, num}, this, changeQuickRedirect, false, bb.c.m.lG, new Class[]{String.class, String.class, Integer.class}, b2.class);
            if (patchProxyResultProxy.isSupported) {
                return (b2) patchProxyResultProxy.result;
            }
            com.max.xiaoheihe.base.router.b.z0(com.max.xiaoheihe.router.b.f94894a.a(this.f76814b, str, str2));
            return null;
        }

        /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.b2] */
        @Override // yh.q
        public /* bridge */ /* synthetic */ b2 invoke(String str, String str2, Integer num) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, num}, this, changeQuickRedirect, false, bb.c.m.mG, new Class[]{Object.class, Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(str, str2, num);
        }
    }

    public class g extends com.sankuai.waimai.router.components.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.sankuai.waimai.router.components.f
        public void j(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.m.nG, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.j(th2);
        }
    }

    public class h implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.oG, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            m0.x().u();
        }
    }

    public class i implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.pG, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            HeyBoxApplication.i(HeyBoxApplication.this, HeyBoxApplication.f76794p);
            long unused = HeyBoxApplication.f76793o = System.currentTimeMillis();
            com.max.hbcommon.utils.k.r();
            if (HeyBoxApplication.S()) {
                HeyBoxApplication.this.f76802f.postDelayed(this, HeyBoxApplication.f76794p);
            }
        }
    }

    public class j implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.qG, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            com.lzy.okserver.b.o(com.lzy.okgo.db.g.Q().M());
        }
    }

    public class k implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements SmAntiFraud.IServerSmidCallback {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.ishumei.smantifraud.SmAntiFraud.IServerSmidCallback
            public void onError(int i10) {
                if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.tG, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("error_code", Integer.valueOf(i10));
                com.max.hbcommon.analytics.d.d("1", lb.d.O5, null, jsonObject);
            }

            @Override // com.ishumei.smantifraud.SmAntiFraud.IServerSmidCallback
            public void onSuccess(String str) {
                if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.m.sG, new Class[]{String.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.utils.h.j(str);
            }
        }

        public class b implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            public class a implements Runnable {
                public static ChangeQuickRedirect changeQuickRedirect;

                a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.vG, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    com.max.xiaoheihe.utils.h.f95396d = Boolean.TRUE;
                    com.max.xiaoheihe.utils.h.a();
                }
            }

            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.uG, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                new Thread(new a()).start();
            }
        }

        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.rG, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            SmAntiFraud.SmOption smOption = new SmAntiFraud.SmOption();
            smOption.setOrganization("0yD85BjYvGFAvHaSQ1mc");
            smOption.setAppId("default");
            smOption.setPublicKey("MIIDLzCCAhegAwIBAgIBMDANBgkqhkiG9w0BAQUFADAyMQswCQYDVQQGEwJDTjELMAkGA1UECwwCU00xFjAUBgNVBAMMDWUuaXNodW1laS5jb20wHhcNMjExMjA4MDMyNTI3WhcNNDExMjAzMDMyNTI3WjAyMQswCQYDVQQGEwJDTjELMAkGA1UECwwCU00xFjAUBgNVBAMMDWUuaXNodW1laS5jb20wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCQKQgwJ1F4XBck+ykcbsHZWnZDxBz5mKXYCXjQ4eOhg23KsJ3ZtjYqAfCb8aNp84tQt8Zifj9bJlAteYftUOtymrErYNiW4fpM3DD+alUI3OhmQ58OtM1iVU6/Rs2f0S1QjxrUvMEERvsndf1A1FSrzwgNtN+M1Nl1c6SlleRUWvEvU0rdjmH4GeckQljrcULkdEk2yJGBzelmnVsyFR9JhxncSbOnXRKbJOK2Ryykv4uheLPVN/PzLm6RIVB6gvDHvBFXvjU06/ako3qCmMxa/YfSH2WeXvDEUdocxRHOw4OgKTDy7Y6PRrhhyX4LdX5UmHtjNSOK4wFGJP4beJ2jAgMBAAGjUDBOMB0GA1UdDgQWBBRaECwGKd+HL63/tg0S2JIu7kyeDDAfBgNVHSMEGDAWgBRaECwGKd+HL63/tg0S2JIu7kyeDDAMBgNVHRMEBTADAQH/MA0GCSqGSIb3DQEBBQUAA4IBAQAylce67mjcaDT0cNnDDn/Nv117Ph1nNvvh/BYwnpeUQKb9Pv8hVqKDCCHt3LtoCI9DHEODBdCtQHkAyYtls7B7QbaOIU3XHmAifgAW621LKYZaBwgnRPZTx9HLy6GaaF1SUnfUNXKP6vxGFEboHPV+ltRl4DaflDsuk8xd1ONSk6B+5EUCm63IeWjp80SxFKI9EzT5ZjjfWBPZmFNxzIqR4cPnoE6n3oXx0HRW+1jquJ+Y7FP1TGXRACHqp6Bo0tfBps0nRnoigN+QcLoYHJYEAsGILfJLA+4Lrnl/Fr0H0dpIvK980xI5xEK5rqnqc5wzPijboo8RuLLIsqStmCT8");
            smOption.setArea(SmAntiFraud.AREA_BJ);
            SmAntiFraud.create(HeyBoxApplication.this, smOption);
            SmAntiFraud.registerServerIdCallback(new a());
            HeyBoxApplication.this.f76802f.postDelayed(new b(), 4000L);
        }
    }

    public class l implements UMCrashCallback {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // com.umeng.umcrash.UMCrashCallback
        public String onCallback() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.wG, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            return "versionCode:916\nheybox_id:" + com.max.xiaoheihe.utils.i0.j();
        }
    }

    public class m implements UPushSettingCallback {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // com.umeng.message.api.UPushSettingCallback
        public void onFailure(String str, String str2) {
            if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, bb.c.m.yG, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.heybox.hblog.g.W("zzzzupush    enable onFailure  s: " + str + "  s1: " + str2);
        }

        @Override // com.umeng.message.api.UPushSettingCallback
        public void onSuccess() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.xG, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            com.max.heybox.hblog.g.W("zzzzupush    enable onSuccess");
        }
    }

    public class n implements UPushThirdTokenCallback {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // com.umeng.message.api.UPushThirdTokenCallback
        public void onToken(String str, String str2) {
            if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, bb.c.m.zG, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.heybox.hblog.g.W("zzzzupush    type: " + str + "  token: " + str2);
            String strH = com.max.xiaoheihe.accelworld.q.h(str);
            StringBuilder sb2 = new StringBuilder();
            if (strH == null) {
                strH = "";
            }
            sb2.append(strH);
            sb2.append(str2);
            String string = sb2.toString();
            com.max.heybox.hblog.g.W("zzzzupush    getui setDevieToken: " + string);
            PushManager.getInstance().setDeviceToken(HeyBoxApplication.C(), string);
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f76796r = new i0<>(bool);
        f76797s = new LinkedList<>();
        f76798t = new i0<>(bool);
        com.max.xiaoheihe.view.smartrefresh.a.a();
    }

    public static void A() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.lF, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        for (WeakReference<Activity> weakReference : f76797s) {
            if (weakReference.get() != null) {
                weakReference.get().finish();
            }
        }
        System.exit(0);
    }

    public static String B(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.m.yF, new Class[]{Context.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        int iMyPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY);
        com.max.hbcommon.utils.d.b("getCurProcessName", "123");
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            com.max.hbcommon.utils.d.b("getCurProcessName", runningAppProcessInfo.processName);
            if (runningAppProcessInfo.pid == iMyPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return "";
    }

    public static HeyBoxApplication C() {
        return f76788j;
    }

    private long D() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.vF, new Class[0], Long.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Long) patchProxyResultProxy.result).longValue();
        }
        long jQ = ((long) com.max.hbutils.utils.n.q(com.max.hbcache.c.j("app_stay_duration_report_period_second"))) * 1000;
        com.max.hbcommon.utils.d.b("zzzzreport", "getReportInterval  ret =" + jQ);
        return jQ;
    }

    private static void G() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.qF, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if ("1".equals(v.e())) {
            com.max.hbcache.c.C("first_time", "1");
        } else {
            com.max.hbcache.c.C("first_time", "0");
        }
    }

    private void H() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.HF, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.W("PUSH_LOG initGetuiSdk");
        PushManager.getInstance().initialize(this);
    }

    private void I() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.QF, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        MSDKDnsResolver.getInstance().init(this, new DnsConfig.Builder().dnsId("14037").dnsKey("DrvXtbDABmu2YOMr").dnsIp("119.29.29.98").aesHttp().token("188591137").build());
    }

    private void J() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.PF, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        g8.a.b(com.github.piasy.biv.loader.glide.c.g(this));
        try {
            HttpResponseCache.install(new File(getApplicationContext().getCacheDir(), "http"), 134217728L);
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        com.max.hbcommon.utils.d.b("heyboxapp", lg.a.f131415h);
        SignInManager.DateChangeBroadcastReceiver dateChangeBroadcastReceiver = new SignInManager.DateChangeBroadcastReceiver();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.DATE_CHANGED");
        if (Build.VERSION.SDK_INT >= 26) {
            registerReceiver(dateChangeBroadcastReceiver, intentFilter, 2);
        } else {
            registerReceiver(dateChangeBroadcastReceiver, intentFilter);
        }
        G();
        com.max.hbexpression.f.f();
        RecentEmojiManger.f70167a.d();
        InAppNotificationManager.f67721a.r(this);
        com.max.xiaoheihe.module.analytics.a.c().d(this);
        JDCache jDCache = JDCache.INSTANCE;
        jDCache.init(this, false);
        jDCache.setGlobalParams(com.max.xiaoheihe.module.webview.b.class);
    }

    private void K(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.m.NF, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        SecurityTool.setKD("MFANEHAMGACOBHIEMIHIJLKJPMMHJMMLABCNGBPPENCENPOM", String.valueOf(System.currentTimeMillis()));
        HBNetworkManager.getInstance().setConfig(new com.max.xiaoheihe.network.c());
        HBNetworkManager.getInstance().setConfig(new ImageEditorConfigProvider());
        HBNetworkManager.getInstance().setConfig(new hf.b());
        com.max.hbimage.image.l.b(context);
        com.previewlibrary.b.a().c(new com.max.hbimage.preview.b());
    }

    private void L() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.CF, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.lzy.okgo.b.p().t(this);
        com.lzy.okserver.b.c().p(com.max.xiaoheihe.utils.d.y());
        com.lzy.okserver.b.c().f().d(3);
        X();
    }

    private void M(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.m.rF, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        com.sankuai.waimai.router.core.c.l(new g());
        com.sankuai.waimai.router.core.c.k(false);
        com.sankuai.waimai.router.core.c.j(false);
        com.max.xiaoheihe.router.a aVar = new com.max.xiaoheihe.router.a(context);
        aVar.u(com.sankuai.waimai.router.components.g.f96466g);
        hg.b.n(aVar);
    }

    private void O() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.DF, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        new Thread(new k()).start();
    }

    private void R() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.MF, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        File file = new File(DynamicSoManager.f77251f);
        Log.d("HBLog", "Path is " + file.getAbsolutePath() + " CPU ARC is: " + Arrays.toString(Build.SUPPORTED_ABIS));
        if (!file.exists()) {
            file.mkdir();
        }
        ff.b.f118841a.a(this, file);
    }

    public static boolean S() {
        return f76789k > 0;
    }

    private void U() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.LF, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Iterator<Map.Entry<String, com.lzy.okserver.download.b>> it = com.max.xiaoheihe.module.game.c.b().entrySet().iterator();
        while (it.hasNext()) {
            Progress progress = it.next().getValue().f64853b;
            if (progress.f64785k == 5) {
                Serializable serializable = progress.f64789o;
                if (serializable instanceof GameObj) {
                    GameObj gameObj = (GameObj) serializable;
                    if (gameObj.isAuto_download() && progress.f64791q == null) {
                        progress.f64791q = "1";
                        com.lzy.okgo.db.g.Q().B(progress);
                        r1.g2(this, progress.f64779e, gameObj.getName(), gameObj.getAppicon());
                    }
                }
            }
        }
    }

    private void V() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.FF, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        MiPushRegistar.register(this, com.max.xiaoheihe.utils.d.z(this, "xiaoheihe.xiaomi_appid"), com.max.xiaoheihe.utils.d.z(this, "xiaoheihe.xiaomi_appkey"));
        HuaWeiRegister.register(this);
        VivoRegister.register(this);
        OppoRegister.register(this, com.max.xiaoheihe.utils.d.z(this, "com.oppo.push.appkey"), com.max.xiaoheihe.utils.d.z(this, "com.oppo.push.appsecret"));
        HonorRegister.register(this);
    }

    private void W(long j10) {
        if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, bb.c.m.wF, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzreport", "reportAppDurationEvent  dutation=" + j10);
        if (j10 > 0) {
            com.max.hbcommon.analytics.d.C(j10);
        }
    }

    private void X() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.AF, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        new Thread(new j()).start();
    }

    static /* synthetic */ long g(HeyBoxApplication heyBoxApplication) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{heyBoxApplication}, null, changeQuickRedirect, true, bb.c.m.UF, new Class[]{HeyBoxApplication.class}, Long.TYPE);
        return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : heyBoxApplication.D();
    }

    static /* synthetic */ void i(HeyBoxApplication heyBoxApplication, long j10) {
        if (PatchProxy.proxy(new Object[]{heyBoxApplication, new Long(j10)}, null, changeQuickRedirect, true, bb.c.m.VF, new Class[]{HeyBoxApplication.class, Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        heyBoxApplication.W(j10);
    }

    static /* synthetic */ void j(HeyBoxApplication heyBoxApplication) {
        if (PatchProxy.proxy(new Object[]{heyBoxApplication}, null, changeQuickRedirect, true, bb.c.m.WF, new Class[]{HeyBoxApplication.class}, Void.TYPE).isSupported) {
            return;
        }
        heyBoxApplication.V();
    }

    static /* synthetic */ int l() {
        int i10 = f76789k;
        f76789k = i10 + 1;
        return i10;
    }

    static /* synthetic */ int m() {
        int i10 = f76789k;
        f76789k = i10 - 1;
        return i10;
    }

    static /* synthetic */ void p(HeyBoxApplication heyBoxApplication, Activity activity) {
        if (PatchProxy.proxy(new Object[]{heyBoxApplication, activity}, null, changeQuickRedirect, true, bb.c.m.RF, new Class[]{HeyBoxApplication.class, Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        heyBoxApplication.z(activity);
    }

    static /* synthetic */ void q(HeyBoxApplication heyBoxApplication) {
        if (PatchProxy.proxy(new Object[]{heyBoxApplication}, null, changeQuickRedirect, true, bb.c.m.SF, new Class[]{HeyBoxApplication.class}, Void.TYPE).isSupported) {
            return;
        }
        heyBoxApplication.x();
    }

    static /* synthetic */ void t(HeyBoxApplication heyBoxApplication) {
        if (PatchProxy.proxy(new Object[]{heyBoxApplication}, null, changeQuickRedirect, true, bb.c.m.TF, new Class[]{HeyBoxApplication.class}, Void.TYPE).isSupported) {
            return;
        }
        heyBoxApplication.U();
    }

    private void x() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.zF, new Class[0], Void.TYPE).isSupported && com.max.hbcommon.utils.i.e(this)) {
            com.max.xiaoheihe.module.game.b.o();
        }
    }

    private void y() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.pF, new Class[0], Void.TYPE).isSupported && "1".equals(com.max.hbcache.c.j(lb.a.f130931a1))) {
            String strB = B(getApplicationContext());
            if (getApplicationInfo().packageName.equals(strB)) {
                T();
                P();
                N();
            }
            com.max.xiaoheihe.app.e.b(this, strB);
        }
    }

    private void z(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, bb.c.m.JF, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        AdsInfoObj adsInfoObjG = com.max.xiaoheihe.module.ads.b.g(false);
        if ((adsInfoObjG == null || f76792n - f76791m <= w.U(adsInfoObjG.getShow_interval()) || com.max.xiaoheihe.module.ads.c.b(activity)) ? false : true) {
            activity.startActivity(AdsActivity.R1(activity));
        }
    }

    public Activity E() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.KF, new Class[0], Activity.class);
        if (patchProxyResultProxy.isSupported) {
            return (Activity) patchProxyResultProxy.result;
        }
        WeakReference<Activity> weakReference = this.f76799c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public void F() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.nF, new Class[0], Void.TYPE).isSupported && "1".equals(com.max.hbcache.c.j(lb.a.f130931a1))) {
            SecurityTool.resetVA();
            String strU = com.max.xiaoheihe.utils.d.U();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strU);
            sb2.append(com.max.xiaoheihe.utils.i0.s() ? com.max.xiaoheihe.utils.i0.j() : "-1");
            com.max.hbcache.c.K(sb2.toString());
            com.max.hbcache.c.C(DetailRect.CP_PACKAGE, com.max.xiaoheihe.utils.d.c0(this));
            Log.d("HBSecurity", "DeviceID:" + com.max.hbcache.c.g());
        }
    }

    public void N() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.BF, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        L();
        O();
        I();
        Q();
        Z();
    }

    public void P() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.EF, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        UMConfigure.init(this, com.max.xiaoheihe.utils.d.z(this, "UMENG_APPKEY"), com.max.xiaoheihe.utils.d.t0(), 1, com.max.xiaoheihe.utils.d.z(this, "UMENG_MSG_SECRET"));
        MobclickAgent.setPageCollectionMode(MobclickAgent.PageMode.LEGACY_AUTO);
        UMCrash.registerUMCrashCallback(new l());
        PushAgent pushAgent = PushAgent.getInstance(this);
        pushAgent.setPackageListenerEnable(false);
        pushAgent.enable(new m());
        pushAgent.setResourcePackageName(com.max.xiaoheihe.utils.d.c0(this));
        pushAgent.setDisplayNotificationNumber(0);
        pushAgent.setPullUpEnable(false);
        pushAgent.setThirdTokenCallback(new n());
        pushAgent.register(new b());
        pushAgent.setNotificationClickHandler(new c());
        pushAgent.setMessageHandler(new d());
        pushAgent.addAlias(com.max.xiaoheihe.utils.d.U(), "heybox_device", new e());
        PlatformConfig.setWeixin(com.max.xiaoheihe.utils.d.z(this, "xiaoheihe.weixin_appid"), com.max.xiaoheihe.utils.d.z(this, "xiaoheihe.weixin_appsecret"));
        PlatformConfig.setWXFileProvider("com.max.xiaoheihe.fileprovider");
        PlatformConfig.setSinaWeibo(com.max.xiaoheihe.utils.d.z(this, "xiaoheihe.weibo_appkey"), com.max.xiaoheihe.utils.d.z(this, "xiaoheihe.weibo_appsecret"), "http://sns.whalecloud.com");
        PlatformConfig.setSinaFileProvider("com.max.xiaoheihe.fileprovider");
        PlatformConfig.setQQZone(com.max.xiaoheihe.utils.d.z(this, "xiaoheihe.qq_appid"), com.max.xiaoheihe.utils.d.z(this, "xiaoheihe.qq_appkey"));
        PlatformConfig.setQQFileProvider("com.max.xiaoheihe.fileprovider");
        Tencent.setIsPermissionGranted(true);
        p7.d.c(new p7.b(com.max.xiaoheihe.utils.d.z(this, "xiaoheihe.douyin_app_key")));
    }

    public void Q() {
        File externalFilesDir;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.IF, new Class[0], Void.TYPE).isSupported || (externalFilesDir = getApplicationContext().getExternalFilesDir(null)) == null) {
            return;
        }
        TXPlayerGlobalSetting.setCacheFolderPath(externalFilesDir.getPath() + "/HBPlayerCache");
        TXPlayerGlobalSetting.setMaxCacheSize(400);
    }

    public void T() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.OF, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        FlutterHelper.getInstance().initFlutter(this, new f(this));
        FlutterHelper.getInstance().setNetworkRequestExecutor(new HBNetworkRequestExecutor());
        FlutterHelper.getInstance().setProtocolExecutor(new HBProtocolExecutor());
        FlutterHelper.getInstance().setMessageHandler(new HBMessageHandler());
    }

    public void Y() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.sF, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String strJ = com.max.hbcache.c.j(com.max.hbcache.c.f66160z);
        String strJ2 = com.max.hbcache.c.j(com.max.hbcache.c.A);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - (!TextUtils.isEmpty(strJ) ? Long.parseLong(strJ) : 0L) >= 5000) {
            com.max.hbcache.c.z(com.max.hbcache.c.f66160z, System.currentTimeMillis() + "");
            com.max.xiaoheihe.app.a.f().h();
        }
        if (jCurrentTimeMillis - (TextUtils.isEmpty(strJ2) ? 0L : Long.parseLong(strJ2)) >= 7200000) {
            com.max.hbcache.c.z(com.max.hbcache.c.A, System.currentTimeMillis() + "");
            com.max.xiaoheihe.app.a.f().i();
        }
    }

    public void Z() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.GF, new Class[0], Void.TYPE).isSupported || this.f76801e) {
            return;
        }
        this.f76801e = true;
        H();
    }

    @Override // com.max.hbutils.core.BaseApplication, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.m.xF, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        super.attachBaseContext(context);
        androidx.multidex.b.l(this);
    }

    @Override // android.app.Application
    public void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.oF, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onCreate();
        f76788j = this;
        com.max.xiaoheihe.utils.d.g1();
        SecurityTool.setKA(getCacheDir().getAbsolutePath());
        F();
        K(this);
        M(this);
        R();
        MMKVManager.f71329a.j(this);
        com.max.hbresource.a.f71893a.c(this);
        registerActivityLifecycleCallbacks(new a());
        registerActivityLifecycleCallbacks(new HBActivityLifecycleCallbacks());
        com.max.hbcommon.network.b.f68053j = "hk".equals(com.max.hbcache.c.j("mall_region"));
        UMConfigure.preInit(this, com.max.xiaoheihe.utils.d.z(this, "UMENG_APPKEY"), com.max.xiaoheihe.utils.d.t0());
        y();
        J();
        UiKitTemplateManager.f();
        com.max.xiaoheihe.dynamic_so.a.b();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onLowMemory() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.uF, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onLowMemory();
        Glide.e(this).c();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.tF, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.onTrimMemory(i10);
        if (i10 >= 60) {
            Glide.e(this).c();
        }
    }

    public void w() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.mF, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcache.c.z(lb.a.f130931a1, "1");
        C().F();
        C().T();
        C().Y();
        C().P();
        C().N();
    }
}
