package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import dl.d;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SetRetainInstanceUsageViolation.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class SetRetainInstanceUsageViolation extends RetainInstanceUsageViolation {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetRetainInstanceUsageViolation(@d Fragment fragment) {
        super(fragment, "Attempting to set retain instance for fragment " + fragment);
        f0.p(fragment, "fragment");
    }
}
