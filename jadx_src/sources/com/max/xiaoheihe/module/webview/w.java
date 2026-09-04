package com.max.xiaoheihe.module.webview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.zb;

/* JADX INFO: compiled from: WebHostNoticeFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class w extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final a f94811e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f94812f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final String f94813g = "ARG_URL";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zb f94814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f94815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f94816d;

    /* JADX INFO: compiled from: WebHostNoticeFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47135, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : w.f94813g;
        }

        @dl.d
        @xh.m
        public final w b(@dl.d String url) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{url}, this, changeQuickRedirect, false, 47136, new Class[]{String.class}, w.class);
            if (patchProxyResultProxy.isSupported) {
                return (w) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(url, "url");
            w wVar = new w();
            Bundle bundle = new Bundle();
            bundle.putString(w.f94811e.a(), url);
            wVar.setArguments(bundle);
            return wVar;
        }
    }

    /* JADX INFO: compiled from: WebHostNoticeFragment.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 47137, new Class[]{View.class}, Void.TYPE).isSupported && (((com.max.hbcommon.base.d) w.this).mContext instanceof WebActionActivity)) {
                Activity activity = ((com.max.hbcommon.base.d) w.this).mContext;
                kotlin.jvm.internal.f0.n(activity, "null cannot be cast to non-null type com.max.xiaoheihe.module.webview.WebActionActivity");
                ((WebActionActivity) activity).I3();
            }
        }
    }

    private final void Q3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47133, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mTitleBar.a0();
        this.mTitleBarDivider.setVisibility(0);
        bb.d.d(N3().f118298c, 0);
        com.max.xiaoheihe.utils.e0.a(N3().f118298c, P3(), null, true, 1);
        N3().f118297b.setBackgroundDrawable(com.max.hbutils.utils.q.M(com.max.hbutils.utils.q.o(this.mContext, R.color.transparent, 2.0f), getContext(), R.color.click_blue, 1.0f));
        N3().f118297b.setOnClickListener(new b());
    }

    @dl.d
    @xh.m
    public static final w R3(@dl.d String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 47134, new Class[]{String.class}, w.class);
        return patchProxyResultProxy.isSupported ? (w) patchProxyResultProxy.result : f94811e.b(str);
    }

    @dl.d
    public final zb N3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47128, new Class[0], zb.class);
        if (patchProxyResultProxy.isSupported) {
            return (zb) patchProxyResultProxy.result;
        }
        zb zbVar = this.f94814b;
        if (zbVar != null) {
            return zbVar;
        }
        kotlin.jvm.internal.f0.S("binding");
        return null;
    }

    public final boolean O3() {
        return this.f94816d;
    }

    @dl.d
    public final String P3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47130, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String str = this.f94815c;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.f0.S("mUrl");
        return null;
    }

    public final void S3(@dl.d zb zbVar) {
        if (PatchProxy.proxy(new Object[]{zbVar}, this, changeQuickRedirect, false, 47129, new Class[]{zb.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(zbVar, "<set-?>");
        this.f94814b = zbVar;
    }

    public final void T3(boolean z10) {
        this.f94816d = z10;
    }

    public final void U3(@dl.d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47131, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(str, "<set-?>");
        this.f94815c = str;
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 47132, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        zb zbVarC = zb.c(getLayoutInflater());
        kotlin.jvm.internal.f0.o(zbVarC, "inflate(layoutInflater)");
        S3(zbVarC);
        setContentView(N3());
        String string = requireArguments().getString(f94813g);
        kotlin.jvm.internal.f0.m(string);
        U3(string);
        Q3();
    }
}
