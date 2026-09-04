package com.max.hbcommon.utils;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: compiled from: NumRangeInputFilter.java */
/* JADX INFO: loaded from: classes9.dex */
public class j implements InputFilter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f68243b = "([0-9]|\\.)*";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f68244c = 2;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f68245d = ".";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f68246e = "00";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f68247a;

    public j(long j10) {
        this.f68247a = j10;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        Object[] objArr = {charSequence, new Integer(i10), new Integer(i11), spanned, new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.V0, new Class[]{CharSequence.class, cls, cls, Spanned.class, cls, cls}, CharSequence.class);
        if (patchProxyResultProxy.isSupported) {
            return (CharSequence) patchProxyResultProxy.result;
        }
        String string = charSequence.toString();
        String string2 = spanned.toString();
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        String str = string2.substring(0, i12) + string.substring(i10, i11) + string2.substring(i13, spanned.length());
        Log.v("temp", Constants.ACCEPT_TIME_SEPARATOR_SERVER + str);
        if (!str.matches(f68243b)) {
            Log.d("TAG", "!纯数字加小数点");
            return spanned.subSequence(i12, i13);
        }
        if (str.contains(f68245d)) {
            if (str.startsWith(f68245d)) {
                Log.d("TAG", "第一位就是小数点");
                return spanned.subSequence(i12, i13);
            }
            if (str.indexOf(f68245d) != str.lastIndexOf(f68245d)) {
                Log.d("TAG", "不止一个小数点");
                return spanned.subSequence(i12, i13);
            }
        }
        if (Double.parseDouble(str) > this.f68247a) {
            Log.d("TAG", "超出最大值");
            return spanned.subSequence(i12, i13);
        }
        if (str.contains(f68245d)) {
            if (!str.endsWith(f68245d) && str.split("\\.")[1].length() > 2) {
                Log.d("TAG", "保证小数点后只能输入两位");
                return spanned.subSequence(i12, i13);
            }
        } else if (str.startsWith(f68245d) || str.startsWith("00")) {
            Log.d("TAG", "首位只能有一个0");
            return spanned.subSequence(i12, i13);
        }
        Log.d("TAG", "正常情况");
        return charSequence;
    }
}
