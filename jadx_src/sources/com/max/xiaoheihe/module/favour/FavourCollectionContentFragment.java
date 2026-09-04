package com.max.xiaoheihe.module.favour;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.t;
import com.max.hbcustomview.recyclerview.UniversalRecyclerView;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.CollectionFolderDetailObjV2;
import com.max.xiaoheihe.bean.favour.FavouredLinkObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.module.bbs.utils.BBSKtUtils;
import com.max.xiaoheihe.module.report.RecyclerViewReportManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.nj;
import df.p8;
import df.x5;
import java.util.ArrayList;
import java.util.List;
import kotlin.b2;
import kotlin.c1;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.s0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: FavourCollectionContentFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nFavourCollectionContentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavourCollectionContentFragment.kt\ncom/max/xiaoheihe/module/favour/FavourCollectionContentFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,454:1\n1#2:455\n262#3,2:456\n262#3,2:458\n262#3,2:460\n262#3,2:462\n193#3,3:464\n*S KotlinDebug\n*F\n+ 1 FavourCollectionContentFragment.kt\ncom/max/xiaoheihe/module/favour/FavourCollectionContentFragment\n*L\n187#1:456,2\n212#1:458,2\n213#1:460,2\n312#1:462,2\n314#1:464,3\n*E\n"})
@com.max.hbcommon.analytics.m(path = lb.d.A1)
@o(parameters = 0)
public final class FavourCollectionContentFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    public static final a f83661l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f83662m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private static final String f83663n = "FavourContent-dbg";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    public static final String f83664o = "folder_id";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p8 f83665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private com.max.xiaoheihe.module.news.adapter.a f83666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private t f83667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f83668e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private String f83670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private com.max.hbcommon.base.e f83671h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private RecyclerViewReportManager<BBSLinkObj> f83673j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final List<FeedsContentBaseObj> f83669f = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f83672i = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final b f83674k = new b();

    /* JADX INFO: compiled from: FavourCollectionContentFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final FavourCollectionContentFragment a(@dl.e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 31708, new Class[]{String.class}, FavourCollectionContentFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (FavourCollectionContentFragment) patchProxyResultProxy.result;
            }
            FavourCollectionContentFragment favourCollectionContentFragment = new FavourCollectionContentFragment();
            favourCollectionContentFragment.setArguments(androidx.core.os.e.b(c1.a(FavourCollectionContentFragment.f83664o, str)));
            return favourCollectionContentFragment;
        }
    }

    /* JADX INFO: compiled from: FavourCollectionContentFragment.kt */
    public static final class b extends DiffUtil.ItemCallback<FeedsContentBaseObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        public boolean a(@dl.d FeedsContentBaseObj oldItem, @dl.d FeedsContentBaseObj newItem) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oldItem, newItem}, this, changeQuickRedirect, false, 31710, new Class[]{FeedsContentBaseObj.class, FeedsContentBaseObj.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(oldItem, "oldItem");
            f0.p(newItem, "newItem");
            return com.max.hbutils.utils.k.f(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public /* bridge */ /* synthetic */ boolean areContentsTheSame(FeedsContentBaseObj feedsContentBaseObj, FeedsContentBaseObj feedsContentBaseObj2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{feedsContentBaseObj, feedsContentBaseObj2}, this, changeQuickRedirect, false, 31712, new Class[]{Object.class, Object.class}, Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : a(feedsContentBaseObj, feedsContentBaseObj2);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public /* bridge */ /* synthetic */ boolean areItemsTheSame(FeedsContentBaseObj feedsContentBaseObj, FeedsContentBaseObj feedsContentBaseObj2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{feedsContentBaseObj, feedsContentBaseObj2}, this, changeQuickRedirect, false, 31711, new Class[]{Object.class, Object.class}, Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : b(feedsContentBaseObj, feedsContentBaseObj2);
        }

        public boolean b(@dl.d FeedsContentBaseObj oldItem, @dl.d FeedsContentBaseObj newItem) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oldItem, newItem}, this, changeQuickRedirect, false, 31709, new Class[]{FeedsContentBaseObj.class, FeedsContentBaseObj.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(oldItem, "oldItem");
            f0.p(newItem, "newItem");
            return f0.g(oldItem.getWrapper_type(), newItem.getWrapper_type()) && f0.g(oldItem.getContent_type(), newItem.getContent_type()) && f0.g(oldItem, newItem);
        }
    }

    /* JADX INFO: compiled from: FavourCollectionContentFragment.kt */
    @t0({"SMAP\nFavourCollectionContentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavourCollectionContentFragment.kt\ncom/max/xiaoheihe/module/favour/FavourCollectionContentFragment$fetchCollectContentList$disposable$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,454:1\n1603#2,9:455\n1855#2:464\n1856#2:466\n1612#2:467\n1#3:465\n*S KotlinDebug\n*F\n+ 1 FavourCollectionContentFragment.kt\ncom/max/xiaoheihe/module/favour/FavourCollectionContentFragment$fetchCollectContentList$disposable$1\n*L\n378#1:455,9\n378#1:464\n378#1:466\n378#1:467\n378#1:465\n*E\n"})
    public static final class c extends com.max.hbcommon.network.d<Result<CollectionFolderDetailObjV2>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31713, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            FavourCollectionContentFragment.a4(FavourCollectionContentFragment.this);
            if (FavourCollectionContentFragment.this.isActive()) {
                super.onComplete();
                p8 p8Var = FavourCollectionContentFragment.this.f83665b;
                p8 p8Var2 = null;
                if (p8Var == null) {
                    f0.S("binding");
                    p8Var = null;
                }
                p8Var.f114471e.A(0);
                p8 p8Var3 = FavourCollectionContentFragment.this.f83665b;
                if (p8Var3 == null) {
                    f0.S("binding");
                } else {
                    p8Var2 = p8Var3;
                }
                p8Var2.f114471e.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 31714, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (FavourCollectionContentFragment.this.isActive()) {
                super.onError(e10);
                FavourCollectionContentFragment.b4(FavourCollectionContentFragment.this);
                p8 p8Var = FavourCollectionContentFragment.this.f83665b;
                p8 p8Var2 = null;
                if (p8Var == null) {
                    f0.S("binding");
                    p8Var = null;
                }
                p8Var.f114471e.A(0);
                p8 p8Var3 = FavourCollectionContentFragment.this.f83665b;
                if (p8Var3 == null) {
                    f0.S("binding");
                } else {
                    p8Var2 = p8Var3;
                }
                p8Var2.f114471e.p(0);
            }
        }

        public void onNext(@dl.d Result<CollectionFolderDetailObjV2> collectionFolderResult) {
            List listE;
            List<FavouredLinkObj> listN2;
            if (PatchProxy.proxy(new Object[]{collectionFolderResult}, this, changeQuickRedirect, false, 31715, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(collectionFolderResult, "collectionFolderResult");
            CollectionFolderDetailObjV2 result = collectionFolderResult.getResult();
            if (!FavourCollectionContentFragment.this.isActive() || result == null) {
                return;
            }
            List<FavouredLinkObj> links = result.getLinks();
            p8 p8Var = null;
            if (links == null || (listN2 = CollectionsKt___CollectionsKt.n2(links)) == null) {
                listE = CollectionsKt__CollectionsKt.E();
            } else {
                listE = new ArrayList();
                for (FavouredLinkObj favouredLinkObj : listN2) {
                    BBSLinkObj link = favouredLinkObj.getLink();
                    if (link != null) {
                        link.setIs_deleted(favouredLinkObj.is_deleted());
                    } else {
                        link = null;
                    }
                    if (link != null) {
                        listE.add(link);
                    }
                }
            }
            FavourCollectionContentFragment.W3(FavourCollectionContentFragment.this, listE);
            p8 p8Var2 = FavourCollectionContentFragment.this.f83665b;
            if (p8Var2 == null) {
                f0.S("binding");
                p8Var2 = null;
            }
            p8Var2.f114471e.b0(com.max.hbcommon.utils.c.x(result.getHas_next()));
            if (com.max.hbcommon.utils.c.x(result.getHas_next())) {
                return;
            }
            p8 p8Var3 = FavourCollectionContentFragment.this.f83665b;
            if (p8Var3 == null) {
                f0.S("binding");
            } else {
                p8Var = p8Var3;
            }
            p8Var.f114470d.setPreloadEnable(false);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31716, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<CollectionFolderDetailObjV2>) obj);
        }
    }

    /* JADX INFO: compiled from: FavourCollectionContentFragment.kt */
    public static final class d implements RecyclerViewReportManager.b<BBSLinkObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.xiaoheihe.module.report.RecyclerViewReportManager.b
        public /* bridge */ /* synthetic */ void a(BBSLinkObj bBSLinkObj) {
            if (PatchProxy.proxy(new Object[]{bBSLinkObj}, this, changeQuickRedirect, false, 31723, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(bBSLinkObj);
        }

        public void b(@dl.d BBSLinkObj data) {
            if (PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, 31722, new Class[]{BBSLinkObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(data, "data");
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("link_id", data.getLinkid());
            com.max.hbcommon.analytics.d.d("3", lb.d.C1, null, jsonObject);
        }
    }

    /* JADX INFO: compiled from: FavourCollectionContentFragment.kt */
    public static final class e extends com.max.xiaoheihe.module.news.adapter.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: FavourCollectionContentFragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ FavourCollectionContentFragment f83677b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ BBSLinkObj f83678c;

            a(FavourCollectionContentFragment favourCollectionContentFragment, BBSLinkObj bBSLinkObj) {
                this.f83677b = favourCollectionContentFragment;
                this.f83678c = bBSLinkObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31726, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                FavourCollectionContentFragment.c4(this.f83677b, this.f83678c);
            }
        }

        e(Activity activity, List<? extends FeedsContentBaseObj> list) {
            super(activity, list);
        }

        @Override // com.max.xiaoheihe.module.news.adapter.a, com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 31725, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            p(eVar, (FeedsContentBaseObj) obj);
        }

        @Override // com.max.xiaoheihe.module.news.adapter.a
        public void p(@dl.e s.e eVar, @dl.e FeedsContentBaseObj feedsContentBaseObj) {
            View viewI;
            TextView textView;
            View viewB;
            LinearLayout linearLayout;
            if (PatchProxy.proxy(new Object[]{eVar, feedsContentBaseObj}, this, changeQuickRedirect, false, 31724, new Class[]{s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
                return;
            }
            super.p(eVar, feedsContentBaseObj);
            if (eVar != null && (linearLayout = (LinearLayout) eVar.i(R.id.ll_container)) != null) {
                linearLayout.setOnLongClickListener(null);
            }
            boolean z10 = feedsContentBaseObj instanceof BBSLinkObj;
            BBSLinkObj bBSLinkObj = z10 ? (BBSLinkObj) feedsContentBaseObj : null;
            if (f0.g(bBSLinkObj != null ? bBSLinkObj.getIs_deleted() : null, "1") && eVar != null && (viewB = eVar.b()) != null) {
                viewB.setOnClickListener(null);
            }
            if (eVar != null && (textView = (TextView) eVar.i(R.id.bbs_name)) != null) {
                FavourCollectionContentFragment favourCollectionContentFragment = FavourCollectionContentFragment.this;
                BBSLinkObj bBSLinkObj2 = z10 ? (BBSLinkObj) feedsContentBaseObj : null;
                textView.setTextColor(f0.g(bBSLinkObj2 != null ? bBSLinkObj2.getIs_deleted() : null, "1") ? ((com.max.hbcommon.base.d) favourCollectionContentFragment).mContext.getColor(R.color.text_secondary_1_color) : ((com.max.hbcommon.base.d) favourCollectionContentFragment).mContext.getColor(R.color.text_primary_1_color));
            }
            BBSLinkObj bBSLinkObj3 = z10 ? (BBSLinkObj) feedsContentBaseObj : null;
            if (bBSLinkObj3 != null) {
                FavourCollectionContentFragment favourCollectionContentFragment2 = FavourCollectionContentFragment.this;
                RecyclerViewReportManager recyclerViewReportManager = favourCollectionContentFragment2.f83673j;
                if (recyclerViewReportManager != null) {
                    recyclerViewReportManager.a(eVar != null ? eVar.b() : null, bBSLinkObj3);
                }
                if (eVar == null || (viewI = eVar.i(R.id.iv_link_more)) == null) {
                    return;
                }
                viewI.setOnClickListener(new a(favourCollectionContentFragment2, bBSLinkObj3));
            }
        }
    }

    /* JADX INFO: compiled from: FavourCollectionContentFragment.kt */
    public static final class f extends com.max.hbcommon.base.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(UniversalRecyclerView rv) {
            super(rv);
            f0.o(rv, "rv");
        }

        @Override // com.max.hbcommon.base.e
        public boolean b(int i10, @dl.e View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), view}, this, changeQuickRedirect, false, 31730, new Class[]{Integer.TYPE, View.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            Object objR2 = CollectionsKt___CollectionsKt.R2(FavourCollectionContentFragment.this.f83669f, i10);
            BBSLinkObj bBSLinkObj = objR2 instanceof BBSLinkObj ? (BBSLinkObj) objR2 : null;
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("link_id", bBSLinkObj != null ? bBSLinkObj.getLinkid() : null);
            com.max.hbcommon.analytics.d.d("4", lb.d.C1, null, jsonObject);
            return false;
        }

        @Override // com.max.hbcommon.base.e
        public void c(int i10, @dl.e View view) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10), view}, this, changeQuickRedirect, false, 31729, new Class[]{Integer.TYPE, View.class}, Void.TYPE).isSupported) {
                return;
            }
            super.c(i10, view);
            FeedsContentBaseObj feedsContentBaseObj = (FeedsContentBaseObj) CollectionsKt___CollectionsKt.R2(FavourCollectionContentFragment.this.f83669f, i10);
            if (feedsContentBaseObj != null) {
                FavourCollectionContentFragment.c4(FavourCollectionContentFragment.this, feedsContentBaseObj);
                return;
            }
            Log.e(FavourCollectionContentFragment.f83663n, "[initView] curData is null for pos: " + i10);
        }
    }

    /* JADX INFO: compiled from: FavourCollectionContentFragment.kt */
    public static final class g implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p8 f83681c;

        g(p8 p8Var) {
            this.f83681c = p8Var;
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 31731, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            FavourCollectionContentFragment.L3(FavourCollectionContentFragment.this, false);
            this.f83681c.f114470d.setPreloadEnable(true);
        }
    }

    /* JADX INFO: compiled from: FavourCollectionContentFragment.kt */
    public static final class h implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // pg.b
        public final void f(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 31732, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            FavourCollectionContentFragment.L3(FavourCollectionContentFragment.this, true);
        }
    }

    /* JADX INFO: compiled from: View.kt */
    @t0({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$postDelayed$runnable$1\n+ 2 FavourCollectionContentFragment.kt\ncom/max/xiaoheihe/module/favour/FavourCollectionContentFragment\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,432:1\n315#2,4:433\n319#2,6:439\n325#2,3:447\n328#2,3:452\n262#3,2:437\n262#3,2:445\n262#3,2:450\n*S KotlinDebug\n*F\n+ 1 FavourCollectionContentFragment.kt\ncom/max/xiaoheihe/module/favour/FavourCollectionContentFragment\n*L\n318#1:437,2\n324#1:445,2\n327#1:450,2\n*E\n"})
    public static final class i implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ UniversalRecyclerView f83683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FavourCollectionContentFragment f83684c;

        public i(UniversalRecyclerView universalRecyclerView, FavourCollectionContentFragment favourCollectionContentFragment) {
            this.f83683b = universalRecyclerView;
            this.f83684c = favourCollectionContentFragment;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31733, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            RecyclerView.LayoutManager layoutManager = this.f83683b.getLayoutManager();
            p8 p8Var = null;
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            RecyclerView.Adapter adapter = this.f83683b.getAdapter();
            if (linearLayoutManager == null || adapter == null) {
                p8 p8Var2 = this.f83684c.f83665b;
                if (p8Var2 == null) {
                    f0.S("binding");
                } else {
                    p8Var = p8Var2;
                }
                FrameLayout frameLayoutB = p8Var.f114469c.b();
                f0.o(frameLayoutB, "binding.frontBottomInvalidTip.root");
                frameLayoutB.setVisibility(8);
                return;
            }
            if (linearLayoutManager.findLastCompletelyVisibleItemPosition() >= adapter.getItemCount() - 1) {
                p8 p8Var3 = this.f83684c.f83665b;
                if (p8Var3 == null) {
                    f0.S("binding");
                    p8Var3 = null;
                }
                FrameLayout frameLayoutB2 = p8Var3.f114469c.b();
                f0.o(frameLayoutB2, "binding.frontBottomInvalidTip.root");
                frameLayoutB2.setVisibility(0);
                p8 p8Var4 = this.f83684c.f83665b;
                if (p8Var4 == null) {
                    f0.S("binding");
                } else {
                    p8Var = p8Var4;
                }
                p8Var.f114469c.f113857b.setVisibility(4);
                return;
            }
            p8 p8Var5 = this.f83684c.f83665b;
            if (p8Var5 == null) {
                f0.S("binding");
                p8Var5 = null;
            }
            FrameLayout frameLayoutB3 = p8Var5.f114469c.b();
            f0.o(frameLayoutB3, "binding.frontBottomInvalidTip.root");
            frameLayoutB3.setVisibility(8);
            p8 p8Var6 = this.f83684c.f83665b;
            if (p8Var6 == null) {
                f0.S("binding");
            } else {
                p8Var = p8Var6;
            }
            p8Var.f114469c.f113857b.setVisibility(8);
        }
    }

    /* JADX INFO: compiled from: FavourCollectionContentFragment.kt */
    public static final class j extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSLinkObj f83688c;

        j(BBSLinkObj bBSLinkObj) {
            this.f83688c = bBSLinkObj;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31734, new Class[0], Void.TYPE).isSupported && FavourCollectionContentFragment.this.isActive()) {
                com.max.hbutils.utils.c.f(FavourCollectionContentFragment.this.getString(R.string.cancel_collect_success));
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 31735, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (FavourCollectionContentFragment.this.isActive()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 31736, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (FavourCollectionContentFragment.this.isActive()) {
                if (FavourCollectionContentFragment.this.f83668e > 0) {
                    FavourCollectionContentFragment.this.f83668e--;
                }
                int iIndexOf = FavourCollectionContentFragment.this.f83669f.indexOf(this.f83688c);
                if (iIndexOf != -1) {
                    FavourCollectionContentFragment.this.f83669f.remove(iIndexOf);
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(FavourCollectionContentFragment.this.f83669f);
                    com.max.xiaoheihe.module.news.adapter.a aVar = FavourCollectionContentFragment.this.f83666c;
                    if (aVar != null) {
                        com.max.hbcommon.base.adapter.d.b(aVar, arrayList, FavourCollectionContentFragment.this.f83674k);
                    }
                    t tVar = FavourCollectionContentFragment.this.f83667d;
                    if (tVar != null) {
                        tVar.notifyItemRemoved(iIndexOf);
                    }
                    FavourCollectionContentFragment.X3(FavourCollectionContentFragment.this);
                    FavourCollectionContentFragment.V3(FavourCollectionContentFragment.this);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31737, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: FavourCollectionContentFragment.kt */
    public static final class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FeedsContentBaseObj f83690c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f83691d;

        k(FeedsContentBaseObj feedsContentBaseObj, com.max.hbcommon.component.i iVar) {
            this.f83690c = feedsContentBaseObj;
            this.f83691d = iVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31742, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            FavourCollectionContentFragment favourCollectionContentFragment = FavourCollectionContentFragment.this;
            String h_src = ((BBSLinkObj) this.f83690c).getH_src();
            f0.o(h_src, "curData.h_src");
            FavourCollectionContentFragment.Y3(favourCollectionContentFragment, h_src, ((BBSLinkObj) this.f83690c).getLinkid(), (BBSLinkObj) this.f83690c);
            this.f83691d.dismiss();
        }
    }

    /* JADX INFO: compiled from: FavourCollectionContentFragment.kt */
    public static final class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f83692b;

        l(com.max.hbcommon.component.i iVar) {
            this.f83692b = iVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31743, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f83692b.dismiss();
        }
    }

    public static final /* synthetic */ void L3(FavourCollectionContentFragment favourCollectionContentFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{favourCollectionContentFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 31705, new Class[]{FavourCollectionContentFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        favourCollectionContentFragment.d4(z10);
    }

    public static final /* synthetic */ void V3(FavourCollectionContentFragment favourCollectionContentFragment) {
        if (PatchProxy.proxy(new Object[]{favourCollectionContentFragment}, null, changeQuickRedirect, true, 31701, new Class[]{FavourCollectionContentFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        favourCollectionContentFragment.i4();
    }

    public static final /* synthetic */ void W3(FavourCollectionContentFragment favourCollectionContentFragment, List list) {
        if (PatchProxy.proxy(new Object[]{favourCollectionContentFragment, list}, null, changeQuickRedirect, true, 31704, new Class[]{FavourCollectionContentFragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        favourCollectionContentFragment.j4(list);
    }

    public static final /* synthetic */ void X3(FavourCollectionContentFragment favourCollectionContentFragment) {
        if (PatchProxy.proxy(new Object[]{favourCollectionContentFragment}, null, changeQuickRedirect, true, 31700, new Class[]{FavourCollectionContentFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        favourCollectionContentFragment.k4();
    }

    public static final /* synthetic */ void Y3(FavourCollectionContentFragment favourCollectionContentFragment, String str, String str2, BBSLinkObj bBSLinkObj) {
        if (PatchProxy.proxy(new Object[]{favourCollectionContentFragment, str, str2, bBSLinkObj}, null, changeQuickRedirect, true, 31707, new Class[]{FavourCollectionContentFragment.class, String.class, String.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        favourCollectionContentFragment.l4(str, str2, bBSLinkObj);
    }

    public static final /* synthetic */ void a4(FavourCollectionContentFragment favourCollectionContentFragment) {
        if (PatchProxy.proxy(new Object[]{favourCollectionContentFragment}, null, changeQuickRedirect, true, 31702, new Class[]{FavourCollectionContentFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        favourCollectionContentFragment.showContentView();
    }

    public static final /* synthetic */ void b4(FavourCollectionContentFragment favourCollectionContentFragment) {
        if (PatchProxy.proxy(new Object[]{favourCollectionContentFragment}, null, changeQuickRedirect, true, 31703, new Class[]{FavourCollectionContentFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        favourCollectionContentFragment.showError();
    }

    public static final /* synthetic */ void c4(FavourCollectionContentFragment favourCollectionContentFragment, FeedsContentBaseObj feedsContentBaseObj) {
        if (PatchProxy.proxy(new Object[]{favourCollectionContentFragment, feedsContentBaseObj}, null, changeQuickRedirect, true, 31706, new Class[]{FavourCollectionContentFragment.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        favourCollectionContentFragment.m4(feedsContentBaseObj);
    }

    @SuppressLint({"AutoDispose"})
    private final void d4(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 31694, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            this.f83668e += 30;
        } else {
            this.f83668e = 0;
        }
        addDisposable((c) com.max.xiaoheihe.network.i.a().D5(this.f83670g, Integer.valueOf(this.f83668e), 30, 1).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private final void e4(TextView textView, ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{textView, viewGroup}, this, changeQuickRedirect, false, 31688, new Class[]{TextView.class, ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        String string = this.mContext.getString(R.string.invalid_favour_link_clear_tip);
        f0.o(string, "mContext.getString(R.str…id_favour_link_clear_tip)");
        SpannableString spannableString = new SpannableString(string);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.mContext.getColor(R.color.clickable_color));
        int iS3 = StringsKt__StringsKt.s3(string, "点击清理", 0, false, 6, null);
        if (iS3 < 0) {
            textView.setVisibility(8);
            return;
        }
        spannableString.setSpan(foregroundColorSpan, iS3, iS3 + 4, 33);
        textView.setText(spannableString);
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.favour.FavourCollectionContentFragment$initClearInvalidTipView$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.favour.FavourCollectionContentFragment$initClearInvalidTipView$2$1, reason: invalid class name */
            /* JADX INFO: compiled from: FavourCollectionContentFragment.kt */
            public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements yh.a<Boolean> {
                public static ChangeQuickRedirect changeQuickRedirect;

                AnonymousClass1(Object obj) {
                    super(0, obj, FavourCollectionContentFragment.class, "isActive", "isActive()Z", 0);
                }

                @dl.d
                public final Boolean i() {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31718, new Class[0], Boolean.class);
                    return patchProxyResultProxy.isSupported ? (Boolean) patchProxyResultProxy.result : Boolean.valueOf(((FavourCollectionContentFragment) this.receiver).isActive());
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, java.lang.Object] */
                @Override // yh.a
                public /* bridge */ /* synthetic */ Boolean invoke() {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31719, new Class[0], Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : i();
                }
            }

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.favour.FavourCollectionContentFragment$initClearInvalidTipView$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: FavourCollectionContentFragment.kt */
            public final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements yh.a<b2> {
                public static ChangeQuickRedirect changeQuickRedirect;

                AnonymousClass2(Object obj) {
                    super(0, obj, FavourCollectionContentFragment.class, com.alipay.sdk.m.x.d.f39537q, "onRefresh()V", 0);
                }

                public final void i() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31720, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    ((FavourCollectionContentFragment) this.receiver).onRefresh();
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31721, new Class[0], Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    i();
                    return b2.f124493a;
                }
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31717, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                BBSKtUtils.Companion companion = BBSKtUtils.f83254a;
                Activity mContext = ((com.max.hbcommon.base.d) this.f83685b).mContext;
                f0.o(mContext, "mContext");
                io.reactivex.disposables.a compositeDisposable = this.f83685b.getCompositeDisposable();
                f0.o(compositeDisposable, "compositeDisposable");
                companion.g(mContext, compositeDisposable, null, FavourLinkFolderActivity.f83730a0, "将清理列表内的所有失效内容", new AnonymousClass1(this.f83685b), new AnonymousClass2(this.f83685b));
            }
        });
    }

    private final void f4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31687, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        p8 p8Var = this.f83665b;
        if (p8Var == null) {
            f0.S("binding");
            p8Var = null;
        }
        p8Var.f114470d.setClipToPadding(false);
        p8Var.f114470d.setClipChildren(false);
        p8Var.f114470d.setLayoutManager(new LinearLayoutManager(this.mContext));
        UniversalRecyclerView rv = p8Var.f114470d;
        f0.o(rv, "rv");
        RecyclerViewReportManager<BBSLinkObj> recyclerViewReportManager = new RecyclerViewReportManager<>(rv);
        recyclerViewReportManager.h(new d());
        this.f83673j = recyclerViewReportManager;
        e eVar = new e(this.mContext, CollectionsKt__CollectionsKt.E());
        this.f83666c = eVar;
        t tVar = new t(eVar);
        this.f83667d = tVar;
        p8Var.f114470d.setAdapter(tVar);
        p8Var.f114470d.setOverScrollMode(2);
        UniversalRecyclerView universalRecyclerView = p8Var.f114470d;
        universalRecyclerView.setPreloadEnable(true);
        universalRecyclerView.setPreLoadGap(10);
        universalRecyclerView.setPreLoadAction(new yh.a<b2>() { // from class: com.max.xiaoheihe.module.favour.FavourCollectionContentFragment$initView$1$3$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31728, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31727, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                FavourCollectionContentFragment.L3(this.f83686b, true);
            }
        });
        f fVar = new f(p8Var.f114470d);
        this.f83671h = fVar;
        UniversalRecyclerView rv2 = p8Var.f114470d;
        f0.o(rv2, "rv");
        rv2.addOnItemTouchListener(fVar);
        p8Var.f114471e.S(new g(p8Var));
        p8Var.f114471e.f0(new h());
        p8Var.f114471e.setOverScrollMode(2);
        TextView textView = p8Var.f114468b.f113857b;
        f0.o(textView, "bottomInvalidTip.tvClearInvalidFavorLink");
        FrameLayout frameLayoutB = p8Var.f114468b.b();
        f0.o(frameLayoutB, "bottomInvalidTip.root");
        e4(textView, frameLayoutB);
        TextView textView2 = p8Var.f114469c.f113857b;
        f0.o(textView2, "frontBottomInvalidTip.tvClearInvalidFavorLink");
        FrameLayout frameLayoutB2 = p8Var.f114469c.b();
        f0.o(frameLayoutB2, "frontBottomInvalidTip.root");
        e4(textView2, frameLayoutB2);
        p8Var.b().setBackgroundColor(this.mContext.getColor(R.color.divider_secondary_2_color));
    }

    private final void g4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31693, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        d4(false);
        showLoading();
    }

    @dl.d
    @xh.m
    public static final FavourCollectionContentFragment h4(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 31699, new Class[]{String.class}, FavourCollectionContentFragment.class);
        return patchProxyResultProxy.isSupported ? (FavourCollectionContentFragment) patchProxyResultProxy.result : f83661l.a(str);
    }

    private final void i4() {
        s sVarY;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31692, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        t tVar = this.f83667d;
        int itemCount = (tVar == null || (sVarY = tVar.y()) == null) ? 0 : sVarY.getItemCount();
        p8 p8Var = this.f83665b;
        p8 p8Var2 = null;
        if (p8Var == null) {
            f0.S("binding");
            p8Var = null;
        }
        TextView textView = p8Var.f114468b.f113857b;
        f0.o(textView, "binding.bottomInvalidTip.tvClearInvalidFavorLink");
        textView.setVisibility(itemCount > 0 ? 0 : 8);
        p8 p8Var3 = this.f83665b;
        if (p8Var3 == null) {
            f0.S("binding");
        } else {
            p8Var2 = p8Var3;
        }
        UniversalRecyclerView refreshBottomTip$lambda$10 = p8Var2.f114470d;
        f0.o(refreshBottomTip$lambda$10, "refreshBottomTip$lambda$10");
        refreshBottomTip$lambda$10.postDelayed(new i(refreshBottomTip$lambda$10, this), 200L);
    }

    private final void j4(List<? extends FeedsContentBaseObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 31695, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        if (list != null) {
            if (this.f83668e == 0) {
                this.f83669f.clear();
            }
            this.f83669f.addAll(list);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f83669f);
            com.max.xiaoheihe.module.news.adapter.a aVar = this.f83666c;
            if (aVar != null) {
                com.max.hbcommon.base.adapter.d.b(aVar, arrayList, this.f83674k);
            }
            t tVar = this.f83667d;
            if (tVar != null) {
                tVar.notifyDataSetChanged();
            }
            p8 p8Var = this.f83665b;
            if (p8Var == null) {
                f0.S("binding");
                p8Var = null;
            }
            p8Var.f114470d.b();
            k4();
            i4();
        }
        if (this.f83669f.isEmpty()) {
            showEmpty();
        }
        if (this.f83672i) {
            this.f83672i = false;
            RecyclerViewReportManager<BBSLinkObj> recyclerViewReportManager = this.f83673j;
            if (recyclerViewReportManager != null) {
                recyclerViewReportManager.f(100L);
            }
        }
    }

    private final void k4() {
        s sVarY;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31691, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        t tVar = this.f83667d;
        if (((tVar == null || (sVarY = tVar.y()) == null) ? 0 : sVarY.getItemCount()) <= 0) {
            t tVar2 = this.f83667d;
            if (tVar2 != null) {
                tVar2.E(R.layout.item_footer_cleaner_invalid_favor_link);
                return;
            }
            return;
        }
        t tVar3 = this.f83667d;
        if (tVar3 != null && !tVar3.z(R.layout.item_footer_cleaner_invalid_favor_link)) {
            z10 = true;
        }
        if (z10) {
            nj njVarC = nj.c(this.mInflater);
            f0.o(njVarC, "inflate(mInflater)");
            njVarC.b().setLayoutParams(new RecyclerView.LayoutParams(-1, ViewUtils.f(this.mContext, 75.0f)));
            TextView textView = njVarC.f113857b;
            f0.o(textView, "footerViewBinding.tvClearInvalidFavorLink");
            FrameLayout frameLayoutB = njVarC.b();
            f0.o(frameLayoutB, "footerViewBinding.root");
            e4(textView, frameLayoutB);
            t tVar4 = this.f83667d;
            if (tVar4 != null) {
                tVar4.m(R.layout.item_footer_cleaner_invalid_favor_link, njVarC.b());
            }
        }
    }

    @SuppressLint({"AutoDispose"})
    private final void l4(String str, String str2, BBSLinkObj bBSLinkObj) {
        if (PatchProxy.proxy(new Object[]{str, str2, bBSLinkObj}, this, changeQuickRedirect, false, 31690, new Class[]{String.class, String.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((j) com.max.xiaoheihe.network.i.a().r3(str, str2, null, "2", s0.z()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new j(bBSLinkObj)));
    }

    private final void m4(final FeedsContentBaseObj feedsContentBaseObj) {
        if (!PatchProxy.proxy(new Object[]{feedsContentBaseObj}, this, changeQuickRedirect, false, 31689, new Class[]{FeedsContentBaseObj.class}, Void.TYPE).isSupported && (feedsContentBaseObj instanceof BBSLinkObj)) {
            x5 x5VarC = x5.c(this.mInflater);
            LinearLayout llManageFavourFolder = x5VarC.f117385d;
            f0.o(llManageFavourFolder, "llManageFavourFolder");
            llManageFavourFolder.setVisibility(8);
            LinearLayout llManageFavourContent = x5VarC.f117384c;
            f0.o(llManageFavourContent, "llManageFavourContent");
            llManageFavourContent.setVisibility(0);
            f0.o(x5VarC, "inflate(mInflater).apply…sVisible = true\n        }");
            final com.max.hbcommon.component.i iVar = new com.max.hbcommon.component.i((Context) this.mContext, true, (View) x5VarC.b());
            TextView textView = x5VarC.f117387f;
            com.max.hbresource.a aVar = com.max.hbresource.a.f71893a;
            int i10 = com.max.hbresource.a.f71895c;
            textView.setTypeface(aVar.a(i10));
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.favour.FavourCollectionContentFragment$showFavourContentManageDialog$1$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31738, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    BBSKtUtils.Companion companion = BBSKtUtils.f83254a;
                    Activity mContext = ((com.max.hbcommon.base.d) this.f83693b).mContext;
                    f0.o(mContext, "mContext");
                    LayoutInflater mInflater = ((com.max.hbcommon.base.d) this.f83693b).mInflater;
                    f0.o(mInflater, "mInflater");
                    LifecycleCoroutineScope lifecycleCoroutineScopeA = z.a(this.f83693b);
                    String linkid = ((BBSLinkObj) feedsContentBaseObj).getLinkid();
                    if (linkid == null) {
                        linkid = "";
                    }
                    this.f83693b.addDisposable(companion.l(mContext, mInflater, lifecycleCoroutineScopeA, linkid, new FavourCollectionContentFragment$showFavourContentManageDialog$1$1$disposable$1(this.f83693b), new yh.a<b2>() { // from class: com.max.xiaoheihe.module.favour.FavourCollectionContentFragment$showFavourContentManageDialog$1$1$disposable$2
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31741, new Class[0], Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }
                    }));
                    iVar.dismiss();
                }
            });
            TextView textView2 = x5VarC.f117386e;
            textView2.setTypeface(aVar.a(i10));
            textView2.setOnClickListener(new k(feedsContentBaseObj, iVar));
            l lVar = new l(iVar);
            x5VarC.f117389h.setOnClickListener(lVar);
            x5VarC.f117383b.setLeftClickListener(lVar);
            x5VarC.f117383b.setShowRightButton(false);
            iVar.show();
        }
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @dl.d
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31696, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", "0");
        String string = jsonObject.toString();
        f0.o(string, "additional.toString()");
        return string;
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31686, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        p8 p8VarC = p8.c(this.mInflater);
        f0.o(p8VarC, "inflate(mInflater)");
        this.f83665b = p8VarC;
        if (p8VarC == null) {
            f0.S("binding");
            p8VarC = null;
        }
        setContentView(p8VarC);
        f4();
        g4();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onCreate(@dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 31685, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f83670g = arguments != null ? arguments.getString(f83664o) : null;
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31698, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        com.max.hbcommon.base.e eVar = this.f83671h;
        if (eVar != null) {
            p8 p8Var = this.f83665b;
            if (p8Var == null) {
                f0.S("binding");
                p8Var = null;
            }
            UniversalRecyclerView universalRecyclerView = p8Var.f114470d;
            f0.o(universalRecyclerView, "binding.rv");
            universalRecyclerView.removeOnItemTouchListener(eVar);
        }
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31697, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        d4(false);
        p8 p8Var = this.f83665b;
        if (p8Var == null) {
            f0.S("binding");
            p8Var = null;
        }
        p8Var.f114470d.setPreloadEnable(true);
        showLoading();
    }
}
