package androidx.compose.ui.tooling.preview.datasource;

import androidx.compose.runtime.internal.o;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.m;
import r1.f;

/* JADX INFO: compiled from: LoremIpsum.kt */
/* JADX INFO: loaded from: classes.dex */
@o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fB\t\b\u0016¢\u0006\u0004\b\u000b\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/tooling/preview/datasource/LoremIpsum;", "Lr1/f;", "", "", "words", ak.av, "I", "Lkotlin/sequences/m;", "t", "()Lkotlin/sequences/m;", "values", "<init>", "(I)V", "()V", "ui-tooling-preview_release"}, k = 1, mv = {1, 7, 1})
public final class LoremIpsum implements f<String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f17007b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int words;

    public LoremIpsum() {
        this(500);
    }

    public LoremIpsum(int i10) {
        this.words = i10;
    }

    private final String a(int words) {
        final Ref.IntRef intRef = new Ref.IntRef();
        final int size = b.f17013a.size();
        return SequencesKt___SequencesKt.e1(SequencesKt___SequencesKt.Y2(SequencesKt__SequencesKt.m(new yh.a<String>() { // from class: androidx.compose.ui.tooling.preview.datasource.LoremIpsum$generateLoremIpsum$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                List list = b.f17013a;
                Ref.IntRef intRef2 = intRef;
                int i10 = intRef2.f124889b;
                intRef2.f124889b = i10 + 1;
                return (String) list.get(i10 % size);
            }
        }), words), " ", null, null, 0, null, null, 62, null);
    }

    @Override // r1.f
    public /* synthetic */ int getCount() {
        return r1.e.a(this);
    }

    @Override // r1.f
    @d
    public m<String> t() {
        return SequencesKt__SequencesKt.q(a(this.words));
    }
}
