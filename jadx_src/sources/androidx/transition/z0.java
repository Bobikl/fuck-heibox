package androidx.transition;

import android.os.IBinder;

/* JADX INFO: compiled from: WindowIdApi14.java */
/* JADX INFO: loaded from: classes6.dex */
public class z0 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f27976a;

    z0(IBinder iBinder) {
        this.f27976a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof z0) && ((z0) obj).f27976a.equals(this.f27976a);
    }

    public int hashCode() {
        return this.f27976a.hashCode();
    }
}
