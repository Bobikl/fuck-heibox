package com.max.xiaoheihe.view.richtext;

import android.view.View;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.utils.c;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.bean.rich.RichStackModelObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.v1;
import dl.d;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RichTextTestActivity.kt */
/* JADX INFO: loaded from: classes13.dex */
@o(parameters = 0)
public final class RichTextTestActivity extends BaseActivity {
    public static final int M = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    public v1 L;

    /* JADX INFO: compiled from: RichTextTestActivity.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49651, new Class[]{View.class}, Void.TYPE).isSupported || c.u(String.valueOf(RichTextTestActivity.this.M1().f116566b.getText()))) {
                return;
            }
            try {
                RichTextTestActivity.this.M1().f116569e.setRichStackData((RichStackModelObj) k.a(String.valueOf(RichTextTestActivity.this.M1().f116566b.getText()), RichStackModelObj.class));
            } catch (Throwable th2) {
                com.max.hbutils.utils.c.f("错误\n" + th2.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: RichTextTestActivity.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49652, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            RichTextTestActivity.this.M1().f116566b.setText("");
        }
    }

    @d
    public final v1 M1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49648, new Class[0], v1.class);
        if (patchProxyResultProxy.isSupported) {
            return (v1) patchProxyResultProxy.result;
        }
        v1 v1Var = this.L;
        if (v1Var != null) {
            return v1Var;
        }
        f0.S("binding");
        return null;
    }

    public final void N1(@d v1 v1Var) {
        if (PatchProxy.proxy(new Object[]{v1Var}, this, changeQuickRedirect, false, 49649, new Class[]{v1.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(v1Var, "<set-?>");
        this.L = v1Var;
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49650, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.k1();
        v1 v1VarC = v1.c(this.f66602c);
        f0.o(v1VarC, "inflate(mInflater)");
        N1(v1VarC);
        setContentView(M1().b());
        this.f66616q.setTitle("富文本测试");
        M1().f116568d.setOnClickListener(new a());
        M1().f116567c.setOnClickListener(new b());
    }
}
