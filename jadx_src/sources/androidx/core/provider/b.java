package androidx.core.provider;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.n0;

/* JADX INFO: compiled from: CalleeHandler.java */
/* JADX INFO: loaded from: classes.dex */
public class b {
    private b() {
    }

    @n0
    static Handler a() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
