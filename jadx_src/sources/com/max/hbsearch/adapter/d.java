package com.max.hbsearch.adapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.JsonObject;
import com.max.hbsearch.bean.WelcomePageList;
import com.max.hbsearch.bean.WelcomePageListItem;
import com.max.hbsearch.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: HotSearchListPageAdapter.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nHotSearchListPageAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HotSearchListPageAdapter.kt\ncom/max/hbsearch/adapter/HotSearchListPageAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
public final class d extends RecyclerView.Adapter<b> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f72264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final List<WelcomePageList> f72265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private final n f72266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final HashMap<Integer, b> f72267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final HashSet<WelcomePageListItem> f72268f;

    /* JADX INFO: compiled from: HotSearchListPageAdapter.kt */
    public static final class a extends DiffUtil.Callback {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final List<WelcomePageListItem> f72269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final List<WelcomePageListItem> f72270b;

        public a(@dl.d List<WelcomePageListItem> oldList, @dl.d List<WelcomePageListItem> newList) {
            f0.p(oldList, "oldList");
            f0.p(newList, "newList");
            this.f72269a = oldList;
            this.f72270b = newList;
        }

        @dl.d
        public final List<WelcomePageListItem> a() {
            return this.f72270b;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areContentsTheSame(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.k.U6, new Class[]{cls, cls}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            WelcomePageListItem welcomePageListItem = (WelcomePageListItem) CollectionsKt___CollectionsKt.R2(this.f72269a, i10);
            WelcomePageListItem welcomePageListItem2 = (WelcomePageListItem) CollectionsKt___CollectionsKt.R2(this.f72270b, i11);
            return (f0.g(welcomePageListItem != null ? welcomePageListItem.getImage() : null, welcomePageListItem2 != null ? welcomePageListItem2.getImage() : null) & f0.g(welcomePageListItem != null ? welcomePageListItem.getText() : null, welcomePageListItem2 != null ? welcomePageListItem2.getText() : null)) | f0.g(welcomePageListItem, welcomePageListItem2);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areItemsTheSame(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.k.T6, new Class[]{cls, cls}, Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f0.g((WelcomePageListItem) CollectionsKt___CollectionsKt.R2(this.f72269a, i10), (WelcomePageListItem) CollectionsKt___CollectionsKt.R2(this.f72270b, i11));
        }

        @dl.d
        public final List<WelcomePageListItem> b() {
            return this.f72269a;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        /* JADX INFO: renamed from: getNewListSize */
        public int getF26375e() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.S6, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f72270b.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        /* JADX INFO: renamed from: getOldListSize */
        public int getF26374d() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.R6, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f72269a.size();
        }
    }

    /* JADX INFO: compiled from: HotSearchListPageAdapter.kt */
    public static final class b extends RecyclerView.ViewHolder {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final RecyclerView f72271b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        private final HotSearchListItemAdapter f72272c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @e
        private com.max.hbsearch.utils.b f72273d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@dl.d RecyclerView listPageItemsRV, @dl.d HotSearchListItemAdapter adapter, @e com.max.hbsearch.utils.b bVar) {
            super(listPageItemsRV);
            f0.p(listPageItemsRV, "listPageItemsRV");
            f0.p(adapter, "adapter");
            this.f72271b = listPageItemsRV;
            this.f72272c = adapter;
            this.f72273d = bVar;
        }

        public /* synthetic */ b(RecyclerView recyclerView, HotSearchListItemAdapter hotSearchListItemAdapter, com.max.hbsearch.utils.b bVar, int i10, u uVar) {
            this(recyclerView, hotSearchListItemAdapter, (i10 & 4) != 0 ? null : bVar);
        }

        @dl.d
        public final HotSearchListItemAdapter a() {
            return this.f72272c;
        }

        @e
        public final com.max.hbsearch.utils.b b() {
            return this.f72273d;
        }

        @dl.d
        public final RecyclerView d() {
            return this.f72271b;
        }

        public final void g(@e com.max.hbsearch.utils.b bVar) {
            this.f72273d = bVar;
        }
    }

    public d(@dl.d Context context, @dl.d List<WelcomePageList> data, @e n nVar) {
        f0.p(context, "context");
        f0.p(data, "data");
        this.f72264b = context;
        this.f72265c = data;
        this.f72266d = nVar;
        this.f72267e = new HashMap<>();
        this.f72268f = new HashSet<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(b holder, d this$0, int i10, boolean z10, int i11) {
        Object[] objArr = {holder, this$0, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.O6, new Class[]{b.class, d.class, cls, Boolean.TYPE, cls}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(holder, "$holder");
        f0.p(this$0, "this$0");
        WelcomePageListItem welcomePageListItem = (WelcomePageListItem) CollectionsKt___CollectionsKt.R2(holder.a().w(), i11);
        if (welcomePageListItem != null) {
            if (!(!this$0.f72268f.contains(welcomePageListItem))) {
                welcomePageListItem = null;
            }
            if (welcomePageListItem != null) {
                this$0.q(welcomePageListItem, i11, i10);
            }
        }
    }

    private final void q(WelcomePageListItem welcomePageListItem, int i10, int i11) {
        Object[] objArr = {welcomePageListItem, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.k.N6, new Class[]{WelcomePageListItem.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f72268f.add(welcomePageListItem);
        JsonObject report = welcomePageListItem.getReport();
        if (report == null) {
            report = new JsonObject();
        }
        com.max.hbcommon.analytics.d.d("3", lb.d.A, null, report);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.L6, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f72265c.size();
    }

    public void n(@dl.d final b holder, final int i10) {
        List<WelcomePageListItem> items;
        List<WelcomePageListItem> listN2;
        if (PatchProxy.proxy(new Object[]{holder, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.M6, new Class[]{b.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(holder, "holder");
        this.f72267e.put(Integer.valueOf(i10), holder);
        WelcomePageList welcomePageList = (WelcomePageList) CollectionsKt___CollectionsKt.R2(this.f72265c, i10);
        if (welcomePageList != null && (items = welcomePageList.getItems()) != null && (listN2 = CollectionsKt___CollectionsKt.n2(items)) != null) {
            if (!(!listN2.isEmpty())) {
                listN2 = null;
            }
            if (listN2 != null) {
                DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new a(holder.a().w(), listN2), true);
                f0.o(diffResultCalculateDiff, "calculateDiff(...)");
                holder.a().B(listN2);
                diffResultCalculateDiff.dispatchUpdatesTo(holder.a());
            }
        }
        WelcomePageList welcomePageList2 = (WelcomePageList) CollectionsKt___CollectionsKt.R2(this.f72265c, i10);
        holder.a().C(welcomePageList2 != null ? welcomePageList2.getTab_type() : null);
        com.max.hbsearch.utils.b bVarB = holder.b();
        if (bVarB != null) {
            bVarB.i(holder.d());
        }
        com.max.hbsearch.utils.b bVar = new com.max.hbsearch.utils.b();
        bVar.b(holder.d(), new com.max.hbsearch.utils.b.a() { // from class: com.max.hbsearch.adapter.c
            @Override // com.max.hbsearch.utils.b.a
            public final void a(boolean z10, int i11) {
                d.o(holder, this, i10, z10, i11);
            }
        });
        holder.g(bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.Q6, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        n((b) viewHolder, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.P6, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : p(viewGroup, i10);
    }

    @dl.d
    public b p(@dl.d ViewGroup parent, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parent, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.K6, new Class[]{ViewGroup.class, Integer.TYPE}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        f0.p(parent, "parent");
        HotSearchListItemAdapter hotSearchListItemAdapter = new HotSearchListItemAdapter(this.f72264b, CollectionsKt__CollectionsKt.E(), this.f72266d, null);
        RecyclerView recyclerView = new RecyclerView(this.f72264b);
        recyclerView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(hotSearchListItemAdapter);
        recyclerView.setOverScrollMode(2);
        return new b(recyclerView, hotSearchListItemAdapter, null, 4, null);
    }
}
