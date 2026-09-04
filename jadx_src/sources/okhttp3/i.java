package okhttp3;

import com.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity;
import java.net.Socket;
import kotlin.Metadata;

/* JADX INFO: compiled from: Connection.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\t\u001a\u00020\bH&¨\u0006\n"}, d2 = {"Lokhttp3/i;", "", "Lokhttp3/e0;", "route", "Ljava/net/Socket;", "socket", "Lokhttp3/Handshake;", "handshake", "Lokhttp3/Protocol;", SwitchDetailActivity.P, "okhttp"}, k = 1, mv = {1, 4, 0})
public interface i {
    @dl.e
    /* JADX INFO: renamed from: handshake */
    Handshake getHandshake();

    @dl.d
    Protocol protocol();

    @dl.d
    /* JADX INFO: renamed from: route */
    e0 getRoute();

    @dl.d
    Socket socket();
}
