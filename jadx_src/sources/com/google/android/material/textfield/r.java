package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.annotation.d1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: compiled from: EndIconDelegate.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TextInputLayout f55671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final EndCompoundLayout f55672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f55673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final CheckableImageButton f55674d;

    r(@n0 EndCompoundLayout endCompoundLayout) {
        this.f55671a = endCompoundLayout.f55518b;
        this.f55672b = endCompoundLayout;
        this.f55673c = endCompoundLayout.getContext();
        this.f55674d = endCompoundLayout.getEndIconView();
    }

    void a(Editable editable) {
    }

    void b(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @d1
    int c() {
        return 0;
    }

    @androidx.annotation.v
    int d() {
        return 0;
    }

    View.OnFocusChangeListener e() {
        return null;
    }

    View.OnClickListener f() {
        return null;
    }

    View.OnFocusChangeListener g() {
        return null;
    }

    androidx.core.view.accessibility.c.e h() {
        return null;
    }

    boolean i(int i10) {
        return true;
    }

    boolean j() {
        return false;
    }

    boolean k() {
        return false;
    }

    boolean l() {
        return false;
    }

    boolean m() {
        return false;
    }

    void n(@p0 EditText editText) {
    }

    void o(View view, @n0 androidx.core.view.accessibility.a0 a0Var) {
    }

    void p(View view, @n0 AccessibilityEvent accessibilityEvent) {
    }

    void q(boolean z10) {
    }

    final void r() {
        this.f55672b.A(false);
    }

    void s() {
    }

    boolean t() {
        return false;
    }

    void u() {
    }
}
