package z8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public class e {
    private e() {
    }

    @v8.a
    public static int a(@n0 Context context, @n0 String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        PackageInfo packageInfoB = b(context, str);
        if (packageInfoB == null || (applicationInfo = packageInfoB.applicationInfo) == null || (bundle = applicationInfo.metaData) == null) {
            return -1;
        }
        return bundle.getInt("com.google.android.gms.version", -1);
    }

    @v8.a
    @p0
    public static PackageInfo b(@n0 Context context, @n0 String str) {
        try {
            return com.google.android.gms.common.wrappers.e.a(context).f(str, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @v8.a
    public static boolean c() {
        return false;
    }
}
