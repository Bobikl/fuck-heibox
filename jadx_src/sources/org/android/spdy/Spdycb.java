package org.android.spdy;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface Spdycb {
    void spdyDataChunkRecvCB(SpdySession spdySession, boolean z10, long j10, SpdyByteArray spdyByteArray, Object obj);

    void spdyDataRecvCallback(SpdySession spdySession, boolean z10, long j10, int i10, Object obj);

    void spdyDataSendCallback(SpdySession spdySession, boolean z10, long j10, int i10, Object obj);

    void spdyOnStreamResponse(SpdySession spdySession, long j10, Map<String, List<String>> map, Object obj);

    void spdyRequestRecvCallback(SpdySession spdySession, long j10, Object obj);

    void spdyStreamCloseCallback(SpdySession spdySession, long j10, int i10, Object obj, SuperviseData superviseData);
}
