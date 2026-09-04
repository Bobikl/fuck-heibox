package anet.channel.entity;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public enum ENV {
    ONLINE(0),
    PREPARE(1),
    TEST(2);

    private int envMode;

    ENV(int i10) {
        this.envMode = i10;
    }

    public static ENV valueOf(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? ONLINE : TEST;
        }
        return PREPARE;
    }

    public int getEnvMode() {
        return this.envMode;
    }

    public void setEnvMode(int i10) {
        this.envMode = i10;
    }
}
