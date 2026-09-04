package androidx.collection;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: LongLongMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nLongLongMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongLongMap.kt\nandroidx/collection/LongLongMap\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 3 LongSet.kt\nandroidx/collection/LongSetKt\n*L\n1#1,1047:1\n357#1,6:1050\n367#1,3:1057\n370#1,9:1061\n357#1,6:1070\n367#1,3:1077\n370#1,9:1081\n357#1,6:1090\n367#1,3:1097\n370#1,9:1101\n385#1,4:1110\n357#1,6:1114\n367#1,3:1121\n370#1,2:1125\n389#1,2:1127\n373#1,6:1129\n391#1:1135\n385#1,4:1136\n357#1,6:1140\n367#1,3:1147\n370#1,2:1151\n389#1,2:1153\n373#1,6:1155\n391#1:1161\n385#1,4:1162\n357#1,6:1166\n367#1,3:1173\n370#1,2:1177\n389#1,2:1179\n373#1,6:1181\n391#1:1187\n410#1,3:1188\n357#1,6:1191\n367#1,3:1198\n370#1,2:1202\n413#1,2:1204\n373#1,6:1206\n415#1:1212\n385#1,4:1213\n357#1,6:1217\n367#1,3:1224\n370#1,2:1228\n389#1,2:1230\n373#1,6:1232\n391#1:1238\n385#1,4:1239\n357#1,6:1243\n367#1,3:1250\n370#1,2:1254\n389#1,2:1256\n373#1,6:1258\n391#1:1264\n385#1,4:1265\n357#1,6:1269\n367#1,3:1276\n370#1,2:1280\n389#1,2:1282\n373#1,6:1284\n391#1:1290\n385#1,4:1291\n357#1,6:1295\n367#1,3:1302\n370#1,2:1306\n389#1,2:1308\n373#1,6:1310\n391#1:1316\n385#1,4:1317\n357#1,6:1321\n367#1,3:1328\n370#1,2:1332\n389#1,2:1334\n373#1,6:1336\n391#1:1342\n385#1,4:1343\n357#1,6:1347\n367#1,3:1354\n370#1,2:1358\n389#1,2:1360\n373#1,6:1362\n391#1:1368\n519#1,11:1385\n385#1,4:1396\n357#1,6:1400\n367#1,3:1407\n370#1,2:1411\n389#1:1413\n530#1,10:1414\n390#1:1424\n373#1,6:1425\n391#1:1431\n540#1,2:1432\n519#1,11:1434\n385#1,4:1445\n357#1,6:1449\n367#1,3:1456\n370#1,2:1460\n389#1:1462\n530#1,10:1463\n390#1:1473\n373#1,6:1474\n391#1:1480\n540#1,2:1481\n519#1,11:1483\n385#1,4:1494\n357#1,6:1498\n367#1,3:1505\n370#1,2:1509\n389#1:1511\n530#1,10:1512\n390#1:1522\n373#1,6:1523\n391#1:1529\n540#1,2:1530\n519#1,11:1532\n385#1,4:1543\n357#1,6:1547\n367#1,3:1554\n370#1,2:1558\n389#1:1560\n530#1,10:1561\n390#1:1571\n373#1,6:1572\n391#1:1578\n540#1,2:1579\n519#1,11:1581\n385#1,4:1592\n357#1,6:1596\n367#1,3:1603\n370#1,2:1607\n389#1:1609\n530#1,10:1610\n390#1:1620\n373#1,6:1621\n391#1:1627\n540#1,2:1628\n1826#2:1048\n1688#2:1049\n1826#2:1056\n1688#2:1060\n1826#2:1076\n1688#2:1080\n1826#2:1096\n1688#2:1100\n1826#2:1120\n1688#2:1124\n1826#2:1146\n1688#2:1150\n1826#2:1172\n1688#2:1176\n1826#2:1197\n1688#2:1201\n1826#2:1223\n1688#2:1227\n1826#2:1249\n1688#2:1253\n1826#2:1275\n1688#2:1279\n1826#2:1301\n1688#2:1305\n1826#2:1327\n1688#2:1331\n1826#2:1353\n1688#2:1357\n1619#2:1372\n1615#2:1373\n1795#2,3:1374\n1809#2,3:1377\n1733#2:1380\n1721#2:1381\n1715#2:1382\n1728#2:1383\n1818#2:1384\n1826#2:1406\n1688#2:1410\n1826#2:1455\n1688#2:1459\n1826#2:1504\n1688#2:1508\n1826#2:1553\n1688#2:1557\n1826#2:1602\n1688#2:1606\n849#3,3:1369\n*S KotlinDebug\n*F\n+ 1 LongLongMap.kt\nandroidx/collection/LongLongMap\n*L\n388#1:1050,6\n388#1:1057,3\n388#1:1061,9\n400#1:1070,6\n400#1:1077,3\n400#1:1081,9\n412#1:1090,6\n412#1:1097,3\n412#1:1101,9\n421#1:1110,4\n421#1:1114,6\n421#1:1121,3\n421#1:1125,2\n421#1:1127,2\n421#1:1129,6\n421#1:1135\n431#1:1136,4\n431#1:1140,6\n431#1:1147,3\n431#1:1151,2\n431#1:1153,2\n431#1:1155,6\n431#1:1161\n447#1:1162,4\n447#1:1166,6\n447#1:1173,3\n447#1:1177,2\n447#1:1179,2\n447#1:1181,6\n447#1:1187\n470#1:1188,3\n470#1:1191,6\n470#1:1198,3\n470#1:1202,2\n470#1:1204,2\n470#1:1206,6\n470#1:1212\n494#1:1213,4\n494#1:1217,6\n494#1:1224,3\n494#1:1228,2\n494#1:1230,2\n494#1:1232,6\n494#1:1238\n529#1:1239,4\n529#1:1243,6\n529#1:1250,3\n529#1:1254,2\n529#1:1256,2\n529#1:1258,6\n529#1:1264\n529#1:1265,4\n529#1:1269,6\n529#1:1276,3\n529#1:1280,2\n529#1:1282,2\n529#1:1284,6\n529#1:1290\n550#1:1291,4\n550#1:1295,6\n550#1:1302,3\n550#1:1306,2\n550#1:1308,2\n550#1:1310,6\n550#1:1316\n576#1:1317,4\n576#1:1321,6\n576#1:1328,3\n576#1:1332,2\n576#1:1334,2\n576#1:1336,6\n576#1:1342\n598#1:1343,4\n598#1:1347,6\n598#1:1354,3\n598#1:1358,2\n598#1:1360,2\n598#1:1362,6\n598#1:1368\n-1#1:1385,11\n-1#1:1396,4\n-1#1:1400,6\n-1#1:1407,3\n-1#1:1411,2\n-1#1:1413\n-1#1:1414,10\n-1#1:1424\n-1#1:1425,6\n-1#1:1431\n-1#1:1432,2\n-1#1:1434,11\n-1#1:1445,4\n-1#1:1449,6\n-1#1:1456,3\n-1#1:1460,2\n-1#1:1462\n-1#1:1463,10\n-1#1:1473\n-1#1:1474,6\n-1#1:1480\n-1#1:1481,2\n-1#1:1483,11\n-1#1:1494,4\n-1#1:1498,6\n-1#1:1505,3\n-1#1:1509,2\n-1#1:1511\n-1#1:1512,10\n-1#1:1522\n-1#1:1523,6\n-1#1:1529\n-1#1:1530,2\n-1#1:1532,11\n-1#1:1543,4\n-1#1:1547,6\n-1#1:1554,3\n-1#1:1558,2\n-1#1:1560\n-1#1:1561,10\n-1#1:1571\n-1#1:1572,6\n-1#1:1578\n-1#1:1579,2\n-1#1:1581,11\n-1#1:1592,4\n-1#1:1596,6\n-1#1:1603,3\n-1#1:1607,2\n-1#1:1609\n-1#1:1610,10\n-1#1:1620\n-1#1:1621,6\n-1#1:1627\n-1#1:1628,2\n362#1:1048\n369#1:1049\n388#1:1056\n388#1:1060\n400#1:1076\n400#1:1080\n412#1:1096\n412#1:1100\n421#1:1120\n421#1:1124\n431#1:1146\n431#1:1150\n447#1:1172\n447#1:1176\n470#1:1197\n470#1:1201\n494#1:1223\n494#1:1227\n529#1:1249\n529#1:1253\n529#1:1275\n529#1:1279\n550#1:1301\n550#1:1305\n576#1:1327\n576#1:1331\n598#1:1353\n598#1:1357\n618#1:1372\n621#1:1373\n625#1:1374,3\n626#1:1377,3\n627#1:1380\n628#1:1381\n628#1:1382\n632#1:1383\n635#1:1384\n-1#1:1406\n-1#1:1410\n-1#1:1455\n-1#1:1459\n-1#1:1504\n-1#1:1508\n-1#1:1553\n-1#1:1557\n-1#1:1602\n-1#1:1606\n617#1:1369,3\n*E\n"})
public abstract class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    @xh.e
    public long[] f3685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    @xh.e
    public long[] f3686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    @xh.e
    public long[] f3687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @xh.e
    public int f3688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @xh.e
    public int f3689e;

    private q0() {
        this.f3685a = h2.f3611e;
        this.f3686b = w0.b();
        this.f3687c = w0.b();
    }

    public /* synthetic */ q0(kotlin.jvm.internal.u uVar) {
        this();
    }

    public static /* synthetic */ String L(q0 q0Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
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
        return q0Var.E(charSequence, charSequence5, charSequence6, i12, charSequence4);
    }

    public static /* synthetic */ String M(q0 q0Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, yh.p transform, int i11, Object obj) {
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
        long[] jArr2 = q0Var.f3686b;
        long[] jArr3 = q0Var.f3687c;
        long[] jArr4 = q0Var.f3685a;
        int length = jArr4.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i14 = 0;
        int i15 = 0;
        loop0: while (true) {
            long j10 = jArr4[i14];
            int i16 = i14;
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i17 = 8;
                int i18 = 8 - ((~(i16 - length)) >>> 31);
                int i19 = 0;
                while (i19 < i18) {
                    if ((j10 & 255) < 128) {
                        int i20 = (i16 << 3) + i19;
                        long j11 = jArr2[i20];
                        long j12 = jArr3[i20];
                        if (i15 == i13) {
                            sb2.append(truncated);
                            break loop0;
                        }
                        if (i15 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append((CharSequence) transform.invoke(Long.valueOf(j11), Long.valueOf(j12)));
                        i15++;
                        i12 = 8;
                    } else {
                        i12 = i17;
                    }
                    j10 >>= i12;
                    i19++;
                    i17 = i12;
                    jArr4 = jArr4;
                }
                jArr = jArr4;
                if (i18 == i17) {
                }
                sb2.append(postfix);
                break;
            }
            jArr = jArr4;
            if (i16 == length) {
                sb2.append(postfix);
                break;
            }
            i14 = i16 + 1;
            jArr4 = jArr;
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
        long[] jArr;
        long[] jArr2;
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr3 = this.f3686b;
        long[] jArr4 = this.f3687c;
        long[] jArr5 = this.f3685a;
        int length = jArr5.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j10 = jArr5[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i11 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j10 & 255) < 128) {
                        int i16 = (i11 << 3) + i15;
                        long j11 = jArr3[i16];
                        long j12 = jArr4[i16];
                        if (i12 == i10) {
                            sb2.append(truncated);
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(j11);
                        sb2.append(n5.a.f132013h);
                        sb2.append(j12);
                        i12++;
                    }
                    j10 >>= 8;
                    i15++;
                    i13 = 8;
                    jArr5 = jArr5;
                    length = length;
                    jArr3 = jArr3;
                }
                jArr = jArr3;
                jArr2 = jArr5;
                int i17 = length;
                if (i14 == i13) {
                    length = i17;
                }
                sb2.append(postfix);
                break;
            }
            jArr = jArr3;
            jArr2 = jArr5;
            if (i11 == length) {
                sb2.append(postfix);
                break;
            }
            i11++;
            jArr5 = jArr2;
            jArr3 = jArr;
        }
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a1 A[PHI: r12
  0x00a1: PHI (r12v2 int) = (r12v1 int), (r12v3 int) binds: [B:6:0x004c, B:22:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x00a4 A[LOOP:0: B:5:0x003a->B:25:0x00a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x00ab A[SYNTHETIC] */
    @dl.d
    @xh.i
    public final String F(@dl.d CharSequence charSequence, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated, @dl.d yh.p<? super Long, ? super Long, ? extends CharSequence> transform) {
        CharSequence separator = charSequence;
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        kotlin.jvm.internal.f0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.f3686b;
        long[] jArr2 = this.f3687c;
        long[] jArr3 = this.f3685a;
        int length = jArr3.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j10 = jArr3[i11];
            int i13 = i11;
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i13 == length) {
                    sb2.append(postfix);
                    break;
                }
                i11 = i13 + 1;
                separator = charSequence;
            } else {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j10 & 255) < 128) {
                        int i16 = (i13 << 3) + i15;
                        long j11 = jArr[i16];
                        long j12 = jArr2[i16];
                        if (i12 == i10) {
                            sb2.append(truncated);
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Long.valueOf(j11), Long.valueOf(j12)));
                        i12++;
                    }
                    j10 >>= 8;
                    i15++;
                    separator = charSequence;
                }
                if (i14 == 8) {
                    if (i13 == length) {
                        i11 = i13 + 1;
                        separator = charSequence;
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

    @dl.d
    @xh.i
    public final String G(@dl.d CharSequence charSequence, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d yh.p<? super Long, ? super Long, ? extends CharSequence> transform) {
        CharSequence separator = charSequence;
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.f3686b;
        long[] jArr2 = this.f3687c;
        long[] jArr3 = this.f3685a;
        int length = jArr3.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j10 = jArr3[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i11 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j10 & 255) < 128) {
                        int i16 = (i11 << 3) + i15;
                        long j11 = jArr[i16];
                        long j12 = jArr2[i16];
                        if (i12 == i10) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Long.valueOf(j11), Long.valueOf(j12)));
                        i12++;
                    }
                    j10 >>= 8;
                    i15++;
                    separator = charSequence;
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
            separator = charSequence;
        }
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009a A[DONT_INVERT, PHI: r11
  0x009a: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x0044, B:23:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x009c A[LOOP:0: B:5:0x0033->B:25:0x009c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a1 A[SYNTHETIC] */
    @dl.d
    @xh.i
    public final String H(@dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, @dl.d yh.p<? super Long, ? super Long, ? extends CharSequence> transform) {
        int i10;
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.f3686b;
        long[] jArr2 = this.f3687c;
        long[] jArr3 = this.f3685a;
        int length = jArr3.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j10 = jArr3[i11];
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
                        long j11 = jArr[i16];
                        long j12 = jArr2[i16];
                        if (i12 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Long.valueOf(j11), Long.valueOf(j12)));
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

    /* JADX WARN: Code duplicated, block: B:24:0x008e A[DONT_INVERT, PHI: r10
  0x008e: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x003a, B:23:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0090 A[LOOP:0: B:5:0x002c->B:25:0x0090, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0093 A[SYNTHETIC] */
    @dl.d
    @xh.i
    public final String I(@dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d yh.p<? super Long, ? super Long, ? extends CharSequence> transform) {
        int i10;
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.f3686b;
        long[] jArr2 = this.f3687c;
        long[] jArr3 = this.f3685a;
        int length = jArr3.length - 2;
        if (length < 0) {
            sb2.append((CharSequence) "");
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j10 = jArr3[i11];
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
                        long j11 = jArr[i16];
                        long j12 = jArr2[i16];
                        if (i12 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Long.valueOf(j11), Long.valueOf(j12)));
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

    /* JADX WARN: Code duplicated, block: B:24:0x008e A[DONT_INVERT, PHI: r11
  0x008e: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x0038, B:23:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0090 A[LOOP:0: B:5:0x0027->B:25:0x0090, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0095 A[SYNTHETIC] */
    @dl.d
    @xh.i
    public final String J(@dl.d CharSequence separator, @dl.d yh.p<? super Long, ? super Long, ? extends CharSequence> transform) {
        int i10;
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        long[] jArr = this.f3686b;
        long[] jArr2 = this.f3687c;
        long[] jArr3 = this.f3685a;
        int length = jArr3.length - 2;
        if (length < 0) {
            sb2.append((CharSequence) "");
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j10 = jArr3[i11];
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
                        long j11 = jArr[i16];
                        long j12 = jArr2[i16];
                        if (i12 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Long.valueOf(j11), Long.valueOf(j12)));
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

    /* JADX WARN: Code duplicated, block: B:24:0x0084 A[DONT_INVERT, PHI: r10
  0x0084: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x002e, B:23:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0086 A[LOOP:0: B:5:0x0020->B:25:0x0086, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0089 A[SYNTHETIC] */
    @dl.d
    @xh.i
    public final String K(@dl.d yh.p<? super Long, ? super Long, ? extends CharSequence> transform) {
        int i10;
        kotlin.jvm.internal.f0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        long[] jArr = this.f3686b;
        long[] jArr2 = this.f3687c;
        long[] jArr3 = this.f3685a;
        int length = jArr3.length - 2;
        if (length < 0) {
            sb2.append((CharSequence) "");
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j10 = jArr3[i11];
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
                        long j11 = jArr[i16];
                        long j12 = jArr2[i16];
                        if (i12 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append((CharSequence) ", ");
                        }
                        sb2.append(transform.invoke(Long.valueOf(j11), Long.valueOf(j12)));
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
        return this.f3689e == 0;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0065 A[LOOP:0: B:5:0x0017->B:20:0x0065, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0068 A[SYNTHETIC] */
    public final boolean a(@dl.d yh.p<? super Long, ? super Long, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        long[] jArr = this.f3686b;
        long[] jArr2 = this.f3687c;
        long[] jArr3 = this.f3685a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr3[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (!predicate.invoke(Long.valueOf(jArr[i13]), Long.valueOf(jArr2[i13])).booleanValue()) {
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
        return this.f3689e != 0;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0065 A[LOOP:0: B:5:0x0016->B:20:0x0065, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0068 A[SYNTHETIC] */
    public final boolean c(@dl.d yh.p<? super Long, ? super Long, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        long[] jArr = this.f3686b;
        long[] jArr2 = this.f3687c;
        long[] jArr3 = this.f3685a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr3[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (predicate.invoke(Long.valueOf(jArr[i13]), Long.valueOf(jArr2[i13])).booleanValue()) {
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

    public final boolean d(long j10) {
        return i(j10) >= 0;
    }

    public final boolean e(long j10) {
        return i(j10) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x006e A[LOOP:0: B:14:0x0027->B:31:0x006e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0071 A[SYNTHETIC] */
    public boolean equals(@dl.e Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (q0Var.t() != t()) {
            return false;
        }
        long[] jArr = this.f3686b;
        long[] jArr2 = this.f3687c;
        long[] jArr3 = this.f3685a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr3[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8;
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i10 << 3) + i13;
                            if (jArr2[i14] != q0Var.n(jArr[i14])) {
                                return false;
                            }
                            i11 = 8;
                        }
                        j10 >>= i11;
                    }
                    if (i12 == i11) {
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

    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0049 A[LOOP:0: B:5:0x000c->B:20:0x0049, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x004c A[SYNTHETIC] */
    public final boolean f(long j10) {
        long[] jArr = this.f3687c;
        long[] jArr2 = this.f3685a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j11 = jArr2[i10];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (((255 & j11) < 128) && j10 == jArr[(i10 << 3) + i12]) {
                            return true;
                        }
                        j11 >>= 8;
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

    public final int h(@dl.d yh.p<? super Long, ? super Long, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        long[] jArr = this.f3686b;
        long[] jArr2 = this.f3687c;
        long[] jArr3 = this.f3685a;
        int length = jArr3.length - 2;
        int i10 = 0;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                long j10 = jArr3[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j10) < 128) {
                            int i15 = (i11 << 3) + i14;
                            if (predicate.invoke(Long.valueOf(jArr[i15]), Long.valueOf(jArr2[i15])).booleanValue()) {
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
        long[] jArr = this.f3686b;
        long[] jArr2 = this.f3687c;
        long[] jArr3 = this.f3685a;
        int length = jArr3.length - 2;
        int i10 = 0;
        if (length >= 0) {
            int i11 = 0;
            int iA = 0;
            while (true) {
                long j10 = jArr3[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i11 << 3) + i13;
                            iA += k.a(jArr[i14]) ^ k.a(jArr2[i14]);
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

    @kotlin.r0
    public final int i(long j10) {
        int iA = k.a(j10) * h2.f3616j;
        int i10 = iA ^ (iA << 16);
        int i11 = i10 & 127;
        int i12 = this.f3688d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f3685a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j11 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j12 = (((long) i11) * h2.f3617k) ^ j11;
            long j13 = (~j12) & (j12 - h2.f3617k) & (-9187201950435737472L);
            while (true) {
                if (j13 != 0) {
                    int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i13) & i12;
                    if (this.f3686b[iNumberOfTrailingZeros] == j10) {
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

    public final void j(@dl.d yh.p<? super Long, ? super Long, kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        long[] jArr = this.f3686b;
        long[] jArr2 = this.f3687c;
        long[] jArr3 = this.f3685a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr3[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        block.invoke(Long.valueOf(jArr[i13]), Long.valueOf(jArr2[i13]));
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
        long[] jArr = this.f3685a;
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

    public final void l(@dl.d yh.l<? super Long, kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        long[] jArr = this.f3686b;
        long[] jArr2 = this.f3685a;
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

    public final void m(@dl.d yh.l<? super Long, kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        long[] jArr = this.f3687c;
        long[] jArr2 = this.f3685a;
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

    public final long n(long j10) {
        int i10 = i(j10);
        if (i10 >= 0) {
            return this.f3687c[i10];
        }
        throw new NoSuchElementException("Cannot find value for key " + j10);
    }

    public final int o() {
        return this.f3688d;
    }

    public final long r(long j10, long j11) {
        int i10 = i(j10);
        return i10 >= 0 ? this.f3687c[i10] : j11;
    }

    public final long s(long j10, @dl.d yh.a<Long> defaultValue) {
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        int i10 = i(j10);
        return i10 < 0 ? defaultValue.invoke().longValue() : this.f3687c[i10];
    }

    public final int t() {
        return this.f3689e;
    }

    @dl.d
    public String toString() {
        int i10;
        int i11;
        if (x()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('{');
        long[] jArr = this.f3686b;
        long[] jArr2 = this.f3687c;
        long[] jArr3 = this.f3685a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                long j10 = jArr3[i12];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8;
                    int i15 = 8 - ((~(i12 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((255 & j10) < 128) {
                            int i17 = (i12 << 3) + i16;
                            long j11 = jArr[i17];
                            long j12 = jArr2[i17];
                            sb2.append(j11);
                            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                            sb2.append(j12);
                            i13++;
                            if (i13 < this.f3689e) {
                                sb2.append(',');
                                sb2.append(' ');
                            }
                            i11 = 8;
                        } else {
                            i11 = i14;
                        }
                        j10 >>= i11;
                        i16++;
                        i14 = i11;
                        i12 = i12;
                    }
                    int i18 = i12;
                    if (i15 != i14) {
                        break;
                    }
                    i10 = i18;
                } else {
                    i10 = i12;
                }
                if (i10 == length) {
                    break;
                }
                i12 = i10 + 1;
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "s.append('}').toString()");
        return string;
    }

    public final boolean x() {
        return this.f3689e == 0;
    }

    public final boolean y() {
        return this.f3689e != 0;
    }

    @dl.d
    @xh.i
    public final String z() {
        return L(this, null, null, null, 0, null, 31, null);
    }
}
