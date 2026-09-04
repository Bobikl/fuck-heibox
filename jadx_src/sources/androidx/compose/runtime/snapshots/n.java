package androidx.compose.runtime.snapshots;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b2;
import kotlin.c1;
import kotlin.collections.r0;
import kotlin.jvm.internal.w0;

/* JADX INFO: compiled from: SnapshotStateMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\"\u0010\n\u001a\u00020\u00062\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\bH\u0016J\u001b\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u000bH\u0096\u0002J\u001c\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\"\u0010\u000f\u001a\u00020\r2\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\bH\u0016J\"\u0010\u0010\u001a\u00020\r2\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\bH\u0016J\u001d\u0010\u0011\u001a\u00020\r2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002J\"\u0010\u0012\u001a\u00020\r2\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\bH\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/snapshots/n;", "K", androidx.exifinterface.media.a.X4, "Landroidx/compose/runtime/snapshots/p;", "", "element", "", "e", "", "elements", "g", "", "iterator", "", "i", "removeAll", "retainAll", RXScreenCaptureService.KEY_HEIGHT, "containsAll", "Landroidx/compose/runtime/snapshots/t;", "map", "<init>", "(Landroidx/compose/runtime/snapshots/t;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class n<K, V> extends p<K, V, Map.Entry<K, V>> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@dl.d t<K, V> map) {
        super(map);
        kotlin.jvm.internal.f0.p(map, "map");
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) e((Map.Entry) obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) g(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (w0.I(obj)) {
            return h((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@dl.d Collection<? extends Object> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    @dl.d
    public Void e(@dl.d Map.Entry<K, V> element) {
        kotlin.jvm.internal.f0.p(element, "element");
        u.b();
        throw new KotlinNothingValueException();
    }

    @dl.d
    public Void g(@dl.d Collection<? extends Map.Entry<K, V>> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        u.b();
        throw new KotlinNothingValueException();
    }

    public boolean h(@dl.d Map.Entry<K, V> element) {
        kotlin.jvm.internal.f0.p(element, "element");
        return kotlin.jvm.internal.f0.g(a().get(element.getKey()), element.getValue());
    }

    public boolean i(@dl.d Map.Entry<K, V> element) {
        kotlin.jvm.internal.f0.p(element, "element");
        return a().remove(element.getKey()) != null;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @dl.d
    public Iterator<Map.Entry<K, V>> iterator() {
        return new w(a(), ((u0.f) a().n().g().entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (w0.I(obj)) {
            return i((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(@dl.d Collection<? extends Object> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (a().remove(((Map.Entry) it.next()).getKey()) != null || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(@dl.d Collection<? extends Object> elements) {
        u0.i<K, V> iVarG;
        int iH;
        boolean z10;
        f fVarB;
        kotlin.jvm.internal.f0.p(elements, "elements");
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(kotlin.collections.t.Y(elements, 10)), 16));
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pairA = c1.a(entry.getKey(), entry.getValue());
            linkedHashMap.put(pairA.e(), pairA.f());
        }
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
            for (Map.Entry<K, V> entry2 : tVarA.entrySet()) {
                if ((linkedHashMap.containsKey(entry2.getKey()) && kotlin.jvm.internal.f0.g(linkedHashMap.get(entry2.getKey()), entry2.getValue())) ? false : true) {
                    aVarBuilder.remove(entry2.getKey());
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
