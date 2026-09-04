package com.max.xiaoheihe.module.game.xbox.viewholderbinder;

import android.content.Context;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: XboxVHBParam.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class b implements cb.b {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f88561d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private Context f88562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private s<?> f88563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private String f88564c;

    public b(@d Context context, @d s<?> adapter, @e String str) {
        f0.p(context, "context");
        f0.p(adapter, "adapter");
        this.f88562a = context;
        this.f88563b = adapter;
        this.f88564c = str;
    }

    public /* synthetic */ b(Context context, s sVar, String str, int i10, u uVar) {
        this(context, sVar, (i10 & 4) != 0 ? null : str);
    }

    @d
    public final s<?> a() {
        return this.f88563b;
    }

    @d
    public final Context b() {
        return this.f88562a;
    }

    @e
    public final String c() {
        return this.f88564c;
    }

    public final void d(@d s<?> sVar) {
        if (PatchProxy.proxy(new Object[]{sVar}, this, changeQuickRedirect, false, 38443, new Class[]{s.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(sVar, "<set-?>");
        this.f88563b = sVar;
    }

    public final void e(@d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 38442, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "<set-?>");
        this.f88562a = context;
    }

    public final void f(@e String str) {
        this.f88564c = str;
    }
}
