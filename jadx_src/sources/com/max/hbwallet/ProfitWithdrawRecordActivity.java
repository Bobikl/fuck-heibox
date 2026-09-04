package com.max.hbwallet;

import android.content.Context;
import android.content.Intent;
import com.max.hbcommon.base.BaseActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ProfitWithdrawRecordActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ProfitWithdrawRecordActivity extends BaseActivity {

    @dl.d
    public static final a L = new a(null);
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: ProfitWithdrawRecordActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final Intent a(@dl.d Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.l.f34532x1, new Class[]{Context.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(context, "context");
            return new Intent(context, (Class<?>) ProfitWithdrawRecordActivity.class);
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34510w1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_fragment_container);
        this.f66616q.setTitle("提现记录");
        this.f66617r.setVisibility(0);
        int i10 = R.id.fragment_container;
        findViewById(i10).setBackgroundDrawable(getResources().getDrawable(R.color.background_layer_2_color));
        if (((k1) getSupportFragmentManager().r0(i10)) == null) {
            getSupportFragmentManager().u().b(i10, k1.f74225g.a()).m();
        }
    }
}
