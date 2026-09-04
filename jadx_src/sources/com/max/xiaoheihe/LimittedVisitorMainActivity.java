package com.max.xiaoheihe;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.bean.news.LinkListResultObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.d1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: LimittedVisitorMainActivity.kt */
/* JADX INFO: loaded from: classes3.dex */
@t0({"SMAP\nLimittedVisitorMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimittedVisitorMainActivity.kt\ncom/max/xiaoheihe/LimittedVisitorMainActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,183:1\n262#2,2:184\n168#2,2:186\n*S KotlinDebug\n*F\n+ 1 LimittedVisitorMainActivity.kt\ncom/max/xiaoheihe/LimittedVisitorMainActivity\n*L\n83#1:184,2\n85#1:186,2\n*E\n"})
@o(parameters = 0)
public final class LimittedVisitorMainActivity extends BaseActivity {
    public static final int Q = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    public d1 L;
    private int M;
    private int N = 30;

    @dl.d
    private final List<FeedsContentBaseObj> O = new ArrayList();

    @dl.e
    private com.max.xiaoheihe.module.news.adapter.a P;

    /* JADX INFO: compiled from: LimittedVisitorMainActivity.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<LinkListResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.m.nr, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (LimittedVisitorMainActivity.this.isActive()) {
                super.onError(e10);
                LimittedVisitorMainActivity.this.Y1().f109576d.P();
                LimittedVisitorMainActivity.this.Y1().f109576d.w();
                LimittedVisitorMainActivity.X1(LimittedVisitorMainActivity.this);
            }
        }

        public void onNext(@dl.d Result<LinkListResultObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.or, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (LimittedVisitorMainActivity.this.isActive()) {
                LimittedVisitorMainActivity.this.Y1().f109576d.P();
                LimittedVisitorMainActivity.this.Y1().f109576d.w();
                if (LimittedVisitorMainActivity.this.M == 0) {
                    LimittedVisitorMainActivity.this.O.clear();
                    List[] listArr = new List[1];
                    LinkListResultObj result2 = result.getResult();
                    listArr[0] = result2 != null ? result2.getLinks() : null;
                    if (com.max.hbcommon.utils.c.w(listArr)) {
                        LimittedVisitorMainActivity.W1(LimittedVisitorMainActivity.this);
                    }
                }
                List[] listArr2 = new List[1];
                LinkListResultObj result3 = result.getResult();
                listArr2[0] = result3 != null ? result3.getLinks() : null;
                if (com.max.hbcommon.utils.c.w(listArr2)) {
                    LimittedVisitorMainActivity.this.Y1().f109576d.b0(false);
                } else {
                    LimittedVisitorMainActivity.V1(LimittedVisitorMainActivity.this);
                    List list = LimittedVisitorMainActivity.this.O;
                    LinkListResultObj result4 = result.getResult();
                    List<FeedsContentBaseObj> links = result4 != null ? result4.getLinks() : null;
                    f0.m(links);
                    list.addAll(links);
                }
                com.max.xiaoheihe.module.news.adapter.a aVar = LimittedVisitorMainActivity.this.P;
                if (aVar != null) {
                    aVar.notifyDataSetChanged();
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.pr, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<LinkListResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: LimittedVisitorMainActivity.kt */
    public static final class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 12610, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            LimittedVisitorMainActivity.this.M = 0;
            LimittedVisitorMainActivity.this.Y1().f109576d.b0(true);
            LimittedVisitorMainActivity.O1(LimittedVisitorMainActivity.this);
        }
    }

    /* JADX INFO: compiled from: LimittedVisitorMainActivity.kt */
    public static final class c implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.b
        public final void f(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, bb.c.m.rr, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            LimittedVisitorMainActivity.this.M += LimittedVisitorMainActivity.this.N;
            LimittedVisitorMainActivity.O1(LimittedVisitorMainActivity.this);
        }
    }

    /* JADX INFO: compiled from: LimittedVisitorMainActivity.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.m.sr, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcache.c.z(com.max.hbcache.c.G0, "0");
            LimittedVisitorMainActivity.this.startActivity(new Intent(LimittedVisitorMainActivity.this, (Class<?>) SplashActivity.class));
            LimittedVisitorMainActivity.this.finish();
        }
    }

    public static final /* synthetic */ void O1(LimittedVisitorMainActivity limittedVisitorMainActivity) {
        if (PatchProxy.proxy(new Object[]{limittedVisitorMainActivity}, null, changeQuickRedirect, true, bb.c.m.jr, new Class[]{LimittedVisitorMainActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        limittedVisitorMainActivity.Z1();
    }

    public static final /* synthetic */ void V1(LimittedVisitorMainActivity limittedVisitorMainActivity) {
        if (PatchProxy.proxy(new Object[]{limittedVisitorMainActivity}, null, changeQuickRedirect, true, bb.c.m.mr, new Class[]{LimittedVisitorMainActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        limittedVisitorMainActivity.x1();
    }

    public static final /* synthetic */ void W1(LimittedVisitorMainActivity limittedVisitorMainActivity) {
        if (PatchProxy.proxy(new Object[]{limittedVisitorMainActivity}, null, changeQuickRedirect, true, bb.c.m.lr, new Class[]{LimittedVisitorMainActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        limittedVisitorMainActivity.y1();
    }

    public static final /* synthetic */ void X1(LimittedVisitorMainActivity limittedVisitorMainActivity) {
        if (PatchProxy.proxy(new Object[]{limittedVisitorMainActivity}, null, changeQuickRedirect, true, bb.c.m.kr, new Class[]{LimittedVisitorMainActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        limittedVisitorMainActivity.C1();
    }

    private final void Z1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.hr, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().d8(this.M, this.N).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a()));
    }

    @dl.d
    public final d1 Y1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.er, new Class[0], d1.class);
        if (patchProxyResultProxy.isSupported) {
            return (d1) patchProxyResultProxy.result;
        }
        d1 d1Var = this.L;
        if (d1Var != null) {
            return d1Var;
        }
        f0.S("binding");
        return null;
    }

    public final void a2(@dl.d d1 d1Var) {
        if (PatchProxy.proxy(new Object[]{d1Var}, this, changeQuickRedirect, false, bb.c.m.fr, new Class[]{d1.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(d1Var, "<set-?>");
        this.L = d1Var;
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.gr, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.k1();
        d1 d1VarC = d1.c(getLayoutInflater());
        f0.o(d1VarC, "inflate(layoutInflater)");
        a2(d1VarC);
        setContentView(Y1().b());
        Y1().f109576d.S(new b());
        Y1().f109576d.f0(new c());
        View vgBottomBtn = LayoutInflater.from(this).inflate(R.layout.layout_limmitted_vistor_bottom_btn, (ViewGroup) null, false);
        vgBottomBtn.setBackground(ViewUtils.i(ViewUtils.f(this, 18.0f), com.max.xiaoheihe.utils.d.E(R.color.purchase_btn_start_color), com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_not_change_color)));
        vgBottomBtn.setOnClickListener(new d());
        FrameLayout mVgAbove = this.f66609j;
        f0.o(mVgAbove, "mVgAbove");
        mVgAbove.setVisibility(0);
        int iF = ViewUtils.f(this.f66601b, 20.0f);
        f0.o(vgBottomBtn, "vgBottomBtn");
        vgBottomBtn.setPadding(iF, 0, iF, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, ViewUtils.f(this.f66601b, 36.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = ViewUtils.f(this.f66601b, 60.0f);
        vgBottomBtn.setLayoutParams(layoutParams);
        this.f66609j.addView(vgBottomBtn);
        this.P = new com.max.xiaoheihe.module.news.adapter.a(this, this.O);
        Y1().f109575c.setLayoutManager(new LinearLayoutManager(this));
        Y1().f109575c.setAdapter(this.P);
        E1();
        Z1();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.ir, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.n1();
        E1();
        Z1();
    }
}
