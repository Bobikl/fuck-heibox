package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.a1;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.j2;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: LazyLayoutPrefetchState.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.t
@j2
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000b\u0007B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bR/\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/lazy/layout/o;", "", "", UCropPlusActivity.ARG_INDEX, "Ls1/b;", "constraints", "Landroidx/compose/foundation/lazy/layout/o$a;", "b", "(IJ)Landroidx/compose/foundation/lazy/layout/o$a;", "Landroidx/compose/foundation/lazy/layout/o$b;", "<set-?>", ak.av, "Landroidx/compose/runtime/a1;", "()Landroidx/compose/foundation/lazy/layout/o$b;", ak.aF, "(Landroidx/compose/foundation/lazy/layout/o$b;)V", "prefetcher", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 prefetcher = h2.g(null, null, 2, null);

    /* JADX INFO: compiled from: LazyLayoutPrefetchState.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/o$a;", "", "Lkotlin/b2;", "cancel", "Landroidx/compose/foundation/lazy/layout/a;", "Landroidx/compose/foundation/lazy/layout/p$b;", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public interface a {
        void cancel();
    }

    /* JADX INFO: compiled from: LazyLayoutPrefetchState.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/o$b;", "", "", UCropPlusActivity.ARG_INDEX, "Ls1/b;", "constraints", "Landroidx/compose/foundation/lazy/layout/o$a;", ak.av, "(IJ)Landroidx/compose/foundation/lazy/layout/o$a;", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public interface b {
        @dl.d
        a a(int index, long constraints);
    }

    @dl.e
    public final b a() {
        return (b) this.prefetcher.getValue();
    }

    @dl.d
    public final a b(int index, long constraints) {
        a aVarA;
        b bVarA = a();
        return (bVarA == null || (aVarA = bVarA.a(index, constraints)) == null) ? androidx.compose.foundation.lazy.layout.a.f7134a : aVarA;
    }

    public final void c(@dl.e b bVar) {
        this.prefetcher.setValue(bVar);
    }
}
