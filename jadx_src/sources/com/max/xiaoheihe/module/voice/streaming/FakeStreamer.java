package com.max.xiaoheihe.module.voice.streaming;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.module.voice.audio.AudioBuffer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.Pair;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.t0;

/* JADX INFO: compiled from: FakeStreamer.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class FakeStreamer implements b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f94114e = 0;

    @Override // com.max.xiaoheihe.module.voice.streaming.b
    public void close() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46810, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        b.C0889b.b(this);
    }

    @Override // com.max.xiaoheihe.module.voice.streaming.b
    public boolean connect() {
        return true;
    }

    @Override // com.max.xiaoheihe.module.voice.streaming.b
    public boolean disconnect() {
        return true;
    }

    @Override // com.max.xiaoheihe.module.voice.streaming.b
    @e
    public Object h(@d c<? super String> cVar) {
        return null;
    }

    @Override // com.max.xiaoheihe.module.voice.streaming.b
    @e
    public Boolean i() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46809, new Class[0], Boolean.class);
        return patchProxyResultProxy.isSupported ? (Boolean) patchProxyResultProxy.result : b.C0889b.a(this);
    }

    @Override // com.max.xiaoheihe.module.voice.streaming.b
    @d
    public String j() {
        return "";
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    @Override // com.max.xiaoheihe.module.voice.streaming.b
    @e
    public Object k(@d AudioBuffer audioBuffer, @d c<? super b2> cVar) throws Throwable {
        FakeStreamer$stream$1 fakeStreamer$stream$1;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{audioBuffer, cVar}, this, changeQuickRedirect, false, 46808, new Class[]{AudioBuffer.class, c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        if (cVar instanceof FakeStreamer$stream$1) {
            fakeStreamer$stream$1 = (FakeStreamer$stream$1) cVar;
            int i10 = fakeStreamer$stream$1.f94118e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fakeStreamer$stream$1.f94118e = i10 - Integer.MIN_VALUE;
            } else {
                fakeStreamer$stream$1 = new FakeStreamer$stream$1(this, cVar);
            }
        } else {
            fakeStreamer$stream$1 = new FakeStreamer$stream$1(this, cVar);
        }
        Object objK = fakeStreamer$stream$1.f94116c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = fakeStreamer$stream$1.f94118e;
        if (i11 == 0) {
            t0.n(objK);
            fakeStreamer$stream$1.f94115b = audioBuffer;
            fakeStreamer$stream$1.f94118e = 1;
            objK = audioBuffer.k(1024, fakeStreamer$stream$1);
            if (objK == objH) {
                return objH;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            audioBuffer = (AudioBuffer) fakeStreamer$stream$1.f94115b;
            t0.n(objK);
        }
        Pair pair = (Pair) objK;
        int iIntValue = ((Number) pair.e()).intValue();
        ((Number) pair.f()).intValue();
        audioBuffer.c(iIntValue);
        return b2.f124493a;
    }

    @Override // com.max.xiaoheihe.module.voice.streaming.b
    @e
    public Object l(@d short[] sArr, @d c<? super b2> cVar) {
        return b2.f124493a;
    }

    @Override // com.max.xiaoheihe.module.voice.streaming.b
    public boolean m() {
        return true;
    }

    @Override // com.max.xiaoheihe.module.voice.streaming.b
    @e
    public Object n(@d AudioBuffer audioBuffer, @d String str, @d c<? super b2> cVar) {
        return b2.f124493a;
    }

    @Override // com.max.xiaoheihe.module.voice.streaming.b
    @e
    public Object o(@d AudioBuffer audioBuffer, @d c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{audioBuffer, cVar}, this, changeQuickRedirect, false, 46811, new Class[]{AudioBuffer.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : b.C0889b.c(this, audioBuffer, cVar);
    }

    @Override // com.max.xiaoheihe.module.voice.streaming.b
    public void shutdown() {
    }
}
