package androidx.compose.animation.core;

import androidx.compose.animation.core.p;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Animation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004J\u0017\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\u000f\u001a\u00020\u00058fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/d;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "", "", "playTimeNanos", "e", "(J)Ljava/lang/Object;", "g", "(J)Landroidx/compose/animation/core/p;", "", "b", ak.aF, "()J", "durationNanos", "Landroidx/compose/animation/core/f1;", "d", "()Landroidx/compose/animation/core/f1;", "typeConverter", "f", "()Ljava/lang/Object;", "targetValue", ak.av, "()Z", "isInfinite", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public interface d<T, V extends p> {

    /* JADX INFO: compiled from: Animation.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @Deprecated
        public static <T, V extends p> boolean a(@dl.d d<T, V> dVar, long j10) {
            return c.a(dVar, j10);
        }
    }

    boolean a();

    boolean b(long playTimeNanos);

    long c();

    @dl.d
    f1<T, V> d();

    T e(long playTimeNanos);

    T f();

    @dl.d
    V g(long playTimeNanos);
}
