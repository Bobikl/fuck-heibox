package com.max.xiaoheihe.module.mall;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.max.hbcommon.base.BaseActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.g1;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: MallAgreementActivity.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class MallAgreementActivity extends BaseActivity {

    @dl.d
    public static final a M = new a(null);
    public static final int N = 8;
    public static final int O = 1;
    public static final int P = 2;

    @dl.d
    private static final String Q = "arg_title";

    @dl.d
    private static final String R = "arg_need_confirm";
    public static ChangeQuickRedirect changeQuickRedirect;
    private g1 L;

    /* JADX INFO: compiled from: MallAgreementActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final Intent a(@dl.e Context context, @dl.e String str, boolean z10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 39908, new Class[]{Context.class, String.class, Boolean.TYPE}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            Intent intent = new Intent(context, (Class<?>) MallAgreementActivity.class);
            intent.putExtra(MallAgreementActivity.Q, str);
            intent.putExtra(MallAgreementActivity.R, z10);
            return intent;
        }
    }

    /* JADX INFO: compiled from: MallAgreementActivity.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39909, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) MallAgreementActivity.this).f66601b.setResult(1);
            MallAgreementActivity.this.finish();
        }
    }

    /* JADX INFO: compiled from: MallAgreementActivity.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39910, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) MallAgreementActivity.this).f66601b.setResult(2);
            MallAgreementActivity.this.finish();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39907, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        g1 g1VarC = g1.c(this.f66602c);
        f0.o(g1VarC, "inflate(mInflater)");
        this.L = g1VarC;
        g1 g1Var = null;
        if (g1VarC == null) {
            f0.S("binding");
            g1VarC = null;
        }
        setContentView(g1VarC.b());
        String stringExtra = getIntent().getStringExtra(Q);
        boolean booleanExtra = getIntent().getBooleanExtra(R, false);
        this.f66616q.setTitle(stringExtra);
        this.f66617r.setVisibility(0);
        if (booleanExtra) {
            g1 g1Var2 = this.L;
            if (g1Var2 == null) {
                f0.S("binding");
                g1Var2 = null;
            }
            g1Var2.f110768c.setVisibility(0);
            g1 g1Var3 = this.L;
            if (g1Var3 == null) {
                f0.S("binding");
                g1Var3 = null;
            }
            g1Var3.f110768c.setLeftClickListener(new b());
            g1 g1Var4 = this.L;
            if (g1Var4 == null) {
                f0.S("binding");
            } else {
                g1Var = g1Var4;
            }
            g1Var.f110768c.setRightClickListener(new c());
        } else {
            g1 g1Var5 = this.L;
            if (g1Var5 == null) {
                f0.S("binding");
            } else {
                g1Var = g1Var5;
            }
            g1Var.f110768c.setVisibility(8);
        }
        if (((WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            getSupportFragmentManager().u().b(R.id.fragment_container, WebviewFragment.u7(lb.a.f131048t4)).m();
        }
    }
}
