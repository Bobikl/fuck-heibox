package androidx.compose.ui.text.font;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: FontVariation.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005\u0007\u0019\u0011\b\u000bB\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u001b\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000fJ7\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0016\"\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/text/font/j0;", "", "", "name", "", "value", "Landroidx/compose/ui/text/font/j0$a;", ak.av, "d", "Ls1/u;", "textSize", "e", "(J)Landroidx/compose/ui/text/font/j0$a;", "f", RXScreenCaptureService.KEY_HEIGHT, "", "g", ak.aF, "Landroidx/compose/ui/text/font/k0;", "weight", "Landroidx/compose/ui/text/font/g0;", "style", "", "settings", "Landroidx/compose/ui/text/font/j0$e;", "b", "(Landroidx/compose/ui/text/font/k0;I[Landroidx/compose/ui/text/font/j0$a;)Landroidx/compose/ui/text/font/j0$e;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
@androidx.compose.ui.text.g
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final j0 f16565a = new j0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f16566b = 0;

    /* JADX INFO: compiled from: FontVariation.kt */
    @androidx.compose.runtime.m0
    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0003\u000e\u000f\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/j0$a;", "", "Ls1/e;", "density", "", ak.aF, "", "b", "()Z", "needsDensity", "", ak.av, "()Ljava/lang/String;", "axisName", "Landroidx/compose/ui/text/font/j0$b;", "Landroidx/compose/ui/text/font/j0$c;", "Landroidx/compose/ui/text/font/j0$d;", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public interface a {
        @dl.d
        /* JADX INFO: renamed from: a */
        String getAxisName();

        /* JADX INFO: renamed from: b */
        boolean getNeedsDensity();

        float c(@dl.e s1.e density);
    }

    /* JADX INFO: compiled from: FontVariation.kt */
    @androidx.compose.runtime.m0
    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/text/font/j0$b;", "Landroidx/compose/ui/text/font/j0$a;", "Ls1/e;", "density", "", ak.aF, "", "other", "", "equals", "", "hashCode", "", "toString", ak.av, "Ljava/lang/String;", "()Ljava/lang/String;", "axisName", "b", "F", "d", "()F", "value", "Z", "()Z", "needsDensity", "<init>", "(Ljava/lang/String;F)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final String axisName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final float value;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean needsDensity;

        public b(@dl.d String axisName, float f10) {
            kotlin.jvm.internal.f0.p(axisName, "axisName");
            this.axisName = axisName;
            this.value = f10;
        }

        @Override // androidx.compose.ui.text.font.j0.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAxisName() {
            return this.axisName;
        }

        @Override // androidx.compose.ui.text.font.j0.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        @Override // androidx.compose.ui.text.font.j0.a
        public float c(@dl.e s1.e density) {
            return this.value;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getValue() {
            return this.value;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            if (kotlin.jvm.internal.f0.g(getAxisName(), bVar.getAxisName())) {
                return (this.value > bVar.value ? 1 : (this.value == bVar.value ? 0 : -1)) == 0;
            }
            return false;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + Float.floatToIntBits(this.value);
        }

        @dl.d
        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + this.value + ')';
        }
    }

    /* JADX INFO: compiled from: FontVariation.kt */
    @androidx.compose.runtime.m0
    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/text/font/j0$c;", "Landroidx/compose/ui/text/font/j0$a;", "Ls1/e;", "density", "", ak.aF, "", "other", "", "equals", "", "hashCode", "", "toString", ak.av, "Ljava/lang/String;", "()Ljava/lang/String;", "axisName", "b", "I", "d", "()I", "value", "Z", "()Z", "needsDensity", "<init>", "(Ljava/lang/String;I)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final String axisName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int value;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean needsDensity;

        public c(@dl.d String axisName, int i10) {
            kotlin.jvm.internal.f0.p(axisName, "axisName");
            this.axisName = axisName;
            this.value = i10;
        }

        @Override // androidx.compose.ui.text.font.j0.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAxisName() {
            return this.axisName;
        }

        @Override // androidx.compose.ui.text.font.j0.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        @Override // androidx.compose.ui.text.font.j0.a
        public float c(@dl.e s1.e density) {
            return this.value;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return kotlin.jvm.internal.f0.g(getAxisName(), cVar.getAxisName()) && this.value == cVar.value;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + this.value;
        }

        @dl.d
        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + this.value + ')';
        }
    }

    /* JADX INFO: compiled from: FontVariation.kt */
    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R \u0010\u0017\u001a\u00020\u00128\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/text/font/j0$d;", "Landroidx/compose/ui/text/font/j0$a;", "Ls1/e;", "density", "", ak.aF, "", "other", "", "equals", "", "hashCode", "", "toString", ak.av, "Ljava/lang/String;", "()Ljava/lang/String;", "axisName", "Ls1/u;", "b", "J", "d", "()J", "value", "Z", "()Z", "needsDensity", "<init>", "(Ljava/lang/String;JLkotlin/jvm/internal/u;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    @androidx.compose.runtime.m0
    public static final class d implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final String axisName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long value;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean needsDensity;

        private d(String str, long j10) {
            this.axisName = str;
            this.value = j10;
            this.needsDensity = true;
        }

        public /* synthetic */ d(String str, long j10, kotlin.jvm.internal.u uVar) {
            this(str, j10);
        }

        @Override // androidx.compose.ui.text.font.j0.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAxisName() {
            return this.axisName;
        }

        @Override // androidx.compose.ui.text.font.j0.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        @Override // androidx.compose.ui.text.font.j0.a
        public float c(@dl.e s1.e density) {
            if (density != null) {
                return s1.u.n(this.value) * density.getF139218c();
            }
            throw new IllegalArgumentException("density must not be null".toString());
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getValue() {
            return this.value;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return kotlin.jvm.internal.f0.g(getAxisName(), dVar.getAxisName()) && s1.u.j(this.value, dVar.value);
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + s1.u.o(this.value);
        }

        @dl.d
        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + ((Object) s1.u.u(this.value)) + ')';
        }
    }

    /* JADX INFO: compiled from: FontVariation.kt */
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0011\"\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\t\u0010\u000f¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/font/j0$e;", "", "other", "", "equals", "", "hashCode", "", "Landroidx/compose/ui/text/font/j0$a;", ak.av, "Ljava/util/List;", "b", "()Ljava/util/List;", "settings", "Z", "()Z", "needsDensity", "", "<init>", "([Landroidx/compose/ui/text/font/j0$a;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    @androidx.compose.runtime.m0
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final List<a> settings;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean needsDensity;

        public e(@dl.d a... settings) {
            kotlin.jvm.internal.f0.p(settings, "settings");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z10 = false;
            for (a aVar : settings) {
                String axisName = aVar.getAxisName();
                Object arrayList = linkedHashMap.get(axisName);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(axisName, arrayList);
                }
                ((List) arrayList).add(aVar);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    ArrayList arrayList3 = new ArrayList(arrayList2);
                    this.settings = arrayList3;
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (((a) arrayList3.get(i10)).getNeedsDensity()) {
                            z10 = true;
                            break;
                        }
                    }
                    this.needsDensity = z10;
                    return;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (!(list.size() == 1)) {
                    throw new IllegalArgumentException(('\'' + str + "' must be unique. Actual [ [" + CollectionsKt___CollectionsKt.h3(list, null, null, null, 0, null, null, 63, null) + ']').toString());
                }
                kotlin.collections.x.n0(arrayList2, list);
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getNeedsDensity() {
            return this.needsDensity;
        }

        @dl.d
        public final List<a> b() {
            return this.settings;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && kotlin.jvm.internal.f0.g(this.settings, ((e) other).settings);
        }

        public int hashCode() {
            return this.settings.hashCode();
        }
    }

    private j0() {
    }

    @dl.d
    public final a a(@dl.d String name, float value) {
        kotlin.jvm.internal.f0.p(name, "name");
        if (name.length() == 4) {
            return new b(name, value);
        }
        throw new IllegalArgumentException(("Name must be exactly four characters. Actual: '" + name + '\'').toString());
    }

    @dl.d
    public final e b(@dl.d FontWeight weight, int style, @dl.d a... settings) {
        kotlin.jvm.internal.f0.p(weight, "weight");
        kotlin.jvm.internal.f0.p(settings, "settings");
        kotlin.jvm.internal.u0 u0Var = new kotlin.jvm.internal.u0(3);
        u0Var.a(g(weight.w()));
        u0Var.a(d(style));
        u0Var.b(settings);
        return new e((a[]) u0Var.d(new a[u0Var.c()]));
    }

    @dl.d
    public final a c(int value) {
        boolean z10 = false;
        if (-1000 <= value && value < 1001) {
            z10 = true;
        }
        if (z10) {
            return new c("GRAD", value);
        }
        throw new IllegalArgumentException("'GRAD' must be in -1000..1000".toString());
    }

    @dl.d
    public final a d(float value) {
        boolean z10 = false;
        if (0.0f <= value && value <= 1.0f) {
            z10 = true;
        }
        if (z10) {
            return new b("ital", value);
        }
        throw new IllegalArgumentException(("'ital' must be in 0.0f..1.0f. Actual: " + value).toString());
    }

    @dl.d
    public final a e(long textSize) {
        if (!s1.u.q(textSize)) {
            throw new IllegalArgumentException("'opsz' must be provided in sp units".toString());
        }
        return new d("opsz", textSize, null);
    }

    @dl.d
    public final a f(float value) {
        boolean z10 = false;
        if (-90.0f <= value && value <= 90.0f) {
            z10 = true;
        }
        if (z10) {
            return new b("slnt", value);
        }
        throw new IllegalArgumentException(("'slnt' must be in -90f..90f. Actual: " + value).toString());
    }

    @dl.d
    public final a g(int value) {
        boolean z10 = false;
        if (1 <= value && value < 1001) {
            z10 = true;
        }
        if (z10) {
            return new c("wght", value);
        }
        throw new IllegalArgumentException(("'wght' value must be in [1, 1000]. Actual: " + value).toString());
    }

    @dl.d
    public final a h(float value) {
        if (value > 0.0f) {
            return new b("wdth", value);
        }
        throw new IllegalArgumentException(("'wdth' must be strictly > 0.0f. Actual: " + value).toString());
    }
}
