package xyz.luan.audioplayers.player;

import android.media.SoundPool;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import nl.UrlSource;
import xyz.luan.audioplayers.AudioContextAndroid;

/* JADX INFO: compiled from: SoundPoolPlayer.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010'\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020(¢\u0006\u0004\bK\u0010LJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0002H\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0003H\u0016J\b\u0010\u001f\u001a\u00020\tH\u0016J\b\u0010 \u001a\u00020\tH\u0016J\b\u0010!\u001a\u00020\tH\u0016J\b\u0010\"\u001a\u00020\u0002H\u0016R\u0017\u0010'\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b\u0012\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010,R$\u00103\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0018\u00105\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010.R$\u0010;\u001a\u00020\r2\u0006\u00106\u001a\u00020\r8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b7\u00108\"\u0004\b9\u0010:R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR.\u0010E\u001a\u0004\u0018\u00010D2\b\u00106\u001a\u0004\u0018\u00010D8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J¨\u0006M"}, d2 = {"Lxyz/luan/audioplayers/player/SoundPoolPlayer;", "Lxyz/luan/audioplayers/player/j;", "", "", "n", "", "message", "", "r", "Lkotlin/b2;", "stop", "release", "pause", "Lxyz/luan/audioplayers/a;", com.umeng.analytics.pro.d.R, "b", "Lnl/b;", "source", ak.av, "", "leftVolume", "rightVolume", "d", "rate", "setRate", "looping", "setLooping", "i", RXScreenCaptureService.KEY_HEIGHT, CommonNetImpl.POSITION, "seekTo", com.google.android.exoplayer2.text.ttml.d.f49798o0, "prepare", "reset", ak.aF, "Lxyz/luan/audioplayers/player/WrappedPlayer;", "Lxyz/luan/audioplayers/player/WrappedPlayer;", "m", "()Lxyz/luan/audioplayers/player/WrappedPlayer;", "wrappedPlayer", "Lxyz/luan/audioplayers/player/l;", "Lxyz/luan/audioplayers/player/l;", "soundPoolManager", "Lkotlinx/coroutines/q0;", "Lkotlinx/coroutines/q0;", "mainScope", "Ljava/lang/Integer;", "j", "()Ljava/lang/Integer;", "p", "(Ljava/lang/Integer;)V", "soundId", "e", "streamId", "value", "f", "Lxyz/luan/audioplayers/a;", "o", "(Lxyz/luan/audioplayers/a;)V", "audioContext", "Lxyz/luan/audioplayers/player/n;", "g", "Lxyz/luan/audioplayers/player/n;", "soundPoolWrapper", "Landroid/media/SoundPool;", "k", "()Landroid/media/SoundPool;", "soundPool", "Lnl/c;", "urlSource", "Lnl/c;", "l", "()Lnl/c;", "q", "(Lnl/c;)V", "<init>", "(Lxyz/luan/audioplayers/player/WrappedPlayer;Lxyz/luan/audioplayers/player/l;)V", "audioplayers_android_release"}, k = 1, mv = {1, 7, 1})
public final class SoundPoolPlayer implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final WrappedPlayer wrappedPlayer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final l soundPoolManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final q0 mainScope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Integer soundId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Integer streamId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private AudioContextAndroid audioContext;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private n soundPoolWrapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private UrlSource f141357h;

    public SoundPoolPlayer(@dl.d WrappedPlayer wrappedPlayer, @dl.d l soundPoolManager) {
        f0.p(wrappedPlayer, "wrappedPlayer");
        f0.p(soundPoolManager, "soundPoolManager");
        this.wrappedPlayer = wrappedPlayer;
        this.soundPoolManager = soundPoolManager;
        this.mainScope = r0.a(e1.e());
        AudioContextAndroid aVarI = wrappedPlayer.getContext();
        this.audioContext = aVarI;
        soundPoolManager.b(32, aVarI);
        n nVarE = soundPoolManager.e(this.audioContext);
        if (nVarE != null) {
            this.soundPoolWrapper = nVarE;
            return;
        }
        throw new IllegalStateException(("Could not create SoundPool " + this.audioContext).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SoundPool k() {
        return this.soundPoolWrapper.getSoundPool();
    }

    private final int n(boolean z10) {
        return z10 ? -1 : 0;
    }

    private final void o(AudioContextAndroid aVar) {
        if (!f0.g(this.audioContext.a(), aVar.a())) {
            release();
            this.soundPoolManager.b(32, aVar);
            n nVarE = this.soundPoolManager.e(aVar);
            if (nVarE == null) {
                throw new IllegalStateException(("Could not create SoundPool " + aVar).toString());
            }
            this.soundPoolWrapper = nVarE;
        }
        this.audioContext = aVar;
    }

    private final Void r(String message) {
        throw new UnsupportedOperationException("LOW_LATENCY mode does not support: " + message);
    }

    @Override // xyz.luan.audioplayers.player.j
    public void a(@dl.d nl.b source) {
        f0.p(source, "source");
        source.b(this);
    }

    @Override // xyz.luan.audioplayers.player.j
    public void b(@dl.d AudioContextAndroid context) {
        f0.p(context, "context");
        o(context);
    }

    @Override // xyz.luan.audioplayers.player.j
    public boolean c() {
        return false;
    }

    @Override // xyz.luan.audioplayers.player.j
    public void d(float f10, float f11) {
        Integer num = this.streamId;
        if (num != null) {
            k().setVolume(num.intValue(), f10, f11);
        }
    }

    @Override // xyz.luan.audioplayers.player.j
    public /* bridge */ /* synthetic */ Integer getCurrentPosition() {
        return (Integer) h();
    }

    @Override // xyz.luan.audioplayers.player.j
    public /* bridge */ /* synthetic */ Integer getDuration() {
        return (Integer) i();
    }

    @dl.e
    public Void h() {
        return null;
    }

    @dl.e
    public Void i() {
        return null;
    }

    @dl.e
    /* JADX INFO: renamed from: j, reason: from getter */
    public final Integer getSoundId() {
        return this.soundId;
    }

    @dl.e
    /* JADX INFO: renamed from: l, reason: from getter */
    public final UrlSource getF141357h() {
        return this.f141357h;
    }

    @dl.d
    /* JADX INFO: renamed from: m, reason: from getter */
    public final WrappedPlayer getWrappedPlayer() {
        return this.wrappedPlayer;
    }

    public final void p(@dl.e Integer num) {
        this.soundId = num;
    }

    @Override // xyz.luan.audioplayers.player.j
    public void pause() {
        Integer num = this.streamId;
        if (num != null) {
            k().pause(num.intValue());
        }
    }

    @Override // xyz.luan.audioplayers.player.j
    public void prepare() {
    }

    public final void q(@dl.e UrlSource cVar) {
        if (cVar != null) {
            synchronized (this.soundPoolWrapper.d()) {
                Map<UrlSource, List<SoundPoolPlayer>> mapD = this.soundPoolWrapper.d();
                List<SoundPoolPlayer> arrayList = mapD.get(cVar);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    mapD.put(cVar, arrayList);
                }
                List<SoundPoolPlayer> list = arrayList;
                SoundPoolPlayer soundPoolPlayer = (SoundPoolPlayer) CollectionsKt___CollectionsKt.B2(list);
                if (soundPoolPlayer != null) {
                    boolean zP = soundPoolPlayer.wrappedPlayer.getPrepared();
                    this.wrappedPlayer.O(zP);
                    this.soundId = soundPoolPlayer.soundId;
                    this.wrappedPlayer.x("Reusing soundId " + this.soundId + " for " + cVar + " is prepared=" + zP + ' ' + this);
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    this.wrappedPlayer.O(false);
                    this.wrappedPlayer.x("Fetching actual URL for " + cVar);
                    kotlinx.coroutines.k.f(this.mainScope, e1.c(), null, new SoundPoolPlayer$urlSource$1$1(cVar, this, this, jCurrentTimeMillis, null), 2, null);
                }
                list.add(this);
            }
        }
        this.f141357h = cVar;
    }

    @Override // xyz.luan.audioplayers.player.j
    public void release() {
        stop();
        Integer num = this.soundId;
        if (num != null) {
            int iIntValue = num.intValue();
            UrlSource cVar = this.f141357h;
            if (cVar == null) {
                return;
            }
            synchronized (this.soundPoolWrapper.d()) {
                List<SoundPoolPlayer> list = this.soundPoolWrapper.d().get(cVar);
                if (list == null) {
                    return;
                }
                if (CollectionsKt___CollectionsKt.f5(list) == this) {
                    this.soundPoolWrapper.d().remove(cVar);
                    k().unload(iIntValue);
                    this.soundPoolWrapper.b().remove(Integer.valueOf(iIntValue));
                    this.wrappedPlayer.x("unloaded soundId " + iIntValue);
                } else {
                    list.remove(this);
                }
                this.soundId = null;
                q(null);
                b2 b2Var = b2.f124493a;
            }
        }
    }

    @Override // xyz.luan.audioplayers.player.j
    public void reset() {
    }

    @Override // xyz.luan.audioplayers.player.j
    public void seekTo(int i10) {
        if (i10 != 0) {
            r("seek");
            throw new KotlinNothingValueException();
        }
        Integer num = this.streamId;
        if (num != null) {
            int iIntValue = num.intValue();
            stop();
            if (this.wrappedPlayer.getPlaying()) {
                k().resume(iIntValue);
            }
        }
    }

    @Override // xyz.luan.audioplayers.player.j
    public void setLooping(boolean z10) {
        Integer num = this.streamId;
        if (num != null) {
            k().setLoop(num.intValue(), n(z10));
        }
    }

    @Override // xyz.luan.audioplayers.player.j
    public void setRate(float f10) {
        Integer num = this.streamId;
        if (num != null) {
            k().setRate(num.intValue(), f10);
        }
    }

    @Override // xyz.luan.audioplayers.player.j
    public void start() {
        Integer num = this.streamId;
        Integer num2 = this.soundId;
        if (num != null) {
            k().resume(num.intValue());
        } else if (num2 != null) {
            this.streamId = Integer.valueOf(k().play(num2.intValue(), this.wrappedPlayer.getVolume(), this.wrappedPlayer.getVolume(), 0, n(this.wrappedPlayer.z()), this.wrappedPlayer.getRate()));
        }
    }

    @Override // xyz.luan.audioplayers.player.j
    public void stop() {
        Integer num = this.streamId;
        if (num != null) {
            k().stop(num.intValue());
            this.streamId = null;
        }
    }
}
