package androidx.core.view.accessibility;

import android.annotation.SuppressLint;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.util.List;

/* JADX INFO: compiled from: AccessibilityRecordCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AccessibilityRecord f21442a;

    /* JADX INFO: compiled from: AccessibilityRecordCompat.java */
    @w0(15)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static int a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        @androidx.annotation.u
        static int b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        @androidx.annotation.u
        static void c(AccessibilityRecord accessibilityRecord, int i10) {
            accessibilityRecord.setMaxScrollX(i10);
        }

        @androidx.annotation.u
        static void d(AccessibilityRecord accessibilityRecord, int i10) {
            accessibilityRecord.setMaxScrollY(i10);
        }
    }

    /* JADX INFO: compiled from: AccessibilityRecordCompat.java */
    @w0(16)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static void a(AccessibilityRecord accessibilityRecord, View view, int i10) {
            accessibilityRecord.setSource(view, i10);
        }
    }

    @Deprecated
    public d0(Object obj) {
        this.f21442a = (AccessibilityRecord) obj;
    }

    @Deprecated
    public static d0 A(d0 d0Var) {
        return new d0(AccessibilityRecord.obtain(d0Var.f21442a));
    }

    public static void N(@n0 AccessibilityRecord accessibilityRecord, int i10) {
        a.c(accessibilityRecord, i10);
    }

    public static void P(@n0 AccessibilityRecord accessibilityRecord, int i10) {
        a.d(accessibilityRecord, i10);
    }

    public static void Y(@n0 AccessibilityRecord accessibilityRecord, @p0 View view, int i10) {
        b.a(accessibilityRecord, view, i10);
    }

    public static int j(@n0 AccessibilityRecord accessibilityRecord) {
        return a.a(accessibilityRecord);
    }

    public static int l(@n0 AccessibilityRecord accessibilityRecord) {
        return a.b(accessibilityRecord);
    }

    @Deprecated
    public static d0 z() {
        return new d0(AccessibilityRecord.obtain());
    }

    @Deprecated
    public void B() {
        this.f21442a.recycle();
    }

    @Deprecated
    public void C(int i10) {
        this.f21442a.setAddedCount(i10);
    }

    @Deprecated
    public void D(CharSequence charSequence) {
        this.f21442a.setBeforeText(charSequence);
    }

    @Deprecated
    public void E(boolean z10) {
        this.f21442a.setChecked(z10);
    }

    @Deprecated
    public void F(CharSequence charSequence) {
        this.f21442a.setClassName(charSequence);
    }

    @Deprecated
    public void G(CharSequence charSequence) {
        this.f21442a.setContentDescription(charSequence);
    }

    @Deprecated
    public void H(int i10) {
        this.f21442a.setCurrentItemIndex(i10);
    }

    @Deprecated
    public void I(boolean z10) {
        this.f21442a.setEnabled(z10);
    }

    @Deprecated
    public void J(int i10) {
        this.f21442a.setFromIndex(i10);
    }

    @Deprecated
    public void K(boolean z10) {
        this.f21442a.setFullScreen(z10);
    }

    @Deprecated
    public void L(int i10) {
        this.f21442a.setItemCount(i10);
    }

    @Deprecated
    public void M(int i10) {
        N(this.f21442a, i10);
    }

    @Deprecated
    public void O(int i10) {
        P(this.f21442a, i10);
    }

    @Deprecated
    public void Q(Parcelable parcelable) {
        this.f21442a.setParcelableData(parcelable);
    }

    @Deprecated
    public void R(boolean z10) {
        this.f21442a.setPassword(z10);
    }

    @Deprecated
    public void S(int i10) {
        this.f21442a.setRemovedCount(i10);
    }

    @Deprecated
    public void T(int i10) {
        this.f21442a.setScrollX(i10);
    }

    @Deprecated
    public void U(int i10) {
        this.f21442a.setScrollY(i10);
    }

    @Deprecated
    public void V(boolean z10) {
        this.f21442a.setScrollable(z10);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    public void W(View view) {
        this.f21442a.setSource(view);
    }

    @Deprecated
    public void X(View view, int i10) {
        Y(this.f21442a, view, i10);
    }

    @Deprecated
    public void Z(int i10) {
        this.f21442a.setToIndex(i10);
    }

    @Deprecated
    public int a() {
        return this.f21442a.getAddedCount();
    }

    @Deprecated
    public CharSequence b() {
        return this.f21442a.getBeforeText();
    }

    @Deprecated
    public CharSequence c() {
        return this.f21442a.getClassName();
    }

    @Deprecated
    public CharSequence d() {
        return this.f21442a.getContentDescription();
    }

    @Deprecated
    public int e() {
        return this.f21442a.getCurrentItemIndex();
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        AccessibilityRecord accessibilityRecord = this.f21442a;
        if (accessibilityRecord == null) {
            return d0Var.f21442a == null;
        }
        return accessibilityRecord.equals(d0Var.f21442a);
    }

    @Deprecated
    public int f() {
        return this.f21442a.getFromIndex();
    }

    @Deprecated
    public Object g() {
        return this.f21442a;
    }

    @Deprecated
    public int h() {
        return this.f21442a.getItemCount();
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.f21442a;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @Deprecated
    public int i() {
        return j(this.f21442a);
    }

    @Deprecated
    public int k() {
        return l(this.f21442a);
    }

    @Deprecated
    public Parcelable m() {
        return this.f21442a.getParcelableData();
    }

    @Deprecated
    public int n() {
        return this.f21442a.getRemovedCount();
    }

    @Deprecated
    public int o() {
        return this.f21442a.getScrollX();
    }

    @Deprecated
    public int p() {
        return this.f21442a.getScrollY();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    public a0 q() {
        return a0.h2(this.f21442a.getSource());
    }

    @Deprecated
    public List<CharSequence> r() {
        return this.f21442a.getText();
    }

    @Deprecated
    public int s() {
        return this.f21442a.getToIndex();
    }

    @Deprecated
    public int t() {
        return this.f21442a.getWindowId();
    }

    @Deprecated
    public boolean u() {
        return this.f21442a.isChecked();
    }

    @Deprecated
    public boolean v() {
        return this.f21442a.isEnabled();
    }

    @Deprecated
    public boolean w() {
        return this.f21442a.isFullScreen();
    }

    @Deprecated
    public boolean x() {
        return this.f21442a.isPassword();
    }

    @Deprecated
    public boolean y() {
        return this.f21442a.isScrollable();
    }
}
