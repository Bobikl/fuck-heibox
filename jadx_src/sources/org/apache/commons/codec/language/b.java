package org.apache.commons.codec.language;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Locale;

/* JADX INFO: compiled from: Caverphone1.java */
/* JADX INFO: loaded from: classes5.dex */
public class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f132917a = "111111";

    @Override // mj.g
    public String a(String str) {
        if (str == null || str.length() == 0) {
            return f132917a;
        }
        return (str.toLowerCase(Locale.ENGLISH).replaceAll("[^a-z]", "").replaceAll("^cough", "cou2f").replaceAll("^rough", "rou2f").replaceAll("^tough", "tou2f").replaceAll("^enough", "enou2f").replaceAll("^gn", "2n").replaceAll("mb$", "m2").replaceAll("cq", "2q").replaceAll(org.apache.tools.ant.taskdefs.optional.ccm.g.f134710p, "si").replaceAll("ce", "se").replaceAll("cy", "sy").replaceAll("tch", "2ch").replaceAll(ak.aF, "k").replaceAll("q", "k").replaceAll("x", "k").replaceAll("v", "f").replaceAll("dg", "2g").replaceAll("tio", "sio").replaceAll("tia", "sia").replaceAll("d", "t").replaceAll("ph", "fh").replaceAll("b", "p").replaceAll("sh", "s2").replaceAll(ak.aD, ak.aB).replaceAll("^[aeiou]", androidx.exifinterface.media.a.W4).replaceAll("[aeiou]", "3").replaceAll("3gh3", "3kh3").replaceAll("gh", "22").replaceAll("g", "k").replaceAll("s+", androidx.exifinterface.media.a.R4).replaceAll("t+", androidx.exifinterface.media.a.f23244d5).replaceAll("p+", "P").replaceAll("k+", "K").replaceAll("f+", "F").replaceAll("m+", "M").replaceAll("n+", "N").replaceAll("w3", "W3").replaceAll("wy", "Wy").replaceAll("wh3", "Wh3").replaceAll("why", "Why").replaceAll(RXScreenCaptureService.KEY_WIDTH, "2").replaceAll("^h", androidx.exifinterface.media.a.W4).replaceAll(RXScreenCaptureService.KEY_HEIGHT, "2").replaceAll("r3", "R3").replaceAll("ry", "Ry").replaceAll("r", "2").replaceAll("l3", "L3").replaceAll("ly", "Ly").replaceAll("l", "2").replaceAll("j", "y").replaceAll("y3", "Y3").replaceAll("y", "2").replaceAll("2", "").replaceAll("3", "") + f132917a).substring(0, 6);
    }
}
