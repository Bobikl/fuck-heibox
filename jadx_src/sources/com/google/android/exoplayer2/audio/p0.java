package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: ResamplingAudioProcessor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class p0 extends y {
    p0() {
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.f44352b.f43950c;
        if (i11 == 3) {
            i10 *= 2;
        } else if (i11 == 4) {
            i10 /= 2;
        } else if (i11 != 268435456) {
            if (i11 != 536870912) {
                if (i11 != 805306368) {
                    throw new IllegalStateException();
                }
                i10 /= 2;
            } else {
                i10 /= 3;
                i10 *= 2;
            }
        }
        ByteBuffer byteBufferK = k(i10);
        int i12 = this.f44352b.f43950c;
        if (i12 == 3) {
            while (iPosition < iLimit) {
                byteBufferK.put((byte) 0);
                byteBufferK.put((byte) ((byteBuffer.get(iPosition) & 255) + n5.a.f132012g));
                iPosition++;
            }
        } else if (i12 == 4) {
            while (iPosition < iLimit) {
                short sR = (short) (com.google.android.exoplayer2.util.u0.r(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferK.put((byte) (sR & 255));
                byteBufferK.put((byte) ((sR >> 8) & 255));
                iPosition += 4;
            }
        } else if (i12 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferK.put(byteBuffer.get(iPosition + 1));
                byteBufferK.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i12 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferK.put(byteBuffer.get(iPosition + 1));
                byteBufferK.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else {
            if (i12 != 805306368) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferK.put(byteBuffer.get(iPosition + 2));
                byteBufferK.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferK.flip();
    }

    @Override // com.google.android.exoplayer2.audio.y
    public AudioProcessor.a g(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int i10 = aVar.f43950c;
        if (i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 536870912 || i10 == 805306368 || i10 == 4) {
            return i10 != 2 ? new AudioProcessor.a(aVar.f43948a, aVar.f43949b, 2) : AudioProcessor.a.f43947e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }
}
