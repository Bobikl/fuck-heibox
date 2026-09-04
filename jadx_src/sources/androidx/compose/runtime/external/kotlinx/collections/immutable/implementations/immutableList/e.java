package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import fi.u;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PersistentVectorIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B=\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0003\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\bX\u0088\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/e;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/a;", "next", "()Ljava/lang/Object;", "previous", "", "d", "[Ljava/lang/Object;", "tail", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/i;", "e", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/i;", "trieIterator", "", "root", "", UCropPlusActivity.ARG_INDEX, UiKitSpanObj.TYPE_SIZE, "trieHeight", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;III)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class e<T> extends a<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final T[] tail;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final i<T> trieIterator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@dl.d Object[] root, @dl.d T[] tail, int i10, int i11, int i12) {
        super(i10, i11);
        f0.p(root, "root");
        f0.p(tail, "tail");
        this.tail = tail;
        int iD = j.d(i11);
        this.trieIterator = new i<>(root, u.B(i10, iD), iD, i12);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator, java.util.Iterator
    public T next() {
        a();
        if (this.trieIterator.hasNext()) {
            e(getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() + 1);
            return this.trieIterator.next();
        }
        T[] tArr = this.tail;
        int i10 = getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String();
        e(i10 + 1);
        return tArr[i10 - this.trieIterator.getSize()];
    }

    @Override // java.util.ListIterator
    public T previous() {
        b();
        if (getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() <= this.trieIterator.getSize()) {
            e(getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() - 1);
            return this.trieIterator.previous();
        }
        T[] tArr = this.tail;
        e(getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() - 1);
        return tArr[getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() - this.trieIterator.getSize()];
    }
}
