package com.max.xiaoheihe.module.voice;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.c1;
import androidx.lifecycle.r;
import androidx.lifecycle.y0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.z;

/* JADX INFO: compiled from: FragmentViewModelLazy.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$8\n*L\n1#1,222:1\n*E\n"})
public final class HeyboxMicFragment$special$$inlined$viewModels$default$5 extends Lambda implements yh.a<y0.b> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Fragment f93944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ z f93945c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeyboxMicFragment$special$$inlined$viewModels$default$5(Fragment fragment, z zVar) {
        super(0);
        this.f93944b = fragment;
        this.f93945c = zVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // yh.a
    @d
    public final y0.b invoke() {
        y0.b defaultViewModelProviderFactory;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46645, new Class[0], y0.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (y0.b) patchProxyResultProxy.result;
        }
        c1 c1VarP = FragmentViewModelLazyKt.p(this.f93945c);
        r rVar = c1VarP instanceof r ? (r) c1VarP : null;
        if (rVar != null && (defaultViewModelProviderFactory = rVar.getDefaultViewModelProviderFactory()) != null) {
            return defaultViewModelProviderFactory;
        }
        y0.b defaultViewModelProviderFactory2 = this.f93944b.getDefaultViewModelProviderFactory();
        f0.o(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
        return defaultViewModelProviderFactory2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.y0$b, java.lang.Object] */
    @Override // yh.a
    public /* bridge */ /* synthetic */ y0.b invoke() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46646, new Class[0], Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
    }
}
