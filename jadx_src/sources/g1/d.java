package g1;

import com.google.android.exoplayer2.source.rtsp.k0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: VelocityTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0086\u0002J\u0011\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0000H\u0086\u0002J\u0006\u0010\n\u001a\u00020\u0004R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lg1/d;", "", "", "i", "", ak.av, "value", "Lkotlin/b2;", "e", "f", "d", k0.f48801p, "I", ak.aF, "()I", "", "elements", "[Ljava/lang/Float;", "b", "()[Ljava/lang/Float;", "<init>", "(I)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f118948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Float[] f118949b;

    public d(int i10) {
        this.f118948a = i10;
        Float[] fArr = new Float[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            fArr[i11] = Float.valueOf(0.0f);
        }
        this.f118949b = fArr;
    }

    public final float a(int i10) {
        return this.f118949b[i10].floatValue();
    }

    @dl.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Float[] getF118949b() {
        return this.f118949b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF118948a() {
        return this.f118948a;
    }

    public final float d() {
        return (float) Math.sqrt(f(this));
    }

    public final void e(int i10, float f10) {
        this.f118949b[i10] = Float.valueOf(f10);
    }

    public final float f(@dl.d d a10) {
        f0.p(a10, "a");
        int i10 = this.f118948a;
        float fA = 0.0f;
        for (int i11 = 0; i11 < i10; i11++) {
            fA += a(i11) * a10.a(i11);
        }
        return fA;
    }
}
