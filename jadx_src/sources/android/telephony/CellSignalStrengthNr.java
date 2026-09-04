package android.telephony;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CellSignalStrengthNr extends CellSignalStrength implements Parcelable {
    static {
        throw new NoClassDefFoundError();
    }

    public native /* synthetic */ int getCsiRsrp();

    public native /* synthetic */ int getCsiRsrq();

    public native /* synthetic */ int getCsiSinr();

    @Override // android.telephony.CellSignalStrength
    public native /* synthetic */ int getDbm();

    public native /* synthetic */ int getSsRsrp();

    public native /* synthetic */ int getSsRsrq();

    public native /* synthetic */ int getSsSinr();
}
