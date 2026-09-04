package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Message;
import androidx.annotation.w0;

/* JADX INFO: compiled from: MessageCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f20992a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f20993b = true;

    /* JADX INFO: compiled from: MessageCompat.java */
    @w0(22)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static boolean a(Message message) {
            return message.isAsynchronous();
        }

        @androidx.annotation.u
        static void b(Message message, boolean z10) {
            message.setAsynchronous(z10);
        }
    }

    private s() {
    }

    @SuppressLint({"NewApi"})
    public static boolean a(@androidx.annotation.n0 Message message) {
        return a.a(message);
    }

    @SuppressLint({"NewApi"})
    public static void b(@androidx.annotation.n0 Message message, boolean z10) {
        a.b(message, z10);
    }
}
