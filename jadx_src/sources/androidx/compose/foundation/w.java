package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: EdgeEffectCompat.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/w;", "Landroid/widget/EdgeEffect;", "", "deltaDistance", "displacement", "Lkotlin/b2;", "onPull", "onRelease", "", "velocity", "onAbsorb", "delta", ak.av, "F", "oppositeReleaseDeltaThreshold", "b", "oppositeReleaseDelta", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "<init>", "(Landroid/content/Context;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class w extends EdgeEffect {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float oppositeReleaseDeltaThreshold;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float oppositeReleaseDelta;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@dl.d Context context) {
        super(context);
        kotlin.jvm.internal.f0.p(context, "context");
        this.oppositeReleaseDeltaThreshold = s1.a.a(context).E1(s1.h.g(1));
    }

    public final void a(float f10) {
        float f11 = this.oppositeReleaseDelta + f10;
        this.oppositeReleaseDelta = f11;
        if (Math.abs(f11) > this.oppositeReleaseDeltaThreshold) {
            onRelease();
        }
    }

    @Override // android.widget.EdgeEffect
    public void onAbsorb(int i10) {
        this.oppositeReleaseDelta = 0.0f;
        super.onAbsorb(i10);
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f10) {
        this.oppositeReleaseDelta = 0.0f;
        super.onPull(f10);
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f10, float f11) {
        this.oppositeReleaseDelta = 0.0f;
        super.onPull(f10, f11);
    }

    @Override // android.widget.EdgeEffect
    public void onRelease() {
        this.oppositeReleaseDelta = 0.0f;
        super.onRelease();
    }
}
