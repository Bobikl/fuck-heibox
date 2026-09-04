package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FocusRequesterModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/t;", "Landroidx/compose/ui/n$c;", "Landroidx/compose/ui/focus/FocusRequester;", "i0", "()Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface t extends androidx.compose.ui.n.c {

    /* JADX INFO: compiled from: FocusRequesterModifier.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @Deprecated
        public static boolean a(@dl.d t tVar, @dl.d yh.l<? super androidx.compose.ui.n.c, Boolean> predicate) {
            f0.p(predicate, "predicate");
            return androidx.compose.ui.o.a(tVar, predicate);
        }

        @Deprecated
        public static boolean b(@dl.d t tVar, @dl.d yh.l<? super androidx.compose.ui.n.c, Boolean> predicate) {
            f0.p(predicate, "predicate");
            return androidx.compose.ui.o.b(tVar, predicate);
        }

        @Deprecated
        public static <R> R c(@dl.d t tVar, R r10, @dl.d yh.p<? super R, ? super androidx.compose.ui.n.c, ? extends R> operation) {
            f0.p(operation, "operation");
            return (R) androidx.compose.ui.o.c(tVar, r10, operation);
        }

        @Deprecated
        public static <R> R d(@dl.d t tVar, R r10, @dl.d yh.p<? super androidx.compose.ui.n.c, ? super R, ? extends R> operation) {
            f0.p(operation, "operation");
            return (R) androidx.compose.ui.o.d(tVar, r10, operation);
        }

        @dl.d
        @Deprecated
        public static androidx.compose.ui.n e(@dl.d t tVar, @dl.d androidx.compose.ui.n other) {
            f0.p(other, "other");
            return androidx.compose.ui.m.a(tVar, other);
        }
    }

    @dl.d
    FocusRequester i0();
}
