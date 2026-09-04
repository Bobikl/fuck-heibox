package androidx.compose.ui.draw;

import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import yh.p;

/* JADX INFO: compiled from: DrawModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/g;", "Landroidx/compose/ui/draw/j;", "Landroidx/compose/ui/draw/c;", "params", "Lkotlin/b2;", "F0", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface g extends j {

    /* JADX INFO: compiled from: DrawModifier.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @Deprecated
        public static boolean a(@dl.d g gVar, @dl.d yh.l<? super androidx.compose.ui.n.c, Boolean> predicate) {
            f0.p(predicate, "predicate");
            return androidx.compose.ui.o.a(gVar, predicate);
        }

        @Deprecated
        public static boolean b(@dl.d g gVar, @dl.d yh.l<? super androidx.compose.ui.n.c, Boolean> predicate) {
            f0.p(predicate, "predicate");
            return androidx.compose.ui.o.b(gVar, predicate);
        }

        @Deprecated
        public static <R> R c(@dl.d g gVar, R r10, @dl.d p<? super R, ? super androidx.compose.ui.n.c, ? extends R> operation) {
            f0.p(operation, "operation");
            return (R) androidx.compose.ui.o.c(gVar, r10, operation);
        }

        @Deprecated
        public static <R> R d(@dl.d g gVar, R r10, @dl.d p<? super androidx.compose.ui.n.c, ? super R, ? extends R> operation) {
            f0.p(operation, "operation");
            return (R) androidx.compose.ui.o.d(gVar, r10, operation);
        }

        @dl.d
        @Deprecated
        public static androidx.compose.ui.n e(@dl.d g gVar, @dl.d androidx.compose.ui.n other) {
            f0.p(other, "other");
            return androidx.compose.ui.m.a(gVar, other);
        }
    }

    void F0(@dl.d c cVar);
}
