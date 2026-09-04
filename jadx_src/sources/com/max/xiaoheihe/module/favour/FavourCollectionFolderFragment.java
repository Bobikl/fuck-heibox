package com.max.xiaoheihe.module.favour;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.o;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.JsonObject;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcommon.component.bottombutton.base.BaseBottomButton;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.CollectionFolder;
import com.max.xiaoheihe.bean.bbs.CollectionFolders;
import com.max.xiaoheihe.module.bbs.utils.BBSKtUtils;
import com.max.xiaoheihe.module.report.RecyclerViewReportManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.da0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: FavourCollectionFolderFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@com.max.hbcommon.analytics.m(path = lb.d.A1)
@o(parameters = 0)
public final class FavourCollectionFolderFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    public static final a f83697h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f83698i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final String f83699j = "FavourFolder-dbg";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private da0 f83700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private g f83701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final List<CollectionFolder> f83702d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f83703e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f83704f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private RecyclerViewReportManager<CollectionFolder> f83705g;

    /* JADX INFO: compiled from: FavourCollectionFolderFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: FavourCollectionFolderFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<CollectionFolders>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31757, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            FavourCollectionFolderFragment.P3(FavourCollectionFolderFragment.this);
            if (FavourCollectionFolderFragment.this.isActive()) {
                super.onComplete();
                da0 da0Var = FavourCollectionFolderFragment.this.f83700b;
                if (da0Var == null) {
                    f0.S("binding");
                    da0Var = null;
                }
                da0Var.f109709c.A(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 31758, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (FavourCollectionFolderFragment.this.isActive()) {
                super.onError(e10);
                FavourCollectionFolderFragment.Q3(FavourCollectionFolderFragment.this);
                da0 da0Var = FavourCollectionFolderFragment.this.f83700b;
                if (da0Var == null) {
                    f0.S("binding");
                    da0Var = null;
                }
                da0Var.f109709c.A(0);
            }
        }

        public void onNext(@dl.d Result<CollectionFolders> collectionFoldersResult) {
            if (PatchProxy.proxy(new Object[]{collectionFoldersResult}, this, changeQuickRedirect, false, 31759, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(collectionFoldersResult, "collectionFoldersResult");
            CollectionFolders result = collectionFoldersResult.getResult();
            if (!FavourCollectionFolderFragment.this.isActive() || result == null) {
                return;
            }
            List<CollectionFolder> folders = result.getFolders();
            FavourCollectionFolderFragment.O3(FavourCollectionFolderFragment.this, folders != null ? CollectionsKt___CollectionsKt.n2(folders) : null);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31760, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<CollectionFolders>) obj);
        }
    }

    /* JADX INFO: compiled from: FavourCollectionFolderFragment.kt */
    public static final class c implements RecyclerViewReportManager.b<CollectionFolder> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.xiaoheihe.module.report.RecyclerViewReportManager.b
        public /* bridge */ /* synthetic */ void a(CollectionFolder collectionFolder) {
            if (PatchProxy.proxy(new Object[]{collectionFolder}, this, changeQuickRedirect, false, 31768, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(collectionFolder);
        }

        public void b(@dl.d CollectionFolder data) {
            if (PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, 31767, new Class[]{CollectionFolder.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(data, "data");
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty(FavourCollectionContentFragment.f83664o, data.getId());
            com.max.hbcommon.analytics.d.d("3", lb.d.D1, null, jsonObject);
        }
    }

    /* JADX INFO: compiled from: FavourCollectionFolderFragment.kt */
    public static final class d implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 31769, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            FavourCollectionFolderFragment.L3(FavourCollectionFolderFragment.this);
        }
    }

    public static final /* synthetic */ void L3(FavourCollectionFolderFragment favourCollectionFolderFragment) {
        if (PatchProxy.proxy(new Object[]{favourCollectionFolderFragment}, null, changeQuickRedirect, true, 31756, new Class[]{FavourCollectionFolderFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        favourCollectionFolderFragment.R3();
    }

    public static final /* synthetic */ void O3(FavourCollectionFolderFragment favourCollectionFolderFragment, List list) {
        if (PatchProxy.proxy(new Object[]{favourCollectionFolderFragment, list}, null, changeQuickRedirect, true, 31755, new Class[]{FavourCollectionFolderFragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        favourCollectionFolderFragment.V3(list);
    }

    public static final /* synthetic */ void P3(FavourCollectionFolderFragment favourCollectionFolderFragment) {
        if (PatchProxy.proxy(new Object[]{favourCollectionFolderFragment}, null, changeQuickRedirect, true, 31753, new Class[]{FavourCollectionFolderFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        favourCollectionFolderFragment.showContentView();
    }

    public static final /* synthetic */ void Q3(FavourCollectionFolderFragment favourCollectionFolderFragment) {
        if (PatchProxy.proxy(new Object[]{favourCollectionFolderFragment}, null, changeQuickRedirect, true, 31754, new Class[]{FavourCollectionFolderFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        favourCollectionFolderFragment.showError();
    }

    @SuppressLint({"AutoDispose"})
    private final void R3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31748, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((b) com.max.xiaoheihe.network.i.a().v(1).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private final void S3() {
        final BottomButtonLeftItemView bottomButtonLeftItemView;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31746, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LayoutInflater layoutInflater = this.mInflater;
        da0 da0Var = this.f83700b;
        da0 da0Var2 = null;
        if (da0Var == null) {
            f0.S("binding");
            da0Var = null;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_bottom_bar_multi_op, (ViewGroup) da0Var.f109710d, false);
        if (viewInflate != null && (bottomButtonLeftItemView = (BottomButtonLeftItemView) viewInflate.findViewById(R.id.bottom_button)) != null) {
            bottomButtonLeftItemView.k(false);
            bottomButtonLeftItemView.setShowLeftButton(false);
            bottomButtonLeftItemView.setShowRightButton(true);
            bottomButtonLeftItemView.setRightText("新建收藏夹");
            bottomButtonLeftItemView.setRightClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.favour.FavourCollectionFolderFragment$initBottomBar$1$1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: com.max.xiaoheihe.module.favour.FavourCollectionFolderFragment$initBottomBar$1$1$1, reason: invalid class name */
                /* JADX INFO: compiled from: FavourCollectionFolderFragment.kt */
                public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements yh.a<Boolean> {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    AnonymousClass1(Object obj) {
                        super(0, obj, FavourCollectionFolderFragment.class, "isActive", "isActive()Z", 0);
                    }

                    @dl.d
                    public final Boolean i() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31762, new Class[0], Boolean.class);
                        return patchProxyResultProxy.isSupported ? (Boolean) patchProxyResultProxy.result : Boolean.valueOf(((FavourCollectionFolderFragment) this.receiver).isActive());
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, java.lang.Object] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ Boolean invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31763, new Class[0], Object.class);
                        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : i();
                    }
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31761, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    BBSKtUtils.Companion companion = BBSKtUtils.f83254a;
                    Activity mContext = ((com.max.hbcommon.base.d) this.f83708b).mContext;
                    f0.o(mContext, "mContext");
                    LifecycleCoroutineScope lifecycleCoroutineScopeA = z.a(this.f83708b);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f83708b);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    final BottomButtonLeftItemView bottomButtonLeftItemView2 = bottomButtonLeftItemView;
                    final FavourCollectionFolderFragment favourCollectionFolderFragment = this.f83708b;
                    companion.i(mContext, lifecycleCoroutineScopeA, anonymousClass1, null, linkedHashMap, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.favour.FavourCollectionFolderFragment$initBottomBar$1$1.2
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX INFO: renamed from: com.max.xiaoheihe.module.favour.FavourCollectionFolderFragment$initBottomBar$1$1$2$a */
                        /* JADX INFO: compiled from: View.kt */
                        @t0({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$postDelayed$runnable$1\n+ 2 FavourCollectionFolderFragment.kt\ncom/max/xiaoheihe/module/favour/FavourCollectionFolderFragment$initBottomBar$1$1$2\n*L\n1#1,432:1\n106#2:433\n*E\n"})
                        public static final class a implements Runnable {
                            public static ChangeQuickRedirect changeQuickRedirect;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            final /* synthetic */ FavourCollectionFolderFragment f83712b;

                            public a(FavourCollectionFolderFragment favourCollectionFolderFragment) {
                                this.f83712b = favourCollectionFolderFragment;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31766, new Class[0], Void.TYPE).isSupported) {
                                    return;
                                }
                                this.f83712b.onRefresh();
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31765, new Class[0], Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31764, new Class[0], Void.TYPE).isSupported) {
                                return;
                            }
                            bottomButtonLeftItemView2.postDelayed(new a(favourCollectionFolderFragment), 100L);
                        }
                    });
                }
            });
            bottomButtonLeftItemView.setRightButtonStyle(BaseBottomButton.BaseBottomButtonStyle.BlackWhite);
        }
        da0 da0Var3 = this.f83700b;
        if (da0Var3 == null) {
            f0.S("binding");
        } else {
            da0Var2 = da0Var3;
        }
        da0Var2.f109710d.addView(viewInflate);
    }

    private final void T3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31745, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        S3();
        da0 da0Var = this.f83700b;
        if (da0Var == null) {
            f0.S("binding");
            da0Var = null;
        }
        da0Var.f109708b.setClipToPadding(false);
        da0Var.f109708b.setClipChildren(false);
        da0Var.f109708b.setLayoutManager(new LinearLayoutManager(this.mContext));
        RecyclerView rv = da0Var.f109708b;
        f0.o(rv, "rv");
        RecyclerViewReportManager<CollectionFolder> recyclerViewReportManager = new RecyclerViewReportManager<>(rv);
        recyclerViewReportManager.h(new c());
        this.f83705g = recyclerViewReportManager;
        recyclerViewReportManager.b();
        Activity mContext = this.mContext;
        f0.o(mContext, "mContext");
        g gVar = new g(mContext, new ArrayList(), this.f83705g);
        this.f83701c = gVar;
        da0Var.f109708b.setAdapter(gVar);
        da0Var.f109708b.setOverScrollMode(2);
        if (da0Var.f109708b.getItemDecorationCount() == 0) {
            Activity activity = this.mContext;
            com.max.hbcommon.base.adapter.i iVar = new com.max.hbcommon.base.adapter.i(activity, ViewUtils.f(activity, 4.0f), 0, 0);
            iVar.e(this.mContext.getColor(R.color.divider_secondary_2_color));
            da0Var.f109708b.addItemDecoration(iVar);
        }
        da0Var.f109709c.i0(true);
        da0Var.f109709c.S(new d());
        da0Var.f109709c.b0(false);
        da0Var.f109709c.setOverScrollMode(2);
        da0Var.b().setBackgroundColor(this.mContext.getColor(R.color.divider_secondary_2_color));
    }

    private final void U3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31747, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        R3();
        showLoading();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private final void V3(List<CollectionFolder> list) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 31749, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        if (list != null && !list.isEmpty()) {
            z10 = false;
        }
        if (z10) {
            showEmpty();
        } else {
            this.f83702d.clear();
            List<CollectionFolder> list2 = this.f83702d;
            f0.m(list);
            list2.addAll(list);
            g gVar = this.f83701c;
            if (gVar != null) {
                gVar.setDataList(this.f83702d);
                gVar.notifyDataSetChanged();
            }
        }
        if (this.f83704f) {
            this.f83704f = false;
            RecyclerViewReportManager<CollectionFolder> recyclerViewReportManager = this.f83705g;
            if (recyclerViewReportManager != null) {
                recyclerViewReportManager.f(100L);
            }
        }
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @dl.d
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31750, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", "1");
        String string = jsonObject.toString();
        f0.o(string, "additional.toString()");
        return string;
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31744, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        da0 da0VarC = da0.c(this.mInflater);
        f0.o(da0VarC, "inflate(mInflater)");
        this.f83700b = da0VarC;
        if (da0VarC == null) {
            f0.S("binding");
            da0VarC = null;
        }
        setContentView(da0VarC);
        T3();
        U3();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31752, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        R3();
        showLoading();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31751, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        if (this.f83703e) {
            this.f83703e = false;
        } else {
            R3();
        }
    }
}
