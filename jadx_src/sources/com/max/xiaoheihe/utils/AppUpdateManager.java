package com.max.xiaoheihe.utils;

import android.app.Activity;
import android.app.Dialog;
import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.text.SpannableStringBuilder;
import android.text.format.Formatter;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import androidx.lifecycle.Lifecycle;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.BetaTestInfo;
import com.max.xiaoheihe.bean.account.CheckVersionObj;
import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.o4;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes13.dex */
public class AppUpdateManager {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final char[] f95199q = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f95200r = "app_update_task_id";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f95201s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f95202t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f95203u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f95204v = 3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static volatile AppUpdateManager f95205w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f95206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s f95207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DownloadManager f95208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f95209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SharedPreferences f95210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CompleteBroadcastReceiver f95211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private r f95212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ExecutorService f95213h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicInteger f95214i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private WeakReference<Dialog> f95215j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private WeakReference<Dialog> f95216k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private WeakReference<Dialog> f95217l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private WeakReference<View> f95218m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private WeakReference<Dialog> f95219n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private WeakReference<Dialog> f95220o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<WeakReference<Dialog>> f95221p;

    public class AppUpdateManagerLifeCycleObserver implements androidx.lifecycle.x {
        public static ChangeQuickRedirect changeQuickRedirect;

        public AppUpdateManagerLifeCycleObserver() {
        }

        @androidx.lifecycle.k0(Lifecycle.Event.ON_DESTROY)
        public void onActivityDestory() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48483, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            AppUpdateManager.this.s();
        }
    }

    public class CompleteBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private CompleteBroadcastReceiver() {
        }

        /* synthetic */ CompleteBroadcastReceiver(AppUpdateManager appUpdateManager, i iVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 48484, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported && intent.getLongExtra("extra_download_id", -1L) == AppUpdateManager.this.f95209d) {
                AppUpdateManager.l(AppUpdateManager.this);
            }
        }
    }

    public class a implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 48461, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 48462, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            AppUpdateManager.l(AppUpdateManager.this);
            dialogInterface.dismiss();
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            Activity activity;
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 48463, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported || (activity = (Activity) AppUpdateManager.this.f95206a.get()) == null) {
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(AppUpdateManager.this.f95207b.getUrl()));
            if (intent.resolveActivity(activity.getPackageManager()) != null) {
                activity.startActivity(intent);
            } else {
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(activity.getString(R.string.download_apk_failed_tips));
            }
            dialogInterface.dismiss();
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            Activity activity;
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 48464, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported || (activity = (Activity) AppUpdateManager.this.f95206a.get()) == null) {
                return;
            }
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", "com.android.providers.downloads", null));
            if (intent.resolveActivity(activity.getPackageManager()) != null) {
                activity.startActivity(intent);
            } else {
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(activity.getString(R.string.download_apk_failed_tips));
            }
            dialogInterface.dismiss();
        }
    }

    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.app.c f95228b;

        e(androidx.appcompat.app.c cVar) {
            this.f95228b = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 48465, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f95228b.dismiss();
        }
    }

    public class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.app.c f95229b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AppCompatActivity f95230c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ BetaTestInfo f95231d;

        f(androidx.appcompat.app.c cVar, AppCompatActivity appCompatActivity, BetaTestInfo betaTestInfo) {
            this.f95229b = cVar;
            this.f95230c = appCompatActivity;
            this.f95231d = betaTestInfo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 48466, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f95229b.dismiss();
            AppUpdateManager.b(this.f95230c, this.f95231d);
        }
    }

    public class g implements s {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CheckVersionObj f95232a;

        g(CheckVersionObj checkVersionObj) {
            this.f95232a = checkVersionObj;
        }

        @Override // com.max.xiaoheihe.utils.AppUpdateManager.s
        public String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48470, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : this.f95232a.getMd5();
        }

        @Override // com.max.xiaoheihe.utils.AppUpdateManager.s
        public String getDescription() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48468, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : this.f95232a.getMsg();
        }

        @Override // com.max.xiaoheihe.utils.AppUpdateManager.s
        public String getName() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48467, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : this.f95232a.getVersion();
        }

        @Override // com.max.xiaoheihe.utils.AppUpdateManager.s
        public String getUrl() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48469, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : this.f95232a.getAddress();
        }
    }

    public class h implements s {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BetaTestInfo f95233a;

        h(BetaTestInfo betaTestInfo) {
            this.f95233a = betaTestInfo;
        }

        @Override // com.max.xiaoheihe.utils.AppUpdateManager.s
        public String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48474, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : this.f95233a.getMd5();
        }

        @Override // com.max.xiaoheihe.utils.AppUpdateManager.s
        public String getDescription() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48472, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : this.f95233a.getTest_desc();
        }

        @Override // com.max.xiaoheihe.utils.AppUpdateManager.s
        public String getName() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48471, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : this.f95233a.getVersion();
        }

        @Override // com.max.xiaoheihe.utils.AppUpdateManager.s
        public String getUrl() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48473, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : this.f95233a.getPackage_url();
        }
    }

    public class i extends com.max.hbcommon.network.d<Result<CheckVersionObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f95234b;

        i(Context context) {
            this.f95234b = context;
        }

        public void onNext(Result<CheckVersionObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 48459, new Class[]{Result.class}, Void.TYPE).isSupported || result == null || !(this.f95234b instanceof AppCompatActivity)) {
                return;
            }
            CheckVersionObj result2 = result.getResult();
            if (result2.getBeta_test() != null) {
                AppUpdateManager.B((AppCompatActivity) this.f95234b, result2.getBeta_test());
            } else if ("1".equals(result2.getNeed_update()) && "1".equals(result2.getForce_push())) {
                AppUpdateManager.v((AppCompatActivity) this.f95234b, result2);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 48460, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<CheckVersionObj>) obj);
        }
    }

    public class j implements ThreadFactory {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{runnable}, this, changeQuickRedirect, false, 48475, new Class[]{Runnable.class}, Thread.class);
            if (patchProxyResultProxy.isSupported) {
                return (Thread) patchProxyResultProxy.result;
            }
            Thread thread = new Thread(runnable);
            thread.setName("query-" + AppUpdateManager.this.f95214i.getAndIncrement());
            return thread;
        }
    }

    public class k implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48476, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = AppUpdateManager.this.f95208c.query(new DownloadManager.Query().setFilterById(AppUpdateManager.this.f95209d));
                    if (cursorQuery != null && cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("local_uri"));
                        Activity activity = (Activity) AppUpdateManager.this.f95206a.get();
                        if (activity == null) {
                            cursorQuery.close();
                            return;
                        }
                        Intent intent = new Intent("android.intent.action.VIEW");
                        File file = new File(new URI(string));
                        if (Build.VERSION.SDK_INT >= 24) {
                            intent.setDataAndType(FileProvider.f(activity, "com.max.xiaoheihe.fileprovider", file), "application/vnd.android.package-archive");
                            intent.addFlags(1);
                        } else {
                            intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
                        }
                        intent.addFlags(268435456);
                        if (intent.resolveActivity(activity.getPackageManager()) != null) {
                            activity.startActivity(intent);
                        }
                    }
                    if (cursorQuery == null) {
                        return;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                    if (cursorQuery == null) {
                        return;
                    }
                }
                cursorQuery.close();
            } catch (Throwable th2) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th2;
            }
        }
    }

    public class l implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48477, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = AppUpdateManager.this.f95208c.query(new DownloadManager.Query().setFilterById(AppUpdateManager.this.f95209d));
                    if (cursorQuery == null) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                            return;
                        }
                        return;
                    }
                    if (cursorQuery.moveToFirst()) {
                        int i10 = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("bytes_so_far"));
                        int i11 = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("total_size"));
                        int i12 = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("status"));
                        Message messageObtainMessage = AppUpdateManager.this.f95212g.obtainMessage(2);
                        messageObtainMessage.arg1 = i10;
                        messageObtainMessage.arg2 = i11;
                        messageObtainMessage.obj = Integer.valueOf(i12);
                        AppUpdateManager.this.f95212g.sendMessage(messageObtainMessage);
                        if (1 == i12 || 2 == i12 || 4 == i12) {
                            AppUpdateManager.this.f95212g.sendEmptyMessageDelayed(1, 500L);
                        } else if (8 == i12) {
                            AppUpdateManager.this.f95212g.removeMessages(1);
                        } else if (16 == i12) {
                            cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("reason"));
                            AppUpdateManager.this.f95212g.removeMessages(1);
                        }
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                    if (0 == 0) {
                        return;
                    }
                }
                cursorQuery.close();
            } catch (Throwable th2) {
                if (0 != 0) {
                    cursorQuery.close();
                }
                throw th2;
            }
        }
    }

    public class m implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 48478, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class n implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 48479, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            AppUpdateManager.j(AppUpdateManager.this);
            dialogInterface.dismiss();
        }
    }

    public class o implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 48480, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            AppUpdateManager.this.f95208c.remove(AppUpdateManager.this.f95209d);
            AppUpdateManager.this.f95210e.edit().putLong(AppUpdateManager.f95200r, -1L).apply();
            dialogInterface.dismiss();
        }
    }

    public class p implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 48481, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class q implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 48482, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            AppUpdateManager.this.f95208c.remove(AppUpdateManager.this.f95209d);
            AppUpdateManager.this.f95210e.edit().putLong(AppUpdateManager.f95200r, -1L).apply();
            AppUpdateManager.this.J();
            dialogInterface.dismiss();
        }
    }

    public static class r extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<AppUpdateManager> f95243a;

        public r(AppUpdateManager appUpdateManager) {
            this.f95243a = new WeakReference<>(appUpdateManager);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 48485, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            super.handleMessage(message);
            AppUpdateManager appUpdateManager = this.f95243a.get();
            if (appUpdateManager != null) {
                int i10 = message.what;
                if (i10 == 1) {
                    AppUpdateManager.c(appUpdateManager);
                } else if (i10 == 2) {
                    AppUpdateManager.d(appUpdateManager, ((Integer) message.obj).intValue(), message.arg1, message.arg2);
                } else {
                    if (i10 != 3) {
                        return;
                    }
                    AppUpdateManager.e(appUpdateManager, (String) message.obj);
                }
            }
        }
    }

    public interface s {
        String a();

        String getDescription();

        String getName();

        String getUrl();
    }

    private AppUpdateManager(AppCompatActivity appCompatActivity, s sVar) {
        this.f95206a = new WeakReference<>(appCompatActivity);
        appCompatActivity.getLifecycle().a(new AppUpdateManagerLifeCycleObserver());
        this.f95207b = sVar;
        this.f95208c = (DownloadManager) appCompatActivity.getSystemService(ChannelsDetailActivity.f79595e4);
        this.f95210e = PreferenceManager.getDefaultSharedPreferences(appCompatActivity);
        this.f95212g = new r(this);
        this.f95214i = new AtomicInteger(1);
        this.f95213h = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(1024), new j(), new ThreadPoolExecutor.AbortPolicy());
    }

    private void A() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48436, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f95213h.execute(new l());
    }

    public static void B(AppCompatActivity appCompatActivity, BetaTestInfo betaTestInfo) {
        if (PatchProxy.proxy(new Object[]{appCompatActivity, betaTestInfo}, null, changeQuickRedirect, true, 48449, new Class[]{AppCompatActivity.class, BetaTestInfo.class}, Void.TYPE).isSupported || appCompatActivity == null || appCompatActivity.isFinishing()) {
            return;
        }
        androidx.appcompat.app.c.a aVar = new androidx.appcompat.app.c.a(appCompatActivity);
        o4 o4VarC = o4.c(LayoutInflater.from(appCompatActivity));
        o4VarC.f114089g.setText(betaTestInfo.getVersion());
        o4VarC.f114086d.setText(betaTestInfo.getTest_desc());
        androidx.appcompat.app.c cVarCreate = aVar.setView(o4VarC.b()).b(true).create();
        o4VarC.f114085c.setOnClickListener(new e(cVarCreate));
        o4VarC.f114087e.setBackground(com.max.hbutils.utils.q.h(appCompatActivity, ViewUtils.h0(appCompatActivity, ViewUtils.o(appCompatActivity, o4VarC.f114091i))));
        o4VarC.f114087e.setOnClickListener(new f(cVarCreate, appCompatActivity, betaTestInfo));
        cVarCreate.getWindow().setBackgroundDrawableResource(R.color.transparent);
        cVarCreate.show();
        if (appCompatActivity instanceof BaseActivity) {
            ((BaseActivity) appCompatActivity).N0(cVarCreate);
        }
    }

    private void C() {
        Activity activity;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48438, new Class[0], Void.TYPE).isSupported || (activity = this.f95206a.get()) == null || activity.isFinishing()) {
            return;
        }
        WeakReference<Dialog> weakReference = this.f95215j;
        if (weakReference == null || weakReference.get() == null) {
            WeakReference<Dialog> weakReference2 = new WeakReference<>(new com.max.hbcommon.view.a.f(activity).x(R.string.new_version_ready).l(this.f95207b.getDescription()).t(R.string.update, new n()).n(R.string.cancel, new m()).d());
            this.f95215j = weakReference2;
            n(weakReference2);
        }
        Dialog dialog = this.f95215j.get();
        if (dialog != null) {
            dialog.show();
        }
    }

    private void D() {
        Activity activity;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48443, new Class[0], Void.TYPE).isSupported || (activity = this.f95206a.get()) == null || activity.isFinishing()) {
            return;
        }
        WeakReference<Dialog> weakReference = this.f95216k;
        if (weakReference == null || weakReference.get() == null) {
            WeakReference<Dialog> weakReference2 = new WeakReference<>(new com.max.hbcommon.view.a.f(activity).x(R.string.prompt).k(R.string.download_manager_disable_tips).t(R.string.go_to_settings, new d()).n(R.string.download_by_browser, new c()).d());
            this.f95216k = weakReference2;
            n(weakReference2);
        }
        Dialog dialog = this.f95216k.get();
        if (dialog != null) {
            dialog.show();
        }
    }

    private void E() {
        Activity activity;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48442, new Class[0], Void.TYPE).isSupported || (activity = this.f95206a.get()) == null || activity.isFinishing()) {
            return;
        }
        WeakReference<Dialog> weakReference = this.f95219n;
        if (weakReference == null || weakReference.get() == null) {
            WeakReference<Dialog> weakReference2 = new WeakReference<>(new com.max.hbcommon.view.a.f(activity).y(String.format(activity.getString(R.string.update_app_tips_title), this.f95207b.getName())).k(R.string.update_app_tips_desc).t(R.string.install_app, new b()).n(R.string.cancel, new a()).d());
            this.f95219n = weakReference2;
            n(weakReference2);
        }
        Dialog dialog = this.f95219n.get();
        if (dialog != null) {
            dialog.show();
        }
    }

    private void F(int i10, int i11, int i12) {
        Activity activity;
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 48437, new Class[]{cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (1 == i10 || 2 == i10 || 4 == i10) {
            G(i11, i12);
            return;
        }
        if (8 == i10) {
            u();
            E();
        } else {
            if (16 != i10 || (activity = this.f95206a.get()) == null) {
                return;
            }
            u();
            H(activity.getString(R.string.download_manager_failed_tips));
        }
    }

    private void G(int i10, int i11) {
        Activity activity;
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 48439, new Class[]{cls, cls}, Void.TYPE).isSupported || (activity = this.f95206a.get()) == null || activity.isFinishing()) {
            return;
        }
        WeakReference<Dialog> weakReference = this.f95217l;
        if (weakReference == null || weakReference.get() == null) {
            View viewInflate = LayoutInflater.from(activity).inflate(R.layout.layout_download_progress, (ViewGroup) null);
            this.f95218m = new WeakReference<>(viewInflate);
            viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            WeakReference<Dialog> weakReference2 = new WeakReference<>(new com.max.hbcommon.view.a.f(activity).y(activity.getString(R.string.download_heybox)).i(viewInflate).n(R.string.cancel, new o()).g(false).d());
            this.f95217l = weakReference2;
            n(weakReference2);
        }
        float f10 = (i10 == -1 || i11 == -1) ? 0.0f : (i10 * 1.0f) / i11;
        WeakReference<View> weakReference3 = this.f95218m;
        View view = weakReference3 != null ? weakReference3.get() : null;
        if (view != null) {
            String fileSize = i10 == -1 ? "--" : Formatter.formatFileSize(activity, i10);
            String fileSize2 = i11 != -1 ? Formatter.formatFileSize(activity, i11) : "--";
            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.pb_progress);
            TextView textView = (TextView) view.findViewById(R.id.tv_progress_desc);
            progressBar.setProgress((int) (f10 * 100.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) fileSize);
            String str = String.format("/%s", fileSize2);
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(activity.getResources().getColor(R.color.text_secondary_2_color)), spannableStringBuilder.length() - str.length(), spannableStringBuilder.length(), 33);
            textView.setText(spannableStringBuilder);
        }
        Dialog dialog = this.f95217l.get();
        if (dialog != null) {
            dialog.show();
        }
    }

    private void H(String str) {
        Activity activity;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 48441, new Class[]{String.class}, Void.TYPE).isSupported || (activity = this.f95206a.get()) == null || activity.isFinishing()) {
            return;
        }
        WeakReference<Dialog> weakReference = this.f95220o;
        if (weakReference == null || weakReference.get() == null) {
            WeakReference<Dialog> weakReference2 = new WeakReference<>(new com.max.hbcommon.view.a.f(activity).x(R.string.prompt).l(str).t(R.string.retry, new q()).n(R.string.cancel, new p()).d());
            this.f95220o = weakReference2;
            n(weakReference2);
        }
        Dialog dialog = this.f95220o.get();
        if (dialog != null) {
            dialog.show();
        }
    }

    private void I() {
        Activity activity;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48434, new Class[0], Void.TYPE).isSupported || (activity = this.f95206a.get()) == null) {
            return;
        }
        try {
            if (this.f95211f == null) {
                CompleteBroadcastReceiver completeBroadcastReceiver = new CompleteBroadcastReceiver(this, null);
                this.f95211f = completeBroadcastReceiver;
                if (Build.VERSION.SDK_INT >= 26) {
                    activity.registerReceiver(completeBroadcastReceiver, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), 2);
                } else {
                    activity.registerReceiver(completeBroadcastReceiver, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
                }
            }
            this.f95209d = this.f95208c.enqueue(new DownloadManager.Request(Uri.parse(this.f95207b.getUrl())).setDestinationInExternalFilesDir(activity, Environment.DIRECTORY_DOWNLOADS, activity.getString(R.string.app_name) + this.f95207b.getName() + ".apk"));
            this.f95210e.edit().putLong(f95200r, this.f95209d).apply();
            this.f95212g.sendEmptyMessage(1);
        } catch (Exception unused) {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f("更新遇到问题");
        }
    }

    static /* synthetic */ void b(AppCompatActivity appCompatActivity, BetaTestInfo betaTestInfo) {
        if (PatchProxy.proxy(new Object[]{appCompatActivity, betaTestInfo}, null, changeQuickRedirect, true, 48455, new Class[]{AppCompatActivity.class, BetaTestInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        o(appCompatActivity, betaTestInfo);
    }

    static /* synthetic */ void c(AppUpdateManager appUpdateManager) {
        if (PatchProxy.proxy(new Object[]{appUpdateManager}, null, changeQuickRedirect, true, 48456, new Class[]{AppUpdateManager.class}, Void.TYPE).isSupported) {
            return;
        }
        appUpdateManager.A();
    }

    static /* synthetic */ void d(AppUpdateManager appUpdateManager, int i10, int i11, int i12) {
        Object[] objArr = {appUpdateManager, new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 48457, new Class[]{AppUpdateManager.class, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        appUpdateManager.F(i10, i11, i12);
    }

    static /* synthetic */ void e(AppUpdateManager appUpdateManager, String str) {
        if (PatchProxy.proxy(new Object[]{appUpdateManager, str}, null, changeQuickRedirect, true, 48458, new Class[]{AppUpdateManager.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        appUpdateManager.H(str);
    }

    static /* synthetic */ void j(AppUpdateManager appUpdateManager) {
        if (PatchProxy.proxy(new Object[]{appUpdateManager}, null, changeQuickRedirect, true, 48453, new Class[]{AppUpdateManager.class}, Void.TYPE).isSupported) {
            return;
        }
        appUpdateManager.I();
    }

    static /* synthetic */ void l(AppUpdateManager appUpdateManager) {
        if (PatchProxy.proxy(new Object[]{appUpdateManager}, null, changeQuickRedirect, true, 48454, new Class[]{AppUpdateManager.class}, Void.TYPE).isSupported) {
            return;
        }
        appUpdateManager.z();
    }

    private void n(WeakReference<Dialog> weakReference) {
        if (PatchProxy.proxy(new Object[]{weakReference}, this, changeQuickRedirect, false, 48447, new Class[]{WeakReference.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f95221p == null) {
            this.f95221p = new ArrayList();
        }
        if (weakReference != null) {
            this.f95221p.add(weakReference);
        }
    }

    private static void o(AppCompatActivity appCompatActivity, BetaTestInfo betaTestInfo) {
        if (PatchProxy.proxy(new Object[]{appCompatActivity, betaTestInfo}, null, changeQuickRedirect, true, 48452, new Class[]{AppCompatActivity.class, BetaTestInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        y(appCompatActivity, new h(betaTestInfo)).K(Boolean.FALSE);
    }

    private String p(byte[] bArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bArr}, this, changeQuickRedirect, false, 48446, new Class[]{byte[].class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = bArr[i10] & 255;
            int i12 = i10 * 2;
            char[] cArr2 = f95199q;
            cArr[i12] = cArr2[i11 >>> 4];
            cArr[i12 + 1] = cArr2[i11 & 15];
        }
        return new String(cArr);
    }

    private boolean q() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48444, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Activity activity = this.f95206a.get();
        if (activity == null) {
            return true;
        }
        int applicationEnabledSetting = activity.getPackageManager().getApplicationEnabledSetting("com.android.providers.downloads");
        return (applicationEnabledSetting == 2 || applicationEnabledSetting == 3 || applicationEnabledSetting == 4) ? false : true;
    }

    public static io.reactivex.disposables.b r(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48430, new Class[]{Context.class}, io.reactivex.disposables.b.class);
        return patchProxyResultProxy.isSupported ? (io.reactivex.disposables.b) patchProxyResultProxy.result : (io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Pb().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new i(context));
    }

    private void t() {
        List<WeakReference<Dialog>> list;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48448, new Class[0], Void.TYPE).isSupported || (list = this.f95221p) == null) {
            return;
        }
        Iterator<WeakReference<Dialog>> it = list.iterator();
        while (it.hasNext()) {
            Dialog dialog = it.next().get();
            if (dialog != null && dialog.isShowing()) {
                dialog.dismiss();
            }
        }
        this.f95221p.clear();
        this.f95221p = null;
    }

    private void u() {
        Activity activity;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48440, new Class[0], Void.TYPE).isSupported || (activity = this.f95206a.get()) == null || activity.isFinishing()) {
            return;
        }
        WeakReference<Dialog> weakReference = this.f95217l;
        Dialog dialog = weakReference != null ? weakReference.get() : null;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        dialog.dismiss();
    }

    public static void v(AppCompatActivity appCompatActivity, CheckVersionObj checkVersionObj) {
        if (PatchProxy.proxy(new Object[]{appCompatActivity, checkVersionObj}, null, changeQuickRedirect, true, 48450, new Class[]{AppCompatActivity.class, CheckVersionObj.class}, Void.TYPE).isSupported) {
            return;
        }
        w(appCompatActivity, checkVersionObj, Boolean.TRUE);
    }

    public static void w(AppCompatActivity appCompatActivity, CheckVersionObj checkVersionObj, Boolean bool) {
        if (PatchProxy.proxy(new Object[]{appCompatActivity, checkVersionObj, bool}, null, changeQuickRedirect, true, 48451, new Class[]{AppCompatActivity.class, CheckVersionObj.class, Boolean.class}, Void.TYPE).isSupported) {
            return;
        }
        y(appCompatActivity, new g(checkVersionObj)).K(bool);
    }

    private String x(File file) {
        int i10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, 48445, new Class[]{File.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[1024];
            do {
                i10 = fileInputStream.read(bArr);
                if (i10 > 0) {
                    messageDigest.update(bArr, 0, i10);
                }
            } while (i10 != -1);
            fileInputStream.close();
            return p(messageDigest.digest());
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static AppUpdateManager y(AppCompatActivity appCompatActivity, s sVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{appCompatActivity, sVar}, null, changeQuickRedirect, true, 48429, new Class[]{AppCompatActivity.class, s.class}, AppUpdateManager.class);
        if (patchProxyResultProxy.isSupported) {
            return (AppUpdateManager) patchProxyResultProxy.result;
        }
        if (f95205w == null) {
            synchronized (AppUpdateManager.class) {
                if (f95205w == null) {
                    f95205w = new AppUpdateManager(appCompatActivity, sVar);
                }
            }
        }
        return f95205w;
    }

    private void z() {
        Activity activity;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48435, new Class[0], Void.TYPE).isSupported || (activity = this.f95206a.get()) == null) {
            return;
        }
        CompleteBroadcastReceiver completeBroadcastReceiver = this.f95211f;
        if (completeBroadcastReceiver != null) {
            activity.unregisterReceiver(completeBroadcastReceiver);
            this.f95211f = null;
        }
        this.f95212g.removeCallbacksAndMessages(null);
        u();
        this.f95210e.edit().putLong(f95200r, -1L).apply();
        if (this.f95213h.isShutdown()) {
            return;
        }
        this.f95213h.execute(new k());
    }

    public AppUpdateManager J() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48431, new Class[0], AppUpdateManager.class);
        return patchProxyResultProxy.isSupported ? (AppUpdateManager) patchProxyResultProxy.result : K(Boolean.TRUE);
    }

    public AppUpdateManager K(Boolean bool) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 48432, new Class[]{Boolean.class}, AppUpdateManager.class);
        if (patchProxyResultProxy.isSupported) {
            return (AppUpdateManager) patchProxyResultProxy.result;
        }
        if (!q()) {
            D();
            return this;
        }
        long j10 = this.f95210e.getLong(f95200r, -1L);
        this.f95209d = j10;
        if (j10 != -1) {
            this.f95212g.sendEmptyMessage(1);
            return this;
        }
        if (bool.booleanValue()) {
            C();
        } else {
            I();
        }
        return this;
    }

    public void s() {
        CompleteBroadcastReceiver completeBroadcastReceiver;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48433, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Activity activity = this.f95206a.get();
        if (activity != null && (completeBroadcastReceiver = this.f95211f) != null) {
            activity.unregisterReceiver(completeBroadcastReceiver);
            this.f95211f = null;
        }
        this.f95212g.removeCallbacksAndMessages(null);
        this.f95213h.shutdown();
        t();
        f95205w = null;
    }
}
