package com.max.xiaoheihe.module.game.pick;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.max.hbcommon.base.adapter.s;
import com.max.hbsearch.l;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.mediaselector.lib.config.f;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.SearchGameListObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.game.a2;
import com.max.xiaoheihe.module.game.adapter.u;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;
import mb.b1;
import ng.j;
import xh.m;

/* JADX INFO: compiled from: AddGameOwnPlatfFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class b extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    public static final a f87975h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f87976i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final String f87977j = "ARG_TYPE";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b1 f87978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private String f87979c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u f87981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f87982f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final List<GameObj> f87980d = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final a2 f87983g = new a2();

    /* JADX INFO: compiled from: AddGameOwnPlatfFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38110, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : b.f87977j;
        }

        @dl.d
        @m
        public final b b(@dl.e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 38111, new Class[]{String.class}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (b) patchProxyResultProxy.result;
            }
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putString(b.f87975h.a(), str);
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.pick.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AddGameOwnPlatfFragment.kt */
    public static final class C0805b extends com.max.hbcommon.network.d<Result<SearchGameListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0805b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38113, new Class[0], Void.TYPE).isSupported && b.this.isActive()) {
                b.this.S3().f131496c.A(0);
                b.this.S3().f131496c.p(0);
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 38112, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (b.this.isActive()) {
                super.onError(e10);
                b.R3(b.this);
                b.this.S3().f131496c.A(0);
                b.this.S3().f131496c.p(0);
            }
        }

        public void onNext(@dl.d Result<SearchGameListObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 38114, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (b.this.isActive()) {
                b.P3(b.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38115, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SearchGameListObj>) obj);
        }
    }

    /* JADX INFO: compiled from: AddGameOwnPlatfFragment.kt */
    public static final class c implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.d
        public final void k(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 38116, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            b.this.f87982f = 0;
            b.M3(b.this);
        }
    }

    /* JADX INFO: compiled from: AddGameOwnPlatfFragment.kt */
    public static final class d implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // pg.b
        public final void f(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 38117, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            b.this.f87982f += 30;
            b.M3(b.this);
        }
    }

    /* JADX INFO: compiled from: AddGameOwnPlatfFragment.kt */
    public static final class e extends u {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: AddGameOwnPlatfFragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f87988b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f87989c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ GameObj f87990d;

            a(View view, b bVar, GameObj gameObj) {
                this.f87988b = view;
                this.f87989c = bVar;
                this.f87990d = gameObj;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x00c1  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z10 = true;
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38120, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f87988b.setBackgroundDrawable(((com.max.hbcommon.base.d) this.f87989c).mContext.getResources().getDrawable(R.drawable.white_bg_divider_stroke_2dp));
                Bitmap bitmapM = com.max.hbimage.b.m(this.f87988b, this.f87988b.getWidth(), this.f87988b.getHeight(), ViewUtils.f(((com.max.hbcommon.base.d) this.f87989c).mContext, 2.0f), false);
                if (bitmapM != null) {
                    try {
                        String str = this.f87990d.getAppid() + f.f75141t;
                        File cacheDir = ((com.max.hbcommon.base.d) this.f87989c).mContext.getCacheDir();
                        if (cacheDir != null) {
                            File file = new File(cacheDir, str);
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            bitmapM.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                            fileOutputStream.close();
                            String path = file.getPath();
                            if (!bitmapM.isRecycled()) {
                                bitmapM.recycle();
                            }
                            Intent intent = new Intent();
                            intent.putExtra(l.B, this.f87990d);
                            intent.putExtra(l.C, path);
                            ((com.max.hbcommon.base.d) this.f87989c).mContext.setResult(-1, intent);
                            ((com.max.hbcommon.base.d) this.f87989c).mContext.finish();
                        } else {
                            z10 = false;
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                com.max.hbutils.utils.c.f(this.f87989c.getString(R.string.fail));
            }
        }

        e(Activity activity, List<GameObj> list, a2 a2Var) {
            super(activity, list, a2Var, null);
        }

        @Override // com.max.xiaoheihe.module.game.adapter.u, com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 38119, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            t(eVar, (GameObj) obj);
        }

        @Override // com.max.xiaoheihe.module.game.adapter.u
        public void t(@dl.d s.e viewHolder, @dl.d GameObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 38118, new Class[]{s.e.class, GameObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            super.t(viewHolder, data);
            View viewB = viewHolder.b();
            a aVar = new a(viewB, b.this, data);
            viewB.setOnClickListener(aVar);
            View viewI = viewHolder.i(R.id.giv);
            if (viewI != null) {
                viewI.setOnClickListener(aVar);
            }
        }
    }

    public static final /* synthetic */ void M3(b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 38107, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.T3();
    }

    public static final /* synthetic */ void P3(b bVar, SearchGameListObj searchGameListObj) {
        if (PatchProxy.proxy(new Object[]{bVar, searchGameListObj}, null, changeQuickRedirect, true, 38109, new Class[]{b.class, SearchGameListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.X3(searchGameListObj);
    }

    public static final /* synthetic */ void R3(b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 38108, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.showError();
    }

    private final void T3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38103, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String str = this.f87979c;
        addDisposable((io.reactivex.disposables.b) (str == null || str.length() == 0 ? i.a().r2(this.f87982f, 30) : i.a().S1(this.f87979c, this.f87982f, 30)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new C0805b()));
    }

    private final void V3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38101, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        S3().f131496c.S(new c());
        S3().f131496c.f0(new d());
        S3().f131496c.setBackgroundDrawable(getResources().getDrawable(R.color.background_layer_2_color));
        S3().f131495b.setLayoutManager(new LinearLayoutManager(this.mContext));
        S3().f131495b.setClipToPadding(false);
        S3().f131495b.setClipChildren(false);
        S3().f131495b.setPadding(0, ViewUtils.f(this.mContext, 4.0f), 0, 0);
        Z3(new e(this.mContext, this.f87980d, this.f87983g));
        S3().f131495b.setAdapter(U3());
    }

    @dl.d
    @m
    public static final b W3(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 38106, new Class[]{String.class}, b.class);
        return patchProxyResultProxy.isSupported ? (b) patchProxyResultProxy.result : f87975h.b(str);
    }

    private final void X3(SearchGameListObj searchGameListObj) {
        List<GameObj> game_list;
        if (PatchProxy.proxy(new Object[]{searchGameListObj}, this, changeQuickRedirect, false, 38102, new Class[]{SearchGameListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f87982f == 0) {
            this.f87980d.clear();
        }
        if (searchGameListObj != null && (game_list = searchGameListObj.getGame_list()) != null) {
            this.f87980d.addAll(game_list);
        }
        U3().notifyDataSetChanged();
        showContentView();
    }

    @dl.d
    public final b1 S3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38095, new Class[0], b1.class);
        if (patchProxyResultProxy.isSupported) {
            return (b1) patchProxyResultProxy.result;
        }
        b1 b1Var = this.f87978b;
        if (b1Var != null) {
            return b1Var;
        }
        f0.S("binding");
        return null;
    }

    @dl.d
    public final u U3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38097, new Class[0], u.class);
        if (patchProxyResultProxy.isSupported) {
            return (u) patchProxyResultProxy.result;
        }
        u uVar = this.f87981e;
        if (uVar != null) {
            return uVar;
        }
        f0.S("mAdapter");
        return null;
    }

    public final void Y3(@dl.d b1 b1Var) {
        if (PatchProxy.proxy(new Object[]{b1Var}, this, changeQuickRedirect, false, 38096, new Class[]{b1.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(b1Var, "<set-?>");
        this.f87978b = b1Var;
    }

    public final void Z3(@dl.d u uVar) {
        if (PatchProxy.proxy(new Object[]{uVar}, this, changeQuickRedirect, false, 38098, new Class[]{u.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(uVar, "<set-?>");
        this.f87981e = uVar;
    }

    @Override // com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38100, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        T3();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38099, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        b1 b1VarC = b1.c(getLayoutInflater());
        f0.o(b1VarC, "inflate(layoutInflater)");
        Y3(b1VarC);
        setContentView(S3());
        this.f87979c = requireArguments().getString(f87977j);
        V3();
        if (this.mIsFirst) {
            showLoading();
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38105, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f87983g.f();
        super.onDestroyView();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38104, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        T3();
    }
}
