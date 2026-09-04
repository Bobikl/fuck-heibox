package com.max.hbcommon.base.adapter;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: RVHeaderFooterAdapter.java */
/* JADX INFO: loaded from: classes9.dex */
public class t extends RecyclerView.Adapter<s.e> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray<c> f66811b = new SparseArray<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray<b> f66812c = new SparseArray<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private s f66813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f66814e;

    /* JADX INFO: compiled from: RVHeaderFooterAdapter.java */
    public class a extends GridLayoutManager.SpanSizeLookup {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ GridLayoutManager f66815a;

        a(GridLayoutManager gridLayoutManager) {
            this.f66815a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i10) {
            Object[] objArr = {new Integer(i10)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.f31127b0, new Class[]{cls}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            if (t.this.x(i10) != -1) {
                return 1;
            }
            return this.f66815a.getSpanCount();
        }
    }

    /* JADX INFO: compiled from: RVHeaderFooterAdapter.java */
    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f66817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        View f66818b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f66819c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f66820d;

        public b(int i10, View view, int i11, Object obj) {
            this.f66817a = i10;
            this.f66818b = view;
            this.f66819c = i11;
            this.f66820d = obj;
        }
    }

    /* JADX INFO: compiled from: RVHeaderFooterAdapter.java */
    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f66822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        View f66823b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f66824c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f66825d;

        public c(int i10, View view, int i11, Object obj) {
            this.f66822a = i10;
            this.f66823b = view;
            this.f66824c = i11;
            this.f66825d = obj;
        }
    }

    public t(s sVar) {
        this.f66813d = sVar;
    }

    public t(s sVar, boolean z10) {
        this.f66813d = sVar;
        this.f66814e = z10;
    }

    public boolean A(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.L, new Class[]{Integer.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.f66811b.get(i10) != null;
    }

    public void B(s.e eVar, Object obj) {
    }

    public void C(s.e eVar, Object obj) {
    }

    public void D(@n0 s.e eVar) {
        if (PatchProxy.proxy(new Object[]{eVar}, this, changeQuickRedirect, false, bb.c.d.E, new Class[]{s.e.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f66813d.onViewAttachedToWindow(eVar);
        int layoutPosition = eVar.getLayoutPosition();
        if (w(layoutPosition) == -1 && v(layoutPosition) == -1) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = eVar.itemView.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
        }
    }

    public boolean E(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.U, new Class[]{Integer.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        b bVar = this.f66812c.get(i10);
        if (bVar == null) {
            return false;
        }
        this.f66812c.remove(i10);
        notifyItemRemoved(this.f66813d.getItemCount() + bVar.f66819c);
        return true;
    }

    public boolean F(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.M, new Class[]{Integer.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        c cVar = this.f66811b.get(i10);
        if (cVar == null) {
            return false;
        }
        this.f66811b.remove(i10);
        for (int i11 = 0; i11 < this.f66811b.size(); i11++) {
            if (this.f66811b.valueAt(i11).f66824c >= cVar.f66824c) {
                this.f66811b.valueAt(i11).f66824c--;
            }
        }
        notifyItemRemoved(cVar.f66824c);
        return true;
    }

    public boolean G(int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), obj}, this, changeQuickRedirect, false, bb.c.d.R, new Class[]{Integer.TYPE, Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        b bVar = this.f66812c.get(i10);
        if (bVar == null) {
            return false;
        }
        bVar.f66820d = obj;
        return true;
    }

    public boolean H(int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), obj}, this, changeQuickRedirect, false, bb.c.d.I, new Class[]{Integer.TYPE, Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        c cVar = this.f66811b.get(i10);
        if (cVar == null) {
            return false;
        }
        cVar.f66825d = obj;
        return true;
    }

    public void I(s sVar) {
        if (PatchProxy.proxy(new Object[]{sVar}, this, changeQuickRedirect, false, bb.c.d.f31626x, new Class[]{s.class}, Void.TYPE).isSupported || this.f66813d == sVar) {
            return;
        }
        this.f66813d = sVar;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31648y, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f66813d.getItemCount() + u() + s();
    }

    @p0
    public Object getItemData(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31670z, new Class[]{Integer.TYPE}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        int iU = u();
        if (i10 < iU) {
            return null;
        }
        com.max.heybox.hblog.g.x("RVHeaderFooterAdapter, getItemData, position = " + i10 + ", headerCount = " + iU);
        return this.f66813d.getItemData(i10 - iU);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i10) {
        int i11 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.N, new Class[]{Integer.TYPE}, Long.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Long) patchProxyResultProxy.result).longValue();
        }
        if (!this.f66814e) {
            return super.getItemId(i10);
        }
        int iW = w(i10);
        if (iW != -1) {
            while (i11 < this.f66811b.size()) {
                c cVarValueAt = this.f66811b.valueAt(i11);
                if (cVarValueAt.f66824c == iW) {
                    return cVarValueAt.hashCode();
                }
                i11++;
            }
            return -1L;
        }
        int iV = v(i10);
        if (iV == -1) {
            int iX = x(i10);
            if (iX != -1) {
                return this.f66813d.getDataList().get(iX).hashCode();
            }
            return -1L;
        }
        while (i11 < this.f66812c.size()) {
            b bVarValueAt = this.f66812c.valueAt(i11);
            if (bVarValueAt.f66819c == iV) {
                bVarValueAt.hashCode();
            }
            i11++;
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        int i11 = 0;
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.A, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iW = w(i10);
        if (iW != -1) {
            while (i11 < this.f66811b.size()) {
                c cVarValueAt = this.f66811b.valueAt(i11);
                if (cVarValueAt.f66824c == iW) {
                    return cVarValueAt.f66822a;
                }
                i11++;
            }
        } else {
            int iV = v(i10);
            if (iV != -1) {
                while (i11 < this.f66812c.size()) {
                    b bVarValueAt = this.f66812c.valueAt(i11);
                    if (bVarValueAt.f66819c == iV) {
                        return bVarValueAt.f66817a;
                    }
                    i11++;
                }
            } else {
                int iX = x(i10);
                if (iX != -1) {
                    return this.f66813d.getItemViewType(iX);
                }
            }
        }
        return -1;
    }

    public void m(int i10, View view) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), view}, this, changeQuickRedirect, false, bb.c.d.O, new Class[]{Integer.TYPE, View.class}, Void.TYPE).isSupported) {
            return;
        }
        n(i10, view, null);
    }

    public void n(int i10, View view, Object obj) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), view, obj}, this, changeQuickRedirect, false, bb.c.d.P, new Class[]{Integer.TYPE, View.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        o(i10, view, obj, s());
    }

    public void o(int i10, View view, Object obj, int i11) {
        int i12 = 0;
        Object[] objArr = {new Integer(i10), view, obj, new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.Q, new Class[]{cls, View.class, Object.class, cls}, Void.TYPE).isSupported) {
            return;
        }
        while (i12 < this.f66812c.size() && this.f66812c.valueAt(i12).f66819c != i11) {
            i12++;
        }
        if (i12 < this.f66812c.size()) {
            while (i12 < this.f66812c.size()) {
                this.f66812c.valueAt(i12).f66819c++;
                i12++;
            }
        }
        this.f66812c.put(i10, new b(i10, view, i11, obj));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@n0 RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, bb.c.d.D, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f66813d.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new a(gridLayoutManager));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(@n0 RecyclerView.ViewHolder viewHolder, int i10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Z, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        onBindViewHolder((s.e) viewHolder, i10);
    }

    public void onBindViewHolder(@n0 s.e eVar, int i10) {
        if (PatchProxy.proxy(new Object[]{eVar, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.C, new Class[]{s.e.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int iX = x(i10);
        if (iX != -1) {
            this.f66813d.onBindViewHolder(eVar, iX);
            return;
        }
        c cVar = this.f66811b.get(eVar.d());
        if (cVar != null) {
            C(eVar, cVar.f66825d);
            return;
        }
        b bVar = this.f66812c.get(eVar.d());
        if (bVar != null) {
            B(eVar, bVar.f66820d);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31104a0, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : onCreateViewHolder(viewGroup, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public s.e onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.B, new Class[]{ViewGroup.class, Integer.TYPE}, s.e.class);
        if (patchProxyResultProxy.isSupported) {
            return (s.e) patchProxyResultProxy.result;
        }
        c cVar = this.f66811b.get(i10);
        if (cVar != null) {
            return new s.e(i10, cVar.f66823b);
        }
        b bVar = this.f66812c.get(i10);
        return bVar != null ? new s.e(i10, bVar.f66818b) : this.f66813d.onCreateViewHolder(viewGroup, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onViewAttachedToWindow(@n0 RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.proxy(new Object[]{viewHolder}, this, changeQuickRedirect, false, bb.c.d.Y, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
            return;
        }
        D((s.e) viewHolder);
    }

    public void p(int i10, View view) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), view}, this, changeQuickRedirect, false, bb.c.d.F, new Class[]{Integer.TYPE, View.class}, Void.TYPE).isSupported) {
            return;
        }
        q(i10, view, null);
    }

    public void q(int i10, View view, Object obj) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), view, obj}, this, changeQuickRedirect, false, bb.c.d.G, new Class[]{Integer.TYPE, View.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        r(i10, view, obj, u());
    }

    public void r(int i10, View view, Object obj, int i11) {
        Object[] objArr = {new Integer(i10), view, obj, new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.H, new Class[]{cls, View.class, Object.class, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f66811b.size() > 0) {
            for (int i12 = 0; i12 < this.f66811b.size(); i12++) {
                if (this.f66811b.valueAt(i12).f66824c >= i11) {
                    this.f66811b.valueAt(i12).f66824c++;
                }
            }
        }
        this.f66811b.put(i10, new c(i10, view, i11, obj));
    }

    public int s() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.S, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f66812c.size();
    }

    public int t(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.J, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        c cVar = this.f66811b.get(i10);
        if (cVar != null) {
            return cVar.f66824c;
        }
        return -1;
    }

    public int u() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.K, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f66811b.size();
    }

    public int v(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.X, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (this.f66812c.size() <= 0 || (i10 - this.f66811b.size()) - this.f66813d.getItemCount() < 0) {
            return -1;
        }
        return (i10 - this.f66811b.size()) - this.f66813d.getItemCount();
    }

    public int w(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.V, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (i10 < 0 || i10 >= this.f66811b.size()) {
            return -1;
        }
        return i10;
    }

    public int x(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.W, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (w(i10) == -1 && v(i10) == -1) {
            return i10 - this.f66811b.size();
        }
        return -1;
    }

    public s y() {
        return this.f66813d;
    }

    public boolean z(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.T, new Class[]{Integer.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.f66812c.get(i10) != null;
    }
}
