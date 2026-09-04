package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Expect.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0016\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0000¨\u0006\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/runtime/q2;", ak.av, "Landroidx/compose/runtime/f;", "", "b", "runtime_release"}, k = 2, mv = {1, 7, 1})
public final class ExpectKt {
    @dl.d
    public static final <T> q2<T> a() {
        return new q2<>(new yh.a<T>() { // from class: androidx.compose.runtime.ExpectKt$ThreadLocal$1
            @Override // yh.a
            @dl.e
            public final T invoke() {
                return null;
            }
        });
    }

    public static final int b(@dl.d f fVar) {
        kotlin.jvm.internal.f0.p(fVar, "<this>");
        return fVar.a(1) - 1;
    }
}
