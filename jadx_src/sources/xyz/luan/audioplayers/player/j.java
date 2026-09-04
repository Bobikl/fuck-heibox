package xyz.luan.audioplayers.player;

import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import kotlin.Metadata;
import xyz.luan.audioplayers.AudioContextAndroid;

/* JADX INFO: compiled from: Player.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\bH&J\b\u0010\n\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\bH&J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H&J\b\u0010\u000e\u001a\u00020\bH&J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH&J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000fH&J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0006H&J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H&J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH&J\b\u0010\u001d\u001a\u00020\bH&J\b\u0010\u001e\u001a\u00020\bH&¨\u0006\u001f"}, d2 = {"Lxyz/luan/audioplayers/player/j;", "", "", "getDuration", "()Ljava/lang/Integer;", "getCurrentPosition", "", ak.aF, "Lkotlin/b2;", com.google.android.exoplayer2.text.ttml.d.f49798o0, "pause", "stop", CommonNetImpl.POSITION, "seekTo", "release", "", "leftVolume", "rightVolume", "d", "rate", "setRate", "looping", "setLooping", "Lxyz/luan/audioplayers/a;", com.umeng.analytics.pro.d.R, "b", "Lnl/b;", "source", ak.av, "prepare", "reset", "audioplayers_android_release"}, k = 1, mv = {1, 7, 1})
public interface j {
    void a(@dl.d nl.b bVar);

    void b(@dl.d AudioContextAndroid audioContextAndroid);

    boolean c();

    void d(float f10, float f11);

    @dl.e
    Integer getCurrentPosition();

    @dl.e
    Integer getDuration();

    void pause();

    void prepare();

    void release();

    void reset();

    void seekTo(int i10);

    void setLooping(boolean z10);

    void setRate(float f10);

    void start();

    void stop();
}
