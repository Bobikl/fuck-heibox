package okio;

import dl.d;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.internal.f0;
import xh.e;

/* JADX INFO: compiled from: Segment.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\t\b\u0016¢\u0006\u0004\b\u001b\u0010\u001cB1\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001dJ\u0006\u0010\u0002\u001a\u00020\u0000J\u0006\u0010\u0003\u001a\u00020\u0000J\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001f"}, d2 = {"Lokio/Segment;", "", "sharedCopy", "unsharedCopy", "pop", "segment", "push", "", "byteCount", "split", "Lkotlin/b2;", "compact", "sink", "writeTo", "", "data", "[B", "pos", "I", "limit", "", "shared", "Z", "owner", "next", "Lokio/Segment;", "prev", "<init>", "()V", "([BIIZZ)V", "Companion", "okio"}, k = 1, mv = {1, 4, 0})
public final class Segment {
    public static final int SHARE_MINIMUM = 1024;
    public static final int SIZE = 8192;

    @d
    @e
    public final byte[] data;

    @e
    public int limit;

    @dl.e
    @e
    public Segment next;

    @e
    public boolean owner;

    @e
    public int pos;

    @dl.e
    @e
    public Segment prev;

    @e
    public boolean shared;

    public Segment() {
        this.data = new byte[8192];
        this.owner = true;
        this.shared = false;
    }

    public Segment(@d byte[] data, int i10, int i11, boolean z10, boolean z11) {
        f0.p(data, "data");
        this.data = data;
        this.pos = i10;
        this.limit = i11;
        this.shared = z10;
        this.owner = z11;
    }

    public final void compact() {
        Segment segment = this.prev;
        int i10 = 0;
        if (!(segment != this)) {
            throw new IllegalStateException("cannot compact".toString());
        }
        f0.m(segment);
        if (segment.owner) {
            int i11 = this.limit - this.pos;
            Segment segment2 = this.prev;
            f0.m(segment2);
            int i12 = 8192 - segment2.limit;
            Segment segment3 = this.prev;
            f0.m(segment3);
            if (!segment3.shared) {
                Segment segment4 = this.prev;
                f0.m(segment4);
                i10 = segment4.pos;
            }
            if (i11 > i12 + i10) {
                return;
            }
            Segment segment5 = this.prev;
            f0.m(segment5);
            writeTo(segment5, i11);
            pop();
            SegmentPool.recycle(this);
        }
    }

    @dl.e
    public final Segment pop() {
        Segment segment = this.next;
        if (segment == this) {
            segment = null;
        }
        Segment segment2 = this.prev;
        f0.m(segment2);
        segment2.next = this.next;
        Segment segment3 = this.next;
        f0.m(segment3);
        segment3.prev = this.prev;
        this.next = null;
        this.prev = null;
        return segment;
    }

    @d
    public final Segment push(@d Segment segment) {
        f0.p(segment, "segment");
        segment.prev = this;
        segment.next = this.next;
        Segment segment2 = this.next;
        f0.m(segment2);
        segment2.prev = segment;
        this.next = segment;
        return segment;
    }

    @d
    public final Segment sharedCopy() {
        this.shared = true;
        return new Segment(this.data, this.pos, this.limit, true, false);
    }

    @d
    public final Segment split(int byteCount) {
        Segment segmentTake;
        if (!(byteCount > 0 && byteCount <= this.limit - this.pos)) {
            throw new IllegalArgumentException("byteCount out of range".toString());
        }
        if (byteCount >= 1024) {
            segmentTake = sharedCopy();
        } else {
            segmentTake = SegmentPool.take();
            byte[] bArr = this.data;
            byte[] bArr2 = segmentTake.data;
            int i10 = this.pos;
            m.f1(bArr, bArr2, 0, i10, i10 + byteCount, 2, null);
        }
        segmentTake.limit = segmentTake.pos + byteCount;
        this.pos += byteCount;
        Segment segment = this.prev;
        f0.m(segment);
        segment.push(segmentTake);
        return segmentTake;
    }

    @d
    public final Segment unsharedCopy() {
        byte[] bArr = this.data;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        f0.o(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
        return new Segment(bArrCopyOf, this.pos, this.limit, false, true);
    }

    public final void writeTo(@d Segment sink, int i10) {
        f0.p(sink, "sink");
        if (!sink.owner) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i11 = sink.limit;
        if (i11 + i10 > 8192) {
            if (sink.shared) {
                throw new IllegalArgumentException();
            }
            int i12 = sink.pos;
            if ((i11 + i10) - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.data;
            m.f1(bArr, bArr, 0, i12, i11, 2, null);
            sink.limit -= sink.pos;
            sink.pos = 0;
        }
        byte[] bArr2 = this.data;
        byte[] bArr3 = sink.data;
        int i13 = sink.limit;
        int i14 = this.pos;
        m.W0(bArr2, bArr3, i13, i14, i14 + i10);
        sink.limit += i10;
        this.pos += i10;
    }
}
