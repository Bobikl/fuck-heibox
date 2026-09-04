package androidx.compose.ui.window;

import androidx.compose.foundation.b0;
import androidx.compose.runtime.m0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: AndroidDialog.android.kt */
/* JADX INFO: loaded from: classes.dex */
@m0
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B;\b\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u001aB'\b\u0016\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001bJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u0014\u0010\nR \u0010\u0018\u001a\u00020\u00038GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\b\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0007\u0010\n¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/window/b;", "", "other", "", "equals", "", "hashCode", ak.av, "Z", ak.aF, "()Z", "dismissOnBackPress", "b", "d", "dismissOnClickOutside", "Landroidx/compose/ui/window/SecureFlagPolicy;", "Landroidx/compose/ui/window/SecureFlagPolicy;", "e", "()Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "f", "usePlatformDefaultWidth", "getDecorFitsSystemWindows$annotations", "()V", "decorFitsSystemWindows", "<init>", "(ZZLandroidx/compose/ui/window/SecureFlagPolicy;ZZ)V", "(ZZLandroidx/compose/ui/window/SecureFlagPolicy;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean dismissOnBackPress;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean dismissOnClickOutside;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final SecureFlagPolicy securePolicy;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean usePlatformDefaultWidth;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean decorFitsSystemWindows;

    @androidx.compose.ui.g
    public b() {
        this(false, false, null, false, false, 31, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(boolean z10, boolean z11, @dl.d SecureFlagPolicy securePolicy) {
        this(z10, z11, securePolicy, true, true);
        f0.p(securePolicy, "securePolicy");
    }

    public /* synthetic */ b(boolean z10, boolean z11, SecureFlagPolicy secureFlagPolicy, int i10, u uVar) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy);
    }

    @androidx.compose.ui.g
    public b(boolean z10, boolean z11, @dl.d SecureFlagPolicy securePolicy, boolean z12, boolean z13) {
        f0.p(securePolicy, "securePolicy");
        this.dismissOnBackPress = z10;
        this.dismissOnClickOutside = z11;
        this.securePolicy = securePolicy;
        this.usePlatformDefaultWidth = z12;
        this.decorFitsSystemWindows = z13;
    }

    public /* synthetic */ b(boolean z10, boolean z11, SecureFlagPolicy secureFlagPolicy, boolean z12, boolean z13, int i10, u uVar) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i10 & 8) != 0 ? true : z12, (i10 & 16) != 0 ? true : z13);
    }

    @androidx.compose.ui.g
    public static /* synthetic */ void b() {
    }

    @androidx.compose.ui.g
    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getDecorFitsSystemWindows() {
        return this.decorFitsSystemWindows;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    @dl.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public final SecureFlagPolicy getSecurePolicy() {
        return this.securePolicy;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return this.dismissOnBackPress == bVar.dismissOnBackPress && this.dismissOnClickOutside == bVar.dismissOnClickOutside && this.securePolicy == bVar.securePolicy && this.usePlatformDefaultWidth == bVar.usePlatformDefaultWidth && this.decorFitsSystemWindows == bVar.decorFitsSystemWindows;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public int hashCode() {
        return (((((((b0.a(this.dismissOnBackPress) * 31) + b0.a(this.dismissOnClickOutside)) * 31) + this.securePolicy.hashCode()) * 31) + b0.a(this.usePlatformDefaultWidth)) * 31) + b0.a(this.decorFitsSystemWindows);
    }
}
