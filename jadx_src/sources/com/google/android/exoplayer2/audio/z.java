package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: ChannelMappingAudioProcessor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class z extends y {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private int[] f44359i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private int[] f44360j;

    z() {
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void a(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) com.google.android.exoplayer2.util.a.g(this.f44360j);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferK = k(((iLimit - iPosition) / this.f44352b.f43951d) * this.f44353c.f43951d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                byteBufferK.putShort(byteBuffer.getShort((i10 * 2) + iPosition));
            }
            iPosition += this.f44352b.f43951d;
        }
        byteBuffer.position(iLimit);
        byteBufferK.flip();
    }

    @Override // com.google.android.exoplayer2.audio.y
    public AudioProcessor.a g(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.f44359i;
        if (iArr == null) {
            return AudioProcessor.a.f43947e;
        }
        if (aVar.f43950c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        boolean z10 = aVar.f43949b != iArr.length;
        int i10 = 0;
        while (i10 < iArr.length) {
            int i11 = iArr[i10];
            if (i11 >= aVar.f43949b) {
                throw new AudioProcessor.UnhandledAudioFormatException(aVar);
            }
            z10 |= i11 != i10;
            i10++;
        }
        return z10 ? new AudioProcessor.a(aVar.f43948a, iArr.length, 2) : AudioProcessor.a.f43947e;
    }

    @Override // com.google.android.exoplayer2.audio.y
    protected void h() {
        this.f44360j = this.f44359i;
    }

    @Override // com.google.android.exoplayer2.audio.y
    protected void j() {
        this.f44360j = null;
        this.f44359i = null;
    }

    public void l(@androidx.annotation.p0 int[] iArr) {
        this.f44359i = iArr;
    }
}
