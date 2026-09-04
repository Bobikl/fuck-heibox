package androidx.paging;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
public final /* synthetic */ class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f26408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f26409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f26410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int[] f26411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int[] f26412e;

    static {
        int[] iArr = new int[LoadType.values().length];
        f26408a = iArr;
        LoadType loadType = LoadType.REFRESH;
        iArr[loadType.ordinal()] = 1;
        int[] iArr2 = new int[LoadType.values().length];
        f26409b = iArr2;
        iArr2[loadType.ordinal()] = 1;
        int[] iArr3 = new int[LoadType.values().length];
        f26410c = iArr3;
        LoadType loadType2 = LoadType.PREPEND;
        iArr3[loadType2.ordinal()] = 1;
        LoadType loadType3 = LoadType.APPEND;
        iArr3[loadType3.ordinal()] = 2;
        iArr3[loadType.ordinal()] = 3;
        int[] iArr4 = new int[LoadType.values().length];
        f26411d = iArr4;
        iArr4[loadType2.ordinal()] = 1;
        iArr4[loadType3.ordinal()] = 2;
        int[] iArr5 = new int[LoadType.values().length];
        f26412e = iArr5;
        iArr5[loadType2.ordinal()] = 1;
    }
}
