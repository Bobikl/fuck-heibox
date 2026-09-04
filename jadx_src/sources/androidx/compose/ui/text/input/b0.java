package androidx.compose.ui.text.input;

import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: TextInputService.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JI\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0006H&ø\u0001\u0000J\b\u0010\u000e\u001a\u00020\tH&J\b\u0010\u000f\u001a\u00020\tH&J\b\u0010\u0010\u001a\u00020\tH&J\u001a\u0010\u0013\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u0002H&J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0017ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/input/b0;", "", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/ui/text/input/p;", "imeOptions", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/input/g;", "Lkotlin/b2;", "onEditCommand", "Landroidx/compose/ui/text/input/o;", "onImeActionPerformed", "f", ak.aF, "b", ak.av, "oldValue", "newValue", "d", "Lb1/i;", "rect", "e", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public interface b0 {
    void a();

    void b();

    void c();

    void d(@dl.e TextFieldValue textFieldValue, @dl.d TextFieldValue textFieldValue2);

    @kotlin.k(message = "This method should not be called, used BringIntoViewRequester instead.")
    void e(@dl.d b1.i iVar);

    void f(@dl.d TextFieldValue textFieldValue, @dl.d ImeOptions imeOptions, @dl.d yh.l<? super List<? extends g>, b2> lVar, @dl.d yh.l<? super o, b2> lVar2);
}
