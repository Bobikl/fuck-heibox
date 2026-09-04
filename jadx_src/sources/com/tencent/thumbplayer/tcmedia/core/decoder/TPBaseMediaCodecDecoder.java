package com.tencent.thumbplayer.tcmedia.core.decoder;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.google.android.exoplayer2.util.y;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecUtils;
import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLog;
import com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo;
import com.tencent.thumbplayer.tcmedia.g.a;
import com.tencent.thumbplayer.tcmedia.g.b;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TPBaseMediaCodecDecoder implements ITPMediaCodecDecoder {
    private static final int DUMP_BYTE_BUFFER_BYTES = 100;
    private static final int DUMP_ONE_LINE_BYTES = 20;
    private static final int MEDIA_CODEC_ERROR_INDEX = -1000;
    private static long MEDIA_CODEC_INPUT_TIMEOUT_US = 2000;
    private static long MEDIA_CODEC_OUTPUT_TIMEOUT_US = 2000;
    private static final int MSG_FLUSH = 1002;
    private static final int MSG_RELEASE = 1003;
    private static final int MSG_RELEASE_OUTPUT_BUFFER = 1000;
    private static final int MSG_SET_OUTPUT_SURFACE = 1001;
    private static boolean sTMediaCodecInited = false;
    protected int mCodecId;
    private b mCodec = null;
    protected Surface mSurface = null;
    protected boolean mStarted = false;
    private TPFrameInfo mFrameInfo = new TPFrameInfo();
    private boolean mEnableSetOutputSurfaceApi = false;
    private MediaCodec.CryptoInfo mCryptoInfo = null;
    protected MediaCrypto mMediaCrypto = null;
    protected boolean mEnableAsyncMode = false;
    private HandlerThread mDecodeThread = null;
    private AsyncDecodeHandler mDecoderHandler = null;
    private BlockingQueue<Integer> mInputQueue = new LinkedBlockingQueue();
    private BlockingQueue<TPFrameInfo> mOutputQueue = new LinkedBlockingQueue();
    private boolean mRestartCodecOnException = false;
    protected int mDrmType = -1;
    private boolean mEnableAudioPassThrough = false;
    protected boolean mEnableMediaCodecReuse = false;
    private final Object mThreadLock = new Object();
    private int mHandlerResult = 0;

    public class AsyncDecodeHandler extends Handler {
        AsyncDecodeHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            synchronized (TPBaseMediaCodecDecoder.this.mThreadLock) {
                int iOnReleaseOutputBuffer = 0;
                switch (message.what) {
                    case 1000:
                        iOnReleaseOutputBuffer = TPBaseMediaCodecDecoder.this.onReleaseOutputBuffer(message.arg1, message.arg2 == 1);
                        break;
                    case 1001:
                        iOnReleaseOutputBuffer = TPBaseMediaCodecDecoder.this.onSetOutputSurface((Surface) message.obj);
                        break;
                    case 1002:
                        iOnReleaseOutputBuffer = TPBaseMediaCodecDecoder.this.onFlush();
                        break;
                    case 1003:
                        iOnReleaseOutputBuffer = TPBaseMediaCodecDecoder.this.onRelease();
                        break;
                }
                TPBaseMediaCodecDecoder.this.handleMessageComplete(iOnReleaseOutputBuffer);
            }
        }
    }

    public class BufferCallback extends b.a {
        private BufferCallback() {
        }

        @Override // com.tencent.thumbplayer.tcmedia.g.b.a
        public void onError(b bVar, MediaCodec.CodecException codecException) {
            TPNativeLog.printLog(4, TPBaseMediaCodecDecoder.this.getLogTag(), "onError: " + TPBaseMediaCodecDecoder.this.getStackTrace(codecException));
            TPBaseMediaCodecDecoder.this.handleRelease();
        }

        @Override // com.tencent.thumbplayer.tcmedia.g.b.a
        public void onInputBufferAvailable(b bVar, int i10) {
            try {
                TPBaseMediaCodecDecoder.this.mInputQueue.put(Integer.valueOf(i10));
            } catch (Exception e10) {
                TPNativeLog.printLog(3, TPBaseMediaCodecDecoder.this.getLogTag(), TPBaseMediaCodecDecoder.this.getStackTrace(e10));
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.g.b.a
        public void onOutputBufferAvailable(b bVar, int i10, MediaCodec.BufferInfo bufferInfo) {
            try {
                TPFrameInfo tPFrameInfo = new TPFrameInfo();
                tPFrameInfo.errCode = 0;
                tPFrameInfo.bufferIndex = i10;
                tPFrameInfo.ptsUs = bufferInfo.presentationTimeUs;
                TPBaseMediaCodecDecoder.this.processOutputBuffer(bVar, i10, bufferInfo, tPFrameInfo);
                TPBaseMediaCodecDecoder.this.mOutputQueue.put(tPFrameInfo);
            } catch (Exception e10) {
                TPNativeLog.printLog(3, TPBaseMediaCodecDecoder.this.getLogTag(), TPBaseMediaCodecDecoder.this.getStackTrace(e10));
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.g.b.a
        public void onOutputFormatChanged(b bVar, MediaFormat mediaFormat) {
            TPBaseMediaCodecDecoder.this.processOutputFormatChanged(mediaFormat);
        }
    }

    public TPBaseMediaCodecDecoder(int i10) {
        this.mCodecId = i10;
        initTMediaCodec();
    }

    private void bufferSizeCheck(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() < bArr.length) {
            TPNativeLog.printLog(4, getLogTag(), "decodeAsync, not enough space, byteBuffer.remaining:" + byteBuffer.remaining() + ", buffer size:" + bArr.length);
            try {
                dumpByteArray(bArr, 0, 100, 20);
            } catch (Exception e10) {
                TPNativeLog.printLog(4, getLogTag(), e10.toString());
            }
        }
    }

    private int decodeAsync(byte[] bArr, boolean z10, long j10, boolean z11) {
        Integer numPoll = this.mInputQueue.poll();
        if (numPoll == null) {
            return 1;
        }
        try {
            ByteBuffer byteBufferC = this.mCodec.c(numPoll.intValue());
            if (byteBufferC != null) {
                bufferSizeCheck(byteBufferC, bArr);
                byteBufferC.put(bArr);
            }
            if (!z11 || this.mCryptoInfo == null) {
                this.mCodec.a(numPoll.intValue(), 0, bArr.length, j10, z10 ? 1 : 0);
            } else {
                this.mCodec.a(numPoll.intValue(), 0, this.mCryptoInfo, j10, z10 ? 1 : 0);
            }
            return 0;
        } catch (Exception e10) {
            return onMediaCodecException(e10);
        }
    }

    private TPFrameInfo dequeueOutputBufferAsync() {
        this.mFrameInfo.errCode = 1;
        TPFrameInfo tPFrameInfoPoll = this.mOutputQueue.poll();
        return tPFrameInfoPoll == null ? this.mFrameInfo : tPFrameInfoPoll;
    }

    private void dumpByteArray(byte[] bArr, int i10, int i11, int i12) {
        if (bArr == null || i10 < 0 || i11 <= 0 || i10 >= bArr.length || i10 >= i11 || i12 <= 0) {
            throw new IllegalArgumentException();
        }
        if (bArr.length <= i11) {
            i11 = bArr.length;
        }
        int iMin = Math.min(i11 - i10, 100) + i10;
        StringBuilder sb2 = new StringBuilder();
        TPNativeLog.printLog(2, getLogTag(), "dumpByteArray begin:");
        int i13 = 0;
        while (i10 < iMin) {
            String hexString = Integer.toHexString(bArr[i10] & 255);
            if (hexString.length() == 1) {
                hexString = "0".concat(hexString);
            }
            sb2.append(hexString.toUpperCase());
            i13++;
            if (i13 % i12 == 0) {
                TPNativeLog.printLog(2, getLogTag(), sb2.toString());
                sb2.setLength(0);
            } else {
                sb2.append(" ");
            }
            i10++;
        }
        TPNativeLog.printLog(2, getLogTag(), "dumpByteArray end.");
    }

    private void exitDecodeThread() {
        HandlerThread handlerThread = this.mDecodeThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            try {
                this.mDecodeThread.join();
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
        }
    }

    private int flushAsync() {
        TPNativeLog.printLog(2, getLogTag(), "flushAsync: ");
        Message messageObtainMessage = this.mDecoderHandler.obtainMessage();
        messageObtainMessage.what = 1002;
        return waitingForHandleMessage(messageObtainMessage);
    }

    private int handleFlush() {
        TPNativeLog.printLog(2, getLogTag(), "handleFlush: ");
        b bVar = this.mCodec;
        if (bVar == null) {
            return 104;
        }
        try {
            bVar.h();
            return 0;
        } catch (Exception e10) {
            return onMediaCodecException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleMessageComplete(int i10) {
        this.mHandlerResult = i10;
        this.mThreadLock.notify();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int handleRelease() {
        b bVar = this.mCodec;
        if (bVar == null) {
            return 101;
        }
        this.mStarted = false;
        try {
            bVar.f();
            return 0;
        } catch (Exception e10) {
            TPNativeLog.printLog(4, getLogTag(), "stop: failed!" + getStackTrace(e10));
            return 3;
        } finally {
            this.mCodec.g();
            this.mCodec = null;
        }
    }

    private int handleReleaseOutputBuffer(int i10, boolean z10) {
        b bVar = this.mCodec;
        if (bVar == null || i10 < 0) {
            return 3;
        }
        try {
            bVar.a(i10, z10);
            return 0;
        } catch (Exception e10) {
            return onMediaCodecException(e10);
        }
    }

    private int handleSetOutputSurface(Surface surface) {
        TPNativeLog.printLog(2, getLogTag(), "setOutputSurface: ".concat(String.valueOf(surface)));
        Surface surface2 = this.mSurface;
        if (surface2 == surface) {
            TPNativeLog.printLog(3, getLogTag(), "setOutputSurface: set the same surface.");
            return 0;
        }
        this.mSurface = surface;
        if (this.mCodec != null) {
            if (surface2 == null || surface == null) {
                return 3;
            }
            try {
                if (!surface.isValid() || !this.mEnableSetOutputSurfaceApi) {
                    return 3;
                }
                this.mCodec.a(surface);
            } catch (Exception e10) {
                TPNativeLog.printLog(4, getLogTag(), "setOutputSurface onMediaCodecException:\n" + getStackTrace(e10));
                return 3;
            }
        }
        return 0;
    }

    private int handleSignalEndOfStream(int i10) {
        try {
            this.mCodec.a(i10, 0, 0, 0L, 4);
            return 0;
        } catch (Exception e10) {
            TPNativeLog.printLog(4, getLogTag(), "handleSignalEndOfStream: failed!" + getStackTrace(e10));
            return 3;
        }
    }

    private boolean initMediaCodecInternal() {
        try {
            List<String> mimeCandidates = getMimeCandidates();
            boolean z10 = false;
            String codecName = null;
            String str = null;
            for (int i10 = 0; i10 < mimeCandidates.size() && codecName == null; i10++) {
                str = mimeCandidates.get(i10);
                TPNativeLog.printLog(2, getLogTag(), "initMediaCodec with mime:" + str + " mDrmType:" + this.mDrmType);
                MediaCrypto mediaCrypto = this.mMediaCrypto;
                boolean zRequiresSecureDecoderComponent = mediaCrypto != null ? mediaCrypto.requiresSecureDecoderComponent(str) : false;
                if (zRequiresSecureDecoderComponent && TPCodecUtils.isInDRMLevel1Blacklist(this.mDrmType)) {
                    TPNativeLog.printLog(2, getLogTag(), "Device " + TPSystemInfo.getDeviceName() + " DrmType " + this.mDrmType + " fallback to L3.");
                    z10 = false;
                } else {
                    z10 = zRequiresSecureDecoderComponent;
                }
                codecName = getCodecName(str, z10);
                TPNativeLog.printLog(2, getLogTag(), "initMediaCodec got codecName:" + codecName + " secureComponent " + z10);
            }
            if (codecName == null) {
                TPNativeLog.printLog(4, getLogTag(), "initMediaCodec failed, codecName is null.");
                return false;
            }
            if (y.Q.equals(str)) {
                TPNativeLog.printLog(2, getLogTag(), "initMediaCodec current mime type:" + str + " is audio dts, need set input timeout to 0!");
                MEDIA_CODEC_INPUT_TIMEOUT_US = 0L;
                MEDIA_CODEC_OUTPUT_TIMEOUT_US = 0L;
            }
            b bVarA = b.a(codecName);
            this.mCodec = bVarA;
            bVarA.a(this.mEnableMediaCodecReuse && !this.mEnableAsyncMode);
            this.mCodec.a(new com.tencent.thumbplayer.tcmedia.g.a.b() { // from class: com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder.2
                @Override // com.tencent.thumbplayer.tcmedia.g.a.b, com.tencent.thumbplayer.tcmedia.g.a.a
                public void onReuseCodecAPIException(String str2, Throwable th2) {
                    super.onReuseCodecAPIException(str2, th2);
                    TPMediaCodecManager.onMediaCodecException(TPBaseMediaCodecDecoder.this.mCodecId, str2);
                }

                @Override // com.tencent.thumbplayer.tcmedia.g.a.b, com.tencent.thumbplayer.tcmedia.g.a.a
                public void onStarted(Boolean bool, String str2) {
                    super.onStarted(bool, str2);
                    TPMediaCodecManager.onMediaCodecReady(TPBaseMediaCodecDecoder.this.mCodecId, str2);
                }
            });
            TPNativeLog.printLog(2, getLogTag(), "initMediaCodec codec name: ".concat(codecName));
            if (this.mEnableAsyncMode) {
                TPNativeLog.printLog(2, getLogTag(), "MediaCodec EnableAsyncMode！");
                HandlerThread handlerThread = new HandlerThread("MediaCodecThread");
                this.mDecodeThread = handlerThread;
                handlerThread.start();
                this.mDecoderHandler = new AsyncDecodeHandler(this.mDecodeThread.getLooper());
                this.mCodec.a(new BufferCallback(), this.mDecoderHandler);
            }
            TPMediaCodecManager.onMediaCodecReportEvent(this.mCodecId, 1);
            configCodec(this.mCodec, str);
            TPMediaCodecManager.onMediaCodecReportEvent(this.mCodecId, 2);
            TPMediaCodecManager.onMediaCodecReportEvent(this.mCodecId, 3);
            TPNativeLog.printLog(2, getLogTag(), "initMediaCodec, start codec start");
            this.mCodec.e();
            TPNativeLog.printLog(2, getLogTag(), "initMediaCodec, start codec finished");
            TPMediaCodecManager.onMediaCodecReportEvent(this.mCodecId, 4);
            this.mStarted = true;
            if (this.mDrmType != -1) {
                boolean z11 = TPCodecUtils.getDecoderName(str, true) != null;
                TPMediaDrmInfo tPMediaDrmInfo = new TPMediaDrmInfo();
                tPMediaDrmInfo.supportSecureDecoder = z11;
                tPMediaDrmInfo.supportSecureDecrypt = z10;
                tPMediaDrmInfo.componentName = codecName;
                tPMediaDrmInfo.drmType = this.mDrmType;
                TPNativeLog.printLog(2, getLogTag(), "DRM Info: supportSecureDecoder: " + tPMediaDrmInfo.supportSecureDecoder + " supportSecureDecrypt:" + tPMediaDrmInfo.supportSecureDecrypt + " componentName: " + tPMediaDrmInfo.componentName + " drmType: " + tPMediaDrmInfo.drmType);
                TPMediaCodecManager.onMediaDrmInfo(this.mCodecId, tPMediaDrmInfo);
            }
            return true;
        } catch (Exception e10) {
            TPMediaCodecManager.onMediaCodecReportEvent(this.mCodecId, 4);
            TPNativeLog.printLog(4, getLogTag(), getStackTrace(e10));
            return false;
        }
    }

    private static synchronized void initTMediaCodec() {
        if (sTMediaCodecInited) {
            return;
        }
        a.b();
        a.a().a(true);
        a.a().a(new com.tencent.thumbplayer.tcmedia.g.h.a() { // from class: com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder.1
            @Override // com.tencent.thumbplayer.tcmedia.g.h.a
            public final void d(String str, String str2) {
                TPNativeLog.printLog(1, str, str2);
            }

            @Override // com.tencent.thumbplayer.tcmedia.g.h.a
            public final void e(String str, String str2, Throwable th2) {
                TPNativeLog.printLog(4, str, str2);
            }

            @Override // com.tencent.thumbplayer.tcmedia.g.h.a
            public final void i(String str, String str2) {
                TPNativeLog.printLog(2, str, str2);
            }

            @Override // com.tencent.thumbplayer.tcmedia.g.h.a
            public final void v(String str, String str2) {
                TPNativeLog.printLog(0, str, str2);
            }

            @Override // com.tencent.thumbplayer.tcmedia.g.h.a
            public final void w(String str, String str2, Throwable th2) {
                TPNativeLog.printLog(3, str, str2);
            }
        });
        sTMediaCodecInited = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int onFlush() {
        this.mInputQueue.clear();
        this.mOutputQueue.clear();
        int iHandleFlush = handleFlush();
        this.mCodec.e();
        return iHandleFlush;
    }

    private int onMediaCodecException(Exception exc) {
        TPNativeLog.printLog(4, getLogTag(), "onMediaCodecException!\n" + getStackTrace(exc));
        resetFrameInfo();
        processMediaCodecException(exc);
        if (this.mRestartCodecOnException) {
            initMediaCodecInternal();
            return 4;
        }
        handleRelease();
        return 103;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int onRelease() {
        this.mInputQueue.clear();
        this.mOutputQueue.clear();
        return handleRelease();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int onReleaseOutputBuffer(int i10, boolean z10) {
        return handleReleaseOutputBuffer(i10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int onSetOutputSurface(Surface surface) {
        return handleSetOutputSurface(surface);
    }

    private int queueInputBuffer(byte[] bArr, long j10, boolean z10) {
        MediaCodec.CryptoInfo cryptoInfo;
        try {
            ByteBuffer[] byteBufferArrJ = this.mCodec.j();
            int iA = this.mCodec.a(MEDIA_CODEC_INPUT_TIMEOUT_US);
            if (iA < 0) {
                return iA == -1 ? 1 : 103;
            }
            ByteBuffer byteBuffer = byteBufferArrJ[iA];
            bufferSizeCheck(byteBuffer, bArr);
            byteBuffer.put(bArr);
            if (!z10 || (cryptoInfo = this.mCryptoInfo) == null) {
                this.mCodec.a(iA, 0, bArr.length, j10, 0);
            } else {
                this.mCodec.a(iA, 0, cryptoInfo, j10, 0);
            }
            return 0;
        } catch (Exception e10) {
            return onMediaCodecException(e10);
        }
    }

    private int releaseAsync() {
        TPNativeLog.printLog(2, getLogTag(), "releaseAsync: ");
        Message messageObtainMessage = this.mDecoderHandler.obtainMessage();
        messageObtainMessage.what = 1003;
        int iWaitingForHandleMessage = waitingForHandleMessage(messageObtainMessage);
        exitDecodeThread();
        return iWaitingForHandleMessage;
    }

    private int releaseOutputBufferAsync(int i10, boolean z10) {
        Message messageObtainMessage = this.mDecoderHandler.obtainMessage();
        messageObtainMessage.what = 1000;
        messageObtainMessage.arg1 = i10;
        messageObtainMessage.arg2 = z10 ? 1 : 0;
        return waitingForHandleMessage(messageObtainMessage);
    }

    private void resetFrameInfo() {
        TPFrameInfo tPFrameInfo = this.mFrameInfo;
        tPFrameInfo.bufferIndex = -1000;
        tPFrameInfo.ptsUs = -1L;
        tPFrameInfo.data = null;
        tPFrameInfo.errCode = 103;
    }

    private MediaCodecInfo selectCodec(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i10 = 0; i10 < codecCount; i10++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
            if (!codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
            }
        }
        return null;
    }

    private int setOutputSurfaceAsync(Surface surface) {
        TPNativeLog.printLog(2, getLogTag(), "setOutputSurfaceAsync: ".concat(String.valueOf(surface)));
        Message messageObtainMessage = this.mDecoderHandler.obtainMessage();
        messageObtainMessage.what = 1001;
        messageObtainMessage.obj = surface;
        return waitingForHandleMessage(messageObtainMessage);
    }

    private int signalEndOfStreamAsync() {
        Integer numPoll = this.mInputQueue.poll();
        if (numPoll == null) {
            return 1;
        }
        return handleSignalEndOfStream(numPoll.intValue());
    }

    private int waitingForHandleMessage(Message message) {
        synchronized (this.mThreadLock) {
            message.sendToTarget();
            try {
                this.mThreadLock.wait();
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
        }
        return this.mHandlerResult;
    }

    abstract void configCodec(b bVar, String str);

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public int decode(byte[] bArr, boolean z10, long j10, boolean z11) {
        if (!this.mStarted || this.mCodec == null) {
            return 101;
        }
        return this.mEnableAsyncMode ? decodeAsync(bArr, z10, j10, z11) : queueInputBuffer(bArr, j10, z11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public TPFrameInfo dequeueOutputBuffer() {
        String logTag;
        String str;
        if (this.mCodec == null) {
            return this.mFrameInfo;
        }
        resetFrameInfo();
        if (this.mEnableAsyncMode) {
            return dequeueOutputBufferAsync();
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        try {
            int iA = this.mCodec.a(bufferInfo, MEDIA_CODEC_OUTPUT_TIMEOUT_US);
            if (iA >= 0) {
                int i10 = bufferInfo.flags;
                if (i10 == 4) {
                    logTag = getLogTag();
                    str = "dequeueOutputBuffer: BUFFER_FLAG_END_OF_STREAM";
                    TPNativeLog.printLog(1, logTag, str);
                    this.mFrameInfo.errCode = 2;
                } else if (i10 == 2 && this.mEnableAudioPassThrough) {
                    TPNativeLog.printLog(1, getLogTag(), "dequeueOutputBuffer: BUFFER_FLAG_CODEC_CONFIG, AudioPassThrough");
                    TPFrameInfo tPFrameInfo = this.mFrameInfo;
                    tPFrameInfo.bufferIndex = iA;
                    tPFrameInfo.ptsUs = bufferInfo.presentationTimeUs;
                    processOutputConfigData(this.mCodec, iA, bufferInfo, tPFrameInfo);
                } else {
                    TPFrameInfo tPFrameInfo2 = this.mFrameInfo;
                    tPFrameInfo2.bufferIndex = iA;
                    tPFrameInfo2.ptsUs = bufferInfo.presentationTimeUs;
                    tPFrameInfo2.errCode = 0;
                    processOutputBuffer(this.mCodec, iA, bufferInfo, tPFrameInfo2);
                }
            } else {
                if (iA == -2) {
                    processOutputFormatChanged(this.mCodec.i());
                } else if (iA != -1) {
                    if (iA == -3) {
                        TPNativeLog.printLog(1, getLogTag(), "dequeueOutputBuffer: INFO_OUTPUT_BUFFERS_CHANGED!");
                    } else if (bufferInfo.flags == 4) {
                        logTag = getLogTag();
                        str = "dequeueOutputBuffer: BUFFER_FLAG_END_OF_STREAM!";
                        TPNativeLog.printLog(1, logTag, str);
                        this.mFrameInfo.errCode = 2;
                    } else {
                        TPNativeLog.printLog(4, getLogTag(), "dequeueOutputBuffer: TP_ERROR_DECODE_FAILED! index = ".concat(String.valueOf(iA)));
                        this.mFrameInfo.errCode = 103;
                    }
                }
                this.mFrameInfo.errCode = 1;
            }
            return this.mFrameInfo;
        } catch (Exception e10) {
            this.mFrameInfo.errCode = onMediaCodecException(e10);
            return this.mFrameInfo;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public int flush() {
        TPNativeLog.printLog(2, getLogTag(), "flush: ");
        if (this.mCodec == null) {
            return 104;
        }
        return this.mEnableAsyncMode ? flushAsync() : handleFlush();
    }

    abstract String getCodecName(String str, boolean z10);

    abstract String getLogTag();

    abstract List<String> getMimeCandidates();

    protected String getStackTrace(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    abstract void processMediaCodecException(Exception exc);

    abstract void processOutputBuffer(b bVar, int i10, MediaCodec.BufferInfo bufferInfo, TPFrameInfo tPFrameInfo);

    abstract void processOutputConfigData(b bVar, int i10, MediaCodec.BufferInfo bufferInfo, TPFrameInfo tPFrameInfo);

    abstract void processOutputFormatChanged(MediaFormat mediaFormat);

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public int release() {
        return this.mEnableAsyncMode ? releaseAsync() : handleRelease();
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public int releaseOutputBuffer(int i10, boolean z10) {
        if (this.mCodec == null || i10 < 0) {
            return 3;
        }
        return this.mEnableAsyncMode ? releaseOutputBufferAsync(i10, z10) : handleReleaseOutputBuffer(i10, z10);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public void setCryptoInfo(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11) {
        if (this.mCryptoInfo == null) {
            this.mCryptoInfo = new MediaCodec.CryptoInfo();
        }
        this.mCryptoInfo.set(i10, iArr, iArr2, bArr, bArr2, i11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public int setOperateRate(float f10) {
        if (this.mCodec != null) {
            try {
                TPNativeLog.printLog(2, getLogTag(), "setOperateRate: ".concat(String.valueOf(f10)));
                Bundle bundle = new Bundle();
                bundle.putShort("priority", (short) 0);
                bundle.putFloat("operating-rate", f10);
                this.mCodec.a(bundle);
            } catch (Exception unused) {
                TPNativeLog.printLog(3, getLogTag(), "setOperateRate: " + f10 + " failed.");
            }
        }
        return 0;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public int setOutputSurface(Surface surface) {
        return this.mEnableAsyncMode ? setOutputSurfaceAsync(surface) : handleSetOutputSurface(surface);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public boolean setParamBool(int i10, boolean z10) {
        if (i10 == 0) {
            this.mEnableSetOutputSurfaceApi = z10;
        } else if (i10 != 1) {
            if (i10 == 3) {
                this.mEnableAudioPassThrough = z10;
                TPNativeLog.printLog(2, getLogTag(), "BOOL_SET_IS_AUDIO_PASSTHROUGH mEnableAudioPassThrough:" + this.mEnableAudioPassThrough);
            } else {
                if (i10 != 4) {
                    TPNativeLog.printLog(3, getLogTag(), "Unknown paramKey: ".concat(String.valueOf(i10)));
                    return false;
                }
                this.mEnableMediaCodecReuse = z10;
            }
        } else if (this.mStarted) {
            TPNativeLog.printLog(3, getLogTag(), "BOOL_ENABLE_ASYNC_MODE must setup before started!");
        } else {
            this.mEnableAsyncMode = z10;
        }
        return true;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public boolean setParamBytes(int i10, byte[] bArr) {
        return false;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public boolean setParamInt(int i10, int i11) {
        return false;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public boolean setParamLong(int i10, long j10) {
        return false;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public boolean setParamObject(int i10, Object obj) {
        if (i10 != 300) {
            return false;
        }
        this.mMediaCrypto = (MediaCrypto) obj;
        return true;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public boolean setParamString(int i10, String str) {
        return false;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public int signalEndOfStream() {
        TPNativeLog.printLog(2, getLogTag(), "signalEndOfStream: ");
        b bVar = this.mCodec;
        if (bVar == null) {
            return 3;
        }
        if (this.mEnableAsyncMode) {
            return signalEndOfStreamAsync();
        }
        int iA = bVar.a(MEDIA_CODEC_INPUT_TIMEOUT_US);
        if (iA >= 0) {
            return handleSignalEndOfStream(iA);
        }
        return iA == -1 ? 1 : 3;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public boolean startDecoder() {
        return initMediaCodecInternal();
    }
}
