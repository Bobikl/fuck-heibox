package com.max.video.player;

import android.view.Surface;
import android.view.ViewGroup;
import bb.c;
import com.max.video.player.info.PlaybackState;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import java.util.Map;
import kotlinx.coroutines.flow.u;

/* JADX INFO: compiled from: VideoPlayer.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface a {

    /* JADX INFO: renamed from: com.max.video.player.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: VideoPlayer.kt */
    public static final class C0618a {
        public static ChangeQuickRedirect changeQuickRedirect;

        public static void a(@d a aVar) {
            if (PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, c.m.Io, new Class[]{a.class}, Void.TYPE).isSupported) {
                return;
            }
            aVar.J(0L);
            aVar.R(0L);
            aVar.G(0L);
            aVar.f0(0L);
            aVar.X(0L);
            aVar.b0(0);
        }
    }

    void A(@d ViewGroup viewGroup);

    void B(int i10);

    void C(@e String str);

    @d
    u<Float> D();

    long E();

    void F(boolean z10);

    void G(long j10);

    @d
    u<Integer> H();

    int I();

    void J(long j10);

    int K();

    @d
    u<Integer> L();

    void M(@e String str);

    void N(@d Surface surface);

    @d
    u<Integer> O();

    @d
    u<Integer> P();

    @d
    u<PlaybackState> Q();

    void R(long j10);

    long S();

    int T();

    void U(int i10);

    void V(@e String str, @e Map<String, String> map);

    @d
    u<Boolean> W();

    void X(long j10);

    long Y();

    boolean Z();

    @d
    u<PlaybackState> a();

    void a0(boolean z10);

    void b0(int i10);

    @d
    u<Integer> c0();

    void d0(int i10);

    @d
    u<String> e0();

    void f0(long j10);

    void g0();

    int getCurrentPosition();

    int getDuration();

    int getHeight();

    int getWidth();

    long h0();

    boolean isPlayable();

    boolean isPlaying();

    void pause();

    void play();

    void prepare();

    void release();

    @e
    String s();

    void setPlaybackSpeed(float f10);

    void setVolume(int i10);

    void start();

    void stop();

    void t(boolean z10);

    long u();

    void v();

    @d
    u<Boolean> w();

    void x();

    boolean y();

    void z(int i10);
}
