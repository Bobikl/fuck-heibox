package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.Result;

/* JADX INFO: compiled from: FastServiceLoader.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, d2 = {"", ak.av, "Z", "()Z", "ANDROID_DETECTED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f130189a;

    static {
        Object objB;
        try {
            Result.a aVar = Result.f124476c;
            objB = Result.b(Class.forName("android.os.Build"));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(kotlin.t0.a(th2));
        }
        f130189a = Result.j(objB);
    }

    public static final boolean a() {
        return f130189a;
    }
}
