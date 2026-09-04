package com.max.xiaoheihe.module.game.adapter.recommend.binder;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RecommendVHBParam.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class RecommendVHBParam implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f86081d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private Context f86082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private com.max.hbcommon.base.adapter.u<?> f86083c;

    public RecommendVHBParam(@dl.d Context context, @dl.d com.max.hbcommon.base.adapter.u<?> adapter) {
        f0.p(context, "context");
        f0.p(adapter, "adapter");
        this.f86082b = context;
        this.f86083c = adapter;
    }

    @dl.d
    public final com.max.hbcommon.base.adapter.u<?> a() {
        return this.f86083c;
    }

    @dl.d
    public final Context b() {
        return this.f86082b;
    }

    public final void c(@dl.d com.max.hbcommon.base.adapter.u<?> uVar) {
        if (PatchProxy.proxy(new Object[]{uVar}, this, changeQuickRedirect, false, 36153, new Class[]{com.max.hbcommon.base.adapter.u.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(uVar, "<set-?>");
        this.f86083c = uVar;
    }

    public final void d(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 36152, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "<set-?>");
        this.f86082b = context;
    }
}
