package com.max.xiaoheihe.module.account.specificsearch;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.b1;
import androidx.lifecycle.j0;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.max.hbcommon.analytics.m;
import com.max.hbcommon.base.adapter.s;
import com.max.hbsearch.SearchNewFragment;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.CollectionFolder;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.module.search.SearchHelper;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.t0;
import kotlin.z;
import ng.j;

/* JADX INFO: compiled from: UserCenteredFavourCollectionSearchFragment.kt */
/* JADX INFO: loaded from: classes9.dex */
@m(path = lb.d.H)
@t0({"SMAP\nUserCenteredFavourCollectionSearchFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserCenteredFavourCollectionSearchFragment.kt\ncom/max/xiaoheihe/module/account/specificsearch/UserCenteredFavourCollectionSearchFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,217:1\n172#2,9:218\n262#3,2:227\n262#3,2:229\n*S KotlinDebug\n*F\n+ 1 UserCenteredFavourCollectionSearchFragment.kt\ncom/max/xiaoheihe/module/account/specificsearch/UserCenteredFavourCollectionSearchFragment\n*L\n37#1:218,9\n196#1:227,2\n198#1:229,2\n*E\n"})
@o(parameters = 0)
public final class UserCenteredFavourCollectionSearchFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f79182h = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final z f79183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ld.b f79184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private com.max.xiaoheihe.module.news.adapter.a f79185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f79186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final List<FeedsContentBaseObj> f79187f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private String f79188g;

    /* JADX INFO: compiled from: UserCenteredFavourCollectionSearchFragment.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25238, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity mContext = ((com.max.hbcommon.base.d) UserCenteredFavourCollectionSearchFragment.this).mContext;
            f0.o(mContext, "mContext");
            String str = UserCenteredFavourCollectionSearchFragment.this.f79188g;
            Bundle bundleE = SearchHelper.f91573a.a().e("main");
            bundleE.putString("quick_from", SearchNewFragment.f72188l4);
            b2 b2Var = b2.f124493a;
            com.max.xiaoheihe.base.router.b.y0(mContext, str, bundleE).A();
        }
    }

    /* JADX INFO: compiled from: UserCenteredFavourCollectionSearchFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<CollectionFolder>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25240, new Class[0], Void.TYPE).isSupported && UserCenteredFavourCollectionSearchFragment.this.isActive()) {
                super.onComplete();
                ld.b bVar = UserCenteredFavourCollectionSearchFragment.this.f79184c;
                if (bVar == null) {
                    f0.S("binding");
                    bVar = null;
                }
                bVar.f131326b.f131496c.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 25239, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (UserCenteredFavourCollectionSearchFragment.this.isActive()) {
                super.onError(e10);
                UserCenteredFavourCollectionSearchFragment.S3(UserCenteredFavourCollectionSearchFragment.this);
                ld.b bVar = UserCenteredFavourCollectionSearchFragment.this.f79184c;
                if (bVar == null) {
                    f0.S("binding");
                    bVar = null;
                }
                bVar.f131326b.f131496c.p(0);
            }
        }

        public void onNext(@dl.d Result<CollectionFolder> profileresult) {
            if (PatchProxy.proxy(new Object[]{profileresult}, this, changeQuickRedirect, false, 25241, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(profileresult, "profileresult");
            CollectionFolder result = profileresult.getResult();
            if (!UserCenteredFavourCollectionSearchFragment.this.isActive() || result == null) {
                return;
            }
            UserCenteredFavourCollectionSearchFragment userCenteredFavourCollectionSearchFragment = UserCenteredFavourCollectionSearchFragment.this;
            List<FeedsContentBaseObj> links = result.getLinks();
            UserCenteredFavourCollectionSearchFragment.Q3(userCenteredFavourCollectionSearchFragment, links != null ? CollectionsKt___CollectionsKt.n2(links) : null);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25242, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<CollectionFolder>) obj);
        }
    }

    /* JADX INFO: compiled from: UserCenteredFavourCollectionSearchFragment.kt */
    public static final class c extends com.max.xiaoheihe.module.news.adapter.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        c(Activity activity, List<? extends FeedsContentBaseObj> list) {
            super(activity, list);
        }

        @Override // com.max.xiaoheihe.module.news.adapter.a, com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, FeedsContentBaseObj feedsContentBaseObj) {
            Object[] objArr = {new Integer(i10), feedsContentBaseObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 25245, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : o(i10, feedsContentBaseObj);
        }

        @Override // com.max.xiaoheihe.module.news.adapter.a
        public int o(int i10, @dl.e FeedsContentBaseObj feedsContentBaseObj) {
            Object[] objArr = {new Integer(i10), feedsContentBaseObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 25243, new Class[]{cls, FeedsContentBaseObj.class}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            return f0.g(feedsContentBaseObj != null ? feedsContentBaseObj.getWrapper_type() : null, "search_tips") ? R.layout.item_go_to_general_search_tip : super.o(i10, feedsContentBaseObj);
        }

        @Override // com.max.xiaoheihe.module.news.adapter.a, com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 25246, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            p(eVar, (FeedsContentBaseObj) obj);
        }

        @Override // com.max.xiaoheihe.module.news.adapter.a
        public void p(@dl.e s.e eVar, @dl.e FeedsContentBaseObj feedsContentBaseObj) {
            if (PatchProxy.proxy(new Object[]{eVar, feedsContentBaseObj}, this, changeQuickRedirect, false, 25244, new Class[]{s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported || UserCenteredFavourCollectionSearchFragment.L3(UserCenteredFavourCollectionSearchFragment.this, eVar, feedsContentBaseObj)) {
                return;
            }
            super.p(eVar, feedsContentBaseObj);
        }
    }

    /* JADX INFO: compiled from: UserCenteredFavourCollectionSearchFragment.kt */
    public static final class d implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // pg.b
        public final void f(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 25247, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            UserCenteredFavourCollectionSearchFragment.M3(UserCenteredFavourCollectionSearchFragment.this, true);
        }
    }

    /* JADX INFO: compiled from: UserCenteredFavourCollectionSearchFragment.kt */
    public static final class e implements j0<String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25249, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(str);
        }

        public final void b(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25248, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            UserCenteredFavourCollectionSearchFragment.this.f79188g = str;
            UserCenteredFavourCollectionSearchFragment.M3(UserCenteredFavourCollectionSearchFragment.this, false);
        }
    }

    /* JADX INFO: compiled from: UserCenteredFavourCollectionSearchFragment.kt */
    public static final class f extends DiffUtil.ItemCallback<FeedsContentBaseObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        public boolean a(@dl.d FeedsContentBaseObj oldItem, @dl.d FeedsContentBaseObj newItem) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oldItem, newItem}, this, changeQuickRedirect, false, 25251, new Class[]{FeedsContentBaseObj.class, FeedsContentBaseObj.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(oldItem, "oldItem");
            f0.p(newItem, "newItem");
            return Objects.equals(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public /* bridge */ /* synthetic */ boolean areContentsTheSame(FeedsContentBaseObj feedsContentBaseObj, FeedsContentBaseObj feedsContentBaseObj2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{feedsContentBaseObj, feedsContentBaseObj2}, this, changeQuickRedirect, false, 25253, new Class[]{Object.class, Object.class}, Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : a(feedsContentBaseObj, feedsContentBaseObj2);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public /* bridge */ /* synthetic */ boolean areItemsTheSame(FeedsContentBaseObj feedsContentBaseObj, FeedsContentBaseObj feedsContentBaseObj2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{feedsContentBaseObj, feedsContentBaseObj2}, this, changeQuickRedirect, false, 25252, new Class[]{Object.class, Object.class}, Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : b(feedsContentBaseObj, feedsContentBaseObj2);
        }

        public boolean b(@dl.d FeedsContentBaseObj oldItem, @dl.d FeedsContentBaseObj newItem) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oldItem, newItem}, this, changeQuickRedirect, false, 25250, new Class[]{FeedsContentBaseObj.class, FeedsContentBaseObj.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(oldItem, "oldItem");
            f0.p(newItem, "newItem");
            return f0.g(oldItem.getWrapper_type(), newItem.getWrapper_type()) && f0.g(oldItem.getContent_type(), newItem.getContent_type()) && f0.g(oldItem, newItem);
        }
    }

    public UserCenteredFavourCollectionSearchFragment() {
        final yh.a aVar = null;
        this.f79183b = FragmentViewModelLazyKt.h(this, n0.d(com.max.xiaoheihe.module.account.specificsearch.d.class), new yh.a<b1>() { // from class: com.max.xiaoheihe.module.account.specificsearch.UserCenteredFavourCollectionSearchFragment$special$$inlined$activityViewModels$default$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25254, new Class[0], b1.class);
                if (patchProxyResultProxy.isSupported) {
                    return (b1) patchProxyResultProxy.result;
                }
                b1 viewModelStore = this.requireActivity().getViewModelStore();
                f0.o(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.b1, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25255, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        }, new yh.a<u2.a>() { // from class: com.max.xiaoheihe.module.account.specificsearch.UserCenteredFavourCollectionSearchFragment$special$$inlined$activityViewModels$default$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, u2.a] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ u2.a invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25257, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }

            @Override // yh.a
            @dl.d
            public final u2.a invoke() {
                u2.a aVar2;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25256, new Class[0], u2.a.class);
                if (patchProxyResultProxy.isSupported) {
                    return (u2.a) patchProxyResultProxy.result;
                }
                yh.a aVar3 = aVar;
                if (aVar3 != null && (aVar2 = (u2.a) aVar3.invoke()) != null) {
                    return aVar2;
                }
                u2.a defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                f0.o(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new yh.a<y0.b>() { // from class: com.max.xiaoheihe.module.account.specificsearch.UserCenteredFavourCollectionSearchFragment$special$$inlined$activityViewModels$default$3
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final y0.b invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25258, new Class[0], y0.b.class);
                if (patchProxyResultProxy.isSupported) {
                    return (y0.b) patchProxyResultProxy.result;
                }
                y0.b defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                f0.o(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.y0$b, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ y0.b invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25259, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        });
    }

    public static final /* synthetic */ boolean L3(UserCenteredFavourCollectionSearchFragment userCenteredFavourCollectionSearchFragment, s.e eVar, FeedsContentBaseObj feedsContentBaseObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{userCenteredFavourCollectionSearchFragment, eVar, feedsContentBaseObj}, null, changeQuickRedirect, true, 25237, new Class[]{UserCenteredFavourCollectionSearchFragment.class, s.e.class, FeedsContentBaseObj.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : userCenteredFavourCollectionSearchFragment.T3(eVar, feedsContentBaseObj);
    }

    public static final /* synthetic */ void M3(UserCenteredFavourCollectionSearchFragment userCenteredFavourCollectionSearchFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{userCenteredFavourCollectionSearchFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 25236, new Class[]{UserCenteredFavourCollectionSearchFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        userCenteredFavourCollectionSearchFragment.U3(z10);
    }

    public static final /* synthetic */ void Q3(UserCenteredFavourCollectionSearchFragment userCenteredFavourCollectionSearchFragment, List list) {
        if (PatchProxy.proxy(new Object[]{userCenteredFavourCollectionSearchFragment, list}, null, changeQuickRedirect, true, 25235, new Class[]{UserCenteredFavourCollectionSearchFragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        userCenteredFavourCollectionSearchFragment.Z3(list);
    }

    public static final /* synthetic */ void S3(UserCenteredFavourCollectionSearchFragment userCenteredFavourCollectionSearchFragment) {
        if (PatchProxy.proxy(new Object[]{userCenteredFavourCollectionSearchFragment}, null, changeQuickRedirect, true, 25234, new Class[]{UserCenteredFavourCollectionSearchFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        userCenteredFavourCollectionSearchFragment.showError();
    }

    private final boolean T3(s.e eVar, FeedsContentBaseObj feedsContentBaseObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eVar, feedsContentBaseObj}, this, changeQuickRedirect, false, 25227, new Class[]{s.e.class, FeedsContentBaseObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!(eVar != null && eVar.d() == R.layout.item_go_to_general_search_tip)) {
            return false;
        }
        if (!f0.g(feedsContentBaseObj != null ? feedsContentBaseObj.getWrapper_type() : null, "search_tips")) {
            return false;
        }
        TextView textView = (TextView) eVar.i(R.id.tv_search_content);
        if (textView != null) {
            textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
            textView.setText(this.f79188g);
        }
        View viewB = eVar.b();
        if (viewB != null) {
            viewB.setOnClickListener(new a());
        }
        return true;
    }

    @SuppressLint({"AutoDispose"})
    private final void U3(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 25228, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.news.adapter.a aVar = this.f79185d;
        if (!isActive() || aVar == null) {
            return;
        }
        if (z10) {
            this.f79186e += 30;
        } else {
            this.f79186e = 0;
        }
        addDisposable((io.reactivex.disposables.b) i.a().Ua(this.f79188g, this.f79186e, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private final com.max.xiaoheihe.module.account.specificsearch.d V3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25224, new Class[0], com.max.xiaoheihe.module.account.specificsearch.d.class);
        return patchProxyResultProxy.isSupported ? (com.max.xiaoheihe.module.account.specificsearch.d) patchProxyResultProxy.result : (com.max.xiaoheihe.module.account.specificsearch.d) this.f79183b.getValue();
    }

    private final void W3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25226, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ld.b bVar = this.f79184c;
        if (bVar == null) {
            f0.S("binding");
            bVar = null;
        }
        mb.b1 b1Var = bVar.f131326b;
        b1Var.f131495b.setClipToPadding(false);
        b1Var.f131495b.setClipChildren(false);
        b1Var.f131495b.setLayoutManager(new LinearLayoutManager(this.mContext));
        c cVar = new c(this.mContext, CollectionsKt__CollectionsKt.E());
        this.f79185d = cVar;
        b1Var.f131495b.setAdapter(cVar);
        b1Var.f131495b.setOverScrollMode(2);
        if (b1Var.f131495b.getItemDecorationCount() == 0) {
            b1Var.f131495b.addItemDecoration(new com.max.xiaoheihe.module.account.specificsearch.a(this.mContext.getResources().getDimensionPixelSize(R.dimen.divider_height), 0, 2, null));
        }
        b1Var.f131496c.i0(false);
        b1Var.f131496c.f0(new d());
        b1Var.f131496c.setOverScrollMode(2);
    }

    private final void X3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25232, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V3().i("搜索");
    }

    private final void Y3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25231, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V3().h().k(this, new e());
    }

    private final void Z3(List<? extends FeedsContentBaseObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 25229, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (list != null) {
            if (this.f79186e == 0) {
                this.f79187f.clear();
            }
            this.f79187f.addAll(list);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f79187f);
            com.max.xiaoheihe.module.news.adapter.a aVar = this.f79185d;
            if (aVar != null) {
                com.max.hbcommon.base.adapter.d.b(aVar, arrayList, new f());
            }
        }
        a4(!com.max.hbcommon.utils.c.w(list));
    }

    private final void a4(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 25230, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ld.b bVar = null;
        if (z10) {
            ld.b bVar2 = this.f79184c;
            if (bVar2 == null) {
                f0.S("binding");
                bVar2 = null;
            }
            bVar2.f131326b.f131496c.b0(true);
        } else {
            ld.b bVar3 = this.f79184c;
            if (bVar3 == null) {
                f0.S("binding");
                bVar3 = null;
            }
            bVar3.f131326b.f131496c.b0(false);
        }
        if (!this.f79187f.isEmpty()) {
            FeedsContentBaseObj feedsContentBaseObj = (FeedsContentBaseObj) CollectionsKt___CollectionsKt.R2(this.f79187f, 0);
            if (!f0.g(feedsContentBaseObj != null ? feedsContentBaseObj.getWrapper_type() : null, "search_tips")) {
                ld.b bVar4 = this.f79184c;
                if (bVar4 == null) {
                    f0.S("binding");
                } else {
                    bVar = bVar4;
                }
                TextView textView = bVar.f131328d;
                f0.o(textView, "binding.tvNoSearchFound");
                textView.setVisibility(8);
                return;
            }
        }
        ld.b bVar5 = this.f79184c;
        if (bVar5 == null) {
            f0.S("binding");
        } else {
            bVar = bVar5;
        }
        TextView textView2 = bVar.f131328d;
        f0.o(textView2, "binding.tvNoSearchFound");
        textView2.setVisibility(0);
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25225, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        ld.b bVarC = ld.b.c(this.mInflater);
        f0.o(bVarC, "inflate(mInflater)");
        this.f79184c = bVarC;
        if (bVarC == null) {
            f0.S("binding");
            bVarC = null;
        }
        setContentView(bVarC);
        W3();
        Y3();
        X3();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25233, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        U3(false);
        showLoading();
    }
}
