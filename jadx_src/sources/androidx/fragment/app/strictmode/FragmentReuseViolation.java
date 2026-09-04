package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import dl.d;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FragmentReuseViolation.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class FragmentReuseViolation extends Violation {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private final String f23830c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentReuseViolation(@d Fragment fragment, @d String previousFragmentId) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId);
        f0.p(fragment, "fragment");
        f0.p(previousFragmentId, "previousFragmentId");
        this.f23830c = previousFragmentId;
    }

    @d
    public final String b() {
        return this.f23830c;
    }
}
