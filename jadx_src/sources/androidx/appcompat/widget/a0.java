package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import androidx.annotation.RestrictTo;
import androidx.core.view.c3;

/* JADX INFO: compiled from: DecorToolbar.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface a0 {
    void A(View view);

    void B();

    void C(Drawable drawable);

    void D(CharSequence charSequence);

    void E(int i10);

    Menu F();

    c3 G(int i10, long j10);

    ViewGroup H();

    void I(boolean z10);

    void J(int i10);

    void K(ScrollingTabContainerView scrollingTabContainerView);

    boolean L();

    void M(int i10);

    void N(androidx.appcompat.view.menu.m.a aVar, androidx.appcompat.view.menu.g.a aVar2);

    void O(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener);

    void P(SparseArray<Parcelable> sparseArray);

    CharSequence Q();

    void a(Drawable drawable);

    boolean b();

    boolean c();

    void collapseActionView();

    boolean d();

    boolean e();

    boolean f();

    boolean g();

    Context getContext();

    int getHeight();

    CharSequence getTitle();

    int getVisibility();

    boolean h();

    boolean i();

    boolean j();

    void k(int i10);

    void l(CharSequence charSequence);

    int m();

    void n(int i10);

    int o();

    void p(int i10);

    void q();

    int r();

    void s(boolean z10);

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setLogo(int i10);

    void setMenu(Menu menu, androidx.appcompat.view.menu.m.a aVar);

    void setMenuPrepared();

    void setTitle(CharSequence charSequence);

    void setVisibility(int i10);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t();

    View u();

    void v(Drawable drawable);

    void w(Drawable drawable);

    void x(SparseArray<Parcelable> sparseArray);

    void y(int i10);

    int z();
}
