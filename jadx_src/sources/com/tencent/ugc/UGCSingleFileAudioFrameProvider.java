package com.tencent.ugc;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::ugc")
public class UGCSingleFileAudioFrameProvider implements UGCAudioFrameProvider, UGCFrameQueue.UGCFrameQueueListener {
    private static final int DEFAULT_CHANNEL_COUNT = 2;
    private static final int DEFAULT_FRAME_DURATION = 20;
    private static final int DEFAULT_SAMPLE_RATE = 48000;
    private static final int MAX_FRAME_SIZE = 5;
    public static final String MUTE_VIRTUAL_FILE_PATH = "mute_virtual_file_path";
    private final Clip mClip;
    private AudioFrame mLastFrame;
    private long mNativeHandle;
    private final CustomHandler mWorkHandler;
    private final String TAG = "UGCAudioFileProvider_" + hashCode();
    private long mCurrentMuteFramePts = 0;
    private long mEndPlayPts = Long.MAX_VALUE;
    private long mFirstFramePtsOfAllStream = 0;
    private Long mSeekFileTime = 0L;
    private final UGCFrameQueue<List<AudioFrame>> mAudioFrameQueue = new UGCFrameQueue<>();

    public UGCSingleFileAudioFrameProvider(Clip clip, CustomHandler customHandler) {
        this.mClip = new Clip(clip);
        this.mWorkHandler = customHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void DecodeOrAppendMuteFrame() {
        if (this.mAudioFrameQueue.size() >= 5) {
            return;
        }
        long j10 = this.mNativeHandle;
        if (j10 != 0) {
            nativeDecode(j10);
        } else {
            appendOneMuteFrame(this.mCurrentMuteFramePts, 20, 48000, 2);
            this.mCurrentMuteFramePts += 20;
        }
        this.mWorkHandler.removeCallbacks(fn.a(this));
        this.mWorkHandler.post(fo.a(this));
    }

    private void appendMultipleMuteFrame(long j10, int i10, int i11, int i12) {
        if (i10 <= 0 || i11 <= 0 || i12 <= 0) {
            return;
        }
        int i13 = i10 / 20;
        for (int i14 = 0; i14 < i13; i14++) {
            appendOneMuteFrame(j10, 20, i11, i12);
            j10 += 20;
        }
        int i15 = i10 - (i13 * 20);
        if (i15 != 0) {
            appendOneMuteFrame(j10, i15, i11, i12);
        }
    }

    private void appendMuteFrameWhenDecodeFinish() {
        AudioFrame audioFrame = this.mLastFrame;
        if (audioFrame == null) {
            return;
        }
        long jCalculateAudioFrameDuration = calculateAudioFrameDuration(audioFrame) + timelineToFileTimeNoSpeed(this.mLastFrame.getTimestamp());
        if (jCalculateAudioFrameDuration >= this.mClip.endInFileTime || jCalculateAudioFrameDuration <= 0) {
            return;
        }
        appendMultipleMuteFrame(fileTimeToTimelineNoSpeed(jCalculateAudioFrameDuration), (int) (this.mClip.endInFileTime - jCalculateAudioFrameDuration), this.mLastFrame.getSampleRate(), this.mLastFrame.getChannelCount());
    }

    private void appendOneMuteFrame(long j10, int i10, int i11, int i12) {
        if (i10 <= 0 || i11 <= 0 || i12 <= 0) {
            return;
        }
        Clip clip = this.mClip;
        if (j10 >= clip.startInClipsTimeline + (clip.endInFileTime - clip.startInFileTime)) {
            putEndOfStreamFrameToQueue();
            return;
        }
        AudioFrame audioFrame = new AudioFrame();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((((i12 * 2) * i11) * i10) / 1000);
        Arrays.fill(byteBufferAllocateDirect.array(), (byte) 0);
        audioFrame.setData(byteBufferAllocateDirect);
        audioFrame.setChannelCount(i12);
        audioFrame.setSampleRate(i11);
        audioFrame.setCodecFormat(AudioFrame.AudioCodecFormat.PCM);
        audioFrame.setTimestamp(j10);
        this.mLastFrame = audioFrame;
        this.mAudioFrameQueue.queue(Collections.singletonList(audioFrame));
    }

    private long calculateAudioFrameDuration(AudioFrame audioFrame) {
        if (audioFrame != null && audioFrame.isValidFrame() && audioFrame.getCodecFormat() == AudioFrame.AudioCodecFormat.PCM) {
            return (((long) audioFrame.getData().remaining()) * 1000) / ((((long) audioFrame.getChannelCount()) * 2) * ((long) audioFrame.getSampleRate()));
        }
        return 0L;
    }

    private long fileTimeToTimelineNoSpeed(long j10) {
        Clip clip = this.mClip;
        return clip.startTimelineNoSpeed + (j10 - clip.startInFileTime);
    }

    private ByteBuffer getByteBufferFromAudioFrame(AudioFrame audioFrame) {
        return audioFrame.getData();
    }

    private float getTimeMultipleInSpeed(int i10) {
        return UGCMediaListSource.getSpeed(i10);
    }

    static /* synthetic */ void lambda$initialize$0(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
        if (uGCSingleFileAudioFrameProvider.mClip.path.equals(MUTE_VIRTUAL_FILE_PATH)) {
            uGCSingleFileAudioFrameProvider.mNativeHandle = 0L;
            return;
        }
        long jNativeCreate = nativeCreate(uGCSingleFileAudioFrameProvider);
        uGCSingleFileAudioFrameProvider.mNativeHandle = jNativeCreate;
        if (jNativeCreate == 0) {
            LiteavLog.e(uGCSingleFileAudioFrameProvider.TAG, "create native instance failed.");
        }
    }

    static /* synthetic */ void lambda$uninitialize$1(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
        long j10 = uGCSingleFileAudioFrameProvider.mNativeHandle;
        if (j10 != 0) {
            nativeClose(j10);
            nativeDestroy(uGCSingleFileAudioFrameProvider.mNativeHandle);
            uGCSingleFileAudioFrameProvider.mNativeHandle = 0L;
        }
        uGCSingleFileAudioFrameProvider.mAudioFrameQueue.clear();
    }

    private static native void nativeClose(long j10);

    private static native long nativeCreate(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider);

    private static native void nativeDecode(long j10);

    private static native void nativeDestroy(long j10);

    private static native long nativeGetDuration(long j10);

    private static native int nativeOpen(long j10, String str);

    private static native int nativeSeekTo(long j10, long j11);

    private AudioFrame obtainAudioFrame(int i10, int i11, long j10, int i12) {
        AudioFrame audioFrame = new AudioFrame();
        audioFrame.setSampleRate(i10);
        audioFrame.setChannelCount(i11);
        audioFrame.setTimestamp(j10);
        audioFrame.setCodecFormat(AudioFrame.AudioCodecFormat.PCM);
        audioFrame.setData(ByteBuffer.allocateDirect(i12));
        return audioFrame;
    }

    private void onDecodeEndOfFile() {
        LiteavLog.i(this.TAG, "onDecodeEndOfFile");
        appendMuteFrameWhenDecodeFinish();
        putEndOfStreamFrameToQueue();
    }

    private void onDecodeError(String str) {
        LiteavLog.i(this.TAG, "onDecodeError reason = ".concat(String.valueOf(str)));
        appendMuteFrameWhenDecodeFinish();
        putEndOfStreamFrameToQueue();
    }

    private void onDecodeFrame(AudioFrame audioFrame) {
        if (audioFrame == null) {
            return;
        }
        long jMin = Math.min(audioFrame.getTimestamp() - this.mFirstFramePtsOfAllStream, this.mClip.endInFileTime);
        if (jMin < this.mClip.startInFileTime) {
            return;
        }
        Long l10 = this.mSeekFileTime;
        if (l10 != null) {
            if (jMin < l10.longValue()) {
                return;
            } else {
                appendMultipleMuteFrame(fileTimeToTimelineNoSpeed(this.mSeekFileTime.longValue()), (int) (jMin - this.mSeekFileTime.longValue()), audioFrame.getSampleRate(), audioFrame.getChannelCount());
            }
        }
        this.mSeekFileTime = null;
        if (jMin >= this.mClip.endInFileTime || jMin >= this.mEndPlayPts) {
            LiteavLog.i(this.TAG, "decode frame pts is bigger than end time");
            putEndOfStreamFrameToQueue();
        } else {
            this.mLastFrame = audioFrame;
            audioFrame.setTimestamp(fileTimeToTimelineNoSpeed(jMin));
            this.mAudioFrameQueue.queue(Collections.singletonList(audioFrame));
        }
    }

    private void putEndOfStreamFrameToQueue() {
        this.mLastFrame = null;
        this.mAudioFrameQueue.queue(UGCAudioFrameProvider.END_OF_STREAM);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekToInFileTime(long j10) {
        Clip clip = this.mClip;
        this.mSeekFileTime = Long.valueOf(com.tencent.liteav.base.util.h.a(j10, clip.startInFileTime, clip.endInFileTime));
        LiteavLog.i(this.TAG, "seekTo fileTime " + this.mSeekFileTime);
        this.mCurrentMuteFramePts = fileTimeToTimelineNoSpeed(this.mSeekFileTime.longValue());
        long j11 = this.mNativeHandle;
        if (j11 != 0 && nativeSeekTo(j11, this.mSeekFileTime.longValue()) != 0) {
            LiteavLog.w(this.TAG, "nativeSeekTo fail");
        }
        this.mAudioFrameQueue.clear();
        this.mWorkHandler.runOrPost(fm.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startInternal() {
        long j10 = this.mNativeHandle;
        if (j10 != 0 && nativeOpen(j10, this.mClip.path) != 0) {
            LiteavLog.e(this.TAG, "native MusicResourceDecoderFFmpeg open failed.");
            nativeClose(this.mNativeHandle);
            nativeDestroy(this.mNativeHandle);
            this.mNativeHandle = 0L;
        }
        VideoDemuxerFFmpeg videoDemuxerFFmpeg = new VideoDemuxerFFmpeg();
        if (videoDemuxerFFmpeg.open(this.mClip.path)) {
            this.mFirstFramePtsOfAllStream = videoDemuxerFFmpeg.getFirstFramePtsOfAllStream();
        }
        videoDemuxerFFmpeg.close();
        this.mCurrentMuteFramePts = this.mClip.startInClipsTimeline;
        this.mAudioFrameQueue.setUGCFrameQueueListener(this);
        this.mAudioFrameQueue.clear();
        this.mSeekFileTime = 0L;
        long j11 = this.mClip.startInFileTime;
        if (j11 != 0) {
            seekToInFileTime(j11);
        }
        DecodeOrAppendMuteFrame();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopInternal() {
        long j10 = this.mNativeHandle;
        if (j10 != 0) {
            nativeClose(j10);
        }
        this.mAudioFrameQueue.setUGCFrameQueueListener(null);
        this.mWorkHandler.removeCallbacks(fk.a(this));
        this.mAudioFrameQueue.clear();
        putEndOfStreamFrameToQueue();
    }

    private long timelineToFileTime(long j10) {
        List<TXVideoEditConstants.TXSpeed> list = this.mClip.speedList;
        if (list == null) {
            return timelineToFileTimeNoSpeed(j10);
        }
        long j11 = 0;
        for (TXVideoEditConstants.TXSpeed tXSpeed : list) {
            float timeMultipleInSpeed = 1.0f / getTimeMultipleInSpeed(tXSpeed.speedLevel);
            long j12 = tXSpeed.endTime;
            long j13 = tXSpeed.startTime;
            long j14 = (long) ((j12 - j13) * timeMultipleInSpeed);
            j11 = ((long) (j10 / timeMultipleInSpeed)) + j13;
            if (j10 < j14) {
                break;
            }
            j10 -= j14;
        }
        return j11;
    }

    private long timelineToFileTimeNoSpeed(long j10) {
        Clip clip = this.mClip;
        return (j10 + clip.startInFileTime) - clip.startTimelineNoSpeed;
    }

    @Override // com.tencent.ugc.UGCAudioFrameProvider
    public UGCFrameQueue<List<AudioFrame>> getFrameQueue() {
        return this.mAudioFrameQueue;
    }

    @Override // com.tencent.ugc.UGCAudioFrameProvider
    public void initialize() {
        LiteavLog.i(this.TAG, "initialize");
        this.mWorkHandler.runOrPost(ff.a(this));
    }

    @Override // com.tencent.ugc.UGCFrameQueue.UGCFrameQueueListener
    public void onFrameDequeued() {
        this.mWorkHandler.runOrPost(fg.a(this));
    }

    @Override // com.tencent.ugc.UGCAudioFrameProvider
    public void seekTo(long j10) {
        this.mWorkHandler.runAndWaitDone(fl.a(this, j10), 1000L);
    }

    @Override // com.tencent.ugc.UGCAudioFrameProvider
    public void setPlayEndPts(long j10) {
        this.mEndPlayPts = j10;
    }

    @Override // com.tencent.ugc.UGCAudioFrameProvider
    public void start() {
        this.mWorkHandler.runOrPost(fi.a(this));
    }

    @Override // com.tencent.ugc.UGCAudioFrameProvider
    public void stop() {
        this.mWorkHandler.runOrPost(fj.a(this));
    }

    @Override // com.tencent.ugc.UGCAudioFrameProvider
    public void uninitialize() {
        this.mWorkHandler.runOrPost(fh.a(this));
    }
}
