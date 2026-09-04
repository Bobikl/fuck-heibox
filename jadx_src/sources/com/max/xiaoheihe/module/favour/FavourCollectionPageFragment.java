package com.max.xiaoheihe.module.favour;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.b1;
import androidx.lifecycle.c1;
import androidx.lifecycle.j0;
import androidx.lifecycle.r;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.DiffUtil;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.UiState;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.segmentfilters.SegmentFilterView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.CollectionFavTab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.q8;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.b0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.t;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.z;

/* JADX INFO: compiled from: FavourCollectionPageFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nFavourCollectionPageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavourCollectionPageFragment.kt\ncom/max/xiaoheihe/module/favour/FavourCollectionPageFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,200:1\n106#2,15:201\n262#3,2:216\n*S KotlinDebug\n*F\n+ 1 FavourCollectionPageFragment.kt\ncom/max/xiaoheihe/module/favour/FavourCollectionPageFragment\n*L\n40#1:201,15\n140#1:216,2\n*E\n"})
@o(parameters = 0)
public final class FavourCollectionPageFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final a f83713f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f83714g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final String f83715h = "FavourCollectionFragment-dbg";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final z f83716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private q8 f83717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private FragmentStateAdapter f83718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private List<CollectionFavTab> f83719e;

    /* JADX INFO: compiled from: FavourCollectionPageFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: FavourCollectionPageFragment.kt */
    public static final class b extends FragmentStateAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
            super(FavourCollectionPageFragment.this);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @dl.d
        public Fragment createFragment(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 31783, new Class[]{Integer.TYPE}, Fragment.class);
            return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : FavourCollectionPageFragment.O3(FavourCollectionPageFragment.this, (CollectionFavTab) FavourCollectionPageFragment.this.f83719e.get(i10));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31782, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : FavourCollectionPageFragment.this.f83719e.size();
        }
    }

    /* JADX INFO: compiled from: FavourCollectionPageFragment.kt */
    public static final class c implements SegmentFilterView.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.component.segmentfilters.SegmentFilterView.a
        public void a(@dl.d KeyDescObj data, int i10) {
            if (PatchProxy.proxy(new Object[]{data, new Integer(i10)}, this, changeQuickRedirect, false, 31784, new Class[]{KeyDescObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(data, "data");
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("type", data.getType());
            q8 q8Var = null;
            com.max.hbcommon.analytics.d.d("4", lb.d.A1, null, jsonObject);
            q8 q8Var2 = FavourCollectionPageFragment.this.f83717c;
            if (q8Var2 == null) {
                f0.S("binding");
            } else {
                q8Var = q8Var2;
            }
            q8Var.f114774c.setCurrentItem(i10, false);
        }
    }

    /* JADX INFO: compiled from: FavourCollectionPageFragment.kt */
    @t0({"SMAP\nFavourCollectionPageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavourCollectionPageFragment.kt\ncom/max/xiaoheihe/module/favour/FavourCollectionPageFragment$initViewModel$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,200:1\n1549#2:201\n1620#2,3:202\n*S KotlinDebug\n*F\n+ 1 FavourCollectionPageFragment.kt\ncom/max/xiaoheihe/module/favour/FavourCollectionPageFragment$initViewModel$1\n*L\n170#1:201\n170#1:202,3\n*E\n"})
    public static final class d implements j0<UiState<? extends List<? extends CollectionFavTab>>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: FavourCollectionPageFragment.kt */
        public static final class a extends DiffUtil.ItemCallback<CollectionFavTab> {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            public boolean a(@dl.d CollectionFavTab oldItem, @dl.d CollectionFavTab newItem) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oldItem, newItem}, this, changeQuickRedirect, false, 31790, new Class[]{CollectionFavTab.class, CollectionFavTab.class}, Boolean.TYPE);
                if (patchProxyResultProxy.isSupported) {
                    return ((Boolean) patchProxyResultProxy.result).booleanValue();
                }
                f0.p(oldItem, "oldItem");
                f0.p(newItem, "newItem");
                return f0.g(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            public /* bridge */ /* synthetic */ boolean areContentsTheSame(CollectionFavTab collectionFavTab, CollectionFavTab collectionFavTab2) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{collectionFavTab, collectionFavTab2}, this, changeQuickRedirect, false, 31792, new Class[]{Object.class, Object.class}, Boolean.TYPE);
                return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : a(collectionFavTab, collectionFavTab2);
            }

            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            public /* bridge */ /* synthetic */ boolean areItemsTheSame(CollectionFavTab collectionFavTab, CollectionFavTab collectionFavTab2) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{collectionFavTab, collectionFavTab2}, this, changeQuickRedirect, false, 31791, new Class[]{Object.class, Object.class}, Boolean.TYPE);
                return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : b(collectionFavTab, collectionFavTab2);
            }

            public boolean b(@dl.d CollectionFavTab oldItem, @dl.d CollectionFavTab newItem) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oldItem, newItem}, this, changeQuickRedirect, false, 31789, new Class[]{CollectionFavTab.class, CollectionFavTab.class}, Boolean.TYPE);
                if (patchProxyResultProxy.isSupported) {
                    return ((Boolean) patchProxyResultProxy.result).booleanValue();
                }
                f0.p(oldItem, "oldItem");
                f0.p(newItem, "newItem");
                return f0.g(oldItem.getTab_type(), newItem.getTab_type());
            }
        }

        d() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(UiState<? extends List<? extends CollectionFavTab>> uiState) {
            if (PatchProxy.proxy(new Object[]{uiState}, this, changeQuickRedirect, false, 31788, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(uiState);
        }

        public final void b(UiState<? extends List<CollectionFavTab>> uiState) {
            if (PatchProxy.proxy(new Object[]{uiState}, this, changeQuickRedirect, false, 31787, new Class[]{UiState.class}, Void.TYPE).isSupported) {
                return;
            }
            if (uiState instanceof UiState.Loading) {
                FavourCollectionPageFragment.S3(FavourCollectionPageFragment.this);
                return;
            }
            if (!(uiState instanceof UiState.Success)) {
                if (uiState instanceof UiState.Error) {
                    FavourCollectionPageFragment.R3(FavourCollectionPageFragment.this);
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList(FavourCollectionPageFragment.this.f83719e);
            UiState.Success success = (UiState.Success) uiState;
            FavourCollectionPageFragment.this.f83719e = (List) success.d();
            FragmentStateAdapter fragmentStateAdapter = FavourCollectionPageFragment.this.f83718d;
            if (fragmentStateAdapter != null) {
                com.max.hbcommon.base.adapter.d.a(fragmentStateAdapter, arrayList, (List) success.d(), new a());
            }
            List<CollectionFavTab> list = FavourCollectionPageFragment.this.f83719e;
            ArrayList arrayList2 = new ArrayList(t.Y(list, 10));
            for (CollectionFavTab collectionFavTab : list) {
                KeyDescObj keyDescObj = new KeyDescObj();
                keyDescObj.setType(collectionFavTab.getTab_type());
                keyDescObj.setDesc(collectionFavTab.getTab_name());
                keyDescObj.setKey(String.valueOf(collectionFavTab.hashCode()));
                arrayList2.add(keyDescObj);
            }
            KeyDescObj keyDescObj2 = (KeyDescObj) CollectionsKt___CollectionsKt.R2(arrayList2, 0);
            if (keyDescObj2 != null) {
                keyDescObj2.setChecked(true);
            }
            q8 q8Var = FavourCollectionPageFragment.this.f83717c;
            q8 q8Var2 = null;
            if (q8Var == null) {
                f0.S("binding");
                q8Var = null;
            }
            q8Var.f114773b.setData(CollectionsKt___CollectionsKt.T5(arrayList2));
            q8 q8Var3 = FavourCollectionPageFragment.this.f83717c;
            if (q8Var3 == null) {
                f0.S("binding");
            } else {
                q8Var2 = q8Var3;
            }
            q8Var2.f114773b.j();
            FavourCollectionPageFragment.Q3(FavourCollectionPageFragment.this);
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.favour.FavourCollectionPageFragment$onRefresh$1, reason: invalid class name */
    /* JADX INFO: compiled from: FavourCollectionPageFragment.kt */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements yh.a<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        AnonymousClass1(Object obj) {
            super(0, obj, FavourCollectionPageFragment.class, "isActive", "isActive()Z", 0);
        }

        @dl.d
        public final Boolean i() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31793, new Class[0], Boolean.class);
            return patchProxyResultProxy.isSupported ? (Boolean) patchProxyResultProxy.result : Boolean.valueOf(((FavourCollectionPageFragment) this.receiver).isActive());
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ Boolean invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31794, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : i();
        }
    }

    public FavourCollectionPageFragment() {
        final yh.a<Fragment> aVar = new yh.a<Fragment>() { // from class: com.max.xiaoheihe.module.favour.FavourCollectionPageFragment$special$$inlined$viewModels$default$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final Fragment a() {
                return this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.fragment.app.Fragment, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ Fragment invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31795, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        };
        final z zVarB = b0.b(LazyThreadSafetyMode.NONE, new yh.a<c1>() { // from class: com.max.xiaoheihe.module.favour.FavourCollectionPageFragment$special$$inlined$viewModels$default$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final c1 a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31796, new Class[0], c1.class);
                return patchProxyResultProxy.isSupported ? (c1) patchProxyResultProxy.result : (c1) aVar.invoke();
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.c1, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ c1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31797, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        final yh.a aVar2 = null;
        this.f83716b = FragmentViewModelLazyKt.h(this, n0.d(h.class), new yh.a<b1>() { // from class: com.max.xiaoheihe.module.favour.FavourCollectionPageFragment$special$$inlined$viewModels$default$3
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31798, new Class[0], b1.class);
                return patchProxyResultProxy.isSupported ? (b1) patchProxyResultProxy.result : FragmentViewModelLazyKt.p(zVarB).getViewModelStore();
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.b1, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31799, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        }, new yh.a<u2.a>() { // from class: com.max.xiaoheihe.module.favour.FavourCollectionPageFragment$special$$inlined$viewModels$default$4
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, u2.a] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ u2.a invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31801, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }

            @Override // yh.a
            @dl.d
            public final u2.a invoke() {
                u2.a aVar3;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31800, new Class[0], u2.a.class);
                if (patchProxyResultProxy.isSupported) {
                    return (u2.a) patchProxyResultProxy.result;
                }
                yh.a aVar4 = aVar2;
                if (aVar4 != null && (aVar3 = (u2.a) aVar4.invoke()) != null) {
                    return aVar3;
                }
                c1 c1VarP = FragmentViewModelLazyKt.p(zVarB);
                r rVar = c1VarP instanceof r ? (r) c1VarP : null;
                return rVar != null ? rVar.getDefaultViewModelCreationExtras() : u2.a.C1270a.f140743b;
            }
        }, new yh.a<y0.b>() { // from class: com.max.xiaoheihe.module.favour.FavourCollectionPageFragment$special$$inlined$viewModels$default$5
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final y0.b invoke() {
                y0.b defaultViewModelProviderFactory;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31802, new Class[0], y0.b.class);
                if (patchProxyResultProxy.isSupported) {
                    return (y0.b) patchProxyResultProxy.result;
                }
                c1 c1VarP = FragmentViewModelLazyKt.p(zVarB);
                r rVar = c1VarP instanceof r ? (r) c1VarP : null;
                if (rVar != null && (defaultViewModelProviderFactory = rVar.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                y0.b defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                f0.o(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.y0$b, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ y0.b invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31803, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        });
        this.f83719e = CollectionsKt__CollectionsKt.E();
    }

    public static final /* synthetic */ Fragment O3(FavourCollectionPageFragment favourCollectionPageFragment, CollectionFavTab collectionFavTab) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{favourCollectionPageFragment, collectionFavTab}, null, changeQuickRedirect, true, 31778, new Class[]{FavourCollectionPageFragment.class, CollectionFavTab.class}, Fragment.class);
        return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : favourCollectionPageFragment.Y3(collectionFavTab);
    }

    public static final /* synthetic */ void Q3(FavourCollectionPageFragment favourCollectionPageFragment) {
        if (PatchProxy.proxy(new Object[]{favourCollectionPageFragment}, null, changeQuickRedirect, true, 31780, new Class[]{FavourCollectionPageFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        favourCollectionPageFragment.showContentView();
    }

    public static final /* synthetic */ void R3(FavourCollectionPageFragment favourCollectionPageFragment) {
        if (PatchProxy.proxy(new Object[]{favourCollectionPageFragment}, null, changeQuickRedirect, true, 31781, new Class[]{FavourCollectionPageFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        favourCollectionPageFragment.showError();
    }

    public static final /* synthetic */ void S3(FavourCollectionPageFragment favourCollectionPageFragment) {
        if (PatchProxy.proxy(new Object[]{favourCollectionPageFragment}, null, changeQuickRedirect, true, 31779, new Class[]{FavourCollectionPageFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        favourCollectionPageFragment.showLoading();
    }

    private final h T3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31770, new Class[0], h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) this.f83716b.getValue();
    }

    private final void U3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31772, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f83718d = new b();
        q8 q8Var = this.f83717c;
        q8 q8Var2 = null;
        if (q8Var == null) {
            f0.S("binding");
            q8Var = null;
        }
        q8Var.f114774c.setAdapter(this.f83718d);
        q8 q8Var3 = this.f83717c;
        if (q8Var3 == null) {
            f0.S("binding");
            q8Var3 = null;
        }
        q8Var3.f114774c.setUserInputEnabled(false);
        q8 q8Var4 = this.f83717c;
        if (q8Var4 == null) {
            f0.S("binding");
        } else {
            q8Var2 = q8Var4;
        }
        SegmentFilterView segmentFilterView = q8Var2.f114773b;
        segmentFilterView.setMOnTabCheckedListener(new c());
        segmentFilterView.d();
    }

    private final void V3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31776, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        T3().i(new FavourCollectionPageFragment$initViewData$1(this));
    }

    private final void W3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31775, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        T3().h().k(this, new d());
    }

    private final View X3(Context context, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10)}, this, changeQuickRedirect, false, 31774, new Class[]{Context.class, Integer.TYPE}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        CollectionFavTab collectionFavTab = (CollectionFavTab) CollectionsKt___CollectionsKt.R2(this.f83719e, i10);
        if (collectionFavTab == null) {
            Log.e(f83715h, "[makeCustomTabView] favTabList no data for: " + i10);
            return null;
        }
        TextView textView = new TextView(context);
        textView.setId(R.id.tv_tab_name);
        textView.setText(collectionFavTab.getTab_name());
        textView.setTextSize(1, 14.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, ViewUtils.f(context, 30.0f));
        layoutParams.topMargin = ViewUtils.f(this.mContext, 2.0f);
        layoutParams.bottomMargin = ViewUtils.f(this.mContext, 2.0f);
        layoutParams.leftMargin = i10 == 0 ? ViewUtils.f(this.mContext, 2.0f) : 0;
        layoutParams.rightMargin = i10 == this.f83719e.size() - 1 ? ViewUtils.f(this.mContext, 2.0f) : 0;
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        textView.setTextColor(this.mContext.getColor(R.color.text_primary_2_color));
        textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
        textView.setBackground(new ColorDrawable());
        View view = new View(context);
        view.setId(R.id.divider);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(ViewUtils.f(context, 0.5f), ViewUtils.f(context, 16.0f));
        layoutParams2.gravity = 8388627;
        view.setLayoutParams(layoutParams2);
        view.setBackgroundColor(context.getColor(R.color.divider_primary_1_color));
        view.setVisibility(i10 != 0 ? 0 : 8);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(textView);
        frameLayout.addView(view);
        return frameLayout;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final Fragment Y3(CollectionFavTab collectionFavTab) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{collectionFavTab}, this, changeQuickRedirect, false, 31773, new Class[]{CollectionFavTab.class}, Fragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (Fragment) patchProxyResultProxy.result;
        }
        String tab_type = collectionFavTab.getTab_type();
        if (tab_type != null) {
            switch (tab_type.hashCode()) {
                case 49:
                    if (tab_type.equals("1")) {
                        return new FavourCollectionFolderFragment();
                    }
                    break;
                case 50:
                    if (tab_type.equals("2")) {
                        return com.max.xiaoheihe.module.favour.c.P.a(null);
                    }
                    break;
                case 51:
                    if (tab_type.equals("3")) {
                        FavourWikiListFragment favourWikiListFragmentR3 = FavourWikiListFragment.R3();
                        f0.o(favourWikiListFragmentR3, "{\n                Favour…wInstance()\n            }");
                        return favourWikiListFragmentR3;
                    }
                    break;
            }
        }
        return FavourCollectionContentFragment.f83661l.a(null);
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31771, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        q8 q8VarC = q8.c(this.mInflater);
        f0.o(q8VarC, "inflate(mInflater)");
        this.f83717c = q8VarC;
        if (q8VarC == null) {
            f0.S("binding");
            q8VarC = null;
        }
        setContentView(q8VarC);
        U3();
        W3();
        V3();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31777, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        T3().i(new AnonymousClass1(this));
    }
}
