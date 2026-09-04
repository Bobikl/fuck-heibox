package com.umeng.analytics.filter;

import android.util.Base64;
import com.xiaomi.mipush.sdk.Constants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: SmartDict.java */
/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f104376b = "Ă";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MessageDigest f104378c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f104380e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f104377a = "MD5";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set<Object> f104379d = new HashSet();

    public d(boolean z10, String str) {
        this.f104380e = z10;
        try {
            this.f104378c = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e10) {
            e10.printStackTrace();
        }
        if (str != null) {
            int i10 = 0;
            if (!z10) {
                String[] strArrSplit = str.split(f104376b);
                int length = strArrSplit.length;
                while (i10 < length) {
                    this.f104379d.add(strArrSplit[i10]);
                    i10++;
                }
                return;
            }
            try {
                byte[] bArrDecode = Base64.decode(str.getBytes(), 0);
                while (i10 < bArrDecode.length / 4) {
                    int i11 = i10 * 4;
                    this.f104379d.add(Integer.valueOf(((bArrDecode[i11 + 0] & 255) << 24) + ((bArrDecode[i11 + 1] & 255) << 16) + ((bArrDecode[i11 + 2] & 255) << 8) + (bArrDecode[i11 + 3] & 255)));
                    i10++;
                }
            } catch (IllegalArgumentException e11) {
                e11.printStackTrace();
            }
        }
    }

    private Integer c(String str) {
        try {
            this.f104378c.update(str.getBytes());
            byte[] bArrDigest = this.f104378c.digest();
            return Integer.valueOf(((bArrDigest[0] & 255) << 24) + ((bArrDigest[1] & 255) << 16) + ((bArrDigest[2] & 255) << 8) + (bArrDigest[3] & 255));
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public void a() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<Object> it = this.f104379d.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (sb2.length() > 0) {
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
        }
        System.out.println(sb2.toString());
    }

    public boolean a(String str) {
        return this.f104380e ? this.f104379d.contains(c(str)) : this.f104379d.contains(str);
    }

    public void b(String str) {
        if (this.f104380e) {
            this.f104379d.add(c(str));
        } else {
            this.f104379d.add(str);
        }
    }

    public String toString() {
        if (!this.f104380e) {
            StringBuilder sb2 = new StringBuilder();
            for (Object obj : this.f104379d) {
                if (sb2.length() > 0) {
                    sb2.append(f104376b);
                }
                sb2.append(obj.toString());
            }
            return sb2.toString();
        }
        byte[] bArr = new byte[this.f104379d.size() * 4];
        Iterator<Object> it = this.f104379d.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            int i11 = i10 + 1;
            bArr[i10] = (byte) (((-16777216) & iIntValue) >> 24);
            int i12 = i11 + 1;
            bArr[i11] = (byte) ((16711680 & iIntValue) >> 16);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((65280 & iIntValue) >> 8);
            i10 = i13 + 1;
            bArr[i13] = (byte) (iIntValue & 255);
        }
        return new String(Base64.encode(bArr, 0));
    }
}
