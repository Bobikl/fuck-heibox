package androidx.compose.material3;

import com.umeng.analytics.pro.ak;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: Swipeable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\tR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR#\u0010\u0013\u001a\u00020\u00108\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/material3/s1;", "", "", "", "anchors", "factorAtMin", "factorAtMax", "Landroidx/compose/material3/d1;", ak.aF, "(Ljava/util/Set;FF)Landroidx/compose/material3/d1;", "Landroidx/compose/animation/core/z0;", "b", "Landroidx/compose/animation/core/z0;", ak.av, "()Landroidx/compose/animation/core/z0;", "AnimationSpec", "Ls1/h;", "F", "()F", "VelocityThreshold", "d", "StiffResistanceFactor", "e", "StandardResistanceFactor", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final s1 f12114a = new s1();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final androidx.compose.animation.core.z0<Float> AnimationSpec = new androidx.compose.animation.core.z0<>(0.0f, 0.0f, null, 7, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float VelocityThreshold = s1.h.g(125);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final float StiffResistanceFactor = 20.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final float StandardResistanceFactor = 10.0f;

    private s1() {
    }

    public static /* synthetic */ ResistanceConfig d(s1 s1Var, Set set, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 10.0f;
        }
        if ((i10 & 4) != 0) {
            f11 = 10.0f;
        }
        return s1Var.c(set, f10, f11);
    }

    @dl.d
    public final androidx.compose.animation.core.z0<Float> a() {
        return AnimationSpec;
    }

    public final float b() {
        return VelocityThreshold;
    }

    @dl.e
    public final ResistanceConfig c(@dl.d Set<Float> anchors, float factorAtMin, float factorAtMax) {
        kotlin.jvm.internal.f0.p(anchors, "anchors");
        if (anchors.size() <= 1) {
            return null;
        }
        Float fM3 = CollectionsKt___CollectionsKt.M3(anchors);
        kotlin.jvm.internal.f0.m(fM3);
        float fFloatValue = fM3.floatValue();
        Float fE4 = CollectionsKt___CollectionsKt.e4(anchors);
        kotlin.jvm.internal.f0.m(fE4);
        return new ResistanceConfig(fFloatValue - fE4.floatValue(), factorAtMin, factorAtMax);
    }
}
