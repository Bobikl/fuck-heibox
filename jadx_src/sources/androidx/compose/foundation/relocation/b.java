package androidx.compose.foundation.relocation;

import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.x0;
import androidx.compose.ui.m;
import androidx.compose.ui.n;
import androidx.compose.ui.o;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: BringIntoView.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b \u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\fR(\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00078D@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\n8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/relocation/b;", "Landroidx/compose/ui/modifier/e;", "Landroidx/compose/ui/layout/x0;", "Landroidx/compose/ui/modifier/n;", "scope", "Lkotlin/b2;", "w1", "Landroidx/compose/ui/layout/q;", "coordinates", "p", "Landroidx/compose/foundation/relocation/c;", "b", "Landroidx/compose/foundation/relocation/c;", "defaultParent", ak.aF, "localParent", "<set-?>", "d", "Landroidx/compose/ui/layout/q;", "()Landroidx/compose/ui/layout/q;", "layoutCoordinates", "()Landroidx/compose/foundation/relocation/c;", "parent", "<init>", "(Landroidx/compose/foundation/relocation/c;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public abstract class b implements androidx.compose.ui.modifier.e, x0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final c defaultParent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private c localParent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private q layoutCoordinates;

    public b(@dl.d c defaultParent) {
        f0.p(defaultParent, "defaultParent");
        this.defaultParent = defaultParent;
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(l lVar) {
        return o.a(this, lVar);
    }

    @dl.e
    protected final q c() {
        q qVar = this.layoutCoordinates;
        if (qVar == null || !qVar.p()) {
            return null;
        }
        return qVar;
    }

    @dl.d
    protected final c d() {
        c cVar = this.localParent;
        return cVar == null ? this.defaultParent : cVar;
    }

    @Override // androidx.compose.ui.layout.x0
    public void p(@dl.d q coordinates) {
        f0.p(coordinates, "coordinates");
        this.layoutCoordinates = coordinates;
    }

    @Override // androidx.compose.ui.n
    public /* synthetic */ n s0(n nVar) {
        return m.a(this, nVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean t(l lVar) {
        return o.b(this, lVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object v(Object obj, p pVar) {
        return o.d(this, obj, pVar);
    }

    @Override // androidx.compose.ui.modifier.e
    public void w1(@dl.d androidx.compose.ui.modifier.n scope) {
        f0.p(scope, "scope");
        this.localParent = (c) scope.a(BringIntoViewKt.a());
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, p pVar) {
        return o.c(this, obj, pVar);
    }
}
