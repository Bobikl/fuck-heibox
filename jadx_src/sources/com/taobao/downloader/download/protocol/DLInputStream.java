package com.taobao.downloader.download.protocol;

/* JADX INFO: loaded from: classes4.dex */
public interface DLInputStream {
    void close() throws Exception;

    int read(byte[] bArr) throws Exception;
}
