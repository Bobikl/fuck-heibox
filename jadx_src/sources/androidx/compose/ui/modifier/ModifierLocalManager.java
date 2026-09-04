package androidx.compose.ui.modifier;

import androidx.compose.ui.node.BackwardsCompatNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.b1;
import androidx.compose.ui.node.x0;
import com.umeng.analytics.pro.ak;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b2;
import kotlin.c1;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ModifierLocalManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 J*\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0006\u0010\u000b\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\tJ\u001a\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00072\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004J\u001a\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00072\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004J\u001a\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00072\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004R\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R*\u0010\u0018\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R*\u0010\u0019\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R*\u0010\u001b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalManager;", "", "Landroidx/compose/ui/n$d;", "node", "Landroidx/compose/ui/modifier/c;", "key", "", "Landroidx/compose/ui/node/BackwardsCompatNode;", "set", "Lkotlin/b2;", "d", ak.aF, "f", "g", "b", "e", "Landroidx/compose/ui/node/b1;", ak.av, "Landroidx/compose/ui/node/b1;", "()Landroidx/compose/ui/node/b1;", "owner", "Landroidx/compose/runtime/collection/e;", "Lkotlin/Pair;", "Landroidx/compose/runtime/collection/e;", "inserted", org.apache.tools.ant.taskdefs.optional.vss.g.J2, "Landroidx/compose/ui/node/LayoutNode;", "removed", "", "Z", "invalidated", "<init>", "(Landroidx/compose/ui/node/b1;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class ModifierLocalManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final b1 owner;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.collection.e<Pair<BackwardsCompatNode, c<?>>> inserted;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.collection.e<Pair<BackwardsCompatNode, c<?>>> updated;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.collection.e<Pair<LayoutNode, c<?>>> removed;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean invalidated;

    public ModifierLocalManager(@dl.d b1 owner) {
        f0.p(owner, "owner");
        this.owner = owner;
        this.inserted = new androidx.compose.runtime.collection.e<>(new Pair[16], 0);
        this.updated = new androidx.compose.runtime.collection.e<>(new Pair[16], 0);
        this.removed = new androidx.compose.runtime.collection.e<>(new Pair[16], 0);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void d(androidx.compose.ui.n.d dVar, c<?> cVar, Set<BackwardsCompatNode> set) {
        boolean z10;
        int iG = x0.f15398a.g();
        if (!dVar.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        androidx.compose.runtime.collection.e eVar = new androidx.compose.runtime.collection.e(new androidx.compose.ui.n.d[16], 0);
        androidx.compose.ui.n.d child = dVar.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.d.b(eVar, dVar.getNode());
        } else {
            eVar.b(child);
        }
        while (eVar.Q()) {
            androidx.compose.ui.n.d dVar2 = (androidx.compose.ui.n.d) eVar.g0(eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String() - 1);
            if ((dVar2.getAggregateChildKindSet() & iG) != 0) {
                androidx.compose.ui.n.d child2 = dVar2;
                while (true) {
                    if (child2 != null) {
                        if ((child2.getKindSet() & iG) != 0) {
                            if (child2 instanceof j) {
                                j jVar = (j) child2;
                                if (jVar instanceof BackwardsCompatNode) {
                                    BackwardsCompatNode backwardsCompatNode = (BackwardsCompatNode) jVar;
                                    if ((backwardsCompatNode.getElement() instanceof e) && backwardsCompatNode.S().contains(cVar)) {
                                        set.add(jVar);
                                    }
                                }
                                if (jVar.g().a(cVar)) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                            } else {
                                z10 = true;
                            }
                            if (!z10) {
                                break;
                            }
                        }
                        child2 = child2.getChild();
                    }
                }
            }
            androidx.compose.ui.node.d.b(eVar, dVar2);
        }
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final b1 getOwner() {
        return this.owner;
    }

    public final void b(@dl.d BackwardsCompatNode node, @dl.d c<?> key) {
        f0.p(node, "node");
        f0.p(key, "key");
        this.inserted.b(c1.a(node, key));
        c();
    }

    public final void c() {
        if (this.invalidated) {
            return;
        }
        this.invalidated = true;
        this.owner.n(new yh.a<b2>() { // from class: androidx.compose.ui.modifier.ModifierLocalManager$invalidate$1
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
                this.f15057b.f();
            }
        });
    }

    public final void e(@dl.d BackwardsCompatNode node, @dl.d c<?> key) {
        f0.p(node, "node");
        f0.p(key, "key");
        this.removed.b(c1.a(androidx.compose.ui.node.d.k(node), key));
        c();
    }

    public final void f() {
        int i10 = 0;
        this.invalidated = false;
        HashSet hashSet = new HashSet();
        androidx.compose.runtime.collection.e<Pair<LayoutNode, c<?>>> eVar = this.removed;
        int i11 = eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (i11 > 0) {
            Pair<LayoutNode, c<?>>[] pairArrG = eVar.G();
            f0.n(pairArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i12 = 0;
            do {
                Pair<LayoutNode, c<?>> pair = pairArrG[i12];
                LayoutNode layoutNodeA = pair.a();
                c<?> cVarB = pair.b();
                if (layoutNodeA.p()) {
                    d(layoutNodeA.getNodes().getHead(), cVarB, hashSet);
                }
                i12++;
            } while (i12 < i11);
        }
        this.removed.m();
        androidx.compose.runtime.collection.e<Pair<BackwardsCompatNode, c<?>>> eVar2 = this.inserted;
        int i13 = eVar2.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (i13 > 0) {
            Pair<BackwardsCompatNode, c<?>>[] pairArrG2 = eVar2.G();
            f0.n(pairArrG2, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i14 = 0;
            do {
                Pair<BackwardsCompatNode, c<?>> pair2 = pairArrG2[i14];
                BackwardsCompatNode backwardsCompatNodeA = pair2.a();
                c<?> cVarB2 = pair2.b();
                if (backwardsCompatNodeA.getIsAttached()) {
                    d(backwardsCompatNodeA, cVarB2, hashSet);
                }
                i14++;
            } while (i14 < i13);
        }
        this.inserted.m();
        androidx.compose.runtime.collection.e<Pair<BackwardsCompatNode, c<?>>> eVar3 = this.updated;
        int i15 = eVar3.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (i15 > 0) {
            Pair<BackwardsCompatNode, c<?>>[] pairArrG3 = eVar3.G();
            f0.n(pairArrG3, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                Pair<BackwardsCompatNode, c<?>> pair3 = pairArrG3[i10];
                BackwardsCompatNode backwardsCompatNodeA2 = pair3.a();
                c<?> cVarB3 = pair3.b();
                if (backwardsCompatNodeA2.getIsAttached()) {
                    d(backwardsCompatNodeA2, cVarB3, hashSet);
                }
                i10++;
            } while (i10 < i15);
        }
        this.updated.m();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((BackwardsCompatNode) it.next()).d0();
        }
    }

    public final void g(@dl.d BackwardsCompatNode node, @dl.d c<?> key) {
        f0.p(node, "node");
        f0.p(key, "key");
        this.updated.b(c1.a(node, key));
        c();
    }
}
