package com.max.xiaoheihe.module.account.specificsearch;

import android.annotation.SuppressLint;
import android.app.Activity;
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
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.favour.HistoryContentObj;
import com.max.xiaoheihe.bean.favour.HistoryVisitedResult;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.z;
import ng.j;

/* JADX INFO: compiled from: UserCenteredHistorySearchFragment.kt */
/* JADX INFO: loaded from: classes9.dex */
@t0({"SMAP\nUserCenteredHistorySearchFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserCenteredHistorySearchFragment.kt\ncom/max/xiaoheihe/module/account/specificsearch/UserCenteredHistorySearchFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,169:1\n172#2,9:170\n262#3,2:179\n262#3,2:181\n*S KotlinDebug\n*F\n+ 1 UserCenteredHistorySearchFragment.kt\ncom/max/xiaoheihe/module/account/specificsearch/UserCenteredHistorySearchFragment\n*L\n29#1:170,9\n144#1:179,2\n146#1:181,2\n*E\n"})
@m(path = lb.d.G)
@o(parameters = 0)
public final class UserCenteredHistorySearchFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    public static final a f79198h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f79199i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final String f79200j = "UserHistorySearchFragment-dbg";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final z f79201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ld.b f79202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private com.max.xiaoheihe.module.account.specificsearch.b f79203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f79204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final List<HistoryContentObj> f79205f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private String f79206g;

    /* JADX INFO: compiled from: UserCenteredHistorySearchFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: UserCenteredHistorySearchFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<HistoryVisitedResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25273, new Class[0], Void.TYPE).isSupported && UserCenteredHistorySearchFragment.this.isActive()) {
                super.onComplete();
                ld.b bVar = UserCenteredHistorySearchFragment.this.f79202c;
                if (bVar == null) {
                    f0.S("binding");
                    bVar = null;
                }
                bVar.f131326b.f131496c.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 25272, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (UserCenteredHistorySearchFragment.this.isActive()) {
                super.onError(e10);
                UserCenteredHistorySearchFragment.Q3(UserCenteredHistorySearchFragment.this);
                ld.b bVar = UserCenteredHistorySearchFragment.this.f79202c;
                if (bVar == null) {
                    f0.S("binding");
                    bVar = null;
                }
                bVar.f131326b.f131496c.p(0);
            }
        }

        public void onNext(@dl.d Result<HistoryVisitedResult> historyVisitedResultResult) {
            if (PatchProxy.proxy(new Object[]{historyVisitedResultResult}, this, changeQuickRedirect, false, 25274, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(historyVisitedResultResult, "historyVisitedResultResult");
            HistoryVisitedResult result = historyVisitedResultResult.getResult();
            ArrayList<HistoryContentObj> history_visit = result != null ? result.getHistory_visit() : null;
            if (!UserCenteredHistorySearchFragment.this.isActive() || history_visit == null) {
                return;
            }
            UserCenteredHistorySearchFragment.O3(UserCenteredHistorySearchFragment.this, history_visit);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25275, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<HistoryVisitedResult>) obj);
        }
    }

    /* JADX INFO: compiled from: UserCenteredHistorySearchFragment.kt */
    public static final class c implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.b
        public final void f(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 25278, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            UserCenteredHistorySearchFragment.L3(UserCenteredHistorySearchFragment.this, true);
        }
    }

    /* JADX INFO: compiled from: UserCenteredHistorySearchFragment.kt */
    public static final class d implements j0<String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25280, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(str);
        }

        public final void b(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25279, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            UserCenteredHistorySearchFragment.this.f79206g = str;
            UserCenteredHistorySearchFragment.L3(UserCenteredHistorySearchFragment.this, false);
        }
    }

    /* JADX INFO: compiled from: UserCenteredHistorySearchFragment.kt */
    public static final class e extends DiffUtil.ItemCallback<HistoryContentObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        public boolean a(@dl.d HistoryContentObj oldItem, @dl.d HistoryContentObj newItem) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oldItem, newItem}, this, changeQuickRedirect, false, 25282, new Class[]{HistoryContentObj.class, HistoryContentObj.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(oldItem, "oldItem");
            f0.p(newItem, "newItem");
            return Objects.equals(oldItem.getContent(), newItem.getContent());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public /* bridge */ /* synthetic */ boolean areContentsTheSame(HistoryContentObj historyContentObj, HistoryContentObj historyContentObj2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{historyContentObj, historyContentObj2}, this, changeQuickRedirect, false, 25284, new Class[]{Object.class, Object.class}, Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : a(historyContentObj, historyContentObj2);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public /* bridge */ /* synthetic */ boolean areItemsTheSame(HistoryContentObj historyContentObj, HistoryContentObj historyContentObj2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{historyContentObj, historyContentObj2}, this, changeQuickRedirect, false, 25283, new Class[]{Object.class, Object.class}, Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : b(historyContentObj, historyContentObj2);
        }

        public boolean b(@dl.d HistoryContentObj oldItem, @dl.d HistoryContentObj newItem) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oldItem, newItem}, this, changeQuickRedirect, false, 25281, new Class[]{HistoryContentObj.class, HistoryContentObj.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(oldItem, "oldItem");
            f0.p(newItem, "newItem");
            return f0.g(oldItem.getWrapper_type(), newItem.getWrapper_type()) && f0.g(oldItem, newItem);
        }
    }

    public UserCenteredHistorySearchFragment() {
        final yh.a aVar = null;
        this.f79201b = FragmentViewModelLazyKt.h(this, n0.d(com.max.xiaoheihe.module.account.specificsearch.d.class), new yh.a<b1>() { // from class: com.max.xiaoheihe.module.account.specificsearch.UserCenteredHistorySearchFragment$special$$inlined$activityViewModels$default$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25285, new Class[0], b1.class);
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
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25286, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        }, new yh.a<u2.a>() { // from class: com.max.xiaoheihe.module.account.specificsearch.UserCenteredHistorySearchFragment$special$$inlined$activityViewModels$default$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, u2.a] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ u2.a invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25288, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }

            @Override // yh.a
            @dl.d
            public final u2.a invoke() {
                u2.a aVar2;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25287, new Class[0], u2.a.class);
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
        }, new yh.a<y0.b>() { // from class: com.max.xiaoheihe.module.account.specificsearch.UserCenteredHistorySearchFragment$special$$inlined$activityViewModels$default$3
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final y0.b invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25289, new Class[0], y0.b.class);
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
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25290, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        });
    }

    public static final /* synthetic */ void L3(UserCenteredHistorySearchFragment userCenteredHistorySearchFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{userCenteredHistorySearchFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 25271, new Class[]{UserCenteredHistorySearchFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        userCenteredHistorySearchFragment.R3(z10);
    }

    public static final /* synthetic */ void O3(UserCenteredHistorySearchFragment userCenteredHistorySearchFragment, List list) {
        if (PatchProxy.proxy(new Object[]{userCenteredHistorySearchFragment, list}, null, changeQuickRedirect, true, 25270, new Class[]{UserCenteredHistorySearchFragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        userCenteredHistorySearchFragment.W3(list);
    }

    public static final /* synthetic */ void Q3(UserCenteredHistorySearchFragment userCenteredHistorySearchFragment) {
        if (PatchProxy.proxy(new Object[]{userCenteredHistorySearchFragment}, null, changeQuickRedirect, true, 25269, new Class[]{UserCenteredHistorySearchFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        userCenteredHistorySearchFragment.showError();
    }

    @SuppressLint({"AutoDispose"})
    private final void R3(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 25263, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.account.specificsearch.b bVar = this.f79203d;
        if (!isActive() || bVar == null) {
            return;
        }
        if (z10) {
            this.f79204e += 30;
        } else {
            this.f79204e = 0;
        }
        addDisposable((io.reactivex.disposables.b) i.a().R6(this.f79206g, this.f79204e, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private final com.max.xiaoheihe.module.account.specificsearch.d S3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25260, new Class[0], com.max.xiaoheihe.module.account.specificsearch.d.class);
        return patchProxyResultProxy.isSupported ? (com.max.xiaoheihe.module.account.specificsearch.d) patchProxyResultProxy.result : (com.max.xiaoheihe.module.account.specificsearch.d) this.f79201b.getValue();
    }

    private final void T3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25262, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ld.b bVar = this.f79202c;
        if (bVar == null) {
            f0.S("binding");
            bVar = null;
        }
        mb.b1 b1Var = bVar.f131326b;
        b1Var.f131495b.setClipToPadding(false);
        b1Var.f131495b.setClipChildren(false);
        b1Var.f131495b.setLayoutManager(new LinearLayoutManager(this.mContext));
        Activity mContext = this.mContext;
        f0.o(mContext, "mContext");
        com.max.xiaoheihe.module.account.specificsearch.b bVar2 = new com.max.xiaoheihe.module.account.specificsearch.b(mContext, CollectionsKt__CollectionsKt.E(), new yh.a<String>() { // from class: com.max.xiaoheihe.module.account.specificsearch.UserCenteredHistorySearchFragment$initView$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @e
            public final String a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25276, new Class[0], String.class);
                return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : this.f79210b.f79206g;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.String] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ String invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25277, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f79203d = bVar2;
        b1Var.f131495b.setAdapter(bVar2);
        b1Var.f131495b.setOverScrollMode(2);
        if (b1Var.f131495b.getItemDecorationCount() == 0) {
            b1Var.f131495b.addItemDecoration(new com.max.xiaoheihe.module.account.specificsearch.a(this.mContext.getResources().getDimensionPixelSize(R.dimen.divider_height), 0, 2, null));
        }
        b1Var.f131496c.i0(false);
        b1Var.f131496c.f0(new c());
        b1Var.f131496c.setOverScrollMode(2);
    }

    private final void U3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25267, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        S3().i("搜索你的历史记录");
    }

    private final void V3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25266, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        S3().h().k(this, new d());
    }

    private final void W3(List<? extends HistoryContentObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 25264, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (this.f79204e == 0) {
            this.f79205f.clear();
        }
        this.f79205f.addAll(list);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f79205f);
        com.max.xiaoheihe.module.account.specificsearch.b bVar = this.f79203d;
        if (bVar != null) {
            com.max.hbcommon.base.adapter.d.b(bVar, arrayList, new e());
        }
        X3(!com.max.hbcommon.utils.c.w(list));
    }

    private final void X3(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 25265, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ld.b bVar = null;
        if (z10) {
            ld.b bVar2 = this.f79202c;
            if (bVar2 == null) {
                f0.S("binding");
                bVar2 = null;
            }
            bVar2.f131326b.f131496c.b0(true);
        } else {
            ld.b bVar3 = this.f79202c;
            if (bVar3 == null) {
                f0.S("binding");
                bVar3 = null;
            }
            bVar3.f131326b.f131496c.b0(false);
        }
        if (!this.f79205f.isEmpty()) {
            HistoryContentObj historyContentObj = (HistoryContentObj) CollectionsKt___CollectionsKt.R2(this.f79205f, 0);
            if (!f0.g(historyContentObj != null ? historyContentObj.getWrapper_type() : null, "search_tips")) {
                ld.b bVar4 = this.f79202c;
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
        ld.b bVar5 = this.f79202c;
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
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25261, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        ld.b bVarC = ld.b.c(this.mInflater);
        f0.o(bVarC, "inflate(mInflater)");
        this.f79202c = bVarC;
        if (bVarC == null) {
            f0.S("binding");
            bVarC = null;
        }
        setContentView(bVarC);
        T3();
        V3();
        U3();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25268, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        R3(false);
        showLoading();
    }
}
