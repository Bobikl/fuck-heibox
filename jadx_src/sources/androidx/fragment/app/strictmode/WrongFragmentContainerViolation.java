package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import dl.d;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: WrongFragmentContainerViolation.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class WrongFragmentContainerViolation extends Violation {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private final ViewGroup f23847c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrongFragmentContainerViolation(@d Fragment fragment, @d ViewGroup container) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + container + " which is not a FragmentContainerView");
        f0.p(fragment, "fragment");
        f0.p(container, "container");
        this.f23847c = container;
    }

    @d
    public final ViewGroup b() {
        return this.f23847c;
    }
}
