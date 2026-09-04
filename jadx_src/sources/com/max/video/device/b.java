package com.max.video.device;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import androidx.annotation.w0;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.o;

/* JADX INFO: compiled from: HBAudioManager.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private AudioRequestMode f75911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final AudioManager f75912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private AudioFocusRequest f75913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f75914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    private com.max.video.device.a f75915e;

    /* JADX INFO: compiled from: HBAudioManager.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f75916a;

        static {
            int[] iArr = new int[AudioRequestMode.valuesCustom().length];
            try {
                iArr[AudioRequestMode.GAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioRequestMode.DUCK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AudioRequestMode.TRANSIENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AudioRequestMode.EXCLUSIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f75916a = iArr;
        }
    }

    public b(@d Context context, @d AudioRequestMode audioRequestMode) {
        f0.p(context, "context");
        f0.p(audioRequestMode, "audioRequestMode");
        this.f75911a = audioRequestMode;
        Object systemService = context.getSystemService("audio");
        f0.n(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.f75912b = (AudioManager) systemService;
        this.f75915e = new com.max.video.device.a(this);
    }

    public /* synthetic */ b(Context context, AudioRequestMode audioRequestMode, int i10, u uVar) {
        this(context, (i10 & 2) != 0 ? AudioRequestMode.TRANSIENT : audioRequestMode);
    }

    private final AudioAttributes c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f35118wk, new Class[0], AudioAttributes.class);
        if (patchProxyResultProxy.isSupported) {
            return (AudioAttributes) patchProxyResultProxy.result;
        }
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(1).setContentType(2).build();
        f0.o(audioAttributesBuild, "build(...)");
        return audioAttributesBuild;
    }

    @w0(26)
    private final void k() {
        AudioRequestMode audioRequestMode;
        AudioFocusRequest.Builder focusGain;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f35096vk, new Class[0], Void.TYPE).isSupported || (audioRequestMode = this.f75911a) == AudioRequestMode.NONE || this.f75914d) {
            return;
        }
        int i10 = a.f75916a[audioRequestMode.ordinal()];
        if (i10 == 1) {
            focusGain = new AudioFocusRequest.Builder(1).setFocusGain(1);
        } else if (i10 == 2) {
            focusGain = new AudioFocusRequest.Builder(3).setFocusGain(3);
        } else if (i10 == 3) {
            focusGain = new AudioFocusRequest.Builder(2).setFocusGain(2);
        } else if (i10 != 4) {
            return;
        } else {
            focusGain = new AudioFocusRequest.Builder(4).setFocusGain(4);
        }
        AudioFocusRequest audioFocusRequestBuild = focusGain.setAudioAttributes(c()).setOnAudioFocusChangeListener(this.f75915e).setAcceptsDelayedFocusGain(false).build();
        this.f75912b.requestAudioFocus(audioFocusRequestBuild);
        this.f75913c = audioFocusRequestBuild;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    private final void l() {
        AudioRequestMode audioRequestMode;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f35074uk, new Class[0], Void.TYPE).isSupported || (audioRequestMode = this.f75911a) == AudioRequestMode.NONE || this.f75914d) {
            return;
        }
        int i10 = a.f75916a[audioRequestMode.ordinal()];
        int i11 = 4;
        if (i10 == 1) {
            i11 = 1;
        } else if (i10 == 2) {
            i11 = 3;
        } else if (i10 == 3) {
            i11 = 2;
        } else if (i10 != 4) {
            i11 = 1;
        }
        this.f75912b.requestAudioFocus(this.f75915e, 3, i11);
    }

    public final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34940ok, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        g.a aVar = g.f74531b;
        g gVarH = aVar.H();
        if (gVarH != null) {
            gVarH.a0("放弃音频焦点----------------");
        }
        try {
            if (Build.VERSION.SDK_INT < 26) {
                this.f75912b.abandonAudioFocus(this.f75915e);
                g gVarH2 = aVar.H();
                if (gVarH2 != null) {
                    gVarH2.a0("执行放弃音频焦点BeforeO");
                    return;
                }
                return;
            }
            AudioFocusRequest audioFocusRequest = this.f75913c;
            if (audioFocusRequest != null) {
                this.f75912b.abandonAudioFocusRequest(audioFocusRequest);
                this.f75913c = null;
                g gVarH3 = aVar.H();
                if (gVarH3 != null) {
                    gVarH3.a0("执行放弃音频焦点AfterO");
                }
            }
        } catch (Exception e10) {
            g gVarH4 = g.f74531b.H();
            if (gVarH4 != null) {
                gVarH4.L(o.i(e10));
            }
        }
    }

    public final void b(@d Context context, @d com.max.video.player.a player) {
        if (PatchProxy.proxy(new Object[]{context, player}, this, changeQuickRedirect, false, bb.c.m.f34871lk, new Class[]{Context.class, com.max.video.player.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(player, "player");
        this.f75915e.a(context, player);
    }

    public final int d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34963pk, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        return (e() * 100) / f();
    }

    public final int e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34986qk, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f75912b.getStreamVolume(3);
    }

    public final int f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f35008rk, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f75912b.getStreamMaxVolume(3);
    }

    @d
    public final com.max.video.device.a g() {
        return this.f75915e;
    }

    public final void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34894mk, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f75914d = true;
        a();
    }

    public final void i() {
        this.f75914d = false;
    }

    public final void j() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34917nk, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        g gVarH = g.f74531b.H();
        if (gVarH != null) {
            gVarH.a0("请求音频焦点");
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                k();
            } else {
                l();
            }
        } catch (Exception e10) {
            g gVarH2 = g.f74531b.H();
            if (gVarH2 != null) {
                gVarH2.L(o.i(e10));
            }
        }
    }

    public final void m(@d com.max.video.device.a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, bb.c.m.f34848kk, new Class[]{com.max.video.device.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(aVar, "<set-?>");
        this.f75915e = aVar;
    }

    public final void n(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.f35030sk, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        o((i10 * f()) / 100);
    }

    public final void o(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.f35052tk, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75912b.setStreamVolume(3, i10 % (f() + 1), 4);
    }
}
