package androidx.collection;

import com.meituan.robust.Constants;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: LongSet.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nLongSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSet.kt\nandroidx/collection/LongSet\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 3 LongSet.kt\nandroidx/collection/LongSetKt\n*L\n1#1,853:1\n262#1,4:854\n232#1,7:858\n243#1,3:866\n246#1,2:870\n266#1,2:872\n249#1,6:874\n268#1:880\n262#1,4:881\n232#1,7:885\n243#1,3:893\n246#1,2:897\n266#1,2:899\n249#1,6:901\n268#1:907\n232#1,7:910\n243#1,3:918\n246#1,9:922\n262#1,4:931\n232#1,7:935\n243#1,3:943\n246#1,2:947\n266#1,2:949\n249#1,6:951\n268#1:957\n262#1,4:958\n232#1,7:962\n243#1,3:970\n246#1,2:974\n266#1,2:976\n249#1,6:978\n268#1:984\n262#1,4:985\n232#1,7:989\n243#1,3:997\n246#1,2:1001\n266#1,2:1003\n249#1,6:1005\n268#1:1011\n442#1:1012\n443#1:1016\n445#1,2:1018\n447#1,3:1021\n450#1:1027\n451#1:1031\n452#1:1033\n453#1,4:1036\n459#1:1041\n460#1,8:1043\n262#1,4:1051\n232#1,7:1055\n243#1,3:1063\n246#1,2:1067\n266#1,2:1069\n249#1,6:1071\n268#1:1077\n262#1,4:1078\n232#1,7:1082\n243#1,3:1090\n246#1,2:1094\n266#1,2:1096\n249#1,6:1098\n268#1:1104\n262#1,4:1105\n232#1,7:1109\n243#1,3:1117\n246#1,2:1121\n266#1,2:1123\n249#1,6:1125\n268#1:1131\n262#1,4:1132\n232#1,7:1136\n243#1,3:1144\n246#1,2:1148\n266#1,2:1150\n249#1,6:1152\n268#1:1158\n262#1,4:1159\n232#1,7:1163\n243#1,3:1171\n246#1,2:1175\n266#1,2:1177\n249#1,6:1179\n268#1:1185\n365#1,11:1202\n262#1,4:1213\n232#1,7:1217\n243#1,3:1225\n246#1,2:1229\n266#1:1231\n376#1,10:1232\n267#1:1242\n249#1,6:1243\n268#1:1249\n386#1,2:1250\n365#1,11:1252\n262#1,4:1263\n232#1,7:1267\n243#1,3:1275\n246#1,2:1279\n266#1:1281\n376#1,10:1282\n267#1:1292\n249#1,6:1293\n268#1:1299\n386#1,2:1300\n365#1,11:1302\n262#1,4:1313\n232#1,7:1317\n243#1,3:1325\n246#1,2:1329\n266#1:1331\n376#1,10:1332\n267#1:1342\n249#1,6:1343\n268#1:1349\n386#1,2:1350\n365#1,11:1352\n262#1,4:1363\n232#1,7:1367\n243#1,3:1375\n246#1,2:1379\n266#1:1381\n376#1,10:1382\n267#1:1392\n249#1,6:1393\n268#1:1399\n386#1,2:1400\n365#1,11:1402\n262#1,4:1413\n232#1,7:1417\n243#1,3:1425\n246#1,2:1429\n266#1:1431\n376#1,10:1432\n267#1:1442\n249#1,6:1443\n268#1:1449\n386#1,2:1450\n1826#2:865\n1688#2:869\n1826#2:892\n1688#2:896\n1826#2:908\n1688#2:909\n1826#2:917\n1688#2:921\n1826#2:942\n1688#2:946\n1826#2:969\n1688#2:973\n1826#2:996\n1688#2:1000\n1619#2:1017\n1615#2:1020\n1795#2,3:1024\n1809#2,3:1028\n1733#2:1032\n1721#2:1034\n1715#2:1035\n1728#2:1040\n1818#2:1042\n1826#2:1062\n1688#2:1066\n1826#2:1089\n1688#2:1093\n1826#2:1116\n1688#2:1120\n1826#2:1143\n1688#2:1147\n1826#2:1170\n1688#2:1174\n1619#2:1189\n1615#2:1190\n1795#2,3:1191\n1809#2,3:1194\n1733#2:1197\n1721#2:1198\n1715#2:1199\n1728#2:1200\n1818#2:1201\n1826#2:1224\n1688#2:1228\n1826#2:1274\n1688#2:1278\n1826#2:1324\n1688#2:1328\n1826#2:1374\n1688#2:1378\n1826#2:1424\n1688#2:1428\n849#3,3:1013\n849#3,3:1186\n*S KotlinDebug\n*F\n+ 1 LongSet.kt\nandroidx/collection/LongSet\n*L\n203#1:854,4\n203#1:858,7\n203#1:866,3\n203#1:870,2\n203#1:872,2\n203#1:874,6\n203#1:880\n222#1:881,4\n222#1:885,7\n222#1:893,3\n222#1:897,2\n222#1:899,2\n222#1:901,6\n222#1:907\n265#1:910,7\n265#1:918,3\n265#1:922,9\n277#1:931,4\n277#1:935,7\n277#1:943,3\n277#1:947,2\n277#1:949,2\n277#1:951,6\n277#1:957\n290#1:958,4\n290#1:962,7\n290#1:970,3\n290#1:974,2\n290#1:976,2\n290#1:978,6\n290#1:984\n311#1:985,4\n311#1:989,7\n311#1:997,3\n311#1:1001,2\n311#1:1003,2\n311#1:1005,6\n311#1:1011\n322#1:1012\n322#1:1016\n322#1:1018,2\n322#1:1021,3\n322#1:1027\n322#1:1031\n322#1:1033\n322#1:1036,4\n322#1:1041\n322#1:1043,8\n342#1:1051,4\n342#1:1055,7\n342#1:1063,3\n342#1:1067,2\n342#1:1069,2\n342#1:1071,6\n342#1:1077\n375#1:1078,4\n375#1:1082,7\n375#1:1090,3\n375#1:1094,2\n375#1:1096,2\n375#1:1098,6\n375#1:1104\n375#1:1105,4\n375#1:1109,7\n375#1:1117,3\n375#1:1121,2\n375#1:1123,2\n375#1:1125,6\n375#1:1131\n396#1:1132,4\n396#1:1136,7\n396#1:1144,3\n396#1:1148,2\n396#1:1150,2\n396#1:1152,6\n396#1:1158\n422#1:1159,4\n422#1:1163,7\n422#1:1171,3\n422#1:1175,2\n422#1:1177,2\n422#1:1179,6\n422#1:1185\n-1#1:1202,11\n-1#1:1213,4\n-1#1:1217,7\n-1#1:1225,3\n-1#1:1229,2\n-1#1:1231\n-1#1:1232,10\n-1#1:1242\n-1#1:1243,6\n-1#1:1249\n-1#1:1250,2\n-1#1:1252,11\n-1#1:1263,4\n-1#1:1267,7\n-1#1:1275,3\n-1#1:1279,2\n-1#1:1281\n-1#1:1282,10\n-1#1:1292\n-1#1:1293,6\n-1#1:1299\n-1#1:1300,2\n-1#1:1302,11\n-1#1:1313,4\n-1#1:1317,7\n-1#1:1325,3\n-1#1:1329,2\n-1#1:1331\n-1#1:1332,10\n-1#1:1342\n-1#1:1343,6\n-1#1:1349\n-1#1:1350,2\n-1#1:1352,11\n-1#1:1363,4\n-1#1:1367,7\n-1#1:1375,3\n-1#1:1379,2\n-1#1:1381\n-1#1:1382,10\n-1#1:1392\n-1#1:1393,6\n-1#1:1399\n-1#1:1400,2\n-1#1:1402,11\n-1#1:1413,4\n-1#1:1417,7\n-1#1:1425,3\n-1#1:1429,2\n-1#1:1431\n-1#1:1432,10\n-1#1:1442\n-1#1:1443,6\n-1#1:1449\n-1#1:1450,2\n203#1:865\n203#1:869\n222#1:892\n222#1:896\n238#1:908\n245#1:909\n265#1:917\n265#1:921\n277#1:942\n277#1:946\n290#1:969\n290#1:973\n311#1:996\n311#1:1000\n322#1:1017\n322#1:1020\n322#1:1024,3\n322#1:1028,3\n322#1:1032\n322#1:1034\n322#1:1035\n322#1:1040\n322#1:1042\n342#1:1062\n342#1:1066\n375#1:1089\n375#1:1093\n375#1:1116\n375#1:1120\n396#1:1143\n396#1:1147\n422#1:1170\n422#1:1174\n443#1:1189\n446#1:1190\n449#1:1191,3\n450#1:1194,3\n451#1:1197\n452#1:1198\n452#1:1199\n456#1:1200\n459#1:1201\n-1#1:1224\n-1#1:1228\n-1#1:1274\n-1#1:1278\n-1#1:1324\n-1#1:1328\n-1#1:1374\n-1#1:1378\n-1#1:1424\n-1#1:1428\n322#1:1013,3\n442#1:1186,3\n*E\n"})
public abstract class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    @xh.e
    public long[] f3718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    @xh.e
    public long[] f3719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @xh.e
    public int f3720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @xh.e
    public int f3721d;

    private v0() {
        this.f3718a = h2.f3611e;
        this.f3719b = w0.b();
    }

    public /* synthetic */ v0(kotlin.jvm.internal.u uVar) {
        this();
    }

    public static /* synthetic */ String D(v0 v0Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        return v0Var.w(charSequence, charSequence5, charSequence6, i12, charSequence4);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b5 A[DONT_INVERT, PHI: r11
  0x00b5: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:28:0x006e, B:43:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b7 A[LOOP:0: B:27:0x005d->B:45:0x00b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ba A[SYNTHETIC] */
    public static /* synthetic */ String E(v0 v0Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, yh.l transform, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        CharSequence separator = (i11 & 1) != 0 ? ", " : charSequence;
        CharSequence prefix = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence postfix = (i11 & 4) == 0 ? charSequence3 : "";
        int i12 = (i11 & 8) != 0 ? -1 : i10;
        CharSequence truncated = (i11 & 16) != 0 ? "..." : charSequence4;
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        kotlin.jvm.internal.f0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = v0Var.f3719b;
        long[] jArr2 = v0Var.f3718a;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i13 = 0;
        int i14 = 0;
        loop0: while (true) {
            long j10 = jArr2[i13];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8;
                int i16 = 8 - ((~(i13 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((j10 & 255) < 128) {
                        long j11 = jArr[(i13 << 3) + i17];
                        if (i14 == i12) {
                            sb2.append(truncated);
                            break loop0;
                        }
                        if (i14 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append((CharSequence) transform.invoke(Long.valueOf(j11)));
                        i14++;
                        i15 = 8;
                    }
                    j10 >>= i15;
                }
                if (i16 == i15) {
                    if (i13 == length) {
                        i13++;
                    }
                }
                sb2.append(postfix);
                break;
            }
            if (i13 == length) {
                sb2.append(postfix);
                break;
            }
            i13++;
        }
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @kotlin.r0
    public static /* synthetic */ void m() {
    }

    @kotlin.r0
    public static /* synthetic */ void n() {
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007c A[DONT_INVERT, PHI: r9
  0x007c: PHI (r9v2 int) = (r9v1 int), (r9v3 int) binds: [B:6:0x0038, B:21:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x007e A[LOOP:0: B:5:0x002a->B:23:0x007e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0081 A[SYNTHETIC] */
    @dl.d
    @xh.i
    public final String A(@dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d yh.l<? super Long, ? extends CharSequence> transform) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.f3719b;
        long[] jArr2 = this.f3718a;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb2.append((CharSequence) "");
            break;
        }
        int i10 = 0;
        int i11 = 0;
        loop0: while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128) {
                        long j11 = jArr[(i10 << 3) + i13];
                        if (i11 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i11 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Long.valueOf(j11)));
                        i11++;
                    }
                    j10 >>= 8;
                }
                if (i12 == 8) {
                    if (i10 == length) {
                        i10++;
                    }
                }
                sb2.append((CharSequence) "");
                break;
            }
            if (i10 == length) {
                sb2.append((CharSequence) "");
                break;
            }
            i10++;
        }
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007b A[DONT_INVERT, PHI: r10
  0x007b: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x0033, B:21:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x007d A[LOOP:0: B:5:0x0025->B:23:0x007d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0080 A[SYNTHETIC] */
    @dl.d
    @xh.i
    public final String B(@dl.d CharSequence separator, @dl.d yh.l<? super Long, ? extends CharSequence> transform) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        long[] jArr = this.f3719b;
        long[] jArr2 = this.f3718a;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb2.append((CharSequence) "");
            break;
        }
        int i10 = 0;
        int i11 = 0;
        loop0: while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((j10 & 255) < 128) {
                        long j11 = jArr[(i10 << 3) + i13];
                        if (i11 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i11 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Long.valueOf(j11)));
                        i11++;
                    }
                    j10 >>= 8;
                }
                if (i12 == 8) {
                    if (i10 == length) {
                        i10++;
                    }
                }
                sb2.append((CharSequence) "");
                break;
            }
            if (i10 == length) {
                sb2.append((CharSequence) "");
                break;
            }
            i10++;
        }
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072 A[DONT_INVERT, PHI: r9
  0x0072: PHI (r9v2 int) = (r9v1 int), (r9v3 int) binds: [B:6:0x002c, B:21:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0074 A[LOOP:0: B:5:0x001e->B:23:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0077 A[SYNTHETIC] */
    @dl.d
    @xh.i
    public final String C(@dl.d yh.l<? super Long, ? extends CharSequence> transform) {
        kotlin.jvm.internal.f0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        long[] jArr = this.f3719b;
        long[] jArr2 = this.f3718a;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb2.append((CharSequence) "");
            break;
        }
        int i10 = 0;
        int i11 = 0;
        loop0: while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128) {
                        long j11 = jArr[(i10 << 3) + i13];
                        if (i11 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i11 != 0) {
                            sb2.append((CharSequence) ", ");
                        }
                        sb2.append(transform.invoke(Long.valueOf(j11)));
                        i11++;
                    }
                    j10 >>= 8;
                }
                if (i12 == 8) {
                    if (i10 == length) {
                        i10++;
                    }
                }
                sb2.append((CharSequence) "");
                break;
            }
            if (i10 == length) {
                sb2.append((CharSequence) "");
                break;
            }
            i10++;
        }
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final boolean F() {
        return this.f3721d == 0;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x005d A[LOOP:0: B:5:0x0015->B:20:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0060 A[SYNTHETIC] */
    public final boolean a(@dl.d yh.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        long[] jArr = this.f3719b;
        long[] jArr2 = this.f3718a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr2[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (((255 & j10) < 128) && !predicate.invoke(Long.valueOf(jArr[(i10 << 3) + i12])).booleanValue()) {
                            return false;
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        return true;
    }

    public final boolean b() {
        return this.f3721d != 0;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[LOOP:0: B:5:0x0010->B:20:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x005c A[SYNTHETIC] */
    public final boolean c(@dl.d yh.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        long[] jArr = this.f3719b;
        long[] jArr2 = this.f3718a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr2[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (((255 & j10) < 128) && predicate.invoke(Long.valueOf(jArr[(i10 << 3) + i12])).booleanValue()) {
                            return true;
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        return false;
    }

    public final boolean d(long j10) {
        int iNumberOfTrailingZeros;
        int iA = k.a(j10) * h2.f3616j;
        int i10 = iA ^ (iA << 16);
        int i11 = i10 & 127;
        int i12 = this.f3720c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f3718a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j11 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j12 = (((long) i11) * h2.f3617k) ^ j11;
            long j13 = (~j12) & (j12 - h2.f3617k) & (-9187201950435737472L);
            while (true) {
                if (j13 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i13) & i12;
                    if (this.f3719b[iNumberOfTrailingZeros] == j10) {
                        break loop0;
                    }
                    j13 &= j13 - 1;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    @androidx.annotation.f0(from = 0)
    public final int e() {
        return this.f3721d;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x005f A[LOOP:0: B:14:0x0021->B:29:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x0062 A[SYNTHETIC] */
    public boolean equals(@dl.e Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (v0Var.f3721d != this.f3721d) {
            return false;
        }
        long[] jArr = this.f3719b;
        long[] jArr2 = this.f3718a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr2[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (((255 & j10) < 128) && !v0Var.d(jArr[(i10 << 3) + i12])) {
                            return false;
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        return true;
    }

    @androidx.annotation.f0(from = 0)
    public final int f(@dl.d yh.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        long[] jArr = this.f3719b;
        long[] jArr2 = this.f3718a;
        int length = jArr2.length - 2;
        int i10 = 0;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                long j10 = jArr2[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if (((255 & j10) < 128) && predicate.invoke(Long.valueOf(jArr[(i11 << 3) + i14])).booleanValue()) {
                            i12++;
                        }
                        j10 >>= 8;
                    }
                    if (i13 != 8) {
                        return i12;
                    }
                }
                if (i11 != length) {
                    i11++;
                } else {
                    i10 = i12;
                }
            }
        }
        return i10;
    }

    public final int g(long j10) {
        int iA = k.a(j10) * h2.f3616j;
        int i10 = iA ^ (iA << 16);
        int i11 = i10 & 127;
        int i12 = this.f3720c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f3718a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j11 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j12 = (((long) i11) * h2.f3617k) ^ j11;
            long j13 = (~j12) & (j12 - h2.f3617k) & (-9187201950435737472L);
            while (true) {
                if (j13 != 0) {
                    int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i13) & i12;
                    if (this.f3719b[iNumberOfTrailingZeros] == j10) {
                        return iNumberOfTrailingZeros;
                    }
                    j13 &= j13 - 1;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0043 A[LOOP:0: B:5:0x000b->B:19:0x0043, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0046 A[SYNTHETIC] */
    public final long h() {
        long[] jArr = this.f3719b;
        long[] jArr2 = this.f3718a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr2[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            return jArr[(i10 << 3) + i12];
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        throw new NoSuchElementException("The LongSet is empty");
    }

    public int hashCode() {
        long[] jArr = this.f3719b;
        long[] jArr2 = this.f3718a;
        int length = jArr2.length - 2;
        int i10 = 0;
        if (length >= 0) {
            int i11 = 0;
            int iA = 0;
            while (true) {
                long j10 = jArr2[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            iA += k.a(jArr[(i11 << 3) + i13]);
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        return iA;
                    }
                }
                if (i11 != length) {
                    i11++;
                } else {
                    i10 = iA;
                }
            }
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0058 A[LOOP:0: B:5:0x0010->B:20:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x005b A[SYNTHETIC] */
    public final long i(@dl.d yh.l<? super Long, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        long[] jArr = this.f3719b;
        long[] jArr2 = this.f3718a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr2[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            long j11 = jArr[(i10 << 3) + i12];
                            if (predicate.invoke(Long.valueOf(j11)).booleanValue()) {
                                return j11;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        throw new NoSuchElementException("Could not find a match");
    }

    public final void j(@dl.d yh.l<? super Long, kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        long[] jArr = this.f3719b;
        long[] jArr2 = this.f3718a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        block.invoke(Long.valueOf(jArr[(i10 << 3) + i12]));
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @kotlin.r0
    public final void k(@dl.d yh.l<? super Integer, kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        long[] jArr = this.f3718a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        block.invoke(Integer.valueOf((i10 << 3) + i12));
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @androidx.annotation.f0(from = 0)
    public final int l() {
        return this.f3720c;
    }

    @androidx.annotation.f0(from = 0)
    public final int o() {
        return this.f3721d;
    }

    public final boolean p() {
        return this.f3721d == 0;
    }

    public final boolean q() {
        return this.f3721d != 0;
    }

    @dl.d
    @xh.i
    public final String r() {
        return D(this, null, null, null, 0, null, 31, null);
    }

    @dl.d
    @xh.i
    public final String s(@dl.d CharSequence separator) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        return D(this, separator, null, null, 0, null, 30, null);
    }

    @dl.d
    @xh.i
    public final String t(@dl.d CharSequence separator, @dl.d CharSequence prefix) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        return D(this, separator, prefix, null, 0, null, 28, null);
    }

    @dl.d
    public String toString() {
        return D(this, null, Constants.ARRAY_TYPE, "]", 0, null, 25, null);
    }

    @dl.d
    @xh.i
    public final String u(@dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        return D(this, separator, prefix, postfix, 0, null, 24, null);
    }

    @dl.d
    @xh.i
    public final String v(@dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        return D(this, separator, prefix, postfix, i10, null, 16, null);
    }

    @dl.d
    @xh.i
    public final String w(@dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated) {
        int i11;
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.f3719b;
        long[] jArr2 = this.f3718a;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i12 = 0;
        int i13 = 0;
        loop0: while (true) {
            long j10 = jArr2[i12];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8;
                int i15 = 8 - ((~(i12 - length)) >>> 31);
                int i16 = 0;
                while (i16 < i15) {
                    if ((j10 & 255) < 128) {
                        long j11 = jArr[(i12 << 3) + i16];
                        if (i13 == i10) {
                            sb2.append(truncated);
                            break loop0;
                        }
                        if (i13 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(j11);
                        i13++;
                    }
                    j10 >>= 8;
                    i16++;
                    i14 = 8;
                    i12 = i12;
                }
                int i17 = i12;
                if (i15 == i14) {
                    i11 = i17;
                }
                sb2.append(postfix);
                break;
            }
            i11 = i12;
            if (i11 == length) {
                sb2.append(postfix);
                break;
            }
            i12 = i11 + 1;
        }
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @dl.d
    @xh.i
    public final String x(@dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated, @dl.d yh.l<? super Long, ? extends CharSequence> transform) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        kotlin.jvm.internal.f0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.f3719b;
        long[] jArr2 = this.f3718a;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j10 = jArr2[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i11 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j10 & 255) < 128) {
                        long j11 = jArr[(i11 << 3) + i15];
                        if (i12 == i10) {
                            sb2.append(truncated);
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Long.valueOf(j11)));
                        i12++;
                    }
                    j10 >>= 8;
                    i15++;
                    i13 = 8;
                }
                if (i14 == i13) {
                }
                sb2.append(postfix);
                break;
            }
            if (i11 == length) {
                sb2.append(postfix);
                break;
            }
            i11++;
        }
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @dl.d
    @xh.i
    public final String y(@dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d yh.l<? super Long, ? extends CharSequence> transform) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.f3719b;
        long[] jArr2 = this.f3718a;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j10 = jArr2[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i11 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((j10 & 255) < 128) {
                        long j11 = jArr[(i11 << 3) + i15];
                        if (i12 == i10) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Long.valueOf(j11)));
                        i12++;
                        i13 = 8;
                    }
                    j10 >>= i13;
                }
                if (i14 == i13) {
                }
                sb2.append(postfix);
                break;
            }
            if (i11 == length) {
                sb2.append(postfix);
                break;
            }
            i11++;
        }
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0087 A[DONT_INVERT, PHI: r10
  0x0087: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x003f, B:21:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0089 A[LOOP:0: B:5:0x0031->B:23:0x0089, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x008c A[SYNTHETIC] */
    @dl.d
    @xh.i
    public final String z(@dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, @dl.d yh.l<? super Long, ? extends CharSequence> transform) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.f3719b;
        long[] jArr2 = this.f3718a;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i10 = 0;
        int i11 = 0;
        loop0: while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((j10 & 255) < 128) {
                        long j11 = jArr[(i10 << 3) + i13];
                        if (i11 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i11 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Long.valueOf(j11)));
                        i11++;
                    }
                    j10 >>= 8;
                }
                if (i12 == 8) {
                    if (i10 == length) {
                        i10++;
                    }
                }
                sb2.append(postfix);
                break;
            }
            if (i10 == length) {
                sb2.append(postfix);
                break;
            }
            i10++;
        }
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
