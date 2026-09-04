package androidx.compose.foundation;

import androidx.compose.runtime.j2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Overscroll.kt */
/* JADX INFO: loaded from: classes.dex */
@t
@j2
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0013\u001a\u00020\u00128&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\u001c\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/f0;", "", "Lb1/f;", "scrollDelta", "Landroidx/compose/ui/input/nestedscroll/c;", "source", "e", "(JI)J", "initialDragDelta", "overscrollDelta", "Lkotlin/b2;", ak.av, "(JJI)V", "Ls1/x;", "velocity", "f", "(JLkotlin/coroutines/c;)Ljava/lang/Object;", "b", "", "isEnabled", "()Z", "setEnabled", "(Z)V", ak.aF, "isInProgress", "Landroidx/compose/ui/n;", "d", "()Landroidx/compose/ui/n;", "effectModifier", "foundation_release"}, k = 1, mv = {1, 7, 1})
public interface f0 {
    void a(long initialDragDelta, long overscrollDelta, int source);

    @dl.e
    Object b(long j10, @dl.d kotlin.coroutines.c<? super b2> cVar);

    boolean c();

    @dl.d
    androidx.compose.ui.n d();

    long e(long scrollDelta, int source);

    @dl.e
    Object f(long j10, @dl.d kotlin.coroutines.c<? super s1.x> cVar);

    boolean isEnabled();

    void setEnabled(boolean z10);
}
