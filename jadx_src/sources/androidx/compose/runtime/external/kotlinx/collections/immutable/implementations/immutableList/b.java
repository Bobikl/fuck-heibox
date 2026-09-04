package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BufferIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0003\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\bX\u0088\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/b;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/a;", "next", "()Ljava/lang/Object;", "previous", "", "d", "[Ljava/lang/Object;", "buffer", "", UCropPlusActivity.ARG_INDEX, UiKitSpanObj.TYPE_SIZE, "<init>", "([Ljava/lang/Object;II)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class b<T> extends a<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final T[] buffer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@dl.d T[] buffer, int i10, int i11) {
        super(i10, i11);
        f0.p(buffer, "buffer");
        this.buffer = buffer;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator, java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T[] tArr = this.buffer;
        int i10 = getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String();
        e(i10 + 1);
        return tArr[i10];
    }

    @Override // java.util.ListIterator
    public T previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        T[] tArr = this.buffer;
        e(getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() - 1);
        return tArr[getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String()];
    }
}
