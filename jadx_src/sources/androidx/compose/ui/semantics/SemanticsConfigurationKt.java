package androidx.compose.ui.semantics;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SemanticsConfiguration.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/ui/semantics/j;", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "key", ak.av, "(Landroidx/compose/ui/semantics/j;Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class SemanticsConfigurationKt {
    @dl.e
    public static final <T> T a(@dl.d j jVar, @dl.d SemanticsPropertyKey<T> key) {
        f0.p(jVar, "<this>");
        f0.p(key, "key");
        return (T) jVar.j(key, new yh.a<T>() { // from class: androidx.compose.ui.semantics.SemanticsConfigurationKt$getOrNull$1
            @Override // yh.a
            @dl.e
            public final T invoke() {
                return null;
            }
        });
    }
}
