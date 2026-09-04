package androidx.paging;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
public final /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f26420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f26421b;

    static {
        int[] iArr = new int[LoadType.values().length];
        f26420a = iArr;
        LoadType loadType = LoadType.PREPEND;
        iArr[loadType.ordinal()] = 1;
        LoadType loadType2 = LoadType.APPEND;
        iArr[loadType2.ordinal()] = 2;
        int[] iArr2 = new int[LoadType.values().length];
        f26421b = iArr2;
        iArr2[LoadType.REFRESH.ordinal()] = 1;
        iArr2[loadType.ordinal()] = 2;
        iArr2[loadType2.ordinal()] = 3;
    }
}
