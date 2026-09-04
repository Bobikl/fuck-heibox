package com.max.hbdatastore;

import android.content.Context;
import androidx.p001datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.p001datastore.preferences.core.PreferencesKt;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import kotlin.b2;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.t0;
import kotlin.properties.e;
import kotlin.reflect.n;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.j;
import xh.m;

/* JADX INFO: compiled from: HBPreferences.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nHBPreferences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HBPreferences.kt\ncom/max/hbdatastore/HBPreferences\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,168:1\n47#2:169\n49#2:173\n47#2:174\n49#2:178\n47#2:179\n49#2:183\n47#2:184\n49#2:188\n47#2:189\n49#2:193\n47#2:194\n49#2:198\n50#3:170\n55#3:172\n50#3:175\n55#3:177\n50#3:180\n55#3:182\n50#3:185\n55#3:187\n50#3:190\n55#3:192\n50#3:195\n55#3:197\n106#4:171\n106#4:176\n106#4:181\n106#4:186\n106#4:191\n106#4:196\n*S KotlinDebug\n*F\n+ 1 HBPreferences.kt\ncom/max/hbdatastore/HBPreferences\n*L\n61#1:169\n61#1:173\n68#1:174\n68#1:178\n75#1:179\n75#1:183\n82#1:184\n82#1:188\n89#1:189\n89#1:193\n96#1:194\n96#1:198\n61#1:170\n61#1:172\n68#1:175\n68#1:177\n75#1:180\n75#1:182\n82#1:185\n82#1:187\n89#1:190\n89#1:192\n96#1:195\n96#1:197\n61#1:171\n68#1:176\n75#1:181\n82#1:186\n89#1:191\n96#1:196\n*E\n"})
public final class HBPreferences {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f69811b = {n0.v(new PropertyReference2Impl(HBPreferences.class, "CONFIG", "getCONFIG(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final HBPreferences f69810a = new HBPreferences();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    public static final String f69812c = "preferences_config";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    private static final e f69813d = PreferenceDataStoreDelegateKt.b(f69812c, null, null, null, 14, null);

    private HBPreferences() {
    }

    @m
    public static final <T> void B(@d androidx.p001datastore.core.d<androidx.p001datastore.preferences.core.a> dataStore, @d String key, T t10) throws InterruptedException {
        if (PatchProxy.proxy(new Object[]{dataStore, key, t10}, null, changeQuickRedirect, true, c.f.Uz, new Class[]{androidx.p001datastore.core.d.class, String.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dataStore, "dataStore");
        f0.p(key, "key");
        f69810a.C(dataStore, key, t10);
    }

    private final Object D(androidx.p001datastore.core.d<androidx.p001datastore.preferences.core.a> dVar, String str, boolean z10, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar, str, new Byte(z10 ? (byte) 1 : (byte) 0), cVar}, this, changeQuickRedirect, false, c.f.aA, new Class[]{androidx.p001datastore.core.d.class, String.class, Boolean.TYPE, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objA = PreferencesKt.a(dVar, new HBPreferences$updateBoolean$2(androidx.p001datastore.preferences.core.c.a(str), z10, null), cVar);
        return objA == b.h() ? objA : b2.f124493a;
    }

    private final Object E(androidx.p001datastore.core.d<androidx.p001datastore.preferences.core.a> dVar, String str, double d10, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar, str, new Double(d10), cVar}, this, changeQuickRedirect, false, c.f.Yz, new Class[]{androidx.p001datastore.core.d.class, String.class, Double.TYPE, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objA = PreferencesKt.a(dVar, new HBPreferences$updateDouble$2(androidx.p001datastore.preferences.core.c.b(str), d10, null), cVar);
        return objA == b.h() ? objA : b2.f124493a;
    }

    private final Object F(androidx.p001datastore.core.d<androidx.p001datastore.preferences.core.a> dVar, String str, float f10, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar, str, new Float(f10), cVar}, this, changeQuickRedirect, false, c.f.Xz, new Class[]{androidx.p001datastore.core.d.class, String.class, Float.TYPE, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objA = PreferencesKt.a(dVar, new HBPreferences$updateFloat$2(androidx.p001datastore.preferences.core.c.c(str), f10, null), cVar);
        return objA == b.h() ? objA : b2.f124493a;
    }

    private final Object G(androidx.p001datastore.core.d<androidx.p001datastore.preferences.core.a> dVar, String str, int i10, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar, str, new Integer(i10), cVar}, this, changeQuickRedirect, false, c.f.Vz, new Class[]{androidx.p001datastore.core.d.class, String.class, Integer.TYPE, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objA = PreferencesKt.a(dVar, new HBPreferences$updateInt$2(androidx.p001datastore.preferences.core.c.d(str), i10, null), cVar);
        return objA == b.h() ? objA : b2.f124493a;
    }

    private final Object H(androidx.p001datastore.core.d<androidx.p001datastore.preferences.core.a> dVar, String str, long j10, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar, str, new Long(j10), cVar}, this, changeQuickRedirect, false, c.f.Wz, new Class[]{androidx.p001datastore.core.d.class, String.class, Long.TYPE, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objA = PreferencesKt.a(dVar, new HBPreferences$updateLong$2(androidx.p001datastore.preferences.core.c.e(str), j10, null), cVar);
        return objA == b.h() ? objA : b2.f124493a;
    }

    private final Object I(androidx.p001datastore.core.d<androidx.p001datastore.preferences.core.a> dVar, String str, String str2, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar, str, str2, cVar}, this, changeQuickRedirect, false, c.f.Zz, new Class[]{androidx.p001datastore.core.d.class, String.class, String.class, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objA = PreferencesKt.a(dVar, new HBPreferences$updateString$2(str2, androidx.p001datastore.preferences.core.c.f(str), null), cVar);
        return objA == b.h() ? objA : b2.f124493a;
    }

    @d
    @m
    public static final androidx.p001datastore.core.d<androidx.p001datastore.preferences.core.a> a(@d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, c.f.Fz, new Class[]{Context.class}, androidx.p001datastore.core.d.class);
        if (patchProxyResultProxy.isSupported) {
            return (androidx.p001datastore.core.d) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        return f69810a.u(context);
    }

    public static final /* synthetic */ Object b(HBPreferences hBPreferences, androidx.p001datastore.core.d dVar, String str, boolean z10, kotlin.coroutines.c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hBPreferences, dVar, str, new Byte(z10 ? (byte) 1 : (byte) 0), cVar}, null, changeQuickRedirect, true, c.f.fA, new Class[]{HBPreferences.class, androidx.p001datastore.core.d.class, String.class, Boolean.TYPE, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : hBPreferences.t(dVar, str, z10, cVar);
    }

    public static final /* synthetic */ Object c(HBPreferences hBPreferences, androidx.p001datastore.core.d dVar, String str, double d10, kotlin.coroutines.c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hBPreferences, dVar, str, new Double(d10), cVar}, null, changeQuickRedirect, true, c.f.eA, new Class[]{HBPreferences.class, androidx.p001datastore.core.d.class, String.class, Double.TYPE, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : hBPreferences.v(dVar, str, d10, cVar);
    }

    public static final /* synthetic */ Object d(HBPreferences hBPreferences, androidx.p001datastore.core.d dVar, String str, float f10, kotlin.coroutines.c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hBPreferences, dVar, str, new Float(f10), cVar}, null, changeQuickRedirect, true, c.f.dA, new Class[]{HBPreferences.class, androidx.p001datastore.core.d.class, String.class, Float.TYPE, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : hBPreferences.w(dVar, str, f10, cVar);
    }

    public static final /* synthetic */ Object e(HBPreferences hBPreferences, androidx.p001datastore.core.d dVar, String str, int i10, kotlin.coroutines.c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hBPreferences, dVar, str, new Integer(i10), cVar}, null, changeQuickRedirect, true, c.f.bA, new Class[]{HBPreferences.class, androidx.p001datastore.core.d.class, String.class, Integer.TYPE, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : hBPreferences.x(dVar, str, i10, cVar);
    }

    public static final /* synthetic */ Object f(HBPreferences hBPreferences, androidx.p001datastore.core.d dVar, String str, long j10, kotlin.coroutines.c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hBPreferences, dVar, str, new Long(j10), cVar}, null, changeQuickRedirect, true, c.f.cA, new Class[]{HBPreferences.class, androidx.p001datastore.core.d.class, String.class, Long.TYPE, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : hBPreferences.y(dVar, str, j10, cVar);
    }

    public static final /* synthetic */ Object g(HBPreferences hBPreferences, androidx.p001datastore.core.d dVar, String str, String str2, kotlin.coroutines.c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hBPreferences, dVar, str, str2, cVar}, null, changeQuickRedirect, true, c.f.gA, new Class[]{HBPreferences.class, androidx.p001datastore.core.d.class, String.class, String.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : hBPreferences.z(dVar, str, str2, cVar);
    }

    public static final /* synthetic */ Object h(HBPreferences hBPreferences, androidx.p001datastore.core.d dVar, String str, boolean z10, kotlin.coroutines.c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hBPreferences, dVar, str, new Byte(z10 ? (byte) 1 : (byte) 0), cVar}, null, changeQuickRedirect, true, c.f.mA, new Class[]{HBPreferences.class, androidx.p001datastore.core.d.class, String.class, Boolean.TYPE, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : hBPreferences.D(dVar, str, z10, cVar);
    }

    public static final /* synthetic */ Object i(HBPreferences hBPreferences, androidx.p001datastore.core.d dVar, String str, double d10, kotlin.coroutines.c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hBPreferences, dVar, str, new Double(d10), cVar}, null, changeQuickRedirect, true, c.f.kA, new Class[]{HBPreferences.class, androidx.p001datastore.core.d.class, String.class, Double.TYPE, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : hBPreferences.E(dVar, str, d10, cVar);
    }

    public static final /* synthetic */ Object j(HBPreferences hBPreferences, androidx.p001datastore.core.d dVar, String str, float f10, kotlin.coroutines.c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hBPreferences, dVar, str, new Float(f10), cVar}, null, changeQuickRedirect, true, c.f.jA, new Class[]{HBPreferences.class, androidx.p001datastore.core.d.class, String.class, Float.TYPE, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : hBPreferences.F(dVar, str, f10, cVar);
    }

    public static final /* synthetic */ Object k(HBPreferences hBPreferences, androidx.p001datastore.core.d dVar, String str, int i10, kotlin.coroutines.c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hBPreferences, dVar, str, new Integer(i10), cVar}, null, changeQuickRedirect, true, c.f.hA, new Class[]{HBPreferences.class, androidx.p001datastore.core.d.class, String.class, Integer.TYPE, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : hBPreferences.G(dVar, str, i10, cVar);
    }

    public static final /* synthetic */ Object l(HBPreferences hBPreferences, androidx.p001datastore.core.d dVar, String str, long j10, kotlin.coroutines.c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hBPreferences, dVar, str, new Long(j10), cVar}, null, changeQuickRedirect, true, c.f.iA, new Class[]{HBPreferences.class, androidx.p001datastore.core.d.class, String.class, Long.TYPE, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : hBPreferences.H(dVar, str, j10, cVar);
    }

    public static final /* synthetic */ Object m(HBPreferences hBPreferences, androidx.p001datastore.core.d dVar, String str, String str2, kotlin.coroutines.c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hBPreferences, dVar, str, str2, cVar}, null, changeQuickRedirect, true, c.f.lA, new Class[]{HBPreferences.class, androidx.p001datastore.core.d.class, String.class, String.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : hBPreferences.I(dVar, str, str2, cVar);
    }

    @m
    public static final void o(@d androidx.p001datastore.core.d<androidx.p001datastore.preferences.core.a> dataStore) throws InterruptedException {
        if (PatchProxy.proxy(new Object[]{dataStore}, null, changeQuickRedirect, true, c.f.Iz, new Class[]{androidx.p001datastore.core.d.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dataStore, "dataStore");
        f69810a.p(dataStore);
    }

    @m
    public static final <T> T q(@d androidx.p001datastore.core.d<androidx.p001datastore.preferences.core.a> dataStore, @d String key, T t10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dataStore, key, t10}, null, changeQuickRedirect, true, c.f.Lz, new Class[]{androidx.p001datastore.core.d.class, String.class, Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return (T) patchProxyResultProxy.result;
        }
        f0.p(dataStore, "dataStore");
        f0.p(key, "key");
        return (T) f69810a.s(dataStore, key, t10);
    }

    private final Object t(androidx.p001datastore.core.d<androidx.p001datastore.preferences.core.a> dVar, String str, final boolean z10, kotlin.coroutines.c<? super Boolean> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar, str, new Byte(z10 ? (byte) 1 : (byte) 0), cVar}, this, changeQuickRedirect, false, c.f.Qz, new Class[]{androidx.p001datastore.core.d.class, String.class, Boolean.TYPE, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        final androidx.p001datastore.preferences.core.a.C0158a<Boolean> c0158aA = androidx.p001datastore.preferences.core.c.a(str);
        final kotlinx.coroutines.flow.e<androidx.p001datastore.preferences.core.a> data = dVar.getData();
        return g.t0(new kotlinx.coroutines.flow.e<Boolean>() { // from class: com.max.hbdatastore.HBPreferences$getBoolean$$inlined$map$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: com.max.hbdatastore.HBPreferences$getBoolean$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Collect.kt */
            @t0({"SMAP\nCollect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collect$3\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 HBPreferences.kt\ncom/max/hbdatastore/HBPreferences\n*L\n1#1,134:1\n53#2:135\n48#3:136\n90#4:137\n*E\n"})
            public static final class AnonymousClass2 implements f<androidx.p001datastore.preferences.core.a> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ f f69825b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ androidx.p001datastore.preferences.core.a.C0158a f69826c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ boolean f69827d;

                /* JADX INFO: renamed from: com.max.hbdatastore.HBPreferences$getBoolean$$inlined$map$1$2$1, reason: invalid class name */
                @kotlin.coroutines.jvm.internal.d(c = "com.max.hbdatastore.HBPreferences$getBoolean$$inlined$map$1$2", f = "HBPreferences.kt", i = {}, l = {136}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f69828b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f69829c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    Object f69830d;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final Object invokeSuspend(@d Object obj) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.f.BA, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        this.f69828b = obj;
                        this.f69829c |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(f fVar, androidx.p001datastore.preferences.core.a.C0158a c0158a, boolean z10) {
                    this.f69825b = fVar;
                    this.f69826c = c0158a;
                    this.f69827d = z10;
                }

                /* JADX WARN: Code duplicated, block: B:11:0x0039  */
                @Override // kotlinx.coroutines.flow.f
                @dl.e
                public Object emit(androidx.p001datastore.preferences.core.a aVar, @d kotlin.coroutines.c cVar) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, cVar}, this, changeQuickRedirect, false, c.f.AA, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i10 = anonymousClass1.f69829c;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f69829c = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(cVar);
                    }
                    Object obj = anonymousClass1.f69828b;
                    Object objH = b.h();
                    int i11 = anonymousClass1.f69829c;
                    if (i11 == 0) {
                        kotlin.t0.n(obj);
                        f fVar = this.f69825b;
                        Boolean bool = (Boolean) aVar.c(this.f69826c);
                        Boolean boolA = kotlin.coroutines.jvm.internal.a.a(bool != null ? bool.booleanValue() : this.f69827d);
                        anonymousClass1.f69829c = 1;
                        if (fVar.emit(boolA, anonymousClass1) == objH) {
                            return objH;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.t0.n(obj);
                    }
                    return b2.f124493a;
                }
            }

            @Override // kotlinx.coroutines.flow.e
            @dl.e
            public Object a(@d f<? super Boolean> fVar, @d kotlin.coroutines.c cVar2) {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{fVar, cVar2}, this, changeQuickRedirect, false, c.f.zA, new Class[]{f.class, kotlin.coroutines.c.class}, Object.class);
                if (patchProxyResultProxy2.isSupported) {
                    return patchProxyResultProxy2.result;
                }
                Object objA = data.a(new AnonymousClass2(fVar, c0158aA, z10), cVar2);
                return objA == b.h() ? objA : b2.f124493a;
            }
        }, cVar);
    }

    private final Object v(androidx.p001datastore.core.d<androidx.p001datastore.preferences.core.a> dVar, String str, final double d10, kotlin.coroutines.c<? super Double> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar, str, new Double(d10), cVar}, this, changeQuickRedirect, false, c.f.Pz, new Class[]{androidx.p001datastore.core.d.class, String.class, Double.TYPE, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        final androidx.p001datastore.preferences.core.a.C0158a<Double> c0158aB = androidx.p001datastore.preferences.core.c.b(str);
        final kotlinx.coroutines.flow.e<androidx.p001datastore.preferences.core.a> data = dVar.getData();
        return g.t0(new kotlinx.coroutines.flow.e<Double>() { // from class: com.max.hbdatastore.HBPreferences$getDouble$$inlined$map$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: com.max.hbdatastore.HBPreferences$getDouble$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Collect.kt */
            @t0({"SMAP\nCollect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collect$3\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 HBPreferences.kt\ncom/max/hbdatastore/HBPreferences\n*L\n1#1,134:1\n53#2:135\n48#3:136\n83#4:137\n*E\n"})
            public static final class AnonymousClass2 implements f<androidx.p001datastore.preferences.core.a> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ f f69835b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ androidx.p001datastore.preferences.core.a.C0158a f69836c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ double f69837d;

                /* JADX INFO: renamed from: com.max.hbdatastore.HBPreferences$getDouble$$inlined$map$1$2$1, reason: invalid class name */
                @kotlin.coroutines.jvm.internal.d(c = "com.max.hbdatastore.HBPreferences$getDouble$$inlined$map$1$2", f = "HBPreferences.kt", i = {}, l = {136}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f69838b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f69839c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    Object f69840d;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final Object invokeSuspend(@d Object obj) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.f.EA, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        this.f69838b = obj;
                        this.f69839c |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(f fVar, androidx.p001datastore.preferences.core.a.C0158a c0158a, double d10) {
                    this.f69835b = fVar;
                    this.f69836c = c0158a;
                    this.f69837d = d10;
                }

                /* JADX WARN: Code duplicated, block: B:11:0x0039  */
                @Override // kotlinx.coroutines.flow.f
                @dl.e
                public Object emit(androidx.p001datastore.preferences.core.a aVar, @d kotlin.coroutines.c cVar) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, cVar}, this, changeQuickRedirect, false, c.f.DA, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i10 = anonymousClass1.f69839c;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f69839c = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(cVar);
                    }
                    Object obj = anonymousClass1.f69838b;
                    Object objH = b.h();
                    int i11 = anonymousClass1.f69839c;
                    if (i11 == 0) {
                        kotlin.t0.n(obj);
                        f fVar = this.f69835b;
                        Double d10 = (Double) aVar.c(this.f69836c);
                        Double d11 = kotlin.coroutines.jvm.internal.a.d(d10 != null ? d10.doubleValue() : this.f69837d);
                        anonymousClass1.f69839c = 1;
                        if (fVar.emit(d11, anonymousClass1) == objH) {
                            return objH;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.t0.n(obj);
                    }
                    return b2.f124493a;
                }
            }

            @Override // kotlinx.coroutines.flow.e
            @dl.e
            public Object a(@d f<? super Double> fVar, @d kotlin.coroutines.c cVar2) {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{fVar, cVar2}, this, changeQuickRedirect, false, c.f.CA, new Class[]{f.class, kotlin.coroutines.c.class}, Object.class);
                if (patchProxyResultProxy2.isSupported) {
                    return patchProxyResultProxy2.result;
                }
                Object objA = data.a(new AnonymousClass2(fVar, c0158aB, d10), cVar2);
                return objA == b.h() ? objA : b2.f124493a;
            }
        }, cVar);
    }

    private final Object w(androidx.p001datastore.core.d<androidx.p001datastore.preferences.core.a> dVar, String str, final float f10, kotlin.coroutines.c<? super Float> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar, str, new Float(f10), cVar}, this, changeQuickRedirect, false, c.f.Oz, new Class[]{androidx.p001datastore.core.d.class, String.class, Float.TYPE, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        final androidx.p001datastore.preferences.core.a.C0158a<Float> c0158aC = androidx.p001datastore.preferences.core.c.c(str);
        final kotlinx.coroutines.flow.e<androidx.p001datastore.preferences.core.a> data = dVar.getData();
        return g.t0(new kotlinx.coroutines.flow.e<Float>() { // from class: com.max.hbdatastore.HBPreferences$getFloat$$inlined$map$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: com.max.hbdatastore.HBPreferences$getFloat$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Collect.kt */
            @t0({"SMAP\nCollect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collect$3\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 HBPreferences.kt\ncom/max/hbdatastore/HBPreferences\n*L\n1#1,134:1\n53#2:135\n48#3:136\n76#4:137\n*E\n"})
            public static final class AnonymousClass2 implements f<androidx.p001datastore.preferences.core.a> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ f f69845b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ androidx.p001datastore.preferences.core.a.C0158a f69846c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ float f69847d;

                /* JADX INFO: renamed from: com.max.hbdatastore.HBPreferences$getFloat$$inlined$map$1$2$1, reason: invalid class name */
                @kotlin.coroutines.jvm.internal.d(c = "com.max.hbdatastore.HBPreferences$getFloat$$inlined$map$1$2", f = "HBPreferences.kt", i = {}, l = {136}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f69848b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f69849c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    Object f69850d;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final Object invokeSuspend(@d Object obj) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.f.HA, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        this.f69848b = obj;
                        this.f69849c |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(f fVar, androidx.p001datastore.preferences.core.a.C0158a c0158a, float f10) {
                    this.f69845b = fVar;
                    this.f69846c = c0158a;
                    this.f69847d = f10;
                }

                /* JADX WARN: Code duplicated, block: B:11:0x0039  */
                @Override // kotlinx.coroutines.flow.f
                @dl.e
                public Object emit(androidx.p001datastore.preferences.core.a aVar, @d kotlin.coroutines.c cVar) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, cVar}, this, changeQuickRedirect, false, c.f.GA, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i10 = anonymousClass1.f69849c;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f69849c = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(cVar);
                    }
                    Object obj = anonymousClass1.f69848b;
                    Object objH = b.h();
                    int i11 = anonymousClass1.f69849c;
                    if (i11 == 0) {
                        kotlin.t0.n(obj);
                        f fVar = this.f69845b;
                        Float f10 = (Float) aVar.c(this.f69846c);
                        Float fE = kotlin.coroutines.jvm.internal.a.e(f10 != null ? f10.floatValue() : this.f69847d);
                        anonymousClass1.f69849c = 1;
                        if (fVar.emit(fE, anonymousClass1) == objH) {
                            return objH;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.t0.n(obj);
                    }
                    return b2.f124493a;
                }
            }

            @Override // kotlinx.coroutines.flow.e
            @dl.e
            public Object a(@d f<? super Float> fVar, @d kotlin.coroutines.c cVar2) {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{fVar, cVar2}, this, changeQuickRedirect, false, c.f.FA, new Class[]{f.class, kotlin.coroutines.c.class}, Object.class);
                if (patchProxyResultProxy2.isSupported) {
                    return patchProxyResultProxy2.result;
                }
                Object objA = data.a(new AnonymousClass2(fVar, c0158aC, f10), cVar2);
                return objA == b.h() ? objA : b2.f124493a;
            }
        }, cVar);
    }

    private final Object x(androidx.p001datastore.core.d<androidx.p001datastore.preferences.core.a> dVar, String str, final int i10, kotlin.coroutines.c<? super Integer> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar, str, new Integer(i10), cVar}, this, changeQuickRedirect, false, c.f.Mz, new Class[]{androidx.p001datastore.core.d.class, String.class, Integer.TYPE, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        final androidx.p001datastore.preferences.core.a.C0158a<Integer> c0158aD = androidx.p001datastore.preferences.core.c.d(str);
        final kotlinx.coroutines.flow.e<androidx.p001datastore.preferences.core.a> data = dVar.getData();
        return g.t0(new kotlinx.coroutines.flow.e<Integer>() { // from class: com.max.hbdatastore.HBPreferences$getInt$$inlined$map$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: com.max.hbdatastore.HBPreferences$getInt$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Collect.kt */
            @t0({"SMAP\nCollect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collect$3\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 HBPreferences.kt\ncom/max/hbdatastore/HBPreferences\n*L\n1#1,134:1\n53#2:135\n48#3:136\n62#4:137\n*E\n"})
            public static final class AnonymousClass2 implements f<androidx.p001datastore.preferences.core.a> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ f f69855b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ androidx.p001datastore.preferences.core.a.C0158a f69856c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ int f69857d;

                /* JADX INFO: renamed from: com.max.hbdatastore.HBPreferences$getInt$$inlined$map$1$2$1, reason: invalid class name */
                @kotlin.coroutines.jvm.internal.d(c = "com.max.hbdatastore.HBPreferences$getInt$$inlined$map$1$2", f = "HBPreferences.kt", i = {}, l = {136}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f69858b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f69859c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    Object f69860d;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final Object invokeSuspend(@d Object obj) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.f.KA, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        this.f69858b = obj;
                        this.f69859c |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(f fVar, androidx.p001datastore.preferences.core.a.C0158a c0158a, int i10) {
                    this.f69855b = fVar;
                    this.f69856c = c0158a;
                    this.f69857d = i10;
                }

                /* JADX WARN: Code duplicated, block: B:11:0x0039  */
                @Override // kotlinx.coroutines.flow.f
                @dl.e
                public Object emit(androidx.p001datastore.preferences.core.a aVar, @d kotlin.coroutines.c cVar) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, cVar}, this, changeQuickRedirect, false, c.f.JA, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i10 = anonymousClass1.f69859c;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f69859c = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(cVar);
                    }
                    Object obj = anonymousClass1.f69858b;
                    Object objH = b.h();
                    int i11 = anonymousClass1.f69859c;
                    if (i11 == 0) {
                        kotlin.t0.n(obj);
                        f fVar = this.f69855b;
                        Integer num = (Integer) aVar.c(this.f69856c);
                        Integer numF = kotlin.coroutines.jvm.internal.a.f(num != null ? num.intValue() : this.f69857d);
                        anonymousClass1.f69859c = 1;
                        if (fVar.emit(numF, anonymousClass1) == objH) {
                            return objH;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.t0.n(obj);
                    }
                    return b2.f124493a;
                }
            }

            @Override // kotlinx.coroutines.flow.e
            @dl.e
            public Object a(@d f<? super Integer> fVar, @d kotlin.coroutines.c cVar2) {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{fVar, cVar2}, this, changeQuickRedirect, false, c.f.IA, new Class[]{f.class, kotlin.coroutines.c.class}, Object.class);
                if (patchProxyResultProxy2.isSupported) {
                    return patchProxyResultProxy2.result;
                }
                Object objA = data.a(new AnonymousClass2(fVar, c0158aD, i10), cVar2);
                return objA == b.h() ? objA : b2.f124493a;
            }
        }, cVar);
    }

    private final Object y(androidx.p001datastore.core.d<androidx.p001datastore.preferences.core.a> dVar, String str, final long j10, kotlin.coroutines.c<? super Long> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar, str, new Long(j10), cVar}, this, changeQuickRedirect, false, c.f.Nz, new Class[]{androidx.p001datastore.core.d.class, String.class, Long.TYPE, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        final androidx.p001datastore.preferences.core.a.C0158a<Long> c0158aE = androidx.p001datastore.preferences.core.c.e(str);
        final kotlinx.coroutines.flow.e<androidx.p001datastore.preferences.core.a> data = dVar.getData();
        return g.t0(new kotlinx.coroutines.flow.e<Long>() { // from class: com.max.hbdatastore.HBPreferences$getLong$$inlined$map$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: com.max.hbdatastore.HBPreferences$getLong$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Collect.kt */
            @t0({"SMAP\nCollect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collect$3\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 HBPreferences.kt\ncom/max/hbdatastore/HBPreferences\n*L\n1#1,134:1\n53#2:135\n48#3:136\n69#4:137\n*E\n"})
            public static final class AnonymousClass2 implements f<androidx.p001datastore.preferences.core.a> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ f f69865b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ androidx.p001datastore.preferences.core.a.C0158a f69866c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ long f69867d;

                /* JADX INFO: renamed from: com.max.hbdatastore.HBPreferences$getLong$$inlined$map$1$2$1, reason: invalid class name */
                @kotlin.coroutines.jvm.internal.d(c = "com.max.hbdatastore.HBPreferences$getLong$$inlined$map$1$2", f = "HBPreferences.kt", i = {}, l = {136}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f69868b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f69869c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    Object f69870d;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final Object invokeSuspend(@d Object obj) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.f.NA, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        this.f69868b = obj;
                        this.f69869c |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(f fVar, androidx.p001datastore.preferences.core.a.C0158a c0158a, long j10) {
                    this.f69865b = fVar;
                    this.f69866c = c0158a;
                    this.f69867d = j10;
                }

                /* JADX WARN: Code duplicated, block: B:11:0x0039  */
                @Override // kotlinx.coroutines.flow.f
                @dl.e
                public Object emit(androidx.p001datastore.preferences.core.a aVar, @d kotlin.coroutines.c cVar) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, cVar}, this, changeQuickRedirect, false, c.f.MA, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i10 = anonymousClass1.f69869c;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f69869c = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(cVar);
                    }
                    Object obj = anonymousClass1.f69868b;
                    Object objH = b.h();
                    int i11 = anonymousClass1.f69869c;
                    if (i11 == 0) {
                        kotlin.t0.n(obj);
                        f fVar = this.f69865b;
                        Long l10 = (Long) aVar.c(this.f69866c);
                        Long lG = kotlin.coroutines.jvm.internal.a.g(l10 != null ? l10.longValue() : this.f69867d);
                        anonymousClass1.f69869c = 1;
                        if (fVar.emit(lG, anonymousClass1) == objH) {
                            return objH;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.t0.n(obj);
                    }
                    return b2.f124493a;
                }
            }

            @Override // kotlinx.coroutines.flow.e
            @dl.e
            public Object a(@d f<? super Long> fVar, @d kotlin.coroutines.c cVar2) {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{fVar, cVar2}, this, changeQuickRedirect, false, c.f.LA, new Class[]{f.class, kotlin.coroutines.c.class}, Object.class);
                if (patchProxyResultProxy2.isSupported) {
                    return patchProxyResultProxy2.result;
                }
                Object objA = data.a(new AnonymousClass2(fVar, c0158aE, j10), cVar2);
                return objA == b.h() ? objA : b2.f124493a;
            }
        }, cVar);
    }

    private final Object z(androidx.p001datastore.core.d<androidx.p001datastore.preferences.core.a> dVar, String str, final String str2, kotlin.coroutines.c<? super String> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar, str, str2, cVar}, this, changeQuickRedirect, false, c.f.Rz, new Class[]{androidx.p001datastore.core.d.class, String.class, String.class, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        final androidx.p001datastore.preferences.core.a.C0158a<String> c0158aF = androidx.p001datastore.preferences.core.c.f(str);
        final kotlinx.coroutines.flow.e<androidx.p001datastore.preferences.core.a> data = dVar.getData();
        return g.t0(new kotlinx.coroutines.flow.e<String>() { // from class: com.max.hbdatastore.HBPreferences$getString$$inlined$map$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: com.max.hbdatastore.HBPreferences$getString$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Collect.kt */
            @t0({"SMAP\nCollect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collect$3\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 HBPreferences.kt\ncom/max/hbdatastore/HBPreferences\n*L\n1#1,134:1\n53#2:135\n48#3:136\n97#4:137\n*E\n"})
            public static final class AnonymousClass2 implements f<androidx.p001datastore.preferences.core.a> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ f f69875b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ androidx.p001datastore.preferences.core.a.C0158a f69876c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ String f69877d;

                /* JADX INFO: renamed from: com.max.hbdatastore.HBPreferences$getString$$inlined$map$1$2$1, reason: invalid class name */
                @kotlin.coroutines.jvm.internal.d(c = "com.max.hbdatastore.HBPreferences$getString$$inlined$map$1$2", f = "HBPreferences.kt", i = {}, l = {136}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f69878b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f69879c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    Object f69880d;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final Object invokeSuspend(@d Object obj) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.f.QA, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        this.f69878b = obj;
                        this.f69879c |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(f fVar, androidx.p001datastore.preferences.core.a.C0158a c0158a, String str) {
                    this.f69875b = fVar;
                    this.f69876c = c0158a;
                    this.f69877d = str;
                }

                /* JADX WARN: Code duplicated, block: B:11:0x0039  */
                @Override // kotlinx.coroutines.flow.f
                @dl.e
                public Object emit(androidx.p001datastore.preferences.core.a aVar, @d kotlin.coroutines.c cVar) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, cVar}, this, changeQuickRedirect, false, c.f.PA, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i10 = anonymousClass1.f69879c;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f69879c = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(cVar);
                    }
                    Object obj = anonymousClass1.f69878b;
                    Object objH = b.h();
                    int i11 = anonymousClass1.f69879c;
                    if (i11 == 0) {
                        kotlin.t0.n(obj);
                        f fVar = this.f69875b;
                        String str = (String) aVar.c(this.f69876c);
                        if (str == null) {
                            str = this.f69877d;
                        }
                        anonymousClass1.f69879c = 1;
                        if (fVar.emit(str, anonymousClass1) == objH) {
                            return objH;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.t0.n(obj);
                    }
                    return b2.f124493a;
                }
            }

            @Override // kotlinx.coroutines.flow.e
            @dl.e
            public Object a(@d f<? super String> fVar, @d kotlin.coroutines.c cVar2) {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{fVar, cVar2}, this, changeQuickRedirect, false, c.f.OA, new Class[]{f.class, kotlin.coroutines.c.class}, Object.class);
                if (patchProxyResultProxy2.isSupported) {
                    return patchProxyResultProxy2.result;
                }
                Object objA = data.a(new AnonymousClass2(fVar, c0158aF, str2), cVar2);
                return objA == b.h() ? objA : b2.f124493a;
            }
        }, cVar);
    }

    @dl.e
    public final <T> Object A(@d androidx.p001datastore.core.d<androidx.p001datastore.preferences.core.a> dVar, @d String str, T t10, @d kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar, str, t10, cVar}, this, changeQuickRedirect, false, c.f.Tz, new Class[]{androidx.p001datastore.core.d.class, String.class, Object.class, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        if (t10 instanceof Integer) {
            Object objG = G(dVar, str, ((Number) t10).intValue(), cVar);
            return objG == b.h() ? objG : b2.f124493a;
        }
        if (t10 instanceof Long) {
            Object objH = H(dVar, str, ((Number) t10).longValue(), cVar);
            return objH == b.h() ? objH : b2.f124493a;
        }
        if (t10 instanceof Float) {
            Object objF = F(dVar, str, ((Number) t10).floatValue(), cVar);
            return objF == b.h() ? objF : b2.f124493a;
        }
        if (t10 instanceof Double) {
            Object objE = E(dVar, str, ((Number) t10).doubleValue(), cVar);
            return objE == b.h() ? objE : b2.f124493a;
        }
        if (t10 instanceof Boolean) {
            Object objD = D(dVar, str, ((Boolean) t10).booleanValue(), cVar);
            return objD == b.h() ? objD : b2.f124493a;
        }
        if (!(t10 != 0 ? t10 instanceof String : true)) {
            throw new IllegalArgumentException("DataStore 不支持改类型");
        }
        Object objI = I(dVar, str, (String) t10, cVar);
        return objI == b.h() ? objI : b2.f124493a;
    }

    public final <T> void C(@d androidx.p001datastore.core.d<androidx.p001datastore.preferences.core.a> dVar, @d String key, T t10) throws InterruptedException {
        if (PatchProxy.proxy(new Object[]{dVar, key, t10}, this, changeQuickRedirect, false, c.f.Sz, new Class[]{androidx.p001datastore.core.d.class, String.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dVar, "<this>");
        f0.p(key, "key");
        j.b(null, new HBPreferences$updateAsync$1(dVar, key, t10, null), 1, null);
    }

    @dl.e
    public final Object n(@d androidx.p001datastore.core.d<androidx.p001datastore.preferences.core.a> dVar, @d kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar, cVar}, this, changeQuickRedirect, false, c.f.Hz, new Class[]{androidx.p001datastore.core.d.class, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objA = PreferencesKt.a(dVar, new HBPreferences$clear$2(null), cVar);
        return objA == b.h() ? objA : b2.f124493a;
    }

    public final void p(@d androidx.p001datastore.core.d<androidx.p001datastore.preferences.core.a> dVar) throws InterruptedException {
        if (PatchProxy.proxy(new Object[]{dVar}, this, changeQuickRedirect, false, c.f.Gz, new Class[]{androidx.p001datastore.core.d.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dVar, "<this>");
        j.b(null, new HBPreferences$clearAsync$1(dVar, null), 1, null);
    }

    @dl.e
    public final <T> Object r(@d androidx.p001datastore.core.d<androidx.p001datastore.preferences.core.a> dVar, @d String str, T t10, @d kotlin.coroutines.c<? super T> cVar) {
        Object objZ;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar, str, t10, cVar}, this, changeQuickRedirect, false, c.f.Kz, new Class[]{androidx.p001datastore.core.d.class, String.class, Object.class, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        if (t10 instanceof Integer) {
            objZ = x(dVar, str, ((Number) t10).intValue(), cVar);
            if (objZ == b.h()) {
                return objZ;
            }
        } else if (t10 instanceof Long) {
            objZ = y(dVar, str, ((Number) t10).longValue(), cVar);
            if (objZ == b.h()) {
                return objZ;
            }
        } else if (t10 instanceof Float) {
            objZ = w(dVar, str, ((Number) t10).floatValue(), cVar);
            if (objZ == b.h()) {
                return objZ;
            }
        } else if (t10 instanceof Double) {
            objZ = v(dVar, str, ((Number) t10).doubleValue(), cVar);
            if (objZ == b.h()) {
                return objZ;
            }
        } else if (t10 instanceof Boolean) {
            objZ = t(dVar, str, ((Boolean) t10).booleanValue(), cVar);
            if (objZ == b.h()) {
                return objZ;
            }
        } else {
            if (!(t10 != 0 ? t10 instanceof String : true)) {
                throw new IllegalArgumentException("DataStore 不支持改类型");
            }
            objZ = z(dVar, str, (String) t10, cVar);
            if (objZ == b.h()) {
            }
        }
        return objZ;
    }

    public final <T> T s(@d androidx.p001datastore.core.d<androidx.p001datastore.preferences.core.a> dVar, @d String key, T t10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar, key, t10}, this, changeQuickRedirect, false, c.f.Jz, new Class[]{androidx.p001datastore.core.d.class, String.class, Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return (T) patchProxyResultProxy.result;
        }
        f0.p(dVar, "<this>");
        f0.p(key, "key");
        return (T) j.b(null, new HBPreferences$getAsync$1(dVar, key, t10, null), 1, null);
    }

    @d
    public final androidx.p001datastore.core.d<androidx.p001datastore.preferences.core.a> u(@d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, c.f.Ez, new Class[]{Context.class}, androidx.p001datastore.core.d.class);
        if (patchProxyResultProxy.isSupported) {
            return (androidx.p001datastore.core.d) patchProxyResultProxy.result;
        }
        f0.p(context, "<this>");
        return (androidx.p001datastore.core.d) f69813d.a(context, f69811b[0]);
    }
}
