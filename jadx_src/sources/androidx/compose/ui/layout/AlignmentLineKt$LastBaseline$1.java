package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: AlignmentLine.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final /* synthetic */ class AlignmentLineKt$LastBaseline$1 extends FunctionReferenceImpl implements yh.p<Integer, Integer, Integer> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AlignmentLineKt$LastBaseline$1 f14876d = new AlignmentLineKt$LastBaseline$1();

    AlignmentLineKt$LastBaseline$1() {
        super(2, di.b.class, org.apache.tools.ant.types.selectors.o.f136589m, "max(II)I", 1);
    }

    @dl.d
    public final Integer i(int i10, int i11) {
        return Integer.valueOf(Math.max(i10, i11));
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
        return i(num.intValue(), num2.intValue());
    }
}
