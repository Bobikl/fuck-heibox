package com.max.xiaoheihe.module.mall.adapter;

import com.max.xiaoheihe.bean.mall.MallProductObj;
import com.max.xiaoheihe.module.mall.component.MallProductViewV2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MallProductAdapterV2.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f90000a = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    public final void a(@dl.d MallProductViewV2 mallProductView, @dl.e MallProductObj mallProductObj) {
        if (PatchProxy.proxy(new Object[]{mallProductView, mallProductObj}, this, changeQuickRedirect, false, 41191, new Class[]{MallProductViewV2.class, MallProductObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mallProductView, "mallProductView");
        if (mallProductObj != null) {
            mallProductView.getTvName().setVisibility(0);
            mallProductView.getTvName().setText(mallProductObj.getName());
        }
    }
}
