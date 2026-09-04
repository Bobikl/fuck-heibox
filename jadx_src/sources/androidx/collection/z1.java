package androidx.collection;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ObjectFloatMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nObjectFloatMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectFloatMap.kt\nandroidx/collection/ObjectFloatMap\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1074:1\n373#1,6:1077\n383#1,3:1084\n386#1,9:1088\n373#1,6:1097\n383#1,3:1104\n386#1,9:1108\n373#1,6:1117\n383#1,3:1124\n386#1,9:1128\n401#1,4:1137\n373#1,6:1141\n383#1,3:1148\n386#1,2:1152\n406#1,2:1154\n389#1,6:1156\n408#1:1162\n401#1,4:1163\n373#1,6:1167\n383#1,3:1174\n386#1,2:1178\n406#1,2:1180\n389#1,6:1182\n408#1:1188\n401#1,4:1189\n373#1,6:1193\n383#1,3:1200\n386#1,2:1204\n406#1,2:1206\n389#1,6:1208\n408#1:1214\n428#1,3:1215\n373#1,6:1218\n383#1,3:1225\n386#1,2:1229\n431#1,2:1231\n389#1,6:1233\n433#1:1239\n401#1,4:1240\n373#1,6:1244\n383#1,3:1251\n386#1,2:1255\n406#1,2:1257\n389#1,6:1259\n408#1:1265\n401#1,4:1266\n373#1,6:1270\n383#1,3:1277\n386#1,2:1281\n406#1,2:1283\n389#1,6:1285\n408#1:1291\n401#1,4:1292\n373#1,6:1296\n383#1,3:1303\n386#1,2:1307\n406#1,2:1309\n389#1,6:1311\n408#1:1317\n401#1,4:1318\n373#1,6:1322\n383#1,3:1329\n386#1,2:1333\n406#1,2:1335\n389#1,6:1337\n408#1:1343\n401#1,4:1344\n373#1,6:1348\n383#1,3:1355\n386#1,2:1359\n406#1,2:1361\n389#1,6:1363\n408#1:1369\n401#1,4:1370\n373#1,6:1374\n383#1,3:1381\n386#1,2:1385\n406#1,2:1387\n389#1,6:1389\n408#1:1395\n537#1,11:1412\n401#1,4:1423\n373#1,6:1427\n383#1,3:1434\n386#1,2:1438\n406#1:1440\n548#1,10:1441\n407#1:1451\n389#1,6:1452\n408#1:1458\n558#1,2:1459\n537#1,11:1461\n401#1,4:1472\n373#1,6:1476\n383#1,3:1483\n386#1,2:1487\n406#1:1489\n548#1,10:1490\n407#1:1500\n389#1,6:1501\n408#1:1507\n558#1,2:1508\n537#1,11:1510\n401#1,4:1521\n373#1,6:1525\n383#1,3:1532\n386#1,2:1536\n406#1:1538\n548#1,10:1539\n407#1:1549\n389#1,6:1550\n408#1:1556\n558#1,2:1557\n537#1,11:1559\n401#1,4:1570\n373#1,6:1574\n383#1,3:1581\n386#1,2:1585\n406#1:1587\n548#1,10:1588\n407#1:1598\n389#1,6:1599\n408#1:1605\n558#1,2:1606\n537#1,11:1608\n401#1,4:1619\n373#1,6:1623\n383#1,3:1630\n386#1,2:1634\n406#1:1636\n548#1,10:1637\n407#1:1647\n389#1,6:1648\n408#1:1654\n558#1,2:1655\n1826#2:1075\n1688#2:1076\n1826#2:1083\n1688#2:1087\n1826#2:1103\n1688#2:1107\n1826#2:1123\n1688#2:1127\n1826#2:1147\n1688#2:1151\n1826#2:1173\n1688#2:1177\n1826#2:1199\n1688#2:1203\n1826#2:1224\n1688#2:1228\n1826#2:1250\n1688#2:1254\n1826#2:1276\n1688#2:1280\n1826#2:1302\n1688#2:1306\n1826#2:1328\n1688#2:1332\n1826#2:1354\n1688#2:1358\n1826#2:1380\n1688#2:1384\n1605#2,3:1396\n1619#2:1399\n1615#2:1400\n1795#2,3:1401\n1809#2,3:1404\n1733#2:1407\n1721#2:1408\n1715#2:1409\n1728#2:1410\n1818#2:1411\n1826#2:1433\n1688#2:1437\n1826#2:1482\n1688#2:1486\n1826#2:1531\n1688#2:1535\n1826#2:1580\n1688#2:1584\n1826#2:1629\n1688#2:1633\n*S KotlinDebug\n*F\n+ 1 ObjectFloatMap.kt\nandroidx/collection/ObjectFloatMap\n*L\n404#1:1077,6\n404#1:1084,3\n404#1:1088,9\n417#1:1097,6\n417#1:1104,3\n417#1:1108,9\n430#1:1117,6\n430#1:1124,3\n430#1:1128,9\n439#1:1137,4\n439#1:1141,6\n439#1:1148,3\n439#1:1152,2\n439#1:1154,2\n439#1:1156,6\n439#1:1162\n449#1:1163,4\n449#1:1167,6\n449#1:1174,3\n449#1:1178,2\n449#1:1180,2\n449#1:1182,6\n449#1:1188\n465#1:1189,4\n465#1:1193,6\n465#1:1200,3\n465#1:1204,2\n465#1:1206,2\n465#1:1208,6\n465#1:1214\n488#1:1215,3\n488#1:1218,6\n488#1:1225,3\n488#1:1229,2\n488#1:1231,2\n488#1:1233,6\n488#1:1239\n512#1:1240,4\n512#1:1244,6\n512#1:1251,3\n512#1:1255,2\n512#1:1257,2\n512#1:1259,6\n512#1:1265\n547#1:1266,4\n547#1:1270,6\n547#1:1277,3\n547#1:1281,2\n547#1:1283,2\n547#1:1285,6\n547#1:1291\n547#1:1292,4\n547#1:1296,6\n547#1:1303,3\n547#1:1307,2\n547#1:1309,2\n547#1:1311,6\n547#1:1317\n568#1:1318,4\n568#1:1322,6\n568#1:1329,3\n568#1:1333,2\n568#1:1335,2\n568#1:1337,6\n568#1:1343\n597#1:1344,4\n597#1:1348,6\n597#1:1355,3\n597#1:1359,2\n597#1:1361,2\n597#1:1363,6\n597#1:1369\n619#1:1370,4\n619#1:1374,6\n619#1:1381,3\n619#1:1385,2\n619#1:1387,2\n619#1:1389,6\n619#1:1395\n-1#1:1412,11\n-1#1:1423,4\n-1#1:1427,6\n-1#1:1434,3\n-1#1:1438,2\n-1#1:1440\n-1#1:1441,10\n-1#1:1451\n-1#1:1452,6\n-1#1:1458\n-1#1:1459,2\n-1#1:1461,11\n-1#1:1472,4\n-1#1:1476,6\n-1#1:1483,3\n-1#1:1487,2\n-1#1:1489\n-1#1:1490,10\n-1#1:1500\n-1#1:1501,6\n-1#1:1507\n-1#1:1508,2\n-1#1:1510,11\n-1#1:1521,4\n-1#1:1525,6\n-1#1:1532,3\n-1#1:1536,2\n-1#1:1538\n-1#1:1539,10\n-1#1:1549\n-1#1:1550,6\n-1#1:1556\n-1#1:1557,2\n-1#1:1559,11\n-1#1:1570,4\n-1#1:1574,6\n-1#1:1581,3\n-1#1:1585,2\n-1#1:1587\n-1#1:1588,10\n-1#1:1598\n-1#1:1599,6\n-1#1:1605\n-1#1:1606,2\n-1#1:1608,11\n-1#1:1619,4\n-1#1:1623,6\n-1#1:1630,3\n-1#1:1634,2\n-1#1:1636\n-1#1:1637,10\n-1#1:1647\n-1#1:1648,6\n-1#1:1654\n-1#1:1655,2\n378#1:1075\n385#1:1076\n404#1:1083\n404#1:1087\n417#1:1103\n417#1:1107\n430#1:1123\n430#1:1127\n439#1:1147\n439#1:1151\n449#1:1173\n449#1:1177\n465#1:1199\n465#1:1203\n488#1:1224\n488#1:1228\n512#1:1250\n512#1:1254\n547#1:1276\n547#1:1280\n547#1:1302\n547#1:1306\n568#1:1328\n568#1:1332\n597#1:1354\n597#1:1358\n619#1:1380\n619#1:1384\n638#1:1396,3\n639#1:1399\n642#1:1400\n646#1:1401,3\n647#1:1404,3\n648#1:1407\n649#1:1408\n649#1:1409\n653#1:1410\n656#1:1411\n-1#1:1433\n-1#1:1437\n-1#1:1482\n-1#1:1486\n-1#1:1531\n-1#1:1535\n-1#1:1580\n-1#1:1584\n-1#1:1629\n-1#1:1633\n*E\n"})
public abstract class z1<K> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    @xh.e
    public long[] f3766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    @xh.e
    public Object[] f3767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    @xh.e
    public float[] f3768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @xh.e
    public int f3769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @xh.e
    public int f3770e;

    private z1() {
        this.f3766a = h2.f3611e;
        this.f3767b = i0.a.f119208c;
        this.f3768c = v.g();
    }

    public /* synthetic */ z1(kotlin.jvm.internal.u uVar) {
        this();
    }

    public static /* synthetic */ String L(z1 z1Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
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
        return z1Var.E(charSequence, charSequence5, charSequence6, i12, charSequence4);
    }

    public static /* synthetic */ String M(z1 z1Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, yh.p transform, int i11, Object obj) {
        long[] jArr;
        int i12;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        CharSequence separator = (i11 & 1) != 0 ? ", " : charSequence;
        CharSequence prefix = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence postfix = (i11 & 4) == 0 ? charSequence3 : "";
        int i13 = (i11 & 8) != 0 ? -1 : i10;
        CharSequence truncated = (i11 & 16) != 0 ? "..." : charSequence4;
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        kotlin.jvm.internal.f0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        Object[] objArr = z1Var.f3767b;
        float[] fArr = z1Var.f3768c;
        long[] jArr2 = z1Var.f3766a;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i14 = 0;
        int i15 = 0;
        loop0: while (true) {
            long j10 = jArr2[i14];
            int i16 = i14;
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i17 = 8;
                int i18 = 8 - ((~(i16 - length)) >>> 31);
                int i19 = 0;
                while (i19 < i18) {
                    if ((j10 & 255) < 128) {
                        int i20 = (i16 << 3) + i19;
                        Object obj2 = objArr[i20];
                        float f10 = fArr[i20];
                        if (i15 == i13) {
                            sb2.append(truncated);
                            break loop0;
                        }
                        if (i15 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append((CharSequence) transform.invoke(obj2, Float.valueOf(f10)));
                        i15++;
                        i12 = 8;
                    } else {
                        i12 = i17;
                    }
                    j10 >>= i12;
                    i19++;
                    i17 = i12;
                    jArr2 = jArr2;
                }
                jArr = jArr2;
                if (i18 == i17) {
                }
                sb2.append(postfix);
                break;
            }
            jArr = jArr2;
            if (i16 == length) {
                sb2.append(postfix);
                break;
            }
            i14 = i16 + 1;
            jArr2 = jArr;
        }
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @kotlin.r0
    public static /* synthetic */ void p() {
    }

    @kotlin.r0
    public static /* synthetic */ void q() {
    }

    @kotlin.r0
    public static /* synthetic */ void u() {
    }

    public static /* synthetic */ void v() {
    }

    public static /* synthetic */ void w() {
    }

    @dl.d
    @xh.i
    public final String A(@dl.d CharSequence separator) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        return L(this, separator, null, null, 0, null, 30, null);
    }

    @dl.d
    @xh.i
    public final String B(@dl.d CharSequence separator, @dl.d CharSequence prefix) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        return L(this, separator, prefix, null, 0, null, 28, null);
    }

    @dl.d
    @xh.i
    public final String C(@dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        return L(this, separator, prefix, postfix, 0, null, 24, null);
    }

    @dl.d
    @xh.i
    public final String D(@dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        return L(this, separator, prefix, postfix, i10, null, 16, null);
    }

    @dl.d
    @xh.i
    public final String E(@dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated) {
        Object[] objArr;
        int i11;
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        Object[] objArr2 = this.f3767b;
        float[] fArr = this.f3768c;
        long[] jArr = this.f3766a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i12 = 0;
        int i13 = 0;
        loop0: while (true) {
            long j10 = jArr[i12];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8;
                int i15 = 8 - ((~(i12 - length)) >>> 31);
                int i16 = 0;
                while (i16 < i15) {
                    if ((j10 & 255) < 128) {
                        int i17 = (i12 << 3) + i16;
                        Object obj = objArr2[i17];
                        float f10 = fArr[i17];
                        if (i13 == i10) {
                            sb2.append(truncated);
                            break loop0;
                        }
                        if (i13 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(obj);
                        sb2.append(n5.a.f132013h);
                        sb2.append(f10);
                        i13++;
                        i11 = 8;
                    } else {
                        i11 = i14;
                    }
                    j10 >>= i11;
                    i16++;
                    i14 = i11;
                    objArr2 = objArr2;
                }
                objArr = objArr2;
                if (i15 == i14) {
                }
                sb2.append(postfix);
                break;
            }
            objArr = objArr2;
            if (i12 == length) {
                sb2.append(postfix);
                break;
            }
            i12++;
            objArr2 = objArr;
        }
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @dl.d
    @xh.i
    public final String F(@dl.d CharSequence charSequence, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated, @dl.d yh.p<? super K, ? super Float, ? extends CharSequence> transform) {
        Object[] objArr;
        CharSequence separator = charSequence;
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        kotlin.jvm.internal.f0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        Object[] objArr2 = this.f3767b;
        float[] fArr = this.f3768c;
        long[] jArr = this.f3766a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j10 = jArr[i11];
            int i13 = i11;
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j10 & 255) < 128) {
                        int i16 = (i13 << 3) + i15;
                        Object obj = objArr2[i16];
                        float f10 = fArr[i16];
                        if (i12 == i10) {
                            sb2.append(truncated);
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(obj, Float.valueOf(f10)));
                        i12++;
                    }
                    j10 >>= 8;
                    i15++;
                    separator = charSequence;
                    objArr2 = objArr2;
                }
                objArr = objArr2;
                if (i14 == 8) {
                }
                sb2.append(postfix);
                break;
            }
            objArr = objArr2;
            if (i13 == length) {
                sb2.append(postfix);
                break;
            }
            i11 = i13 + 1;
            separator = charSequence;
            objArr2 = objArr;
        }
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0097 A[DONT_INVERT, PHI: r11
  0x0097: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x0044, B:23:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0099 A[LOOP:0: B:5:0x0033->B:25:0x0099, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x009e A[SYNTHETIC] */
    @dl.d
    @xh.i
    public final String G(@dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d yh.p<? super K, ? super Float, ? extends CharSequence> transform) {
        int i11;
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        Object[] objArr = this.f3767b;
        float[] fArr = this.f3768c;
        long[] jArr = this.f3766a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i12 = 0;
        int i13 = 0;
        loop0: while (true) {
            long j10 = jArr[i12];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i12 == length) {
                    sb2.append(postfix);
                    break;
                }
                i12++;
            } else {
                int i14 = 8;
                int i15 = 8 - ((~(i12 - length)) >>> 31);
                int i16 = 0;
                while (i16 < i15) {
                    if ((j10 & 255) < 128) {
                        int i17 = (i12 << 3) + i16;
                        Object obj = objArr[i17];
                        float f10 = fArr[i17];
                        if (i13 == i10) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i13 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(obj, Float.valueOf(f10)));
                        i13++;
                        i11 = 8;
                    } else {
                        i11 = i14;
                    }
                    j10 >>= i11;
                    i16++;
                    i14 = i11;
                }
                if (i15 == i14) {
                    if (i12 == length) {
                        i12++;
                    }
                }
                sb2.append(postfix);
                break;
            }
        }
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0096 A[DONT_INVERT, PHI: r11
  0x0096: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x0044, B:23:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0098 A[LOOP:0: B:5:0x0033->B:25:0x0098, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x009d A[SYNTHETIC] */
    @dl.d
    @xh.i
    public final String H(@dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, @dl.d yh.p<? super K, ? super Float, ? extends CharSequence> transform) {
        int i10;
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        Object[] objArr = this.f3767b;
        float[] fArr = this.f3768c;
        long[] jArr = this.f3766a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j10 = jArr[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i11 == length) {
                    sb2.append(postfix);
                    break;
                }
                i11++;
            } else {
                int i13 = 8;
                int i14 = 8 - ((~(i11 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j10 & 255) < 128) {
                        int i16 = (i11 << 3) + i15;
                        Object obj = objArr[i16];
                        float f10 = fArr[i16];
                        if (i12 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(obj, Float.valueOf(f10)));
                        i12++;
                        i10 = 8;
                    } else {
                        i10 = i13;
                    }
                    j10 >>= i10;
                    i15++;
                    i13 = i10;
                }
                if (i14 == i13) {
                    if (i11 == length) {
                        i11++;
                    }
                }
                sb2.append(postfix);
                break;
            }
        }
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008a A[DONT_INVERT, PHI: r10
  0x008a: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x003a, B:23:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x008c A[LOOP:0: B:5:0x002c->B:25:0x008c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x008f A[SYNTHETIC] */
    @dl.d
    @xh.i
    public final String I(@dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d yh.p<? super K, ? super Float, ? extends CharSequence> transform) {
        int i10;
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        Object[] objArr = this.f3767b;
        float[] fArr = this.f3768c;
        long[] jArr = this.f3766a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb2.append((CharSequence) "");
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j10 = jArr[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i11 == length) {
                    sb2.append((CharSequence) "");
                    break;
                }
                i11++;
            } else {
                int i13 = 8;
                int i14 = 8 - ((~(i11 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j10 & 255) < 128) {
                        int i16 = (i11 << 3) + i15;
                        Object obj = objArr[i16];
                        float f10 = fArr[i16];
                        if (i12 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(obj, Float.valueOf(f10)));
                        i12++;
                        i10 = 8;
                    } else {
                        i10 = i13;
                    }
                    j10 >>= i10;
                    i15++;
                    i13 = i10;
                }
                if (i14 == i13) {
                    if (i11 == length) {
                        i11++;
                    }
                }
                sb2.append((CharSequence) "");
                break;
            }
        }
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008a A[DONT_INVERT, PHI: r11
  0x008a: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x0038, B:23:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x008c A[LOOP:0: B:5:0x0027->B:25:0x008c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0091 A[SYNTHETIC] */
    @dl.d
    @xh.i
    public final String J(@dl.d CharSequence separator, @dl.d yh.p<? super K, ? super Float, ? extends CharSequence> transform) {
        int i10;
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        Object[] objArr = this.f3767b;
        float[] fArr = this.f3768c;
        long[] jArr = this.f3766a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb2.append((CharSequence) "");
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j10 = jArr[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i11 == length) {
                    sb2.append((CharSequence) "");
                    break;
                }
                i11++;
            } else {
                int i13 = 8;
                int i14 = 8 - ((~(i11 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j10 & 255) < 128) {
                        int i16 = (i11 << 3) + i15;
                        Object obj = objArr[i16];
                        float f10 = fArr[i16];
                        if (i12 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(obj, Float.valueOf(f10)));
                        i12++;
                        i10 = 8;
                    } else {
                        i10 = i13;
                    }
                    j10 >>= i10;
                    i15++;
                    i13 = i10;
                }
                if (i14 == i13) {
                    if (i11 == length) {
                        i11++;
                    }
                }
                sb2.append((CharSequence) "");
                break;
            }
        }
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0080 A[DONT_INVERT, PHI: r10
  0x0080: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x002e, B:23:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0082 A[LOOP:0: B:5:0x0020->B:25:0x0082, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0085 A[SYNTHETIC] */
    @dl.d
    @xh.i
    public final String K(@dl.d yh.p<? super K, ? super Float, ? extends CharSequence> transform) {
        int i10;
        kotlin.jvm.internal.f0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        Object[] objArr = this.f3767b;
        float[] fArr = this.f3768c;
        long[] jArr = this.f3766a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb2.append((CharSequence) "");
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j10 = jArr[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i11 == length) {
                    sb2.append((CharSequence) "");
                    break;
                }
                i11++;
            } else {
                int i13 = 8;
                int i14 = 8 - ((~(i11 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j10 & 255) < 128) {
                        int i16 = (i11 << 3) + i15;
                        Object obj = objArr[i16];
                        float f10 = fArr[i16];
                        if (i12 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append((CharSequence) ", ");
                        }
                        sb2.append(transform.invoke(obj, Float.valueOf(f10)));
                        i12++;
                        i10 = 8;
                    } else {
                        i10 = i13;
                    }
                    j10 >>= i10;
                    i15++;
                    i13 = i10;
                }
                if (i14 == i13) {
                    if (i11 == length) {
                        i11++;
                    }
                }
                sb2.append((CharSequence) "");
                break;
            }
        }
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final boolean N() {
        return this.f3770e == 0;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0061 A[LOOP:0: B:5:0x0017->B:20:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0064 A[SYNTHETIC] */
    public final boolean a(@dl.d yh.p<? super K, ? super Float, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        Object[] objArr = this.f3767b;
        float[] fArr = this.f3768c;
        long[] jArr = this.f3766a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (!predicate.invoke(objArr[i13], Float.valueOf(fArr[i13])).booleanValue()) {
                                return false;
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
        return true;
    }

    public final boolean b() {
        return this.f3770e != 0;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0061 A[LOOP:0: B:5:0x0016->B:20:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0064 A[SYNTHETIC] */
    public final boolean c(@dl.d yh.p<? super K, ? super Float, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        Object[] objArr = this.f3767b;
        float[] fArr = this.f3768c;
        long[] jArr = this.f3766a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (predicate.invoke(objArr[i13], Float.valueOf(fArr[i13])).booleanValue()) {
                                return true;
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
        return false;
    }

    public final boolean d(K k10) {
        return i(k10) >= 0;
    }

    public final boolean e(K k10) {
        return i(k10) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x006e A[LOOP:0: B:14:0x0027->B:32:0x006e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(@dl.e Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        if (z1Var.t() != t()) {
            return false;
        }
        Object[] objArr = this.f3767b;
        float[] fArr = this.f3768c;
        long[] jArr = this.f3766a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (!(fArr[i13] == z1Var.n(objArr[i13]))) {
                                return false;
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
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x004d A[LOOP:0: B:5:0x000b->B:23:0x004d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0050 A[SYNTHETIC] */
    public final boolean f(float f10) {
        float[] fArr = this.f3768c;
        long[] jArr = this.f3766a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            if (f10 == fArr[(i10 << 3) + i12]) {
                                return true;
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
        return false;
    }

    public final int g() {
        return t();
    }

    public final int h(@dl.d yh.p<? super K, ? super Float, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        Object[] objArr = this.f3767b;
        float[] fArr = this.f3768c;
        long[] jArr = this.f3766a;
        int length = jArr.length - 2;
        int i10 = 0;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j10) < 128) {
                            int i15 = (i11 << 3) + i14;
                            if (predicate.invoke(objArr[i15], Float.valueOf(fArr[i15])).booleanValue()) {
                                i12++;
                            }
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

    public int hashCode() {
        Object[] objArr = this.f3767b;
        float[] fArr = this.f3768c;
        long[] jArr = this.f3766a;
        int length = jArr.length - 2;
        int i10 = 0;
        if (length >= 0) {
            int i11 = 0;
            int iFloatToIntBits = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i11 << 3) + i13;
                            Object obj = objArr[i14];
                            iFloatToIntBits += Float.floatToIntBits(fArr[i14]) ^ (obj != null ? obj.hashCode() : 0);
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        return iFloatToIntBits;
                    }
                }
                if (i11 != length) {
                    i11++;
                } else {
                    i10 = iFloatToIntBits;
                }
            }
        }
        return i10;
    }

    @kotlin.r0
    public final int i(K k10) {
        int iHashCode = (k10 != null ? k10.hashCode() : 0) * h2.f3616j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f3769d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f3766a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * h2.f3617k) ^ j10;
            long j12 = (~j11) & (j11 - h2.f3617k) & (-9187201950435737472L);
            while (true) {
                if (j12 != 0) {
                    int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                    if (kotlin.jvm.internal.f0.g(this.f3767b[iNumberOfTrailingZeros], k10)) {
                        return iNumberOfTrailingZeros;
                    }
                    j12 &= j12 - 1;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
    }

    public final void j(@dl.d yh.p<? super K, ? super Float, kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        Object[] objArr = this.f3767b;
        float[] fArr = this.f3768c;
        long[] jArr = this.f3766a;
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
                        int i13 = (i10 << 3) + i12;
                        block.invoke(objArr[i13], Float.valueOf(fArr[i13]));
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
        long[] jArr = this.f3766a;
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

    public final void l(@dl.d yh.l<? super K, kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        Object[] objArr = this.f3767b;
        long[] jArr = this.f3766a;
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
                        block.invoke(objArr[(i10 << 3) + i12]);
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

    public final void m(@dl.d yh.l<? super Float, kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        float[] fArr = this.f3768c;
        long[] jArr = this.f3766a;
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
                        block.invoke(Float.valueOf(fArr[(i10 << 3) + i12]));
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

    public final float n(K k10) {
        int i10 = i(k10);
        if (i10 >= 0) {
            return this.f3768c[i10];
        }
        throw new NoSuchElementException("There is no key " + k10 + " in the map");
    }

    public final int o() {
        return this.f3769d;
    }

    public final float r(K k10, float f10) {
        int i10 = i(k10);
        return i10 >= 0 ? this.f3768c[i10] : f10;
    }

    public final float s(K k10, @dl.d yh.a<Float> defaultValue) {
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        int i10 = i(k10);
        return i10 >= 0 ? this.f3768c[i10] : defaultValue.invoke().floatValue();
    }

    public final int t() {
        return this.f3770e;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0079 A[DONT_INVERT, PHI: r8
  0x0079: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x0031, B:25:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x007b A[LOOP:0: B:9:0x0023->B:27:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x007e A[EDGE_INSN: B:31:0x007e->B:28:0x007e BREAK  A[LOOP:0: B:9:0x0023->B:27:0x007b], SYNTHETIC] */
    @dl.d
    public String toString() {
        if (x()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('{');
        Object[] objArr = this.f3767b;
        float[] fArr = this.f3768c;
        long[] jArr = this.f3766a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i10 << 3) + i13;
                            Object obj = objArr[i14];
                            float f10 = fArr[i14];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                            sb2.append(f10);
                            i11++;
                            if (i11 < this.f3770e) {
                                sb2.append(',');
                                sb2.append(' ');
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "s.append('}').toString()");
        return string;
    }

    public final boolean x() {
        return this.f3770e == 0;
    }

    public final boolean y() {
        return this.f3770e != 0;
    }

    @dl.d
    @xh.i
    public final String z() {
        return L(this, null, null, null, 0, null, 31, null);
    }
}
