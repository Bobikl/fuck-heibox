package com.max.xiaoheihe.module.voice.streaming;

import android.content.Context;
import androidx.compose.runtime.internal.o;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.module.voice.audio.AudioBuffer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.i;

/* JADX INFO: compiled from: WifiStreamer.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nWifiStreamer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WifiStreamer.kt\ncom/max/xiaoheihe/module/voice/streaming/WifiStreamer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n*L\n1#1,244:1\n1855#2:245\n1856#2:256\n29#3:246\n5#3,2:247\n22#3:249\n7#3:250\n29#3:251\n5#3,2:252\n22#3:254\n7#3:255\n29#3:257\n5#3,2:258\n22#3:260\n7#3:261\n29#3:262\n5#3,2:263\n22#3:265\n7#3:266\n*S KotlinDebug\n*F\n+ 1 WifiStreamer.kt\ncom/max/xiaoheihe/module/voice/streaming/WifiStreamer\n*L\n38#1:245\n38#1:256\n43#1:246\n43#1:247,2\n43#1:249\n43#1:250\n46#1:251\n46#1:252,2\n46#1:254\n46#1:255\n180#1:257\n180#1:258,2\n180#1:260\n180#1:261\n185#1:262\n185#1:263,2\n185#1:265\n185#1:266\n*E\n"})
@o(parameters = 0)
public final class WifiStreamer implements b {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f94119l = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    private final Context f94120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d
    private final List<String> f94121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d
    private final String f94122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @d
    private final String f94123h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @d
    private final String f94124i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f94125j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @e
    private Socket f94126k;

    public WifiStreamer(@d Context ctx, @d List<String> ipList, @d String port, @d String token) {
        f0.p(ctx, "ctx");
        f0.p(ipList, "ipList");
        f0.p(port, "port");
        f0.p(token, "token");
        this.f94120e = ctx;
        this.f94121f = ipList;
        this.f94122g = port;
        this.f94123h = token;
        this.f94124i = "WifiStreamer";
        this.f94125j = 1500;
    }

    private final boolean g(Socket socket, String str) throws InterruptedException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{socket, str}, this, changeQuickRedirect, false, 46830, new Class[]{Socket.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        g.f74531b.q(this.f94124i + ", testConnection, ip = " + str + ", isConnected = " + socket.isConnected());
        if (!socket.isConnected()) {
            return false;
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        i.f(e1.c(), new WifiStreamer$testConnection$1(this, socket, str, booleanRef, null));
        return booleanRef.f124884b;
    }

    @Override // com.max.xiaoheihe.module.voice.streaming.b
    public void close() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46834, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        b.C0889b.b(this);
    }

    @Override // com.max.xiaoheihe.module.voice.streaming.b
    public boolean connect() throws IOException {
        String name;
        b2 b2Var;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46823, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        this.f94126k = new Socket();
        for (String str : this.f94121f) {
            try {
                g.f74531b.q(this.f94124i + ", connect, it = " + str);
                Socket socket = this.f94126k;
                if (socket != null) {
                    socket.connect(new InetSocketAddress(str, Integer.parseInt(this.f94122g)), this.f94125j);
                    b2Var = b2.f124493a;
                } else {
                    b2Var = null;
                }
            } catch (IOException e10) {
                String str2 = this.f94124i + ", connect [Socket]: " + e10.getMessage();
                g.a aVar = g.f74531b;
                StringBuilder sb2 = new StringBuilder();
                if (WifiStreamer.class.isAnonymousClass()) {
                    name = WifiStreamer.class.getName();
                    f0.m(name);
                } else {
                    name = WifiStreamer.class.getSimpleName();
                    f0.m(name);
                }
                sb2.append(name);
                sb2.append(", ");
                sb2.append(str2);
                aVar.q(sb2.toString());
            }
            if (b2Var != null) {
                Socket socket2 = this.f94126k;
                if (socket2 != null) {
                    socket2.setSoTimeout(this.f94125j);
                }
                Socket socket3 = this.f94126k;
                f0.m(socket3);
                if (g(socket3, str)) {
                    break;
                }
                Socket socket4 = this.f94126k;
                if (socket4 != null) {
                    socket4.close();
                }
                this.f94126k = null;
            }
        }
        Socket socket5 = this.f94126k;
        if (socket5 != null) {
            return socket5.isConnected();
        }
        return false;
    }

    @d
    public final List<String> d() {
        return this.f94121f;
    }

    @Override // com.max.xiaoheihe.module.voice.streaming.b
    public boolean disconnect() {
        String name;
        String name2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46828, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Socket socket = this.f94126k;
        if (socket == null) {
            return false;
        }
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e10) {
                String str = this.f94124i + ", disconnect [close]: " + e10.getMessage();
                g.a aVar = g.f74531b;
                StringBuilder sb2 = new StringBuilder();
                if (WifiStreamer.class.isAnonymousClass()) {
                    name = WifiStreamer.class.getName();
                    f0.m(name);
                } else {
                    name = WifiStreamer.class.getSimpleName();
                    f0.m(name);
                }
                sb2.append(name);
                sb2.append(", ");
                sb2.append(str);
                aVar.q(sb2.toString());
                this.f94126k = null;
                return false;
            }
        }
        this.f94126k = null;
        String str2 = this.f94124i + ", disconnect: complete";
        g.a aVar2 = g.f74531b;
        StringBuilder sb3 = new StringBuilder();
        if (WifiStreamer.class.isAnonymousClass()) {
            name2 = WifiStreamer.class.getName();
            f0.m(name2);
        } else {
            name2 = WifiStreamer.class.getSimpleName();
            f0.m(name2);
        }
        sb3.append(name2);
        sb3.append(", ");
        sb3.append(str2);
        aVar2.q(sb3.toString());
        return true;
    }

    @d
    public final String e() {
        return this.f94122g;
    }

    @d
    public final String f() {
        return this.f94123h;
    }

    @Override // com.max.xiaoheihe.module.voice.streaming.b
    @e
    public Object h(@d c<? super String> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 46824, new Class[]{c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : i.h(e1.c(), new WifiStreamer$receive$2(this, null), cVar);
    }

    @Override // com.max.xiaoheihe.module.voice.streaming.b
    @e
    public Boolean i() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46833, new Class[0], Boolean.class);
        return patchProxyResultProxy.isSupported ? (Boolean) patchProxyResultProxy.result : b.C0889b.a(this);
    }

    @Override // com.max.xiaoheihe.module.voice.streaming.b
    @d
    public String j() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46831, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (this.f94126k == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[Device Address]:");
        Socket socket = this.f94126k;
        sb2.append(socket != null ? socket.getRemoteSocketAddress() : null);
        return sb2.toString();
    }

    @Override // com.max.xiaoheihe.module.voice.streaming.b
    @e
    public Object k(@d AudioBuffer audioBuffer, @d c<? super b2> cVar) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{audioBuffer, cVar}, this, changeQuickRedirect, false, 46827, new Class[]{AudioBuffer.class, c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = i.h(e1.c(), new WifiStreamer$stream$2(this, audioBuffer, null), cVar);
        return objH == kotlin.coroutines.intrinsics.b.h() ? objH : b2.f124493a;
    }

    @Override // com.max.xiaoheihe.module.voice.streaming.b
    @e
    public Object l(@d short[] sArr, @d c<? super b2> cVar) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{sArr, cVar}, this, changeQuickRedirect, false, 46826, new Class[]{short[].class, c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = i.h(e1.c(), new WifiStreamer$streamAudioData$2(this, sArr, null), cVar);
        return objH == kotlin.coroutines.intrinsics.b.h() ? objH : b2.f124493a;
    }

    @Override // com.max.xiaoheihe.module.voice.streaming.b
    public boolean m() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46832, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Socket socket = this.f94126k;
        if (socket != null) {
            return socket != null && socket.isConnected();
        }
        return false;
    }

    @Override // com.max.xiaoheihe.module.voice.streaming.b
    @e
    public Object n(@d AudioBuffer audioBuffer, @d String str, @d c<? super b2> cVar) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{audioBuffer, str, cVar}, this, changeQuickRedirect, false, 46825, new Class[]{AudioBuffer.class, String.class, c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = i.h(e1.c(), new WifiStreamer$streamMsg$2(this, str, null), cVar);
        return objH == kotlin.coroutines.intrinsics.b.h() ? objH : b2.f124493a;
    }

    @Override // com.max.xiaoheihe.module.voice.streaming.b
    @e
    public Object o(@d AudioBuffer audioBuffer, @d c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{audioBuffer, cVar}, this, changeQuickRedirect, false, 46835, new Class[]{AudioBuffer.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : b.C0889b.c(this, audioBuffer, cVar);
    }

    @Override // com.max.xiaoheihe.module.voice.streaming.b
    public void shutdown() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46829, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        disconnect();
    }
}
