package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes7.dex */
public interface AudioProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f43946a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class UnhandledAudioFormatException extends Exception {
        public UnhandledAudioFormatException(a aVar) {
            String strValueOf = String.valueOf(aVar);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 18);
            sb2.append("Unhandled format: ");
            sb2.append(strValueOf);
            super(sb2.toString());
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f43947e = new a(-1, -1, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f43948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f43949b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f43950c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f43951d;

        public a(int i10, int i11, int i12) {
            this.f43948a = i10;
            this.f43949b = i11;
            this.f43950c = i12;
            this.f43951d = com.google.android.exoplayer2.util.u0.H0(i12) ? com.google.android.exoplayer2.util.u0.o0(i12, i11) : -1;
        }

        public String toString() {
            int i10 = this.f43948a;
            int i11 = this.f43949b;
            int i12 = this.f43950c;
            StringBuilder sb2 = new StringBuilder(83);
            sb2.append("AudioFormat[sampleRate=");
            sb2.append(i10);
            sb2.append(", channelCount=");
            sb2.append(i11);
            sb2.append(", encoding=");
            sb2.append(i12);
            sb2.append(']');
            return sb2.toString();
        }
    }

    void a(ByteBuffer byteBuffer);

    boolean b();

    void c();

    ByteBuffer d();

    a e(a aVar) throws UnhandledAudioFormatException;

    void flush();

    boolean isActive();

    void reset();
}
