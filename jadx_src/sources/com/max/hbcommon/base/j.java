package com.max.hbcommon.base;

import androidx.recyclerview.widget.ListUpdateCallback;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BigBrotherAdapterListUpdateCallback.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class j implements ListUpdateCallback {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final RecyclerView.Adapter<?> f66917b;

    public j(@dl.d RecyclerView.Adapter<?> mAdapter) {
        f0.p(mAdapter, "mAdapter");
        this.f66917b = mAdapter;
    }

    @dl.d
    public final RecyclerView.Adapter<?> a() {
        return this.f66917b;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onChanged(int i10, int i11, @dl.e Object obj) {
        Object[] objArr = {new Integer(i10), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.ww, new Class[]{cls, cls, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.f74531b.q("BigBrotherAdapterListUpdateCallback, onChanged, position = " + i10 + ", count = " + i11 + ", payload = " + obj);
        this.f66917b.notifyItemRangeChanged(i10, i11, obj);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onInserted(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.tw, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.f74531b.q("BigBrotherAdapterListUpdateCallback, onInserted, position = " + i10 + ", count = " + i11);
        this.f66917b.notifyItemRangeInserted(i10, i11);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onMoved(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.vw, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.f74531b.q("BigBrotherAdapterListUpdateCallback, onMoved, position = " + i10 + ", count = " + i11);
        this.f66917b.notifyItemMoved(i10, i11);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onRemoved(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.uw, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.f74531b.q("BigBrotherAdapterListUpdateCallback, onRemoved, position = " + i10 + ", count = " + i11);
        this.f66917b.notifyItemRangeRemoved(i10, i11);
    }
}
