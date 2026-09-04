package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import dl.d;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SetTargetFragmentUsageViolation.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class SetTargetFragmentUsageViolation extends TargetFragmentUsageViolation {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private final Fragment f23843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f23844d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetTargetFragmentUsageViolation(@d Fragment fragment, @d Fragment targetFragment, int i10) {
        super(fragment, "Attempting to set target fragment " + targetFragment + " with request code " + i10 + " for fragment " + fragment);
        f0.p(fragment, "fragment");
        f0.p(targetFragment, "targetFragment");
        this.f23843c = targetFragment;
        this.f23844d = i10;
    }

    public final int b() {
        return this.f23844d;
    }

    @d
    public final Fragment c() {
        return this.f23843c;
    }
}
