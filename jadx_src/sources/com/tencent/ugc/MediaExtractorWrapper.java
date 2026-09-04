package com.tencent.ugc;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.tencent.liteav.base.Log;
import com.tencent.ugc.common.MediaExtractorBuilder;
import com.tencent.ugc.videobase.common.EncodedVideoFrame;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class MediaExtractorWrapper {
    private static final int INIT_SAMPLE_SIZE = 1048576;
    private static final int MAX_SAMPLE_SIZE = 10485760;
    private static final String TAG = "MediaExtractorWrapper";
    private MediaExtractor mAudioExtractor;
    private MediaFormat mAudioFormat;
    private boolean mIsReachEOF = false;
    private ByteBuffer mVideoBuffer;
    private MediaExtractor mVideoExtractor;
    private MediaFormat mVideoFormat;

    private int getIntegerFormatValue(MediaFormat mediaFormat, String str) {
        if (mediaFormat == null) {
            return 0;
        }
        try {
            return mediaFormat.getInteger(str);
        } catch (Exception e10) {
            Log.e(TAG, "getFormatValue key = " + str + " Exception e = " + e10, new Object[0]);
            return 0;
        }
    }

    private long getLongFormatValue(MediaFormat mediaFormat, String str) {
        if (mediaFormat == null) {
            return 0L;
        }
        try {
            return mediaFormat.getLong(str);
        } catch (Exception e10) {
            Log.e(TAG, "getFormatValue key = " + str + " Exception e = " + e10, new Object[0]);
            return 0L;
        }
    }

    private String getStringFormatValue(MediaFormat mediaFormat, String str) {
        if (mediaFormat == null) {
            return null;
        }
        try {
            return mediaFormat.getString(str);
        } catch (Exception e10) {
            Log.e(TAG, "getFormatValue key = " + str + " Exception e = " + e10, new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0050  */
    private ByteBuffer readData(MediaExtractor mediaExtractor) {
        if (this.mVideoBuffer == null) {
            this.mVideoBuffer = ByteBuffer.allocateDirect(1048576);
        }
        int sampleData = 0;
        while (sampleData == 0) {
            try {
                sampleData = mediaExtractor.readSampleData(this.mVideoBuffer, 0);
            } catch (IllegalArgumentException unused) {
                if (this.mVideoBuffer.capacity() > 10485760) {
                    if (sampleData == 0) {
                        return null;
                    }
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sampleData);
                    byteBufferAllocateDirect.put(this.mVideoBuffer);
                    byteBufferAllocateDirect.position(0);
                    this.mVideoBuffer.position(0);
                    return byteBufferAllocateDirect;
                }
                this.mVideoBuffer = ByteBuffer.allocateDirect(this.mVideoBuffer.capacity() * 2);
                Log.e(TAG, "resize sample buffer size to " + this.mVideoBuffer.capacity(), new Object[0]);
            }
        }
        if (sampleData == 0) {
            return null;
        }
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(sampleData);
        byteBufferAllocateDirect2.put(this.mVideoBuffer);
        byteBufferAllocateDirect2.position(0);
        this.mVideoBuffer.position(0);
        return byteBufferAllocateDirect2;
    }

    private static MediaFormat selectFormat(MediaExtractor mediaExtractor, String str) {
        if (mediaExtractor == null) {
            return null;
        }
        for (int i10 = 0; i10 < mediaExtractor.getTrackCount(); i10++) {
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(i10);
            String string = trackFormat.getString(org.apache.tools.ant.taskdefs.email.b.I);
            if (string != null && string.startsWith(str)) {
                Log.i(TAG, "selectFormat ".concat(String.valueOf(trackFormat)), new Object[0]);
                mediaExtractor.selectTrack(i10);
                return trackFormat;
            }
        }
        return null;
    }

    public int getAudioBitrate() {
        return getIntegerFormatValue(this.mAudioFormat, "bitrate");
    }

    public long getAudioDuration() {
        return getLongFormatValue(this.mAudioFormat, "durationUs");
    }

    public int getChannelCount() {
        return getIntegerFormatValue(this.mAudioFormat, "channel-count");
    }

    public int getHeight() {
        return getIntegerFormatValue(this.mVideoFormat, "height");
    }

    public int getSampleRate() {
        return getIntegerFormatValue(this.mAudioFormat, "sample-rate");
    }

    public int getVideoBitrate() {
        return getIntegerFormatValue(this.mVideoFormat, "bitrate");
    }

    public long getVideoDuration() {
        return getLongFormatValue(this.mVideoFormat, "durationUs");
    }

    public int getVideoFrameRate() {
        try {
            try {
                MediaFormat mediaFormat = this.mVideoFormat;
                if (mediaFormat == null) {
                    return 20;
                }
                return mediaFormat.getInteger("frame-rate");
            } catch (NullPointerException unused) {
                return this.mVideoFormat.getInteger("video-framerate");
            }
        } catch (NullPointerException unused2) {
            return 20;
        }
        return 20;
    }

    public String getVideoMimeType() {
        return getStringFormatValue(this.mVideoFormat, org.apache.tools.ant.taskdefs.email.b.I);
    }

    public int getWidth() {
        return getIntegerFormatValue(this.mVideoFormat, "width");
    }

    public EncodedVideoFrame readVideoSampleData() {
        MediaExtractor mediaExtractor = this.mVideoExtractor;
        if (mediaExtractor == null) {
            Log.v(TAG, "readVideoSampleData mVideoExtractor is null", new Object[0]);
            return VideoDemuxer.END_OF_STREAM;
        }
        long sampleTime = mediaExtractor.getSampleTime();
        if (sampleTime == -1 || this.mIsReachEOF) {
            Log.i(TAG, "readVideoSampleData end", new Object[0]);
            return VideoDemuxer.END_OF_STREAM;
        }
        EncodedVideoFrame encodedVideoFrame = new EncodedVideoFrame();
        try {
            encodedVideoFrame.data = readData(this.mVideoExtractor);
            encodedVideoFrame.nalType = com.tencent.liteav.videobase.common.c.UNKNOWN;
            if ((this.mVideoExtractor.getSampleFlags() & 1) != 0) {
                encodedVideoFrame.nalType = com.tencent.liteav.videobase.common.c.IDR;
                encodedVideoFrame.videoFormat = this.mVideoFormat;
            }
            encodedVideoFrame.pts = sampleTime / 1000;
            encodedVideoFrame.width = getWidth();
            encodedVideoFrame.height = getHeight();
            this.mIsReachEOF = !this.mVideoExtractor.advance();
            return encodedVideoFrame;
        } catch (Exception e10) {
            Log.w(TAG, "read sample data failed.", e10);
            this.mIsReachEOF = true;
            return VideoDemuxer.END_OF_STREAM;
        }
    }

    public void release() {
        Log.i(TAG, "release", new Object[0]);
        MediaExtractor mediaExtractor = this.mVideoExtractor;
        if (mediaExtractor != null) {
            mediaExtractor.release();
            this.mVideoExtractor = null;
        }
        MediaExtractor mediaExtractor2 = this.mAudioExtractor;
        if (mediaExtractor2 != null) {
            mediaExtractor2.release();
            this.mAudioExtractor = null;
        }
    }

    public void seekVideo(long j10) {
        if (this.mVideoExtractor != null) {
            Log.i(TAG, "seekVideo time = ".concat(String.valueOf(j10)), new Object[0]);
            this.mVideoExtractor.seekTo(j10, 0);
        }
    }

    public boolean setDataSource(String str) {
        Log.i(TAG, " setDataSource path: ".concat(String.valueOf(str)), new Object[0]);
        MediaExtractor mediaExtractor = this.mVideoExtractor;
        if (mediaExtractor != null) {
            mediaExtractor.release();
        }
        MediaExtractor mediaExtractor2 = this.mAudioExtractor;
        if (mediaExtractor2 != null) {
            mediaExtractor2.release();
        }
        this.mVideoExtractor = new MediaExtractorBuilder().setPath(str).build();
        this.mAudioExtractor = new MediaExtractorBuilder().setPath(str).build();
        this.mVideoFormat = selectFormat(this.mVideoExtractor, "video");
        MediaFormat mediaFormatSelectFormat = selectFormat(this.mAudioExtractor, "audio");
        this.mAudioFormat = mediaFormatSelectFormat;
        return (this.mVideoFormat == null && mediaFormatSelectFormat == null) ? false : true;
    }
}
