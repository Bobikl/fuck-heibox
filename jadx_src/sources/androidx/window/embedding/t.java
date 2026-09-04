package androidx.window.embedding;

import android.app.Activity;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SplitInfo.kt */
/* JADX INFO: loaded from: classes6.dex */
@androidx.window.core.d
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0013\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/window/embedding/t;", "", "Landroid/app/Activity;", RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, "", ak.av, "other", "equals", "", "hashCode", "", "toString", "Landroidx/window/embedding/c;", "Landroidx/window/embedding/c;", "b", "()Landroidx/window/embedding/c;", "primaryActivityStack", ak.aF, "secondaryActivityStack", "", "F", "d", "()F", "splitRatio", "<init>", "(Landroidx/window/embedding/c;Landroidx/window/embedding/c;F)V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final c primaryActivityStack;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final c secondaryActivityStack;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float splitRatio;

    public t(@dl.d c primaryActivityStack, @dl.d c secondaryActivityStack, float f10) {
        f0.p(primaryActivityStack, "primaryActivityStack");
        f0.p(secondaryActivityStack, "secondaryActivityStack");
        this.primaryActivityStack = primaryActivityStack;
        this.secondaryActivityStack = secondaryActivityStack;
        this.splitRatio = f10;
    }

    public final boolean a(@dl.d Activity activity) {
        f0.p(activity, "activity");
        return this.primaryActivityStack.a(activity) || this.secondaryActivityStack.a(activity);
    }

    @dl.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getPrimaryActivityStack() {
        return this.primaryActivityStack;
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getSecondaryActivityStack() {
        return this.secondaryActivityStack;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getSplitRatio() {
        return this.splitRatio;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof t)) {
            return false;
        }
        t tVar = (t) other;
        if (f0.g(this.primaryActivityStack, tVar.primaryActivityStack) && f0.g(this.secondaryActivityStack, tVar.secondaryActivityStack)) {
            return (this.splitRatio > tVar.splitRatio ? 1 : (this.splitRatio == tVar.splitRatio ? 0 : -1)) == 0;
        }
        return false;
    }

    public int hashCode() {
        return (((this.primaryActivityStack.hashCode() * 31) + this.secondaryActivityStack.hashCode()) * 31) + Float.floatToIntBits(this.splitRatio);
    }

    @dl.d
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SplitInfo:{");
        sb2.append("primaryActivityStack=" + getPrimaryActivityStack() + ',');
        sb2.append("secondaryActivityStack=" + getSecondaryActivityStack() + ',');
        sb2.append("splitRatio=" + getSplitRatio() + '}');
        String string = sb2.toString();
        f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
