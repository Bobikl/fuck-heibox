package com.jd.jdcache.service.base;

import androidx.annotation.Keep;
import com.jd.jdcache.util.JDCacheLog;
import dl.e;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.FlowKt__CollectionKt;

/* JADX INFO: compiled from: JDCacheNetDelegate.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nJDCacheNetDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDCacheNetDelegate.kt\ncom/jd/jdcache/service/base/JDCacheNetDelegate\n+ 2 JDCacheLog.kt\ncom/jd/jdcache/util/JDCacheLogKt\n*L\n1#1,226:1\n9#2,4:227\n9#2,4:231\n9#2,4:235\n*S KotlinDebug\n*F\n+ 1 JDCacheNetDelegate.kt\ncom/jd/jdcache/service/base/JDCacheNetDelegate\n*L\n44#1:227,4\n77#1:231,4\n108#1:235,4\n*E\n"})
@Keep
public abstract class JDCacheNetDelegate extends AbstractDelegate {

    /* JADX INFO: renamed from: com.jd.jdcache.service.base.JDCacheNetDelegate$connect$1, reason: invalid class name */
    /* JADX INFO: compiled from: JDCacheNetDelegate.kt */
    @d(c = "com.jd.jdcache.service.base.JDCacheNetDelegate", f = "JDCacheNetDelegate.kt", i = {0}, l = {75}, m = "connect$suspendImpl", n = {"$this"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f64196b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f64197c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f64199e;

        AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) {
            this.f64197c = obj;
            this.f64199e |= Integer.MIN_VALUE;
            return JDCacheNetDelegate.connect$suspendImpl(JDCacheNetDelegate.this, null, null, null, null, null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.jd.jdcache.service.base.JDCacheNetDelegate$download$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: JDCacheNetDelegate.kt */
    @d(c = "com.jd.jdcache.service.base.JDCacheNetDelegate", f = "JDCacheNetDelegate.kt", i = {0}, l = {106}, m = "download$suspendImpl", n = {"$this"}, s = {"L$0"})
    public static final class C12961 extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f64200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f64201c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f64203e;

        C12961(c<? super C12961> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) {
            this.f64201c = obj;
            this.f64203e |= Integer.MIN_VALUE;
            return JDCacheNetDelegate.download$suspendImpl(JDCacheNetDelegate.this, null, null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.jd.jdcache.service.base.JDCacheNetDelegate$request$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: JDCacheNetDelegate.kt */
    @d(c = "com.jd.jdcache.service.base.JDCacheNetDelegate", f = "JDCacheNetDelegate.kt", i = {0}, l = {42}, m = "request$suspendImpl", n = {"$this"}, s = {"L$0"})
    public static final class C12971 extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f64204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f64205c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f64207e;

        C12971(c<? super C12971> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) {
            this.f64205c = obj;
            this.f64207e |= Integer.MIN_VALUE;
            return JDCacheNetDelegate.request$suspendImpl(JDCacheNetDelegate.this, null, null, null, null, null, null, false, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object connect$default(JDCacheNetDelegate jDCacheNetDelegate, String str, String str2, Map map, String str3, String str4, Map map2, boolean z10, c cVar, int i10, Object obj) {
        if (obj == null) {
            return jDCacheNetDelegate.connect(str, (i10 & 2) != 0 ? "GET" : str2, (i10 & 4) != 0 ? null : map, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : map2, (i10 & 64) != 0 ? true : z10, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: connect");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    static /* synthetic */ Object connect$suspendImpl(JDCacheNetDelegate jDCacheNetDelegate, String str, String str2, Map<String, String> map, String str3, String str4, Map<String, String> map2, boolean z10, c<? super NetState<InputStream>> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Exception e10;
        JDCacheLog jDCacheLog;
        JDCacheNetDelegate jDCacheNetDelegate2 = jDCacheNetDelegate;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.f64199e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.f64199e = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = jDCacheNetDelegate.new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = jDCacheNetDelegate.new AnonymousClass1(cVar);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object objC = anonymousClass2.f64197c;
        Object objH = b.h();
        int i11 = anonymousClass2.f64199e;
        if (i11 == 0) {
            kotlin.t0.n(objC);
            try {
                kotlinx.coroutines.flow.e<NetState<InputStream>> eVarConnectFlow = jDCacheNetDelegate.connectFlow(str, str2, map, str3, str4, map2, z10);
                if (eVarConnectFlow == null) {
                    return null;
                }
                anonymousClass2.f64196b = jDCacheNetDelegate2;
                anonymousClass2.f64199e = 1;
                objC = FlowKt__CollectionKt.c(eVarConnectFlow, null, anonymousClass2, 1, null);
                if (objC == objH) {
                    return objH;
                }
            } catch (Exception e11) {
                e10 = e11;
                jDCacheLog = JDCacheLog.INSTANCE;
                if (jDCacheLog.getCanLog()) {
                    return null;
                }
                jDCacheLog.e(jDCacheNetDelegate2.getName(), e10);
                return null;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            JDCacheNetDelegate jDCacheNetDelegate3 = (JDCacheNetDelegate) anonymousClass2.f64196b;
            try {
                kotlin.t0.n(objC);
                jDCacheNetDelegate2 = jDCacheNetDelegate3;
            } catch (Exception e12) {
                e10 = e12;
                jDCacheNetDelegate2 = jDCacheNetDelegate3;
                jDCacheLog = JDCacheLog.INSTANCE;
                if (jDCacheLog.getCanLog()) {
                    return null;
                }
                jDCacheLog.e(jDCacheNetDelegate2.getName(), e10);
                return null;
            }
        }
        List list = (List) objC;
        if (list != null) {
            return (NetState) CollectionsKt___CollectionsKt.k3(list);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlinx.coroutines.flow.e connectFlow$default(JDCacheNetDelegate jDCacheNetDelegate, String str, String str2, Map map, String str3, String str4, Map map2, boolean z10, int i10, Object obj) {
        if (obj == null) {
            return jDCacheNetDelegate.connectFlow(str, (i10 & 2) != 0 ? "GET" : str2, (i10 & 4) != 0 ? null : map, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) == 0 ? map2 : null, (i10 & 64) != 0 ? true : z10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: connectFlow");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object download$default(JDCacheNetDelegate jDCacheNetDelegate, String str, String str2, String str3, Map map, String str4, String str5, c cVar, int i10, Object obj) {
        if (obj == null) {
            return jDCacheNetDelegate.download(str, str2, (i10 & 4) != 0 ? "GET" : str3, (i10 & 8) != 0 ? null : map, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: download");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static /* synthetic */ Object download$suspendImpl(JDCacheNetDelegate jDCacheNetDelegate, String str, String str2, String str3, Map<String, String> map, String str4, String str5, c<? super NetState<File>> cVar) throws Throwable {
        C12961 c12961;
        if (cVar instanceof C12961) {
            c12961 = (C12961) cVar;
            int i10 = c12961.f64203e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c12961.f64203e = i10 - Integer.MIN_VALUE;
            } else {
                c12961 = jDCacheNetDelegate.new C12961(cVar);
            }
        } else {
            c12961 = jDCacheNetDelegate.new C12961(cVar);
        }
        Object objC = c12961.f64201c;
        Object objH = b.h();
        int i11 = c12961.f64203e;
        try {
            if (i11 == 0) {
                kotlin.t0.n(objC);
                kotlinx.coroutines.flow.e<NetState<File>> eVarDownloadFlow = jDCacheNetDelegate.downloadFlow(str, str2, str3, map, str4, str5);
                if (eVarDownloadFlow == null) {
                    return null;
                }
                c12961.f64200b = jDCacheNetDelegate;
                c12961.f64203e = 1;
                objC = FlowKt__CollectionKt.c(eVarDownloadFlow, null, c12961, 1, null);
                if (objC == objH) {
                    return objH;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jDCacheNetDelegate = (JDCacheNetDelegate) c12961.f64200b;
                kotlin.t0.n(objC);
            }
            List list = (List) objC;
            if (list != null) {
                return (NetState) CollectionsKt___CollectionsKt.k3(list);
            }
            return null;
        } catch (Exception e10) {
            JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
            if (!jDCacheLog.getCanLog()) {
                return null;
            }
            jDCacheLog.e(jDCacheNetDelegate.getName(), e10);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlinx.coroutines.flow.e downloadFlow$default(JDCacheNetDelegate jDCacheNetDelegate, String str, String str2, String str3, Map map, String str4, String str5, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: downloadFlow");
        }
        if ((i10 & 4) != 0) {
            str3 = "GET";
        }
        return jDCacheNetDelegate.downloadFlow(str, str2, str3, (i10 & 8) != 0 ? null : map, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object request$default(JDCacheNetDelegate jDCacheNetDelegate, String str, String str2, Map map, String str3, String str4, Map map2, boolean z10, c cVar, int i10, Object obj) {
        if (obj == null) {
            return jDCacheNetDelegate.request(str, (i10 & 2) != 0 ? "GET" : str2, (i10 & 4) != 0 ? null : map, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : map2, (i10 & 64) != 0 ? true : z10, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: request");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    static /* synthetic */ Object request$suspendImpl(JDCacheNetDelegate jDCacheNetDelegate, String str, String str2, Map<String, String> map, String str3, String str4, Map<String, String> map2, boolean z10, c<? super NetState<String>> cVar) throws Throwable {
        C12971 c12971;
        Exception e10;
        JDCacheLog jDCacheLog;
        JDCacheNetDelegate jDCacheNetDelegate2 = jDCacheNetDelegate;
        if (cVar instanceof C12971) {
            c12971 = (C12971) cVar;
            int i10 = c12971.f64207e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c12971.f64207e = i10 - Integer.MIN_VALUE;
            } else {
                c12971 = jDCacheNetDelegate.new C12971(cVar);
            }
        } else {
            c12971 = jDCacheNetDelegate.new C12971(cVar);
        }
        C12971 c12972 = c12971;
        Object objC = c12972.f64205c;
        Object objH = b.h();
        int i11 = c12972.f64207e;
        if (i11 == 0) {
            kotlin.t0.n(objC);
            try {
                kotlinx.coroutines.flow.e<NetState<String>> eVarRequestFlow = jDCacheNetDelegate.requestFlow(str, str2, map, str3, str4, map2, z10);
                if (eVarRequestFlow == null) {
                    return null;
                }
                c12972.f64204b = jDCacheNetDelegate2;
                c12972.f64207e = 1;
                objC = FlowKt__CollectionKt.c(eVarRequestFlow, null, c12972, 1, null);
                if (objC == objH) {
                    return objH;
                }
            } catch (Exception e11) {
                e10 = e11;
                jDCacheLog = JDCacheLog.INSTANCE;
                if (jDCacheLog.getCanLog()) {
                    return null;
                }
                jDCacheLog.e(jDCacheNetDelegate2.getName(), e10);
                return null;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            JDCacheNetDelegate jDCacheNetDelegate3 = (JDCacheNetDelegate) c12972.f64204b;
            try {
                kotlin.t0.n(objC);
                jDCacheNetDelegate2 = jDCacheNetDelegate3;
            } catch (Exception e12) {
                e10 = e12;
                jDCacheNetDelegate2 = jDCacheNetDelegate3;
                jDCacheLog = JDCacheLog.INSTANCE;
                if (jDCacheLog.getCanLog()) {
                    return null;
                }
                jDCacheLog.e(jDCacheNetDelegate2.getName(), e10);
                return null;
            }
        }
        List list = (List) objC;
        if (list != null) {
            return (NetState) CollectionsKt___CollectionsKt.k3(list);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlinx.coroutines.flow.e requestFlow$default(JDCacheNetDelegate jDCacheNetDelegate, String str, String str2, Map map, String str3, String str4, Map map2, boolean z10, int i10, Object obj) {
        if (obj == null) {
            return jDCacheNetDelegate.requestFlow(str, (i10 & 2) != 0 ? "GET" : str2, (i10 & 4) != 0 ? null : map, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) == 0 ? map2 : null, (i10 & 64) != 0 ? true : z10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestFlow");
    }

    @e
    public Object connect(@dl.d String str, @dl.d String str2, @e Map<String, String> map, @e String str3, @e String str4, @e Map<String, String> map2, boolean z10, @dl.d c<? super NetState<InputStream>> cVar) {
        return connect$suspendImpl(this, str, str2, map, str3, str4, map2, z10, cVar);
    }

    @e
    public abstract kotlinx.coroutines.flow.e<NetState<InputStream>> connectFlow(@dl.d String str, @dl.d String str2, @e Map<String, String> map, @e String str3, @e String str4, @e Map<String, String> map2, boolean z10);

    @e
    public Object download(@dl.d String str, @dl.d String str2, @dl.d String str3, @e Map<String, String> map, @e String str4, @e String str5, @dl.d c<? super NetState<File>> cVar) {
        return download$suspendImpl(this, str, str2, str3, map, str4, str5, cVar);
    }

    @e
    public abstract kotlinx.coroutines.flow.e<NetState<File>> downloadFlow(@dl.d String str, @dl.d String str2, @dl.d String str3, @e Map<String, String> map, @e String str4, @e String str5);

    @e
    public Object request(@dl.d String str, @dl.d String str2, @e Map<String, String> map, @e String str3, @e String str4, @e Map<String, String> map2, boolean z10, @dl.d c<? super NetState<String>> cVar) {
        return request$suspendImpl(this, str, str2, map, str3, str4, map2, z10, cVar);
    }

    @e
    public abstract kotlinx.coroutines.flow.e<NetState<String>> requestFlow(@dl.d String str, @dl.d String str2, @e Map<String, String> map, @e String str3, @e String str4, @e Map<String, String> map2, boolean z10);
}
