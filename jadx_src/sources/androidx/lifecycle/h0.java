package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: MethodCallsLogger.kt */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Map<String, Integer> f24212a = new HashMap();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean a(@dl.d String name, int i10) {
        kotlin.jvm.internal.f0.p(name, "name");
        Integer num = this.f24212a.get(name);
        int iIntValue = num != null ? num.intValue() : 0;
        boolean z10 = (iIntValue & i10) != 0;
        this.f24212a.put(name, Integer.valueOf(i10 | iIntValue));
        return !z10;
    }
}
