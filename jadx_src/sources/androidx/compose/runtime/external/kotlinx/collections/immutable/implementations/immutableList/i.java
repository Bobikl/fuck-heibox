package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TrieIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B/\u0012\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0002J\u000f\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0011\u001a\u00020\u00062\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u000bJ\u000f\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/i;", androidx.exifinterface.media.a.S4, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/a;", "", UCropPlusActivity.ARG_INDEX, "startLevel", "Lkotlin/b2;", "i", "indexPredicate", "j", RXScreenCaptureService.KEY_HEIGHT, "()Ljava/lang/Object;", "", "", "root", UiKitSpanObj.TYPE_SIZE, "height", "n", "([Ljava/lang/Object;III)V", "next", "previous", "d", "I", "e", "[Ljava/lang/Object;", FlutterActivityLaunchConfigs.EXTRA_PATH, "", "f", "Z", "isInRightEdge", "<init>", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class i<E> extends a<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int height;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private Object[] path;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isInRightEdge;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public i(@dl.d Object[] root, int i10, int i11, int i12) {
        super(i10, i11);
        f0.p(root, "root");
        this.height = i12;
        Object[] objArr = new Object[i12];
        this.path = objArr;
        ?? r10 = i10 == i11 ? 1 : 0;
        this.isInRightEdge = r10;
        objArr[0] = root;
        i(i10 - r10, 1);
    }

    private final E h() {
        int i10 = getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() & 31;
        Object obj = this.path[this.height - 1];
        f0.n(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return (E) ((Object[]) obj)[i10];
    }

    private final void i(int i10, int i11) {
        int i12 = (this.height - i11) * 5;
        while (i11 < this.height) {
            Object[] objArr = this.path;
            Object obj = objArr[i11 - 1];
            f0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i11] = ((Object[]) obj)[j.a(i10, i12)];
            i12 -= 5;
            i11++;
        }
    }

    private final void j(int i10) {
        int i11 = 0;
        while (j.a(getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String(), i11) == i10) {
            i11 += 5;
        }
        if (i11 > 0) {
            i(getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String(), ((this.height - 1) - (i11 / 5)) + 1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final void n(@dl.d Object[] root, int index, int size, int height) {
        f0.p(root, "root");
        e(index);
        g(size);
        this.height = height;
        if (this.path.length < height) {
            this.path = new Object[height];
        }
        this.path[0] = root;
        ?? r10 = index == size ? 1 : 0;
        this.isInRightEdge = r10;
        i(index - r10, 1);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator, java.util.Iterator
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E eH = h();
        e(getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() + 1);
        if (getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() == getSize()) {
            this.isInRightEdge = true;
            return eH;
        }
        j(0);
        return eH;
    }

    @Override // java.util.ListIterator
    public E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        e(getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() - 1);
        if (this.isInRightEdge) {
            this.isInRightEdge = false;
            return h();
        }
        j(31);
        return h();
    }
}
