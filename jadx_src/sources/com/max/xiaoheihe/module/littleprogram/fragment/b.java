package com.max.xiaoheihe.module.littleprogram.fragment;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: TradeInnerFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public class b extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f88898b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38920, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRefresh();
    }
}
