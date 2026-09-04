package w0;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.w0;

/* JADX INFO: compiled from: PersistentOrderedMapBuilderContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003B%\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0012\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r¢\u0006\u0004\b!\u0010\"J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\t\u0010\n\u001a\u00020\tH\u0096\u0002J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002J\b\u0010\f\u001a\u00020\u0005H\u0016R&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lw0/i;", "K", androidx.exifinterface.media.a.X4, "", "Lw0/a;", "Lkotlin/b2;", "b", ak.aF, ak.av, "", "hasNext", RXScreenCaptureService.KEY_HEIGHT, "remove", "Lw0/d;", "builder", "Lw0/d;", "d", "()Lw0/d;", "", "lastIteratedKey", "Ljava/lang/Object;", "g", "()Ljava/lang/Object;", "j", "(Ljava/lang/Object;)V", "", UCropPlusActivity.ARG_INDEX, "I", "e", "()I", "i", "(I)V", "nextKey", "<init>", "(Ljava/lang/Object;Lw0/d;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public class i<K, V> implements Iterator<a<V>>, zh.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private Object f140937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final d<K, V> f140938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private Object f140939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f140940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f140941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f140942g;

    public i(@dl.e Object obj, @dl.d d<K, V> builder) {
        f0.p(builder, "builder");
        this.f140937b = obj;
        this.f140938c = builder;
        this.f140939d = y0.c.f141522a;
        this.f140941f = builder.g().getModCount();
    }

    private final void a() {
        if (this.f140938c.g().getModCount() != this.f140941f) {
            throw new ConcurrentModificationException();
        }
    }

    private final void b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void c() {
        if (!this.f140940e) {
            throw new IllegalStateException();
        }
    }

    @dl.d
    public final d<K, V> d() {
        return this.f140938c;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getF140942g() {
        return this.f140942g;
    }

    @dl.e
    /* JADX INFO: renamed from: g, reason: from getter */
    public final Object getF140939d() {
        return this.f140939d;
    }

    @Override // java.util.Iterator
    @dl.d
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public a<V> next() {
        a();
        b();
        this.f140939d = this.f140937b;
        this.f140940e = true;
        this.f140942g++;
        a<V> aVar = this.f140938c.g().get(this.f140937b);
        if (aVar != null) {
            a<V> aVar2 = aVar;
            this.f140937b = aVar2.getF140921c();
            return aVar2;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.f140937b + ") has changed after it was added to the persistent map.");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f140942g < this.f140938c.size();
    }

    public final void i(int i10) {
        this.f140942g = i10;
    }

    public final void j(@dl.e Object obj) {
        this.f140939d = obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        c();
        w0.k(this.f140938c).remove(this.f140939d);
        this.f140939d = null;
        this.f140940e = false;
        this.f140941f = this.f140938c.g().getModCount();
        this.f140942g--;
    }
}
