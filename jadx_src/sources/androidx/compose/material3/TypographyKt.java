package androidx.compose.material3;

import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.ui.text.TextStyle;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: Typography.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\" \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/material3/e2;", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "value", "Landroidx/compose/ui/text/q0;", ak.av, "Landroidx/compose/runtime/j1;", "Landroidx/compose/runtime/j1;", "b", "()Landroidx/compose/runtime/j1;", "LocalTypography", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class TypographyKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.j1<Typography> f11745a = CompositionLocalKt.e(new yh.a<Typography>() { // from class: androidx.compose.material3.TypographyKt$LocalTypography$1
        @Override // yh.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Typography invoke() {
            return new Typography(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
        }
    });

    /* JADX INFO: compiled from: Typography.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11747a;

        static {
            int[] iArr = new int[TypographyKeyTokens.values().length];
            iArr[TypographyKeyTokens.DisplayLarge.ordinal()] = 1;
            iArr[TypographyKeyTokens.DisplayMedium.ordinal()] = 2;
            iArr[TypographyKeyTokens.DisplaySmall.ordinal()] = 3;
            iArr[TypographyKeyTokens.HeadlineLarge.ordinal()] = 4;
            iArr[TypographyKeyTokens.HeadlineMedium.ordinal()] = 5;
            iArr[TypographyKeyTokens.HeadlineSmall.ordinal()] = 6;
            iArr[TypographyKeyTokens.TitleLarge.ordinal()] = 7;
            iArr[TypographyKeyTokens.TitleMedium.ordinal()] = 8;
            iArr[TypographyKeyTokens.TitleSmall.ordinal()] = 9;
            iArr[TypographyKeyTokens.BodyLarge.ordinal()] = 10;
            iArr[TypographyKeyTokens.BodyMedium.ordinal()] = 11;
            iArr[TypographyKeyTokens.BodySmall.ordinal()] = 12;
            iArr[TypographyKeyTokens.LabelLarge.ordinal()] = 13;
            iArr[TypographyKeyTokens.LabelMedium.ordinal()] = 14;
            iArr[TypographyKeyTokens.LabelSmall.ordinal()] = 15;
            f11747a = iArr;
        }
    }

    @dl.d
    public static final TextStyle a(@dl.d Typography typography, @dl.d TypographyKeyTokens value) {
        kotlin.jvm.internal.f0.p(typography, "<this>");
        kotlin.jvm.internal.f0.p(value, "value");
        switch (a.f11747a[value.ordinal()]) {
            case 1:
                return typography.getDisplayLarge();
            case 2:
                return typography.getDisplayMedium();
            case 3:
                return typography.getDisplaySmall();
            case 4:
                return typography.getHeadlineLarge();
            case 5:
                return typography.getHeadlineMedium();
            case 6:
                return typography.getHeadlineSmall();
            case 7:
                return typography.getTitleLarge();
            case 8:
                return typography.getTitleMedium();
            case 9:
                return typography.getTitleSmall();
            case 10:
                return typography.getBodyLarge();
            case 11:
                return typography.getBodyMedium();
            case 12:
                return typography.getBodySmall();
            case 13:
                return typography.getLabelLarge();
            case 14:
                return typography.getLabelMedium();
            case 15:
                return typography.getLabelSmall();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @dl.d
    public static final androidx.compose.runtime.j1<Typography> b() {
        return f11745a;
    }
}
