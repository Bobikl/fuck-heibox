package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: FloatResamplingAudioProcessor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class k0 extends y {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f44155i = Float.floatToIntBits(Float.NaN);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final double f44156j = 4.656612875245797E-10d;

    k0() {
    }

    private static void l(int i10, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i10) * f44156j));
        if (iFloatToIntBits == f44155i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void a(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferK;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.f44352b.f43950c;
        if (i11 == 536870912) {
            byteBufferK = k((i10 / 3) * 4);
            while (iPosition < iLimit) {
                l(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferK);
                iPosition += 3;
            }
        } else {
            if (i11 != 805306368) {
                throw new IllegalStateException();
            }
            byteBufferK = k(i10);
            while (iPosition < iLimit) {
                l((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferK);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferK.flip();
    }

    @Override // com.google.android.exoplayer2.audio.y
    public AudioProcessor.a g(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int i10 = aVar.f43950c;
        if (com.google.android.exoplayer2.util.u0.G0(i10)) {
            return i10 != 4 ? new AudioProcessor.a(aVar.f43948a, aVar.f43949b, 4) : AudioProcessor.a.f43947e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }
}
