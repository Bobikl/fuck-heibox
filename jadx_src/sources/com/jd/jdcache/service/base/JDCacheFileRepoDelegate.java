package com.jd.jdcache.service.base;

import androidx.annotation.Keep;
import com.jd.jdcache.service.DelegateManager;
import com.jd.jdcache.util.JDCacheLog;
import dl.d;
import dl.e;
import java.io.File;
import java.util.List;
import kotlin.b0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.t0;
import kotlin.z;
import kotlinx.coroutines.flow.FlowKt__CollectionKt;
import yh.a;

/* JADX INFO: compiled from: JDCacheFileRepoDelegate.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nJDCacheFileRepoDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDCacheFileRepoDelegate.kt\ncom/jd/jdcache/service/base/JDCacheFileRepoDelegate\n+ 2 JDCacheLog.kt\ncom/jd/jdcache/util/JDCacheLogKt\n*L\n1#1,198:1\n9#2,4:199\n9#2,4:203\n*S KotlinDebug\n*F\n+ 1 JDCacheFileRepoDelegate.kt\ncom/jd/jdcache/service/base/JDCacheFileRepoDelegate\n*L\n33#1:199,4\n52#1:203,4\n*E\n"})
@Keep
public abstract class JDCacheFileRepoDelegate extends AbstractDelegate {

    @d
    private final z netDelegate$delegate = b0.c(new a<JDCacheNetDelegate>() { // from class: com.jd.jdcache.service.base.JDCacheFileRepoDelegate$netDelegate$2
        @Override // yh.a
        @e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JDCacheNetDelegate invoke() {
            return (JDCacheNetDelegate) DelegateManager.f64178a.c(JDCacheNetDelegate.class);
        }
    });

    /* JADX INFO: renamed from: com.jd.jdcache.service.base.JDCacheFileRepoDelegate$getInputStreamFromNet$1, reason: invalid class name */
    /* JADX INFO: compiled from: JDCacheFileRepoDelegate.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.jd.jdcache.service.base.JDCacheFileRepoDelegate", f = "JDCacheFileRepoDelegate.kt", i = {0}, l = {31}, m = "getInputStreamFromNet$suspendImpl", n = {"$this"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f64187b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f64188c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f64190e;

        AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@d Object obj) {
            this.f64188c = obj;
            this.f64190e |= Integer.MIN_VALUE;
            return JDCacheFileRepoDelegate.getInputStreamFromNet$suspendImpl(JDCacheFileRepoDelegate.this, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.jd.jdcache.service.base.JDCacheFileRepoDelegate$saveFileFromNet$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: JDCacheFileRepoDelegate.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.jd.jdcache.service.base.JDCacheFileRepoDelegate", f = "JDCacheFileRepoDelegate.kt", i = {0}, l = {50}, m = "saveFileFromNet$suspendImpl", n = {"$this"}, s = {"L$0"})
    public static final class C12951 extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f64192b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f64193c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f64195e;

        C12951(c<? super C12951> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@d Object obj) {
            this.f64193c = obj;
            this.f64195e |= Integer.MIN_VALUE;
            return JDCacheFileRepoDelegate.saveFileFromNet$suspendImpl(JDCacheFileRepoDelegate.this, null, null, null, this);
        }
    }

    public static /* synthetic */ Object getInputStreamFromNet$default(JDCacheFileRepoDelegate jDCacheFileRepoDelegate, String str, FileRequestOption fileRequestOption, c cVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInputStreamFromNet");
        }
        if ((i10 & 2) != 0) {
            fileRequestOption = null;
        }
        return jDCacheFileRepoDelegate.getInputStreamFromNet(str, fileRequestOption, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static /* synthetic */ Object getInputStreamFromNet$suspendImpl(JDCacheFileRepoDelegate jDCacheFileRepoDelegate, String str, FileRequestOption fileRequestOption, c<? super InputStreamState> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.f64190e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.f64190e = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = jDCacheFileRepoDelegate.new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = jDCacheFileRepoDelegate.new AnonymousClass1(cVar);
        }
        Object objC = anonymousClass1.f64188c;
        Object objH = b.h();
        int i11 = anonymousClass1.f64190e;
        try {
            if (i11 == 0) {
                kotlin.t0.n(objC);
                kotlinx.coroutines.flow.e<InputStreamState> inputStreamFromNetFlow = jDCacheFileRepoDelegate.getInputStreamFromNetFlow(str, fileRequestOption);
                if (inputStreamFromNetFlow == null) {
                    return null;
                }
                anonymousClass1.f64187b = jDCacheFileRepoDelegate;
                anonymousClass1.f64190e = 1;
                objC = FlowKt__CollectionKt.c(inputStreamFromNetFlow, null, anonymousClass1, 1, null);
                if (objC == objH) {
                    return objH;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jDCacheFileRepoDelegate = (JDCacheFileRepoDelegate) anonymousClass1.f64187b;
                kotlin.t0.n(objC);
            }
            List list = (List) objC;
            if (list != null) {
                return (InputStreamState) CollectionsKt___CollectionsKt.k3(list);
            }
            return null;
        } catch (Exception e10) {
            JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
            if (!jDCacheLog.getCanLog()) {
                return null;
            }
            jDCacheLog.e(jDCacheFileRepoDelegate.getName(), e10);
            return null;
        }
    }

    public static /* synthetic */ kotlinx.coroutines.flow.e getInputStreamFromNetFlow$default(JDCacheFileRepoDelegate jDCacheFileRepoDelegate, String str, FileRequestOption fileRequestOption, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInputStreamFromNetFlow");
        }
        if ((i10 & 2) != 0) {
            fileRequestOption = null;
        }
        return jDCacheFileRepoDelegate.getInputStreamFromNetFlow(str, fileRequestOption);
    }

    public static /* synthetic */ Object saveFileFromAsset$default(JDCacheFileRepoDelegate jDCacheFileRepoDelegate, String str, String str2, FileSaveOption fileSaveOption, c cVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveFileFromAsset");
        }
        if ((i10 & 4) != 0) {
            fileSaveOption = null;
        }
        return jDCacheFileRepoDelegate.saveFileFromAsset(str, str2, fileSaveOption, cVar);
    }

    public static /* synthetic */ Object saveFileFromNet$default(JDCacheFileRepoDelegate jDCacheFileRepoDelegate, String str, String str2, FileSaveOption fileSaveOption, c cVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveFileFromNet");
        }
        if ((i10 & 4) != 0) {
            fileSaveOption = null;
        }
        return jDCacheFileRepoDelegate.saveFileFromNet(str, str2, fileSaveOption, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static /* synthetic */ Object saveFileFromNet$suspendImpl(JDCacheFileRepoDelegate jDCacheFileRepoDelegate, String str, String str2, FileSaveOption fileSaveOption, c<? super FileState> cVar) throws Throwable {
        C12951 c12951;
        if (cVar instanceof C12951) {
            c12951 = (C12951) cVar;
            int i10 = c12951.f64195e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c12951.f64195e = i10 - Integer.MIN_VALUE;
            } else {
                c12951 = jDCacheFileRepoDelegate.new C12951(cVar);
            }
        } else {
            c12951 = jDCacheFileRepoDelegate.new C12951(cVar);
        }
        Object objC = c12951.f64193c;
        Object objH = b.h();
        int i11 = c12951.f64195e;
        try {
            if (i11 == 0) {
                kotlin.t0.n(objC);
                kotlinx.coroutines.flow.e<FileState> eVarSaveFileFromNetFlow = jDCacheFileRepoDelegate.saveFileFromNetFlow(str, str2, fileSaveOption);
                if (eVarSaveFileFromNetFlow == null) {
                    return null;
                }
                c12951.f64192b = jDCacheFileRepoDelegate;
                c12951.f64195e = 1;
                objC = FlowKt__CollectionKt.c(eVarSaveFileFromNetFlow, null, c12951, 1, null);
                if (objC == objH) {
                    return objH;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jDCacheFileRepoDelegate = (JDCacheFileRepoDelegate) c12951.f64192b;
                kotlin.t0.n(objC);
            }
            List list = (List) objC;
            if (list != null) {
                return (FileState) CollectionsKt___CollectionsKt.k3(list);
            }
            return null;
        } catch (Exception e10) {
            JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
            if (!jDCacheLog.getCanLog()) {
                return null;
            }
            jDCacheLog.e(jDCacheFileRepoDelegate.getName(), e10);
            return null;
        }
    }

    public static /* synthetic */ kotlinx.coroutines.flow.e saveFileFromNetFlow$default(JDCacheFileRepoDelegate jDCacheFileRepoDelegate, String str, String str2, FileSaveOption fileSaveOption, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveFileFromNetFlow");
        }
        if ((i10 & 4) != 0) {
            fileSaveOption = null;
        }
        return jDCacheFileRepoDelegate.saveFileFromNetFlow(str, str2, fileSaveOption);
    }

    public abstract boolean deleteFile(@d String str);

    public abstract boolean deleteRelativeFile(@d String str);

    @e
    public Object getInputStreamFromNet(@d String str, @e FileRequestOption fileRequestOption, @d c<? super InputStreamState> cVar) {
        return getInputStreamFromNet$suspendImpl(this, str, fileRequestOption, cVar);
    }

    @e
    public abstract kotlinx.coroutines.flow.e<InputStreamState> getInputStreamFromNetFlow(@d String str, @e FileRequestOption fileRequestOption);

    @e
    protected final JDCacheNetDelegate getNetDelegate() {
        return (JDCacheNetDelegate) this.netDelegate$delegate.getValue();
    }

    @d
    public abstract File getRelativeFile(@d String str);

    @e
    public abstract Object saveFileFromAsset(@d String str, @d String str2, @e FileSaveOption fileSaveOption, @d c<? super FileState> cVar);

    @e
    public Object saveFileFromNet(@d String str, @d String str2, @e FileSaveOption fileSaveOption, @d c<? super FileState> cVar) {
        return saveFileFromNet$suspendImpl(this, str, str2, fileSaveOption, cVar);
    }

    @e
    public abstract kotlinx.coroutines.flow.e<FileState> saveFileFromNetFlow(@d String str, @d String str2, @e FileSaveOption fileSaveOption);
}
