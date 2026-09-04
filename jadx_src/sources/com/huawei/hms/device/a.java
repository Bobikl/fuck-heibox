package com.huawei.hms.device;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.feature.dynamic.f.e;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.support.log.common.Base64;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.IOUtils;
import com.huawei.secure.android.common.ssl.util.h;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: X509CertUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {
    private static String a(String str, String str2) {
        int iIndexOf = str.toUpperCase(Locale.getDefault()).indexOf(str2 + ContainerUtils.KEY_VALUE_DELIMITER);
        if (iIndexOf == -1) {
            return null;
        }
        int iIndexOf2 = str.indexOf(Constants.ACCEPT_TIME_SEPARATOR_SP, iIndexOf);
        return iIndexOf2 != -1 ? str.substring(iIndexOf + str2.length() + 1, iIndexOf2) : str.substring(iIndexOf + str2.length() + 1);
    }

    public static X509Certificate a(Context context) {
        return a(context, h.f63062f);
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0091: MOVE (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:41:0x0091 */
    public static X509Certificate a(Context context, String str) throws Throwable {
        InputStream inputStream;
        InputStream inputStreamOpen;
        InputStream inputStream2 = null;
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        KeyStore keyStore = KeyStore.getInstance(h.f63061e);
                        inputStreamOpen = context.getAssets().open("hmsrootcas.bks");
                        try {
                            keyStore.load(inputStreamOpen, "".toCharArray());
                            if (!keyStore.containsAlias(str)) {
                                HMSLog.e(e.f60730a, "Not include alias " + str);
                                HMSPackageManager.getInstance(context).setUseOldCertificate(true);
                                IOUtils.closeQuietly(inputStreamOpen);
                                return null;
                            }
                            Certificate certificate = keyStore.getCertificate(str);
                            if (!(certificate instanceof X509Certificate)) {
                                IOUtils.closeQuietly(inputStreamOpen);
                                return null;
                            }
                            X509Certificate x509Certificate = (X509Certificate) certificate;
                            x509Certificate.checkValidity();
                            IOUtils.closeQuietly(inputStreamOpen);
                            return x509Certificate;
                        } catch (IOException e10) {
                            e = e10;
                            HMSLog.e(e.f60730a, "exception:" + e.getMessage());
                            IOUtils.closeQuietly(inputStreamOpen);
                        } catch (KeyStoreException e11) {
                            e = e11;
                            HMSLog.e(e.f60730a, "exception:" + e.getMessage());
                            IOUtils.closeQuietly(inputStreamOpen);
                        } catch (NoSuchAlgorithmException e12) {
                            e = e12;
                            HMSLog.e(e.f60730a, "exception:" + e.getMessage());
                            IOUtils.closeQuietly(inputStreamOpen);
                        } catch (CertificateException e13) {
                            e = e13;
                            HMSLog.e(e.f60730a, "exception:" + e.getMessage());
                            IOUtils.closeQuietly(inputStreamOpen);
                        }
                    } catch (IOException e14) {
                        e = e14;
                        inputStreamOpen = null;
                        HMSLog.e(e.f60730a, "exception:" + e.getMessage());
                        IOUtils.closeQuietly(inputStreamOpen);
                        return null;
                    } catch (KeyStoreException e15) {
                        e = e15;
                        inputStreamOpen = null;
                        HMSLog.e(e.f60730a, "exception:" + e.getMessage());
                        IOUtils.closeQuietly(inputStreamOpen);
                        return null;
                    } catch (NoSuchAlgorithmException e16) {
                        e = e16;
                        inputStreamOpen = null;
                        HMSLog.e(e.f60730a, "exception:" + e.getMessage());
                        IOUtils.closeQuietly(inputStreamOpen);
                        return null;
                    } catch (CertificateException e17) {
                        e = e17;
                        inputStreamOpen = null;
                        HMSLog.e(e.f60730a, "exception:" + e.getMessage());
                        IOUtils.closeQuietly(inputStreamOpen);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        IOUtils.closeQuietly(inputStream2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream2 = inputStream;
            }
        }
        HMSLog.e(e.f60730a, "args are error");
        return null;
    }

    public static X509Certificate a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return a(Base64.decode(str));
        } catch (IllegalArgumentException e10) {
            HMSLog.e(e.f60730a, "getCert failed : " + e10.getMessage());
            return null;
        }
    }

    public static X509Certificate a(byte[] bArr) {
        try {
            return (X509Certificate) CertificateFactory.getInstance(e.f60731b).generateCertificate(new ByteArrayInputStream(bArr));
        } catch (CertificateException e10) {
            HMSLog.e(e.f60730a, "Failed to get cert: " + e10.getMessage());
            return null;
        }
    }

    public static boolean a(X509Certificate x509Certificate) {
        if (x509Certificate == null || x509Certificate.getBasicConstraints() == -1) {
            return false;
        }
        boolean[] keyUsage = x509Certificate.getKeyUsage();
        if (5 < keyUsage.length) {
            return keyUsage[5];
        }
        return false;
    }

    public static boolean a(X509Certificate x509Certificate, String str) {
        return b(x509Certificate, e.f60734e, str);
    }

    public static boolean a(X509Certificate x509Certificate, String str, String str2) {
        try {
            return a(x509Certificate, str.getBytes("UTF-8"), Base64.decode(str2));
        } catch (UnsupportedEncodingException | IllegalArgumentException e10) {
            HMSLog.e(e.f60730a, " plainText exception: " + e10.getMessage());
            return false;
        }
    }

    public static boolean a(X509Certificate x509Certificate, List<X509Certificate> list) {
        if (list == null || list.size() == 0) {
            return false;
        }
        if (x509Certificate == null) {
            HMSLog.e(e.f60730a, "rootCert is null,verify failed ");
            return false;
        }
        PublicKey publicKey = x509Certificate.getPublicKey();
        for (X509Certificate x509Certificate2 : list) {
            if (x509Certificate2 != null) {
                try {
                    x509Certificate2.checkValidity();
                    x509Certificate2.verify(publicKey);
                    publicKey = x509Certificate2.getPublicKey();
                } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | SignatureException | CertificateException e10) {
                    HMSLog.e(e.f60730a, "verify failed " + e10.getMessage());
                }
            }
            return false;
        }
        return a(list);
    }

    public static boolean a(X509Certificate x509Certificate, byte[] bArr, byte[] bArr2) {
        try {
            Signature signature = Signature.getInstance(x509Certificate.getSigAlgName());
            signature.initVerify(x509Certificate.getPublicKey());
            signature.update(bArr);
            return signature.verify(bArr2);
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e10) {
            HMSLog.e(e.f60730a, "failed checkSignature : " + e10.getMessage());
            return false;
        }
    }

    public static boolean a(List<X509Certificate> list) {
        for (int i10 = 0; i10 < list.size() - 1; i10++) {
            if (!a(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static List<X509Certificate> b(String str) {
        return b(c(str));
    }

    public static List<X509Certificate> b(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        return arrayList;
    }

    public static boolean b(X509Certificate x509Certificate, String str) {
        return b(x509Certificate, e.f60733d, str);
    }

    public static boolean b(X509Certificate x509Certificate, String str, String str2) {
        if (x509Certificate == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return str2.equals(a(x509Certificate.getSubjectDN().getName(), str));
    }

    private static List<String> c(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 1) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.add(jSONArray.getString(i10));
            }
            return arrayList;
        } catch (JSONException e10) {
            HMSLog.e(e.f60730a, "Failed to getCertChain: " + e10.getMessage());
            return Collections.emptyList();
        }
    }
}
