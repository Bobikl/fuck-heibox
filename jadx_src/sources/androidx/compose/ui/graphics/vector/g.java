package androidx.compose.ui.graphics.vector;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import fi.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.k0;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PathNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0010\f\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b>\u001a\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001aB\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00040\bH\u0082\b\"\u0014\u0010\u000f\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e\"\u0014\u0010\u0012\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000e\"\u0014\u0010\u0014\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e\"\u0014\u0010\u0016\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000e\"\u0014\u0010\u0018\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000e\"\u0014\u0010\u001a\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000e\"\u0014\u0010\u001c\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000e\"\u0014\u0010\u001e\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u000e\"\u0014\u0010 \u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u000e\"\u0014\u0010\"\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u000e\"\u0014\u0010$\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u000e\"\u0014\u0010&\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u000e\"\u0014\u0010(\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u000e\"\u0014\u0010*\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\u000e\"\u0014\u0010,\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010\u000e\"\u0014\u0010.\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010\u000e\"\u0014\u00100\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010\u000e\"\u0014\u00102\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010\u000e\"\u0014\u00104\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010\u000e\"\u0014\u00107\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u00106\"\u0014\u00109\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00106\"\u0014\u0010;\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u00106\"\u0014\u0010=\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b<\u00106\"\u0014\u0010?\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b>\u00106\"\u0014\u0010A\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u00106\"\u0014\u0010C\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\bB\u00106\"\u0014\u0010E\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u00106\"\u0014\u0010F\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u00106¨\u0006G"}, d2 = {"", "", "args", "", "Landroidx/compose/ui/graphics/vector/f;", "b", "", "numArgs", "Lkotlin/Function1;", "Lkotlin/m0;", "name", "subArray", "nodeFor", ak.av, "C", "RelativeCloseKey", "CloseKey", ak.aF, "RelativeMoveToKey", "d", "MoveToKey", "e", "RelativeLineToKey", "f", "LineToKey", "g", "RelativeHorizontalToKey", RXScreenCaptureService.KEY_HEIGHT, "HorizontalToKey", "i", "RelativeVerticalToKey", "j", "VerticalToKey", "k", "RelativeCurveToKey", "l", "CurveToKey", "m", "RelativeReflectiveCurveToKey", "n", "ReflectiveCurveToKey", "o", "RelativeQuadToKey", "p", "QuadToKey", "q", "RelativeReflectiveQuadToKey", "r", "ReflectiveQuadToKey", ak.aB, "RelativeArcToKey", "t", "ArcToKey", ak.aG, "I", "NUM_MOVE_TO_ARGS", "v", "NUM_LINE_TO_ARGS", RXScreenCaptureService.KEY_WIDTH, "NUM_HORIZONTAL_TO_ARGS", "x", "NUM_VERTICAL_TO_ARGS", "y", "NUM_CURVE_TO_ARGS", ak.aD, "NUM_REFLECTIVE_CURVE_TO_ARGS", androidx.exifinterface.media.a.W4, "NUM_QUAD_TO_ARGS", "B", "NUM_REFLECTIVE_QUAD_TO_ARGS", "NUM_ARC_TO_ARGS", "ui-graphics_release"}, k = 2, mv = {1, 7, 1})
public final class g {
    private static final int A = 4;
    private static final int B = 2;
    private static final int C = 7;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char f14287a = 'z';

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char f14288b = 'Z';

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char f14289c = 'm';

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char f14290d = 'M';

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char f14291e = 'l';

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final char f14292f = 'L';

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final char f14293g = 'h';

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final char f14294h = 'H';

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final char f14295i = 'v';

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final char f14296j = 'V';

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final char f14297k = 'c';

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final char f14298l = 'C';

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final char f14299m = 's';

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final char f14300n = 'S';

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final char f14301o = 'q';

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final char f14302p = 'Q';

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final char f14303q = 't';

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final char f14304r = 'T';

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final char f14305s = 'a';

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final char f14306t = 'A';

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f14307u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f14308v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f14309w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f14310x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f14311y = 6;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f14312z = 4;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [float[], java.lang.Object] */
    private static final List<f> a(float[] fArr, int i10, yh.l<? super float[], ? extends f> lVar) {
        fi.j jVarB1 = u.B1(new fi.l(0, fArr.length - i10), i10);
        ArrayList arrayList = new ArrayList(t.Y(jVarB1, 10));
        Iterator<Integer> it = jVarB1.iterator();
        while (it.hasNext()) {
            int iNextInt = ((k0) it).nextInt();
            ?? J1 = kotlin.collections.m.J1(fArr, iNextInt, iNextInt + i10);
            Object relativeLineTo = (f) lVar.invoke(J1);
            if ((relativeLineTo instanceof f.MoveTo) && iNextInt > 0) {
                relativeLineTo = new f.LineTo(J1[0], J1[1]);
            } else if ((relativeLineTo instanceof f.RelativeMoveTo) && iNextInt > 0) {
                relativeLineTo = new f.RelativeLineTo(J1[0], J1[1]);
            }
            arrayList.add(relativeLineTo);
        }
        return arrayList;
    }

    @dl.d
    public static final List<f> b(char c10, @dl.d float[] args) {
        ArrayList arrayList;
        Object relativeLineTo;
        f0.p(args, "args");
        if (c10 == 'z' || c10 == 'Z') {
            return kotlin.collections.s.k(f.b.f14235c);
        }
        if (c10 == 'm') {
            fi.j jVarB1 = u.B1(new fi.l(0, args.length - 2), 2);
            arrayList = new ArrayList(t.Y(jVarB1, 10));
            Iterator<Integer> it = jVarB1.iterator();
            while (it.hasNext()) {
                int iNextInt = ((k0) it).nextInt();
                float[] fArrJ1 = kotlin.collections.m.J1(args, iNextInt, iNextInt + 2);
                Object relativeMoveTo = new f.RelativeMoveTo(fArrJ1[0], fArrJ1[1]);
                if ((relativeMoveTo instanceof f.MoveTo) && iNextInt > 0) {
                    relativeMoveTo = new f.LineTo(fArrJ1[0], fArrJ1[1]);
                } else if (iNextInt > 0) {
                    relativeMoveTo = new f.RelativeLineTo(fArrJ1[0], fArrJ1[1]);
                }
                arrayList.add(relativeMoveTo);
            }
        } else if (c10 == 'M') {
            fi.j jVarB2 = u.B1(new fi.l(0, args.length - 2), 2);
            arrayList = new ArrayList(t.Y(jVarB2, 10));
            Iterator<Integer> it2 = jVarB2.iterator();
            while (it2.hasNext()) {
                int iNextInt2 = ((k0) it2).nextInt();
                float[] fArrJ2 = kotlin.collections.m.J1(args, iNextInt2, iNextInt2 + 2);
                Object moveTo = new f.MoveTo(fArrJ2[0], fArrJ2[1]);
                if (iNextInt2 > 0) {
                    moveTo = new f.LineTo(fArrJ2[0], fArrJ2[1]);
                } else if ((moveTo instanceof f.RelativeMoveTo) && iNextInt2 > 0) {
                    moveTo = new f.RelativeLineTo(fArrJ2[0], fArrJ2[1]);
                }
                arrayList.add(moveTo);
            }
        } else if (c10 == 'l') {
            fi.j jVarB3 = u.B1(new fi.l(0, args.length - 2), 2);
            arrayList = new ArrayList(t.Y(jVarB3, 10));
            Iterator<Integer> it3 = jVarB3.iterator();
            while (it3.hasNext()) {
                int iNextInt3 = ((k0) it3).nextInt();
                float[] fArrJ3 = kotlin.collections.m.J1(args, iNextInt3, iNextInt3 + 2);
                Object relativeLineTo2 = new f.RelativeLineTo(fArrJ3[0], fArrJ3[1]);
                if ((relativeLineTo2 instanceof f.MoveTo) && iNextInt3 > 0) {
                    relativeLineTo2 = new f.LineTo(fArrJ3[0], fArrJ3[1]);
                } else if ((relativeLineTo2 instanceof f.RelativeMoveTo) && iNextInt3 > 0) {
                    relativeLineTo2 = new f.RelativeLineTo(fArrJ3[0], fArrJ3[1]);
                }
                arrayList.add(relativeLineTo2);
            }
        } else if (c10 == 'L') {
            fi.j jVarB4 = u.B1(new fi.l(0, args.length - 2), 2);
            arrayList = new ArrayList(t.Y(jVarB4, 10));
            Iterator<Integer> it4 = jVarB4.iterator();
            while (it4.hasNext()) {
                int iNextInt4 = ((k0) it4).nextInt();
                float[] fArrJ4 = kotlin.collections.m.J1(args, iNextInt4, iNextInt4 + 2);
                Object lineTo = new f.LineTo(fArrJ4[0], fArrJ4[1]);
                if ((lineTo instanceof f.MoveTo) && iNextInt4 > 0) {
                    lineTo = new f.LineTo(fArrJ4[0], fArrJ4[1]);
                } else if ((lineTo instanceof f.RelativeMoveTo) && iNextInt4 > 0) {
                    lineTo = new f.RelativeLineTo(fArrJ4[0], fArrJ4[1]);
                }
                arrayList.add(lineTo);
            }
        } else if (c10 == 'h') {
            fi.j jVarB5 = u.B1(new fi.l(0, args.length - 1), 1);
            arrayList = new ArrayList(t.Y(jVarB5, 10));
            Iterator<Integer> it5 = jVarB5.iterator();
            while (it5.hasNext()) {
                int iNextInt5 = ((k0) it5).nextInt();
                float[] fArrJ5 = kotlin.collections.m.J1(args, iNextInt5, iNextInt5 + 1);
                Object relativeHorizontalTo = new f.RelativeHorizontalTo(fArrJ5[0]);
                if ((relativeHorizontalTo instanceof f.MoveTo) && iNextInt5 > 0) {
                    relativeHorizontalTo = new f.LineTo(fArrJ5[0], fArrJ5[1]);
                } else if ((relativeHorizontalTo instanceof f.RelativeMoveTo) && iNextInt5 > 0) {
                    relativeHorizontalTo = new f.RelativeLineTo(fArrJ5[0], fArrJ5[1]);
                }
                arrayList.add(relativeHorizontalTo);
            }
        } else if (c10 == 'H') {
            fi.j jVarB6 = u.B1(new fi.l(0, args.length - 1), 1);
            arrayList = new ArrayList(t.Y(jVarB6, 10));
            Iterator<Integer> it6 = jVarB6.iterator();
            while (it6.hasNext()) {
                int iNextInt6 = ((k0) it6).nextInt();
                float[] fArrJ6 = kotlin.collections.m.J1(args, iNextInt6, iNextInt6 + 1);
                Object horizontalTo = new f.HorizontalTo(fArrJ6[0]);
                if ((horizontalTo instanceof f.MoveTo) && iNextInt6 > 0) {
                    horizontalTo = new f.LineTo(fArrJ6[0], fArrJ6[1]);
                } else if ((horizontalTo instanceof f.RelativeMoveTo) && iNextInt6 > 0) {
                    horizontalTo = new f.RelativeLineTo(fArrJ6[0], fArrJ6[1]);
                }
                arrayList.add(horizontalTo);
            }
        } else if (c10 == 'v') {
            fi.j jVarB7 = u.B1(new fi.l(0, args.length - 1), 1);
            arrayList = new ArrayList(t.Y(jVarB7, 10));
            Iterator<Integer> it7 = jVarB7.iterator();
            while (it7.hasNext()) {
                int iNextInt7 = ((k0) it7).nextInt();
                float[] fArrJ7 = kotlin.collections.m.J1(args, iNextInt7, iNextInt7 + 1);
                Object relativeVerticalTo = new f.RelativeVerticalTo(fArrJ7[0]);
                if ((relativeVerticalTo instanceof f.MoveTo) && iNextInt7 > 0) {
                    relativeVerticalTo = new f.LineTo(fArrJ7[0], fArrJ7[1]);
                } else if ((relativeVerticalTo instanceof f.RelativeMoveTo) && iNextInt7 > 0) {
                    relativeVerticalTo = new f.RelativeLineTo(fArrJ7[0], fArrJ7[1]);
                }
                arrayList.add(relativeVerticalTo);
            }
        } else if (c10 == 'V') {
            fi.j jVarB8 = u.B1(new fi.l(0, args.length - 1), 1);
            arrayList = new ArrayList(t.Y(jVarB8, 10));
            Iterator<Integer> it8 = jVarB8.iterator();
            while (it8.hasNext()) {
                int iNextInt8 = ((k0) it8).nextInt();
                float[] fArrJ8 = kotlin.collections.m.J1(args, iNextInt8, iNextInt8 + 1);
                Object verticalTo = new f.VerticalTo(fArrJ8[0]);
                if ((verticalTo instanceof f.MoveTo) && iNextInt8 > 0) {
                    verticalTo = new f.LineTo(fArrJ8[0], fArrJ8[1]);
                } else if ((verticalTo instanceof f.RelativeMoveTo) && iNextInt8 > 0) {
                    verticalTo = new f.RelativeLineTo(fArrJ8[0], fArrJ8[1]);
                }
                arrayList.add(verticalTo);
            }
        } else {
            char c11 = 5;
            if (c10 == 'c') {
                fi.j jVarB9 = u.B1(new fi.l(0, args.length - 6), 6);
                arrayList = new ArrayList(t.Y(jVarB9, 10));
                Iterator<Integer> it9 = jVarB9.iterator();
                while (it9.hasNext()) {
                    int iNextInt9 = ((k0) it9).nextInt();
                    float[] fArrJ9 = kotlin.collections.m.J1(args, iNextInt9, iNextInt9 + 6);
                    Object relativeCurveTo = new f.RelativeCurveTo(fArrJ9[0], fArrJ9[1], fArrJ9[2], fArrJ9[3], fArrJ9[4], fArrJ9[c11]);
                    if (!(relativeCurveTo instanceof f.MoveTo) || iNextInt9 <= 0) {
                        relativeLineTo = (!(relativeCurveTo instanceof f.RelativeMoveTo) || iNextInt9 <= 0) ? relativeCurveTo : new f.RelativeLineTo(fArrJ9[0], fArrJ9[1]);
                    } else {
                        relativeLineTo = new f.LineTo(fArrJ9[0], fArrJ9[1]);
                    }
                    arrayList.add(relativeLineTo);
                    c11 = 5;
                }
            } else if (c10 == 'C') {
                fi.j jVarB10 = u.B1(new fi.l(0, args.length - 6), 6);
                arrayList = new ArrayList(t.Y(jVarB10, 10));
                Iterator<Integer> it10 = jVarB10.iterator();
                while (it10.hasNext()) {
                    int iNextInt10 = ((k0) it10).nextInt();
                    float[] fArrJ10 = kotlin.collections.m.J1(args, iNextInt10, iNextInt10 + 6);
                    Object curveTo = new f.CurveTo(fArrJ10[0], fArrJ10[1], fArrJ10[2], fArrJ10[3], fArrJ10[4], fArrJ10[5]);
                    if ((curveTo instanceof f.MoveTo) && iNextInt10 > 0) {
                        curveTo = new f.LineTo(fArrJ10[0], fArrJ10[1]);
                    } else if ((curveTo instanceof f.RelativeMoveTo) && iNextInt10 > 0) {
                        curveTo = new f.RelativeLineTo(fArrJ10[0], fArrJ10[1]);
                    }
                    arrayList.add(curveTo);
                }
            } else if (c10 == 's') {
                fi.j jVarB11 = u.B1(new fi.l(0, args.length - 4), 4);
                arrayList = new ArrayList(t.Y(jVarB11, 10));
                Iterator<Integer> it11 = jVarB11.iterator();
                while (it11.hasNext()) {
                    int iNextInt11 = ((k0) it11).nextInt();
                    float[] fArrJ11 = kotlin.collections.m.J1(args, iNextInt11, iNextInt11 + 4);
                    Object relativeReflectiveCurveTo = new f.RelativeReflectiveCurveTo(fArrJ11[0], fArrJ11[1], fArrJ11[2], fArrJ11[3]);
                    if ((relativeReflectiveCurveTo instanceof f.MoveTo) && iNextInt11 > 0) {
                        relativeReflectiveCurveTo = new f.LineTo(fArrJ11[0], fArrJ11[1]);
                    } else if ((relativeReflectiveCurveTo instanceof f.RelativeMoveTo) && iNextInt11 > 0) {
                        relativeReflectiveCurveTo = new f.RelativeLineTo(fArrJ11[0], fArrJ11[1]);
                    }
                    arrayList.add(relativeReflectiveCurveTo);
                }
            } else if (c10 == 'S') {
                fi.j jVarB12 = u.B1(new fi.l(0, args.length - 4), 4);
                arrayList = new ArrayList(t.Y(jVarB12, 10));
                Iterator<Integer> it12 = jVarB12.iterator();
                while (it12.hasNext()) {
                    int iNextInt12 = ((k0) it12).nextInt();
                    float[] fArrJ12 = kotlin.collections.m.J1(args, iNextInt12, iNextInt12 + 4);
                    Object reflectiveCurveTo = new f.ReflectiveCurveTo(fArrJ12[0], fArrJ12[1], fArrJ12[2], fArrJ12[3]);
                    if ((reflectiveCurveTo instanceof f.MoveTo) && iNextInt12 > 0) {
                        reflectiveCurveTo = new f.LineTo(fArrJ12[0], fArrJ12[1]);
                    } else if ((reflectiveCurveTo instanceof f.RelativeMoveTo) && iNextInt12 > 0) {
                        reflectiveCurveTo = new f.RelativeLineTo(fArrJ12[0], fArrJ12[1]);
                    }
                    arrayList.add(reflectiveCurveTo);
                }
            } else if (c10 == 'q') {
                fi.j jVarB13 = u.B1(new fi.l(0, args.length - 4), 4);
                arrayList = new ArrayList(t.Y(jVarB13, 10));
                Iterator<Integer> it13 = jVarB13.iterator();
                while (it13.hasNext()) {
                    int iNextInt13 = ((k0) it13).nextInt();
                    float[] fArrJ13 = kotlin.collections.m.J1(args, iNextInt13, iNextInt13 + 4);
                    Object relativeQuadTo = new f.RelativeQuadTo(fArrJ13[0], fArrJ13[1], fArrJ13[2], fArrJ13[3]);
                    if ((relativeQuadTo instanceof f.MoveTo) && iNextInt13 > 0) {
                        relativeQuadTo = new f.LineTo(fArrJ13[0], fArrJ13[1]);
                    } else if ((relativeQuadTo instanceof f.RelativeMoveTo) && iNextInt13 > 0) {
                        relativeQuadTo = new f.RelativeLineTo(fArrJ13[0], fArrJ13[1]);
                    }
                    arrayList.add(relativeQuadTo);
                }
            } else if (c10 == 'Q') {
                fi.j jVarB14 = u.B1(new fi.l(0, args.length - 4), 4);
                arrayList = new ArrayList(t.Y(jVarB14, 10));
                Iterator<Integer> it14 = jVarB14.iterator();
                while (it14.hasNext()) {
                    int iNextInt14 = ((k0) it14).nextInt();
                    float[] fArrJ14 = kotlin.collections.m.J1(args, iNextInt14, iNextInt14 + 4);
                    Object quadTo = new f.QuadTo(fArrJ14[0], fArrJ14[1], fArrJ14[2], fArrJ14[3]);
                    if ((quadTo instanceof f.MoveTo) && iNextInt14 > 0) {
                        quadTo = new f.LineTo(fArrJ14[0], fArrJ14[1]);
                    } else if ((quadTo instanceof f.RelativeMoveTo) && iNextInt14 > 0) {
                        quadTo = new f.RelativeLineTo(fArrJ14[0], fArrJ14[1]);
                    }
                    arrayList.add(quadTo);
                }
            } else if (c10 == 't') {
                fi.j jVarB15 = u.B1(new fi.l(0, args.length - 2), 2);
                arrayList = new ArrayList(t.Y(jVarB15, 10));
                Iterator<Integer> it15 = jVarB15.iterator();
                while (it15.hasNext()) {
                    int iNextInt15 = ((k0) it15).nextInt();
                    float[] fArrJ15 = kotlin.collections.m.J1(args, iNextInt15, iNextInt15 + 2);
                    Object relativeReflectiveQuadTo = new f.RelativeReflectiveQuadTo(fArrJ15[0], fArrJ15[1]);
                    if ((relativeReflectiveQuadTo instanceof f.MoveTo) && iNextInt15 > 0) {
                        relativeReflectiveQuadTo = new f.LineTo(fArrJ15[0], fArrJ15[1]);
                    } else if ((relativeReflectiveQuadTo instanceof f.RelativeMoveTo) && iNextInt15 > 0) {
                        relativeReflectiveQuadTo = new f.RelativeLineTo(fArrJ15[0], fArrJ15[1]);
                    }
                    arrayList.add(relativeReflectiveQuadTo);
                }
            } else if (c10 == 'T') {
                fi.j jVarB16 = u.B1(new fi.l(0, args.length - 2), 2);
                arrayList = new ArrayList(t.Y(jVarB16, 10));
                Iterator<Integer> it16 = jVarB16.iterator();
                while (it16.hasNext()) {
                    int iNextInt16 = ((k0) it16).nextInt();
                    float[] fArrJ16 = kotlin.collections.m.J1(args, iNextInt16, iNextInt16 + 2);
                    Object reflectiveQuadTo = new f.ReflectiveQuadTo(fArrJ16[0], fArrJ16[1]);
                    if ((reflectiveQuadTo instanceof f.MoveTo) && iNextInt16 > 0) {
                        reflectiveQuadTo = new f.LineTo(fArrJ16[0], fArrJ16[1]);
                    } else if ((reflectiveQuadTo instanceof f.RelativeMoveTo) && iNextInt16 > 0) {
                        reflectiveQuadTo = new f.RelativeLineTo(fArrJ16[0], fArrJ16[1]);
                    }
                    arrayList.add(reflectiveQuadTo);
                }
            } else if (c10 == 'a') {
                fi.j jVarB17 = u.B1(new fi.l(0, args.length - 7), 7);
                arrayList = new ArrayList(t.Y(jVarB17, 10));
                Iterator<Integer> it17 = jVarB17.iterator();
                while (it17.hasNext()) {
                    int iNextInt17 = ((k0) it17).nextInt();
                    float[] fArrJ17 = kotlin.collections.m.J1(args, iNextInt17, iNextInt17 + 7);
                    Object relativeArcTo = new f.RelativeArcTo(fArrJ17[0], fArrJ17[1], fArrJ17[2], Float.compare(fArrJ17[3], 0.0f) != 0, Float.compare(fArrJ17[4], 0.0f) != 0, fArrJ17[5], fArrJ17[6]);
                    if ((relativeArcTo instanceof f.MoveTo) && iNextInt17 > 0) {
                        relativeArcTo = new f.LineTo(fArrJ17[0], fArrJ17[1]);
                    } else if ((relativeArcTo instanceof f.RelativeMoveTo) && iNextInt17 > 0) {
                        relativeArcTo = new f.RelativeLineTo(fArrJ17[0], fArrJ17[1]);
                    }
                    arrayList.add(relativeArcTo);
                }
            } else {
                if (c10 != 'A') {
                    throw new IllegalArgumentException("Unknown command for: " + c10);
                }
                fi.j jVarB18 = u.B1(new fi.l(0, args.length - 7), 7);
                arrayList = new ArrayList(t.Y(jVarB18, 10));
                Iterator<Integer> it18 = jVarB18.iterator();
                while (it18.hasNext()) {
                    int iNextInt18 = ((k0) it18).nextInt();
                    float[] fArrJ18 = kotlin.collections.m.J1(args, iNextInt18, iNextInt18 + 7);
                    Object arcTo = new f.ArcTo(fArrJ18[0], fArrJ18[1], fArrJ18[2], Float.compare(fArrJ18[3], 0.0f) != 0, Float.compare(fArrJ18[4], 0.0f) != 0, fArrJ18[5], fArrJ18[6]);
                    if ((arcTo instanceof f.MoveTo) && iNextInt18 > 0) {
                        arcTo = new f.LineTo(fArrJ18[0], fArrJ18[1]);
                    } else if ((arcTo instanceof f.RelativeMoveTo) && iNextInt18 > 0) {
                        arcTo = new f.RelativeLineTo(fArrJ18[0], fArrJ18[1]);
                    }
                    arrayList.add(arcTo);
                }
            }
        }
        return arrayList;
    }
}
