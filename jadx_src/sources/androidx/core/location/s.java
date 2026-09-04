package androidx.core.location;

import android.location.Location;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: compiled from: LocationListenerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s {
    public static void a(t tVar, int i10) {
    }

    public static void b(t tVar, @androidx.annotation.n0 List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            tVar.onLocationChanged((Location) list.get(i10));
        }
    }

    public static void c(t tVar, @androidx.annotation.n0 String str) {
    }

    public static void d(t tVar, @androidx.annotation.n0 String str) {
    }

    public static void e(t tVar, @androidx.annotation.n0 String str, int i10, @androidx.annotation.p0 Bundle bundle) {
    }
}
