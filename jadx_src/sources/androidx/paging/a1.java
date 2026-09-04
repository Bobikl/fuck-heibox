package androidx.paging;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
public final /* synthetic */ class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f26365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f26366b;

    static {
        int[] iArr = new int[TerminalSeparatorType.values().length];
        f26365a = iArr;
        TerminalSeparatorType terminalSeparatorType = TerminalSeparatorType.FULLY_COMPLETE;
        iArr[terminalSeparatorType.ordinal()] = 1;
        TerminalSeparatorType terminalSeparatorType2 = TerminalSeparatorType.SOURCE_COMPLETE;
        iArr[terminalSeparatorType2.ordinal()] = 2;
        int[] iArr2 = new int[TerminalSeparatorType.values().length];
        f26366b = iArr2;
        iArr2[terminalSeparatorType.ordinal()] = 1;
        iArr2[terminalSeparatorType2.ordinal()] = 2;
    }
}
