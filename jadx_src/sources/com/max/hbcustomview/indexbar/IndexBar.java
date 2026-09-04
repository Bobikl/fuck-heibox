package com.max.hbcustomview.indexbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.j1;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.max.hbcustomview.R;
import com.max.hbcustomview.indexbar.bean.BaseIndexPinyinBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class IndexBar extends View {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f69135s = "zxt/IndexBar";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static String[] f69136t = {androidx.exifinterface.media.a.W4, "B", "C", "D", androidx.exifinterface.media.a.S4, "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", androidx.exifinterface.media.a.R4, androidx.exifinterface.media.a.f23244d5, "U", androidx.exifinterface.media.a.X4, androidx.exifinterface.media.a.T4, "X", "Y", "Z", "#"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f69137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f69138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f69139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f69140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f69141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Paint f69142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f69143h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f69144i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f69145j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f69146k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f69147l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private TextView f69148m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<? extends BaseIndexPinyinBean> f69149n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private LinearLayoutManager f69150o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f69151p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f69152q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private d f69153r;

    public class a implements d {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcustomview.indexbar.IndexBar.d
        public void a(int i10, String str) {
            int iC;
            if (PatchProxy.proxy(new Object[]{new Integer(i10), str}, this, changeQuickRedirect, false, bb.c.f.f32316hk, new Class[]{Integer.TYPE, String.class}, Void.TYPE).isSupported) {
                return;
            }
            IndexBar indexBar = IndexBar.this;
            indexBar.f69151p = i10;
            if (indexBar.f69148m != null) {
                IndexBar.this.f69148m.setVisibility(0);
                IndexBar.this.f69148m.setText(str);
            }
            if (IndexBar.this.f69150o == null || (iC = IndexBar.c(IndexBar.this, str)) == -1) {
                return;
            }
            IndexBar.this.f69150o.scrollToPositionWithOffset(iC + 1, 0);
            IndexBar.this.invalidate();
        }

        @Override // com.max.hbcustomview.indexbar.IndexBar.d
        public void b() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32338ik, new Class[0], Void.TYPE).isSupported || IndexBar.this.f69148m == null) {
                return;
            }
            IndexBar.this.f69148m.setVisibility(8);
        }
    }

    public class b implements Comparator<String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        public int a(String str, String str2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, bb.c.f.f32362jk, new Class[]{String.class, String.class}, Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            if (str.equals("#")) {
                return IndexBar.this.f69152q ? -1 : 1;
            }
            if (str2.equals("#")) {
                return IndexBar.this.f69152q ? 1 : -1;
            }
            return str.compareTo(str2);
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(String str, String str2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, bb.c.f.f32385kk, new Class[]{Object.class, Object.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : a(str, str2);
        }
    }

    public class c implements Comparator<BaseIndexPinyinBean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        public int a(BaseIndexPinyinBean baseIndexPinyinBean, BaseIndexPinyinBean baseIndexPinyinBean2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{baseIndexPinyinBean, baseIndexPinyinBean2}, this, changeQuickRedirect, false, bb.c.f.f32408lk, new Class[]{BaseIndexPinyinBean.class, BaseIndexPinyinBean.class}, Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            if (baseIndexPinyinBean.getPinyin_tag().equals("#")) {
                return IndexBar.this.f69152q ? -1 : 1;
            }
            if (baseIndexPinyinBean2.getPinyin_tag().equals("#")) {
                return IndexBar.this.f69152q ? 1 : -1;
            }
            return baseIndexPinyinBean.getPyCity().compareTo(baseIndexPinyinBean2.getPyCity());
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(BaseIndexPinyinBean baseIndexPinyinBean, BaseIndexPinyinBean baseIndexPinyinBean2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{baseIndexPinyinBean, baseIndexPinyinBean2}, this, changeQuickRedirect, false, bb.c.f.f32431mk, new Class[]{Object.class, Object.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : a(baseIndexPinyinBean, baseIndexPinyinBean2);
        }
    }

    public interface d {
        void a(int i10, String str);

        void b();
    }

    public IndexBar(Context context) {
        this(context, null);
    }

    public IndexBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IndexBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f69151p = -1;
        this.f69152q = false;
        h(context, attributeSet, i10);
    }

    static /* synthetic */ int c(IndexBar indexBar, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{indexBar, str}, null, changeQuickRedirect, true, bb.c.f.f32293gk, new Class[]{IndexBar.class, String.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : indexBar.g(str);
    }

    private int f(Context context, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Float(f10)}, this, changeQuickRedirect, false, bb.c.f.Yj, new Class[]{Context.class, Float.TYPE}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private int g(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.f.f32247ek, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        for (int i10 = 0; i10 < this.f69149n.size(); i10++) {
            if (str.equals(this.f69149n.get(i10).getPinyin_tag())) {
                return i10;
            }
        }
        return -1;
    }

    private void h(Context context, AttributeSet attributeSet, int i10) {
        if (PatchProxy.proxy(new Object[]{context, attributeSet, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Tj, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f69143h = (int) TypedValue.applyDimension(1, 10.0f, getResources().getDisplayMetrics());
        this.f69147l = 0;
        this.f69145j = -7829368;
        this.f69146k = j1.f21601t;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.f68641e1, i10, 0);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == R.styleable.IndexBar_textSize) {
                this.f69143h = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f69143h);
            } else if (index == R.styleable.IndexBar_chooseTextSize) {
                this.f69144i = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f69143h);
            } else if (index == R.styleable.IndexBar_textColor) {
                this.f69145j = typedArrayObtainStyledAttributes.getColor(index, this.f69145j);
            } else if (index == R.styleable.IndexBar_chooseTextColor) {
                this.f69146k = typedArrayObtainStyledAttributes.getColor(index, this.f69146k);
            } else if (index == R.styleable.IndexBar_pressBackground) {
                this.f69147l = typedArrayObtainStyledAttributes.getColor(index, this.f69147l);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f69138c) {
            this.f69137b = Arrays.asList(f69136t);
        }
        Paint paint = new Paint();
        this.f69142g = paint;
        paint.setAntiAlias(true);
        setmOnIndexPressedListener(new a());
    }

    private void i() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32200ck, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int size = this.f69149n.size();
        for (int i10 = 0; i10 < size; i10++) {
            BaseIndexPinyinBean baseIndexPinyinBean = this.f69149n.get(i10);
            StringBuilder sb2 = new StringBuilder();
            String target = baseIndexPinyinBean.getTarget();
            for (int i11 = 0; i11 < target.length(); i11++) {
                sb2.append(com.github.promeg.pinyinhelper.c.g(target.charAt(i11)));
            }
            baseIndexPinyinBean.setPyCity(sb2.toString());
            String strSubstring = sb2.length() > 0 ? sb2.toString().substring(0, 1) : "#";
            if (strSubstring.matches("[A-Z]")) {
                baseIndexPinyinBean.setPinyin_tag(strSubstring);
                if (this.f69138c && !this.f69137b.contains(strSubstring)) {
                    this.f69137b.add(strSubstring);
                }
            } else {
                baseIndexPinyinBean.setPinyin_tag("#");
                if (this.f69138c && !this.f69137b.contains("#")) {
                    this.f69137b.add("#");
                }
            }
        }
        o();
    }

    private void o() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32224dk, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Collections.sort(this.f69137b, new b());
        Collections.sort(this.f69149n, new c());
    }

    public IndexBar e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32154ak, new Class[0], IndexBar.class);
        if (patchProxyResultProxy.isSupported) {
            return (IndexBar) patchProxyResultProxy.result;
        }
        List<String> list = this.f69137b;
        if (list != null && this.f69138c && !list.contains("#")) {
            this.f69137b.add("#");
        }
        return this;
    }

    public d getmOnIndexPressedListener() {
        return this.f69153r;
    }

    public IndexBar j(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.Zj, new Class[]{Boolean.TYPE}, IndexBar.class);
        if (patchProxyResultProxy.isSupported) {
            return (IndexBar) patchProxyResultProxy.result;
        }
        this.f69138c = z10;
        if (this.f69137b != null && z10) {
            this.f69137b = new ArrayList();
        }
        return this;
    }

    public IndexBar k(boolean z10) {
        this.f69152q = z10;
        return this;
    }

    public IndexBar l(LinearLayoutManager linearLayoutManager) {
        this.f69150o = linearLayoutManager;
        return this;
    }

    public IndexBar m(TextView textView) {
        this.f69148m = textView;
        return this;
    }

    public IndexBar n(List<? extends BaseIndexPinyinBean> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.f.f32177bk, new Class[]{List.class}, IndexBar.class);
        if (patchProxyResultProxy.isSupported) {
            return (IndexBar) patchProxyResultProxy.result;
        }
        this.f69149n = list;
        i();
        return this;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.Vj, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        int paddingTop = getPaddingTop();
        Rect rect = new Rect();
        for (int i10 = 0; i10 < this.f69137b.size(); i10++) {
            String str = this.f69137b.get(i10);
            if (i10 == this.f69151p) {
                this.f69142g.setTextSize(this.f69144i);
                this.f69142g.setColor(this.f69146k);
            } else {
                this.f69142g.setTextSize(this.f69143h);
                this.f69142g.setColor(this.f69145j);
            }
            this.f69142g.getTextBounds(str, 0, str.length(), rect);
            Paint.FontMetrics fontMetrics = this.f69142g.getFontMetrics();
            canvas.drawText(str, (this.f69139d / 2) - (rect.width() / 2), (this.f69141f * i10) + paddingTop + ((int) (((this.f69141f - fontMetrics.bottom) - fontMetrics.top) / 2.0f)), this.f69142g);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Uj, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Xj, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onSizeChanged(i10, i11, i12, i13);
        this.f69139d = i10;
        this.f69140e = i11;
        List<String> list = this.f69137b;
        if (list == null || list.size() <= 0) {
            this.f69141f = f(getContext(), 5.0f);
        } else {
            this.f69141f = ((this.f69140e - getPaddingTop()) - getPaddingBottom()) / this.f69137b.size();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int size = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.f.Wj, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 2) {
                setBackgroundResource(android.R.color.transparent);
                d dVar = this.f69153r;
                if (dVar != null) {
                    dVar.b();
                }
            }
            return true;
        }
        setBackgroundColor(this.f69147l);
        int y10 = (int) ((motionEvent.getY() - getPaddingTop()) / this.f69141f);
        if (y10 >= 0) {
            size = y10 >= this.f69137b.size() ? this.f69137b.size() - 1 : y10;
        }
        d dVar2 = this.f69153r;
        if (dVar2 != null) {
            dVar2.a(size, this.f69137b.get(size));
        }
        return true;
    }

    public void setSelected(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.f.f32270fk, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f69151p = this.f69137b.indexOf(str);
        invalidate();
    }

    public void setmOnIndexPressedListener(d dVar) {
        this.f69153r = dVar;
    }
}
