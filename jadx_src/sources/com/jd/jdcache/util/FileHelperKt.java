package com.jd.jdcache.util;

import dl.d;
import dl.e;
import java.io.File;
import kotlin.random.Random;

/* JADX INFO: compiled from: FileHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class FileHelperKt {
    @d
    public static final String a(@e String str) {
        String fileNameFromUrl = str != null ? UrlHelper.INSTANCE.getFileNameFromUrl(str) : null;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(System.currentTimeMillis());
        sb2.append(Random.f125033b.m(900) + 100);
        String string = sb2.toString();
        if (fileNameFromUrl == null || fileNameFromUrl.length() == 0) {
            return string;
        }
        return fileNameFromUrl + '_' + string;
    }

    @e
    public static final Object b(@e File file, @d kotlin.coroutines.c<? super String> cVar) {
        if (file == null || !file.exists() || !file.isFile()) {
            return null;
        }
        Object objRunOnIo$default = CoroutineHelper.runOnIo$default(CoroutineHelper.INSTANCE, file, null, new FileHelperKt$getString$2$1(file, null), cVar, 1, null);
        return objRunOnIo$default == kotlin.coroutines.intrinsics.b.h() ? objRunOnIo$default : (String) objRunOnIo$default;
    }
}
