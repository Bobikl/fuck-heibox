package com.huawei.agconnect.config.impl;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.w;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes7.dex */
public class j implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f60146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f60147b;

    j(Context context, String str) {
        this.f60146a = context;
        this.f60147b = str;
    }

    private static String a(String str) {
        try {
            return "agc_" + Hex.encodeHexString(a(str.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    private static byte[] a(byte[] bArr) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance("SHA-256").digest(bArr);
    }

    @Override // com.huawei.agconnect.config.impl.d
    public String a(String str, String str2) {
        int identifier;
        String strA = a(str);
        if (TextUtils.isEmpty(strA) || (identifier = this.f60146a.getResources().getIdentifier(strA, w.b.f17895e, this.f60147b)) == 0) {
            return str2;
        }
        try {
            return this.f60146a.getResources().getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return str2;
        }
    }
}
