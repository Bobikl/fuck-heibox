package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.w0;

/* JADX INFO: compiled from: PersistentHashSetMutableIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b!\u0010\"J3\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u000e\u001a\u00020\r2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0002J\b\u0010\u000f\u001a\u00020\nH\u0002J\b\u0010\u0010\u001a\u00020\nH\u0002J\u0010\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\nH\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/d;", androidx.exifinterface.media.a.S4, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/c;", "", "", "hashCode", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "node", "element", "pathIndex", "Lkotlin/b2;", "o", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;Ljava/lang/Object;I)V", "", "n", "j", "i", "next", "()Ljava/lang/Object;", "remove", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/b;", "e", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/b;", "builder", "f", "Ljava/lang/Object;", "lastIteratedElement", "g", "Z", "nextWasInvoked", RXScreenCaptureService.KEY_HEIGHT, "I", "expectedModCount", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/b;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class d<E> extends c<E> implements Iterator<E>, zh.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final b<E> builder;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private E lastIteratedElement;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean nextWasInvoked;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int expectedModCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@dl.d b<E> builder) {
        super(builder.g());
        f0.p(builder, "builder");
        this.builder = builder;
        this.expectedModCount = builder.getModCount();
    }

    private final void i() {
        if (this.builder.getModCount() != this.expectedModCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void j() {
        if (!this.nextWasInvoked) {
            throw new IllegalStateException();
        }
    }

    private final boolean n(e<?> node) {
        return node.getBitmap() == 0;
    }

    private final void o(int hashCode, e<?> node, E element, int pathIndex) {
        if (n(node)) {
            int iJg = ArraysKt___ArraysKt.jg(node.getBuffer(), element);
            y0.a.a(iJg != -1);
            d().get(pathIndex).h(node.getBuffer(), iJg);
            h(pathIndex);
            return;
        }
        int iQ = node.q(1 << TrieNodeKt.f(hashCode, pathIndex * 5));
        d().get(pathIndex).h(node.getBuffer(), iQ);
        Object obj = node.getBuffer()[iQ];
        if (obj instanceof e) {
            o(hashCode, (e) obj, element, pathIndex + 1);
        } else {
            h(pathIndex);
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.c, java.util.Iterator
    public E next() {
        i();
        E e10 = (E) super.next();
        this.lastIteratedElement = e10;
        this.nextWasInvoked = true;
        return e10;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.c, java.util.Iterator
    public void remove() {
        j();
        if (getHasNext()) {
            E eA = a();
            w0.a(this.builder).remove(this.lastIteratedElement);
            o(eA != null ? eA.hashCode() : 0, this.builder.g(), eA, 0);
        } else {
            w0.a(this.builder).remove(this.lastIteratedElement);
        }
        this.lastIteratedElement = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getModCount();
    }
}
