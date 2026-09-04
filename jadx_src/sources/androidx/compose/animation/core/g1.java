package androidx.compose.animation.core;

import androidx.compose.animation.core.p;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: VectorConverters.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B/\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\f\u0010\rR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Landroidx/compose/animation/core/g1;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "Landroidx/compose/animation/core/f1;", "Lkotlin/Function1;", "convertToVector", "Lyh/l;", ak.av, "()Lyh/l;", "convertFromVector", "b", "<init>", "(Lyh/l;Lyh/l;)V", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public final class g1<T, V extends p> implements f1<T, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final yh.l<T, V> f4431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.l<V, T> f4432b;

    /* JADX WARN: Multi-variable type inference failed */
    public g1(@dl.d yh.l<? super T, ? extends V> convertToVector, @dl.d yh.l<? super V, ? extends T> convertFromVector) {
        kotlin.jvm.internal.f0.p(convertToVector, "convertToVector");
        kotlin.jvm.internal.f0.p(convertFromVector, "convertFromVector");
        this.f4431a = convertToVector;
        this.f4432b = convertFromVector;
    }

    @Override // androidx.compose.animation.core.f1
    @dl.d
    public yh.l<T, V> a() {
        return this.f4431a;
    }

    @Override // androidx.compose.animation.core.f1
    @dl.d
    public yh.l<V, T> b() {
        return this.f4432b;
    }
}
