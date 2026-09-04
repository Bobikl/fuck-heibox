package v3;

import anet.channel.util.ALog;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final CopyOnWriteArrayList<b> f140817a = new CopyOnWriteArrayList<>();

    private c() {
    }

    public static void a(b bVar) {
        CopyOnWriteArrayList<b> copyOnWriteArrayList = f140817a;
        if (copyOnWriteArrayList.contains(bVar)) {
            return;
        }
        copyOnWriteArrayList.add(bVar);
        ALog.i("anet.InterceptorManager", "[addInterceptor]", null, "interceptors", copyOnWriteArrayList.toString());
    }

    public static boolean b(b bVar) {
        return f140817a.contains(bVar);
    }

    public static b c(int i10) {
        return f140817a.get(i10);
    }

    public static int d() {
        return f140817a.size();
    }

    public static void e(b bVar) {
        CopyOnWriteArrayList<b> copyOnWriteArrayList = f140817a;
        copyOnWriteArrayList.remove(bVar);
        ALog.i("anet.InterceptorManager", "[remoteInterceptor]", null, "interceptors", copyOnWriteArrayList.toString());
    }
}
