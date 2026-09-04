package androidx.core.location;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.os.Build;
import androidx.annotation.RestrictTo;
import java.util.Iterator;

/* JADX INFO: compiled from: GpsStatusWrapper.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class g extends a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f20840n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f20841o = 32;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f20842p = 33;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f20843q = 64;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f20844r = -87;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f20845s = 64;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f20846t = 24;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f20847u = 193;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f20848v = 200;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f20849w = 200;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f20850x = 35;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final GpsStatus f20851i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.b0("mWrapped")
    private int f20852j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.b0("mWrapped")
    private Iterator<GpsSatellite> f20853k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.b0("mWrapped")
    private int f20854l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.b0("mWrapped")
    private GpsSatellite f20855m;

    g(GpsStatus gpsStatus) {
        GpsStatus gpsStatus2 = (GpsStatus) androidx.core.util.o.l(gpsStatus);
        this.f20851i = gpsStatus2;
        this.f20852j = -1;
        this.f20853k = gpsStatus2.getSatellites().iterator();
        this.f20854l = -1;
        this.f20855m = null;
    }

    private static int p(int i10) {
        if (i10 > 0 && i10 <= 32) {
            return 1;
        }
        if (i10 >= 33 && i10 <= 64) {
            return 2;
        }
        if (i10 > 64 && i10 <= 88) {
            return 3;
        }
        if (i10 <= 200 || i10 > 235) {
            return (i10 < 193 || i10 > 200) ? 0 : 4;
        }
        return 5;
    }

    private GpsSatellite q(int i10) {
        GpsSatellite gpsSatellite;
        synchronized (this.f20851i) {
            if (i10 < this.f20854l) {
                this.f20853k = this.f20851i.getSatellites().iterator();
                this.f20854l = -1;
            }
            while (true) {
                int i11 = this.f20854l;
                if (i11 >= i10) {
                    break;
                }
                this.f20854l = i11 + 1;
                if (!this.f20853k.hasNext()) {
                    this.f20855m = null;
                    break;
                }
                this.f20855m = this.f20853k.next();
            }
            gpsSatellite = this.f20855m;
        }
        return (GpsSatellite) androidx.core.util.o.l(gpsSatellite);
    }

    private static int r(int i10) {
        int iP = p(i10);
        if (iP == 2) {
            return i10 + 87;
        }
        if (iP != 3) {
            return iP != 5 ? i10 : i10 - 200;
        }
        return i10 - 64;
    }

    @Override // androidx.core.location.a
    public float a(int i10) {
        return q(i10).getAzimuth();
    }

    @Override // androidx.core.location.a
    public float b(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.a
    public float c(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.a
    public float d(int i10) {
        return q(i10).getSnr();
    }

    @Override // androidx.core.location.a
    public int e(int i10) {
        if (Build.VERSION.SDK_INT < 24) {
            return 1;
        }
        return p(q(i10).getPrn());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.f20851i.equals(((g) obj).f20851i);
        }
        return false;
    }

    @Override // androidx.core.location.a
    public float f(int i10) {
        return q(i10).getElevation();
    }

    @Override // androidx.core.location.a
    public int g() {
        int i10;
        synchronized (this.f20851i) {
            if (this.f20852j == -1) {
                for (GpsSatellite gpsSatellite : this.f20851i.getSatellites()) {
                    this.f20852j++;
                }
                this.f20852j++;
            }
            i10 = this.f20852j;
        }
        return i10;
    }

    @Override // androidx.core.location.a
    public int h(int i10) {
        return Build.VERSION.SDK_INT < 24 ? q(i10).getPrn() : r(q(i10).getPrn());
    }

    public int hashCode() {
        return this.f20851i.hashCode();
    }

    @Override // androidx.core.location.a
    public boolean i(int i10) {
        return q(i10).hasAlmanac();
    }

    @Override // androidx.core.location.a
    public boolean j(int i10) {
        return false;
    }

    @Override // androidx.core.location.a
    public boolean k(int i10) {
        return false;
    }

    @Override // androidx.core.location.a
    public boolean l(int i10) {
        return q(i10).hasEphemeris();
    }

    @Override // androidx.core.location.a
    public boolean m(int i10) {
        return q(i10).usedInFix();
    }
}
