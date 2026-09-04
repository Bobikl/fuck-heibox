package com.max.xiaoheihe.module.voice.component;

import android.app.Activity;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import androidx.compose.runtime.internal.o;
import androidx.core.app.o0;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import xh.i;

/* JADX INFO: compiled from: ServiceUtil.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f94104b = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Service f94105a;

    public c(@dl.d Service ctx) {
        f0.p(ctx, "ctx");
        this.f94105a = ctx;
    }

    public static /* synthetic */ Notification d(c cVar, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 46782, new Class[]{c.class, String.class, String.class, Integer.TYPE, Object.class}, Notification.class);
        if (patchProxyResultProxy.isSupported) {
            return (Notification) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return cVar.c(str, str2);
    }

    @dl.d
    @i
    public final Notification a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46784, new Class[0], Notification.class);
        return patchProxyResultProxy.isSupported ? (Notification) patchProxyResultProxy.result : d(this, null, null, 3, null);
    }

    @dl.d
    @i
    public final Notification b(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 46783, new Class[]{String.class}, Notification.class);
        return patchProxyResultProxy.isSupported ? (Notification) patchProxyResultProxy.result : d(this, str, null, 2, null);
    }

    @dl.d
    @i
    public final Notification c(@dl.e String str, @dl.e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 46781, new Class[]{String.class, String.class}, Notification.class);
        if (patchProxyResultProxy.isSupported) {
            return (Notification) patchProxyResultProxy.result;
        }
        PendingIntent activity = null;
        Activity activityA = com.max.hbutils.utils.e.b().a();
        if (activityA != null) {
            Intent intent = new Intent(this.f94105a, activityA.getClass());
            intent.setFlags(809500672);
            Service service = this.f94105a;
            intent.putExtra("close", false);
            b2 b2Var = b2.f124493a;
            activity = PendingIntent.getActivity(service, 0, intent, 67108864);
        }
        Service service2 = this.f94105a;
        if (str == null) {
            str = f.f94113a;
        }
        o0.n nVarT0 = new o0.n(service2, str).i0(true).t0(R.mipmap.ic_launcher);
        if (str2 == null) {
            str2 = "已连接黑盒语音PC端";
        }
        o0.n nVarN = nVarT0.P(str2).O("正在使用麦克风...").k0(0).N(activity);
        f0.o(nVarN, "Builder(ctx, channelId ?…tentIntent(pLaunchIntent)");
        Notification notificationH = nVarN.h();
        f0.o(notificationH, "builder.build()");
        return notificationH;
    }
}
