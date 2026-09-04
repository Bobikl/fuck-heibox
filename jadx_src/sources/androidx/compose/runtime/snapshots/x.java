package androidx.compose.runtime.snapshots;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: SnapshotStateMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0013\b\"\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B5\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u0018\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00150\u0014¢\u0006\u0004\b+\u0010,J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\b\u001a\u00020\u0004H\u0004J'\u0010\f\u001a\u00028\u0002\"\u0004\b\u0002\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\nH\u0084\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R)\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00150\u00148\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R0\u0010&\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00158\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\"\u001a\u0004\b\u001b\u0010#\"\u0004\b$\u0010%R0\u0010*\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00158\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006-"}, d2 = {"Landroidx/compose/runtime/snapshots/x;", "K", androidx.exifinterface.media.a.X4, "", "Lkotlin/b2;", "remove", "", "hasNext", ak.aF, androidx.exifinterface.media.a.f23244d5, "Lkotlin/Function0;", "block", "j", "(Lyh/a;)Ljava/lang/Object;", "Landroidx/compose/runtime/snapshots/t;", "b", "Landroidx/compose/runtime/snapshots/t;", "g", "()Landroidx/compose/runtime/snapshots/t;", "map", "", "", "Ljava/util/Iterator;", "e", "()Ljava/util/Iterator;", "iterator", "", "d", "I", RXScreenCaptureService.KEY_HEIGHT, "()I", "o", "(I)V", "modification", "Ljava/util/Map$Entry;", "()Ljava/util/Map$Entry;", "n", "(Ljava/util/Map$Entry;)V", org.apache.tools.ant.taskdefs.optional.vss.g.H2, "f", "i", "p", "next", "<init>", "(Landroidx/compose/runtime/snapshots/t;Ljava/util/Iterator;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public abstract class x<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final t<K, V> map;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Iterator<Map.Entry<K, V>> iterator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int modification;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Map.Entry<? extends K, ? extends V> current;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Map.Entry<? extends K, ? extends V> next;

    /* JADX WARN: Multi-variable type inference failed */
    public x(@dl.d t<K, V> map, @dl.d Iterator<? extends Map.Entry<? extends K, ? extends V>> iterator) {
        kotlin.jvm.internal.f0.p(map, "map");
        kotlin.jvm.internal.f0.p(iterator, "iterator");
        this.map = map;
        this.iterator = iterator;
        this.modification = map.i();
        c();
    }

    protected final void c() {
        this.current = this.next;
        this.next = this.iterator.hasNext() ? this.iterator.next() : null;
    }

    @dl.e
    protected final Map.Entry<K, V> d() {
        return this.current;
    }

    @dl.d
    public final Iterator<Map.Entry<K, V>> e() {
        return this.iterator;
    }

    @dl.d
    public final t<K, V> g() {
        return this.map;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    protected final int getModification() {
        return this.modification;
    }

    public final boolean hasNext() {
        return this.next != null;
    }

    @dl.e
    protected final Map.Entry<K, V> i() {
        return this.next;
    }

    protected final <T> T j(@dl.d yh.a<? extends T> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        if (g().i() != this.modification) {
            throw new ConcurrentModificationException();
        }
        T tInvoke = block.invoke();
        this.modification = g().i();
        return tInvoke;
    }

    protected final void n(@dl.e Map.Entry<? extends K, ? extends V> entry) {
        this.current = entry;
    }

    protected final void o(int i10) {
        this.modification = i10;
    }

    protected final void p(@dl.e Map.Entry<? extends K, ? extends V> entry) {
        this.next = entry;
    }

    public final void remove() {
        if (g().i() != this.modification) {
            throw new ConcurrentModificationException();
        }
        Map.Entry<? extends K, ? extends V> entry = this.current;
        if (entry == null) {
            throw new IllegalStateException();
        }
        this.map.remove(entry.getKey());
        this.current = null;
        b2 b2Var = b2.f124493a;
        this.modification = g().i();
    }
}
