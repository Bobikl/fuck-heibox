package androidx.compose.ui.platform;

import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.compose.ui.text.SpanStyle;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;

/* JADX INFO: compiled from: AndroidClipboardManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u001a\u001a\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0000*\u00020\u0001H\u0000\"\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0002\u0010\u0005\"\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\b\"\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\b\"\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\b\"\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\b\"\u0014\u0010\u0011\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\b\"\u0014\u0010\u0013\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\b\"\u0014\u0010\u0015\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\b\"\u0014\u0010\u0017\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\b\"\u0014\u0010\u0019\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\b\"\u0014\u0010\u001b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\b\"\u0014\u0010\u001d\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\b\"\u0014\u0010\u001f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\b\"\u0014\u0010!\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\b\"\u0014\u0010#\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\b\"\u0014\u0010%\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\b\"\u0014\u0010'\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\b\"\u0014\u0010)\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\b\"\u0014\u0010+\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\b\"\u0014\u0010-\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\b\"\u0014\u0010/\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010\b\"\u0014\u00101\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010\b\"\u0014\u00105\u001a\u0002028\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u00104\"\u0014\u00107\u001a\u0002028\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u00104\"\u0014\u00109\u001a\u0002028\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00104\"\u0014\u0010;\u001a\u0002028\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u00104\"\u0014\u0010=\u001a\u0002028\u0002X\u0082T¢\u0006\u0006\n\u0004\b<\u00104\"\u0014\u0010>\u001a\u0002028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u00104\"\u0014\u0010@\u001a\u0002028\u0002X\u0082T¢\u0006\u0006\n\u0004\b?\u00104\"\u0014\u0010B\u001a\u0002028\u0002X\u0082T¢\u0006\u0006\n\u0004\bA\u00104\"\u0014\u0010D\u001a\u0002028\u0002X\u0082T¢\u0006\u0006\n\u0004\bC\u00104\"\u0014\u0010F\u001a\u0002028\u0002X\u0082T¢\u0006\u0006\n\u0004\bE\u00104\"\u0014\u0010H\u001a\u0002028\u0002X\u0082T¢\u0006\u0006\n\u0004\bG\u00104\"\u0014\u0010J\u001a\u0002028\u0002X\u0082T¢\u0006\u0006\n\u0004\bI\u00104\"\u0014\u0010K\u001a\u0002028\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u00104¨\u0006L"}, d2 = {"", "Landroidx/compose/ui/text/d;", ak.av, "b", "", "Ljava/lang/String;", "PLAIN_TEXT_LABEL", "", "B", "UNIT_TYPE_UNSPECIFIED", ak.aF, "UNIT_TYPE_SP", "d", "UNIT_TYPE_EM", "e", "FONT_STYLE_NORMAL", "f", "FONT_STYLE_ITALIC", "g", "FONT_SYNTHESIS_NONE", RXScreenCaptureService.KEY_HEIGHT, "FONT_SYNTHESIS_ALL", "i", "FONT_SYNTHESIS_WEIGHT", "j", "FONT_SYNTHESIS_STYLE", "k", "COLOR_ID", "l", "FONT_SIZE_ID", "m", "FONT_WEIGHT_ID", "n", "FONT_STYLE_ID", "o", "FONT_SYNTHESIS_ID", "p", "FONT_FEATURE_SETTINGS_ID", "q", "LETTER_SPACING_ID", "r", "BASELINE_SHIFT_ID", ak.aB, "TEXT_GEOMETRIC_TRANSFORM_ID", "t", "BACKGROUND_ID", ak.aG, "TEXT_DECORATION_ID", "v", "SHADOW_ID", "", RXScreenCaptureService.KEY_WIDTH, "I", "BYTE_SIZE", "x", "INT_SIZE", "y", "FLOAT_SIZE", ak.aD, "LONG_SIZE", androidx.exifinterface.media.a.W4, "COLOR_SIZE", "TEXT_UNIT_SIZE", "C", "FONT_WEIGHT_SIZE", "D", "FONT_STYLE_SIZE", androidx.exifinterface.media.a.S4, "FONT_SYNTHESIS_SIZE", "F", "BASELINE_SHIFT_SIZE", "G", "TEXT_GEOMETRIC_TRANSFORM_SIZE", "H", "TEXT_DECORATION_SIZE", "SHADOW_SIZE", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class h {
    private static final int A = 8;
    private static final int B = 5;
    private static final int C = 4;
    private static final int D = 1;
    private static final int E = 1;
    private static final int F = 4;
    private static final int G = 8;
    private static final int H = 4;
    private static final int I = 20;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final String f15877a = "plain text";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte f15878b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte f15879c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte f15880d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte f15881e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte f15882f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte f15883g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte f15884h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte f15885i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final byte f15886j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final byte f15887k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final byte f15888l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final byte f15889m = 3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final byte f15890n = 4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte f15891o = 5;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final byte f15892p = 6;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final byte f15893q = 7;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final byte f15894r = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final byte f15895s = 9;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final byte f15896t = 10;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final byte f15897u = 11;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final byte f15898v = 12;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f15899w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f15900x = 4;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f15901y = 4;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f15902z = 8;

    @dl.e
    public static final androidx.compose.ui.text.d a(@dl.e CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new androidx.compose.ui.text.d(charSequence.toString(), null, null, 6, null);
        }
        Spanned spanned = (Spanned) charSequence;
        int i10 = 0;
        Annotation[] annotations = (Annotation[]) spanned.getSpans(0, charSequence.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        kotlin.jvm.internal.f0.o(annotations, "annotations");
        int iXe = ArraysKt___ArraysKt.Xe(annotations);
        if (iXe >= 0) {
            while (true) {
                Annotation annotation = annotations[i10];
                if (kotlin.jvm.internal.f0.g(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    int spanStart = spanned.getSpanStart(annotation);
                    int spanEnd = spanned.getSpanEnd(annotation);
                    String value = annotation.getValue();
                    kotlin.jvm.internal.f0.o(value, "span.value");
                    arrayList.add(new androidx.compose.ui.text.d.Range(new m0(value).k(), spanStart, spanEnd));
                }
                if (i10 == iXe) {
                    break;
                }
                i10++;
            }
        }
        return new androidx.compose.ui.text.d(charSequence.toString(), arrayList, null, 4, null);
    }

    @dl.d
    public static final CharSequence b(@dl.d androidx.compose.ui.text.d dVar) {
        kotlin.jvm.internal.f0.p(dVar, "<this>");
        if (dVar.e().isEmpty()) {
            return dVar.getText();
        }
        SpannableString spannableString = new SpannableString(dVar.getText());
        r0 r0Var = new r0();
        List<androidx.compose.ui.text.d.Range<SpanStyle>> listE = dVar.e();
        int size = listE.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.ui.text.d.Range<SpanStyle> range = listE.get(i10);
            SpanStyle spanStyleA = range.a();
            int start = range.getStart();
            int end = range.getEnd();
            r0Var.q();
            r0Var.e(spanStyleA);
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", r0Var.p()), start, end, 33);
        }
        return spannableString;
    }
}
