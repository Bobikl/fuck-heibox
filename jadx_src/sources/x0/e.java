package x0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.w0;

/* JADX INFO: compiled from: PersistentOrderedSetMutableIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0004H\u0016¨\u0006\u000e"}, d2 = {"Lx0/e;", androidx.exifinterface.media.a.S4, "Lx0/d;", "", "Lkotlin/b2;", "g", "e", "next", "()Ljava/lang/Object;", "remove", "Lx0/c;", "builder", "<init>", "(Lx0/c;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class e<E> extends d<E> implements Iterator<E>, zh.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final c<E> f141060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private E f141061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f141062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f141063h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@dl.d c<E> builder) {
        super(builder.getF141054c(), builder.e());
        f0.p(builder, "builder");
        this.f141060e = builder;
        this.f141063h = builder.e().getModCount();
    }

    private final void e() {
        if (this.f141060e.e().getModCount() != this.f141063h) {
            throw new ConcurrentModificationException();
        }
    }

    private final void g() {
        if (!this.f141062g) {
            throw new IllegalStateException();
        }
    }

    @Override // x0.d, java.util.Iterator
    public E next() {
        e();
        E e10 = (E) super.next();
        this.f141061f = e10;
        this.f141062g = true;
        return e10;
    }

    @Override // x0.d, java.util.Iterator
    public void remove() {
        g();
        w0.a(this.f141060e).remove(this.f141061f);
        this.f141061f = null;
        this.f141062g = false;
        this.f141063h = this.f141060e.e().getModCount();
        d(getF141059d() - 1);
    }
}
