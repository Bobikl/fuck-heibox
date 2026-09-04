package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: SystemProps.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\"\u001a\u0010\u0007\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\b"}, d2 = {"", "propertyName", "b", "", ak.av, "I", "()I", "AVAILABLE_PROCESSORS", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/internal/SystemPropsKt")
public final /* synthetic */ class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f130197a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f130197a;
    }

    @dl.e
    public static final String b(@dl.d String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
