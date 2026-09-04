package com.max.xiaoheihe.module.favour;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.JsonObject;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcommon.component.bottombutton.base.BaseBottomButton;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.CollectionFolder;
import com.max.xiaoheihe.bean.bbs.CollectionFolderDetailObj;
import com.max.xiaoheihe.bean.bbs.CollectionFolderDetailObjV2;
import com.max.xiaoheihe.bean.favour.FavouredLinkObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.module.bbs.LinkListV2Fragment;
import com.max.xiaoheihe.module.bbs.utils.BBSKtUtils;
import com.max.xiaoheihe.module.report.RecyclerViewReportManager;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.xiaomi.mipush.sdk.Constants;
import df.x5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: FavourLinkFolderFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nFavourLinkFolderFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavourLinkFolderFragment.kt\ncom/max/xiaoheihe/module/favour/FavourLinkFolderFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,659:1\n1#2:660\n262#3,2:661\n262#3,2:663\n193#3,3:668\n193#3,3:671\n766#4:665\n857#4,2:666\n*S KotlinDebug\n*F\n+ 1 FavourLinkFolderFragment.kt\ncom/max/xiaoheihe/module/favour/FavourLinkFolderFragment\n*L\n191#1:661,2\n192#1:663,2\n628#1:668,3\n641#1:671,3\n500#1:665\n500#1:666,2\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class FavourLinkFolderFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    public static final a f83779t = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f83780u = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private static final String f83781v = "filter";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private static final String f83782w = FavourCollectionContentFragment.f83664o;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private static final String f83783x = "key_move";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private static final String f83784y = "key_delete";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f83785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f83786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.max.hbcommon.base.adapter.s<BBSLinkObj> f83787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private com.max.xiaoheihe.module.favour.e f83788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView f83789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SmartRefreshLayout f83790g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RelativeLayout f83791h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f83793j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private String f83794k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private String f83795l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f83796m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.e
    private c f83797n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.e
    private View f83798o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.e
    private com.max.hbcommon.base.e f83799p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f83800q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.e
    private RecyclerViewReportManager<BBSLinkObj> f83802s;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final ArrayList<BBSLinkObj> f83792i = new ArrayList<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f83801r = true;

    /* JADX INFO: compiled from: FavourLinkFolderFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31903, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : FavourLinkFolderFragment.f83781v;
        }

        @dl.d
        public final String b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31904, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : FavourLinkFolderFragment.f83782w;
        }

        @dl.d
        public final String c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31906, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : FavourLinkFolderFragment.f83784y;
        }

        @dl.d
        public final String d() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31905, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : FavourLinkFolderFragment.f83783x;
        }

        @dl.d
        @xh.m
        public final FavourLinkFolderFragment e(@dl.e String str, @dl.e String str2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 31907, new Class[]{String.class, String.class}, FavourLinkFolderFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (FavourLinkFolderFragment) patchProxyResultProxy.result;
            }
            FavourLinkFolderFragment favourLinkFolderFragment = new FavourLinkFolderFragment();
            Bundle bundle = new Bundle();
            bundle.putString(a(), str2);
            bundle.putString(b(), str);
            favourLinkFolderFragment.setArguments(bundle);
            return favourLinkFolderFragment;
        }
    }

    /* JADX INFO: compiled from: FavourLinkFolderFragment.kt */
    public interface b {
        void a();

        void b(int i10);

        void g(@dl.e l0.h<BBSLinkObj> hVar);

        void k();
    }

    /* JADX INFO: compiled from: FavourLinkFolderFragment.kt */
    public interface c {
        void h(@dl.d String str);
    }

    /* JADX INFO: compiled from: FavourLinkFolderFragment.kt */
    @t0({"SMAP\nFavourLinkFolderFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavourLinkFolderFragment.kt\ncom/max/xiaoheihe/module/favour/FavourLinkFolderFragment$getFavourLinkList$disposable$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,659:1\n1603#2,9:660\n1855#2:669\n1856#2:671\n1612#2:672\n1#3:670\n*S KotlinDebug\n*F\n+ 1 FavourLinkFolderFragment.kt\ncom/max/xiaoheihe/module/favour/FavourLinkFolderFragment$getFavourLinkList$disposable$1\n*L\n317#1:660,9\n317#1:669\n317#1:671\n317#1:672\n317#1:670\n*E\n"})
    public static final class d extends com.max.hbcommon.network.d<Result<CollectionFolderDetailObjV2>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31908, new Class[0], Void.TYPE).isSupported && FavourLinkFolderFragment.this.isActive()) {
                super.onComplete();
                FavourLinkFolderFragment.this.l4().A(0);
                FavourLinkFolderFragment.this.l4().p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 31909, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (FavourLinkFolderFragment.this.isActive()) {
                super.onError(e10);
                FavourLinkFolderFragment.Y3(FavourLinkFolderFragment.this);
                FavourLinkFolderFragment.this.l4().A(0);
                FavourLinkFolderFragment.this.l4().p(0);
            }
        }

        public void onNext(@dl.d Result<CollectionFolderDetailObjV2> result) {
            ArrayList arrayList;
            List<FavouredLinkObj> links;
            List<FavouredLinkObj> listN2;
            CollectionFolder folder;
            String name;
            c cVarC4;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 31910, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (FavourLinkFolderFragment.this.isActive()) {
                super.onNext(result);
                CollectionFolderDetailObjV2 result2 = result.getResult();
                if (result2 != null && (folder = result2.getFolder()) != null && (name = folder.getName()) != null && (cVarC4 = FavourLinkFolderFragment.this.c4()) != null) {
                    cVarC4.h(name);
                }
                CollectionFolderDetailObjV2 result3 = result.getResult();
                if (result3 == null || (links = result3.getLinks()) == null || (listN2 = CollectionsKt___CollectionsKt.n2(links)) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    for (FavouredLinkObj favouredLinkObj : listN2) {
                        BBSLinkObj link = favouredLinkObj.getLink();
                        if (link != null) {
                            link.setIs_deleted(favouredLinkObj.is_deleted());
                        } else {
                            link = null;
                        }
                        if (link != null) {
                            arrayList.add(link);
                        }
                    }
                }
                FavourLinkFolderFragment.a4(FavourLinkFolderFragment.this, arrayList);
                SmartRefreshLayout smartRefreshLayoutL4 = FavourLinkFolderFragment.this.l4();
                CollectionFolderDetailObjV2 result4 = result.getResult();
                smartRefreshLayoutL4.b0(com.max.hbcommon.utils.c.x(result4 != null ? result4.getHas_next() : null));
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31911, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<CollectionFolderDetailObjV2>) obj);
        }
    }

    /* JADX INFO: compiled from: FavourLinkFolderFragment.kt */
    public static final class e extends com.max.hbcommon.network.d<Result<CollectionFolderDetailObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31912, new Class[0], Void.TYPE).isSupported && FavourLinkFolderFragment.this.isActive()) {
                super.onComplete();
                FavourLinkFolderFragment.this.l4().A(0);
                FavourLinkFolderFragment.this.l4().p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 31913, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (FavourLinkFolderFragment.this.isActive()) {
                super.onError(e10);
                FavourLinkFolderFragment.Y3(FavourLinkFolderFragment.this);
                FavourLinkFolderFragment.this.l4().A(0);
                FavourLinkFolderFragment.this.l4().p(0);
            }
        }

        public void onNext(@dl.d Result<CollectionFolderDetailObj> result) {
            List<FavouredLinkObj> links;
            CollectionFolder folder;
            String name;
            c cVarC4;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 31914, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (FavourLinkFolderFragment.this.isActive()) {
                super.onNext(result);
                CollectionFolderDetailObj result2 = result.getResult();
                if (result2 != null && (folder = result2.getFolder()) != null && (name = folder.getName()) != null && (cVarC4 = FavourLinkFolderFragment.this.c4()) != null) {
                    cVarC4.h(name);
                }
                ArrayList arrayList = new ArrayList();
                CollectionFolderDetailObj result3 = result.getResult();
                if (result3 == null || (links = result3.getLinks()) == null) {
                    return;
                }
                FavourLinkFolderFragment favourLinkFolderFragment = FavourLinkFolderFragment.this;
                for (FavouredLinkObj favouredLinkObj : links) {
                    BBSLinkObj link = favouredLinkObj.getLink();
                    if (link != null) {
                        if (f0.g("1", favouredLinkObj.is_deleted())) {
                            link.setLink_tag("-1");
                        }
                        link.setUnread(String.valueOf(favouredLinkObj.getUnread()));
                        arrayList.add(link);
                    }
                }
                FavourLinkFolderFragment.a4(favourLinkFolderFragment, arrayList);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31915, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<CollectionFolderDetailObj>) obj);
        }
    }

    /* JADX INFO: compiled from: FavourLinkFolderFragment.kt */
    public static final class f implements l0.h<BBSLinkObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BottomButtonLeftItemView f83805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FavourLinkFolderFragment f83806b;

        f(BottomButtonLeftItemView bottomButtonLeftItemView, FavourLinkFolderFragment favourLinkFolderFragment) {
            this.f83805a = bottomButtonLeftItemView;
            this.f83806b = favourLinkFolderFragment;
        }

        @Override // com.max.xiaoheihe.utils.l0.h
        public /* bridge */ /* synthetic */ void a(BBSLinkObj bBSLinkObj) {
            if (PatchProxy.proxy(new Object[]{bBSLinkObj}, this, changeQuickRedirect, false, 31918, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            d(bBSLinkObj);
        }

        @Override // com.max.xiaoheihe.utils.l0.h
        public /* bridge */ /* synthetic */ void b(BBSLinkObj bBSLinkObj) {
            if (PatchProxy.proxy(new Object[]{bBSLinkObj}, this, changeQuickRedirect, false, 31919, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            c(bBSLinkObj);
        }

        public void c(@dl.e BBSLinkObj bBSLinkObj) {
            if (PatchProxy.proxy(new Object[]{bBSLinkObj}, this, changeQuickRedirect, false, 31917, new Class[]{BBSLinkObj.class}, Void.TYPE).isSupported) {
                return;
            }
            BottomButtonLeftItemView bottomButtonLeftItemView = this.f83805a;
            if (bottomButtonLeftItemView != null) {
                bottomButtonLeftItemView.setChecked(false, false);
            }
            FavourLinkFolderFragment.W3(this.f83806b);
        }

        public void d(@dl.e BBSLinkObj bBSLinkObj) {
            if (PatchProxy.proxy(new Object[]{bBSLinkObj}, this, changeQuickRedirect, false, 31916, new Class[]{BBSLinkObj.class}, Void.TYPE).isSupported) {
                return;
            }
            BottomButtonLeftItemView bottomButtonLeftItemView = this.f83805a;
            if (bottomButtonLeftItemView != null) {
                bottomButtonLeftItemView.setChecked(true, false);
            }
            FavourLinkFolderFragment.W3(this.f83806b);
        }
    }

    /* JADX INFO: compiled from: FavourLinkFolderFragment.kt */
    public static final class g implements BottomButtonLeftItemView.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s<? extends FeedsContentBaseObj> f83808b;

        g(com.max.hbcommon.base.adapter.s<? extends FeedsContentBaseObj> sVar) {
            this.f83808b = sVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView.a
        public void a(boolean z10) {
            b bVar;
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 31920, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            Iterator<BBSLinkObj> it = FavourLinkFolderFragment.this.h4().iterator();
            while (it.hasNext()) {
                it.next().setChecked(z10);
            }
            if (z10) {
                com.max.hbcommon.base.adapter.s<? extends FeedsContentBaseObj> sVar = this.f83808b;
                bVar = sVar instanceof b ? (b) sVar : null;
                if (bVar != null) {
                    bVar.b(FavourLinkFolderFragment.this.h4().size());
                }
            } else {
                com.max.hbcommon.base.adapter.s<? extends FeedsContentBaseObj> sVar2 = this.f83808b;
                bVar = sVar2 instanceof b ? (b) sVar2 : null;
                if (bVar != null) {
                    bVar.b(0);
                }
            }
            com.max.hbcommon.base.adapter.s<? extends FeedsContentBaseObj> sVar3 = this.f83808b;
            if (sVar3 != null) {
                sVar3.notifyDataSetChanged();
            }
            FavourLinkFolderFragment.W3(FavourLinkFolderFragment.this);
        }
    }

    /* JADX INFO: compiled from: FavourLinkFolderFragment.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31926, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            String str = "";
            String str2 = str;
            for (BBSLinkObj bBSLinkObj : FavourLinkFolderFragment.this.h4()) {
                if (bBSLinkObj.isChecked()) {
                    if (!f0.g(str, "")) {
                        str = str + ',';
                    }
                    str = str + bBSLinkObj.getLinkid();
                    if (!f0.g(str2, "")) {
                        str2 = str2 + ',';
                    }
                    str2 = str2 + bBSLinkObj.getH_src();
                }
            }
            if (com.max.hbcommon.utils.c.u(str)) {
                return;
            }
            if (FavourLinkFolderFragment.this.f83786c) {
                FavourLinkFolderFragment.V3(FavourLinkFolderFragment.this, str);
            } else {
                FavourLinkFolderFragment favourLinkFolderFragment = FavourLinkFolderFragment.this;
                favourLinkFolderFragment.addDisposable(FavourLinkFolderFragment.X3(favourLinkFolderFragment, str2, str));
            }
        }
    }

    /* JADX INFO: compiled from: FavourLinkFolderFragment.kt */
    public static final class i extends com.max.xiaoheihe.module.favour.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: FavourLinkFolderFragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ FavourLinkFolderFragment f83811b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ BBSLinkObj f83812c;

            a(FavourLinkFolderFragment favourLinkFolderFragment, BBSLinkObj bBSLinkObj) {
                this.f83811b = favourLinkFolderFragment;
                this.f83812c = bBSLinkObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31929, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                FavourLinkFolderFragment.Z3(this.f83811b, this.f83812c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Activity mContext, ArrayList<BBSLinkObj> arrayList) {
            super(mContext, arrayList);
            f0.o(mContext, "mContext");
        }

        @Override // com.max.xiaoheihe.module.favour.e, com.max.xiaoheihe.module.news.adapter.a, com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 31928, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            p(eVar, (FeedsContentBaseObj) obj);
        }

        @Override // com.max.xiaoheihe.module.favour.e, com.max.xiaoheihe.module.news.adapter.a
        public void p(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e FeedsContentBaseObj feedsContentBaseObj) {
            View viewI;
            LinearLayout linearLayout;
            if (PatchProxy.proxy(new Object[]{eVar, feedsContentBaseObj}, this, changeQuickRedirect, false, 31927, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
                return;
            }
            super.p(eVar, feedsContentBaseObj);
            if (eVar != null && (linearLayout = (LinearLayout) eVar.i(R.id.ll_container)) != null) {
                linearLayout.setOnLongClickListener(null);
            }
            BBSLinkObj bBSLinkObj = feedsContentBaseObj instanceof BBSLinkObj ? (BBSLinkObj) feedsContentBaseObj : null;
            if (bBSLinkObj != null) {
                FavourLinkFolderFragment favourLinkFolderFragment = FavourLinkFolderFragment.this;
                RecyclerViewReportManager recyclerViewReportManager = favourLinkFolderFragment.f83802s;
                if (recyclerViewReportManager != null) {
                    recyclerViewReportManager.a(eVar != null ? eVar.b() : null, bBSLinkObj);
                }
                if (eVar == null || (viewI = eVar.i(R.id.iv_link_more)) == null) {
                    return;
                }
                viewI.setOnClickListener(new a(favourLinkFolderFragment, bBSLinkObj));
            }
        }
    }

    /* JADX INFO: compiled from: FavourLinkFolderFragment.kt */
    public static final class j implements RecyclerViewReportManager.b<BBSLinkObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // com.max.xiaoheihe.module.report.RecyclerViewReportManager.b
        public /* bridge */ /* synthetic */ void a(BBSLinkObj bBSLinkObj) {
            if (PatchProxy.proxy(new Object[]{bBSLinkObj}, this, changeQuickRedirect, false, 31931, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(bBSLinkObj);
        }

        public void b(@dl.d BBSLinkObj data) {
            if (PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, 31930, new Class[]{BBSLinkObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(data, "data");
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("link_id", data.getLinkid());
            com.max.hbcommon.analytics.d.d("3", lb.d.E1, null, jsonObject);
        }
    }

    /* JADX INFO: compiled from: FavourLinkFolderFragment.kt */
    public static final class k extends com.max.hbcommon.base.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        k(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // com.max.hbcommon.base.e
        public boolean b(int i10, @dl.e View view) {
            CheckBox checkBox;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), view}, this, changeQuickRedirect, false, 31933, new Class[]{Integer.TYPE, View.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            super.b(i10, view);
            if (FavourLinkFolderFragment.this.f83785b) {
                if (view != null && (checkBox = (CheckBox) view.findViewById(R.id.f76243cb)) != null) {
                    checkBox.performClick();
                }
                return true;
            }
            BBSLinkObj bBSLinkObj = (BBSLinkObj) CollectionsKt___CollectionsKt.R2(FavourLinkFolderFragment.this.h4(), i10);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("link_id", bBSLinkObj != null ? bBSLinkObj.getLinkid() : null);
            com.max.hbcommon.analytics.d.d("4", lb.d.E1, null, jsonObject);
            return false;
        }

        @Override // com.max.hbcommon.base.e
        public void c(int i10, @dl.e View view) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10), view}, this, changeQuickRedirect, false, 31932, new Class[]{Integer.TYPE, View.class}, Void.TYPE).isSupported) {
                return;
            }
            super.c(i10, view);
            BBSLinkObj bBSLinkObj = (BBSLinkObj) CollectionsKt___CollectionsKt.R2(FavourLinkFolderFragment.this.h4(), i10);
            if (bBSLinkObj != null) {
                FavourLinkFolderFragment.Z3(FavourLinkFolderFragment.this, bBSLinkObj);
            }
        }
    }

    /* JADX INFO: compiled from: FavourLinkFolderFragment.kt */
    public static final class l implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 31934, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            FavourLinkFolderFragment.this.B4(0);
            FavourLinkFolderFragment.this.d4();
        }
    }

    /* JADX INFO: compiled from: FavourLinkFolderFragment.kt */
    public static final class m implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // pg.b
        public final void f(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 31935, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            FavourLinkFolderFragment favourLinkFolderFragment = FavourLinkFolderFragment.this;
            favourLinkFolderFragment.B4(favourLinkFolderFragment.j4() + 30);
            FavourLinkFolderFragment.this.d4();
        }
    }

    /* JADX INFO: compiled from: FavourLinkFolderFragment.kt */
    public static final class n extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 31937, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (FavourLinkFolderFragment.this.isActive()) {
                super.onError(e10);
            }
        }

        @SuppressLint({"NotifyDataSetChanged"})
        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 31936, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (FavourLinkFolderFragment.this.isActive()) {
                com.max.hbutils.utils.c.f("移除成功");
                Iterator<BBSLinkObj> it = FavourLinkFolderFragment.this.h4().iterator();
                f0.o(it, "mLinkList.iterator()");
                while (it.hasNext()) {
                    BBSLinkObj next = it.next();
                    f0.o(next, "iterator.next()");
                    if (next.isChecked()) {
                        it.remove();
                    }
                }
                com.max.xiaoheihe.module.favour.e eVar = FavourLinkFolderFragment.this.f83788e;
                if (eVar != null) {
                    eVar.notifyDataSetChanged();
                }
                FavourLinkFolderFragment.this.m4();
                Context context = FavourLinkFolderFragment.this.getContext();
                FavourLinkFolderActivity favourLinkFolderActivity = context instanceof FavourLinkFolderActivity ? (FavourLinkFolderActivity) context : null;
                if (favourLinkFolderActivity != null) {
                    favourLinkFolderActivity.o2();
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31938, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: View.kt */
    @t0({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$postDelayed$runnable$1\n+ 2 FavourLinkFolderFragment.kt\ncom/max/xiaoheihe/module/favour/FavourLinkFolderFragment\n*L\n1#1,432:1\n641#2:433\n*E\n"})
    public static final class o implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        public o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31939, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            FavourLinkFolderFragment.this.onRefresh();
        }
    }

    /* JADX INFO: compiled from: View.kt */
    @t0({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$postDelayed$runnable$1\n+ 2 FavourLinkFolderFragment.kt\ncom/max/xiaoheihe/module/favour/FavourLinkFolderFragment\n*L\n1#1,432:1\n628#2:433\n*E\n"})
    public static final class p implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        public p() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31940, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            FavourLinkFolderFragment.this.onRefresh();
        }
    }

    /* JADX INFO: compiled from: FavourLinkFolderFragment.kt */
    public static final class q extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31943, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f(FavourLinkFolderFragment.this.getString(R.string.cancel_collect_success));
            super.onComplete();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 31944, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            super.onError(e10);
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 31945, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            super.onNext(result);
            Iterator<BBSLinkObj> it = FavourLinkFolderFragment.this.h4().iterator();
            f0.o(it, "mLinkList.iterator()");
            while (it.hasNext()) {
                BBSLinkObj next = it.next();
                f0.o(next, "iterator.next()");
                if (next.isChecked()) {
                    it.remove();
                }
            }
            FavourLinkFolderFragment.this.i4().notifyDataSetChanged();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31946, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: FavourLinkFolderFragment.kt */
    public static final class r implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSLinkObj f83822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FavourLinkFolderFragment f83823c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f83824d;

        r(BBSLinkObj bBSLinkObj, FavourLinkFolderFragment favourLinkFolderFragment, com.max.hbcommon.component.i iVar) {
            this.f83822b = bBSLinkObj;
            this.f83823c = favourLinkFolderFragment;
            this.f83824d = iVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31952, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f83822b.setChecked(true);
            FavourLinkFolderFragment favourLinkFolderFragment = this.f83823c;
            String linkid = this.f83822b.getLinkid();
            f0.o(linkid, "curData.linkid");
            FavourLinkFolderFragment.V3(favourLinkFolderFragment, linkid);
            this.f83824d.dismiss();
        }
    }

    /* JADX INFO: compiled from: FavourLinkFolderFragment.kt */
    public static final class s implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f83826b;

        s(com.max.hbcommon.component.i iVar) {
            this.f83826b = iVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31953, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f83826b.dismiss();
        }
    }

    private final void F4(final BBSLinkObj bBSLinkObj) {
        if (PatchProxy.proxy(new Object[]{bBSLinkObj}, this, changeQuickRedirect, false, 31878, new Class[]{BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
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
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.favour.FavourLinkFolderFragment$showFavourContentManageDialog$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31947, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                BBSKtUtils.Companion companion = BBSKtUtils.f83254a;
                Activity mContext = ((com.max.hbcommon.base.d) this.f83827b).mContext;
                f0.o(mContext, "mContext");
                LayoutInflater mInflater = ((com.max.hbcommon.base.d) this.f83827b).mInflater;
                f0.o(mInflater, "mInflater");
                LifecycleCoroutineScope lifecycleCoroutineScopeA = z.a(this.f83827b);
                String linkid = bBSLinkObj.getLinkid();
                if (linkid == null) {
                    linkid = "";
                }
                String str = linkid;
                FavourLinkFolderFragment$showFavourContentManageDialog$1$1$disposable$1 favourLinkFolderFragment$showFavourContentManageDialog$1$1$disposable$1 = new FavourLinkFolderFragment$showFavourContentManageDialog$1$1$disposable$1(this.f83827b);
                final FavourLinkFolderFragment favourLinkFolderFragment = this.f83827b;
                final BBSLinkObj bBSLinkObj2 = bBSLinkObj;
                this.f83827b.addDisposable(companion.l(mContext, mInflater, lifecycleCoroutineScopeA, str, favourLinkFolderFragment$showFavourContentManageDialog$1$1$disposable$1, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.favour.FavourLinkFolderFragment$showFavourContentManageDialog$1$1$disposable$2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31951, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        int iIndexOf;
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31950, new Class[0], Void.TYPE).isSupported || (iIndexOf = favourLinkFolderFragment.h4().indexOf(bBSLinkObj2)) == -1) {
                            return;
                        }
                        favourLinkFolderFragment.h4().remove(iIndexOf);
                        e eVar = favourLinkFolderFragment.f83788e;
                        if (eVar != null) {
                            eVar.notifyItemRemoved(iIndexOf);
                        }
                    }
                }));
                iVar.dismiss();
            }
        });
        TextView textView2 = x5VarC.f117386e;
        textView2.setText("移除");
        textView2.setTypeface(aVar.a(i10));
        textView2.setOnClickListener(new r(bBSLinkObj, this, iVar));
        s sVar = new s(iVar);
        x5VarC.f117389h.setOnClickListener(sVar);
        x5VarC.f117383b.setLeftClickListener(sVar);
        x5VarC.f117383b.setShowRightButton(false);
        iVar.show();
    }

    private final void G4(List<? extends BBSLinkObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 31891, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (list != null) {
            com.max.hbcommon.base.adapter.s<BBSLinkObj> sVarI4 = this.f83786c ? this.f83788e : i4();
            this.f83792i.size();
            if (this.f83793j == 0) {
                this.f83792i.clear();
                if (e4().getChildCount() > 0) {
                    b bVar = sVarI4 instanceof b ? (b) sVarI4 : null;
                    if (bVar != null) {
                        bVar.b(0);
                    }
                    View view = this.f83798o;
                    CheckBox checkBox = view != null ? (CheckBox) view.findViewById(R.id.cb_all) : null;
                    if (checkBox != null) {
                        checkBox.setChecked(false);
                    }
                }
            }
            this.f83792i.addAll(list);
            if (sVarI4 != null) {
                sVarI4.notifyDataSetChanged();
            }
        }
        if (this.f83792i.isEmpty()) {
            showEmpty(R.drawable.common_tag_common_45x45, R.string.empty_content);
        } else {
            showContentView();
        }
        if (this.f83801r) {
            this.f83801r = false;
            RecyclerViewReportManager<BBSLinkObj> recyclerViewReportManager = this.f83802s;
            if (recyclerViewReportManager != null) {
                recyclerViewReportManager.f(100L);
            }
        }
    }

    public static final /* synthetic */ void V3(FavourLinkFolderFragment favourLinkFolderFragment, String str) {
        if (PatchProxy.proxy(new Object[]{favourLinkFolderFragment, str}, null, changeQuickRedirect, true, 31901, new Class[]{FavourLinkFolderFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        favourLinkFolderFragment.o4(str);
    }

    public static final /* synthetic */ void W3(FavourLinkFolderFragment favourLinkFolderFragment) {
        if (PatchProxy.proxy(new Object[]{favourLinkFolderFragment}, null, changeQuickRedirect, true, 31900, new Class[]{FavourLinkFolderFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        favourLinkFolderFragment.r4();
    }

    public static final /* synthetic */ io.reactivex.disposables.b X3(FavourLinkFolderFragment favourLinkFolderFragment, String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{favourLinkFolderFragment, str, str2}, null, changeQuickRedirect, true, 31902, new Class[]{FavourLinkFolderFragment.class, String.class, String.class}, io.reactivex.disposables.b.class);
        return patchProxyResultProxy.isSupported ? (io.reactivex.disposables.b) patchProxyResultProxy.result : favourLinkFolderFragment.t4(str, str2);
    }

    public static final /* synthetic */ void Y3(FavourLinkFolderFragment favourLinkFolderFragment) {
        if (PatchProxy.proxy(new Object[]{favourLinkFolderFragment}, null, changeQuickRedirect, true, 31898, new Class[]{FavourLinkFolderFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        favourLinkFolderFragment.showError();
    }

    public static final /* synthetic */ void Z3(FavourLinkFolderFragment favourLinkFolderFragment, BBSLinkObj bBSLinkObj) {
        if (PatchProxy.proxy(new Object[]{favourLinkFolderFragment, bBSLinkObj}, null, changeQuickRedirect, true, 31897, new Class[]{FavourLinkFolderFragment.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        favourLinkFolderFragment.F4(bBSLinkObj);
    }

    public static final /* synthetic */ void a4(FavourLinkFolderFragment favourLinkFolderFragment, List list) {
        if (PatchProxy.proxy(new Object[]{favourLinkFolderFragment, list}, null, changeQuickRedirect, true, 31899, new Class[]{FavourLinkFolderFragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        favourLinkFolderFragment.G4(list);
    }

    private final void getArgumentInfo() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31882, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Bundle arguments = getArguments();
        this.f83795l = arguments != null ? arguments.getString(f83782w) : null;
        Bundle arguments2 = getArguments();
        this.f83794k = arguments2 != null ? arguments2.getString(f83781v) : null;
    }

    @SuppressLint({"AutoDispose"})
    private final void o4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 31890, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((n) com.max.xiaoheihe.network.i.a().a7("", str, 0).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new n()));
    }

    @dl.d
    @xh.m
    public static final FavourLinkFolderFragment p4(@dl.e String str, @dl.e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 31896, new Class[]{String.class, String.class}, FavourLinkFolderFragment.class);
        return patchProxyResultProxy.isSupported ? (FavourLinkFolderFragment) patchProxyResultProxy.result : f83779t.e(str, str2);
    }

    private final void r4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31886, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList<BBSLinkObj> arrayList = this.f83792i;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((BBSLinkObj) obj).isChecked()) {
                arrayList2.add(obj);
            }
        }
        String strH3 = CollectionsKt___CollectionsKt.h3(arrayList2, Constants.ACCEPT_TIME_SEPARATOR_SP, null, null, 0, null, new yh.l<BBSLinkObj, CharSequence>() { // from class: com.max.xiaoheihe.module.favour.FavourLinkFolderFragment$refreshBottomBtnState$ids$2
            public static ChangeQuickRedirect changeQuickRedirect;

            @dl.d
            public final CharSequence a(@dl.d BBSLinkObj it) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 31941, new Class[]{BBSLinkObj.class}, CharSequence.class);
                if (patchProxyResultProxy.isSupported) {
                    return (CharSequence) patchProxyResultProxy.result;
                }
                f0.p(it, "it");
                String linkid = it.getLinkid();
                f0.o(linkid, "it.linkid");
                return linkid;
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.CharSequence, java.lang.Object] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ CharSequence invoke(BBSLinkObj bBSLinkObj) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSLinkObj}, this, changeQuickRedirect, false, 31942, new Class[]{Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(bBSLinkObj);
            }
        }, 30, null);
        View view = this.f83798o;
        BottomButtonLeftItemView bottomButtonLeftItemView = view != null ? (BottomButtonLeftItemView) view.findViewById(R.id.bottom_button) : null;
        if (com.max.hbcommon.utils.c.u(strH3)) {
            if (bottomButtonLeftItemView != null) {
                bottomButtonLeftItemView.setLeftButtonStyle(BaseBottomButton.BaseBottomButtonStyle.GrayGray);
            }
        } else if (bottomButtonLeftItemView != null) {
            bottomButtonLeftItemView.setLeftButtonStyle(BaseBottomButton.BaseBottomButtonStyle.GrayBlack);
        }
    }

    @SuppressLint({"AutoDispose"})
    private final io.reactivex.disposables.b t4(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 31889, new Class[]{String.class, String.class}, io.reactivex.disposables.b.class);
        return patchProxyResultProxy.isSupported ? (io.reactivex.disposables.b) patchProxyResultProxy.result : (io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().r3(str, str2, null, "2", new HashMap(16)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new q());
    }

    public final void A4(@dl.d com.max.hbcommon.base.adapter.s<BBSLinkObj> sVar) {
        if (PatchProxy.proxy(new Object[]{sVar}, this, changeQuickRedirect, false, 31870, new Class[]{com.max.hbcommon.base.adapter.s.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(sVar, "<set-?>");
        this.f83787d = sVar;
    }

    public final void B4(int i10) {
        this.f83793j = i10;
    }

    public final void C4(@dl.d RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, 31872, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recyclerView, "<set-?>");
        this.f83789f = recyclerView;
    }

    public final void D4(@dl.d SmartRefreshLayout smartRefreshLayout) {
        if (PatchProxy.proxy(new Object[]{smartRefreshLayout}, this, changeQuickRedirect, false, 31874, new Class[]{SmartRefreshLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(smartRefreshLayout, "<set-?>");
        this.f83790g = smartRefreshLayout;
    }

    public final void E4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31884, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        n4();
        e4().addView(this.f83798o);
        Iterator<BBSLinkObj> it = this.f83792i.iterator();
        while (it.hasNext()) {
            it.next().setChecked(false);
        }
        if (this.f83786c) {
            com.max.xiaoheihe.module.favour.e eVar = this.f83788e;
            if (eVar != null) {
                eVar.a();
            }
        } else {
            Object objI4 = i4();
            b bVar = objI4 instanceof b ? (b) objI4 : null;
            if (bVar != null) {
                bVar.a();
            }
        }
        this.f83785b = true;
    }

    public final boolean L0() {
        return this.f83796m;
    }

    @dl.e
    public final View b4() {
        return this.f83798o;
    }

    @dl.e
    public final c c4() {
        return this.f83797n;
    }

    @SuppressLint({"AutoDispose"})
    public final void d4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31883, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable(this.f83786c ? (com.max.hbcommon.network.d) com.max.xiaoheihe.network.i.a().D5(this.f83795l, Integer.valueOf(this.f83793j), 30, 1).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()) : (com.max.hbcommon.network.d) com.max.xiaoheihe.network.i.a().s8(this.f83795l, Integer.valueOf(this.f83793j), 30, this.f83794k).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    @dl.d
    public final RelativeLayout e4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31875, new Class[0], RelativeLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (RelativeLayout) patchProxyResultProxy.result;
        }
        RelativeLayout relativeLayout = this.f83791h;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        f0.S("mBottomBarContainer");
        return null;
    }

    @dl.e
    public final String f4() {
        return this.f83794k;
    }

    @dl.e
    public final String g4() {
        return this.f83795l;
    }

    @dl.d
    public final ArrayList<BBSLinkObj> h4() {
        return this.f83792i;
    }

    @dl.d
    public final com.max.hbcommon.base.adapter.s<BBSLinkObj> i4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31869, new Class[0], com.max.hbcommon.base.adapter.s.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.hbcommon.base.adapter.s) patchProxyResultProxy.result;
        }
        com.max.hbcommon.base.adapter.s<BBSLinkObj> sVar = this.f83787d;
        if (sVar != null) {
            return sVar;
        }
        f0.S("mLinkListAdapter");
        return null;
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31877, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_refresh_rv_with_bar);
        View viewFindViewById = this.mContentView.findViewById(R.id.rv);
        f0.o(viewFindViewById, "mContentView.findViewById(R.id.rv)");
        C4((RecyclerView) viewFindViewById);
        View viewFindViewById2 = this.mContentView.findViewById(R.id.srl);
        f0.o(viewFindViewById2, "mContentView.findViewById(R.id.srl)");
        D4((SmartRefreshLayout) viewFindViewById2);
        View viewFindViewById3 = this.mContentView.findViewById(R.id.vg_bottom_bar);
        f0.o(viewFindViewById3, "mContentView.findViewById(R.id.vg_bottom_bar)");
        x4((RelativeLayout) viewFindViewById3);
        getArgumentInfo();
        if (this.f83786c) {
            this.f83788e = new i(this.mContext, this.f83792i);
        } else {
            A4(new com.max.xiaoheihe.module.bbs.adapter.m(this.mContext, this.f83792i, LinkListV2Fragment.B, this.f83795l));
        }
        k4().setClipToPadding(false);
        k4().setClipChildren(false);
        k4().setLayoutManager(new LinearLayoutManager(this.mContext, 1, false));
        k4().setAdapter(this.f83786c ? this.f83788e : i4());
        if (this.f83786c) {
            RecyclerViewReportManager<BBSLinkObj> recyclerViewReportManager = new RecyclerViewReportManager<>(k4());
            recyclerViewReportManager.h(new j());
            this.f83802s = recyclerViewReportManager;
            k kVar = new k(k4());
            this.f83799p = kVar;
            k4().addOnItemTouchListener(kVar);
        }
        l4().S(new l());
        l4().f0(new m());
        showLoading();
        d4();
    }

    public final int j4() {
        return this.f83793j;
    }

    @dl.d
    public final RecyclerView k4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31871, new Class[0], RecyclerView.class);
        if (patchProxyResultProxy.isSupported) {
            return (RecyclerView) patchProxyResultProxy.result;
        }
        RecyclerView recyclerView = this.f83789f;
        if (recyclerView != null) {
            return recyclerView;
        }
        f0.S("mRecyclerView");
        return null;
    }

    @dl.d
    public final SmartRefreshLayout l4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31873, new Class[0], SmartRefreshLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (SmartRefreshLayout) patchProxyResultProxy.result;
        }
        SmartRefreshLayout smartRefreshLayout = this.f83790g;
        if (smartRefreshLayout != null) {
            return smartRefreshLayout;
        }
        f0.S("mRefreshLayout");
        return null;
    }

    public final void m4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31887, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        e4().removeAllViews();
        if (this.f83786c) {
            com.max.xiaoheihe.module.favour.e eVar = this.f83788e;
            if (eVar != null) {
                eVar.k();
            }
        } else {
            Object objI4 = i4();
            b bVar = objI4 instanceof b ? (b) objI4 : null;
            if (bVar != null) {
                bVar.k();
            }
        }
        this.f83785b = false;
    }

    public final void n4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31885, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LayoutInflater layoutInflater = this.mInflater;
        View view = this.mContentView;
        f0.n(view, "null cannot be cast to non-null type android.view.ViewGroup");
        View viewInflate = layoutInflater.inflate(R.layout.item_bottom_bar_multi_op, (ViewGroup) view, false);
        this.f83798o = viewInflate;
        BottomButtonLeftItemView bottomButtonLeftItemView = viewInflate != null ? (BottomButtonLeftItemView) viewInflate.findViewById(R.id.bottom_button) : null;
        if (this.f83786c) {
            if (bottomButtonLeftItemView != null) {
                bottomButtonLeftItemView.setLeftText("移动到");
            }
            if (bottomButtonLeftItemView != null) {
                bottomButtonLeftItemView.setRightText("移除");
            }
        }
        com.max.hbcommon.base.adapter.s<BBSLinkObj> sVarI4 = this.f83786c ? this.f83788e : i4();
        b bVar = sVarI4 instanceof b ? (b) sVarI4 : null;
        if (bVar != null) {
            bVar.g(new f(bottomButtonLeftItemView, this));
        }
        if (bottomButtonLeftItemView != null) {
            bottomButtonLeftItemView.setCheckboxListener(new g(sVarI4));
        }
        if (bottomButtonLeftItemView != null) {
            bottomButtonLeftItemView.setLeftClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.favour.FavourLinkFolderFragment$initBottomBar$3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    if (PatchProxy.proxy(new Object[]{view2}, this, changeQuickRedirect, false, 31921, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    String str = "";
                    for (BBSLinkObj bBSLinkObj : this.f83813b.h4()) {
                        if (bBSLinkObj.isChecked()) {
                            if (!f0.g(str, "")) {
                                str = str + ',';
                            }
                            str = str + bBSLinkObj.getLinkid();
                        }
                    }
                    if (com.max.hbcommon.utils.c.u(str)) {
                        return;
                    }
                    if (!this.f83813b.f83786c) {
                        com.max.xiaoheihe.module.bbs.utils.b.h(((com.max.hbcommon.base.d) this.f83813b).mContext, this.f83813b.g4(), this.f83813b.h4(), this.f83813b.i4(), -1, str);
                        return;
                    }
                    BBSKtUtils.Companion companion = BBSKtUtils.f83254a;
                    Activity mContext = ((com.max.hbcommon.base.d) this.f83813b).mContext;
                    f0.o(mContext, "mContext");
                    LayoutInflater mInflater = ((com.max.hbcommon.base.d) this.f83813b).mInflater;
                    f0.o(mInflater, "mInflater");
                    LifecycleCoroutineScope lifecycleCoroutineScopeA = z.a(this.f83813b);
                    FavourLinkFolderFragment$initBottomBar$3$disposable$1 favourLinkFolderFragment$initBottomBar$3$disposable$1 = new FavourLinkFolderFragment$initBottomBar$3$disposable$1(this.f83813b);
                    final FavourLinkFolderFragment favourLinkFolderFragment = this.f83813b;
                    this.f83813b.addDisposable(companion.l(mContext, mInflater, lifecycleCoroutineScopeA, str, favourLinkFolderFragment$initBottomBar$3$disposable$1, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.favour.FavourLinkFolderFragment$initBottomBar$3$disposable$2
                        public static ChangeQuickRedirect changeQuickRedirect;

                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31925, new Class[0], Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31924, new Class[0], Void.TYPE).isSupported) {
                                return;
                            }
                            Iterator<BBSLinkObj> it = favourLinkFolderFragment.h4().iterator();
                            f0.o(it, "mLinkList.iterator()");
                            while (it.hasNext()) {
                                BBSLinkObj next = it.next();
                                if (next != null && next.isChecked()) {
                                    it.remove();
                                }
                            }
                            e eVar = favourLinkFolderFragment.f83788e;
                            if (eVar != null) {
                                eVar.notifyDataSetChanged();
                            }
                            favourLinkFolderFragment.m4();
                            Context context = favourLinkFolderFragment.getContext();
                            FavourLinkFolderActivity favourLinkFolderActivity = context instanceof FavourLinkFolderActivity ? (FavourLinkFolderActivity) context : null;
                            if (favourLinkFolderActivity != null) {
                                favourLinkFolderActivity.o2();
                            }
                        }
                    }));
                }
            });
        }
        r4();
        if (bottomButtonLeftItemView != null) {
            bottomButtonLeftItemView.setRightClickListener(new h());
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onAttach(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 31880, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        super.onAttach(context);
        this.f83797n = (c) context;
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onCreate(@dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 31879, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        this.f83796m = true;
        this.f83786c = ad.a.b(ad.a.E, false, 2, null);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        com.max.hbcommon.base.e eVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31894, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        if (this.f83789f == null || (eVar = this.f83799p) == null) {
            return;
        }
        k4().removeOnItemTouchListener(eVar);
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31892, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        this.f83793j = 0;
        d4();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31893, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        if (this.f83800q) {
            this.f83800q = false;
            View view = this.rootView;
            if (view != null) {
                view.postDelayed(new p(), 100L);
            }
        }
    }

    public final void q4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31895, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!isResumed()) {
            this.f83800q = true;
            return;
        }
        View view = this.rootView;
        if (view != null) {
            view.postDelayed(new o(), 100L);
        }
    }

    public final void s4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31888, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f83793j = 0;
        d4();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 31881, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.setUserVisibleHint(z10);
        if (this.f83796m && z10) {
            d4();
        }
    }

    public final void u4(@dl.e View view) {
        this.f83798o = view;
    }

    public final void v4(@dl.e c cVar) {
        this.f83797n = cVar;
    }

    public final void w4(boolean z10) {
        this.f83796m = z10;
    }

    public final void x4(@dl.d RelativeLayout relativeLayout) {
        if (PatchProxy.proxy(new Object[]{relativeLayout}, this, changeQuickRedirect, false, 31876, new Class[]{RelativeLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(relativeLayout, "<set-?>");
        this.f83791h = relativeLayout;
    }

    public final void y4(@dl.e String str) {
        this.f83794k = str;
    }

    public final void z4(@dl.e String str) {
        this.f83795l = str;
    }
}
