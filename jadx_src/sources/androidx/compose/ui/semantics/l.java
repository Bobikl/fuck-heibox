package androidx.compose.ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.s0;

/* JADX INFO: compiled from: SemanticsModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/semantics/l;", "Landroidx/compose/ui/n$c;", "", "getId", "()I", "getId$annotations", "()V", "id", "Landroidx/compose/ui/semantics/j;", "c0", "()Landroidx/compose/ui/semantics/j;", "semanticsConfiguration", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface l extends androidx.compose.ui.n.c {

    /* JADX INFO: compiled from: SemanticsModifier.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @Deprecated
        public static boolean a(@dl.d l lVar, @dl.d yh.l<? super androidx.compose.ui.n.c, Boolean> predicate) {
            f0.p(predicate, "predicate");
            return androidx.compose.ui.o.a(lVar, predicate);
        }

        @Deprecated
        public static boolean b(@dl.d l lVar, @dl.d yh.l<? super androidx.compose.ui.n.c, Boolean> predicate) {
            f0.p(predicate, "predicate");
            return androidx.compose.ui.o.b(lVar, predicate);
        }

        @Deprecated
        public static <R> R c(@dl.d l lVar, R r10, @dl.d yh.p<? super R, ? super androidx.compose.ui.n.c, ? extends R> operation) {
            f0.p(operation, "operation");
            return (R) androidx.compose.ui.o.c(lVar, r10, operation);
        }

        @Deprecated
        public static <R> R d(@dl.d l lVar, R r10, @dl.d yh.p<? super androidx.compose.ui.n.c, ? super R, ? extends R> operation) {
            f0.p(operation, "operation");
            return (R) androidx.compose.ui.o.d(lVar, r10, operation);
        }

        @Deprecated
        public static int e(@dl.d l lVar) {
            return k.a(lVar);
        }

        @kotlin.k(message = "SemanticsModifier.id is now unused and has been set to a fixed value. Retrieve the id from LayoutInfo instead.", replaceWith = @s0(expression = "", imports = {}))
        public static /* synthetic */ void f() {
        }

        @dl.d
        @Deprecated
        public static androidx.compose.ui.n g(@dl.d l lVar, @dl.d androidx.compose.ui.n other) {
            f0.p(other, "other");
            return androidx.compose.ui.m.a(lVar, other);
        }
    }

    @dl.d
    /* JADX INFO: renamed from: c0 */
    j getSemanticsConfiguration();

    int getId();
}
