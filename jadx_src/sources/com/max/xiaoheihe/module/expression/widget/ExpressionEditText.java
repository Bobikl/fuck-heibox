package com.max.xiaoheihe.module.expression.widget;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.ClickableSpan;
import android.text.style.DynamicDrawableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.activity.result.g;
import androidx.annotation.n0;
import androidx.appcompat.widget.AppCompatEditText;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.u;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.AccelWorldStringKt;
import com.max.xiaoheihe.accelworld.e;
import com.max.xiaoheihe.bean.bbs.HighlightInfo;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.bbs.AddAtUserActivity;
import com.max.xiaoheihe.module.bbs.AddHashtagActivity;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.b2;
import yh.l;

/* JADX INFO: loaded from: classes10.dex */
public class ExpressionEditText extends AppCompatEditText {
    private static final String H = "info_at";
    private static final String I = "info_hashtag";
    private static final String J = "info_game";
    private static final String K = "info_hidden";
    public static final int L = 0;
    public static final int M = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private Pattern A;
    private int B;
    private int C;
    private int D;
    public g<Intent> E;
    private d F;
    private l<Integer, b2> G;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Integer f83590g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f83591h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f83592i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f83593j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f83594k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f83595l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Context f83596m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private SpannableStringBuilder f83597n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private SpannableStringBuilder f83598o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f83599p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f83600q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f83601r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f83602s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f83603t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f83604u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f83605v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private TreeMap<Integer, HighlightInfo> f83606w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Pattern f83607x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Pattern f83608y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Pattern f83609z;

    public class a implements View.OnTouchListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, motionEvent}, this, changeQuickRedirect, false, 31510, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            try {
                Spannable spannableNewSpannable = Spannable.Factory.getInstance().newSpannable(((TextView) view).getText());
                TextView textView = (TextView) view;
                int action = motionEvent.getAction();
                if (action != 1 && action != 0) {
                    return false;
                }
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                int totalPaddingLeft = x10 - textView.getTotalPaddingLeft();
                int totalPaddingTop = y10 - textView.getTotalPaddingTop();
                int scrollX = totalPaddingLeft + textView.getScrollX();
                int scrollY = totalPaddingTop + textView.getScrollY();
                Layout layout = textView.getLayout();
                int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableNewSpannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length == 0) {
                    return false;
                }
                if (action == 1) {
                    clickableSpanArr[0].onClick(textView);
                }
                return true;
            } catch (Throwable th2) {
                com.max.heybox.hblog.g.G("[ExpressionEditText]" + th2.getMessage());
                return false;
            }
        }
    }

    public class b implements Comparator<Integer> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        public int a(Integer num, Integer num2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num, num2}, this, changeQuickRedirect, false, 31511, new Class[]{Integer.class, Integer.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : -num.compareTo(num2);
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Integer num, Integer num2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num, num2}, this, changeQuickRedirect, false, 31512, new Class[]{Object.class, Object.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : a(num, num2);
        }
    }

    public class c implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Spannable f83612b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f83613c = false;

        c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, 31515, new Class[]{Editable.class}, Void.TYPE).isSupported || ExpressionEditText.this.G == null) {
                return;
            }
            ExpressionEditText.this.G.invoke(Integer.valueOf(AccelWorldStringKt.b(editable)));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            Object[] objArr = {charSequence, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 31513, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b("cqtest", ".\niconLength: " + ExpressionEditText.this.f83603t + "\nstart: " + i10 + "\nignore:  " + ExpressionEditText.this.f83599p);
            if (ExpressionEditText.this.f83599p) {
                return;
            }
            this.f83612b = new SpannableStringBuilder(charSequence);
            if (i10 <= ExpressionEditText.this.f83603t) {
                this.f83613c = true;
                return;
            }
            if (ExpressionEditText.this.f83593j) {
                Matcher matcher = ExpressionEditText.this.f83607x.matcher(charSequence.subSequence(i10, i10 + i11));
                while (matcher.find()) {
                    ExpressionEditText.p(ExpressionEditText.this, (matcher.end() - matcher.start()) - 1);
                }
            }
            if (i11 - i12 == 0 || !ExpressionEditText.q(ExpressionEditText.this, i10, i11)) {
                ExpressionEditText.s(ExpressionEditText.this, i10, i12 - i11);
            } else {
                ExpressionEditText.r(ExpressionEditText.this, i10, i11, this.f83612b);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            Object[] objArr = {charSequence, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 31514, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            ExpressionEditText.this.f83597n = (SpannableStringBuilder) charSequence;
            if (!ExpressionEditText.this.f83599p) {
                if (this.f83613c) {
                    this.f83613c = false;
                    ExpressionEditText.this.f83599p = true;
                    ExpressionEditText.this.setText(this.f83612b);
                    ExpressionEditText.this.f83599p = false;
                    ExpressionEditText expressionEditText = ExpressionEditText.this;
                    expressionEditText.setSelection(expressionEditText.f83603t + 1);
                    return;
                }
                if (charSequence.toString().trim().equals(this.f83612b.toString().trim())) {
                    return;
                }
                if (ExpressionEditText.this.f83602s != -10) {
                    ExpressionEditText.this.f83598o.insert(ExpressionEditText.this.f83602s, (CharSequence) charSequence.subSequence(i10, i10 + i12).toString());
                    ExpressionEditText expressionEditText2 = ExpressionEditText.this;
                    ExpressionEditText.s(expressionEditText2, expressionEditText2.f83602s, i12);
                    ExpressionEditText.this.f83599p = true;
                    ExpressionEditText expressionEditText3 = ExpressionEditText.this;
                    expressionEditText3.setText(expressionEditText3.f83598o);
                    ExpressionEditText expressionEditText4 = ExpressionEditText.this;
                    expressionEditText4.setSelection(expressionEditText4.f83602s + i12);
                    ExpressionEditText.this.f83599p = false;
                    ExpressionEditText.this.f83602s = -10;
                }
                if (i12 == 1) {
                    if (ExpressionEditText.this.f83591h && charSequence.charAt(i10) == '@') {
                        ExpressionEditText expressionEditText5 = ExpressionEditText.this;
                        if (expressionEditText5.E != null) {
                            ExpressionEditText.this.E.b(AddAtUserActivity.N1(expressionEditText5.f83596m, i0.j()));
                        } else {
                            com.max.xiaoheihe.utils.d.H1(expressionEditText5.f83596m, AddAtUserActivity.N1(ExpressionEditText.this.f83596m, i0.j()), 0);
                        }
                    } else if (ExpressionEditText.this.f83592i && charSequence.charAt(i10) == '#') {
                        com.max.xiaoheihe.utils.d.H1(ExpressionEditText.this.f83596m, AddHashtagActivity.V1(ExpressionEditText.this.f83596m), 1);
                    }
                } else if (ExpressionEditText.this.f83595l && i12 > 2) {
                    ExpressionEditText.this.f83599p = true;
                    ExpressionEditText expressionEditText6 = ExpressionEditText.this;
                    ExpressionEditText.k(expressionEditText6, expressionEditText6.f83597n);
                    ExpressionEditText.this.f83599p = false;
                }
            }
            ExpressionEditText expressionEditText7 = ExpressionEditText.this;
            expressionEditText7.f83601r = expressionEditText7.f83597n.length();
        }
    }

    public interface d {
        void a();
    }

    public ExpressionEditText(Context context) {
        super(context);
        this.f83590g = 140;
        this.f83595l = true;
        this.f83603t = -1;
        this.E = null;
        this.F = null;
        this.G = null;
        F(null);
    }

    public ExpressionEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f83590g = 140;
        this.f83595l = true;
        this.f83603t = -1;
        this.E = null;
        this.F = null;
        this.G = null;
        F(attributeSet);
    }

    public ExpressionEditText(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f83590g = 140;
        this.f83595l = true;
        this.f83603t = -1;
        this.E = null;
        this.F = null;
        this.G = null;
        F(attributeSet);
    }

    private StringBuilder B(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 31499, new Class[]{String.class}, StringBuilder.class);
        if (patchProxyResultProxy.isSupported) {
            return (StringBuilder) patchProxyResultProxy.result;
        }
        StringBuilder sb2 = new StringBuilder(str);
        for (Integer num : this.f83606w.keySet()) {
            int end = this.f83606w.get(num).getEnd();
            String type = this.f83606w.get(num).getType();
            type.hashCode();
            switch (type) {
                case "info_hidden":
                    sb2.replace(num.intValue(), end, "");
                    break;
                case "info_game":
                    sb2.replace(num.intValue(), end, D(this.f83606w.get(num)));
                    break;
                case "info_at":
                    sb2.replace(num.intValue(), end, C(this.f83606w.get(num)));
                    break;
                case "info_hashtag":
                    sb2.replace(num.intValue(), end, E(this.f83606w.get(num)));
                    break;
            }
        }
        return sb2;
    }

    private String C(HighlightInfo highlightInfo) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{highlightInfo}, this, changeQuickRedirect, false, 31502, new Class[]{HighlightInfo.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            return String.format("<a data-user-id=\"%s\" href=\"https://" + lb.a.f131021p1 + "/open_inapp/#heybox://", highlightInfo.getData()) + URLEncoder.encode(String.format("{\"protocol_type\":\"openUser\",\"user_id\":\"%s\"}", highlightInfo.getData())) + String.format("\" target=\"_blank\">%s</a>", highlightInfo.getName());
        } catch (Exception e10) {
            e10.printStackTrace();
            return String.format("<a data-user-id=\"%s\" href=\"https://" + lb.a.f131021p1 + "/open_inapp/#heybox://{\"protocol_type\":\"openUser\",\"user_id\":\"%s\"}\" target=\"_blank\">%s</a>", highlightInfo.getData(), highlightInfo.getData(), highlightInfo.getName());
        }
    }

    private String D(HighlightInfo highlightInfo) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{highlightInfo}, this, changeQuickRedirect, false, 31501, new Class[]{HighlightInfo.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "<a data-link-type=\"game\" data-game-id=\"" + highlightInfo.getData() + "\" href=\"https://" + lb.a.f131021p1 + "/open_inapp/#heybox://" + URLEncoder.encode(String.format("{\"protocol_type\":\"openGameDetail\",\"app_id\":\"%s\"}", highlightInfo.getData())) + String.format("\" target=\"_blank\">%s</a>", highlightInfo.getName().substring(1, highlightInfo.getName().length() - 1));
    }

    private String E(HighlightInfo highlightInfo) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{highlightInfo}, this, changeQuickRedirect, false, 31500, new Class[]{HighlightInfo.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : String.format("<a href=\"heybox://open_subject\" target=\"_blank\">%s</a>", highlightInfo.getName());
    }

    private void F(AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, 31482, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f83596m = getContext();
        this.f83601r = 0;
        this.f83600q = 0;
        if (attributeSet == null) {
            this.f83591h = false;
            this.f83593j = false;
            this.f83592i = false;
            this.f83594k = false;
            this.B = (int) getTextSize();
            this.D = (int) getTextSize();
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.O0);
        this.f83592i = typedArrayObtainStyledAttributes.getBoolean(3, false);
        this.f83591h = typedArrayObtainStyledAttributes.getBoolean(0, false);
        this.f83593j = typedArrayObtainStyledAttributes.getBoolean(1, false);
        this.f83594k = typedArrayObtainStyledAttributes.getBoolean(2, false);
        this.B = (int) typedArrayObtainStyledAttributes.getDimension(8, getTextSize());
        this.C = typedArrayObtainStyledAttributes.getInt(4, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f83602s = -10;
        this.D = (int) getTextSize();
        if (this.f83593j) {
            this.f83607x = Pattern.compile("\\[(.*?)]");
        }
        if (this.f83592i) {
            this.f83608y = Pattern.compile("#(?!#|heybox:)(((?!heybox:|\\[.+?]).)*?)#(?!heybox:)");
        }
        if (this.f83591h) {
            this.f83609z = Pattern.compile("(<a.?data-user-id=\\\"(.*?)\\\".*?>(@.*?)</a>)");
        }
        if (this.f83594k) {
            this.A = Pattern.compile(mc.d.f131848a);
        }
        this.f83597n = (SpannableStringBuilder) getText();
        H();
        G();
        L("");
    }

    private void G() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31485, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f83591h || this.f83593j) {
            this.f83599p = false;
            this.f83600q = 0;
            this.f83606w = new TreeMap<>(new b());
            addTextChangedListener(new c());
        }
    }

    private void H() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31484, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f83592i || this.f83591h || this.f83594k) {
            setOnTouchListener(new a());
        }
    }

    private void K(SpannableStringBuilder spannableStringBuilder) {
        if (PatchProxy.proxy(new Object[]{spannableStringBuilder}, this, changeQuickRedirect, false, 31497, new Class[]{SpannableStringBuilder.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f83600q += new mc.b(this.f83596m, spannableStringBuilder, (int) getPaint().getTextSize()).a();
    }

    private void L(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 31487, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (getText() != null) {
            str = getText().toString() + str;
        }
        if (str == null || com.max.hbcommon.utils.c.u(str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        Pattern patternCompile = Pattern.compile("</?p>");
        for (Matcher matcher = patternCompile.matcher(spannableStringBuilder); matcher.find(); matcher = patternCompile.matcher(spannableStringBuilder)) {
            spannableStringBuilder.replace(matcher.start(), matcher.end(), "");
        }
        if (this.f83593j) {
            K(spannableStringBuilder);
        }
        if (this.f83592i) {
            Matcher matcher2 = this.f83608y.matcher(spannableStringBuilder);
            while (matcher2.find()) {
                matcher2.group(1);
                HighlightInfo highlightInfo = new HighlightInfo("info_hashtag", matcher2.start(), matcher2.group(0));
                this.f83606w.put(Integer.valueOf(highlightInfo.getStart()), highlightInfo);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f83596m.getResources().getColor(R.color.click_blue)), highlightInfo.getStart(), highlightInfo.getEnd(), 33);
            }
        }
        if (this.f83591h) {
            Matcher matcher3 = this.f83609z.matcher(spannableStringBuilder);
            while (matcher3.find()) {
                HighlightInfo highlightInfo2 = new HighlightInfo("info_at", matcher3.start(), matcher3.group(3), matcher3.group(2));
                spannableStringBuilder.replace(matcher3.start(), matcher3.end(), "");
                M(matcher3.start(), matcher3.group(3).length() - matcher3.group(0).length());
                int start = highlightInfo2.getStart();
                this.f83606w.put(Integer.valueOf(start), highlightInfo2);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(highlightInfo2.getName());
                spannableStringBuilder2.setSpan(e.b(this.f83596m, highlightInfo2.getName(), getTextSize()), 0, spannableStringBuilder2.length(), 33);
                this.f83600q++;
                spannableStringBuilder.insert(start, (CharSequence) spannableStringBuilder2);
                matcher3 = this.f83609z.matcher(spannableStringBuilder);
            }
        }
        if (this.f83594k) {
            Matcher matcher4 = this.A.matcher(spannableStringBuilder);
            while (matcher4.find()) {
                String strGroup = matcher4.group(4);
                String strGroup2 = matcher4.group(2);
                HighlightInfo highlightInfo3 = new HighlightInfo(J, matcher4.start(), lb.b.f131099o + strGroup + lb.b.f131099o, strGroup2);
                spannableStringBuilder.replace(matcher4.start(), matcher4.end(), "");
                M(matcher4.start(), (strGroup.length() + 2) - matcher4.group(0).length());
                int start2 = highlightInfo3.getStart();
                this.f83606w.put(Integer.valueOf(start2), highlightInfo3);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(highlightInfo3.getName());
                Drawable drawableMutate = getResources().getDrawable(R.drawable.bbs_game_filled_24x24).getConstantState().newDrawable().mutate();
                drawableMutate.setColorFilter(getResources().getColor(R.color.click_blue), PorterDuff.Mode.SRC_IN);
                drawableMutate.setBounds(0, 0, ViewUtils.f(this.f83596m, 14.0f), ViewUtils.f(this.f83596m, 14.0f));
                spannableStringBuilder3.setSpan(new ForegroundColorSpan(this.f83596m.getResources().getColor(R.color.click_blue)), 1, spannableStringBuilder3.length() - 1, 33);
                spannableStringBuilder3.setSpan(new com.max.hbcustomview.spans.b(drawableMutate, 0, ViewUtils.f(getContext(), 4.0f), ViewUtils.f(getContext(), 4.0f)), 0, 1, 33);
                Drawable drawableMutate2 = getResources().getDrawable(R.color.transparent).getConstantState().newDrawable().mutate();
                drawableMutate2.setBounds(0, 0, ViewUtils.f(this.f83596m, 4.0f), ViewUtils.f(this.f83596m, 4.0f));
                spannableStringBuilder3.setSpan(new com.max.hbcustomview.spans.b(drawableMutate2, 2), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
                this.f83600q++;
                spannableStringBuilder.insert(start2, (CharSequence) spannableStringBuilder3);
                matcher4 = this.A.matcher(spannableStringBuilder);
            }
        }
        this.f83599p = true;
        setText(spannableStringBuilder);
        this.f83599p = false;
        this.f83601r = getText().length();
        requestFocus();
        setSelection(this.f83601r);
    }

    private void M(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 31491, new Class[]{cls, cls}, Void.TYPE).isSupported || this.f83606w.size() == 0 || i11 == 0) {
            return;
        }
        ArrayList<HighlightInfo> arrayList = new ArrayList();
        Iterator<Integer> it = this.f83606w.keySet().iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            if (next.intValue() >= i10) {
                HighlightInfo highlightInfo = this.f83606w.get(next);
                highlightInfo.setStart(next.intValue() + i11);
                arrayList.add(highlightInfo);
                it.remove();
            }
        }
        for (HighlightInfo highlightInfo2 : arrayList) {
            this.f83606w.put(Integer.valueOf(highlightInfo2.getStart()), highlightInfo2);
        }
    }

    private void N() {
    }

    private void O(int i10, int i11, Spannable spannable) {
        d dVar;
        int i12;
        boolean z10 = false;
        Object[] objArr = {new Integer(i10), new Integer(i11), spannable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 31490, new Class[]{cls, cls, Spannable.class}, Void.TYPE).isSupported || this.f83606w.size() == 0) {
            return;
        }
        this.f83598o = new SpannableStringBuilder(spannable);
        Iterator<Integer> it = this.f83606w.keySet().iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            HighlightInfo highlightInfo = this.f83606w.get(next);
            if (highlightInfo != null && next.intValue() < (i12 = i10 + i11) && highlightInfo.getEnd() > i10) {
                if ("info_at".equals(highlightInfo.getType())) {
                    this.f83600q--;
                } else if (K.equals(highlightInfo.getType())) {
                    this.f83600q -= highlightInfo.getLength();
                    z10 = true;
                } else if (J.equals(highlightInfo.getType())) {
                    this.f83600q--;
                }
                it.remove();
                this.f83598o.replace(next.intValue(), highlightInfo.getEnd(), (CharSequence) "");
                M(next.intValue(), -highlightInfo.getLength());
                if (next.intValue() < i10) {
                    i11 -= highlightInfo.getEnd() - i10;
                    i10 = next.intValue();
                } else {
                    i11 = i12 < highlightInfo.getEnd() ? i11 - (i12 - next.intValue()) : i11 - highlightInfo.getLength();
                }
                if (i11 == 0) {
                    break;
                } else {
                    it = this.f83606w.keySet().iterator();
                }
            }
        }
        if (i11 > 0) {
            this.f83598o.replace(i10, i10 + i11, (CharSequence) "");
            M(i10, -i11);
        }
        this.f83602s = i10;
        if (!z10 || (dVar = this.F) == null) {
            return;
        }
        dVar.a();
    }

    static /* synthetic */ void k(ExpressionEditText expressionEditText, SpannableStringBuilder spannableStringBuilder) {
        if (PatchProxy.proxy(new Object[]{expressionEditText, spannableStringBuilder}, null, changeQuickRedirect, true, 31509, new Class[]{ExpressionEditText.class, SpannableStringBuilder.class}, Void.TYPE).isSupported) {
            return;
        }
        expressionEditText.K(spannableStringBuilder);
    }

    static /* synthetic */ int p(ExpressionEditText expressionEditText, int i10) {
        int i11 = expressionEditText.f83600q - i10;
        expressionEditText.f83600q = i11;
        return i11;
    }

    static /* synthetic */ boolean q(ExpressionEditText expressionEditText, int i10, int i11) {
        Object[] objArr = {expressionEditText, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 31506, new Class[]{ExpressionEditText.class, cls, cls}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : expressionEditText.z(i10, i11);
    }

    static /* synthetic */ void r(ExpressionEditText expressionEditText, int i10, int i11, Spannable spannable) {
        Object[] objArr = {expressionEditText, new Integer(i10), new Integer(i11), spannable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 31507, new Class[]{ExpressionEditText.class, cls, cls, Spannable.class}, Void.TYPE).isSupported) {
            return;
        }
        expressionEditText.O(i10, i11, spannable);
    }

    static /* synthetic */ void s(ExpressionEditText expressionEditText, int i10, int i11) {
        Object[] objArr = {expressionEditText, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 31508, new Class[]{ExpressionEditText.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        expressionEditText.M(i10, i11);
    }

    private boolean z(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 31492, new Class[]{cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this.f83606w.size() != 0) {
            int i12 = i11 + i10;
            return this.f83606w.ceilingKey(Integer.valueOf(i12)) != null && this.f83606w.ceilingEntry(Integer.valueOf(i12)).getValue().getEnd() > i10;
        }
        return false;
    }

    public void A() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31494, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f83600q = 0;
        this.f83606w.clear();
        this.f83603t = -1;
        this.f83599p = true;
        this.f83597n.clear();
        this.f83599p = false;
    }

    public void I(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 31493, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        K(spannableStringBuilder);
        getText().insert(getSelectionEnd(), spannableStringBuilder);
    }

    public void J(String str, DynamicDrawableSpan dynamicDrawableSpan) {
        if (PatchProxy.proxy(new Object[]{str, dynamicDrawableSpan}, this, changeQuickRedirect, false, 31495, new Class[]{String.class, DynamicDrawableSpan.class}, Void.TYPE).isSupported) {
            return;
        }
        HighlightInfo highlightInfo = new HighlightInfo(K, 0, str);
        int start = highlightInfo.getStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(highlightInfo.getName());
        int selectionEnd = getSelectionEnd();
        setSelection(0);
        spannableStringBuilder.setSpan(dynamicDrawableSpan, 0, spannableStringBuilder.length(), 33);
        this.f83599p = true;
        this.f83600q += highlightInfo.getLength();
        this.f83597n.insert(start, (CharSequence) spannableStringBuilder);
        setSelection(spannableStringBuilder.length() + start);
        M(start, spannableStringBuilder.length());
        this.f83606w.put(Integer.valueOf(start), highlightInfo);
        this.f83599p = false;
        int length = length();
        int i10 = this.f83600q;
        if (selectionEnd + i10 <= length) {
            setSelection(selectionEnd + i10);
        } else {
            setSelection(length);
        }
    }

    public void P(@n0 String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 31496, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        Iterator<Integer> it = this.f83606w.keySet().iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            HighlightInfo highlightInfo = this.f83606w.get(next);
            if (str.equals(highlightInfo.getName()) && K.equals(highlightInfo.getType())) {
                this.f83600q -= highlightInfo.getLength();
                it.remove();
                this.f83599p = true;
                this.f83597n.replace(next.intValue(), highlightInfo.getEnd(), (CharSequence) "");
                M(next.intValue(), -highlightInfo.getLength());
                this.f83599p = false;
                return;
            }
        }
    }

    public String getContentText() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31503, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : B(this.f83597n.toString()).toString();
    }

    public String getCopyContentText() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31504, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StringBuilder sb2 = new StringBuilder(this.f83597n.toString());
        for (Integer num : this.f83606w.keySet()) {
            int end = this.f83606w.get(num).getEnd();
            if (K.equals(this.f83606w.get(num).getType())) {
                sb2.replace(num.intValue(), end, "");
            }
        }
        return sb2.toString();
    }

    public Integer getLength() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31486, new Class[0], Integer.class);
        return patchProxyResultProxy.isSupported ? (Integer) patchProxyResultProxy.result : Integer.valueOf(this.f83601r - this.f83600q);
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 31498, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        try {
            if (!this.f83599p) {
                super.onSelectionChanged(i10, i11);
                if (i10 > this.f83603t) {
                    this.f83605v = i11;
                    this.f83604u = i10;
                } else {
                    setSelection(this.f83604u, this.f83605v);
                }
            }
        } catch (Throwable th2) {
            com.max.heybox.hblog.g.G("ExpressionEditText onSelectionChanged error: " + th2.getMessage());
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 31505, new Class[]{Integer.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        boolean zOnTextContextMenuItem = super.onTextContextMenuItem(i10);
        if (i10 != 16908321) {
            return zOnTextContextMenuItem;
        }
        u.a(this.f83596m, getCopyContentText());
        return true;
    }

    public void setAlwaysCheckEmoji(boolean z10) {
        this.f83595l = z10;
    }

    public void setContentText(CharSequence charSequence) {
        if (PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, 31483, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
            return;
        }
        A();
        L(charSequence.toString());
        setSelection(getSelectionEnd());
    }

    public void setOnCyChangedListener(d dVar) {
        this.F = dVar;
    }

    public void setOnTextCountChangedListener(l<Integer, b2> lVar) {
        this.G = lVar;
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), new Float(f10)}, this, changeQuickRedirect, false, 31481, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 == 0) {
            this.B = (int) f10;
        } else {
            this.B = ViewUtils.f(getContext(), f10);
        }
        super.setTextSize(i10, f10);
    }

    public void x(GameObj gameObj) {
        if (PatchProxy.proxy(new Object[]{gameObj}, this, changeQuickRedirect, false, 31489, new Class[]{GameObj.class}, Void.TYPE).isSupported || gameObj == null) {
            return;
        }
        HighlightInfo highlightInfo = new HighlightInfo(J, getSelectionEnd(), lb.b.f131099o + gameObj.getName() + lb.b.f131099o, r1.Z(gameObj));
        int start = highlightInfo.getStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(highlightInfo.getName());
        Drawable drawableMutate = getResources().getDrawable(R.drawable.bbs_game_filled_24x24).getConstantState().newDrawable().mutate();
        drawableMutate.setColorFilter(getResources().getColor(R.color.click_blue), PorterDuff.Mode.SRC_IN);
        drawableMutate.setBounds(0, 0, ViewUtils.f(getContext(), 14.0f), ViewUtils.f(getContext(), 14.0f));
        spannableStringBuilder.setSpan(new com.max.hbcustomview.spans.b(drawableMutate, 0, ViewUtils.f(getContext(), 4.0f), ViewUtils.f(getContext(), 4.0f)), 0, 1, 33);
        Drawable drawableMutate2 = getResources().getDrawable(R.color.transparent).getConstantState().newDrawable().mutate();
        drawableMutate2.setBounds(0, 0, ViewUtils.f(this.f83596m, 4.0f), ViewUtils.f(this.f83596m, 4.0f));
        spannableStringBuilder.setSpan(new com.max.hbcustomview.spans.b(drawableMutate2, 2), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.click_blue)), 1, spannableStringBuilder.length() - 1, 33);
        this.f83599p = true;
        this.f83600q++;
        this.f83597n.insert(start, (CharSequence) spannableStringBuilder);
        setSelection(spannableStringBuilder.length() + start);
        M(start, spannableStringBuilder.length());
        this.f83606w.put(Integer.valueOf(start), highlightInfo);
        this.f83599p = false;
    }

    public void y(HighlightInfo highlightInfo) {
        if (PatchProxy.proxy(new Object[]{highlightInfo}, this, changeQuickRedirect, false, 31488, new Class[]{HighlightInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        int start = highlightInfo.getStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(highlightInfo.getName());
        spannableStringBuilder.setSpan(e.b(this.f83596m, highlightInfo.getName(), getTextSize()), 0, spannableStringBuilder.length(), 33);
        this.f83599p = true;
        if ("info_at".equals(highlightInfo.getType())) {
            this.f83600q++;
        }
        this.f83597n.insert(start, (CharSequence) spannableStringBuilder);
        setSelection(spannableStringBuilder.length() + start);
        M(start, spannableStringBuilder.length());
        this.f83606w.put(Integer.valueOf(start), highlightInfo);
        this.f83599p = false;
    }
}
