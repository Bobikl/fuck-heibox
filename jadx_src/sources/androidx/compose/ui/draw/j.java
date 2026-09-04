package androidx.compose.ui.draw;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import yh.p;

/* JADX INFO: compiled from: DrawModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/j;", "Landroidx/compose/ui/n$c;", "Landroidx/compose/ui/graphics/drawscope/d;", "Lkotlin/b2;", RXScreenCaptureService.KEY_WIDTH, "ui_release"}, k = 1, mv = {1, 7, 1})
public interface j extends androidx.compose.ui.n.c {

    /* JADX INFO: compiled from: DrawModifier.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @Deprecated
        public static boolean a(@dl.d j jVar, @dl.d yh.l<? super androidx.compose.ui.n.c, Boolean> predicate) {
            f0.p(predicate, "predicate");
            return androidx.compose.ui.o.a(jVar, predicate);
        }

        @Deprecated
        public static boolean b(@dl.d j jVar, @dl.d yh.l<? super androidx.compose.ui.n.c, Boolean> predicate) {
            f0.p(predicate, "predicate");
            return androidx.compose.ui.o.b(jVar, predicate);
        }

        @Deprecated
        public static <R> R c(@dl.d j jVar, R r10, @dl.d p<? super R, ? super androidx.compose.ui.n.c, ? extends R> operation) {
            f0.p(operation, "operation");
            return (R) androidx.compose.ui.o.c(jVar, r10, operation);
        }

        @Deprecated
        public static <R> R d(@dl.d j jVar, R r10, @dl.d p<? super androidx.compose.ui.n.c, ? super R, ? extends R> operation) {
            f0.p(operation, "operation");
            return (R) androidx.compose.ui.o.d(jVar, r10, operation);
        }

        @dl.d
        @Deprecated
        public static androidx.compose.ui.n e(@dl.d j jVar, @dl.d androidx.compose.ui.n other) {
            f0.p(other, "other");
            return androidx.compose.ui.m.a(jVar, other);
        }
    }

    void w(@dl.d androidx.compose.ui.graphics.drawscope.d dVar);
}
