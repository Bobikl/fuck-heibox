package com.xiaomi.push;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class dh {

    public static class a extends dg {
        public a() {
            super(1);
        }

        @Override // com.xiaomi.push.dg
        public String a(Context context, String str, List<bf> list) {
            if (list == null) {
                return bg.a(context, new URL(str));
            }
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            for (bf bfVar : list) {
                builderBuildUpon.appendQueryParameter(bfVar.a(), bfVar.b());
            }
            return bg.a(context, new URL(builderBuildUpon.toString()));
        }
    }

    static int a(int i10, int i11) {
        return (((i11 + bb.c.b.J1) / bb.c.b.So) * 132) + 1080 + i10 + i11;
    }

    static int a(int i10, int i11, int i12) {
        return (((i11 + 200) / bb.c.b.So) * 132) + 1011 + i11 + i10 + i12;
    }

    private static int a(dg dgVar, String str, List<bf> list, String str2) {
        if (dgVar.a() == 1) {
            return a(str.length(), a(str2));
        }
        if (dgVar.a() != 2) {
            return -1;
        }
        return a(str.length(), a(list), a(str2));
    }

    static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            return 0;
        }
    }

    static int a(List<bf> list) {
        int length = 0;
        for (bf bfVar : list) {
            if (!TextUtils.isEmpty(bfVar.a())) {
                length += bfVar.a().length();
            }
            if (!TextUtils.isEmpty(bfVar.b())) {
                length += bfVar.b().length();
            }
        }
        return length * 2;
    }

    public static String a(Context context, String str, List<bf> list) {
        return a(context, str, list, new a(), true);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00aa A[Catch: MalformedURLException -> 0x00c3, TRY_ENTER, TryCatch #4 {MalformedURLException -> 0x00c3, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x0020, B:11:0x0027, B:13:0x002d, B:14:0x0030, B:15:0x0035, B:17:0x003b, B:19:0x0044, B:21:0x004c, B:49:0x00aa, B:50:0x00bc), top: B:64:0x000f }] */
    public static String a(Context context, String str, List<bf> list, dg dgVar, boolean z10) {
        cz czVar;
        IOException iOException;
        String str2;
        String str3;
        if (bg.b(context)) {
            try {
                ArrayList<String> arrayList = new ArrayList<>();
                if (z10) {
                    cz czVarM241a = dd.a().m241a(str);
                    if (czVarM241a != null) {
                        arrayList = czVarM241a.a(str);
                    }
                    czVar = czVarM241a;
                } else {
                    czVar = null;
                }
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
                String str4 = null;
                for (String str5 : arrayList) {
                    ArrayList arrayList2 = list != null ? new ArrayList(list) : null;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    try {
                        if (!dgVar.m251a(context, str5, (List<bf>) arrayList2)) {
                            return str4;
                        }
                        String strA = dgVar.a(context, str5, (List<bf>) arrayList2);
                        try {
                            if (!TextUtils.isEmpty(strA)) {
                                if (czVar != null) {
                                    try {
                                        czVar.a(str5, System.currentTimeMillis() - jCurrentTimeMillis, a(dgVar, str5, arrayList2, strA));
                                    } catch (IOException e10) {
                                        iOException = e10;
                                        str2 = strA;
                                    }
                                }
                                return strA;
                            }
                            if (czVar != null) {
                                str3 = strA;
                                try {
                                    czVar.a(str5, System.currentTimeMillis() - jCurrentTimeMillis, a(dgVar, str5, arrayList2, strA), null);
                                } catch (IOException e11) {
                                    e = e11;
                                    String str6 = str3;
                                    iOException = e;
                                    str2 = str6;
                                    if (czVar != null) {
                                        czVar.a(str5, System.currentTimeMillis() - jCurrentTimeMillis, a(dgVar, str5, arrayList2, str2), iOException);
                                    }
                                    iOException.printStackTrace();
                                    str4 = str2;
                                }
                            } else {
                                str3 = strA;
                            }
                            str4 = str3;
                        } catch (IOException e12) {
                            e = e12;
                            str3 = strA;
                        }
                        String str7 = str3;
                        iOException = e;
                        str2 = str7;
                    } catch (IOException e13) {
                        iOException = e13;
                        str2 = str4;
                    }
                    if (czVar != null) {
                        czVar.a(str5, System.currentTimeMillis() - jCurrentTimeMillis, a(dgVar, str5, arrayList2, str2), iOException);
                    }
                    iOException.printStackTrace();
                    str4 = str2;
                }
                return str4;
            } catch (MalformedURLException e14) {
                e14.printStackTrace();
            }
        }
        return null;
    }
}
