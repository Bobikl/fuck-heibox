package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.a1;
import androidx.compose.runtime.h2;
import androidx.compose.ui.graphics.m0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Vector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b;\u0010<J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\t\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\f\u0010\n\u001a\u00020\u0002*\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R/\u0010!\u001a\u0004\u0018\u00010\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00078@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010(\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u0010,\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R\u001f\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b.\u0010/R$\u00104\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u00101\"\u0004\b2\u00103R(\u00106\u001a\b\u0012\u0004\u0012\u00020\u0002058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b)\u00108\"\u0004\b9\u0010:\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006="}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorComponent;", "Landroidx/compose/ui/graphics/vector/j;", "Lkotlin/b2;", "f", "Landroidx/compose/ui/graphics/drawscope/g;", "", "alpha", "Landroidx/compose/ui/graphics/m0;", "colorFilter", "g", ak.av, "", "toString", "Landroidx/compose/ui/graphics/vector/b;", ak.aF, "Landroidx/compose/ui/graphics/vector/b;", "k", "()Landroidx/compose/ui/graphics/vector/b;", "root", "", "d", "Z", "isDirty", "Landroidx/compose/ui/graphics/vector/a;", "e", "Landroidx/compose/ui/graphics/vector/a;", "cacheDrawScope", "<set-?>", "Landroidx/compose/runtime/a1;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/compose/ui/graphics/m0;", "n", "(Landroidx/compose/ui/graphics/m0;)V", "intrinsicColorFilter", "value", "F", "m", "()F", "r", "(F)V", "viewportWidth", "i", "l", "q", "viewportHeight", "Lb1/m;", "j", "J", "previousDrawSize", "()Ljava/lang/String;", "p", "(Ljava/lang/String;)V", "name", "Lkotlin/Function0;", "invalidateCallback", "Lyh/a;", "()Lyh/a;", "o", "(Lyh/a;)V", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class VectorComponent extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final b root;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isDirty;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a cacheDrawScope;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private yh.a<b2> f14042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 intrinsicColorFilter;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private float viewportWidth;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private float viewportHeight;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private long previousDrawSize;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final yh.l<androidx.compose.ui.graphics.drawscope.g, b2> f14047k;

    public VectorComponent() {
        super(null);
        b bVar = new b();
        bVar.u(0.0f);
        bVar.v(0.0f);
        bVar.d(new yh.a<b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$root$1$1
            {
                super(0);
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f14050b.f();
            }
        });
        this.root = bVar;
        this.isDirty = true;
        this.cacheDrawScope = new a();
        this.f14042f = new yh.a<b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$invalidateCallback$1
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        };
        this.intrinsicColorFilter = h2.g(null, null, 2, null);
        this.previousDrawSize = b1.m.f30386b.a();
        this.f14047k = new yh.l<androidx.compose.ui.graphics.drawscope.g, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$drawVectorBlock$1
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g gVar) {
                f0.p(gVar, "$this$null");
                this.f14048b.getRoot().a(gVar);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
                a(gVar);
                return b2.f124493a;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        this.isDirty = true;
        this.f14042f.invoke();
    }

    @Override // androidx.compose.ui.graphics.vector.j
    public void a(@dl.d androidx.compose.ui.graphics.drawscope.g gVar) {
        f0.p(gVar, "<this>");
        g(gVar, 1.0f, null);
    }

    public final void g(@dl.d androidx.compose.ui.graphics.drawscope.g gVar, float f10, @dl.e m0 m0Var) {
        f0.p(gVar, "<this>");
        if (m0Var == null) {
            m0Var = h();
        }
        if (this.isDirty || !b1.m.k(this.previousDrawSize, gVar.c())) {
            this.root.x(b1.m.t(gVar.c()) / this.viewportWidth);
            this.root.y(b1.m.m(gVar.c()) / this.viewportHeight);
            this.cacheDrawScope.b(s1.s.a((int) Math.ceil(b1.m.t(gVar.c())), (int) Math.ceil(b1.m.m(gVar.c()))), gVar, gVar.getLayoutDirection(), this.f14047k);
            this.isDirty = false;
            this.previousDrawSize = gVar.c();
        }
        this.cacheDrawScope.c(gVar, f10, m0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.e
    public final m0 h() {
        return (m0) this.intrinsicColorFilter.getValue();
    }

    @dl.d
    public final yh.a<b2> i() {
        return this.f14042f;
    }

    @dl.d
    public final String j() {
        return this.root.getName();
    }

    @dl.d
    /* JADX INFO: renamed from: k, reason: from getter */
    public final b getRoot() {
        return this.root;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final float getViewportHeight() {
        return this.viewportHeight;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final float getViewportWidth() {
        return this.viewportWidth;
    }

    public final void n(@dl.e m0 m0Var) {
        this.intrinsicColorFilter.setValue(m0Var);
    }

    public final void o(@dl.d yh.a<b2> aVar) {
        f0.p(aVar, "<set-?>");
        this.f14042f = aVar;
    }

    public final void p(@dl.d String value) {
        f0.p(value, "value");
        this.root.t(value);
    }

    public final void q(float f10) {
        if (this.viewportHeight == f10) {
            return;
        }
        this.viewportHeight = f10;
        f();
    }

    public final void r(float f10) {
        if (this.viewportWidth == f10) {
            return;
        }
        this.viewportWidth = f10;
        f();
    }

    @dl.d
    public String toString() {
        String str = "Params: \tname: " + j() + "\n\tviewportWidth: " + this.viewportWidth + "\n\tviewportHeight: " + this.viewportHeight + "\n";
        f0.o(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
