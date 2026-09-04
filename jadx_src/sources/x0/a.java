package x0;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: PersistentOrderedSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0012\u0010\u0013B\t\b\u0016¢\u0006\u0004\b\u0012\u0010\u0014B\u0013\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0012\u0010\u0015J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0016"}, d2 = {"Lx0/a;", "", "newNext", "e", "newPrevious", "f", "previous", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "next", ak.aF, "", ak.av, "()Z", "hasNext", "b", "hasPrevious", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "()V", "(Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private final Object f141046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final Object f141047b;

    /* JADX WARN: Illegal instructions before constructor call */
    public a() {
        y0.c cVar = y0.c.f141522a;
        this(cVar, cVar);
    }

    public a(@dl.e Object obj) {
        this(obj, y0.c.f141522a);
    }

    public a(@dl.e Object obj, @dl.e Object obj2) {
        this.f141046a = obj;
        this.f141047b = obj2;
    }

    public final boolean a() {
        return this.f141047b != y0.c.f141522a;
    }

    public final boolean b() {
        return this.f141046a != y0.c.f141522a;
    }

    @dl.e
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Object getF141047b() {
        return this.f141047b;
    }

    @dl.e
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Object getF141046a() {
        return this.f141046a;
    }

    @dl.d
    public final a e(@dl.e Object newNext) {
        return new a(this.f141046a, newNext);
    }

    @dl.d
    public final a f(@dl.e Object newPrevious) {
        return new a(newPrevious, this.f141047b);
    }
}
