package z8;

import android.os.SystemClock;
import androidx.annotation.n0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public class k implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k f141924a = new k();

    private k() {
    }

    @n0
    @v8.a
    public static g d() {
        return f141924a;
    }

    @Override // z8.g
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // z8.g
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // z8.g
    public final long c() {
        return SystemClock.currentThreadTimeMillis();
    }

    @Override // z8.g
    public final long nanoTime() {
        return System.nanoTime();
    }
}
