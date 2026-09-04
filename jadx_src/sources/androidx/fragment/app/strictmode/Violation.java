package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: Violation.kt */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Violation extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final Fragment f23846b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Violation(@d Fragment fragment, @e String str) {
        super(str);
        f0.p(fragment, "fragment");
        this.f23846b = fragment;
    }

    public /* synthetic */ Violation(Fragment fragment, String str, int i10, u uVar) {
        this(fragment, (i10 & 2) != 0 ? null : str);
    }

    @d
    public final Fragment a() {
        return this.f23846b;
    }
}
