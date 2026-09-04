package com.max.xiaoheihe.module.mall.adapter;

import android.content.Context;
import com.max.xiaoheihe.module.mall.component.MallProductViewV2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MallProductAdapterV2.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f89999a = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    public final void a(@dl.d MallProductViewV2 mallProductView) {
        if (PatchProxy.proxy(new Object[]{mallProductView}, this, changeQuickRedirect, false, 41190, new Class[]{MallProductViewV2.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mallProductView, "mallProductView");
        Context context = mallProductView.getContext();
        f0.o(context, "context");
        mallProductView.setRadius(com.max.accelworld.c.a(8.0f, context));
    }
}
