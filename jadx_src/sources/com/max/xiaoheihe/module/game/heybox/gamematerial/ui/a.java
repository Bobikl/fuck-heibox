package com.max.xiaoheihe.module.game.heybox.gamematerial.ui;

import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.ListUpdateCallback;
import androidx.recyclerview.widget.RecyclerView;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameMaterialAdapterListUpdateCallback.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class a implements ListUpdateCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f87581c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final RecyclerView.Adapter<?> f87582b;

    public a(@dl.d RecyclerView.Adapter<?> mAdapter) {
        f0.p(mAdapter, "mAdapter");
        this.f87582b = mAdapter;
    }

    @dl.d
    public final RecyclerView.Adapter<?> a() {
        return this.f87582b;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onChanged(int i10, int i11, @dl.e Object obj) {
        Object[] objArr = {new Integer(i10), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 37540, new Class[]{cls, cls, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        g.f74531b.q("GameMaterialAdapterListUpdateCallback, onChanged, position = " + i10 + ", count = " + i11 + ", payload = " + obj);
        this.f87582b.notifyItemRangeChanged(i10, i11, obj);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onInserted(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 37537, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        g.f74531b.q("GameMaterialAdapterListUpdateCallback, onInserted, position = " + i10 + ", count = " + i11);
        this.f87582b.notifyItemRangeInserted(i10, i11);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onMoved(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 37539, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        g.f74531b.q("GameMaterialAdapterListUpdateCallback, onMoved, position = " + i10 + ", count = " + i11);
        this.f87582b.notifyItemMoved(i10, i11);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onRemoved(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 37538, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        g.f74531b.q("GameMaterialAdapterListUpdateCallback, onRemoved, position = " + i10 + ", count = " + i11);
        this.f87582b.notifyItemRangeRemoved(i10, i11);
    }
}
