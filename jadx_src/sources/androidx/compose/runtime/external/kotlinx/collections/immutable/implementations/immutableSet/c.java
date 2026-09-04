package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PersistentHashSetIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\t\u0010\t\u001a\u00020\bH\u0096\u0002J\u0010\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\f\u0010\u000bR&\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\r8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00038\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u0012\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/c;", androidx.exifinterface.media.a.S4, "", "", "pathIndex", "g", "Lkotlin/b2;", "b", "", "hasNext", "next", "()Ljava/lang/Object;", ak.av, "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/f;", "Ljava/util/List;", "d", "()Ljava/util/List;", FlutterActivityLaunchConfigs.EXTRA_PATH, ak.aF, "I", "e", "()I", RXScreenCaptureService.KEY_HEIGHT, "(I)V", "pathLastIndex", "Z", "getHasNext$annotations", "()V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "node", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public class c<E> implements Iterator<E>, zh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<f<E>> path;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int pathLastIndex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean hasNext;

    public c(@dl.d e<E> node) {
        f0.p(node, "node");
        List<f<E>> listP = CollectionsKt__CollectionsKt.P(new f());
        this.path = listP;
        this.hasNext = true;
        f.i(listP.get(0), node.getBuffer(), 0, 2, null);
        this.pathLastIndex = 0;
        b();
    }

    private final void b() {
        if (this.path.get(this.pathLastIndex).d()) {
            return;
        }
        for (int i10 = this.pathLastIndex; -1 < i10; i10--) {
            int iG = g(i10);
            if (iG == -1 && this.path.get(i10).c()) {
                this.path.get(i10).f();
                iG = g(i10);
            }
            if (iG != -1) {
                this.pathLastIndex = iG;
                return;
            }
            if (i10 > 0) {
                this.path.get(i10 - 1).f();
            }
            this.path.get(i10).h(e.INSTANCE.a().getBuffer(), 0);
        }
        this.hasNext = false;
    }

    private static /* synthetic */ void c() {
    }

    private final int g(int pathIndex) {
        if (this.path.get(pathIndex).d()) {
            return pathIndex;
        }
        if (!this.path.get(pathIndex).e()) {
            return -1;
        }
        e<? extends E> eVarB = this.path.get(pathIndex).b();
        int i10 = pathIndex + 1;
        if (i10 == this.path.size()) {
            this.path.add(new f<>());
        }
        f.i(this.path.get(i10), eVarB.getBuffer(), 0, 2, null);
        return g(i10);
    }

    protected final E a() {
        y0.a.a(hasNext());
        return this.path.get(this.pathLastIndex).a();
    }

    @dl.d
    protected final List<f<E>> d() {
        return this.path;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    protected final int getPathLastIndex() {
        return this.pathLastIndex;
    }

    protected final void h(int i10) {
        this.pathLastIndex = i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // java.util.Iterator
    public E next() {
        if (!this.hasNext) {
            throw new NoSuchElementException();
        }
        E eG = this.path.get(this.pathLastIndex).g();
        b();
        return eG;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
