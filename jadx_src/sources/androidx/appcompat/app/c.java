package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.RestrictTo;
import androidx.annotation.d1;
import androidx.annotation.e1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.v;
import androidx.appcompat.R;

/* JADX INFO: compiled from: AlertDialog.java */
/* JADX INFO: loaded from: classes.dex */
public class c extends i implements DialogInterface {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f1780h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int f1781i = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final AlertController f1782g;

    /* JADX INFO: compiled from: AlertDialog.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AlertController.f f1783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f1784b;

        public a(@n0 Context context) {
            this(context, c.m(context, 0));
        }

        public a(@n0 Context context, @e1 int i10) {
            this.f1783a = new AlertController.f(new ContextThemeWrapper(context, c.m(context, i10)));
            this.f1784b = i10;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public a A(boolean z10) {
            this.f1783a.Q = z10;
            return this;
        }

        public a B(@androidx.annotation.e int i10, int i11, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f1783a;
            fVar.f1666v = fVar.f1645a.getResources().getTextArray(i10);
            AlertController.f fVar2 = this.f1783a;
            fVar2.f1668x = onClickListener;
            fVar2.I = i11;
            fVar2.H = true;
            return this;
        }

        public a C(Cursor cursor, int i10, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f1783a;
            fVar.K = cursor;
            fVar.f1668x = onClickListener;
            fVar.I = i10;
            fVar.L = str;
            fVar.H = true;
            return this;
        }

        public a D(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f1783a;
            fVar.f1667w = listAdapter;
            fVar.f1668x = onClickListener;
            fVar.I = i10;
            fVar.H = true;
            return this;
        }

        public a E(CharSequence[] charSequenceArr, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f1783a;
            fVar.f1666v = charSequenceArr;
            fVar.f1668x = onClickListener;
            fVar.I = i10;
            fVar.H = true;
            return this;
        }

        public a F(@d1 int i10) {
            AlertController.f fVar = this.f1783a;
            fVar.f1650f = fVar.f1645a.getText(i10);
            return this;
        }

        public a G(int i10) {
            AlertController.f fVar = this.f1783a;
            fVar.f1670z = null;
            fVar.f1669y = i10;
            fVar.E = false;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public a H(View view, int i10, int i11, int i12, int i13) {
            AlertController.f fVar = this.f1783a;
            fVar.f1670z = view;
            fVar.f1669y = 0;
            fVar.E = true;
            fVar.A = i10;
            fVar.B = i11;
            fVar.C = i12;
            fVar.D = i13;
            return this;
        }

        public c I() {
            c cVarCreate = create();
            cVarCreate.show();
            return cVarCreate;
        }

        public a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f1783a;
            fVar.f1667w = listAdapter;
            fVar.f1668x = onClickListener;
            return this;
        }

        public a b(boolean z10) {
            this.f1783a.f1662r = z10;
            return this;
        }

        public a c(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.f fVar = this.f1783a;
            fVar.K = cursor;
            fVar.L = str;
            fVar.f1668x = onClickListener;
            return this;
        }

        @n0
        public c create() {
            c cVar = new c(this.f1783a.f1645a, this.f1784b);
            this.f1783a.a(cVar.f1782g);
            cVar.setCancelable(this.f1783a.f1662r);
            if (this.f1783a.f1662r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f1783a.f1663s);
            cVar.setOnDismissListener(this.f1783a.f1664t);
            DialogInterface.OnKeyListener onKeyListener = this.f1783a.f1665u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        public a d(@p0 View view) {
            this.f1783a.f1651g = view;
            return this;
        }

        public a e(@v int i10) {
            this.f1783a.f1647c = i10;
            return this;
        }

        public a f(@p0 Drawable drawable) {
            this.f1783a.f1648d = drawable;
            return this;
        }

        public a g(@androidx.annotation.f int i10) {
            TypedValue typedValue = new TypedValue();
            this.f1783a.f1645a.getTheme().resolveAttribute(i10, typedValue, true);
            this.f1783a.f1647c = typedValue.resourceId;
            return this;
        }

        @n0
        public Context getContext() {
            return this.f1783a.f1645a;
        }

        @Deprecated
        public a h(boolean z10) {
            this.f1783a.N = z10;
            return this;
        }

        public a i(@androidx.annotation.e int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f1783a;
            fVar.f1666v = fVar.f1645a.getResources().getTextArray(i10);
            this.f1783a.f1668x = onClickListener;
            return this;
        }

        public a j(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f1783a;
            fVar.f1666v = charSequenceArr;
            fVar.f1668x = onClickListener;
            return this;
        }

        public a k(@d1 int i10) {
            AlertController.f fVar = this.f1783a;
            fVar.f1652h = fVar.f1645a.getText(i10);
            return this;
        }

        public a l(@p0 CharSequence charSequence) {
            this.f1783a.f1652h = charSequence;
            return this;
        }

        public a m(@androidx.annotation.e int i10, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.f1783a;
            fVar.f1666v = fVar.f1645a.getResources().getTextArray(i10);
            AlertController.f fVar2 = this.f1783a;
            fVar2.J = onMultiChoiceClickListener;
            fVar2.F = zArr;
            fVar2.G = true;
            return this;
        }

        public a n(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.f1783a;
            fVar.K = cursor;
            fVar.J = onMultiChoiceClickListener;
            fVar.M = str;
            fVar.L = str2;
            fVar.G = true;
            return this;
        }

        public a o(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.f1783a;
            fVar.f1666v = charSequenceArr;
            fVar.J = onMultiChoiceClickListener;
            fVar.F = zArr;
            fVar.G = true;
            return this;
        }

        public a p(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f1783a;
            fVar.f1656l = charSequence;
            fVar.f1658n = onClickListener;
            return this;
        }

        public a q(Drawable drawable) {
            this.f1783a.f1657m = drawable;
            return this;
        }

        public a r(@d1 int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f1783a;
            fVar.f1659o = fVar.f1645a.getText(i10);
            this.f1783a.f1661q = onClickListener;
            return this;
        }

        public a s(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f1783a;
            fVar.f1659o = charSequence;
            fVar.f1661q = onClickListener;
            return this;
        }

        public a setNegativeButton(@d1 int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f1783a;
            fVar.f1656l = fVar.f1645a.getText(i10);
            this.f1783a.f1658n = onClickListener;
            return this;
        }

        public a setPositiveButton(@d1 int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f1783a;
            fVar.f1653i = fVar.f1645a.getText(i10);
            this.f1783a.f1655k = onClickListener;
            return this;
        }

        public a setTitle(@p0 CharSequence charSequence) {
            this.f1783a.f1650f = charSequence;
            return this;
        }

        public a setView(View view) {
            AlertController.f fVar = this.f1783a;
            fVar.f1670z = view;
            fVar.f1669y = 0;
            fVar.E = false;
            return this;
        }

        public a t(Drawable drawable) {
            this.f1783a.f1660p = drawable;
            return this;
        }

        public a u(DialogInterface.OnCancelListener onCancelListener) {
            this.f1783a.f1663s = onCancelListener;
            return this;
        }

        public a v(DialogInterface.OnDismissListener onDismissListener) {
            this.f1783a.f1664t = onDismissListener;
            return this;
        }

        public a w(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.f1783a.O = onItemSelectedListener;
            return this;
        }

        public a x(DialogInterface.OnKeyListener onKeyListener) {
            this.f1783a.f1665u = onKeyListener;
            return this;
        }

        public a y(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f1783a;
            fVar.f1653i = charSequence;
            fVar.f1655k = onClickListener;
            return this;
        }

        public a z(Drawable drawable) {
            this.f1783a.f1654j = drawable;
            return this;
        }
    }

    protected c(@n0 Context context) {
        this(context, 0);
    }

    protected c(@n0 Context context, @e1 int i10) {
        super(context, m(context, i10));
        this.f1782g = new AlertController(getContext(), this, getWindow());
    }

    protected c(@n0 Context context, boolean z10, @p0 DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z10);
        setOnCancelListener(onCancelListener);
    }

    static int m(@n0 Context context, @e1 int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public Button k(int i10) {
        return this.f1782g.c(i10);
    }

    public ListView l() {
        return this.f1782g.e();
    }

    public void n(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f1782g.l(i10, charSequence, onClickListener, null, null);
    }

    public void o(int i10, CharSequence charSequence, Drawable drawable, DialogInterface.OnClickListener onClickListener) {
        this.f1782g.l(i10, charSequence, onClickListener, null, drawable);
    }

    @Override // androidx.appcompat.app.i, androidx.activity.k, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1782g.f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f1782g.h(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f1782g.i(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    public void p(int i10, CharSequence charSequence, Message message) {
        this.f1782g.l(i10, charSequence, null, message, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    void q(int i10) {
        this.f1782g.m(i10);
    }

    public void r(View view) {
        this.f1782g.n(view);
    }

    public void s(int i10) {
        this.f1782g.o(i10);
    }

    @Override // androidx.appcompat.app.i, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f1782g.s(charSequence);
    }

    public void t(Drawable drawable) {
        this.f1782g.p(drawable);
    }

    public void u(int i10) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i10, typedValue, true);
        this.f1782g.o(typedValue.resourceId);
    }

    public void v(CharSequence charSequence) {
        this.f1782g.q(charSequence);
    }

    public void w(View view) {
        this.f1782g.u(view);
    }

    public void x(View view, int i10, int i11, int i12, int i13) {
        this.f1782g.v(view, i10, i11, i12, i13);
    }
}
