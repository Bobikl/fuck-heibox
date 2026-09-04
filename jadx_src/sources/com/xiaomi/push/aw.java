package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class aw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static int f106840a;

    public static ar a(Context context) {
        if (j.m520a()) {
            f106840a = 1;
            return new av(context);
        }
        if (ao.a(context)) {
            f106840a = 2;
            return new ao(context);
        }
        if (ay.a(context)) {
            f106840a = 4;
            return new ay(context);
        }
        if (bc.a(context)) {
            f106840a = 5;
            return new bc(context);
        }
        if (au.a(context)) {
            f106840a = 3;
            return new as(context);
        }
        f106840a = 0;
        return new bb();
    }
}
