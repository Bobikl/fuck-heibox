package g1;

import androidx.compose.ui.input.pointer.HistoricalChange;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.q;
import androidx.core.app.o0;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: VelocityTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a,\u0010\f\u001a\u00020\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\n\u001a\u00020\tH\u0000¨\u0006\r"}, d2 = {"Lg1/f;", "Landroidx/compose/ui/input/pointer/y;", o0.I0, "Lkotlin/b2;", ak.av, "", "", "x", "y", "", "degree", "Lg1/c;", "b", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f118960a = 40;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f118961b = 20;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f118962c = 100;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f118963d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f118964e = 1.0f;

    public static final void a(@dl.d f fVar, @dl.d PointerInputChange event) {
        f0.p(fVar, "<this>");
        f0.p(event, "event");
        if (q.c(event)) {
            fVar.f(event.getPosition());
            fVar.e();
        }
        long previousPosition = event.getPreviousPosition();
        List<HistoricalChange> listN = event.n();
        int i10 = 0;
        int size = listN.size();
        while (i10 < size) {
            HistoricalChange historicalChange = listN.get(i10);
            long jU = b1.f.u(historicalChange.getPosition(), previousPosition);
            long position = historicalChange.getPosition();
            fVar.f(b1.f.v(fVar.getF118959c(), jU));
            fVar.a(historicalChange.getUptimeMillis(), fVar.getF118959c());
            i10++;
            previousPosition = position;
        }
        fVar.f(b1.f.v(fVar.getF118959c(), b1.f.u(event.getPosition(), previousPosition)));
        fVar.a(event.getUptimeMillis(), fVar.getF118959c());
    }

    @dl.d
    public static final PolynomialFit b(@dl.d List<Float> x10, @dl.d List<Float> y10, int i10) {
        float f10;
        f0.p(x10, "x");
        f0.p(y10, "y");
        if (i10 < 1) {
            throw new IllegalArgumentException("The degree must be at positive integer");
        }
        if (x10.size() != y10.size()) {
            throw new IllegalArgumentException("x and y must be the same length");
        }
        if (x10.isEmpty()) {
            throw new IllegalArgumentException("At least one point must be provided");
        }
        int size = i10 >= x10.size() ? x10.size() - 1 : i10;
        int i11 = i10 + 1;
        ArrayList arrayList = new ArrayList(i11);
        int i12 = 0;
        while (true) {
            f10 = 0.0f;
            if (i12 >= i11) {
                break;
            }
            arrayList.add(Float.valueOf(0.0f));
            i12++;
        }
        int size2 = x10.size();
        int i13 = size + 1;
        a aVar = new a(i13, size2);
        int i14 = 0;
        while (true) {
            if (i14 >= size2) {
                break;
            }
            aVar.c(0, i14, 1.0f);
            for (int i15 = 1; i15 < i13; i15++) {
                aVar.c(i15, i14, aVar.a(i15 - 1, i14) * x10.get(i14).floatValue());
            }
            i14++;
        }
        a aVar2 = new a(i13, size2);
        a aVar3 = new a(i13, i13);
        int i16 = 0;
        while (i16 < i13) {
            for (int i17 = 0; i17 < size2; i17++) {
                aVar2.c(i16, i17, aVar.a(i16, i17));
            }
            for (int i18 = 0; i18 < i16; i18++) {
                float f11 = aVar2.b(i16).f(aVar2.b(i18));
                for (int i19 = 0; i19 < size2; i19++) {
                    aVar2.c(i16, i19, aVar2.a(i16, i19) - (aVar2.a(i18, i19) * f11));
                }
            }
            float fD = aVar2.b(i16).d();
            if (fD < 1.0E-6d) {
                throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
            }
            float f12 = 1.0f / fD;
            for (int i20 = 0; i20 < size2; i20++) {
                aVar2.c(i16, i20, aVar2.a(i16, i20) * f12);
            }
            int i21 = 0;
            while (i21 < i13) {
                aVar3.c(i16, i21, i21 < i16 ? 0.0f : aVar2.b(i16).f(aVar.b(i21)));
                i21++;
            }
            i16++;
        }
        d dVar = new d(size2);
        for (int i22 = 0; i22 < size2; i22++) {
            dVar.e(i22, y10.get(i22).floatValue() * 1.0f);
        }
        int i23 = i13 - 1;
        for (int i24 = i23; -1 < i24; i24--) {
            arrayList.set(i24, Float.valueOf(aVar2.b(i24).f(dVar)));
            int i25 = i24 + 1;
            if (i25 <= i23) {
                int i26 = i23;
                while (true) {
                    arrayList.set(i24, Float.valueOf(((Number) arrayList.get(i24)).floatValue() - (aVar3.a(i24, i26) * ((Number) arrayList.get(i26)).floatValue())));
                    if (i26 != i25) {
                        i26--;
                    }
                }
            }
            arrayList.set(i24, Float.valueOf(((Number) arrayList.get(i24)).floatValue() / aVar3.a(i24, i24)));
        }
        float fFloatValue = 0.0f;
        for (int i27 = 0; i27 < size2; i27++) {
            fFloatValue += y10.get(i27).floatValue();
        }
        float f13 = fFloatValue / size2;
        float f14 = 0.0f;
        for (int i28 = 0; i28 < size2; i28++) {
            float fFloatValue2 = y10.get(i28).floatValue() - ((Number) arrayList.get(0)).floatValue();
            float fFloatValue3 = 1.0f;
            for (int i29 = 1; i29 < i13; i29++) {
                fFloatValue3 *= x10.get(i28).floatValue();
                fFloatValue2 -= ((Number) arrayList.get(i29)).floatValue() * fFloatValue3;
            }
            f14 += fFloatValue2 * 1.0f * fFloatValue2;
            float fFloatValue4 = y10.get(i28).floatValue() - f13;
            f10 += fFloatValue4 * 1.0f * fFloatValue4;
        }
        return new PolynomialFit(arrayList, f10 > 1.0E-6f ? 1.0f - (f14 / f10) : 1.0f);
    }
}
