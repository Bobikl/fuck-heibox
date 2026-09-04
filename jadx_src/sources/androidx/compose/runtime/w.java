package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: CompositionLocal.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B1\b\u0000\u0012&\u0010\u0006\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u0002j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000bR:\u0010\u0006\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u0002j\u0002`\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/w;", "", "Lu0/i;", "Landroidx/compose/runtime/v;", "Landroidx/compose/runtime/m2;", "Landroidx/compose/runtime/CompositionLocalMap;", "compositionLocals", "Lu0/i;", ak.av, "()Lu0/i;", "<init>", "(Lu0/i;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final u0.i<v<Object>, m2<Object>> f13324a;

    /* JADX WARN: Multi-variable type inference failed */
    public w(@dl.d u0.i<v<Object>, ? extends m2<? extends Object>> compositionLocals) {
        kotlin.jvm.internal.f0.p(compositionLocals, "compositionLocals");
        this.f13324a = compositionLocals;
    }

    @dl.d
    public final u0.i<v<Object>, m2<Object>> a() {
        return this.f13324a;
    }
}
