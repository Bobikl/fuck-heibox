package androidx.compose.animation.core;

import androidx.compose.animation.core.p;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: VectorizedDecayAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J'\u0010\b\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\f\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\f\u0010\tJ\u001f\u0010\r\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Landroidx/compose/animation/core/k1;", "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "", "", "playTimeNanos", "initialValue", "initialVelocity", "e", "(JLandroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;)Landroidx/compose/animation/core/p;", ak.aF, "(Landroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;)J", "b", "d", "(Landroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;)Landroidx/compose/animation/core/p;", "", ak.av, "()F", "absVelocityThreshold", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public interface k1<V extends p> {
    float a();

    @dl.d
    V b(long playTimeNanos, @dl.d V initialValue, @dl.d V initialVelocity);

    long c(@dl.d V initialValue, @dl.d V initialVelocity);

    @dl.d
    V d(@dl.d V initialValue, @dl.d V initialVelocity);

    @dl.d
    V e(long playTimeNanos, @dl.d V initialValue, @dl.d V initialVelocity);
}
