package org.android.spdy;

/* JADX INFO: loaded from: classes5.dex */
public interface SessionCb {
    void bioPingRecvCallback(SpdySession spdySession, int i10);

    byte[] getSSLMeta(SpdySession spdySession);

    int putSSLMeta(SpdySession spdySession, byte[] bArr);

    void spdyCustomControlFrameFailCallback(SpdySession spdySession, Object obj, int i10, int i11);

    void spdyCustomControlFrameRecvCallback(SpdySession spdySession, Object obj, int i10, int i11, int i12, int i13, byte[] bArr);

    void spdyPingRecvCallback(SpdySession spdySession, long j10, Object obj);

    void spdySessionCloseCallback(SpdySession spdySession, Object obj, SuperviseConnectInfo superviseConnectInfo, int i10);

    void spdySessionConnectCB(SpdySession spdySession, SuperviseConnectInfo superviseConnectInfo);

    void spdySessionFailedError(SpdySession spdySession, int i10, Object obj);
}
