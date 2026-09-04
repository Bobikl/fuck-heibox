package com.tencent.ugc.retriver;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.f;
import com.tencent.ugc.MediaExtractorWrapper;
import com.tencent.ugc.common.MediaExtractorBuilder;

/* JADX INFO: loaded from: classes4.dex */
public class FFmpegMediaRetriever {
    private static final String TAG = "FFmpegMediaRetriever";
    private final boolean mIsUseMediaExtractor;
    private VideoMetaData mMediaInfo;
    private String mPath;

    public FFmpegMediaRetriever() {
        this(true);
    }

    public FFmpegMediaRetriever(boolean z10) {
        this.mIsUseMediaExtractor = z10;
    }

    private VideoMetaData getMediaInfoFromMediaExtractor(String str) {
        MediaExtractorWrapper mediaExtractorWrapper = new MediaExtractorWrapper();
        if (!mediaExtractorWrapper.setDataSource(str)) {
            return null;
        }
        VideoMetaData videoMetaData = new VideoMetaData();
        videoMetaData.setWidth(mediaExtractorWrapper.getWidth());
        videoMetaData.setHeight(mediaExtractorWrapper.getHeight());
        videoMetaData.setVideoDuration(mediaExtractorWrapper.getVideoDuration());
        videoMetaData.setAudioDuration(mediaExtractorWrapper.getAudioDuration());
        videoMetaData.setFps(mediaExtractorWrapper.getVideoFrameRate());
        videoMetaData.setVideoMimeType(mediaExtractorWrapper.getVideoMimeType());
        videoMetaData.setChannels(mediaExtractorWrapper.getChannelCount());
        videoMetaData.setSampleRate(mediaExtractorWrapper.getSampleRate());
        videoMetaData.setAudioBitrate(mediaExtractorWrapper.getAudioBitrate());
        videoMetaData.setVideoBitrate(mediaExtractorWrapper.getVideoBitrate());
        mediaExtractorWrapper.release();
        return videoMetaData;
    }

    private static native VideoMetaData nativeGetMediaInfo(String str);

    public long getAudioBitrate() {
        VideoMetaData videoMetaData = this.mMediaInfo;
        if (videoMetaData != null) {
            return videoMetaData.getAudioBitrate();
        }
        return 0L;
    }

    public long getAudioDurationMs() {
        VideoMetaData videoMetaData = this.mMediaInfo;
        if (videoMetaData != null) {
            return videoMetaData.getAudioDuration() / 1000;
        }
        return 0L;
    }

    public int getChannels() {
        VideoMetaData videoMetaData = this.mMediaInfo;
        if (videoMetaData != null) {
            return videoMetaData.getChannels();
        }
        return 0;
    }

    public float getFPS() {
        VideoMetaData videoMetaData = this.mMediaInfo;
        if (videoMetaData != null) {
            return videoMetaData.getFps();
        }
        return 0.0f;
    }

    public int getRotation() {
        VideoMetaData videoMetaData = this.mMediaInfo;
        if (videoMetaData != null) {
            return videoMetaData.getRotation();
        }
        return 0;
    }

    public int getSampleRate() {
        VideoMetaData videoMetaData = this.mMediaInfo;
        if (videoMetaData != null) {
            return videoMetaData.getSampleRate();
        }
        return 0;
    }

    public long getVideoBitrate() {
        VideoMetaData videoMetaData = this.mMediaInfo;
        if (videoMetaData != null) {
            return videoMetaData.getVideoBitrate();
        }
        return 0L;
    }

    public long getVideoDurationMs() {
        VideoMetaData videoMetaData = this.mMediaInfo;
        if (videoMetaData != null) {
            return videoMetaData.getVideoDuration() / 1000;
        }
        return 0L;
    }

    public int getVideoHeight() {
        VideoMetaData videoMetaData = this.mMediaInfo;
        if (videoMetaData != null) {
            return videoMetaData.getHeight();
        }
        return 0;
    }

    public String getVideoMimeType() {
        VideoMetaData videoMetaData = this.mMediaInfo;
        if (videoMetaData != null) {
            return videoMetaData.getVideoMimeType();
        }
        return null;
    }

    public int getVideoWidth() {
        VideoMetaData videoMetaData = this.mMediaInfo;
        if (videoMetaData != null) {
            return videoMetaData.getWidth();
        }
        return 0;
    }

    public int setDataSource(String str) {
        if (str == null) {
            LiteavLog.e(TAG, "path can't be null!");
            return -1;
        }
        if (str.equals(this.mPath)) {
            return 0;
        }
        if (!MediaExtractorBuilder.isContentUri(str) && !f.a(str)) {
            LiteavLog.e(TAG, "file isn't exists!");
            return -1;
        }
        this.mPath = str;
        this.mMediaInfo = nativeGetMediaInfo(str);
        LiteavLog.i(TAG, "nativeGetMediaInfo media info = " + this.mMediaInfo);
        if (this.mMediaInfo == null && this.mIsUseMediaExtractor) {
            this.mMediaInfo = getMediaInfoFromMediaExtractor(this.mPath);
        }
        return this.mMediaInfo == null ? -1 : 0;
    }
}
