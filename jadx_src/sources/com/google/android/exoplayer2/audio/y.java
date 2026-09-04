package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: BaseAudioProcessor.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class y implements AudioProcessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected AudioProcessor.a f44352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected AudioProcessor.a f44353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AudioProcessor.a f44354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AudioProcessor.a f44355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ByteBuffer f44356f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ByteBuffer f44357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f44358h;

    public y() {
        ByteBuffer byteBuffer = AudioProcessor.f43946a;
        this.f44356f = byteBuffer;
        this.f44357g = byteBuffer;
        AudioProcessor.a aVar = AudioProcessor.a.f43947e;
        this.f44354d = aVar;
        this.f44355e = aVar;
        this.f44352b = aVar;
        this.f44353c = aVar;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    @androidx.annotation.i
    public boolean b() {
        return this.f44358h && this.f44357g == AudioProcessor.f43946a;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void c() {
        this.f44358h = true;
        i();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    @androidx.annotation.i
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.f44357g;
        this.f44357g = AudioProcessor.f43946a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final AudioProcessor.a e(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        this.f44354d = aVar;
        this.f44355e = g(aVar);
        return isActive() ? this.f44355e : AudioProcessor.a.f43947e;
    }

    protected final boolean f() {
        return this.f44357g.hasRemaining();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void flush() {
        this.f44357g = AudioProcessor.f43946a;
        this.f44358h = false;
        this.f44352b = this.f44354d;
        this.f44353c = this.f44355e;
        h();
    }

    protected AudioProcessor.a g(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        return AudioProcessor.a.f43947e;
    }

    protected void h() {
    }

    protected void i() {
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        return this.f44355e != AudioProcessor.a.f43947e;
    }

    protected void j() {
    }

    protected final ByteBuffer k(int i10) {
        if (this.f44356f.capacity() < i10) {
            this.f44356f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f44356f.clear();
        }
        ByteBuffer byteBuffer = this.f44356f;
        this.f44357g = byteBuffer;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void reset() {
        flush();
        this.f44356f = AudioProcessor.f43946a;
        AudioProcessor.a aVar = AudioProcessor.a.f43947e;
        this.f44354d = aVar;
        this.f44355e = aVar;
        this.f44352b = aVar;
        this.f44353c = aVar;
        j();
    }
}
