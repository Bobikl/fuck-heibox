package com.max.hbcommon.component;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.max.hbcommon.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: TopSheetDialog.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class z0 extends Dialog {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private Context f67995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private LayoutInflater f67996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private mb.n f67997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private View f67998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private String f67999f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(@dl.d Context context) {
        super(context, R.style.TopSheetDialog);
        kotlin.jvm.internal.f0.p(context, "context");
        this.f67995b = context;
        Object systemService = context.getSystemService("layout_inflater");
        kotlin.jvm.internal.f0.n(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.f67996c = (LayoutInflater) systemService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(z0 this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.d.Hg, new Class[]{z0.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(z0 this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.d.Ig, new Class[]{z0.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.dismiss();
    }

    @dl.d
    public final z0 e(@dl.d View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.d.Eg, new Class[]{View.class}, z0.class);
        if (patchProxyResultProxy.isSupported) {
            return (z0) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(view, "view");
        this.f67998e = view;
        return this;
    }

    @dl.d
    public final z0 f(@dl.d String title) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{title}, this, changeQuickRedirect, false, bb.c.d.Fg, new Class[]{String.class}, z0.class);
        if (patchProxyResultProxy.isSupported) {
            return (z0) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(title, "title");
        this.f67999f = title;
        return this;
    }

    @Override // android.app.Dialog
    public void onCreate(@dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.d.Dg, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        mb.n nVarC = mb.n.c(this.f67996c);
        kotlin.jvm.internal.f0.o(nVarC, "inflate(...)");
        this.f67997d = nVarC;
        com.max.hbutils.utils.t.N(getWindow(), true);
        mb.n nVar = this.f67997d;
        mb.n nVar2 = null;
        if (nVar == null) {
            kotlin.jvm.internal.f0.S("binding");
            nVar = null;
        }
        setContentView(nVar.b());
        mb.n nVar3 = this.f67997d;
        if (nVar3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            nVar3 = null;
        }
        nVar3.f131659e.setPadding(0, com.max.hbutils.utils.t.p(this.f67995b), 0, 0);
        mb.n nVar4 = this.f67997d;
        if (nVar4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            nVar4 = null;
        }
        nVar4.f131659e.setBackgroundDrawable(com.max.hbutils.utils.q.s(this.f67995b, R.color.divider_secondary_1_color, 8.0f));
        mb.n nVar5 = this.f67997d;
        if (nVar5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            nVar5 = null;
        }
        nVar5.f131660f.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z0.c(this.f67992b, view);
            }
        });
        mb.n nVar6 = this.f67997d;
        if (nVar6 == null) {
            kotlin.jvm.internal.f0.S("binding");
            nVar6 = null;
        }
        nVar6.f131657c.setText(this.f67999f);
        mb.n nVar7 = this.f67997d;
        if (nVar7 == null) {
            kotlin.jvm.internal.f0.S("binding");
            nVar7 = null;
        }
        nVar7.f131656b.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z0.d(this.f67994b, view);
            }
        });
        View view = this.f67998e;
        if (view != null) {
            mb.n nVar8 = this.f67997d;
            if (nVar8 == null) {
                kotlin.jvm.internal.f0.S("binding");
                nVar8 = null;
            }
            nVar8.f131658d.removeAllViews();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            mb.n nVar9 = this.f67997d;
            if (nVar9 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                nVar2 = nVar9;
            }
            nVar2.f131658d.addView(view, layoutParams);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Gg, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbutils.utils.t.h0(getWindow());
        super.show();
    }
}
