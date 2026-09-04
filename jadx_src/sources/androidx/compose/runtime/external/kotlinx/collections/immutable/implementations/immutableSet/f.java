package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PersistentHashSetIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\u0007J\u0006\u0010\r\u001a\u00020\nJ\r\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ\u0006\u0010\u0011\u001a\u00020\nJ\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0012R\u001e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/f;", androidx.exifinterface.media.a.S4, "", "", "buffer", "", UCropPlusActivity.ARG_INDEX, "Lkotlin/b2;", RXScreenCaptureService.KEY_HEIGHT, "([Ljava/lang/Object;I)V", "", ak.aF, "f", "d", ak.av, "()Ljava/lang/Object;", "g", "e", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "b", "[Ljava/lang/Object;", "I", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class f<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private Object[] buffer = e.INSTANCE.a().getBuffer();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int index;

    public static /* synthetic */ void i(f fVar, Object[] objArr, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        fVar.h(objArr, i10);
    }

    public final E a() {
        y0.a.a(d());
        return (E) this.buffer[this.index];
    }

    @dl.d
    public final e<? extends E> b() {
        y0.a.a(e());
        Object obj = this.buffer[this.index];
        f0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeIterator>");
        return (e) obj;
    }

    public final boolean c() {
        return this.index < this.buffer.length;
    }

    public final boolean d() {
        return c() && !(this.buffer[this.index] instanceof e);
    }

    public final boolean e() {
        return c() && (this.buffer[this.index] instanceof e);
    }

    public final void f() {
        y0.a.a(c());
        this.index++;
    }

    public final E g() {
        y0.a.a(d());
        Object[] objArr = this.buffer;
        int i10 = this.index;
        this.index = i10 + 1;
        return (E) objArr[i10];
    }

    public final void h(@dl.d Object[] buffer, int index) {
        f0.p(buffer, "buffer");
        this.buffer = buffer;
        this.index = index;
    }
}
