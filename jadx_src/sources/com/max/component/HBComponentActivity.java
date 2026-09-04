package com.max.component;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.component.bean.ComponentObj;
import com.max.component.bean.ComponentPathObj;
import com.max.component.componentactivities.ComponentDetailActivity;
import com.max.xiaoheihe.module.game.d0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: HBComponentActivity.kt */
/* JADX INFO: loaded from: classes8.dex */
@t0({"SMAP\nHBComponentActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HBComponentActivity.kt\ncom/max/component/HBComponentActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,297:1\n1045#2:298\n*S KotlinDebug\n*F\n+ 1 HBComponentActivity.kt\ncom/max/component/HBComponentActivity\n*L\n110#1:298\n*E\n"})
public final class HBComponentActivity extends AppCompatActivity {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    public static final a f65381h = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sa.f f65382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private com.max.component.adapter.b f65383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.max.component.adapter.tree.d f65384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final ArrayList<ComponentObj> f65385e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final ArrayList<ComponentObj> f65386f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final ArrayList<ComponentObj> f65387g = new ArrayList<>();

    /* JADX INFO: compiled from: HBComponentActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        public final void a(@dl.d AppCompatActivity activity) {
            if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, bb.c.b.f31004vk, new Class[]{AppCompatActivity.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(activity, "activity");
            activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() | 8192);
            activity.getWindow().addFlags(Integer.MIN_VALUE);
            activity.getWindow().clearFlags(67108864);
            activity.getWindow().setStatusBarColor(-1);
        }
    }

    /* JADX INFO: compiled from: HBComponentActivity.kt */
    public static final class b extends com.max.component.adapter.tree.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f65388b = R.layout.item_tree_component;

        /* JADX INFO: compiled from: HBComponentActivity.kt */
        public final class a extends com.max.component.adapter.tree.e.a {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @dl.d
            private TextView f65389b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f65390c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@dl.d b bVar, View rootView) {
                super(rootView);
                f0.p(rootView, "rootView");
                this.f65390c = bVar;
                View viewFindViewById = rootView.findViewById(R.id.tv_name);
                f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
                this.f65389b = (TextView) viewFindViewById;
            }

            @dl.d
            public final TextView a() {
                return this.f65389b;
            }

            public final void b(@dl.d TextView textView) {
                if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 1221, new Class[]{TextView.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(textView, "<set-?>");
                this.f65389b = textView;
            }
        }

        @Override // com.max.component.adapter.tree.e
        public void a(@dl.d RecyclerView.ViewHolder holder, int i10, @dl.d com.max.component.adapter.tree.b<?> node) {
            if (PatchProxy.proxy(new Object[]{holder, new Integer(i10), node}, this, changeQuickRedirect, false, bb.c.b.f31048xk, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, com.max.component.adapter.tree.b.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(holder, "holder");
            f0.p(node, "node");
            a aVar = holder instanceof a ? (a) holder : null;
            if (aVar != null) {
                com.max.component.adapter.tree.a aVarI = node.i();
                f0.n(aVarI, "null cannot be cast to non-null type com.max.component.bean.ComponentObj");
                aVar.a().setText(((ComponentObj) aVarI).getAndroidName());
            }
        }

        @Override // com.max.component.adapter.tree.e
        public /* bridge */ /* synthetic */ RecyclerView.ViewHolder b(View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1220, new Class[]{View.class}, RecyclerView.ViewHolder.class);
            return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : c(view);
        }

        @dl.d
        public a c(@dl.d View itemView) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{itemView}, this, changeQuickRedirect, false, bb.c.b.f31026wk, new Class[]{View.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(itemView, "itemView");
            return new a(this, itemView);
        }

        @Override // com.max.component.adapter.tree.a
        public int getLayoutId() {
            return this.f65388b;
        }

        @Override // com.max.component.adapter.tree.a
        @dl.d
        public String key() {
            return "";
        }

        @Override // com.max.component.adapter.tree.a
        public void setLayoutId(int i10) {
            this.f65388b = i10;
        }
    }

    /* JADX INFO: compiled from: HBComponentActivity.kt */
    public static final class c extends com.max.component.adapter.tree.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f65391b = R.layout.item_tree_path;

        /* JADX INFO: compiled from: HBComponentActivity.kt */
        public final class a extends com.max.component.adapter.tree.e.a {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @dl.d
            private TextView f65392b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f65393c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@dl.d c cVar, View rootView) {
                super(rootView);
                f0.p(rootView, "rootView");
                this.f65393c = cVar;
                View viewFindViewById = rootView.findViewById(R.id.tv_path);
                f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
                this.f65392b = (TextView) viewFindViewById;
            }

            @dl.d
            public final TextView a() {
                return this.f65392b;
            }

            public final void b(@dl.d TextView textView) {
                if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, bb.c.b.Dk, new Class[]{TextView.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(textView, "<set-?>");
                this.f65392b = textView;
            }
        }

        @Override // com.max.component.adapter.tree.e
        public void a(@dl.d RecyclerView.ViewHolder holder, int i10, @dl.d com.max.component.adapter.tree.b<?> node) {
            if (PatchProxy.proxy(new Object[]{holder, new Integer(i10), node}, this, changeQuickRedirect, false, bb.c.b.Bk, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, com.max.component.adapter.tree.b.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(holder, "holder");
            f0.p(node, "node");
            a aVar = holder instanceof a ? (a) holder : null;
            if (aVar != null) {
                com.max.component.adapter.tree.a aVarI = node.i();
                f0.n(aVarI, "null cannot be cast to non-null type com.max.component.bean.ComponentPathObj");
                aVar.a().setText(((ComponentPathObj) aVarI).getPath());
            }
        }

        @Override // com.max.component.adapter.tree.e
        public /* bridge */ /* synthetic */ RecyclerView.ViewHolder b(View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.b.Ck, new Class[]{View.class}, RecyclerView.ViewHolder.class);
            return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : c(view);
        }

        @dl.d
        public a c(@dl.d View itemView) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{itemView}, this, changeQuickRedirect, false, bb.c.b.Ak, new Class[]{View.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(itemView, "itemView");
            return new a(this, itemView);
        }

        @Override // com.max.component.adapter.tree.a
        public int getLayoutId() {
            return this.f65391b;
        }

        @Override // com.max.component.adapter.tree.a
        @dl.d
        public String key() {
            return "";
        }

        @Override // com.max.component.adapter.tree.a
        public void setLayoutId(int i10) {
            this.f65391b = i10;
        }
    }

    /* JADX INFO: compiled from: HBComponentActivity.kt */
    public static final class d extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@dl.d Rect outRect, @dl.d View view, @dl.d RecyclerView parent, @dl.d RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{outRect, view, parent, state}, this, changeQuickRedirect, false, bb.c.b.Ek, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(outRect, "outRect");
            f0.p(view, "view");
            f0.p(parent, "parent");
            f0.p(state, "state");
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            int i10 = childAdapterPosition % 3;
            outRect.left = (i10 * 3) / 3;
            outRect.right = 3 - (((i10 + 1) * 3) / 3);
            if (childAdapterPosition < 3) {
                outRect.top = 0;
            } else {
                outRect.top = 3;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDraw(@dl.d Canvas c10, @dl.d RecyclerView parent, @dl.d RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{c10, parent, state}, this, changeQuickRedirect, false, bb.c.b.Fk, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(c10, "c");
            f0.p(parent, "parent");
            f0.p(state, "state");
            super.onDraw(c10, parent, state);
        }
    }

    /* JADX INFO: compiled from: Comparisons.kt */
    @t0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 HBComponentActivity.kt\ncom/max/component/HBComponentActivity\n*L\n1#1,328:1\n110#2:329\n*E\n"})
    public static final class e<T> implements Comparator {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{t10, t11}, this, changeQuickRedirect, false, bb.c.b.Gk, new Class[]{Object.class, Object.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : kotlin.comparisons.g.l(((ComponentObj) t10).getPath(), ((ComponentObj) t11).getPath());
        }
    }

    /* JADX INFO: compiled from: HBComponentActivity.kt */
    public static final class f implements com.max.component.adapter.tree.d.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.component.adapter.tree.d.b
        public boolean a(@dl.d com.max.component.adapter.tree.b<com.max.component.adapter.tree.a> node, @dl.d RecyclerView.ViewHolder holder) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{node, holder}, this, changeQuickRedirect, false, bb.c.b.Hk, new Class[]{com.max.component.adapter.tree.b.class, RecyclerView.ViewHolder.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(node, "node");
            f0.p(holder, "holder");
            if (node.n()) {
                HBComponentActivity hBComponentActivity = HBComponentActivity.this;
                ComponentDetailActivity.a aVar = ComponentDetailActivity.f65484e;
                com.max.component.adapter.tree.a aVarI = node.i();
                ComponentObj componentObj = aVarI instanceof ComponentObj ? (ComponentObj) aVarI : null;
                hBComponentActivity.startActivity(aVar.a(hBComponentActivity, componentObj != null ? componentObj.getAndroidName() : null));
            }
            return false;
        }

        @Override // com.max.component.adapter.tree.d.b
        public void b(boolean z10, @dl.d RecyclerView.ViewHolder holder) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), holder}, this, changeQuickRedirect, false, 1230, new Class[]{Boolean.TYPE, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(holder, "holder");
        }
    }

    /* JADX INFO: compiled from: HBComponentActivity.kt */
    public static final class g implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@dl.e Editable editable) {
            boolean z10 = true;
            if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, 1231, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            if (editable != null && editable.length() != 0) {
                z10 = false;
            }
            if (z10) {
                HBComponentActivity.this.S0().clear();
                HBComponentActivity.this.S0().addAll(HBComponentActivity.this.Q0());
                com.max.component.adapter.b bVarT0 = HBComponentActivity.this.T0();
                if (bVarT0 != null) {
                    bVarT0.notifyDataSetChanged();
                    return;
                }
                return;
            }
            String string = editable.toString();
            HBComponentActivity hBComponentActivity = HBComponentActivity.this;
            hBComponentActivity.U0().clear();
            for (ComponentObj componentObj : hBComponentActivity.Q0()) {
                if (HBComponentActivity.c1(hBComponentActivity, componentObj.getPath(), string, 0.0d, 4, null) || HBComponentActivity.c1(hBComponentActivity, componentObj.getAndroidName(), string, 0.0d, 4, null) || HBComponentActivity.c1(hBComponentActivity, componentObj.getDesignName(), string, 0.0d, 4, null)) {
                    hBComponentActivity.U0().add(componentObj);
                }
            }
            hBComponentActivity.S0().clear();
            hBComponentActivity.S0().addAll(hBComponentActivity.U0());
            com.max.component.adapter.b bVarT1 = hBComponentActivity.T0();
            if (bVarT1 != null) {
                bVarT1.notifyDataSetChanged();
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@dl.e CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@dl.e CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    private final void W0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30825nk, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f65385e.clear();
        this.f65385e.addAll(this.f65386f);
        this.f65383c = new com.max.component.adapter.b(this, this.f65385e);
        RecyclerView recyclerView = R0().f139375f;
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.addItemDecoration(new d());
        recyclerView.setAdapter(this.f65383c);
        com.max.component.adapter.b bVar = this.f65383c;
        if (bVar != null) {
            bVar.notifyDataSetChanged();
        }
    }

    private final void X0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1208, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        HashMap<String, com.max.component.g> mapC = com.max.component.f.f65491a.a().c();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, com.max.component.g> entry : mapC.entrySet()) {
            arrayList.add(new ComponentObj(entry.getValue().d(), entry.getValue().e(), entry.getValue().c(), entry.getValue().b(), entry.getClass(), 0, 32, null));
        }
        this.f65386f.clear();
        this.f65386f.addAll(CollectionsKt___CollectionsKt.p5(arrayList, new e()));
    }

    private final void Z0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1210, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(P0(this.f65386f));
        arrayList2.add(new b());
        arrayList2.add(new c());
        n1(new com.max.component.adapter.tree.d(arrayList, arrayList2));
        R0().f139376g.setLayoutManager(new LinearLayoutManager(this));
        R0().f139376g.setAdapter(V0());
        V0().H(new f());
        V0().notifyDataSetChanged();
    }

    public static /* synthetic */ boolean c1(HBComponentActivity hBComponentActivity, String str, String str2, double d10, int i10, Object obj) {
        double d11 = d10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hBComponentActivity, str, str2, new Double(d11), new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.b.f30938sk, new Class[]{HBComponentActivity.class, String.class, String.class, Double.TYPE, Integer.TYPE, Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if ((i10 & 4) != 0) {
            d11 = 0.7d;
        }
        return hBComponentActivity.a1(str, str2, d11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h1(HBComponentActivity this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.b.f30960tk, new Class[]{HBComponentActivity.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        this$0.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i1(HBComponentActivity this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.b.f30982uk, new Class[]{HBComponentActivity.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        this$0.R0().f139371b.K(5);
    }

    @dl.d
    public final com.max.component.adapter.tree.b<com.max.component.adapter.tree.a> P0(@dl.d List<ComponentObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 1211, new Class[]{List.class}, com.max.component.adapter.tree.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.component.adapter.tree.b) patchProxyResultProxy.result;
        }
        f0.p(list, "list");
        com.max.component.adapter.tree.b<com.max.component.adapter.tree.a> bVar = new com.max.component.adapter.tree.b<>(new ComponentPathObj(d0.f87251w, 0, 2, null));
        for (ComponentObj componentObj : list) {
            List listU4 = StringsKt__StringsKt.U4(componentObj.getPath(), new String[]{"/"}, false, 0, 6, null);
            int size = listU4.size();
            com.max.component.adapter.tree.b<com.max.component.adapter.tree.a> bVar2 = bVar;
            for (int i10 = 0; i10 < size; i10++) {
                String str = (String) listU4.get(i10);
                com.max.component.adapter.tree.b<com.max.component.adapter.tree.a> bVarG = bVar2.g(str);
                if (bVarG == null) {
                    bVarG = new com.max.component.adapter.tree.b<>(new ComponentPathObj(str, 0, 2, null));
                    bVarG.u(str);
                    bVar2.a(bVarG);
                }
                bVar2 = bVarG;
            }
            bVar2.a(new com.max.component.adapter.tree.b<>(componentObj));
        }
        bVar.f();
        return bVar;
    }

    @dl.d
    public final ArrayList<ComponentObj> Q0() {
        return this.f65386f;
    }

    @dl.d
    public final sa.f R0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1203, new Class[0], sa.f.class);
        if (patchProxyResultProxy.isSupported) {
            return (sa.f) patchProxyResultProxy.result;
        }
        sa.f fVar = this.f65382b;
        if (fVar != null) {
            return fVar;
        }
        f0.S("binding");
        return null;
    }

    @dl.d
    public final ArrayList<ComponentObj> S0() {
        return this.f65385e;
    }

    @dl.e
    public final com.max.component.adapter.b T0() {
        return this.f65383c;
    }

    @dl.d
    public final ArrayList<ComponentObj> U0() {
        return this.f65387g;
    }

    @dl.d
    public final com.max.component.adapter.tree.d V0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1205, new Class[0], com.max.component.adapter.tree.d.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.component.adapter.tree.d) patchProxyResultProxy.result;
        }
        com.max.component.adapter.tree.d dVar = this.f65384d;
        if (dVar != null) {
            return dVar;
        }
        f0.S("treeAdapter");
        return null;
    }

    public final boolean a1(@dl.e String str, @dl.e String str2, double d10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, new Double(d10)}, this, changeQuickRedirect, false, bb.c.b.f30916rk, new Class[]{String.class, String.class, Double.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (str == null || str2 == null) {
            return false;
        }
        return StringsKt__StringsKt.T2(str, str2, true) || 1.0d - (((double) g1(str, str2)) / ((double) Math.max(str.length(), str2.length()))) >= d10;
    }

    public final int g1(@dl.d String str1, @dl.d String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str1, str2}, this, changeQuickRedirect, false, bb.c.b.f30894qk, new Class[]{String.class, String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(str1, "str1");
        f0.p(str2, "str2");
        int length = str1.length();
        int length2 = str2.length();
        int i10 = length + 1;
        int[][] iArr = new int[i10][];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = new int[length2 + 1];
        }
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                iArr[i12][0] = i12;
                if (i12 == length) {
                    break;
                }
                i12++;
            }
        }
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                iArr[0][i13] = i13;
                if (i13 == length2) {
                    break;
                }
                i13++;
            }
        }
        if (1 <= length) {
            int i14 = 1;
            while (true) {
                if (1 <= length2) {
                    int i15 = 1;
                    while (true) {
                        int i16 = i14 - 1;
                        int i17 = i15 - 1;
                        int i18 = str1.charAt(i16) == str2.charAt(i17) ? 0 : 1;
                        int[] iArr2 = iArr[i14];
                        int[] iArr3 = iArr[i16];
                        iArr2[i15] = Math.min(iArr3[i15] + 1, Math.min(iArr2[i17] + 1, iArr3[i17] + i18));
                        if (i15 == length2) {
                            break;
                        }
                        i15++;
                    }
                }
                if (i14 == length) {
                    break;
                }
                i14++;
            }
        }
        return iArr[length][length2];
    }

    public final void j1(@dl.d sa.f fVar) {
        if (PatchProxy.proxy(new Object[]{fVar}, this, changeQuickRedirect, false, 1204, new Class[]{sa.f.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(fVar, "<set-?>");
        this.f65382b = fVar;
    }

    public final void k1(@dl.e com.max.component.adapter.b bVar) {
        this.f65383c = bVar;
    }

    public final void n1(@dl.d com.max.component.adapter.tree.d dVar) {
        if (PatchProxy.proxy(new Object[]{dVar}, this, changeQuickRedirect, false, 1206, new Class[]{com.max.component.adapter.tree.d.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dVar, "<set-?>");
        this.f65384d = dVar;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 1207, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        f65381h.a(this);
        sa.f fVarC = sa.f.c(getLayoutInflater());
        f0.o(fVarC, "inflate(...)");
        j1(fVarC);
        setContentView(R0().b());
        R0().f139377h.setText("组件列表");
        R0().f139373d.setOnClickListener(new View.OnClickListener() { // from class: com.max.component.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HBComponentActivity.h1(this.f65489b, view);
            }
        });
        R0().f139374e.setOnClickListener(new View.OnClickListener() { // from class: com.max.component.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HBComponentActivity.i1(this.f65490b, view);
            }
        });
        R0().f139372c.addTextChangedListener(new g());
        X0();
        Z0();
        W0();
    }
}
