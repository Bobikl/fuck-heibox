package com.huawei.hms.scankit.p;

import anet.channel.util.HttpConstant;
import com.huawei.hms.ml.scan.HmsScan;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: HTTPResultParser.java */
/* JADX INFO: loaded from: classes7.dex */
public final class t3 extends t6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f62374b = Pattern.compile("(?:http:|http//|https://)([\\s\\S]+)", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f62375c = Pattern.compile("(?:http:/?(?!/)|http//)([\\s\\S]+)", 2);

    @Override // com.huawei.hms.scankit.p.t6
    public HmsScan b(s6 s6Var) {
        String strA = t6.a(s6Var);
        if (!f62374b.matcher(strA).matches()) {
            return null;
        }
        Matcher matcher = f62375c.matcher(strA);
        if (matcher.matches()) {
            strA = strA.substring(0, 4) + HttpConstant.SCHEME_SPLIT + matcher.group(1);
        }
        String strA2 = t6.a(strA);
        if (strA2.length() == 7) {
            return null;
        }
        return new HmsScan(s6Var.k(), t6.a(s6Var.c()), strA2, HmsScan.URL_FORM, s6Var.i(), t6.a(s6Var.j()), null, new z6(new HmsScan.LinkUrl("", strA2)));
    }
}
