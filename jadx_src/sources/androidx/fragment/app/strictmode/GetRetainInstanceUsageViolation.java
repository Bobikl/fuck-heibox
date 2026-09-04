package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import dl.d;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GetRetainInstanceUsageViolation.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class GetRetainInstanceUsageViolation extends RetainInstanceUsageViolation {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRetainInstanceUsageViolation(@d Fragment fragment) {
        super(fragment, "Attempting to get retain instance for fragment " + fragment);
        f0.p(fragment, "fragment");
    }
}
