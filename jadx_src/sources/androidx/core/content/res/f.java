package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.u;
import androidx.annotation.w0;
import androidx.core.R;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: FontResourcesParserCompat.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f20562a = 400;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f20563b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f20564c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f20565d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f20566e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f20567f = 500;

    /* JADX INFO: compiled from: FontResourcesParserCompat.java */
    @w0(21)
    public static class a {
        private a() {
        }

        @u
        static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    /* JADX INFO: compiled from: FontResourcesParserCompat.java */
    public interface b {
    }

    /* JADX INFO: compiled from: FontResourcesParserCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* JADX INFO: compiled from: FontResourcesParserCompat.java */
    public static final class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @n0
        private final e[] f20568a;

        public d(@n0 e[] eVarArr) {
            this.f20568a = eVarArr;
        }

        @n0
        public e[] a() {
            return this.f20568a;
        }
    }

    /* JADX INFO: compiled from: FontResourcesParserCompat.java */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @n0
        private final String f20569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f20570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f20571c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f20572d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f20573e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f20574f;

        public e(@n0 String str, int i10, boolean z10, @p0 String str2, int i11, int i12) {
            this.f20569a = str;
            this.f20570b = i10;
            this.f20571c = z10;
            this.f20572d = str2;
            this.f20573e = i11;
            this.f20574f = i12;
        }

        @n0
        public String a() {
            return this.f20569a;
        }

        public int b() {
            return this.f20574f;
        }

        public int c() {
            return this.f20573e;
        }

        @p0
        public String d() {
            return this.f20572d;
        }

        public int e() {
            return this.f20570b;
        }

        public boolean f() {
            return this.f20571c;
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.res.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FontResourcesParserCompat.java */
    public static final class C0127f implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @n0
        private final androidx.core.provider.h f20575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f20576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f20577c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private final String f20578d;

        public C0127f(@n0 androidx.core.provider.h hVar, int i10, int i11) {
            this(hVar, i10, i11, null);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public C0127f(@n0 androidx.core.provider.h hVar, int i10, int i11, @p0 String str) {
            this.f20575a = hVar;
            this.f20577c = i10;
            this.f20576b = i11;
            this.f20578d = str;
        }

        public int a() {
            return this.f20577c;
        }

        @n0
        public androidx.core.provider.h b() {
            return this.f20575a;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @p0
        public String c() {
            return this.f20578d;
        }

        public int d() {
            return this.f20576b;
        }
    }

    private f() {
    }

    private static int a(TypedArray typedArray, int i10) {
        return a.a(typedArray, i10);
    }

    @p0
    public static b b(@n0 XmlPullParser xmlPullParser, @n0 Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @n0
    public static List<List<byte[]>> c(@n0 Resources resources, @androidx.annotation.e int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < typedArrayObtainTypedArray.length(); i11++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    @p0
    private static b d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    @p0
    private static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.f19828c);
        String string = typedArrayObtainAttributes.getString(R.styleable.FontFamily_fontProviderAuthority);
        String string2 = typedArrayObtainAttributes.getString(R.styleable.FontFamily_fontProviderPackage);
        String string3 = typedArrayObtainAttributes.getString(R.styleable.FontFamily_fontProviderQuery);
        int resourceId = typedArrayObtainAttributes.getResourceId(R.styleable.FontFamily_fontProviderCerts, 0);
        int integer = typedArrayObtainAttributes.getInteger(R.styleable.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(R.styleable.FontFamily_fontProviderFetchTimeout, 500);
        String string4 = typedArrayObtainAttributes.getString(R.styleable.FontFamily_fontProviderSystemFontFamily);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new C0127f(new androidx.core.provider.h(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals(UiKitSpanObj.TYPE_FONT)) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new d((e[]) arrayList.toArray(new e[0]));
    }

    private static e f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.f19829d);
        int i10 = R.styleable.FontFamilyFont_fontWeight;
        if (!typedArrayObtainAttributes.hasValue(i10)) {
            i10 = R.styleable.FontFamilyFont_android_fontWeight;
        }
        int i11 = typedArrayObtainAttributes.getInt(i10, 400);
        int i12 = R.styleable.FontFamilyFont_fontStyle;
        if (!typedArrayObtainAttributes.hasValue(i12)) {
            i12 = R.styleable.FontFamilyFont_android_fontStyle;
        }
        boolean z10 = 1 == typedArrayObtainAttributes.getInt(i12, 0);
        int i13 = R.styleable.FontFamilyFont_ttcIndex;
        if (!typedArrayObtainAttributes.hasValue(i13)) {
            i13 = R.styleable.FontFamilyFont_android_ttcIndex;
        }
        int i14 = R.styleable.FontFamilyFont_fontVariationSettings;
        if (!typedArrayObtainAttributes.hasValue(i14)) {
            i14 = R.styleable.FontFamilyFont_android_fontVariationSettings;
        }
        String string = typedArrayObtainAttributes.getString(i14);
        int i15 = typedArrayObtainAttributes.getInt(i13, 0);
        int i16 = R.styleable.FontFamilyFont_font;
        if (!typedArrayObtainAttributes.hasValue(i16)) {
            i16 = R.styleable.FontFamilyFont_android_font;
        }
        int resourceId = typedArrayObtainAttributes.getResourceId(i16, 0);
        String string2 = typedArrayObtainAttributes.getString(i16);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new e(string2, i11, z10, string, i15, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
