package com.max.xiaoheihe.module.voice.streaming;

import com.max.heybox.hblog.g;
import com.max.xiaoheihe.module.voice.audio.AudioBuffer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import yh.p;

/* JADX INFO: compiled from: WifiStreamer.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nWifiStreamer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WifiStreamer.kt\ncom/max/xiaoheihe/module/voice/streaming/WifiStreamer$stream$2\n+ 2 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n*L\n1#1,244:1\n27#2:245\n5#2,2:246\n22#2:248\n7#2:249\n*S KotlinDebug\n*F\n+ 1 WifiStreamer.kt\ncom/max/xiaoheihe/module/voice/streaming/WifiStreamer$stream$2\n*L\n166#1:245\n166#1:246,2\n166#1:248\n166#1:249\n*E\n"})
@d(c = "com.max.xiaoheihe.module.voice.streaming.WifiStreamer$stream$2", f = "WifiStreamer.kt", i = {0, 1, 1, 2, 2}, l = {147, 150, 162}, m = "invokeSuspend", n = {"$this$withContext", "$this$withContext", "readSize", "$this$withContext", "readSize"}, s = {"L$0", "L$0", "I$0", "L$0", "I$0"})
public final class WifiStreamer$stream$2 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f94136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f94137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f94138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ WifiStreamer f94139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ AudioBuffer f94140f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WifiStreamer$stream$2(WifiStreamer wifiStreamer, AudioBuffer audioBuffer, c<? super WifiStreamer$stream$2> cVar) {
        super(2, cVar);
        this.f94139e = wifiStreamer;
        this.f94140f = audioBuffer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46845, new Class[]{Object.class, c.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        WifiStreamer$stream$2 wifiStreamer$stream$2 = new WifiStreamer$stream$2(this.f94139e, this.f94140f, cVar);
        wifiStreamer$stream$2.f94138d = obj;
        return wifiStreamer$stream$2;
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46847, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46846, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((WifiStreamer$stream$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e9 A[Catch: Exception -> 0x0111, IOException -> 0x0113, CancellationException -> 0x0116, all -> 0x0175, TRY_LEAVE, TryCatch #9 {all -> 0x0175, blocks: (B:50:0x00c4, B:52:0x00e9, B:75:0x011f, B:77:0x014a, B:79:0x0159, B:78:0x0152), top: B:105:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:77:0x014a A[Catch: all -> 0x0175, TryCatch #9 {all -> 0x0175, blocks: (B:50:0x00c4, B:52:0x00e9, B:75:0x011f, B:77:0x014a, B:79:0x0159, B:78:0x0152), top: B:105:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0152 A[Catch: all -> 0x0175, TryCatch #9 {all -> 0x0175, blocks: (B:50:0x00c4, B:52:0x00e9, B:75:0x011f, B:77:0x014a, B:79:0x0159, B:78:0x0152), top: B:105:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:82:0x016f  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a9 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Class, java.lang.Class<kotlinx.coroutines.q0>] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.max.xiaoheihe.module.voice.audio.AudioBuffer] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.q0] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [kotlinx.coroutines.q0] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [kotlinx.coroutines.q0] */
    /* JADX WARN: Type inference failed for: r1v9, types: [kotlinx.coroutines.q0] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        int i10;
        int i11;
        String name;
        ?? r10;
        OutputStream outputStream;
        int iIntValue;
        int iIntValue2;
        ?? r11 = q0.class;
        ?? r12 = 1;
        r12 = 1;
        r12 = 1;
        ?? r13 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46844, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i12 = this.f94137c;
        try {
            try {
                try {
                    if (i12 == 0) {
                        kotlin.t0.n(obj);
                        q0 q0Var = (q0) this.f94138d;
                        if (this.f94139e.f94126k != null) {
                            Socket socket = this.f94139e.f94126k;
                            if (socket != null && socket.isConnected()) {
                                AudioBuffer audioBuffer = this.f94140f;
                                this.f94138d = q0Var;
                                this.f94137c = 1;
                                Object objJ = audioBuffer.j(this);
                                if (objJ == objH) {
                                    return objH;
                                }
                                r12 = q0Var;
                                obj = objJ;
                            }
                        }
                        return b2.f124493a;
                    }
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i13 = this.f94136b;
                            q0 q0Var2 = (q0) this.f94138d;
                            kotlin.t0.n(obj);
                            r11 = i13;
                            r12 = q0Var2;
                            this.f94139e.disconnect();
                            if (r0.k(r12)) {
                                this.f94140f.c(0);
                            }
                            return b2.f124493a;
                        }
                        int i14 = this.f94136b;
                        q0 q0Var3 = (q0) this.f94138d;
                        try {
                            kotlin.t0.n(obj);
                            i11 = i14;
                            r12 = q0Var3;
                            try {
                                Pair pair = (Pair) obj;
                                Socket socket2 = this.f94139e.f94126k;
                                f0.m(socket2);
                                outputStream = socket2.getOutputStream();
                                iIntValue = ((Number) pair.e()).intValue();
                                iIntValue2 = ((Number) pair.f()).intValue();
                                if (outputStream != null) {
                                    outputStream.write(this.f94140f.g(), iIntValue2, iIntValue);
                                }
                                try {
                                    outputStream.flush();
                                    if (r0.k(r12)) {
                                        this.f94140f.c(iIntValue);
                                    }
                                } catch (IOException e10) {
                                    e = e10;
                                    i10 = iIntValue;
                                    r10 = r12;
                                    g.f74531b.M(this.f94139e.f94124i + ", " + e.getMessage());
                                    this.f94138d = r10;
                                    this.f94136b = i10;
                                    this.f94137c = 3;
                                    r11 = i10;
                                    r12 = r10;
                                    if (DelayKt.b(5L, this) == objH) {
                                        return objH;
                                    }
                                    this.f94139e.disconnect();
                                    if (r0.k(r12)) {
                                        this.f94140f.c(0);
                                    }
                                } catch (CancellationException e11) {
                                    e = e11;
                                    g.f74531b.M(this.f94139e.f94124i + ", CancellationException: " + e.getMessage() + ", " + e.getCause());
                                    throw e;
                                } catch (Exception e12) {
                                    e = e12;
                                    String str = this.f94139e.f94124i + ", error msg: " + e.getMessage();
                                    g.a aVar = g.f74531b;
                                    StringBuilder sb2 = new StringBuilder();
                                    if (r11.isAnonymousClass()) {
                                        name = r11.getName();
                                        f0.m(name);
                                    } else {
                                        name = r11.getSimpleName();
                                        f0.m(name);
                                    }
                                    sb2.append(name);
                                    sb2.append(", ");
                                    sb2.append(str);
                                    aVar.M(sb2.toString());
                                    if (r0.k(r12)) {
                                        this.f94140f.c(0);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    r13 = iIntValue;
                                    if (r0.k(r12)) {
                                        this.f94140f.c(r13);
                                    }
                                    throw th;
                                }
                            } catch (IOException e13) {
                                e = e13;
                                i10 = i11;
                                r10 = r12;
                            } catch (CancellationException e14) {
                                e = e14;
                            } catch (Exception e15) {
                                e = e15;
                            }
                        } catch (IOException e16) {
                            e = e16;
                            i10 = i14;
                            r10 = q0Var3;
                            g.f74531b.M(this.f94139e.f94124i + ", " + e.getMessage());
                            this.f94138d = r10;
                            this.f94136b = i10;
                            this.f94137c = 3;
                            r11 = i10;
                            r12 = r10;
                            if (DelayKt.b(5L, this) == objH) {
                                return objH;
                            }
                            this.f94139e.disconnect();
                            if (r0.k(r12)) {
                                this.f94140f.c(0);
                            }
                            return b2.f124493a;
                        } catch (CancellationException e17) {
                            e = e17;
                            g.f74531b.M(this.f94139e.f94124i + ", CancellationException: " + e.getMessage() + ", " + e.getCause());
                            throw e;
                        } catch (Exception e18) {
                            e = e18;
                            r12 = q0Var3;
                            String str2 = this.f94139e.f94124i + ", error msg: " + e.getMessage();
                            g.a aVar2 = g.f74531b;
                            StringBuilder sb3 = new StringBuilder();
                            if (r11.isAnonymousClass()) {
                                name = r11.getSimpleName();
                                f0.m(name);
                            } else {
                                name = r11.getName();
                                f0.m(name);
                            }
                            sb3.append(name);
                            sb3.append(", ");
                            sb3.append(str2);
                            aVar2.M(sb3.toString());
                            if (r0.k(r12)) {
                                this.f94140f.c(0);
                            }
                            return b2.f124493a;
                        } catch (Throwable th3) {
                            th = th3;
                            r13 = i14;
                            r12 = q0Var3;
                            if (r0.k(r12)) {
                                this.f94140f.c(r13);
                            }
                            throw th;
                        }
                        return b2.f124493a;
                    }
                    q0 q0Var4 = (q0) this.f94138d;
                    kotlin.t0.n(obj);
                    r12 = q0Var4;
                    if (!((Boolean) obj).booleanValue()) {
                        try {
                            AudioBuffer audioBuffer2 = this.f94140f;
                            this.f94138d = r12;
                            this.f94136b = 0;
                            this.f94137c = 2;
                            obj = audioBuffer2.k(1024, this);
                            if (obj == objH) {
                                return objH;
                            }
                            i11 = 0;
                            r12 = r12;
                            Pair pair2 = (Pair) obj;
                            Socket socket3 = this.f94139e.f94126k;
                            f0.m(socket3);
                            outputStream = socket3.getOutputStream();
                            iIntValue = ((Number) pair2.e()).intValue();
                            iIntValue2 = ((Number) pair2.f()).intValue();
                            if (outputStream != null) {
                                outputStream.write(this.f94140f.g(), iIntValue2, iIntValue);
                            }
                            outputStream.flush();
                            if (r0.k(r12)) {
                                this.f94140f.c(iIntValue);
                            }
                            return b2.f124493a;
                        } catch (IOException e19) {
                            e = e19;
                            i10 = 0;
                            r10 = r12;
                            g.f74531b.M(this.f94139e.f94124i + ", " + e.getMessage());
                            this.f94138d = r10;
                            this.f94136b = i10;
                            this.f94137c = 3;
                            r11 = i10;
                            r12 = r10;
                            if (DelayKt.b(5L, this) == objH) {
                                return objH;
                            }
                            this.f94139e.disconnect();
                            if (r0.k(r12)) {
                                this.f94140f.c(0);
                            }
                            return b2.f124493a;
                        } catch (CancellationException e20) {
                            e = e20;
                            g.f74531b.M(this.f94139e.f94124i + ", CancellationException: " + e.getMessage() + ", " + e.getCause());
                            throw e;
                        } catch (Exception e21) {
                            e = e21;
                            String str3 = this.f94139e.f94124i + ", error msg: " + e.getMessage();
                            g.a aVar3 = g.f74531b;
                            StringBuilder sb4 = new StringBuilder();
                            if (r11.isAnonymousClass()) {
                                name = r11.getSimpleName();
                                f0.m(name);
                            } else {
                                name = r11.getName();
                                f0.m(name);
                            }
                            sb4.append(name);
                            sb4.append(", ");
                            sb4.append(str3);
                            aVar3.M(sb4.toString());
                            if (r0.k(r12)) {
                                this.f94140f.c(0);
                            }
                            return b2.f124493a;
                        }
                    }
                    return b2.f124493a;
                } catch (Throwable th4) {
                    th = th4;
                    r13 = i12;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            r13 = r11;
        }
    }
}
