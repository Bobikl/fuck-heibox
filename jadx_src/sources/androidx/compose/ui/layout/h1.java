package androidx.compose.ui.layout;

import com.umeng.analytics.pro.ak;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: RelocationModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u0096\u0001\u0010\u0010\u001a\u00020\u0000*\u00020\u000026\u0010\b\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00020\u00012F\u0010\u000f\u001aB\b\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/n;", "Lkotlin/Function2;", "Lb1/i;", "Lkotlin/m0;", "name", "rect", "Landroidx/compose/ui/layout/q;", "layoutCoordinates", "onProvideDestination", "Lkotlin/Function3;", "sourceRect", "destinationRect", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "", "onPerformRelocation", ak.av, "(Landroidx/compose/ui/n;Lyh/p;Lyh/q;)Landroidx/compose/ui/n;", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class h1 {
    @androidx.compose.ui.g
    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Please use BringIntoViewResponder instead.")
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, @dl.d yh.p<? super b1.i, ? super q, b1.i> onProvideDestination, @dl.d yh.q<? super b1.i, ? super b1.i, ? super kotlin.coroutines.c<? super b2>, ? extends Object> onPerformRelocation) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(onProvideDestination, "onProvideDestination");
        kotlin.jvm.internal.f0.p(onPerformRelocation, "onPerformRelocation");
        return nVar;
    }
}
