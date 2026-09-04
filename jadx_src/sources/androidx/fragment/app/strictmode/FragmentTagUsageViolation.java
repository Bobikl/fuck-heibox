package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FragmentTagUsageViolation.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class FragmentTagUsageViolation extends Violation {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private final ViewGroup f23842c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentTagUsageViolation(@d Fragment fragment, @e ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        f0.p(fragment, "fragment");
        this.f23842c = viewGroup;
    }

    @e
    public final ViewGroup b() {
        return this.f23842c;
    }
}
