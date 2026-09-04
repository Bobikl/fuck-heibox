package cn.fly.verify;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class cd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static cg f35988a;

    /* JADX INFO: renamed from: cn.fly.verify.cd$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f35991a;

        static {
            int[] iArr = new int[a.values().length];
            f35991a = iArr;
            try {
                iArr[a.XIAOMI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35991a[a.REDMI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35991a[a.MEITU.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35991a[a.BLACKSHARK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35991a[a.VIVO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35991a[a.HUA_WEI.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35991a[a.HORNOR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35991a[a.OPPO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f35991a[a.REALME.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f35991a[a.ONEPLUS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f35991a[a.MOTO.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f35991a[a.ZUK.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f35991a[a.LENOVO.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f35991a[a.ASUS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f35991a[a.SAMSUNG.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f35991a[a.MEIZU.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f35991a[a.MBLU.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f35991a[a.ALPS.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f35991a[a.NUBIA.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f35991a[a.ZTE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f35991a[a.FERRMEOS.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f35991a[a.SSUI.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f35991a[a.COOLPAD.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f35991a[a.QIKU.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f35991a[a.COOSEA.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
        }
    }

    public enum a {
        UNSUPPORT(-1, ba.a("0098fi7g1hkfi9ll[fmflWk")),
        HUA_WEI(0, ba.a("006Mhmgmhfihikgg"), ba.a("021NflfmfnhhfifkMi%fefnffTh0flhkfkfmRg[fn[h,fhfifk")),
        XIAOMI(1, ba.a("006Iiifk*f8fmfhfk"), ba.a("023Zflfmfnfhfkfifkfnfifkfnff5h1flhkfkfm2gTfnHgfTfh3h")),
        VIVO(2, ba.a("004Yfffkfffm"), ba.a("018?flfmfnfffkfffmfnfmhkfnff+hSflhkfkfm=g")),
        OPPO(3, ba.a("0043fmCllAfm"), ba.a("024Eflfmfnhhfifk-iGfefnff1h?flhkfkfm'g%fnfmEllDfmflfmfh")),
        MOTO(4, ba.a("008VfhfmBk>fmflfm[if")),
        LENOVO(5, ba.a("006ihgMfmfffm")),
        ASUS(6, ba.a("004f1hkfihk")),
        SAMSUNG(7, ba.a("007]hk:fZfhhkfiCgNgl")),
        MEIZU(8, ba.a("0055fhXhXfkiffi")),
        ALPS(9, ba.a("004filNhk")),
        NUBIA(10, ba.a("005gKfihhfkLf")),
        ONEPLUS(11, ba.a("007LfmBghli(fihk")),
        BLACKSHARK(12, ba.a("010LhhXife_gjhk;jf6flgj")),
        ZTE(13, ba.a("0037if]kh")),
        FERRMEOS(14, ba.a("008Kghfl<hhZfh)h'fmhk")),
        SSUI(15, ba.a("004Whkhkfifk")),
        HORNOR(16, "HONOR"),
        REALME(17, "REALME"),
        REDMI(18, "REDMI"),
        MEITU(19, "MEITU"),
        ZUK(20, "ZUK"),
        MBLU(21, "MBLU"),
        COOLPAD(22, "COOLPAD"),
        COOSEA(23, "COOSEA"),
        QIKU(24, "360OS", ba.a("018Gflfmfnhhfifk4iPfefnfifkff'hBflhkfkfm_g"));

        private final int A;
        private String B;
        private String C;

        a(int i10, String str) {
            this.A = i10;
            this.B = str;
        }

        a(int i10, String str, String str2) {
            this.A = i10;
            this.B = str;
            this.C = str2;
        }
    }

    public static a a(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            for (a aVar : a.values()) {
                if (aVar.B.equalsIgnoreCase(str) || aVar.B.equalsIgnoreCase(str2) || !(TextUtils.isEmpty(aVar.C) || TextUtils.isEmpty(fz.d.c(aVar.C)))) {
                    return aVar;
                }
            }
        }
        if (a() || b()) {
            return a.ZTE;
        }
        if (c(context)) {
            return a.COOLPAD;
        }
        return c() ? a.COOSEA : a.UNSUPPORT;
    }

    public static synchronized void a(Context context) {
        cg cpVar;
        if (f35988a != null) {
            return;
        }
        a aVarA = a(context, Build.MANUFACTURER, Build.BRAND);
        if (aVarA == a.UNSUPPORT) {
            return;
        }
        switch (AnonymousClass2.f35991a[aVarA.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                cpVar = new cp(context);
                f35988a = cpVar;
                return;
            case 5:
                cpVar = new co(context);
                f35988a = cpVar;
                return;
            case 6:
                cpVar = new cf(context);
                f35988a = cpVar;
                return;
            case 7:
                cpVar = new ce(context);
                f35988a = cpVar;
                return;
            case 8:
            case 9:
                cpVar = new cl(context);
                f35988a = cpVar;
                return;
            case 10:
                cpVar = new ck(context);
                f35988a = cpVar;
                return;
            case 11:
            case 12:
            case 13:
                cpVar = new ci(context);
                f35988a = cpVar;
                return;
            case 14:
                cpVar = new bz(context);
                f35988a = cpVar;
                return;
            case 15:
                cpVar = new cn(context);
                f35988a = cpVar;
                return;
            case 16:
            case 17:
            case 18:
                cpVar = new ch(context);
                f35988a = cpVar;
                return;
            case 19:
                cpVar = new cj(context);
                f35988a = cpVar;
                return;
            case 20:
            case 21:
            case 22:
                cpVar = new cq(context);
                f35988a = cpVar;
                return;
            case 23:
                cpVar = new ca(context);
                f35988a = cpVar;
                return;
            case 24:
                cpVar = new cm(context);
                f35988a = cpVar;
                return;
            case 25:
                cpVar = new cb(context);
                f35988a = cpVar;
                return;
            default:
                return;
        }
    }

    private static boolean a() {
        String strC = fz.d.c(ba.a("021=flfmfnhhfifk^iHfefnghfl@hhVfhBhNfn%ifKhh]hi"));
        return !TextUtils.isEmpty(strC) && strC.equalsIgnoreCase(ba.a("008Jieilikikjeikijgn"));
    }

    public static String b(Context context) {
        cg clVar;
        a(context);
        cg cgVar = f35988a;
        if (cgVar == null) {
            return null;
        }
        if (!(cgVar instanceof ce)) {
            if (cgVar instanceof ck) {
                String strD = cgVar.d();
                if (!TextUtils.isEmpty(strD) && !Pattern.compile("^[0fF\\-]+").matcher(strD).matches()) {
                    return strD;
                }
                clVar = new cl(context);
            }
            return f35988a.d();
        }
        String strD2 = cgVar.d();
        if (!TextUtils.isEmpty(strD2) && !Pattern.compile("^[0fF\\-]+").matcher(strD2).matches()) {
            return strD2;
        }
        clVar = new cf(context);
        f35988a = clVar;
        return f35988a.d();
    }

    private static boolean b() {
        String strC = fz.d.c(ba.a("015,flfmfnhkhkfifkfn'lCflfmfefi4ek"));
        return (TextUtils.isEmpty(strC) || strC.equalsIgnoreCase(ba.a("007Nfi?g[gj5gGfmhi;g"))) ? false : true;
    }

    private static boolean c() {
        return "PRIZE".equalsIgnoreCase(fz.d.c("ro.odm.manufacturer"));
    }

    private static boolean c(Context context) {
        try {
            final Object[] objArr = new Object[1];
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            fz.a(context).c(ba.a("027e+fmfhfn!e!fmfmNilfDfefnfeWhPfffkQeh3fkfehkfi^llBfmflUk"), 0).a(new fz.a() { // from class: cn.fly.verify.cd.1
                @Override // cn.fly.verify.fz.a
                public void a(fz.b bVar) throws Throwable {
                    objArr[0] = bVar.k(new int[0]);
                    countDownLatch.countDown();
                }
            });
            countDownLatch.await(3L, TimeUnit.SECONDS);
            return objArr[0] != null;
        } catch (Throwable th2) {
            es.a().a(th2);
            return false;
        }
    }
}
