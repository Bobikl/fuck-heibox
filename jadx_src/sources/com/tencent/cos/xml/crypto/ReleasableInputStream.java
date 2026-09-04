package com.tencent.cos.xml.crypto;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class ReleasableInputStream extends SdkFilterInputStream implements Releasable {
    private boolean closeDisabled;

    protected ReleasableInputStream(InputStream inputStream) {
        super(inputStream);
    }

    private void doRelease() {
        try {
            ((FilterInputStream) this).in.close();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (((FilterInputStream) this).in instanceof Releasable) {
            ((Releasable) ((FilterInputStream) this).in).release();
        }
        abortIfNeeded();
    }

    public static ReleasableInputStream wrap(InputStream inputStream) {
        if (inputStream instanceof ReleasableInputStream) {
            return (ReleasableInputStream) inputStream;
        }
        return inputStream instanceof FileInputStream ? ResettableInputStream.newResettableInputStream((FileInputStream) inputStream) : new ReleasableInputStream(inputStream);
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.closeDisabled) {
            return;
        }
        doRelease();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends ReleasableInputStream> T disableClose() {
        this.closeDisabled = true;
        return this;
    }

    public final boolean isCloseDisabled() {
        return this.closeDisabled;
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, com.tencent.cos.xml.crypto.Releasable
    public final void release() {
        doRelease();
    }
}
