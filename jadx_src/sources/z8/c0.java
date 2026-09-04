package z8;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.n0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public final class c0 {
    private c0() {
    }

    @v8.a
    public static boolean a(@n0 Context context, int i10) {
        if (!b(context, i10, "com.google.android.gms")) {
            return false;
        }
        try {
            return com.google.android.gms.common.g.a(context).b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    @v8.a
    @TargetApi(19)
    public static boolean b(@n0 Context context, int i10, @n0 String str) {
        return com.google.android.gms.common.wrappers.e.a(context).h(i10, str);
    }
}
