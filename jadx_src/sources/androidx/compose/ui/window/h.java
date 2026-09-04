package androidx.compose.ui.window;

import androidx.compose.foundation.b0;
import androidx.compose.runtime.m0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: AndroidPopup.android.kt */
/* JADX INFO: loaded from: classes.dex */
@m0
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001BO\b\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001bBE\b\u0016\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001cJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\f\u0010\nR\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000e\u0010\nR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0017\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0007\u0010\nR\u0017\u0010\u0019\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\b\u001a\u0004\b\u0018\u0010\n¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/window/h;", "", "other", "", "equals", "", "hashCode", ak.av, "Z", "e", "()Z", "focusable", "b", "dismissOnBackPress", ak.aF, "dismissOnClickOutside", "Landroidx/compose/ui/window/SecureFlagPolicy;", "d", "Landroidx/compose/ui/window/SecureFlagPolicy;", "f", "()Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "excludeFromSystemGesture", "clippingEnabled", "g", "usePlatformDefaultWidth", "<init>", "(ZZZLandroidx/compose/ui/window/SecureFlagPolicy;ZZZ)V", "(ZZZLandroidx/compose/ui/window/SecureFlagPolicy;ZZ)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean focusable;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean dismissOnBackPress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean dismissOnClickOutside;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final SecureFlagPolicy securePolicy;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean excludeFromSystemGesture;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean clippingEnabled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean usePlatformDefaultWidth;

    @androidx.compose.ui.g
    public h() {
        this(false, false, false, null, false, false, false, 127, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(boolean z10, boolean z11, boolean z12, @dl.d SecureFlagPolicy securePolicy, boolean z13, boolean z14) {
        this(z10, z11, z12, securePolicy, z13, z14, false);
        f0.p(securePolicy, "securePolicy");
    }

    public /* synthetic */ h(boolean z10, boolean z11, boolean z12, SecureFlagPolicy secureFlagPolicy, boolean z13, boolean z14, int i10, u uVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12, (i10 & 8) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i10 & 16) != 0 ? true : z13, (i10 & 32) == 0 ? z14 : true);
    }

    @androidx.compose.ui.g
    public h(boolean z10, boolean z11, boolean z12, @dl.d SecureFlagPolicy securePolicy, boolean z13, boolean z14, boolean z15) {
        f0.p(securePolicy, "securePolicy");
        this.focusable = z10;
        this.dismissOnBackPress = z11;
        this.dismissOnClickOutside = z12;
        this.securePolicy = securePolicy;
        this.excludeFromSystemGesture = z13;
        this.clippingEnabled = z14;
        this.usePlatformDefaultWidth = z15;
    }

    public /* synthetic */ h(boolean z10, boolean z11, boolean z12, SecureFlagPolicy secureFlagPolicy, boolean z13, boolean z14, boolean z15, int i10, u uVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12, (i10 & 8) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i10 & 16) != 0 ? true : z13, (i10 & 32) == 0 ? z14 : true, (i10 & 64) != 0 ? false : z15);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getClippingEnabled() {
        return this.clippingEnabled;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getExcludeFromSystemGesture() {
        return this.excludeFromSystemGesture;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getFocusable() {
        return this.focusable;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof h)) {
            return false;
        }
        h hVar = (h) other;
        return this.focusable == hVar.focusable && this.dismissOnBackPress == hVar.dismissOnBackPress && this.dismissOnClickOutside == hVar.dismissOnClickOutside && this.securePolicy == hVar.securePolicy && this.excludeFromSystemGesture == hVar.excludeFromSystemGesture && this.clippingEnabled == hVar.clippingEnabled && this.usePlatformDefaultWidth == hVar.usePlatformDefaultWidth;
    }

    @dl.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public final SecureFlagPolicy getSecurePolicy() {
        return this.securePolicy;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public int hashCode() {
        return (((((((((((((b0.a(this.dismissOnBackPress) * 31) + b0.a(this.focusable)) * 31) + b0.a(this.dismissOnBackPress)) * 31) + b0.a(this.dismissOnClickOutside)) * 31) + this.securePolicy.hashCode()) * 31) + b0.a(this.excludeFromSystemGesture)) * 31) + b0.a(this.clippingEnabled)) * 31) + b0.a(this.usePlatformDefaultWidth);
    }
}
