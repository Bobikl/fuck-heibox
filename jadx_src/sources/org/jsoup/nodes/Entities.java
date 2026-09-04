package org.jsoup.nodes;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.CharsetEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Properties;
import java.util.regex.Pattern;
import kotlin.text.y;

/* JADX INFO: loaded from: classes5.dex */
public class Entities {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Character> f137871a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, Character> f137873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<Character, String> f137874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map<Character, String> f137875e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object[][] f137878h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f137876f = Pattern.compile("&(#(x|X)?([0-9a-fA-F]+)|[a-zA-Z]+\\d*);?");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f137877g = Pattern.compile("&(#(x|X)?([0-9a-fA-F]+)|[a-zA-Z]+\\d*);");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Character, String> f137872b = new HashMap();

    public enum EscapeMode {
        xhtml(Entities.f137872b),
        base(Entities.f137874d),
        extended(Entities.f137875e);

        private Map<Character, String> map;

        EscapeMode(Map map) {
            this.map = map;
        }

        public Map<Character, String> getMap() {
            return this.map;
        }
    }

    static {
        Object[][] objArr = {new Object[]{"quot", 34}, new Object[]{"amp", 38}, new Object[]{"apos", 39}, new Object[]{"lt", 60}, new Object[]{"gt", 62}};
        f137878h = objArr;
        Map<String, Character> mapI = i("entities-base.properties");
        f137873c = mapI;
        f137874d = j(mapI);
        Map<String, Character> mapI2 = i("entities-full.properties");
        f137871a = mapI2;
        f137875e = j(mapI2);
        for (Object[] objArr2 : objArr) {
            f137872b.put(Character.valueOf((char) ((Integer) objArr2[1]).intValue()), (String) objArr2[0]);
        }
    }

    private Entities() {
    }

    static String d(String str, CharsetEncoder charsetEncoder, EscapeMode escapeMode) {
        StringBuilder sb2 = new StringBuilder(str.length() * 2);
        Map<Character, String> map = escapeMode.getMap();
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 65536) {
                char c10 = (char) iCodePointAt;
                if (map.containsKey(Character.valueOf(c10))) {
                    sb2.append(y.f128595d);
                    sb2.append(map.get(Character.valueOf(c10)));
                    sb2.append(';');
                } else if (charsetEncoder.canEncode(c10)) {
                    sb2.append(c10);
                } else {
                    sb2.append("&#x");
                    sb2.append(Integer.toHexString(iCodePointAt));
                    sb2.append(';');
                }
            } else {
                String str2 = new String(Character.toChars(iCodePointAt));
                if (charsetEncoder.canEncode(str2)) {
                    sb2.append(str2);
                } else {
                    sb2.append("&#x");
                    sb2.append(Integer.toHexString(iCodePointAt));
                    sb2.append(';');
                }
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return sb2.toString();
    }

    static String e(String str, Document.a aVar) {
        return d(str, aVar.e(), aVar.g());
    }

    public static Character f(String str) {
        return f137871a.get(str);
    }

    public static boolean g(String str) {
        return f137873c.containsKey(str);
    }

    public static boolean h(String str) {
        return f137871a.containsKey(str);
    }

    private static Map<String, Character> i(String str) {
        Properties properties = new Properties();
        HashMap map = new HashMap();
        try {
            InputStream resourceAsStream = Entities.class.getResourceAsStream(str);
            properties.load(resourceAsStream);
            resourceAsStream.close();
            for (Map.Entry entry : properties.entrySet()) {
                map.put((String) entry.getKey(), Character.valueOf((char) Integer.parseInt((String) entry.getValue(), 16)));
            }
            return map;
        } catch (IOException e10) {
            throw new MissingResourceException("Error loading entities resource: " + e10.getMessage(), "Entities", str);
        }
    }

    private static Map<Character, String> j(Map<String, Character> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Character> entry : map.entrySet()) {
            Character value = entry.getValue();
            String key = entry.getKey();
            if (!map2.containsKey(value)) {
                map2.put(value, key);
            } else if (key.toLowerCase().equals(key)) {
                map2.put(value, key);
            }
        }
        return map2;
    }

    static String k(String str) {
        return l(str, false);
    }

    static String l(String str, boolean z10) {
        return org.jsoup.parser.d.m(str, z10);
    }
}
