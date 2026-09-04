package anet.channel;

import anet.channel.session.TnetSpdySession;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public interface DataFrameCb {
    void onDataReceive(TnetSpdySession tnetSpdySession, byte[] bArr, int i10, int i11);

    void onException(int i10, int i11, boolean z10, String str);
}
