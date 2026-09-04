package androidx.compose.ui.semantics;

import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: SemanticsModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001bBK\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014\u0012\u0019\b\u0002\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/semantics/m;", "Landroidx/compose/ui/semantics/l;", "Landroidx/compose/ui/platform/y0;", "", "other", "", "equals", "", "hashCode", "Landroidx/compose/ui/semantics/j;", "e", "Landroidx/compose/ui/semantics/j;", "c0", "()Landroidx/compose/ui/semantics/j;", "semanticsConfiguration", "mergeDescendants", "clearAndSetSemantics", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/r;", "Lkotlin/b2;", "Lkotlin/t;", "properties", "Landroidx/compose/ui/platform/x0;", "inspectorInfo", "<init>", "(ZZLyh/l;Lyh/l;)V", "f", ak.av, "ui_release"}, k = 1, mv = {1, 7, 1})
public final class m extends y0 implements l {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static AtomicInteger f16152g = new AtomicInteger(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final j semanticsConfiguration;

    /* JADX INFO: renamed from: androidx.compose.ui.semantics.m$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SemanticsModifier.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/semantics/m$a;", "", "", ak.av, "Ljava/util/concurrent/atomic/AtomicInteger;", "Landroidx/compose/ui/platform/AtomicInt;", "lastIdentifier", "Ljava/util/concurrent/atomic/AtomicInteger;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final int a() {
            return m.f16152g.addAndGet(1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(boolean z10, boolean z11, @dl.d yh.l<? super r, b2> properties, @dl.d yh.l<? super x0, b2> inspectorInfo) {
        super(inspectorInfo);
        f0.p(properties, "properties");
        f0.p(inspectorInfo, "inspectorInfo");
        j jVar = new j();
        jVar.v(z10);
        jVar.u(z11);
        properties.invoke(jVar);
        this.semanticsConfiguration = jVar;
    }

    public /* synthetic */ m(boolean z10, boolean z11, yh.l lVar, yh.l lVar2, int i10, u uVar) {
        this(z10, z11, lVar, (i10 & 8) != 0 ? InspectableValueKt.b() : lVar2);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    @Override // androidx.compose.ui.semantics.l
    @dl.d
    /* JADX INFO: renamed from: c0, reason: from getter */
    public j getSemanticsConfiguration() {
        return this.semanticsConfiguration;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof m) && f0.g(getSemanticsConfiguration(), ((m) other).getSemanticsConfiguration());
    }

    @Override // androidx.compose.ui.semantics.l
    public /* synthetic */ int getId() {
        return k.a(this);
    }

    public int hashCode() {
        return getSemanticsConfiguration().hashCode();
    }

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
