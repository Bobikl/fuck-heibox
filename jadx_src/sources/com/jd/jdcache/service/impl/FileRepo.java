package com.jd.jdcache.service.impl;

import android.content.Context;
import androidx.annotation.Keep;
import com.jd.jdcache.JDCacheParamsProvider;
import com.jd.jdcache.c;
import com.jd.jdcache.service.base.FileRequestOption;
import com.jd.jdcache.service.base.FileSaveOption;
import com.jd.jdcache.service.base.FileState;
import com.jd.jdcache.service.base.InputStreamState;
import com.jd.jdcache.service.base.JDCacheFileRepoDelegate;
import com.jd.jdcache.service.base.JDCacheNetDelegate;
import com.jd.jdcache.service.base.NetState;
import com.jd.jdcache.util.CoroutineHelper;
import com.jd.jdcache.util.JDCacheLog;
import dl.d;
import dl.e;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b0;
import kotlin.b2;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.u;
import kotlin.z;
import kotlinx.coroutines.flow.f;
import yh.a;
import yh.l;

/* JADX INFO: compiled from: FileRepo.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nFileRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileRepo.kt\ncom/jd/jdcache/service/impl/FileRepo\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 JDCacheLog.kt\ncom/jd/jdcache/util/JDCacheLogKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,256:1\n47#2:257\n49#2:261\n47#2:266\n49#2:270\n50#3:258\n55#3:260\n50#3:267\n55#3:269\n106#4:259\n106#4:268\n9#5,4:262\n9#5,4:272\n9#5,4:276\n1#6:271\n124#7:280\n113#7,5:281\n*S KotlinDebug\n*F\n+ 1 FileRepo.kt\ncom/jd/jdcache/service/impl/FileRepo\n*L\n38#1:257\n38#1:261\n75#1:266\n75#1:270\n38#1:258\n38#1:260\n75#1:267\n75#1:269\n38#1:259\n75#1:268\n63#1:262,4\n215#1:272,4\n208#1:276,4\n240#1:280\n240#1:281,5\n*E\n"})
@Keep
public class FileRepo extends JDCacheFileRepoDelegate {

    @d
    private final String name = "FileRepo";

    @d
    private final z rootDirPath$delegate = b0.c(new a<String>() { // from class: com.jd.jdcache.service.impl.FileRepo$rootDirPath$2
        @Override // yh.a
        @d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String cacheDir;
            JDCacheParamsProvider jDCacheParamsProviderD = c.f64138a.d();
            if (jDCacheParamsProviderD == null || (cacheDir = jDCacheParamsProviderD.getCacheDir()) == null) {
                throw new RuntimeException("Cache dir need to be set by JDCacheParamsProvider");
            }
            return cacheDir;
        }
    });

    /* JADX INFO: renamed from: com.jd.jdcache.service.impl.FileRepo$saveFileFromAsset$2, reason: invalid class name */
    /* JADX INFO: compiled from: FileRepo.kt */
    @t0({"SMAP\nFileRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileRepo.kt\ncom/jd/jdcache/service/impl/FileRepo$saveFileFromAsset$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 JDCacheLog.kt\ncom/jd/jdcache/util/JDCacheLogKt\n*L\n1#1,256:1\n13579#2,2:257\n9#3,4:259\n*S KotlinDebug\n*F\n+ 1 FileRepo.kt\ncom/jd/jdcache/service/impl/FileRepo$saveFileFromAsset$2\n*L\n160#1:257,2\n173#1:259,4\n*E\n"})
    @kotlin.coroutines.jvm.internal.d(c = "com.jd.jdcache.service.impl.FileRepo$saveFileFromAsset$2", f = "FileRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements l<kotlin.coroutines.c<? super FileState>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f64215b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f64216c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f64217d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ FileRepo f64218e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f64219f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Context context, String str, FileRepo fileRepo, String str2, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(1, cVar);
            this.f64216c = context;
            this.f64217d = str;
            this.f64218e = fileRepo;
            this.f64219f = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d
        public final kotlin.coroutines.c<b2> create(@d kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass2(this.f64216c, this.f64217d, this.f64218e, this.f64219f, cVar);
        }

        @Override // yh.l
        @e
        public final Object invoke(@e kotlin.coroutines.c<? super FileState> cVar) {
            return ((AnonymousClass2) create(cVar)).invokeSuspend(b2.f124493a);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0025  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@d Object obj) throws Throwable {
            boolean z10;
            b.h();
            if (this.f64215b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            String[] list = this.f64216c.getAssets().list(this.f64217d);
            if (list == null) {
                z10 = true;
            } else if (list.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                FileRepo fileRepo = this.f64218e;
                return fileRepo.copyFileFromAsset(this.f64216c, this.f64217d, fileRepo.concretePath(this.f64219f));
            }
            String strConcretePath = this.f64218e.concretePath(this.f64219f);
            Ref.IntRef intRef = new Ref.IntRef();
            FileRepo fileRepo2 = this.f64218e;
            Context context = this.f64216c;
            String str = this.f64217d;
            for (String str2 : list) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                String str3 = File.separator;
                sb2.append(str3);
                sb2.append(str2);
                if (fileRepo2.copyFileFromAsset(context, sb2.toString(), strConcretePath + str3 + str2) instanceof FileState.Error) {
                    intRef.f124889b++;
                }
            }
            if (intRef.f124889b == list.length) {
                return new FileState.Error(-1, new RuntimeException("Fail to copy files from directory."));
            }
            FileRepo fileRepo3 = this.f64218e;
            JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
            if (jDCacheLog.getCanLog() && intRef.f124889b > 0) {
                jDCacheLog.e(fileRepo3.getName(), "Partially succeed to save file(s) from asset, " + intRef.f124889b + " file(s) fails");
            }
            return new FileState.Complete(0, 0L, null, new File(strConcretePath));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String concretePath(String str) {
        CharSequence charSequenceSubSequence;
        if (str == null || u.V1(str)) {
            return getRootDirPath();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getRootDirPath());
        sb2.append(File.separatorChar);
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!(str.charAt(i10) == File.separatorChar)) {
                charSequenceSubSequence = str.subSequence(i10, str.length());
                sb2.append(charSequenceSubSequence.toString());
                return sb2.toString();
            }
        }
        charSequenceSubSequence = "";
        sb2.append(charSequenceSubSequence.toString());
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x0085 A[Catch: IOException -> 0x0081, TRY_LEAVE, TryCatch #4 {IOException -> 0x0081, blocks: (B:36:0x007d, B:40:0x0085), top: B:62:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4 A[Catch: IOException -> 0x00a0, TRY_LEAVE, TryCatch #7 {IOException -> 0x00a0, blocks: (B:48:0x009c, B:52:0x00a4), top: B:65:0x009c }] */
    public final FileState copyFileFromAsset(Context context, String str, String str2) throws Throwable {
        InputStream inputStreamOpen;
        FileOutputStream fileOutputStream = null;
        try {
            inputStreamOpen = context.getAssets().open(str);
            try {
                try {
                    byte[] bArr = new byte[2048];
                    Ref.IntRef intRef = new Ref.IntRef();
                    File file = new File(str2);
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    long j10 = 0;
                    while (true) {
                        try {
                            int i10 = inputStreamOpen.read(bArr);
                            intRef.f124889b = i10;
                            if (i10 <= -1) {
                                break;
                            }
                            fileOutputStream2.write(bArr, 0, i10);
                            j10 += (long) intRef.f124889b;
                        } catch (Exception e10) {
                            e = e10;
                            fileOutputStream = fileOutputStream2;
                            JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
                            if (jDCacheLog.getCanLog()) {
                                jDCacheLog.e(getName(), e);
                            }
                            FileState.Error error = new FileState.Error(-1, e);
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                    if (inputStreamOpen != null) {
                                        inputStreamOpen.close();
                                    }
                                } catch (IOException e11) {
                                    JDCacheLog jDCacheLog2 = JDCacheLog.INSTANCE;
                                    if (jDCacheLog2.getCanLog()) {
                                        jDCacheLog2.e(getName(), e11);
                                    }
                                    return error;
                                }
                            } else if (inputStreamOpen != null) {
                                inputStreamOpen.close();
                            }
                            return error;
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                    if (inputStreamOpen != null) {
                                        inputStreamOpen.close();
                                    }
                                } catch (IOException e12) {
                                    JDCacheLog jDCacheLog3 = JDCacheLog.INSTANCE;
                                    if (jDCacheLog3.getCanLog()) {
                                        jDCacheLog3.e(getName(), e12);
                                    }
                                    throw th;
                                }
                            } else if (inputStreamOpen != null) {
                                inputStreamOpen.close();
                            }
                            throw th;
                        }
                    }
                    FileState.Complete complete = new FileState.Complete(0, j10, null, file);
                    try {
                        fileOutputStream2.close();
                        inputStreamOpen.close();
                    } catch (IOException e13) {
                        JDCacheLog jDCacheLog4 = JDCacheLog.INSTANCE;
                        if (jDCacheLog4.getCanLog()) {
                            jDCacheLog4.e(getName(), e13);
                        }
                    }
                    return complete;
                } catch (Exception e14) {
                    e = e14;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e15) {
            e = e15;
            inputStreamOpen = null;
        } catch (Throwable th4) {
            th = th4;
            inputStreamOpen = null;
        }
    }

    private final boolean deleteFile(File file) {
        if (!(file != null && file.exists())) {
            return false;
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return true;
            }
            for (File file2 : fileArrListFiles) {
                deleteFile(file2);
            }
        }
        return file.delete();
    }

    static /* synthetic */ Object saveFileFromAsset$suspendImpl(FileRepo fileRepo, String str, String str2, FileSaveOption fileSaveOption, kotlin.coroutines.c<? super FileState> cVar) {
        if (str.length() == 0) {
            return new FileState.Error(-1, new IllegalArgumentException("Asset path is empty."));
        }
        if (str2.length() == 0) {
            return new FileState.Error(-1, new IllegalArgumentException("Destination path is empty."));
        }
        Context contextA = c.f64138a.a();
        return contextA == null ? new FileState.Error(-1, new RuntimeException("Application context is null.")) : CoroutineHelper.runOnIo$default(CoroutineHelper.INSTANCE, fileRepo, null, new AnonymousClass2(contextA, str, fileRepo, str2, null), cVar, 1, null);
    }

    @Override // com.jd.jdcache.service.base.JDCacheFileRepoDelegate
    public boolean deleteFile(@d String absoluteFilePath) {
        f0.p(absoluteFilePath, "absoluteFilePath");
        if (absoluteFilePath.length() == 0) {
            return false;
        }
        return deleteFile(new File(absoluteFilePath));
    }

    @Override // com.jd.jdcache.service.base.JDCacheFileRepoDelegate
    public boolean deleteRelativeFile(@d String relativeFilePath) {
        f0.p(relativeFilePath, "relativeFilePath");
        return deleteFile(new File(concretePath(relativeFilePath)));
    }

    @Override // com.jd.jdcache.service.base.JDCacheFileRepoDelegate
    @e
    public kotlinx.coroutines.flow.e<InputStreamState> getInputStreamFromNetFlow(@d String url, @e FileRequestOption fileRequestOption) {
        String method;
        f0.p(url, "url");
        JDCacheNetDelegate netDelegate = getNetDelegate();
        if (netDelegate == null) {
            return null;
        }
        if (fileRequestOption == null || (method = fileRequestOption.getMethod()) == null) {
            method = "GET";
        }
        final kotlinx.coroutines.flow.e eVarConnectFlow$default = JDCacheNetDelegate.connectFlow$default(netDelegate, url, method, fileRequestOption != null ? fileRequestOption.getHeader() : null, fileRequestOption != null ? fileRequestOption.getUserAgent() : null, fileRequestOption != null ? fileRequestOption.getCookie() : null, null, false, 96, null);
        if (eVarConnectFlow$default != null) {
            return new kotlinx.coroutines.flow.e<InputStreamState>() { // from class: com.jd.jdcache.service.impl.FileRepo$getInputStreamFromNetFlow$$inlined$map$1

                /* JADX INFO: renamed from: com.jd.jdcache.service.impl.FileRepo$getInputStreamFromNetFlow$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @t0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 FileRepo.kt\ncom/jd/jdcache/service/impl/FileRepo\n*L\n1#1,222:1\n48#2:223\n39#3,14:224\n*E\n"})
                public static final class AnonymousClass2<T> implements f, j {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ f f64209b;

                    /* JADX INFO: renamed from: com.jd.jdcache.service.impl.FileRepo$getInputStreamFromNetFlow$$inlined$map$1$2$1, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    @t0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                    @kotlin.coroutines.jvm.internal.d(c = "com.jd.jdcache.service.impl.FileRepo$getInputStreamFromNetFlow$$inlined$map$1$2", f = "FileRepo.kt", i = {}, l = {bb.c.b.f30852p1}, m = "emit", n = {}, s = {})
                    public static final class AnonymousClass1 extends ContinuationImpl {

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        /* synthetic */ Object f64210b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        int f64211c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        Object f64212d;

                        public AnonymousClass1(kotlin.coroutines.c cVar) {
                            super(cVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @e
                        public final Object invokeSuspend(@d Object obj) {
                            this.f64210b = obj;
                            this.f64211c |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(f fVar) {
                        this.f64209b = fVar;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
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
                    @Override // kotlinx.coroutines.flow.f
                    @e
                    public final Object emit(Object obj, @d kotlin.coroutines.c cVar) throws Throwable {
                        AnonymousClass1 anonymousClass1;
                        InputStreamState error;
                        if (cVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) cVar;
                            int i10 = anonymousClass1.f64211c;
                            if ((i10 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.f64211c = i10 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(cVar);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                        Object obj2 = anonymousClass1.f64210b;
                        Object objH = b.h();
                        int i11 = anonymousClass1.f64211c;
                        if (i11 == 0) {
                            kotlin.t0.n(obj2);
                            f fVar = this.f64209b;
                            NetState netState = (NetState) obj;
                            if (netState instanceof NetState.Complete) {
                                NetState.Complete complete = (NetState.Complete) netState;
                                error = new InputStreamState.Connected(complete.getCode(), complete.getHeaders(), complete.getData() != null ? new BufferedInputStream((InputStream) complete.getData()) : null);
                            } else if (netState instanceof NetState.OnStart) {
                                error = new InputStreamState.OnStart(((NetState.OnStart) netState).getUrl());
                            } else if (netState instanceof NetState.Error) {
                                NetState.Error error2 = (NetState.Error) netState;
                                error = new InputStreamState.Error(error2.getCode(), error2.getThrowable());
                            } else if (netState instanceof NetState.OnProgress) {
                                error = new InputStreamState.Error(-1, new RuntimeException("This state[NetState.OnProgress] should not show up for InputStreamState"));
                            } else {
                                if (!(netState instanceof NetState.Redirect)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                error = new InputStreamState.Error(((NetState.Redirect) netState).getCode(), new RuntimeException("Connection redirects."));
                            }
                            anonymousClass1.f64211c = 1;
                            if (fVar.emit(error, anonymousClass1) == objH) {
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
                public Object a(@d f<? super InputStreamState> fVar, @d kotlin.coroutines.c cVar) {
                    Object objA = eVarConnectFlow$default.a(new AnonymousClass2(fVar), cVar);
                    return objA == b.h() ? objA : b2.f124493a;
                }
            };
        }
        return null;
    }

    @Override // com.jd.jdcache.service.base.AbstractDelegate
    @d
    public String getName() {
        return this.name;
    }

    @Override // com.jd.jdcache.service.base.JDCacheFileRepoDelegate
    @d
    public File getRelativeFile(@d String relativeFilePath) {
        f0.p(relativeFilePath, "relativeFilePath");
        return new File(concretePath(relativeFilePath));
    }

    @d
    protected final String getRootDirPath() {
        return (String) this.rootDirPath$delegate.getValue();
    }

    @Override // com.jd.jdcache.service.base.JDCacheFileRepoDelegate
    @e
    public Object saveFileFromAsset(@d String str, @d String str2, @e FileSaveOption fileSaveOption, @d kotlin.coroutines.c<? super FileState> cVar) {
        return saveFileFromAsset$suspendImpl(this, str, str2, fileSaveOption, cVar);
    }

    @Override // com.jd.jdcache.service.base.JDCacheFileRepoDelegate
    @e
    public kotlinx.coroutines.flow.e<FileState> saveFileFromNetFlow(@d final String url, @d String relativeFilePath, @e FileSaveOption fileSaveOption) {
        String method;
        f0.p(url, "url");
        f0.p(relativeFilePath, "relativeFilePath");
        if (relativeFilePath.length() == 0) {
            JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
            if (jDCacheLog.getCanLog()) {
                jDCacheLog.e(getName(), "Cannot save file to empty path.");
            }
            return null;
        }
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        JDCacheNetDelegate netDelegate = getNetDelegate();
        if (netDelegate == null) {
            return null;
        }
        String strConcretePath = concretePath(relativeFilePath);
        if (fileSaveOption == null || (method = fileSaveOption.getMethod()) == null) {
            method = "GET";
        }
        final kotlinx.coroutines.flow.e<NetState<File>> eVarDownloadFlow = netDelegate.downloadFlow(url, strConcretePath, method, fileSaveOption != null ? fileSaveOption.getHeader() : null, fileSaveOption != null ? fileSaveOption.getUserAgent() : null, fileSaveOption != null ? fileSaveOption.getCookie() : null);
        if (eVarDownloadFlow != null) {
            return new kotlinx.coroutines.flow.e<FileState>() { // from class: com.jd.jdcache.service.impl.FileRepo$saveFileFromNetFlow$$inlined$map$1

                /* JADX INFO: renamed from: com.jd.jdcache.service.impl.FileRepo$saveFileFromNetFlow$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @t0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 FileRepo.kt\ncom/jd/jdcache/service/impl/FileRepo\n+ 4 JDCacheLog.kt\ncom/jd/jdcache/util/JDCacheLogKt\n*L\n1#1,222:1\n48#2:223\n76#3,3:224\n79#3,5:229\n84#3,4:235\n88#3,5:241\n93#3,10:247\n103#3,8:259\n112#3,4:268\n116#3,7:274\n123#3,4:282\n127#3,5:288\n132#3:294\n9#4,2:227\n12#4:234\n9#4,2:239\n12#4:246\n9#4,2:257\n12#4:267\n9#4,2:272\n12#4:281\n9#4,2:286\n12#4:293\n*S KotlinDebug\n*F\n+ 1 FileRepo.kt\ncom/jd/jdcache/service/impl/FileRepo\n*L\n78#1:227,2\n78#1:234\n87#1:239,2\n87#1:246\n102#1:257,2\n102#1:267\n115#1:272,2\n115#1:281\n126#1:286,2\n126#1:293\n*E\n"})
                public static final class AnonymousClass2<T> implements f, j {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ f f64224b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ String f64225c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ FileRepo f64226d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ Ref.FloatRef f64227e;

                    /* JADX INFO: renamed from: com.jd.jdcache.service.impl.FileRepo$saveFileFromNetFlow$$inlined$map$1$2$1, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    @t0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                    @kotlin.coroutines.jvm.internal.d(c = "com.jd.jdcache.service.impl.FileRepo$saveFileFromNetFlow$$inlined$map$1$2", f = "FileRepo.kt", i = {}, l = {bb.c.b.f30852p1}, m = "emit", n = {}, s = {})
                    public static final class AnonymousClass1 extends ContinuationImpl {

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        /* synthetic */ Object f64228b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        int f64229c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        Object f64230d;

                        public AnonymousClass1(kotlin.coroutines.c cVar) {
                            super(cVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @e
                        public final Object invokeSuspend(@d Object obj) {
                            this.f64228b = obj;
                            this.f64229c |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(f fVar, String str, FileRepo fileRepo, Ref.FloatRef floatRef) {
                        this.f64224b = fVar;
                        this.f64225c = str;
                        this.f64226d = fileRepo;
                        this.f64227e = floatRef;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
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
                    @Override // kotlinx.coroutines.flow.f
                    @e
                    public final Object emit(Object obj, @d kotlin.coroutines.c cVar) throws Throwable {
                        AnonymousClass1 anonymousClass1;
                        FileState error;
                        FileState error2;
                        if (cVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) cVar;
                            int i10 = anonymousClass1.f64229c;
                            if ((i10 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.f64229c = i10 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(cVar);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                        Object obj2 = anonymousClass1.f64228b;
                        Object objH = b.h();
                        int i11 = anonymousClass1.f64229c;
                        if (i11 == 0) {
                            kotlin.t0.n(obj2);
                            f fVar = this.f64224b;
                            NetState netState = (NetState) obj;
                            if (netState instanceof NetState.OnStart) {
                                JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
                                if (jDCacheLog.getCanLog()) {
                                    jDCacheLog.d(this.f64226d.getName(), "Starting downloading file[" + this.f64225c + "].");
                                }
                                error = new FileState.OnStart(this.f64225c);
                            } else {
                                if (netState instanceof NetState.Complete) {
                                    JDCacheLog jDCacheLog2 = JDCacheLog.INSTANCE;
                                    if (jDCacheLog2.getCanLog()) {
                                        jDCacheLog2.d(this.f64226d.getName(), "Complete downloading file[" + this.f64225c + "] in " + ((File) ((NetState.Complete) netState).getData()).getPath() + lg.a.f131414g);
                                    }
                                    NetState.Complete complete = (NetState.Complete) netState;
                                    error2 = new FileState.Complete(complete.getCode(), complete.getLength(), complete.getHeaders(), (File) complete.getData());
                                } else if (netState instanceof NetState.OnProgress) {
                                    NetState.OnProgress onProgress = (NetState.OnProgress) netState;
                                    if (onProgress.getMax() > 0) {
                                        JDCacheLog jDCacheLog3 = JDCacheLog.INSTANCE;
                                        if (jDCacheLog3.getCanLog()) {
                                            float progress = onProgress.getProgress() / onProgress.getMax();
                                            if ((progress == 1.0f) || progress - this.f64227e.f124888b >= 10.0f) {
                                                this.f64227e.f124888b = progress;
                                            }
                                            jDCacheLog3.d(this.f64226d.getName(), "Downloading file(" + (progress * 100) + "%)");
                                        }
                                    }
                                    error2 = new FileState.OnProgress(onProgress.getProgress(), onProgress.getMax());
                                } else if (netState instanceof NetState.Error) {
                                    JDCacheLog jDCacheLog4 = JDCacheLog.INSTANCE;
                                    if (jDCacheLog4.getCanLog()) {
                                        String name = this.f64226d.getName();
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Error in downloading file[");
                                        sb2.append(this.f64225c);
                                        sb2.append("]. Code = ");
                                        NetState.Error error3 = (NetState.Error) netState;
                                        sb2.append(error3.getCode());
                                        sb2.append(", Exception = ");
                                        sb2.append(error3.getThrowable());
                                        jDCacheLog4.e(name, sb2.toString());
                                    }
                                    NetState.Error error4 = (NetState.Error) netState;
                                    error2 = new FileState.Error(error4.getCode(), error4.getThrowable());
                                } else {
                                    if (!(netState instanceof NetState.Redirect)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    JDCacheLog jDCacheLog5 = JDCacheLog.INSTANCE;
                                    if (jDCacheLog5.getCanLog()) {
                                        jDCacheLog5.e(this.f64226d.getName(), "Redirect in downloading file[" + this.f64225c + ']');
                                    }
                                    error = new FileState.Error(-1, new Exception("Redirect in downloading file"));
                                }
                                error = error2;
                            }
                            anonymousClass1.f64229c = 1;
                            if (fVar.emit(error, anonymousClass1) == objH) {
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
                public Object a(@d f<? super FileState> fVar, @d kotlin.coroutines.c cVar) {
                    Object objA = eVarDownloadFlow.a(new AnonymousClass2(fVar, url, this, floatRef), cVar);
                    return objA == b.h() ? objA : b2.f124493a;
                }
            };
        }
        return null;
    }
}
