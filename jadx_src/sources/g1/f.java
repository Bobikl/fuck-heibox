package g1;

import androidx.compose.runtime.internal.o;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.m;
import s1.y;

/* JADX INFO: compiled from: VelocityTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0002J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\u00020\u000bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u000e\u001a\u00020\bR+\u0010\u000f\u001a\u00020\u00068\u0000@\u0000X\u0080\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u0013\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0016"}, d2 = {"Lg1/f;", "", "Lg1/e;", "d", "", "timeMillis", "Lb1/f;", CommonNetImpl.POSITION, "Lkotlin/b2;", ak.av, "(JJ)V", "Ls1/x;", "b", "()J", "e", "currentPointerPositionAccumulator", "J", ak.aF, "f", "(J)V", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f118956d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final PointAtTime[] f118957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f118958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f118959c;

    public f() {
        PointAtTime[] pointAtTimeArr = new PointAtTime[20];
        for (int i10 = 0; i10 < 20; i10++) {
            pointAtTimeArr[i10] = null;
        }
        this.f118957a = pointAtTimeArr;
        this.f118959c = b1.f.f30364b.e();
    }

    private final VelocityEstimate d() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i10 = this.f118958b;
        PointAtTime pointAtTime = this.f118957a[i10];
        if (pointAtTime == null) {
            return VelocityEstimate.f118950e.a();
        }
        int i11 = 0;
        PointAtTime pointAtTime2 = pointAtTime;
        while (true) {
            PointAtTime pointAtTime3 = this.f118957a[i10];
            if (pointAtTime3 == null) {
                break;
            }
            float f10 = pointAtTime.f() - pointAtTime3.f();
            float fAbs = Math.abs(pointAtTime3.f() - pointAtTime2.f());
            if (f10 > 100.0f || fAbs > 40.0f) {
                break;
            }
            long jE = pointAtTime3.e();
            arrayList.add(Float.valueOf(b1.f.p(jE)));
            arrayList2.add(Float.valueOf(b1.f.r(jE)));
            arrayList3.add(Float.valueOf(-f10));
            if (i10 == 0) {
                i10 = 20;
            }
            i10--;
            i11++;
            if (i11 >= 20) {
                pointAtTime2 = pointAtTime3;
                break;
            }
            pointAtTime2 = pointAtTime3;
        }
        if (i11 < 3) {
            return new VelocityEstimate(b1.f.f30364b.e(), 1.0f, pointAtTime.f() - pointAtTime2.f(), b1.f.u(pointAtTime.e(), pointAtTime2.e()), null);
        }
        try {
            PolynomialFit polynomialFitB = g.b(arrayList3, arrayList, 2);
            PolynomialFit polynomialFitB2 = g.b(arrayList3, arrayList2, 2);
            float f11 = 1000;
            return new VelocityEstimate(b1.g.a(polynomialFitB.e().get(1).floatValue() * f11, polynomialFitB2.e().get(1).floatValue() * f11), polynomialFitB.f() * polynomialFitB2.f(), pointAtTime.f() - pointAtTime2.f(), b1.f.u(pointAtTime.e(), pointAtTime2.e()), null);
        } catch (IllegalArgumentException unused) {
            return VelocityEstimate.f118950e.a();
        }
    }

    public final void a(long timeMillis, long position) {
        int i10 = (this.f118958b + 1) % 20;
        this.f118958b = i10;
        this.f118957a[i10] = new PointAtTime(position, timeMillis, null);
    }

    public final long b() {
        long jK = d().k();
        return y.a(b1.f.p(jK), b1.f.r(jK));
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getF118959c() {
        return this.f118959c;
    }

    public final void e() {
        m.w2(this.f118957a, null, 0, 0, 6, null);
    }

    public final void f(long j10) {
        this.f118959c = j10;
    }
}
