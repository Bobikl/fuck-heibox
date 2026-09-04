package anetwork.channel.monitor.speed;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public enum NetworkSpeed {
    Slow("弱网络", 1),
    Fast("强网络", 5);

    private final int code;
    private final String desc;

    NetworkSpeed(String str, int i10) {
        this.desc = str;
        this.code = i10;
    }

    public static NetworkSpeed valueOfCode(int i10) {
        return i10 == 1 ? Slow : Fast;
    }

    public int getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }
}
