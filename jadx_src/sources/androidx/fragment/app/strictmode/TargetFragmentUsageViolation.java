package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: TargetFragmentUsageViolation.kt */
/* JADX INFO: loaded from: classes6.dex */
public abstract class TargetFragmentUsageViolation extends Violation {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TargetFragmentUsageViolation(@d Fragment fragment, @e String str) {
        super(fragment, str);
        f0.p(fragment, "fragment");
    }

    public /* synthetic */ TargetFragmentUsageViolation(Fragment fragment, String str, int i10, u uVar) {
        this(fragment, (i10 & 2) != 0 ? null : str);
    }
}
