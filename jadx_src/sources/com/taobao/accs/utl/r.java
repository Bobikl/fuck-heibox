package com.taobao.accs.utl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class r extends ByteArrayOutputStream {
    public r() {
    }

    public r(int i10) {
        super(i10);
    }

    public r a(byte b10) throws IOException {
        write(b10);
        return this;
    }

    public r a(short s10) throws IOException {
        write(s10 >> 8);
        write(s10);
        return this;
    }
}
