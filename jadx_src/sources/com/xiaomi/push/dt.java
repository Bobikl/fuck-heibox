package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class dt {
    public static int a(Context context, int i10) {
        int iA = ig.a(context);
        if (-1 == iA) {
            return -1;
        }
        return (i10 * (iA == 0 ? 13 : 11)) / 10;
    }

    public static int a(in inVar) {
        return fn.a(inVar.a());
    }

    public static int a(jy jyVar, in inVar) {
        int iA;
        switch (du.f106988a[inVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return fn.a(inVar.a());
            case 11:
                iA = fn.a(inVar.a());
                if (jyVar != null) {
                    try {
                        if (jyVar instanceof je) {
                            String str = ((je) jyVar).f709d;
                            if (!TextUtils.isEmpty(str) && fn.a(fn.m374a(str)) != -1) {
                                iA = fn.a(fn.m374a(str));
                            }
                        } else if (jyVar instanceof jm) {
                            String str2 = ((jm) jyVar).f768d;
                            if (!TextUtils.isEmpty(str2)) {
                                if (fn.a(fn.m374a(str2)) != -1) {
                                    iA = fn.a(fn.m374a(str2));
                                }
                                if (ix.UploadTinyData.equals(fn.m374a(str2))) {
                                    return -1;
                                }
                            }
                        }
                    } catch (Exception unused) {
                        com.xiaomi.channel.commonutils.logger.b.d("PERF_ERROR : parse Notification type error");
                        return iA;
                    }
                }
                break;
            case 12:
                iA = fn.a(inVar.a());
                if (jyVar != null) {
                    try {
                        if (jyVar instanceof ji) {
                            String strB = ((ji) jyVar).b();
                            if (!TextUtils.isEmpty(strB) && fy.a(strB) != -1) {
                                iA = fy.a(strB);
                            }
                        } else if (jyVar instanceof jh) {
                            String strA = ((jh) jyVar).a();
                            if (!TextUtils.isEmpty(strA) && fy.a(strA) != -1) {
                                return fy.a(strA);
                            }
                        }
                    } catch (Exception unused2) {
                        com.xiaomi.channel.commonutils.logger.b.d("PERF_ERROR : parse Command type error");
                    }
                }
                break;
            default:
                return -1;
        }
        return iA;
    }

    public static void a(String str, Context context, int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        int iA = a(context, i11);
        if (i10 != fn.a(ix.UploadTinyData)) {
            fo.a(context.getApplicationContext()).a(str, i10, 1L, iA);
        }
    }

    public static void a(String str, Context context, jj jjVar, int i10) {
        in inVarA;
        if (context == null || jjVar == null || (inVarA = jjVar.a()) == null) {
            return;
        }
        int iA = a(inVarA);
        if (i10 <= 0) {
            byte[] bArrA = jx.a(jjVar);
            i10 = bArrA != null ? bArrA.length : 0;
        }
        a(str, context, iA, i10);
    }

    public static void a(String str, Context context, jy jyVar, in inVar, int i10) {
        a(str, context, a(jyVar, inVar), i10);
    }

    public static void a(String str, Context context, byte[] bArr) {
        if (context == null || bArr == null || bArr.length <= 0) {
            return;
        }
        jj jjVar = new jj();
        try {
            jx.a(jjVar, bArr);
            a(str, context, jjVar, bArr.length);
        } catch (kd unused) {
            com.xiaomi.channel.commonutils.logger.b.m62a("fail to convert bytes to container");
        }
    }
}
