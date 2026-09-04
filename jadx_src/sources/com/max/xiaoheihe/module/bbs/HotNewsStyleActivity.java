package com.max.xiaoheihe.module.bbs;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.base.adapter.OneTimeValidExposureWatcher;
import com.max.hbcommon.component.TitleBar;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkListResultObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.p9;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: HotNewsStyleActivity.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nHotNewsStyleActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HotNewsStyleActivity.kt\ncom/max/xiaoheihe/module/bbs/HotNewsStyleActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,127:1\n1855#2,2:128\n*S KotlinDebug\n*F\n+ 1 HotNewsStyleActivity.kt\ncom/max/xiaoheihe/module/bbs/HotNewsStyleActivity\n*L\n121#1:128,2\n*E\n"})
@ig.d(path = {lb.d.f131199l1})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class HotNewsStyleActivity extends BaseActivity {

    @dl.d
    public static final a P = new a(null);
    public static final int Q = 8;

    @dl.d
    public static final String R = "list_id";

    @dl.d
    public static final String S = "title";
    public static ChangeQuickRedirect changeQuickRedirect;
    public p9 L;
    public com.max.hbcommon.base.adapter.u<HotNewsInfoWrapperObj> M;

    @dl.d
    private List<HotNewsInfoWrapperObj> N = new ArrayList();
    private int O = -1;

    /* JADX INFO: compiled from: HotNewsStyleActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final Intent a(@dl.d Context context, int i10, @dl.e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10), str}, this, changeQuickRedirect, false, 26612, new Class[]{Context.class, Integer.TYPE, String.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(context, "context");
            Intent intent = new Intent(context, (Class<?>) HotNewsStyleActivity.class);
            intent.putExtra(HotNewsStyleActivity.R, i10);
            intent.putExtra("title", str);
            return intent;
        }
    }

    /* JADX INFO: compiled from: HotNewsStyleActivity.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<BBSLinkListResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26613, new Class[0], Void.TYPE).isSupported && HotNewsStyleActivity.this.isActive()) {
                super.onComplete();
                HotNewsStyleActivity.this.R1().f114485c.A(0);
                HotNewsStyleActivity.this.R1().f114485c.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 26614, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (HotNewsStyleActivity.this.isActive()) {
                super.onError(e10);
                HotNewsStyleActivity.O1(HotNewsStyleActivity.this);
                HotNewsStyleActivity.this.R1().f114485c.A(0);
                HotNewsStyleActivity.this.R1().f114485c.p(0);
            }
        }

        public void onNext(@dl.d Result<BBSLinkListResultObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 26615, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (HotNewsStyleActivity.this.isActive()) {
                super.onNext(result);
                HotNewsStyleActivity hotNewsStyleActivity = HotNewsStyleActivity.this;
                BBSLinkListResultObj result2 = result.getResult();
                kotlin.jvm.internal.f0.o(result2, "result.result");
                HotNewsStyleActivity.N1(hotNewsStyleActivity, result2);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26616, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSLinkListResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: HotNewsStyleActivity.kt */
    public static final class c implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 26617, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(it, "it");
            HotNewsStyleActivity.M1(HotNewsStyleActivity.this);
        }
    }

    public static final /* synthetic */ void M1(HotNewsStyleActivity hotNewsStyleActivity) {
        if (PatchProxy.proxy(new Object[]{hotNewsStyleActivity}, null, changeQuickRedirect, true, 26609, new Class[]{HotNewsStyleActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        hotNewsStyleActivity.Q1();
    }

    public static final /* synthetic */ void N1(HotNewsStyleActivity hotNewsStyleActivity, BBSLinkListResultObj bBSLinkListResultObj) {
        if (PatchProxy.proxy(new Object[]{hotNewsStyleActivity, bBSLinkListResultObj}, null, changeQuickRedirect, true, 26611, new Class[]{HotNewsStyleActivity.class, BBSLinkListResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        hotNewsStyleActivity.X1(bBSLinkListResultObj);
    }

    public static final /* synthetic */ void O1(HotNewsStyleActivity hotNewsStyleActivity) {
        if (PatchProxy.proxy(new Object[]{hotNewsStyleActivity}, null, changeQuickRedirect, true, 26610, new Class[]{HotNewsStyleActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        hotNewsStyleActivity.C1();
    }

    @SuppressLint({"AutoDispose"})
    private final void Q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26606, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Y4(this.O).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    @dl.d
    @xh.m
    public static final Intent T1(@dl.d Context context, int i10, @dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10), str}, null, changeQuickRedirect, true, 26608, new Class[]{Context.class, Integer.TYPE, String.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : P.a(context, i10, str);
    }

    private final void W1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26604, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Activity mContext = this.f66601b;
        kotlin.jvm.internal.f0.o(mContext, "mContext");
        Z1(new com.max.xiaoheihe.module.bbs.adapter.k(mContext, this.N, null, null, false));
        R1().f114484b.setLayoutManager(new LinearLayoutManager(this.f66601b));
        R1().f114484b.setAdapter(V1());
        RecyclerView recyclerView = R1().f114484b;
        kotlin.jvm.internal.f0.o(recyclerView, "binding.rv");
        new OneTimeValidExposureWatcher(this, recyclerView);
        R1().f114485c.setBackgroundResource(R.color.background_layer_2_color);
        R1().f114485c.V(false);
        R1().f114485c.b0(false);
        R1().f114485c.S(new c());
    }

    private final void X1(BBSLinkListResultObj bBSLinkListResultObj) {
        if (PatchProxy.proxy(new Object[]{bBSLinkListResultObj}, this, changeQuickRedirect, false, 26607, new Class[]{BBSLinkListResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        x1();
        this.N.clear();
        List<BBSLinkObj> links = bBSLinkListResultObj.getLinks();
        kotlin.jvm.internal.f0.o(links, "result.links");
        for (BBSLinkObj bBSLinkObj : links) {
            bBSLinkObj.setIndex(String.valueOf(this.N.size()));
            this.N.add(new HotNewsInfoWrapperObj(TYPE.RANK, bBSLinkObj));
        }
        V1().notifyDataSetChanged();
    }

    @dl.d
    public final p9 R1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26599, new Class[0], p9.class);
        if (patchProxyResultProxy.isSupported) {
            return (p9) patchProxyResultProxy.result;
        }
        p9 p9Var = this.L;
        if (p9Var != null) {
            return p9Var;
        }
        kotlin.jvm.internal.f0.S("binding");
        return null;
    }

    @dl.d
    public final com.max.hbcommon.base.adapter.u<HotNewsInfoWrapperObj> V1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26601, new Class[0], com.max.hbcommon.base.adapter.u.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.hbcommon.base.adapter.u) patchProxyResultProxy.result;
        }
        com.max.hbcommon.base.adapter.u<HotNewsInfoWrapperObj> uVar = this.M;
        if (uVar != null) {
            return uVar;
        }
        kotlin.jvm.internal.f0.S("mLinkAdapter");
        return null;
    }

    public final void Y1(@dl.d p9 p9Var) {
        if (PatchProxy.proxy(new Object[]{p9Var}, this, changeQuickRedirect, false, 26600, new Class[]{p9.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(p9Var, "<set-?>");
        this.L = p9Var;
    }

    public final void Z1(@dl.d com.max.hbcommon.base.adapter.u<HotNewsInfoWrapperObj> uVar) {
        if (PatchProxy.proxy(new Object[]{uVar}, this, changeQuickRedirect, false, 26602, new Class[]{com.max.hbcommon.base.adapter.u.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(uVar, "<set-?>");
        this.M = uVar;
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26603, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        p9 p9VarC = p9.c(this.f66602c);
        kotlin.jvm.internal.f0.o(p9VarC, "inflate(mInflater)");
        Y1(p9VarC);
        setContentView(R1().b());
        W1();
        Intent intent = getIntent();
        if (intent != null) {
            this.O = intent.getIntExtra(R, -1);
            TitleBar titleBar = this.f66616q;
            String stringExtra = intent.getStringExtra("title");
            if (stringExtra == null) {
                stringExtra = "热点";
            }
            titleBar.setTitle(stringExtra);
        }
        E1();
        Q1();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26605, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        Q1();
    }
}
