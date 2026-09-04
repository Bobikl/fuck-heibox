package com.huawei.hms.scankit.p;

import android.graphics.Bitmap;
import android.util.Log;
import com.huawei.hms.feature.DynamicModuleInitializer;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: DecodeMultiCodes.java */
/* JADX INFO: loaded from: classes7.dex */
public class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f62081a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f62082b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f62083c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f62084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static LinkedList<i2> f62085e = new LinkedList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static LinkedList<c6> f62086f = new LinkedList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static LinkedList<c6> f62087g = new LinkedList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f62088h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f62089i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static long f62090j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static boolean f62091k;

    static {
        f62088h = !r3.f62275a || r3.f62277c;
        f62089i = false;
        f62091k = false;
        if (DynamicModuleInitializer.getContext() == null) {
            Log.e("ScankitDecode", "static initializer: context null");
            return;
        }
        Log.i("ScankitDecode", "static initializer: InitModuleBegin");
        y4.c(DynamicModuleInitializer.getContext(), "detect.ms");
        y4.a(DynamicModuleInitializer.getContext(), "angle.ms");
        y4.b(DynamicModuleInitializer.getContext(), "corner.ms");
        Log.i("ScankitDecode", "static initializer: InitModuleEnd");
    }

    private static p4 a(byte[] bArr, x6 x6Var) {
        int i10 = x6Var.f62551a;
        int i11 = x6Var.f62552b;
        if (!x6Var.f62554d) {
            return new e6(bArr, i10, i11, 0, 0, i10, i11, false);
        }
        float f10 = 0.0f;
        int i12 = i10 * i11;
        byte[] bArr2 = new byte[i12];
        for (int i13 = 0; i13 < i11; i13++) {
            for (int i14 = 0; i14 < i10; i14++) {
                byte b10 = bArr[(i13 * i10) + i14];
                f10 += b10 & 255;
                bArr2[(((i14 * i11) + i11) - i13) - 1] = b10;
            }
        }
        float f11 = f10 / i12;
        if (f11 < 25.0f) {
            r3.f62279e = true;
        } else if (f11 > 215.0f) {
            r3.f62278d = true;
        }
        x6Var.f62551a = i11;
        x6Var.f62552b = i10;
        return new e6(bArr2, i11, i10, 0, 0, i11, i10, false);
    }

    private static s6 a(n1 n1Var, List<BarcodeFormat> list, List<BarcodeFormat> list2, List<BarcodeFormat> list3, List<BarcodeFormat> list4) {
        s6 s6VarF = list.size() > 0 ? n1Var.f(list, null) : null;
        if (a(s6VarF) && list3.size() > 0) {
            s6VarF = n1Var.d(list3, null);
        }
        if (a(s6VarF) && list2.size() > 0 && f62088h) {
            s6VarF = n1Var.a(list2, (i2) null);
        }
        return (!a(s6VarF) || list4.size() <= 0) ? s6VarF : n1Var.b(list4, (i2) null);
    }

    private static s6 a(p4 p4Var, x6 x6Var, LinkedList<s6> linkedList, boolean z10, boolean z11, int i10) {
        n1 n1Var = new n1(p4Var);
        List<List<BarcodeFormat>> listA = n3.a(x6Var.f62553c);
        if (!z10) {
            Iterator<s6> it = a(f62085e, n1Var, listA).iterator();
            while (it.hasNext()) {
                linkedList.offer(it.next());
            }
            return null;
        }
        s6 s6VarB = b(f62085e, n1Var, listA);
        if (s6VarB == null || s6VarB.k() == null) {
            return null;
        }
        return s6VarB;
    }

    public static s6 a(List<BarcodeFormat> list, n1 n1Var) {
        if (list.size() > 0) {
            return n1Var.e(list, null);
        }
        return null;
    }

    public static List<s6> a(List<i2> list, n1 n1Var, List<List<BarcodeFormat>> list2) {
        s6 s6VarG;
        boolean z10;
        boolean z11 = false;
        List<BarcodeFormat> list3 = list2.get(0);
        boolean z12 = true;
        List<BarcodeFormat> list4 = list2.get(1);
        List<BarcodeFormat> list5 = list2.get(2);
        List<BarcodeFormat> list6 = list2.get(3);
        List<BarcodeFormat> list7 = list2.get(4);
        List<BarcodeFormat> list8 = list2.get(5);
        List<BarcodeFormat> list9 = list2.get(6);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < list.size()) {
            n1Var.f62132i.a();
            i2 i2Var = list.get(i10);
            boolean z13 = i2Var.g() == 5.0f ? z12 : z11;
            boolean z14 = i2Var.g() == 1.0f ? z12 : false;
            boolean z15 = i2Var.g() == 3.0f ? z12 : false;
            boolean z16 = i2Var.g() == 2.0f ? z12 : false;
            boolean z17 = i2Var.g() == 4.0f ? z12 : false;
            boolean z18 = i2Var.g() == 6.0f ? z12 : false;
            boolean z19 = i2Var.g() == 7.0f ? z12 : false;
            if (r3.f62276b) {
                z13 = i2Var.g() == 1.0f ? z12 : false;
                z14 = i2Var.g() == 2.0f ? z12 : false;
                z15 = i2Var.g() == 2.0f ? z12 : false;
                z17 = i2Var.g() == 1.0f ? z12 : false;
                z16 = i2Var.g() == 2.0f ? z12 : false;
            }
            o4.d("scankit mul", "start cropAndRotate");
            n1Var.b(i2Var);
            o4.d("scankit mul", "end cropAndRotate");
            o4.d("scankit mul", "start decode");
            s6 s6VarE = (a((s6) null) && list3.size() > 0 && z14) ? n1Var.e(list3, i2Var) : null;
            if (a(s6VarE) && list6.size() > 0 && z15) {
                s6VarE = n1Var.b(list6, i2Var);
            }
            if (a(s6VarE) && list5.size() > 0 && z17) {
                s6VarE = n1Var.d(list5, i2Var);
            }
            if (a(s6VarE) && list7.size() > 0 && z16) {
                s6VarE = n1Var.b(list7, i2Var);
            }
            if (a(s6VarE) && list4.size() > 0 && z13) {
                s6VarE = n1Var.a(list4, i2Var);
            }
            if (a(s6VarE) && list8.size() > 0 && z19) {
                s6VarE = n1Var.c(list8, i2Var);
            }
            s6 s6Var = (!(a(s6VarE) && list9.size() > 0 && z18 && ((((double) i2Var.h()) > 0.6d ? 1 : (((double) i2Var.h()) == 0.6d ? 0 : -1)) > 0 || r3.f62277c)) || (s6VarE = n1Var.h(list9, i2Var)) == null || n1.b(n1Var.a(), i2Var)) ? s6VarE : null;
            if (r3.f62281g && s6Var != null && n1Var.b()) {
                s6 s6Var2 = new s6(n1Var.e() > 0.0f ? Math.max(1.0f, n1Var.e()) : Math.max(1.0f, Math.max(n1Var.c(), n1Var.d())));
                z10 = true;
                s6Var2.c(true);
                arrayList.add(s6Var2);
            } else {
                z10 = true;
                if (s6Var != null && s6Var.k() != null) {
                    arrayList.add(s6Var);
                }
            }
            i10++;
            z12 = z10;
            z11 = false;
        }
        if (arrayList.size() == 0 && list3.size() > 0 && !r3.f62281g && (s6VarG = n1Var.g(list3, null)) != null && s6VarG.k() != null) {
            arrayList.add(s6VarG);
        }
        o4.d("scankit mul", "end decode");
        return arrayList;
    }

    private static void a() {
        f62083c = false;
        f62085e = new LinkedList<>();
        f62086f = new LinkedList<>();
        f62087g = new LinkedList<>();
        r3.f62278d = false;
        r3.f62279e = false;
    }

    private static void a(p4 p4Var, int i10, int i11, x6 x6Var) {
        r3.a(x6Var);
        byte[] bArrB = p4Var.a(i10, i11, x6Var.f62551a, x6Var.f62552b).b();
        int i12 = x6Var.f62551a;
        int i13 = x6Var.f62552b;
        List<i2> listA = new n1(new e6(bArrB, i12, i13, 0, 0, i12, i13, false)).a(0, r3.f62291q);
        if (!x6Var.f62560j) {
            a(listA, x6Var);
        }
        for (i2 i2Var : listA) {
            i2Var.a(x6Var.f62558h, x6Var.f62559i);
            f62085e.offer(i2Var);
        }
    }

    private static void a(List<i2> list, x6 x6Var) {
        for (i2 i2Var : list) {
            if (i2Var.d() < x6Var.f62551a * 0.1f) {
                f62086f.offer(new c6(i2Var, x6Var.f62558h));
            } else {
                float fD = i2Var.d() + i2Var.f();
                int i10 = x6Var.f62551a;
                if (fD > i10 * 0.9f) {
                    f62086f.offer(new c6(i2Var, x6Var.f62558h + i10));
                }
            }
            if (i2Var.e() < x6Var.f62552b * 0.1f) {
                f62087g.offer(new c6(i2Var, x6Var.f62559i));
            } else {
                float fE = i2Var.e() + i2Var.c();
                int i11 = x6Var.f62552b;
                if (fE > i11 * 0.9f) {
                    f62087g.offer(new c6(i2Var, x6Var.f62559i + i11));
                }
            }
        }
    }

    public static void a(boolean z10) {
        r3.f62275a = z10;
    }

    private static boolean a(s6 s6Var) {
        return s6Var == null || s6Var.k() == null;
    }

    public static s6[] a(Bitmap bitmap, x6 x6Var) {
        o4.b("scankit mul", "start decodeMultiCode pre");
        byte[] bArrB = null;
        try {
            x6Var.f62551a = bitmap.getWidth();
            x6Var.f62552b = bitmap.getHeight();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getByteCount());
            bitmap.copyPixelsToBuffer(byteBufferAllocate);
            byteBufferAllocate.flip();
            bArrB = new m6(x6Var.f62551a, x6Var.f62552b, byteBufferAllocate).b();
            byteBufferAllocate.clear();
        } catch (IllegalArgumentException unused) {
            o4.b("exception", "IllegalArgumentException");
        } catch (OutOfMemoryError unused2) {
            o4.b("exception", "OutOfMemoryError");
        } catch (UnsatisfiedLinkError unused3) {
            o4.b("exception", "UnsatisfiedLinkError");
        } catch (UnsupportedOperationException unused4) {
            o4.b("exception", "UnsupportedArgumentException");
        } catch (Exception unused5) {
            o4.b("exception", "Exception");
        }
        o4.b("scankit mul", "end decodeMultiCode pre");
        return b(bArrB, x6Var);
    }

    public static s6[] a(p4 p4Var, x6 x6Var) {
        s6 s6VarA;
        boolean zP;
        List arrayList = new ArrayList();
        r3.a(x6Var);
        r3.a(1);
        if (x6Var.f62551a < 30 || x6Var.f62552b < 30 || p4Var == null) {
            throw new IllegalArgumentException("width or Height is Illeagle");
        }
        List<List<BarcodeFormat>> listA = n3.a(x6Var.f62553c);
        List<BarcodeFormat> list = listA.get(0);
        List<BarcodeFormat> list2 = listA.get(1);
        List<BarcodeFormat> list3 = listA.get(2);
        List<BarcodeFormat> list4 = listA.get(3);
        n1 n1Var = new n1(p4Var);
        o4.b("scankit mul", "start detectCodes");
        List<i2> listA2 = n1Var.a(1, r3.f62291q);
        o4.b("scankit mul", "end detectCodes");
        if (listA2.size() > 0) {
            arrayList = a(listA2, n1Var, listA);
        } else if ((r3.f62277c || !r3.f62275a) && (s6VarA = a(n1Var, list, list2, list3, list4)) != null && s6VarA.k() != null) {
            arrayList.add(s6VarA);
        }
        List<s6> listA3 = v7.a(arrayList);
        if (r3.f62281g && listA3.size() > 0 && listA3.get(0).k() != null) {
            return (s6[]) listA3.toArray(new s6[0]);
        }
        float fMax = 1.0f;
        if (r3.f62277c || !r3.f62281g) {
            zP = false;
        } else {
            if (listA3.size() > 0) {
                zP = listA3.get(0).p();
                fMax = Math.max(1.0f, listA3.get(0).l());
            } else {
                zP = false;
            }
            int i10 = r3.f62285k - 1;
            if (i10 <= 0) {
                i10 = 0;
            }
            r3.f62285k = i10;
            if (listA2.size() > 0) {
                zP = zP || n1Var.c(listA2);
            }
            if (zP && n1Var.c(n1Var.a()) < 20.0f) {
                zP = false;
            }
            if (zP) {
                fMax = Math.max(fMax, n1Var.e());
            }
        }
        if (!r3.f62281g || !zP) {
            return listA3.size() > 0 ? (s6[]) listA3.toArray(new s6[0]) : new s6[0];
        }
        s6 s6Var = new s6(fMax);
        s6Var.c(true);
        listA3.clear();
        listA3.add(s6Var);
        return (s6[]) listA3.toArray(new s6[0]);
    }

    public static s6[] a(ByteBuffer byteBuffer, x6 x6Var) {
        return b(byteBuffer.array(), x6Var);
    }

    public static s6[] a(byte[] bArr, x6 x6Var, boolean z10) {
        int i10;
        int i11;
        o4.d("scankit mul", "start pre");
        LinkedList linkedList = new LinkedList();
        a();
        int iMin = Math.min(x6Var.f62551a, x6Var.f62552b);
        float f10 = iMin;
        float fMax = Math.max(x6Var.f62551a, x6Var.f62552b) / f10;
        int i12 = (int) (f10 * 1.78f);
        p4 p4VarA = a(bArr, x6Var);
        o4.d("Scankit", "init " + f62091k);
        if ((r3.f62278d || r3.f62279e) && f62091k) {
            return new s6[0];
        }
        f62091k = true;
        x6 x6Var2 = new x6(x6Var);
        o4.d("scankit mul", "end pre");
        if (iMin > 500 && x6Var.f62551a >= x6Var.f62552b && x6Var.f62555e && fMax > 3.0f) {
            f62083c = true;
            x6Var2.f62551a = i12;
            int i13 = x6Var.f62551a - 1;
            while (i13 >= 0) {
                i13 -= i12;
                int i14 = i13 >= 0 ? i13 : 0;
                x6Var2.f62558h = i14;
                x6Var2.f62559i = 0;
                a(p4VarA, i14, 0, x6Var2);
            }
            Collections.sort(f62085e);
            s6 s6VarA = a(p4VarA, x6Var2, linkedList, z10, true, i12);
            if (s6VarA != null) {
                return new s6[]{s6VarA};
            }
            f62085e = new LinkedList<>();
            Collections.sort(f62086f);
            HashSet hashSet = new HashSet();
            for (c6 c6Var : f62086f) {
                if (hashSet.add(Integer.valueOf(c6Var.f61634b)) && (i11 = c6Var.f61634b) >= i12 && i11 <= (x6Var.f62551a - 1) - i12) {
                    x6Var2.f62551a = i12;
                    x6Var2.f62560j = true;
                    int i15 = i11 - (i12 / 2);
                    x6Var2.f62558h = i15;
                    x6Var2.f62559i = 0;
                    a(p4VarA, i15, 0, x6Var2);
                }
            }
            Collections.sort(f62085e);
            s6 s6VarA2 = a(p4VarA, x6Var2, linkedList, z10, true, i12);
            if (s6VarA2 != null) {
                return new s6[]{s6VarA2};
            }
        } else {
            if (iMin <= 500 || !x6Var.f62555e || fMax <= 3.0f) {
                f62083c = false;
                return z10 ? b(p4VarA, x6Var) : a(p4VarA, x6Var);
            }
            f62083c = true;
            x6Var2.f62552b = i12;
            int i16 = x6Var.f62552b - 1;
            while (i16 >= 0) {
                i16 -= i12;
                int i17 = i16 >= 0 ? i16 : 0;
                x6Var2.f62558h = 0;
                x6Var2.f62559i = i17;
                a(p4VarA, 0, i17, x6Var2);
            }
            Collections.sort(f62085e);
            s6 s6VarA3 = a(p4VarA, x6Var, linkedList, z10, false, i12);
            if (s6VarA3 != null) {
                return new s6[]{s6VarA3};
            }
            f62085e = new LinkedList<>();
            Collections.sort(f62087g);
            HashSet hashSet2 = new HashSet();
            for (c6 c6Var2 : f62087g) {
                if (hashSet2.add(Integer.valueOf(c6Var2.f61634b)) && (i10 = c6Var2.f61634b) >= i12 && i10 <= (x6Var.f62552b - 1) - i12) {
                    int i18 = i10 - (i12 / 2);
                    x6Var2.f62552b = i12;
                    x6Var2.f62560j = true;
                    x6Var2.f62558h = 0;
                    x6Var2.f62559i = i18;
                    a(p4VarA, 0, i18, x6Var2);
                }
            }
            Collections.sort(f62085e);
            s6 s6VarA4 = a(p4VarA, x6Var, linkedList, z10, false, i12);
            if (s6VarA4 != null) {
                return new s6[]{s6VarA4};
            }
        }
        s6[] s6VarArr = new s6[linkedList.size()];
        linkedList.toArray(s6VarArr);
        return s6VarArr;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0191  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a3  */
    public static s6 b(List<i2> list, n1 n1Var, List<List<BarcodeFormat>> list2) {
        List<BarcodeFormat> list3;
        boolean z10;
        s6 s6VarH;
        boolean z11 = false;
        List<BarcodeFormat> list4 = list2.get(0);
        List<BarcodeFormat> list5 = list2.get(1);
        List<BarcodeFormat> list6 = list2.get(2);
        List<BarcodeFormat> list7 = list2.get(3);
        List<BarcodeFormat> list8 = list2.get(4);
        List<BarcodeFormat> list9 = list2.get(5);
        List<BarcodeFormat> list10 = list2.get(6);
        int i10 = 0;
        s6 s6VarC = null;
        while (i10 < list.size()) {
            if (i10 > 0) {
                n1Var.f62132i.a();
            }
            i2 i2Var = list.get(i10);
            boolean z12 = i2Var.g() == 5.0f ? true : z11;
            boolean z13 = i2Var.g() == 1.0f ? true : z11;
            boolean z14 = i2Var.g() == 2.0f ? true : z11;
            boolean z15 = i2Var.g() == 3.0f ? true : z11;
            boolean z16 = i2Var.g() == 4.0f ? true : z11;
            boolean z17 = i2Var.g() == 6.0f ? true : z11;
            boolean z18 = i2Var.g() == 7.0f ? true : z11;
            if (r3.f62276b) {
                z12 = i2Var.g() == 1.0f ? true : z11;
                z13 = i2Var.g() == 2.0f ? true : z11;
                z14 = i2Var.g() == 2.0f ? true : z11;
                z15 = i2Var.g() == 2.0f ? true : z11;
                z16 = i2Var.g() == 1.0f ? true : z11;
            }
            n1Var.b(i2Var);
            if (a(s6VarC) && list4.size() > 0 && z13) {
                f62082b = true;
                s6VarC = n1Var.e(list4, i2Var);
            }
            if (a(s6VarC) && list7.size() > 0 && z15) {
                s6VarC = n1Var.b(list7, i2Var);
            }
            if (a(s6VarC) && list8.size() > 0 && z14) {
                s6VarC = n1Var.b(list8, i2Var);
            }
            if (a(s6VarC) && list6.size() > 0 && z16) {
                s6VarC = n1Var.d(list6, i2Var);
            }
            if (a(s6VarC) && list5.size() > 0 && z12) {
                s6VarC = n1Var.a(list5, i2Var);
            }
            if (a(s6VarC) && list9.size() > 0 && z18) {
                s6VarC = n1Var.c(list9, i2Var);
            }
            if (a(s6VarC) && list10.size() > 0 && z17) {
                list3 = list4;
                z10 = ((double) i2Var.h()) > 0.6d || r3.f62277c;
                if (z10) {
                    s6VarH = n1Var.h(list10, i2Var);
                    if (s6VarH != null || n1.b(n1Var.a(), i2Var)) {
                        s6VarC = s6VarH;
                    } else {
                        s6VarC = null;
                    }
                }
                if (s6VarC == null && s6VarC.k() != null) {
                    break;
                }
                i10++;
                list4 = list3;
                z11 = false;
            } else {
                list3 = list4;
            }
            if (z10) {
                s6VarH = n1Var.h(list10, i2Var);
                if (s6VarH != null) {
                    s6VarC = s6VarH;
                } else {
                    s6VarC = s6VarH;
                }
            }
            if (s6VarC == null) {
            }
            i10++;
            list4 = list3;
            z11 = false;
        }
        return s6VarC;
    }

    public static s6[] b(Bitmap bitmap, x6 x6Var) {
        byte[] bArrB = null;
        try {
            x6Var.f62551a = bitmap.getWidth();
            x6Var.f62552b = bitmap.getHeight();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getByteCount());
            bitmap.copyPixelsToBuffer(byteBufferAllocate);
            byteBufferAllocate.flip();
            bArrB = new m6(x6Var.f62551a, x6Var.f62552b, byteBufferAllocate).b();
            byteBufferAllocate.clear();
        } catch (IllegalArgumentException unused) {
            o4.b("exception", "IllegalArgumentException");
        } catch (UnsupportedOperationException unused2) {
            o4.b("exception", "UnsupportedArgumentException");
        } catch (Exception unused3) {
            o4.b("exception", "Exception");
        } catch (OutOfMemoryError unused4) {
            o4.b("exception", "OutOfMemoryError");
        } catch (UnsatisfiedLinkError unused5) {
            o4.b("exception", "UnsatisfiedLinkError");
        }
        return c(bArrB, x6Var);
    }

    public static s6[] b(p4 p4Var, x6 x6Var) {
        s6 s6VarA;
        float fMax;
        s6 s6Var;
        boolean z10;
        boolean zA;
        int i10;
        o4.d("ScankitDecode", "scankit mode:FULLSDK21200301 VERSION_NAME: 2.12.0.301");
        r3.a(x6Var);
        List<i2> arrayList = new ArrayList<>();
        if (x6Var.f62551a < 30 || x6Var.f62552b < 30 || p4Var == null) {
            throw new IllegalArgumentException("widthOrHeight is Illeagle");
        }
        List<List<BarcodeFormat>> listA = n3.a(x6Var.f62553c);
        List<BarcodeFormat> list = listA.get(0);
        List<BarcodeFormat> list2 = listA.get(1);
        List<BarcodeFormat> list3 = listA.get(2);
        List<BarcodeFormat> list4 = listA.get(3);
        List<BarcodeFormat> list5 = listA.get(4);
        n1 n1Var = new n1(p4Var);
        o4.d("Scankit", "Start decoding the full image");
        s6 s6Var2 = null;
        if (!f62081a || f62083c) {
            s6VarA = null;
        } else {
            s6VarA = a(list, n1Var);
            f62089i = false;
            f62090j = System.currentTimeMillis();
        }
        if (a(s6VarA)) {
            o4.d("Scankit", "detection start.");
            arrayList = n1Var.a(0, r3.f62291q);
            o4.d("Scankit", "detection results size: " + arrayList.size());
            if (arrayList.size() > 0) {
                o4.d("Scankit", "Start decoding  with detection");
                s6VarA = b(arrayList, n1Var, listA);
                f62089i = true;
            } else {
                o4.d("Scankit", "Start decoding  without detection");
                if (r3.f62277c || !r3.f62275a || r3.f62276b) {
                    if (a(s6VarA) && list3.size() > 0) {
                        s6VarA = n1Var.d(list3, null);
                    }
                    if (a(s6VarA) && list2.size() > 0 && f62088h) {
                        s6VarA = n1Var.a(list2, (i2) null);
                    }
                    if (a(s6VarA) && list5.size() > 0) {
                        s6VarA = n1Var.b(list5, (i2) null);
                    }
                    if (a(s6VarA) && list4.size() > 0) {
                        s6VarA = n1Var.b(list4, (i2) null);
                    }
                }
            }
        }
        o4.d("Scankit", "Decoding completed");
        boolean z11 = (f62081a || !f62082b || f62083c) ? false : true;
        if (x6Var.f62555e && a(s6VarA) && z11) {
            s6VarA = a(list, n1Var);
            f62082b = false;
        }
        if (r3.f62277c) {
            fMax = 1.0f;
            s6Var = null;
            z10 = false;
            zA = false;
        } else {
            boolean zB = n1Var.b();
            int i11 = r3.f62285k - 1;
            if (i11 <= 0) {
                i11 = 0;
            }
            r3.f62285k = i11;
            if (arrayList.size() > 0) {
                zB = zB || n1Var.b(arrayList);
            }
            if (zB && n1Var.c(n1Var.a()) < 20.0f) {
                zB = false;
            }
            fMax = n1Var.e() > 0.0f ? Math.max(1.0f, n1Var.e()) : Math.max(1.0f, Math.max(n1Var.c(), n1Var.d()));
            s6 s6VarA2 = n1.a(arrayList, n1Var);
            s6 s6VarA3 = n1.a(n1Var);
            zA = arrayList.size() > 0 ? n1.a(arrayList, zB) : false;
            z10 = zB;
            s6Var = s6VarA2;
            s6Var2 = s6VarA3;
        }
        if (s6Var2 == null || s6Var2.h() != -2) {
            i10 = 0;
            f62084d = 0;
        } else {
            f62084d++;
            i10 = 0;
        }
        o4.d("Scankit", "end zoom and expose cal");
        if (s6VarA != null && s6VarA.k() != null) {
            o4.d("ScankitDecode", "ScanCode successful");
            f62084d = i10;
            s6VarA.b(f62090j);
            s6VarA.a(System.currentTimeMillis());
            s6VarA.a(f62089i);
            s6[] s6VarArr = new s6[1];
            s6VarArr[i10] = s6VarA;
            return s6VarArr;
        }
        if (z10) {
            o4.d("ScankitDecode", "ScanCode need zoom");
            s6 s6Var3 = new s6(fMax);
            s6Var3.c(true);
            f62084d = i10;
            s6[] s6VarArr2 = new s6[1];
            s6VarArr2[i10] = s6Var3;
            return s6VarArr2;
        }
        if (arrayList.size() > 0 && s6Var != null) {
            o4.d("ScankitDecode", "ScanCode need exposure");
            f62084d = i10;
            s6[] s6VarArr3 = new s6[1];
            s6VarArr3[i10] = s6Var;
            return s6VarArr3;
        }
        if (s6Var2 != null && f62084d == 3) {
            s6Var2.b(true);
            s6Var2.a(-1);
            o4.d("ScankitDecode", "ScanCode need globalexposure");
            f62084d = 0;
            return new s6[]{s6Var2};
        }
        if (!zA) {
            o4.d("ScankitDecode", "ScanCode null");
            return new s6[0];
        }
        s6 s6Var4 = new s6(1.0f, true);
        float[] fArr = r3.f62299y;
        float f10 = fArr[0];
        float f11 = fArr[1];
        s6Var4.a(new i2(false, f10, f11, fArr[2] - f10, fArr[3] - f11, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f));
        return new s6[]{s6Var4};
    }

    public static s6[] b(byte[] bArr, x6 x6Var) {
        o4.b("scankit mul", "start decodeMultiCode");
        s6[] s6VarArr = new s6[0];
        try {
            s6[] s6VarArrA = a(bArr, x6Var, false);
            if (r3.f62281g && s6VarArrA.length > 0 && s6VarArrA[0].p()) {
                return s6VarArrA;
            }
            int length = s6VarArrA.length;
            int[] iArr = new int[length];
            int i10 = 0;
            int i11 = 0;
            while (i10 < s6VarArrA.length) {
                int i12 = i10 + 1;
                for (int i13 = i12; i13 < s6VarArrA.length; i13++) {
                    if (v7.a(s6VarArrA[i10].j(), s6VarArrA[i13].j()) > 0.7d) {
                        iArr[i13] = 1;
                        i11++;
                    }
                }
                i10 = i12;
            }
            int length2 = s6VarArrA.length - i11;
            s6VarArr = new s6[length2];
            for (int i14 = 0; i14 < length2; i14++) {
                int i15 = i14;
                while (i15 < length && iArr[i15] == 1) {
                    i15++;
                }
                s6VarArr[i14] = s6VarArrA[i15];
            }
        } catch (IllegalArgumentException unused) {
            o4.b("exception", "IllegalArgumentException");
        } catch (Exception unused2) {
            o4.b("exception", "Exception");
        } catch (OutOfMemoryError unused3) {
            o4.b("exception", "OutOfMemoryError");
        } catch (UnsatisfiedLinkError unused4) {
            o4.b("exception", "UnsatisfiedLinkError");
        } catch (UnsupportedOperationException unused5) {
            o4.b("exception", "UnsupportedArgumentException");
        }
        o4.b("scankit mul", "end decodeMultiCode");
        return s6VarArr;
    }

    public static s6[] c(byte[] bArr, x6 x6Var) {
        s6[] s6VarArr = new s6[0];
        try {
            return a(bArr, x6Var, true);
        } catch (IllegalArgumentException unused) {
            o4.b("exception", "IllegalArgumentException");
            return s6VarArr;
        } catch (Exception unused2) {
            o4.b("exception", "Exception");
            return s6VarArr;
        } catch (OutOfMemoryError unused3) {
            o4.b("exception", "OutOfMemoryError");
            return s6VarArr;
        } catch (UnsatisfiedLinkError unused4) {
            o4.b("exception", "UnsatisfiedLinkError");
            return s6VarArr;
        } catch (UnsupportedOperationException unused5) {
            o4.b("exception", "UnsupportedArgumentException");
            return s6VarArr;
        }
    }
}
