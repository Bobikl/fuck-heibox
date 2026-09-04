package androidx.core.telephony;

import android.os.Build;
import android.telephony.SubscriptionManager;
import androidx.annotation.u;
import androidx.annotation.w0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: SubscriptionManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
@w0(22)
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Method f21094a;

    /* JADX INFO: compiled from: SubscriptionManagerCompat.java */
    @w0(29)
    public static class a {
        private a() {
        }

        @u
        static int a(int i10) {
            return SubscriptionManager.getSlotIndex(i10);
        }
    }

    private b() {
    }

    public static int a(int i10) {
        if (i10 == -1) {
            return -1;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            return a.a(i10);
        }
        try {
            if (f21094a == null) {
                if (i11 >= 26) {
                    f21094a = SubscriptionManager.class.getDeclaredMethod("getSlotIndex", Integer.TYPE);
                } else {
                    f21094a = SubscriptionManager.class.getDeclaredMethod("getSlotId", Integer.TYPE);
                }
                f21094a.setAccessible(true);
            }
            Integer num = (Integer) f21094a.invoke(null, Integer.valueOf(i10));
            if (num != null) {
                return num.intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return -1;
    }
}
