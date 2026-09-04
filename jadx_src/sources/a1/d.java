package a1;

import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.annotation.w0;
import androidx.compose.ui.autofill.AutofillType;
import androidx.compose.ui.graphics.w1;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AndroidAutofill.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u001a\u001a\u0010\b\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¨\u0006\t"}, d2 = {"La1/b;", "Landroid/view/ViewStructure;", "root", "Lkotlin/b2;", "b", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "values", ak.av, "ui_release"}, k = 2, mv = {1, 7, 1})
public final class d {
    @androidx.compose.ui.g
    @w0(26)
    public static final void a(@dl.d b bVar, @dl.d SparseArray<AutofillValue> values) {
        f0.p(bVar, "<this>");
        f0.p(values, "values");
        int size = values.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = values.keyAt(i10);
            AutofillValue value = values.get(iKeyAt);
            k kVar = k.f1155a;
            f0.o(value, "value");
            if (kVar.d(value)) {
                bVar.getF1151b().b(iKeyAt, kVar.i(value).toString());
            } else {
                if (kVar.b(value)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (kVar.c(value)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (kVar.e(value)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    @androidx.compose.ui.g
    @w0(26)
    public static final void b(@dl.d b bVar, @dl.d ViewStructure root) {
        Rect rectA;
        f0.p(bVar, "<this>");
        f0.p(root, "root");
        int iA = f.f1154a.a(root, bVar.getF1151b().a().size());
        for (Map.Entry<Integer, m> entry : bVar.getF1151b().a().entrySet()) {
            int iIntValue = entry.getKey().intValue();
            m value = entry.getValue();
            f fVar = f.f1154a;
            ViewStructure viewStructureB = fVar.b(root, iA);
            if (viewStructureB != null) {
                k kVar = k.f1155a;
                AutofillId autofillIdA = kVar.a(root);
                f0.m(autofillIdA);
                kVar.g(viewStructureB, autofillIdA, iIntValue);
                fVar.d(viewStructureB, iIntValue, bVar.getF1150a().getContext().getPackageName(), null, null);
                kVar.h(viewStructureB, 1);
                List<AutofillType> listC = value.c();
                ArrayList arrayList = new ArrayList(listC.size());
                int size = listC.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(c.b(listC.get(i10)));
                }
                Object[] array = arrayList.toArray(new String[0]);
                f0.n(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                kVar.f(viewStructureB, (String[]) array);
                if (value.getF1161b() == null) {
                    Log.w("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
                }
                b1.i f1161b = value.getF1161b();
                if (f1161b != null && (rectA = w1.a(f1161b)) != null) {
                    f.f1154a.c(viewStructureB, rectA.left, rectA.top, 0, 0, rectA.width(), rectA.height());
                }
            }
            iA++;
        }
    }
}
