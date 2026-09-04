package com.max.hbcommon.base.adapter;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: adapter.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: adapter.kt */
    public static final class a extends DiffUtil.Callback {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<T> f66734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<T> f66735b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ DiffUtil.ItemCallback<T> f66736c;

        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends T> list, List<? extends T> list2, DiffUtil.ItemCallback<T> itemCallback) {
            this.f66734a = list;
            this.f66735b = list2;
            this.f66736c = itemCallback;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areContentsTheSame(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.jx, new Class[]{cls, cls}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            Object objR2 = CollectionsKt___CollectionsKt.R2(this.f66734a, i10);
            Object objR3 = CollectionsKt___CollectionsKt.R2(this.f66735b, i11);
            if (objR2 == null || objR3 == null) {
                return objR2 == null && objR3 == null;
            }
            return this.f66736c.areContentsTheSame((T) objR2, (T) objR3);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areItemsTheSame(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.ix, new Class[]{cls, cls}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            Object objR2 = CollectionsKt___CollectionsKt.R2(this.f66734a, i10);
            Object objR3 = CollectionsKt___CollectionsKt.R2(this.f66735b, i11);
            if (objR2 == null || objR3 == null) {
                return objR2 == null && objR3 == null;
            }
            return this.f66736c.areItemsTheSame((T) objR2, (T) objR3);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        /* JADX INFO: renamed from: getNewListSize */
        public int getF26375e() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.hx, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f66735b.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        /* JADX INFO: renamed from: getOldListSize */
        public int getF26374d() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.gx, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f66734a.size();
        }
    }

    /* JADX INFO: compiled from: adapter.kt */
    public static final class b extends DiffUtil.Callback {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList<T> f66737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<T> f66738b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ DiffUtil.ItemCallback<T> f66739c;

        /* JADX WARN: Multi-variable type inference failed */
        b(ArrayList<T> arrayList, List<? extends T> list, DiffUtil.ItemCallback<T> itemCallback) {
            this.f66737a = arrayList;
            this.f66738b = list;
            this.f66739c = itemCallback;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areContentsTheSame(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.nx, new Class[]{cls, cls}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            Object obj = this.f66737a.get(i10);
            Object obj2 = this.f66738b.get(i11);
            if (obj != null && obj2 != null) {
                return this.f66739c.areContentsTheSame((T) obj, (T) obj2);
            }
            if (obj == null && obj2 == null) {
                return true;
            }
            throw new AssertionError();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areItemsTheSame(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.mx, new Class[]{cls, cls}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            Object obj = this.f66737a.get(i10);
            Object obj2 = this.f66738b.get(i11);
            if (obj == null || obj2 == null) {
                return obj == null && obj2 == null;
            }
            return this.f66739c.areItemsTheSame((T) obj, (T) obj2);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        /* JADX INFO: renamed from: getNewListSize */
        public int getF26375e() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.lx, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f66738b.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        /* JADX INFO: renamed from: getOldListSize */
        public int getF26374d() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.kx, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f66737a.size();
        }
    }

    public static final <T, VH extends RecyclerView.ViewHolder> void a(@dl.d RecyclerView.Adapter<VH> adapter, @dl.d List<? extends T> oldDataList, @dl.d List<? extends T> newDataList, @dl.d DiffUtil.ItemCallback<T> itemCallback) {
        if (PatchProxy.proxy(new Object[]{adapter, oldDataList, newDataList, itemCallback}, null, changeQuickRedirect, true, bb.c.b.fx, new Class[]{RecyclerView.Adapter.class, List.class, List.class, DiffUtil.ItemCallback.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(adapter, "<this>");
        f0.p(oldDataList, "oldDataList");
        f0.p(newDataList, "newDataList");
        f0.p(itemCallback, "itemCallback");
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new a(oldDataList, newDataList, itemCallback));
        f0.o(diffResultCalculateDiff, "calculateDiff(...)");
        diffResultCalculateDiff.dispatchUpdatesTo(adapter);
    }

    public static final <T> void b(@dl.d s<T> sVar, @dl.d List<? extends T> newList, @dl.d DiffUtil.ItemCallback<T> itemCallback) {
        if (PatchProxy.proxy(new Object[]{sVar, newList, itemCallback}, null, changeQuickRedirect, true, bb.c.b.ex, new Class[]{s.class, List.class, DiffUtil.ItemCallback.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(sVar, "<this>");
        f0.p(newList, "newList");
        f0.p(itemCallback, "itemCallback");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(sVar.mDataList);
        sVar.mDataList = newList;
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new b(arrayList, newList, itemCallback));
        f0.o(diffResultCalculateDiff, "calculateDiff(...)");
        diffResultCalculateDiff.dispatchUpdatesTo(new com.max.hbcommon.base.j(sVar));
    }
}
