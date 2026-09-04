package androidx.core.location;

import android.location.GnssStatus;
import android.os.Build;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: GnssStatusWrapper.java */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(24)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class d extends androidx.core.location.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final GnssStatus f20839i;

    /* JADX INFO: compiled from: GnssStatusWrapper.java */
    @androidx.annotation.w0(26)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static float a(GnssStatus gnssStatus, int i10) {
            return gnssStatus.getCarrierFrequencyHz(i10);
        }

        @androidx.annotation.u
        static boolean b(GnssStatus gnssStatus, int i10) {
            return gnssStatus.hasCarrierFrequencyHz(i10);
        }
    }

    /* JADX INFO: compiled from: GnssStatusWrapper.java */
    @androidx.annotation.w0(30)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static float a(GnssStatus gnssStatus, int i10) {
            return gnssStatus.getBasebandCn0DbHz(i10);
        }

        @androidx.annotation.u
        static boolean b(GnssStatus gnssStatus, int i10) {
            return gnssStatus.hasBasebandCn0DbHz(i10);
        }
    }

    d(Object obj) {
        this.f20839i = (GnssStatus) androidx.core.util.o.l((GnssStatus) obj);
    }

    @Override // androidx.core.location.a
    public float a(int i10) {
        return this.f20839i.getAzimuthDegrees(i10);
    }

    @Override // androidx.core.location.a
    public float b(int i10) {
        if (Build.VERSION.SDK_INT >= 30) {
            return b.a(this.f20839i, i10);
        }
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.a
    public float c(int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.a(this.f20839i, i10);
        }
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.a
    public float d(int i10) {
        return this.f20839i.getCn0DbHz(i10);
    }

    @Override // androidx.core.location.a
    public int e(int i10) {
        return this.f20839i.getConstellationType(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return this.f20839i.equals(((d) obj).f20839i);
        }
        return false;
    }

    @Override // androidx.core.location.a
    public float f(int i10) {
        return this.f20839i.getElevationDegrees(i10);
    }

    @Override // androidx.core.location.a
    public int g() {
        return this.f20839i.getSatelliteCount();
    }

    @Override // androidx.core.location.a
    public int h(int i10) {
        return this.f20839i.getSvid(i10);
    }

    public int hashCode() {
        return this.f20839i.hashCode();
    }

    @Override // androidx.core.location.a
    public boolean i(int i10) {
        return this.f20839i.hasAlmanacData(i10);
    }

    @Override // androidx.core.location.a
    public boolean j(int i10) {
        if (Build.VERSION.SDK_INT >= 30) {
            return b.b(this.f20839i, i10);
        }
        return false;
    }

    @Override // androidx.core.location.a
    public boolean k(int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.b(this.f20839i, i10);
        }
        return false;
    }

    @Override // androidx.core.location.a
    public boolean l(int i10) {
        return this.f20839i.hasEphemerisData(i10);
    }

    @Override // androidx.core.location.a
    public boolean m(int i10) {
        return this.f20839i.usedInFix(i10);
    }
}
