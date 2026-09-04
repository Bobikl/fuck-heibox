package androidx.compose.runtime.snapshots;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: SnapshotStateMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0096\u0002J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0016\u0010\u0011\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u0016\u0010\u0013\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/snapshots/o;", "K", androidx.exifinterface.media.a.X4, "Landroidx/compose/runtime/snapshots/p;", "element", "", "e", "(Ljava/lang/Object;)Ljava/lang/Void;", "", "elements", "g", "Landroidx/compose/runtime/snapshots/y;", RXScreenCaptureService.KEY_HEIGHT, "", "remove", "(Ljava/lang/Object;)Z", "removeAll", "retainAll", "contains", "containsAll", "Landroidx/compose/runtime/snapshots/t;", "map", "<init>", "(Landroidx/compose/runtime/snapshots/t;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class o<K, V> extends p<K, V, K> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@dl.d t<K, V> map) {
        super(map);
        kotlin.jvm.internal.f0.p(map, "map");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) e(obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) g(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object element) {
        return a().containsKey(element);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@dl.d Collection<? extends Object> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!a().containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @dl.d
    public Void e(K element) {
        u.b();
        throw new KotlinNothingValueException();
    }

    @dl.d
    public Void g(@dl.d Collection<? extends K> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        u.b();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @dl.d
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public y<K, V> iterator() {
        return new y<>(a(), ((u0.f) a().n().g().entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object element) {
        return a().remove(element) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(@dl.d Collection<? extends Object> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        Iterator<T> it = elements.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (a().remove(it.next()) != null || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(@dl.d Collection<? extends Object> elements) {
        u0.i<K, V> iVarG;
        int iH;
        boolean z10;
        f fVarB;
        kotlin.jvm.internal.f0.p(elements, "elements");
        Set setV5 = CollectionsKt___CollectionsKt.V5(elements);
        t<K, V> tVarA = a();
        boolean z11 = false;
        do {
            synchronized (u.f13278a) {
                c0 firstStateRecord = tVarA.getFirstStateRecord();
                kotlin.jvm.internal.f0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                t.a aVar = (t.a) SnapshotKt.A((t.a) firstStateRecord);
                iVarG = aVar.g();
                iH = aVar.getModification();
                b2 b2Var = b2.f124493a;
            }
            kotlin.jvm.internal.f0.m(iVarG);
            u0.i.a<K, V> aVarBuilder = iVarG.builder();
            z10 = true;
            for (Map.Entry<K, V> entry : tVarA.entrySet()) {
                if (!setV5.contains(entry.getKey())) {
                    aVarBuilder.remove(entry.getKey());
                    z11 = true;
                }
            }
            b2 b2Var2 = b2.f124493a;
            u0.i<K, V> iVarBuild = aVarBuilder.build();
            if (kotlin.jvm.internal.f0.g(iVarBuild, iVarG)) {
                break;
            }
            synchronized (u.f13278a) {
                c0 firstStateRecord2 = tVarA.getFirstStateRecord();
                kotlin.jvm.internal.f0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                t.a aVar2 = (t.a) firstStateRecord2;
                SnapshotKt.F();
                synchronized (SnapshotKt.D()) {
                    fVarB = f.INSTANCE.b();
                    t.a aVar3 = (t.a) SnapshotKt.h0(aVar2, tVarA, fVarB);
                    if (aVar3.getModification() == iH) {
                        aVar3.i(iVarBuild);
                        aVar3.j(aVar3.getModification() + 1);
                    } else {
                        z10 = false;
                    }
                }
                SnapshotKt.M(fVarB, tVarA);
            }
        } while (!z10);
        return z11;
    }
}
