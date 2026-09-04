package androidx.compose.ui.graphics;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: PixelMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0011\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0015\u0010\u000f\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/graphics/s1;", "", "", "x", "y", "Landroidx/compose/ui/graphics/l0;", ak.av, "(II)J", "", "[I", "b", "()[I", "buffer", "I", "f", "()I", "width", ak.aF, "d", "height", "bufferOffset", "e", "stride", "<init>", "([IIIII)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final int[] buffer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int width;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int height;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int bufferOffset;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int stride;

    public s1(@dl.d int[] buffer, int i10, int i11, int i12, int i13) {
        kotlin.jvm.internal.f0.p(buffer, "buffer");
        this.buffer = buffer;
        this.width = i10;
        this.height = i11;
        this.bufferOffset = i12;
        this.stride = i13;
    }

    public final long a(int x10, int y10) {
        return n0.b(this.buffer[this.bufferOffset + (y10 * this.stride) + x10]);
    }

    @dl.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final int[] getBuffer() {
        return this.buffer;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getBufferOffset() {
        return this.bufferOffset;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getStride() {
        return this.stride;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getWidth() {
        return this.width;
    }
}
