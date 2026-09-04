package com.huawei.secure.android.common.ssl.util;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes7.dex */
public final class CertificateUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63044a = "CertificateUtil";

    private CertificateUtil() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.io.InputStream] */
    public static X509Certificate getHwCbgRootCA(Context context) throws Throwable {
        InputStream inputStreamOpen;
        ?? r10 = 0;
        X509Certificate x509Certificate = null;
        try {
            try {
                KeyStore keyStore = KeyStore.getInstance(h.f63061e);
                inputStreamOpen = context.getAssets().open("hmsrootcas.bks");
                try {
                    inputStreamOpen.reset();
                    keyStore.load(inputStreamOpen, "".toCharArray());
                    x509Certificate = (X509Certificate) keyStore.getCertificate(h.f63062f);
                    context = inputStreamOpen;
                } catch (IOException e10) {
                    e = e10;
                    e.b(f63044a, "loadBksCA: exception : " + e.getMessage());
                    context = inputStreamOpen;
                } catch (RuntimeException e11) {
                    e = e11;
                    e.b(f63044a, "loadBksCA: exception : " + e.getMessage());
                    context = inputStreamOpen;
                } catch (KeyStoreException e12) {
                    e = e12;
                    e.b(f63044a, "loadBksCA: exception : " + e.getMessage());
                    context = inputStreamOpen;
                } catch (NoSuchAlgorithmException e13) {
                    e = e13;
                    e.b(f63044a, "loadBksCA: exception : " + e.getMessage());
                    context = inputStreamOpen;
                } catch (CertificateException e14) {
                    e = e14;
                    e.b(f63044a, "loadBksCA: exception : " + e.getMessage());
                    context = inputStreamOpen;
                }
            } catch (Throwable th2) {
                r10 = context;
                th = th2;
                d.a((InputStream) r10);
                throw th;
            }
        } catch (IOException e15) {
            e = e15;
            inputStreamOpen = null;
            e.b(f63044a, "loadBksCA: exception : " + e.getMessage());
            context = inputStreamOpen;
            d.a((InputStream) context);
            return x509Certificate;
        } catch (RuntimeException e16) {
            e = e16;
            inputStreamOpen = null;
            e.b(f63044a, "loadBksCA: exception : " + e.getMessage());
            context = inputStreamOpen;
            d.a((InputStream) context);
            return x509Certificate;
        } catch (KeyStoreException e17) {
            e = e17;
            inputStreamOpen = null;
            e.b(f63044a, "loadBksCA: exception : " + e.getMessage());
            context = inputStreamOpen;
            d.a((InputStream) context);
            return x509Certificate;
        } catch (NoSuchAlgorithmException e18) {
            e = e18;
            inputStreamOpen = null;
            e.b(f63044a, "loadBksCA: exception : " + e.getMessage());
            context = inputStreamOpen;
            d.a((InputStream) context);
            return x509Certificate;
        } catch (CertificateException e19) {
            e = e19;
            inputStreamOpen = null;
            e.b(f63044a, "loadBksCA: exception : " + e.getMessage());
            context = inputStreamOpen;
            d.a((InputStream) context);
            return x509Certificate;
        } catch (Throwable th3) {
            th = th3;
            d.a((InputStream) r10);
            throw th;
        }
        d.a((InputStream) context);
        return x509Certificate;
    }
}
