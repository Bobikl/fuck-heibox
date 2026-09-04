package com.tencent.ugc;

import com.tencent.ugc.videobase.common.EncodedVideoFrame;

/* JADX INFO: loaded from: classes4.dex */
public class VideoDemuxerSystem implements VideoDemuxer {
    MediaExtractorWrapper mMediaExtractorWrapper;

    @Override // com.tencent.ugc.VideoDemuxer
    public void close() {
        MediaExtractorWrapper mediaExtractorWrapper = this.mMediaExtractorWrapper;
        if (mediaExtractorWrapper != null) {
            mediaExtractorWrapper.release();
        }
        this.mMediaExtractorWrapper = null;
    }

    @Override // com.tencent.ugc.VideoDemuxer
    public EncodedVideoFrame getNextEncodeVideoFrame() {
        MediaExtractorWrapper mediaExtractorWrapper = this.mMediaExtractorWrapper;
        return mediaExtractorWrapper != null ? mediaExtractorWrapper.readVideoSampleData() : VideoDemuxer.END_OF_STREAM;
    }

    @Override // com.tencent.ugc.VideoDemuxer
    public boolean open(String str) {
        MediaExtractorWrapper mediaExtractorWrapper = new MediaExtractorWrapper();
        this.mMediaExtractorWrapper = mediaExtractorWrapper;
        return mediaExtractorWrapper.setDataSource(str);
    }

    @Override // com.tencent.ugc.VideoDemuxer
    public boolean seek(long j10) {
        MediaExtractorWrapper mediaExtractorWrapper = this.mMediaExtractorWrapper;
        if (mediaExtractorWrapper == null) {
            return true;
        }
        mediaExtractorWrapper.seekVideo(j10);
        return true;
    }
}
