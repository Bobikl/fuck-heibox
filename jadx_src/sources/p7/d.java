package p7;

import android.app.Activity;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f138170a;

    public static q7.a a(Activity activity) {
        b bVar = f138170a;
        if (bVar == null || activity == null) {
            return null;
        }
        return new com.bytedance.sdk.open.tt.f(activity, bVar.f138169a);
    }

    public static q7.a b(Activity activity, b bVar) {
        if (bVar == null || activity == null) {
            return null;
        }
        return new com.bytedance.sdk.open.tt.f(activity, bVar.f138169a);
    }

    public static boolean c(b bVar) {
        if (bVar == null || TextUtils.isEmpty(bVar.f138169a)) {
            return false;
        }
        f138170a = bVar;
        return true;
    }

    public static void d(boolean z10) {
        n7.b.f132021b = z10;
    }
}
