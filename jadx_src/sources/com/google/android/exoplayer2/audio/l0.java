package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.b3;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: ForwardingAudioSink.java */
/* JADX INFO: loaded from: classes7.dex */
public class l0 implements AudioSink {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AudioSink f44159e;

    public l0(AudioSink audioSink) {
        this.f44159e = audioSink;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean a(a2 a2Var) {
        return this.f44159e.a(a2Var);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean b() {
        return this.f44159e.b();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void c() {
        this.f44159e.c();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean d() {
        return this.f44159e.d();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void e(b3 b3Var) {
        this.f44159e.e(b3Var);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void f(int i10) {
        this.f44159e.f(i10);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void flush() {
        this.f44159e.flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public b3 g() {
        return this.f44159e.g();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void h(x xVar) {
        this.f44159e.h(xVar);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void i(f fVar) {
        this.f44159e.i(fVar);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void j(float f10) {
        this.f44159e.j(f10);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void k(boolean z10) {
        this.f44159e.k(z10);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void l() {
        this.f44159e.l();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void m() {
        this.f44159e.m();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean n() {
        return this.f44159e.n();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean o(ByteBuffer byteBuffer, long j10, int i10) throws AudioSink.WriteException, AudioSink.InitializationException {
        return this.f44159e.o(byteBuffer, j10, i10);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void p(AudioSink.a aVar) {
        this.f44159e.p(aVar);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void pause() {
        this.f44159e.pause();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void play() {
        this.f44159e.play();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public int q(a2 a2Var) {
        return this.f44159e.q(a2Var);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void r() throws AudioSink.WriteException {
        this.f44159e.r();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void reset() {
        this.f44159e.reset();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public long s(boolean z10) {
        return this.f44159e.s(z10);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void t() {
        this.f44159e.t();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void u(a2 a2Var, int i10, @androidx.annotation.p0 int[] iArr) throws AudioSink.ConfigurationException {
        this.f44159e.u(a2Var, i10, iArr);
    }
}
