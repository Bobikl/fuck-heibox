package androidx.compose.runtime.snapshots;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: SnapshotStateMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\"\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B\u001b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/snapshots/p;", "K", androidx.exifinterface.media.a.X4, androidx.exifinterface.media.a.S4, "", "Lkotlin/b2;", "clear", "", "isEmpty", "Landroidx/compose/runtime/snapshots/t;", "b", "Landroidx/compose/runtime/snapshots/t;", ak.av, "()Landroidx/compose/runtime/snapshots/t;", "map", "", "()I", UiKitSpanObj.TYPE_SIZE, "<init>", "(Landroidx/compose/runtime/snapshots/t;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public abstract class p<K, V, E> implements Set<E>, zh.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final t<K, V> map;

    public p(@dl.d t<K, V> map) {
        kotlin.jvm.internal.f0.p(map, "map");
        this.map = map;
    }

    @dl.d
    public final t<K, V> a() {
        return this.map;
    }

    public int b() {
        return this.map.size();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.map.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return b();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.t.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.f0.p(array, "array");
        return (T[]) kotlin.jvm.internal.t.b(this, array);
    }
}
