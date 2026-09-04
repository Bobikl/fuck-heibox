package com.max.xiaoheihe.module.video.action;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.compose.runtime.internal.o;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.max.hbutils.utils.n;
import com.max.video.ui.widget.f;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.wd0;
import dl.d;
import dl.e;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.flow.v;

/* JADX INFO: compiled from: VideoLikeAction.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class VideoLikeAction implements f {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f93689f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private wd0 f93690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final j<String> f93691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private final u<String> f93692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f93693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    private yh.a<b2> f93694e;

    /* JADX INFO: compiled from: VideoLikeAction.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f93695b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ VideoLikeAction f93696c;

        a(Context context, VideoLikeAction videoLikeAction) {
            this.f93695b = context;
            this.f93696c = videoLikeAction;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46366, new Class[]{View.class}, Void.TYPE).isSupported && i0.e(this.f93695b)) {
                this.f93696c.f().invoke();
            }
        }
    }

    public VideoLikeAction() {
        j<String> jVarA = v.a(null);
        this.f93691b = jVarA;
        this.f93692c = jVarA;
        this.f93694e = new yh.a<b2>() { // from class: com.max.xiaoheihe.module.video.action.VideoLikeAction$likeAction$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46367, new Class[0], Object.class);
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
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 46356, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        wd0 wd0VarC = wd0.c(LayoutInflater.from(context));
        f0.o(wd0VarC, "inflate(LayoutInflater.from(context))");
        this.f93690a = wd0VarC;
        LifecycleCoroutineScope lifecycleCoroutineScopeC = ye.a.f141789a.c(context);
        wd0 wd0Var = null;
        if (lifecycleCoroutineScopeC != null) {
            lifecycleCoroutineScopeC.f(new VideoLikeAction$initExtView$1(this, null));
        }
        wd0 wd0Var2 = this.f93690a;
        if (wd0Var2 == null) {
            f0.S("binding");
        } else {
            wd0Var = wd0Var2;
        }
        wd0Var.f117144b.setOnClickListener(new a(context, this));
    }

    @Override // com.max.video.ui.widget.f
    public void b() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46355, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        wd0 wd0Var = this.f93690a;
        if (wd0Var == null) {
            f0.S("binding");
            wd0Var = null;
        }
        wd0Var.b().setVisibility(8);
    }

    @Override // com.max.video.ui.widget.f
    @d
    public View c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46353, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        wd0 wd0Var = this.f93690a;
        if (wd0Var == null) {
            f0.S("binding");
            wd0Var = null;
        }
        RelativeLayout relativeLayoutB = wd0Var.b();
        f0.o(relativeLayoutB, "binding.root");
        return relativeLayoutB;
    }

    @Override // com.max.video.ui.widget.f
    public void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46354, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        wd0 wd0Var = this.f93690a;
        if (wd0Var == null) {
            f0.S("binding");
            wd0Var = null;
        }
        wd0Var.b().setVisibility(0);
    }

    @d
    public final yh.a<b2> f() {
        return this.f93694e;
    }

    @d
    public final u<String> g() {
        return this.f93692c;
    }

    public final int h() {
        return this.f93693d;
    }

    public final boolean i() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46359, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        wd0 wd0Var = this.f93690a;
        if (wd0Var == null) {
            f0.S("binding");
            wd0Var = null;
        }
        return wd0Var.f117144b.isChecked();
    }

    public final void j(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 46358, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        wd0 wd0Var = this.f93690a;
        if (wd0Var == null) {
            f0.S("binding");
            wd0Var = null;
        }
        wd0Var.f117144b.setChecked(z10);
    }

    public final void k(@d yh.a<b2> aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, 46352, new Class[]{yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(aVar, "<set-?>");
        this.f93694e = aVar;
    }

    public final void l(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 46357, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        int iQ = n.q(str);
        this.f93693d = iQ;
        this.f93691b.setValue(String.valueOf(iQ));
    }

    public final void m(int i10) {
        this.f93693d = i10;
    }
}
