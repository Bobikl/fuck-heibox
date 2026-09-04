package kotlin.io;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: FilePathComponents.kt */
/* JADX INFO: loaded from: classes5.dex */
public class j {
    @dl.d
    public static final File a(@dl.d File file) {
        f0.p(file, "<this>");
        return new File(c(file));
    }

    private static final int b(String str) {
        int iR3;
        int iR4 = StringsKt__StringsKt.r3(str, File.separatorChar, 0, false, 4, null);
        if (iR4 != 0) {
            if (iR4 > 0 && str.charAt(iR4 - 1) == ':') {
                return iR4 + 1;
            }
            if (iR4 == -1 && StringsKt__StringsKt.b3(str, ':', false, 2, null)) {
                return str.length();
            }
            return 0;
        }
        if (str.length() > 1) {
            char cCharAt = str.charAt(1);
            char c10 = File.separatorChar;
            if (cCharAt == c10 && (iR3 = StringsKt__StringsKt.r3(str, c10, 2, false, 4, null)) >= 0) {
                int iR5 = StringsKt__StringsKt.r3(str, File.separatorChar, iR3 + 1, false, 4, null);
                return iR5 >= 0 ? iR5 + 1 : str.length();
            }
        }
        return 1;
    }

    @dl.d
    public static final String c(@dl.d File file) {
        f0.p(file, "<this>");
        String path = file.getPath();
        f0.o(path, "path");
        String path2 = file.getPath();
        f0.o(path2, "path");
        String strSubstring = path.substring(0, b(path2));
        f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final boolean d(@dl.d File file) {
        f0.p(file, "<this>");
        String path = file.getPath();
        f0.o(path, "path");
        return b(path) > 0;
    }

    @dl.d
    public static final File e(@dl.d File file, int i10, int i11) {
        f0.p(file, "<this>");
        return f(file).j(i10, i11);
    }

    @dl.d
    public static final g f(@dl.d File file) {
        List listE;
        f0.p(file, "<this>");
        String path = file.getPath();
        f0.o(path, "path");
        int iB = b(path);
        String strSubstring = path.substring(0, iB);
        f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        String strSubstring2 = path.substring(iB);
        f0.o(strSubstring2, "this as java.lang.String).substring(startIndex)");
        if (strSubstring2.length() == 0) {
            listE = CollectionsKt__CollectionsKt.E();
        } else {
            List listT4 = StringsKt__StringsKt.T4(strSubstring2, new char[]{File.separatorChar}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(t.Y(listT4, 10));
            Iterator it = listT4.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            listE = arrayList;
        }
        return new g(new File(strSubstring), listE);
    }
}
