package com.max.xiaoheihe.module.mall.adapter;

import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.mall.MallProductObj;
import com.max.xiaoheihe.module.mall.component.MallProductViewV2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MallProductAdapterV2.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f89950a = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    public final void a(@dl.d MallProductViewV2 mallProductView, @dl.e MallProductObj mallProductObj) {
        if (PatchProxy.proxy(new Object[]{mallProductView, mallProductObj}, this, changeQuickRedirect, false, 41124, new Class[]{MallProductViewV2.class, MallProductObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mallProductView, "mallProductView");
        int iL = (int) ((ViewUtils.L(mallProductView.getContext()) - ViewUtils.f(mallProductView.getContext(), 31.0f)) / 2.0f);
        if (h.b(mallProductObj)) {
            com.max.accelworld.d.b(mallProductView.getIvImg(), iL, iL);
        } else {
            com.max.accelworld.d.b(mallProductView.getIvImg(), iL, (iL * 85) / bb.c.b.f30828o0);
        }
        if (mallProductObj != null) {
            com.max.hbimage.b.L(mallProductObj.getHead_image(), mallProductView.getIvImg(), R.drawable.common_default_placeholder_375x210);
        }
    }
}
