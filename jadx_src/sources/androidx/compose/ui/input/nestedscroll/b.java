package androidx.compose.ui.input.nestedscroll;

import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import kotlin.Metadata;
import s1.x;

/* JADX INFO: compiled from: NestedScrollModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ)\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/b;", "", "Lb1/f;", "available", "Landroidx/compose/ui/input/nestedscroll/c;", "source", "e", "(JI)J", "consumed", ak.aF, "(JJI)J", "Ls1/x;", "d", "(JLkotlin/coroutines/c;)Ljava/lang/Object;", ak.av, "(JJLkotlin/coroutines/c;)Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface b {

    /* JADX INFO: compiled from: NestedScrollModifier.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @e
        @Deprecated
        public static Object a(@d b bVar, long j10, long j11, @d kotlin.coroutines.c<? super x> cVar) {
            return androidx.compose.ui.input.nestedscroll.a.a(bVar, j10, j11, cVar);
        }

        @Deprecated
        public static long b(@d b bVar, long j10, long j11, int i10) {
            return androidx.compose.ui.input.nestedscroll.a.b(bVar, j10, j11, i10);
        }

        @e
        @Deprecated
        public static Object c(@d b bVar, long j10, @d kotlin.coroutines.c<? super x> cVar) {
            return androidx.compose.ui.input.nestedscroll.a.c(bVar, j10, cVar);
        }

        @Deprecated
        public static long d(@d b bVar, long j10, int i10) {
            return androidx.compose.ui.input.nestedscroll.a.d(bVar, j10, i10);
        }
    }

    @e
    Object a(long j10, long j11, @d kotlin.coroutines.c<? super x> cVar);

    long c(long consumed, long available, int source);

    @e
    Object d(long j10, @d kotlin.coroutines.c<? super x> cVar);

    long e(long available, int source);
}
