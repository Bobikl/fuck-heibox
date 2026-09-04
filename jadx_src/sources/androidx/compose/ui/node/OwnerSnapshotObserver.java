package androidx.compose.ui.node;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: OwnerSnapshotObserver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B0\u0012'\u0010 \u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0004\b!\u0010\"J/\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\nJ/\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\f\u0010\nJC\u0010\u0012\u001a\u00020\u0007\"\b\b\u0000\u0010\u000e*\u00020\r2\u0006\u0010\u000f\u001a\u00028\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0018\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001b¨\u0006#"}, d2 = {"Landroidx/compose/ui/node/OwnerSnapshotObserver;", "", "Landroidx/compose/ui/node/LayoutNode;", "node", "", "affectsLookahead", "Lkotlin/Function0;", "Lkotlin/b2;", "block", "e", "(Landroidx/compose/ui/node/LayoutNode;ZLyh/a;)V", ak.aF, "g", "Landroidx/compose/ui/node/c1;", androidx.exifinterface.media.a.f23244d5, "target", "Lkotlin/Function1;", "onChanged", "i", "(Landroidx/compose/ui/node/c1;Lyh/l;Lyh/a;)V", "b", "()V", ak.av, "(Ljava/lang/Object;)V", "j", "k", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "observer", "Lkotlin/m0;", "name", "callback", "onChangedExecutor", "<init>", "(Lyh/l;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class OwnerSnapshotObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final SnapshotStateObserver observer;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.l<LayoutNode, b2> f15285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final yh.l<LayoutNode, b2> f15286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final yh.l<LayoutNode, b2> f15287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final yh.l<LayoutNode, b2> f15288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final yh.l<LayoutNode, b2> f15289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final yh.l<LayoutNode, b2> f15290g;

    public OwnerSnapshotObserver(@dl.d yh.l<? super yh.a<b2>, b2> onChangedExecutor) {
        kotlin.jvm.internal.f0.p(onChangedExecutor, "onChangedExecutor");
        this.observer = new SnapshotStateObserver(onChangedExecutor);
        this.f15285b = new yh.l<LayoutNode, b2>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1
            public final void a(@dl.d LayoutNode layoutNode) {
                kotlin.jvm.internal.f0.p(layoutNode, "layoutNode");
                if (layoutNode.isValid()) {
                    LayoutNode.m1(layoutNode, false, 1, null);
                }
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode) {
                a(layoutNode);
                return b2.f124493a;
            }
        };
        this.f15286c = new yh.l<LayoutNode, b2>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingMeasure$1
            public final void a(@dl.d LayoutNode layoutNode) {
                kotlin.jvm.internal.f0.p(layoutNode, "layoutNode");
                if (layoutNode.isValid()) {
                    LayoutNode.q1(layoutNode, false, 1, null);
                }
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode) {
                a(layoutNode);
                return b2.f124493a;
            }
        };
        this.f15287d = new yh.l<LayoutNode, b2>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1
            public final void a(@dl.d LayoutNode layoutNode) {
                kotlin.jvm.internal.f0.p(layoutNode, "layoutNode");
                if (layoutNode.isValid()) {
                    LayoutNode.o1(layoutNode, false, 1, null);
                }
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode) {
                a(layoutNode);
                return b2.f124493a;
            }
        };
        this.f15288e = new yh.l<LayoutNode, b2>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1
            public final void a(@dl.d LayoutNode layoutNode) {
                kotlin.jvm.internal.f0.p(layoutNode, "layoutNode");
                if (layoutNode.isValid()) {
                    LayoutNode.o1(layoutNode, false, 1, null);
                }
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode) {
                a(layoutNode);
                return b2.f124493a;
            }
        };
        this.f15289f = new yh.l<LayoutNode, b2>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1
            public final void a(@dl.d LayoutNode layoutNode) {
                kotlin.jvm.internal.f0.p(layoutNode, "layoutNode");
                if (layoutNode.isValid()) {
                    LayoutNode.k1(layoutNode, false, 1, null);
                }
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode) {
                a(layoutNode);
                return b2.f124493a;
            }
        };
        this.f15290g = new yh.l<LayoutNode, b2>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookaheadLayout$1
            public final void a(@dl.d LayoutNode layoutNode) {
                kotlin.jvm.internal.f0.p(layoutNode, "layoutNode");
                if (layoutNode.isValid()) {
                    LayoutNode.k1(layoutNode, false, 1, null);
                }
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode) {
                a(layoutNode);
                return b2.f124493a;
            }
        };
    }

    public static /* synthetic */ void d(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z10, yh.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        ownerSnapshotObserver.c(layoutNode, z10, aVar);
    }

    public static /* synthetic */ void f(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z10, yh.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        ownerSnapshotObserver.e(layoutNode, z10, aVar);
    }

    public static /* synthetic */ void h(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z10, yh.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        ownerSnapshotObserver.g(layoutNode, z10, aVar);
    }

    public final void a(@dl.d Object target) {
        kotlin.jvm.internal.f0.p(target, "target");
        this.observer.g(target);
    }

    public final void b() {
        this.observer.h(new yh.l<Object, Boolean>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$clearInvalidObservations$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.d Object it) {
                kotlin.jvm.internal.f0.p(it, "it");
                return Boolean.valueOf(!((c1) it).isValid());
            }
        });
    }

    public final void c(@dl.d LayoutNode node, boolean affectsLookahead, @dl.d yh.a<b2> block) {
        kotlin.jvm.internal.f0.p(node, "node");
        kotlin.jvm.internal.f0.p(block, "block");
        if (!affectsLookahead || node.getMLookaheadScope() == null) {
            i(node, this.f15288e, block);
        } else {
            i(node, this.f15289f, block);
        }
    }

    public final void e(@dl.d LayoutNode node, boolean affectsLookahead, @dl.d yh.a<b2> block) {
        kotlin.jvm.internal.f0.p(node, "node");
        kotlin.jvm.internal.f0.p(block, "block");
        if (!affectsLookahead || node.getMLookaheadScope() == null) {
            i(node, this.f15287d, block);
        } else {
            i(node, this.f15290g, block);
        }
    }

    public final void g(@dl.d LayoutNode node, boolean affectsLookahead, @dl.d yh.a<b2> block) {
        kotlin.jvm.internal.f0.p(node, "node");
        kotlin.jvm.internal.f0.p(block, "block");
        if (!affectsLookahead || node.getMLookaheadScope() == null) {
            i(node, this.f15286c, block);
        } else {
            i(node, this.f15285b, block);
        }
    }

    public final <T extends c1> void i(@dl.d T target, @dl.d yh.l<? super T, b2> onChanged, @dl.d yh.a<b2> block) {
        kotlin.jvm.internal.f0.p(target, "target");
        kotlin.jvm.internal.f0.p(onChanged, "onChanged");
        kotlin.jvm.internal.f0.p(block, "block");
        this.observer.l(target, onChanged, block);
    }

    public final void j() {
        this.observer.m();
    }

    public final void k() {
        this.observer.n();
        this.observer.f();
    }
}
