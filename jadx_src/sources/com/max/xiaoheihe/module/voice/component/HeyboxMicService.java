package com.max.xiaoheihe.module.voice.component;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import androidx.compose.runtime.internal.o;
import com.google.gson.JsonObject;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.voice.PCDeviceInfo;
import com.max.xiaoheihe.module.voice.audio.AudioBuffer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.taobao.aranger.constant.Constants;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import kotlin.b2;
import kotlin.c1;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.j;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: HeyboxMicService.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nHeyboxMicService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeyboxMicService.kt\ncom/max/xiaoheihe/module/voice/component/HeyboxMicService\n+ 2 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n+ 3 Utils.kt\ncom/example/androidMic/utils/UtilsKt\n*L\n1#1,490:1\n29#2:491\n5#2,2:492\n22#2:494\n7#2:495\n29#2:496\n5#2,2:497\n22#2:499\n7#2:500\n29#2:501\n5#2,2:502\n22#2:504\n7#2:505\n29#2:506\n5#2,2:507\n22#2:509\n7#2:510\n29#2:511\n5#2,2:512\n22#2:514\n7#2:515\n29#2:516\n5#2,2:517\n22#2:519\n7#2:520\n29#2:521\n5#2,2:522\n22#2:524\n7#2:525\n29#2:526\n5#2,2:527\n22#2:529\n7#2:530\n29#2:531\n5#2,2:532\n22#2:534\n7#2:535\n29#2:536\n5#2,2:537\n22#2:539\n7#2:540\n29#2:541\n5#2,2:542\n22#2:544\n7#2:545\n29#2:546\n5#2,2:547\n22#2:549\n7#2:550\n29#2:551\n5#2,2:552\n22#2:554\n7#2:555\n29#2:556\n5#2,2:557\n22#2:559\n7#2:560\n29#2:561\n5#2,2:562\n22#2:564\n7#2:565\n29#2:566\n5#2,2:567\n22#2:569\n7#2:570\n29#2:571\n5#2,2:572\n22#2:574\n7#2:575\n29#2:576\n5#2,2:577\n22#2:579\n7#2:580\n7#3,6:581\n*S KotlinDebug\n*F\n+ 1 HeyboxMicService.kt\ncom/max/xiaoheihe/module/voice/component/HeyboxMicService\n*L\n105#1:491\n105#1:492,2\n105#1:494\n105#1:495\n112#1:496\n112#1:497,2\n112#1:499\n112#1:500\n121#1:501\n121#1:502,2\n121#1:504\n121#1:505\n126#1:506\n126#1:507,2\n126#1:509\n126#1:510\n134#1:511\n134#1:512,2\n134#1:514\n134#1:515\n186#1:516\n186#1:517,2\n186#1:519\n186#1:520\n240#1:521\n240#1:522,2\n240#1:524\n240#1:525\n250#1:526\n250#1:527,2\n250#1:529\n250#1:530\n290#1:531\n290#1:532,2\n290#1:534\n290#1:535\n313#1:536\n313#1:537,2\n313#1:539\n313#1:540\n317#1:541\n317#1:542,2\n317#1:544\n317#1:545\n331#1:546\n331#1:547,2\n331#1:549\n331#1:550\n367#1:551\n367#1:552,2\n367#1:554\n367#1:555\n372#1:556\n372#1:557,2\n372#1:559\n372#1:560\n381#1:561\n381#1:562,2\n381#1:564\n381#1:565\n432#1:566\n432#1:567,2\n432#1:569\n432#1:570\n451#1:571\n451#1:572,2\n451#1:574\n451#1:575\n456#1:576\n456#1:577,2\n456#1:579\n456#1:580\n475#1:581,6\n*E\n"})
@o(parameters = 0)
public final class HeyboxMicService extends Service {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f94017p = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f94020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private HandlerThread f94021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Looper f94022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f94023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Messenger f94024h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private MicAudioManager f94026j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private com.max.xiaoheihe.module.voice.streaming.a f94027k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private d2 f94028l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private d2 f94029m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.e
    private d2 f94030n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f94031o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final q0 f94018b = r0.a(e1.a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final e f94019c = new e(null, null, null, null, null, 31, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private AudioBuffer f94025i = new AudioBuffer();

    /* JADX INFO: compiled from: HeyboxMicService.kt */
    public final class a extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ HeyboxMicService f94032a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@dl.d HeyboxMicService heyboxMicService, Looper looper) {
            super(looper);
            f0.p(looper, "looper");
            this.f94032a = heyboxMicService;
        }

        @Override // android.os.Handler
        public void handleMessage(@dl.d Message msg) throws InterruptedException {
            if (PatchProxy.proxy(new Object[]{msg}, this, changeQuickRedirect, false, 46739, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(msg, "msg");
            int i10 = msg.what;
            if (i10 == 1) {
                HeyboxMicService.m(this.f94032a, msg);
                return;
            }
            if (i10 == 2) {
                HeyboxMicService.o(this.f94032a, msg);
                return;
            }
            if (i10 == 3) {
                HeyboxMicService.l(this.f94032a, msg);
            } else if (i10 == 4) {
                HeyboxMicService.n(this.f94032a, msg);
            } else {
                if (i10 != 300) {
                    return;
                }
                HeyboxMicService.k(this.f94032a, msg);
            }
        }
    }

    private final void A(Message message) {
        String name;
        if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 46719, new Class[]{Message.class}, Void.TYPE).isSupported) {
            return;
        }
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (HeyboxMicService.class.isAnonymousClass()) {
            name = HeyboxMicService.class.getName();
            f0.m(name);
        } else {
            name = HeyboxMicService.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append("stopAudio");
        aVar.q(sb2.toString());
        Messenger sender = message.replyTo;
        Bundle bundle = new Bundle();
        if (!this.f94019c.j().get()) {
            f0.o(sender, "sender");
            f.a(sender, bundle, 4, true);
            return;
        }
        d2 d2Var = this.f94030n;
        if (d2Var != null && d2Var.isActive()) {
            return;
        }
        bundle.putInt(com.max.xiaoheihe.module.voice.component.a.f94102r, message.getData().getInt(com.max.xiaoheihe.module.voice.component.a.f94102r));
        f0.o(sender, "sender");
        f.a(sender, bundle, 4, true);
        this.f94019c.j().set(false);
        this.f94019c.h().set(true);
        k.f(this.f94018b, null, null, new HeyboxMicService$handleStopAudio$1(this, null), 3, null);
    }

    private final void B(Message message) throws InterruptedException {
        String name;
        if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 46716, new Class[]{Message.class}, Void.TYPE).isSupported) {
            return;
        }
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (HeyboxMicService.class.isAnonymousClass()) {
            name = HeyboxMicService.class.getName();
            f0.m(name);
        } else {
            name = HeyboxMicService.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append("stopStream");
        aVar.q(sb2.toString());
        Messenger sender = message.replyTo;
        Bundle bundle = new Bundle();
        t();
        j.b(null, new HeyboxMicService$handleStopStream$1(this, null), 1, null);
        if (Build.VERSION.SDK_INT >= 24) {
            stopForeground(1);
        }
        this.f94026j = null;
        this.f94029m = null;
        this.f94027k = null;
        this.f94028l = null;
        this.f94019c.j().set(false);
        this.f94019c.l().set(false);
        f0.o(sender, "sender");
        f.a(sender, bundle, 2, true);
    }

    private final Object C(String str, kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, cVar}, this, changeQuickRedirect, false, 46724, new Class[]{String.class, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = i.h(e1.c(), new HeyboxMicService$sendPcMsg$2(str, this, null), cVar);
        return objH == kotlin.coroutines.intrinsics.b.h() ? objH : b2.f124493a;
    }

    private final Object D(Messenger messenger, kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{messenger, cVar}, this, changeQuickRedirect, false, 46722, new Class[]{Messenger.class, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = i.h(e1.c(), new HeyboxMicService$startReceive$2(this, messenger, null), cVar);
        return objH == kotlin.coroutines.intrinsics.b.h() ? objH : b2.f124493a;
    }

    private final void E() throws InterruptedException {
        String name;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46728, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (HeyboxMicService.class.isAnonymousClass()) {
            name = HeyboxMicService.class.getName();
            f0.m(name);
        } else {
            name = HeyboxMicService.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append("stopService");
        aVar.q(sb2.toString());
        this.f94019c.h().set(true);
        this.f94019c.i().set(true);
        MicAudioManager micAudioManager = this.f94026j;
        if (micAudioManager != null) {
            micAudioManager.e();
        }
        HandlerThread handlerThread = null;
        this.f94026j = null;
        com.max.xiaoheihe.module.voice.streaming.a aVar2 = this.f94027k;
        if (aVar2 != null) {
            aVar2.d();
        }
        this.f94027k = null;
        j.b(null, new HeyboxMicService$stopService$1(this, null), 1, null);
        Looper looper = this.f94022f;
        if (looper == null) {
            f0.S("serviceLooper");
            looper = null;
        }
        looper.quitSafely();
        try {
            HandlerThread handlerThread2 = this.f94021e;
            if (handlerThread2 == null) {
                f0.S("handlerThread");
            } else {
                handlerThread = handlerThread2;
            }
            handlerThread.join(1000L);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            stopForeground(1);
        }
        stopSelf();
    }

    public static final /* synthetic */ void a(HeyboxMicService heyboxMicService) throws InterruptedException {
        if (PatchProxy.proxy(new Object[]{heyboxMicService}, null, changeQuickRedirect, true, 46735, new Class[]{HeyboxMicService.class}, Void.TYPE).isSupported) {
            return;
        }
        heyboxMicService.t();
    }

    public static final /* synthetic */ Object i(HeyboxMicService heyboxMicService, Messenger messenger, kotlin.coroutines.c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{heyboxMicService, messenger, cVar}, null, changeQuickRedirect, true, 46736, new Class[]{HeyboxMicService.class, Messenger.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : heyboxMicService.v(messenger, cVar);
    }

    public static final /* synthetic */ Object j(HeyboxMicService heyboxMicService, Messenger messenger, JsonObject jsonObject, kotlin.coroutines.c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{heyboxMicService, messenger, jsonObject, cVar}, null, changeQuickRedirect, true, 46738, new Class[]{HeyboxMicService.class, Messenger.class, JsonObject.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : heyboxMicService.w(messenger, jsonObject, cVar);
    }

    public static final /* synthetic */ void k(HeyboxMicService heyboxMicService, Message message) {
        if (PatchProxy.proxy(new Object[]{heyboxMicService, message}, null, changeQuickRedirect, true, 46733, new Class[]{HeyboxMicService.class, Message.class}, Void.TYPE).isSupported) {
            return;
        }
        heyboxMicService.x(message);
    }

    public static final /* synthetic */ void l(HeyboxMicService heyboxMicService, Message message) {
        if (PatchProxy.proxy(new Object[]{heyboxMicService, message}, null, changeQuickRedirect, true, 46731, new Class[]{HeyboxMicService.class, Message.class}, Void.TYPE).isSupported) {
            return;
        }
        heyboxMicService.y(message);
    }

    public static final /* synthetic */ void m(HeyboxMicService heyboxMicService, Message message) {
        if (PatchProxy.proxy(new Object[]{heyboxMicService, message}, null, changeQuickRedirect, true, 46729, new Class[]{HeyboxMicService.class, Message.class}, Void.TYPE).isSupported) {
            return;
        }
        heyboxMicService.z(message);
    }

    public static final /* synthetic */ void n(HeyboxMicService heyboxMicService, Message message) {
        if (PatchProxy.proxy(new Object[]{heyboxMicService, message}, null, changeQuickRedirect, true, 46732, new Class[]{HeyboxMicService.class, Message.class}, Void.TYPE).isSupported) {
            return;
        }
        heyboxMicService.A(message);
    }

    public static final /* synthetic */ void o(HeyboxMicService heyboxMicService, Message message) throws InterruptedException {
        if (PatchProxy.proxy(new Object[]{heyboxMicService, message}, null, changeQuickRedirect, true, 46730, new Class[]{HeyboxMicService.class, Message.class}, Void.TYPE).isSupported) {
            return;
        }
        heyboxMicService.B(message);
    }

    public static final /* synthetic */ Object p(HeyboxMicService heyboxMicService, String str, kotlin.coroutines.c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{heyboxMicService, str, cVar}, null, changeQuickRedirect, true, 46737, new Class[]{HeyboxMicService.class, String.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : heyboxMicService.C(str, cVar);
    }

    public static final /* synthetic */ Object s(HeyboxMicService heyboxMicService, Messenger messenger, kotlin.coroutines.c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{heyboxMicService, messenger, cVar}, null, changeQuickRedirect, true, 46734, new Class[]{HeyboxMicService.class, Messenger.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : heyboxMicService.D(messenger, cVar);
    }

    private final void t() throws InterruptedException {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46725, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        j.b(null, new HeyboxMicService$closeAudio$1(this, null), 1, null);
        if (Build.VERSION.SDK_INT >= 24) {
            stopForeground(1);
        }
        this.f94026j = null;
        this.f94029m = null;
    }

    private final void u(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 46721, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f94019c.k().set(z10);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:45:0x00de  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e8 A[RETURN] */
    private final Object v(Messenger messenger, kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        HeyboxMicService$handlePCDisconnect$1 heyboxMicService$handlePCDisconnect$1;
        HeyboxMicService heyboxMicService;
        d2 d2Var;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{messenger, cVar}, this, changeQuickRedirect, false, 46717, new Class[]{Messenger.class, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        if (cVar instanceof HeyboxMicService$handlePCDisconnect$1) {
            heyboxMicService$handlePCDisconnect$1 = (HeyboxMicService$handlePCDisconnect$1) cVar;
            int i10 = heyboxMicService$handlePCDisconnect$1.f94038e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                heyboxMicService$handlePCDisconnect$1.f94038e = i10 - Integer.MIN_VALUE;
            } else {
                heyboxMicService$handlePCDisconnect$1 = new HeyboxMicService$handlePCDisconnect$1(this, cVar);
            }
        } else {
            heyboxMicService$handlePCDisconnect$1 = new HeyboxMicService$handlePCDisconnect$1(this, cVar);
        }
        Object obj = heyboxMicService$handlePCDisconnect$1.f94036c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = heyboxMicService$handlePCDisconnect$1.f94038e;
        if (i11 != 0) {
            if (i11 == 1) {
                heyboxMicService = (HeyboxMicService) heyboxMicService$handlePCDisconnect$1.f94035b;
                kotlin.t0.n(obj);
            } else if (i11 == 2) {
                heyboxMicService = (HeyboxMicService) heyboxMicService$handlePCDisconnect$1.f94035b;
                kotlin.t0.n(obj);
                d2Var = heyboxMicService.f94028l;
                if (d2Var != null) {
                    heyboxMicService$handlePCDisconnect$1.f94035b = heyboxMicService;
                    heyboxMicService$handlePCDisconnect$1.f94038e = 3;
                    if (d2Var.g0(heyboxMicService$handlePCDisconnect$1) == objH) {
                        return objH;
                    }
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                heyboxMicService = (HeyboxMicService) heyboxMicService$handlePCDisconnect$1.f94035b;
                kotlin.t0.n(obj);
            }
            heyboxMicService.f94029m = null;
            heyboxMicService.f94028l = null;
            return b2.f124493a;
        }
        kotlin.t0.n(obj);
        f.a(messenger, new Bundle(), 50, true);
        this.f94019c.h().set(true);
        this.f94019c.i().set(true);
        MicAudioManager micAudioManager = this.f94026j;
        if (micAudioManager != null) {
            micAudioManager.e();
        }
        this.f94026j = null;
        com.max.xiaoheihe.module.voice.streaming.a aVar = this.f94027k;
        if (aVar != null) {
            aVar.d();
        }
        this.f94027k = null;
        heyboxMicService$handlePCDisconnect$1.f94035b = this;
        heyboxMicService$handlePCDisconnect$1.f94038e = 1;
        if (DelayKt.b(1000L, heyboxMicService$handlePCDisconnect$1) == objH) {
            return objH;
        }
        heyboxMicService = this;
        d2 d2Var2 = heyboxMicService.f94029m;
        if (d2Var2 != null) {
            d2Var2.e(new CancellationException("handlePCDisconnect"));
        }
        d2 d2Var3 = heyboxMicService.f94028l;
        if (d2Var3 != null) {
            d2Var3.e(new CancellationException("handlePCDisconnect"));
        }
        d2 d2Var4 = heyboxMicService.f94029m;
        if (d2Var4 != null) {
            heyboxMicService$handlePCDisconnect$1.f94035b = heyboxMicService;
            heyboxMicService$handlePCDisconnect$1.f94038e = 2;
            if (d2Var4.g0(heyboxMicService$handlePCDisconnect$1) == objH) {
                return objH;
            }
        }
        d2Var = heyboxMicService.f94028l;
        if (d2Var != null) {
            heyboxMicService$handlePCDisconnect$1.f94035b = heyboxMicService;
            heyboxMicService$handlePCDisconnect$1.f94038e = 3;
            if (d2Var.g0(heyboxMicService$handlePCDisconnect$1) == objH) {
                return objH;
            }
        }
        heyboxMicService.f94029m = null;
        heyboxMicService.f94028l = null;
        return b2.f124493a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final Object w(Messenger messenger, JsonObject jsonObject, kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        String name;
        String name2;
        String name3;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{messenger, jsonObject, cVar}, this, changeQuickRedirect, false, 46723, new Class[]{Messenger.class, JsonObject.class, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        String asString = jsonObject.get("type").getAsString();
        f0.o(asString, "map[\"type\"].asString");
        String str = "handlePcMsg, type = " + asString + ", msg = " + jsonObject;
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (HeyboxMicService.class.isAnonymousClass()) {
            name = HeyboxMicService.class.getName();
            f0.m(name);
        } else {
            name = HeyboxMicService.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str);
        aVar.q(sb2.toString());
        switch (asString.hashCode()) {
            case -1104912246:
                if (asString.equals("enable_capture")) {
                    Bundle bundle = new Bundle();
                    boolean z10 = jsonObject.get("value").getAsInt() == 1;
                    String str2 = "handlePcMsg, type = " + asString + ", enable = " + z10;
                    StringBuilder sb3 = new StringBuilder();
                    if (HeyboxMicService.class.isAnonymousClass()) {
                        name2 = HeyboxMicService.class.getName();
                        f0.m(name2);
                    } else {
                        name2 = HeyboxMicService.class.getSimpleName();
                        f0.m(name2);
                    }
                    sb3.append(name2);
                    sb3.append(", ");
                    sb3.append(str2);
                    aVar.q(sb3.toString());
                    f.a(messenger, bundle, 500, z10);
                }
                break;
            case -810883302:
                if (asString.equals(com.max.xiaoheihe.module.voice.component.a.f94101q)) {
                    int asInt = jsonObject.get("value").getAsInt();
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(com.max.xiaoheihe.module.voice.component.a.f94102r, asInt);
                    u(asInt == 0);
                    String str3 = "handlePcMsg, type = " + asString + ", volume = " + asInt + ", sender = " + messenger;
                    StringBuilder sb4 = new StringBuilder();
                    if (HeyboxMicService.class.isAnonymousClass()) {
                        name3 = HeyboxMicService.class.getName();
                        f0.m(name3);
                    } else {
                        name3 = HeyboxMicService.class.getSimpleName();
                        f0.m(name3);
                    }
                    sb4.append(name3);
                    sb4.append(", ");
                    sb4.append(str3);
                    aVar.q(sb4.toString());
                    f.a(messenger, bundle2, 400, true);
                }
                break;
            case 3441010:
                if (asString.equals("ping")) {
                    String strP = com.max.hbutils.utils.k.p(kotlin.collections.r0.k(c1.a("type", "pong")));
                    f0.o(strP, "serialize(\n             …  )\n                    )");
                    Object objC = C(strP, cVar);
                    return objC == kotlin.coroutines.intrinsics.b.h() ? objC : b2.f124493a;
                }
                break;
            case 530405532:
                if (asString.equals("disconnect")) {
                    Object objV = v(messenger, cVar);
                    return objV == kotlin.coroutines.intrinsics.b.h() ? objV : b2.f124493a;
                }
                break;
        }
        return b2.f124493a;
    }

    private final void x(Message message) {
        String name;
        String name2;
        String name3;
        if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 46720, new Class[]{Message.class}, Void.TYPE).isSupported) {
            return;
        }
        String str = "handleSeekbarProgressChanged, isStreamStarted = " + this.f94019c.l().get();
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (HeyboxMicService.class.isAnonymousClass()) {
            name = HeyboxMicService.class.getName();
            f0.m(name);
        } else {
            name = HeyboxMicService.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str);
        aVar.q(sb2.toString());
        Messenger sender = message.replyTo;
        Bundle bundle = new Bundle();
        if (!this.f94019c.l().get()) {
            StringBuilder sb3 = new StringBuilder();
            if (HeyboxMicService.class.isAnonymousClass()) {
                name3 = HeyboxMicService.class.getName();
                f0.m(name3);
            } else {
                name3 = HeyboxMicService.class.getSimpleName();
                f0.m(name3);
            }
            sb3.append(name3);
            sb3.append(", ");
            sb3.append("audio not connect");
            aVar.q(sb3.toString());
            f0.o(sender, "sender");
            f.a(sender, bundle, 300, false);
            return;
        }
        int i10 = message.getData().getInt(com.max.xiaoheihe.module.voice.component.a.f94102r);
        if (i10 < 0 || i10 > 100) {
            f0.o(sender, "sender");
            f.a(sender, bundle, 300, false);
            return;
        }
        u(i10 == 0);
        String str2 = "handleSeekbarProgressChanged, volume = " + i10;
        StringBuilder sb4 = new StringBuilder();
        if (HeyboxMicService.class.isAnonymousClass()) {
            name2 = HeyboxMicService.class.getName();
            f0.m(name2);
        } else {
            name2 = HeyboxMicService.class.getSimpleName();
            f0.m(name2);
        }
        sb4.append(name2);
        sb4.append(", ");
        sb4.append(str2);
        aVar.q(sb4.toString());
        k.f(this.f94018b, null, null, new HeyboxMicService$handleSeekbarProgressChanged$1(this, i10, null), 3, null);
    }

    private final void y(Message message) {
        String name;
        String name2;
        if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 46718, new Class[]{Message.class}, Void.TYPE).isSupported) {
            return;
        }
        Messenger sender = message.replyTo;
        Bundle bundle = new Bundle();
        if (!this.f94019c.l().get()) {
            g.a aVar = g.f74531b;
            StringBuilder sb2 = new StringBuilder();
            if (HeyboxMicService.class.isAnonymousClass()) {
                name2 = HeyboxMicService.class.getName();
                f0.m(name2);
            } else {
                name2 = HeyboxMicService.class.getSimpleName();
                f0.m(name2);
            }
            sb2.append(name2);
            sb2.append(", ");
            sb2.append("startAudio not connect");
            aVar.q(sb2.toString());
            f0.o(sender, "sender");
            f.a(sender, bundle, 3, false);
            return;
        }
        if (this.f94019c.j().get()) {
            f0.o(sender, "sender");
            f.a(sender, bundle, 3, true);
            return;
        }
        d2 d2Var = this.f94029m;
        if (d2Var != null && d2Var.isActive()) {
            return;
        }
        g.a aVar2 = g.f74531b;
        StringBuilder sb3 = new StringBuilder();
        if (HeyboxMicService.class.isAnonymousClass()) {
            name = HeyboxMicService.class.getName();
            f0.m(name);
        } else {
            name = HeyboxMicService.class.getSimpleName();
            f0.m(name);
        }
        sb3.append(name);
        sb3.append(", ");
        sb3.append("startAudio [start]");
        aVar2.q(sb3.toString());
        this.f94029m = k.f(this.f94018b, null, null, new HeyboxMicService$handleStartAudio$1(this, sender, bundle, null), 3, null);
    }

    private final void z(Message message) {
        String name;
        String name2;
        String name3;
        if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 46715, new Class[]{Message.class}, Void.TYPE).isSupported) {
            return;
        }
        Messenger sender = message.replyTo;
        Bundle bundle = new Bundle();
        if (this.f94019c.l().get()) {
            g.a aVar = g.f74531b;
            StringBuilder sb2 = new StringBuilder();
            if (HeyboxMicService.class.isAnonymousClass()) {
                name3 = HeyboxMicService.class.getName();
                f0.m(name3);
            } else {
                name3 = HeyboxMicService.class.getSimpleName();
                f0.m(name3);
            }
            sb2.append(name3);
            sb2.append(", ");
            sb2.append("Stream already started");
            aVar.q(sb2.toString());
            bundle.putString(Constants.PARAM_REPLY, getString(R.string.stream_already_started));
            f0.o(sender, "sender");
            f.a(sender, bundle, 1, true);
            return;
        }
        d2 d2Var = this.f94028l;
        if (d2Var != null && d2Var.isActive()) {
            g.a aVar2 = g.f74531b;
            StringBuilder sb3 = new StringBuilder();
            if (HeyboxMicService.class.isAnonymousClass()) {
                name2 = HeyboxMicService.class.getName();
                f0.m(name2);
            } else {
                name2 = HeyboxMicService.class.getSimpleName();
                f0.m(name2);
            }
            sb3.append(name2);
            sb3.append(", ");
            sb3.append("jobStreamM?.isActive == true");
            aVar2.q(sb3.toString());
            return;
        }
        Serializable serializable = message.getData().getSerializable(com.max.xiaoheihe.module.voice.component.a.f94100p);
        if (!(serializable instanceof PCDeviceInfo)) {
            f0.o(sender, "sender");
            f.a(sender, bundle, 1, false);
            return;
        }
        String str = "startStream [start], pcInfo = " + serializable;
        g.a aVar3 = g.f74531b;
        StringBuilder sb4 = new StringBuilder();
        if (HeyboxMicService.class.isAnonymousClass()) {
            name = HeyboxMicService.class.getName();
            f0.m(name);
        } else {
            name = HeyboxMicService.class.getSimpleName();
            f0.m(name);
        }
        sb4.append(name);
        sb4.append(", ");
        sb4.append(str);
        aVar3.q(sb4.toString());
        this.f94028l = k.f(this.f94018b, null, null, new HeyboxMicService$handleStartStream$1(this, serializable, sender, bundle, null), 3, null);
    }

    @Override // android.app.Service
    @dl.e
    public IBinder onBind(@dl.e Intent intent) {
        String name;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 46713, new Class[]{Intent.class}, IBinder.class);
        if (patchProxyResultProxy.isSupported) {
            return (IBinder) patchProxyResultProxy.result;
        }
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (HeyboxMicService.class.isAnonymousClass()) {
            name = HeyboxMicService.class.getName();
            f0.m(name);
        } else {
            name = HeyboxMicService.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append("onBind");
        aVar.q(sb2.toString());
        Messenger messenger = this.f94024h;
        if (messenger == null) {
            f0.S("serviceMessenger");
            messenger = null;
        }
        return messenger.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46712, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onCreate();
        HandlerThread handlerThread = new HandlerThread("MicServiceStart", 10);
        this.f94021e = handlerThread;
        handlerThread.start();
        HandlerThread handlerThread2 = this.f94021e;
        a aVar = null;
        if (handlerThread2 == null) {
            f0.S("handlerThread");
            handlerThread2 = null;
        }
        Looper looper = handlerThread2.getLooper();
        f0.o(looper, "handlerThread.looper");
        this.f94022f = looper;
        HandlerThread handlerThread3 = this.f94021e;
        if (handlerThread3 == null) {
            f0.S("handlerThread");
            handlerThread3 = null;
        }
        Looper looper2 = handlerThread3.getLooper();
        f0.o(looper2, "handlerThread.looper");
        this.f94023g = new a(this, looper2);
        a aVar2 = this.f94023g;
        if (aVar2 == null) {
            f0.S("serviceHandler");
        } else {
            aVar = aVar2;
        }
        this.f94024h = new Messenger(aVar);
        if (Build.VERSION.SDK_INT >= 26) {
            String string = getString(R.string.app_name);
            f0.o(string, "getString(R.string.app_name)");
            NotificationChannel notificationChannel = new NotificationChannel(f.f94113a, string, 3);
            Object systemService = getSystemService("notification");
            f0.n(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
        }
        this.f94020d = new c(this);
    }

    @Override // android.app.Service
    public void onDestroy() throws InterruptedException {
        String name;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46727, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (HeyboxMicService.class.isAnonymousClass()) {
            name = HeyboxMicService.class.getName();
            f0.m(name);
        } else {
            name = HeyboxMicService.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append("onDestroy");
        aVar.q(sb2.toString());
        E();
    }

    @Override // android.app.Service
    public int onStartCommand(@dl.e Intent intent, int i10, int i11) {
        String name;
        Object[] objArr = {intent, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 46714, new Class[]{Intent.class, cls, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (HeyboxMicService.class.isAnonymousClass()) {
            name = HeyboxMicService.class.getName();
            f0.m(name);
        } else {
            name = HeyboxMicService.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append("onStartCommand");
        aVar.q(sb2.toString());
        this.f94031o = false;
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(@dl.e Intent intent) throws InterruptedException {
        String name;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 46726, new Class[]{Intent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        super.onUnbind(intent);
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (HeyboxMicService.class.isAnonymousClass()) {
            name = HeyboxMicService.class.getName();
            f0.m(name);
        } else {
            name = HeyboxMicService.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append("onUnbind");
        aVar.q(sb2.toString());
        E();
        return true;
    }
}
