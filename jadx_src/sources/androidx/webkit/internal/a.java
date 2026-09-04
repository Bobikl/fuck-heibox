package androidx.webkit.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: AssetHelper.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f28356b = "AssetHelper";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f28357c = "text/plain";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private Context f28358a;

    public a(@n0 Context context) {
        this.f28358a = context;
    }

    @n0
    public static String a(@n0 File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        if (canonicalPath.endsWith("/")) {
            return canonicalPath;
        }
        return canonicalPath + "/";
    }

    @p0
    public static File b(@n0 File file, @n0 String str) throws IOException {
        String strA = a(file);
        String canonicalPath = new File(file, str).getCanonicalPath();
        if (canonicalPath.startsWith(strA)) {
            return new File(canonicalPath);
        }
        return null;
    }

    @n0
    public static File c(@n0 Context context) {
        return Build.VERSION.SDK_INT >= 24 ? context.getDataDir() : context.getCacheDir().getParentFile();
    }

    private int d(@n0 String str, @n0 String str2) {
        return this.f28358a.getResources().getIdentifier(str2, str, this.f28358a.getPackageName());
    }

    private int e(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f28358a.getResources().getValue(i10, typedValue, true);
        return typedValue.type;
    }

    @n0
    public static String f(@n0 String str) {
        String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
        return strGuessContentTypeFromName == null ? "text/plain" : strGuessContentTypeFromName;
    }

    @n0
    private static InputStream g(@n0 String str, @n0 InputStream inputStream) throws IOException {
        return str.endsWith(".svgz") ? new GZIPInputStream(inputStream) : inputStream;
    }

    @n0
    public static InputStream i(@n0 File file) throws IOException {
        return g(file.getPath(), new FileInputStream(file));
    }

    @n0
    private static String k(@n0 String str) {
        return (str.length() <= 1 || str.charAt(0) != '/') ? str : str.substring(1);
    }

    @n0
    public InputStream h(@n0 String str) throws IOException {
        String strK = k(str);
        return g(strK, this.f28358a.getAssets().open(strK, 2));
    }

    @n0
    public InputStream j(@n0 String str) throws Resources.NotFoundException, IOException {
        String strK = k(str);
        String[] strArrSplit = strK.split("/", -1);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Incorrect resource path: " + strK);
        }
        String str2 = strArrSplit[0];
        String strSubstring = strArrSplit[1];
        int iLastIndexOf = strSubstring.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            strSubstring = strSubstring.substring(0, iLastIndexOf);
        }
        int iD = d(str2, strSubstring);
        int iE = e(iD);
        if (iE == 3) {
            return g(strK, this.f28358a.getResources().openRawResource(iD));
        }
        throw new IOException(String.format("Expected %s resource to be of TYPE_STRING but was %d", strK, Integer.valueOf(iE)));
    }
}
