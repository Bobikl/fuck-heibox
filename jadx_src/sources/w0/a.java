package w0;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: PersistentOrderedMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019B\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u001aB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u001bJ\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0002R\u0017\u0010\n\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0015\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u001c"}, d2 = {"Lw0/a;", androidx.exifinterface.media.a.X4, "", "newValue", RXScreenCaptureService.KEY_HEIGHT, "(Ljava/lang/Object;)Lw0/a;", "newPrevious", "g", "newNext", "f", "value", "Ljava/lang/Object;", "e", "()Ljava/lang/Object;", "previous", "d", "next", ak.aF, "", ak.av, "()Z", "hasNext", "b", "hasPrevious", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "(Ljava/lang/Object;)V", "(Ljava/lang/Object;Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class a<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V f140919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final Object f140920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final Object f140921c;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(V v10) {
        y0.c cVar = y0.c.f141522a;
        this(v10, cVar, cVar);
    }

    public a(V v10, @dl.e Object obj) {
        this(v10, obj, y0.c.f141522a);
    }

    public a(V v10, @dl.e Object obj, @dl.e Object obj2) {
        this.f140919a = v10;
        this.f140920b = obj;
        this.f140921c = obj2;
    }

    public final boolean a() {
        return this.f140921c != y0.c.f141522a;
    }

    public final boolean b() {
        return this.f140920b != y0.c.f141522a;
    }

    @dl.e
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Object getF140921c() {
        return this.f140921c;
    }

    @dl.e
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Object getF140920b() {
        return this.f140920b;
    }

    public final V e() {
        return this.f140919a;
    }

    @dl.d
    public final a<V> f(@dl.e Object newNext) {
        return new a<>(this.f140919a, this.f140920b, newNext);
    }

    @dl.d
    public final a<V> g(@dl.e Object newPrevious) {
        return new a<>(this.f140919a, newPrevious, this.f140921c);
    }

    @dl.d
    public final a<V> h(V newValue) {
        return new a<>(newValue, this.f140920b, this.f140921c);
    }
}
