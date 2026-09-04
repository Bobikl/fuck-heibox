package androidx.paging;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
public final /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f26582a;

    static {
        int[] iArr = new int[LoadType.values().length];
        f26582a = iArr;
        iArr[LoadType.REFRESH.ordinal()] = 1;
        iArr[LoadType.PREPEND.ordinal()] = 2;
        iArr[LoadType.APPEND.ordinal()] = 3;
    }
}
