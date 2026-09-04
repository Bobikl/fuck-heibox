package com.max.xiaoheihe.module.bbs.post_edit;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.j1;
import androidx.core.view.n3;
import androidx.fragment.app.Fragment;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.t7;

/* JADX INFO: compiled from: CreateHashtagFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class b extends com.max.hbcommon.base.swipeback.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    public static final a f82931l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f82932m = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Context f82933j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private t7 f82934k;

    /* JADX INFO: compiled from: CreateHashtagFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final b a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29634, new Class[0], b.class);
            return patchProxyResultProxy.isSupported ? (b) patchProxyResultProxy.result : new b();
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.post_edit.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CreateHashtagFragment.kt */
    public static final class ViewOnClickListenerC0719b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        ViewOnClickListenerC0719b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29635, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            b.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: CreateHashtagFragment.kt */
    public static final class c implements androidx.core.view.z0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f82936b = new c();
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // androidx.core.view.z0
        @dl.d
        public final n3 a(@dl.d View v10, @dl.d n3 windowInsets) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{v10, windowInsets}, this, changeQuickRedirect, false, 29636, new Class[]{View.class, n3.class}, n3.class);
            if (patchProxyResultProxy.isSupported) {
                return (n3) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(v10, "v");
            kotlin.jvm.internal.f0.p(windowInsets, "windowInsets");
            androidx.core.graphics.h0 h0VarF = windowInsets.f(n3.m.d());
            kotlin.jvm.internal.f0.o(h0VarF, "windowInsets.getInsets(W…wInsetsCompat.Type.ime())");
            androidx.core.graphics.h0 h0VarF2 = windowInsets.f(n3.m.i());
            kotlin.jvm.internal.f0.o(h0VarF2, "windowInsets.getInsets(W…Compat.Type.systemBars())");
            v10.setPadding(v10.getPaddingLeft(), h0VarF2.f20743b, v10.getPaddingRight(), Math.max(h0VarF2.f20745d, h0VarF.f20745d));
            return windowInsets;
        }
    }

    /* JADX INFO: compiled from: CreateHashtagFragment.kt */
    public static final class d implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0059  */
        @Override // android.text.TextWatcher
        public void afterTextChanged(@dl.e Editable editable) {
            boolean z10;
            if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, 29637, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            t7 t7Var = b.this.f82934k;
            t7 t7Var2 = null;
            if (t7Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                t7Var = null;
            }
            TextView textView = t7Var.f115875e;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(editable != null ? editable.length() : 0);
            sb2.append("/20");
            textView.setText(sb2.toString());
            if (editable == null) {
                z10 = false;
            } else {
                if (editable.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                t7 t7Var3 = b.this.f82934k;
                if (t7Var3 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    t7Var3 = null;
                }
                t7Var3.f115874d.setEnabled(true);
                t7 t7Var4 = b.this.f82934k;
                if (t7Var4 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                } else {
                    t7Var2 = t7Var4;
                }
                t7Var2.f115874d.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
                return;
            }
            t7 t7Var5 = b.this.f82934k;
            if (t7Var5 == null) {
                kotlin.jvm.internal.f0.S("binding");
                t7Var5 = null;
            }
            t7Var5.f115874d.setEnabled(false);
            t7 t7Var6 = b.this.f82934k;
            if (t7Var6 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                t7Var2 = t7Var6;
            }
            t7Var2.f115874d.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@dl.e CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@dl.e CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX INFO: compiled from: CreateHashtagFragment.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29638, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            b.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: CreateHashtagFragment.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29639, new Class[]{View.class}, Void.TYPE).isSupported && (b.this.getParentFragment() instanceof com.max.xiaoheihe.module.bbs.post_edit.a)) {
                Fragment parentFragment = b.this.getParentFragment();
                kotlin.jvm.internal.f0.n(parentFragment, "null cannot be cast to non-null type com.max.xiaoheihe.module.bbs.post_edit.ChooseTopicHashFragment");
                com.max.xiaoheihe.module.bbs.post_edit.a aVar = (com.max.xiaoheihe.module.bbs.post_edit.a) parentFragment;
                t7 t7Var = b.this.f82934k;
                if (t7Var == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    t7Var = null;
                }
                if (aVar.K4(t7Var.f115872b.getText().toString())) {
                    b.this.dismiss();
                }
            }
        }
    }

    /* JADX INFO: compiled from: CreateHashtagFragment.kt */
    public static final class g implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29640, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            b.this.W3();
        }
    }

    public final void W3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29633, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        t7 t7Var = this.f82934k;
        if (t7Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            t7Var = null;
        }
        ViewUtils.s0(t7Var.f115872b);
    }

    @Override // androidx.fragment.app.Fragment
    @dl.d
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 29631, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(inflater, "inflater");
        t7 t7VarC = t7.c(inflater);
        kotlin.jvm.internal.f0.o(t7VarC, "inflate(inflater)");
        this.f82934k = t7VarC;
        if (t7VarC == null) {
            kotlin.jvm.internal.f0.S("binding");
            t7VarC = null;
        }
        FrameLayout frameLayoutB = t7VarC.b();
        kotlin.jvm.internal.f0.o(frameLayoutB, "binding.root");
        return frameLayoutB;
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 29632, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "view");
        super.onViewCreated(view, bundle);
        view.setOnClickListener(new ViewOnClickListenerC0719b());
        Context viewContext = getViewContext();
        kotlin.jvm.internal.f0.o(viewContext, "getViewContext()");
        this.f82933j = viewContext;
        j1.a2(view, c.f82936b);
        t7 t7Var = this.f82934k;
        t7 t7Var2 = null;
        if (t7Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            t7Var = null;
        }
        RelativeLayout relativeLayout = t7Var.f115877g;
        Context context = this.f82933j;
        if (context == null) {
            kotlin.jvm.internal.f0.S("mContext");
            context = null;
        }
        GradientDrawable gradientDrawableO = com.max.hbutils.utils.q.o(context, R.color.divider_secondary_2_color, 5.0f);
        Context context2 = this.f82933j;
        if (context2 == null) {
            kotlin.jvm.internal.f0.S("mContext");
            context2 = null;
        }
        relativeLayout.setBackground(com.max.hbutils.utils.q.M(gradientDrawableO, context2, R.color.divider_secondary_1_color, 0.5f));
        t7 t7Var3 = this.f82934k;
        if (t7Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            t7Var3 = null;
        }
        t7Var3.f115872b.addTextChangedListener(new d());
        t7 t7Var4 = this.f82934k;
        if (t7Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            t7Var4 = null;
        }
        t7Var4.f115873c.setOnClickListener(new e());
        t7 t7Var5 = this.f82934k;
        if (t7Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            t7Var5 = null;
        }
        t7Var5.f115874d.setOnClickListener(new f());
        t7 t7Var6 = this.f82934k;
        if (t7Var6 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            t7Var2 = t7Var6;
        }
        t7Var2.f115872b.postDelayed(new g(), 250L);
    }
}
