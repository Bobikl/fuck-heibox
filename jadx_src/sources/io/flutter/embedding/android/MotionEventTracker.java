package io.flutter.embedding.android;

import android.util.LongSparseArray;
import android.view.MotionEvent;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class MotionEventTracker {
    private static MotionEventTracker INSTANCE = null;
    private static final String TAG = "MotionEventTracker";
    private final LongSparseArray<MotionEvent> eventById = new LongSparseArray<>();
    private final PriorityQueue<Long> unusedEvents = new PriorityQueue<>();

    public static class MotionEventId {
        private static final AtomicLong ID_COUNTER = new AtomicLong(0);

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final long f119408id;

        private MotionEventId(long j10) {
            this.f119408id = j10;
        }

        @n0
        public static MotionEventId createUnique() {
            return from(ID_COUNTER.incrementAndGet());
        }

        @n0
        public static MotionEventId from(long j10) {
            return new MotionEventId(j10);
        }

        public long getId() {
            return this.f119408id;
        }
    }

    private MotionEventTracker() {
    }

    @n0
    public static MotionEventTracker getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MotionEventTracker();
        }
        return INSTANCE;
    }

    @p0
    public MotionEvent pop(@n0 MotionEventId motionEventId) {
        while (!this.unusedEvents.isEmpty() && this.unusedEvents.peek().longValue() < motionEventId.f119408id) {
            this.eventById.remove(this.unusedEvents.poll().longValue());
        }
        if (!this.unusedEvents.isEmpty() && this.unusedEvents.peek().longValue() == motionEventId.f119408id) {
            this.unusedEvents.poll();
        }
        MotionEvent motionEvent = this.eventById.get(motionEventId.f119408id);
        this.eventById.remove(motionEventId.f119408id);
        return motionEvent;
    }

    @n0
    public MotionEventId track(@n0 MotionEvent motionEvent) {
        MotionEventId motionEventIdCreateUnique = MotionEventId.createUnique();
        this.eventById.put(motionEventIdCreateUnique.f119408id, MotionEvent.obtain(motionEvent));
        this.unusedEvents.add(Long.valueOf(motionEventIdCreateUnique.f119408id));
        return motionEventIdCreateUnique;
    }
}
