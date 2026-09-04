package com.max.xiaoheihe.module.proxy;

import android.os.Bundle;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ProxyFragmentLifecycleCallbacks.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class b extends FragmentManager.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f91564a = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // androidx.fragment.app.FragmentManager.m
    public void d(@d FragmentManager fm, @d Fragment f10) {
        String string;
        if (PatchProxy.proxy(new Object[]{fm, f10}, this, changeQuickRedirect, false, 42840, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(fm, "fm");
        f0.p(f10, "f");
        super.d(fm, f10);
        Bundle arguments = f10.getArguments();
        if (arguments == null || (string = arguments.getString(a.f91563d)) == null) {
            return;
        }
        ProxyManager.f91541g.c(string, com.max.hbcommon.base.hblifeevent.fragment.a.c(f10));
    }
}
