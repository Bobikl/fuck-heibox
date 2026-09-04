package anet.channel.heartbeat;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class HeartbeatManager {
    public static IHeartbeat getDefaultBackgroundAccsHeartbeat() {
        return new a();
    }

    public static IHeartbeat getDefaultHeartbeat() {
        return new b();
    }
}
