package e;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* JADX INFO: compiled from: ApplicationProvider.java */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Application f118530a;

    public static Application a(Context context) {
        if (context == null) {
            return null;
        }
        try {
            if (context instanceof Application) {
                return (Application) context;
            }
            if (context instanceof Activity) {
                return ((Activity) context).getApplication();
            }
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                return (Application) applicationContext;
            }
            return null;
        } catch (Exception e10) {
            f.b.a(3, e10, "Get Application failed", new Object[0]);
            return null;
        }
    }
}
