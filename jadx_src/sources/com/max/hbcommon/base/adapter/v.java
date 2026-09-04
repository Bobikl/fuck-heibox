package com.max.hbcommon.base.adapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: RVSectionCommonAdapter.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class v<T> extends RecyclerView.Adapter<s.e> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f66827h = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SparseArray<String> f66828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected LayoutInflater f66829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private s<T> f66830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f66831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f66832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final RecyclerView.AdapterDataObserver f66833g;

    /* JADX INFO: compiled from: RVSectionCommonAdapter.java */
    public class a extends RecyclerView.AdapterDataObserver {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31473q0, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            super.onChanged();
            v.m(v.this);
        }
    }

    public v(Context context, s<T> sVar, int i10, int i11) {
        a aVar = new a();
        this.f66833g = aVar;
        this.f66829c = LayoutInflater.from(context);
        this.f66830d = sVar;
        this.f66831e = i10;
        this.f66832f = i11;
        this.f66828b = new SparseArray<>();
        p();
        registerAdapterDataObserver(aVar);
    }

    static /* synthetic */ void m(v vVar) {
        if (PatchProxy.proxy(new Object[]{vVar}, null, changeQuickRedirect, true, bb.c.d.f31450p0, new Class[]{v.class}, Void.TYPE).isSupported) {
            return;
        }
        vVar.p();
    }

    private void p() {
        String strValueAt;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31358l0, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int itemCount = this.f66830d.getItemCount();
        this.f66828b.clear();
        int i10 = 0;
        for (int i11 = 0; i11 < itemCount; i11++) {
            String strO = o(this.f66830d.mDataList.get(i11));
            int i12 = 0;
            while (i12 < this.f66828b.size() && ((strValueAt = this.f66828b.valueAt(i12)) == null || !strValueAt.equals(strO))) {
                i12++;
            }
            if (i12 >= this.f66828b.size()) {
                this.f66828b.put(i11 + i10, strO);
                i10++;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31220f0, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f66830d.getItemCount() + this.f66828b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.f31243g0, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iN = n(i10);
        if (this.f66828b.get(i10) == null) {
            return this.f66830d.getItemViewType(iN) + 1;
        }
        return 0;
    }

    public int n(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.f31381m0, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f66828b.size(); i12++) {
            if (this.f66828b.keyAt(i12) < i10) {
                i11++;
            }
        }
        return i10 - i11;
    }

    public abstract String o(T t10);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31404n0, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        onBindViewHolder((s.e) viewHolder, i10);
    }

    public void onBindViewHolder(s.e eVar, int i10) {
        if (PatchProxy.proxy(new Object[]{eVar, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31289i0, new Class[]{s.e.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        String str = this.f66828b.get(i10);
        if (str != null) {
            q(eVar.itemView, str, eVar, i10);
        } else {
            this.f66830d.onBindViewHolder(eVar, n(i10));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31427o0, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : onCreateViewHolder(viewGroup, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public s.e onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31266h0, new Class[]{ViewGroup.class, Integer.TYPE}, s.e.class);
        if (patchProxyResultProxy.isSupported) {
            return (s.e) patchProxyResultProxy.result;
        }
        return i10 != 0 ? this.f66830d.onCreateViewHolder(viewGroup, i10) : new s.e(this.f66831e, this.f66829c.inflate(this.f66831e, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, bb.c.d.f31335k0, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onDetachedFromRecyclerView(recyclerView);
        unregisterAdapterDataObserver(this.f66833g);
    }

    public void q(View view, String str, s.e eVar, int i10) {
        if (PatchProxy.proxy(new Object[]{view, str, eVar, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31312j0, new Class[]{View.class, String.class, s.e.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        eVar.p(this.f66832f, str);
    }
}
