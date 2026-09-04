package androidx.compose.ui.text.font;

import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: FontMatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJH\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0080\b¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0012\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/text/font/f0;", "", "", "Landroidx/compose/ui/text/font/u;", "fontList", "Landroidx/compose/ui/text/font/k0;", com.google.android.exoplayer2.text.ttml.d.L, "Landroidx/compose/ui/text/font/g0;", com.google.android.exoplayer2.text.ttml.d.I, "e", "(Ljava/util/List;Landroidx/compose/ui/text/font/k0;I)Ljava/util/List;", "", "preferBelow", "minSearchRange", "maxSearchRange", ak.av, "(Ljava/util/List;Landroidx/compose/ui/text/font/k0;ZLandroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/k0;)Ljava/util/List;", "Landroidx/compose/ui/text/font/v;", com.google.android.exoplayer2.text.ttml.d.K, ak.aF, "(Landroidx/compose/ui/text/font/v;Landroidx/compose/ui/text/font/k0;I)Ljava/util/List;", "Landroidx/compose/ui/text/font/c0;", "d", "(Landroidx/compose/ui/text/font/c0;Landroidx/compose/ui/text/font/k0;I)Ljava/util/List;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class f0 {
    public static /* synthetic */ List b(f0 f0Var, List list, FontWeight fontWeight, boolean z10, FontWeight fontWeight2, FontWeight fontWeight3, int i10, Object obj) {
        FontWeight fontWeight4 = null;
        if ((i10 & 4) != 0) {
            fontWeight2 = null;
        }
        if ((i10 & 8) != 0) {
            fontWeight3 = null;
        }
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(fontWeight, "fontWeight");
        int size = list.size();
        FontWeight fontWeight5 = null;
        for (int i11 = 0; i11 < size; i11++) {
            FontWeight weight = ((u) list.get(i11)).getWeight();
            if ((fontWeight2 == null || weight.compareTo(fontWeight2) >= 0) && (fontWeight3 == null || weight.compareTo(fontWeight3) <= 0)) {
                if (weight.compareTo(fontWeight) >= 0) {
                    if (weight.compareTo(fontWeight) <= 0) {
                        fontWeight4 = weight;
                        fontWeight5 = fontWeight4;
                        break;
                    }
                    if (fontWeight5 == null || weight.compareTo(fontWeight5) < 0) {
                        fontWeight5 = weight;
                    }
                } else if (fontWeight4 == null || weight.compareTo(fontWeight4) > 0) {
                    fontWeight4 = weight;
                }
            }
        }
        if (!z10 ? fontWeight5 != null : fontWeight4 == null) {
            fontWeight4 = fontWeight5;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            Object obj2 = list.get(i12);
            if (kotlin.jvm.internal.f0.g(((u) obj2).getWeight(), fontWeight4)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    @dl.d
    public final List<u> a(@dl.d List<? extends u> list, @dl.d FontWeight fontWeight, boolean z10, @dl.e FontWeight fontWeight2, @dl.e FontWeight fontWeight3) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(fontWeight, "fontWeight");
        int size = list.size();
        FontWeight fontWeight4 = null;
        FontWeight fontWeight5 = null;
        for (int i10 = 0; i10 < size; i10++) {
            FontWeight weight = list.get(i10).getWeight();
            if ((fontWeight2 == null || weight.compareTo(fontWeight2) >= 0) && (fontWeight3 == null || weight.compareTo(fontWeight3) <= 0)) {
                if (weight.compareTo(fontWeight) >= 0) {
                    if (weight.compareTo(fontWeight) <= 0) {
                        fontWeight4 = weight;
                        fontWeight5 = fontWeight4;
                        break;
                    }
                    if (fontWeight5 == null || weight.compareTo(fontWeight5) < 0) {
                        fontWeight5 = weight;
                    }
                } else if (fontWeight4 == null || weight.compareTo(fontWeight4) > 0) {
                    fontWeight4 = weight;
                }
            }
        }
        if (!z10 ? fontWeight5 != null : fontWeight4 == null) {
            fontWeight4 = fontWeight5;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            u uVar = list.get(i11);
            if (kotlin.jvm.internal.f0.g(uVar.getWeight(), fontWeight4)) {
                arrayList.add(uVar);
            }
        }
        return arrayList;
    }

    @dl.d
    public final List<u> c(@dl.d v fontFamily, @dl.d FontWeight fontWeight, int fontStyle) {
        kotlin.jvm.internal.f0.p(fontFamily, "fontFamily");
        kotlin.jvm.internal.f0.p(fontWeight, "fontWeight");
        if (fontFamily instanceof FontListFontFamily) {
            return d((FontListFontFamily) fontFamily, fontWeight, fontStyle);
        }
        throw new IllegalArgumentException("Only FontFamily instances that presents a list of Fonts can be used");
    }

    @dl.d
    public final List<u> d(@dl.d FontListFontFamily fontFamily, @dl.d FontWeight fontWeight, int fontStyle) {
        kotlin.jvm.internal.f0.p(fontFamily, "fontFamily");
        kotlin.jvm.internal.f0.p(fontWeight, "fontWeight");
        return e(fontFamily.v(), fontWeight, fontStyle);
    }

    @dl.d
    public final List<u> e(@dl.d List<? extends u> fontList, @dl.d FontWeight fontWeight, int fontStyle) {
        kotlin.jvm.internal.f0.p(fontList, "fontList");
        kotlin.jvm.internal.f0.p(fontWeight, "fontWeight");
        ArrayList arrayList = new ArrayList(fontList.size());
        int size = fontList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            u uVar = fontList.get(i11);
            u uVar2 = uVar;
            if (kotlin.jvm.internal.f0.g(uVar2.getWeight(), fontWeight) && g0.f(uVar2.getStyle(), fontStyle)) {
                arrayList.add(uVar);
            }
            i11++;
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        b2 b2Var = b2.f124493a;
        ArrayList arrayList2 = new ArrayList(fontList.size());
        int size2 = fontList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            u uVar3 = fontList.get(i12);
            if (g0.f(uVar3.getStyle(), fontStyle)) {
                arrayList2.add(uVar3);
            }
        }
        if (!arrayList2.isEmpty()) {
            fontList = arrayList2;
        }
        FontWeight.Companion companion = FontWeight.INSTANCE;
        FontWeight fontWeight2 = null;
        if (fontWeight.compareTo(companion.z()) < 0) {
            int size3 = fontList.size();
            FontWeight fontWeight3 = null;
            for (int i13 = 0; i13 < size3; i13++) {
                FontWeight weight = fontList.get(i13).getWeight();
                if (weight.compareTo(fontWeight) >= 0) {
                    if (weight.compareTo(fontWeight) <= 0) {
                        fontWeight3 = weight;
                        fontWeight2 = fontWeight3;
                        break;
                    }
                    if (fontWeight3 == null || weight.compareTo(fontWeight3) < 0) {
                        fontWeight3 = weight;
                    }
                } else if (fontWeight2 == null || weight.compareTo(fontWeight2) > 0) {
                    fontWeight2 = weight;
                }
            }
            if (fontWeight2 != null) {
                fontWeight3 = fontWeight2;
            }
            ArrayList arrayList3 = new ArrayList(fontList.size());
            int size4 = fontList.size();
            while (i10 < size4) {
                u uVar4 = fontList.get(i10);
                if (kotlin.jvm.internal.f0.g(uVar4.getWeight(), fontWeight3)) {
                    arrayList3.add(uVar4);
                }
                i10++;
            }
            return arrayList3;
        }
        if (fontWeight.compareTo(companion.B()) > 0) {
            int size5 = fontList.size();
            FontWeight fontWeight4 = null;
            for (int i14 = 0; i14 < size5; i14++) {
                FontWeight weight2 = fontList.get(i14).getWeight();
                if (weight2.compareTo(fontWeight) >= 0) {
                    if (weight2.compareTo(fontWeight) <= 0) {
                        fontWeight4 = weight2;
                        fontWeight2 = fontWeight4;
                        break;
                    }
                    if (fontWeight4 == null || weight2.compareTo(fontWeight4) < 0) {
                        fontWeight4 = weight2;
                    }
                } else if (fontWeight2 == null || weight2.compareTo(fontWeight2) > 0) {
                    fontWeight2 = weight2;
                }
            }
            if (fontWeight4 == null) {
                fontWeight4 = fontWeight2;
            }
            ArrayList arrayList4 = new ArrayList(fontList.size());
            int size6 = fontList.size();
            while (i10 < size6) {
                u uVar5 = fontList.get(i10);
                if (kotlin.jvm.internal.f0.g(uVar5.getWeight(), fontWeight4)) {
                    arrayList4.add(uVar5);
                }
                i10++;
            }
            return arrayList4;
        }
        FontWeight fontWeightB = companion.B();
        int size7 = fontList.size();
        FontWeight fontWeight5 = null;
        FontWeight fontWeight6 = null;
        for (int i15 = 0; i15 < size7; i15++) {
            FontWeight weight3 = fontList.get(i15).getWeight();
            if (fontWeightB == null || weight3.compareTo(fontWeightB) <= 0) {
                if (weight3.compareTo(fontWeight) >= 0) {
                    if (weight3.compareTo(fontWeight) <= 0) {
                        fontWeight5 = weight3;
                        fontWeight6 = fontWeight5;
                        break;
                    }
                    if (fontWeight6 == null || weight3.compareTo(fontWeight6) < 0) {
                        fontWeight6 = weight3;
                    }
                } else if (fontWeight5 == null || weight3.compareTo(fontWeight5) > 0) {
                    fontWeight5 = weight3;
                }
            }
        }
        if (fontWeight6 != null) {
            fontWeight5 = fontWeight6;
        }
        ArrayList arrayList5 = new ArrayList(fontList.size());
        int size8 = fontList.size();
        for (int i16 = 0; i16 < size8; i16++) {
            u uVar6 = fontList.get(i16);
            if (kotlin.jvm.internal.f0.g(uVar6.getWeight(), fontWeight5)) {
                arrayList5.add(uVar6);
            }
        }
        if (!arrayList5.isEmpty()) {
            return arrayList5;
        }
        FontWeight fontWeightB2 = FontWeight.INSTANCE.B();
        int size9 = fontList.size();
        FontWeight fontWeight7 = null;
        for (int i17 = 0; i17 < size9; i17++) {
            FontWeight weight4 = fontList.get(i17).getWeight();
            if (fontWeightB2 == null || weight4.compareTo(fontWeightB2) >= 0) {
                if (weight4.compareTo(fontWeight) >= 0) {
                    if (weight4.compareTo(fontWeight) <= 0) {
                        fontWeight2 = weight4;
                        fontWeight7 = fontWeight2;
                        break;
                    }
                    if (fontWeight7 == null || weight4.compareTo(fontWeight7) < 0) {
                        fontWeight7 = weight4;
                    }
                } else if (fontWeight2 == null || weight4.compareTo(fontWeight2) > 0) {
                    fontWeight2 = weight4;
                }
            }
        }
        if (fontWeight7 != null) {
            fontWeight2 = fontWeight7;
        }
        ArrayList arrayList6 = new ArrayList(fontList.size());
        int size10 = fontList.size();
        while (i10 < size10) {
            u uVar7 = fontList.get(i10);
            if (kotlin.jvm.internal.f0.g(uVar7.getWeight(), fontWeight2)) {
                arrayList6.add(uVar7);
            }
            i10++;
        }
        return arrayList6;
    }
}
