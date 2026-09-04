package com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel;

import androidx.compose.runtime.internal.o;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.i0;
import com.max.basebbs.bean.BBSLinkRecObj;
import com.max.hbcommon.base.BaseViewModel;
import com.max.hbcommon.base.l;
import com.max.hbutils.bean.Result;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.bean.bbs.BBSLinkTreeObj;
import com.max.xiaoheihe.bean.bbs.ComboObj;
import com.max.xiaoheihe.module.bbs.post.PostPageFactory;
import com.max.xiaoheihe.module.game.heybox.gamematerial.bean.GameMaterialListObj;
import com.max.xiaoheihe.network.i;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PostPageViewModel.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class e extends BaseViewModel {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f87721v = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private String f87722d = "1";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final i0<String> f87723e = new i0<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final i0<String> f87724f = new i0<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final i0<String> f87725g = new i0<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private String f87726h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private BBSLinkRecObj f87727i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final i0<String> f87728j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final LiveData<String> f87729k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final i0<l<Boolean>> f87730l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final i0<l<Boolean>> f87731m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final i0<d> f87732n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private final LiveData<d> f87733o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private final i0<Result<GameMaterialListObj>> f87734p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private final LiveData<Result<GameMaterialListObj>> f87735q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private final i0<l<Result<ComboObj>>> f87736r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private final LiveData<l<Result<ComboObj>>> f87737s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private final i0<l<Result<ComboObj>>> f87738t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private final LiveData<l<Result<ComboObj>>> f87739u;

    /* JADX INFO: compiled from: PostPageViewModel.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<ComboObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37885, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            super.onComplete();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 37886, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            super.onError(e10);
        }

        public void onNext(@dl.d Result<ComboObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 37887, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            super.onNext(result);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37888, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ComboObj>) obj);
        }
    }

    /* JADX INFO: compiled from: PostPageViewModel.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<BBSLinkTreeObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f87741c;

        b(String str) {
            this.f87741c = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 37889, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            super.onError(e10);
            e.this.f87732n.o(new d(null, this.f87741c));
        }

        public void onNext(@dl.d Result<BBSLinkTreeObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 37890, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            super.onNext(result);
            e.this.x("0");
            e.this.f87732n.o(new d(result, this.f87741c));
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37891, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSLinkTreeObj>) obj);
        }
    }

    /* JADX INFO: compiled from: PostPageViewModel.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<GameMaterialListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 37892, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            super.onError(e10);
            e.this.f87734p.o(null);
        }

        public void onNext(@dl.d Result<GameMaterialListObj> bbsRecommendVideosObjResult) {
            if (PatchProxy.proxy(new Object[]{bbsRecommendVideosObjResult}, this, changeQuickRedirect, false, 37893, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(bbsRecommendVideosObjResult, "bbsRecommendVideosObjResult");
            super.onNext(bbsRecommendVideosObjResult);
            g.a aVar = g.f74531b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("PostPageViewModel, onNext, materialList = ");
            GameMaterialListObj result = bbsRecommendVideosObjResult.getResult();
            sb2.append(result != null ? result.getMaterialList() : null);
            aVar.q(sb2.toString());
            e.this.f87734p.o(bbsRecommendVideosObjResult);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37894, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GameMaterialListObj>) obj);
        }
    }

    public e() {
        i0<String> i0Var = new i0<>();
        this.f87728j = i0Var;
        this.f87729k = i0Var;
        i0<l<Boolean>> i0Var2 = new i0<>();
        this.f87730l = i0Var2;
        this.f87731m = i0Var2;
        i0<d> i0Var3 = new i0<>();
        this.f87732n = i0Var3;
        this.f87733o = i0Var3;
        i0<Result<GameMaterialListObj>> i0Var4 = new i0<>();
        this.f87734p = i0Var4;
        this.f87735q = i0Var4;
        i0<l<Result<ComboObj>>> i0Var5 = new i0<>();
        this.f87736r = i0Var5;
        this.f87737s = i0Var5;
        i0<l<Result<ComboObj>>> i0Var6 = new i0<>();
        this.f87738t = i0Var6;
        this.f87739u = i0Var6;
    }

    public final void A(@dl.d String num) {
        if (PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 37884, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(num, "num");
        this.f87728j.o(num);
    }

    public final void i(@dl.e String str, @dl.e String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 37882, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        c((io.reactivex.disposables.b) i.a().M8(str, str2).a4(io.reactivex.android.schedulers.a.c()).I5(io.reactivex.schedulers.b.d()).J5(new a()));
    }

    @dl.d
    public final LiveData<d> k() {
        return this.f87733o;
    }

    @dl.d
    public final LiveData<l<Result<ComboObj>>> m() {
        return this.f87739u;
    }

    @dl.d
    public final LiveData<l<Result<ComboObj>>> n() {
        return this.f87737s;
    }

    @dl.d
    public final LiveData<String> o() {
        return this.f87729k;
    }

    public final void p(@dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4, @dl.e String str5, @dl.e String str6, @dl.e String str7) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7}, this, changeQuickRedirect, false, 37881, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        HashMap map = new HashMap(16);
        if (!com.max.hbcommon.utils.c.u(this.f87725g.f())) {
            String strF = this.f87725g.f();
            f0.m(strF);
            map.put(PostPageFactory.f81471g, strF);
        }
        if (!com.max.hbcommon.utils.c.u(this.f87726h)) {
            String str8 = this.f87726h;
            f0.m(str8);
            map.put("comment_id", str8);
        }
        if (f0.g("1", str)) {
            map.put("reload", "1");
        }
        Map<String, String> mapX = l0.X(this.f87727i);
        f0.o(mapX, "getRecommendParameters(recObj)");
        map.putAll(mapX);
        c((io.reactivex.disposables.b) i.a().s(this.f87724f.f(), this.f87723e.f(), str2, str3, this.f87722d, str4, str5, str6, null, map).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(str7)));
    }

    @dl.d
    public final String r() {
        return this.f87722d;
    }

    public final void s() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37883, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        c((io.reactivex.disposables.b) i.a().b5(this.f87723e.f()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    @dl.d
    public final LiveData<Result<GameMaterialListObj>> t() {
        return this.f87735q;
    }

    public final void u(@dl.d String commentId) {
        if (PatchProxy.proxy(new Object[]{commentId}, this, changeQuickRedirect, false, 37879, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(commentId, "commentId");
        this.f87726h = commentId;
    }

    public final void v(@dl.d String hSrc) {
        if (PatchProxy.proxy(new Object[]{hSrc}, this, changeQuickRedirect, false, 37877, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(hSrc, "hSrc");
        this.f87724f.r(hSrc);
    }

    public final void w(@dl.d String linkId) {
        if (PatchProxy.proxy(new Object[]{linkId}, this, changeQuickRedirect, false, 37876, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(linkId, "linkId");
        this.f87723e.r(linkId);
    }

    public final void x(@dl.d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 37875, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.f87722d = str;
    }

    public final void y(@dl.d BBSLinkRecObj bbsLinkRecObj) {
        if (PatchProxy.proxy(new Object[]{bbsLinkRecObj}, this, changeQuickRedirect, false, 37880, new Class[]{BBSLinkRecObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(bbsLinkRecObj, "bbsLinkRecObj");
        this.f87727i = bbsLinkRecObj;
    }

    public final void z(@dl.d String rootCommentId) {
        if (PatchProxy.proxy(new Object[]{rootCommentId}, this, changeQuickRedirect, false, 37878, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(rootCommentId, "rootCommentId");
        this.f87725g.r(rootCommentId);
    }
}
