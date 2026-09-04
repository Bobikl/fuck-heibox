package com.max.xiaoheihe.module.voice.component;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: HeyboxMicService.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class e {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f94107f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private AtomicBoolean f94108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private AtomicBoolean f94109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private AtomicBoolean f94110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private AtomicBoolean f94111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final AtomicBoolean f94112e;

    public e() {
        this(null, null, null, null, null, 31, null);
    }

    public e(@dl.d AtomicBoolean isStreamStarted, @dl.d AtomicBoolean streamShouldStop, @dl.d AtomicBoolean isAudioStarted, @dl.d AtomicBoolean audioShouldStop, @dl.d AtomicBoolean isMuted) {
        f0.p(isStreamStarted, "isStreamStarted");
        f0.p(streamShouldStop, "streamShouldStop");
        f0.p(isAudioStarted, "isAudioStarted");
        f0.p(audioShouldStop, "audioShouldStop");
        f0.p(isMuted, "isMuted");
        this.f94108a = isStreamStarted;
        this.f94109b = streamShouldStop;
        this.f94110c = isAudioStarted;
        this.f94111d = audioShouldStop;
        this.f94112e = isMuted;
    }

    public /* synthetic */ e(AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, AtomicBoolean atomicBoolean3, AtomicBoolean atomicBoolean4, AtomicBoolean atomicBoolean5, int i10, u uVar) {
        this((i10 & 1) != 0 ? new AtomicBoolean(false) : atomicBoolean, (i10 & 2) != 0 ? new AtomicBoolean(false) : atomicBoolean2, (i10 & 4) != 0 ? new AtomicBoolean(false) : atomicBoolean3, (i10 & 8) != 0 ? new AtomicBoolean(false) : atomicBoolean4, (i10 & 16) != 0 ? new AtomicBoolean(false) : atomicBoolean5);
    }

    public static /* synthetic */ e g(e eVar, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, AtomicBoolean atomicBoolean3, AtomicBoolean atomicBoolean4, AtomicBoolean atomicBoolean5, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eVar, atomicBoolean, atomicBoolean2, atomicBoolean3, atomicBoolean4, atomicBoolean5, new Integer(i10), obj}, null, changeQuickRedirect, true, 46798, new Class[]{e.class, AtomicBoolean.class, AtomicBoolean.class, AtomicBoolean.class, AtomicBoolean.class, AtomicBoolean.class, Integer.TYPE, Object.class}, e.class);
        if (patchProxyResultProxy.isSupported) {
            return (e) patchProxyResultProxy.result;
        }
        return eVar.f((i10 & 1) != 0 ? eVar.f94108a : atomicBoolean, (i10 & 2) != 0 ? eVar.f94109b : atomicBoolean2, (i10 & 4) != 0 ? eVar.f94110c : atomicBoolean3, (i10 & 8) != 0 ? eVar.f94111d : atomicBoolean4, (i10 & 16) != 0 ? eVar.f94112e : atomicBoolean5);
    }

    @dl.d
    public final AtomicBoolean a() {
        return this.f94108a;
    }

    @dl.d
    public final AtomicBoolean b() {
        return this.f94109b;
    }

    @dl.d
    public final AtomicBoolean c() {
        return this.f94110c;
    }

    @dl.d
    public final AtomicBoolean d() {
        return this.f94111d;
    }

    @dl.d
    public final AtomicBoolean e() {
        return this.f94112e;
    }

    public boolean equals(@dl.e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46801, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return f0.g(this.f94108a, eVar.f94108a) && f0.g(this.f94109b, eVar.f94109b) && f0.g(this.f94110c, eVar.f94110c) && f0.g(this.f94111d, eVar.f94111d) && f0.g(this.f94112e, eVar.f94112e);
    }

    @dl.d
    public final e f(@dl.d AtomicBoolean isStreamStarted, @dl.d AtomicBoolean streamShouldStop, @dl.d AtomicBoolean isAudioStarted, @dl.d AtomicBoolean audioShouldStop, @dl.d AtomicBoolean isMuted) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{isStreamStarted, streamShouldStop, isAudioStarted, audioShouldStop, isMuted}, this, changeQuickRedirect, false, 46797, new Class[]{AtomicBoolean.class, AtomicBoolean.class, AtomicBoolean.class, AtomicBoolean.class, AtomicBoolean.class}, e.class);
        if (patchProxyResultProxy.isSupported) {
            return (e) patchProxyResultProxy.result;
        }
        f0.p(isStreamStarted, "isStreamStarted");
        f0.p(streamShouldStop, "streamShouldStop");
        f0.p(isAudioStarted, "isAudioStarted");
        f0.p(audioShouldStop, "audioShouldStop");
        f0.p(isMuted, "isMuted");
        return new e(isStreamStarted, streamShouldStop, isAudioStarted, audioShouldStop, isMuted);
    }

    @dl.d
    public final AtomicBoolean h() {
        return this.f94111d;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46800, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (((((((this.f94108a.hashCode() * 31) + this.f94109b.hashCode()) * 31) + this.f94110c.hashCode()) * 31) + this.f94111d.hashCode()) * 31) + this.f94112e.hashCode();
    }

    @dl.d
    public final AtomicBoolean i() {
        return this.f94109b;
    }

    @dl.d
    public final AtomicBoolean j() {
        return this.f94110c;
    }

    @dl.d
    public final AtomicBoolean k() {
        return this.f94112e;
    }

    @dl.d
    public final AtomicBoolean l() {
        return this.f94108a;
    }

    public final void m(@dl.d AtomicBoolean atomicBoolean) {
        if (PatchProxy.proxy(new Object[]{atomicBoolean}, this, changeQuickRedirect, false, 46796, new Class[]{AtomicBoolean.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(atomicBoolean, "<set-?>");
        this.f94111d = atomicBoolean;
    }

    public final void n(@dl.d AtomicBoolean atomicBoolean) {
        if (PatchProxy.proxy(new Object[]{atomicBoolean}, this, changeQuickRedirect, false, 46795, new Class[]{AtomicBoolean.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(atomicBoolean, "<set-?>");
        this.f94110c = atomicBoolean;
    }

    public final void o(@dl.d AtomicBoolean atomicBoolean) {
        if (PatchProxy.proxy(new Object[]{atomicBoolean}, this, changeQuickRedirect, false, 46794, new Class[]{AtomicBoolean.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(atomicBoolean, "<set-?>");
        this.f94109b = atomicBoolean;
    }

    public final void p(@dl.d AtomicBoolean atomicBoolean) {
        if (PatchProxy.proxy(new Object[]{atomicBoolean}, this, changeQuickRedirect, false, 46793, new Class[]{AtomicBoolean.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(atomicBoolean, "<set-?>");
        this.f94108a = atomicBoolean;
    }

    @dl.d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46799, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ServiceStates(isStreamStarted=" + this.f94108a + ", streamShouldStop=" + this.f94109b + ", isAudioStarted=" + this.f94110c + ", audioShouldStop=" + this.f94111d + ", isMuted=" + this.f94112e + ')';
    }
}
