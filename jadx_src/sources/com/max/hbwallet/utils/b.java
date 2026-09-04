package com.max.hbwallet.utils;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: CurrencyInputFilter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f74256a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f74257b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final String f74258c = ".";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final String f74259d = "0";

    /* JADX INFO: compiled from: CurrencyInputFilter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    @Override // android.text.InputFilter
    @dl.d
    public CharSequence filter(@dl.d CharSequence source, int i10, int i11, @dl.d Spanned dest, int i12, int i13) {
        int iS3;
        Object[] objArr = {source, new Integer(i10), new Integer(i11), dest, new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.l.L5, new Class[]{CharSequence.class, cls, cls, Spanned.class, cls, cls}, CharSequence.class);
        if (patchProxyResultProxy.isSupported) {
            return (CharSequence) patchProxyResultProxy.result;
        }
        f0.p(source, "source");
        f0.p(dest, "dest");
        Log.d("CurrencyInputFilter", "source: " + ((Object) source) + "  start: " + i10 + "  end: " + i11 + "  dest: " + ((Object) dest) + "  dstart: " + i12 + "  dend: " + i13);
        String string = source.toString();
        String string2 = dest.toString();
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        if (i12 == 0 && (TextUtils.equals("0", string) || TextUtils.equals(string, f74258c))) {
            string = (StringsKt__StringsKt.W2(string2, f74258c, false, 2, null) || string2.length() > 2) ? "" : "0.";
        }
        if (i12 == 0 && TextUtils.equals("0", source.toString()) && dest.toString().length() == 0) {
            string = "0";
        }
        if (StringsKt__StringsKt.W2(string2, f74258c, false, 2, null) || !TextUtils.equals(f74258c, string) ? !(!StringsKt__StringsKt.W2(string2, f74258c, false, 2, null) || i12 <= (iS3 = StringsKt__StringsKt.s3(string2, f74258c, 0, false, 6, null)) || string2.length() - iS3 < 3) : string2.length() - i12 > 2) {
            string = "";
        }
        String str = ((Object) dest.subSequence(i12, i13)) + string;
        Log.d("CurrencyInputFilter", "result: " + str);
        return str;
    }
}
