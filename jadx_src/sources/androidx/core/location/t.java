package androidx.core.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: compiled from: LocationListenerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public interface t extends LocationListener {
    @Override // android.location.LocationListener
    void onFlushComplete(int i10);

    @Override // android.location.LocationListener
    void onLocationChanged(@androidx.annotation.n0 List<Location> list);

    @Override // android.location.LocationListener
    void onProviderDisabled(@androidx.annotation.n0 String str);

    @Override // android.location.LocationListener
    void onProviderEnabled(@androidx.annotation.n0 String str);

    @Override // android.location.LocationListener
    void onStatusChanged(@androidx.annotation.n0 String str, int i10, @androidx.annotation.p0 Bundle bundle);
}
