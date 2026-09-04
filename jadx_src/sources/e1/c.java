package e1;

import androidx.compose.runtime.a1;
import androidx.compose.runtime.h2;
import androidx.compose.ui.g;
import com.umeng.analytics.pro.ak;
import dl.d;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import yh.l;

/* JADX INFO: compiled from: InputModeManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B&\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000fø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006R4\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00028V@VX\u0096\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0013"}, d2 = {"Le1/c;", "Le1/b;", "Le1/a;", "inputMode", "", ak.av, "(I)Z", "<set-?>", "inputMode$delegate", "Landroidx/compose/runtime/a1;", "b", "()I", ak.aF, "(I)V", "initialInputMode", "Lkotlin/Function1;", "onRequestInputModeChange", "<init>", "(ILyh/l;Lkotlin/jvm/internal/u;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private final l<a, Boolean> f118535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final a1 f118536b;

    /* JADX WARN: Multi-variable type inference failed */
    private c(int i10, l<? super a, Boolean> lVar) {
        this.f118535a = lVar;
        this.f118536b = h2.g(a.c(i10), null, 2, null);
    }

    public /* synthetic */ c(int i10, l lVar, u uVar) {
        this(i10, lVar);
    }

    @Override // e1.b
    @g
    public boolean a(int inputMode) {
        return this.f118535a.invoke(a.c(inputMode)).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e1.b
    public int b() {
        return ((a) this.f118536b.getValue()).getF118534a();
    }

    public void c(int i10) {
        this.f118536b.setValue(a.c(i10));
    }
}
