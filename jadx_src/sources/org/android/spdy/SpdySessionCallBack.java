package org.android.spdy;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class SpdySessionCallBack implements Intenalcb {
    SpdySessionCallBack() {
    }

    @Override // org.android.spdy.Intenalcb
    public void bioPingRecvCallback(SpdySession spdySession, int i10) {
        spduLog.Logi("tnet-jni", "[SpdySessionCallBack.bioPingRecvCallback] - " + spdySession);
        SessionCb sessionCb = spdySession.sessionCallBack;
        if (sessionCb != null) {
            sessionCb.bioPingRecvCallback(spdySession, i10);
        } else {
            spduLog.Loge("tnet-jni", "[SpdySessionCallBack.bioPingRecvCallback] - no sessionCallBack.");
        }
    }

    @Override // org.android.spdy.Intenalcb
    public byte[] getSSLMeta(SpdySession spdySession) {
        spduLog.Logi("tnet-jni", "[SpdySessionCallBack.getSSLMeta] - " + spdySession);
        SessionCb sessionCb = spdySession.sessionCallBack;
        if (sessionCb != null) {
            return sessionCb.getSSLMeta(spdySession);
        }
        spduLog.Loge("tnet-jni", "[SpdySessionCallBack.getSSLMeta] - no sessionCallBack.");
        return null;
    }

    @Override // org.android.spdy.Intenalcb
    public int putSSLMeta(SpdySession spdySession, byte[] bArr) {
        spduLog.Logi("tnet-jni", "[SpdySessionCallBack.putSSLMeta] - " + spdySession);
        SessionCb sessionCb = spdySession.sessionCallBack;
        if (sessionCb != null) {
            return sessionCb.putSSLMeta(spdySession, bArr);
        }
        spduLog.Loge("tnet-jni", "[SpdySessionCallBack.putSSLMeta] - no sessionCallBack.");
        return -1;
    }

    @Override // org.android.spdy.Intenalcb
    public void spdyCustomControlFrameFailCallback(SpdySession spdySession, Object obj, int i10, int i11) {
        spduLog.Logi("tnet-jni", "[SpdySessionCallBack.spdyCustomControlFrameFailCallback] - " + spdySession);
        SessionCb sessionCb = spdySession.sessionCallBack;
        if (sessionCb != null) {
            sessionCb.spdyCustomControlFrameFailCallback(spdySession, obj, i10, i11);
        } else {
            spduLog.Loge("tnet-jni", "[SpdySessionCallBack.spdyCustomControlFrameFailCallback] - no sessionCallBack.");
        }
    }

    @Override // org.android.spdy.Intenalcb
    public void spdyCustomControlFrameRecvCallback(SpdySession spdySession, Object obj, int i10, int i11, int i12, int i13, byte[] bArr) {
        spduLog.Logi("tnet-jni", "[SpdySessionCallBack.spdyCustomControlFrameRecvCallback] - " + spdySession);
        SessionCb sessionCb = spdySession.sessionCallBack;
        if (sessionCb != null) {
            sessionCb.spdyCustomControlFrameRecvCallback(spdySession, obj, i10, i11, i12, i13, bArr);
        } else {
            spduLog.Loge("tnet-jni", "[SpdySessionCallBack.spdyCustomControlFrameRecvCallback] - no sessionCallBack.");
        }
    }

    @Override // org.android.spdy.Intenalcb
    public void spdyDataChunkRecvCB(SpdySession spdySession, boolean z10, long j10, SpdyByteArray spdyByteArray, int i10) {
        Spdycb spdycb;
        spduLog.Logi("tnet-jni", "[SpdySessionCallBack.spdyDataChunkRecvCB] - " + spdySession);
        long jBegin = NetTimeGaurd.begin();
        SpdyStreamContext spdyStream = spdySession.getSpdyStream(i10);
        if (spdyStream == null || (spdycb = spdyStream.callBack) == null) {
            spduLog.Loge("tnet-jni", "[SpdySessionCallBack.spdyDataChunkRecvCB] - no sessionCallBack.");
        } else {
            spdycb.spdyDataChunkRecvCB(spdySession, z10, j10, spdyByteArray, spdyStream.streamContext);
        }
        NetTimeGaurd.end("spdyDataChunkRecvCB", 3, jBegin);
    }

    @Override // org.android.spdy.Intenalcb
    public void spdyDataRecvCallback(SpdySession spdySession, boolean z10, long j10, int i10, int i11) {
        Spdycb spdycb;
        spduLog.Logi("tnet-jni", "[SpdySessionCallBack.spdyDataRecvCallback] - " + spdySession);
        long jBegin = NetTimeGaurd.begin();
        SpdyStreamContext spdyStream = spdySession.getSpdyStream(i11);
        if (spdyStream == null || (spdycb = spdyStream.callBack) == null) {
            spduLog.Loge("tnet-jni", "[SpdySessionCallBack.spdyDataRecvCallback] - no sessionCallBack.");
        } else {
            spdycb.spdyDataRecvCallback(spdySession, z10, j10, i10, spdyStream.streamContext);
        }
        NetTimeGaurd.end("spdyDataRecvCallback", 3, jBegin);
    }

    @Override // org.android.spdy.Intenalcb
    public void spdyDataSendCallback(SpdySession spdySession, boolean z10, long j10, int i10, int i11) {
        Spdycb spdycb;
        spduLog.Logi("tnet-jni", "[SpdySessionCallBack.spdyDataSendCallback] - ");
        SpdyStreamContext spdyStream = spdySession.getSpdyStream(i11);
        if (spdyStream == null || (spdycb = spdyStream.callBack) == null) {
            spduLog.Loge("tnet-jni", "[SpdySessionCallBack.spdyDataSendCallback] - no sessionCallBack.");
        } else {
            spdycb.spdyDataSendCallback(spdySession, z10, j10, i10, spdyStream.streamContext);
        }
    }

    @Override // org.android.spdy.Intenalcb
    public void spdyOnStreamResponse(SpdySession spdySession, long j10, Map<String, List<String>> map, int i10) {
        Spdycb spdycb;
        spduLog.Logi("tnet-jni", "[SpdySessionCallBack.spdyOnStreamResponse] - " + spdySession);
        NetTimeGaurd.start(3);
        long jBegin = NetTimeGaurd.begin();
        SpdyStreamContext spdyStream = spdySession.getSpdyStream(i10);
        if (spdyStream == null || (spdycb = spdyStream.callBack) == null) {
            spduLog.Loge("tnet-jni", "[SpdySessionCallBack.spdyOnStreamResponse] - no sessionCallBack.");
        } else {
            spdycb.spdyOnStreamResponse(spdySession, j10, map, spdyStream.streamContext);
        }
        NetTimeGaurd.end("spdyOnStreamResponse", 3, jBegin);
    }

    @Override // org.android.spdy.Intenalcb
    public void spdyPingRecvCallback(SpdySession spdySession, long j10, Object obj) {
        spduLog.Logi("tnet-jni", "[SpdySessionCallBack.spdyPingRecvCallback] - " + spdySession);
        NetTimeGaurd.start(1);
        if (spdySession.sessionCallBack != null) {
            long jBegin = NetTimeGaurd.begin();
            spdySession.sessionCallBack.spdyPingRecvCallback(spdySession, j10, obj);
            NetTimeGaurd.end("spdyPingRecvCallback", 1, jBegin);
        } else {
            spduLog.Loge("tnet-jni", "[SpdySessionCallBack.spdyPingRecvCallback] - no sessionCallBack.");
        }
        NetTimeGaurd.finish(1);
    }

    @Override // org.android.spdy.Intenalcb
    public void spdyRequestRecvCallback(SpdySession spdySession, long j10, int i10) {
        Spdycb spdycb;
        spduLog.Logd("tnet-jni", "[SpdySessionCallBack.spdyOnStreamResponse] - " + spdySession);
        long jBegin = NetTimeGaurd.begin();
        SpdyStreamContext spdyStream = spdySession.getSpdyStream(i10);
        if (spdyStream == null || (spdycb = spdyStream.callBack) == null) {
            spduLog.Loge("tnet-jni", "[SpdySessionCallBack.spdyRequestRecvCallback] - no sessionCallBack.");
        } else {
            spdycb.spdyRequestRecvCallback(spdySession, j10, spdyStream.streamContext);
        }
        NetTimeGaurd.end("spdyPingRecvCallback", 3, jBegin);
    }

    @Override // org.android.spdy.Intenalcb
    public void spdySessionCloseCallback(SpdySession spdySession, Object obj, SuperviseConnectInfo superviseConnectInfo, int i10) {
        spduLog.Logi("tnet-jni", "[SpdySessionCallBack.spdySessionCloseCallback] - " + spdySession);
        SessionCb sessionCb = spdySession.sessionCallBack;
        if (sessionCb != null) {
            sessionCb.spdySessionCloseCallback(spdySession, obj, superviseConnectInfo, i10);
        } else {
            spduLog.Loge("tnet-jni", "[SpdySessionCallBack.spdySessionCloseCallback] - no sessionCallBack.");
        }
    }

    @Override // org.android.spdy.Intenalcb
    public void spdySessionConnectCB(SpdySession spdySession, SuperviseConnectInfo superviseConnectInfo) {
        spduLog.Logi("tnet-jni", "[SpdySessionCallBack.spdySessionConnectCB] - " + spdySession);
        NetTimeGaurd.start(0);
        if (spdySession.sessionCallBack != null) {
            long jBegin = NetTimeGaurd.begin();
            spdySession.sessionCallBack.spdySessionConnectCB(spdySession, superviseConnectInfo);
            NetTimeGaurd.end("spdySessionConnectCB", 0, jBegin);
        } else {
            spduLog.Loge("tnet-jni", "[SpdySessionCallBack.spdySessionConnectCB] - no sessionCallBack.");
        }
        NetTimeGaurd.finish(0);
    }

    @Override // org.android.spdy.Intenalcb
    public void spdySessionFailedError(SpdySession spdySession, int i10, Object obj) {
        spduLog.Logi("tnet-jni", "[SpdySessionCallBack.spdySessionFailedError] - " + spdySession);
        NetTimeGaurd.start(2);
        if (spdySession.sessionCallBack != null) {
            long jBegin = NetTimeGaurd.begin();
            spdySession.sessionCallBack.spdySessionFailedError(spdySession, i10, obj);
            spdySession.clearAllStreamCb();
            NetTimeGaurd.end("spdySessionFailedError", 2, jBegin);
        } else {
            spduLog.Loge("tnet-jni", "[SpdySessionCallBack.spdySessionFailedError] - no sessionCallBack.");
        }
        NetTimeGaurd.finish(2);
    }

    @Override // org.android.spdy.Intenalcb
    public void spdySessionOnWritable(SpdySession spdySession, Object obj, int i10) {
        spduLog.Logi("tnet-jni", "[SpdySessionCallBack.spdySessionOnWritable] - " + spdySession);
        NetTimeGaurd.start(2);
        SessionCb sessionCb = spdySession.sessionCallBack;
        if (sessionCb == null || !(sessionCb instanceof SessionExtraCb)) {
            spduLog.Loge("tnet-jni", "[SpdySessionCallBack.spdySessionOnWritable] - no sessionCallBack.");
        } else {
            long jBegin = NetTimeGaurd.begin();
            ((SessionExtraCb) spdySession.sessionCallBack).spdySessionOnWritable(spdySession, obj, i10);
            NetTimeGaurd.end("spdySessionOnWritable", 2, jBegin);
        }
        NetTimeGaurd.finish(2);
    }

    @Override // org.android.spdy.Intenalcb
    public void spdyStreamCloseCallback(SpdySession spdySession, long j10, int i10, int i11, SuperviseData superviseData) {
        spduLog.Logi("tnet-jni", "[SpdySessionCallBack.spdyStreamCloseCallback] - " + spdySession);
        long jBegin = NetTimeGaurd.begin();
        SpdyStreamContext spdyStream = spdySession.getSpdyStream(i11);
        if (spdyStream == null || spdyStream.callBack == null) {
            spduLog.Loge("tnet-jni", "[SpdySessionCallBack.spdyStreamCloseCallback] - no sessionCallBack.");
        } else {
            spduLog.Logi("tnet-jni", "index=" + i11 + "    endtime=" + System.currentTimeMillis());
            spdyStream.callBack.spdyStreamCloseCallback(spdySession, j10, i10, spdyStream.streamContext, superviseData);
            spdySession.removeSpdyStream(i11);
        }
        NetTimeGaurd.end("spdyStreamCloseCallback", 3, jBegin);
        NetTimeGaurd.finish(3);
    }
}
