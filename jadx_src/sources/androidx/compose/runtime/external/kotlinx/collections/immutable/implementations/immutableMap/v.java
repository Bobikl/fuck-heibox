package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PersistentHashMapContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00020\u0004B\u0007¢\u0006\u0004\b#\u0010$J-\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u000b2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0011\u001a\u00020\u0010J\r\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u000bJ\u0006\u0010\u0015\u001a\u00020\u0010J\u0016\u0010\u0017\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0016J\u0006\u0010\u0018\u001a\u00020\u000bJ\t\u0010\u0019\u001a\u00020\u0010H\u0096\u0002R4\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR\"\u0010\n\u001a\u00020\b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/v;", "K", androidx.exifinterface.media.a.X4, androidx.exifinterface.media.a.f23244d5, "", "", "", "buffer", "", "dataSize", UCropPlusActivity.ARG_INDEX, "Lkotlin/b2;", "n", "([Ljava/lang/Object;II)V", "j", "([Ljava/lang/Object;I)V", "", "e", ak.av, "()Ljava/lang/Object;", RXScreenCaptureService.KEY_HEIGHT, "g", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "b", "i", "hasNext", "<set-?>", "[Ljava/lang/Object;", ak.aF, "()[Ljava/lang/Object;", "I", "d", "()I", "o", "(I)V", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public abstract class v<K, V, T> implements Iterator<T>, zh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private Object[] buffer = u.INSTANCE.a().getBuffer();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int dataSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int index;

    public final K a() {
        y0.a.a(e());
        return (K) this.buffer[this.index];
    }

    @dl.d
    public final u<? extends K, ? extends V> b() {
        y0.a.a(g());
        Object obj = this.buffer[this.index];
        f0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (u) obj;
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    protected final Object[] getBuffer() {
        return this.buffer;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    protected final int getIndex() {
        return this.index;
    }

    public final boolean e() {
        return this.index < this.dataSize;
    }

    public final boolean g() {
        y0.a.a(this.index >= this.dataSize);
        return this.index < this.buffer.length;
    }

    public final void h() {
        y0.a.a(e());
        this.index += 2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return e();
    }

    public final void i() {
        y0.a.a(g());
        this.index++;
    }

    public final void j(@dl.d Object[] buffer, int dataSize) {
        f0.p(buffer, "buffer");
        n(buffer, dataSize, 0);
    }

    public final void n(@dl.d Object[] buffer, int dataSize, int index) {
        f0.p(buffer, "buffer");
        this.buffer = buffer;
        this.dataSize = dataSize;
        this.index = index;
    }

    protected final void o(int i10) {
        this.index = i10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
