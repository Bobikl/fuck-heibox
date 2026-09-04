package com.max.xiaoheihe.module.voice.component;

import android.content.Context;
import android.media.AudioRecord;
import android.util.Log;
import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.module.voice.audio.AudioBuffer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.Pair;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.t0;

/* JADX INFO: compiled from: MicAudioManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class MicAudioManager {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final a f94069e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f94070f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f94071g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f94072h = 1024;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f94073i = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final String f94074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f94075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private AudioRecord f94076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f94077d;

    /* JADX INFO: compiled from: MicAudioManager.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    public MicAudioManager(@dl.d Context ctx, int i10) {
        f0.p(ctx, "ctx");
        this.f94074a = "MicAudioManager";
        this.f94075b = 50;
        if (!ctx.getPackageManager().hasSystemFeature("android.hardware.microphone")) {
            throw new IllegalArgumentException("Microphone is not detected on this device".toString());
        }
        if (!(androidx.core.content.d.a(ctx, "android.permission.RECORD_AUDIO") == 0)) {
            throw new IllegalArgumentException("Microphone recording is not permitted".toString());
        }
        this.f94076c = new AudioRecord(1, i10, 16, 2, 1024);
        int minBufferSize = AudioRecord.getMinBufferSize(i10, 16, 2);
        this.f94077d = minBufferSize;
        if (minBufferSize == -1 || minBufferSize == -2) {
            this.f94077d = i10 * 2;
        }
    }

    public final int a() {
        return this.f94075b;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    @dl.e
    public final Object b(@dl.d AudioBuffer audioBuffer, @dl.d kotlin.coroutines.c<? super Integer> cVar) throws Throwable {
        MicAudioManager$record$2 micAudioManager$record$2;
        MicAudioManager micAudioManager;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{audioBuffer, cVar}, this, changeQuickRedirect, false, 46786, new Class[]{AudioBuffer.class, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        if (cVar instanceof MicAudioManager$record$2) {
            micAudioManager$record$2 = (MicAudioManager$record$2) cVar;
            int i10 = micAudioManager$record$2.f94082f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                micAudioManager$record$2.f94082f = i10 - Integer.MIN_VALUE;
            } else {
                micAudioManager$record$2 = new MicAudioManager$record$2(this, cVar);
            }
        } else {
            micAudioManager$record$2 = new MicAudioManager$record$2(this, cVar);
        }
        Object objM = micAudioManager$record$2.f94080d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = micAudioManager$record$2.f94082f;
        if (i11 == 0) {
            t0.n(objM);
            micAudioManager$record$2.f94078b = this;
            micAudioManager$record$2.f94079c = audioBuffer;
            micAudioManager$record$2.f94082f = 1;
            objM = audioBuffer.m(1024, micAudioManager$record$2);
            if (objM == objH) {
                return objH;
            }
            micAudioManager = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            audioBuffer = (AudioBuffer) micAudioManager$record$2.f94079c;
            micAudioManager = (MicAudioManager) micAudioManager$record$2.f94078b;
            t0.n(objM);
        }
        Pair pair = (Pair) objM;
        int iIntValue = ((Number) pair.e()).intValue();
        int iIntValue2 = ((Number) pair.f()).intValue();
        int i12 = micAudioManager.f94076c.read(audioBuffer.g(), iIntValue2, iIntValue);
        int iA = audioBuffer.a(iIntValue2, iIntValue2 + i12);
        audioBuffer.e(i12);
        return kotlin.coroutines.jvm.internal.a.f(iA);
    }

    @dl.e
    public final Object c(@dl.d kotlin.coroutines.c<? super short[]> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 46785, new Class[]{kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        int i10 = this.f94077d / 2;
        short[] sArr = new short[i10];
        this.f94076c.read(sArr, 0, i10);
        return sArr;
    }

    public final void d(int i10) {
        this.f94075b = i10;
    }

    public final void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46789, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f94076c.stop();
        Log.d(this.f94074a, "shutdown");
    }

    public final void f() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46787, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f94076c.startRecording();
        Log.d(this.f94074a, com.google.android.exoplayer2.text.ttml.d.f49798o0);
    }

    public final void g() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46788, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f94076c.stop();
        Log.d(this.f94074a, "stop");
    }
}
