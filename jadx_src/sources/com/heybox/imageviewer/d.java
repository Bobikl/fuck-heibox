package com.heybox.imageviewer;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.i0;
import androidx.lifecycle.w0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ImageViewerActionViewModel.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class d extends w0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final i0<Pair<String, Object>> f59746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final LiveData<Pair<String, Object>> f59747c;

    public d() {
        i0<Pair<String, Object>> i0Var = new i0<>();
        this.f59746b = i0Var;
        this.f59747c = i0Var;
    }

    private final void f(String str, Object obj) {
        if (PatchProxy.proxy(new Object[]{str, obj}, this, changeQuickRedirect, false, 23, new Class[]{String.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f59746b.r(new Pair<>(str, obj));
        this.f59746b.r(null);
    }

    public final void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        f(l.f59758c, null);
    }

    @dl.d
    public final LiveData<Pair<String, Object>> e() {
        return this.f59747c;
    }

    public final void g(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 22, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f("refresh", Integer.valueOf(i10));
    }

    public final void h(@dl.d List<? extends com.heybox.imageviewer.core.d> item) {
        if (PatchProxy.proxy(new Object[]{item}, this, changeQuickRedirect, false, 21, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(item, "item");
        f(l.f59759d, item);
    }

    public final void i(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 19, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f(l.f59757b, Integer.valueOf(i10));
    }
}
