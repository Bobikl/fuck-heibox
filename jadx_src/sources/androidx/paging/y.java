package androidx.paging;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
public final /* synthetic */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f26670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f26671b;

    static {
        int[] iArr = new int[LoadType.values().length];
        f26670a = iArr;
        LoadType loadType = LoadType.APPEND;
        iArr[loadType.ordinal()] = 1;
        LoadType loadType2 = LoadType.PREPEND;
        iArr[loadType2.ordinal()] = 2;
        LoadType loadType3 = LoadType.REFRESH;
        iArr[loadType3.ordinal()] = 3;
        int[] iArr2 = new int[LoadType.values().length];
        f26671b = iArr2;
        iArr2[loadType3.ordinal()] = 1;
        iArr2[loadType.ordinal()] = 2;
        iArr2[loadType2.ordinal()] = 3;
    }
}
