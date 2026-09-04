package com.jd.jdcache.util;

import dl.e;
import java.io.File;
import java.io.FileNotFoundException;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.internal.t0;
import yh.l;

/* JADX INFO: compiled from: FileHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nFileHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHelper.kt\ncom/jd/jdcache/util/FileHelperKt$getString$2$1\n+ 2 JDCacheLog.kt\ncom/jd/jdcache/util/JDCacheLogKt\n*L\n1#1,40:1\n9#2,4:41\n*S KotlinDebug\n*F\n+ 1 FileHelper.kt\ncom/jd/jdcache/util/FileHelperKt$getString$2$1\n*L\n20#1:41,4\n*E\n"})
@d(c = "com.jd.jdcache.util.FileHelperKt$getString$2$1", f = "FileHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FileHelperKt$getString$2$1 extends SuspendLambda implements l<kotlin.coroutines.c<? super String>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f64292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ File f64293c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileHelperKt$getString$2$1(File file, kotlin.coroutines.c<? super FileHelperKt$getString$2$1> cVar) {
        super(1, cVar);
        this.f64293c = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.d kotlin.coroutines.c<?> cVar) {
        return new FileHelperKt$getString$2$1(this.f64293c, cVar);
    }

    @Override // yh.l
    @e
    public final Object invoke(@e kotlin.coroutines.c<? super String> cVar) {
        return ((FileHelperKt$getString$2$1) create(cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.coroutines.intrinsics.b.h();
        if (this.f64292b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        try {
            return FilesKt__FileReadWriteKt.z(this.f64293c, null, 1, null);
        } catch (FileNotFoundException e10) {
            JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
            if (!jDCacheLog.getCanLog()) {
                return null;
            }
            jDCacheLog.e("FileHelper", e10);
            return null;
        }
    }
}
