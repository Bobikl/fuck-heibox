package com.tencent.thumbplayer.tcmedia.api.connection;

/* JADX INFO: loaded from: classes4.dex */
public interface ITPPlayerConnection {
    int activeAllConnections();

    int activeConnection(int i10);

    int addConnection(long j10, TPPlayerConnectionNode tPPlayerConnectionNode, long j11, TPPlayerConnectionNode tPPlayerConnectionNode2);

    void deactiveAllConnections();

    void deactiveConnection(int i10);

    void init();

    void removeConnection(int i10);

    void uninit();
}
