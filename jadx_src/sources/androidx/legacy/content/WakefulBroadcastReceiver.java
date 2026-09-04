package androidx.legacy.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class WakefulBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f23930a = "androidx.contentpager.content.wakelockid";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SparseArray<PowerManager.WakeLock> f23931b = new SparseArray<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f23932c = 1;

    public static boolean a(Intent intent) {
        int intExtra = intent.getIntExtra(f23930a, 0);
        if (intExtra == 0) {
            return false;
        }
        SparseArray<PowerManager.WakeLock> sparseArray = f23931b;
        synchronized (sparseArray) {
            PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                sparseArray.remove(intExtra);
                return true;
            }
            Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            return true;
        }
    }

    public static ComponentName b(Context context, Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = f23931b;
        synchronized (sparseArray) {
            int i10 = f23932c;
            int i11 = i10 + 1;
            f23932c = i11;
            if (i11 <= 0) {
                f23932c = 1;
            }
            intent.putExtra(f23930a, i10);
            ComponentName componentNameStartService = context.startService(intent);
            if (componentNameStartService == null) {
                return null;
            }
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
            wakeLockNewWakeLock.setReferenceCounted(false);
            wakeLockNewWakeLock.acquire(60000L);
            sparseArray.put(i10, wakeLockNewWakeLock);
            return componentNameStartService;
        }
    }
}
