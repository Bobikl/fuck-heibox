package com.taobao.downloader.download.protocol.huc;

import com.taobao.downloader.download.protocol.DLConfig;
import com.taobao.downloader.download.protocol.DLInputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class HUCInputStream implements DLInputStream {
    private InputStream inputStream;

    public HUCInputStream(InputStream inputStream) {
        this.inputStream = new BufferedInputStream(inputStream, DLConfig.LARGE_BUFFER_SIZE);
    }

    @Override // com.taobao.downloader.download.protocol.DLInputStream
    public void close() throws Exception {
        this.inputStream.close();
    }

    @Override // com.taobao.downloader.download.protocol.DLInputStream
    public int read(byte[] bArr) throws Exception {
        return this.inputStream.read(bArr, 0, bArr.length);
    }
}
