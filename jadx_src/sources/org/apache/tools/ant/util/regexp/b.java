package org.apache.tools.ant.util.regexp;

import com.tencent.qcloud.core.util.IOUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.y;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Jdk14RegexpRegexp.java */
/* JADX INFO: loaded from: classes5.dex */
public class b extends a implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f136903h = 10;

    @Override // org.apache.tools.ant.util.regexp.c
    public String a(String str, String str2, int i10) throws BuildException {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (i11 < str2.length()) {
            char cCharAt = str2.charAt(i11);
            if (cCharAt == '$') {
                sb2.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                sb2.append(y.f128594c);
            } else if (cCharAt == '\\') {
                i11++;
                if (i11 < str2.length()) {
                    char cCharAt2 = str2.charAt(i11);
                    int iDigit = Character.digit(cCharAt2, 10);
                    if (iDigit > -1) {
                        sb2.append(y.f128594c);
                        sb2.append(iDigit);
                    } else {
                        sb2.append(cCharAt2);
                    }
                } else {
                    sb2.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                }
            } else {
                sb2.append(cCharAt);
            }
            i11++;
        }
        int iJ = j(i10);
        Pattern patternH = h(i10);
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = patternH.matcher(str);
        if (g.d(iJ, 16)) {
            stringBuffer.append(matcher.replaceAll(sb2.toString()));
        } else if (matcher.find()) {
            matcher.appendReplacement(stringBuffer, sb2.toString());
            matcher.appendTail(stringBuffer);
        } else {
            stringBuffer.append(str);
        }
        return stringBuffer.toString();
    }

    protected int j(int i10) {
        return g.d(i10, 16) ? 16 : 1;
    }
}
