package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.in;
import com.xiaomi.push.jd;
import com.xiaomi.push.je;
import com.xiaomi.push.ji;
import com.xiaomi.push.jj;
import com.xiaomi.push.jm;
import com.xiaomi.push.jo;
import com.xiaomi.push.jp;
import com.xiaomi.push.jq;
import com.xiaomi.push.js;
import com.xiaomi.push.ju;
import com.xiaomi.push.jw;
import com.xiaomi.push.jx;
import com.xiaomi.push.jy;

/* JADX INFO: loaded from: classes4.dex */
public class cf {
    public static jy a(Context context, jj jjVar) {
        if (jjVar.m572b()) {
            return null;
        }
        byte[] bArrM570a = jjVar.m570a();
        jy jyVarA = a(jjVar.a(), jjVar.f752b);
        if (jyVarA != null) {
            jx.a(jyVarA, bArrM570a);
        }
        return jyVarA;
    }

    private static jy a(in inVar, boolean z10) {
        switch (cg.f107989a[inVar.ordinal()]) {
            case 1:
                return new jo();
            case 2:
                return new ju();
            case 3:
                return new js();
            case 4:
                return new jw();
            case 5:
                return new jq();
            case 6:
                return new jd();
            case 7:
                return new ji();
            case 8:
                return new jp();
            case 9:
                if (z10) {
                    return new jm();
                }
                je jeVar = new je();
                jeVar.a(true);
                return jeVar;
            case 10:
                return new ji();
            default:
                return null;
        }
    }
}
