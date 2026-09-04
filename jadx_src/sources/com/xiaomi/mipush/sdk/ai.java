package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.bm;
import com.xiaomi.push.in;
import com.xiaomi.push.jc;
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
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class ai {
    protected static <T extends jy<T, ?>> jj a(Context context, T t10, in inVar) {
        return a(context, t10, inVar, !inVar.equals(in.Registration), context.getPackageName(), b.m111a(context).m112a());
    }

    protected static <T extends jy<T, ?>> jj a(Context context, T t10, in inVar, boolean z10, String str, String str2) {
        return a(context, t10, inVar, z10, str, str2, true);
    }

    protected static <T extends jy<T, ?>> jj a(Context context, T t10, in inVar, boolean z10, String str, String str2, boolean z11) {
        byte[] bArrA = jx.a(t10);
        if (bArrA == null) {
            com.xiaomi.channel.commonutils.logger.b.m62a("invoke convertThriftObjectToBytes method, return null.");
            return null;
        }
        jj jjVar = new jj();
        if (z10) {
            String strD = b.m111a(context).d();
            if (TextUtils.isEmpty(strD)) {
                com.xiaomi.channel.commonutils.logger.b.m62a("regSecret is empty, return null");
                return null;
            }
            try {
                bArrA = com.xiaomi.push.h.b(bm.m189a(strD), bArrA);
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.b.d("encryption error. ");
            }
        }
        jc jcVar = new jc();
        jcVar.f672a = 5L;
        jcVar.f673a = "fakeid";
        jjVar.a(jcVar);
        jjVar.a(ByteBuffer.wrap(bArrA));
        jjVar.a(inVar);
        jjVar.b(z11);
        jjVar.b(str);
        jjVar.a(z10);
        jjVar.a(str2);
        return jjVar;
    }

    public static jy a(Context context, jj jjVar) {
        byte[] bArrM570a;
        if (jjVar.m572b()) {
            byte[] bArrA = i.a(context, jjVar, e.ASSEMBLE_PUSH_FCM);
            if (bArrA == null) {
                bArrA = bm.m189a(b.m111a(context).d());
            }
            try {
                bArrM570a = com.xiaomi.push.h.a(bArrA, jjVar.m570a());
            } catch (Exception e10) {
                throw new u("the aes decrypt failed.", e10);
            }
        } else {
            bArrM570a = jjVar.m570a();
        }
        jy jyVarA = a(jjVar.a(), jjVar.f752b);
        if (jyVarA != null) {
            jx.a(jyVarA, bArrM570a);
        }
        return jyVarA;
    }

    private static jy a(in inVar, boolean z10) {
        switch (aj.f106754a[inVar.ordinal()]) {
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

    protected static <T extends jy<T, ?>> jj b(Context context, T t10, in inVar, boolean z10, String str, String str2) {
        return a(context, t10, inVar, z10, str, str2, false);
    }
}
