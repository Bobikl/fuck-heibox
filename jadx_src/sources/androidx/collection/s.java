package androidx.collection;

import com.huawei.hms.framework.common.ContainerUtils;

/* JADX INFO: compiled from: FloatObjectMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nFloatObjectMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatObjectMap.kt\nandroidx/collection/FloatObjectMap\n+ 2 FloatSet.kt\nandroidx/collection/FloatSetKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1034:1\n619#1:1035\n620#1:1039\n622#1,2:1041\n624#1,4:1044\n628#1:1051\n629#1:1055\n630#1:1057\n631#1,4:1060\n637#1:1065\n638#1,8:1067\n619#1:1075\n620#1:1079\n622#1,2:1081\n624#1,4:1084\n628#1:1091\n629#1:1095\n630#1:1097\n631#1,4:1100\n637#1:1105\n638#1,8:1107\n354#1,6:1117\n364#1,3:1124\n367#1,9:1128\n354#1,6:1137\n364#1,3:1144\n367#1,9:1148\n354#1,6:1157\n364#1,3:1164\n367#1,9:1168\n382#1,4:1177\n354#1,6:1181\n364#1,3:1188\n367#1,2:1192\n387#1,2:1194\n370#1,6:1196\n389#1:1202\n382#1,4:1203\n354#1,6:1207\n364#1,3:1214\n367#1,2:1218\n387#1,2:1220\n370#1,6:1222\n389#1:1228\n382#1,4:1229\n354#1,6:1233\n364#1,3:1240\n367#1,2:1244\n387#1,2:1246\n370#1,6:1248\n389#1:1254\n619#1:1255\n620#1:1259\n622#1,2:1261\n624#1,4:1264\n628#1:1271\n629#1:1275\n630#1:1277\n631#1,4:1280\n637#1:1285\n638#1,8:1287\n619#1:1295\n620#1:1299\n622#1,2:1301\n624#1,4:1304\n628#1:1311\n629#1:1315\n630#1:1317\n631#1,4:1320\n637#1:1325\n638#1,8:1327\n408#1,3:1335\n354#1,6:1338\n364#1,3:1345\n367#1,2:1349\n412#1,2:1351\n370#1,6:1353\n414#1:1359\n382#1,4:1360\n354#1,6:1364\n364#1,3:1371\n367#1,2:1375\n387#1,2:1377\n370#1,6:1379\n389#1:1385\n382#1,4:1386\n354#1,6:1390\n364#1,3:1397\n367#1,2:1401\n387#1,2:1403\n370#1,6:1405\n389#1:1411\n382#1,4:1412\n354#1,6:1416\n364#1,3:1423\n367#1,2:1427\n387#1,2:1429\n370#1,6:1431\n389#1:1437\n382#1,4:1438\n354#1,6:1442\n364#1,3:1449\n367#1,2:1453\n387#1,2:1455\n370#1,6:1457\n389#1:1463\n382#1,4:1464\n354#1,6:1468\n364#1,3:1475\n367#1,2:1479\n387#1,2:1481\n370#1,6:1483\n389#1:1489\n382#1,4:1490\n354#1,6:1494\n364#1,3:1501\n367#1,2:1505\n387#1,2:1507\n370#1,6:1509\n389#1:1515\n518#1,11:1532\n382#1,4:1543\n354#1,6:1547\n364#1,3:1554\n367#1,2:1558\n387#1:1560\n529#1,10:1561\n388#1:1571\n370#1,6:1572\n389#1:1578\n539#1,2:1579\n518#1,11:1581\n382#1,4:1592\n354#1,6:1596\n364#1,3:1603\n367#1,2:1607\n387#1:1609\n529#1,10:1610\n388#1:1620\n370#1,6:1621\n389#1:1627\n539#1,2:1628\n518#1,11:1630\n382#1,4:1641\n354#1,6:1645\n364#1,3:1652\n367#1,2:1656\n387#1:1658\n529#1,10:1659\n388#1:1669\n370#1,6:1670\n389#1:1676\n539#1,2:1677\n518#1,11:1679\n382#1,4:1690\n354#1,6:1694\n364#1,3:1701\n367#1,2:1705\n387#1:1707\n529#1,10:1708\n388#1:1718\n370#1,6:1719\n389#1:1725\n539#1,2:1726\n518#1,11:1728\n382#1,4:1739\n354#1,6:1743\n364#1,3:1750\n367#1,2:1754\n387#1:1756\n529#1,10:1757\n388#1:1767\n370#1,6:1768\n389#1:1774\n539#1,2:1775\n849#2,3:1036\n849#2,3:1076\n849#2,3:1256\n849#2,3:1296\n849#2,3:1516\n1619#3:1040\n1615#3:1043\n1795#3,3:1048\n1809#3,3:1052\n1733#3:1056\n1721#3:1058\n1715#3:1059\n1728#3:1064\n1818#3:1066\n1619#3:1080\n1615#3:1083\n1795#3,3:1088\n1809#3,3:1092\n1733#3:1096\n1721#3:1098\n1715#3:1099\n1728#3:1104\n1818#3:1106\n1826#3:1115\n1688#3:1116\n1826#3:1123\n1688#3:1127\n1826#3:1143\n1688#3:1147\n1826#3:1163\n1688#3:1167\n1826#3:1187\n1688#3:1191\n1826#3:1213\n1688#3:1217\n1826#3:1239\n1688#3:1243\n1619#3:1260\n1615#3:1263\n1795#3,3:1268\n1809#3,3:1272\n1733#3:1276\n1721#3:1278\n1715#3:1279\n1728#3:1284\n1818#3:1286\n1619#3:1300\n1615#3:1303\n1795#3,3:1308\n1809#3,3:1312\n1733#3:1316\n1721#3:1318\n1715#3:1319\n1728#3:1324\n1818#3:1326\n1826#3:1344\n1688#3:1348\n1826#3:1370\n1688#3:1374\n1826#3:1396\n1688#3:1400\n1826#3:1422\n1688#3:1426\n1826#3:1448\n1688#3:1452\n1826#3:1474\n1688#3:1478\n1826#3:1500\n1688#3:1504\n1619#3:1519\n1615#3:1520\n1795#3,3:1521\n1809#3,3:1524\n1733#3:1527\n1721#3:1528\n1715#3:1529\n1728#3:1530\n1818#3:1531\n1826#3:1553\n1688#3:1557\n1826#3:1602\n1688#3:1606\n1826#3:1651\n1688#3:1655\n1826#3:1700\n1688#3:1704\n1826#3:1749\n1688#3:1753\n*S KotlinDebug\n*F\n+ 1 FloatObjectMap.kt\nandroidx/collection/FloatObjectMap\n*L\n321#1:1035\n321#1:1039\n321#1:1041,2\n321#1:1044,4\n321#1:1051\n321#1:1055\n321#1:1057\n321#1:1060,4\n321#1:1065\n321#1:1067,8\n331#1:1075\n331#1:1079\n331#1:1081,2\n331#1:1084,4\n331#1:1091\n331#1:1095\n331#1:1097\n331#1:1100,4\n331#1:1105\n331#1:1107,8\n385#1:1117,6\n385#1:1124,3\n385#1:1128,9\n398#1:1137,6\n398#1:1144,3\n398#1:1148,9\n410#1:1157,6\n410#1:1164,3\n410#1:1168,9\n420#1:1177,4\n420#1:1181,6\n420#1:1188,3\n420#1:1192,2\n420#1:1194,2\n420#1:1196,6\n420#1:1202\n430#1:1203,4\n430#1:1207,6\n430#1:1214,3\n430#1:1218,2\n430#1:1220,2\n430#1:1222,6\n430#1:1228\n446#1:1229,4\n446#1:1233,6\n446#1:1240,3\n446#1:1244,2\n446#1:1246,2\n446#1:1248,6\n446#1:1254\n456#1:1255\n456#1:1259\n456#1:1261,2\n456#1:1264,4\n456#1:1271\n456#1:1275\n456#1:1277\n456#1:1280,4\n456#1:1285\n456#1:1287,8\n462#1:1295\n462#1:1299\n462#1:1301,2\n462#1:1304,4\n462#1:1311\n462#1:1315\n462#1:1317\n462#1:1320,4\n462#1:1325\n462#1:1327,8\n469#1:1335,3\n469#1:1338,6\n469#1:1345,3\n469#1:1349,2\n469#1:1351,2\n469#1:1353,6\n469#1:1359\n493#1:1360,4\n493#1:1364,6\n493#1:1371,3\n493#1:1375,2\n493#1:1377,2\n493#1:1379,6\n493#1:1385\n528#1:1386,4\n528#1:1390,6\n528#1:1397,3\n528#1:1401,2\n528#1:1403,2\n528#1:1405,6\n528#1:1411\n528#1:1412,4\n528#1:1416,6\n528#1:1423,3\n528#1:1427,2\n528#1:1429,2\n528#1:1431,6\n528#1:1437\n549#1:1438,4\n549#1:1442,6\n549#1:1449,3\n549#1:1453,2\n549#1:1455,2\n549#1:1457,6\n549#1:1463\n575#1:1464,4\n575#1:1468,6\n575#1:1475,3\n575#1:1479,2\n575#1:1481,2\n575#1:1483,6\n575#1:1489\n601#1:1490,4\n601#1:1494,6\n601#1:1501,3\n601#1:1505,2\n601#1:1507,2\n601#1:1509,6\n601#1:1515\n-1#1:1532,11\n-1#1:1543,4\n-1#1:1547,6\n-1#1:1554,3\n-1#1:1558,2\n-1#1:1560\n-1#1:1561,10\n-1#1:1571\n-1#1:1572,6\n-1#1:1578\n-1#1:1579,2\n-1#1:1581,11\n-1#1:1592,4\n-1#1:1596,6\n-1#1:1603,3\n-1#1:1607,2\n-1#1:1609\n-1#1:1610,10\n-1#1:1620\n-1#1:1621,6\n-1#1:1627\n-1#1:1628,2\n-1#1:1630,11\n-1#1:1641,4\n-1#1:1645,6\n-1#1:1652,3\n-1#1:1656,2\n-1#1:1658\n-1#1:1659,10\n-1#1:1669\n-1#1:1670,6\n-1#1:1676\n-1#1:1677,2\n-1#1:1679,11\n-1#1:1690,4\n-1#1:1694,6\n-1#1:1701,3\n-1#1:1705,2\n-1#1:1707\n-1#1:1708,10\n-1#1:1718\n-1#1:1719,6\n-1#1:1725\n-1#1:1726,2\n-1#1:1728,11\n-1#1:1739,4\n-1#1:1743,6\n-1#1:1750,3\n-1#1:1754,2\n-1#1:1756\n-1#1:1757,10\n-1#1:1767\n-1#1:1768,6\n-1#1:1774\n-1#1:1775,2\n321#1:1036,3\n331#1:1076,3\n456#1:1256,3\n462#1:1296,3\n619#1:1516,3\n321#1:1040\n321#1:1043\n321#1:1048,3\n321#1:1052,3\n321#1:1056\n321#1:1058\n321#1:1059\n321#1:1064\n321#1:1066\n331#1:1080\n331#1:1083\n331#1:1088,3\n331#1:1092,3\n331#1:1096\n331#1:1098\n331#1:1099\n331#1:1104\n331#1:1106\n359#1:1115\n366#1:1116\n385#1:1123\n385#1:1127\n398#1:1143\n398#1:1147\n410#1:1163\n410#1:1167\n420#1:1187\n420#1:1191\n430#1:1213\n430#1:1217\n446#1:1239\n446#1:1243\n456#1:1260\n456#1:1263\n456#1:1268,3\n456#1:1272,3\n456#1:1276\n456#1:1278\n456#1:1279\n456#1:1284\n456#1:1286\n462#1:1300\n462#1:1303\n462#1:1308,3\n462#1:1312,3\n462#1:1316\n462#1:1318\n462#1:1319\n462#1:1324\n462#1:1326\n469#1:1344\n469#1:1348\n493#1:1370\n493#1:1374\n528#1:1396\n528#1:1400\n528#1:1422\n528#1:1426\n549#1:1448\n549#1:1452\n575#1:1474\n575#1:1478\n601#1:1500\n601#1:1504\n620#1:1519\n623#1:1520\n627#1:1521,3\n628#1:1524,3\n629#1:1527\n630#1:1528\n630#1:1529\n634#1:1530\n637#1:1531\n-1#1:1553\n-1#1:1557\n-1#1:1602\n-1#1:1606\n-1#1:1651\n-1#1:1655\n-1#1:1700\n-1#1:1704\n-1#1:1749\n-1#1:1753\n*E\n"})
public abstract class s<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    @xh.e
    public long[] f3693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    @xh.e
    public float[] f3694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    @xh.e
    public Object[] f3695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @xh.e
    public int f3696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @xh.e
    public int f3697e;

    private s() {
        this.f3693a = h2.f3611e;
        this.f3694b = v.g();
        this.f3695c = i0.a.f119208c;
    }

    public /* synthetic */ s(kotlin.jvm.internal.u uVar) {
        this();
    }

    public static /* synthetic */ String L(s sVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
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
        return sVar.E(charSequence, charSequence5, charSequence6, i12, charSequence4);
    }

    public static /* synthetic */ String M(s sVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, yh.p transform, int i11, Object obj) {
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
        float[] fArr = sVar.f3694b;
        Object[] objArr = sVar.f3695c;
        long[] jArr2 = sVar.f3693a;
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
                        float f10 = fArr[i20];
                        Object obj2 = objArr[i20];
                        if (i15 == i13) {
                            sb2.append(truncated);
                            break loop0;
                        }
                        if (i15 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append((CharSequence) transform.invoke(Float.valueOf(f10), obj2));
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
        float[] fArr;
        int i11;
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        float[] fArr2 = this.f3694b;
        Object[] objArr = this.f3695c;
        long[] jArr = this.f3693a;
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
                        float f10 = fArr2[i17];
                        Object obj = objArr[i17];
                        if (i13 == i10) {
                            sb2.append(truncated);
                            break loop0;
                        }
                        if (i13 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(f10);
                        sb2.append(n5.a.f132013h);
                        sb2.append(obj);
                        i13++;
                        i11 = 8;
                    } else {
                        i11 = i14;
                    }
                    j10 >>= i11;
                    i16++;
                    i14 = i11;
                    fArr2 = fArr2;
                }
                fArr = fArr2;
                if (i15 == i14) {
                }
                sb2.append(postfix);
                break;
            }
            fArr = fArr2;
            if (i12 == length) {
                sb2.append(postfix);
                break;
            }
            i12++;
            fArr2 = fArr;
        }
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @dl.d
    @xh.i
    public final String F(@dl.d CharSequence charSequence, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated, @dl.d yh.p<? super Float, ? super V, ? extends CharSequence> transform) {
        float[] fArr;
        CharSequence separator = charSequence;
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        kotlin.jvm.internal.f0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        float[] fArr2 = this.f3694b;
        Object[] objArr = this.f3695c;
        long[] jArr = this.f3693a;
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
                        float f10 = fArr2[i16];
                        Object obj = objArr[i16];
                        if (i12 == i10) {
                            sb2.append(truncated);
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Float.valueOf(f10), obj));
                        i12++;
                    }
                    j10 >>= 8;
                    i15++;
                    separator = charSequence;
                    fArr2 = fArr2;
                }
                fArr = fArr2;
                if (i14 == 8) {
                }
                sb2.append(postfix);
                break;
            }
            fArr = fArr2;
            if (i13 == length) {
                sb2.append(postfix);
                break;
            }
            i11 = i13 + 1;
            separator = charSequence;
            fArr2 = fArr;
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
    public final String G(@dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d yh.p<? super Float, ? super V, ? extends CharSequence> transform) {
        int i11;
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        float[] fArr = this.f3694b;
        Object[] objArr = this.f3695c;
        long[] jArr = this.f3693a;
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
                        float f10 = fArr[i17];
                        Object obj = objArr[i17];
                        if (i13 == i10) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i13 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Float.valueOf(f10), obj));
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
    public final String H(@dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, @dl.d yh.p<? super Float, ? super V, ? extends CharSequence> transform) {
        int i10;
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        float[] fArr = this.f3694b;
        Object[] objArr = this.f3695c;
        long[] jArr = this.f3693a;
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
                        float f10 = fArr[i16];
                        Object obj = objArr[i16];
                        if (i12 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Float.valueOf(f10), obj));
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
    public final String I(@dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d yh.p<? super Float, ? super V, ? extends CharSequence> transform) {
        int i10;
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        float[] fArr = this.f3694b;
        Object[] objArr = this.f3695c;
        long[] jArr = this.f3693a;
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
                        float f10 = fArr[i16];
                        Object obj = objArr[i16];
                        if (i12 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Float.valueOf(f10), obj));
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
    public final String J(@dl.d CharSequence separator, @dl.d yh.p<? super Float, ? super V, ? extends CharSequence> transform) {
        int i10;
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        float[] fArr = this.f3694b;
        Object[] objArr = this.f3695c;
        long[] jArr = this.f3693a;
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
                        float f10 = fArr[i16];
                        Object obj = objArr[i16];
                        if (i12 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Float.valueOf(f10), obj));
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
    public final String K(@dl.d yh.p<? super Float, ? super V, ? extends CharSequence> transform) {
        int i10;
        kotlin.jvm.internal.f0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        float[] fArr = this.f3694b;
        Object[] objArr = this.f3695c;
        long[] jArr = this.f3693a;
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
                        float f10 = fArr[i16];
                        Object obj = objArr[i16];
                        if (i12 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append((CharSequence) ", ");
                        }
                        sb2.append(transform.invoke(Float.valueOf(f10), obj));
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
        return this.f3697e == 0;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0061 A[LOOP:0: B:5:0x0017->B:20:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0064 A[SYNTHETIC] */
    public final boolean a(@dl.d yh.p<? super Float, ? super V, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        float[] fArr = this.f3694b;
        Object[] objArr = this.f3695c;
        long[] jArr = this.f3693a;
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
                            if (!predicate.invoke(Float.valueOf(fArr[i13]), objArr[i13]).booleanValue()) {
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
        return this.f3697e != 0;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0061 A[LOOP:0: B:5:0x0016->B:20:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0064 A[SYNTHETIC] */
    public final boolean c(@dl.d yh.p<? super Float, ? super V, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        float[] fArr = this.f3694b;
        Object[] objArr = this.f3695c;
        long[] jArr = this.f3693a;
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
                            if (predicate.invoke(Float.valueOf(fArr[i13]), objArr[i13]).booleanValue()) {
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

    public final boolean d(float f10) {
        int iNumberOfTrailingZeros;
        int iFloatToIntBits = Float.floatToIntBits(f10) * h2.f3616j;
        int i10 = iFloatToIntBits ^ (iFloatToIntBits << 16);
        int i11 = i10 & 127;
        int i12 = this.f3696d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f3693a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * h2.f3617k) ^ j10;
            long j12 = (~j11) & (j11 - h2.f3617k) & (-9187201950435737472L);
            while (true) {
                if (j12 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                    if (this.f3694b[iNumberOfTrailingZeros] == f10) {
                        break loop0;
                    }
                    j12 &= j12 - 1;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final boolean e(float f10) {
        int iNumberOfTrailingZeros;
        int iFloatToIntBits = Float.floatToIntBits(f10) * h2.f3616j;
        int i10 = iFloatToIntBits ^ (iFloatToIntBits << 16);
        int i11 = i10 & 127;
        int i12 = this.f3696d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f3693a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * h2.f3617k) ^ j10;
            long j12 = (~j11) & (j11 - h2.f3617k) & (-9187201950435737472L);
            while (true) {
                if (j12 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                    if (this.f3694b[iNumberOfTrailingZeros] == f10) {
                        break loop0;
                    }
                    j12 &= j12 - 1;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x007a A[LOOP:0: B:14:0x0027->B:36:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x007d A[SYNTHETIC] */
    public boolean equals(@dl.e Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (sVar.t() != t()) {
            return false;
        }
        float[] fArr = this.f3694b;
        Object[] objArr = this.f3695c;
        long[] jArr = this.f3693a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            loop0: while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            float f10 = fArr[i13];
                            Object obj2 = objArr[i13];
                            if (obj2 == null) {
                                if (sVar.n(f10) != null || !sVar.e(f10)) {
                                    break loop0;
                                }
                            } else if (!kotlin.jvm.internal.f0.g(obj2, sVar.n(f10))) {
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
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x004a A[LOOP:0: B:5:0x000b->B:20:0x004a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x004d A[SYNTHETIC] */
    public final boolean f(V v10) {
        Object[] objArr = this.f3695c;
        long[] jArr = this.f3693a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (((255 & j10) < 128) && kotlin.jvm.internal.f0.g(v10, objArr[(i10 << 3) + i12])) {
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

    public final int g() {
        return t();
    }

    public final int h(@dl.d yh.p<? super Float, ? super V, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        float[] fArr = this.f3694b;
        Object[] objArr = this.f3695c;
        long[] jArr = this.f3693a;
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
                            if (predicate.invoke(Float.valueOf(fArr[i15]), objArr[i15]).booleanValue()) {
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
        float[] fArr = this.f3694b;
        Object[] objArr = this.f3695c;
        long[] jArr = this.f3693a;
        int length = jArr.length - 2;
        int i10 = 0;
        if (length >= 0) {
            int i11 = 0;
            int iHashCode = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i11 << 3) + i13;
                            float f10 = fArr[i14];
                            Object obj = objArr[i14];
                            iHashCode += (obj != null ? obj.hashCode() : 0) ^ Float.floatToIntBits(f10);
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        return iHashCode;
                    }
                }
                if (i11 != length) {
                    i11++;
                } else {
                    i10 = iHashCode;
                }
            }
        }
        return i10;
    }

    public final int i(float f10) {
        int iFloatToIntBits = Float.floatToIntBits(f10) * h2.f3616j;
        int i10 = iFloatToIntBits ^ (iFloatToIntBits << 16);
        int i11 = i10 & 127;
        int i12 = this.f3696d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f3693a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * h2.f3617k) ^ j10;
            long j12 = (~j11) & (j11 - h2.f3617k) & (-9187201950435737472L);
            while (true) {
                if (j12 != 0) {
                    int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                    if (this.f3694b[iNumberOfTrailingZeros] == f10) {
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

    public final void j(@dl.d yh.p<? super Float, ? super V, kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        float[] fArr = this.f3694b;
        Object[] objArr = this.f3695c;
        long[] jArr = this.f3693a;
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
                        block.invoke(Float.valueOf(fArr[i13]), objArr[i13]);
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
        long[] jArr = this.f3693a;
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

    public final void l(@dl.d yh.l<? super Float, kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        float[] fArr = this.f3694b;
        long[] jArr = this.f3693a;
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

    public final void m(@dl.d yh.l<? super V, kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        Object[] objArr = this.f3695c;
        long[] jArr = this.f3693a;
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

    @dl.e
    public final V n(float f10) {
        int iNumberOfTrailingZeros;
        int iFloatToIntBits = Float.floatToIntBits(f10) * h2.f3616j;
        int i10 = iFloatToIntBits ^ (iFloatToIntBits << 16);
        int i11 = i10 & 127;
        int i12 = this.f3696d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f3693a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * h2.f3617k) ^ j10;
            long j12 = (~j11) & (j11 - h2.f3617k) & (-9187201950435737472L);
            while (true) {
                if (j12 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                    if (this.f3694b[iNumberOfTrailingZeros] == f10) {
                        break loop0;
                    }
                    j12 &= j12 - 1;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return (V) this.f3695c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final int o() {
        return this.f3696d;
    }

    public final V r(float f10, V v10) {
        int iNumberOfTrailingZeros;
        int iFloatToIntBits = Float.floatToIntBits(f10) * h2.f3616j;
        int i10 = iFloatToIntBits ^ (iFloatToIntBits << 16);
        int i11 = i10 & 127;
        int i12 = this.f3696d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f3693a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * h2.f3617k) ^ j10;
            long j12 = (~j11) & (j11 - h2.f3617k) & (-9187201950435737472L);
            while (true) {
                if (j12 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                    if (this.f3694b[iNumberOfTrailingZeros] == f10) {
                        break loop0;
                    }
                    j12 &= j12 - 1;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        return iNumberOfTrailingZeros >= 0 ? (V) this.f3695c[iNumberOfTrailingZeros] : v10;
    }

    public final V s(float f10, @dl.d yh.a<? extends V> defaultValue) {
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        V vN = n(f10);
        return vN == null ? defaultValue.invoke() : vN;
    }

    public final int t() {
        return this.f3697e;
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
        float[] fArr = this.f3694b;
        Object[] objArr = this.f3695c;
        long[] jArr = this.f3693a;
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
                            float f10 = fArr[i14];
                            Object obj = objArr[i14];
                            sb2.append(f10);
                            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            i11++;
                            if (i11 < this.f3697e) {
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
        return this.f3697e == 0;
    }

    public final boolean y() {
        return this.f3697e != 0;
    }

    @dl.d
    @xh.i
    public final String z() {
        return L(this, null, null, null, 0, null, 31, null);
    }
}
