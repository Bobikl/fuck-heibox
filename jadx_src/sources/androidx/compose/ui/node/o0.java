package androidx.compose.ui.node;

import androidx.compose.ui.n.d;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: ModifierNodeElement.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.ui.g
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004B,\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0002\b\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u00020\nH\u0016J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/node/o0;", "Landroidx/compose/ui/n$d;", "N", "Landroidx/compose/ui/n$c;", "Landroidx/compose/ui/platform/y0;", "f", "()Landroidx/compose/ui/n$d;", "node", "m", "(Landroidx/compose/ui/n$d;)Landroidx/compose/ui/n$d;", "", "hashCode", "", "other", "", "equals", "e", "Ljava/lang/Object;", "g", "()Ljava/lang/Object;", "params", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/b2;", "Lkotlin/t;", "inspectorInfo", "<init>", "(Ljava/lang/Object;Lyh/l;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public abstract class o0<N extends androidx.compose.ui.n.d> extends androidx.compose.ui.platform.y0 implements androidx.compose.ui.n.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f15352f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final Object params;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(@dl.e Object obj, @dl.d yh.l<? super androidx.compose.ui.platform.x0, b2> inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.f0.p(inspectorInfo, "inspectorInfo");
        this.params = obj;
    }

    public /* synthetic */ o0(Object obj, yh.l lVar, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : obj, lVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof o0) && androidx.compose.ui.b.a(this, other)) {
            return kotlin.jvm.internal.f0.g(this.params, ((o0) other).params);
        }
        return false;
    }

    @dl.d
    public abstract N f();

    @dl.e
    /* JADX INFO: renamed from: g, reason: from getter */
    public final Object getParams() {
        return this.params;
    }

    public int hashCode() {
        Object obj = this.params;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    @dl.d
    public abstract N m(@dl.d N node);

    @Override // androidx.compose.ui.n
    public /* synthetic */ androidx.compose.ui.n s0(androidx.compose.ui.n nVar) {
        return androidx.compose.ui.m.a(this, nVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean t(yh.l lVar) {
        return androidx.compose.ui.o.b(this, lVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object v(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.d(this, obj, pVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.c(this, obj, pVar);
    }
}
