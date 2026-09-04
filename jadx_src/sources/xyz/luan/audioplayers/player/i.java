package xyz.luan.audioplayers.player;

import android.media.MediaPlayer;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import xyz.luan.audioplayers.AudioContextAndroid;

/* JADX INFO: compiled from: MediaPlayerPlayer.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\rH\u0016J\b\u0010\u0018\u001a\u00020\rH\u0016J\b\u0010\u0019\u001a\u00020\rH\u0016J\b\u0010\u001a\u001a\u00020\rH\u0016J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0006H\u0016J\u0010\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010 \u001a\u00020\rH\u0016J\b\u0010!\u001a\u00020\rH\u0016J\b\u0010\"\u001a\u00020\u0014H\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010#R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010$¨\u0006("}, d2 = {"Lxyz/luan/audioplayers/player/i;", "Lxyz/luan/audioplayers/player/j;", "Lxyz/luan/audioplayers/player/WrappedPlayer;", "wrappedPlayer", "Landroid/media/MediaPlayer;", "j", "", "getDuration", "()Ljava/lang/Integer;", "getCurrentPosition", "", "leftVolume", "rightVolume", "Lkotlin/b2;", "d", "rate", "setRate", "Lnl/b;", "source", ak.av, "", "looping", "setLooping", com.google.android.exoplayer2.text.ttml.d.f49798o0, "pause", "stop", "release", CommonNetImpl.POSITION, "seekTo", "Lxyz/luan/audioplayers/a;", com.umeng.analytics.pro.d.R, "b", "prepare", "reset", ak.aF, "Lxyz/luan/audioplayers/player/WrappedPlayer;", "Landroid/media/MediaPlayer;", "mediaPlayer", "<init>", "(Lxyz/luan/audioplayers/player/WrappedPlayer;)V", "audioplayers_android_release"}, k = 1, mv = {1, 7, 1})
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final WrappedPlayer wrappedPlayer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final MediaPlayer mediaPlayer;

    public i(@dl.d WrappedPlayer wrappedPlayer) {
        f0.p(wrappedPlayer, "wrappedPlayer");
        this.wrappedPlayer = wrappedPlayer;
        this.mediaPlayer = j(wrappedPlayer);
    }

    private final MediaPlayer j(final WrappedPlayer wrappedPlayer) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: xyz.luan.audioplayers.player.d
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                i.k(wrappedPlayer, mediaPlayer2);
            }
        });
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: xyz.luan.audioplayers.player.e
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                i.l(wrappedPlayer, mediaPlayer2);
            }
        });
        mediaPlayer.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: xyz.luan.audioplayers.player.f
            @Override // android.media.MediaPlayer.OnSeekCompleteListener
            public final void onSeekComplete(MediaPlayer mediaPlayer2) {
                i.m(wrappedPlayer, mediaPlayer2);
            }
        });
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: xyz.luan.audioplayers.player.g
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i10, int i11) {
                return i.n(wrappedPlayer, mediaPlayer2, i10, i11);
            }
        });
        mediaPlayer.setOnBufferingUpdateListener(new MediaPlayer.OnBufferingUpdateListener() { // from class: xyz.luan.audioplayers.player.h
            @Override // android.media.MediaPlayer.OnBufferingUpdateListener
            public final void onBufferingUpdate(MediaPlayer mediaPlayer2, int i10) {
                i.o(wrappedPlayer, mediaPlayer2, i10);
            }
        });
        wrappedPlayer.getContext().q(mediaPlayer);
        return mediaPlayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(WrappedPlayer wrappedPlayer, MediaPlayer mediaPlayer) {
        f0.p(wrappedPlayer, "$wrappedPlayer");
        wrappedPlayer.E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(WrappedPlayer wrappedPlayer, MediaPlayer mediaPlayer) {
        f0.p(wrappedPlayer, "$wrappedPlayer");
        wrappedPlayer.C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(WrappedPlayer wrappedPlayer, MediaPlayer mediaPlayer) {
        f0.p(wrappedPlayer, "$wrappedPlayer");
        wrappedPlayer.F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(WrappedPlayer wrappedPlayer, MediaPlayer mediaPlayer, int i10, int i11) {
        f0.p(wrappedPlayer, "$wrappedPlayer");
        return wrappedPlayer.D(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(WrappedPlayer wrappedPlayer, MediaPlayer mediaPlayer, int i10) {
        f0.p(wrappedPlayer, "$wrappedPlayer");
        wrappedPlayer.B(i10);
    }

    @Override // xyz.luan.audioplayers.player.j
    public void a(@dl.d nl.b source) {
        f0.p(source, "source");
        reset();
        source.a(this.mediaPlayer);
    }

    @Override // xyz.luan.audioplayers.player.j
    public void b(@dl.d AudioContextAndroid context) {
        f0.p(context, "context");
        context.q(this.mediaPlayer);
        if (context.m()) {
            this.mediaPlayer.setWakeMode(this.wrappedPlayer.f(), 1);
        }
    }

    @Override // xyz.luan.audioplayers.player.j
    public boolean c() {
        Integer duration = getDuration();
        return duration == null || duration.intValue() == 0;
    }

    @Override // xyz.luan.audioplayers.player.j
    public void d(float f10, float f11) {
        this.mediaPlayer.setVolume(f10, f11);
    }

    @Override // xyz.luan.audioplayers.player.j
    @dl.d
    public Integer getCurrentPosition() {
        return Integer.valueOf(this.mediaPlayer.getCurrentPosition());
    }

    @Override // xyz.luan.audioplayers.player.j
    @dl.e
    public Integer getDuration() {
        Integer numValueOf = Integer.valueOf(this.mediaPlayer.getDuration());
        if (numValueOf.intValue() == -1) {
            return null;
        }
        return numValueOf;
    }

    @Override // xyz.luan.audioplayers.player.j
    public void pause() {
        this.mediaPlayer.pause();
    }

    @Override // xyz.luan.audioplayers.player.j
    public void prepare() {
        this.mediaPlayer.prepareAsync();
    }

    @Override // xyz.luan.audioplayers.player.j
    public void release() {
        this.mediaPlayer.reset();
        this.mediaPlayer.release();
    }

    @Override // xyz.luan.audioplayers.player.j
    public void reset() {
        this.mediaPlayer.reset();
    }

    @Override // xyz.luan.audioplayers.player.j
    public void seekTo(int i10) {
        this.mediaPlayer.seekTo(i10);
    }

    @Override // xyz.luan.audioplayers.player.j
    public void setLooping(boolean z10) {
        this.mediaPlayer.setLooping(z10);
    }

    @Override // xyz.luan.audioplayers.player.j
    public void setRate(float f10) {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(f10));
    }

    @Override // xyz.luan.audioplayers.player.j
    public void start() {
        setRate(this.wrappedPlayer.getRate());
    }

    @Override // xyz.luan.audioplayers.player.j
    public void stop() {
        this.mediaPlayer.stop();
    }
}
