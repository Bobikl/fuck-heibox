package androidx.compose.ui.modifier;

import androidx.compose.runtime.j2;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ModifierLocalProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/modifier/m;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/ui/n$c;", "Landroidx/compose/ui/modifier/p;", "getKey", "()Landroidx/compose/ui/modifier/p;", "key", "getValue", "()Ljava/lang/Object;", "value", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface m<T> extends androidx.compose.ui.n.c {

    /* JADX INFO: compiled from: ModifierLocalProvider.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @Deprecated
        public static <T> boolean a(@dl.d m<T> mVar, @dl.d yh.l<? super androidx.compose.ui.n.c, Boolean> predicate) {
            f0.p(predicate, "predicate");
            return androidx.compose.ui.o.a(mVar, predicate);
        }

        @Deprecated
        public static <T> boolean b(@dl.d m<T> mVar, @dl.d yh.l<? super androidx.compose.ui.n.c, Boolean> predicate) {
            f0.p(predicate, "predicate");
            return androidx.compose.ui.o.b(mVar, predicate);
        }

        @Deprecated
        public static <T, R> R c(@dl.d m<T> mVar, R r10, @dl.d yh.p<? super R, ? super androidx.compose.ui.n.c, ? extends R> operation) {
            f0.p(operation, "operation");
            return (R) androidx.compose.ui.o.c(mVar, r10, operation);
        }

        @Deprecated
        public static <T, R> R d(@dl.d m<T> mVar, R r10, @dl.d yh.p<? super androidx.compose.ui.n.c, ? super R, ? extends R> operation) {
            f0.p(operation, "operation");
            return (R) androidx.compose.ui.o.d(mVar, r10, operation);
        }

        @dl.d
        @Deprecated
        public static <T> androidx.compose.ui.n e(@dl.d m<T> mVar, @dl.d androidx.compose.ui.n other) {
            f0.p(other, "other");
            return androidx.compose.ui.m.a(mVar, other);
        }
    }

    @dl.d
    p<T> getKey();

    T getValue();
}
