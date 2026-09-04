package androidx.work.impl.constraints.trackers;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BatteryNotLowTracker.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"", ak.av, "Ljava/lang/String;", "TAG", "", "b", "F", "BATTERY_LOW_THRESHOLD", "work-runtime_release"}, k = 2, mv = {1, 7, 1})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final String f28927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f28928b = 0.15f;

    static {
        String strI = androidx.work.n.i("BatteryNotLowTracker");
        f0.o(strI, "tagWithPrefix(\"BatteryNotLowTracker\")");
        f28927a = strI;
    }
}
