package androidx.core.text.util;

import androidx.annotation.RestrictTo;
import androidx.annotation.j1;
import java.util.Locale;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: FindAddress.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f21176a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f21177b = 14;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f21178c = 5;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f21179d = 25;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f21180e = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f21182g = "\n\u000b\f\r\u0085\u2028\u2029";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f21183h = "\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f21184i = "\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f21185j = ",*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f21186k = "(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f21188m = ",\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f21189n = "(?=[,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f21190o = ":,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f21191p = "(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C0143a[] f21181f = {new C0143a(99, 99, -1, -1), new C0143a(35, 36, -1, -1), new C0143a(71, 72, -1, -1), new C0143a(96, 96, -1, -1), new C0143a(85, 86, -1, -1), new C0143a(90, 96, -1, -1), new C0143a(80, 81, -1, -1), new C0143a(6, 6, -1, -1), new C0143a(20, 20, -1, -1), new C0143a(19, 19, -1, -1), new C0143a(32, 34, -1, -1), new C0143a(96, 96, -1, -1), new C0143a(30, 31, -1, -1), new C0143a(96, 96, -1, -1), new C0143a(96, 96, -1, -1), new C0143a(50, 52, -1, -1), new C0143a(83, 83, -1, -1), new C0143a(60, 62, -1, -1), new C0143a(46, 47, -1, -1), new C0143a(66, 67, 73, -1), new C0143a(40, 42, -1, -1), new C0143a(70, 71, -1, -1), new C0143a(1, 2, -1, -1), new C0143a(20, 21, -1, -1), new C0143a(3, 4, -1, -1), new C0143a(96, 96, -1, -1), new C0143a(48, 49, -1, -1), new C0143a(55, 56, -1, -1), new C0143a(63, 65, -1, -1), new C0143a(96, 96, -1, -1), new C0143a(38, 39, -1, -1), new C0143a(55, 56, -1, -1), new C0143a(27, 28, -1, -1), new C0143a(58, 58, -1, -1), new C0143a(68, 69, -1, -1), new C0143a(3, 4, -1, -1), new C0143a(7, 8, -1, -1), new C0143a(87, 88, 86, -1), new C0143a(88, 89, 96, -1), new C0143a(10, 14, 0, 6), new C0143a(43, 45, -1, -1), new C0143a(73, 74, -1, -1), new C0143a(97, 97, -1, -1), new C0143a(15, 19, -1, -1), new C0143a(6, 6, 0, 9), new C0143a(96, 96, -1, -1), new C0143a(2, 2, -1, -1), new C0143a(29, 29, -1, -1), new C0143a(57, 57, -1, -1), new C0143a(37, 38, -1, -1), new C0143a(75, 79, 87, 88), new C0143a(84, 84, -1, -1), new C0143a(22, 24, 20, -1), new C0143a(6, 9, -1, -1), new C0143a(5, 5, -1, -1), new C0143a(98, 99, -1, -1), new C0143a(53, 54, -1, -1), new C0143a(24, 26, -1, -1), new C0143a(82, 83, -1, -1)};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f21187l = Pattern.compile("[^,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]+(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Pattern f21192q = Pattern.compile("(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)(?:-(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?))*(?=[,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Pattern f21193r = Pattern.compile("(?:(ak|alaska)|(al|alabama)|(ar|arkansas)|(as|american[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+samoa)|(az|arizona)|(ca|california)|(co|colorado)|(ct|connecticut)|(dc|district[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+columbia)|(de|delaware)|(fl|florida)|(fm|federated[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+states[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+micronesia)|(ga|georgia)|(gu|guam)|(hi|hawaii)|(ia|iowa)|(id|idaho)|(il|illinois)|(in|indiana)|(ks|kansas)|(ky|kentucky)|(la|louisiana)|(ma|massachusetts)|(md|maryland)|(me|maine)|(mh|marshall[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(mi|michigan)|(mn|minnesota)|(mo|missouri)|(mp|northern[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+mariana[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(ms|mississippi)|(mt|montana)|(nc|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+carolina)|(nd|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+dakota)|(ne|nebraska)|(nh|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+hampshire)|(nj|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+jersey)|(nm|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+mexico)|(nv|nevada)|(ny|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+york)|(oh|ohio)|(ok|oklahoma)|(or|oregon)|(pa|pennsylvania)|(pr|puerto[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+rico)|(pw|palau)|(ri|rhode[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+island)|(sc|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+carolina)|(sd|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+dakota)|(tn|tennessee)|(tx|texas)|(ut|utah)|(va|virginia)|(vi|virgin[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(vt|vermont)|(wa|washington)|(wi|wisconsin)|(wv|west[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+virginia)|(wy|wyoming))(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Pattern f21194s = Pattern.compile("(?:alley|annex|arcade|ave[.]?|avenue|alameda|bayou|beach|bend|bluffs?|bottom|boulevard|branch|bridge|brooks?|burgs?|bypass|broadway|camino|camp|canyon|cape|causeway|centers?|circles?|cliffs?|club|common|corners?|course|courts?|coves?|creek|crescent|crest|crossing|crossroad|curve|circulo|dale|dam|divide|drives?|estates?|expressway|extensions?|falls?|ferry|fields?|flats?|fords?|forest|forges?|forks?|fort|freeway|gardens?|gateway|glens?|greens?|groves?|harbors?|haven|heights|highway|hills?|hollow|inlet|islands?|isle|junctions?|keys?|knolls?|lakes?|land|landing|lane|lights?|loaf|locks?|lodge|loop|mall|manors?|meadows?|mews|mills?|mission|motorway|mount|mountains?|neck|orchard|oval|overpass|parks?|parkways?|pass|passage|path|pike|pines?|plains?|plaza|points?|ports?|prairie|privada|radial|ramp|ranch|rapids?|rd[.]?|rest|ridges?|river|roads?|route|row|rue|run|shoals?|shores?|skyway|springs?|spurs?|squares?|station|stravenue|stream|st[.]?|streets?|summit|speedway|terrace|throughway|trace|track|trafficway|trail|tunnel|turnpike|underpass|unions?|valleys?|viaduct|views?|villages?|ville|vista|walks?|wall|ways?|wells?|xing|xrd)(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Pattern f21195t = Pattern.compile("([0-9]+)(st|nd|rd|th)", 2);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Pattern f21196u = Pattern.compile("(?:[0-9]{5}(?:-[0-9]{4})?)(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* JADX INFO: renamed from: androidx.core.text.util.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FindAddress.java */
    public static class C0143a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f21198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f21199c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f21200d;

        C0143a(int i10, int i11, int i12, int i13) {
            this.f21197a = i10;
            this.f21198b = i11;
            this.f21199c = i12;
            this.f21200d = i13;
        }

        boolean a(String str) {
            int i10 = Integer.parseInt(str.substring(0, 2));
            return (this.f21197a <= i10 && i10 <= this.f21198b) || i10 == this.f21199c || i10 == this.f21200d;
        }
    }

    private a() {
    }

    private static int a(String str, MatchResult matchResult) {
        int length;
        MatchResult matchResultI;
        int iEnd = matchResult.end();
        Matcher matcher = f21187l.matcher(str);
        String strGroup = "";
        int i10 = -1;
        int iEnd2 = -1;
        boolean z10 = false;
        int i11 = 1;
        int i12 = 1;
        boolean z11 = true;
        while (iEnd < str.length()) {
            if (!matcher.find(iEnd)) {
                length = str.length();
            } else if (matcher.end() - matcher.start() <= 25) {
                while (iEnd < matcher.start()) {
                    int i13 = iEnd + 1;
                    if (f21182g.indexOf(str.charAt(iEnd)) != -1) {
                        i11++;
                    }
                    iEnd = i13;
                }
                if (i11 > 5 || (i12 = i12 + 1) > 14) {
                    break;
                }
                if (h(str, iEnd) == null) {
                    if (!d(matcher.group(0))) {
                        if (i12 == 5 && !z10) {
                            iEnd = matcher.end();
                            break;
                        }
                        if (z10 && i12 > 4 && (matchResultI = i(str, iEnd)) != null) {
                            if (strGroup.equals("et") && matchResultI.group(0).equals("al")) {
                                iEnd = matchResultI.end();
                                break;
                            }
                            Matcher matcher2 = f21187l.matcher(str);
                            if (!matcher2.find(matchResultI.end())) {
                                iEnd2 = matchResultI.end();
                            } else if (g(matcher2.group(0), matchResultI)) {
                                return matcher2.end();
                            }
                        }
                        z11 = false;
                    } else {
                        z11 = false;
                        z10 = true;
                    }
                } else {
                    if (z11 && i11 > 1) {
                        return -iEnd;
                    }
                    if (i10 == -1) {
                        i10 = iEnd;
                    }
                }
                strGroup = matcher.group(0);
                iEnd = matcher.end();
            } else {
                length = matcher.end();
            }
            return -length;
        }
        if (iEnd2 > 0) {
            return iEnd2;
        }
        if (i10 <= 0) {
            i10 = iEnd;
        }
        return -i10;
    }

    private static boolean b(String str) {
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (Character.isDigit(str.charAt(i11))) {
                i10++;
            }
        }
        if (i10 > 5) {
            return false;
        }
        Matcher matcher = f21195t.matcher(str);
        if (!matcher.find()) {
            return true;
        }
        int i12 = Integer.parseInt(matcher.group(1));
        if (i12 == 0) {
            return false;
        }
        String lowerCase = matcher.group(2).toLowerCase(Locale.getDefault());
        int i13 = i12 % 10;
        if (i13 == 1) {
            return lowerCase.equals(i12 % 100 != 11 ? "st" : "th");
        }
        if (i13 == 2) {
            return lowerCase.equals(i12 % 100 != 12 ? "nd" : "th");
        }
        if (i13 != 3) {
            return lowerCase.equals("th");
        }
        return lowerCase.equals(i12 % 100 != 13 ? "rd" : "th");
    }

    static String c(String str) {
        Matcher matcher = f21192q.matcher(str);
        int iEnd = 0;
        while (matcher.find(iEnd)) {
            if (b(matcher.group(0))) {
                int iStart = matcher.start();
                int iA = a(str, matcher);
                if (iA > 0) {
                    return str.substring(iStart, iA);
                }
                iEnd = -iA;
            } else {
                iEnd = matcher.end();
            }
        }
        return null;
    }

    @j1
    public static boolean d(String str) {
        return f21194s.matcher(str).matches();
    }

    @j1
    public static boolean e(String str) {
        return f21196u.matcher(str).matches();
    }

    @j1
    public static boolean f(String str, String str2) {
        return g(str, i(str2, 0));
    }

    private static boolean g(String str, MatchResult matchResult) {
        if (matchResult == null) {
            return false;
        }
        int iGroupCount = matchResult.groupCount();
        while (iGroupCount > 0) {
            int i10 = iGroupCount - 1;
            if (matchResult.group(iGroupCount) != null) {
                iGroupCount = i10;
                break;
            }
            iGroupCount = i10;
        }
        return f21196u.matcher(str).matches() && f21181f[iGroupCount].a(str);
    }

    @j1
    public static MatchResult h(String str, int i10) {
        if (i10 > 0 && f21190o.indexOf(str.charAt(i10 - 1)) == -1) {
            return null;
        }
        Matcher matcherRegion = f21192q.matcher(str).region(i10, str.length());
        if (matcherRegion.lookingAt()) {
            MatchResult matchResult = matcherRegion.toMatchResult();
            if (b(matchResult.group(0))) {
                return matchResult;
            }
        }
        return null;
    }

    @j1
    public static MatchResult i(String str, int i10) {
        if (i10 > 0 && f21185j.indexOf(str.charAt(i10 - 1)) == -1) {
            return null;
        }
        Matcher matcherRegion = f21193r.matcher(str).region(i10, str.length());
        if (matcherRegion.lookingAt()) {
            return matcherRegion.toMatchResult();
        }
        return null;
    }
}
