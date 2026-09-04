package com.max.xiaoheihe.module.favour;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.t;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.CollectionFolder;
import com.max.xiaoheihe.bean.bbs.CollectionFolders;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.nio.charset.Charset;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FavourLinkFoldersFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@com.max.hbcommon.analytics.m(path = lb.d.f131290y1)
@o(parameters = 0)
public final class i extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f83915g = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f83916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SmartRefreshLayout f83917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t f83918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BottomButtonLeftItemView f83919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final ArrayList<CollectionFolder> f83920f = new ArrayList<>();

    /* JADX INFO: compiled from: FavourLinkFoldersFragment.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 31973, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            super.onError(e10);
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 31972, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            super.onNext(result);
            i.this.X3();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31974, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: FavourLinkFoldersFragment.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: FavourLinkFoldersFragment.kt */
        public static final class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ EditText f83923b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ i f83924c;

            a(EditText editText, i iVar) {
                this.f83923b = editText;
                this.f83924c = iVar;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 31976, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                String string = this.f83923b.getText().toString();
                Charset charsetDefaultCharset = Charset.defaultCharset();
                f0.o(charsetDefaultCharset, "defaultCharset()");
                byte[] bytes = string.getBytes(charsetDefaultCharset);
                f0.o(bytes, "this as java.lang.String).getBytes(charset)");
                if (bytes.length > 24) {
                    com.max.hbutils.utils.c.f("最多输入8个字");
                } else {
                    dialogInterface.dismiss();
                    i.L3(this.f83924c, this.f83923b.getText().toString());
                }
            }
        }

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.favour.i$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FavourLinkFoldersFragment.kt */
        public static final class DialogInterfaceOnClickListenerC0740b implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final DialogInterfaceOnClickListenerC0740b f83925b = new DialogInterfaceOnClickListenerC0740b();
            public static ChangeQuickRedirect changeQuickRedirect;

            DialogInterfaceOnClickListenerC0740b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 31977, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31975, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            EditText editTextI = com.max.xiaoheihe.module.bbs.utils.b.i(((com.max.hbcommon.base.d) i.this).mContext);
            com.max.hbcommon.view.a aVarD = new com.max.hbcommon.view.a.f(((com.max.hbcommon.base.d) i.this).mContext).t(R.string.create, new a(editTextI, i.this)).n(R.string.cancel, DialogInterfaceOnClickListenerC0740b.f83925b).i(editTextI).y("创建收藏夹").d();
            f0.o(aVarD, "private fun initFooter()…ableLoadMore(false)\n    }");
            aVarD.show();
        }
    }

    /* JADX INFO: compiled from: FavourLinkFoldersFragment.kt */
    public static final class c implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 31978, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            i.this.X3();
        }
    }

    /* JADX INFO: compiled from: FavourLinkFoldersFragment.kt */
    public static final class d extends com.max.hbcommon.network.d<Result<CollectionFolders>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 31980, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            super.onError(e10);
            if (i.this.isActive()) {
                i.this.U3().w();
                i.this.U3().P();
                i.O3(i.this);
            }
        }

        public void onNext(@dl.d Result<CollectionFolders> t10) {
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 31979, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(t10, "t");
            if (i.this.isActive()) {
                i.this.U3().w();
                i.this.U3().P();
                i.N3(i.this);
                i.this.S3().clear();
                CollectionFolders result = t10.getResult();
                ArrayList arrayList = (ArrayList) (result != null ? result.getFolders() : null);
                CollectionFolders result2 = t10.getResult();
                if (!com.max.hbcommon.utils.c.w(arrayList)) {
                    f0.m(arrayList);
                    if (!arrayList.isEmpty()) {
                        arrayList.add(1, new CollectionFolder(result2.getGame_list_fav_num() != null ? Integer.valueOf(n.q(result2.getGame_list_fav_num())) : null, "-1", "0", "游戏单收藏夹", null, null, 3, null, 128, null));
                        arrayList.add(1, new CollectionFolder(result2.getCy_fav_num() != null ? Integer.valueOf(n.q(result2.getCy_fav_num())) : null, "-1", "0", "CY", null, null, 2, null, 128, null));
                        arrayList.add(1, new CollectionFolder(result2.getWiki_fav_num() != null ? Integer.valueOf(n.q(result2.getWiki_fav_num())) : null, "-1", "0", "百科收藏夹", null, null, 1, null, 128, null));
                    }
                    i.this.S3().addAll(arrayList);
                }
                i.this.R3().notifyDataSetChanged();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31981, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<CollectionFolders>) obj);
        }
    }

    public static final /* synthetic */ void L3(i iVar, String str) {
        if (PatchProxy.proxy(new Object[]{iVar, str}, null, changeQuickRedirect, true, 31969, new Class[]{i.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        iVar.P3(str);
    }

    public static final /* synthetic */ void N3(i iVar) {
        if (PatchProxy.proxy(new Object[]{iVar}, null, changeQuickRedirect, true, 31970, new Class[]{i.class}, Void.TYPE).isSupported) {
            return;
        }
        iVar.showContentView();
    }

    public static final /* synthetic */ void O3(i iVar) {
        if (PatchProxy.proxy(new Object[]{iVar}, null, changeQuickRedirect, true, 31971, new Class[]{i.class}, Void.TYPE).isSupported) {
            return;
        }
        iVar.showError();
    }

    @SuppressLint({"AutoDispose"})
    private final void P3(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 31966, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Ob(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a()));
    }

    private final void V3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31967, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Activity mContext = this.mContext;
        f0.o(mContext, "mContext");
        Z3(new t(new f(mContext, this.f83920f)));
        T3().setLayoutManager(new LinearLayoutManager(this.mContext));
        T3().setAdapter(R3());
    }

    private final void W3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31965, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Q3().setRightClickListener(new b());
        U3().b0(false);
    }

    @dl.d
    public final BottomButtonLeftItemView Q3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31960, new Class[0], BottomButtonLeftItemView.class);
        if (patchProxyResultProxy.isSupported) {
            return (BottomButtonLeftItemView) patchProxyResultProxy.result;
        }
        BottomButtonLeftItemView bottomButtonLeftItemView = this.f83919e;
        if (bottomButtonLeftItemView != null) {
            return bottomButtonLeftItemView;
        }
        f0.S("btnCreateFolder");
        return null;
    }

    @dl.d
    public final t R3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31958, new Class[0], t.class);
        if (patchProxyResultProxy.isSupported) {
            return (t) patchProxyResultProxy.result;
        }
        t tVar = this.f83918d;
        if (tVar != null) {
            return tVar;
        }
        f0.S("mAdapter");
        return null;
    }

    @dl.d
    public final ArrayList<CollectionFolder> S3() {
        return this.f83920f;
    }

    @dl.d
    public final RecyclerView T3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31954, new Class[0], RecyclerView.class);
        if (patchProxyResultProxy.isSupported) {
            return (RecyclerView) patchProxyResultProxy.result;
        }
        RecyclerView recyclerView = this.f83916b;
        if (recyclerView != null) {
            return recyclerView;
        }
        f0.S("mRecyclerView");
        return null;
    }

    @dl.d
    public final SmartRefreshLayout U3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31956, new Class[0], SmartRefreshLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (SmartRefreshLayout) patchProxyResultProxy.result;
        }
        SmartRefreshLayout smartRefreshLayout = this.f83917c;
        if (smartRefreshLayout != null) {
            return smartRefreshLayout;
        }
        f0.S("mRefreshLayout");
        return null;
    }

    @SuppressLint({"AutoDispose"})
    public final void X3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31968, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().v(0).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    public final void Y3(@dl.d BottomButtonLeftItemView bottomButtonLeftItemView) {
        if (PatchProxy.proxy(new Object[]{bottomButtonLeftItemView}, this, changeQuickRedirect, false, 31961, new Class[]{BottomButtonLeftItemView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(bottomButtonLeftItemView, "<set-?>");
        this.f83919e = bottomButtonLeftItemView;
    }

    public final void Z3(@dl.d t tVar) {
        if (PatchProxy.proxy(new Object[]{tVar}, this, changeQuickRedirect, false, 31959, new Class[]{t.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tVar, "<set-?>");
        this.f83918d = tVar;
    }

    public final void a4(@dl.d RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, 31955, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recyclerView, "<set-?>");
        this.f83916b = recyclerView;
    }

    public final void b4(@dl.d SmartRefreshLayout smartRefreshLayout) {
        if (PatchProxy.proxy(new Object[]{smartRefreshLayout}, this, changeQuickRedirect, false, 31957, new Class[]{SmartRefreshLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(smartRefreshLayout, "<set-?>");
        this.f83917c = smartRefreshLayout;
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31962, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_favour_folders);
        View viewFindViewById = this.mContentView.findViewById(R.id.srl);
        f0.o(viewFindViewById, "mContentView.findViewById(R.id.srl)");
        b4((SmartRefreshLayout) viewFindViewById);
        View viewFindViewById2 = this.mContentView.findViewById(R.id.rv);
        f0.o(viewFindViewById2, "mContentView.findViewById(R.id.rv)");
        a4((RecyclerView) viewFindViewById2);
        View viewFindViewById3 = this.mContentView.findViewById(R.id.btn_create_folder);
        f0.o(viewFindViewById3, "mContentView.findViewById(R.id.btn_create_folder)");
        Y3((BottomButtonLeftItemView) viewFindViewById3);
        W3();
        V3();
        U3().S(new c());
        showLoading();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31964, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        X3();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31963, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        X3();
    }
}
