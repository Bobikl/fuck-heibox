package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PersistentHashMapBuilderContentViews.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b \u0018\u0000*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001*\u0004\b\u0001\u0010\u0003*\u0004\b\u0002\u0010\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001H&J\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u001c\u0010\f\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001H&¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/a;", "", androidx.exifinterface.media.a.S4, "K", androidx.exifinterface.media.a.X4, "Lkotlin/collections/f;", "element", "", "b", "(Ljava/util/Map$Entry;)Z", "e", "g", RXScreenCaptureService.KEY_HEIGHT, "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public abstract class a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends kotlin.collections.f<E> {
    public final boolean b(@dl.d E element) {
        f0.p(element, "element");
        if ((element instanceof Object ? element : null) instanceof Map.Entry) {
            return e(element);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return b((Map.Entry) obj);
        }
        return false;
    }

    public abstract boolean e(@dl.d Map.Entry<? extends K, ? extends V> element);

    public final boolean g(@dl.d E element) {
        f0.p(element, "element");
        if ((element instanceof Object ? element : null) instanceof Map.Entry) {
            return h(element);
        }
        return false;
    }

    public abstract boolean h(@dl.d Map.Entry<? extends K, ? extends V> element);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return g((Map.Entry) obj);
        }
        return false;
    }
}
