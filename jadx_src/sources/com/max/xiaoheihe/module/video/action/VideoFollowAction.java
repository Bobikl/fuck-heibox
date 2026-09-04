package com.max.xiaoheihe.module.video.action;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.o;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.max.hbimage.b;
import com.max.video.ui.widget.f;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.vd0;
import dl.d;
import dl.e;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.flow.v;
import yh.a;

/* JADX INFO: compiled from: VideoFollowAction.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class VideoFollowAction implements f {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f93667h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private final j<Boolean> f93668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final u<Boolean> f93669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private BBSUserInfoObj f93670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private String f93671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    private a<b2> f93672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private vd0 f93673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Handler f93674g;

    public VideoFollowAction() {
        j<Boolean> jVarA = v.a(Boolean.FALSE);
        this.f93668a = jVarA;
        this.f93669b = jVarA;
        this.f93672e = new a<b2>() { // from class: com.max.xiaoheihe.module.video.action.VideoFollowAction$followAction$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46337, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        };
    }

    @Override // com.max.video.ui.widget.f
    public void a(@d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 46334, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        this.f93674g = new Handler(context.getMainLooper());
        vd0 vd0VarC = vd0.c(LayoutInflater.from(context));
        f0.o(vd0VarC, "inflate(LayoutInflater.from(context))");
        this.f93673f = vd0VarC;
        LifecycleCoroutineScope lifecycleCoroutineScopeC = ye.a.f141789a.c(context);
        if (lifecycleCoroutineScopeC != null) {
            lifecycleCoroutineScopeC.f(new VideoFollowAction$initExtView$1(this, context, null));
        }
    }

    @Override // com.max.video.ui.widget.f
    public void b() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46332, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        vd0 vd0Var = this.f93673f;
        if (vd0Var == null) {
            f0.S("binding");
            vd0Var = null;
        }
        vd0Var.b().setVisibility(8);
    }

    @Override // com.max.video.ui.widget.f
    @d
    public View c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46331, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        vd0 vd0Var = this.f93673f;
        if (vd0Var == null) {
            f0.S("binding");
            vd0Var = null;
        }
        LinearLayout linearLayoutB = vd0Var.b();
        f0.o(linearLayoutB, "binding.root");
        return linearLayoutB;
    }

    @Override // com.max.video.ui.widget.f
    public void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46333, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        vd0 vd0Var = this.f93673f;
        if (vd0Var == null) {
            f0.S("binding");
            vd0Var = null;
        }
        vd0Var.b().setVisibility(0);
    }

    @e
    public final BBSUserInfoObj h() {
        return this.f93670c;
    }

    @d
    public final a<b2> i() {
        return this.f93672e;
    }

    @d
    public final u<Boolean> j() {
        return this.f93669b;
    }

    @e
    public final String k() {
        return this.f93671d;
    }

    public final void l(@e BBSUserInfoObj bBSUserInfoObj) {
        this.f93670c = bBSUserInfoObj;
    }

    public final void m(@d a<b2> aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, 46330, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(aVar, "<set-?>");
        this.f93672e = aVar;
    }

    public final void n(@e String str) {
        this.f93671d = str;
    }

    public final void o(@d Context context, @e BBSUserInfoObj bBSUserInfoObj) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{context, bBSUserInfoObj}, this, changeQuickRedirect, false, 46336, new Class[]{Context.class, BBSUserInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        this.f93670c = bBSUserInfoObj;
        vd0 vd0Var = null;
        this.f93671d = bBSUserInfoObj != null ? bBSUserInfoObj.getUserid() : null;
        j<Boolean> jVar = this.f93668a;
        if (!f0.g(bBSUserInfoObj != null ? bBSUserInfoObj.getFollow_status() : null, "1")) {
            if (!f0.g(bBSUserInfoObj != null ? bBSUserInfoObj.getFollow_status() : null, "3")) {
                z10 = false;
            }
        }
        jVar.setValue(Boolean.valueOf(z10));
        if (bBSUserInfoObj != null && bBSUserInfoObj.getAvartar() != null) {
            String avartar = bBSUserInfoObj.getAvartar();
            vd0 vd0Var2 = this.f93673f;
            if (vd0Var2 == null) {
                f0.S("binding");
                vd0Var2 = null;
            }
            b.d0(avartar, vd0Var2.f116821b, ye.b.f141790a.a(context, 12.0f));
        }
        if (bBSUserInfoObj != null) {
            vd0 vd0Var3 = this.f93673f;
            if (vd0Var3 == null) {
                f0.S("binding");
            } else {
                vd0Var = vd0Var3;
            }
            vd0Var.f116824e.setVisibility(0);
        }
    }

    public final void p(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 46335, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f93668a.setValue(Boolean.valueOf(z10));
    }
}
