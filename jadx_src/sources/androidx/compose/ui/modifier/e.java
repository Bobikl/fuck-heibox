package androidx.compose.ui.modifier;

import androidx.compose.runtime.j2;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ModifierLocalConsumer.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/modifier/e;", "Landroidx/compose/ui/n$c;", "Landroidx/compose/ui/modifier/n;", "scope", "Lkotlin/b2;", "w1", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface e extends androidx.compose.ui.n.c {

    /* JADX INFO: compiled from: ModifierLocalConsumer.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @Deprecated
        public static boolean a(@dl.d e eVar, @dl.d yh.l<? super androidx.compose.ui.n.c, Boolean> predicate) {
            f0.p(predicate, "predicate");
            return androidx.compose.ui.o.a(eVar, predicate);
        }

        @Deprecated
        public static boolean b(@dl.d e eVar, @dl.d yh.l<? super androidx.compose.ui.n.c, Boolean> predicate) {
            f0.p(predicate, "predicate");
            return androidx.compose.ui.o.b(eVar, predicate);
        }

        @Deprecated
        public static <R> R c(@dl.d e eVar, R r10, @dl.d yh.p<? super R, ? super androidx.compose.ui.n.c, ? extends R> operation) {
            f0.p(operation, "operation");
            return (R) androidx.compose.ui.o.c(eVar, r10, operation);
        }

        @Deprecated
        public static <R> R d(@dl.d e eVar, R r10, @dl.d yh.p<? super androidx.compose.ui.n.c, ? super R, ? extends R> operation) {
            f0.p(operation, "operation");
            return (R) androidx.compose.ui.o.d(eVar, r10, operation);
        }

        @dl.d
        @Deprecated
        public static androidx.compose.ui.n e(@dl.d e eVar, @dl.d androidx.compose.ui.n other) {
            f0.p(other, "other");
            return androidx.compose.ui.m.a(eVar, other);
        }
    }

    void w1(@dl.d n nVar);
}
