package androidx.webkit;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebResourceResponse;
import androidx.annotation.j1;
import androidx.annotation.k1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: WebViewAssetLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public final class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f28451b = "WebViewAssetLoader";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f28452c = "appassets.androidplatform.net";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<e> f28453a;

    /* JADX INFO: compiled from: WebViewAssetLoader.java */
    public static final class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private androidx.webkit.internal.a f28454a;

        public a(@n0 Context context) {
            this.f28454a = new androidx.webkit.internal.a(context);
        }

        @j1
        a(@n0 androidx.webkit.internal.a aVar) {
            this.f28454a = aVar;
        }

        @Override // androidx.webkit.x.d
        @k1
        @p0
        public WebResourceResponse a(@n0 String str) {
            try {
                return new WebResourceResponse(androidx.webkit.internal.a.f(str), null, this.f28454a.h(str));
            } catch (IOException e10) {
                Log.e(x.f28451b, "Error opening asset path: " + str, e10);
                return new WebResourceResponse(null, null, null);
            }
        }
    }

    /* JADX INFO: compiled from: WebViewAssetLoader.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f28455a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f28456b = x.f28452c;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @n0
        private List<e> f28457c = new ArrayList();

        @n0
        public b a(@n0 String str, @n0 d dVar) {
            this.f28457c.add(new e(this.f28456b, str, this.f28455a, dVar));
            return this;
        }

        @n0
        public x b() {
            return new x(this.f28457c);
        }

        @n0
        public b c(@n0 String str) {
            this.f28456b = str;
            return this;
        }

        @n0
        public b d(boolean z10) {
            this.f28455a = z10;
            return this;
        }
    }

    /* JADX INFO: compiled from: WebViewAssetLoader.java */
    public static final class c implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String[] f28458b = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @n0
        private final File f28459a;

        public c(@n0 Context context, @n0 File file) {
            try {
                this.f28459a = new File(androidx.webkit.internal.a.a(file));
                if (b(context)) {
                    return;
                }
                throw new IllegalArgumentException("The given directory \"" + file + "\" doesn't exist under an allowed app internal storage directory");
            } catch (IOException e10) {
                throw new IllegalArgumentException("Failed to resolve the canonical path for the given directory: " + file.getPath(), e10);
            }
        }

        private boolean b(@n0 Context context) throws IOException {
            String strA = androidx.webkit.internal.a.a(this.f28459a);
            String strA2 = androidx.webkit.internal.a.a(context.getCacheDir());
            String strA3 = androidx.webkit.internal.a.a(androidx.webkit.internal.a.c(context));
            if ((!strA.startsWith(strA2) && !strA.startsWith(strA3)) || strA.equals(strA2) || strA.equals(strA3)) {
                return false;
            }
            for (String str : f28458b) {
                if (strA.startsWith(strA3 + str)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.webkit.x.d
        @k1
        @n0
        public WebResourceResponse a(@n0 String str) {
            try {
                File fileB = androidx.webkit.internal.a.b(this.f28459a, str);
                if (fileB != null) {
                    return new WebResourceResponse(androidx.webkit.internal.a.f(str), null, androidx.webkit.internal.a.i(fileB));
                }
                Log.e(x.f28451b, String.format("The requested file: %s is outside the mounted directory: %s", str, this.f28459a));
                return new WebResourceResponse(null, null, null);
            } catch (IOException e10) {
                Log.e(x.f28451b, "Error opening the requested path: " + str, e10);
            }
        }
    }

    /* JADX INFO: compiled from: WebViewAssetLoader.java */
    public interface d {
        @k1
        @p0
        WebResourceResponse a(@n0 String str);
    }

    /* JADX INFO: compiled from: WebViewAssetLoader.java */
    @j1
    public static class e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final String f28460e = "http";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final String f28461f = "https";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f28462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @n0
        final String f28463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @n0
        final String f28464c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @n0
        final d f28465d;

        e(@n0 String str, @n0 String str2, boolean z10, @n0 d dVar) {
            if (str2.isEmpty() || str2.charAt(0) != '/') {
                throw new IllegalArgumentException("Path should start with a slash '/'.");
            }
            if (!str2.endsWith("/")) {
                throw new IllegalArgumentException("Path should end with a slash '/'");
            }
            this.f28463b = str;
            this.f28464c = str2;
            this.f28462a = z10;
            this.f28465d = dVar;
        }

        @k1
        @n0
        public String a(@n0 String str) {
            return str.replaceFirst(this.f28464c, "");
        }

        @k1
        @p0
        public d b(@n0 Uri uri) {
            if (uri.getScheme().equals("http") && !this.f28462a) {
                return null;
            }
            if ((uri.getScheme().equals("http") || uri.getScheme().equals("https")) && uri.getAuthority().equals(this.f28463b) && uri.getPath().startsWith(this.f28464c)) {
                return this.f28465d;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: WebViewAssetLoader.java */
    public static final class f implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private androidx.webkit.internal.a f28466a;

        public f(@n0 Context context) {
            this.f28466a = new androidx.webkit.internal.a(context);
        }

        @j1
        f(@n0 androidx.webkit.internal.a aVar) {
            this.f28466a = aVar;
        }

        @Override // androidx.webkit.x.d
        @k1
        @p0
        public WebResourceResponse a(@n0 String str) {
            try {
                return new WebResourceResponse(androidx.webkit.internal.a.f(str), null, this.f28466a.j(str));
            } catch (Resources.NotFoundException e10) {
                Log.e(x.f28451b, "Resource not found from the path: " + str, e10);
                return new WebResourceResponse(null, null, null);
            } catch (IOException e11) {
                Log.e(x.f28451b, "Error opening resource from the path: " + str, e11);
                return new WebResourceResponse(null, null, null);
            }
        }
    }

    x(@n0 List<e> list) {
        this.f28453a = list;
    }

    @k1
    @p0
    public WebResourceResponse a(@n0 Uri uri) {
        WebResourceResponse webResourceResponseA;
        for (e eVar : this.f28453a) {
            d dVarB = eVar.b(uri);
            if (dVarB != null && (webResourceResponseA = dVarB.a(eVar.a(uri.getPath()))) != null) {
                return webResourceResponseA;
            }
        }
        return null;
    }
}
