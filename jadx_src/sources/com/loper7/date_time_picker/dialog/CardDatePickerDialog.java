package com.loper7.date_time_picker.dialog;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.internal.s;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.loper7.date_time_picker.DateTimePicker;
import com.loper7.date_time_picker.R;
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
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import org.apache.tools.ant.taskdefs.p7;
import org.apache.tools.ant.types.selectors.o;
import yh.l;

/* JADX INFO: compiled from: CardDatePickerDialog.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0002@AB\u000f\u0012\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=B\u0019\b\u0016\u0012\u0006\u0010;\u001a\u00020:\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b<\u0010>J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0015J\b\u0010\r\u001a\u00020\u000bH\u0014J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u0017R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00103\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00100R\u0018\u00105\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00100R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006B"}, d2 = {"Lcom/loper7/date_time_picker/dialog/CardDatePickerDialog;", "Lcom/google/android/material/bottomsheet/a;", "Landroid/view/View$OnClickListener;", "", "dpValue", "", androidx.exifinterface.media.a.W4, "pxValue", "B", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/b2;", "onCreate", "onStart", "Landroid/view/View;", "v", "onClick", "Lcom/loper7/date_time_picker/dialog/CardDatePickerDialog$a;", "r", "Lcom/loper7/date_time_picker/dialog/CardDatePickerDialog$a;", "builder", "Landroid/widget/TextView;", ak.aB, "Landroid/widget/TextView;", "tv_cancel", "t", "tv_submit", ak.aG, "tv_title", "tv_choose_date", RXScreenCaptureService.KEY_WIDTH, "btn_today", "Lcom/loper7/date_time_picker/DateTimePicker;", "x", "Lcom/loper7/date_time_picker/DateTimePicker;", "datePicker", "y", "tv_go_back", "Landroid/widget/LinearLayout;", ak.aD, "Landroid/widget/LinearLayout;", "linear_now", "linear_bg", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/widget/FrameLayout;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "mBehavior", "C", "Landroid/view/View;", "divider_top", "D", "divider_bottom", androidx.exifinterface.media.a.S4, "divider_line", "", "F", "J", p7.a.f135566d, "Landroid/content/Context;", d.R, "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Lcom/loper7/date_time_picker/dialog/CardDatePickerDialog$a;)V", "G", ak.av, "Companion", "date_time_picker_release"}, k = 1, mv = {1, 5, 1})
public class CardDatePickerDialog extends com.google.android.material.bottomsheet.a implements View.OnClickListener {

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);
    public static final int H = 0;
    public static final int I = 1;
    public static final int J = 2;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @e
    private LinearLayout linear_bg;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @e
    private BottomSheetBehavior<FrameLayout> mBehavior;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @e
    private View divider_top;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @e
    private View divider_bottom;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @e
    private View divider_line;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private long millisecond;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @e
    private a builder;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @e
    private TextView tv_cancel;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @e
    private TextView tv_submit;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @e
    private TextView tv_title;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @e
    private TextView tv_choose_date;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @e
    private TextView btn_today;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @e
    private DateTimePicker datePicker;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @e
    private TextView tv_go_back;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @e
    private LinearLayout linear_now;

    /* JADX INFO: compiled from: CardDatePickerDialog.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lcom/loper7/date_time_picker/dialog/CardDatePickerDialog$Companion;", "", "Landroid/content/Context;", d.R, "Lcom/loper7/date_time_picker/dialog/CardDatePickerDialog$a;", ak.av, "", "CARD", "I", "CUBE", "STACK", "<init>", "()V", "date_time_picker_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @dl.d
        public final a a(@dl.d final Context context) {
            f0.p(context, "context");
            return (a) b0.c(new yh.a<a>() { // from class: com.loper7.date_time_picker.dialog.CardDatePickerDialog$Companion$builder$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CardDatePickerDialog.a invoke() {
                    return new CardDatePickerDialog.a(context);
                }
            }).getValue();
        }
    }

    /* JADX INFO: compiled from: CardDatePickerDialog.kt */
    @Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00106\u001a\u000204¢\u0006\u0004\ba\u0010bJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\b\u001a\u00020\u00002\n\u0010\u0007\u001a\u00020\u0005\"\u00020\u0006J\u0016\u0010\n\u001a\u00020\u00002\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0006J\u0010\u0010\u0018\u001a\u00020\u00002\b\b\u0001\u0010\u0017\u001a\u00020\u0006JB\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u0002J\u001a\u0010!\u001a\u00020\u00002\n\u0010\u0007\u001a\u00020\u0005\"\u00020\u00062\u0006\u0010 \u001a\u00020\u0010J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0010J\u001e\u0010#\u001a\u00020\u00002\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t2\u0006\u0010 \u001a\u00020\u0010J(\u0010(\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u00022\u0016\b\u0002\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020&\u0018\u00010%J\"\u0010*\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u00022\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010)J\u0010\u0010,\u001a\u00020\u00002\b\b\u0001\u0010+\u001a\u00020\u0006J\u0010\u0010.\u001a\u00020\u00002\b\b\u0002\u0010-\u001a\u00020\u0010J\u000e\u0010/\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0006J\u0010\u00100\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0006J\u0010\u00101\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0006J\u0006\u00103\u001a\u000202R\u0016\u00106\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00105R\u0016\u00108\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u00107R\u0016\u0010:\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b9\u00107R\u0016\u0010<\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b;\u00107R\u0016\u0010?\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b@\u0010>R\u0018\u0010C\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bB\u0010>R\u0016\u0010E\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b0\u0010DR\u0016\u0010F\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010DR\u0016\u0010G\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b/\u0010DR\u0018\u0010J\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010\u0015\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010!R\u0016\u0010\u0017\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010!R\u0016\u0010K\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\b\u0010!R\u0016\u0010L\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b1\u0010!R\u0016\u0010N\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bM\u0010!R\u0016\u0010O\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001f\u00107R\u001e\u0010R\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010-\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u00107R\u0016\u0010T\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bS\u0010!R\"\u0010W\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010>\u001a\u0004\bB\u0010U\"\u0004\bD\u0010VR\"\u0010Z\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010>\u001a\u0004\b=\u0010U\"\u0004\bY\u0010VR\"\u0010[\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010>\u001a\u0004\b\u0011\u0010U\"\u0004\bH\u0010VR\"\u0010]\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010>\u001a\u0004\b9\u0010U\"\u0004\bM\u0010VR\"\u0010^\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010>\u001a\u0004\b;\u0010U\"\u0004\bS\u0010VR\"\u0010`\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010>\u001a\u0004\b@\u0010U\"\u0004\b_\u0010V¨\u0006c"}, d2 = {"Lcom/loper7/date_time_picker/dialog/CardDatePickerDialog$a;", "", "", "value", "D", "", "", "types", "n", "", "m", "", p7.a.f135566d, "l", ak.aG, ak.aB, "", "b", "K", "M", "L", Constants.KEY_MODEL, "i", "themeColor", "C", "year", "month", p7.a.f135570h, p7.a.f135569g, o.f136588l, p7.a.f135567e, "q", "wrapSelector", "I", "H", "G", "text", "Lkotlin/Function1;", "Lkotlin/b2;", s.a.f52543a, "y", "Lkotlin/Function0;", RXScreenCaptureService.KEY_WIDTH, "layoutResId", androidx.exifinterface.media.a.W4, "touchHideable", androidx.exifinterface.media.a.S4, "j", RXScreenCaptureService.KEY_HEIGHT, "o", "Lcom/loper7/date_time_picker/dialog/CardDatePickerDialog;", ak.av, "Landroid/content/Context;", "Landroid/content/Context;", d.R, "Z", "backNow", ak.aF, "focusDateInfo", "d", "dateLabel", "e", "Ljava/lang/String;", "cancelText", "f", "chooseText", "g", "titleValue", "J", "defaultMillisecond", "minTime", "maxTime", "k", "[I", "displayTypes", "assistColor", "dividerColor", "p", "pickerLayoutResId", "wrapSelectorWheel", "r", "Ljava/util/List;", "wrapSelectorWheelTypes", "t", "chooseDateModel", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "yearLabel", "x", "v", "monthLabel", "dayLabel", ak.aD, "hourLabel", "minLabel", "B", "secondLabel", "<init>", "(Landroid/content/Context;)V", "date_time_picker_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        @dl.d
        private String minLabel;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata */
        @dl.d
        private String secondLabel;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private Context context;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public boolean backNow;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public boolean focusDateInfo;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public boolean dateLabel;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public String cancelText;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public String chooseText;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @e
        @xh.e
        public String titleValue;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public long defaultMillisecond;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public long minTime;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public long maxTime;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        @e
        @xh.e
        public int[] displayTypes;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public int model;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public int themeColor;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public int assistColor;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public int dividerColor;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public int pickerLayoutResId;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public boolean wrapSelectorWheel;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        @e
        @xh.e
        public List<Integer> wrapSelectorWheelTypes;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public boolean touchHideable;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public int chooseDateModel;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @e
        @xh.e
        public l<? super Long, b2> f64463u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @e
        @xh.e
        public yh.a<b2> f64464v;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private String yearLabel;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private String monthLabel;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private String dayLabel;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private String hourLabel;

        public a(@dl.d Context context) {
            f0.p(context, "context");
            this.context = context;
            this.backNow = true;
            this.focusDateInfo = true;
            this.dateLabel = true;
            this.cancelText = "取消";
            this.chooseText = "确定";
            this.wrapSelectorWheel = true;
            this.wrapSelectorWheelTypes = new ArrayList();
            this.touchHideable = true;
            this.yearLabel = "年";
            this.monthLabel = "月";
            this.dayLabel = "日";
            this.hourLabel = "时";
            this.minLabel = "分";
            this.secondLabel = "秒";
        }

        public static /* synthetic */ a F(a aVar, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            return aVar.E(z10);
        }

        public static /* synthetic */ a r(a aVar, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = aVar.yearLabel;
            }
            if ((i10 & 2) != 0) {
                str2 = aVar.monthLabel;
            }
            String str7 = str2;
            if ((i10 & 4) != 0) {
                str3 = aVar.dayLabel;
            }
            String str8 = str3;
            if ((i10 & 8) != 0) {
                str4 = aVar.hourLabel;
            }
            String str9 = str4;
            if ((i10 & 16) != 0) {
                str5 = aVar.minLabel;
            }
            String str10 = str5;
            if ((i10 & 32) != 0) {
                str6 = aVar.secondLabel;
            }
            return aVar.q(str, str7, str8, str9, str10, str6);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a x(a aVar, String str, yh.a aVar2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "取消";
            }
            if ((i10 & 2) != 0) {
                aVar2 = null;
            }
            return aVar.w(str, aVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a z(a aVar, String str, l lVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "确定";
            }
            if ((i10 & 2) != 0) {
                lVar = null;
            }
            return aVar.y(str, lVar);
        }

        @dl.d
        public final a A(@dl.d int layoutResId) {
            this.pickerLayoutResId = layoutResId;
            return this;
        }

        public final void B(@dl.d String str) {
            f0.p(str, "<set-?>");
            this.secondLabel = str;
        }

        @dl.d
        public final a C(@androidx.annotation.l int themeColor) {
            this.themeColor = themeColor;
            return this;
        }

        @dl.d
        public final a D(@dl.d String value) {
            f0.p(value, "value");
            this.titleValue = value;
            return this;
        }

        @dl.d
        public final a E(boolean touchHideable) {
            this.touchHideable = touchHideable;
            return this;
        }

        @dl.d
        public final a G(@e List<Integer> types, boolean wrapSelector) {
            this.wrapSelectorWheelTypes = types;
            this.wrapSelectorWheel = wrapSelector;
            return this;
        }

        @dl.d
        public final a H(boolean wrapSelector) {
            return G(null, wrapSelector);
        }

        @dl.d
        public final a I(@dl.d int[] types, boolean wrapSelector) {
            f0.p(types, "types");
            return G(ArraysKt___ArraysKt.sz(types), wrapSelector);
        }

        public final void J(@dl.d String str) {
            f0.p(str, "<set-?>");
            this.yearLabel = str;
        }

        @dl.d
        public final a K(boolean b10) {
            this.backNow = b10;
            return this;
        }

        @dl.d
        public final a L(boolean b10) {
            this.dateLabel = b10;
            return this;
        }

        @dl.d
        public final a M(boolean b10) {
            this.focusDateInfo = b10;
            return this;
        }

        @dl.d
        public final CardDatePickerDialog a() {
            return new CardDatePickerDialog(this.context, this);
        }

        @dl.d
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDayLabel() {
            return this.dayLabel;
        }

        @dl.d
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getHourLabel() {
            return this.hourLabel;
        }

        @dl.d
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getMinLabel() {
            return this.minLabel;
        }

        @dl.d
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getMonthLabel() {
            return this.monthLabel;
        }

        @dl.d
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getSecondLabel() {
            return this.secondLabel;
        }

        @dl.d
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getYearLabel() {
            return this.yearLabel;
        }

        @dl.d
        public final a h(@androidx.annotation.l int value) {
            this.assistColor = value;
            return this;
        }

        @dl.d
        public final a i(int model) {
            this.model = model;
            return this;
        }

        @dl.d
        public final a j(int value) {
            this.chooseDateModel = value;
            return this;
        }

        public final void k(@dl.d String str) {
            f0.p(str, "<set-?>");
            this.dayLabel = str;
        }

        @dl.d
        public final a l(long millisecond) {
            this.defaultMillisecond = millisecond;
            return this;
        }

        @dl.d
        public final a m(@e List<Integer> types) {
            this.displayTypes = types == null ? null : CollectionsKt___CollectionsKt.P5(types);
            return this;
        }

        @dl.d
        public final a n(@dl.d int... types) {
            f0.p(types, "types");
            this.displayTypes = types;
            return this;
        }

        @dl.d
        public final a o(@androidx.annotation.l int value) {
            this.dividerColor = value;
            return this;
        }

        public final void p(@dl.d String str) {
            f0.p(str, "<set-?>");
            this.hourLabel = str;
        }

        @dl.d
        public final a q(@dl.d String year, @dl.d String month, @dl.d String day, @dl.d String hour, @dl.d String min, @dl.d String second) {
            f0.p(year, "year");
            f0.p(month, "month");
            f0.p(day, "day");
            f0.p(hour, "hour");
            f0.p(min, "min");
            f0.p(second, "second");
            this.yearLabel = year;
            this.monthLabel = month;
            this.dayLabel = day;
            this.hourLabel = hour;
            this.minLabel = min;
            this.secondLabel = second;
            return this;
        }

        @dl.d
        public final a s(long millisecond) {
            this.maxTime = millisecond;
            return this;
        }

        public final void t(@dl.d String str) {
            f0.p(str, "<set-?>");
            this.minLabel = str;
        }

        @dl.d
        public final a u(long millisecond) {
            this.minTime = millisecond;
            return this;
        }

        public final void v(@dl.d String str) {
            f0.p(str, "<set-?>");
            this.monthLabel = str;
        }

        @dl.d
        public final a w(@dl.d String text, @e yh.a<b2> aVar) {
            f0.p(text, "text");
            this.f64464v = aVar;
            this.cancelText = text;
            return this;
        }

        @dl.d
        public final a y(@dl.d String text, @e l<? super Long, b2> lVar) {
            f0.p(text, "text");
            this.f64463u = lVar;
            this.chooseText = text;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDatePickerDialog(@dl.d Context context) {
        super(context, R.style.DateTimePicker_BottomSheetDialog);
        f0.p(context, "context");
        this.builder = INSTANCE.a(context);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardDatePickerDialog(@dl.d Context context, @dl.d a builder) {
        this(context);
        f0.p(context, "context");
        f0.p(builder, "builder");
        this.builder = builder;
    }

    private final int A(float dpValue) {
        return (int) ((dpValue * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    private final int B(float pxValue) {
        return (int) ((pxValue / getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@dl.d View v10) {
        a aVar;
        yh.a<b2> aVar2;
        l<? super Long, b2> lVar;
        l<? super Long, b2> lVar2;
        f0.p(v10, "v");
        dismiss();
        int id2 = v10.getId();
        if (id2 == R.id.btn_today) {
            a aVar3 = this.builder;
            if (aVar3 != null && (lVar2 = aVar3.f64463u) != null) {
                lVar2.invoke(Long.valueOf(Calendar.getInstance().getTimeInMillis()));
            }
        } else if (id2 == R.id.dialog_submit) {
            a aVar4 = this.builder;
            if (aVar4 != null && (lVar = aVar4.f64463u) != null) {
                lVar.invoke(Long.valueOf(this.millisecond));
            }
        } else if (id2 == R.id.dialog_cancel && (aVar = this.builder) != null && (aVar2 = aVar.f64464v) != null) {
            aVar2.invoke();
        }
        dismiss();
    }

    @Override // com.google.android.material.bottomsheet.a, androidx.appcompat.app.i, androidx.activity.k, android.app.Dialog
    @SuppressLint({"SetTextI18n"})
    protected void onCreate(@e Bundle bundle) throws Exception {
        setContentView(R.layout.dt_dialog_time_picker);
        super.onCreate(bundle);
        FrameLayout frameLayout = (FrameLayout) f().n(R.id.design_bottom_sheet);
        f0.m(frameLayout);
        frameLayout.setBackgroundColor(0);
        this.tv_cancel = (TextView) findViewById(R.id.dialog_cancel);
        this.tv_submit = (TextView) findViewById(R.id.dialog_submit);
        this.datePicker = (DateTimePicker) findViewById(R.id.dateTimePicker);
        this.tv_title = (TextView) findViewById(R.id.tv_title);
        this.btn_today = (TextView) findViewById(R.id.btn_today);
        this.tv_choose_date = (TextView) findViewById(R.id.tv_choose_date);
        this.tv_go_back = (TextView) findViewById(R.id.tv_go_back);
        this.linear_now = (LinearLayout) findViewById(R.id.linear_now);
        this.linear_bg = (LinearLayout) findViewById(R.id.linear_bg);
        this.divider_top = findViewById(R.id.divider_top);
        this.divider_bottom = findViewById(R.id.divider_bottom);
        this.divider_line = findViewById(R.id.dialog_select_border);
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorR0 = BottomSheetBehavior.r0(frameLayout);
        this.mBehavior = bottomSheetBehaviorR0;
        if (bottomSheetBehaviorR0 != null) {
            a aVar = this.builder;
            bottomSheetBehaviorR0.c1(aVar == null ? true : aVar.touchHideable);
        }
        a aVar2 = this.builder;
        f0.m(aVar2);
        if (aVar2.model != 0) {
            LinearLayout linearLayout = this.linear_bg;
            f0.m(linearLayout);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(linearLayout.getLayoutParams());
            a aVar3 = this.builder;
            f0.m(aVar3);
            int i10 = aVar3.model;
            if (i10 == 0) {
                layoutParams.setMargins(A(12.0f), A(12.0f), A(12.0f), A(12.0f));
                LinearLayout linearLayout2 = this.linear_bg;
                f0.m(linearLayout2);
                linearLayout2.setLayoutParams(layoutParams);
                LinearLayout linearLayout3 = this.linear_bg;
                f0.m(linearLayout3);
                linearLayout3.setBackgroundResource(R.drawable.shape_bg_round_white_5);
            } else if (i10 == 1) {
                layoutParams.setMargins(0, 0, 0, 0);
                LinearLayout linearLayout4 = this.linear_bg;
                f0.m(linearLayout4);
                linearLayout4.setLayoutParams(layoutParams);
                LinearLayout linearLayout5 = this.linear_bg;
                f0.m(linearLayout5);
                linearLayout5.setBackgroundColor(androidx.core.content.d.f(getContext(), R.color.colorTextWhite));
            } else if (i10 != 2) {
                layoutParams.setMargins(0, 0, 0, 0);
                LinearLayout linearLayout6 = this.linear_bg;
                f0.m(linearLayout6);
                linearLayout6.setLayoutParams(layoutParams);
                LinearLayout linearLayout7 = this.linear_bg;
                f0.m(linearLayout7);
                a aVar4 = this.builder;
                f0.m(aVar4);
                linearLayout7.setBackgroundResource(aVar4.model);
            } else {
                layoutParams.setMargins(0, 0, 0, 0);
                LinearLayout linearLayout8 = this.linear_bg;
                f0.m(linearLayout8);
                linearLayout8.setLayoutParams(layoutParams);
                LinearLayout linearLayout9 = this.linear_bg;
                f0.m(linearLayout9);
                linearLayout9.setBackgroundResource(R.drawable.shape_bg_top_round_white_15);
            }
        }
        a aVar5 = this.builder;
        f0.m(aVar5);
        String str = aVar5.titleValue;
        if (str == null || str.length() == 0) {
            TextView textView = this.tv_title;
            f0.m(textView);
            textView.setVisibility(8);
        } else {
            TextView textView2 = this.tv_title;
            if (textView2 != null) {
                a aVar6 = this.builder;
                f0.m(aVar6);
                textView2.setText(aVar6.titleValue);
            }
            TextView textView3 = this.tv_title;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
        }
        TextView textView4 = this.tv_cancel;
        if (textView4 != null) {
            a aVar7 = this.builder;
            f0.m(aVar7);
            textView4.setText(aVar7.cancelText);
        }
        TextView textView5 = this.tv_submit;
        if (textView5 != null) {
            a aVar8 = this.builder;
            f0.m(aVar8);
            textView5.setText(aVar8.chooseText);
        }
        DateTimePicker dateTimePicker = this.datePicker;
        f0.m(dateTimePicker);
        a aVar9 = this.builder;
        f0.m(aVar9);
        dateTimePicker.setLayout(aVar9.pickerLayoutResId);
        DateTimePicker dateTimePicker2 = this.datePicker;
        f0.m(dateTimePicker2);
        a aVar10 = this.builder;
        f0.m(aVar10);
        dateTimePicker2.e(aVar10.dateLabel);
        DateTimePicker dateTimePicker3 = this.datePicker;
        f0.m(dateTimePicker3);
        a aVar11 = this.builder;
        f0.m(aVar11);
        String yearLabel = aVar11.getYearLabel();
        a aVar12 = this.builder;
        f0.m(aVar12);
        String monthLabel = aVar12.getMonthLabel();
        a aVar13 = this.builder;
        f0.m(aVar13);
        String dayLabel = aVar13.getDayLabel();
        a aVar14 = this.builder;
        f0.m(aVar14);
        String hourLabel = aVar14.getHourLabel();
        a aVar15 = this.builder;
        f0.m(aVar15);
        String minLabel = aVar15.getMinLabel();
        a aVar16 = this.builder;
        f0.m(aVar16);
        dateTimePicker3.setLabelText(yearLabel, monthLabel, dayLabel, hourLabel, minLabel, aVar16.getSecondLabel());
        a aVar17 = this.builder;
        f0.m(aVar17);
        if (aVar17.displayTypes == null) {
            a aVar18 = this.builder;
            f0.m(aVar18);
            aVar18.displayTypes = new int[]{0, 1, 2, 3, 4, 5};
        }
        DateTimePicker dateTimePicker4 = this.datePicker;
        f0.m(dateTimePicker4);
        a aVar19 = this.builder;
        f0.m(aVar19);
        dateTimePicker4.setDisplayType(aVar19.displayTypes);
        a aVar20 = this.builder;
        f0.m(aVar20);
        if (aVar20.displayTypes != null) {
            a aVar21 = this.builder;
            f0.m(aVar21);
            int[] iArr = aVar21.displayTypes;
            f0.m(iArr);
            int length = iArr.length;
            int i11 = 0;
            char c10 = 0;
            while (i11 < length) {
                int i12 = iArr[i11];
                i11++;
                if (i12 == 0 && c10 <= 0) {
                    TextView textView6 = this.tv_go_back;
                    f0.m(textView6);
                    textView6.setText("回到今年");
                    TextView textView7 = this.btn_today;
                    f0.m(textView7);
                    textView7.setText("今");
                    c10 = 0;
                }
                if (i12 == 1 && c10 <= 1) {
                    TextView textView8 = this.tv_go_back;
                    f0.m(textView8);
                    textView8.setText("回到本月");
                    TextView textView9 = this.btn_today;
                    f0.m(textView9);
                    textView9.setText("本");
                    c10 = 1;
                }
                if (i12 == 2 && c10 <= 2) {
                    TextView textView10 = this.tv_go_back;
                    f0.m(textView10);
                    textView10.setText("回到今日");
                    TextView textView11 = this.btn_today;
                    f0.m(textView11);
                    textView11.setText("今");
                    c10 = 2;
                }
                if (i12 == 3 || i12 == 4) {
                    if (c10 <= 3) {
                        TextView textView12 = this.tv_go_back;
                        f0.m(textView12);
                        textView12.setText("回到此刻");
                        TextView textView13 = this.btn_today;
                        f0.m(textView13);
                        textView13.setText("此");
                        c10 = 3;
                    }
                }
            }
        }
        LinearLayout linearLayout10 = this.linear_now;
        f0.m(linearLayout10);
        a aVar22 = this.builder;
        f0.m(aVar22);
        linearLayout10.setVisibility(aVar22.backNow ? 0 : 8);
        TextView textView14 = this.tv_choose_date;
        f0.m(textView14);
        a aVar23 = this.builder;
        f0.m(aVar23);
        textView14.setVisibility(aVar23.focusDateInfo ? 0 : 8);
        DateTimePicker dateTimePicker5 = this.datePicker;
        f0.m(dateTimePicker5);
        dateTimePicker5.setGlobal(1);
        DateTimePicker dateTimePicker6 = this.datePicker;
        f0.m(dateTimePicker6);
        a aVar24 = this.builder;
        f0.m(aVar24);
        dateTimePicker6.setMinMillisecond(aVar24.minTime);
        DateTimePicker dateTimePicker7 = this.datePicker;
        f0.m(dateTimePicker7);
        a aVar25 = this.builder;
        f0.m(aVar25);
        dateTimePicker7.setMaxMillisecond(aVar25.maxTime);
        DateTimePicker dateTimePicker8 = this.datePicker;
        f0.m(dateTimePicker8);
        a aVar26 = this.builder;
        f0.m(aVar26);
        dateTimePicker8.setDefaultMillisecond(aVar26.defaultMillisecond);
        DateTimePicker dateTimePicker9 = this.datePicker;
        f0.m(dateTimePicker9);
        a aVar27 = this.builder;
        f0.m(aVar27);
        List<Integer> list = aVar27.wrapSelectorWheelTypes;
        a aVar28 = this.builder;
        f0.m(aVar28);
        dateTimePicker9.setWrapSelectorWheel(list, aVar28.wrapSelectorWheel);
        DateTimePicker dateTimePicker10 = this.datePicker;
        f0.m(dateTimePicker10);
        dateTimePicker10.setTextSize(13, 15);
        a aVar29 = this.builder;
        f0.m(aVar29);
        if (aVar29.themeColor != 0) {
            DateTimePicker dateTimePicker11 = this.datePicker;
            f0.m(dateTimePicker11);
            a aVar30 = this.builder;
            f0.m(aVar30);
            dateTimePicker11.setThemeColor(aVar30.themeColor);
            TextView textView15 = this.tv_submit;
            f0.m(textView15);
            a aVar31 = this.builder;
            f0.m(aVar31);
            textView15.setTextColor(aVar31.themeColor);
            GradientDrawable gradientDrawable = new GradientDrawable();
            a aVar32 = this.builder;
            f0.m(aVar32);
            gradientDrawable.setColor(aVar32.themeColor);
            gradientDrawable.setCornerRadius(A(60.0f));
            TextView textView16 = this.btn_today;
            f0.m(textView16);
            textView16.setBackground(gradientDrawable);
        }
        a aVar33 = this.builder;
        f0.m(aVar33);
        if (aVar33.assistColor != 0) {
            TextView textView17 = this.tv_title;
            if (textView17 != null) {
                a aVar34 = this.builder;
                f0.m(aVar34);
                textView17.setTextColor(aVar34.assistColor);
            }
            TextView textView18 = this.tv_choose_date;
            if (textView18 != null) {
                a aVar35 = this.builder;
                f0.m(aVar35);
                textView18.setTextColor(aVar35.assistColor);
            }
            TextView textView19 = this.tv_go_back;
            if (textView19 != null) {
                a aVar36 = this.builder;
                f0.m(aVar36);
                textView19.setTextColor(aVar36.assistColor);
            }
            TextView textView20 = this.tv_cancel;
            if (textView20 != null) {
                a aVar37 = this.builder;
                f0.m(aVar37);
                textView20.setTextColor(aVar37.assistColor);
            }
            DateTimePicker dateTimePicker12 = this.datePicker;
            f0.m(dateTimePicker12);
            a aVar38 = this.builder;
            f0.m(aVar38);
            dateTimePicker12.setTextColor(aVar38.assistColor);
        }
        a aVar39 = this.builder;
        f0.m(aVar39);
        if (aVar39.dividerColor != 0) {
            View view = this.divider_top;
            if (view != null) {
                a aVar40 = this.builder;
                f0.m(aVar40);
                view.setBackgroundColor(aVar40.dividerColor);
            }
            View view2 = this.divider_bottom;
            if (view2 != null) {
                a aVar41 = this.builder;
                f0.m(aVar41);
                view2.setBackgroundColor(aVar41.dividerColor);
            }
            View view3 = this.divider_line;
            if (view3 != null) {
                a aVar42 = this.builder;
                f0.m(aVar42);
                view3.setBackgroundColor(aVar42.dividerColor);
            }
            DateTimePicker dateTimePicker13 = this.datePicker;
            f0.m(dateTimePicker13);
            a aVar43 = this.builder;
            f0.m(aVar43);
            dateTimePicker13.setDividerColor(aVar43.dividerColor);
        }
        TextView textView21 = this.tv_cancel;
        f0.m(textView21);
        textView21.setOnClickListener(this);
        TextView textView22 = this.tv_submit;
        f0.m(textView22);
        textView22.setOnClickListener(this);
        TextView textView23 = this.btn_today;
        f0.m(textView23);
        textView23.setOnClickListener(this);
        DateTimePicker dateTimePicker14 = this.datePicker;
        f0.m(dateTimePicker14);
        dateTimePicker14.setOnDateTimeChangedListener(new l<Long, b2>() { // from class: com.loper7.date_time_picker.dialog.CardDatePickerDialog.onCreate.1
            {
                super(1);
            }

            public final void a(long j10) {
                String str2;
                CardDatePickerDialog.this.millisecond = j10;
                Calendar calendar = Calendar.getInstance();
                calendar.clear();
                calendar.setTimeInMillis(j10);
                a aVar44 = CardDatePickerDialog.this.builder;
                Integer numValueOf = aVar44 == null ? null : Integer.valueOf(aVar44.chooseDateModel);
                if (numValueOf == null || numValueOf.intValue() != 1) {
                    TextView textView24 = CardDatePickerDialog.this.tv_choose_date;
                    if (textView24 == null) {
                        return;
                    }
                    fa.a aVar45 = fa.a.f118821a;
                    textView24.setText(f0.C(aVar45.b(j10, "yyyy年MM月dd日 "), aVar45.e(j10)));
                    return;
                }
                ga.a.C1076a c1076a = ga.a.f118996h;
                f0.o(calendar, "calendar");
                ga.a aVarB = c1076a.b(calendar);
                CardDatePickerDialog cardDatePickerDialog = CardDatePickerDialog.this;
                if (aVarB == null) {
                    str2 = "暂无农历信息";
                } else {
                    str2 = "农历 " + aVarB.k() + aVarB.h() + aVarB.b() + ' ' + fa.a.f118821a.e(j10);
                }
                TextView textView25 = cardDatePickerDialog.tv_choose_date;
                if (textView25 == null) {
                    return;
                }
                textView25.setText(Html.fromHtml(str2));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Long l10) {
                a(l10.longValue());
                return b2.f124493a;
            }
        });
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
