package com.max.hbpermission;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.d1;
import androidx.annotation.e1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: compiled from: RationaleDialogImpl.java */
/* JADX INFO: loaded from: classes11.dex */
public class p extends com.permissionx.guolindev.dialog.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f71656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CharSequence f71657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CharSequence f71658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SpannableStringBuilder f71659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f71660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<String> f71661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f71662h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TextView f71663i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f71664j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private DialogInterface.OnClickListener f71665k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private TextView f71666l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private CharSequence f71667m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private DialogInterface.OnClickListener f71668n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private TextView f71669o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private TextView f71670p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private View f71671q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f71672r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f71673s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f71674t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f71675u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private LayoutInflater f71676v;

    /* JADX INFO: compiled from: RationaleDialogImpl.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.k.E, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            p.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: RationaleDialogImpl.java */
    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.k.F, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            p.this.f71665k.onClick(p.this, -1);
        }
    }

    /* JADX INFO: compiled from: RationaleDialogImpl.java */
    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.k.G, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            p.this.f71668n.onClick(p.this, -2);
        }
    }

    /* JADX INFO: compiled from: RationaleDialogImpl.java */
    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.k.H, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            p.this.f71665k.onClick(p.this, -1);
        }
    }

    /* JADX INFO: compiled from: RationaleDialogImpl.java */
    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.k.I, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            p.this.f71668n.onClick(p.this, -2);
        }
    }

    /* JADX INFO: compiled from: RationaleDialogImpl.java */
    public static class f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f71682a;

        public f(Context context) {
            this.f71682a = new g(context);
        }

        public p a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.N, new Class[0], p.class);
            if (patchProxyResultProxy.isSupported) {
                return (p) patchProxyResultProxy.result;
            }
            p pVar = this.f71682a.f71692j ? new p(this.f71682a.f71683a, R.style.lib_permission_FullScreenDialog) : new p(this.f71682a.f71683a, R.style.lib_permission_HeyBoxDialog);
            pVar.t(this.f71682a.f71692j);
            pVar.w(this.f71682a.f71693k);
            this.f71682a.a(pVar);
            pVar.setCancelable(this.f71682a.f71691i);
            if (this.f71682a.f71691i) {
                pVar.setCanceledOnTouchOutside(true);
            }
            pVar.setOnCancelListener(this.f71682a.f71694l);
            pVar.setOnDismissListener(this.f71682a.f71695m);
            DialogInterface.OnKeyListener onKeyListener = this.f71682a.f71696n;
            if (onKeyListener != null) {
                pVar.setOnKeyListener(onKeyListener);
            }
            return pVar;
        }

        public Context b() {
            return this.f71682a.f71683a;
        }

        public f c(boolean z10) {
            this.f71682a.f71691i = z10;
            return this;
        }

        public f d(@d1 int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.K, new Class[]{Integer.TYPE}, f.class);
            if (patchProxyResultProxy.isSupported) {
                return (f) patchProxyResultProxy.result;
            }
            g gVar = this.f71682a;
            gVar.f71685c = gVar.f71683a.getText(i10);
            return this;
        }

        public f e(CharSequence charSequence) {
            this.f71682a.f71685c = charSequence;
            return this;
        }

        public f f(SpannableStringBuilder spannableStringBuilder) {
            this.f71682a.f71686d = spannableStringBuilder;
            return this;
        }

        public f g(@d1 int i10, DialogInterface.OnClickListener onClickListener) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), onClickListener}, this, changeQuickRedirect, false, bb.c.k.M, new Class[]{Integer.TYPE, DialogInterface.OnClickListener.class}, f.class);
            if (patchProxyResultProxy.isSupported) {
                return (f) patchProxyResultProxy.result;
            }
            g gVar = this.f71682a;
            gVar.f71688f = gVar.f71683a.getText(i10);
            this.f71682a.f71690h = onClickListener;
            return this;
        }

        public f h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            g gVar = this.f71682a;
            gVar.f71688f = charSequence;
            gVar.f71690h = onClickListener;
            return this;
        }

        public f i(DialogInterface.OnCancelListener onCancelListener) {
            this.f71682a.f71694l = onCancelListener;
            return this;
        }

        public f j(DialogInterface.OnDismissListener onDismissListener) {
            this.f71682a.f71695m = onDismissListener;
            return this;
        }

        public f k(DialogInterface.OnKeyListener onKeyListener) {
            this.f71682a.f71696n = onKeyListener;
            return this;
        }

        public f l(List<String> list) {
            this.f71682a.f71698p = list;
            return this;
        }

        public f m(@d1 int i10, DialogInterface.OnClickListener onClickListener) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), onClickListener}, this, changeQuickRedirect, false, bb.c.k.L, new Class[]{Integer.TYPE, DialogInterface.OnClickListener.class}, f.class);
            if (patchProxyResultProxy.isSupported) {
                return (f) patchProxyResultProxy.result;
            }
            g gVar = this.f71682a;
            gVar.f71687e = gVar.f71683a.getText(i10);
            this.f71682a.f71689g = onClickListener;
            return this;
        }

        public f n(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            g gVar = this.f71682a;
            gVar.f71687e = charSequence;
            gVar.f71689g = onClickListener;
            return this;
        }

        public f o(boolean z10) {
            this.f71682a.f71701s = z10;
            return this;
        }

        public f p(@d1 int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.J, new Class[]{Integer.TYPE}, f.class);
            if (patchProxyResultProxy.isSupported) {
                return (f) patchProxyResultProxy.result;
            }
            g gVar = this.f71682a;
            gVar.f71684b = gVar.f71683a.getText(i10);
            return this;
        }

        public f q(CharSequence charSequence) {
            this.f71682a.f71684b = charSequence;
            return this;
        }

        public f r(boolean z10) {
            this.f71682a.f71692j = z10;
            return this;
        }

        public f s(int i10) {
            g gVar = this.f71682a;
            gVar.f71700r = null;
            gVar.f71699q = i10;
            return this;
        }

        public f t(View view) {
            g gVar = this.f71682a;
            gVar.f71700r = view;
            gVar.f71699q = 0;
            return this;
        }

        public f u(int i10) {
            this.f71682a.f71693k = i10;
            return this;
        }

        public p v() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.O, new Class[0], p.class);
            if (patchProxyResultProxy.isSupported) {
                return (p) patchProxyResultProxy.result;
            }
            p pVarA = a();
            pVarA.show();
            return pVarA;
        }
    }

    /* JADX INFO: compiled from: RationaleDialogImpl.java */
    public static class g {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f71683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CharSequence f71684b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f71685c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public SpannableStringBuilder f71686d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence f71687e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f71688f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public DialogInterface.OnClickListener f71689g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public DialogInterface.OnClickListener f71690h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f71691i = true;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f71692j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f71693k = R.style.lib_permission_HeyBoxDialogAnimation;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public DialogInterface.OnCancelListener f71694l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public DialogInterface.OnDismissListener f71695m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public DialogInterface.OnKeyListener f71696n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public DialogInterface.OnClickListener f71697o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public List<String> f71698p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f71699q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public View f71700r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f71701s;

        public g(Context context) {
            this.f71683a = context;
        }

        public void a(p pVar) {
            if (PatchProxy.proxy(new Object[]{pVar}, this, changeQuickRedirect, false, bb.c.k.P, new Class[]{p.class}, Void.TYPE).isSupported) {
                return;
            }
            CharSequence charSequence = this.f71684b;
            if (charSequence != null) {
                pVar.setTitle(charSequence);
            }
            CharSequence charSequence2 = this.f71685c;
            if (charSequence2 != null) {
                pVar.j(charSequence2);
            }
            SpannableStringBuilder spannableStringBuilder = this.f71686d;
            if (spannableStringBuilder != null) {
                pVar.l(spannableStringBuilder);
            }
            CharSequence charSequence3 = this.f71687e;
            if (charSequence3 != null) {
                pVar.q(charSequence3, this.f71689g);
            }
            CharSequence charSequence4 = this.f71688f;
            if (charSequence4 != null) {
                pVar.n(charSequence4, this.f71690h);
            }
            View view = this.f71700r;
            if (view != null) {
                pVar.v(view);
            } else {
                int i10 = this.f71699q;
                if (i10 != 0) {
                    pVar.u(i10);
                }
            }
            List<String> list = this.f71698p;
            if (list != null) {
                pVar.o(list);
            }
            pVar.r(this.f71701s);
        }
    }

    public p(@n0 Context context) {
        super(context);
        this.f71674t = 17;
        this.f71675u = R.style.lib_permission_HeyBoxDialogAnimation;
        this.f71656b = context;
        i();
    }

    public p(@n0 Context context, @e1 int i10) {
        super(context, i10);
        this.f71674t = 17;
        this.f71675u = R.style.lib_permission_HeyBoxDialogAnimation;
        this.f71656b = context;
        i();
    }

    public p(@n0 Context context, boolean z10, @p0 DialogInterface.OnCancelListener onCancelListener) {
        super(context, z10, onCancelListener);
        this.f71674t = 17;
        this.f71675u = R.style.lib_permission_HeyBoxDialogAnimation;
        this.f71656b = context;
        i();
    }

    private int f(Context context, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Float(f10)}, this, changeQuickRedirect, false, bb.c.k.D, new Class[]{Context.class, Float.TYPE}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void i() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33811r, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f71676v = (LayoutInflater) this.f71656b.getSystemService("layout_inflater");
    }

    private void s(Window window) {
        if (PatchProxy.proxy(new Object[]{window}, this, changeQuickRedirect, false, bb.c.k.f33877u, new Class[]{Window.class}, Void.TYPE).isSupported) {
            return;
        }
        window.setStatusBarColor(0);
        window.getDecorView().setSystemUiVisibility(1280);
    }

    @Override // com.permissionx.guolindev.dialog.c
    @p0
    public View a() {
        return this.f71666l;
    }

    @Override // com.permissionx.guolindev.dialog.c
    @n0
    public List<String> b() {
        return this.f71661g;
    }

    @Override // com.permissionx.guolindev.dialog.c
    @n0
    public View c() {
        return this.f71663i;
    }

    public View g() {
        return this.f71671q;
    }

    public TextView h() {
        return this.f71670p;
    }

    public void j(CharSequence charSequence) {
        if (PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, bb.c.k.f33921w, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f71670p;
        if (textView != null) {
            textView.setText(charSequence);
        } else {
            this.f71658d = charSequence;
        }
    }

    public void k(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.f33965y, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f71674t = i10;
        TextView textView = this.f71670p;
        if (textView != null) {
            textView.setGravity(i10);
        }
    }

    public void l(SpannableStringBuilder spannableStringBuilder) {
        if (PatchProxy.proxy(new Object[]{spannableStringBuilder}, this, changeQuickRedirect, false, bb.c.k.f33943x, new Class[]{SpannableStringBuilder.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f71670p;
        if (textView != null) {
            textView.setText(spannableStringBuilder);
        } else {
            this.f71659e = spannableStringBuilder;
        }
    }

    public void m(CharSequence charSequence) {
        if (PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, bb.c.k.B, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
            return;
        }
        n(charSequence, null);
    }

    public void n(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{charSequence, onClickListener}, this, changeQuickRedirect, false, bb.c.k.C, new Class[]{CharSequence.class, DialogInterface.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f71666l;
        if (textView == null) {
            this.f71667m = charSequence;
            this.f71668n = onClickListener;
            return;
        }
        textView.setText(charSequence);
        if (this.f71668n != null) {
            this.f71666l.setOnClickListener(new e());
        } else {
            this.f71666l.setOnClickListener(null);
        }
    }

    public void o(List<String> list) {
        this.f71661g = list;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i10;
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.k.f33833s, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        View viewInflate = null;
        RelativeLayout relativeLayout = (RelativeLayout) this.f71676v.inflate(R.layout.lib_permission_dialog_rationale, (ViewGroup) null);
        this.f71669o = (TextView) relativeLayout.findViewById(R.id.tv_title);
        this.f71670p = (TextView) relativeLayout.findViewById(R.id.tv_message);
        View viewFindViewById = relativeLayout.findViewById(R.id.iv_close);
        View viewFindViewById2 = relativeLayout.findViewById(R.id.cv_bg);
        this.f71671q = relativeLayout.findViewById(R.id.vg_bg);
        View viewFindViewById3 = relativeLayout.findViewById(R.id.vg_button_panel);
        View viewFindViewById4 = relativeLayout.findViewById(R.id.v_btn_divider);
        this.f71663i = (TextView) relativeLayout.findViewById(R.id.tv_positive_button);
        this.f71666l = (TextView) relativeLayout.findViewById(R.id.tv_negative_button);
        boolean z10 = !TextUtils.isEmpty(this.f71657c);
        boolean z11 = (TextUtils.isEmpty(this.f71658d) && this.f71659e == null) ? false : true;
        if (z10) {
            this.f71669o.setVisibility(0);
            this.f71669o.setText(this.f71657c);
        } else {
            this.f71669o.setVisibility(8);
        }
        if (z11) {
            this.f71670p.setVisibility(0);
            if (TextUtils.isEmpty(this.f71658d)) {
                SpannableStringBuilder spannableStringBuilder = this.f71659e;
                if (spannableStringBuilder != null) {
                    this.f71670p.setText(spannableStringBuilder);
                }
            } else {
                this.f71670p.setText(this.f71658d);
            }
            this.f71670p.setGravity(this.f71674t);
        } else {
            this.f71670p.setVisibility(8);
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f71669o.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f71670p.getLayoutParams();
        if (z10 && !z11) {
            layoutParams.topMargin = f(this.f71656b, 26.0f);
            layoutParams.bottomMargin = f(this.f71656b, 40.0f);
            this.f71669o.setLayoutParams(layoutParams);
        } else if (z11 && !z10) {
            layoutParams2.topMargin = f(this.f71656b, 26.0f);
            layoutParams2.bottomMargin = f(this.f71656b, 40.0f);
            this.f71669o.setLayoutParams(layoutParams2);
        }
        viewFindViewById.setVisibility(this.f71672r ? 0 : 8);
        viewFindViewById.setOnClickListener(new a());
        if (TextUtils.isEmpty(this.f71664j)) {
            this.f71663i.setVisibility(8);
            i10 = 0;
        } else {
            this.f71663i.setVisibility(0);
            this.f71663i.setText(this.f71664j);
            if (this.f71665k != null) {
                this.f71663i.setOnClickListener(new b());
            } else {
                this.f71663i.setOnClickListener(null);
            }
            i10 = 1;
        }
        if (TextUtils.isEmpty(this.f71667m)) {
            this.f71666l.setVisibility(8);
        } else {
            i10++;
            this.f71666l.setVisibility(0);
            this.f71666l.setText(this.f71667m);
            if (this.f71668n != null) {
                this.f71666l.setOnClickListener(new c());
            } else {
                this.f71666l.setOnClickListener(null);
            }
        }
        viewFindViewById3.setVisibility(i10 > 0 ? 0 : 8);
        viewFindViewById4.setVisibility(i10 > 1 ? 0 : 8);
        View view = this.f71660f;
        if (view != null) {
            viewInflate = view;
        } else {
            int i11 = this.f71662h;
            if (i11 != 0) {
                viewInflate = this.f71676v.inflate(i11, (ViewGroup) relativeLayout, false);
            }
        }
        if (viewInflate != null) {
            relativeLayout.removeAllViews();
            relativeLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        }
        StringBuilder sb2 = new StringBuilder();
        CharSequence charSequence = this.f71657c;
        if (charSequence != null) {
            sb2.append(charSequence.toString());
        }
        CharSequence charSequence2 = this.f71658d;
        if (charSequence2 != null) {
            sb2.append(charSequence2.toString());
        }
        viewFindViewById2.setTag(R.id.lib_permission_auto_track_tag_view_dialog_root_view, sb2.toString());
        setContentView(relativeLayout);
        Window window = getWindow();
        if (window != null) {
            window.getAttributes().windowAnimations = this.f71675u;
        }
        if (this.f71673s || window == null) {
            return;
        }
        window.setGravity(17);
        window.getDecorView().setPadding(0, 0, 0, 0);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
    }

    public void p(CharSequence charSequence) {
        if (PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, bb.c.k.f33987z, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
            return;
        }
        q(charSequence, null);
    }

    public void q(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{charSequence, onClickListener}, this, changeQuickRedirect, false, bb.c.k.A, new Class[]{CharSequence.class, DialogInterface.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f71663i;
        if (textView == null) {
            this.f71664j = charSequence;
            this.f71665k = onClickListener;
            return;
        }
        textView.setText(charSequence);
        if (this.f71665k != null) {
            this.f71663i.setOnClickListener(new d());
        } else {
            this.f71663i.setOnClickListener(null);
        }
    }

    public void r(boolean z10) {
        this.f71672r = z10;
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        if (PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, bb.c.k.f33899v, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f71669o;
        if (textView != null) {
            textView.setText(charSequence);
        } else {
            this.f71657c = charSequence;
        }
    }

    @Override // android.app.Dialog
    public void show() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33855t, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f71673s) {
            s(getWindow());
        }
        super.show();
    }

    public void t(boolean z10) {
        this.f71673s = z10;
    }

    public void u(int i10) {
        this.f71660f = null;
        this.f71662h = i10;
    }

    public void v(View view) {
        this.f71660f = view;
        this.f71662h = 0;
    }

    public void w(int i10) {
        this.f71675u = i10;
    }
}
