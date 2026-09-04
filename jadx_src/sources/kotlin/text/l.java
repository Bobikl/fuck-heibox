package kotlin.text;

/* JADX INFO: compiled from: StringNumberConversionsJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final l f128588a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final Regex f128589b;

    static {
        String str = "[eE][+-]?(\\p{Digit}+)";
        f128589b = new Regex("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + ("((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)(" + str + ")?)|(\\.((\\p{Digit}+))(" + str + ")?)|((" + ("(0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+))") + ")[pP][+-]?(\\p{Digit}+))") + ")[fFdD]?))[\\x00-\\x20]*");
    }

    private l() {
    }
}
