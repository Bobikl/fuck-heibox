package com.max.xiaoheihe.view.uikit;

import android.view.View;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbuikit.bean.UiKitViewObj;
import com.max.hbuikit.utils.UiKitTemplateManager;
import com.max.hbutils.utils.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.y2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: UiKitTestActivity.kt */
/* JADX INFO: loaded from: classes13.dex */
@o(parameters = 0)
public final class UiKitTestActivity extends BaseActivity {
    public static final int M = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    public y2 L;

    /* JADX INFO: compiled from: UiKitTestActivity.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49739, new Class[]{View.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(String.valueOf(UiKitTestActivity.this.M1().f117716b.getText()))) {
                return;
            }
            UiKitTestActivity.this.M1().f117721g.setDataToCreate((UiKitViewObj) k.a(String.valueOf(UiKitTestActivity.this.M1().f117716b.getText()), UiKitViewObj.class));
        }
    }

    /* JADX INFO: compiled from: UiKitTestActivity.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49740, new Class[]{View.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(String.valueOf(UiKitTestActivity.this.M1().f117716b.getText()))) {
                return;
            }
            UiKitTestActivity.this.M1().f117721g.setDataToRefresh((UiKitViewObj) k.a(String.valueOf(UiKitTestActivity.this.M1().f117716b.getText()), UiKitViewObj.class));
        }
    }

    /* JADX INFO: compiled from: UiKitTestActivity.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49741, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            UiKitTestActivity.this.M1().f117716b.setText("");
        }
    }

    /* JADX INFO: compiled from: UiKitTestActivity.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49742, new Class[]{View.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(String.valueOf(UiKitTestActivity.this.M1().f117716b.getText()))) {
                return;
            }
            UiKitTemplateManager.f73221c.a().h((UiKitViewObj) k.a(String.valueOf(UiKitTestActivity.this.M1().f117716b.getText()), UiKitViewObj.class));
        }
    }

    @dl.d
    public final y2 M1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49736, new Class[0], y2.class);
        if (patchProxyResultProxy.isSupported) {
            return (y2) patchProxyResultProxy.result;
        }
        y2 y2Var = this.L;
        if (y2Var != null) {
            return y2Var;
        }
        f0.S("binding");
        return null;
    }

    public final void N1(@dl.d y2 y2Var) {
        if (PatchProxy.proxy(new Object[]{y2Var}, this, changeQuickRedirect, false, 49737, new Class[]{y2.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(y2Var, "<set-?>");
        this.L = y2Var;
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49738, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.k1();
        y2 y2VarC = y2.c(this.f66602c);
        f0.o(y2VarC, "inflate(mInflater)");
        N1(y2VarC);
        setContentView(M1().b());
        this.f66616q.setTitle("UI KIT 测试");
        M1().f117718d.setOnClickListener(new a());
        M1().f117719e.setOnClickListener(new b());
        M1().f117717c.setOnClickListener(new c());
        M1().f117720f.setOnClickListener(new d());
    }
}
