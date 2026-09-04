package androidx.compose.ui.input.pointer;

import kotlin.Metadata;

/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/g0;", "Landroidx/compose/ui/n$c;", "Landroidx/compose/ui/input/pointer/e0;", "z1", "()Landroidx/compose/ui/input/pointer/e0;", "pointerInputFilter", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface g0 extends androidx.compose.ui.n.c {

    /* JADX INFO: compiled from: PointerEvent.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @Deprecated
        public static boolean a(@dl.d g0 g0Var, @dl.d yh.l<? super androidx.compose.ui.n.c, Boolean> predicate) {
            kotlin.jvm.internal.f0.p(predicate, "predicate");
            return androidx.compose.ui.o.a(g0Var, predicate);
        }

        @Deprecated
        public static boolean b(@dl.d g0 g0Var, @dl.d yh.l<? super androidx.compose.ui.n.c, Boolean> predicate) {
            kotlin.jvm.internal.f0.p(predicate, "predicate");
            return androidx.compose.ui.o.b(g0Var, predicate);
        }

        @Deprecated
        public static <R> R c(@dl.d g0 g0Var, R r10, @dl.d yh.p<? super R, ? super androidx.compose.ui.n.c, ? extends R> operation) {
            kotlin.jvm.internal.f0.p(operation, "operation");
            return (R) androidx.compose.ui.o.c(g0Var, r10, operation);
        }

        @Deprecated
        public static <R> R d(@dl.d g0 g0Var, R r10, @dl.d yh.p<? super androidx.compose.ui.n.c, ? super R, ? extends R> operation) {
            kotlin.jvm.internal.f0.p(operation, "operation");
            return (R) androidx.compose.ui.o.d(g0Var, r10, operation);
        }

        @dl.d
        @Deprecated
        public static androidx.compose.ui.n e(@dl.d g0 g0Var, @dl.d androidx.compose.ui.n other) {
            kotlin.jvm.internal.f0.p(other, "other");
            return androidx.compose.ui.m.a(g0Var, other);
        }
    }

    @dl.d
    /* JADX INFO: renamed from: z1 */
    e0 getPointerInputFilter();
}
