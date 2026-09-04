package com.huawei.hms.scankit.p;

import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.huawei.hms.ml.scan.HmsScan;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: URIResultParser.java */
/* JADX INFO: loaded from: classes7.dex */
public final class u7 extends t6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f62425b = Pattern.compile("(?:uri|url):([\\s\\S]*)", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f62426c = Pattern.compile("(?:http:/?(?!/)|http//)([\\s\\S]+)", 2);

    @Override // com.huawei.hms.scankit.p.t6
    public HmsScan b(s6 s6Var) {
        String strA = t6.a(s6Var);
        if (TextUtils.isEmpty(strA) || !f62425b.matcher(strA).matches()) {
            return null;
        }
        String strSubstring = strA.substring(4);
        Matcher matcher = f62426c.matcher(strSubstring);
        if (matcher.matches()) {
            strSubstring = strSubstring.substring(0, 4) + HttpConstant.SCHEME_SPLIT + matcher.group(1);
        }
        return new HmsScan(s6Var.k(), t6.a(s6Var.c()), t6.a(strSubstring), HmsScan.URL_FORM, s6Var.i(), t6.a(s6Var.j()), null, new z6(new HmsScan.LinkUrl("", "")));
    }
}
