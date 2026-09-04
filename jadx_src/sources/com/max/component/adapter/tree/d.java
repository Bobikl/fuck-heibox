package com.max.component.adapter.tree;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: TreeViewAdapter.kt */
/* JADX INFO: loaded from: classes8.dex */
@t0({"SMAP\nTreeViewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeViewAdapter.kt\ncom/max/component/adapter/tree/TreeViewAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,217:1\n1#2:218\n766#3:219\n857#3,2:220\n1855#3,2:222\n1549#3:224\n1620#3,3:225\n766#3:228\n857#3,2:229\n1855#3,2:231\n1855#3,2:233\n*S KotlinDebug\n*F\n+ 1 TreeViewAdapter.kt\ncom/max/component/adapter/tree/TreeViewAdapter\n*L\n188#1:219\n188#1:220,2\n189#1:222,2\n195#1:224\n195#1:225,3\n207#1:228\n207#1:229,2\n208#1:231,2\n212#1:233,2\n*E\n"})
public final class d extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    public static final a f65465g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    public static final String f65466h = "IS_EXPAND";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final List<com.max.component.adapter.tree.b<com.max.component.adapter.tree.a>> f65467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final List<e> f65468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f65469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private b f65470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f65471f;

    /* JADX INFO: compiled from: TreeViewAdapter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: TreeViewAdapter.kt */
    public interface b {
        boolean a(@dl.d com.max.component.adapter.tree.b<com.max.component.adapter.tree.a> bVar, @dl.d RecyclerView.ViewHolder viewHolder);

        void b(boolean z10, @dl.d RecyclerView.ViewHolder viewHolder);
    }

    /* JADX INFO: compiled from: TreeViewAdapter.kt */
    public static final class c extends DiffUtil.Callback {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<com.max.component.adapter.tree.b<com.max.component.adapter.tree.a>> f65472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f65473b;

        c(List<com.max.component.adapter.tree.b<com.max.component.adapter.tree.a>> list, d dVar) {
            this.f65472a = list;
            this.f65473b = dVar;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areContentsTheSame(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.Ul, new Class[]{cls, cls}, Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : d.n(this.f65473b, this.f65472a.get(i10), (com.max.component.adapter.tree.b) this.f65473b.f65467b.get(i11));
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areItemsTheSame(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.Tl, new Class[]{cls, cls}, Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : d.o(this.f65473b, this.f65472a.get(i10), (com.max.component.adapter.tree.b) this.f65473b.f65467b.get(i11));
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        @dl.e
        @p0
        public Object getChangePayload(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.Vl, new Class[]{cls, cls}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : d.p(this.f65473b, this.f65472a.get(i10), (com.max.component.adapter.tree.b) this.f65473b.f65467b.get(i11));
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        /* JADX INFO: renamed from: getNewListSize */
        public int getF26375e() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Sl, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f65473b.f65467b.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        /* JADX INFO: renamed from: getOldListSize */
        public int getF26374d() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Rl, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f65472a.size();
        }
    }

    public d(@dl.d List<com.max.component.adapter.tree.b<com.max.component.adapter.tree.a>> displayNodes, @dl.d List<e> viewBinders) {
        f0.p(displayNodes, "displayNodes");
        f0.p(viewBinders, "viewBinders");
        this.f65467b = displayNodes;
        this.f65468c = viewBinders;
        this.f65469d = 30;
        if (!displayNodes.isEmpty()) {
            y(displayNodes);
        }
    }

    public /* synthetic */ d(List list, List list2, int i10, u uVar) {
        this((i10 & 1) != 0 ? new ArrayList() : list, list2);
    }

    private final void C(List<com.max.component.adapter.tree.b<com.max.component.adapter.tree.a>> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 1279, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new c(list, this));
        f0.o(diffResultCalculateDiff, "calculateDiff(...)");
        diffResultCalculateDiff.dispatchUpdatesTo(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(d this$0, RecyclerView.ViewHolder holder, View view) {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[]{this$0, holder, view}, null, changeQuickRedirect, true, bb.c.b.Nl, new Class[]{d.class, RecyclerView.ViewHolder.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        f0.p(holder, "$holder");
        com.max.component.adapter.tree.b<com.max.component.adapter.tree.a> bVar = this$0.f65467b.get(holder.getLayoutPosition());
        b bVar2 = this$0.f65470e;
        if (bVar2 != null && bVar2.a(bVar, holder)) {
            z10 = true;
        }
        if (z10 || bVar.n() || bVar.o()) {
            return;
        }
        boolean zM = bVar.m();
        int iIndexOf = this$0.f65467b.indexOf(bVar) + 1;
        if (zM) {
            this$0.notifyItemRangeRemoved(iIndexOf, this$0.F(bVar, true));
        } else {
            this$0.notifyItemRangeInserted(iIndexOf, this$0.r(bVar, iIndexOf));
        }
    }

    private final int F(com.max.component.adapter.tree.b<com.max.component.adapter.tree.a> bVar, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.b.Al, new Class[]{com.max.component.adapter.tree.b.class, Boolean.TYPE}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (bVar.n()) {
            return 0;
        }
        List<com.max.component.adapter.tree.b<T>> listH = bVar.h();
        int size = listH.size();
        this.f65467b.removeAll(listH);
        Iterator it = listH.iterator();
        while (it.hasNext()) {
            com.max.component.adapter.tree.b<com.max.component.adapter.tree.a> bVar2 = (com.max.component.adapter.tree.b) it.next();
            if (bVar2.m()) {
                if (this.f65471f) {
                    bVar2.x();
                }
                size += F(bVar2, false);
            }
        }
        if (z10) {
            bVar.x();
        }
        return size;
    }

    static /* synthetic */ int G(d dVar, com.max.component.adapter.tree.b bVar, boolean z10, int i10, Object obj) {
        Object[] objArr = {dVar, bVar, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.b.Bl, new Class[]{d.class, com.max.component.adapter.tree.b.class, Boolean.TYPE, cls, Object.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return dVar.F(bVar, z10);
    }

    public static final /* synthetic */ boolean n(d dVar, com.max.component.adapter.tree.b bVar, com.max.component.adapter.tree.b bVar2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar, bVar, bVar2}, null, changeQuickRedirect, true, 1289, new Class[]{d.class, com.max.component.adapter.tree.b.class, com.max.component.adapter.tree.b.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : dVar.s(bVar, bVar2);
    }

    public static final /* synthetic */ boolean o(d dVar, com.max.component.adapter.tree.b bVar, com.max.component.adapter.tree.b bVar2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar, bVar, bVar2}, null, changeQuickRedirect, true, bb.c.b.Ol, new Class[]{d.class, com.max.component.adapter.tree.b.class, com.max.component.adapter.tree.b.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : dVar.t(bVar, bVar2);
    }

    public static final /* synthetic */ Object p(d dVar, com.max.component.adapter.tree.b bVar, com.max.component.adapter.tree.b bVar2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar, bVar, bVar2}, null, changeQuickRedirect, true, bb.c.b.Ql, new Class[]{d.class, com.max.component.adapter.tree.b.class, com.max.component.adapter.tree.b.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : dVar.z(bVar, bVar2);
    }

    private final int r(com.max.component.adapter.tree.b<com.max.component.adapter.tree.a> bVar, int i10) {
        int iR = 0;
        Object[] objArr = {bVar, new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.zl, new Class[]{com.max.component.adapter.tree.b.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Iterator it = bVar.h().iterator();
        while (it.hasNext()) {
            com.max.component.adapter.tree.b<com.max.component.adapter.tree.a> bVar2 = (com.max.component.adapter.tree.b) it.next();
            int i11 = iR + 1;
            this.f65467b.add(iR + i10, bVar2);
            iR = bVar2.m() ? i11 + r(bVar2, i10 + i11) : i11;
        }
        if (!bVar.m()) {
            bVar.x();
        }
        return iR;
    }

    private final boolean s(com.max.component.adapter.tree.b<com.max.component.adapter.tree.a> bVar, com.max.component.adapter.tree.b<com.max.component.adapter.tree.a> bVar2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar, bVar2}, this, changeQuickRedirect, false, 1281, new Class[]{com.max.component.adapter.tree.b.class, com.max.component.adapter.tree.b.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return bVar.i() != null && f0.g(bVar.i(), bVar2.i()) && bVar.m() == bVar2.m();
    }

    private final boolean t(com.max.component.adapter.tree.b<com.max.component.adapter.tree.a> bVar, com.max.component.adapter.tree.b<com.max.component.adapter.tree.a> bVar2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar, bVar2}, this, changeQuickRedirect, false, bb.c.b.Il, new Class[]{com.max.component.adapter.tree.b.class, com.max.component.adapter.tree.b.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return bVar.i() != null && f0.g(bVar.i(), bVar2.i());
    }

    @n0
    private final List<com.max.component.adapter.tree.b<com.max.component.adapter.tree.a>> u() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Kl, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        List<com.max.component.adapter.tree.b<com.max.component.adapter.tree.a>> list = this.f65467b;
        ArrayList arrayList = new ArrayList(t.Y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            com.max.component.adapter.tree.b bVar = (com.max.component.adapter.tree.b) it.next();
            com.max.component.adapter.tree.b bVarB = bVar.b();
            if (bVarB != null) {
                bVar = bVarB;
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    private final void y(List<com.max.component.adapter.tree.b<com.max.component.adapter.tree.a>> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.b.ul, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        for (com.max.component.adapter.tree.b<com.max.component.adapter.tree.a> bVar : list) {
            this.f65467b.add(bVar);
            if (!bVar.n() && bVar.m()) {
                y(bVar.h());
            }
        }
    }

    private final Object z(com.max.component.adapter.tree.b<com.max.component.adapter.tree.a> bVar, com.max.component.adapter.tree.b<com.max.component.adapter.tree.a> bVar2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar, bVar2}, this, changeQuickRedirect, false, 1280, new Class[]{com.max.component.adapter.tree.b.class, com.max.component.adapter.tree.b.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Bundle bundle = new Bundle();
        if (bVar2.m() != bVar.m()) {
            bundle.putBoolean(f65466h, bVar2.m());
        }
        if (bundle.size() == 0) {
            return null;
        }
        return bundle;
    }

    @dl.d
    public final Iterator<com.max.component.adapter.tree.b<com.max.component.adapter.tree.a>> A() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.El, new Class[0], Iterator.class);
        return patchProxyResultProxy.isSupported ? (Iterator) patchProxyResultProxy.result : this.f65467b.iterator();
    }

    public final void B(boolean z10) {
        this.f65471f = z10;
    }

    public final void E(@dl.d List<com.max.component.adapter.tree.b<com.max.component.adapter.tree.a>> treeNodes) {
        if (PatchProxy.proxy(new Object[]{treeNodes}, this, changeQuickRedirect, false, bb.c.b.Dl, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(treeNodes, "treeNodes");
        this.f65467b.clear();
        y(treeNodes);
        notifyDataSetChanged();
    }

    public final void H(@dl.e b bVar) {
        this.f65470e = bVar;
    }

    public final void I(int i10) {
        this.f65469d = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Cl, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f65467b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.vl, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f65467b.get(i10).i().getLayoutId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@dl.d final RecyclerView.ViewHolder holder, int i10) {
        Object next;
        if (PatchProxy.proxy(new Object[]{holder, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.yl, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(holder, "holder");
        holder.itemView.setPaddingRelative(this.f65467b.get(i10).j() * this.f65469d, 3, 3, 3);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.max.component.adapter.tree.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.D(this.f65463b, holder, view);
            }
        });
        Iterator<T> it = this.f65468c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((e) next).getLayoutId() == this.f65467b.get(i10).i().getLayoutId()));
        e eVar = (e) next;
        if (eVar != null) {
            eVar.a(holder, i10, this.f65467b.get(i10));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@dl.d RecyclerView.ViewHolder holder, int i10, @dl.d List<? extends Object> payloads) {
        b bVar;
        if (PatchProxy.proxy(new Object[]{holder, new Integer(i10), payloads}, this, changeQuickRedirect, false, bb.c.b.xl, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(holder, "holder");
        f0.p(payloads, "payloads");
        if (!(!payloads.isEmpty())) {
            super.onBindViewHolder(holder, i10, payloads);
            return;
        }
        Object obj = payloads.get(0);
        f0.n(obj, "null cannot be cast to non-null type android.os.Bundle");
        Bundle bundle = (Bundle) obj;
        for (String str : bundle.keySet()) {
            if (f0.g(str, f65466h) && (bVar = this.f65470e) != null) {
                bVar.b(bundle.getBoolean(str), holder);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @dl.d
    public RecyclerView.ViewHolder onCreateViewHolder(@dl.d ViewGroup parent, int i10) {
        Object next;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parent, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.wl, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        if (patchProxyResultProxy.isSupported) {
            return (RecyclerView.ViewHolder) patchProxyResultProxy.result;
        }
        f0.p(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(i10, parent, false);
        Iterator<T> it = this.f65468c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((e) next).getLayoutId() == i10));
        e eVar = (e) next;
        if (eVar != null) {
            f0.m(viewInflate);
            RecyclerView.ViewHolder viewHolderB = eVar.b(viewInflate);
            if (viewHolderB != null) {
                return viewHolderB;
            }
        }
        e eVar2 = this.f65468c.get(0);
        f0.m(viewInflate);
        return eVar2.b(viewInflate);
    }

    public final void v() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Jl, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        List<com.max.component.adapter.tree.b<com.max.component.adapter.tree.a>> listU = u();
        List<com.max.component.adapter.tree.b<com.max.component.adapter.tree.a>> list = this.f65467b;
        ArrayList<com.max.component.adapter.tree.b> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((com.max.component.adapter.tree.b) obj).p()) {
                arrayList.add(obj);
            }
        }
        for (com.max.component.adapter.tree.b bVar : arrayList) {
            if (bVar.m()) {
                G(this, bVar, false, 2, null);
            }
        }
        C(listU);
    }

    public final void w(@dl.d com.max.component.adapter.tree.b<com.max.component.adapter.tree.a> pNode) {
        if (PatchProxy.proxy(new Object[]{pNode}, this, changeQuickRedirect, false, bb.c.b.Ml, new Class[]{com.max.component.adapter.tree.b.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(pNode, "pNode");
        List<com.max.component.adapter.tree.b<com.max.component.adapter.tree.a>> listU = u();
        if (pNode.p()) {
            List<com.max.component.adapter.tree.b<com.max.component.adapter.tree.a>> list = this.f65467b;
            ArrayList<com.max.component.adapter.tree.b> arrayList = new ArrayList();
            for (Object obj : list) {
                if (((com.max.component.adapter.tree.b) obj).p()) {
                    arrayList.add(obj);
                }
            }
            for (com.max.component.adapter.tree.b bVar : arrayList) {
                if (bVar.m() && !f0.g(bVar, pNode)) {
                    G(this, bVar, false, 2, null);
                }
            }
        } else {
            com.max.component.adapter.tree.b<T> bVarL = pNode.l();
            if (bVarL == 0) {
                return;
            }
            for (com.max.component.adapter.tree.b bVar2 : bVarL.h()) {
                if (!f0.g(bVar2, pNode) && bVar2.m()) {
                    G(this, bVar2, false, 2, null);
                }
            }
        }
        C(listU);
    }

    public final void x(@dl.d com.max.component.adapter.tree.b<com.max.component.adapter.tree.a> pNode) {
        if (PatchProxy.proxy(new Object[]{pNode}, this, changeQuickRedirect, false, 1285, new Class[]{com.max.component.adapter.tree.b.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(pNode, "pNode");
        List<com.max.component.adapter.tree.b<com.max.component.adapter.tree.a>> listU = u();
        G(this, pNode, false, 2, null);
        C(listU);
    }
}
