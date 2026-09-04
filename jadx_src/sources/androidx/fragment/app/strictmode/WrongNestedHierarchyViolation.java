package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import dl.d;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: WrongNestedHierarchyViolation.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class WrongNestedHierarchyViolation extends Violation {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private final Fragment f23848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f23849d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrongNestedHierarchyViolation(@d Fragment fragment, @d Fragment expectedParentFragment, int i10) {
        super(fragment, "Attempting to nest fragment " + fragment + " within the view of parent fragment " + expectedParentFragment + " via container with ID " + i10 + " without using parent's childFragmentManager");
        f0.p(fragment, "fragment");
        f0.p(expectedParentFragment, "expectedParentFragment");
        this.f23848c = expectedParentFragment;
        this.f23849d = i10;
    }

    public final int b() {
        return this.f23849d;
    }

    @d
    public final Fragment c() {
        return this.f23848c;
    }
}
