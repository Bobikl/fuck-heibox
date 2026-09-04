package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import fi.u;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PersistentVectorMutableIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0006\u0010\u001f\u001a\u00020\u0015¢\u0006\u0004\b \u0010!J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\u000f\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0004H\u0016J\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017¨\u0006\""}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/f;", androidx.exifinterface.media.a.f23244d5, "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/a;", "Lkotlin/b2;", "j", "n", RXScreenCaptureService.KEY_HEIGHT, "i", "previous", "()Ljava/lang/Object;", "next", "element", "add", "(Ljava/lang/Object;)V", "remove", "set", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "d", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "builder", "", "e", "I", "expectedModCount", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/i;", "f", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/i;", "trieIterator", "g", "lastIteratedIndex", UCropPlusActivity.ARG_INDEX, "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;I)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class f<T> extends a<T> implements ListIterator<T>, zh.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final PersistentVectorBuilder<T> builder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int expectedModCount;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private i<? extends T> trieIterator;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int lastIteratedIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@dl.d PersistentVectorBuilder<T> builder, int i10) {
        super(i10, builder.size());
        f0.p(builder, "builder");
        this.builder = builder;
        this.expectedModCount = builder.h();
        this.lastIteratedIndex = -1;
        n();
    }

    private final void h() {
        if (this.expectedModCount != this.builder.h()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void i() {
        if (this.lastIteratedIndex == -1) {
            throw new IllegalStateException();
        }
    }

    private final void j() {
        g(this.builder.size());
        this.expectedModCount = this.builder.h();
        this.lastIteratedIndex = -1;
        n();
    }

    private final void n() {
        Object[] objArrI = this.builder.getRoot();
        if (objArrI == null) {
            this.trieIterator = null;
            return;
        }
        int iD = j.d(this.builder.size());
        int iB = u.B(getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String(), iD);
        int iJ = (this.builder.getRootShift() / 5) + 1;
        i<? extends T> iVar = this.trieIterator;
        if (iVar == null) {
            this.trieIterator = new i<>(objArrI, iB, iD, iJ);
        } else {
            f0.m(iVar);
            iVar.n(objArrI, iB, iD, iJ);
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator
    public void add(T element) {
        h();
        this.builder.add(getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String(), element);
        e(getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() + 1);
        j();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator, java.util.Iterator
    public T next() {
        h();
        a();
        this.lastIteratedIndex = getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String();
        i<? extends T> iVar = this.trieIterator;
        if (iVar == null) {
            Object[] objArrL = this.builder.getTail();
            int i10 = getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String();
            e(i10 + 1);
            return (T) objArrL[i10];
        }
        if (iVar.hasNext()) {
            e(getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() + 1);
            return iVar.next();
        }
        Object[] objArrL2 = this.builder.getTail();
        int i11 = getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String();
        e(i11 + 1);
        return (T) objArrL2[i11 - iVar.getSize()];
    }

    @Override // java.util.ListIterator
    public T previous() {
        h();
        b();
        this.lastIteratedIndex = getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() - 1;
        i<? extends T> iVar = this.trieIterator;
        if (iVar == null) {
            Object[] objArrL = this.builder.getTail();
            e(getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() - 1);
            return (T) objArrL[getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String()];
        }
        if (getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() <= iVar.getSize()) {
            e(getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() - 1);
            return iVar.previous();
        }
        Object[] objArrL2 = this.builder.getTail();
        e(getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() - 1);
        return (T) objArrL2[getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() - iVar.getSize()];
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator, java.util.Iterator
    public void remove() {
        h();
        i();
        this.builder.remove(this.lastIteratedIndex);
        if (this.lastIteratedIndex < getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String()) {
            e(this.lastIteratedIndex);
        }
        j();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator
    public void set(T element) {
        h();
        i();
        this.builder.set(this.lastIteratedIndex, element);
        this.expectedModCount = this.builder.h();
        n();
    }
}
