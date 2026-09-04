package com.loper7.date_time_picker.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.internal.s;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.loper7.date_time_picker.R;
import com.loper7.date_time_picker.ext.CalendarExtKt;
import com.loper7.date_time_picker.number_picker.NumberPicker;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.ak;
import com.umeng.analytics.pro.d;
import dl.e;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.z;
import org.apache.tools.ant.taskdefs.p7;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: CardWeekPickerDialog.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0002<=B\u000f\u0012\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:B\u0019\b\u0016\u0012\u0006\u00108\u001a\u000207\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b9\u0010;J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0005H\u0014J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0018R\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u001d\u0010\u0018R\u001d\u0010#\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0011\u001a\u0004\b!\u0010\"R\u001d\u0010'\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0011\u001a\u0004\b%\u0010&R\u001d\u0010*\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0011\u001a\u0004\b)\u0010&R\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010-R#\u00102\u001a\n 0*\u0004\u0018\u00010/0/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0011\u001a\u0004\b(\u00101R\"\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020403038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00105¨\u0006>"}, d2 = {"Lcom/loper7/date_time_picker/dialog/CardWeekPickerDialog;", "Lcom/google/android/material/bottomsheet/a;", "Landroid/view/View$OnClickListener;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/b2;", "onCreate", "onStart", "Landroid/view/View;", "v", "onClick", "Lcom/loper7/date_time_picker/dialog/CardWeekPickerDialog$a;", "r", "Lcom/loper7/date_time_picker/dialog/CardWeekPickerDialog$a;", "builder", "Lcom/loper7/date_time_picker/number_picker/NumberPicker;", ak.aB, "Lkotlin/z;", "C", "()Lcom/loper7/date_time_picker/number_picker/NumberPicker;", "np_week", "Landroid/widget/TextView;", "t", "D", "()Landroid/widget/TextView;", "tv_cancel", ak.aG, androidx.exifinterface.media.a.S4, "tv_submit", "F", "tv_title", "Landroid/widget/LinearLayout;", RXScreenCaptureService.KEY_WIDTH, "B", "()Landroid/widget/LinearLayout;", "linear_bg", "x", ak.aD, "()Landroid/view/View;", "divider_bottom", "y", androidx.exifinterface.media.a.W4, "divider_line", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/widget/FrameLayout;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "mBehavior", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "()Ljava/util/Calendar;", "calendar", "", "", "Ljava/util/List;", "weeksData", "Landroid/content/Context;", d.R, "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Lcom/loper7/date_time_picker/dialog/CardWeekPickerDialog$a;)V", ak.av, "Companion", "date_time_picker_release"}, k = 1, mv = {1, 5, 1})
public class CardWeekPickerDialog extends com.google.android.material.bottomsheet.a implements View.OnClickListener {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 2;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @dl.d
    private final z calendar;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @dl.d
    private List<List<Long>> weeksData;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @e
    private a builder;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final z np_week;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final z tv_cancel;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final z tv_submit;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final z tv_title;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final z linear_bg;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final z divider_bottom;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final z divider_line;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @e
    private BottomSheetBehavior<FrameLayout> mBehavior;

    /* JADX INFO: compiled from: CardWeekPickerDialog.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lcom/loper7/date_time_picker/dialog/CardWeekPickerDialog$Companion;", "", "Landroid/content/Context;", d.R, "Lcom/loper7/date_time_picker/dialog/CardWeekPickerDialog$a;", ak.av, "", "CARD", "I", "CUBE", "STACK", "<init>", "()V", "date_time_picker_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @dl.d
        public final a a(@dl.d final Context context) {
            f0.p(context, "context");
            return (a) b0.c(new yh.a<a>() { // from class: com.loper7.date_time_picker.dialog.CardWeekPickerDialog$Companion$builder$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CardWeekPickerDialog.a invoke() {
                    return new CardWeekPickerDialog.a(context);
                }
            }).getValue();
        }
    }

    /* JADX INFO: compiled from: CardWeekPickerDialog.kt */
    @Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010%\u001a\u00020#¢\u0006\u0004\b8\u00109J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\t\u001a\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rJ\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\nJ\u0018\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\nJ(\u0010\u0017\u001a\u00020\u00002 \u0010\u0016\u001a\u001c\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00140\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0013J4\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00022\"\b\u0002\u0010\u001b\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019J\"\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00022\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001dJ\u0010\u0010\u001f\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0005J\u0010\u0010 \u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0005J\u0006\u0010\"\u001a\u00020!R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010$R\u0016\u0010'\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010&R\u0016\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010&R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010*R\u0016\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010*R\u0016\u0010,\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\u0016\u0010-\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010*R\u0016\u0010/\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010.R\u0016\u00102\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u00101R\u0016\u00105\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b4\u0010.R\u0016\u00106\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u00101R\u0016\u00107\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010.¨\u0006:"}, d2 = {"Lcom/loper7/date_time_picker/dialog/CardWeekPickerDialog$a;", "", "", "value", "p", "", Constants.KEY_MODEL, ak.aF, "themeColor", "o", "", "wrapSelector", "q", "", p7.a.f135566d, "d", "contain", "m", "f", "Lkotlin/Function1;", "", "Lcom/loper7/date_time_picker/number_picker/NumberPicker$e;", "formatter", RXScreenCaptureService.KEY_HEIGHT, "text", "Lkotlin/Function2;", "Lkotlin/b2;", s.a.f52543a, "k", "Lkotlin/Function0;", "i", "b", "e", "Lcom/loper7/date_time_picker/dialog/CardWeekPickerDialog;", ak.av, "Landroid/content/Context;", "Landroid/content/Context;", d.R, "Ljava/lang/String;", "cancelText", "chooseText", "titleValue", "I", "g", "assistColor", "dividerColor", "Z", "wrapSelectorWheel", "l", "J", "defaultMillisecond", "startMillisecond", "n", "startContain", "endMillisecond", "endContain", "<init>", "(Landroid/content/Context;)V", "date_time_picker_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private Context context;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public String cancelText;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public String chooseText;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @e
        @xh.e
        public String titleValue;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public int model;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public int themeColor;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public int assistColor;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public int dividerColor;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public boolean wrapSelectorWheel;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @e
        @xh.e
        public p<? super List<Long>, ? super String, b2> f64489j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @e
        @xh.e
        public yh.a<b2> f64490k;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public long defaultMillisecond;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public long startMillisecond;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public boolean startContain;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public long endMillisecond;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public boolean endContain;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @e
        @xh.e
        public l<? super List<List<Long>>, ? extends NumberPicker.e> f64496q;

        public a(@dl.d Context context) {
            f0.p(context, "context");
            this.context = context;
            this.cancelText = "取消";
            this.chooseText = "确定";
            this.wrapSelectorWheel = true;
            this.startContain = true;
            this.endContain = true;
        }

        public static /* synthetic */ a g(a aVar, long j10, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            return aVar.f(j10, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a j(a aVar, String str, yh.a aVar2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "取消";
            }
            if ((i10 & 2) != 0) {
                aVar2 = null;
            }
            return aVar.i(str, aVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a l(a aVar, String str, p pVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "确定";
            }
            if ((i10 & 2) != 0) {
                pVar = null;
            }
            return aVar.k(str, pVar);
        }

        public static /* synthetic */ a n(a aVar, long j10, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            return aVar.m(j10, z10);
        }

        @dl.d
        public final CardWeekPickerDialog a() {
            return new CardWeekPickerDialog(this.context, this);
        }

        @dl.d
        public final a b(@androidx.annotation.l int value) {
            this.assistColor = value;
            return this;
        }

        @dl.d
        public final a c(int model) {
            this.model = model;
            return this;
        }

        @dl.d
        public final a d(long millisecond) {
            this.defaultMillisecond = millisecond;
            return this;
        }

        @dl.d
        public final a e(@androidx.annotation.l int value) {
            this.dividerColor = value;
            return this;
        }

        @dl.d
        public final a f(long millisecond, boolean contain) {
            this.endMillisecond = millisecond;
            this.endContain = contain;
            return this;
        }

        @dl.d
        public final a h(@dl.d l<? super List<List<Long>>, ? extends NumberPicker.e> formatter) {
            f0.p(formatter, "formatter");
            this.f64496q = formatter;
            return this;
        }

        @dl.d
        public final a i(@dl.d String text, @e yh.a<b2> aVar) {
            f0.p(text, "text");
            this.f64490k = aVar;
            this.cancelText = text;
            return this;
        }

        @dl.d
        public final a k(@dl.d String text, @e p<? super List<Long>, ? super String, b2> pVar) {
            f0.p(text, "text");
            this.f64489j = pVar;
            this.chooseText = text;
            return this;
        }

        @dl.d
        public final a m(long millisecond, boolean contain) {
            this.startMillisecond = millisecond;
            this.startContain = contain;
            return this;
        }

        @dl.d
        public final a o(@androidx.annotation.l int themeColor) {
            this.themeColor = themeColor;
            return this;
        }

        @dl.d
        public final a p(@dl.d String value) {
            f0.p(value, "value");
            this.titleValue = value;
            return this;
        }

        @dl.d
        public final a q(boolean wrapSelector) {
            this.wrapSelectorWheel = wrapSelector;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardWeekPickerDialog(@dl.d Context context) {
        super(context);
        f0.p(context, "context");
        this.np_week = b0.c(new yh.a<NumberPicker>() { // from class: com.loper7.date_time_picker.dialog.CardWeekPickerDialog$np_week$2
            {
                super(0);
            }

            @Override // yh.a
            @e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final NumberPicker invoke() {
                return (NumberPicker) this.f64501b.f().n(R.id.np_week);
            }
        });
        this.tv_cancel = b0.c(new yh.a<TextView>() { // from class: com.loper7.date_time_picker.dialog.CardWeekPickerDialog$tv_cancel$2
            {
                super(0);
            }

            @Override // yh.a
            @e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TextView invoke() {
                return (TextView) this.f64502b.f().n(R.id.dialog_cancel);
            }
        });
        this.tv_submit = b0.c(new yh.a<TextView>() { // from class: com.loper7.date_time_picker.dialog.CardWeekPickerDialog$tv_submit$2
            {
                super(0);
            }

            @Override // yh.a
            @e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TextView invoke() {
                return (TextView) this.f64503b.f().n(R.id.dialog_submit);
            }
        });
        this.tv_title = b0.c(new yh.a<TextView>() { // from class: com.loper7.date_time_picker.dialog.CardWeekPickerDialog$tv_title$2
            {
                super(0);
            }

            @Override // yh.a
            @e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TextView invoke() {
                return (TextView) this.f64504b.f().n(R.id.tv_title);
            }
        });
        this.linear_bg = b0.c(new yh.a<LinearLayout>() { // from class: com.loper7.date_time_picker.dialog.CardWeekPickerDialog$linear_bg$2
            {
                super(0);
            }

            @Override // yh.a
            @e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LinearLayout invoke() {
                return (LinearLayout) this.f64500b.f().n(R.id.linear_bg);
            }
        });
        this.divider_bottom = b0.c(new yh.a<View>() { // from class: com.loper7.date_time_picker.dialog.CardWeekPickerDialog$divider_bottom$2
            {
                super(0);
            }

            @Override // yh.a
            @e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final View invoke() {
                return this.f64498b.f().n(R.id.divider_bottom);
            }
        });
        this.divider_line = b0.c(new yh.a<View>() { // from class: com.loper7.date_time_picker.dialog.CardWeekPickerDialog$divider_line$2
            {
                super(0);
            }

            @Override // yh.a
            @e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final View invoke() {
                return this.f64499b.f().n(R.id.dialog_select_border);
            }
        });
        this.calendar = b0.c(new yh.a<Calendar>() { // from class: com.loper7.date_time_picker.dialog.CardWeekPickerDialog$calendar$2
            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Calendar invoke() {
                return Calendar.getInstance();
            }
        });
        this.weeksData = new ArrayList();
        this.builder = INSTANCE.a(context);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardWeekPickerDialog(@dl.d Context context, @dl.d a builder) {
        this(context);
        f0.p(context, "context");
        f0.p(builder, "builder");
        this.builder = builder;
    }

    private final View A() {
        return (View) this.divider_line.getValue();
    }

    private final LinearLayout B() {
        return (LinearLayout) this.linear_bg.getValue();
    }

    private final NumberPicker C() {
        return (NumberPicker) this.np_week.getValue();
    }

    private final TextView D() {
        return (TextView) this.tv_cancel.getValue();
    }

    private final TextView E() {
        return (TextView) this.tv_submit.getValue();
    }

    private final TextView F() {
        return (TextView) this.tv_title.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String G(CardWeekPickerDialog this$0, int i10) {
        f0.p(this$0, "this$0");
        List<String> listC = com.loper7.date_time_picker.ext.a.c(this$0.weeksData.get(i10 - 1), "yyyy/MM/dd");
        return ((String) CollectionsKt___CollectionsKt.w2(listC)) + "  -  " + ((String) CollectionsKt___CollectionsKt.k3(listC));
    }

    private final Calendar y() {
        return (Calendar) this.calendar.getValue();
    }

    private final View z() {
        return (View) this.divider_bottom.getValue();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@dl.d View v10) {
        a aVar;
        yh.a<b2> aVar2;
        a aVar3;
        p<? super List<Long>, ? super String, b2> pVar;
        f0.p(v10, "v");
        dismiss();
        int id2 = v10.getId();
        if (id2 == R.id.dialog_submit) {
            NumberPicker numberPickerC = C();
            if (numberPickerC != null && (aVar3 = this.builder) != null && (pVar = aVar3.f64489j) != null) {
                List<Long> list = this.weeksData.get(numberPickerC.getValue() - 1);
                String strA = numberPickerC.getFormatter().a(numberPickerC.getValue());
                f0.o(strA, "formatter.format(value)");
                pVar.invoke(list, strA);
            }
        } else if (id2 == R.id.dialog_cancel && (aVar = this.builder) != null && (aVar2 = aVar.f64490k) != null) {
            aVar2.invoke();
        }
        dismiss();
    }

    @Override // com.google.android.material.bottomsheet.a, androidx.appcompat.app.i, androidx.activity.k, android.app.Dialog
    protected void onCreate(@e Bundle bundle) {
        l<? super List<List<Long>>, ? extends NumberPicker.e> lVar;
        setContentView(R.layout.dt_dialog_week_picker);
        super.onCreate(bundle);
        FrameLayout frameLayout = (FrameLayout) f().n(R.id.design_bottom_sheet);
        f0.m(frameLayout);
        frameLayout.setBackgroundColor(0);
        this.mBehavior = BottomSheetBehavior.r0(frameLayout);
        Calendar calendar = y();
        f0.o(calendar, "calendar");
        this.weeksData = CalendarExtKt.i(calendar, 0L, 0L, false, false, 15, null);
        a aVar = this.builder;
        if (aVar != null) {
            Calendar calendar2 = y();
            f0.o(calendar2, "calendar");
            this.weeksData = CalendarExtKt.h(calendar2, aVar.startMillisecond, aVar.endMillisecond, aVar.startContain, aVar.endContain);
            if (aVar.model != 0) {
                LinearLayout linearLayoutB = B();
                f0.m(linearLayoutB);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(linearLayoutB.getLayoutParams());
                int i10 = aVar.model;
                if (i10 == 0) {
                    Context context = getContext();
                    f0.o(context, "context");
                    int iA = ha.a.a(context, 12.0f);
                    Context context2 = getContext();
                    f0.o(context2, "context");
                    int iA2 = ha.a.a(context2, 12.0f);
                    Context context3 = getContext();
                    f0.o(context3, "context");
                    int iA3 = ha.a.a(context3, 12.0f);
                    Context context4 = getContext();
                    f0.o(context4, "context");
                    layoutParams.setMargins(iA, iA2, iA3, ha.a.a(context4, 12.0f));
                    LinearLayout linearLayoutB2 = B();
                    f0.m(linearLayoutB2);
                    linearLayoutB2.setLayoutParams(layoutParams);
                    LinearLayout linearLayoutB3 = B();
                    f0.m(linearLayoutB3);
                    linearLayoutB3.setBackgroundResource(R.drawable.shape_bg_round_white_5);
                } else if (i10 == 1) {
                    layoutParams.setMargins(0, 0, 0, 0);
                    LinearLayout linearLayoutB4 = B();
                    f0.m(linearLayoutB4);
                    linearLayoutB4.setLayoutParams(layoutParams);
                    LinearLayout linearLayoutB5 = B();
                    f0.m(linearLayoutB5);
                    linearLayoutB5.setBackgroundColor(androidx.core.content.d.f(getContext(), R.color.colorTextWhite));
                } else if (i10 != 2) {
                    layoutParams.setMargins(0, 0, 0, 0);
                    LinearLayout linearLayoutB6 = B();
                    f0.m(linearLayoutB6);
                    linearLayoutB6.setLayoutParams(layoutParams);
                    LinearLayout linearLayoutB7 = B();
                    f0.m(linearLayoutB7);
                    linearLayoutB7.setBackgroundResource(aVar.model);
                } else {
                    layoutParams.setMargins(0, 0, 0, 0);
                    LinearLayout linearLayoutB8 = B();
                    f0.m(linearLayoutB8);
                    linearLayoutB8.setLayoutParams(layoutParams);
                    LinearLayout linearLayoutB9 = B();
                    f0.m(linearLayoutB9);
                    linearLayoutB9.setBackgroundResource(R.drawable.shape_bg_top_round_white_15);
                }
            }
            String str = aVar.titleValue;
            if (str == null || str.length() == 0) {
                TextView textViewF = F();
                f0.m(textViewF);
                textViewF.setVisibility(8);
            } else {
                TextView textViewF2 = F();
                if (textViewF2 != null) {
                    textViewF2.setText(aVar.titleValue);
                }
                TextView textViewF3 = F();
                if (textViewF3 != null) {
                    textViewF3.setVisibility(0);
                }
            }
            TextView textViewD = D();
            if (textViewD != null) {
                textViewD.setText(aVar.cancelText);
            }
            TextView textViewE = E();
            if (textViewE != null) {
                textViewE.setText(aVar.chooseText);
            }
            if (aVar.themeColor != 0) {
                TextView textViewE2 = E();
                f0.m(textViewE2);
                textViewE2.setTextColor(aVar.themeColor);
                NumberPicker numberPickerC = C();
                f0.m(numberPickerC);
                numberPickerC.setSelectedTextColor(aVar.themeColor);
            }
            a aVar2 = this.builder;
            f0.m(aVar2);
            if (aVar2.assistColor != 0) {
                TextView textViewF4 = F();
                if (textViewF4 != null) {
                    a aVar3 = this.builder;
                    f0.m(aVar3);
                    textViewF4.setTextColor(aVar3.assistColor);
                }
                TextView textViewD2 = D();
                if (textViewD2 != null) {
                    a aVar4 = this.builder;
                    f0.m(aVar4);
                    textViewD2.setTextColor(aVar4.assistColor);
                }
                NumberPicker numberPickerC2 = C();
                f0.m(numberPickerC2);
                a aVar5 = this.builder;
                f0.m(aVar5);
                numberPickerC2.setTextColor(aVar5.assistColor);
            }
            a aVar6 = this.builder;
            f0.m(aVar6);
            if (aVar6.dividerColor != 0) {
                View viewZ = z();
                if (viewZ != null) {
                    a aVar7 = this.builder;
                    f0.m(aVar7);
                    viewZ.setBackgroundColor(aVar7.dividerColor);
                }
                View viewA = A();
                if (viewA != null) {
                    a aVar8 = this.builder;
                    f0.m(aVar8);
                    viewA.setBackgroundColor(aVar8.dividerColor);
                }
                NumberPicker numberPickerC3 = C();
                f0.m(numberPickerC3);
                a aVar9 = this.builder;
                f0.m(aVar9);
                numberPickerC3.setDividerColor(aVar9.dividerColor);
            }
        }
        NumberPicker numberPickerC4 = C();
        if (numberPickerC4 != null) {
            List<List<Long>> list = this.weeksData;
            if (list == null || list.isEmpty()) {
                return;
            }
            numberPickerC4.setMinValue(1);
            numberPickerC4.setMaxValue(this.weeksData.size());
            List<List<Long>> list2 = this.weeksData;
            a aVar10 = this.builder;
            NumberPicker.e eVarInvoke = null;
            numberPickerC4.setValue(com.loper7.date_time_picker.ext.a.b(list2, aVar10 == null ? null : Long.valueOf(aVar10.defaultMillisecond)) + 1);
            numberPickerC4.setFocusable(true);
            numberPickerC4.setFocusableInTouchMode(true);
            numberPickerC4.setDescendantFocusability(393216);
            a aVar11 = this.builder;
            numberPickerC4.setWrapSelectorWheel(aVar11 != null ? aVar11.wrapSelectorWheel : true);
            a aVar12 = this.builder;
            if (aVar12 != null && (lVar = aVar12.f64496q) != null) {
                eVarInvoke = lVar.invoke(this.weeksData);
            }
            if (eVarInvoke == null) {
                eVarInvoke = new NumberPicker.e() { // from class: com.loper7.date_time_picker.dialog.a
                    @Override // com.loper7.date_time_picker.number_picker.NumberPicker.e
                    public final String a(int i11) {
                        return CardWeekPickerDialog.G(this.f64505a, i11);
                    }
                };
            }
            numberPickerC4.setFormatter(eVarInvoke);
        }
        TextView textViewD3 = D();
        f0.m(textViewD3);
        textViewD3.setOnClickListener(this);
        TextView textViewE3 = E();
        f0.m(textViewE3);
        textViewE3.setOnClickListener(this);
    }

    @Override // com.google.android.material.bottomsheet.a, androidx.activity.k, android.app.Dialog
    protected void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.mBehavior;
        if (bottomSheetBehavior == null) {
            return;
        }
        bottomSheetBehavior.c(3);
    }
}
