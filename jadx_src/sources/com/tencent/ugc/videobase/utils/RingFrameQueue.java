package com.tencent.ugc.videobase.utils;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.videobase.frame.PixelFrame;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public class RingFrameQueue implements PixelFrameQueue {
    private static final String TAG = "RingFrameQueue";
    private int mCapability;
    private final Deque<PixelFrame> mPixelFrameList = new LinkedList();

    public RingFrameQueue(int i10) {
        this.mCapability = i10;
    }

    @Override // com.tencent.ugc.videobase.utils.PixelFrameQueue
    public void evictAll() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.mPixelFrameList);
            this.mPixelFrameList.clear();
        }
        LiteavLog.i(TAG, "evictAll pixelFrame.");
        PixelFrame.releasePixelFrames(arrayList);
    }

    @Override // com.tencent.ugc.videobase.utils.PixelFrameQueue
    public PixelFrame peek() {
        PixelFrame pixelFramePeek;
        synchronized (this) {
            pixelFramePeek = this.mPixelFrameList.peek();
        }
        return pixelFramePeek;
    }

    @Override // com.tencent.ugc.videobase.utils.PixelFrameQueue
    public PixelFrame poll() {
        PixelFrame pixelFramePollFirst;
        synchronized (this) {
            pixelFramePollFirst = this.mPixelFrameList.pollFirst();
        }
        return pixelFramePollFirst;
    }

    @Override // com.tencent.ugc.videobase.utils.PixelFrameQueue
    public void push(PixelFrame pixelFrame) {
        PixelFrame pixelFrameRemoveFirst;
        pixelFrame.retain();
        synchronized (this) {
            pixelFrameRemoveFirst = this.mPixelFrameList.size() >= this.mCapability ? this.mPixelFrameList.removeFirst() : null;
            this.mPixelFrameList.addLast(pixelFrame);
        }
        if (pixelFrameRemoveFirst != null) {
            pixelFrameRemoveFirst.release();
        }
    }

    @Override // com.tencent.ugc.videobase.utils.PixelFrameQueue
    public boolean remove(PixelFrame pixelFrame) {
        boolean zRemoveFirstOccurrence;
        if (pixelFrame == null) {
            return false;
        }
        synchronized (this) {
            zRemoveFirstOccurrence = this.mPixelFrameList.size() > 0 ? this.mPixelFrameList.removeFirstOccurrence(pixelFrame) : false;
        }
        if (zRemoveFirstOccurrence) {
            pixelFrame.release();
        }
        return zRemoveFirstOccurrence;
    }

    @Override // com.tencent.ugc.videobase.utils.PixelFrameQueue
    public int size() {
        int size;
        synchronized (this) {
            size = this.mPixelFrameList.size();
        }
        return size;
    }
}
