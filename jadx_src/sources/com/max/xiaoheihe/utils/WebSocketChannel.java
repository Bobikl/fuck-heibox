package com.max.xiaoheihe.utils;

import androidx.lifecycle.Lifecycle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.sync.MutexKt;
import okio.ByteString;

/* JADX INFO: compiled from: websocket.kt */
/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class WebSocketChannel implements m {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f95281g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final q0 f95282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlinx.coroutines.sync.c f95283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private okhttp3.f0 f95284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final kotlinx.coroutines.flow.i<x> f95285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final kotlinx.coroutines.channels.k<x> f95286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final kotlinx.coroutines.flow.e<x> f95287f;

    /* JADX INFO: renamed from: com.max.xiaoheihe.utils.WebSocketChannel$2, reason: invalid class name */
    /* JADX INFO: compiled from: websocket.kt */
    @t0({"SMAP\nwebsocket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 websocket.kt\ncom/max/xiaoheihe/utils/WebSocketChannel$2\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,161:1\n103#2:162\n80#2,6:163\n104#2,2:169\n90#2:171\n86#2,4:172\n*S KotlinDebug\n*F\n+ 1 websocket.kt\ncom/max/xiaoheihe/utils/WebSocketChannel$2\n*L\n71#1:162\n71#1:163,6\n71#1:169,2\n71#1:171\n71#1:172,4\n*E\n"})
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.utils.WebSocketChannel$2", f = "websocket.kt", i = {0}, l = {169}, m = "invokeSuspend", n = {"$this$consume$iv$iv"}, s = {"L$1"})
    public static final class AnonymousClass2 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f95290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f95291c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f95292d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f95293e;

        AnonymousClass2(kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 48952, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : WebSocketChannel.this.new AnonymousClass2(cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 48954, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 48953, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0066 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:0x0067  */
        /* JADX WARN: Code duplicated, block: B:23:0x0077 A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:21:0x006f, B:23:0x0077, B:25:0x009d, B:27:0x00a3), top: B:38:0x006f }] */
        /* JADX WARN: Code duplicated, block: B:25:0x009d A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:21:0x006f, B:23:0x0077, B:25:0x009d, B:27:0x00a3), top: B:38:0x006f }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [com.meituan.robust.ChangeQuickRedirect] */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r3v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
        /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v7 */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v5, types: [kotlinx.coroutines.channels.ReceiveChannel] */
        /* JADX WARN: Type inference failed for: r4v9 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0067 -> B:20:0x006e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r11) {
            /*
                r10 = this;
                r0 = 1
                java.lang.Object[] r1 = new java.lang.Object[r0]
                r2 = 0
                r1[r2] = r11
                com.meituan.robust.ChangeQuickRedirect r3 = com.max.xiaoheihe.utils.WebSocketChannel.AnonymousClass2.changeQuickRedirect
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
                r6[r2] = r4
                java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
                r4 = 0
                r5 = 48951(0xbf37, float:6.8595E-41)
                r2 = r10
                com.meituan.robust.PatchProxyResult r1 = com.meituan.robust.PatchProxy.proxy(r1, r2, r3, r4, r5, r6, r7)
                boolean r2 = r1.isSupported
                if (r2 == 0) goto L20
                java.lang.Object r11 = r1.result
                return r11
            L20:
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
                int r2 = r10.f95293e
                if (r2 == 0) goto L47
                if (r2 != r0) goto L3f
                java.lang.Object r2 = r10.f95292d
                kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
                java.lang.Object r3 = r10.f95291c
                kotlinx.coroutines.channels.ReceiveChannel r3 = (kotlinx.coroutines.channels.ReceiveChannel) r3
                java.lang.Object r4 = r10.f95290b
                com.max.xiaoheihe.utils.WebSocketChannel r4 = (com.max.xiaoheihe.utils.WebSocketChannel) r4
                kotlin.t0.n(r11)     // Catch: java.lang.Throwable -> Lb9
                r5 = r4
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r10
                goto L6e
            L3f:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L47:
                kotlin.t0.n(r11)
                com.max.xiaoheihe.utils.WebSocketChannel r11 = com.max.xiaoheihe.utils.WebSocketChannel.this
                kotlinx.coroutines.channels.k r3 = com.max.xiaoheihe.utils.WebSocketChannel.e(r11)
                com.max.xiaoheihe.utils.WebSocketChannel r11 = com.max.xiaoheihe.utils.WebSocketChannel.this
                kotlinx.coroutines.channels.ChannelIterator r2 = r3.iterator()     // Catch: java.lang.Throwable -> Lb9
                r4 = r11
                r11 = r10
            L58:
                r11.f95290b = r4     // Catch: java.lang.Throwable -> Lb9
                r11.f95291c = r3     // Catch: java.lang.Throwable -> Lb9
                r11.f95292d = r2     // Catch: java.lang.Throwable -> Lb9
                r11.f95293e = r0     // Catch: java.lang.Throwable -> Lb9
                java.lang.Object r5 = r2.b(r11)     // Catch: java.lang.Throwable -> Lb9
                if (r5 != r1) goto L67
                return r1
            L67:
                r9 = r1
                r1 = r11
                r11 = r5
                r5 = r4
                r4 = r3
                r3 = r2
                r2 = r9
            L6e:
                r6 = 0
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> Lb6
                boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> Lb6
                if (r11 == 0) goto Lb0
                java.lang.Object r11 = r3.next()     // Catch: java.lang.Throwable -> Lb6
                com.max.xiaoheihe.utils.x r11 = (com.max.xiaoheihe.utils.x) r11     // Catch: java.lang.Throwable -> Lb6
                com.max.heybox.hblog.g$a r6 = com.max.heybox.hblog.g.f74531b     // Catch: java.lang.Throwable -> Lb6
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb6
                r7.<init>()     // Catch: java.lang.Throwable -> Lb6
                java.lang.String r8 = "WebSocketChannel, send, it = "
                r7.append(r8)     // Catch: java.lang.Throwable -> Lb6
                java.lang.String r8 = r11.e()     // Catch: java.lang.Throwable -> Lb6
                r7.append(r8)     // Catch: java.lang.Throwable -> Lb6
                java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Lb6
                r6.q(r7)     // Catch: java.lang.Throwable -> Lb6
                java.lang.String r11 = r11.e()     // Catch: java.lang.Throwable -> Lb6
                if (r11 == 0) goto Laa
                okhttp3.f0 r6 = com.max.xiaoheihe.utils.WebSocketChannel.g(r5)     // Catch: java.lang.Throwable -> Lb6
                if (r6 == 0) goto Laa
                boolean r11 = r6.send(r11)     // Catch: java.lang.Throwable -> Lb6
                kotlin.coroutines.jvm.internal.a.a(r11)     // Catch: java.lang.Throwable -> Lb6
            Laa:
                r11 = r1
                r1 = r2
                r2 = r3
                r3 = r4
                r4 = r5
                goto L58
            Lb0:
                kotlinx.coroutines.channels.o.b(r4, r6)
                kotlin.b2 r11 = kotlin.b2.f124493a
                return r11
            Lb6:
                r11 = move-exception
                r3 = r4
                goto Lba
            Lb9:
                r11 = move-exception
            Lba:
                throw r11     // Catch: java.lang.Throwable -> Lbb
            Lbb:
                r0 = move-exception
                kotlinx.coroutines.channels.o.b(r3, r11)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.max.xiaoheihe.utils.WebSocketChannel.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: websocket.kt */
    public final class WebSocketChannelListener extends okhttp3.g0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final kotlinx.coroutines.flow.i<x> f95295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final kotlinx.coroutines.channels.k<x> f95296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WebSocketChannel f95297c;

        public WebSocketChannelListener(@dl.d WebSocketChannel webSocketChannel, @dl.d kotlinx.coroutines.flow.i<x> incoming, kotlinx.coroutines.channels.k<x> outgoing) {
            kotlin.jvm.internal.f0.p(incoming, "incoming");
            kotlin.jvm.internal.f0.p(outgoing, "outgoing");
            this.f95297c = webSocketChannel;
            this.f95295a = incoming;
            this.f95296b = outgoing;
        }

        @Override // okhttp3.g0
        public void a(@dl.d okhttp3.f0 webSocket, int i10, @dl.d String reason) {
            if (PatchProxy.proxy(new Object[]{webSocket, new Integer(i10), reason}, this, changeQuickRedirect, false, 48959, new Class[]{okhttp3.f0.class, Integer.TYPE, String.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(webSocket, "webSocket");
            kotlin.jvm.internal.f0.p(reason, "reason");
            kotlinx.coroutines.k.f(this.f95297c.f95282a, e1.c(), null, new WebSocketChannel$WebSocketChannelListener$onClosed$1(i10, reason, this, null), 2, null);
        }

        @Override // okhttp3.g0
        public void b(@dl.d okhttp3.f0 webSocket, int i10, @dl.d String reason) {
            if (PatchProxy.proxy(new Object[]{webSocket, new Integer(i10), reason}, this, changeQuickRedirect, false, 48958, new Class[]{okhttp3.f0.class, Integer.TYPE, String.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(webSocket, "webSocket");
            kotlin.jvm.internal.f0.p(reason, "reason");
        }

        @Override // okhttp3.g0
        public void c(@dl.d okhttp3.f0 webSocket, @dl.d Throwable t10, @dl.e okhttp3.c0 c0Var) {
            if (PatchProxy.proxy(new Object[]{webSocket, t10, c0Var}, this, changeQuickRedirect, false, 48960, new Class[]{okhttp3.f0.class, Throwable.class, okhttp3.c0.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(webSocket, "webSocket");
            kotlin.jvm.internal.f0.p(t10, "t");
            kotlinx.coroutines.k.f(this.f95297c.f95282a, e1.c(), null, new WebSocketChannel$WebSocketChannelListener$onFailure$1(this, null), 2, null);
        }

        @Override // okhttp3.g0
        public void d(@dl.d okhttp3.f0 webSocket, @dl.d String text) {
            if (PatchProxy.proxy(new Object[]{webSocket, text}, this, changeQuickRedirect, false, 48956, new Class[]{okhttp3.f0.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(webSocket, "webSocket");
            kotlin.jvm.internal.f0.p(text, "text");
            kotlinx.coroutines.k.f(this.f95297c.f95282a, e1.c(), null, new WebSocketChannel$WebSocketChannelListener$onMessage$1(text, this, null), 2, null);
        }

        @Override // okhttp3.g0
        public void e(@dl.d okhttp3.f0 webSocket, @dl.d ByteString bytes) {
            if (PatchProxy.proxy(new Object[]{webSocket, bytes}, this, changeQuickRedirect, false, 48957, new Class[]{okhttp3.f0.class, ByteString.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(webSocket, "webSocket");
            kotlin.jvm.internal.f0.p(bytes, "bytes");
            kotlinx.coroutines.k.f(this.f95297c.f95282a, e1.c(), null, new WebSocketChannel$WebSocketChannelListener$onMessage$2(bytes, this, null), 2, null);
        }

        @Override // okhttp3.g0
        public void f(@dl.d okhttp3.f0 webSocket, @dl.d okhttp3.c0 response) {
            if (PatchProxy.proxy(new Object[]{webSocket, response}, this, changeQuickRedirect, false, 48955, new Class[]{okhttp3.f0.class, okhttp3.c0.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(webSocket, "webSocket");
            kotlin.jvm.internal.f0.p(response, "response");
            this.f95297c.f95284c = webSocket;
        }
    }

    public WebSocketChannel(@dl.d androidx.lifecycle.y lifecycleOwner, @dl.d q0 scope) {
        kotlin.jvm.internal.f0.p(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.f0.p(scope, "scope");
        this.f95282a = scope;
        this.f95283b = MutexKt.b(false, 1, null);
        kotlinx.coroutines.flow.i<x> iVarB = kotlinx.coroutines.flow.o.b(0, 0, null, 7, null);
        this.f95285d = iVarB;
        kotlinx.coroutines.channels.k<x> kVarD = kotlinx.coroutines.channels.m.d(10, null, null, 6, null);
        this.f95286e = kVarD;
        this.f95287f = iVarB;
        this.f95284c = m0.x().B();
        final WebSocketChannelListener webSocketChannelListener = new WebSocketChannelListener(this, iVarB, kVarD);
        lifecycleOwner.getLifecycle().a(new androidx.lifecycle.v() { // from class: com.max.xiaoheihe.utils.WebSocketChannel.1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: com.max.xiaoheihe.utils.WebSocketChannel$1$a */
            /* JADX INFO: compiled from: websocket.kt */
            public final /* synthetic */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f95289a;

                static {
                    int[] iArr = new int[Lifecycle.Event.values().length];
                    try {
                        iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f95289a = iArr;
                }
            }

            @Override // androidx.lifecycle.v
            public void d(@dl.d androidx.lifecycle.y source, @dl.d Lifecycle.Event event) {
                if (PatchProxy.proxy(new Object[]{source, event}, this, changeQuickRedirect, false, 48950, new Class[]{androidx.lifecycle.y.class, Lifecycle.Event.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(source, "source");
                kotlin.jvm.internal.f0.p(event, "event");
                int i10 = a.f95289a[event.ordinal()];
                if (i10 == 1) {
                    m0.x().p(webSocketChannelListener);
                } else {
                    if (i10 != 2) {
                        return;
                    }
                    m0.x().H(webSocketChannelListener);
                }
            }
        });
        kotlinx.coroutines.k.f(scope, e1.c(), null, new AnonymousClass2(null), 2, null);
    }

    @Override // com.max.xiaoheihe.utils.m
    @dl.d
    public kotlinx.coroutines.flow.e<x> a() {
        return this.f95287f;
    }

    @Override // com.max.xiaoheihe.utils.m
    @dl.e
    public Object b(@dl.d kotlin.coroutines.c<? super Boolean> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 48947, new Class[]{kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : kotlinx.coroutines.i.h(e1.c(), new WebSocketChannel$checkStatus$2(this, null), cVar);
    }

    @Override // com.max.xiaoheihe.utils.m
    @dl.e
    public Object c(@dl.d x xVar, @dl.d kotlin.coroutines.c<? super Boolean> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{xVar, cVar}, this, changeQuickRedirect, false, 48949, new Class[]{x.class, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        if (xVar.e() == null) {
            return kotlin.coroutines.jvm.internal.a.a(false);
        }
        okhttp3.f0 f0Var = this.f95284c;
        return kotlin.coroutines.jvm.internal.a.a(f0Var != null ? f0Var.send(xVar.e()) : false);
    }

    @Override // com.max.xiaoheihe.utils.m
    public void d(@dl.d x data) {
        if (PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, 48948, new Class[]{x.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(data, "data");
        kotlinx.coroutines.k.f(this.f95282a, e1.c(), null, new WebSocketChannel$send$1(this, data, null), 2, null);
    }

    @dl.d
    public final kotlinx.coroutines.sync.c i() {
        return this.f95283b;
    }

    @Override // com.max.xiaoheihe.utils.m
    public boolean isClosed() {
        return false;
    }
}
