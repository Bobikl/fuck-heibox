package e8;

import dl.d;
import java.net.InetSocketAddress;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public static final boolean a(@d String ip) {
        f0.p(ip, "ip");
        try {
            new InetSocketAddress(ip, 6000);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean b(@d String portStr) {
        f0.p(portStr, "portStr");
        try {
            new InetSocketAddress("127.0.0.1", Integer.parseInt(portStr));
            return true;
        } catch (NumberFormatException | Exception unused) {
            return false;
        }
    }

    public static final void c(@d yh.a<b2> body) {
        f0.p(body, "body");
        try {
            body.invoke();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
