package com.max.hbstory;

import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: StoryViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class h implements y0.b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final qd.a f73011b;

    public h(@dl.d qd.a repository) {
        f0.p(repository, "repository");
        this.f73011b = repository;
    }

    @Override // androidx.lifecycle.y0.b
    @dl.d
    public <T extends w0> T a(@dl.d Class<T> modelClass) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{modelClass}, this, changeQuickRedirect, false, bb.c.k.Ad, new Class[]{Class.class}, w0.class);
        if (patchProxyResultProxy.isSupported) {
            return (T) patchProxyResultProxy.result;
        }
        f0.p(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(g.class)) {
            return new g(this.f73011b);
        }
        throw new IllegalArgumentException("ViewModel类型必须是 StoryViewModel");
    }

    @Override // androidx.lifecycle.y0.b
    public /* synthetic */ w0 b(Class cls, u2.a aVar) {
        return z0.b(this, cls, aVar);
    }
}
