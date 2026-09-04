package ng;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.annotation.l;
import androidx.annotation.n;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.x;
import com.scwang.smartrefresh.layout.constant.RefreshState;

/* JADX INFO: compiled from: RefreshLayout.java */
/* JADX INFO: loaded from: classes8.dex */
public interface j {
    j A(int i10);

    j B(@n0 View view, int i10, int i11);

    j C();

    j D(@n0 g gVar, int i10, int i11);

    j E(@x(from = com.google.android.material.color.utilities.d.f53848a, to = 10.0d) float f10);

    boolean F();

    j H(@n0 f fVar);

    j I();

    j J(@n0 Interpolator interpolator);

    j K(boolean z10);

    boolean L();

    j M(@n0 View view);

    j N(@n0 f fVar, int i10, int i11);

    j P();

    j Q(float f10);

    j R(float f10);

    j S(pg.d dVar);

    boolean T();

    j U(boolean z10);

    j V(boolean z10);

    j W(boolean z10);

    j X(boolean z10);

    j Y(float f10);

    j Z(int i10, boolean z10, Boolean bool);

    j a(boolean z10);

    j a0(pg.e eVar);

    j b(k kVar);

    j b0(boolean z10);

    j c(boolean z10);

    @Deprecated
    j c0(boolean z10);

    j d(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10);

    j d0(boolean z10);

    j e(boolean z10);

    j e0(@x(from = com.google.android.material.color.utilities.d.f53848a, to = 10.0d) float f10);

    j f(float f10);

    j f0(pg.b bVar);

    j g(boolean z10);

    boolean g0(int i10, int i11, float f10, boolean z10);

    @n0
    ViewGroup getLayout();

    @p0
    f getRefreshFooter();

    @p0
    g getRefreshHeader();

    @n0
    RefreshState getState();

    j h();

    j i(boolean z10);

    j i0(boolean z10);

    j k0(pg.c cVar);

    boolean l(int i10, int i11, float f10, boolean z10);

    j l0(int i10, boolean z10, boolean z11);

    j m(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10);

    j m0(@n0 g gVar);

    j n(boolean z10);

    j n0(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10);

    j o(@n int... iArr);

    j p(int i10);

    j q(boolean z10);

    j r(boolean z10);

    boolean s();

    j setNoMoreData(boolean z10);

    j setPrimaryColors(@l int... iArr);

    j t(boolean z10);

    j u(boolean z10);

    boolean v(int i10);

    j w();

    j x();

    j y(boolean z10);

    j z(int i10);
}
