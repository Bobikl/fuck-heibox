package org.android.spdy;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface Intenalcb {
    void bioPingRecvCallback(SpdySession spdySession, int i10);

    byte[] getSSLMeta(SpdySession spdySession);

    int putSSLMeta(SpdySession spdySession, byte[] bArr);

    void spdyCustomControlFrameFailCallback(SpdySession spdySession, Object obj, int i10, int i11);

    void spdyCustomControlFrameRecvCallback(SpdySession spdySession, Object obj, int i10, int i11, int i12, int i13, byte[] bArr);

    void spdyDataChunkRecvCB(SpdySession spdySession, boolean z10, long j10, SpdyByteArray spdyByteArray, int i10);

    void spdyDataRecvCallback(SpdySession spdySession, boolean z10, long j10, int i10, int i11);

    void spdyDataSendCallback(SpdySession spdySession, boolean z10, long j10, int i10, int i11);

    void spdyOnStreamResponse(SpdySession spdySession, long j10, Map<String, List<String>> map, int i10);

    void spdyPingRecvCallback(SpdySession spdySession, long j10, Object obj);

    void spdyRequestRecvCallback(SpdySession spdySession, long j10, int i10);

    void spdySessionCloseCallback(SpdySession spdySession, Object obj, SuperviseConnectInfo superviseConnectInfo, int i10);

    void spdySessionConnectCB(SpdySession spdySession, SuperviseConnectInfo superviseConnectInfo);

    void spdySessionFailedError(SpdySession spdySession, int i10, Object obj);

    void spdySessionOnWritable(SpdySession spdySession, Object obj, int i10);

    void spdyStreamCloseCallback(SpdySession spdySession, long j10, int i10, int i11, SuperviseData superviseData);
}
