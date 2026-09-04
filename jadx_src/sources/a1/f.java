package a1;

import android.view.ViewStructure;
import androidx.annotation.u;
import androidx.annotation.w0;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AndroidAutofill.android.kt */
/* JADX INFO: loaded from: classes.dex */
@w0(23)
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J6\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0007J@\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¨\u0006\u0019"}, d2 = {"La1/f;", "", "Landroid/view/ViewStructure;", "structure", "", UCropPlusActivity.ARG_INDEX, "b", "num", ak.av, "id", "", "packageName", "typeName", "entryName", "Lkotlin/b2;", "d", com.google.android.exoplayer2.text.ttml.d.f49793l0, "top", "scrollX", "scrollY", "width", "height", ak.aF, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final f f1154a = new f();

    private f() {
    }

    @u
    @w0(23)
    public final int a(@dl.d ViewStructure structure, int num) {
        f0.p(structure, "structure");
        return structure.addChildCount(num);
    }

    @u
    @w0(23)
    @dl.e
    public final ViewStructure b(@dl.d ViewStructure structure, int index) {
        f0.p(structure, "structure");
        return structure.newChild(index);
    }

    @u
    @w0(23)
    public final void c(@dl.d ViewStructure structure, int i10, int i11, int i12, int i13, int i14, int i15) {
        f0.p(structure, "structure");
        structure.setDimens(i10, i11, i12, i13, i14, i15);
    }

    @u
    @w0(23)
    public final void d(@dl.d ViewStructure structure, int i10, @dl.e String str, @dl.e String str2, @dl.e String str3) {
        f0.p(structure, "structure");
        structure.setId(i10, str, str2, str3);
    }
}
