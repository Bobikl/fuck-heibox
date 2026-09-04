package com.max.hbutils.optimize;

import android.os.Handler;
import androidx.activity.ComponentActivity;
import androidx.annotation.w0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.v;
import androidx.lifecycle.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: OptimizeUtils.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class OptimizeUtils$initialize$1 implements v {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ComponentActivity f73454b;

    OptimizeUtils$initialize$1(ComponentActivity componentActivity) {
        this.f73454b = componentActivity;
    }

    @Override // androidx.lifecycle.v
    @w0(24)
    public void d(@dl.d y source, @dl.d Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{source, event}, this, changeQuickRedirect, false, bb.c.k.po, new Class[]{y.class, Lifecycle.Event.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(source, "source");
        f0.p(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f73454b.getWindow().removeOnFrameMetricsAvailableListener(OptimizeUtils.f73452b);
            a.f(OptimizeUtils.f73453c);
        } else if (this.f73454b.getLifecycle().b().isAtLeast(Lifecycle.State.STARTED)) {
            this.f73454b.getWindow().addOnFrameMetricsAvailableListener(OptimizeUtils.f73452b, new Handler());
            a.e(OptimizeUtils.f73453c);
        }
    }
}
