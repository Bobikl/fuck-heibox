package com.jd.jdcache.match.impl;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.Keep;
import com.jd.jdcache.JDCacheConstant;
import com.jd.jdcache.JDCacheLoader;
import com.jd.jdcache.JDCacheParamsProvider;
import com.jd.jdcache.c;
import com.jd.jdcache.entity.JDCacheLocalResp;
import com.jd.jdcache.entity.JDCacheLocalRespKt;
import com.jd.jdcache.match.PreReadInputStream;
import com.jd.jdcache.match.base.JDCacheResourceMatcher;
import com.jd.jdcache.service.DelegateManager;
import com.jd.jdcache.service.base.FileSaveOption;
import com.jd.jdcache.service.base.FileState;
import com.jd.jdcache.service.base.JDCacheFileRepoDelegate;
import com.jd.jdcache.util.CancellableJob;
import com.jd.jdcache.util.CoroutineHelper;
import com.jd.jdcache.util.FileHelperKt;
import com.jd.jdcache.util.ICancellable;
import com.jd.jdcache.util.JDCacheLog;
import com.jd.jdcache.util.UrlHelper;
import dl.d;
import dl.e;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.b0;
import kotlin.b2;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.u;
import kotlin.z;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.k;
import kotlinx.coroutines.channels.m;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.g;
import yh.a;

/* JADX INFO: compiled from: PreloadHtmlMatcher.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nPreloadHtmlMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadHtmlMatcher.kt\ncom/jd/jdcache/match/impl/PreloadHtmlMatcher\n+ 2 JDCacheLog.kt\ncom/jd/jdcache/util/JDCacheLogKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,232:1\n9#2,4:233\n9#2,4:242\n47#3:237\n49#3:241\n50#4:238\n55#4:240\n106#5:239\n1#6:246\n*S KotlinDebug\n*F\n+ 1 PreloadHtmlMatcher.kt\ncom/jd/jdcache/match/impl/PreloadHtmlMatcher\n*L\n62#1:233,4\n195#1:242,4\n112#1:237\n112#1:241\n112#1:238\n112#1:240\n112#1:239\n*E\n"})
@Keep
public class PreloadHtmlMatcher extends JDCacheResourceMatcher {

    @e
    private ICancellable downloadTask;

    @e
    private String downloadUrl;

    @e
    private JDCacheLocalResp localResp;

    @e
    private k<JDCacheLocalResp> waitingChannel;

    @d
    private final String name = "PreloadHtmlMatcher";

    @d
    private final z fileRepo$delegate = b0.c(new a<JDCacheFileRepoDelegate>() { // from class: com.jd.jdcache.match.impl.PreloadHtmlMatcher$fileRepo$2
        @Override // yh.a
        @e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JDCacheFileRepoDelegate invoke() {
            return (JDCacheFileRepoDelegate) DelegateManager.f64178a.c(JDCacheFileRepoDelegate.class);
        }
    });

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void downloadHtmlFile$default(PreloadHtmlMatcher preloadHtmlMatcher, String str, Map map, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: downloadHtmlFile");
        }
        if ((i10 & 2) != 0) {
            map = null;
        }
        preloadHtmlMatcher.downloadHtmlFile(str, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void downloadHtmlStream$default(PreloadHtmlMatcher preloadHtmlMatcher, String str, Map map, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: downloadHtmlStream");
        }
        if ((i10 & 2) != 0) {
            map = null;
        }
        preloadHtmlMatcher.downloadHtmlStream(str, map);
    }

    protected void downloadHtmlFile(@d final String url, @e Map<String, String> map) {
        final kotlinx.coroutines.flow.e<FileState> eVarSaveFileFromNetFlow;
        kotlinx.coroutines.flow.e eVarS0;
        f0.p(url, "url");
        this.downloadUrl = url;
        c cVar = c.f64138a;
        JDCacheParamsProvider jDCacheParamsProviderD = cVar.d();
        String userAgent = jDCacheParamsProviderD != null ? jDCacheParamsProviderD.getUserAgent(url) : null;
        JDCacheParamsProvider jDCacheParamsProviderD2 = cVar.d();
        FileSaveOption fileSaveOption = new FileSaveOption(null, map, userAgent, jDCacheParamsProviderD2 != null ? jDCacheParamsProviderD2.getCookie(url) : null, false, null, false, null, bb.c.b.H1, null);
        String str = "preload" + File.separatorChar + FileHelperKt.a(url);
        JDCacheFileRepoDelegate fileRepo = getFileRepo();
        kotlinx.coroutines.flow.e eVarE1 = (fileRepo == null || (eVarSaveFileFromNetFlow = fileRepo.saveFileFromNetFlow(url, str, fileSaveOption)) == null || (eVarS0 = g.s0(new kotlinx.coroutines.flow.e<Pair<? extends Boolean, ? extends FileState.Complete>>() { // from class: com.jd.jdcache.match.impl.PreloadHtmlMatcher$downloadHtmlFile$$inlined$map$1

            /* JADX INFO: renamed from: com.jd.jdcache.match.impl.PreloadHtmlMatcher$downloadHtmlFile$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @t0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 PreloadHtmlMatcher.kt\ncom/jd/jdcache/match/impl/PreloadHtmlMatcher\n+ 4 JDCacheLog.kt\ncom/jd/jdcache/util/JDCacheLogKt\n*L\n1#1,222:1\n48#2:223\n113#3,3:224\n116#3,4:231\n120#3,4:239\n124#3,5:245\n129#3,3:251\n9#4,4:227\n9#4,4:235\n9#4,2:243\n12#4:250\n*S KotlinDebug\n*F\n+ 1 PreloadHtmlMatcher.kt\ncom/jd/jdcache/match/impl/PreloadHtmlMatcher\n*L\n115#1:227,4\n119#1:235,4\n123#1:243,2\n123#1:250\n*E\n"})
            public static final class AnonymousClass2<T> implements f, j {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ f f64157b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ PreloadHtmlMatcher f64158c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ String f64159d;

                /* JADX INFO: renamed from: com.jd.jdcache.match.impl.PreloadHtmlMatcher$downloadHtmlFile$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @t0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                @kotlin.coroutines.jvm.internal.d(c = "com.jd.jdcache.match.impl.PreloadHtmlMatcher$downloadHtmlFile$$inlined$map$1$2", f = "PreloadHtmlMatcher.kt", i = {}, l = {bb.c.b.f30852p1}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f64160b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f64161c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    Object f64162d;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @e
                    public final Object invokeSuspend(@d Object obj) {
                        this.f64160b = obj;
                        this.f64161c |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(f fVar, PreloadHtmlMatcher preloadHtmlMatcher, String str) {
                    this.f64157b = fVar;
                    this.f64158c = preloadHtmlMatcher;
                    this.f64159d = str;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.f
                @e
                public final Object emit(Object obj, @d kotlin.coroutines.c cVar) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i10 = anonymousClass1.f64161c;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f64161c = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(cVar);
                    }
                    Object obj2 = anonymousClass1.f64160b;
                    Object objH = b.h();
                    int i11 = anonymousClass1.f64161c;
                    if (i11 == 0) {
                        kotlin.t0.n(obj2);
                        f fVar = this.f64157b;
                        FileState fileState = (FileState) obj;
                        Pair pairA = null;
                        if (fileState instanceof FileState.OnStart) {
                            JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
                            if (jDCacheLog.getCanLog()) {
                                jDCacheLog.d(this.f64158c.getName(), "Starting pre-download html(" + this.f64159d + ')');
                            }
                        } else if (fileState instanceof FileState.Complete) {
                            JDCacheLog jDCacheLog2 = JDCacheLog.INSTANCE;
                            if (jDCacheLog2.getCanLog()) {
                                jDCacheLog2.d(this.f64158c.getName(), "Complete pre-downloading html(" + this.f64159d + ')');
                            }
                            pairA = c1.a(kotlin.coroutines.jvm.internal.a.a(true), fileState);
                        } else if (fileState instanceof FileState.Error) {
                            JDCacheLog jDCacheLog3 = JDCacheLog.INSTANCE;
                            if (jDCacheLog3.getCanLog()) {
                                String name = this.f64158c.getName();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Fail pre-downloading html, code=");
                                FileState.Error error = (FileState.Error) fileState;
                                sb2.append(error.getCode());
                                sb2.append(", exception=");
                                sb2.append(error.getThrowable());
                                jDCacheLog3.e(name, sb2.toString());
                            }
                            pairA = c1.a(kotlin.coroutines.jvm.internal.a.a(true), null);
                        }
                        anonymousClass1.f64161c = 1;
                        if (fVar.emit(pairA, anonymousClass1) == objH) {
                            return objH;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.t0.n(obj2);
                    }
                    return b2.f124493a;
                }
            }

            @Override // kotlinx.coroutines.flow.e
            @e
            public Object a(@d f<? super Pair<? extends Boolean, ? extends FileState.Complete>> fVar, @d kotlin.coroutines.c cVar2) {
                Object objA = eVarSaveFileFromNetFlow.a(new AnonymousClass2(fVar, this, url), cVar2);
                return objA == b.h() ? objA : b2.f124493a;
            }
        })) == null) ? null : g.e1(eVarS0, new PreloadHtmlMatcher$downloadHtmlFile$flow$2(this, url, null));
        if (eVarE1 != null) {
            this.waitingChannel = m.d(-1, null, null, 6, null);
            this.downloadTask = new CancellableJob(g.U0(eVarE1, JDCacheConstant.f64122a.a()));
        }
    }

    protected void downloadHtmlStream(@d String url, @e Map<String, String> map) {
        f0.p(url, "url");
        this.downloadUrl = url;
        d2 d2VarLaunchCoroutine$default = CoroutineHelper.launchCoroutine$default(CoroutineHelper.INSTANCE, this, null, new PreloadHtmlMatcher$downloadHtmlStream$job$1(map, url, this, null), 1, null);
        this.waitingChannel = m.d(-1, null, null, 6, null);
        this.downloadTask = new CancellableJob(d2VarLaunchCoroutine$default);
    }

    @e
    protected JDCacheLocalResp geDownloadLocalResp() {
        if (this.waitingChannel != null) {
            return (JDCacheLocalResp) kotlinx.coroutines.j.b(null, new PreloadHtmlMatcher$geDownloadLocalResp$1$1(this, null), 1, null);
        }
        return null;
    }

    @e
    protected final ICancellable getDownloadTask() {
        return this.downloadTask;
    }

    @e
    protected final String getDownloadUrl() {
        return this.downloadUrl;
    }

    @e
    protected final JDCacheFileRepoDelegate getFileRepo() {
        return (JDCacheFileRepoDelegate) this.fileRepo$delegate.getValue();
    }

    @e
    protected final JDCacheLocalResp getLocalResp() {
        return this.localResp;
    }

    @Override // com.jd.jdcache.match.base.JDCacheResourceMatcher
    @d
    public String getName() {
        return this.name;
    }

    @e
    protected final k<JDCacheLocalResp> getWaitingChannel() {
        return this.waitingChannel;
    }

    @Override // com.jd.jdcache.match.base.JDCacheResourceMatcher
    @e
    public WebResourceResponse match(@d WebResourceRequest request) {
        Uri uri;
        WebResourceResponse webResourceResponseA;
        InputStream fileStream;
        f0.p(request, "request");
        JDCacheLoader loader = getLoader();
        boolean z10 = false;
        if (loader != null && loader.getPreloadHtml()) {
            z10 = true;
        }
        if (!z10 || getDestroyed().get() || !request.isForMainFrame()) {
            return null;
        }
        String str = this.downloadUrl;
        if (str != null) {
            try {
                uri = Uri.parse(str);
            } catch (Exception unused) {
                uri = null;
            }
        } else {
            uri = null;
        }
        if (uri == null || !UrlHelper.INSTANCE.matchHostPath(request.getUrl(), uri)) {
            return null;
        }
        this.downloadUrl = null;
        if (this.localResp == null) {
            this.localResp = geDownloadLocalResp();
            if (getDestroyed().get()) {
                return null;
            }
            JDCacheLocalResp jDCacheLocalResp = this.localResp;
            if (jDCacheLocalResp != null && (fileStream = jDCacheLocalResp.getFileStream()) != null && (fileStream instanceof PreReadInputStream)) {
                ((PreReadInputStream) fileStream).finishPreRead();
            }
            JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
            if (jDCacheLog.getCanLog() && this.localResp != null) {
                jDCacheLog.d(getName(), "Received pre-download html file. " + this.localResp);
            }
        }
        JDCacheLocalResp jDCacheLocalResp2 = this.localResp;
        if (jDCacheLocalResp2 == null || (webResourceResponseA = JDCacheLocalRespKt.a(jDCacheLocalResp2, null, 1, null)) == null) {
            return null;
        }
        return createResponse(webResourceResponseA);
    }

    @Override // com.jd.jdcache.match.base.JDCacheResourceMatcher
    protected void onDestroy() throws IOException {
        String filename;
        JDCacheFileRepoDelegate fileRepo;
        InputStream fileStream;
        super.onDestroy();
        k<JDCacheLocalResp> kVar = this.waitingChannel;
        if (kVar != null) {
            ReceiveChannel.DefaultImpls.b(kVar, null, 1, null);
        }
        ICancellable iCancellable = this.downloadTask;
        if (iCancellable != null) {
            ICancellable.a.a(iCancellable, null, 1, null);
        }
        JDCacheLocalResp jDCacheLocalResp = this.localResp;
        if (jDCacheLocalResp != null && (fileStream = jDCacheLocalResp.getFileStream()) != null) {
            fileStream.close();
        }
        JDCacheLocalResp jDCacheLocalResp2 = this.localResp;
        if (jDCacheLocalResp2 == null || (filename = jDCacheLocalResp2.getFilename()) == null || (fileRepo = getFileRepo()) == null) {
            return;
        }
        fileRepo.deleteFile(filename);
    }

    @Override // com.jd.jdcache.match.base.JDCacheResourceMatcher
    public void prepare(@d String url) {
        f0.p(url, "url");
        JDCacheLoader loader = getLoader();
        if (loader != null && loader.getPreloadHtml()) {
            if (u.v2(url, "http", false, 2, null)) {
                downloadHtmlStream$default(this, url, null, 2, null);
                return;
            }
            JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
            if (jDCacheLog.getCanLog()) {
                jDCacheLog.d(getName(), "Will NOT perform preload HTML for non-HTTP url.");
            }
        }
    }

    protected void saveCookieFromRespHeaders(@d String url, @e Map<String, ? extends List<String>> map) {
        List<String> list;
        JDCacheParamsProvider jDCacheParamsProviderD;
        f0.p(url, "url");
        if (map == null || (list = map.get("Set-Cookie")) == null || (jDCacheParamsProviderD = c.f64138a.d()) == null) {
            return;
        }
        jDCacheParamsProviderD.saveCookie(url, list);
    }

    protected final void setDownloadTask(@e ICancellable iCancellable) {
        this.downloadTask = iCancellable;
    }

    protected final void setDownloadUrl(@e String str) {
        this.downloadUrl = str;
    }

    protected final void setLocalResp(@e JDCacheLocalResp jDCacheLocalResp) {
        this.localResp = jDCacheLocalResp;
    }

    protected final void setWaitingChannel(@e k<JDCacheLocalResp> kVar) {
        this.waitingChannel = kVar;
    }
}
