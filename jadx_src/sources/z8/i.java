package z8;

import android.content.Context;
import android.util.Log;
import androidx.annotation.n0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f141923a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    @v8.a
    public static boolean a(@n0 Context context, @n0 Throwable th2) {
        try {
            com.google.android.gms.common.internal.p.l(context);
            com.google.android.gms.common.internal.p.l(th2);
            return false;
        } catch (Exception e10) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e10);
            return false;
        }
    }
}
