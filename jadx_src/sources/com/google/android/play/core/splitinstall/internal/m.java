package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.core.splitcompat.f f56305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f56306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f56307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l f56308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private PackageInfo f56309e;

    public m(Context context, com.google.android.play.core.splitcompat.f fVar, h hVar) {
        l lVar = new l(new com.google.android.play.core.splitcompat.b(fVar));
        this.f56305a = fVar;
        this.f56306b = hVar;
        this.f56307c = context;
        this.f56308d = lVar;
    }

    @androidx.annotation.p0
    private final PackageInfo d() {
        if (this.f56309e == null) {
            try {
                this.f56309e = this.f56307c.getPackageManager().getPackageInfo(this.f56307c.getPackageName(), 64);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        return this.f56309e;
    }

    @androidx.annotation.p0
    private static X509Certificate e(Signature signature) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
        } catch (CertificateException e10) {
            Log.e("SplitCompat", "Cannot decode certificate.", e10);
            return null;
        }
    }

    public final boolean a(File[] fileArr) throws XmlPullParserException, IOException {
        PackageInfo packageInfoD = d();
        long longVersionCode = Build.VERSION.SDK_INT >= 28 ? packageInfoD.getLongVersionCode() : packageInfoD.versionCode;
        AssetManager assetManager = (AssetManager) k0.c(AssetManager.class);
        int length = fileArr.length;
        do {
            length--;
            if (length < 0) {
                return true;
            }
            this.f56308d.b(assetManager, fileArr[length]);
        } while (longVersionCode == this.f56308d.a());
        return false;
    }

    public final boolean b(List list) throws IOException {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!this.f56305a.g(((Intent) it.next()).getStringExtra("split_id")).exists()) {
                return false;
            }
        }
        return true;
    }

    public final boolean c(File[] fileArr) {
        PackageInfo packageInfoD = d();
        ArrayList<X509Certificate> arrayList = null;
        if (packageInfoD != null && packageInfoD.signatures != null) {
            arrayList = new ArrayList();
            for (Signature signature : packageInfoD.signatures) {
                X509Certificate x509CertificateE = e(signature);
                if (x509CertificateE != null) {
                    arrayList.add(x509CertificateE);
                }
            }
        }
        if (arrayList == null || arrayList.isEmpty()) {
            Log.e("SplitCompat", "No app certificates found.");
            return false;
        }
        int length = fileArr.length;
        loop1: while (true) {
            length--;
            if (length < 0) {
                return true;
            }
            try {
                String absolutePath = fileArr[length].getAbsolutePath();
                try {
                    X509Certificate[][] x509CertificateArrA = d1.a(absolutePath);
                    if (x509CertificateArrA != null && x509CertificateArrA.length != 0 && x509CertificateArrA[0].length != 0) {
                        if (arrayList.isEmpty()) {
                            Log.e("SplitCompat", "No certificates found for app.");
                            break;
                        }
                        for (X509Certificate x509Certificate : arrayList) {
                            int length2 = x509CertificateArrA.length;
                            int i10 = 0;
                            while (true) {
                                if (i10 >= length2) {
                                    Log.i("SplitCompat", "There's an app certificate that doesn't sign the split.");
                                    break loop1;
                                }
                                if (!x509CertificateArrA[i10][0].equals(x509Certificate)) {
                                    i10++;
                                }
                            }
                        }
                    } else {
                        Log.e("SplitCompat", "Downloaded split " + absolutePath + " is not signed.");
                        break;
                    }
                } catch (Exception e10) {
                    Log.e("SplitCompat", "Downloaded split " + absolutePath + " is not signed.", e10);
                }
            } catch (Exception e11) {
                Log.e("SplitCompat", "Split verification error.", e11);
                return false;
            }
        }
        Log.e("SplitCompat", "Split verification failure.");
        return false;
    }
}
