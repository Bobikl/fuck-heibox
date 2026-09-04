package xyz.luan.audioplayers.player;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import androidx.annotation.w0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import xyz.luan.audioplayers.AudioContextAndroid;

/* JADX INFO: compiled from: FocusManager.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003J\u001e\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0014\u0010\n\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u000b\u001a\u00020\u0003R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001d¨\u0006!"}, d2 = {"Lxyz/luan/audioplayers/player/c;", "", "Lkotlin/Function0;", "Lkotlin/b2;", "andThen", RXScreenCaptureService.KEY_HEIGHT, "j", "", "result", "e", "g", "f", "Lxyz/luan/audioplayers/player/WrappedPlayer;", ak.av, "Lxyz/luan/audioplayers/player/WrappedPlayer;", "player", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "b", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "audioFocusChangeListener", "Landroid/media/AudioFocusRequest;", ak.aF, "Landroid/media/AudioFocusRequest;", "audioFocusRequest", "Lxyz/luan/audioplayers/a;", "d", "()Lxyz/luan/audioplayers/a;", com.umeng.analytics.pro.d.R, "Landroid/media/AudioManager;", "()Landroid/media/AudioManager;", "audioManager", "<init>", "(Lxyz/luan/audioplayers/player/WrappedPlayer;)V", "audioplayers_android_release"}, k = 1, mv = {1, 7, 1})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final WrappedPlayer player;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private AudioManager.OnAudioFocusChangeListener audioFocusChangeListener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private AudioFocusRequest audioFocusRequest;

    public c(@dl.d WrappedPlayer player) {
        f0.p(player, "player");
        this.player = player;
    }

    private final AudioManager c() {
        return this.player.g();
    }

    private final AudioContextAndroid d() {
        return this.player.getContext();
    }

    private final void e(int i10, yh.a<b2> aVar) {
        if (i10 == 1) {
            aVar.invoke();
        }
    }

    @w0(26)
    private final void h(final yh.a<b2> aVar) {
        AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(d().j()).setAudioAttributes(d().a()).setOnAudioFocusChangeListener(new AudioManager.OnAudioFocusChangeListener() { // from class: xyz.luan.audioplayers.player.a
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i10) {
                c.i(this.f141387b, aVar, i10);
            }
        }).build();
        this.audioFocusRequest = audioFocusRequestBuild;
        e(c().requestAudioFocus(audioFocusRequestBuild), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(c this$0, yh.a andThen, int i10) {
        f0.p(this$0, "this$0");
        f0.p(andThen, "$andThen");
        this$0.e(i10, andThen);
    }

    @kotlin.k(message = "Use requestAudioFocus instead")
    private final void j(final yh.a<b2> aVar) {
        int iJ = d().j();
        this.audioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: xyz.luan.audioplayers.player.b
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i10) {
                c.k(this.f141389b, aVar, i10);
            }
        };
        e(c().requestAudioFocus(this.audioFocusChangeListener, 3, iJ), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(c this$0, yh.a andThen, int i10) {
        f0.p(this$0, "this$0");
        f0.p(andThen, "$andThen");
        this$0.e(i10, andThen);
    }

    public final void f() {
        if (d().j() != 0) {
            if (Build.VERSION.SDK_INT < 26) {
                c().abandonAudioFocus(this.audioFocusChangeListener);
                return;
            }
            AudioFocusRequest audioFocusRequest = this.audioFocusRequest;
            if (audioFocusRequest != null) {
                c().abandonAudioFocusRequest(audioFocusRequest);
            }
        }
    }

    public final void g(@dl.d yh.a<b2> andThen) {
        f0.p(andThen, "andThen");
        if (d().j() == 0) {
            andThen.invoke();
        } else if (Build.VERSION.SDK_INT >= 26) {
            h(andThen);
        } else {
            j(andThen);
        }
    }
}
