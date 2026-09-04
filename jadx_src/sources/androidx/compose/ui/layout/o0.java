package androidx.compose.ui.layout;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: LayoutInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\t\u0010\u000e¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/n;", ak.av, "Landroidx/compose/ui/n;", ak.aF, "()Landroidx/compose/ui/n;", "modifier", "Landroidx/compose/ui/layout/q;", "b", "Landroidx/compose/ui/layout/q;", "()Landroidx/compose/ui/layout/q;", "coordinates", "Ljava/lang/Object;", "()Ljava/lang/Object;", "extra", "<init>", "(Landroidx/compose/ui/n;Landroidx/compose/ui/layout/q;Ljava/lang/Object;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class o0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f15034d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.n modifier;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final q coordinates;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final Object extra;

    public o0(@dl.d androidx.compose.ui.n modifier, @dl.d q coordinates, @dl.e Object obj) {
        kotlin.jvm.internal.f0.p(modifier, "modifier");
        kotlin.jvm.internal.f0.p(coordinates, "coordinates");
        this.modifier = modifier;
        this.coordinates = coordinates;
        this.extra = obj;
    }

    public /* synthetic */ o0(androidx.compose.ui.n nVar, q qVar, Object obj, int i10, kotlin.jvm.internal.u uVar) {
        this(nVar, qVar, (i10 & 4) != 0 ? null : obj);
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final q getCoordinates() {
        return this.coordinates;
    }

    @dl.e
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Object getExtra() {
        return this.extra;
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final androidx.compose.ui.n getModifier() {
        return this.modifier;
    }
}
