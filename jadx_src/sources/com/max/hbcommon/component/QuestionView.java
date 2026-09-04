package com.max.hbcommon.component;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.core.view.j1;
import com.max.hbcommon.R;
import com.max.hbcommon.bean.question.OptionObj;
import com.max.hbcommon.bean.question.QuestionObj;
import com.max.hbcustomview.CubicBezierInterpolators;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.qcloud.core.util.IOUtils;
import java.util.ArrayList;
import java.util.List;
import mb.s1;

/* JADX INFO: compiled from: QuestionView.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class QuestionView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f67153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f67154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f67155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RadioGroup f67156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ViewGroup f67157f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ViewGroup f67158g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f67159h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f67160i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private ArrayList<QuestionObj> f67161j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f67162k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private a f67163l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private b f67164m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f67165n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f67166o;

    /* JADX INFO: compiled from: QuestionView.kt */
    public interface a {
        void onFinish();
    }

    /* JADX INFO: compiled from: QuestionView.kt */
    public interface b {
        void a(boolean z10, int i10, @dl.d QuestionObj questionObj, @dl.e OptionObj optionObj);
    }

    /* JADX INFO: compiled from: QuestionView.kt */
    public static final class c extends com.max.hbcustomview.spans.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        c(int i10) {
            super(i10);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@dl.d View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.d.f31464pe, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(view, "view");
        }
    }

    public QuestionView(@dl.e Context context) {
        this(context, null);
    }

    public QuestionView(@dl.e Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public QuestionView(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public QuestionView(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f67161j = new ArrayList<>();
        e();
    }

    private final void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31164ce, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Context context = getContext();
        kotlin.jvm.internal.f0.o(context, "getContext(...)");
        s1 s1VarC = s1.c(kb.c.d(context));
        kotlin.jvm.internal.f0.o(s1VarC, "inflate(...)");
        addView(s1VarC.b(), new LinearLayout.LayoutParams(-1, -2));
        TextView tvQuestionProgress = s1VarC.f131754f;
        kotlin.jvm.internal.f0.o(tvQuestionProgress, "tvQuestionProgress");
        setTv_question_progress(tvQuestionProgress);
        TextView tvQuestionTitle = s1VarC.f131755g;
        kotlin.jvm.internal.f0.o(tvQuestionTitle, "tvQuestionTitle");
        setTv_question_title(tvQuestionTitle);
        ImageView ivStaticQuestion = s1VarC.f131751c;
        kotlin.jvm.internal.f0.o(ivStaticQuestion, "ivStaticQuestion");
        setIv_static_question(ivStaticQuestion);
        RadioGroup rgOptions = s1VarC.f131752d;
        kotlin.jvm.internal.f0.o(rgOptions, "rgOptions");
        setRg_options(rgOptions);
        LinearLayout vgPreQuestion = s1VarC.f131757i;
        kotlin.jvm.internal.f0.o(vgPreQuestion, "vgPreQuestion");
        setVg_pre_question(vgPreQuestion);
        LinearLayout vgNextQuestion = s1VarC.f131756h;
        kotlin.jvm.internal.f0.o(vgNextQuestion, "vgNextQuestion");
        setVg_next_question(vgNextQuestion);
        TextView tvNextQuestion = s1VarC.f131753e;
        kotlin.jvm.internal.f0.o(tvNextQuestion, "tvNextQuestion");
        setTv_next_question(tvNextQuestion);
        ImageView ivNext = s1VarC.f131750b;
        kotlin.jvm.internal.f0.o(ivNext, "ivNext");
        setIv_next(ivNext);
        getVg_pre_question().setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuestionView.f(this.f67807b, view);
            }
        });
        getVg_next_question().setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuestionView.g(this.f67811b, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(QuestionView this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.d.f31372le, new Class[]{QuestionView.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(QuestionView this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.d.f31395me, new Class[]{QuestionView.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.i();
    }

    private final RadioButton h(RadioGroup radioGroup, OptionObj optionObj, String str) {
        boolean z10 = false;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{radioGroup, optionObj, str}, this, changeQuickRedirect, false, bb.c.d.f31349ke, new Class[]{RadioGroup.class, OptionObj.class, String.class}, RadioButton.class);
        if (patchProxyResultProxy.isSupported) {
            return (RadioButton) patchProxyResultProxy.result;
        }
        RadioButton radioButton = new RadioButton(getContext());
        radioButton.setText(optionObj.getO_desc());
        radioButton.setId(j1.D());
        int iF = ViewUtils.f(getContext(), 14.0f);
        int iF2 = ViewUtils.f(getContext(), 12.0f);
        radioButton.setMaxLines(Integer.MAX_VALUE);
        radioButton.setPadding(iF2, iF, iF2, iF);
        radioButton.setBackgroundResource(R.drawable.rb_question_bg);
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.rb_question_check);
        int iF3 = ViewUtils.f(getContext(), 16.0f);
        int iF4 = ViewUtils.f(getContext(), 8.0f);
        drawable.setBounds(0, 0, iF3, iF3);
        drawable.draw(new Canvas());
        radioButton.setButtonDrawable((Drawable) null);
        radioButton.setCompoundDrawables(drawable, null, null, null);
        radioButton.setCompoundDrawablePadding(iF4);
        radioButton.setTextColor(getContext().getResources().getColor(R.color.text_primary_1_color));
        if (str != null && kotlin.jvm.internal.f0.g(str, optionObj.getO_id())) {
            z10 = true;
        }
        if (z10) {
            radioButton.setChecked(true);
        }
        if (radioButton.isChecked()) {
            radioGroup.setTag(Integer.valueOf(radioButton.getId()));
        }
        return radioButton;
    }

    private final void k() {
        int i10;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31280he, new Class[0], Void.TYPE).isSupported && (i10 = this.f67162k) >= 0 && i10 < this.f67161j.size()) {
            String strValueOf = String.valueOf(this.f67162k + 1);
            SpannableString spannableString = new SpannableString(strValueOf + IOUtils.DIR_SEPARATOR_UNIX + this.f67161j.size());
            spannableString.setSpan(new c(getContext().getResources().getColor(R.color.text_primary_1_color)), 0, strValueOf.length(), 33);
            getTv_question_progress().setText(spannableString);
            getTv_question_progress();
            QuestionObj questionObj = this.f67161j.get(this.f67162k);
            kotlin.jvm.internal.f0.o(questionObj, "get(...)");
            final QuestionObj questionObj2 = questionObj;
            getTv_question_title().setText(questionObj2.getQ_desc());
            getRg_options().removeAllViews();
            getRg_options().clearCheck();
            final int i11 = this.f67162k;
            if (!com.max.hbcommon.utils.c.w(questionObj2.getOptions())) {
                List<OptionObj> options = questionObj2.getOptions();
                kotlin.jvm.internal.f0.m(options);
                for (final OptionObj optionObj : options) {
                    RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
                    if (getRg_options().getChildCount() > 0) {
                        layoutParams.topMargin = ViewUtils.f(getContext(), 6.0f);
                    }
                    final RadioButton radioButtonH = h(getRg_options(), optionObj, questionObj2.getSelected());
                    radioButtonH.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.m0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            QuestionView.l(this.f67794b, radioButtonH, questionObj2, optionObj, i11, view);
                        }
                    });
                    getRg_options().addView(radioButtonH, layoutParams);
                }
                if (getRg_options().getCheckedRadioButtonId() != -1) {
                    q();
                } else {
                    p();
                }
            }
            if (this.f67162k == this.f67161j.size() - 1) {
                getVg_next_question().setVisibility(4);
            } else {
                getVg_next_question().setVisibility(0);
            }
            if (this.f67162k == 0) {
                getVg_pre_question().setVisibility(4);
            } else {
                getVg_pre_question().setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(QuestionView this$0, RadioButton radioButton, QuestionObj current, OptionObj option, int i10, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, radioButton, current, option, new Integer(i10), view}, null, changeQuickRedirect, true, bb.c.d.f31441oe, new Class[]{QuestionView.class, RadioButton.class, QuestionObj.class, OptionObj.class, Integer.TYPE, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(radioButton, "$radioButton");
        kotlin.jvm.internal.f0.p(current, "$current");
        kotlin.jvm.internal.f0.p(option, "$option");
        Object tag = this$0.getRg_options().getTag();
        if (tag == null || !kotlin.jvm.internal.f0.g(tag, Integer.valueOf(radioButton.getId()))) {
            this$0.getRg_options().check(radioButton.getId());
            this$0.getRg_options().setTag(Integer.valueOf(radioButton.getId()));
        } else if (this$0.f67165n) {
            this$0.getRg_options().clearCheck();
            this$0.getRg_options().setTag(null);
        }
        try {
            if (radioButton.isChecked()) {
                this$0.q();
                current.setSelected(option.getO_id());
                if (this$0.f67166o) {
                    this$0.i();
                }
            } else {
                this$0.p();
                if (this$0.f67165n) {
                    current.setSelected(null);
                }
            }
            b bVar = this$0.f67164m;
            if (bVar != null) {
                bVar.a(radioButton.isChecked(), i10, current, option);
            }
        } catch (Throwable unused) {
        }
    }

    private final void n() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31257ge, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolators.Type.EASE_IN_OUT.create());
        final Bitmap bitmapU = ViewUtils.U(getRg_options());
        getIv_static_question().setImageBitmap(bitmapU);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.max.hbcommon.component.n0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                QuestionView.o(this.f67800b, bitmapU, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(QuestionView this$0, Bitmap bitmap, ValueAnimator animation) {
        if (PatchProxy.proxy(new Object[]{this$0, bitmap, animation}, null, changeQuickRedirect, true, bb.c.d.f31418ne, new Class[]{QuestionView.class, Bitmap.class, ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        this$0.getIv_static_question().setAlpha(1.0f - fFloatValue);
        this$0.getRg_options().setAlpha(fFloatValue);
        if (fFloatValue == 1.0f) {
            this$0.getIv_static_question().setImageBitmap(null);
            bitmap.recycle();
        }
    }

    private final void p() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31326je, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getTv_next_question().setText("跳过");
        getIv_next().setVisibility(8);
    }

    private final void q() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31303ie, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getTv_next_question().setText("下一项");
        getIv_next().setVisibility(0);
    }

    public final boolean getCancelable() {
        return this.f67165n;
    }

    public final boolean getClickToNext() {
        return this.f67166o;
    }

    public final int getCurrentIndex() {
        return this.f67162k;
    }

    @dl.d
    public final ImageView getIv_next() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Zd, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f67160i;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.f0.S("iv_next");
        return null;
    }

    @dl.d
    public final ImageView getIv_static_question() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Pd, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f67155d;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.f0.S("iv_static_question");
        return null;
    }

    @dl.d
    public final ArrayList<QuestionObj> getList() {
        return this.f67161j;
    }

    @dl.e
    public final a getOnFinishListener() {
        return this.f67163l;
    }

    @dl.e
    public final b getOnItemCheckedListener() {
        return this.f67164m;
    }

    @dl.d
    public final RadioGroup getRg_options() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Rd, new Class[0], RadioGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (RadioGroup) patchProxyResultProxy.result;
        }
        RadioGroup radioGroup = this.f67156e;
        if (radioGroup != null) {
            return radioGroup;
        }
        kotlin.jvm.internal.f0.S("rg_options");
        return null;
    }

    @dl.d
    public final TextView getTv_next_question() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Xd, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f67159h;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.f0.S("tv_next_question");
        return null;
    }

    @dl.d
    public final TextView getTv_question_progress() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Ld, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f67153b;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.f0.S("tv_question_progress");
        return null;
    }

    @dl.d
    public final TextView getTv_question_title() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Nd, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f67154c;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.f0.S("tv_question_title");
        return null;
    }

    @dl.d
    public final ViewGroup getVg_next_question() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Vd, new Class[0], ViewGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewGroup) patchProxyResultProxy.result;
        }
        ViewGroup viewGroup = this.f67158g;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.f0.S("vg_next_question");
        return null;
    }

    @dl.d
    public final ViewGroup getVg_pre_question() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Td, new Class[0], ViewGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewGroup) patchProxyResultProxy.result;
        }
        ViewGroup viewGroup = this.f67157f;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.f0.S("vg_pre_question");
        return null;
    }

    public final void i() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31234fe, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f67162k < this.f67161j.size() - 1) {
            this.f67162k++;
            n();
            k();
        } else {
            a aVar = this.f67163l;
            if (aVar != null) {
                aVar.onFinish();
            }
        }
    }

    public final void j() {
        int i10;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31211ee, new Class[0], Void.TYPE).isSupported && (i10 = this.f67162k) > 0) {
            this.f67162k = i10 - 1;
            n();
            k();
        }
    }

    public final void m() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31188de, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getIv_static_question().setAlpha(0.0f);
        getRg_options().setAlpha(1.0f);
        if (this.f67161j.size() > 0) {
            this.f67162k = 0;
            k();
        }
    }

    public final void setCancelable(boolean z10) {
        this.f67165n = z10;
    }

    public final void setClickToNext(boolean z10) {
        this.f67166o = z10;
    }

    public final void setCurrentIndex(int i10) {
        this.f67162k = i10;
    }

    public final void setIv_next(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, bb.c.d.f31118ae, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(imageView, "<set-?>");
        this.f67160i = imageView;
    }

    public final void setIv_static_question(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, bb.c.d.Qd, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(imageView, "<set-?>");
        this.f67155d = imageView;
    }

    public final void setList(@dl.d ArrayList<QuestionObj> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, bb.c.d.f31141be, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(arrayList, "<set-?>");
        this.f67161j = arrayList;
    }

    public final void setOnFinishListener(@dl.e a aVar) {
        this.f67163l = aVar;
    }

    public final void setOnItemCheckedListener(@dl.e b bVar) {
        this.f67164m = bVar;
    }

    public final void setRg_options(@dl.d RadioGroup radioGroup) {
        if (PatchProxy.proxy(new Object[]{radioGroup}, this, changeQuickRedirect, false, bb.c.d.Sd, new Class[]{RadioGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(radioGroup, "<set-?>");
        this.f67156e = radioGroup;
    }

    public final void setTv_next_question(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, bb.c.d.Yd, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(textView, "<set-?>");
        this.f67159h = textView;
    }

    public final void setTv_question_progress(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, bb.c.d.Md, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(textView, "<set-?>");
        this.f67153b = textView;
    }

    public final void setTv_question_title(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, bb.c.d.Od, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(textView, "<set-?>");
        this.f67154c = textView;
    }

    public final void setVg_next_question(@dl.d ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, bb.c.d.Wd, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewGroup, "<set-?>");
        this.f67158g = viewGroup;
    }

    public final void setVg_pre_question(@dl.d ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, bb.c.d.Ud, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewGroup, "<set-?>");
        this.f67157f = viewGroup;
    }
}
