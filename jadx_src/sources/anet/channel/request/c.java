package anet.channel.request;

import anet.channel.util.ALog;
import com.taobao.accs.common.Constants;
import org.android.spdy.SpdyErrorException;
import org.android.spdy.SpdySession;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class c implements Cancelable {
    public static final c NULL = new c(null, 0, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f29811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SpdySession f29812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f29813c;

    public c(SpdySession spdySession, int i10, String str) {
        this.f29812b = spdySession;
        this.f29811a = i10;
        this.f29813c = str;
    }

    @Override // anet.channel.request.Cancelable
    public void cancel() {
        int i10;
        try {
            if (this.f29812b == null || (i10 = this.f29811a) == 0) {
                return;
            }
            ALog.i("awcn.TnetCancelable", "cancel tnet request", this.f29813c, "streamId", Integer.valueOf(i10));
            this.f29812b.streamReset(this.f29811a, 5);
        } catch (SpdyErrorException e10) {
            ALog.e("awcn.TnetCancelable", "request cancel failed.", this.f29813c, e10, Constants.KEY_ERROR_CODE, Integer.valueOf(e10.SpdyErrorGetCode()));
        }
    }
}
