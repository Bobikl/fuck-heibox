package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import dl.d;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SetUserVisibleHintViolation.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class SetUserVisibleHintViolation extends Violation {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f23845c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetUserVisibleHintViolation(@d Fragment fragment, boolean z10) {
        super(fragment, "Attempting to set user visible hint to " + z10 + " for fragment " + fragment);
        f0.p(fragment, "fragment");
        this.f23845c = z10;
    }

    public final boolean b() {
        return this.f23845c;
    }
}
