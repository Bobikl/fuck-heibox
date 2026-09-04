package xyz.luan.audioplayers.player;

import android.content.Context;
import android.media.AudioManager;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import xyz.luan.audioplayers.AudioContextAndroid;
import xyz.luan.audioplayers.AudioplayersPlugin;
import xyz.luan.audioplayers.PlayerMode;
import xyz.luan.audioplayers.ReleaseMode;

/* JADX INFO: compiled from: WrappedPlayer.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00104\u001a\u000200\u0012\u0006\u0010:\u001a\u00020\u000f\u0012\u0006\u0010=\u001a\u00020;¢\u0006\u0004\b}\u0010~J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\f\u0010\n\u001a\u00020\u0006*\u00020\u0004H\u0002J\u001c\u0010\u000e\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fJ\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0006\u0010\u0015\u001a\u00020\u0006J\u0006\u0010\u0016\u001a\u00020\u0006J\u0006\u0010\u0017\u001a\u00020\u0006J\u0006\u0010\u0018\u001a\u00020\u0006J\u000e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0002J\u0006\u0010\u001b\u001a\u00020\u0006J\u0006\u0010\u001c\u001a\u00020\u0006J\u000e\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0002J\u0006\u0010\u001f\u001a\u00020\u0006J\u000e\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 J$\u0010&\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010 2\b\u0010$\u001a\u0004\u0018\u00010 2\b\u0010%\u001a\u0004\u0018\u00010\u0001J\u0016\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0002J\u0006\u0010+\u001a\u00020\u0006R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0017\u00104\u001a\u0002008\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u00103R\"\u0010:\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0014\u0010=\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010<R\u0018\u0010?\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010>R*\u0010\f\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010\u001f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER*\u0010\r\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010\u001f\u001a\u0004\bF\u0010C\"\u0004\bG\u0010ER*\u0010J\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010\u001f\u001a\u0004\bH\u0010C\"\u0004\bI\u0010ER*\u0010Q\u001a\u00020K2\u0006\u0010@\u001a\u00020K8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR*\u0010X\u001a\u00020R2\u0006\u0010@\u001a\u00020R8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010^\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R*\u0010a\u001a\u00020)2\u0006\u0010@\u001a\u00020)8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010Y\u001a\u0004\b_\u0010[\"\u0004\b`\u0010]R\"\u0010d\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010Y\u001a\u0004\bb\u0010[\"\u0004\bc\u0010]R\"\u0010i\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010\u0017\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u0014\u0010l\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010kR.\u0010n\u001a\u0004\u0018\u00010m2\b\u0010@\u001a\u0004\u0018\u00010m8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u0011\u0010u\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\bt\u0010[R\u0011\u0010y\u001a\u00020v8F¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0011\u0010|\u001a\u00020z8F¢\u0006\u0006\u001a\u0004\bA\u0010{¨\u0006\u007f"}, d2 = {"Lxyz/luan/audioplayers/player/WrappedPlayer;", "", "", androidx.exifinterface.media.a.W4, "Lxyz/luan/audioplayers/player/j;", "m", "Lkotlin/b2;", "b", "d", "y", ak.aF, "", com.max.xiaoheihe.module.voice.component.a.f94101q, "balance", androidx.exifinterface.media.a.X4, "Lxyz/luan/audioplayers/a;", "audioContext", "X", "k", "()Ljava/lang/Integer;", "j", "H", androidx.exifinterface.media.a.T4, "I", "G", CommonNetImpl.POSITION, "J", androidx.exifinterface.media.a.S4, "C", "percent", "B", "F", "", "message", "x", Constants.KEY_ERROR_CODE, "errorMessage", "errorDetails", RXScreenCaptureService.KEY_WIDTH, "what", "extra", "", "D", "e", "Lxyz/luan/audioplayers/AudioplayersPlugin;", ak.av, "Lxyz/luan/audioplayers/AudioplayersPlugin;", "ref", "Lxyz/luan/audioplayers/g;", "Lxyz/luan/audioplayers/g;", "l", "()Lxyz/luan/audioplayers/g;", "eventHandler", "Lxyz/luan/audioplayers/a;", "i", "()Lxyz/luan/audioplayers/a;", "L", "(Lxyz/luan/audioplayers/a;)V", com.umeng.analytics.pro.d.R, "Lxyz/luan/audioplayers/player/l;", "Lxyz/luan/audioplayers/player/l;", "soundPoolManager", "Lxyz/luan/audioplayers/player/j;", "player", "value", "g", "v", "()F", "U", "(F)V", RXScreenCaptureService.KEY_HEIGHT, "K", "q", "P", "rate", "Lxyz/luan/audioplayers/ReleaseMode;", "Lxyz/luan/audioplayers/ReleaseMode;", "r", "()Lxyz/luan/audioplayers/ReleaseMode;", "Q", "(Lxyz/luan/audioplayers/ReleaseMode;)V", "releaseMode", "Lxyz/luan/audioplayers/PlayerMode;", "Lxyz/luan/audioplayers/PlayerMode;", "n", "()Lxyz/luan/audioplayers/PlayerMode;", "M", "(Lxyz/luan/audioplayers/PlayerMode;)V", "playerMode", "Z", ak.aB, "()Z", "R", "(Z)V", "released", "p", "O", "prepared", "o", "N", "playing", "t", "()I", androidx.exifinterface.media.a.R4, "(I)V", "shouldSeekTo", "Lxyz/luan/audioplayers/player/c;", "Lxyz/luan/audioplayers/player/c;", "focusManager", "Lnl/b;", "source", "Lnl/b;", ak.aG, "()Lnl/b;", androidx.exifinterface.media.a.f23244d5, "(Lnl/b;)V", ak.aD, "isLooping", "Landroid/content/Context;", "f", "()Landroid/content/Context;", "applicationContext", "Landroid/media/AudioManager;", "()Landroid/media/AudioManager;", "audioManager", "<init>", "(Lxyz/luan/audioplayers/AudioplayersPlugin;Lxyz/luan/audioplayers/g;Lxyz/luan/audioplayers/a;Lxyz/luan/audioplayers/player/l;)V", "audioplayers_android_release"}, k = 1, mv = {1, 7, 1})
public final class WrappedPlayer {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final AudioplayersPlugin ref;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final xyz.luan.audioplayers.g eventHandler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private AudioContextAndroid context;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final l soundPoolManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private j player;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private nl.b f141375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float volume;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private float balance;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private float rate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private ReleaseMode releaseMode;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private PlayerMode playerMode;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean released;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean prepared;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean playing;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int shouldSeekTo;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final c focusManager;

    /* JADX INFO: compiled from: WrappedPlayer.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f141386a;

        static {
            int[] iArr = new int[PlayerMode.values().length];
            iArr[PlayerMode.MEDIA_PLAYER.ordinal()] = 1;
            iArr[PlayerMode.LOW_LATENCY.ordinal()] = 2;
            f141386a = iArr;
        }
    }

    public WrappedPlayer(@dl.d AudioplayersPlugin ref, @dl.d xyz.luan.audioplayers.g eventHandler, @dl.d AudioContextAndroid context, @dl.d l soundPoolManager) {
        f0.p(ref, "ref");
        f0.p(eventHandler, "eventHandler");
        f0.p(context, "context");
        f0.p(soundPoolManager, "soundPoolManager");
        this.ref = ref;
        this.eventHandler = eventHandler;
        this.context = context;
        this.soundPoolManager = soundPoolManager;
        this.volume = 1.0f;
        this.rate = 1.0f;
        this.releaseMode = ReleaseMode.RELEASE;
        this.playerMode = PlayerMode.MEDIA_PLAYER;
        this.released = true;
        this.shouldSeekTo = -1;
        this.focusManager = new c(this);
    }

    private final int A() {
        Object objB;
        try {
            Result.a aVar = Result.f124476c;
            j jVar = this.player;
            Integer currentPosition = jVar != null ? jVar.getCurrentPosition() : null;
            if (currentPosition != null && currentPosition.intValue() == 0) {
                currentPosition = null;
            }
            objB = Result.b(currentPosition);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(t0.a(th2));
        }
        Integer num = (Integer) (Result.i(objB) ? null : objB);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    private final void V(j jVar, float f10, float f11) {
        jVar.d(Math.min(1.0f, 1.0f - f11) * f10, Math.min(1.0f, f11 + 1.0f) * f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        if (this.playing || this.released) {
            return;
        }
        j jVar = this.player;
        this.playing = true;
        if (jVar == null) {
            y();
        } else if (this.prepared) {
            jVar.start();
        }
    }

    private final void c(j jVar) {
        V(jVar, this.volume, this.balance);
        jVar.setLooping(z());
        jVar.prepare();
    }

    private final j d() {
        int i10 = a.f141386a[this.playerMode.ordinal()];
        if (i10 == 1) {
            return new i(this);
        }
        if (i10 == 2) {
            return new SoundPoolPlayer(this, this.soundPoolManager);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final j m() {
        j jVar = this.player;
        if (this.released || jVar == null) {
            j jVarD = d();
            this.player = jVarD;
            this.released = false;
            return jVarD;
        }
        if (!this.prepared) {
            return jVar;
        }
        jVar.reset();
        O(false);
        return jVar;
    }

    private final void y() {
        j jVarD = d();
        this.player = jVarD;
        nl.b bVar = this.f141375f;
        if (bVar != null) {
            jVarD.a(bVar);
            c(jVarD);
        }
    }

    public final void B(int i10) {
    }

    public final void C() {
        if (this.releaseMode != ReleaseMode.LOOP) {
            W();
        }
        this.ref.i(this);
    }

    public final boolean D(int what, int extra) {
        String str;
        String str2;
        if (what == 100) {
            str = "MEDIA_ERROR_SERVER_DIED";
        } else {
            str = "MEDIA_ERROR_UNKNOWN {what:" + what + '}';
        }
        if (extra == Integer.MIN_VALUE) {
            str2 = "MEDIA_ERROR_SYSTEM";
        } else if (extra == -1010) {
            str2 = "MEDIA_ERROR_UNSUPPORTED";
        } else if (extra == -1007) {
            str2 = "MEDIA_ERROR_MALFORMED";
        } else if (extra == -1004) {
            str2 = "MEDIA_ERROR_IO";
        } else if (extra != -110) {
            str2 = "MEDIA_ERROR_UNKNOWN {extra:" + extra + '}';
        } else {
            str2 = "MEDIA_ERROR_TIMED_OUT";
        }
        if (this.prepared || !f0.g(str2, "MEDIA_ERROR_SYSTEM")) {
            O(false);
            w("AndroidAudioError", str, str2);
        } else {
            w("AndroidAudioError", "Failed to set source. For troubleshooting, see: https://github.com/bluefireteam/audioplayers/blob/main/troubleshooting.md", str + ", " + str2);
        }
        return false;
    }

    public final void E() {
        j jVar;
        j jVar2;
        O(true);
        this.ref.j(this);
        if (this.playing && (jVar2 = this.player) != null) {
            jVar2.start();
        }
        if (this.shouldSeekTo >= 0) {
            j jVar3 = this.player;
            if ((jVar3 != null && jVar3.c()) || (jVar = this.player) == null) {
                return;
            }
            jVar.seekTo(this.shouldSeekTo);
        }
    }

    public final void F() {
        this.ref.p(this);
    }

    public final void G() {
        j jVar;
        if (this.playing) {
            this.playing = false;
            if (!this.prepared || (jVar = this.player) == null) {
                return;
            }
            jVar.pause();
        }
    }

    public final void H() {
        this.focusManager.g(new WrappedPlayer$play$1(this));
    }

    public final void I() {
        j jVar;
        this.focusManager.f();
        if (this.released) {
            return;
        }
        if (this.playing && (jVar = this.player) != null) {
            jVar.stop();
        }
        T(null);
        this.player = null;
    }

    public final void J(int i10) {
        if (this.prepared) {
            j jVar = this.player;
            if (!(jVar != null && jVar.c())) {
                j jVar2 = this.player;
                if (jVar2 != null) {
                    jVar2.seekTo(i10);
                }
                i10 = -1;
            }
        }
        this.shouldSeekTo = i10;
    }

    public final void K(float f10) {
        j jVar;
        if (this.balance == f10) {
            return;
        }
        this.balance = f10;
        if (this.released || (jVar = this.player) == null) {
            return;
        }
        V(jVar, this.volume, f10);
    }

    public final void L(@dl.d AudioContextAndroid audioContextAndroid) {
        f0.p(audioContextAndroid, "<set-?>");
        this.context = audioContextAndroid;
    }

    public final void M(@dl.d PlayerMode value) {
        f0.p(value, "value");
        if (this.playerMode != value) {
            this.playerMode = value;
            j jVar = this.player;
            if (jVar != null) {
                this.shouldSeekTo = A();
                O(false);
                jVar.release();
            }
            y();
        }
    }

    public final void N(boolean z10) {
        this.playing = z10;
    }

    public final void O(boolean z10) {
        if (this.prepared != z10) {
            this.prepared = z10;
            this.ref.o(this, z10);
        }
    }

    public final void P(float f10) {
        j jVar;
        if (this.rate == f10) {
            return;
        }
        this.rate = f10;
        if (!this.playing || (jVar = this.player) == null) {
            return;
        }
        jVar.setRate(f10);
    }

    public final void Q(@dl.d ReleaseMode value) {
        j jVar;
        f0.p(value, "value");
        if (this.releaseMode != value) {
            this.releaseMode = value;
            if (this.released || (jVar = this.player) == null) {
                return;
            }
            jVar.setLooping(z());
        }
    }

    public final void R(boolean z10) {
        this.released = z10;
    }

    public final void S(int i10) {
        this.shouldSeekTo = i10;
    }

    public final void T(@dl.e nl.b bVar) {
        if (f0.g(this.f141375f, bVar)) {
            this.ref.o(this, true);
            return;
        }
        if (bVar != null) {
            j jVarM = m();
            jVarM.a(bVar);
            c(jVarM);
        } else {
            this.released = true;
            O(false);
            this.playing = false;
            j jVar = this.player;
            if (jVar != null) {
                jVar.release();
            }
        }
        this.f141375f = bVar;
    }

    public final void U(float f10) {
        j jVar;
        if (this.volume == f10) {
            return;
        }
        this.volume = f10;
        if (this.released || (jVar = this.player) == null) {
            return;
        }
        V(jVar, f10, this.balance);
    }

    public final void W() {
        this.focusManager.f();
        if (this.released) {
            return;
        }
        if (this.releaseMode == ReleaseMode.RELEASE) {
            I();
            return;
        }
        G();
        if (this.prepared) {
            j jVar = this.player;
            if (!(jVar != null && jVar.c())) {
                J(0);
                return;
            }
            j jVar2 = this.player;
            if (jVar2 != null) {
                jVar2.stop();
            }
            O(false);
            j jVar3 = this.player;
            if (jVar3 != null) {
                jVar3.prepare();
            }
        }
    }

    public final void X(@dl.d AudioContextAndroid audioContext) {
        f0.p(audioContext, "audioContext");
        if (f0.g(this.context, audioContext)) {
            return;
        }
        if (this.context.j() != 0 && audioContext.j() == 0) {
            this.focusManager.f();
        }
        this.context = AudioContextAndroid.i(audioContext, false, false, 0, 0, 0, 0, 63, null);
        g().setMode(this.context.k());
        g().setSpeakerphoneOn(this.context.p());
        j jVar = this.player;
        if (jVar != null) {
            jVar.stop();
            O(false);
            jVar.b(this.context);
            nl.b bVar = this.f141375f;
            if (bVar != null) {
                jVar.a(bVar);
                c(jVar);
            }
        }
    }

    public final void e() {
        I();
        this.eventHandler.a();
    }

    @dl.d
    public final Context f() {
        return this.ref.e();
    }

    @dl.d
    public final AudioManager g() {
        return this.ref.f();
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getBalance() {
        return this.balance;
    }

    @dl.d
    /* JADX INFO: renamed from: i, reason: from getter */
    public final AudioContextAndroid getContext() {
        return this.context;
    }

    @dl.e
    public final Integer j() {
        j jVar;
        if (!this.prepared || (jVar = this.player) == null) {
            return null;
        }
        return jVar.getCurrentPosition();
    }

    @dl.e
    public final Integer k() {
        j jVar;
        if (!this.prepared || (jVar = this.player) == null) {
            return null;
        }
        return jVar.getDuration();
    }

    @dl.d
    /* JADX INFO: renamed from: l, reason: from getter */
    public final xyz.luan.audioplayers.g getEventHandler() {
        return this.eventHandler;
    }

    @dl.d
    /* JADX INFO: renamed from: n, reason: from getter */
    public final PlayerMode getPlayerMode() {
        return this.playerMode;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getPlaying() {
        return this.playing;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getPrepared() {
        return this.prepared;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final float getRate() {
        return this.rate;
    }

    @dl.d
    /* JADX INFO: renamed from: r, reason: from getter */
    public final ReleaseMode getReleaseMode() {
        return this.releaseMode;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getReleased() {
        return this.released;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getShouldSeekTo() {
        return this.shouldSeekTo;
    }

    @dl.e
    /* JADX INFO: renamed from: u, reason: from getter */
    public final nl.b getF141375f() {
        return this.f141375f;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final float getVolume() {
        return this.volume;
    }

    public final void w(@dl.e String str, @dl.e String str2, @dl.e Object obj) {
        this.ref.k(this, str, str2, obj);
    }

    public final void x(@dl.d String message) {
        f0.p(message, "message");
        this.ref.n(this, message);
    }

    public final boolean z() {
        return this.releaseMode == ReleaseMode.LOOP;
    }
}
