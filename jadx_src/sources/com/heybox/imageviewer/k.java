package com.heybox.imageviewer;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.i0;
import androidx.lifecycle.w0;
import androidx.paging.o0;
import com.heybox.imageviewer.adapter.Repository;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ImageViewerViewModel.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class k extends w0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Repository f59753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final LiveData<o0<com.heybox.imageviewer.core.d>> f59754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final i0<Boolean> f59755d;

    public k() {
        Repository repository = new Repository();
        this.f59753b = repository;
        this.f59754c = repository.f();
        this.f59755d = new i0<>();
    }

    @dl.d
    public final LiveData<o0<com.heybox.imageviewer.core.d>> c() {
        return this.f59754c;
    }

    @dl.d
    public final List<com.heybox.imageviewer.core.d> e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 84, new Class[0], List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : this.f59753b.g();
    }

    @dl.d
    public final i0<Boolean> f() {
        return this.f59755d;
    }

    public final void g(@dl.d com.heybox.imageviewer.adapter.a adapter, @dl.e Object obj, @dl.d yh.a<b2> emptyCallback) {
        if (PatchProxy.proxy(new Object[]{adapter, obj, emptyCallback}, this, changeQuickRedirect, false, 86, new Class[]{com.heybox.imageviewer.adapter.a.class, Object.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(adapter, "adapter");
        f0.p(emptyCallback, "emptyCallback");
        List<? extends com.heybox.imageviewer.core.d> list = obj instanceof List ? (List) obj : null;
        if (list == null) {
            return;
        }
        this.f59753b.h(adapter, list, emptyCallback);
    }

    public final void h(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 85, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || f0.g(this.f59755d.f(), Boolean.valueOf(z10))) {
            return;
        }
        this.f59755d.r(Boolean.valueOf(z10));
    }
}
