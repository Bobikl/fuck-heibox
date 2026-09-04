package com.max.xiaoheihe.module.account.mine;

import android.content.Context;
import androidx.compose.runtime.internal.o;
import androidx.lifecycle.i0;
import com.max.hbcommon.base.BaseViewModel;
import com.max.hbutils.bean.Result;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SetAvatarDecorViewModel.kt */
/* JADX INFO: loaded from: classes9.dex */
@o(parameters = 0)
public final class i extends BaseViewModel {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f79067h = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private Runnable f79068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private i0<Boolean> f79069e = new i0<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private i0<Boolean> f79070f = new i0<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private io.reactivex.disposables.b f79071g;

    /* JADX INFO: compiled from: SetAvatarDecorViewModel.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f79073c;

        a(boolean z10) {
            this.f79073c = z10;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25079, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            super.onComplete();
            com.max.heybox.hblog.g.f74531b.q("SetAvatarDecorViewModel, onComplete");
            i.this.h().r(Boolean.FALSE);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 25078, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            super.onError(e10);
            com.max.heybox.hblog.g.f74531b.w("SetAvatarDecorViewModel", e10);
            i.this.i().r(Boolean.valueOf(true ^ this.f79073c));
            i.this.h().r(Boolean.FALSE);
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 25080, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            super.onNext(result);
            i.this.i().r(Boolean.valueOf(this.f79073c));
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25081, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: SetAvatarDecorViewModel.kt */
    public static final class b implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f79075c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f79076d;

        b(String str, boolean z10) {
            this.f79075c = str;
            this.f79076d = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25082, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            i.g(i.this, this.f79075c, this.f79076d);
        }
    }

    public static final /* synthetic */ void g(i iVar, String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{iVar, str, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 25077, new Class[]{i.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        iVar.m(str, z10);
    }

    private final void m(String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 25074, new Class[]{String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f79070f.r(Boolean.TRUE);
        io.reactivex.disposables.b bVar = (io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().l2(str, z10 ? "1" : "0").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a(z10));
        this.f79071g = bVar;
        c(bVar);
    }

    @dl.d
    public final i0<Boolean> h() {
        return this.f79070f;
    }

    @dl.d
    public final i0<Boolean> i() {
        return this.f79069e;
    }

    public final void k(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 25076, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        Runnable runnable = this.f79068d;
        if (runnable != null) {
            if (com.max.xiaoheihe.utils.d.N0(context)) {
                runnable.run();
            } else {
                this.f79069e.r(Boolean.FALSE);
            }
        }
    }

    public final void n(@dl.d i0<Boolean> i0Var) {
        if (PatchProxy.proxy(new Object[]{i0Var}, this, changeQuickRedirect, false, 25073, new Class[]{i0.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(i0Var, "<set-?>");
        this.f79070f = i0Var;
    }

    public final void o(@dl.d i0<Boolean> i0Var) {
        if (PatchProxy.proxy(new Object[]{i0Var}, this, changeQuickRedirect, false, 25072, new Class[]{i0.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(i0Var, "<set-?>");
        this.f79069e = i0Var;
    }

    public final void p(@dl.d Context context, @dl.d String pushType, boolean z10) {
        if (PatchProxy.proxy(new Object[]{context, pushType, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 25075, new Class[]{Context.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(pushType, "pushType");
        boolean zN0 = com.max.xiaoheihe.utils.d.N0(context);
        com.max.heybox.hblog.g.f74531b.q("SetAvatarDecorViewModel, subscribeCheckedChange, checked = " + z10 + ", isNotificationEnabled = " + zN0);
        if (!z10 || zN0) {
            m(pushType, z10);
        } else {
            com.max.xiaoheihe.utils.d.B0(context);
            this.f79068d = new b(pushType, z10);
        }
    }
}
