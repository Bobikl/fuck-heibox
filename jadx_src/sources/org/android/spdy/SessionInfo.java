package org.android.spdy;

/* JADX INFO: loaded from: classes5.dex */
public class SessionInfo {
    private static int INVALID_PUBLIC_SEQNUM = -1;
    private String domain;
    private String host;
    private int mode;
    private int port;
    private String proxyHost;
    private int proxyPort;
    private SessionCb sessionCb;
    private Object sessionUserData;
    private String certHost = null;
    private int pubkey_seqnum = INVALID_PUBLIC_SEQNUM;
    private int connTimeoutMs = -1;

    public SessionInfo(String str, int i10, String str2, String str3, int i11, Object obj, SessionCb sessionCb, int i12) {
        this.host = str;
        this.port = i10;
        this.domain = str2;
        this.proxyHost = str3;
        this.proxyPort = i11;
        this.sessionUserData = obj;
        this.sessionCb = sessionCb;
        this.mode = i12;
    }

    String getAuthority() {
        if (this.proxyHost == null || this.proxyPort == 0) {
            return this.host + ":" + this.port;
        }
        return this.host + ":" + this.port + "/" + this.proxyHost + ":" + this.proxyPort;
    }

    String getCertHost() {
        if (this.pubkey_seqnum != INVALID_PUBLIC_SEQNUM) {
            return null;
        }
        return this.certHost;
    }

    int getConnectionTimeoutMs() {
        return this.connTimeoutMs;
    }

    String getDomain() {
        return this.domain;
    }

    int getMode() {
        return this.mode;
    }

    int getPubKeySeqNum() {
        return this.pubkey_seqnum;
    }

    SessionCb getSessionCb() {
        return this.sessionCb;
    }

    Object getSessonUserData() {
        return this.sessionUserData;
    }

    public void setCertHost(String str) {
        this.certHost = str;
    }

    public void setConnectionTimeoutMs(int i10) {
        this.connTimeoutMs = i10;
    }

    public void setPubKeySeqNum(int i10) {
        this.pubkey_seqnum = i10;
    }
}
