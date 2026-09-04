package okio;

import androidx.compose.animation.core.s0;
import dl.d;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import xh.m;

/* JADX INFO: compiled from: SegmentPool.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H\u0002R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00070\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\r¨\u0006\u0018"}, d2 = {"Lokio/SegmentPool;", "", "Lokio/Segment;", "take", "segment", "Lkotlin/b2;", "recycle", "Ljava/util/concurrent/atomic/AtomicReference;", "firstRef", "", "MAX_SIZE", "I", "getMAX_SIZE", "()I", "LOCK", "Lokio/Segment;", "HASH_BUCKET_COUNT", "", "hashBuckets", "[Ljava/util/concurrent/atomic/AtomicReference;", "getByteCount", "byteCount", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
public final class SegmentPool {
    private static final int HASH_BUCKET_COUNT;
    private static final AtomicReference<Segment>[] hashBuckets;
    public static final SegmentPool INSTANCE = new SegmentPool();
    private static final int MAX_SIZE = 65536;
    private static final Segment LOCK = new Segment(new byte[0], 0, 0, false, false);

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        HASH_BUCKET_COUNT = iHighestOneBit;
        AtomicReference<Segment>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference<>();
        }
        hashBuckets = atomicReferenceArr;
    }

    private SegmentPool() {
    }

    private final AtomicReference<Segment> firstRef() {
        Thread threadCurrentThread = Thread.currentThread();
        f0.o(threadCurrentThread, "Thread.currentThread()");
        return hashBuckets[(int) (threadCurrentThread.getId() & (((long) HASH_BUCKET_COUNT) - 1))];
    }

    @m
    public static final void recycle(@d Segment segment) {
        AtomicReference<Segment> atomicReferenceFirstRef;
        Segment segment2;
        f0.p(segment, "segment");
        if (!(segment.next == null && segment.prev == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (segment.shared || (segment2 = (atomicReferenceFirstRef = INSTANCE.firstRef()).get()) == LOCK) {
            return;
        }
        int i10 = segment2 != null ? segment2.limit : 0;
        if (i10 >= MAX_SIZE) {
            return;
        }
        segment.next = segment2;
        segment.pos = 0;
        segment.limit = i10 + 8192;
        if (s0.a(atomicReferenceFirstRef, segment2, segment)) {
            return;
        }
        segment.next = null;
    }

    @d
    @m
    public static final Segment take() {
        AtomicReference<Segment> atomicReferenceFirstRef = INSTANCE.firstRef();
        Segment segment = LOCK;
        Segment andSet = atomicReferenceFirstRef.getAndSet(segment);
        if (andSet == segment) {
            return new Segment();
        }
        if (andSet == null) {
            atomicReferenceFirstRef.set(null);
            return new Segment();
        }
        atomicReferenceFirstRef.set(andSet.next);
        andSet.next = null;
        andSet.limit = 0;
        return andSet;
    }

    public final int getByteCount() {
        Segment segment = firstRef().get();
        if (segment != null) {
            return segment.limit;
        }
        return 0;
    }

    public final int getMAX_SIZE() {
        return MAX_SIZE;
    }
}
