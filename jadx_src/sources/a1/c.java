package a1;

import androidx.compose.ui.autofill.AutofillType;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AndroidAutofillType.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\"\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00008@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/autofill/AutofillType;", "", "b", "(Landroidx/compose/ui/autofill/AutofillType;)Ljava/lang/String;", "getAndroidType$annotations", "(Landroidx/compose/ui/autofill/AutofillType;)V", "androidType", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final HashMap<AutofillType, String> f1153a = s0.M(c1.a(AutofillType.EmailAddress, g0.a.f118917a), c1.a(AutofillType.Username, g0.a.f118919c), c1.a(AutofillType.Password, g0.a.f118920d), c1.a(AutofillType.NewUsername, g0.a.E), c1.a(AutofillType.NewPassword, g0.a.F), c1.a(AutofillType.PostalAddress, g0.a.f118922f), c1.a(AutofillType.PostalCode, g0.a.f118923g), c1.a(AutofillType.CreditCardNumber, g0.a.f118924h), c1.a(AutofillType.CreditCardSecurityCode, g0.a.f118925i), c1.a(AutofillType.CreditCardExpirationDate, g0.a.f118926j), c1.a(AutofillType.CreditCardExpirationMonth, g0.a.f118927k), c1.a(AutofillType.CreditCardExpirationYear, g0.a.f118928l), c1.a(AutofillType.CreditCardExpirationDay, g0.a.f118929m), c1.a(AutofillType.AddressCountry, g0.a.f118930n), c1.a(AutofillType.AddressRegion, g0.a.f118931o), c1.a(AutofillType.AddressLocality, g0.a.f118932p), c1.a(AutofillType.AddressStreet, g0.a.f118933q), c1.a(AutofillType.AddressAuxiliaryDetails, g0.a.f118934r), c1.a(AutofillType.PostalCodeExtended, g0.a.f118935s), c1.a(AutofillType.PersonFullName, g0.a.f118936t), c1.a(AutofillType.PersonFirstName, g0.a.f118937u), c1.a(AutofillType.PersonLastName, g0.a.f118938v), c1.a(AutofillType.PersonMiddleName, g0.a.f118939w), c1.a(AutofillType.PersonMiddleInitial, g0.a.f118940x), c1.a(AutofillType.PersonNamePrefix, g0.a.f118941y), c1.a(AutofillType.PersonNameSuffix, g0.a.f118942z), c1.a(AutofillType.PhoneNumber, g0.a.A), c1.a(AutofillType.PhoneNumberDevice, g0.a.B), c1.a(AutofillType.PhoneCountryCode, g0.a.C), c1.a(AutofillType.PhoneNumberNational, g0.a.D), c1.a(AutofillType.Gender, g0.a.G), c1.a(AutofillType.BirthDateFull, g0.a.H), c1.a(AutofillType.BirthDateDay, g0.a.I), c1.a(AutofillType.BirthDateMonth, g0.a.J), c1.a(AutofillType.BirthDateYear, g0.a.K), c1.a(AutofillType.SmsOtpCode, g0.a.L));

    @androidx.compose.ui.g
    private static /* synthetic */ void a() {
    }

    @dl.d
    public static final String b(@dl.d AutofillType autofillType) {
        f0.p(autofillType, "<this>");
        String str = f1153a.get(autofillType);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type".toString());
    }

    @androidx.compose.ui.g
    public static /* synthetic */ void c(AutofillType autofillType) {
    }
}
