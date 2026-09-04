package v3;

import anet.channel.request.Request;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public interface b {

    /* JADX INFO: compiled from: Taobao */
    public interface a {
        Future a(Request request, v3.a aVar);

        v3.a callback();

        Request request();
    }

    Future a(a aVar);
}
