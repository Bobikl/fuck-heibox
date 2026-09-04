package ea;

import com.loper7.date_time_picker.number_picker.NumberPicker;
import java.text.DateFormatSymbols;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: DateTimeConfig.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0012"}, d2 = {"Lea/e;", "", "", "j", "", "global", "k", "Lcom/loper7/date_time_picker/number_picker/NumberPicker$e;", "formatter", "Lcom/loper7/date_time_picker/number_picker/NumberPicker$e;", "e", "()Lcom/loper7/date_time_picker/number_picker/NumberPicker$e;", "globalizationMonthFormatter", "g", "globalMonthFormatter", "f", "<init>", "()V", "date_time_picker_release"}, k = 1, mv = {1, 5, 1})
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f118596b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f118597c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f118598d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f118599e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f118600f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f118601g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f118602h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f118603i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f118604j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f118605k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f118606l = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final e f118595a = new e();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private static final NumberPicker.e f118607m = new NumberPicker.e() { // from class: ea.b
        @Override // com.loper7.date_time_picker.number_picker.NumberPicker.e
        public final String a(int i10) {
            return e.d(i10);
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private static final NumberPicker.e f118608n = new NumberPicker.e() { // from class: ea.c
        @Override // com.loper7.date_time_picker.number_picker.NumberPicker.e
        public final String a(int i10) {
            return e.i(i10);
        }
    };

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private static final NumberPicker.e f118609o = new NumberPicker.e() { // from class: ea.d
        @Override // com.loper7.date_time_picker.number_picker.NumberPicker.e
        public final String a(int i10) {
            return e.h(i10);
        }
    };

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(int i10) {
        String strValueOf = String.valueOf(i10);
        return i10 < 10 ? f0.C("0", strValueOf) : strValueOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(int i10) {
        String strValueOf = String.valueOf(i10);
        if (!(1 <= i10 && i10 <= 12)) {
            return strValueOf;
        }
        String[] months = new DateFormatSymbols(Locale.US).getMonths();
        f0.o(months, "DateFormatSymbols(Locale.US).months");
        String month = (String) ArraysKt___ArraysKt.kz(months).get(i10 - 1);
        if (month.length() > 3) {
            f0.o(month, "month");
            month = month.substring(0, 3);
            f0.o(month, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        } else {
            f0.o(month, "month");
        }
        return month;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i(int i10) {
        String strValueOf = String.valueOf(i10);
        boolean z10 = false;
        if (1 <= i10 && i10 <= 12) {
            z10 = true;
        }
        if (!z10) {
            return strValueOf;
        }
        String[] months = new DateFormatSymbols(Locale.US).getMonths();
        f0.o(months, "DateFormatSymbols(Locale.US).months");
        Object obj = ArraysKt___ArraysKt.kz(months).get(i10 - 1);
        f0.o(obj, "DateFormatSymbols(Locale.US).months.toList()[value - 1]");
        return (String) obj;
    }

    private final boolean j() {
        String language = Locale.getDefault().getLanguage();
        f0.o(language, "getDefault().language");
        return StringsKt__StringsKt.T2(language, "zh", true);
    }

    @dl.d
    public final NumberPicker.e e() {
        return f118607m;
    }

    @dl.d
    public final NumberPicker.e f() {
        return f118609o;
    }

    @dl.d
    public final NumberPicker.e g() {
        return f118608n;
    }

    public final boolean k(int global) {
        if (global != 1) {
            return global == 0 && j();
        }
        return true;
    }
}
