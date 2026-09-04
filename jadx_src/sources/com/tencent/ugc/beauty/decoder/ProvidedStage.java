package com.tencent.ugc.beauty.decoder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ProvidedStage<T> extends Stage implements Provider<T> {
    protected final Queue<T> mWaitOutBuffers = new LinkedList();
    protected final Queue<T> mRecycledBuffers = new LinkedList();
    protected int mBufferOutedCount = 0;

    @Override // com.tencent.ugc.beauty.decoder.Provider
    public T dequeueOutputBuffer() {
        T tPoll;
        synchronized (this) {
            tPoll = this.mWaitOutBuffers.poll();
            if (tPoll != null) {
                this.mBufferOutedCount++;
            }
        }
        return tPoll;
    }

    public void drainOutputBuffers() {
        T tDequeueOutputBuffer = dequeueOutputBuffer();
        if (tDequeueOutputBuffer != null) {
            enqueueOutputBuffer(tDequeueOutputBuffer);
        }
    }

    @Override // com.tencent.ugc.beauty.decoder.Provider
    public void enqueueOutputBuffer(T t10) {
        synchronized (this) {
            this.mBufferOutedCount--;
            this.mRecycledBuffers.add(t10);
        }
    }

    protected boolean noBufferKeepByUs() {
        boolean z10;
        synchronized (this) {
            z10 = this.mRecycledBuffers.isEmpty() && this.mWaitOutBuffers.isEmpty() && this.mBufferOutedCount == 0;
        }
        return z10;
    }

    @Override // com.tencent.ugc.beauty.decoder.Stage
    public void processFrame() throws ProcessException {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.mRecycledBuffers);
            this.mRecycledBuffers.clear();
        }
        recycleBuffers(arrayList);
        synchronized (this) {
            if (isAllDataReady() && noBufferKeepByUs()) {
                setState(Stage.State.DONE);
            }
        }
    }

    protected abstract void recycleBuffers(List<T> list);
}
