package androidx.compose.ui.platform;

import android.content.res.Configuration;
import androidx.annotation.RestrictTo;
import androidx.compose.ui.unit.LayoutDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import org.apache.tools.ant.taskdefs.a6;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a!\u0010\u0007\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a5\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\"\u0018\u0010\u0013\u001a\u00020\u0002*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"4\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "g", "Landroidx/compose/ui/graphics/c1;", "other", "Lkotlin/b2;", RXScreenCaptureService.KEY_HEIGHT, "([F[F)V", "m1", a6.a.f133725d, "m2", "column", "", ak.aF, "([FI[FI)F", "Landroid/content/res/Configuration;", "d", "(Landroid/content/res/Configuration;)Landroidx/compose/ui/unit/LayoutDirection;", "localeLayoutDirection", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/b0;", "Landroidx/compose/ui/text/input/i0;", "textInputServiceFactory", "Lyh/l;", "e", "()Lyh/l;", "i", "(Lyh/l;)V", "getTextInputServiceFactory$annotations", "()V", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class AndroidComposeView_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private static yh.l<? super androidx.compose.ui.text.input.b0, ? extends androidx.compose.ui.text.input.i0> f15525a = new yh.l<androidx.compose.ui.text.input.b0, androidx.compose.ui.text.input.i0>() { // from class: androidx.compose.ui.platform.AndroidComposeView_androidKt$textInputServiceFactory$1
        @Override // yh.l
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.text.input.i0 invoke(@dl.d androidx.compose.ui.text.input.b0 it) {
            kotlin.jvm.internal.f0.p(it, "it");
            return new androidx.compose.ui.text.input.i0(it);
        }
    };

    private static final float c(float[] fArr, int i10, float[] fArr2, int i11) {
        int i12 = i10 * 4;
        return (fArr[i12 + 0] * fArr2[0 + i11]) + (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + (fArr[i12 + 3] * fArr2[12 + i11]);
    }

    @dl.d
    public static final LayoutDirection d(@dl.d Configuration configuration) {
        kotlin.jvm.internal.f0.p(configuration, "<this>");
        return g(configuration.getLayoutDirection());
    }

    @dl.d
    public static final yh.l<androidx.compose.ui.text.input.b0, androidx.compose.ui.text.input.i0> e() {
        return f15525a;
    }

    @androidx.compose.ui.h
    public static /* synthetic */ void f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutDirection g(int i10) {
        if (i10 != 0 && i10 == 1) {
            return LayoutDirection.Rtl;
        }
        return LayoutDirection.Ltr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(float[] fArr, float[] fArr2) {
        float fC = c(fArr2, 0, fArr, 0);
        float fC2 = c(fArr2, 0, fArr, 1);
        float fC3 = c(fArr2, 0, fArr, 2);
        float fC4 = c(fArr2, 0, fArr, 3);
        float fC5 = c(fArr2, 1, fArr, 0);
        float fC6 = c(fArr2, 1, fArr, 1);
        float fC7 = c(fArr2, 1, fArr, 2);
        float fC8 = c(fArr2, 1, fArr, 3);
        float fC9 = c(fArr2, 2, fArr, 0);
        float fC10 = c(fArr2, 2, fArr, 1);
        float fC11 = c(fArr2, 2, fArr, 2);
        float fC12 = c(fArr2, 2, fArr, 3);
        float fC13 = c(fArr2, 3, fArr, 0);
        float fC14 = c(fArr2, 3, fArr, 1);
        float fC15 = c(fArr2, 3, fArr, 2);
        float fC16 = c(fArr2, 3, fArr, 3);
        fArr[0] = fC;
        fArr[1] = fC2;
        fArr[2] = fC3;
        fArr[3] = fC4;
        fArr[4] = fC5;
        fArr[5] = fC6;
        fArr[6] = fC7;
        fArr[7] = fC8;
        fArr[8] = fC9;
        fArr[9] = fC10;
        fArr[10] = fC11;
        fArr[11] = fC12;
        fArr[12] = fC13;
        fArr[13] = fC14;
        fArr[14] = fC15;
        fArr[15] = fC16;
    }

    public static final void i(@dl.d yh.l<? super androidx.compose.ui.text.input.b0, ? extends androidx.compose.ui.text.input.i0> lVar) {
        kotlin.jvm.internal.f0.p(lVar, "<set-?>");
        f15525a = lVar;
    }
}
