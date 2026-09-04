package anet.channel.session;

import java.util.List;
import java.util.Map;
import org.android.spdy.SpdyByteArray;
import org.android.spdy.SpdySession;
import org.android.spdy.Spdycb;
import org.android.spdy.SuperviseData;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class a implements Spdycb {
    @Override // org.android.spdy.Spdycb
    public void spdyDataChunkRecvCB(SpdySession spdySession, boolean z10, long j10, SpdyByteArray spdyByteArray, Object obj) {
    }

    @Override // org.android.spdy.Spdycb
    public void spdyDataRecvCallback(SpdySession spdySession, boolean z10, long j10, int i10, Object obj) {
    }

    @Override // org.android.spdy.Spdycb
    public void spdyDataSendCallback(SpdySession spdySession, boolean z10, long j10, int i10, Object obj) {
    }

    @Override // org.android.spdy.Spdycb
    public void spdyOnStreamResponse(SpdySession spdySession, long j10, Map<String, List<String>> map, Object obj) {
    }

    @Override // org.android.spdy.Spdycb
    public void spdyRequestRecvCallback(SpdySession spdySession, long j10, Object obj) {
    }

    @Override // org.android.spdy.Spdycb
    public void spdyStreamCloseCallback(SpdySession spdySession, long j10, int i10, Object obj, SuperviseData superviseData) {
    }
}
