package androidx.compose.ui.text;

import androidx.compose.runtime.j2;
import com.max.xiaoheihe.module.bbs.ChannelListActivity;
import com.meituan.robust.Constants;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import io.flutter.plugin.editing.SpellCheckPlugin;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: AnnotatedString.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0005 BU\b\u0000\u0012\u0006\u0010$\u001a\u00020\u000f\u0012\u0014\b\u0002\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00140\u0013\u0012\u0014\b\u0002\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00140\u0013\u0012\u0016\b\u0002\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u00140\u0013¢\u0006\u0004\b1\u00102B=\b\u0016\u0012\u0006\u0010$\u001a\u00020\u000f\u0012\u0014\b\u0002\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00140\u0013\u0012\u0014\b\u0002\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00140\u0013¢\u0006\u0004\b1\u00103J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u001b\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0087\u0002J*\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00140\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002J\"\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00140\u00132\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002J\"\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00140\u00132\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002J$\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00140\u00132\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0007J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\r\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\u000fH\u0016R\u0017\u0010$\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R#\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00140\u00138\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R#\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00140\u00138\u0006¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b,\u0010)R(\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u00140\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b \u0010)R\u0014\u00100\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010/\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00064"}, d2 = {"Landroidx/compose/ui/text/d;", "", "", UCropPlusActivity.ARG_INDEX, "", ak.av, SpellCheckPlugin.START_INDEX_KEY, SpellCheckPlugin.END_INDEX_KEY, "l", "Landroidx/compose/ui/text/o0;", com.google.android.exoplayer2.source.rtsp.k0.f48802q, "m", "(J)Landroidx/compose/ui/text/d;", "other", "k", "", "tag", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "", "Landroidx/compose/ui/text/d$b;", "g", "f", "Landroidx/compose/ui/text/s0;", "i", "Landroidx/compose/ui/text/t0;", "j", "", "", "equals", "hashCode", "toString", "b", "Ljava/lang/String;", RXScreenCaptureService.KEY_HEIGHT, "()Ljava/lang/String;", "text", "Landroidx/compose/ui/text/d0;", ak.aF, "Ljava/util/List;", "e", "()Ljava/util/List;", "spanStyles", "Landroidx/compose/ui/text/u;", "d", "paragraphStyles", "annotations", "()I", com.google.android.exoplayer2.source.rtsp.k0.f48801p, "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class d implements CharSequence {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String text;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<Range<SpanStyle>> spanStyles;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<Range<ParagraphStyle>> paragraphStyles;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<Range<? extends Object>> annotations;

    /* JADX INFO: compiled from: AnnotatedString.kt */
    @Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B\u0011\u0012\b\b\u0002\u00102\u001a\u00020\r¢\u0006\u0004\b3\u00104B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b3\u00105B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b3\u00106J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\tJ\u001e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rJ\u001e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rJ&\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rJ \u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0007J \u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0007J\u000e\u0010\u001c\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u001d\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0011J\u0016\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002J\u000e\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016J\u0010\u0010 \u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007J\u0006\u0010!\u001a\u00020\u0004J\u000e\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\rJ\u0006\u0010$\u001a\u00020\tR\u0018\u0010\u0003\u001a\u00060%j\u0002`&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010'R \u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010*R \u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010*R\"\u0010-\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010*R\"\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010*R\u0011\u00101\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00067"}, d2 = {"Landroidx/compose/ui/text/d$a;", "", "", "text", "Lkotlin/b2;", RXScreenCaptureService.KEY_HEIGHT, "", Constants.CHAR, "f", "Landroidx/compose/ui/text/d;", "g", "Landroidx/compose/ui/text/d0;", "style", "", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, ak.aF, "Landroidx/compose/ui/text/u;", "b", "tag", "annotation", ak.av, "Landroidx/compose/ui/text/s0;", "ttsAnnotation", "d", "Landroidx/compose/ui/text/t0;", "urlAnnotation", "e", "n", "m", "l", "o", "p", "j", UCropPlusActivity.ARG_INDEX, "k", "q", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "", "Landroidx/compose/ui/text/d$a$a;", "Ljava/util/List;", "spanStyles", "paragraphStyles", "annotations", "styleStack", "i", "()I", com.google.android.exoplayer2.source.rtsp.k0.f48801p, "capacity", "<init>", "(I)V", "(Ljava/lang/String;)V", "(Landroidx/compose/ui/text/d;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f16389f = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final StringBuilder text;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final List<MutableRange<SpanStyle>> spanStyles;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final List<MutableRange<ParagraphStyle>> paragraphStyles;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final List<MutableRange<? extends Object>> annotations;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final List<MutableRange<? extends Object>> styleStack;

        /* JADX INFO: renamed from: androidx.compose.ui.text.d$a$a, reason: collision with other inner class name and from toString */
        /* JADX INFO: compiled from: AnnotatedString.kt */
        @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\u0012\u0006\u0010\r\u001a\u00028\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b#\u0010$J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0007\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J>\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\r\u001a\u00028\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0013\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\r\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\bR\u0017\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u000f\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c\"\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Landroidx/compose/ui/text/d$a$a;", androidx.exifinterface.media.a.f23244d5, "", "", "defaultEnd", "Landroidx/compose/ui/text/d$b;", "l", ak.av, "()Ljava/lang/Object;", "b", ak.aF, "", "d", ChannelListActivity.q.f79586f, com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "tag", "e", "(Ljava/lang/Object;IILjava/lang/String;)Landroidx/compose/ui/text/d$a$a;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/Object;", RXScreenCaptureService.KEY_HEIGHT, "I", "i", "()I", "g", "k", "(I)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
        public static final /* data */ class MutableRange<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final T item;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int start;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private int end;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            @dl.d
            private final String tag;

            public MutableRange(T t10, int i10, int i11, @dl.d String tag) {
                kotlin.jvm.internal.f0.p(tag, "tag");
                this.item = t10;
                this.start = i10;
                this.end = i11;
                this.tag = tag;
            }

            public /* synthetic */ MutableRange(Object obj, int i10, int i11, String str, int i12, kotlin.jvm.internal.u uVar) {
                this(obj, i10, (i12 & 4) != 0 ? Integer.MIN_VALUE : i11, (i12 & 8) != 0 ? "" : str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ MutableRange f(MutableRange mutableRange, Object obj, int i10, int i11, String str, int i12, Object obj2) {
                if ((i12 & 1) != 0) {
                    obj = mutableRange.item;
                }
                if ((i12 & 2) != 0) {
                    i10 = mutableRange.start;
                }
                if ((i12 & 4) != 0) {
                    i11 = mutableRange.end;
                }
                if ((i12 & 8) != 0) {
                    str = mutableRange.tag;
                }
                return mutableRange.e(obj, i10, i11, str);
            }

            public static /* synthetic */ Range m(MutableRange mutableRange, int i10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = Integer.MIN_VALUE;
                }
                return mutableRange.l(i10);
            }

            public final T a() {
                return this.item;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final int getStart() {
                return this.start;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final int getEnd() {
                return this.end;
            }

            @dl.d
            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getTag() {
                return this.tag;
            }

            @dl.d
            public final MutableRange<T> e(T item, int start, int end, @dl.d String tag) {
                kotlin.jvm.internal.f0.p(tag, "tag");
                return new MutableRange<>(item, start, end, tag);
            }

            public boolean equals(@dl.e Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MutableRange)) {
                    return false;
                }
                MutableRange mutableRange = (MutableRange) other;
                return kotlin.jvm.internal.f0.g(this.item, mutableRange.item) && this.start == mutableRange.start && this.end == mutableRange.end && kotlin.jvm.internal.f0.g(this.tag, mutableRange.tag);
            }

            public final int g() {
                return this.end;
            }

            public final T h() {
                return this.item;
            }

            public int hashCode() {
                T t10 = this.item;
                return ((((((t10 == null ? 0 : t10.hashCode()) * 31) + this.start) * 31) + this.end) * 31) + this.tag.hashCode();
            }

            public final int i() {
                return this.start;
            }

            @dl.d
            public final String j() {
                return this.tag;
            }

            public final void k(int i10) {
                this.end = i10;
            }

            @dl.d
            public final Range<T> l(int defaultEnd) {
                int i10 = this.end;
                if (i10 != Integer.MIN_VALUE) {
                    defaultEnd = i10;
                }
                if (defaultEnd != Integer.MIN_VALUE) {
                    return new Range<>(this.item, this.start, defaultEnd, this.tag);
                }
                throw new IllegalStateException("Item.end should be set first".toString());
            }

            @dl.d
            public String toString() {
                return "MutableRange(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
            }
        }

        public a() {
            this(0, 1, null);
        }

        public a(int i10) {
            this.text = new StringBuilder(i10);
            this.spanStyles = new ArrayList();
            this.paragraphStyles = new ArrayList();
            this.annotations = new ArrayList();
            this.styleStack = new ArrayList();
        }

        public /* synthetic */ a(int i10, int i11, kotlin.jvm.internal.u uVar) {
            this((i11 & 1) != 0 ? 16 : i10);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@dl.d d text) {
            this(0, 1, null);
            kotlin.jvm.internal.f0.p(text, "text");
            g(text);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@dl.d String text) {
            this(0, 1, null);
            kotlin.jvm.internal.f0.p(text, "text");
            h(text);
        }

        public final void a(@dl.d String tag, @dl.d String annotation, int i10, int i11) {
            kotlin.jvm.internal.f0.p(tag, "tag");
            kotlin.jvm.internal.f0.p(annotation, "annotation");
            this.annotations.add(new MutableRange<>(annotation, i10, i11, tag));
        }

        public final void b(@dl.d ParagraphStyle style, int i10, int i11) {
            kotlin.jvm.internal.f0.p(style, "style");
            this.paragraphStyles.add(new MutableRange<>(style, i10, i11, null, 8, null));
        }

        public final void c(@dl.d SpanStyle style, int i10, int i11) {
            kotlin.jvm.internal.f0.p(style, "style");
            this.spanStyles.add(new MutableRange<>(style, i10, i11, null, 8, null));
        }

        @g
        public final void d(@dl.d s0 ttsAnnotation, int i10, int i11) {
            kotlin.jvm.internal.f0.p(ttsAnnotation, "ttsAnnotation");
            this.annotations.add(new MutableRange<>(ttsAnnotation, i10, i11, null, 8, null));
        }

        @g
        public final void e(@dl.d UrlAnnotation urlAnnotation, int i10, int i11) {
            kotlin.jvm.internal.f0.p(urlAnnotation, "urlAnnotation");
            this.annotations.add(new MutableRange<>(urlAnnotation, i10, i11, null, 8, null));
        }

        public final void f(char c10) {
            this.text.append(c10);
        }

        public final void g(@dl.d d text) {
            kotlin.jvm.internal.f0.p(text, "text");
            int length = this.text.length();
            this.text.append(text.getText());
            List<Range<SpanStyle>> listE = text.e();
            int size = listE.size();
            for (int i10 = 0; i10 < size; i10++) {
                Range<SpanStyle> range = listE.get(i10);
                c(range.h(), range.i() + length, range.g() + length);
            }
            List<Range<ParagraphStyle>> listD = text.d();
            int size2 = listD.size();
            for (int i11 = 0; i11 < size2; i11++) {
                Range<ParagraphStyle> range2 = listD.get(i11);
                b(range2.h(), range2.i() + length, range2.g() + length);
            }
            List<Range<? extends Object>> listB = text.b();
            int size3 = listB.size();
            for (int i12 = 0; i12 < size3; i12++) {
                Range<? extends Object> range3 = listB.get(i12);
                this.annotations.add(new MutableRange<>(range3.h(), range3.i() + length, range3.g() + length, range3.j()));
            }
        }

        public final void h(@dl.d String text) {
            kotlin.jvm.internal.f0.p(text, "text");
            this.text.append(text);
        }

        public final int i() {
            return this.text.length();
        }

        public final void j() {
            if (!(!this.styleStack.isEmpty())) {
                throw new IllegalStateException("Nothing to pop.".toString());
            }
            List<MutableRange<? extends Object>> list = this.styleStack;
            list.remove(list.size() - 1).k(this.text.length());
        }

        public final void k(int i10) {
            if (i10 < this.styleStack.size()) {
                while (this.styleStack.size() - 1 >= i10) {
                    j();
                }
            } else {
                throw new IllegalStateException((i10 + " should be less than " + this.styleStack.size()).toString());
            }
        }

        public final int l(@dl.d String tag, @dl.d String annotation) {
            kotlin.jvm.internal.f0.p(tag, "tag");
            kotlin.jvm.internal.f0.p(annotation, "annotation");
            MutableRange<? extends Object> mutableRange = new MutableRange<>(annotation, this.text.length(), 0, tag, 4, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int m(@dl.d ParagraphStyle style) {
            kotlin.jvm.internal.f0.p(style, "style");
            MutableRange<ParagraphStyle> mutableRange = new MutableRange<>(style, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.paragraphStyles.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int n(@dl.d SpanStyle style) {
            kotlin.jvm.internal.f0.p(style, "style");
            MutableRange<SpanStyle> mutableRange = new MutableRange<>(style, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.spanStyles.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int o(@dl.d s0 ttsAnnotation) {
            kotlin.jvm.internal.f0.p(ttsAnnotation, "ttsAnnotation");
            MutableRange<? extends Object> mutableRange = new MutableRange<>(ttsAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        @g
        public final int p(@dl.d UrlAnnotation urlAnnotation) {
            kotlin.jvm.internal.f0.p(urlAnnotation, "urlAnnotation");
            MutableRange<? extends Object> mutableRange = new MutableRange<>(urlAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        @dl.d
        public final d q() {
            String string = this.text.toString();
            kotlin.jvm.internal.f0.o(string, "text.toString()");
            List<MutableRange<SpanStyle>> list = this.spanStyles;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(list.get(i10).l(this.text.length()));
            }
            List<MutableRange<ParagraphStyle>> list2 = this.paragraphStyles;
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                arrayList2.add(list2.get(i11).l(this.text.length()));
            }
            List<MutableRange<? extends Object>> list3 = this.annotations;
            ArrayList arrayList3 = new ArrayList(list3.size());
            int size3 = list3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                arrayList3.add(list3.get(i12).l(this.text.length()));
            }
            return new d(string, arrayList, arrayList2, arrayList3);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.d$b, reason: from toString */
    /* JADX INFO: compiled from: AnnotatedString.kt */
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fB!\b\u0016\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010 J\u0010\u0010\u0003\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J>\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\n\u001a\u00028\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0010\u001a\u00020\bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\n\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0004R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/compose/ui/text/d$b;", androidx.exifinterface.media.a.f23244d5, "", ak.av, "()Ljava/lang/Object;", "", "b", ak.aF, "", "d", ChannelListActivity.q.f79586f, com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "tag", "e", "(Ljava/lang/Object;IILjava/lang/String;)Landroidx/compose/ui/text/d$b;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/Object;", RXScreenCaptureService.KEY_HEIGHT, "I", "i", "()I", "g", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "(Ljava/lang/Object;II)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    @androidx.compose.runtime.m0
    public static final /* data */ class Range<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final T item;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int start;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int end;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @dl.d
        private final String tag;

        public Range(T t10, int i10, int i11) {
            this(t10, i10, i11, "");
        }

        public Range(T t10, int i10, int i11, @dl.d String tag) {
            kotlin.jvm.internal.f0.p(tag, "tag");
            this.item = t10;
            this.start = i10;
            this.end = i11;
            this.tag = tag;
            if (!(i10 <= i11)) {
                throw new IllegalArgumentException("Reversed range is not supported".toString());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Range f(Range range, Object obj, int i10, int i11, String str, int i12, Object obj2) {
            if ((i12 & 1) != 0) {
                obj = range.item;
            }
            if ((i12 & 2) != 0) {
                i10 = range.start;
            }
            if ((i12 & 4) != 0) {
                i11 = range.end;
            }
            if ((i12 & 8) != 0) {
                str = range.tag;
            }
            return range.e(obj, i10, i11, str);
        }

        public final T a() {
            return this.item;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        @dl.d
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        @dl.d
        public final Range<T> e(T item, int start, int end, @dl.d String tag) {
            kotlin.jvm.internal.f0.p(tag, "tag");
            return new Range<>(item, start, end, tag);
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Range)) {
                return false;
            }
            Range range = (Range) other;
            return kotlin.jvm.internal.f0.g(this.item, range.item) && this.start == range.start && this.end == range.end && kotlin.jvm.internal.f0.g(this.tag, range.tag);
        }

        public final int g() {
            return this.end;
        }

        public final T h() {
            return this.item;
        }

        public int hashCode() {
            T t10 = this.item;
            return ((((((t10 == null ? 0 : t10.hashCode()) * 31) + this.start) * 31) + this.end) * 31) + this.tag.hashCode();
        }

        public final int i() {
            return this.start;
        }

        @dl.d
        public final String j() {
            return this.tag;
        }

        @dl.d
        public String toString() {
            return "Range(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
        }
    }

    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {androidx.exifinterface.media.a.f23244d5, "kotlin.jvm.PlatformType", ak.av, "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$a", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return kotlin.comparisons.g.l(Integer.valueOf(((Range) t10).i()), Integer.valueOf(((Range) t11).i()));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(@dl.d String text, @dl.d List<Range<SpanStyle>> spanStyles, @dl.d List<Range<ParagraphStyle>> paragraphStyles) {
        this(text, spanStyles, paragraphStyles, CollectionsKt__CollectionsKt.E());
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(spanStyles, "spanStyles");
        kotlin.jvm.internal.f0.p(paragraphStyles, "paragraphStyles");
    }

    public /* synthetic */ d(String str, List list, List list2, int i10, kotlin.jvm.internal.u uVar) {
        this(str, (i10 & 2) != 0 ? CollectionsKt__CollectionsKt.E() : list, (i10 & 4) != 0 ? CollectionsKt__CollectionsKt.E() : list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@dl.d String text, @dl.d List<Range<SpanStyle>> spanStyles, @dl.d List<Range<ParagraphStyle>> paragraphStyles, @dl.d List<? extends Range<? extends Object>> annotations) {
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(spanStyles, "spanStyles");
        kotlin.jvm.internal.f0.p(paragraphStyles, "paragraphStyles");
        kotlin.jvm.internal.f0.p(annotations, "annotations");
        this.text = text;
        this.spanStyles = spanStyles;
        this.paragraphStyles = paragraphStyles;
        this.annotations = annotations;
        List listP5 = CollectionsKt___CollectionsKt.p5(paragraphStyles, new c());
        int size = listP5.size();
        int iG = -1;
        for (int i10 = 0; i10 < size; i10++) {
            Range range = (Range) listP5.get(i10);
            if (!(range.i() >= iG)) {
                throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
            }
            if (!(range.g() <= this.text.length())) {
                throw new IllegalArgumentException(("ParagraphStyle range [" + range.i() + ", " + range.g() + ") is out of boundary").toString());
            }
            iG = range.g();
        }
    }

    public /* synthetic */ d(String str, List list, List list2, List list3, int i10, kotlin.jvm.internal.u uVar) {
        this(str, (i10 & 2) != 0 ? CollectionsKt__CollectionsKt.E() : list, (i10 & 4) != 0 ? CollectionsKt__CollectionsKt.E() : list2, (i10 & 8) != 0 ? CollectionsKt__CollectionsKt.E() : list3);
    }

    public char a(int index) {
        return this.text.charAt(index);
    }

    @dl.d
    public final List<Range<? extends Object>> b() {
        return this.annotations;
    }

    public int c() {
        return this.text.length();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return a(i10);
    }

    @dl.d
    public final List<Range<ParagraphStyle>> d() {
        return this.paragraphStyles;
    }

    @dl.d
    public final List<Range<SpanStyle>> e() {
        return this.spanStyles;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof d)) {
            return false;
        }
        d dVar = (d) other;
        return kotlin.jvm.internal.f0.g(this.text, dVar.text) && kotlin.jvm.internal.f0.g(this.spanStyles, dVar.spanStyles) && kotlin.jvm.internal.f0.g(this.paragraphStyles, dVar.paragraphStyles) && kotlin.jvm.internal.f0.g(this.annotations, dVar.annotations);
    }

    @dl.d
    public final List<Range<String>> f(int start, int end) {
        List<Range<? extends Object>> list = this.annotations;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Range<? extends Object> range = list.get(i10);
            Range<? extends Object> range2 = range;
            if ((range2.h() instanceof String) && AnnotatedStringKt.o(start, end, range2.i(), range2.g())) {
                arrayList.add(range);
            }
        }
        return arrayList;
    }

    @dl.d
    public final List<Range<String>> g(@dl.d String tag, int start, int end) {
        kotlin.jvm.internal.f0.p(tag, "tag");
        List<Range<? extends Object>> list = this.annotations;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Range<? extends Object> range = list.get(i10);
            Range<? extends Object> range2 = range;
            if ((range2.h() instanceof String) && kotlin.jvm.internal.f0.g(tag, range2.j()) && AnnotatedStringKt.o(start, end, range2.i(), range2.g())) {
                arrayList.add(range);
            }
        }
        return arrayList;
    }

    @dl.d
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (((((this.text.hashCode() * 31) + this.spanStyles.hashCode()) * 31) + this.paragraphStyles.hashCode()) * 31) + this.annotations.hashCode();
    }

    @dl.d
    public final List<Range<s0>> i(int start, int end) {
        List<Range<? extends Object>> list = this.annotations;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Range<? extends Object> range = list.get(i10);
            Range<? extends Object> range2 = range;
            if ((range2.h() instanceof s0) && AnnotatedStringKt.o(start, end, range2.i(), range2.g())) {
                arrayList.add(range);
            }
        }
        return arrayList;
    }

    @dl.d
    @g
    public final List<Range<UrlAnnotation>> j(int start, int end) {
        List<Range<? extends Object>> list = this.annotations;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Range<? extends Object> range = list.get(i10);
            Range<? extends Object> range2 = range;
            if ((range2.h() instanceof UrlAnnotation) && AnnotatedStringKt.o(start, end, range2.i(), range2.g())) {
                arrayList.add(range);
            }
        }
        return arrayList;
    }

    @j2
    @dl.d
    public final d k(@dl.d d other) {
        kotlin.jvm.internal.f0.p(other, "other");
        a aVar = new a(this);
        aVar.g(other);
        return aVar.q();
    }

    @Override // java.lang.CharSequence
    @dl.d
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public d subSequence(int startIndex, int endIndex) {
        if (startIndex <= endIndex) {
            if (startIndex == 0 && endIndex == this.text.length()) {
                return this;
            }
            String strSubstring = this.text.substring(startIndex, endIndex);
            kotlin.jvm.internal.f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new d(strSubstring, AnnotatedStringKt.m(this.spanStyles, startIndex, endIndex), AnnotatedStringKt.m(this.paragraphStyles, startIndex, endIndex), AnnotatedStringKt.m(this.annotations, startIndex, endIndex));
        }
        throw new IllegalArgumentException(("start (" + startIndex + ") should be less or equal to end (" + endIndex + ')').toString());
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return c();
    }

    @dl.d
    public final d m(long range) {
        return subSequence(o0.l(range), o0.k(range));
    }

    @Override // java.lang.CharSequence
    @dl.d
    public String toString() {
        return this.text;
    }
}
