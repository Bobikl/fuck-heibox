package android.location;

import android.annotation.NonNull;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class GnssStatus implements Parcelable {

    public /* synthetic */ class Callback {
        static {
            throw new NoClassDefFoundError();
        }

        public native /* synthetic */ void onSatelliteStatusChanged(@NonNull GnssStatus gnssStatus);
    }

    static {
        throw new NoClassDefFoundError();
    }

    public native /* synthetic */ boolean equals(Object obj);

    public native /* synthetic */ float getAzimuthDegrees(int i10);

    public native /* synthetic */ float getCn0DbHz(int i10);

    public native /* synthetic */ int getConstellationType(int i10);

    public native /* synthetic */ float getElevationDegrees(int i10);

    public native /* synthetic */ int getSatelliteCount();

    public native /* synthetic */ int getSvid(int i10);

    public native /* synthetic */ boolean hasAlmanacData(int i10);

    public native /* synthetic */ boolean hasEphemerisData(int i10);

    public native /* synthetic */ int hashCode();

    public native /* synthetic */ boolean usedInFix(int i10);
}
