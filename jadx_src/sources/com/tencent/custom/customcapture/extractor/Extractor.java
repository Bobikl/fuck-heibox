package com.tencent.custom.customcapture.extractor;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.util.Log;
import com.tencent.custom.customcapture.exceptions.SetupException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Locale;
import org.apache.tools.ant.taskdefs.email.b;

/* JADX INFO: loaded from: classes4.dex */
public class Extractor {
    private static final String TAG = "Extractor";
    private final ExtractorAdvancer mAdvancer;
    private final String mFileName;
    private final boolean mIsVideo;
    private MediaExtractor mMediaExtractor;
    private MediaFormat mMediaFormat;
    private int mTrackIndex;

    public Extractor(boolean z10, String str, ExtractorAdvancer extractorAdvancer) {
        this.mIsVideo = z10;
        this.mAdvancer = extractorAdvancer;
        this.mFileName = str;
    }

    private void initMediaExtractor() throws SetupException {
        releaseMediaExtractor();
        try {
            MediaExtractor mediaExtractor = new MediaExtractor();
            this.mMediaExtractor = mediaExtractor;
            mediaExtractor.setDataSource(this.mFileName);
            int iSelectTrack = selectTrack(this.mMediaExtractor);
            this.mTrackIndex = iSelectTrack;
            if (iSelectTrack < 0) {
                throw new SetupException("No wanted track found");
            }
            this.mMediaExtractor.selectTrack(iSelectTrack);
            this.mMediaFormat = this.mMediaExtractor.getTrackFormat(this.mTrackIndex);
        } catch (IOException e10) {
            throw new SetupException("updateExtractor extractor failed.", e10);
        }
    }

    private boolean isWantedMime(String str) {
        return str.startsWith(this.mIsVideo ? "video/" : "audio/");
    }

    private void releaseMediaExtractor() {
        MediaExtractor mediaExtractor = this.mMediaExtractor;
        if (mediaExtractor != null) {
            mediaExtractor.release();
            this.mMediaExtractor = null;
        }
    }

    private int selectTrack(MediaExtractor mediaExtractor) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i10 = 0; i10 < trackCount; i10++) {
            if (isWantedMime(mediaExtractor.getTrackFormat(i10).getString(b.I))) {
                return i10;
            }
        }
        return -1;
    }

    public MediaFormat getMediaFormat() {
        return this.mMediaFormat;
    }

    public int getTraceIndex() {
        return this.mTrackIndex;
    }

    public MediaCodec.BufferInfo readSampleData(ByteBuffer byteBuffer) {
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        this.mAdvancer.readSampleData(bufferInfo, byteBuffer, 0);
        if (bufferInfo.size < 0) {
            bufferInfo.size = 0;
            bufferInfo.flags |= 4;
            Locale locale = Locale.ENGLISH;
            Object[] objArr = new Object[1];
            objArr[0] = this.mIsVideo ? "video" : "audio";
            Log.i(TAG, String.format(locale, "[%s] meet end of stream", objArr));
        }
        this.mAdvancer.advance();
        return bufferInfo;
    }

    public void release() {
        releaseMediaExtractor();
    }

    public void restart() throws SetupException {
        releaseMediaExtractor();
        initMediaExtractor();
        this.mAdvancer.updateExtractor(this.mMediaExtractor);
    }

    public void seekTo(long j10, boolean z10) {
        this.mAdvancer.seekTo(j10, z10);
    }

    public void setup() throws SetupException {
        initMediaExtractor();
        this.mAdvancer.updateExtractor(this.mMediaExtractor);
    }
}
