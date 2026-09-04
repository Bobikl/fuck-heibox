package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.view.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: FlexboxHelper.java */
/* JADX INFO: loaded from: classes7.dex */
public class h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f52254f = 10;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f52255g = 4294967295L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ boolean f52256h = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f52257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean[] f52258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    int[] f52259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    long[] f52260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private long[] f52261e;

    /* JADX INFO: compiled from: FlexboxHelper.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        List<f> f52262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f52263b;

        b() {
        }

        void a() {
            this.f52262a = null;
            this.f52263b = 0;
        }
    }

    /* JADX INFO: compiled from: FlexboxHelper.java */
    public static class c implements Comparable<c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f52264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f52265c;

        private c() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(@n0 c cVar) {
            int i10 = this.f52265c;
            int i11 = cVar.f52265c;
            return i10 != i11 ? i10 - i11 : this.f52264b - cVar.f52264b;
        }

        @n0
        public String toString() {
            return "Order{order=" + this.f52265c + ", index=" + this.f52264b + '}';
        }
    }

    h(d dVar) {
        this.f52257a = dVar;
    }

    private int A(int i10, FlexItem flexItem, int i11) {
        d dVar = this.f52257a;
        int iH = dVar.h(i10, dVar.getPaddingLeft() + this.f52257a.getPaddingRight() + flexItem.A1() + flexItem.K1() + i11, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(iH);
        if (size > flexItem.m1()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.m1(), View.MeasureSpec.getMode(iH));
        }
        return size < flexItem.x() ? View.MeasureSpec.makeMeasureSpec(flexItem.x(), View.MeasureSpec.getMode(iH)) : iH;
    }

    private int B(FlexItem flexItem, boolean z10) {
        return z10 ? flexItem.h0() : flexItem.K1();
    }

    private int C(FlexItem flexItem, boolean z10) {
        return z10 ? flexItem.K1() : flexItem.h0();
    }

    private int D(FlexItem flexItem, boolean z10) {
        return z10 ? flexItem.R() : flexItem.A1();
    }

    private int E(FlexItem flexItem, boolean z10) {
        return z10 ? flexItem.A1() : flexItem.R();
    }

    private int F(FlexItem flexItem, boolean z10) {
        return z10 ? flexItem.getHeight() : flexItem.getWidth();
    }

    private int G(FlexItem flexItem, boolean z10) {
        return z10 ? flexItem.getWidth() : flexItem.getHeight();
    }

    private int H(boolean z10) {
        return z10 ? this.f52257a.getPaddingBottom() : this.f52257a.getPaddingEnd();
    }

    private int I(boolean z10) {
        return z10 ? this.f52257a.getPaddingEnd() : this.f52257a.getPaddingBottom();
    }

    private int J(boolean z10) {
        return z10 ? this.f52257a.getPaddingTop() : this.f52257a.getPaddingStart();
    }

    private int K(boolean z10) {
        return z10 ? this.f52257a.getPaddingStart() : this.f52257a.getPaddingTop();
    }

    private int L(View view, boolean z10) {
        return z10 ? view.getMeasuredHeight() : view.getMeasuredWidth();
    }

    private int M(View view, boolean z10) {
        return z10 ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    private boolean N(int i10, int i11, f fVar) {
        return i10 == i11 - 1 && fVar.d() != 0;
    }

    private boolean P(View view, int i10, int i11, int i12, int i13, FlexItem flexItem, int i14, int i15, int i16) {
        if (this.f52257a.getFlexWrap() == 0) {
            return false;
        }
        if (flexItem.e1()) {
            return true;
        }
        if (i10 == 0) {
            return false;
        }
        int maxLine = this.f52257a.getMaxLine();
        if (maxLine != -1 && maxLine <= i16 + 1) {
            return false;
        }
        int iF = this.f52257a.f(view, i14, i15);
        if (iF > 0) {
            i13 += iF;
        }
        return i11 < i12 + i13;
    }

    private void T(int i10, int i11, f fVar, int i12, int i13, boolean z10) {
        int i14;
        int i15;
        int iMax;
        int i16 = fVar.f52237e;
        float f10 = fVar.f52243k;
        float f11 = 0.0f;
        if (f10 <= 0.0f || i12 > i16) {
            return;
        }
        float f12 = (i16 - i12) / f10;
        fVar.f52237e = i13 + fVar.f52238f;
        if (!z10) {
            fVar.f52239g = Integer.MIN_VALUE;
        }
        int i17 = 0;
        boolean z11 = false;
        int i18 = 0;
        float f13 = 0.0f;
        while (i17 < fVar.f52240h) {
            int i19 = fVar.f52247o + i17;
            View viewE = this.f52257a.e(i19);
            if (viewE == null || viewE.getVisibility() == 8) {
                i14 = i16;
                i15 = i17;
            } else {
                FlexItem flexItem = (FlexItem) viewE.getLayoutParams();
                int flexDirection = this.f52257a.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    i14 = i16;
                    int i20 = i17;
                    int measuredWidth = viewE.getMeasuredWidth();
                    long[] jArr = this.f52261e;
                    if (jArr != null) {
                        measuredWidth = y(jArr[i19]);
                    }
                    int measuredHeight = viewE.getMeasuredHeight();
                    long[] jArr2 = this.f52261e;
                    if (jArr2 != null) {
                        measuredHeight = x(jArr2[i19]);
                    }
                    if (this.f52258b[i19] || flexItem.H0() <= 0.0f) {
                        i15 = i20;
                    } else {
                        float fH0 = measuredWidth - (flexItem.H0() * f12);
                        if (i15 == fVar.f52240h - 1) {
                            i15 = i20;
                            fH0 += f13;
                            f13 = 0.0f;
                        }
                        i15 = i20;
                        int iRound = Math.round(fH0);
                        if (iRound < flexItem.x()) {
                            iRound = flexItem.x();
                            this.f52258b[i19] = true;
                            fVar.f52243k -= flexItem.H0();
                            z11 = true;
                        } else {
                            f13 += fH0 - iRound;
                            double d10 = f13;
                            if (d10 > 1.0d) {
                                iRound++;
                                f13 -= 1.0f;
                            } else if (d10 < -1.0d) {
                                iRound--;
                                f13 += 1.0f;
                            }
                        }
                        int iZ = z(i11, flexItem, fVar.f52245m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewE.measure(iMakeMeasureSpec, iZ);
                        int measuredWidth2 = viewE.getMeasuredWidth();
                        int measuredHeight2 = viewE.getMeasuredHeight();
                        Z(i19, iMakeMeasureSpec, iZ, viewE);
                        this.f52257a.j(i19, viewE);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i18, measuredHeight + flexItem.R() + flexItem.h0() + this.f52257a.d(viewE));
                    fVar.f52237e += measuredWidth + flexItem.A1() + flexItem.K1();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewE.getMeasuredHeight();
                    long[] jArr3 = this.f52261e;
                    if (jArr3 != null) {
                        measuredHeight3 = x(jArr3[i19]);
                    }
                    int measuredWidth3 = viewE.getMeasuredWidth();
                    long[] jArr4 = this.f52261e;
                    if (jArr4 != null) {
                        measuredWidth3 = y(jArr4[i19]);
                    }
                    if (this.f52258b[i19] || flexItem.H0() <= f11) {
                        i14 = i16;
                        i15 = i17;
                    } else {
                        float fH1 = measuredHeight3 - (flexItem.H0() * f12);
                        if (i17 == fVar.f52240h - 1) {
                            fH1 += f13;
                            f13 = f11;
                        }
                        int iRound2 = Math.round(fH1);
                        if (iRound2 < flexItem.L1()) {
                            iRound2 = flexItem.L1();
                            this.f52258b[i19] = true;
                            fVar.f52243k -= flexItem.H0();
                            i14 = i16;
                            i15 = i17;
                            z11 = true;
                        } else {
                            f13 += fH1 - iRound2;
                            i14 = i16;
                            i15 = i17;
                            double d11 = f13;
                            if (d11 > 1.0d) {
                                iRound2++;
                                f13 -= 1.0f;
                            } else if (d11 < -1.0d) {
                                iRound2--;
                                f13 += 1.0f;
                            }
                        }
                        int iA = A(i10, flexItem, fVar.f52245m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewE.measure(iA, iMakeMeasureSpec2);
                        measuredWidth3 = viewE.getMeasuredWidth();
                        int measuredHeight4 = viewE.getMeasuredHeight();
                        Z(i19, iA, iMakeMeasureSpec2, viewE);
                        this.f52257a.j(i19, viewE);
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i18, measuredWidth3 + flexItem.A1() + flexItem.K1() + this.f52257a.d(viewE));
                    fVar.f52237e += measuredHeight3 + flexItem.R() + flexItem.h0();
                }
                fVar.f52239g = Math.max(fVar.f52239g, iMax);
                i18 = iMax;
            }
            i17 = i15 + 1;
            i16 = i14;
            f11 = 0.0f;
        }
        int i21 = i16;
        if (!z11 || i21 == fVar.f52237e) {
            return;
        }
        T(i10, i11, fVar, i12, i13, true);
    }

    private int[] U(int i10, List<c> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i10];
        int i11 = 0;
        for (c cVar : list) {
            int i12 = cVar.f52264b;
            iArr[i11] = i12;
            sparseIntArray.append(i12, cVar.f52265c);
            i11++;
        }
        return iArr;
    }

    private void V(View view, int i10, int i11) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i10 - flexItem.A1()) - flexItem.K1()) - this.f52257a.d(view), flexItem.x()), flexItem.m1());
        long[] jArr = this.f52261e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? x(jArr[i11]) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        Z(i11, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        this.f52257a.j(i11, view);
    }

    private void W(View view, int i10, int i11) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i10 - flexItem.R()) - flexItem.h0()) - this.f52257a.d(view), flexItem.L1()), flexItem.S1());
        long[] jArr = this.f52261e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? y(jArr[i11]) : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        Z(i11, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        this.f52257a.j(i11, view);
    }

    private void Z(int i10, int i11, int i12, View view) {
        long[] jArr = this.f52260d;
        if (jArr != null) {
            jArr[i10] = S(i11, i12);
        }
        long[] jArr2 = this.f52261e;
        if (jArr2 != null) {
            jArr2[i10] = S(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    private void a(List<f> list, f fVar, int i10, int i11) {
        fVar.f52245m = i11;
        this.f52257a.i(fVar);
        fVar.f52248p = i10;
        list.add(fVar);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    private void i(View view, int i10) {
        boolean z10;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z11 = true;
        if (measuredWidth >= flexItem.x()) {
            if (measuredWidth > flexItem.m1()) {
                measuredWidth = flexItem.m1();
            } else {
                z10 = false;
            }
            if (measuredHeight < flexItem.L1()) {
                measuredHeight = flexItem.L1();
            } else if (measuredHeight > flexItem.S1()) {
                measuredHeight = flexItem.S1();
            } else {
                z11 = z10;
            }
            if (z11) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                Z(i10, iMakeMeasureSpec, iMakeMeasureSpec2, view);
                this.f52257a.j(i10, view);
            }
        }
        measuredWidth = flexItem.x();
        z10 = true;
        if (measuredHeight < flexItem.L1()) {
            measuredHeight = flexItem.L1();
        } else if (measuredHeight > flexItem.S1()) {
            measuredHeight = flexItem.S1();
        } else {
            z11 = z10;
        }
        if (z11) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            Z(i10, iMakeMeasureSpec3, iMakeMeasureSpec4, view);
            this.f52257a.j(i10, view);
        }
    }

    private List<f> k(List<f> list, int i10, int i11) {
        int i12 = (i10 - i11) / 2;
        ArrayList arrayList = new ArrayList();
        f fVar = new f();
        fVar.f52239g = i12;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (i13 == 0) {
                arrayList.add(fVar);
            }
            arrayList.add(list.get(i13));
            if (i13 == list.size() - 1) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }

    @n0
    private List<c> l(int i10) {
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            FlexItem flexItem = (FlexItem) this.f52257a.b(i11).getLayoutParams();
            c cVar = new c();
            cVar.f52265c = flexItem.getOrder();
            cVar.f52264b = i11;
            arrayList.add(cVar);
        }
        return arrayList;
    }

    private void r(int i10) {
        boolean[] zArr = this.f52258b;
        if (zArr == null) {
            if (i10 < 10) {
                i10 = 10;
            }
            this.f52258b = new boolean[i10];
        } else {
            if (zArr.length >= i10) {
                Arrays.fill(zArr, false);
                return;
            }
            int length = zArr.length * 2;
            if (length >= i10) {
                i10 = length;
            }
            this.f52258b = new boolean[i10];
        }
    }

    private void v(CompoundButton compoundButton) {
        FlexItem flexItem = (FlexItem) compoundButton.getLayoutParams();
        int iX = flexItem.x();
        int iL1 = flexItem.L1();
        Drawable drawableA = androidx.core.widget.d.a(compoundButton);
        int minimumWidth = drawableA == null ? 0 : drawableA.getMinimumWidth();
        int minimumHeight = drawableA != null ? drawableA.getMinimumHeight() : 0;
        if (iX == -1) {
            iX = minimumWidth;
        }
        flexItem.z1(iX);
        if (iL1 == -1) {
            iL1 = minimumHeight;
        }
        flexItem.R0(iL1);
    }

    private void w(int i10, int i11, f fVar, int i12, int i13, boolean z10) {
        int i14;
        int i15;
        int iMax;
        double d10;
        int i16;
        double d11;
        float f10 = fVar.f52242j;
        float f11 = 0.0f;
        if (f10 <= 0.0f || i12 < (i14 = fVar.f52237e)) {
            return;
        }
        float f12 = (i12 - i14) / f10;
        fVar.f52237e = i13 + fVar.f52238f;
        if (!z10) {
            fVar.f52239g = Integer.MIN_VALUE;
        }
        int i17 = 0;
        boolean z11 = false;
        int i18 = 0;
        float f13 = 0.0f;
        while (i17 < fVar.f52240h) {
            int i19 = fVar.f52247o + i17;
            View viewE = this.f52257a.e(i19);
            if (viewE == null || viewE.getVisibility() == 8) {
                i15 = i14;
            } else {
                FlexItem flexItem = (FlexItem) viewE.getLayoutParams();
                int flexDirection = this.f52257a.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    int i20 = i14;
                    int measuredWidth = viewE.getMeasuredWidth();
                    long[] jArr = this.f52261e;
                    if (jArr != null) {
                        measuredWidth = y(jArr[i19]);
                    }
                    int measuredHeight = viewE.getMeasuredHeight();
                    long[] jArr2 = this.f52261e;
                    i15 = i20;
                    if (jArr2 != null) {
                        measuredHeight = x(jArr2[i19]);
                    }
                    if (!this.f52258b[i19] && flexItem.X0() > 0.0f) {
                        float fX0 = measuredWidth + (flexItem.X0() * f12);
                        if (i17 == fVar.f52240h - 1) {
                            fX0 += f13;
                            f13 = 0.0f;
                        }
                        int iRound = Math.round(fX0);
                        if (iRound > flexItem.m1()) {
                            iRound = flexItem.m1();
                            this.f52258b[i19] = true;
                            fVar.f52242j -= flexItem.X0();
                            z11 = true;
                        } else {
                            f13 += fX0 - iRound;
                            double d12 = f13;
                            if (d12 > 1.0d) {
                                iRound++;
                                d10 = d12 - 1.0d;
                            } else if (d12 < -1.0d) {
                                iRound--;
                                d10 = d12 + 1.0d;
                            }
                            f13 = (float) d10;
                        }
                        int iZ = z(i11, flexItem, fVar.f52245m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewE.measure(iMakeMeasureSpec, iZ);
                        int measuredWidth2 = viewE.getMeasuredWidth();
                        int measuredHeight2 = viewE.getMeasuredHeight();
                        Z(i19, iMakeMeasureSpec, iZ, viewE);
                        this.f52257a.j(i19, viewE);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i18, measuredHeight + flexItem.R() + flexItem.h0() + this.f52257a.d(viewE));
                    fVar.f52237e += measuredWidth + flexItem.A1() + flexItem.K1();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewE.getMeasuredHeight();
                    long[] jArr3 = this.f52261e;
                    if (jArr3 != null) {
                        measuredHeight3 = x(jArr3[i19]);
                    }
                    int measuredWidth3 = viewE.getMeasuredWidth();
                    long[] jArr4 = this.f52261e;
                    if (jArr4 != null) {
                        measuredWidth3 = y(jArr4[i19]);
                    }
                    if (this.f52258b[i19] || flexItem.X0() <= f11) {
                        i16 = i14;
                    } else {
                        float fX1 = measuredHeight3 + (flexItem.X0() * f12);
                        if (i17 == fVar.f52240h - 1) {
                            fX1 += f13;
                            f13 = f11;
                        }
                        int iRound2 = Math.round(fX1);
                        if (iRound2 > flexItem.S1()) {
                            iRound2 = flexItem.S1();
                            this.f52258b[i19] = true;
                            fVar.f52242j -= flexItem.X0();
                            i16 = i14;
                            z11 = true;
                        } else {
                            f13 += fX1 - iRound2;
                            i16 = i14;
                            double d13 = f13;
                            if (d13 > 1.0d) {
                                iRound2++;
                                d11 = d13 - 1.0d;
                            } else if (d13 < -1.0d) {
                                iRound2--;
                                d11 = d13 + 1.0d;
                            }
                            f13 = (float) d11;
                        }
                        int iA = A(i10, flexItem, fVar.f52245m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewE.measure(iA, iMakeMeasureSpec2);
                        measuredWidth3 = viewE.getMeasuredWidth();
                        int measuredHeight4 = viewE.getMeasuredHeight();
                        Z(i19, iA, iMakeMeasureSpec2, viewE);
                        this.f52257a.j(i19, viewE);
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i18, measuredWidth3 + flexItem.A1() + flexItem.K1() + this.f52257a.d(viewE));
                    fVar.f52237e += measuredHeight3 + flexItem.R() + flexItem.h0();
                    i15 = i16;
                }
                fVar.f52239g = Math.max(fVar.f52239g, iMax);
                i18 = iMax;
            }
            i17++;
            i14 = i15;
            f11 = 0.0f;
        }
        int i21 = i14;
        if (!z11 || i21 == fVar.f52237e) {
            return;
        }
        w(i10, i11, fVar, i12, i13, true);
    }

    private int z(int i10, FlexItem flexItem, int i11) {
        d dVar = this.f52257a;
        int iC = dVar.c(i10, dVar.getPaddingTop() + this.f52257a.getPaddingBottom() + flexItem.R() + flexItem.h0() + i11, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(iC);
        if (size > flexItem.S1()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.S1(), View.MeasureSpec.getMode(iC));
        }
        return size < flexItem.L1() ? View.MeasureSpec.makeMeasureSpec(flexItem.L1(), View.MeasureSpec.getMode(iC)) : iC;
    }

    boolean O(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f52257a.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i10 = 0; i10 < flexItemCount; i10++) {
            View viewB = this.f52257a.b(i10);
            if (viewB != null && ((FlexItem) viewB.getLayoutParams()).getOrder() != sparseIntArray.get(i10)) {
                return true;
            }
        }
        return false;
    }

    void Q(View view, f fVar, int i10, int i11, int i12, int i13) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f52257a.getAlignItems();
        if (flexItem.E0() != -1) {
            alignItems = flexItem.E0();
        }
        int i14 = fVar.f52239g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.f52257a.getFlexWrap() == 2) {
                    view.layout(i10, (i11 - i14) + view.getMeasuredHeight() + flexItem.R(), i12, (i13 - i14) + view.getMeasuredHeight() + flexItem.R());
                    return;
                } else {
                    int i15 = i11 + i14;
                    view.layout(i10, (i15 - view.getMeasuredHeight()) - flexItem.h0(), i12, i15 - flexItem.h0());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i14 - view.getMeasuredHeight()) + flexItem.R()) - flexItem.h0()) / 2;
                if (this.f52257a.getFlexWrap() != 2) {
                    int i16 = i11 + measuredHeight;
                    view.layout(i10, i16, i12, view.getMeasuredHeight() + i16);
                    return;
                } else {
                    int i17 = i11 - measuredHeight;
                    view.layout(i10, i17, i12, view.getMeasuredHeight() + i17);
                    return;
                }
            }
            if (alignItems == 3) {
                if (this.f52257a.getFlexWrap() != 2) {
                    int iMax = Math.max(fVar.f52244l - view.getBaseline(), flexItem.R());
                    view.layout(i10, i11 + iMax, i12, i13 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max((fVar.f52244l - view.getMeasuredHeight()) + view.getBaseline(), flexItem.h0());
                    view.layout(i10, i11 - iMax2, i12, i13 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.f52257a.getFlexWrap() != 2) {
            view.layout(i10, i11 + flexItem.R(), i12, i13 + flexItem.R());
        } else {
            view.layout(i10, i11 - flexItem.h0(), i12, i13 - flexItem.h0());
        }
    }

    void R(View view, f fVar, boolean z10, int i10, int i11, int i12, int i13) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f52257a.getAlignItems();
        if (flexItem.E0() != -1) {
            alignItems = flexItem.E0();
        }
        int i14 = fVar.f52239g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (z10) {
                    view.layout((i10 - i14) + view.getMeasuredWidth() + flexItem.A1(), i11, (i12 - i14) + view.getMeasuredWidth() + flexItem.A1(), i13);
                    return;
                } else {
                    view.layout(((i10 + i14) - view.getMeasuredWidth()) - flexItem.K1(), i11, ((i12 + i14) - view.getMeasuredWidth()) - flexItem.K1(), i13);
                    return;
                }
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i14 - view.getMeasuredWidth()) + s.c(marginLayoutParams)) - s.b(marginLayoutParams)) / 2;
                if (z10) {
                    view.layout(i10 - measuredWidth, i11, i12 - measuredWidth, i13);
                    return;
                } else {
                    view.layout(i10 + measuredWidth, i11, i12 + measuredWidth, i13);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (z10) {
            view.layout(i10 - flexItem.K1(), i11, i12 - flexItem.K1(), i13);
        } else {
            view.layout(i10 + flexItem.A1(), i11, i12 + flexItem.A1(), i13);
        }
    }

    @j1
    long S(int i10, int i11) {
        return (((long) i10) & 4294967295L) | (((long) i11) << 32);
    }

    void X() {
        Y(0);
    }

    void Y(int i10) {
        View viewE;
        if (i10 >= this.f52257a.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.f52257a.getFlexDirection();
        if (this.f52257a.getAlignItems() != 4) {
            for (f fVar : this.f52257a.getFlexLinesInternal()) {
                for (Integer num : fVar.f52246n) {
                    View viewE2 = this.f52257a.e(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        W(viewE2, fVar.f52239g, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                        }
                        V(viewE2, fVar.f52239g, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.f52259c;
        List<f> flexLinesInternal = this.f52257a.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i11 = iArr != null ? iArr[i10] : 0; i11 < size; i11++) {
            f fVar2 = flexLinesInternal.get(i11);
            int i12 = fVar2.f52240h;
            for (int i13 = 0; i13 < i12; i13++) {
                int i14 = fVar2.f52247o + i13;
                if (i13 < this.f52257a.getFlexItemCount() && (viewE = this.f52257a.e(i14)) != null && viewE.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) viewE.getLayoutParams();
                    if (flexItem.E0() == -1 || flexItem.E0() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            W(viewE, fVar2.f52239g, i14);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                            }
                            V(viewE, fVar2.f52239g, i14);
                        }
                    }
                }
            }
        }
    }

    void b(b bVar, int i10, int i11, int i12, int i13, int i14, @p0 List<f> list) {
        int i15;
        int i16;
        List<f> list2;
        int i17;
        View view;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23 = i11;
        int i24 = i14;
        boolean zK = this.f52257a.k();
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        List<f> arrayList = list == null ? new ArrayList() : list;
        bVar.f52262a = arrayList;
        boolean z10 = i24 == -1;
        int iK = K(zK);
        int I = I(zK);
        int iJ = J(zK);
        int iH = H(zK);
        f fVar = new f();
        int i25 = i13;
        fVar.f52247o = i25;
        int i26 = I + iK;
        fVar.f52237e = i26;
        int flexItemCount = this.f52257a.getFlexItemCount();
        boolean z11 = z10;
        int i27 = Integer.MIN_VALUE;
        int i28 = 0;
        int iCombineMeasuredStates = 0;
        int i29 = 0;
        while (i25 < flexItemCount) {
            View viewE = this.f52257a.e(i25);
            if (viewE != null) {
                if (viewE.getVisibility() == 8) {
                    fVar.f52241i++;
                    fVar.f52240h++;
                    if (N(i25, flexItemCount, fVar)) {
                        a(arrayList, fVar, i25, i28);
                    }
                } else {
                    if (viewE instanceof CompoundButton) {
                        v((CompoundButton) viewE);
                    }
                    FlexItem flexItem = (FlexItem) viewE.getLayoutParams();
                    int i30 = flexItemCount;
                    if (flexItem.E0() == 4) {
                        fVar.f52246n.add(Integer.valueOf(i25));
                    }
                    int iG = G(flexItem, zK);
                    if (flexItem.Z0() != -1.0f && mode == 1073741824) {
                        iG = Math.round(size * flexItem.Z0());
                    }
                    if (zK) {
                        int iH2 = this.f52257a.h(i10, i26 + E(flexItem, true) + C(flexItem, true), iG);
                        int iC = this.f52257a.c(i23, iJ + iH + D(flexItem, true) + B(flexItem, true) + i28, F(flexItem, true));
                        viewE.measure(iH2, iC);
                        Z(i25, iH2, iC, viewE);
                        i16 = iH2;
                    } else {
                        int iH3 = this.f52257a.h(i23, iJ + iH + D(flexItem, false) + B(flexItem, false) + i28, F(flexItem, false));
                        int iC2 = this.f52257a.c(i10, E(flexItem, false) + i26 + C(flexItem, false), iG);
                        viewE.measure(iH3, iC2);
                        Z(i25, iH3, iC2, viewE);
                        i16 = iC2;
                    }
                    this.f52257a.j(i25, viewE);
                    i(viewE, i25);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewE.getMeasuredState());
                    int i31 = fVar.f52237e;
                    int i32 = i28;
                    int i33 = i26;
                    f fVar2 = fVar;
                    int i34 = size;
                    int i35 = i25;
                    list2 = arrayList;
                    int i36 = i16;
                    if (P(viewE, mode, i34, i31, C(flexItem, zK) + M(viewE, zK) + E(flexItem, zK), flexItem, i35, i29, arrayList.size())) {
                        if (fVar2.d() > 0) {
                            a(list2, fVar2, i35 > 0 ? i35 - 1 : 0, i32);
                            i28 = fVar2.f52239g + i32;
                        } else {
                            i28 = i32;
                        }
                        if (!zK) {
                            i17 = i11;
                            view = viewE;
                            i25 = i35;
                            if (flexItem.getWidth() == -1) {
                                d dVar = this.f52257a;
                                view.measure(dVar.h(i17, dVar.getPaddingLeft() + this.f52257a.getPaddingRight() + flexItem.A1() + flexItem.K1() + i28, flexItem.getWidth()), i36);
                                i(view, i25);
                            }
                        } else if (flexItem.getHeight() == -1) {
                            d dVar2 = this.f52257a;
                            i17 = i11;
                            i25 = i35;
                            view = viewE;
                            view.measure(i36, dVar2.c(i17, dVar2.getPaddingTop() + this.f52257a.getPaddingBottom() + flexItem.R() + flexItem.h0() + i28, flexItem.getHeight()));
                            i(view, i25);
                        } else {
                            i17 = i11;
                            view = viewE;
                            i25 = i35;
                        }
                        fVar = new f();
                        fVar.f52240h = 1;
                        i18 = i33;
                        fVar.f52237e = i18;
                        fVar.f52247o = i25;
                        i20 = Integer.MIN_VALUE;
                        i19 = 0;
                    } else {
                        i17 = i11;
                        view = viewE;
                        i25 = i35;
                        fVar = fVar2;
                        i18 = i33;
                        fVar.f52240h++;
                        i19 = i29 + 1;
                        i28 = i32;
                        i20 = i27;
                    }
                    fVar.f52249q |= flexItem.X0() != 0.0f;
                    fVar.f52250r |= flexItem.H0() != 0.0f;
                    int[] iArr = this.f52259c;
                    if (iArr != null) {
                        iArr[i25] = list2.size();
                    }
                    fVar.f52237e += M(view, zK) + E(flexItem, zK) + C(flexItem, zK);
                    fVar.f52242j += flexItem.X0();
                    fVar.f52243k += flexItem.H0();
                    this.f52257a.a(view, i25, i19, fVar);
                    int iMax = Math.max(i20, L(view, zK) + D(flexItem, zK) + B(flexItem, zK) + this.f52257a.d(view));
                    fVar.f52239g = Math.max(fVar.f52239g, iMax);
                    if (zK) {
                        if (this.f52257a.getFlexWrap() != 2) {
                            fVar.f52244l = Math.max(fVar.f52244l, view.getBaseline() + flexItem.R());
                        } else {
                            fVar.f52244l = Math.max(fVar.f52244l, (view.getMeasuredHeight() - view.getBaseline()) + flexItem.h0());
                        }
                    }
                    i21 = i30;
                    if (N(i25, i21, fVar)) {
                        a(list2, fVar, i25, i28);
                        i28 += fVar.f52239g;
                    }
                    i22 = i14;
                    if (i22 != -1 && list2.size() > 0) {
                        if (list2.get(list2.size() - 1).f52248p >= i22 && i25 >= i22 && !z11) {
                            i28 = -fVar.a();
                            z11 = true;
                        }
                        if (i28 <= i12 && z11) {
                            i15 = iCombineMeasuredStates;
                            bVar.f52263b = i15;
                        } else {
                            i29 = i19;
                            i27 = iMax;
                        }
                    }
                    if (i28 <= i12) {
                    }
                    i29 = i19;
                    i27 = iMax;
                }
                i25++;
                flexItemCount = i21;
                i23 = i17;
                i26 = i18;
                arrayList = list2;
                mode = mode;
                i24 = i22;
                size = size;
            } else if (N(i25, flexItemCount, fVar)) {
                a(arrayList, fVar, i25, i28);
            }
            size = size;
            mode = mode;
            i17 = i23;
            i22 = i24;
            list2 = arrayList;
            i18 = i26;
            i21 = flexItemCount;
            i25++;
            flexItemCount = i21;
            i23 = i17;
            i26 = i18;
            arrayList = list2;
            mode = mode;
            i24 = i22;
            size = size;
        }
        i15 = iCombineMeasuredStates;
        bVar.f52263b = i15;
    }

    void c(b bVar, int i10, int i11) {
        b(bVar, i10, i11, Integer.MAX_VALUE, 0, -1, null);
    }

    void d(b bVar, int i10, int i11, int i12, int i13, @p0 List<f> list) {
        b(bVar, i10, i11, i12, i13, -1, list);
    }

    void e(b bVar, int i10, int i11, int i12, int i13, List<f> list) {
        b(bVar, i10, i11, i12, 0, i13, list);
    }

    void f(b bVar, int i10, int i11) {
        b(bVar, i11, i10, Integer.MAX_VALUE, 0, -1, null);
    }

    void g(b bVar, int i10, int i11, int i12, int i13, @p0 List<f> list) {
        b(bVar, i11, i10, i12, i13, -1, list);
    }

    void h(b bVar, int i10, int i11, int i12, int i13, List<f> list) {
        b(bVar, i11, i10, i12, 0, i13, list);
    }

    void j(List<f> list, int i10) {
        int i11 = this.f52259c[i10];
        if (i11 == -1) {
            i11 = 0;
        }
        for (int size = list.size() - 1; size >= i11; size--) {
            list.remove(size);
        }
        int[] iArr = this.f52259c;
        int length = iArr.length - 1;
        if (i10 > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i10, length, -1);
        }
        long[] jArr = this.f52260d;
        int length2 = jArr.length - 1;
        if (i10 > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i10, length2, 0L);
        }
    }

    int[] m(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f52257a.getFlexItemCount();
        return U(flexItemCount, l(flexItemCount), sparseIntArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    int[] n(View view, int i10, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.f52257a.getFlexItemCount();
        List<c> listL = l(flexItemCount);
        c cVar = new c();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            cVar.f52265c = 1;
        } else {
            cVar.f52265c = ((FlexItem) layoutParams).getOrder();
        }
        if (i10 == -1 || i10 == flexItemCount || i10 >= this.f52257a.getFlexItemCount()) {
            cVar.f52264b = flexItemCount;
        } else {
            cVar.f52264b = i10;
            while (i10 < flexItemCount) {
                listL.get(i10).f52264b++;
                i10++;
            }
        }
        listL.add(cVar);
        return U(flexItemCount + 1, listL, sparseIntArray);
    }

    void o(int i10, int i11, int i12) {
        int mode;
        int size;
        int flexDirection = this.f52257a.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode2 = View.MeasureSpec.getMode(i11);
            int size2 = View.MeasureSpec.getSize(i11);
            mode = mode2;
            size = size2;
        } else {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            mode = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
        }
        List<f> flexLinesInternal = this.f52257a.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.f52257a.getSumOfCrossSize() + i12;
            int i13 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).f52239g = size - i12;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.f52257a.getAlignContent();
                if (alignContent == 1) {
                    int i14 = size - sumOfCrossSize;
                    f fVar = new f();
                    fVar.f52239g = i14;
                    flexLinesInternal.add(0, fVar);
                    return;
                }
                if (alignContent == 2) {
                    this.f52257a.setFlexLines(k(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size4 = flexLinesInternal.size();
                    float f10 = 0.0f;
                    while (i13 < size4) {
                        arrayList.add(flexLinesInternal.get(i13));
                        if (i13 != flexLinesInternal.size() - 1) {
                            f fVar2 = new f();
                            if (i13 == flexLinesInternal.size() - 2) {
                                fVar2.f52239g = Math.round(f10 + size3);
                                f10 = 0.0f;
                            } else {
                                fVar2.f52239g = Math.round(size3);
                            }
                            int i15 = fVar2.f52239g;
                            f10 += size3 - i15;
                            if (f10 > 1.0f) {
                                fVar2.f52239g = i15 + 1;
                                f10 -= 1.0f;
                            } else if (f10 < -1.0f) {
                                fVar2.f52239g = i15 - 1;
                                f10 += 1.0f;
                            }
                            arrayList.add(fVar2);
                        }
                        i13++;
                    }
                    this.f52257a.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        this.f52257a.setFlexLines(k(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    f fVar3 = new f();
                    fVar3.f52239g = size5;
                    for (f fVar4 : flexLinesInternal) {
                        arrayList2.add(fVar3);
                        arrayList2.add(fVar4);
                        arrayList2.add(fVar3);
                    }
                    this.f52257a.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f11 = 0.0f;
                    while (i13 < size7) {
                        f fVar5 = flexLinesInternal.get(i13);
                        float f12 = fVar5.f52239g + size6;
                        if (i13 == flexLinesInternal.size() - 1) {
                            f12 += f11;
                            f11 = 0.0f;
                        }
                        int iRound = Math.round(f12);
                        f11 += f12 - iRound;
                        if (f11 > 1.0f) {
                            iRound++;
                            f11 -= 1.0f;
                        } else if (f11 < -1.0f) {
                            iRound--;
                            f11 += 1.0f;
                        }
                        fVar5.f52239g = iRound;
                        i13++;
                    }
                }
            }
        }
    }

    void p(int i10, int i11) {
        q(i10, i11, 0);
    }

    void q(int i10, int i11, int i12) {
        int size;
        int paddingLeft;
        int paddingRight;
        r(this.f52257a.getFlexItemCount());
        if (i12 >= this.f52257a.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.f52257a.getFlexDirection();
        int flexDirection2 = this.f52257a.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
            int largestMainSize = this.f52257a.getLargestMainSize();
            if (mode != 1073741824 && largestMainSize <= size) {
                size = largestMainSize;
            }
            paddingLeft = this.f52257a.getPaddingLeft();
            paddingRight = this.f52257a.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            int mode2 = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
            if (mode2 != 1073741824) {
                size = this.f52257a.getLargestMainSize();
            }
            paddingLeft = this.f52257a.getPaddingTop();
            paddingRight = this.f52257a.getPaddingBottom();
        }
        int i13 = paddingLeft + paddingRight;
        int[] iArr = this.f52259c;
        int i14 = iArr != null ? iArr[i12] : 0;
        List<f> flexLinesInternal = this.f52257a.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        for (int i15 = i14; i15 < size2; i15++) {
            f fVar = flexLinesInternal.get(i15);
            int i16 = fVar.f52237e;
            if (i16 < size && fVar.f52249q) {
                w(i10, i11, fVar, size, i13, false);
            } else if (i16 > size && fVar.f52250r) {
                T(i10, i11, fVar, size, i13, false);
            }
        }
    }

    void s(int i10) {
        int[] iArr = this.f52259c;
        if (iArr == null) {
            if (i10 < 10) {
                i10 = 10;
            }
            this.f52259c = new int[i10];
        } else if (iArr.length < i10) {
            int length = iArr.length * 2;
            if (length >= i10) {
                i10 = length;
            }
            this.f52259c = Arrays.copyOf(iArr, i10);
        }
    }

    void t(int i10) {
        long[] jArr = this.f52260d;
        if (jArr == null) {
            if (i10 < 10) {
                i10 = 10;
            }
            this.f52260d = new long[i10];
        } else if (jArr.length < i10) {
            int length = jArr.length * 2;
            if (length >= i10) {
                i10 = length;
            }
            this.f52260d = Arrays.copyOf(jArr, i10);
        }
    }

    void u(int i10) {
        long[] jArr = this.f52261e;
        if (jArr == null) {
            if (i10 < 10) {
                i10 = 10;
            }
            this.f52261e = new long[i10];
        } else if (jArr.length < i10) {
            int length = jArr.length * 2;
            if (length >= i10) {
                i10 = length;
            }
            this.f52261e = Arrays.copyOf(jArr, i10);
        }
    }

    int x(long j10) {
        return (int) (j10 >> 32);
    }

    int y(long j10) {
        return (int) j10;
    }
}
