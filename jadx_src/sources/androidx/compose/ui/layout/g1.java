package androidx.compose.ui.layout;

import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: RelocationModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.ui.g
@kotlin.k(level = DeprecationLevel.ERROR, message = "Please use BringIntoViewResponder instead.")
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/g1;", "Landroidx/compose/ui/n$c;", "Lb1/i;", "source", "Landroidx/compose/ui/layout/q;", "layoutCoordinates", "g0", "destination", "Lkotlin/b2;", "L0", "(Lb1/i;Lb1/i;Lkotlin/coroutines/c;)Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface g1 extends androidx.compose.ui.n.c {

    /* JADX INFO: compiled from: RelocationModifier.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @Deprecated
        public static boolean a(@dl.d g1 g1Var, @dl.d yh.l<? super androidx.compose.ui.n.c, Boolean> predicate) {
            kotlin.jvm.internal.f0.p(predicate, "predicate");
            return androidx.compose.ui.o.a(g1Var, predicate);
        }

        @Deprecated
        public static boolean b(@dl.d g1 g1Var, @dl.d yh.l<? super androidx.compose.ui.n.c, Boolean> predicate) {
            kotlin.jvm.internal.f0.p(predicate, "predicate");
            return androidx.compose.ui.o.b(g1Var, predicate);
        }

        @Deprecated
        public static <R> R c(@dl.d g1 g1Var, R r10, @dl.d yh.p<? super R, ? super androidx.compose.ui.n.c, ? extends R> operation) {
            kotlin.jvm.internal.f0.p(operation, "operation");
            return (R) androidx.compose.ui.o.c(g1Var, r10, operation);
        }

        @Deprecated
        public static <R> R d(@dl.d g1 g1Var, R r10, @dl.d yh.p<? super androidx.compose.ui.n.c, ? super R, ? extends R> operation) {
            kotlin.jvm.internal.f0.p(operation, "operation");
            return (R) androidx.compose.ui.o.d(g1Var, r10, operation);
        }

        @dl.d
        @Deprecated
        public static androidx.compose.ui.n e(@dl.d g1 g1Var, @dl.d androidx.compose.ui.n other) {
            kotlin.jvm.internal.f0.p(other, "other");
            return androidx.compose.ui.m.a(g1Var, other);
        }
    }

    @dl.e
    Object L0(@dl.d b1.i iVar, @dl.d b1.i iVar2, @dl.d kotlin.coroutines.c<? super b2> cVar);

    @dl.d
    b1.i g0(@dl.d b1.i source, @dl.d q layoutCoordinates);
}
