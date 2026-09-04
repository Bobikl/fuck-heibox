package com.max.xiaoheihe.module.account;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.bean.account.TipsStateObj;
import com.max.xiaoheihe.bean.account.tab.TabConfigObj;
import com.max.xiaoheihe.bean.account.tab.TabListObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.p2;

/* JADX INFO: compiled from: SwitchTestGroupActivity.kt */
/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class SwitchTestGroupActivity extends BaseActivity {

    @dl.d
    public static final a N = new a(null);
    public static final int O = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private p2 L;
    private boolean M;

    /* JADX INFO: compiled from: SwitchTestGroupActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final Intent a(@dl.e Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 24324, new Class[]{Context.class}, Intent.class);
            return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : new Intent(context, (Class<?>) SwitchTestGroupActivity.class);
        }
    }

    /* JADX INFO: compiled from: SwitchTestGroupActivity.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24325, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            SwitchTestGroupActivity.N1(SwitchTestGroupActivity.this);
        }
    }

    /* JADX INFO: compiled from: SwitchTestGroupActivity.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<TipsStateObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        public void onNext(@dl.d Result<TipsStateObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24326, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (SwitchTestGroupActivity.this.isActive()) {
                TabConfigObj tab_config = result.getResult().getTab_config();
                if (tab_config != null) {
                    TabListObj first_tab = tab_config.getFirst_tab();
                    if (first_tab != null) {
                        com.max.hbcache.c.C(com.max.hbcache.c.f66119e0, com.max.hbutils.utils.k.p(first_tab));
                        com.max.xiaoheihe.utils.c0.p(first_tab);
                    }
                    TabListObj second_tab = tab_config.getSecond_tab();
                    if (second_tab != null) {
                        com.max.hbcache.c.C(com.max.hbcache.c.f66121f0, com.max.hbutils.utils.k.p(second_tab));
                        com.max.xiaoheihe.utils.c0.q(second_tab);
                    }
                }
                SwitchTestGroupActivity.M1(SwitchTestGroupActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24327, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TipsStateObj>) obj);
        }
    }

    public static final /* synthetic */ void M1(SwitchTestGroupActivity switchTestGroupActivity) {
        if (PatchProxy.proxy(new Object[]{switchTestGroupActivity}, null, changeQuickRedirect, true, 24323, new Class[]{SwitchTestGroupActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        switchTestGroupActivity.Q1();
    }

    public static final /* synthetic */ void N1(SwitchTestGroupActivity switchTestGroupActivity) {
        if (PatchProxy.proxy(new Object[]{switchTestGroupActivity}, null, changeQuickRedirect, true, 24322, new Class[]{SwitchTestGroupActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        switchTestGroupActivity.R1();
    }

    private final void O1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24319, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        p2 p2Var = null;
        if (this.M) {
            p2 p2Var2 = this.L;
            if (p2Var2 == null) {
                kotlin.jvm.internal.f0.S("mBinding");
                p2Var2 = null;
            }
            p2Var2.f114402d.setText("旧版与新版首页的差别");
            p2 p2Var3 = this.L;
            if (p2Var3 == null) {
                kotlin.jvm.internal.f0.S("mBinding");
                p2Var3 = null;
            }
            p2Var3.f114401c.setText("·「首页」将不再使用新版定制化推荐算法，重新换回旧版推荐规则与样式。\n· APP底部标签栏的第二个标签由「热点」改为「社区」。");
            p2 p2Var4 = this.L;
            if (p2Var4 == null) {
                kotlin.jvm.internal.f0.S("mBinding");
            } else {
                p2Var = p2Var4;
            }
            p2Var.f114400b.setRightText("切换为旧版样式");
            return;
        }
        p2 p2Var5 = this.L;
        if (p2Var5 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            p2Var5 = null;
        }
        p2Var5.f114402d.setText("新版首页的更新详情");
        p2 p2Var6 = this.L;
        if (p2Var6 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            p2Var6 = null;
        }
        p2Var6.f114401c.setText("· 新版「首页」将使用新版推荐算法和样式，推荐内容将更注重您的个性化需求，推荐样式将更加丰富多彩。\n· 旧版「首页」将被替换至APP底部标签栏的第二个标签，并更名为「热点」。");
        p2 p2Var7 = this.L;
        if (p2Var7 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
        } else {
            p2Var = p2Var7;
        }
        p2Var.f114400b.setRightText("切换为新版样式");
    }

    private final void Q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24321, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbutils.utils.c.f("样式切换成功");
        Intent intent = new Intent(this.f66601b, (Class<?>) MainActivity.class);
        intent.setFlags(268468224);
        this.f66601b.startActivity(intent);
    }

    private final void R1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24320, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Q().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24318, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        p2 p2VarC = p2.c(this.f66602c);
        kotlin.jvm.internal.f0.o(p2VarC, "inflate(mInflater)");
        this.L = p2VarC;
        p2 p2Var = null;
        if (p2VarC == null) {
            kotlin.jvm.internal.f0.S("mBinding");
            p2VarC = null;
        }
        setContentView(p2VarC.b());
        this.M = kotlin.jvm.internal.f0.g("2", com.max.hbcache.c.o("style_switch", ""));
        this.f66616q.setTitle("样式切换");
        this.f66617r.setVisibility(8);
        O1();
        p2 p2Var2 = this.L;
        if (p2Var2 == null) {
            kotlin.jvm.internal.f0.S("mBinding");
        } else {
            p2Var = p2Var2;
        }
        p2Var.f114400b.setOnClickListener(new b());
    }
}
