package com.google.android.exoplayer2.metadata.emsg;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: EventMessageEncoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f46839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DataOutputStream f46840b;

    public b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f46839a = byteArrayOutputStream;
        this.f46840b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(EventMessage eventMessage) {
        this.f46839a.reset();
        try {
            b(this.f46840b, eventMessage.f46833b);
            String str = eventMessage.f46834c;
            if (str == null) {
                str = "";
            }
            b(this.f46840b, str);
            this.f46840b.writeLong(eventMessage.f46835d);
            this.f46840b.writeLong(eventMessage.f46836e);
            this.f46840b.write(eventMessage.f46837f);
            this.f46840b.flush();
            return this.f46839a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
