package androidx.work.impl;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: WorkDatabasePathHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"", ak.av, "Ljava/lang/String;", "TAG", "b", "WORK_DATABASE_NAME", "", ak.aF, "[Ljava/lang/String;", "DATABASE_EXTRA_FILES", "work-runtime_release"}, k = 2, mv = {1, 7, 1})
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final String f28921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final String f28922b = "androidx.work.workdb";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final String[] f28923c;

    static {
        String strI = androidx.work.n.i("WrkDbPathHelper");
        kotlin.jvm.internal.f0.o(strI, "tagWithPrefix(\"WrkDbPathHelper\")");
        f28921a = strI;
        f28923c = new String[]{"-journal", "-shm", "-wal"};
    }
}
