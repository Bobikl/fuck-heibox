package com.max.hbapkinstaller;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.format.Formatter;
import android.util.Log;
import com.max.hbcommon.utils.l;
import com.max.hbutils.core.BaseApplication;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import kotlin.enums.EnumEntriesKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.v0;
import org.apache.tools.zip.t;
import org.apache.tools.zip.x;
import org.json.JSONObject;

/* JADX INFO: compiled from: XApkFile.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class XApkFile {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    public static final Companion f65772k = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private File f65773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private Companion.TYPE f65774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private String f65775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private Drawable f65776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private String f65777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private String f65778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f65779g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private String f65780h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f65781i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private String f65782j;

    /* JADX INFO: compiled from: XApkFile.kt */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: XApkFile.kt */
        public enum TYPE {
            APK,
            XAPK,
            UNKNOWN;

            private static final /* synthetic */ kotlin.enums.a $ENTRIES = EnumEntriesKt.b(values());
            public static ChangeQuickRedirect changeQuickRedirect;

            @dl.d
            public static kotlin.enums.a<TYPE> getEntries() {
                return $ENTRIES;
            }

            public static TYPE valueOf(String str) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.Dn, new Class[]{String.class}, TYPE.class);
                return (TYPE) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(TYPE.class, str));
            }

            /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
            public static TYPE[] valuesCustom() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.b.Cn, new Class[0], TYPE[].class);
                return (TYPE[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @dl.d
        public final TYPE a(@dl.d String fileName) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fileName}, this, changeQuickRedirect, false, bb.c.b.Bn, new Class[]{String.class}, TYPE.class);
            if (patchProxyResultProxy.isSupported) {
                return (TYPE) patchProxyResultProxy.result;
            }
            f0.p(fileName, "fileName");
            String lowerCase = fileName.toLowerCase();
            f0.o(lowerCase, "toLowerCase(...)");
            if (kotlin.text.u.K1(lowerCase, ".xapk", false, 2, null)) {
                return TYPE.XAPK;
            }
            return kotlin.text.u.K1(lowerCase, ".apk", false, 2, null) ? TYPE.APK : TYPE.UNKNOWN;
        }
    }

    /* JADX INFO: compiled from: XApkFile.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65783a;

        static {
            int[] iArr = new int[Companion.TYPE.valuesCustom().length];
            try {
                iArr[Companion.TYPE.XAPK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Companion.TYPE.APK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f65783a = iArr;
        }
    }

    public XApkFile(@dl.d File file) {
        f0.p(file, "file");
        this.f65773a = file;
        this.f65774b = Companion.TYPE.UNKNOWN;
        String name = file.getName();
        f0.o(name, "getName(...)");
        this.f65775c = name;
        this.f65777e = "";
        String fileSize = Formatter.formatFileSize(BaseApplication.a(), this.f65773a.length());
        f0.m(fileSize);
        this.f65778f = fileSize;
        this.f65779g = -1;
        this.f65780h = "-1";
        this.f65781i = -1;
        this.f65782j = "";
        try {
            Companion companion = f65772k;
            String name2 = this.f65773a.getName();
            f0.o(name2, "getName(...)");
            Companion.TYPE typeA = companion.a(name2);
            this.f65774b = typeA;
            int i10 = a.f65783a[typeA.ordinal()];
            if (i10 == 1) {
                x xVar = new x(this.f65773a);
                Enumeration<t> enumerationI = xVar.i();
                f0.o(enumerationI, "getEntries(...)");
                Iterator itC0 = kotlin.collections.u.c0(enumerationI);
                while (itC0.hasNext()) {
                    t tVar = (t) itC0.next();
                    if (!tVar.isDirectory() && f0.g(tVar.getName(), "manifest.json")) {
                        JSONObject jSONObject = new JSONObject(TextStreamsKt.k(new InputStreamReader(xVar.o(tVar))));
                        String string = jSONObject.getString("package_name");
                        f0.o(string, "getString(...)");
                        this.f65782j = string;
                        String string2 = jSONObject.getString("min_sdk_version");
                        f0.o(string2, "getString(...)");
                        this.f65779g = Integer.parseInt(string2);
                        String string3 = jSONObject.getString("version_name");
                        f0.o(string3, "getString(...)");
                        this.f65780h = string3;
                        String string4 = jSONObject.getString("version_code");
                        f0.o(string4, "getString(...)");
                        this.f65781i = Integer.parseInt(string4);
                    } else if (!tVar.isDirectory() && f0.g(tVar.getName(), "icon.png") && this.f65776d == null) {
                        this.f65776d = new BitmapDrawable(BaseApplication.a().getResources(), BitmapFactory.decodeStream(xVar.o(tVar)));
                    }
                }
                xVar.close();
            } else if (i10 != 2) {
                Log.e("XApkFile", this.f65773a.getName() + " type is unknown!");
            } else {
                PackageManager packageManager = BaseApplication.a().getPackageManager();
                PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(this.f65773a.getAbsolutePath(), 1);
                if (packageArchiveInfo != null) {
                    ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
                    applicationInfo.sourceDir = this.f65773a.getAbsolutePath();
                    applicationInfo.publicSourceDir = this.f65773a.getAbsolutePath();
                    this.f65777e = packageManager.getApplicationLabel(applicationInfo).toString();
                    String packageName = applicationInfo.packageName;
                    f0.o(packageName, "packageName");
                    this.f65782j = packageName;
                    this.f65776d = packageManager.getApplicationIcon(applicationInfo);
                    if (Build.VERSION.SDK_INT >= 24) {
                        this.f65779g = applicationInfo.minSdkVersion;
                    }
                    String versionName = packageArchiveInfo.versionName;
                    f0.o(versionName, "versionName");
                    this.f65780h = versionName;
                    this.f65781i = packageArchiveInfo.versionCode;
                }
            }
            Log.i("XApkFile", toString());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @dl.d
    public final String a() {
        return this.f65777e;
    }

    @dl.d
    public final File b() {
        return this.f65773a;
    }

    @dl.d
    public final String c() {
        return this.f65775c;
    }

    @dl.e
    public final Drawable d() {
        return this.f65776d;
    }

    public final int e() {
        return this.f65779g;
    }

    @dl.d
    public final String f() {
        return this.f65782j;
    }

    @dl.d
    public final String g() {
        return this.f65778f;
    }

    @dl.d
    public final Companion.TYPE h() {
        return this.f65774b;
    }

    public final void i(@dl.d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.wn, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.f65777e = str;
    }

    public final void j(@dl.d File file) {
        if (PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, bb.c.b.tn, new Class[]{File.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(file, "<set-?>");
        this.f65773a = file;
    }

    public final void k(@dl.d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.vn, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.f65775c = str;
    }

    public final void l(@dl.e Drawable drawable) {
        this.f65776d = drawable;
    }

    public final void m(int i10) {
        this.f65779g = i10;
    }

    public final void n(@dl.d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.yn, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.f65782j = str;
    }

    public final void o(@dl.d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.xn, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.f65778f = str;
    }

    public final void p(@dl.d Companion.TYPE type) {
        if (PatchProxy.proxy(new Object[]{type}, this, changeQuickRedirect, false, bb.c.b.un, new Class[]{Companion.TYPE.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(type, "<set-?>");
        this.f65774b = type;
    }

    @dl.d
    public final String q() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.zn, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StringBuilder sb2 = new StringBuilder();
        v0 v0Var = v0.f124986a;
        String strE = l.e(R.string.hbapkinstaller_detail_file);
        f0.o(strE, "getString(...)");
        String str = String.format(strE, Arrays.copyOf(new Object[]{this.f65773a}, 1));
        f0.o(str, "format(...)");
        sb2.append(str);
        sb2.append('\n');
        String strE2 = l.e(R.string.hbapkinstaller_detail_size);
        f0.o(strE2, "getString(...)");
        String str2 = String.format(strE2, Arrays.copyOf(new Object[]{this.f65778f}, 1));
        f0.o(str2, "format(...)");
        sb2.append(str2);
        sb2.append('\n');
        String strE3 = l.e(R.string.hbapkinstaller_detail_appName);
        f0.o(strE3, "getString(...)");
        String str3 = String.format(strE3, Arrays.copyOf(new Object[]{this.f65777e}, 1));
        f0.o(str3, "format(...)");
        sb2.append(str3);
        sb2.append('\n');
        String strE4 = l.e(R.string.hbapkinstaller_detail_versionName);
        f0.o(strE4, "getString(...)");
        String str4 = String.format(strE4, Arrays.copyOf(new Object[]{this.f65780h}, 1));
        f0.o(str4, "format(...)");
        sb2.append(str4);
        sb2.append('\n');
        String strE5 = l.e(R.string.hbapkinstaller_detail_versionCode);
        f0.o(strE5, "getString(...)");
        String str5 = String.format(strE5, Arrays.copyOf(new Object[]{Integer.valueOf(this.f65781i)}, 1));
        f0.o(str5, "format(...)");
        sb2.append(str5);
        sb2.append('\n');
        String strE6 = l.e(R.string.hbapkinstaller_detail_packageName);
        f0.o(strE6, "getString(...)");
        String str6 = String.format(strE6, Arrays.copyOf(new Object[]{this.f65782j}, 1));
        f0.o(str6, "format(...)");
        sb2.append(str6);
        sb2.append('\n');
        String strE7 = l.e(R.string.hbapkinstaller_detail_minSDKVersion);
        f0.o(strE7, "getString(...)");
        String str7 = String.format(strE7, Arrays.copyOf(new Object[]{Integer.valueOf(this.f65779g)}, 1));
        f0.o(str7, "format(...)");
        sb2.append(str7);
        return sb2.toString();
    }

    @dl.d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.An, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "File: " + this.f65773a + ", type: " + this.f65774b + ", fileName: " + this.f65775c + ", appName: " + this.f65777e + ", size: " + this.f65778f + ", minSDKVersion: " + this.f65779g + ", versionName: " + this.f65780h + ", versionCode: " + this.f65781i + ", packageName: " + this.f65782j;
    }
}
