package com.max.xiaoheihe.module.mall.cart.ui;

import android.os.Bundle;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import com.max.xiaoheihe.module.mall.direct_purchace.SDPOrderFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FragmentFactory.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final b f90502a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f90503b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    private b() {
    }

    @dl.d
    public final Fragment a(@dl.d FragmentID id2, @e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{id2, bundle}, this, changeQuickRedirect, false, 41444, new Class[]{FragmentID.class, Bundle.class}, Fragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (Fragment) patchProxyResultProxy.result;
        }
        f0.p(id2, "id");
        if (id2 instanceof FragmentID.MallCart) {
            return MallCartFragment.f90276m.a(bundle);
        }
        if (id2 instanceof FragmentID.MallOrderConfirm) {
            return MallCartOrderDetailFragment.H.b(bundle);
        }
        if (id2 instanceof FragmentID.MallSteamOrder) {
            return SDPOrderFragment.f90564j.a(bundle);
        }
        throw new NoWhenBranchMatchedException();
    }
}
