package androidx.compose.ui.node;

import androidx.compose.ui.platform.d2;
import androidx.compose.ui.unit.LayoutDirection;
import com.meituan.robust.Constants;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: ComposeUiNode.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.r0
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\ba\u0018\u0000  2\u00020\u0001:\u0001!R\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u00020\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0013\u001a\u00020\u000e8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0019\u001a\u00020\u00148&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001f\u001a\u00020\u001a8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\"À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/ComposeUiNode;", "", "Landroidx/compose/ui/layout/i0;", "o", "()Landroidx/compose/ui/layout/i0;", ak.aF, "(Landroidx/compose/ui/layout/i0;)V", "measurePolicy", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", ak.av, "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "Ls1/e;", "getDensity", "()Ls1/e;", "g", "(Ls1/e;)V", "density", "Landroidx/compose/ui/n;", "e", "()Landroidx/compose/ui/n;", "f", "(Landroidx/compose/ui/n;)V", "modifier", "Landroidx/compose/ui/platform/d2;", "getViewConfiguration", "()Landroidx/compose/ui/platform/d2;", "m", "(Landroidx/compose/ui/platform/d2;)V", "viewConfiguration", "n0", "Companion", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface ComposeUiNode {

    /* JADX INFO: renamed from: n0, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f15112a;

    /* JADX INFO: compiled from: ComposeUiNode.kt */
    @Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R.\u0010\u000e\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R.\u0010\u0013\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R.\u0010\u0016\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R.\u0010\u0019\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R.\u0010\u001c\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011¨\u0006 "}, d2 = {"Landroidx/compose/ui/node/ComposeUiNode$Companion;", "", "Lkotlin/Function0;", "Landroidx/compose/ui/node/ComposeUiNode;", Constants.CONSTRUCTOR, "Lyh/a;", ak.av, "()Lyh/a;", "VirtualConstructor", "g", "Lkotlin/Function2;", "Landroidx/compose/ui/n;", "Lkotlin/b2;", "Lkotlin/t;", "SetModifier", "Lyh/p;", "e", "()Lyh/p;", "Ls1/e;", "SetDensity", "b", "Landroidx/compose/ui/layout/i0;", "SetMeasurePolicy", "d", "Landroidx/compose/ui/unit/LayoutDirection;", "SetLayoutDirection", ak.aF, "Landroidx/compose/ui/platform/d2;", "SetViewConfiguration", "f", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f15112a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private static final yh.a<ComposeUiNode> f15113b = LayoutNode.INSTANCE.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        private static final yh.a<ComposeUiNode> f15114c = new yh.a<LayoutNode>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$VirtualConstructor$1
            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LayoutNode invoke() {
                return new LayoutNode(true, 0, 2, null);
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.d
        private static final yh.p<ComposeUiNode, androidx.compose.ui.n, b2> f15115d = new yh.p<ComposeUiNode, androidx.compose.ui.n, b2>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1
            public final void a(@dl.d ComposeUiNode composeUiNode, @dl.d androidx.compose.ui.n it) {
                kotlin.jvm.internal.f0.p(composeUiNode, "$this$null");
                kotlin.jvm.internal.f0.p(it, "it");
                composeUiNode.f(it);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(ComposeUiNode composeUiNode, androidx.compose.ui.n nVar) {
                a(composeUiNode, nVar);
                return b2.f124493a;
            }
        };

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @dl.d
        private static final yh.p<ComposeUiNode, s1.e, b2> f15116e = new yh.p<ComposeUiNode, s1.e, b2>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetDensity$1
            public final void a(@dl.d ComposeUiNode composeUiNode, @dl.d s1.e it) {
                kotlin.jvm.internal.f0.p(composeUiNode, "$this$null");
                kotlin.jvm.internal.f0.p(it, "it");
                composeUiNode.g(it);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(ComposeUiNode composeUiNode, s1.e eVar) {
                a(composeUiNode, eVar);
                return b2.f124493a;
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @dl.d
        private static final yh.p<ComposeUiNode, androidx.compose.ui.layout.i0, b2> f15117f = new yh.p<ComposeUiNode, androidx.compose.ui.layout.i0, b2>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetMeasurePolicy$1
            public final void a(@dl.d ComposeUiNode composeUiNode, @dl.d androidx.compose.ui.layout.i0 it) {
                kotlin.jvm.internal.f0.p(composeUiNode, "$this$null");
                kotlin.jvm.internal.f0.p(it, "it");
                composeUiNode.c(it);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(ComposeUiNode composeUiNode, androidx.compose.ui.layout.i0 i0Var) {
                a(composeUiNode, i0Var);
                return b2.f124493a;
            }
        };

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @dl.d
        private static final yh.p<ComposeUiNode, LayoutDirection, b2> f15118g = new yh.p<ComposeUiNode, LayoutDirection, b2>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetLayoutDirection$1
            public final void a(@dl.d ComposeUiNode composeUiNode, @dl.d LayoutDirection it) {
                kotlin.jvm.internal.f0.p(composeUiNode, "$this$null");
                kotlin.jvm.internal.f0.p(it, "it");
                composeUiNode.a(it);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(ComposeUiNode composeUiNode, LayoutDirection layoutDirection) {
                a(composeUiNode, layoutDirection);
                return b2.f124493a;
            }
        };

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @dl.d
        private static final yh.p<ComposeUiNode, d2, b2> f15119h = new yh.p<ComposeUiNode, d2, b2>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetViewConfiguration$1
            public final void a(@dl.d ComposeUiNode composeUiNode, @dl.d d2 it) {
                kotlin.jvm.internal.f0.p(composeUiNode, "$this$null");
                kotlin.jvm.internal.f0.p(it, "it");
                composeUiNode.m(it);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(ComposeUiNode composeUiNode, d2 d2Var) {
                a(composeUiNode, d2Var);
                return b2.f124493a;
            }
        };

        private Companion() {
        }

        @dl.d
        public final yh.a<ComposeUiNode> a() {
            return f15113b;
        }

        @dl.d
        public final yh.p<ComposeUiNode, s1.e, b2> b() {
            return f15116e;
        }

        @dl.d
        public final yh.p<ComposeUiNode, LayoutDirection, b2> c() {
            return f15118g;
        }

        @dl.d
        public final yh.p<ComposeUiNode, androidx.compose.ui.layout.i0, b2> d() {
            return f15117f;
        }

        @dl.d
        public final yh.p<ComposeUiNode, androidx.compose.ui.n, b2> e() {
            return f15115d;
        }

        @dl.d
        public final yh.p<ComposeUiNode, d2, b2> f() {
            return f15119h;
        }

        @dl.d
        public final yh.a<ComposeUiNode> g() {
            return f15114c;
        }
    }

    void a(@dl.d LayoutDirection layoutDirection);

    void c(@dl.d androidx.compose.ui.layout.i0 i0Var);

    @dl.d
    /* JADX INFO: renamed from: e */
    androidx.compose.ui.n getModifier();

    void f(@dl.d androidx.compose.ui.n nVar);

    void g(@dl.d s1.e eVar);

    @dl.d
    /* JADX INFO: renamed from: getDensity */
    s1.e getF15149p();

    @dl.d
    LayoutDirection getLayoutDirection();

    @dl.d
    d2 getViewConfiguration();

    void m(@dl.d d2 d2Var);

    @dl.d
    /* JADX INFO: renamed from: o */
    androidx.compose.ui.layout.i0 getMeasurePolicy();
}
