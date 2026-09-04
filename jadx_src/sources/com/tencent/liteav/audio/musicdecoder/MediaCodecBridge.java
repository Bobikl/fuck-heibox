package com.tencent.liteav.audio.musicdecoder;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.text.TextUtils;
import android.view.Surface;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import org.apache.tools.ant.taskdefs.email.b;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::audio")
public class MediaCodecBridge {
    private static final String TAG = "MediaCodecBridge";
    private static final long TIMEOUT_MS = 400;
    private boolean mDecodeEOS;
    private MediaFormat mFormat;
    private long mLongestDurationUs;
    private MediaCodec mMediaCodec;
    private MediaExtractor mMediaExtractor;
    private String mMime;
    private int mRawDataSize;
    private int mTrackCount;
    private int mTrackIndex;

    private ByteBuffer dequeueOutputBuffer() {
        if (this.mDecodeEOS) {
            return null;
        }
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int iDequeueOutputBuffer = this.mMediaCodec.dequeueOutputBuffer(bufferInfo, TimeUnit.MILLISECONDS.toMicros(TIMEOUT_MS));
            if (iDequeueOutputBuffer == -1) {
                return null;
            }
            if (iDequeueOutputBuffer == -3) {
                Log.i(TAG, "codec output buffers changed.", new Object[0]);
                return null;
            }
            if (iDequeueOutputBuffer == -2) {
                this.mFormat = this.mMediaCodec.getOutputFormat();
                Log.i(TAG, "codec output format changed: " + this.mFormat, new Object[0]);
                return null;
            }
            if (iDequeueOutputBuffer < 0) {
                Log.e(TAG, "unexpected result from dequeueOutputBuffer: ".concat(String.valueOf(iDequeueOutputBuffer)), new Object[0]);
                return null;
            }
            if ((bufferInfo.flags & 4) != 0) {
                Log.i(TAG, "Decode to EOS", new Object[0]);
                this.mDecodeEOS = true;
                return null;
            }
            ByteBuffer outputBuffer = LiteavSystemInfo.getSystemOSVersionInt() >= 21 ? this.mMediaCodec.getOutputBuffer(iDequeueOutputBuffer) : this.mMediaCodec.getOutputBuffers()[iDequeueOutputBuffer];
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
            byteBufferAllocateDirect.put(outputBuffer);
            this.mMediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
            return byteBufferAllocateDirect;
        } catch (Throwable th2) {
            Log.e(TAG, "Failed to dequeue output buffer", th2);
            return null;
        }
    }

    private ByteBuffer drainData() {
        for (int i10 = 0; i10 < 3; i10++) {
            ByteBuffer byteBufferDequeueOutputBuffer = dequeueOutputBuffer();
            if (byteBufferDequeueOutputBuffer != null) {
                return byteBufferDequeueOutputBuffer;
            }
        }
        return null;
    }

    private long getDuration(MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            return -1L;
        }
        try {
            return mediaFormat.getLong("durationUs");
        } catch (Throwable th2) {
            Log.e(TAG, "getDuration failed. ".concat(String.valueOf(th2)), new Object[0]);
            return -1L;
        }
    }

    private boolean initMediaCodec() {
        if (!TextUtils.isEmpty(this.mMime) && this.mFormat != null) {
            try {
                MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(this.mMime);
                this.mMediaCodec = mediaCodecCreateDecoderByType;
                mediaCodecCreateDecoderByType.configure(this.mFormat, (Surface) null, (MediaCrypto) null, 0);
                return true;
            } catch (Throwable th2) {
                th2.printStackTrace();
                this.mMediaCodec = null;
            }
        }
        return false;
    }

    private boolean initMediaExtractor(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.mDecodeEOS = false;
        try {
            MediaExtractor mediaExtractor = new MediaExtractor();
            this.mMediaExtractor = mediaExtractor;
            mediaExtractor.setDataSource(str);
            this.mTrackCount = this.mMediaExtractor.getTrackCount();
            for (int i10 = 0; i10 < this.mTrackCount; i10++) {
                MediaFormat trackFormat = this.mMediaExtractor.getTrackFormat(i10);
                String string = trackFormat.getString(b.I);
                if (!TextUtils.isEmpty(string) && string.startsWith("audio/")) {
                    long duration = getDuration(trackFormat);
                    if (this.mLongestDurationUs < duration) {
                        this.mLongestDurationUs = duration;
                    }
                }
            }
            int i11 = this.mTrackIndex;
            if (i11 != 0) {
                return selectTrack(i11);
            }
            for (int i12 = 0; i12 < this.mTrackCount; i12++) {
                if (selectTrack(i12)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            Log.e(TAG, "initMediaExtractor: ", th2);
            this.mMediaExtractor = null;
            this.mFormat = null;
            this.mMime = null;
            return false;
        }
    }

    private boolean selectTrack(int i10) {
        MediaFormat trackFormat = this.mMediaExtractor.getTrackFormat(i10);
        String string = trackFormat.getString(b.I);
        if (TextUtils.isEmpty(string) || !string.startsWith("audio/")) {
            return false;
        }
        this.mMediaExtractor.selectTrack(i10);
        this.mTrackIndex = i10;
        this.mFormat = trackFormat;
        this.mMime = string;
        return true;
    }

    public long getLongestDuration() {
        return this.mLongestDurationUs;
    }

    public MediaFormat getOutputFormat() {
        return this.mFormat;
    }

    public int getTotalRawDataSize() {
        return this.mRawDataSize;
    }

    public int getTrackCount() {
        return this.mTrackCount;
    }

    public boolean initAndStart(String str) {
        if (this.mMediaCodec != null || !initMediaExtractor(str) || !initMediaCodec()) {
            return false;
        }
        try {
            this.mMediaCodec.start();
            return true;
        } catch (Throwable th2) {
            Log.e(TAG, "Cannot start the audio codec", th2);
            return false;
        }
    }

    public boolean isDecodeEnd() {
        return this.mDecodeEOS;
    }

    public ByteBuffer processFrame() {
        int iDequeueInputBuffer;
        MediaCodec mediaCodec = this.mMediaCodec;
        if (mediaCodec == null || (iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(TIMEOUT_MS)) < 0) {
            return null;
        }
        ByteBuffer byteBuffer = this.mMediaCodec.getInputBuffers()[iDequeueInputBuffer];
        int sampleData = byteBuffer != null ? this.mMediaExtractor.readSampleData(byteBuffer, 0) : -1;
        if (sampleData <= 0) {
            this.mMediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
        } else {
            this.mRawDataSize += sampleData;
            this.mMediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, sampleData, this.mMediaExtractor.getSampleTime(), 0);
            this.mMediaExtractor.advance();
        }
        return drainData();
    }

    public boolean seekTo(long j10) {
        MediaExtractor mediaExtractor;
        if (this.mMediaCodec == null || (mediaExtractor = this.mMediaExtractor) == null || j10 > this.mLongestDurationUs) {
            return false;
        }
        mediaExtractor.seekTo(j10, 2);
        return true;
    }

    public void setMusicTrack(int i10) {
        int i11 = this.mTrackIndex;
        if (i11 == i10) {
            return;
        }
        this.mMediaExtractor.unselectTrack(i11);
        if (selectTrack(i10)) {
            MediaCodec mediaCodec = this.mMediaCodec;
            if (mediaCodec != null) {
                mediaCodec.stop();
                this.mMediaCodec.release();
                this.mMediaCodec = null;
            }
            if (initMediaCodec()) {
                try {
                    this.mMediaCodec.start();
                } catch (Throwable th2) {
                    Log.e(TAG, "Cannot start the audio codec", th2);
                }
            }
        }
    }

    public void stop() {
        MediaExtractor mediaExtractor = this.mMediaExtractor;
        if (mediaExtractor != null) {
            mediaExtractor.release();
            this.mMediaExtractor = null;
        }
        MediaCodec mediaCodec = this.mMediaCodec;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.mMediaCodec.release();
            this.mMediaCodec = null;
        }
        this.mDecodeEOS = false;
    }
}
