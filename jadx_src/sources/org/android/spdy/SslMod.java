package org.android.spdy;

/* JADX INFO: loaded from: classes5.dex */
public enum SslMod {
    SLIGHT_SLL_NOT_ENCRYT(0),
    SLIGHT_SSL_0_RTT(1);

    private int code;

    SslMod(int i10) {
        this.code = i10;
    }

    int getint() {
        return this.code;
    }
}
