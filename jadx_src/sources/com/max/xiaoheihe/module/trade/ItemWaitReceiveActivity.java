package com.max.xiaoheihe.module.trade;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.BaseActivity;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ItemWaitReceiveActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class ItemWaitReceiveActivity extends BaseActivity {

    @dl.d
    public static final a L = new a(null);
    public static final int M = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: ItemWaitReceiveActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final Intent a(@dl.d Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 44618, new Class[]{Context.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            return new Intent(context, (Class<?>) ItemWaitReceiveActivity.class);
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44617, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_fragment_container);
        this.f66616q.setTitle("待收货");
        this.f66617r.setVisibility(0);
        findViewById(R.id.fragment_container).setBackgroundDrawable(getResources().getDrawable(R.color.white));
        if (((ItemWaitDeliverFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            getSupportFragmentManager().u().b(R.id.fragment_container, ItemWaitDeliverFragment.f92565m.a(true)).m();
        }
    }
}
