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
import com.max.xiaoheihe.bean.bbs.ProfileEventResult;
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
import kotlin.jvm.internal.u;
import kotlin.z;
import ng.j;

/* JADX INFO: compiled from: UserCenteredMomentSearchFragment.kt */
/* JADX INFO: loaded from: classes9.dex */
@t0({"SMAP\nUserCenteredMomentSearchFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserCenteredMomentSearchFragment.kt\ncom/max/xiaoheihe/module/account/specificsearch/UserCenteredMomentSearchFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,242:1\n172#2,9:243\n262#3,2:252\n262#3,2:254\n*S KotlinDebug\n*F\n+ 1 UserCenteredMomentSearchFragment.kt\ncom/max/xiaoheihe/module/account/specificsearch/UserCenteredMomentSearchFragment\n*L\n40#1:243,9\n210#1:252,2\n212#1:254,2\n*E\n"})
@m(path = lb.d.F)
@o(parameters = 0)
public final class UserCenteredMomentSearchFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    public static final a f79215k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f79216l = 8;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private static final String f79217m = "UserMomentSearchFragment-dbg";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    public static final String f79218n = "search_user_id";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    public static final String f79219o = "search_user_name";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final z f79220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ld.b f79221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private com.max.xiaoheihe.module.news.adapter.a f79222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f79223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final List<FeedsContentBaseObj> f79224f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private String f79225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private String f79226h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f79227i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private String f79228j;

    /* JADX INFO: compiled from: UserCenteredMomentSearchFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: UserCenteredMomentSearchFragment.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25306, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity mContext = ((com.max.hbcommon.base.d) UserCenteredMomentSearchFragment.this).mContext;
            f0.o(mContext, "mContext");
            String str = UserCenteredMomentSearchFragment.this.f79228j;
            Bundle bundleE = SearchHelper.f91573a.a().e("main");
            bundleE.putString("quick_from", SearchNewFragment.f72187k4);
            b2 b2Var = b2.f124493a;
            com.max.xiaoheihe.base.router.b.y0(mContext, str, bundleE).A();
        }
    }

    /* JADX INFO: compiled from: UserCenteredMomentSearchFragment.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<ProfileEventResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25308, new Class[0], Void.TYPE).isSupported && UserCenteredMomentSearchFragment.this.isActive()) {
                super.onComplete();
                ld.b bVar = UserCenteredMomentSearchFragment.this.f79221c;
                if (bVar == null) {
                    f0.S("binding");
                    bVar = null;
                }
                bVar.f131326b.f131496c.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 25307, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (UserCenteredMomentSearchFragment.this.isActive()) {
                super.onError(e10);
                UserCenteredMomentSearchFragment.S3(UserCenteredMomentSearchFragment.this);
                ld.b bVar = UserCenteredMomentSearchFragment.this.f79221c;
                if (bVar == null) {
                    f0.S("binding");
                    bVar = null;
                }
                bVar.f131326b.f131496c.p(0);
            }
        }

        public void onNext(@dl.d Result<ProfileEventResult> profileresult) {
            if (PatchProxy.proxy(new Object[]{profileresult}, this, changeQuickRedirect, false, 25309, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(profileresult, "profileresult");
            ProfileEventResult result = profileresult.getResult();
            if (!UserCenteredMomentSearchFragment.this.isActive() || result == null) {
                return;
            }
            UserCenteredMomentSearchFragment.Q3(UserCenteredMomentSearchFragment.this, result.getMoments());
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25310, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ProfileEventResult>) obj);
        }
    }

    /* JADX INFO: compiled from: UserCenteredMomentSearchFragment.kt */
    public static final class d extends com.max.xiaoheihe.module.news.adapter.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        d(Activity activity, List<? extends FeedsContentBaseObj> list) {
            super(activity, list);
        }

        @Override // com.max.xiaoheihe.module.news.adapter.a, com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, FeedsContentBaseObj feedsContentBaseObj) {
            Object[] objArr = {new Integer(i10), feedsContentBaseObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 25313, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : o(i10, feedsContentBaseObj);
        }

        @Override // com.max.xiaoheihe.module.news.adapter.a
        public int o(int i10, @dl.e FeedsContentBaseObj feedsContentBaseObj) {
            Object[] objArr = {new Integer(i10), feedsContentBaseObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 25311, new Class[]{cls, FeedsContentBaseObj.class}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            return f0.g(feedsContentBaseObj != null ? feedsContentBaseObj.getWrapper_type() : null, "search_tips") ? R.layout.item_go_to_general_search_tip : super.o(i10, feedsContentBaseObj);
        }

        @Override // com.max.xiaoheihe.module.news.adapter.a, com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 25314, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            p(eVar, (FeedsContentBaseObj) obj);
        }

        @Override // com.max.xiaoheihe.module.news.adapter.a
        public void p(@dl.e s.e eVar, @dl.e FeedsContentBaseObj feedsContentBaseObj) {
            if (PatchProxy.proxy(new Object[]{eVar, feedsContentBaseObj}, this, changeQuickRedirect, false, 25312, new Class[]{s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported || UserCenteredMomentSearchFragment.L3(UserCenteredMomentSearchFragment.this, eVar, feedsContentBaseObj)) {
                return;
            }
            super.p(eVar, feedsContentBaseObj);
        }
    }

    /* JADX INFO: compiled from: UserCenteredMomentSearchFragment.kt */
    public static final class e implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // pg.b
        public final void f(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 25315, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            UserCenteredMomentSearchFragment.M3(UserCenteredMomentSearchFragment.this, true);
        }
    }

    /* JADX INFO: compiled from: UserCenteredMomentSearchFragment.kt */
    public static final class f implements j0<String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25317, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(str);
        }

        public final void b(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25316, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            UserCenteredMomentSearchFragment.this.f79228j = str;
            UserCenteredMomentSearchFragment.M3(UserCenteredMomentSearchFragment.this, false);
        }
    }

    /* JADX INFO: compiled from: UserCenteredMomentSearchFragment.kt */
    public static final class g extends DiffUtil.ItemCallback<FeedsContentBaseObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        public boolean a(@dl.d FeedsContentBaseObj oldItem, @dl.d FeedsContentBaseObj newItem) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oldItem, newItem}, this, changeQuickRedirect, false, 25319, new Class[]{FeedsContentBaseObj.class, FeedsContentBaseObj.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(oldItem, "oldItem");
            f0.p(newItem, "newItem");
            return Objects.equals(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public /* bridge */ /* synthetic */ boolean areContentsTheSame(FeedsContentBaseObj feedsContentBaseObj, FeedsContentBaseObj feedsContentBaseObj2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{feedsContentBaseObj, feedsContentBaseObj2}, this, changeQuickRedirect, false, 25321, new Class[]{Object.class, Object.class}, Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : a(feedsContentBaseObj, feedsContentBaseObj2);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public /* bridge */ /* synthetic */ boolean areItemsTheSame(FeedsContentBaseObj feedsContentBaseObj, FeedsContentBaseObj feedsContentBaseObj2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{feedsContentBaseObj, feedsContentBaseObj2}, this, changeQuickRedirect, false, 25320, new Class[]{Object.class, Object.class}, Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : b(feedsContentBaseObj, feedsContentBaseObj2);
        }

        public boolean b(@dl.d FeedsContentBaseObj oldItem, @dl.d FeedsContentBaseObj newItem) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oldItem, newItem}, this, changeQuickRedirect, false, 25318, new Class[]{FeedsContentBaseObj.class, FeedsContentBaseObj.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(oldItem, "oldItem");
            f0.p(newItem, "newItem");
            return f0.g(oldItem.getWrapper_type(), newItem.getWrapper_type()) && f0.g(oldItem.getContent_type(), newItem.getContent_type()) && f0.g(oldItem, newItem);
        }
    }

    public UserCenteredMomentSearchFragment() {
        final yh.a aVar = null;
        this.f79220b = FragmentViewModelLazyKt.h(this, n0.d(com.max.xiaoheihe.module.account.specificsearch.d.class), new yh.a<b1>() { // from class: com.max.xiaoheihe.module.account.specificsearch.UserCenteredMomentSearchFragment$special$$inlined$activityViewModels$default$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25322, new Class[0], b1.class);
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
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25323, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        }, new yh.a<u2.a>() { // from class: com.max.xiaoheihe.module.account.specificsearch.UserCenteredMomentSearchFragment$special$$inlined$activityViewModels$default$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, u2.a] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ u2.a invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25325, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }

            @Override // yh.a
            @dl.d
            public final u2.a invoke() {
                u2.a aVar2;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25324, new Class[0], u2.a.class);
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
        }, new yh.a<y0.b>() { // from class: com.max.xiaoheihe.module.account.specificsearch.UserCenteredMomentSearchFragment$special$$inlined$activityViewModels$default$3
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final y0.b invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25326, new Class[0], y0.b.class);
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
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25327, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        });
    }

    public static final /* synthetic */ boolean L3(UserCenteredMomentSearchFragment userCenteredMomentSearchFragment, s.e eVar, FeedsContentBaseObj feedsContentBaseObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{userCenteredMomentSearchFragment, eVar, feedsContentBaseObj}, null, changeQuickRedirect, true, 25305, new Class[]{UserCenteredMomentSearchFragment.class, s.e.class, FeedsContentBaseObj.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : userCenteredMomentSearchFragment.T3(eVar, feedsContentBaseObj);
    }

    public static final /* synthetic */ void M3(UserCenteredMomentSearchFragment userCenteredMomentSearchFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{userCenteredMomentSearchFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 25304, new Class[]{UserCenteredMomentSearchFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        userCenteredMomentSearchFragment.U3(z10);
    }

    public static final /* synthetic */ void Q3(UserCenteredMomentSearchFragment userCenteredMomentSearchFragment, List list) {
        if (PatchProxy.proxy(new Object[]{userCenteredMomentSearchFragment, list}, null, changeQuickRedirect, true, 25303, new Class[]{UserCenteredMomentSearchFragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        userCenteredMomentSearchFragment.Z3(list);
    }

    public static final /* synthetic */ void S3(UserCenteredMomentSearchFragment userCenteredMomentSearchFragment) {
        if (PatchProxy.proxy(new Object[]{userCenteredMomentSearchFragment}, null, changeQuickRedirect, true, 25302, new Class[]{UserCenteredMomentSearchFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        userCenteredMomentSearchFragment.showError();
    }

    private final boolean T3(s.e eVar, FeedsContentBaseObj feedsContentBaseObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eVar, feedsContentBaseObj}, this, changeQuickRedirect, false, 25295, new Class[]{s.e.class, FeedsContentBaseObj.class}, Boolean.TYPE);
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
            textView.setText(this.f79228j);
        }
        View viewB = eVar.b();
        if (viewB != null) {
            viewB.setOnClickListener(new b());
        }
        return true;
    }

    @SuppressLint({"AutoDispose"})
    private final void U3(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 25296, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.news.adapter.a aVar = this.f79222d;
        if (!isActive() || aVar == null) {
            return;
        }
        if (z10) {
            this.f79223e += 30;
        } else {
            this.f79223e = 0;
        }
        addDisposable((io.reactivex.disposables.b) i.a().w8(this.f79225g, this.f79228j, this.f79223e, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private final com.max.xiaoheihe.module.account.specificsearch.d V3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25291, new Class[0], com.max.xiaoheihe.module.account.specificsearch.d.class);
        return patchProxyResultProxy.isSupported ? (com.max.xiaoheihe.module.account.specificsearch.d) patchProxyResultProxy.result : (com.max.xiaoheihe.module.account.specificsearch.d) this.f79220b.getValue();
    }

    private final void W3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25294, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ld.b bVar = this.f79221c;
        if (bVar == null) {
            f0.S("binding");
            bVar = null;
        }
        mb.b1 b1Var = bVar.f131326b;
        b1Var.f131495b.setClipToPadding(false);
        b1Var.f131495b.setClipChildren(false);
        b1Var.f131495b.setLayoutManager(new LinearLayoutManager(this.mContext));
        d dVar = new d(this.mContext, CollectionsKt__CollectionsKt.E());
        this.f79222d = dVar;
        b1Var.f131495b.setAdapter(dVar);
        b1Var.f131495b.setOverScrollMode(2);
        if (b1Var.f131495b.getItemDecorationCount() == 0) {
            b1Var.f131495b.addItemDecoration(new com.max.xiaoheihe.module.account.specificsearch.a(this.mContext.getResources().getDimensionPixelSize(R.dimen.divider_height), 0, 2, null));
        }
        b1Var.f131496c.i0(false);
        b1Var.f131496c.f0(new e());
        b1Var.f131496c.setOverScrollMode(2);
    }

    private final void X3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25300, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String str = this.f79227i ? "我" : this.f79226h;
        V3().i("搜索" + str + "发布过的内容、游戏评价");
    }

    private final void Y3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25299, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V3().h().k(this, new f());
    }

    private final void Z3(List<? extends FeedsContentBaseObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 25297, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (list != null) {
            if (this.f79223e == 0) {
                this.f79224f.clear();
            }
            this.f79224f.addAll(list);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f79224f);
            com.max.xiaoheihe.module.news.adapter.a aVar = this.f79222d;
            if (aVar != null) {
                com.max.hbcommon.base.adapter.d.b(aVar, arrayList, new g());
            }
        }
        a4(!com.max.hbcommon.utils.c.w(list));
    }

    private final void a4(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 25298, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ld.b bVar = null;
        if (z10) {
            ld.b bVar2 = this.f79221c;
            if (bVar2 == null) {
                f0.S("binding");
                bVar2 = null;
            }
            bVar2.f131326b.f131496c.b0(true);
        } else {
            ld.b bVar3 = this.f79221c;
            if (bVar3 == null) {
                f0.S("binding");
                bVar3 = null;
            }
            bVar3.f131326b.f131496c.b0(false);
        }
        if (!this.f79224f.isEmpty()) {
            FeedsContentBaseObj feedsContentBaseObj = (FeedsContentBaseObj) CollectionsKt___CollectionsKt.R2(this.f79224f, 0);
            if (!f0.g(feedsContentBaseObj != null ? feedsContentBaseObj.getWrapper_type() : null, "search_tips")) {
                ld.b bVar4 = this.f79221c;
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
        ld.b bVar5 = this.f79221c;
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
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25293, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        ld.b bVarC = ld.b.c(this.mInflater);
        f0.o(bVarC, "inflate(mInflater)");
        this.f79221c = bVarC;
        if (bVarC == null) {
            f0.S("binding");
            bVarC = null;
        }
        setContentView(bVarC);
        W3();
        Y3();
        X3();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onCreate(@dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 25292, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f79225g = arguments != null ? arguments.getString(f79218n, "-1") : null;
        Bundle arguments2 = getArguments();
        this.f79226h = arguments2 != null ? arguments2.getString(f79219o) : null;
        this.f79227i = com.max.xiaoheihe.module.account.utils.c.c(this.f79225g) != 2;
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25301, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        U3(false);
        showLoading();
    }
}
