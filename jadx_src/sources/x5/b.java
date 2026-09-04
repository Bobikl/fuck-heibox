package x5;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static b f141097b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f141098a;

    public static b e() {
        if (f141097b == null) {
            f141097b = new b();
        }
        return f141097b;
    }

    public static boolean f() {
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        for (int i10 = 0; i10 < 10; i10++) {
            if (new File(strArr[i10]).exists()) {
                return true;
            }
        }
        return false;
    }

    public l5.b a() {
        return l5.b.h();
    }

    public void b(Context context) {
        l5.b.h();
        this.f141098a = context.getApplicationContext();
    }

    public Context c() {
        return this.f141098a;
    }

    public String d() {
        return b6.b.d(null, this.f141098a);
    }
}
