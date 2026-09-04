package androidx.paging;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
public final /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f26609a;

    static {
        int[] iArr = new int[DataSource.KeyType.values().length];
        f26609a = iArr;
        iArr[DataSource.KeyType.POSITIONAL.ordinal()] = 1;
        iArr[DataSource.KeyType.PAGE_KEYED.ordinal()] = 2;
        iArr[DataSource.KeyType.ITEM_KEYED.ordinal()] = 3;
    }
}
