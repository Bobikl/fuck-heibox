package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import kotlin.Metadata;

/* JADX INFO: compiled from: AbstractListIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\b\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0003\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0004R\u0014\u0010\b\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/g;", androidx.exifinterface.media.a.S4, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/a;", "next", "()Ljava/lang/Object;", "previous", "d", "Ljava/lang/Object;", "element", "", UCropPlusActivity.ARG_INDEX, "<init>", "(Ljava/lang/Object;I)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class g<E> extends a<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final E element;

    public g(E e10, int i10) {
        super(i10, 1);
        this.element = e10;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator, java.util.Iterator
    public E next() {
        a();
        e(getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() + 1);
        return this.element;
    }

    @Override // java.util.ListIterator
    public E previous() {
        b();
        e(getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() - 1);
        return this.element;
    }
}
