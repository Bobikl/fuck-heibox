package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.annotation.j1;
import androidx.annotation.l1;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.cos.xml.common.COSRequestHeaderKey;
import com.tencent.qcloud.core.util.IOUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class FileProvider extends ContentProvider {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f20414e = "android.support.FILE_PROVIDER_PATHS";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f20415f = "root-path";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f20416g = "files-path";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f20417h = "cache-path";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f20418i = "external-path";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f20419j = "external-files-path";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f20420k = "external-cache-path";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f20421l = "external-media-path";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f20422m = "name";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f20423n = "path";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f20424o = "displayName";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f20427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f20413d = {"_display_name", "_size"};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final File f20425p = new File("/");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.b0("sCache")
    private static final HashMap<String, b> f20426q = new HashMap<>();

    @androidx.annotation.w0(21)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static File[] a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    public interface b {
        Uri a(File file);

        File b(Uri uri);
    }

    public static class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f20429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HashMap<String, File> f20430b = new HashMap<>();

        c(String str) {
            this.f20429a = str;
        }

        @Override // androidx.core.content.FileProvider.b
        public Uri a(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.f20430b.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
                }
                String path2 = entry.getValue().getPath();
                return new Uri.Builder().scheme("content").authority(this.f20429a).encodedPath(Uri.encode(entry.getKey()) + IOUtils.DIR_SEPARATOR_UNIX + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        @Override // androidx.core.content.FileProvider.b
        public File b(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int iIndexOf = encodedPath.indexOf(47, 1);
            String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
            String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
            File file = this.f20430b.get(strDecode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, strDecode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        void c(String str, File file) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.f20430b.put(str, file.getCanonicalFile());
            } catch (IOException e10) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e10);
            }
        }
    }

    public FileProvider() {
        this.f20428c = 0;
    }

    protected FileProvider(@l1 int i10) {
        this.f20428c = i10;
    }

    private static File a(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    private static Object[] b(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[i10];
        System.arraycopy(objArr, 0, objArr2, 0, i10);
        return objArr2;
    }

    private static String[] c(String[] strArr, int i10) {
        String[] strArr2 = new String[i10];
        System.arraycopy(strArr, 0, strArr2, 0, i10);
        return strArr2;
    }

    @j1
    static XmlResourceParser d(Context context, String str, @androidx.annotation.p0 ProviderInfo providerInfo, int i10) {
        if (providerInfo == null) {
            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
        }
        if (providerInfo.metaData == null && i10 != 0) {
            Bundle bundle = new Bundle(1);
            providerInfo.metaData = bundle;
            bundle.putInt(f20414e, i10);
        }
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), f20414e);
        if (xmlResourceParserLoadXmlMetaData != null) {
            return xmlResourceParserLoadXmlMetaData;
        }
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }

    private static b e(Context context, String str, int i10) {
        b bVarI;
        HashMap<String, b> map = f20426q;
        synchronized (map) {
            bVarI = map.get(str);
            if (bVarI == null) {
                try {
                    try {
                        bVarI = i(context, str, i10);
                        map.put(str, bVarI);
                    } catch (XmlPullParserException e10) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e10);
                    }
                } catch (IOException e11) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e11);
                }
            }
        }
        return bVarI;
    }

    public static Uri f(@androidx.annotation.n0 Context context, @androidx.annotation.n0 String str, @androidx.annotation.n0 File file) {
        return e(context, str, 0).a(file);
    }

    @androidx.annotation.n0
    @SuppressLint({"StreamFiles"})
    public static Uri g(@androidx.annotation.n0 Context context, @androidx.annotation.n0 String str, @androidx.annotation.n0 File file, @androidx.annotation.n0 String str2) {
        return f(context, str, file).buildUpon().appendQueryParameter(f20424o, str2).build();
    }

    private static int h(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if (RXScreenCaptureService.KEY_WIDTH.equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    private static b i(Context context, String str, int i10) throws XmlPullParserException, IOException {
        c cVar = new c(str);
        XmlResourceParser xmlResourceParserD = d(context, str, context.getPackageManager().resolveContentProvider(str, 128), i10);
        while (true) {
            int next = xmlResourceParserD.next();
            if (next == 1) {
                return cVar;
            }
            if (next == 2) {
                String name = xmlResourceParserD.getName();
                File externalStorageDirectory = null;
                String attributeValue = xmlResourceParserD.getAttributeValue(null, "name");
                String attributeValue2 = xmlResourceParserD.getAttributeValue(null, "path");
                if (f20415f.equals(name)) {
                    externalStorageDirectory = f20425p;
                } else if (f20416g.equals(name)) {
                    externalStorageDirectory = context.getFilesDir();
                } else if (f20417h.equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if (f20418i.equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                } else if (f20419j.equals(name)) {
                    File[] fileArrK = d.k(context, null);
                    if (fileArrK.length > 0) {
                        externalStorageDirectory = fileArrK[0];
                    }
                } else if (f20420k.equals(name)) {
                    File[] fileArrJ = d.j(context);
                    if (fileArrJ.length > 0) {
                        externalStorageDirectory = fileArrJ[0];
                    }
                } else if (f20421l.equals(name)) {
                    File[] fileArrA = a.a(context);
                    if (fileArrA.length > 0) {
                        externalStorageDirectory = fileArrA[0];
                    }
                }
                if (externalStorageDirectory != null) {
                    cVar.c(attributeValue, a(externalStorageDirectory, attributeValue2));
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(@androidx.annotation.n0 Context context, @androidx.annotation.n0 ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        HashMap<String, b> map = f20426q;
        synchronized (map) {
            map.remove(str);
        }
        this.f20427b = e(context, str, this.f20428c);
    }

    @Override // android.content.ContentProvider
    public int delete(@androidx.annotation.n0 Uri uri, @androidx.annotation.p0 String str, @androidx.annotation.p0 String[] strArr) {
        return this.f20427b.b(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    @androidx.annotation.p0
    public String getType(@androidx.annotation.n0 Uri uri) {
        File fileB = this.f20427b.b(uri);
        int iLastIndexOf = fileB.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return COSRequestHeaderKey.APPLICATION_OCTET_STREAM;
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileB.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : COSRequestHeaderKey.APPLICATION_OCTET_STREAM;
    }

    @Override // android.content.ContentProvider
    public Uri insert(@androidx.annotation.n0 Uri uri, @androidx.annotation.n0 ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(@androidx.annotation.n0 Uri uri, @androidx.annotation.n0 String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(this.f20427b.b(uri), h(str));
    }

    @Override // android.content.ContentProvider
    @androidx.annotation.n0
    public Cursor query(@androidx.annotation.n0 Uri uri, @androidx.annotation.p0 String[] strArr, @androidx.annotation.p0 String str, @androidx.annotation.p0 String[] strArr2, @androidx.annotation.p0 String str2) {
        int i10;
        File fileB = this.f20427b.b(uri);
        String queryParameter = uri.getQueryParameter(f20424o);
        if (strArr == null) {
            strArr = f20413d;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i11 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i11] = "_display_name";
                i10 = i11 + 1;
                objArr[i11] = queryParameter == null ? fileB.getName() : queryParameter;
            } else {
                if ("_size".equals(str3)) {
                    strArr3[i11] = "_size";
                    i10 = i11 + 1;
                    objArr[i11] = Long.valueOf(fileB.length());
                }
            }
            i11 = i10;
        }
        String[] strArrC = c(strArr3, i11);
        Object[] objArrB = b(objArr, i11);
        MatrixCursor matrixCursor = new MatrixCursor(strArrC, 1);
        matrixCursor.addRow(objArrB);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(@androidx.annotation.n0 Uri uri, @androidx.annotation.n0 ContentValues contentValues, @androidx.annotation.p0 String str, @androidx.annotation.p0 String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
