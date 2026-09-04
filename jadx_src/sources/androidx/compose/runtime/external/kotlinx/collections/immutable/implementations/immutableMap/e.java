package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PersistentHashMapContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B;\u0012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 \u0012\u001e\u0010\u0015\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00110\u0010¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\u000f\u0010\u000b\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u000e\u001a\u00020\rH\u0096\u0002J\u0010\u0010\u000f\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\fR2\u0010\u0015\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00110\u00108\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u001b\u001a\u00020\u00058\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/e;", "K", androidx.exifinterface.media.a.X4, androidx.exifinterface.media.a.f23244d5, "", "", "pathIndex", RXScreenCaptureService.KEY_HEIGHT, "Lkotlin/b2;", ak.aF, ak.av, "b", "()Ljava/lang/Object;", "", "hasNext", "next", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/v;", "[Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/v;", "e", "()[Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/v;", FlutterActivityLaunchConfigs.EXTRA_PATH, "I", "g", "()I", "i", "(I)V", "pathLastIndex", "d", "Z", "getHasNext$annotations", "()V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "node", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;[Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/v;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public abstract class e<K, V, T> implements Iterator<T>, zh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final v<K, V, T>[] path;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int pathLastIndex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean hasNext;

    public e(@dl.d u<K, V> node, @dl.d v<K, V, T>[] path) {
        f0.p(node, "node");
        f0.p(path, "path");
        this.path = path;
        this.hasNext = true;
        path[0].j(node.getBuffer(), node.p() * 2);
        this.pathLastIndex = 0;
        c();
    }

    private final void a() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void c() {
        if (this.path[this.pathLastIndex].e()) {
            return;
        }
        for (int i10 = this.pathLastIndex; -1 < i10; i10--) {
            int iH = h(i10);
            if (iH == -1 && this.path[i10].g()) {
                this.path[i10].i();
                iH = h(i10);
            }
            if (iH != -1) {
                this.pathLastIndex = iH;
                return;
            }
            if (i10 > 0) {
                this.path[i10 - 1].i();
            }
            this.path[i10].j(u.INSTANCE.a().getBuffer(), 0);
        }
        this.hasNext = false;
    }

    private static /* synthetic */ void d() {
    }

    private final int h(int pathIndex) {
        if (this.path[pathIndex].e()) {
            return pathIndex;
        }
        if (!this.path[pathIndex].g()) {
            return -1;
        }
        u<? extends K, ? extends V> uVarB = this.path[pathIndex].b();
        if (pathIndex == 6) {
            this.path[pathIndex + 1].j(uVarB.getBuffer(), uVarB.getBuffer().length);
        } else {
            this.path[pathIndex + 1].j(uVarB.getBuffer(), uVarB.p() * 2);
        }
        return h(pathIndex + 1);
    }

    protected final K b() {
        a();
        return this.path[this.pathLastIndex].a();
    }

    @dl.d
    protected final v<K, V, T>[] e() {
        return this.path;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    protected final int getPathLastIndex() {
        return this.pathLastIndex;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    protected final void i(int i10) {
        this.pathLastIndex = i10;
    }

    @Override // java.util.Iterator
    public T next() {
        a();
        T next = this.path[this.pathLastIndex].next();
        c();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
