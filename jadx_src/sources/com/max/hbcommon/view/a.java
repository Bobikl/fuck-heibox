package com.max.hbcommon.view;

import android.app.Dialog;
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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.d1;
import androidx.annotation.e1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcommon.component.dialog.TopViewStyle;
import com.max.hbutils.R;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;

/* JADX INFO: compiled from: HeyBoxDialog.java */
/* JADX INFO: loaded from: classes9.dex */
public class a extends Dialog {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ViewGroup A;
    private boolean B;

    @p0
    private View.OnClickListener C;
    private boolean D;
    private int E;
    private int F;
    private LayoutInflater G;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f68272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CharSequence f68273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CharSequence f68274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SpannableStringBuilder f68275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f68276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View f68277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f68278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList<h> f68279i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ib.f f68280j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f68281k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f68282l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f68283m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private TextView f68284n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CharSequence f68285o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private DialogInterface.OnClickListener f68286p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f68287q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextView f68288r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CharSequence f68289s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private DialogInterface.OnClickListener f68290t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private TextView f68291u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private TextView f68292v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ImageView f68293w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private View f68294x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private ViewGroup f68295y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ViewGroup f68296z;

    /* JADX INFO: renamed from: com.max.hbcommon.view.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HeyBoxDialog.java */
    public class ViewOnClickListenerC0555a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        ViewOnClickListenerC0555a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.f.f32206d2, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (a.this.C != null) {
                a.this.C.onClick(view);
            }
            a.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: HeyBoxDialog.java */
    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.f.f32229e2, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            a.this.f68286p.onClick(a.this, -1);
        }
    }

    /* JADX INFO: compiled from: HeyBoxDialog.java */
    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.f.f32252f2, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            a.this.f68290t.onClick(a.this, -2);
        }
    }

    /* JADX INFO: compiled from: HeyBoxDialog.java */
    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.f.f32275g2, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            a.this.f68286p.onClick(a.this, -1);
        }
    }

    /* JADX INFO: compiled from: HeyBoxDialog.java */
    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.f.f32298h2, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            a.this.f68290t.onClick(a.this, -2);
        }
    }

    /* JADX INFO: compiled from: HeyBoxDialog.java */
    public static class f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f68302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a f68303b;

        public f(Context context) {
            this.f68302a = new g(context);
        }

        public f A(View view) {
            g gVar = this.f68302a;
            gVar.f68322s = view;
            gVar.f68319p = 0;
            return this;
        }

        public f B(boolean z10) {
            this.f68302a.f68313j = z10;
            return this;
        }

        public f C(int i10) {
            g gVar = this.f68302a;
            gVar.f68324u = null;
            gVar.f68321r = i10;
            return this;
        }

        public f D(View view) {
            g gVar = this.f68302a;
            gVar.f68324u = view;
            gVar.f68321r = 0;
            return this;
        }

        public f E(int i10) {
            this.f68302a.f68314k = i10;
            return this;
        }

        public a F() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32505q2, new Class[0], a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            d();
            this.f68303b.show();
            return this.f68303b;
        }

        public f a(h hVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, bb.c.f.f32344j2, new Class[]{h.class}, f.class);
            if (patchProxyResultProxy.isSupported) {
                return (f) patchProxyResultProxy.result;
            }
            g gVar = this.f68302a;
            if (gVar.f68325v == null) {
                gVar.f68325v = new ArrayList<>();
            }
            this.f68302a.f68325v.add(hVar);
            return this;
        }

        public f b(View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.f.f32367k2, new Class[]{View.class}, f.class);
            if (patchProxyResultProxy.isSupported) {
                return (f) patchProxyResultProxy.result;
            }
            this.f68302a.f68326w = new ib.f(view, TopViewStyle.Style_56);
            return this;
        }

        public f c(View view, TopViewStyle topViewStyle) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, topViewStyle}, this, changeQuickRedirect, false, bb.c.f.f32390l2, new Class[]{View.class, TopViewStyle.class}, f.class);
            if (patchProxyResultProxy.isSupported) {
                return (f) patchProxyResultProxy.result;
            }
            this.f68302a.f68326w = new ib.f(view, topViewStyle);
            return this;
        }

        public a d() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32482p2, new Class[0], a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            if (this.f68302a.f68313j) {
                this.f68303b = new a(this.f68302a.f68304a, R.style.FullScreenDialog);
            } else {
                this.f68303b = new a(this.f68302a.f68304a, R.style.HeyBoxDialog);
            }
            this.f68303b.A(this.f68302a.f68313j);
            this.f68303b.D(this.f68302a.f68314k);
            this.f68302a.a(this.f68303b);
            g gVar = this.f68302a;
            if (gVar.f68327x) {
                this.f68303b.s(gVar.f68329z);
            }
            this.f68303b.setCancelable(this.f68302a.f68312i);
            if (this.f68302a.f68312i) {
                this.f68303b.setCanceledOnTouchOutside(true);
            }
            this.f68303b.setOnCancelListener(this.f68302a.f68315l);
            this.f68303b.setOnDismissListener(this.f68302a.f68316m);
            DialogInterface.OnKeyListener onKeyListener = this.f68302a.f68317n;
            if (onKeyListener != null) {
                this.f68303b.setOnKeyListener(onKeyListener);
            }
            return this.f68303b;
        }

        public a e() {
            return this.f68303b;
        }

        public Context f() {
            return this.f68302a.f68304a;
        }

        public f g(boolean z10) {
            this.f68302a.f68312i = z10;
            return this;
        }

        public f h(int i10) {
            g gVar = this.f68302a;
            gVar.f68323t = null;
            gVar.f68320q = i10;
            return this;
        }

        public f i(View view) {
            g gVar = this.f68302a;
            gVar.f68323t = view;
            gVar.f68320q = 0;
            return this;
        }

        public f j(boolean z10) {
            this.f68302a.f68328y = z10;
            return this;
        }

        public f k(@d1 int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32413m2, new Class[]{Integer.TYPE}, f.class);
            if (patchProxyResultProxy.isSupported) {
                return (f) patchProxyResultProxy.result;
            }
            g gVar = this.f68302a;
            gVar.f68306c = gVar.f68304a.getText(i10);
            return this;
        }

        public f l(CharSequence charSequence) {
            this.f68302a.f68306c = charSequence;
            return this;
        }

        public f m(SpannableStringBuilder spannableStringBuilder) {
            this.f68302a.f68307d = spannableStringBuilder;
            return this;
        }

        public f n(@d1 int i10, DialogInterface.OnClickListener onClickListener) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), onClickListener}, this, changeQuickRedirect, false, bb.c.f.f32459o2, new Class[]{Integer.TYPE, DialogInterface.OnClickListener.class}, f.class);
            if (patchProxyResultProxy.isSupported) {
                return (f) patchProxyResultProxy.result;
            }
            g gVar = this.f68302a;
            gVar.f68309f = gVar.f68304a.getText(i10);
            this.f68302a.f68311h = onClickListener;
            return this;
        }

        public f o(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            g gVar = this.f68302a;
            gVar.f68309f = charSequence;
            gVar.f68311h = onClickListener;
            return this;
        }

        public f p(DialogInterface.OnCancelListener onCancelListener) {
            this.f68302a.f68315l = onCancelListener;
            return this;
        }

        public f q(View.OnClickListener onClickListener) {
            this.f68302a.f68329z = onClickListener;
            return this;
        }

        public f r(DialogInterface.OnDismissListener onDismissListener) {
            this.f68302a.f68316m = onDismissListener;
            return this;
        }

        public f s(DialogInterface.OnKeyListener onKeyListener) {
            this.f68302a.f68317n = onKeyListener;
            return this;
        }

        public f t(@d1 int i10, DialogInterface.OnClickListener onClickListener) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), onClickListener}, this, changeQuickRedirect, false, bb.c.f.f32436n2, new Class[]{Integer.TYPE, DialogInterface.OnClickListener.class}, f.class);
            if (patchProxyResultProxy.isSupported) {
                return (f) patchProxyResultProxy.result;
            }
            g gVar = this.f68302a;
            gVar.f68308e = gVar.f68304a.getText(i10);
            this.f68302a.f68310g = onClickListener;
            return this;
        }

        public f u(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            g gVar = this.f68302a;
            gVar.f68308e = charSequence;
            gVar.f68310g = onClickListener;
            return this;
        }

        public f v(boolean z10) {
            this.f68302a.A = z10;
            return this;
        }

        public f w(boolean z10) {
            this.f68302a.f68327x = z10;
            return this;
        }

        public f x(@d1 int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32321i2, new Class[]{Integer.TYPE}, f.class);
            if (patchProxyResultProxy.isSupported) {
                return (f) patchProxyResultProxy.result;
            }
            g gVar = this.f68302a;
            gVar.f68305b = gVar.f68304a.getText(i10);
            return this;
        }

        public f y(CharSequence charSequence) {
            this.f68302a.f68305b = charSequence;
            return this;
        }

        public f z(int i10) {
            g gVar = this.f68302a;
            gVar.f68322s = null;
            gVar.f68319p = i10;
            return this;
        }
    }

    /* JADX INFO: compiled from: HeyBoxDialog.java */
    public static class g {
        public static ChangeQuickRedirect changeQuickRedirect;
        public boolean A;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f68304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CharSequence f68305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f68306c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public SpannableStringBuilder f68307d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence f68308e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f68309f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public DialogInterface.OnClickListener f68310g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public DialogInterface.OnClickListener f68311h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f68312i = true;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f68313j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f68314k = R.style.HeyBoxDialogAnimation;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public DialogInterface.OnCancelListener f68315l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public DialogInterface.OnDismissListener f68316m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public DialogInterface.OnKeyListener f68317n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public DialogInterface.OnClickListener f68318o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f68319p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f68320q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f68321r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public View f68322s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public View f68323t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public View f68324u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public ArrayList<h> f68325v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ib.f f68326w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f68327x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public boolean f68328y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public View.OnClickListener f68329z;

        public g(Context context) {
            this.f68304a = context;
        }

        public void a(a aVar) {
            if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, bb.c.f.f32527r2, new Class[]{a.class}, Void.TYPE).isSupported) {
                return;
            }
            CharSequence charSequence = this.f68305b;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            CharSequence charSequence2 = this.f68306c;
            if (charSequence2 != null) {
                aVar.n(charSequence2);
            }
            SpannableStringBuilder spannableStringBuilder = this.f68307d;
            if (spannableStringBuilder != null) {
                aVar.p(spannableStringBuilder);
            }
            if (this.A) {
                aVar.v();
            }
            CharSequence charSequence3 = this.f68308e;
            if (charSequence3 != null) {
                aVar.u(charSequence3, this.f68310g);
            }
            CharSequence charSequence4 = this.f68309f;
            if (charSequence4 != null) {
                aVar.r(charSequence4, this.f68311h);
            }
            View view = this.f68322s;
            if (view != null) {
                aVar.z(view);
            } else {
                int i10 = this.f68319p;
                if (i10 != 0) {
                    aVar.y(i10);
                }
            }
            View view2 = this.f68323t;
            if (view2 != null) {
                aVar.l(view2);
            } else {
                int i11 = this.f68320q;
                if (i11 != 0) {
                    aVar.k(i11);
                }
            }
            View view3 = this.f68324u;
            if (view3 != null) {
                aVar.C(view3);
            } else {
                int i12 = this.f68321r;
                if (i12 != 0) {
                    aVar.B(i12);
                }
            }
            if (!com.max.hbcommon.utils.c.w(this.f68325v)) {
                aVar.m(this.f68325v);
            }
            ib.f fVar = this.f68326w;
            if (fVar != null) {
                aVar.x(fVar);
            }
            aVar.w(this.f68327x);
        }
    }

    /* JADX INFO: compiled from: HeyBoxDialog.java */
    public interface h {
        ViewGroup.LayoutParams a(Context context);

        View b(Context context);
    }

    public a(@n0 Context context) {
        super(context);
        this.E = 16;
        this.F = R.style.HeyBoxDialogAnimation;
        this.f68272b = context;
        j();
    }

    public a(@n0 Context context, @e1 int i10) {
        super(context, i10);
        this.E = 16;
        this.F = R.style.HeyBoxDialogAnimation;
        this.f68272b = context;
        j();
    }

    public a(@n0 Context context, boolean z10, @p0 DialogInterface.OnCancelListener onCancelListener) {
        super(context, z10, onCancelListener);
        this.E = 16;
        this.F = R.style.HeyBoxDialogAnimation;
        this.f68272b = context;
        j();
    }

    private void j() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.R1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.G = (LayoutInflater) this.f68272b.getSystemService("layout_inflater");
    }

    public void A(boolean z10) {
        this.D = z10;
    }

    public void B(int i10) {
        this.f68278h = null;
        this.f68283m = i10;
    }

    public void C(View view) {
        this.f68278h = view;
        this.f68283m = 0;
    }

    public void D(int i10) {
        this.F = i10;
    }

    public View d() {
        return this.f68294x;
    }

    public ImageView e() {
        return this.f68293w;
    }

    public TextView f() {
        return this.f68292v;
    }

    public TextView g() {
        return this.f68288r;
    }

    public TextView h() {
        return this.f68284n;
    }

    public TextView i() {
        return this.f68291u;
    }

    public void k(int i10) {
        this.f68277g = null;
        this.f68281k = i10;
    }

    public void l(View view) {
        this.f68277g = view;
        this.f68281k = 0;
    }

    public void m(ArrayList<h> arrayList) {
        this.f68279i = arrayList;
    }

    public void n(CharSequence charSequence) {
        if (PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, bb.c.f.V1, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f68292v;
        if (textView != null) {
            textView.setText(charSequence);
        } else {
            this.f68274d = charSequence;
        }
    }

    public void o(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.X1, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.E = i10;
        TextView textView = this.f68292v;
        if (textView != null) {
            textView.setGravity(i10);
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i10;
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.f.S1, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        View viewInflate = null;
        ConstraintLayout constraintLayout = (ConstraintLayout) this.G.inflate(R.layout.dialog_heybox, (ViewGroup) null);
        this.f68295y = (ViewGroup) constraintLayout.findViewById(R.id.vg_components);
        this.A = (ViewGroup) constraintLayout.findViewById(R.id.vg_top_icon);
        this.f68296z = (ViewGroup) constraintLayout.findViewById(R.id.vg_fixed_view);
        this.f68291u = (TextView) constraintLayout.findViewById(R.id.tv_title);
        this.f68292v = (TextView) constraintLayout.findViewById(R.id.tv_message);
        this.f68293w = (ImageView) constraintLayout.findViewById(R.id.iv_close);
        View viewFindViewById = constraintLayout.findViewById(R.id.cv_bg);
        this.f68294x = constraintLayout.findViewById(R.id.vg_bg);
        ViewGroup viewGroup = (ViewGroup) constraintLayout.findViewById(R.id.vg_top_view);
        ViewGroup viewGroup2 = (ViewGroup) constraintLayout.findViewById(R.id.vg_center_view);
        View viewFindViewById2 = constraintLayout.findViewById(R.id.vg_button_panel);
        View viewFindViewById3 = constraintLayout.findViewById(R.id.v_btn_divider);
        this.f68284n = (TextView) constraintLayout.findViewById(R.id.tv_positive_button);
        this.f68288r = (TextView) constraintLayout.findViewById(R.id.tv_negative_button);
        if (com.max.hbcommon.utils.c.w(this.f68279i)) {
            this.f68296z.setVisibility(0);
            this.f68295y.setVisibility(8);
            boolean z10 = !TextUtils.isEmpty(this.f68273c);
            boolean z11 = (TextUtils.isEmpty(this.f68274d) && this.f68275e == null) ? false : true;
            if (z10) {
                this.f68291u.setVisibility(0);
                this.f68291u.setText(this.f68273c);
            } else {
                this.f68291u.setVisibility(8);
            }
            if (z11) {
                this.f68292v.setVisibility(0);
                if (TextUtils.isEmpty(this.f68274d)) {
                    SpannableStringBuilder spannableStringBuilder = this.f68275e;
                    if (spannableStringBuilder != null) {
                        this.f68292v.setText(spannableStringBuilder);
                    }
                } else {
                    this.f68292v.setText(this.f68274d);
                }
                this.f68292v.setGravity(this.E);
            } else {
                this.f68292v.setVisibility(8);
            }
            View viewInflate2 = this.f68276f;
            if (viewInflate2 == null) {
                int i11 = this.f68282l;
                viewInflate2 = i11 != 0 ? this.G.inflate(i11, (ViewGroup) constraintLayout, false) : null;
            }
            if (viewInflate2 != null) {
                viewGroup.setVisibility(0);
                viewGroup.addView(viewInflate2);
            } else {
                viewGroup.setVisibility(8);
            }
            View viewInflate3 = this.f68277g;
            if (viewInflate3 == null) {
                int i12 = this.f68281k;
                viewInflate3 = i12 != 0 ? this.G.inflate(i12, (ViewGroup) constraintLayout, false) : null;
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f68291u.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f68292v.getLayoutParams();
            if (viewInflate3 != null) {
                viewGroup2.setVisibility(0);
                viewGroup2.addView(viewInflate3);
                if (z10 && z11) {
                    layoutParams2.topMargin = ViewUtils.f(this.f68272b, 13.0f);
                    layoutParams2.bottomMargin = 0;
                    this.f68292v.setLayoutParams(layoutParams2);
                } else if (z11) {
                    layoutParams2.topMargin = ViewUtils.f(this.f68272b, 12.0f);
                    layoutParams2.bottomMargin = 0;
                    this.f68292v.setLayoutParams(layoutParams2);
                }
            } else {
                viewGroup2.setVisibility(8);
                if (z10 && !z11) {
                    layoutParams.topMargin = ViewUtils.f(this.f68272b, 20.0f);
                    layoutParams.bottomMargin = ViewUtils.f(this.f68272b, 40.0f);
                    this.f68291u.setLayoutParams(layoutParams);
                } else if (z11 && !z10) {
                    layoutParams2.topMargin = ViewUtils.f(this.f68272b, 20.0f);
                    layoutParams2.bottomMargin = ViewUtils.f(this.f68272b, 40.0f);
                    this.f68291u.setLayoutParams(layoutParams2);
                }
            }
        } else {
            this.f68296z.setVisibility(8);
            this.f68295y.setVisibility(0);
            this.f68295y.removeAllViews();
            for (h hVar : this.f68279i) {
                if (hVar.a(this.f68272b) != null) {
                    this.f68295y.addView(hVar.b(this.f68272b), hVar.a(this.f68272b));
                } else {
                    this.f68295y.addView(hVar.b(this.f68272b));
                }
            }
        }
        if (this.f68280j != null) {
            this.A.setVisibility(0);
            this.A.removeAllViews();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A.getLayoutParams();
            if (this.f68280j.a() == TopViewStyle.Style_56) {
                marginLayoutParams.width = ViewUtils.f(this.f68272b, 56.0f);
                marginLayoutParams.height = ViewUtils.f(this.f68272b, 56.0f);
                marginLayoutParams.topMargin = ViewUtils.f(this.f68272b, -24.0f);
            } else {
                marginLayoutParams.width = ViewUtils.f(this.f68272b, 81.0f);
                marginLayoutParams.height = ViewUtils.f(this.f68272b, 81.0f);
                marginLayoutParams.topMargin = ViewUtils.f(this.f68272b, -40.0f);
            }
            this.A.addView(this.f68280j.b());
        } else {
            this.A.setVisibility(8);
        }
        this.f68293w.setVisibility(this.B ? 0 : 8);
        this.f68293w.setOnClickListener(new ViewOnClickListenerC0555a());
        if (TextUtils.isEmpty(this.f68285o)) {
            this.f68284n.setVisibility(8);
            i10 = 0;
        } else {
            this.f68284n.setVisibility(0);
            this.f68284n.setText(this.f68285o);
            if (this.f68286p != null) {
                this.f68284n.setOnClickListener(new b());
            } else {
                this.f68284n.setOnClickListener(null);
            }
            i10 = 1;
        }
        if (this.f68287q) {
            this.f68284n.setBackgroundResource(R.drawable.bg_dialog_red_positive_btn);
        }
        if (TextUtils.isEmpty(this.f68289s)) {
            this.f68288r.setVisibility(8);
        } else {
            i10++;
            this.f68288r.setVisibility(0);
            this.f68288r.setText(this.f68289s);
            if (this.f68290t != null) {
                this.f68288r.setOnClickListener(new c());
            } else {
                this.f68288r.setOnClickListener(null);
            }
        }
        viewFindViewById2.setVisibility(i10 > 0 ? 0 : 8);
        viewFindViewById3.setVisibility(i10 > 1 ? 0 : 8);
        View view = this.f68278h;
        if (view != null) {
            viewInflate = view;
        } else {
            int i13 = this.f68283m;
            if (i13 != 0) {
                viewInflate = this.G.inflate(i13, (ViewGroup) constraintLayout, false);
            }
        }
        if (viewInflate != null) {
            constraintLayout.removeAllViews();
            constraintLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        }
        StringBuilder sb2 = new StringBuilder();
        CharSequence charSequence = this.f68273c;
        if (charSequence != null) {
            sb2.append(charSequence.toString());
        }
        CharSequence charSequence2 = this.f68274d;
        if (charSequence2 != null) {
            sb2.append(charSequence2.toString());
        }
        viewFindViewById.setTag(R.id.auto_track_tag_view_dialog_root_view, sb2.toString());
        setContentView(constraintLayout);
        Window window = getWindow();
        if (window != null) {
            window.getAttributes().windowAnimations = this.F;
        }
        if (this.D || window == null) {
            return;
        }
        window.setGravity(17);
        window.getDecorView().setPadding(0, 0, 0, 0);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
    }

    public void p(SpannableStringBuilder spannableStringBuilder) {
        if (PatchProxy.proxy(new Object[]{spannableStringBuilder}, this, changeQuickRedirect, false, bb.c.f.W1, new Class[]{SpannableStringBuilder.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f68292v;
        if (textView != null) {
            textView.setText(spannableStringBuilder);
        } else {
            this.f68275e = spannableStringBuilder;
        }
    }

    public void q(CharSequence charSequence) {
        if (PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, bb.c.f.f32159b2, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
            return;
        }
        r(charSequence, null);
    }

    public void r(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{charSequence, onClickListener}, this, changeQuickRedirect, false, bb.c.f.f32182c2, new Class[]{CharSequence.class, DialogInterface.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f68288r;
        if (textView == null) {
            this.f68289s = charSequence;
            this.f68290t = onClickListener;
            return;
        }
        textView.setText(charSequence);
        if (this.f68290t != null) {
            this.f68288r.setOnClickListener(new e());
        } else {
            this.f68288r.setOnClickListener(null);
        }
    }

    public void s(View.OnClickListener onClickListener) {
        this.C = onClickListener;
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        if (PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, bb.c.f.U1, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f68291u;
        if (textView != null) {
            textView.setText(charSequence);
        } else {
            this.f68273c = charSequence;
        }
    }

    @Override // android.app.Dialog
    public void show() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.T1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.D) {
            t.h0(getWindow());
        }
        super.show();
    }

    public void t(CharSequence charSequence) {
        if (PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, bb.c.f.Z1, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
            return;
        }
        u(charSequence, null);
    }

    public void u(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{charSequence, onClickListener}, this, changeQuickRedirect, false, bb.c.f.f32136a2, new Class[]{CharSequence.class, DialogInterface.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f68284n;
        if (textView == null) {
            this.f68285o = charSequence;
            this.f68286p = onClickListener;
            return;
        }
        textView.setText(charSequence);
        if (this.f68286p != null) {
            this.f68284n.setOnClickListener(new d());
        } else {
            this.f68284n.setOnClickListener(null);
        }
    }

    public void v() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Y1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f68284n;
        if (textView != null) {
            textView.setBackgroundResource(R.drawable.bg_dialog_red_positive_btn);
        } else {
            this.f68287q = true;
        }
    }

    public void w(boolean z10) {
        this.B = z10;
    }

    public void x(ib.f fVar) {
        this.f68280j = fVar;
    }

    public void y(int i10) {
        this.f68276f = null;
        this.f68282l = i10;
    }

    public void z(View view) {
        this.f68276f = view;
        this.f68282l = 0;
    }
}
