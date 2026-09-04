package com.igexin.push.util;

import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f64070a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz`~!@#$%^&*()-_=+[{}];:'/?.>,<".toCharArray();

    public static String a(int i10) {
        Random random = new Random();
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(random.nextInt(62)));
        }
        return sb2.toString();
    }
}
