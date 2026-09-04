package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.w0;

/* JADX INFO: compiled from: PersistentHashMapBuilderContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B;\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017\u0012\u001e\u0010'\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020&0%¢\u0006\u0004\b(\u0010)J7\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\t\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\fH\u0016J\u001d\u0010\u0015\u001a\u00020\f2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0001¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006*"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/g;", "K", androidx.exifinterface.media.a.X4, androidx.exifinterface.media.a.f23244d5, "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/e;", "", "keyHash", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "node", "key", "pathIndex", "Lkotlin/b2;", "o", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;Ljava/lang/Object;I)V", "n", "j", "next", "()Ljava/lang/Object;", "remove", "newValue", "p", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;", "e", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;", "builder", "f", "Ljava/lang/Object;", "lastIteratedKey", "", "g", "Z", "nextWasInvoked", RXScreenCaptureService.KEY_HEIGHT, "I", "expectedModCount", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/v;", FlutterActivityLaunchConfigs.EXTRA_PATH, "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;[Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/v;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public class g<K, V, T> extends e<K, V, T> implements Iterator<T>, zh.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f<K, V> builder;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private K lastIteratedKey;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean nextWasInvoked;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int expectedModCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@dl.d f<K, V> builder, @dl.d v<K, V, T>[] path) {
        super(builder.h(), path);
        f0.p(builder, "builder");
        f0.p(path, "path");
        this.builder = builder;
        this.expectedModCount = builder.getModCount();
    }

    private final void j() {
        if (this.builder.getModCount() != this.expectedModCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void n() {
        if (!this.nextWasInvoked) {
            throw new IllegalStateException();
        }
    }

    private final void o(int keyHash, u<?, ?> node, K key, int pathIndex) {
        int i10 = pathIndex * 5;
        if (i10 > 30) {
            e()[pathIndex].n(node.getBuffer(), node.getBuffer().length, 0);
            while (!f0.g(e()[pathIndex].a(), key)) {
                e()[pathIndex].h();
            }
            i(pathIndex);
            return;
        }
        int iF = 1 << y.f(keyHash, i10);
        if (node.t(iF)) {
            e()[pathIndex].n(node.getBuffer(), node.p() * 2, node.q(iF));
            i(pathIndex);
        } else {
            int iR = node.R(iF);
            u<?, ?> uVarQ = node.Q(iR);
            e()[pathIndex].n(node.getBuffer(), node.p() * 2, iR);
            o(keyHash, uVarQ, key, pathIndex + 1);
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.e, java.util.Iterator
    public T next() {
        j();
        this.lastIteratedKey = b();
        this.nextWasInvoked = true;
        return (T) super.next();
    }

    public final void p(K key, V newValue) {
        if (this.builder.containsKey(key)) {
            if (getHasNext()) {
                K kB = b();
                this.builder.put(key, newValue);
                o(kB != null ? kB.hashCode() : 0, this.builder.h(), kB, 0);
            } else {
                this.builder.put(key, newValue);
            }
            this.expectedModCount = this.builder.getModCount();
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.e, java.util.Iterator
    public void remove() {
        n();
        if (getHasNext()) {
            K kB = b();
            w0.k(this.builder).remove(this.lastIteratedKey);
            o(kB != null ? kB.hashCode() : 0, this.builder.h(), kB, 0);
        } else {
            w0.k(this.builder).remove(this.lastIteratedKey);
        }
        this.lastIteratedKey = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getModCount();
    }
}
