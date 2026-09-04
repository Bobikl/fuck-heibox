package androidx.core.os;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
import androidx.annotation.w0;

/* JADX INFO: compiled from: UserManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class n0 {

    /* JADX INFO: compiled from: UserManagerCompat.java */
    @w0(24)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static boolean a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    private n0() {
    }

    public static boolean a(@androidx.annotation.n0 Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.a(context);
        }
        return true;
    }
}
