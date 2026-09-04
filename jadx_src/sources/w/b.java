package w;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;

/* JADX INFO: compiled from: AttaHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f140911a = Build.MODEL;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f140912b = Build.VERSION.RELEASE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f140913c = b.a.f30355c;

    public static String a(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(g0.a.f118921e);
        return (telephonyManager == null || 5 != telephonyManager.getSimState()) ? "-1" : telephonyManager.getSimOperator();
    }
}
