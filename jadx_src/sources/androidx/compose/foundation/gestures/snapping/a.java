package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.p;
import androidx.compose.foundation.gestures.m;
import androidx.constraintlayout.core.motion.utils.w;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bb\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004J7\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/a;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "", "Landroidx/compose/foundation/gestures/m;", "scope", w.c.R, "velocity", "Landroidx/compose/animation/core/j;", ak.av, "(Landroidx/compose/foundation/gestures/m;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 7, 1})
public interface a<T, V extends p> {
    @dl.e
    Object a(@dl.d m mVar, T t10, T t11, @dl.d kotlin.coroutines.c<? super AnimationState<T, V>> cVar);
}
