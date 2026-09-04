package androidx.paging;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
public final /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f26362a;

    static {
        int[] iArr = new int[AccessorState.BlockState.values().length];
        f26362a = iArr;
        iArr[AccessorState.BlockState.COMPLETED.ordinal()] = 1;
        iArr[AccessorState.BlockState.REQUIRES_REFRESH.ordinal()] = 2;
        iArr[AccessorState.BlockState.UNBLOCKED.ordinal()] = 3;
    }
}
