package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.collection.j2;
import androidx.lifecycle.c1;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: FragmentController.java */
/* JADX INFO: loaded from: classes6.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t<?> f23809a;

    private r(t<?> tVar) {
        this.f23809a = tVar;
    }

    @androidx.annotation.n0
    public static r b(@androidx.annotation.n0 t<?> tVar) {
        return new r((t) androidx.core.util.o.m(tVar, "callbacks == null"));
    }

    @androidx.annotation.p0
    public Fragment A(@androidx.annotation.n0 String str) {
        return this.f23809a.f23854f.t0(str);
    }

    @androidx.annotation.n0
    public List<Fragment> B(@SuppressLint({"UnknownNullness"}) List<Fragment> list) {
        return this.f23809a.f23854f.A0();
    }

    public int C() {
        return this.f23809a.f23854f.z0();
    }

    @androidx.annotation.n0
    public FragmentManager D() {
        return this.f23809a.f23854f;
    }

    @SuppressLint({"UnknownNullness"})
    @Deprecated
    public androidx.loader.app.a E() {
        throw new UnsupportedOperationException("Loaders are managed separately from FragmentController, use LoaderManager.getInstance() to obtain a LoaderManager.");
    }

    public void F() {
        this.f23809a.f23854f.o1();
    }

    @androidx.annotation.p0
    public View G(@androidx.annotation.p0 View view, @androidx.annotation.n0 String str, @androidx.annotation.n0 Context context, @androidx.annotation.n0 AttributeSet attributeSet) {
        return this.f23809a.f23854f.L0().onCreateView(view, str, context, attributeSet);
    }

    @Deprecated
    public void H() {
    }

    @Deprecated
    public void I(@androidx.annotation.p0 Parcelable parcelable, @androidx.annotation.p0 g0 g0Var) {
        this.f23809a.f23854f.J1(parcelable, g0Var);
    }

    @Deprecated
    public void J(@androidx.annotation.p0 Parcelable parcelable, @androidx.annotation.p0 List<Fragment> list) {
        this.f23809a.f23854f.J1(parcelable, new g0(list, null, null));
    }

    @Deprecated
    public void K(@SuppressLint({"UnknownNullness"}) j2<String, androidx.loader.app.a> j2Var) {
    }

    @Deprecated
    public void L(@androidx.annotation.p0 Parcelable parcelable) {
        t<?> tVar = this.f23809a;
        if (!(tVar instanceof c1)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        tVar.f23854f.M1(parcelable);
    }

    @androidx.annotation.p0
    @Deprecated
    public j2<String, androidx.loader.app.a> M() {
        return null;
    }

    @androidx.annotation.p0
    @Deprecated
    public g0 N() {
        return this.f23809a.f23854f.O1();
    }

    @androidx.annotation.p0
    @Deprecated
    public List<Fragment> O() {
        g0 g0VarO1 = this.f23809a.f23854f.O1();
        if (g0VarO1 == null || g0VarO1.b() == null) {
            return null;
        }
        return new ArrayList(g0VarO1.b());
    }

    @androidx.annotation.p0
    @Deprecated
    public Parcelable P() {
        return this.f23809a.f23854f.Q1();
    }

    public void a(@androidx.annotation.p0 Fragment fragment) {
        t<?> tVar = this.f23809a;
        tVar.f23854f.s(tVar, tVar, fragment);
    }

    public void c() {
        this.f23809a.f23854f.F();
    }

    @Deprecated
    public void d(@androidx.annotation.n0 Configuration configuration) {
        this.f23809a.f23854f.H(configuration, true);
    }

    public boolean e(@androidx.annotation.n0 MenuItem menuItem) {
        return this.f23809a.f23854f.I(menuItem);
    }

    public void f() {
        this.f23809a.f23854f.J();
    }

    @Deprecated
    public boolean g(@androidx.annotation.n0 Menu menu, @androidx.annotation.n0 MenuInflater menuInflater) {
        return this.f23809a.f23854f.K(menu, menuInflater);
    }

    public void h() {
        this.f23809a.f23854f.L();
    }

    public void i() {
        this.f23809a.f23854f.M();
    }

    @Deprecated
    public void j() {
        this.f23809a.f23854f.N(true);
    }

    @Deprecated
    public void k(boolean z10) {
        this.f23809a.f23854f.O(z10, true);
    }

    @Deprecated
    public boolean l(@androidx.annotation.n0 MenuItem menuItem) {
        return this.f23809a.f23854f.R(menuItem);
    }

    @Deprecated
    public void m(@androidx.annotation.n0 Menu menu) {
        this.f23809a.f23854f.S(menu);
    }

    public void n() {
        this.f23809a.f23854f.U();
    }

    @Deprecated
    public void o(boolean z10) {
        this.f23809a.f23854f.V(z10, true);
    }

    @Deprecated
    public boolean p(@androidx.annotation.n0 Menu menu) {
        return this.f23809a.f23854f.W(menu);
    }

    @Deprecated
    public void q() {
    }

    public void r() {
        this.f23809a.f23854f.Y();
    }

    public void s() {
        this.f23809a.f23854f.Z();
    }

    public void t() {
        this.f23809a.f23854f.b0();
    }

    @Deprecated
    public void u() {
    }

    @Deprecated
    public void v() {
    }

    @Deprecated
    public void w() {
    }

    @Deprecated
    public void x(boolean z10) {
    }

    @Deprecated
    public void y(@androidx.annotation.n0 String str, @androidx.annotation.p0 FileDescriptor fileDescriptor, @androidx.annotation.n0 PrintWriter printWriter, @androidx.annotation.p0 String[] strArr) {
    }

    public boolean z() {
        return this.f23809a.f23854f.j0(true);
    }
}
