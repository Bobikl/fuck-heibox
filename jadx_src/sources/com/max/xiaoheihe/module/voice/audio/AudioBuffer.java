package com.max.xiaoheihe.module.voice.audio;

import androidx.compose.runtime.internal.o;
import bb.c;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.ConcurrentModificationException;
import kotlin.Pair;
import kotlin.b2;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.m;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.x1;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: AudioBuffer.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nAudioBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioBuffer.kt\ncom/max/xiaoheihe/module/voice/audio/AudioBuffer\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n*L\n1#1,132:1\n107#2,10:133\n107#2,10:143\n107#2,10:153\n29#3:163\n5#3,2:164\n22#3:166\n7#3:167\n*S KotlinDebug\n*F\n+ 1 AudioBuffer.kt\ncom/max/xiaoheihe/module/voice/audio/AudioBuffer\n*L\n64#1:133,10\n70#1:143,10\n76#1:153,10\n104#1:163\n104#1:164,2\n104#1:166\n104#1:167\n*E\n"})
@o(parameters = 0)
public final class AudioBuffer {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f93965h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f93966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f93967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f93968c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e
    private byte[] f93971f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f93969d = c.f.Yc;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    private final byte[] f93970e = new byte[c.f.Yc];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d
    private final kotlinx.coroutines.sync.c f93972g = MutexKt.b(false, 1, null);

    private final byte f(short s10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Short(s10)}, this, changeQuickRedirect, false, 46700, new Class[]{Short.TYPE}, Byte.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Byte) patchProxyResultProxy.result).byteValue();
        }
        int i10 = ((s10 & x1.f128661e) - 32767) / 256;
        if (Math.abs(Math.abs(i10) - 127) < 5) {
            return (byte) 127;
        }
        return (byte) (((i10 - 127) * 5) + 127);
    }

    public final int a(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 46699, new Class[]{cls, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (i11 <= i10) {
            return 0;
        }
        Short shRl = ArraysKt___ArraysKt.rl(a.d(m.G1(this.f93970e, i10, i11)));
        return (int) ((((f(shRl != null ? shRl.shortValue() : (short) 0) & 255) - 128.0f) / 128.0f) * 100);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    @e
    public final Object b(@d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        AudioBuffer$clear$1 audioBuffer$clear$1;
        AudioBuffer audioBuffer;
        kotlinx.coroutines.sync.c cVar2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 46698, new Class[]{kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        if (cVar instanceof AudioBuffer$clear$1) {
            audioBuffer$clear$1 = (AudioBuffer$clear$1) cVar;
            int i10 = audioBuffer$clear$1.f93977f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                audioBuffer$clear$1.f93977f = i10 - Integer.MIN_VALUE;
            } else {
                audioBuffer$clear$1 = new AudioBuffer$clear$1(this, cVar);
            }
        } else {
            audioBuffer$clear$1 = new AudioBuffer$clear$1(this, cVar);
        }
        Object obj = audioBuffer$clear$1.f93975d;
        Object objH = b.h();
        int i11 = audioBuffer$clear$1.f93977f;
        if (i11 == 0) {
            kotlin.t0.n(obj);
            kotlinx.coroutines.sync.c cVar3 = this.f93972g;
            audioBuffer$clear$1.f93973b = this;
            audioBuffer$clear$1.f93974c = cVar3;
            audioBuffer$clear$1.f93977f = 1;
            if (cVar3.e(null, audioBuffer$clear$1) == objH) {
                return objH;
            }
            audioBuffer = this;
            cVar2 = cVar3;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar2 = (kotlinx.coroutines.sync.c) audioBuffer$clear$1.f93974c;
            audioBuffer = (AudioBuffer) audioBuffer$clear$1.f93973b;
            kotlin.t0.n(obj);
        }
        try {
            audioBuffer.f93966a = 0;
            audioBuffer.f93967b = 0;
            audioBuffer.f93968c = 0;
            return b2.f124493a;
        } finally {
            cVar2.f(null);
        }
    }

    public final void c(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 46691, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f93966a = (this.f93966a + i10) % this.f93969d;
        int i11 = this.f93968c;
        this.f93968c = i11 - Math.min(i10, i11);
        if (!this.f93972g.b()) {
            throw new ConcurrentModificationException();
        }
        kotlinx.coroutines.sync.c.a.d(this.f93972g, null, 1, null);
    }

    public final void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46695, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f93971f = null;
        kotlinx.coroutines.sync.c.a.d(this.f93972g, null, 1, null);
    }

    public final void e(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 46693, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int i11 = this.f93967b + i10;
        int i12 = this.f93969d;
        this.f93967b = i11 % i12;
        this.f93968c = Math.min(this.f93968c + i10, i12);
        kotlinx.coroutines.sync.c.a.d(this.f93972g, null, 1, null);
    }

    @d
    public final byte[] g() {
        return this.f93970e;
    }

    public final int h() {
        return this.f93969d;
    }

    @e
    public final byte[] i() {
        return this.f93971f;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    @e
    public final Object j(@d kotlin.coroutines.c<? super Boolean> cVar) throws Throwable {
        AudioBuffer$isEmpty$1 audioBuffer$isEmpty$1;
        AudioBuffer audioBuffer;
        kotlinx.coroutines.sync.c cVar2;
        boolean z10 = true;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 46697, new Class[]{kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        if (cVar instanceof AudioBuffer$isEmpty$1) {
            audioBuffer$isEmpty$1 = (AudioBuffer$isEmpty$1) cVar;
            int i10 = audioBuffer$isEmpty$1.f93982f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                audioBuffer$isEmpty$1.f93982f = i10 - Integer.MIN_VALUE;
            } else {
                audioBuffer$isEmpty$1 = new AudioBuffer$isEmpty$1(this, cVar);
            }
        } else {
            audioBuffer$isEmpty$1 = new AudioBuffer$isEmpty$1(this, cVar);
        }
        Object obj = audioBuffer$isEmpty$1.f93980d;
        Object objH = b.h();
        int i11 = audioBuffer$isEmpty$1.f93982f;
        if (i11 == 0) {
            kotlin.t0.n(obj);
            kotlinx.coroutines.sync.c cVar3 = this.f93972g;
            audioBuffer$isEmpty$1.f93978b = this;
            audioBuffer$isEmpty$1.f93979c = cVar3;
            audioBuffer$isEmpty$1.f93982f = 1;
            if (cVar3.e(null, audioBuffer$isEmpty$1) == objH) {
                return objH;
            }
            audioBuffer = this;
            cVar2 = cVar3;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar2 = (kotlinx.coroutines.sync.c) audioBuffer$isEmpty$1.f93979c;
            audioBuffer = (AudioBuffer) audioBuffer$isEmpty$1.f93978b;
            kotlin.t0.n(obj);
        }
        try {
            if (audioBuffer.f93968c != 0) {
                z10 = false;
            }
            return kotlin.coroutines.jvm.internal.a.a(z10);
        } finally {
            cVar2.f(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041  */
    @e
    public final Object k(int i10, @d kotlin.coroutines.c<? super Pair<Integer, Integer>> cVar) throws Throwable {
        AudioBuffer$openReadRegion$1 audioBuffer$openReadRegion$1;
        AudioBuffer audioBuffer;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), cVar}, this, changeQuickRedirect, false, 46690, new Class[]{Integer.TYPE, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        if (cVar instanceof AudioBuffer$openReadRegion$1) {
            audioBuffer$openReadRegion$1 = (AudioBuffer$openReadRegion$1) cVar;
            int i11 = audioBuffer$openReadRegion$1.f93987f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                audioBuffer$openReadRegion$1.f93987f = i11 - Integer.MIN_VALUE;
            } else {
                audioBuffer$openReadRegion$1 = new AudioBuffer$openReadRegion$1(this, cVar);
            }
        } else {
            audioBuffer$openReadRegion$1 = new AudioBuffer$openReadRegion$1(this, cVar);
        }
        Object obj = audioBuffer$openReadRegion$1.f93985d;
        Object objH = b.h();
        int i12 = audioBuffer$openReadRegion$1.f93987f;
        if (i12 == 0) {
            kotlin.t0.n(obj);
            kotlinx.coroutines.sync.c cVar2 = this.f93972g;
            audioBuffer$openReadRegion$1.f93983b = this;
            audioBuffer$openReadRegion$1.f93984c = i10;
            audioBuffer$openReadRegion$1.f93987f = 1;
            if (kotlinx.coroutines.sync.c.a.b(cVar2, null, audioBuffer$openReadRegion$1, 1, null) == objH) {
                return objH;
            }
            audioBuffer = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = audioBuffer$openReadRegion$1.f93984c;
            audioBuffer = (AudioBuffer) audioBuffer$openReadRegion$1.f93983b;
            kotlin.t0.n(obj);
        }
        return new Pair(kotlin.coroutines.jvm.internal.a.f(Math.min(Math.min(i10, audioBuffer.f93968c), audioBuffer.f93969d - audioBuffer.f93966a)), kotlin.coroutines.jvm.internal.a.f(audioBuffer.f93966a));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    @e
    public final Object l(@d byte[] bArr, @d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        AudioBuffer$openWriteMsg$1 audioBuffer$openWriteMsg$1;
        AudioBuffer audioBuffer;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bArr, cVar}, this, changeQuickRedirect, false, 46694, new Class[]{byte[].class, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        if (cVar instanceof AudioBuffer$openWriteMsg$1) {
            audioBuffer$openWriteMsg$1 = (AudioBuffer$openWriteMsg$1) cVar;
            int i10 = audioBuffer$openWriteMsg$1.f93992f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                audioBuffer$openWriteMsg$1.f93992f = i10 - Integer.MIN_VALUE;
            } else {
                audioBuffer$openWriteMsg$1 = new AudioBuffer$openWriteMsg$1(this, cVar);
            }
        } else {
            audioBuffer$openWriteMsg$1 = new AudioBuffer$openWriteMsg$1(this, cVar);
        }
        Object obj = audioBuffer$openWriteMsg$1.f93990d;
        Object objH = b.h();
        int i11 = audioBuffer$openWriteMsg$1.f93992f;
        if (i11 == 0) {
            kotlin.t0.n(obj);
            kotlinx.coroutines.sync.c cVar2 = this.f93972g;
            audioBuffer$openWriteMsg$1.f93988b = this;
            audioBuffer$openWriteMsg$1.f93989c = bArr;
            audioBuffer$openWriteMsg$1.f93992f = 1;
            if (kotlinx.coroutines.sync.c.a.b(cVar2, null, audioBuffer$openWriteMsg$1, 1, null) == objH) {
                return objH;
            }
            audioBuffer = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArr = (byte[]) audioBuffer$openWriteMsg$1.f93989c;
            audioBuffer = (AudioBuffer) audioBuffer$openWriteMsg$1.f93988b;
            kotlin.t0.n(obj);
        }
        audioBuffer.f93971f = bArr;
        return b2.f124493a;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041  */
    @e
    public final Object m(int i10, @d kotlin.coroutines.c<? super Pair<Integer, Integer>> cVar) throws Throwable {
        AudioBuffer$openWriteRegion$1 audioBuffer$openWriteRegion$1;
        AudioBuffer audioBuffer;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), cVar}, this, changeQuickRedirect, false, 46692, new Class[]{Integer.TYPE, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        if (cVar instanceof AudioBuffer$openWriteRegion$1) {
            audioBuffer$openWriteRegion$1 = (AudioBuffer$openWriteRegion$1) cVar;
            int i11 = audioBuffer$openWriteRegion$1.f93997f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                audioBuffer$openWriteRegion$1.f93997f = i11 - Integer.MIN_VALUE;
            } else {
                audioBuffer$openWriteRegion$1 = new AudioBuffer$openWriteRegion$1(this, cVar);
            }
        } else {
            audioBuffer$openWriteRegion$1 = new AudioBuffer$openWriteRegion$1(this, cVar);
        }
        Object obj = audioBuffer$openWriteRegion$1.f93995d;
        Object objH = b.h();
        int i12 = audioBuffer$openWriteRegion$1.f93997f;
        if (i12 == 0) {
            kotlin.t0.n(obj);
            kotlinx.coroutines.sync.c cVar2 = this.f93972g;
            audioBuffer$openWriteRegion$1.f93993b = this;
            audioBuffer$openWriteRegion$1.f93994c = i10;
            audioBuffer$openWriteRegion$1.f93997f = 1;
            if (kotlinx.coroutines.sync.c.a.b(cVar2, null, audioBuffer$openWriteRegion$1, 1, null) == objH) {
                return objH;
            }
            audioBuffer = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = audioBuffer$openWriteRegion$1.f93994c;
            audioBuffer = (AudioBuffer) audioBuffer$openWriteRegion$1.f93993b;
            kotlin.t0.n(obj);
        }
        return new Pair(kotlin.coroutines.jvm.internal.a.f(Math.min(Math.min(i10, audioBuffer.f93969d - audioBuffer.f93968c), audioBuffer.f93969d - audioBuffer.f93967b)), kotlin.coroutines.jvm.internal.a.f(audioBuffer.f93967b));
    }

    public final void n(boolean z10) {
        String name;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 46701, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        String str = "processAudio, isMuted = " + z10;
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (AudioBuffer.class.isAnonymousClass()) {
            name = AudioBuffer.class.getName();
            f0.m(name);
        } else {
            name = AudioBuffer.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str);
        aVar.q(sb2.toString());
        if (z10) {
            m.q2(this.f93970e, (byte) 0, 0, 0, 6, null);
        }
    }

    public final void o(@e byte[] bArr) {
        this.f93971f = bArr;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    @e
    public final Object p(@d kotlin.coroutines.c<? super Integer> cVar) throws Throwable {
        AudioBuffer$size$1 audioBuffer$size$1;
        AudioBuffer audioBuffer;
        kotlinx.coroutines.sync.c cVar2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 46696, new Class[]{kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        if (cVar instanceof AudioBuffer$size$1) {
            audioBuffer$size$1 = (AudioBuffer$size$1) cVar;
            int i10 = audioBuffer$size$1.f94002f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                audioBuffer$size$1.f94002f = i10 - Integer.MIN_VALUE;
            } else {
                audioBuffer$size$1 = new AudioBuffer$size$1(this, cVar);
            }
        } else {
            audioBuffer$size$1 = new AudioBuffer$size$1(this, cVar);
        }
        Object obj = audioBuffer$size$1.f94000d;
        Object objH = b.h();
        int i11 = audioBuffer$size$1.f94002f;
        if (i11 == 0) {
            kotlin.t0.n(obj);
            kotlinx.coroutines.sync.c cVar3 = this.f93972g;
            audioBuffer$size$1.f93998b = this;
            audioBuffer$size$1.f93999c = cVar3;
            audioBuffer$size$1.f94002f = 1;
            if (cVar3.e(null, audioBuffer$size$1) == objH) {
                return objH;
            }
            audioBuffer = this;
            cVar2 = cVar3;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar2 = (kotlinx.coroutines.sync.c) audioBuffer$size$1.f93999c;
            audioBuffer = (AudioBuffer) audioBuffer$size$1.f93998b;
            kotlin.t0.n(obj);
        }
        try {
            return kotlin.coroutines.jvm.internal.a.f(audioBuffer.f93968c);
        } finally {
            cVar2.f(null);
        }
    }
}
