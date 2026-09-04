package anet.channel.monitor;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public enum NetworkSpeed {
    Slow("弱网络", 1),
    Fast("强网络", 5);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f29734b;

    NetworkSpeed(String str, int i10) {
        this.f29733a = str;
        this.f29734b = i10;
    }

    public static NetworkSpeed valueOfCode(int i10) {
        return i10 == 1 ? Slow : Fast;
    }

    public int getCode() {
        return this.f29734b;
    }

    public String getDesc() {
        return this.f29733a;
    }
}
