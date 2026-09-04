package com.max.xiaoheihe.module.video.action;

import af.l;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.gd0;
import df.yd0;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: VideoShareAction.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class VideoShareAction implements com.max.video.ui.widget.f, com.max.video.ui.widget.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f93738c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private yd0 f93739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private yh.a<b2> f93740b = new yh.a<b2>() { // from class: com.max.xiaoheihe.module.video.action.VideoShareAction$shareClickAction$1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ b2 invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46427, new Class[0], Object.class);
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

    /* JADX INFO: compiled from: VideoShareAction.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46419, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            VideoShareAction.this.f().invoke();
        }
    }

    /* JADX INFO: compiled from: VideoShareAction.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ lf.a f93742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f93743c;

        b(lf.a aVar, l lVar) {
            this.f93742b = aVar;
            this.f93743c = lVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46420, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            lf.a aVar = this.f93742b;
            if (aVar != null) {
                aVar.b();
            }
            this.f93743c.r();
        }
    }

    /* JADX INFO: compiled from: VideoShareAction.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ lf.a f93744b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f93745c;

        c(lf.a aVar, l lVar) {
            this.f93744b = aVar;
            this.f93745c = lVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46421, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            lf.a aVar = this.f93744b;
            if (aVar != null) {
                aVar.c();
            }
            this.f93745c.r();
        }
    }

    /* JADX INFO: compiled from: VideoShareAction.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ lf.a f93746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f93747c;

        d(lf.a aVar, l lVar) {
            this.f93746b = aVar;
            this.f93747c = lVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46422, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            lf.a aVar = this.f93746b;
            if (aVar != null) {
                aVar.d();
            }
            this.f93747c.r();
        }
    }

    /* JADX INFO: compiled from: VideoShareAction.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ lf.a f93748b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f93749c;

        e(lf.a aVar, l lVar) {
            this.f93748b = aVar;
            this.f93749c = lVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46423, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            lf.a aVar = this.f93748b;
            if (aVar != null) {
                aVar.f();
            }
            this.f93749c.r();
        }
    }

    /* JADX INFO: compiled from: VideoShareAction.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ lf.a f93750b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f93751c;

        f(lf.a aVar, l lVar) {
            this.f93750b = aVar;
            this.f93751c = lVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46424, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            lf.a aVar = this.f93750b;
            if (aVar != null) {
                aVar.a();
            }
            this.f93751c.r();
        }
    }

    /* JADX INFO: compiled from: VideoShareAction.kt */
    public static final class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ lf.a f93752b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f93753c;

        g(lf.a aVar, l lVar) {
            this.f93752b = aVar;
            this.f93753c = lVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46425, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            lf.a aVar = this.f93752b;
            if (aVar != null) {
                aVar.e();
            }
            this.f93753c.r();
        }
    }

    /* JADX INFO: compiled from: VideoShareAction.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ lf.a f93754b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f93755c;

        h(lf.a aVar, l lVar) {
            this.f93754b = aVar;
            this.f93755c = lVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46426, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            lf.a aVar = this.f93754b;
            if (aVar != null) {
                aVar.g();
            }
            this.f93755c.r();
        }
    }

    @Override // com.max.video.ui.widget.f
    public void a(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 46417, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        yd0 yd0VarC = yd0.c(LayoutInflater.from(context));
        f0.o(yd0VarC, "inflate(LayoutInflater.from(context))");
        this.f93739a = yd0VarC;
        if (yd0VarC == null) {
            f0.S("binding");
            yd0VarC = null;
        }
        yd0VarC.f117925c.setOnClickListener(new a());
    }

    @Override // com.max.video.ui.widget.f
    public void b() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46415, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        yd0 yd0Var = this.f93739a;
        if (yd0Var == null) {
            f0.S("binding");
            yd0Var = null;
        }
        yd0Var.b().setVisibility(8);
    }

    @Override // com.max.video.ui.widget.f
    @dl.d
    public View c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46413, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        yd0 yd0Var = this.f93739a;
        if (yd0Var == null) {
            f0.S("binding");
            yd0Var = null;
        }
        RelativeLayout relativeLayoutB = yd0Var.b();
        f0.o(relativeLayoutB, "binding.root");
        return relativeLayoutB;
    }

    @Override // com.max.video.ui.widget.f
    public void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46416, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        yd0 yd0Var = this.f93739a;
        if (yd0Var == null) {
            f0.S("binding");
            yd0Var = null;
        }
        yd0Var.b().setVisibility(0);
    }

    @Override // com.max.video.ui.widget.d
    @dl.d
    public View e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46414, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        yd0 yd0Var = this.f93739a;
        if (yd0Var == null) {
            f0.S("binding");
            yd0Var = null;
        }
        RelativeLayout relativeLayoutB = yd0Var.b();
        f0.o(relativeLayoutB, "binding.root");
        return relativeLayoutB;
    }

    @dl.d
    public final yh.a<b2> f() {
        return this.f93740b;
    }

    public final void g(@dl.d l menu, @dl.d gd0 binding, @dl.e lf.a aVar) {
        if (PatchProxy.proxy(new Object[]{menu, binding, aVar}, this, changeQuickRedirect, false, 46418, new Class[]{l.class, gd0.class, lf.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(menu, "menu");
        f0.p(binding, "binding");
        binding.f110947f.setOnClickListener(new b(aVar, menu));
        binding.f110949h.setOnClickListener(new c(aVar, menu));
        binding.f110948g.setOnClickListener(new d(aVar, menu));
        binding.f110946e.setOnClickListener(new e(aVar, menu));
        binding.f110944c.setOnClickListener(new f(aVar, menu));
        binding.f110945d.setOnClickListener(new g(aVar, menu));
        binding.f110943b.setOnClickListener(new h(aVar, menu));
    }

    public final void h(@dl.d yh.a<b2> aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, 46412, new Class[]{yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(aVar, "<set-?>");
        this.f93740b = aVar;
    }
}
