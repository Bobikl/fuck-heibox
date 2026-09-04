package androidx.compose.material3;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.material3.d1, reason: from toString */
/* JADX INFO: compiled from: Swipeable.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/d1;", "", "", "overflow", ak.av, "other", "", "equals", "", "hashCode", "", "toString", "F", "b", "()F", "basis", "d", "factorAtMin", ak.aF, "factorAtMax", "<init>", "(FFF)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class ResistanceConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float basis;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float factorAtMin;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float factorAtMax;

    public ResistanceConfig(float f10, float f11, float f12) {
        this.basis = f10;
        this.factorAtMin = f11;
        this.factorAtMax = f12;
    }

    public /* synthetic */ ResistanceConfig(float f10, float f11, float f12, int i10, kotlin.jvm.internal.u uVar) {
        this(f10, (i10 & 2) != 0 ? 10.0f : f11, (i10 & 4) != 0 ? 10.0f : f12);
    }

    public final float a(float overflow) {
        float f10 = overflow < 0.0f ? this.factorAtMin : this.factorAtMax;
        if (f10 == 0.0f) {
            return 0.0f;
        }
        return (this.basis / f10) * ((float) Math.sin((fi.u.H(overflow / this.basis, -1.0f, 1.0f) * 3.1415927f) / 2));
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getBasis() {
        return this.basis;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getFactorAtMax() {
        return this.factorAtMax;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getFactorAtMin() {
        return this.factorAtMin;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResistanceConfig)) {
            return false;
        }
        ResistanceConfig resistanceConfig = (ResistanceConfig) other;
        if (!(this.basis == resistanceConfig.basis)) {
            return false;
        }
        if (this.factorAtMin == resistanceConfig.factorAtMin) {
            return (this.factorAtMax > resistanceConfig.factorAtMax ? 1 : (this.factorAtMax == resistanceConfig.factorAtMax ? 0 : -1)) == 0;
        }
        return false;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.basis) * 31) + Float.floatToIntBits(this.factorAtMin)) * 31) + Float.floatToIntBits(this.factorAtMax);
    }

    @dl.d
    public String toString() {
        return "ResistanceConfig(basis=" + this.basis + ", factorAtMin=" + this.factorAtMin + ", factorAtMax=" + this.factorAtMax + ')';
    }
}
