package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.m0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ValidatingOffsetMapping.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\"\u001a\u0010\t\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/input/m0;", "Landroidx/compose/ui/text/d;", "text", "Landroidx/compose/ui/text/input/l0;", ak.av, "Landroidx/compose/ui/text/input/x;", "Landroidx/compose/ui/text/input/x;", "b", "()Landroidx/compose/ui/text/input/x;", "ValidatingEmptyOffsetMappingIdentity", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.ui.text.input.x f8067a = new d0(androidx.compose.ui.text.input.x.INSTANCE.a(), 0, 0);

    @dl.d
    public static final TransformedText a(@dl.d m0 m0Var, @dl.d androidx.compose.ui.text.d text) {
        f0.p(m0Var, "<this>");
        f0.p(text, "text");
        TransformedText transformedTextA = m0Var.a(text);
        return new TransformedText(transformedTextA.getText(), new d0(transformedTextA.getOffsetMapping(), text.length(), transformedTextA.getText().length()));
    }

    @dl.d
    public static final androidx.compose.ui.text.input.x b() {
        return f8067a;
    }
}
