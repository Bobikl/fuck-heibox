package com.tencent.custom.customcapture.extractor;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.util.Log;
import androidx.annotation.n0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class RangeExtractorAdvancer extends ExtractorAdvancer {
    private static final String TAG = "RangeExtractorAdvancer";
    private long mFirstFrameTime;
    private int mLoopCount;
    protected long mRangeEndUs;

    public RangeExtractorAdvancer() {
        this(-1L);
    }

    public RangeExtractorAdvancer(long j10) {
        this.mLoopCount = -1;
        this.mRangeEndUs = j10;
    }

    @Override // com.tencent.custom.customcapture.extractor.ExtractorAdvancer
    public boolean advance() {
        return isInRange() && this.mMediaExtractor.advance();
    }

    @Override // com.tencent.custom.customcapture.extractor.ExtractorAdvancer
    public long getSampleTime() {
        return this.mMediaExtractor.getSampleTime();
    }

    protected boolean isInRange() {
        long sampleTime = this.mMediaExtractor.getSampleTime();
        if (0 <= sampleTime) {
            long j10 = this.mRangeEndUs;
            if (j10 == -1 || sampleTime <= j10) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.custom.customcapture.extractor.ExtractorAdvancer
    public void readSampleData(MediaCodec.BufferInfo bufferInfo, @n0 ByteBuffer byteBuffer, int i10) {
        if (!isInRange()) {
            bufferInfo.size = -1;
            return;
        }
        if (this.mMediaExtractor.getSampleTime() == this.mFirstFrameTime) {
            this.mLoopCount++;
        }
        bufferInfo.size = this.mMediaExtractor.readSampleData(byteBuffer, i10);
        bufferInfo.flags = this.mMediaExtractor.getSampleFlags();
        bufferInfo.presentationTimeUs = (((long) this.mLoopCount) * this.mRangeEndUs) + this.mMediaExtractor.getSampleTime();
        bufferInfo.offset = i10;
    }

    @Override // com.tencent.custom.customcapture.extractor.ExtractorAdvancer
    public void seekTo(long j10, boolean z10) {
        this.mMediaExtractor.seekTo(j10, 0);
        Log.i(TAG, "seekTo timeUs: " + j10 + ", isRelativeTime: " + z10);
    }

    @Override // com.tencent.custom.customcapture.extractor.ExtractorAdvancer
    public void updateExtractor(MediaExtractor mediaExtractor) {
        super.updateExtractor(mediaExtractor);
        this.mFirstFrameTime = this.mMediaExtractor.getSampleTime();
        Log.i(TAG, "first frame time: " + this.mFirstFrameTime);
        this.mMediaExtractor.seekTo(this.mFirstFrameTime, 0);
    }
}
