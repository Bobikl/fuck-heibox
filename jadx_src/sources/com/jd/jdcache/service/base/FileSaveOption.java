package com.jd.jdcache.service.base;

import androidx.annotation.Keep;
import dl.d;
import dl.e;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: JDCacheFileRepoDelegate.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public class FileSaveOption extends FileRequestOption {

    @e
    private final String mergeWithFile;
    private final boolean needUnzip;
    private final boolean split;

    @e
    private final String unzipDir;

    public FileSaveOption() {
        this(null, null, null, null, false, null, false, null, 255, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSaveOption(@d String method, @e Map<String, String> map, @e String str, @e String str2, boolean z10, @e String str3, boolean z11, @e String str4) {
        super(method, map, str, str2);
        f0.p(method, "method");
        this.needUnzip = z10;
        this.unzipDir = str3;
        this.split = z11;
        this.mergeWithFile = str4;
    }

    public /* synthetic */ FileSaveOption(String str, Map map, String str2, String str3, boolean z10, String str4, boolean z11, String str5, int i10, u uVar) {
        this((i10 & 1) != 0 ? "GET" : str, (i10 & 2) != 0 ? null : map, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? null : str4, (i10 & 64) == 0 ? z11 : false, (i10 & 128) == 0 ? str5 : null);
    }

    @e
    public final String getMergeWithFile() {
        return this.mergeWithFile;
    }

    public final boolean getNeedUnzip() {
        return this.needUnzip;
    }

    public final boolean getSplit() {
        return this.split;
    }

    @e
    public final String getUnzipDir() {
        return this.unzipDir;
    }
}
