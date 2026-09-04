package com.max.xiaoheihe.module.littleprogram.fragment.dota2;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.compose.runtime.internal.o;
import androidx.core.view.n3;
import com.max.hbcustomview.EdgeTransparentView;
import com.max.hbminiprogram.NativeLittleProgramFragment;
import com.max.hbminiprogram.bean.TopicInfoObj;
import com.max.hbutils.utils.SystemWindowInsetExtensionsKt;
import com.max.hbutils.utils.t;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.account.GameBindingFragment;
import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.h9;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameOverviewBaseFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public abstract class d extends NativeLittleProgramFragment implements com.max.hbminiprogram.d, GameBindingFragment.n {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f89161s = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h9 f89162p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f89163q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f89164r = true;

    /* JADX INFO: compiled from: GameOverviewBaseFragment.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39388, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((com.max.hbcommon.base.d) d.this).mContext.onBackPressed();
        }
    }

    private final void L4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39385, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mTitleBar.setVisibility(8);
        this.mTitleBarDivider.setVisibility(8);
        if (O4()) {
            Activity mContext = this.mContext;
            f0.o(mContext, "mContext");
            ImageView imageView = J4().f111330b;
            f0.o(imageView, "baseBinding.ivBg");
            c.f(mContext, imageView);
        }
        if (this.f89163q) {
            J4().f111335g.setVisibility(8);
            return;
        }
        t.N(this.mContext.getWindow(), false);
        t.c(com.max.xiaoheihe.utils.d.E(R.color.transparent), J4().f111332d, null);
        if (this.f89164r) {
            J4().f111335g.setContentView(com.max.xiaoheihe.utils.d.s0(this.mContext));
        }
        J4().f111335g.a0();
        J4().f111335g.setBackgroundResource(R.color.transparent);
        J4().f111335g.setVisibility(0);
        J4().f111335g.getAppbarNavButtonView().setOnClickListener(new a());
        J4().f111335g.getAppbarNavButtonView().setColorFilter(com.max.xiaoheihe.utils.d.F(this.mContext, R.color.white));
        if (this.backIconInvisible) {
            J4().f111335g.getAppbarNavButtonView().setVisibility(8);
        } else {
            J4().f111335g.getAppbarNavButtonView().setVisibility(0);
        }
    }

    public void B1(@dl.e String str) {
    }

    @Override // com.max.xiaoheihe.module.account.GameBindingFragment.n
    public void C0(@dl.e String str, @dl.e Throwable th2) {
    }

    @dl.d
    public final h9 J4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39381, new Class[0], h9.class);
        if (patchProxyResultProxy.isSupported) {
            return (h9) patchProxyResultProxy.result;
        }
        h9 h9Var = this.f89162p;
        if (h9Var != null) {
            return h9Var;
        }
        f0.S("baseBinding");
        return null;
    }

    @dl.d
    public abstract View K4();

    public final boolean M4() {
        return this.f89163q;
    }

    public final boolean N4() {
        return this.f89164r;
    }

    public boolean O4() {
        return true;
    }

    public final void P4(@dl.d h9 h9Var) {
        if (PatchProxy.proxy(new Object[]{h9Var}, this, changeQuickRedirect, false, 39382, new Class[]{h9.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(h9Var, "<set-?>");
        this.f89162p = h9Var;
    }

    public final void Q4(boolean z10) {
        this.f89163q = z10;
    }

    public final void R4(boolean z10) {
        this.f89164r = z10;
    }

    public void S4() {
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void a4(@dl.e View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 39383, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.a4(view, z10);
        this.f89163q = this.mContext instanceof ChannelsDetailActivity;
        this.f89164r = d4();
        h9 h9VarC = h9.c(this.mInflater);
        f0.o(h9VarC, "inflate(mInflater)");
        P4(h9VarC);
        setContentView(J4());
        S4();
        L4();
        if (!this.f89163q) {
            EdgeTransparentView edgeTransparentView = J4().f111337i;
            f0.o(edgeTransparentView, "baseBinding.vgContentContainer");
            SystemWindowInsetExtensionsKt.c(edgeTransparentView, n3.m.i(), false, false, false, true, false, false, false, false, bb.c.b.A6, null);
        }
        J4().f111337i.addView(K4(), new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public boolean e4() {
        return false;
    }

    public boolean g2(@dl.e String str, @dl.e View view, @dl.e EditText editText) {
        return false;
    }

    @Override // com.max.xiaoheihe.module.account.GameBindingFragment.n
    public /* synthetic */ void m1(String str) {
        com.max.xiaoheihe.module.account.e.b(this, str);
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39384, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        if (this.f89164r) {
            this.mContext.getWindow().setNavigationBarColor(0);
        }
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39387, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStop();
        this.mContext.getWindow().setNavigationBarColor(-1);
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void r4(@dl.e TopicInfoObj topicInfoObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{topicInfoObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 39386, new Class[]{TopicInfoObj.class, Boolean.TYPE}, Void.TYPE).isSupported || topicInfoObj == null) {
            return;
        }
        l4(J4().f111335g, topicInfoObj, z10);
    }

    @Override // com.max.xiaoheihe.module.account.GameBindingFragment.n
    public /* synthetic */ void u1(String str) {
        com.max.xiaoheihe.module.account.e.c(this, str);
    }

    @Override // com.max.xiaoheihe.module.account.GameBindingFragment.n
    public /* synthetic */ void w2(String str, Throwable th2) {
        com.max.xiaoheihe.module.account.e.a(this, str, th2);
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment
    public boolean w4() {
        return false;
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment
    public boolean x4() {
        return false;
    }
}
