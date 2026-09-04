package com.max.xiaoheihe.module.game;

import android.app.PendingIntent;
import android.content.Intent;
import androidx.core.app.l2;
import com.lzy.okgo.model.Progress;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.umeng.umcrash.UMCrash;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: compiled from: GlobalDownloadListener.java */
/* JADX INFO: loaded from: classes11.dex */
public class x1 extends com.lzy.okserver.download.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f88532d = "GlobalDownloadListener";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l2 f88533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.core.app.o0.n f88534c;

    /* JADX INFO: compiled from: GlobalDownloadListener.java */
    public class a extends com.max.hbcommon.network.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f88535b;

        a(String str) {
            this.f88535b = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 35035, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcache.c.a(this.f88535b);
        }
    }

    public x1() {
        super(f88532d);
        HeyBoxApplication heyBoxApplicationC = HeyBoxApplication.C();
        Intent intent = new Intent(heyBoxApplicationC, (Class<?>) DownloadNotificationReceiver.class);
        intent.setAction("com.max.xiaoheihe.download.notification");
        PendingIntent broadcast = PendingIntent.getBroadcast(heyBoxApplicationC, 0, intent, 33554432);
        this.f88533b = l2.p(heyBoxApplicationC);
        this.f88534c = new androidx.core.app.o0.n(heyBoxApplicationC, lb.a.f130984j0).t0(R.drawable.umeng_push_notification_default_small_icon).N(broadcast).j0(true).k0(0);
    }

    private void f(Progress progress) {
        if (PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, 35033, new Class[]{Progress.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f88533b.b(progress.f64776b.hashCode());
    }

    private int g(Progress progress) {
        long j10 = progress.f64782h;
        if (j10 == 0) {
            return 0;
        }
        return (int) ((progress.f64783i * 100) / j10);
    }

    private void i(Progress progress) {
        if (PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, 35032, new Class[]{Progress.class}, Void.TYPE).isSupported) {
            return;
        }
        GameObj gameObj = (GameObj) progress.f64789o;
        StringBuilder sb2 = new StringBuilder();
        String string = "";
        if (gameObj != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(gameObj.isAuto_download() ? "您预约的" : "");
            sb3.append(gameObj.getName());
            string = sb3.toString();
        }
        sb2.append(string);
        sb2.append("已下载完成");
        this.f88533b.C(progress.f64776b.hashCode(), this.f88534c.P(sb2.toString()).O("点击查看").D(true).h());
    }

    private void j(Progress progress) {
        if (PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, 35031, new Class[]{Progress.class}, Void.TYPE).isSupported) {
            return;
        }
        HeyBoxApplication heyBoxApplicationC = HeyBoxApplication.C();
        GameObj gameObj = (GameObj) progress.f64789o;
        this.f88533b.C(progress.f64776b.hashCode(), this.f88534c.P(gameObj != null ? String.format(heyBoxApplicationC.getResources().getString(R.string.downloading_format), gameObj.getName()) : heyBoxApplicationC.getResources().getString(R.string.downloading)).l0(100, g(progress), false).h());
    }

    @Override // com.lzy.okserver.d
    public void a(Progress progress) {
        if (PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, 35027, new Class[]{Progress.class}, Void.TYPE).isSupported) {
            return;
        }
        if (3 == progress.f64785k) {
            f(progress);
        } else {
            j(progress);
        }
    }

    @Override // com.lzy.okserver.d
    public /* bridge */ /* synthetic */ void b(File file, Progress progress) {
        if (PatchProxy.proxy(new Object[]{file, progress}, this, changeQuickRedirect, false, 35034, new Class[]{Object.class, Progress.class}, Void.TYPE).isSupported) {
            return;
        }
        h(file, progress);
    }

    @Override // com.lzy.okserver.d
    public void c(Progress progress) {
        if (PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, 35028, new Class[]{Progress.class}, Void.TYPE).isSupported) {
            return;
        }
        UMCrash.generateCustomLog(progress.f64792r, "download error");
        f(progress);
    }

    @Override // com.lzy.okserver.d
    public void d(Progress progress) {
        if (PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, 35030, new Class[]{Progress.class}, Void.TYPE).isSupported) {
            return;
        }
        f(progress);
    }

    @Override // com.lzy.okserver.d
    public void e(Progress progress) {
        if (PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, 35026, new Class[]{Progress.class}, Void.TYPE).isSupported) {
            return;
        }
        j(progress);
    }

    public void h(File file, Progress progress) {
        if (PatchProxy.proxy(new Object[]{file, progress}, this, changeQuickRedirect, false, 35029, new Class[]{File.class, Progress.class}, Void.TYPE).isSupported) {
            return;
        }
        GameObj gameObj = (GameObj) progress.f64789o;
        if (gameObj != null) {
            HashMap map = new HashMap(16);
            String strZ = r1.Z(gameObj);
            map.put("appid", strZ);
            com.max.xiaoheihe.network.i.a().x8("11", map).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new a(strZ));
        }
        if (!HeyBoxApplication.S() || (gameObj != null && gameObj.isAuto_download())) {
            i(progress);
        } else {
            f(progress);
            com.max.xiaoheihe.utils.d.G0(HeyBoxApplication.C(), progress);
        }
    }
}
