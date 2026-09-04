package com.max.xiaoheihe.module.bbs.post_edit;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.e5;
import kotlin.b2;
import kotlin.c1;

/* JADX INFO: compiled from: LinkEditFragmentDialog.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class h extends com.max.hbcommon.base.c {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    public static final a f82972l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f82973m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private static final String f82974n = "is_editing";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private static final String f82975o = "edit_input_url";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private static final String f82976p = "edit_input_url_desc_text";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f82977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private String f82978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private String f82979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f82980h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private yh.p<? super String, ? super String, b2> f82981i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private yh.a<b2> f82982j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private e5 f82983k;

    /* JADX INFO: compiled from: LinkEditFragmentDialog.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final h a(boolean z10, @dl.e String str, @dl.e String str2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), str, str2}, this, changeQuickRedirect, false, 29664, new Class[]{Boolean.TYPE, String.class, String.class}, h.class);
            if (patchProxyResultProxy.isSupported) {
                return (h) patchProxyResultProxy.result;
            }
            h hVar = new h(null);
            hVar.setArguments(androidx.core.os.e.b(c1.a(h.f82974n, Boolean.valueOf(z10)), c1.a(h.f82975o, str), c1.a(h.f82976p, str2)));
            hVar.setStyle(0, R.style.FullScreenDialog);
            return hVar;
        }
    }

    /* JADX INFO: compiled from: LinkEditFragmentDialog.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            yh.p pVar;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29665, new Class[]{View.class}, Void.TYPE).isSupported || (pVar = h.this.f82981i) == null) {
                return;
            }
            e5 e5Var = h.this.f82983k;
            e5 e5Var2 = null;
            if (e5Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                e5Var = null;
            }
            String string = e5Var.f110038f.getText().toString();
            e5 e5Var3 = h.this.f82983k;
            if (e5Var3 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                e5Var2 = e5Var3;
            }
            pVar.invoke(string, e5Var2.f110037e.getText().toString());
        }
    }

    /* JADX INFO: compiled from: LinkEditFragmentDialog.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            yh.a aVar;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29666, new Class[]{View.class}, Void.TYPE).isSupported || (aVar = h.this.f82982j) == null) {
                return;
            }
            aVar.invoke();
        }
    }

    private h() {
    }

    public /* synthetic */ h(kotlin.jvm.internal.u uVar) {
        this();
    }

    private final void Q3() {
        Context context;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29659, new Class[0], Void.TYPE).isSupported || this.f82983k == null || (context = getContext()) == null) {
            return;
        }
        e5 e5Var = this.f82983k;
        e5 e5Var2 = null;
        if (e5Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            e5Var = null;
        }
        e5Var.f110036d.setBackground(com.max.hbutils.utils.q.o(context, R.color.divider_secondary_2_color, 12.0f));
        e5 e5Var3 = this.f82983k;
        if (e5Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            e5Var3 = null;
        }
        e5Var3.f110034b.setBackground(com.max.hbutils.utils.q.o(context, R.color.text_primary_1_color_alpha10, 5.0f));
        int color = context.getColor(R.color.black_start);
        int color2 = context.getColor(R.color.black_end);
        e5 e5Var4 = this.f82983k;
        if (e5Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            e5Var2 = e5Var4;
        }
        e5Var2.f110035c.setBackground(com.max.hbutils.utils.q.k(context, color, color2, GradientDrawable.Orientation.BL_TR, new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}));
    }

    private final void R3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29660, new Class[0], Void.TYPE).isSupported || this.f82983k == null) {
            return;
        }
        e5 e5Var = null;
        if (!com.max.hbcommon.utils.c.u(this.f82978f)) {
            e5 e5Var2 = this.f82983k;
            if (e5Var2 == null) {
                kotlin.jvm.internal.f0.S("binding");
                e5Var2 = null;
            }
            e5Var2.f110038f.setText(this.f82978f);
            e5 e5Var3 = this.f82983k;
            if (e5Var3 == null) {
                kotlin.jvm.internal.f0.S("binding");
                e5Var3 = null;
            }
            EditText editText = e5Var3.f110038f;
            String str = this.f82978f;
            editText.setSelection(str != null ? str.length() : 0);
        }
        if (com.max.hbcommon.utils.c.u(this.f82979g)) {
            return;
        }
        e5 e5Var4 = this.f82983k;
        if (e5Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            e5Var4 = null;
        }
        e5Var4.f110037e.setText(this.f82979g);
        e5 e5Var5 = this.f82983k;
        if (e5Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            e5Var = e5Var5;
        }
        EditText editText2 = e5Var.f110037e;
        String str2 = this.f82979g;
        editText2.setSelection(str2 != null ? str2.length() : 0);
    }

    @Override // com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    public final void S3(@dl.d yh.a<b2> onAction) {
        if (PatchProxy.proxy(new Object[]{onAction}, this, changeQuickRedirect, false, 29663, new Class[]{yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(onAction, "onAction");
        this.f82982j = onAction;
    }

    public final void T3(@dl.d yh.p<? super String, ? super String, b2> onAction) {
        if (PatchProxy.proxy(new Object[]{onAction}, this, changeQuickRedirect, false, 29662, new Class[]{yh.p.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(onAction, "onAction");
        this.f82981i = onAction;
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onCreate(@dl.e Bundle bundle) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 29657, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f82977e = arguments != null ? arguments.getBoolean(f82974n) : false;
        Bundle arguments2 = getArguments();
        this.f82978f = arguments2 != null ? arguments2.getString(f82975o) : null;
        Bundle arguments3 = getArguments();
        this.f82979g = arguments3 != null ? arguments3.getString(f82976p) : null;
        if (com.max.hbcommon.utils.c.u(this.f82978f) && com.max.hbcommon.utils.c.u(this.f82979g)) {
            z10 = false;
        }
        this.f82980h = z10;
    }

    @Override // androidx.fragment.app.Fragment
    @dl.d
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 29658, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(inflater, "inflater");
        e5 e5VarD = e5.d(inflater, viewGroup, false);
        kotlin.jvm.internal.f0.o(e5VarD, "inflate(inflater, container, false)");
        this.f82983k = e5VarD;
        Q3();
        R3();
        e5 e5Var = this.f82983k;
        e5 e5Var2 = null;
        if (e5Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            e5Var = null;
        }
        Button button = e5Var.f110035c;
        button.setText(this.f82977e ? "更新链接" : "确定");
        com.max.hbresource.a aVar = com.max.hbresource.a.f71893a;
        int i10 = com.max.hbresource.a.f71895c;
        button.setTypeface(aVar.a(i10));
        button.setOnClickListener(new b());
        e5 e5Var3 = this.f82983k;
        if (e5Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            e5Var3 = null;
        }
        Button button2 = e5Var3.f110034b;
        button2.setText(this.f82977e ? "删除链接" : "取消");
        button2.setTypeface(aVar.a(i10));
        button2.setOnClickListener(new c());
        e5 e5Var4 = this.f82983k;
        if (e5Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            e5Var4 = null;
        }
        e5Var4.f110039g.setTypeface(aVar.a(i10));
        e5 e5Var5 = this.f82983k;
        if (e5Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            e5Var2 = e5Var5;
        }
        FrameLayout frameLayoutB = e5Var2.b();
        kotlin.jvm.internal.f0.o(frameLayoutB, "binding.root");
        return frameLayoutB;
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Window window2;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29661, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setDimAmount(0.2f);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(32);
    }
}
