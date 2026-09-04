package anet.channel.session;

import anet.channel.security.ISecurity;
import anet.channel.util.ALog;
import org.android.spdy.AccsSSLCallback;
import org.android.spdy.SpdyProtocol;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class j implements AccsSSLCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ TnetSpdySession f29845a;

    j(TnetSpdySession tnetSpdySession) {
        this.f29845a = tnetSpdySession;
    }

    @Override // org.android.spdy.AccsSSLCallback
    public byte[] getSSLPublicKey(int i10, byte[] bArr) {
        byte[] bArrDecrypt;
        try {
            TnetSpdySession tnetSpdySession = this.f29845a;
            bArrDecrypt = tnetSpdySession.G.decrypt(tnetSpdySession.f29540a, ISecurity.CIPHER_ALGORITHM_AES128, SpdyProtocol.TNET_PUBKEY_SG_KEY, bArr);
            if (bArrDecrypt != null) {
                try {
                    if (ALog.isPrintLog(2)) {
                        ALog.i("getSSLPublicKey", null, "decrypt", new String(bArrDecrypt));
                    }
                } catch (Throwable th2) {
                    th = th2;
                    ALog.e("awcn.TnetSpdySession", "getSSLPublicKey", null, th, new Object[0]);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bArrDecrypt = null;
        }
        return bArrDecrypt;
    }
}
