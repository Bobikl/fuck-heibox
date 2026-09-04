package com.max.xiaoheihe.module.voice;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.compose.runtime.internal.o;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.lifecycle.q0;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.module.voice.component.HeyboxMicService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.taobao.aranger.constant.Constants;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.flow.v;

/* JADX INFO: compiled from: HeyboxMicViewModel.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nHeyboxMicViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeyboxMicViewModel.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicViewModel\n+ 2 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,384:1\n29#2:385\n5#2,2:386\n22#2:388\n7#2:389\n29#2:395\n5#2,2:396\n22#2:398\n7#2:399\n29#2:405\n5#2,2:406\n22#2:408\n7#2:409\n29#2:420\n5#2,2:421\n22#2:423\n7#2:424\n29#2:445\n5#2,2:446\n22#2:448\n7#2:449\n29#2:450\n5#2,2:451\n22#2:453\n7#2:454\n29#2:455\n5#2,2:456\n22#2:458\n7#2:459\n29#2:465\n5#2,2:466\n22#2:468\n7#2:469\n29#2:475\n5#2,2:476\n22#2:478\n7#2:479\n29#2:485\n5#2,2:486\n22#2:488\n7#2:489\n29#2:495\n5#2,2:496\n22#2:498\n7#2:499\n29#2:505\n5#2,2:506\n22#2:508\n7#2:509\n29#2:515\n5#2,2:516\n22#2:518\n7#2:519\n230#3,5:390\n230#3,5:400\n230#3,5:410\n230#3,5:415\n230#3,5:425\n230#3,5:430\n230#3,5:435\n230#3,5:440\n230#3,5:460\n230#3,5:470\n230#3,5:480\n230#3,5:490\n230#3,5:500\n230#3,5:510\n230#3,5:520\n230#3,5:525\n230#3,5:530\n230#3,5:535\n230#3,5:540\n*S KotlinDebug\n*F\n+ 1 HeyboxMicViewModel.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicViewModel\n*L\n89#1:385\n89#1:386,2\n89#1:388\n89#1:389\n114#1:395\n114#1:396,2\n114#1:398\n114#1:399\n137#1:405\n137#1:406,2\n137#1:408\n137#1:409\n155#1:420\n155#1:421,2\n155#1:423\n155#1:424\n193#1:445\n193#1:446,2\n193#1:448\n193#1:449\n201#1:450\n201#1:451,2\n201#1:453\n201#1:454\n213#1:455\n213#1:456,2\n213#1:458\n213#1:459\n229#1:465\n229#1:466,2\n229#1:468\n229#1:469\n251#1:475\n251#1:476,2\n251#1:478\n251#1:479\n272#1:485\n272#1:486,2\n272#1:488\n272#1:489\n279#1:495\n279#1:496,2\n279#1:498\n279#1:499\n286#1:505\n286#1:506,2\n286#1:508\n286#1:509\n298#1:515\n298#1:516,2\n298#1:518\n298#1:519\n103#1:390,5\n115#1:400,5\n141#1:410,5\n144#1:415,5\n162#1:425,5\n168#1:430,5\n178#1:435,5\n186#1:440,5\n220#1:460,5\n245#1:470,5\n266#1:480,5\n273#1:490,5\n280#1:500,5\n287#1:510,5\n301#1:520,5\n314#1:525,5\n322#1:530,5\n333#1:535,5\n344#1:540,5\n*E\n"})
@o(parameters = 0)
public final class c extends androidx.lifecycle.b {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f94003n = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private final q0 f94004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private Messenger f94005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f94006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d
    private final b f94007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d
    private final j<com.max.xiaoheihe.module.voice.a> f94008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @d
    private final u<com.max.xiaoheihe.module.voice.a> f94009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private HandlerThread f94010i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Messenger f94011j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Looper f94012k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f94013l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f94014m;

    /* JADX INFO: compiled from: HeyboxMicViewModel.kt */
    @t0({"SMAP\nHeyboxMicViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeyboxMicViewModel.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicViewModel$ReplyHandler\n+ 2 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n*L\n1#1,384:1\n29#2:385\n5#2,2:386\n22#2:388\n7#2:389\n*S KotlinDebug\n*F\n+ 1 HeyboxMicViewModel.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicViewModel$ReplyHandler\n*L\n74#1:385\n74#1:386,2\n74#1:388\n74#1:389\n*E\n"})
    public final class a extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f94015a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@d c cVar, Looper looper) {
            super(looper);
            f0.p(looper, "looper");
            this.f94015a = cVar;
        }

        @Override // android.os.Handler
        public void handleMessage(@d Message msg) throws RemoteException {
            String name;
            if (PatchProxy.proxy(new Object[]{msg}, this, changeQuickRedirect, false, 46682, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(msg, "msg");
            String str = "HeyboxMicViewModel, handleMessage, " + msg.what;
            g.a aVar = g.f74531b;
            StringBuilder sb2 = new StringBuilder();
            if (a.class.isAnonymousClass()) {
                name = a.class.getName();
                f0.m(name);
            } else {
                name = a.class.getSimpleName();
                f0.m(name);
            }
            sb2.append(name);
            sb2.append(", ");
            sb2.append(str);
            aVar.q(sb2.toString());
            int i10 = msg.what;
            if (i10 == 30) {
                c.f(this.f94015a, msg);
                return;
            }
            if (i10 == 40) {
                c.e(this.f94015a, msg);
                return;
            }
            if (i10 == 50) {
                c.i(this.f94015a, msg);
                return;
            }
            if (i10 == 200) {
                c.g(this.f94015a, msg);
                return;
            }
            if (i10 == 400) {
                c.k(this.f94015a, msg);
            } else if (i10 != 500) {
                c.m(this.f94015a, msg);
            } else {
                c.h(this.f94015a, msg);
            }
        }
    }

    /* JADX INFO: compiled from: HeyboxMicViewModel.kt */
    public static final class b implements ServiceConnection {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(@e ComponentName componentName, @e IBinder iBinder) {
            if (PatchProxy.proxy(new Object[]{componentName, iBinder}, this, changeQuickRedirect, false, 46683, new Class[]{ComponentName.class, IBinder.class}, Void.TYPE).isSupported) {
                return;
            }
            g.f74531b.q("HeyboxMicViewModel, onServiceConnected");
            c.this.f94005d = new Messenger(iBinder);
            c.this.f94006e = true;
            c.n(c.this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@e ComponentName componentName) {
            if (PatchProxy.proxy(new Object[]{componentName}, this, changeQuickRedirect, false, 46684, new Class[]{ComponentName.class}, Void.TYPE).isSupported) {
                return;
            }
            g.f74531b.q("HeyboxMicViewModel, onServiceDisconnected");
            c.this.f94005d = null;
            c.this.f94006e = false;
            c.o(c.this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@d Application application, @d q0 savedStateHandle) {
        super(application);
        f0.p(application, "application");
        f0.p(savedStateHandle, "savedStateHandle");
        this.f94004c = savedStateHandle;
        this.f94007f = new b();
        j<com.max.xiaoheihe.module.voice.a> jVarA = v.a(new com.max.xiaoheihe.module.voice.a(false, false, false, null, 0, 0, false, false, null, false, false, false, null, 8191, null));
        this.f94008g = jVarA;
        this.f94009h = jVarA;
        L();
    }

    private final void B(Message message) {
        String name;
        com.max.xiaoheihe.module.voice.a value;
        if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 46668, new Class[]{Message.class}, Void.TYPE).isSupported) {
            return;
        }
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (c.class.isAnonymousClass()) {
            name = c.class.getName();
            f0.m(name);
        } else {
            name = c.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append("handleDisconnect");
        aVar.q(sb2.toString());
        j<com.max.xiaoheihe.module.voice.a> jVar = this.f94008g;
        do {
            value = jVar.getValue();
        } while (!jVar.compareAndSet(value, com.max.xiaoheihe.module.voice.a.o(value, false, false, false, null, 0, 0, false, false, null, false, true, false, null, bb.c.g.A8, null)));
    }

    private final void C(Message message) {
    }

    private final void D(Message message) {
        Bundle data;
        if (!PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 46651, new Class[]{Message.class}, Void.TYPE).isSupported && (data = message.getData()) != null) {
            int i10 = data.getInt(com.max.xiaoheihe.module.voice.component.a.f94101q);
            j<com.max.xiaoheihe.module.voice.a> jVar = this.f94008g;
            while (true) {
                com.max.xiaoheihe.module.voice.a value = jVar.getValue();
                j<com.max.xiaoheihe.module.voice.a> jVar2 = jVar;
                if (jVar2.compareAndSet(value, com.max.xiaoheihe.module.voice.a.o(value, false, false, false, null, i10, 0, false, false, null, false, false, false, null, bb.c.k.f33795q5, null))) {
                    return;
                } else {
                    jVar = jVar2;
                }
            }
        }
    }

    private final void E(Message message) throws RemoteException {
        String name;
        if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 46650, new Class[]{Message.class}, Void.TYPE).isSupported) {
            return;
        }
        String str = "handlePCAudioEnable, msg.data = " + message.getData();
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (c.class.isAnonymousClass()) {
            name = c.class.getName();
            f0.m(name);
        } else {
            name = c.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str);
        aVar.q(sb2.toString());
        Bundle data = message.getData();
        if (data != null) {
            if (data.getBoolean("result")) {
                A();
            } else {
                z(this, 0, 1, null);
            }
        }
    }

    private final void F(Message message) {
        String name;
        com.max.xiaoheihe.module.voice.a value;
        if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 46669, new Class[]{Message.class}, Void.TYPE).isSupported) {
            return;
        }
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (c.class.isAnonymousClass()) {
            name = c.class.getName();
            f0.m(name);
        } else {
            name = c.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append("handleDisconnect");
        aVar.q(sb2.toString());
        j<com.max.xiaoheihe.module.voice.a> jVar = this.f94008g;
        do {
            value = jVar.getValue();
        } while (!jVar.compareAndSet(value, com.max.xiaoheihe.module.voice.a.o(value, false, false, false, null, 0, 0, false, false, null, false, false, true, null, bb.c.f.Xs, null)));
    }

    private final void G(Message message) throws RemoteException {
        String name;
        int i10;
        com.max.xiaoheihe.module.voice.a value;
        if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 46662, new Class[]{Message.class}, Void.TYPE).isSupported) {
            return;
        }
        String str = "handlePCSeekbarProgress, msg.data = " + message.getData();
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (c.class.isAnonymousClass()) {
            name = c.class.getName();
            f0.m(name);
        } else {
            name = c.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str);
        aVar.q(sb2.toString());
        Bundle data = message.getData();
        if (data == null || (i10 = data.getInt(com.max.xiaoheihe.module.voice.component.a.f94102r)) < 0 || i10 > 100) {
            return;
        }
        I(i10, false);
        j<com.max.xiaoheihe.module.voice.a> jVar = this.f94008g;
        do {
            value = jVar.getValue();
        } while (!jVar.compareAndSet(value, com.max.xiaoheihe.module.voice.a.o(value, false, false, false, null, 0, i10, false, false, null, false, false, false, null, bb.c.k.f33426a5, null)));
    }

    private final void H(Message message) throws RemoteException {
        String name;
        com.max.xiaoheihe.module.voice.a value;
        com.max.xiaoheihe.module.voice.a value2;
        com.max.xiaoheihe.module.voice.a value3;
        com.max.xiaoheihe.module.voice.a value4;
        if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 46670, new Class[]{Message.class}, Void.TYPE).isSupported) {
            return;
        }
        String string = message.getData().getString(Constants.PARAM_REPLY);
        boolean z10 = message.getData().getBoolean("result");
        String str = "handleResult, " + message.what + ", result = " + z10 + ", reply = " + string;
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (c.class.isAnonymousClass()) {
            name = c.class.getName();
            f0.m(name);
        } else {
            name = c.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str);
        aVar.q(sb2.toString());
        int i10 = message.what;
        if (i10 == 1) {
            j<com.max.xiaoheihe.module.voice.a> jVar = this.f94008g;
            do {
                value = jVar.getValue();
            } while (!jVar.compareAndSet(value, com.max.xiaoheihe.module.voice.a.o(value, false, false, false, null, 0, 0, z10, false, null, !z10, false, false, null, bb.c.i.H, null)));
            if (z10) {
                M();
                return;
            }
            return;
        }
        if (i10 == 2) {
            j<com.max.xiaoheihe.module.voice.a> jVar2 = this.f94008g;
            do {
                value2 = jVar2.getValue();
            } while (!jVar2.compareAndSet(value2, com.max.xiaoheihe.module.voice.a.o(value2, false, false, false, null, 0, 0, !z10, !z10, null, false, false, false, null, bb.c.k.U1, null)));
        } else if (i10 == 3) {
            j<com.max.xiaoheihe.module.voice.a> jVar3 = this.f94008g;
            do {
                value3 = jVar3.getValue();
            } while (!jVar3.compareAndSet(value3, com.max.xiaoheihe.module.voice.a.o(value3, false, false, false, null, 0, 0, false, z10, null, !z10, false, false, null, bb.c.h.L, null)));
        } else {
            if (i10 != 4) {
                return;
            }
            int i11 = message.getData().getInt(com.max.xiaoheihe.module.voice.component.a.f94102r);
            j<com.max.xiaoheihe.module.voice.a> jVar4 = this.f94008g;
            do {
                value4 = jVar4.getValue();
            } while (!jVar4.compareAndSet(value4, com.max.xiaoheihe.module.voice.a.o(value4, false, false, false, null, 0, i11 > 0 ? i11 : 50, false, !z10, null, false, false, false, null, bb.c.k.A2, null)));
        }
    }

    private final void J() {
        com.max.xiaoheihe.module.voice.a value;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46666, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        j<com.max.xiaoheihe.module.voice.a> jVar = this.f94008g;
        do {
            value = jVar.getValue();
        } while (!jVar.compareAndSet(value, com.max.xiaoheihe.module.voice.a.o(value, false, false, true, null, 0, 0, false, false, null, false, false, false, null, bb.c.k.C5, null)));
    }

    private final void K() {
        String name;
        com.max.xiaoheihe.module.voice.a value;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46667, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (c.class.isAnonymousClass()) {
            name = c.class.getName();
            f0.m(name);
        } else {
            name = c.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append("handleServiceDisconnected");
        aVar.q(sb2.toString());
        j<com.max.xiaoheihe.module.voice.a> jVar = this.f94008g;
        do {
            value = jVar.getValue();
        } while (!jVar.compareAndSet(value, com.max.xiaoheihe.module.voice.a.o(value, false, false, false, null, 0, 0, false, false, null, false, true, false, null, bb.c.g.f32855gc, null)));
    }

    private final void L() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46665, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, 10);
        this.f94010i = handlerThread;
        handlerThread.start();
        HandlerThread handlerThread2 = this.f94010i;
        a aVar = null;
        if (handlerThread2 == null) {
            f0.S("handlerThread");
            handlerThread2 = null;
        }
        Looper looper = handlerThread2.getLooper();
        f0.o(looper, "handlerThread.looper");
        this.f94012k = looper;
        Looper looper2 = this.f94012k;
        if (looper2 == null) {
            f0.S("mMessengerLooper");
            looper2 = null;
        }
        this.f94013l = new a(this, looper2);
        a aVar2 = this.f94013l;
        if (aVar2 == null) {
            f0.S("mMessengerHandler");
        } else {
            aVar = aVar2;
        }
        this.f94011j = new Messenger(aVar);
    }

    private final void M() throws RemoteException {
        String name;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46660, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String str = "openAudio, mBound = " + this.f94006e;
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (c.class.isAnonymousClass()) {
            name = c.class.getName();
            f0.m(name);
        } else {
            name = c.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str);
        aVar.q(sb2.toString());
        if (this.f94006e) {
            Messenger messenger = null;
            Message messageObtain = Message.obtain((Handler) null, 3);
            Messenger messenger2 = this.f94011j;
            if (messenger2 == null) {
                f0.S("mMessenger");
            } else {
                messenger = messenger2;
            }
            messageObtain.replyTo = messenger;
            Messenger messenger3 = this.f94005d;
            if (messenger3 != null) {
                messenger3.send(messageObtain);
            }
        }
    }

    public static final /* synthetic */ void e(c cVar, Message message) {
        if (PatchProxy.proxy(new Object[]{cVar, message}, null, changeQuickRedirect, true, 46673, new Class[]{c.class, Message.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.B(message);
    }

    public static final /* synthetic */ void f(c cVar, Message message) {
        if (PatchProxy.proxy(new Object[]{cVar, message}, null, changeQuickRedirect, true, 46676, new Class[]{c.class, Message.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.C(message);
    }

    public static final /* synthetic */ void g(c cVar, Message message) {
        if (PatchProxy.proxy(new Object[]{cVar, message}, null, changeQuickRedirect, true, 46677, new Class[]{c.class, Message.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.D(message);
    }

    public static final /* synthetic */ void h(c cVar, Message message) throws RemoteException {
        if (PatchProxy.proxy(new Object[]{cVar, message}, null, changeQuickRedirect, true, 46675, new Class[]{c.class, Message.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.E(message);
    }

    public static final /* synthetic */ void i(c cVar, Message message) {
        if (PatchProxy.proxy(new Object[]{cVar, message}, null, changeQuickRedirect, true, 46674, new Class[]{c.class, Message.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.F(message);
    }

    public static final /* synthetic */ void k(c cVar, Message message) throws RemoteException {
        if (PatchProxy.proxy(new Object[]{cVar, message}, null, changeQuickRedirect, true, 46678, new Class[]{c.class, Message.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.G(message);
    }

    public static final /* synthetic */ void m(c cVar, Message message) throws RemoteException {
        if (PatchProxy.proxy(new Object[]{cVar, message}, null, changeQuickRedirect, true, 46679, new Class[]{c.class, Message.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.H(message);
    }

    public static final /* synthetic */ void n(c cVar) {
        if (PatchProxy.proxy(new Object[]{cVar}, null, changeQuickRedirect, true, 46680, new Class[]{c.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.J();
    }

    public static final /* synthetic */ void o(c cVar) {
        if (PatchProxy.proxy(new Object[]{cVar}, null, changeQuickRedirect, true, 46681, new Class[]{c.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.K();
    }

    private final void u(int i10) throws RemoteException {
        String name;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 46661, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        String str = "closeAudio, mBound = " + this.f94006e;
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (c.class.isAnonymousClass()) {
            name = c.class.getName();
            f0.m(name);
        } else {
            name = c.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str);
        aVar.q(sb2.toString());
        if (this.f94006e) {
            Bundle bundle = new Bundle();
            bundle.putInt(com.max.xiaoheihe.module.voice.component.a.f94102r, i10);
            Messenger messenger = null;
            Message messageObtain = Message.obtain((Handler) null, 4);
            messageObtain.setData(bundle);
            Messenger messenger2 = this.f94011j;
            if (messenger2 == null) {
                f0.S("mMessenger");
            } else {
                messenger = messenger2;
            }
            messageObtain.replyTo = messenger;
            Messenger messenger3 = this.f94005d;
            if (messenger3 != null) {
                messenger3.send(messageObtain);
            }
        }
    }

    public static /* synthetic */ void z(c cVar, int i10, int i11, Object obj) throws RemoteException {
        Object[] objArr = {cVar, new Integer(i10), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 46658, new Class[]{c.class, cls, cls, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i11 & 1) != 0) {
            i10 = 50;
        }
        cVar.y(i10);
    }

    public final void A() throws RemoteException {
        com.max.xiaoheihe.module.voice.a value;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46659, new Class[0], Void.TYPE).isSupported && f0.g(this.f94009h.getValue().p(), Boolean.TRUE)) {
            int i10 = this.f94014m;
            if (i10 <= 0) {
                i10 = 50;
            }
            I(i10, true);
            j<com.max.xiaoheihe.module.voice.a> jVar = this.f94008g;
            do {
                value = jVar.getValue();
            } while (!jVar.compareAndSet(value, com.max.xiaoheihe.module.voice.a.o(value, false, false, false, null, 0, 0, false, false, null, false, false, false, Boolean.FALSE, 4095, null)));
        }
    }

    public final void I(@androidx.annotation.f0(from = 0, to = AndroidComposeViewAccessibilityDelegateCompat.F) int i10, boolean z10) throws RemoteException {
        String name;
        com.max.xiaoheihe.module.voice.a value;
        if (PatchProxy.proxy(new Object[]{new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 46663, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        String str = "onProgressChanged, fromUser = " + z10 + ", progress = " + i10;
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (c.class.isAnonymousClass()) {
            name = c.class.getName();
            f0.m(name);
        } else {
            name = c.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str);
        aVar.q(sb2.toString());
        if (this.f94006e) {
            this.f94009h.getValue().z();
            if (z10) {
                Bundle bundle = new Bundle();
                bundle.putInt(com.max.xiaoheihe.module.voice.component.a.f94102r, i10);
                Messenger messenger = null;
                Message messageObtain = Message.obtain((Handler) null, 300);
                messageObtain.setData(bundle);
                Messenger messenger2 = this.f94011j;
                if (messenger2 == null) {
                    f0.S("mMessenger");
                } else {
                    messenger = messenger2;
                }
                messageObtain.replyTo = messenger;
                Messenger messenger3 = this.f94005d;
                if (messenger3 != null) {
                    messenger3.send(messageObtain);
                }
            }
            j<com.max.xiaoheihe.module.voice.a> jVar = this.f94008g;
            do {
                value = jVar.getValue();
            } while (!jVar.compareAndSet(value, com.max.xiaoheihe.module.voice.a.o(value, false, false, false, null, 0, i10, false, false, null, false, false, false, null, bb.c.k.f33426a5, null)));
        }
    }

    public final void N(@d PCDeviceInfo pcDeviceInfo) {
        String name;
        if (PatchProxy.proxy(new Object[]{pcDeviceInfo}, this, changeQuickRedirect, false, 46652, new Class[]{PCDeviceInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(pcDeviceInfo, "pcDeviceInfo");
        String str = "setPCDeviceInfo, pcDeviceInfo = " + pcDeviceInfo;
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (c.class.isAnonymousClass()) {
            name = c.class.getName();
            f0.m(name);
        } else {
            name = c.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str);
        aVar.q(sb2.toString());
        j<com.max.xiaoheihe.module.voice.a> jVar = this.f94008g;
        while (true) {
            com.max.xiaoheihe.module.voice.a value = jVar.getValue();
            j<com.max.xiaoheihe.module.voice.a> jVar2 = jVar;
            if (jVar2.compareAndSet(value, com.max.xiaoheihe.module.voice.a.o(value, false, false, false, pcDeviceInfo, 0, 0, false, false, null, false, false, false, null, bb.c.k.f33971y5, null))) {
                return;
            } else {
                jVar = jVar2;
            }
        }
    }

    public final void O(int i10) throws RemoteException {
        String name;
        com.max.xiaoheihe.module.voice.a value;
        com.max.xiaoheihe.module.voice.a value2;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 46656, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        String str = "switchAudio, isAudioStarted = " + this.f94009h.getValue().z() + ", preProgress = " + this.f94014m;
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (c.class.isAnonymousClass()) {
            name = c.class.getName();
            f0.m(name);
        } else {
            name = c.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str);
        aVar.q(sb2.toString());
        new Bundle();
        if (this.f94009h.getValue().z()) {
            if (this.f94009h.getValue().x() > 0) {
                this.f94014m = i10;
                j<com.max.xiaoheihe.module.voice.a> jVar = this.f94008g;
                do {
                    value2 = jVar.getValue();
                } while (!jVar.compareAndSet(value2, com.max.xiaoheihe.module.voice.a.o(value2, false, false, false, null, 0, 0, false, false, null, false, false, false, null, bb.c.k.f33426a5, null)));
                I(0, true);
                return;
            }
            int i11 = this.f94014m;
            if (i11 <= 0) {
                i11 = 50;
            }
            j<com.max.xiaoheihe.module.voice.a> jVar2 = this.f94008g;
            do {
                value = jVar2.getValue();
            } while (!jVar2.compareAndSet(value, com.max.xiaoheihe.module.voice.a.o(value, false, false, false, null, 0, this.f94014m, false, false, null, false, false, false, null, bb.c.k.f33426a5, null)));
            I(i11, true);
        }
    }

    public final void P() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46654, new Class[0], Void.TYPE).isSupported && this.f94006e) {
            ((HeyBoxApplication) c()).unbindService(this.f94007f);
            this.f94005d = null;
            this.f94006e = false;
        }
    }

    @Override // androidx.lifecycle.w0
    public void onCleared() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46672, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onCleared();
        Looper looper = this.f94012k;
        if (looper == null) {
            f0.S("mMessengerLooper");
            looper = null;
        }
        looper.quitSafely();
        P();
    }

    public final void s() {
        com.max.xiaoheihe.module.voice.a value;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46671, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        j<com.max.xiaoheihe.module.voice.a> jVar = this.f94008g;
        do {
            value = jVar.getValue();
        } while (!jVar.compareAndSet(value, com.max.xiaoheihe.module.voice.a.o(value, true, false, false, null, 0, 0, false, false, null, false, false, false, null, bb.c.k.F5, null)));
    }

    public final void t() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46653, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Intent intent = new Intent(c(), (Class<?>) HeyboxMicService.class);
        ((HeyBoxApplication) c()).startService(intent);
        ((HeyBoxApplication) c()).bindService(intent, this.f94007f, 1);
    }

    public final void v() throws RemoteException {
        String name;
        com.max.xiaoheihe.module.voice.a value;
        com.max.xiaoheihe.module.voice.a value2;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46655, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String str = "connect, mBound = " + this.f94006e + ", value = " + this.f94009h.getValue();
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (c.class.isAnonymousClass()) {
            name = c.class.getName();
            f0.m(name);
        } else {
            name = c.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str);
        aVar.q(sb2.toString());
        if (this.f94006e) {
            PCDeviceInfo pCDeviceInfoU = this.f94009h.getValue().u();
            if (pCDeviceInfoU == null) {
                j<com.max.xiaoheihe.module.voice.a> jVar = this.f94008g;
                do {
                    value2 = jVar.getValue();
                } while (!jVar.compareAndSet(value2, com.max.xiaoheihe.module.voice.a.o(value2, false, false, false, null, 0, 0, false, false, null, true, false, false, null, bb.c.i.V0, null)));
                return;
            }
            j<com.max.xiaoheihe.module.voice.a> jVar2 = this.f94008g;
            do {
                value = jVar2.getValue();
            } while (!jVar2.compareAndSet(value, com.max.xiaoheihe.module.voice.a.o(value, false, true, false, null, 0, 0, false, false, null, false, false, false, null, bb.c.k.E5, null)));
            Bundle bundle = new Bundle();
            bundle.putSerializable(com.max.xiaoheihe.module.voice.component.a.f94100p, pCDeviceInfoU);
            Messenger messenger = null;
            Message messageObtain = Message.obtain((Handler) null, 1);
            messageObtain.setData(bundle);
            Messenger messenger2 = this.f94011j;
            if (messenger2 == null) {
                f0.S("mMessenger");
            } else {
                messenger = messenger2;
            }
            messageObtain.replyTo = messenger;
            Messenger messenger3 = this.f94005d;
            if (messenger3 != null) {
                messenger3.send(messageObtain);
            }
        }
    }

    public final void w() throws RemoteException {
        String name;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46664, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (c.class.isAnonymousClass()) {
            name = c.class.getName();
            f0.m(name);
        } else {
            name = c.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append("disconnect");
        aVar.q(sb2.toString());
        Messenger messenger = null;
        Message messageObtain = Message.obtain((Handler) null, 2);
        Messenger messenger2 = this.f94011j;
        if (messenger2 == null) {
            f0.S("mMessenger");
        } else {
            messenger = messenger2;
        }
        messageObtain.replyTo = messenger;
        Messenger messenger3 = this.f94005d;
        if (messenger3 != null) {
            messenger3.send(messageObtain);
        }
    }

    @d
    public final u<com.max.xiaoheihe.module.voice.a> x() {
        return this.f94009h;
    }

    public final void y(int i10) throws RemoteException {
        com.max.xiaoheihe.module.voice.a value;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 46657, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f94014m = i10;
        I(0, true);
        j<com.max.xiaoheihe.module.voice.a> jVar = this.f94008g;
        do {
            value = jVar.getValue();
        } while (!jVar.compareAndSet(value, com.max.xiaoheihe.module.voice.a.o(value, false, false, false, null, 0, 0, false, false, null, false, false, false, Boolean.TRUE, 4095, null)));
    }
}
