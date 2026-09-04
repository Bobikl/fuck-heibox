package com.huawei.hms.hmsscankit;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.huawei.hms.scankit.R;

/* JADX INFO: compiled from: CustomDialog.java */
/* JADX INFO: loaded from: classes7.dex */
public class a implements DialogInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f61091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f61092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharSequence f61093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f61094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f61095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f61096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f61097g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f61098h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f61099i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f61100j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f61101k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final DialogInterface.OnClickListener f61102l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final DialogInterface.OnClickListener f61103m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private AlertDialog f61104n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    TextView f61105o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    TextView f61106p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    TextView f61107q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    TextView f61108r;

    /* JADX INFO: renamed from: com.huawei.hms.hmsscankit.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CustomDialog.java */
    public class ViewOnClickListenerC0509a implements View.OnClickListener {
        ViewOnClickListenerC0509a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.f61103m != null) {
                a.this.f61103m.onClick(a.this, -2);
            }
            a.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: CustomDialog.java */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.f61102l != null) {
                a.this.f61102l.onClick(a.this, -1);
            }
            a.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: CustomDialog.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f61111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CharSequence f61112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CharSequence f61113c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f61114d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f61115e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f61116f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f61117g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f61118h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f61119i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f61120j = true;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f61121k = 80;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private DialogInterface.OnClickListener f61122l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private DialogInterface.OnClickListener f61123m;

        public c(Context context) {
            this.f61111a = context;
        }

        public c a(CharSequence charSequence) {
            this.f61113c = charSequence;
            return this;
        }

        public c a(String str, DialogInterface.OnClickListener onClickListener) {
            this.f61114d = str;
            this.f61123m = onClickListener;
            return this;
        }

        public a a() {
            return new a(this, null);
        }

        public c b(CharSequence charSequence) {
            this.f61112b = charSequence;
            return this;
        }

        public c b(String str, DialogInterface.OnClickListener onClickListener) {
            this.f61115e = str;
            this.f61122l = onClickListener;
            return this;
        }
    }

    private a(c cVar) {
        this.f61091a = cVar.f61111a;
        this.f61092b = cVar.f61112b;
        this.f61093c = cVar.f61113c;
        this.f61094d = cVar.f61115e;
        this.f61095e = cVar.f61114d;
        this.f61096f = cVar.f61116f;
        this.f61097g = cVar.f61117g;
        this.f61098h = cVar.f61119i;
        this.f61099i = cVar.f61118h;
        this.f61100j = cVar.f61120j;
        this.f61101k = cVar.f61121k;
        this.f61102l = cVar.f61122l;
        this.f61103m = cVar.f61123m;
        a();
    }

    /* synthetic */ a(c cVar, ViewOnClickListenerC0509a viewOnClickListenerC0509a) {
        this(cVar);
    }

    @SuppressLint({"SetTextI18n"})
    private void a() {
        if (this.f61091a != null) {
            this.f61104n = new AlertDialog.Builder(this.f61091a, R.style.BottomFullDialogStyle).create();
            View viewInflate = LayoutInflater.from(this.f61091a).inflate(R.layout.scankit_dialog_custom, (ViewGroup) null);
            Window window = this.f61104n.getWindow();
            if (window != null) {
                window.setGravity(this.f61101k);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.y = 16;
                window.setAttributes(attributes);
            }
            this.f61105o = (TextView) viewInflate.findViewById(R.id.dialog_title);
            this.f61106p = (TextView) viewInflate.findViewById(R.id.dialog_message);
            this.f61107q = (TextView) viewInflate.findViewById(R.id.dialog_negative);
            this.f61108r = (TextView) viewInflate.findViewById(R.id.dialog_positive);
            this.f61104n.setView(viewInflate);
            CharSequence charSequence = this.f61092b;
            if (charSequence != null) {
                this.f61105o.setText(charSequence);
            }
            this.f61104n.setCanceledOnTouchOutside(false);
            this.f61105o.setMovementMethod(LinkMovementMethod.getInstance());
            this.f61106p.setMovementMethod(LinkMovementMethod.getInstance());
            this.f61106p.setText(this.f61093c);
            b();
        }
    }

    private void b() {
        this.f61107q.setText(this.f61095e);
        int i10 = this.f61099i;
        if (i10 != 0) {
            this.f61107q.setTextColor(i10);
        }
        this.f61107q.setOnClickListener(new ViewOnClickListenerC0509a());
        if (TextUtils.isEmpty(this.f61095e)) {
            this.f61107q.setVisibility(8);
        } else {
            this.f61107q.setVisibility(0);
        }
        this.f61108r.setText(this.f61094d);
        int i11 = this.f61098h;
        if (i11 != 0) {
            this.f61108r.setTextColor(i11);
        }
        this.f61108r.setOnClickListener(new b());
        if (TextUtils.isEmpty(this.f61094d)) {
            this.f61108r.setVisibility(8);
        } else {
            this.f61108r.setVisibility(0);
        }
        this.f61104n.setCancelable(this.f61100j);
    }

    public void c() {
        AlertDialog alertDialog = this.f61104n;
        if (alertDialog != null) {
            alertDialog.show();
        }
    }

    @Override // android.content.DialogInterface
    public void cancel() {
        AlertDialog alertDialog = this.f61104n;
        if (alertDialog != null) {
            alertDialog.cancel();
        }
    }

    @Override // android.content.DialogInterface
    public void dismiss() {
        AlertDialog alertDialog = this.f61104n;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        this.f61104n.dismiss();
    }
}
