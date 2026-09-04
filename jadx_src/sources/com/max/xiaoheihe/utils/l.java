package com.max.xiaoheihe.utils;

import android.text.InputFilter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import com.max.xiaoheihe.accelworld.AccelWorldStringKt;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.Result;
import kotlin.t0;

/* JADX INFO: compiled from: HBInputLengthFilter.kt */
/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class l implements InputFilter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final a f95682b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f95683c = 0;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final String f95684d = "HBInputLengthFilter-dbg";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f95685a;

    /* JADX INFO: compiled from: HBInputLengthFilter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    public l(int i10) {
        this.f95685a = i10;
    }

    public final int a() {
        return this.f95685a;
    }

    @Override // android.text.InputFilter
    @dl.e
    public CharSequence filter(@dl.d CharSequence source, int i10, int i11, @dl.d Spanned dest, int i12, int i13) {
        String str;
        String str2;
        String str3;
        Object objB;
        String str4;
        int i14;
        String str5;
        Object obj;
        String str6 = f95684d;
        Object[] objArr = {source, new Integer(i10), new Integer(i11), dest, new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 48738, new Class[]{CharSequence.class, cls, cls, Spanned.class, cls, cls}, CharSequence.class);
        if (patchProxyResultProxy.isSupported) {
            return (CharSequence) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(source, "source");
        kotlin.jvm.internal.f0.p(dest, "dest");
        try {
            Result.a aVar = Result.f124476c;
            char[] cArr = new char[dest.length()];
            TextUtils.getChars(dest, 0, dest.length(), cArr, 0);
            String str7 = new String(cArr);
            int iC = AccelWorldStringKt.c(str7);
            char[] cArr2 = new char[i13 - i12];
            TextUtils.getChars(dest, i12, i13, cArr2, 0);
            String str8 = new String(cArr2);
            int iC2 = AccelWorldStringKt.c(str8);
            try {
                char[] cArr3 = new char[i11 - i10];
                TextUtils.getChars(source, i10, i11, cArr3, 0);
                String str9 = new String(cArr3);
                int iC3 = AccelWorldStringKt.c(str9);
                int i15 = this.f95685a - (iC - iC2);
                String str10 = "[filter]\nsource: " + ((Object) source) + ", start: " + i10 + ", end: " + i11 + ", dest: " + ((Object) dest) + ", dstart: " + i12 + ", dend: " + i13 + "\ndestStr: " + str7 + ", destStrLength: " + iC + "\nselectDestStr: " + str8 + ", destSelectStrLen: " + iC2 + "\nsourceStr: " + str9 + ", keep: " + i15;
                str6 = f95684d;
                Log.d(str6, str10);
                String str11 = "";
                if (i15 <= 0) {
                    str = str6;
                    str2 = ", start: ";
                    str3 = ", end: ";
                    obj = str11;
                } else if (i15 >= iC3) {
                    str = str6;
                    str2 = ", start: ";
                    str3 = ", end: ";
                    obj = null;
                } else {
                    int i16 = i15 + i10;
                    if (Character.isHighSurrogate(source.charAt(i15 - 1)) && (i16 = i16 - 1) == i10) {
                        str = str6;
                        str2 = ", start: ";
                        str3 = ", end: ";
                        obj = "";
                    } else {
                        String strSubstring = str9.substring(i10, i16);
                        int i17 = i16;
                        kotlin.jvm.internal.f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        String str12 = strSubstring;
                        while (true) {
                            try {
                                if (AccelWorldStringKt.c(str12) <= i15) {
                                    i14 = i17;
                                    str5 = str12;
                                    break;
                                }
                                int i18 = i17 - 1;
                                if (i10 >= i18) {
                                    i14 = i18;
                                    str5 = "";
                                    break;
                                }
                                String strSubstring2 = str9.substring(i10, i18);
                                kotlin.jvm.internal.f0.o(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                i17 = i18;
                                str12 = strSubstring2;
                            } catch (Throwable th2) {
                                th = th2;
                                str2 = ", start: ";
                                str3 = ", end: ";
                                str = str6;
                                Result.a aVar2 = Result.f124476c;
                                objB = Result.b(t0.a(th));
                            }
                        }
                        if (source instanceof Spanned) {
                            SpannableString spannableString = new SpannableString(str5);
                            str = str6;
                            str2 = ", start: ";
                            str3 = ", end: ";
                            try {
                                TextUtils.copySpansFrom((Spanned) source, i10, i14, null, spannableString, 0);
                                obj = spannableString;
                            } catch (Throwable th3) {
                                th = th3;
                                Result.a aVar3 = Result.f124476c;
                                objB = Result.b(t0.a(th));
                            }
                        } else {
                            str2 = ", start: ";
                            str3 = ", end: ";
                            str = str6;
                            obj = str5;
                        }
                    }
                }
                objB = Result.b(obj);
            } catch (Throwable th4) {
                th = th4;
                str2 = ", start: ";
                str3 = ", end: ";
                str = f95684d;
            }
        } catch (Throwable th5) {
            th = th5;
            str = str6;
            str2 = ", start: ";
            str3 = ", end: ";
        }
        if (Result.j(objB)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[filter] result: ");
            sb2.append(objB);
            sb2.append(", is sourceSpan: ");
            sb2.append(source instanceof Spanned);
            String string = sb2.toString();
            str4 = str;
            Log.d(str4, string);
        } else {
            str4 = str;
        }
        Throwable thE = Result.e(objB);
        if (thE != null) {
            com.max.heybox.hblog.g.f74531b.w("[HBInputLengthFilter-dbg][filter] onFailure\nsource: " + ((Object) source) + str2 + i10 + str3 + i11 + ", dest: " + ((Object) dest) + ", dstart: " + i12 + ", dend: " + i13, thE);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("[filter] fail, cause\n");
            sb3.append(kotlin.o.i(thE));
            Log.d(str4, sb3.toString());
        }
        return (CharSequence) (Result.i(objB) ? null : objB);
    }
}
