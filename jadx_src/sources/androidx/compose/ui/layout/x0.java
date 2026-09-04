package androidx.compose.ui.layout;

import kotlin.Metadata;

/* JADX INFO: compiled from: OnPlacedModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/x0;", "Landroidx/compose/ui/n$c;", "Landroidx/compose/ui/layout/q;", "coordinates", "Lkotlin/b2;", "p", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface x0 extends androidx.compose.ui.n.c {

    /* JADX INFO: compiled from: OnPlacedModifier.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @Deprecated
        public static boolean a(@dl.d x0 x0Var, @dl.d yh.l<? super androidx.compose.ui.n.c, Boolean> predicate) {
            kotlin.jvm.internal.f0.p(predicate, "predicate");
            return androidx.compose.ui.o.a(x0Var, predicate);
        }

        @Deprecated
        public static boolean b(@dl.d x0 x0Var, @dl.d yh.l<? super androidx.compose.ui.n.c, Boolean> predicate) {
            kotlin.jvm.internal.f0.p(predicate, "predicate");
            return androidx.compose.ui.o.b(x0Var, predicate);
        }

        @Deprecated
        public static <R> R c(@dl.d x0 x0Var, R r10, @dl.d yh.p<? super R, ? super androidx.compose.ui.n.c, ? extends R> operation) {
            kotlin.jvm.internal.f0.p(operation, "operation");
            return (R) androidx.compose.ui.o.c(x0Var, r10, operation);
        }

        @Deprecated
        public static <R> R d(@dl.d x0 x0Var, R r10, @dl.d yh.p<? super androidx.compose.ui.n.c, ? super R, ? extends R> operation) {
            kotlin.jvm.internal.f0.p(operation, "operation");
            return (R) androidx.compose.ui.o.d(x0Var, r10, operation);
        }

        @dl.d
        @Deprecated
        public static androidx.compose.ui.n e(@dl.d x0 x0Var, @dl.d androidx.compose.ui.n other) {
            kotlin.jvm.internal.f0.p(other, "other");
            return androidx.compose.ui.m.a(x0Var, other);
        }
    }

    void p(@dl.d q qVar);
}
