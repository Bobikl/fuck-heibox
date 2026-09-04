package cn.fly.verify;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class gs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static gs f36829a;

    /* JADX INFO: renamed from: cn.fly.verify.gs$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f36830a;

        static {
            int[] iArr = new int[a.values().length];
            f36830a = iArr;
            try {
                iArr[a.MIUI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36830a[a.EMUI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36830a[a.AMIGO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36830a[a.FLYME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36830a[a.LENOVO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36830a[a.ONEUI.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36830a[a.COLOR_OS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f36830a[a.FUNTOUCH_OS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f36830a[a.EUI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f36830a[a.SENSE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f36830a[a.GOOGLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f36830a[a.SMARTISAN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f36830a[a.ONEPLUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f36830a[a.YUNOS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f36830a[a.QIHOO.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f36830a[a.NUBIA.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f36830a[a.LGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public enum a {
        MIUI(ei.a("0068eidi]dFdkdfdi")),
        EMUI(ei.a("006h_dg*dMfg(f0di")),
        FLYME(ei.a("005(df,fEdigddg")),
        ONEUI(ei.a("007*fi'd'dffidgOeSej")),
        COLOR_OS(ei.a("004WdkXjjNdk")),
        FUNTOUCH_OS(ei.a("004%dddidddk")),
        EUI(ei.a("004gfi'dd")),
        SENSE(ei.a("003hic")),
        GOOGLE(ei.a("006*ejdkdkej1gf")),
        LENOVO(ei.a("006gfeAdkdddk")),
        SMARTISAN(ei.a("006chAdgdigddi")),
        ONEPLUS(ei.a("0070dkJefjg4dgfi")),
        YUNOS(ei.a("005$ecdg_eQdkfi")),
        QIHOO(ei.a("005NdediSh>dkdk")),
        NUBIA(ei.a("005eWdgffdi+d")),
        LGE(ei.a("002gEej")),
        AMIGO(ei.a("005^hgdi5eg8di")),
        OTHER("");


        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private String f36850s;

        a(String str) {
            this.f36850s = str;
        }

        public String a() {
            return this.f36850s;
        }
    }

    private gs() {
    }

    public static gs a() {
        if (f36829a == null) {
            synchronized (gs.class) {
                if (f36829a == null) {
                    f36829a = new gs();
                }
            }
        }
        return f36829a;
    }

    private String a(String str) {
        return fz.d.c(str);
    }

    private a c() {
        if (!TextUtils.isEmpty(a("ro.miui.ui.version.code")) || !TextUtils.isEmpty(a(ei.a("023Ydjdkdldfdidgdidldgdidldd1fYdjfididk6e+dl5ed1df$f"))) || !TextUtils.isEmpty(a("ro.miui.internal.storage"))) {
            return a.MIUI;
        }
        if (!TextUtils.isEmpty(a(ei.a("021IdjdkdlffdgdiJg@dcdlddGf0djfididkIeGdl=fXdfdgdi"))) || !TextUtils.isEmpty(a("ro.build.hw_emui_api_level")) || !TextUtils.isEmpty(a("ro.confg.hw_systemversion"))) {
            return a.EMUI;
        }
        if (!TextUtils.isEmpty(a(ei.a("026jfJdjfidifi.iQdlfiecfidldgfiXfSdlef=g?ecdf>fJdldi@c4dk2e"))) || !TextUtils.isEmpty(a(ei.a("026Qdjdkdldf5f:digddgdlfi^fi0dg5j=fgdigd3d>djdcdlef7gKecdfPf"))) || !TextUtils.isEmpty(a(ei.a("018Ndjdkdlef?g)ecdf*f0dl!j-dgffQg<difi@hf'dc")))) {
            return a.FLYME;
        }
        if (!TextUtils.isEmpty(a(ei.a("024cVdkdfdlfi+dIdffidg,e*ejdlfi?jf?ejdldcdifi[dOff^gf"))) || !TextUtils.isEmpty(a("init.svc.health-hal-2-1-samsung"))) {
            return a.ONEUI;
        }
        if (!TextUtils.isEmpty(a(ei.a("0243djdkdlffdgdiCgXdcdldd'fBdjfididk^eHdldk>jjRdkdjdkdf")))) {
            return a.COLOR_OS;
        }
        if (!TextUtils.isEmpty(a(ei.a("027BdjdkdldddidddkdldkfidlffdgdiJg'dcdldcdifi1jgdYecdldidc"))) || !TextUtils.isEmpty(a(ei.a("018-djdkdldddidddkdldkfidldd-fEdjfididk e")))) {
            return a.FUNTOUCH_OS;
        }
        if (!TextUtils.isEmpty(a(ei.a("023^djdkdlIgfi=dddldj)fgfdDfiWf5dlddPf.djfididkWe")))) {
            return a.EUI;
        }
        if (!TextUtils.isEmpty(a(ei.a("022@djdkdlffdgdi>gAdcdlfi@feLfiXf'dldd6fIdjfididkBe")))) {
            return a.SENSE;
        }
        if (ei.a("014deSdcdjdkdidchkejdkdkej3gf").equals(a(ei.a("026GdjdkdlKc@dkdfdlejdkdkejCgf(dlTcg'di.feiQdidcff,d?fi]f")))) {
            return a.GOOGLE;
        }
        if (!TextUtils.isEmpty(a(ei.a("020;djdkdlfidf]dLdj;iNdifiYde^dldd3f<djfididkPe")))) {
            return a.SMARTISAN;
        }
        if (!TextUtils.isEmpty(a(ei.a("014:djdkdldjdkdfdlddNfUdjfididk]e")))) {
            return a.ONEPLUS;
        }
        if (!TextUtils.isEmpty(a(ei.a("020)djdkdlHcidMdlecdg4eMdkfidlddYf'djfididkDe")))) {
            return a.YUNOS;
        }
        if (!TextUtils.isEmpty(a(ei.a("018Mdjdkdlffdgdi)gEdcdldgdidd@fMdjfididkIe")))) {
            return a.QIHOO;
        }
        if (!TextUtils.isEmpty(a(ei.a("0230djdkdlffdgdi'g0dcdl6eZdgffdiWdRdldjdkdfdlRcOdkdcIf"))) || !TextUtils.isEmpty(a(ei.a("015[djdkdlffdgdi@g<dcdldjdkdfdldidc")))) {
            return a.NUBIA;
        }
        if (!TextUtils.isEmpty(a(ei.a("021,fiecfidl2g1ej+f*dlTgLejdfdcdfdhddTfKdjfididkPe")))) {
            return a.LGE;
        }
        if (!TextUtils.isEmpty(a(ei.a("019:djdkdlffdgdi(gLdcdldcdifi%jgd9ecdldidc"))) && a(ei.a("019EdjdkdlffdgdiDg4dcdldcdifiHjgdKecdldidc")).matches("amigo([\\d.]+)[a-zA-Z]*")) {
            return a.AMIGO;
        }
        for (a aVar : a.values()) {
            if (aVar.a().equalsIgnoreCase(fz.d.k())) {
                return aVar;
            }
        }
        return a.OTHER;
    }

    public String b() {
        String str;
        String strA;
        switch (AnonymousClass1.f36830a[c().ordinal()]) {
            case 1:
                str = "023;djdkdldfdidgdidldgdidldd,f?djfididk;e:dl@edSdf6f";
                strA = a(ei.a(str));
                break;
            case 2:
                str = "021PdjdkdlffdgdiKgQdcdldd)f7djfididkCeOdlOf>dfdgdi";
                strA = a(ei.a(str));
                break;
            case 3:
            case 4:
                str = "019Cdjdkdlffdgdi3g=dcdldcdifiVjgdXecdldidc";
                strA = a(ei.a(str));
                break;
            case 5:
            case 6:
                str = "028]djdkdlffdgdi@g3dcdlddXf.djfididk-e;dldiKecPdj'f=dfNfeidg";
                strA = a(ei.a(str));
                break;
            case 7:
                str = "024Udjdkdlffdgdi(g0dcdlddYf$djfididkDeUdldkQjjEdkdjdkdf";
                strA = a(ei.a(str));
                break;
            case 8:
                strA = a(ei.a("027_djdkdldddidddkdldkfidlffdgdiBg^dcdldcdifiKjgd:ecdldidc"));
                if (TextUtils.isEmpty(strA)) {
                    str = "018CdjdkdldddidddkdldkfidlddMf!djfididkFe";
                    strA = a(ei.a(str));
                }
                break;
            case 9:
                str = "0233djdkdlPgfi1dddldj!fgfdFfiDfRdldd-f>djfididk,e";
                strA = a(ei.a(str));
                break;
            case 10:
                str = "022Mdjdkdlffdgdi*gDdcdlfi7feSfiLf+dldd[f:djfididk[e";
                strA = a(ei.a(str));
                break;
            case 11:
                str = "0244djdkdlffdgdiTgZdcdlddEf;djfididkQe6dldjMfgfd!fiEf";
                strA = a(ei.a(str));
                break;
            case 12:
                str = "0207djdkdlfidf!d2djKi^difi]de:dlddYf?djfididk-e";
                strA = a(ei.a(str));
                break;
            case 13:
                str = "014DdjdkdldjdkdfdlddNf]djfididkTe";
                strA = a(ei.a(str));
                break;
            case 14:
                str = "020MdjdkdlPcid*dlecdgCeTdkfidlddXfBdjfididkIe";
                strA = a(ei.a(str));
                break;
            case 15:
                str = "018XdjdkdlffdgdiUg(dcdldgdidd7f-djfididk+e";
                strA = a(ei.a(str));
                break;
            case 16:
                strA = a(ei.a("023(djdkdlffdgdi:g<dcdl(e*dgffdiRdQdldjdkdfdl)cLdkdcOf"));
                if (TextUtils.isEmpty(strA)) {
                    str = "015Bdjdkdlffdgdi-g%dcdldjdkdfdldidc";
                    strA = a(ei.a(str));
                }
                break;
            case 17:
                str = "021 fiecfidl%g(ej-f6dlZg*ejdfdcdfdhdd^fYdjfididkZe";
                strA = a(ei.a(str));
                break;
            default:
                str = "019FdjdkdlffdgdiHgBdcdldcdifiRjgd!ecdldidc";
                strA = a(ei.a(str));
                break;
        }
        return TextUtils.isEmpty(strA) ? a(ei.a("019[djdkdlffdgdi_gGdcdldcdifi2jgdIecdldidc")) : strA;
    }
}
