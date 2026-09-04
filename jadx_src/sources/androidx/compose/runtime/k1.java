package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 1)
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\b\u0000\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\f\u001a\u00028\u0000\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\f\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0004\u0010\u000f¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/k1;", androidx.exifinterface.media.a.f23244d5, "", "Landroidx/compose/runtime/v;", ak.av, "Landroidx/compose/runtime/v;", "b", "()Landroidx/compose/runtime/v;", "compositionLocal", "Ljava/lang/Object;", ak.aF, "()Ljava/lang/Object;", "value", "", "Z", "()Z", "canOverride", "<init>", "(Landroidx/compose/runtime/v;Ljava/lang/Object;Z)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class k1<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f13023d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final v<T> compositionLocal;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final T value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean canOverride;

    public k1(@dl.d v<T> compositionLocal, T t10, boolean z10) {
        kotlin.jvm.internal.f0.p(compositionLocal, "compositionLocal");
        this.compositionLocal = compositionLocal;
        this.value = t10;
        this.canOverride = z10;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCanOverride() {
        return this.canOverride;
    }

    @dl.d
    public final v<T> b() {
        return this.compositionLocal;
    }

    public final T c() {
        return this.value;
    }
}
