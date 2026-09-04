package j1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.v;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.p;
import androidx.compose.ui.graphics.y0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ImageResources.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u001a\u001d\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/y0$a;", "Landroid/content/res/Resources;", Constants.SEND_TYPE_RES, "", "id", "Landroidx/compose/ui/graphics/y0;", "b", ak.av, "(Landroidx/compose/ui/graphics/y0$a;ILandroidx/compose/runtime/p;I)Landroidx/compose/ui/graphics/y0;", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class d {
    @dl.d
    @androidx.compose.runtime.h
    public static final y0 a(@dl.d y0.Companion companion, @v int i10, @dl.e p pVar, int i11) {
        f0.p(companion, "<this>");
        pVar.T(-304919470);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-304919470, i11, -1, "androidx.compose.ui.res.imageResource (ImageResources.android.kt:52)");
        }
        Context context = (Context) pVar.K(AndroidCompositionLocals_androidKt.g());
        pVar.T(-492369756);
        Object objU = pVar.U();
        p.Companion companion2 = p.INSTANCE;
        if (objU == companion2.a()) {
            objU = new TypedValue();
            pVar.N(objU);
        }
        pVar.c0();
        TypedValue typedValue = (TypedValue) objU;
        context.getResources().getValue(i10, typedValue, true);
        CharSequence charSequence = typedValue.string;
        f0.m(charSequence);
        String string = charSequence.toString();
        pVar.T(1157296644);
        boolean zS = pVar.s(string);
        Object objU2 = pVar.U();
        if (zS || objU2 == companion2.a()) {
            Resources resources = context.getResources();
            f0.o(resources, "context.resources");
            objU2 = b(companion, resources, i10);
            pVar.N(objU2);
        }
        pVar.c0();
        y0 y0Var = (y0) objU2;
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return y0Var;
    }

    @dl.d
    public static final y0 b(@dl.d y0.Companion companion, @dl.d Resources res, @v int i10) {
        f0.p(companion, "<this>");
        f0.p(res, "res");
        Drawable drawable = res.getDrawable(i10, null);
        f0.n(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        f0.o(bitmap, "res.getDrawable(id, null…as BitmapDrawable).bitmap");
        return androidx.compose.ui.graphics.f.c(bitmap);
    }
}
