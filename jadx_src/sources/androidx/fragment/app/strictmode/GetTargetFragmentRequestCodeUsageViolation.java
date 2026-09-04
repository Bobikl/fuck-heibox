package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import dl.d;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GetTargetFragmentRequestCodeUsageViolation.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class GetTargetFragmentRequestCodeUsageViolation extends TargetFragmentUsageViolation {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTargetFragmentRequestCodeUsageViolation(@d Fragment fragment) {
        super(fragment, "Attempting to get target request code from fragment " + fragment);
        f0.p(fragment, "fragment");
    }
}
