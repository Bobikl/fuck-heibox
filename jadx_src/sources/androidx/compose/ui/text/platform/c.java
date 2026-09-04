package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.FontListFontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.e0;
import androidx.compose.ui.text.font.f0;
import androidx.compose.ui.text.font.g0;
import androidx.compose.ui.text.font.i0;
import androidx.compose.ui.text.font.u;
import androidx.compose.ui.text.font.v;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: AndroidFontListTypeface.android.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.k(message = "This is not supported after downloadable fonts.")
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\fBB\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u001c\b\u0002\u0010\u001f\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u001e\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000bø\u0001\u0001¢\u0006\u0004\b \u0010!J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\f\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, d2 = {"Landroidx/compose/ui/text/platform/c;", "Landroidx/compose/ui/text/platform/n;", "Landroidx/compose/ui/text/font/k0;", com.google.android.exoplayer2.text.ttml.d.L, "Landroidx/compose/ui/text/font/g0;", com.google.android.exoplayer2.text.ttml.d.I, "Landroidx/compose/ui/text/font/h0;", "synthesis", "Landroid/graphics/Typeface;", "b", "(Landroidx/compose/ui/text/font/k0;II)Landroid/graphics/Typeface;", "Landroidx/compose/ui/text/font/f0;", ak.av, "Landroidx/compose/ui/text/font/f0;", "d", "()Landroidx/compose/ui/text/font/f0;", "fontMatcher", "", "Landroidx/compose/ui/text/font/u;", "Ljava/util/Map;", "loadedTypefaces", "Landroidx/compose/ui/text/font/v;", ak.aF, "Landroidx/compose/ui/text/font/v;", "()Landroidx/compose/ui/text/font/v;", com.google.android.exoplayer2.text.ttml.d.K, "Landroidx/compose/ui/text/font/c0;", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "", "Lkotlin/Pair;", "necessaryStyles", "<init>", "(Landroidx/compose/ui/text/font/c0;Landroid/content/Context;Ljava/util/List;Landroidx/compose/ui/text/font/f0;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class c implements n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final a f16849d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    @Deprecated
    private static final f0 f16850e = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f0 fontMatcher;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<u, Typeface> loadedTypefaces;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final v fontFamily;

    /* JADX INFO: compiled from: AndroidFontListTypeface.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/platform/c$a;", "", "Landroidx/compose/ui/text/font/f0;", "fontMatcher", "Landroidx/compose/ui/text/font/f0;", ak.av, "()Landroidx/compose/ui/text/font/f0;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final f0 a() {
            return c.f16850e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00b2  */
    public c(@dl.d FontListFontFamily fontFamily, @dl.d Context context, @dl.e List<Pair<FontWeight, g0>> list, @dl.d f0 fontMatcher) {
        ArrayList arrayList;
        kotlin.jvm.internal.f0.p(fontFamily, "fontFamily");
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(fontMatcher, "fontMatcher");
        this.fontMatcher = fontMatcher;
        List<u> listV = fontFamily.v();
        ArrayList arrayList2 = new ArrayList(listV.size());
        int size = listV.size();
        for (int i10 = 0; i10 < size; i10++) {
            u uVar = listV.get(i10);
            if (e0.g(uVar.getLoadingStrategy(), e0.INSTANCE.b())) {
                arrayList2.add(uVar);
            }
        }
        if (list != null) {
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                Pair<FontWeight, g0> pair = list.get(i11);
                arrayList3.add((u) CollectionsKt___CollectionsKt.B2(this.fontMatcher.e(arrayList2, pair.a(), pair.b().j())));
            }
            List listF = androidx.compose.ui.text.f0.f(arrayList3);
            if (listF != null) {
                HashSet hashSet = new HashSet(listF.size());
                arrayList = new ArrayList(listF.size());
                int size3 = listF.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    Object obj = listF.get(i12);
                    if (hashSet.add((u) obj)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
        } else {
            arrayList = null;
        }
        arrayList2 = arrayList != null ? arrayList : arrayList2;
        if (arrayList2.isEmpty()) {
            throw new IllegalStateException("Could not match font");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size4 = arrayList2.size();
        for (int i13 = 0; i13 < size4; i13++) {
            u uVar2 = (u) arrayList2.get(i13);
            try {
                linkedHashMap.put(uVar2, o.f16868a.b(context, uVar2));
            } catch (Exception unused) {
                throw new IllegalStateException("Cannot create Typeface from " + uVar2);
            }
        }
        this.loadedTypefaces = linkedHashMap;
        this.fontFamily = fontFamily;
    }

    public /* synthetic */ c(FontListFontFamily fontListFontFamily, Context context, List list, f0 f0Var, int i10, kotlin.jvm.internal.u uVar) {
        this(fontListFontFamily, context, (i10 & 4) != 0 ? null : list, (i10 & 8) != 0 ? f16850e : f0Var);
    }

    @Override // androidx.compose.ui.text.font.a1
    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public v getFontFamily() {
        return this.fontFamily;
    }

    @Override // androidx.compose.ui.text.platform.n
    @dl.d
    public Typeface b(@dl.d FontWeight fontWeight, int fontStyle, int synthesis) {
        kotlin.jvm.internal.f0.p(fontWeight, "fontWeight");
        u uVar = (u) CollectionsKt___CollectionsKt.B2(this.fontMatcher.e(new ArrayList(this.loadedTypefaces.keySet()), fontWeight, fontStyle));
        if (uVar == null) {
            throw new IllegalStateException("Could not load font");
        }
        Typeface typeface = this.loadedTypefaces.get(uVar);
        if (typeface == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        Object objA = i0.a(synthesis, typeface, uVar, fontWeight, fontStyle);
        kotlin.jvm.internal.f0.n(objA, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) objA;
    }

    @dl.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public final f0 getFontMatcher() {
        return this.fontMatcher;
    }
}
