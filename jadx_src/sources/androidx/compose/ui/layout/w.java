package androidx.compose.ui.layout;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;

/* JADX INFO: compiled from: LayoutModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J)\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000e\u001a\u00020\f*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0016J\u001c\u0010\u0010\u001a\u00020\f*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00020\f*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0016J\u001c\u0010\u0012\u001a\u00020\f*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\fH\u0016ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/w;", "Landroidx/compose/ui/n$c;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/g0;", "measurable", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "k", "(Landroidx/compose/ui/layout/l0;Landroidx/compose/ui/layout/g0;J)Landroidx/compose/ui/layout/j0;", "Landroidx/compose/ui/layout/n;", "Landroidx/compose/ui/layout/m;", "", "height", "b", "width", "j", RXScreenCaptureService.KEY_HEIGHT, "i", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface w extends androidx.compose.ui.n.c {

    /* JADX INFO: compiled from: LayoutModifier.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @Deprecated
        public static boolean a(@dl.d w wVar, @dl.d yh.l<? super androidx.compose.ui.n.c, Boolean> predicate) {
            kotlin.jvm.internal.f0.p(predicate, "predicate");
            return androidx.compose.ui.o.a(wVar, predicate);
        }

        @Deprecated
        public static boolean b(@dl.d w wVar, @dl.d yh.l<? super androidx.compose.ui.n.c, Boolean> predicate) {
            kotlin.jvm.internal.f0.p(predicate, "predicate");
            return androidx.compose.ui.o.b(wVar, predicate);
        }

        @Deprecated
        public static <R> R c(@dl.d w wVar, R r10, @dl.d yh.p<? super R, ? super androidx.compose.ui.n.c, ? extends R> operation) {
            kotlin.jvm.internal.f0.p(operation, "operation");
            return (R) androidx.compose.ui.o.c(wVar, r10, operation);
        }

        @Deprecated
        public static <R> R d(@dl.d w wVar, R r10, @dl.d yh.p<? super androidx.compose.ui.n.c, ? super R, ? extends R> operation) {
            kotlin.jvm.internal.f0.p(operation, "operation");
            return (R) androidx.compose.ui.o.d(wVar, r10, operation);
        }

        @Deprecated
        public static int e(@dl.d w wVar, @dl.d n receiver, @dl.d m measurable, int i10) {
            kotlin.jvm.internal.f0.p(receiver, "$receiver");
            kotlin.jvm.internal.f0.p(measurable, "measurable");
            return v.a(wVar, receiver, measurable, i10);
        }

        @Deprecated
        public static int f(@dl.d w wVar, @dl.d n receiver, @dl.d m measurable, int i10) {
            kotlin.jvm.internal.f0.p(receiver, "$receiver");
            kotlin.jvm.internal.f0.p(measurable, "measurable");
            return v.b(wVar, receiver, measurable, i10);
        }

        @Deprecated
        public static int g(@dl.d w wVar, @dl.d n receiver, @dl.d m measurable, int i10) {
            kotlin.jvm.internal.f0.p(receiver, "$receiver");
            kotlin.jvm.internal.f0.p(measurable, "measurable");
            return v.c(wVar, receiver, measurable, i10);
        }

        @Deprecated
        public static int h(@dl.d w wVar, @dl.d n receiver, @dl.d m measurable, int i10) {
            kotlin.jvm.internal.f0.p(receiver, "$receiver");
            kotlin.jvm.internal.f0.p(measurable, "measurable");
            return v.d(wVar, receiver, measurable, i10);
        }

        @dl.d
        @Deprecated
        public static androidx.compose.ui.n i(@dl.d w wVar, @dl.d androidx.compose.ui.n other) {
            kotlin.jvm.internal.f0.p(other, "other");
            return androidx.compose.ui.m.a(wVar, other);
        }
    }

    int b(@dl.d n nVar, @dl.d m mVar, int i10);

    int h(@dl.d n nVar, @dl.d m mVar, int i10);

    int i(@dl.d n nVar, @dl.d m mVar, int i10);

    int j(@dl.d n nVar, @dl.d m mVar, int i10);

    @dl.d
    j0 k(@dl.d l0 l0Var, @dl.d g0 g0Var, long j10);
}
