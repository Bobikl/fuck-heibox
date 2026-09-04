package com.max.xiaoheihe.module.bbs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbcustomview.spans.AsyncCenterImageSpan;
import com.max.hbexpression.bean.ExpressionObj;
import com.max.hbpermission.PermissionManager;
import com.max.hbutils.utils.ViewUtils;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.AccelWorldStringKt;
import com.max.xiaoheihe.bean.bbs.ForwardInfo;
import com.max.xiaoheihe.bean.bbs.HighlightInfo;
import com.max.xiaoheihe.bean.bbs.LinkImageObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public class ForwardEditActiviy extends BaseActivity implements com.max.xiaoheihe.module.bbs.adapter.x.a, com.max.hbexpression.q.a, com.max.hbexpression.q.b, com.max.hbcustomview.c.a, com.max.hbshare.b {
    private static final int J3 = 0;
    private static final int K3 = 1;
    private static final int L3 = 124;
    private static final String M3 = "author_name";
    private static final String N3 = "author_id";
    private static final String O3 = "author_avatar";
    private static final String P3 = "acticle_desc";
    private static final String Q3 = "acticle_is_deleted";
    private static final String R3 = "content_pre";
    private static final String S3 = "link_id";
    private static final String T3 = "link_tag";
    private static final String U3 = "info_at";
    private static final String V3 = "info_hashtag";
    private static final String W3 = "info_img";
    private static final String X3 = "info_link";
    private static final String Y3 = "info_game";
    private static final String Z3 = "share_image";

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private static final String f79842a4 = "forward_img_upload";
    public static ChangeQuickRedirect changeQuickRedirect;
    private LoadingDialog G2;
    private com.max.xiaoheihe.module.bbs.adapter.x G3;
    private boolean N;
    private boolean O;
    private String U;
    private String V;
    private String W;
    private String X;
    private String Y;
    private String Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private String f79843a0;

    @BindView(R.id.iv_emoji)
    ImageView addEmojiView;

    @BindView(R.id.iv_hashtag)
    ImageView addHashtagView;

    @BindView(R.id.iv_add_img)
    ImageView addImgView;

    @BindView(R.id.iv_at)
    ImageView atView;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private String f79844b0;

    @BindView(R.id.iv_btmbar_expand)
    ImageView bottomBarArrow;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private SpannableStringBuilder f79845c0;

    @BindView(R.id.cb_also_comment)
    CheckBox cbAlsoComment;

    @BindView(R.id.et_content)
    EditText editContentView;

    @BindView(R.id.cv_postcard)
    CardView linkCardView;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private SpannableStringBuilder f79846p1;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private com.max.hbcustomview.c f79848p3;

    @BindView(R.id.rv_img_preview)
    RecyclerView rvImgPreview;

    @BindView(R.id.tv_count)
    TextView textCountView;

    @BindView(R.id.fl_toolbar_popup_box)
    FrameLayout toolPopUpBox;

    @BindView(R.id.vg_img_preview)
    ViewGroup vgImgPreview;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private com.max.hbexpression.q f79852y2;
    private final int L = 9;
    private final Pattern M = Pattern.compile("\\[(.*?)]");
    private boolean P = false;
    private final Integer Q = 140;
    private int R = -10;
    private int S = 0;
    private int T = 0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private TreeMap<Integer, HighlightInfo> f79849x1 = new TreeMap<>(new c());

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private ArrayList<String> f79851y1 = new ArrayList<>();

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private ArrayList<String> f79847p2 = new ArrayList<>();

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private ArrayList<String> f79850x2 = new ArrayList<>();

    public class a implements com.max.xiaoheihe.module.upload.g.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ void a(float f10) {
            com.max.xiaoheihe.module.upload.h.b(this, f10);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean b() {
            return com.max.xiaoheihe.module.upload.h.a(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void c(String[] strArr, String str) {
            if (PatchProxy.proxy(new Object[]{strArr, str}, this, changeQuickRedirect, false, 26417, new Class[]{String[].class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            ForwardEditActiviy.this.f79850x2.addAll(Arrays.asList(strArr));
            com.max.xiaoheihe.utils.a0.g().d("forward_img_upload");
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean d() {
            return com.max.xiaoheihe.module.upload.h.c(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void e(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 26418, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            if (ForwardEditActiviy.this.G2 != null) {
                com.max.hbcommon.utils.d.b("cqtest", "upload failed ");
                ForwardEditActiviy.this.G2.c();
            }
            com.max.xiaoheihe.utils.a0.g().k("forward_img_upload");
        }
    }

    public class b implements com.max.hbpermission.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbpermission.c
        public void onResult() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26419, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            ForwardEditActiviy.z2(ForwardEditActiviy.this);
        }
    }

    public class c implements Comparator<Integer> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        public int a(Integer num, Integer num2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num, num2}, this, changeQuickRedirect, false, 26415, new Class[]{Integer.class, Integer.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : -num.compareTo(num2);
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Integer num, Integer num2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num, num2}, this, changeQuickRedirect, false, 26416, new Class[]{Object.class, Object.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : a(num, num2);
        }
    }

    public class d extends ItemTouchHelper.SimpleCallback {
        public static ChangeQuickRedirect changeQuickRedirect;

        d(int i10, int i11) {
            super(i10, i11);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.SimpleCallback, androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recyclerView, viewHolder}, this, changeQuickRedirect, false, 26422, new Class[]{RecyclerView.class, RecyclerView.ViewHolder.class}, Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            return (ForwardEditActiviy.this.f79847p2 == null || ForwardEditActiviy.this.f79847p2.size() <= 0 || viewHolder.getAdapterPosition() >= ForwardEditActiviy.this.f79847p2.size()) ? ItemTouchHelper.Callback.makeMovementFlags(0, 0) : ItemTouchHelper.Callback.makeMovementFlags(12, 3);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean isLongPressDragEnabled() {
            return true;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recyclerView, viewHolder, viewHolder2}, this, changeQuickRedirect, false, 26420, new Class[]{RecyclerView.class, RecyclerView.ViewHolder.class, RecyclerView.ViewHolder.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            int adapterPosition = viewHolder.getAdapterPosition();
            int adapterPosition2 = viewHolder2.getAdapterPosition();
            if (ForwardEditActiviy.this.f79847p2 == null || ForwardEditActiviy.this.f79847p2.size() <= 0 || adapterPosition >= ForwardEditActiviy.this.f79847p2.size() || adapterPosition2 >= ForwardEditActiviy.this.f79847p2.size()) {
                return false;
            }
            if (adapterPosition < adapterPosition2) {
                int i10 = adapterPosition;
                while (i10 < adapterPosition2) {
                    int i11 = i10 + 1;
                    Collections.swap(ForwardEditActiviy.this.f79847p2, i10, i11);
                    i10 = i11;
                }
            } else {
                for (int i12 = adapterPosition; i12 > adapterPosition2; i12--) {
                    Collections.swap(ForwardEditActiviy.this.f79847p2, i12, i12 - 1);
                }
            }
            ForwardEditActiviy.this.G3.notifyItemMoved(adapterPosition, adapterPosition2);
            return true;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSwiped(RecyclerView.ViewHolder viewHolder, int i10) {
            if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, 26421, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            int adapterPosition = viewHolder.getAdapterPosition();
            if (ForwardEditActiviy.this.f79847p2 == null || ForwardEditActiviy.this.f79847p2.size() <= 0 || adapterPosition >= ForwardEditActiviy.this.f79847p2.size()) {
                return;
            }
            ForwardEditActiviy.this.f79847p2.remove(adapterPosition);
            ForwardEditActiviy.this.G3.notifyItemRemoved(adapterPosition);
        }
    }

    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26423, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ForwardEditActiviy.this.i0();
        }
    }

    public class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26424, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!ForwardEditActiviy.this.N) {
                ForwardEditActiviy forwardEditActiviy = ForwardEditActiviy.this;
                ForwardEditActiviy.B2(forwardEditActiviy, ((BaseActivity) forwardEditActiviy).f66601b);
                ForwardEditActiviy.C2(ForwardEditActiviy.this);
            } else {
                ForwardEditActiviy.this.N = false;
                if (ForwardEditActiviy.this.f79852y2 != null) {
                    ForwardEditActiviy.this.f79852y2.C();
                }
                ((InputMethodManager) ForwardEditActiviy.this.getSystemService("input_method")).toggleSoftInput(0, 2);
            }
        }
    }

    public class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26425, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ForwardEditActiviy forwardEditActiviy = ForwardEditActiviy.this;
            forwardEditActiviy.startActivityForResult(AddHashtagActivity.V1(((BaseActivity) forwardEditActiviy).f66601b), 1);
        }
    }

    public class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26426, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ForwardEditActiviy forwardEditActiviy = ForwardEditActiviy.this;
            forwardEditActiviy.startActivityForResult(AddAtUserActivity.N1(((BaseActivity) forwardEditActiviy).f66601b, com.max.xiaoheihe.utils.i0.j()), 0);
        }
    }

    public class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26427, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (ForwardEditActiviy.this.O) {
                ForwardEditActiviy forwardEditActiviy = ForwardEditActiviy.this;
                ForwardEditActiviy.B2(forwardEditActiviy, ((BaseActivity) forwardEditActiviy).f66601b);
                return;
            }
            if (ForwardEditActiviy.this.N && ForwardEditActiviy.this.f79852y2 != null) {
                ForwardEditActiviy.this.N = false;
                ForwardEditActiviy.this.f79852y2.C();
            }
            ForwardEditActiviy forwardEditActiviy2 = ForwardEditActiviy.this;
            ForwardEditActiviy.T1(forwardEditActiviy2, ((BaseActivity) forwardEditActiviy2).f66601b);
        }
    }

    public class j implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Spannable f79862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f79863c = false;

        j() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, 26430, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            ForwardEditActiviy forwardEditActiviy = ForwardEditActiviy.this;
            forwardEditActiviy.textCountView.setText(String.valueOf((forwardEditActiviy.Q.intValue() - ForwardEditActiviy.this.S) + ForwardEditActiviy.this.T));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            Object[] objArr = {charSequence, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 26428, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported || ForwardEditActiviy.this.P) {
                return;
            }
            this.f79862b = new SpannableString(charSequence);
            Matcher matcher = ForwardEditActiviy.this.M.matcher(charSequence.subSequence(i10, i10 + i11));
            while (matcher.find()) {
                ForwardEditActiviy.Z1(ForwardEditActiviy.this, (matcher.end() - matcher.start()) - 1);
            }
            if (i11 - i12 == 0 || !ForwardEditActiviy.a2(ForwardEditActiviy.this, i10, i11)) {
                ForwardEditActiviy.c2(ForwardEditActiviy.this, i10, i12 - i11);
            } else {
                ForwardEditActiviy.b2(ForwardEditActiviy.this, i10, i11, this.f79862b);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            Object[] objArr = {charSequence, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 26429, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            ForwardEditActiviy.this.f79845c0 = (SpannableStringBuilder) charSequence;
            if (!ForwardEditActiviy.this.P) {
                if (charSequence.toString().trim().equals(this.f79862b.toString().trim())) {
                    return;
                }
                if (ForwardEditActiviy.this.R != -10) {
                    ForwardEditActiviy.this.f79846p1.insert(ForwardEditActiviy.this.R, (CharSequence) charSequence.subSequence(i10, i10 + i12).toString());
                    ForwardEditActiviy forwardEditActiviy = ForwardEditActiviy.this;
                    ForwardEditActiviy.c2(forwardEditActiviy, forwardEditActiviy.R, i12);
                    ForwardEditActiviy.this.P = true;
                    ForwardEditActiviy forwardEditActiviy2 = ForwardEditActiviy.this;
                    forwardEditActiviy2.editContentView.setText(forwardEditActiviy2.f79846p1);
                    ForwardEditActiviy forwardEditActiviy3 = ForwardEditActiviy.this;
                    forwardEditActiviy3.editContentView.setSelection(forwardEditActiviy3.R + i12);
                    ForwardEditActiviy.this.P = false;
                    ForwardEditActiviy.this.R = -10;
                }
                if (i12 == 1) {
                    if (charSequence.charAt(i10) == '@') {
                        ForwardEditActiviy forwardEditActiviy4 = ForwardEditActiviy.this;
                        forwardEditActiviy4.startActivityForResult(AddAtUserActivity.N1(((BaseActivity) forwardEditActiviy4).f66601b, com.max.xiaoheihe.utils.i0.j()), 0);
                    } else if (charSequence.charAt(i10) == '#') {
                        ForwardEditActiviy forwardEditActiviy5 = ForwardEditActiviy.this;
                        forwardEditActiviy5.startActivityForResult(AddHashtagActivity.V1(((BaseActivity) forwardEditActiviy5).f66601b), 1);
                    }
                }
            }
            ForwardEditActiviy forwardEditActiviy6 = ForwardEditActiviy.this;
            forwardEditActiviy6.S = forwardEditActiviy6.f79845c0.length();
        }
    }

    public class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26433, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            ForwardEditActiviy forwardEditActiviy = ForwardEditActiviy.this;
            ForwardEditActiviy.u2(forwardEditActiviy, forwardEditActiviy.f79847p2, "bbs");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26432, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            ForwardEditActiviy.r2(ForwardEditActiviy.this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26431, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (ForwardEditActiviy.this.S - ForwardEditActiviy.this.T > ForwardEditActiviy.this.Q.intValue()) {
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f("最多只能输入" + ForwardEditActiviy.this.Q + "字");
                return;
            }
            com.max.xiaoheihe.utils.a0 a0VarG = com.max.xiaoheihe.utils.a0.g();
            a0VarG.k("forward_img_upload");
            if (ForwardEditActiviy.this.f79847p2.size() > 0) {
                a0VarG.b(new com.max.xiaoheihe.utils.a0.a() { // from class: com.max.xiaoheihe.module.bbs.p
                    @Override // com.max.xiaoheihe.utils.a0.a
                    public final void a() {
                        this.f81432a.c();
                    }
                }, "forward_img_upload");
            }
            a0VarG.b(new com.max.xiaoheihe.utils.a0.a() { // from class: com.max.xiaoheihe.module.bbs.q
                @Override // com.max.xiaoheihe.utils.a0.a
                public final void a() {
                    this.f83176a.d();
                }
            }, "forward_img_upload");
            a0VarG.n("forward_img_upload");
        }
    }

    static /* synthetic */ void B2(ForwardEditActiviy forwardEditActiviy, Activity activity) {
        if (PatchProxy.proxy(new Object[]{forwardEditActiviy, activity}, null, changeQuickRedirect, true, 26406, new Class[]{ForwardEditActiviy.class, Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        forwardEditActiviy.Y2(activity);
    }

    static /* synthetic */ void C2(ForwardEditActiviy forwardEditActiviy) {
        if (PatchProxy.proxy(new Object[]{forwardEditActiviy}, null, changeQuickRedirect, true, 26407, new Class[]{ForwardEditActiviy.class}, Void.TYPE).isSupported) {
            return;
        }
        forwardEditActiviy.s3();
    }

    private void H2(HighlightInfo highlightInfo) {
        if (PatchProxy.proxy(new Object[]{highlightInfo}, this, changeQuickRedirect, false, 26372, new Class[]{HighlightInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        int start = highlightInfo.getStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(highlightInfo.getName());
        spannableStringBuilder.setSpan(com.max.xiaoheihe.accelworld.e.b(this.f66601b, highlightInfo.getName(), this.editContentView.getTextSize()), 0, spannableStringBuilder.length(), 33);
        this.P = true;
        if ("info_at".equals(highlightInfo.getType())) {
            this.T++;
        }
        this.f79845c0.insert(start, (CharSequence) spannableStringBuilder);
        this.editContentView.setSelection(spannableStringBuilder.length() + start);
        p3(start, spannableStringBuilder.length());
        this.f79849x1.put(Integer.valueOf(start), highlightInfo);
        this.P = false;
    }

    private boolean I2(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 26374, new Class[]{cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this.f79849x1.size() != 0) {
            int i12 = i11 + i10;
            return this.f79849x1.ceilingKey(Integer.valueOf(i12)) != null && this.f79849x1.ceilingEntry(Integer.valueOf(i12)).getValue().getEnd() > i10;
        }
        return false;
    }

    private StringBuilder J2(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 26388, new Class[]{String.class}, StringBuilder.class);
        if (patchProxyResultProxy.isSupported) {
            return (StringBuilder) patchProxyResultProxy.result;
        }
        StringBuilder sb2 = new StringBuilder(str);
        for (Integer num : this.f79849x1.keySet()) {
            Integer numValueOf = Integer.valueOf(this.f79849x1.get(num).getEnd());
            if ("info_at".equals(this.f79849x1.get(num).getType())) {
                sb2.replace(num.intValue(), numValueOf.intValue(), O2(this.f79849x1.get(num)));
            } else if ("info_hashtag".equals(this.f79849x1.get(num).getType())) {
                sb2.replace(num.intValue(), numValueOf.intValue(), Q2(this.f79849x1.get(num)));
            } else if ("info_img".equals(this.f79849x1.get(num).getType())) {
                sb2.replace(num.intValue(), numValueOf.intValue(), S2(this.f79849x1.get(num)));
            } else if ("info_link".equals(this.f79849x1.get(num).getType())) {
                sb2.replace(num.intValue(), numValueOf.intValue(), T2(this.f79849x1.get(num)));
            } else if (Y3.equals(this.f79849x1.get(num).getType())) {
                sb2.replace(num.intValue(), numValueOf.intValue(), P2(this.f79849x1.get(num)));
            }
        }
        if (this.f79850x2.size() > 0) {
            Matcher matcher = Pattern.compile("//<a.*?data-user-id=").matcher(sb2);
            int length = sb2.length();
            if (matcher.find()) {
                length = matcher.start();
            }
            com.max.hbcommon.utils.d.b("cqtest", "before Insert : " + ((Object) sb2));
            sb2.insert(length, V2());
            com.max.hbcommon.utils.d.b("cqtest", "after: " + ((Object) sb2));
        }
        return sb2;
    }

    private void K2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26387, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        for (HighlightInfo highlightInfo : this.f79849x1.values()) {
            if ("info_hashtag".equals(highlightInfo.getType())) {
                this.f79851y1.add(highlightInfo.getName().replace("#", ""));
            }
        }
        List<io.reactivex.disposables.b> listH = com.max.xiaoheihe.utils.j.h(this.f66601b, null, null, this.Y, J2(this.f79845c0.toString()), this.f79851y1, this.G2);
        this.cbAlsoComment.isChecked();
        Iterator<io.reactivex.disposables.b> it = listH.iterator();
        while (it.hasNext()) {
            V(it.next());
        }
    }

    private void L2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26397, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList<String> arrayList = this.f79847p2;
        int size = 9;
        if (arrayList != null && arrayList.size() > 0) {
            size = 9 - this.f79847p2.size();
        }
        com.max.mediaselector.e.g(this, size, 124);
    }

    private String O2(HighlightInfo highlightInfo) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{highlightInfo}, this, changeQuickRedirect, false, 26395, new Class[]{HighlightInfo.class}, String.class);
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

    private String P2(HighlightInfo highlightInfo) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{highlightInfo}, this, changeQuickRedirect, false, 26391, new Class[]{HighlightInfo.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "<a data-link-type=\"game\" data-game-id=\"" + highlightInfo.getData() + "\" href=\"https://" + lb.a.f131021p1 + "/open_inapp/#heybox://" + URLEncoder.encode(String.format("{\"protocol_type\":\"openGameDetail\",\"app_id\":\"%s\"}", highlightInfo.getData())) + String.format("\" target=\"_blank\">%s</a>", highlightInfo.getName().substring(1, highlightInfo.getName().length() - 1));
    }

    private String Q2(HighlightInfo highlightInfo) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{highlightInfo}, this, changeQuickRedirect, false, 26394, new Class[]{HighlightInfo.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : String.format("<a href=\"heybox://open_subject\" target=\"_blank\">%s</a>", highlightInfo.getName());
    }

    private String S2(HighlightInfo highlightInfo) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{highlightInfo}, this, changeQuickRedirect, false, 26389, new Class[]{HighlightInfo.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : String.format("<a href=\"heybox://open_image_preview\" data-urls=\"%s\">%s</a>", highlightInfo.getData(), highlightInfo.getName().substring(1));
    }

    static /* synthetic */ void T1(ForwardEditActiviy forwardEditActiviy, Activity activity) {
        if (PatchProxy.proxy(new Object[]{forwardEditActiviy, activity}, null, changeQuickRedirect, true, 26408, new Class[]{ForwardEditActiviy.class, Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        forwardEditActiviy.t3(activity);
    }

    private String T2(HighlightInfo highlightInfo) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{highlightInfo}, this, changeQuickRedirect, false, 26390, new Class[]{HighlightInfo.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : String.format("<a href=\"%s\" data-link-type=\"text\">%s</a>", highlightInfo.getData(), highlightInfo.getName().substring(2));
    }

    private String V2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26392, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.f79850x2.size(); i10++) {
            sb2.append(this.f79850x2.get(i10));
            if (i10 != this.f79850x2.size() - 1) {
                sb2.append(',');
            }
        }
        return this.f79850x2.size() > 1 ? String.format("<a href=\"heybox://open_image_preview\" data-urls=\"%s\">查看图片(%s)</a>", sb2, Integer.valueOf(this.f79850x2.size())) : String.format("<a href=\"heybox://open_image_preview\" data-urls=\"%s\">查看图片</a>", sb2);
    }

    public static Intent W2(Context context, String str, String str2, String str3, ForwardInfo forwardInfo) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, str3, forwardInfo}, null, changeQuickRedirect, true, 26370, new Class[]{Context.class, String.class, String.class, String.class, ForwardInfo.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) ForwardEditActiviy.class);
        intent.putExtra(M3, forwardInfo.getAuthorName());
        intent.putExtra(N3, forwardInfo.getAuthorID());
        intent.putExtra(O3, forwardInfo.getImgUrl());
        intent.putExtra(P3, forwardInfo.getCardText());
        intent.putExtra(Q3, forwardInfo.getIsDeleted());
        intent.putExtra("link_id", str);
        intent.putExtra("link_tag", str2);
        intent.putExtra(R3, str3);
        return intent;
    }

    private void X2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26385, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.U = getIntent().getStringExtra(M3);
        this.V = getIntent().getStringExtra(N3);
        this.W = getIntent().getStringExtra(O3);
        this.X = getIntent().getStringExtra(P3);
        this.Y = getIntent().getStringExtra("link_id");
        this.Z = getIntent().getStringExtra("link_tag");
        this.f79843a0 = getIntent().getStringExtra(R3);
        String stringExtra = getIntent().getStringExtra(Q3);
        this.f79844b0 = stringExtra;
        com.max.xiaoheihe.utils.j.j(this.linkCardView, this.X, this.W, this.U, stringExtra);
    }

    private void Y2(Activity activity) {
        View viewPeekDecorView;
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 26380, new Class[]{Activity.class}, Void.TYPE).isSupported || activity == null || (viewPeekDecorView = activity.getWindow().peekDecorView()) == null || viewPeekDecorView.getWindowToken() == null) {
            return;
        }
        ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(viewPeekDecorView.getWindowToken(), 0);
    }

    static /* synthetic */ int Z1(ForwardEditActiviy forwardEditActiviy, int i10) {
        int i11 = forwardEditActiviy.T - i10;
        forwardEditActiviy.T = i11;
        return i11;
    }

    static /* synthetic */ boolean a2(ForwardEditActiviy forwardEditActiviy, int i10, int i11) {
        Object[] objArr = {forwardEditActiviy, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 26409, new Class[]{ForwardEditActiviy.class, cls, cls}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : forwardEditActiviy.I2(i10, i11);
    }

    private void a3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26379, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.addImgView.setOnClickListener(new e());
        this.addEmojiView.setOnClickListener(new f());
        this.addHashtagView.setOnClickListener(new g());
        this.atView.setOnClickListener(new h());
        this.bottomBarArrow.setOnClickListener(new i());
    }

    static /* synthetic */ void b2(ForwardEditActiviy forwardEditActiviy, int i10, int i11, Spannable spannable) {
        Object[] objArr = {forwardEditActiviy, new Integer(i10), new Integer(i11), spannable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 26410, new Class[]{ForwardEditActiviy.class, cls, cls, Spannable.class}, Void.TYPE).isSupported) {
            return;
        }
        forwardEditActiviy.r3(i10, i11, spannable);
    }

    static /* synthetic */ void c2(ForwardEditActiviy forwardEditActiviy, int i10, int i11) {
        Object[] objArr = {forwardEditActiviy, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 26411, new Class[]{ForwardEditActiviy.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        forwardEditActiviy.p3(i10, i11);
    }

    private void e3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26382, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f79845c0 = (SpannableStringBuilder) this.editContentView.getText();
        this.editContentView.addTextChangedListener(new j());
        n3();
    }

    private void f3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26386, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66616q.setTitle(R.string.forward_timeline);
        this.f66616q.setAction(R.string.send);
        this.f66616q.setActionOnClickListener(new k());
    }

    private void g3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26378, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.rvImgPreview.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f66601b);
        linearLayoutManager.setOrientation(0);
        this.rvImgPreview.setLayoutManager(linearLayoutManager);
        com.max.xiaoheihe.module.bbs.adapter.x xVar = new com.max.xiaoheihe.module.bbs.adapter.x(this.f66601b);
        this.G3 = xVar;
        xVar.s(this);
        this.rvImgPreview.setAdapter(this.G3);
        new ItemTouchHelper(new d(12, 3)).attachToRecyclerView(this.rvImgPreview);
    }

    private void h3(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 26376, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        l3(spannableStringBuilder);
        this.editContentView.getText().insert(this.editContentView.getSelectionEnd(), spannableStringBuilder);
    }

    private void i3(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean k3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26405, new Class[0], Boolean.class);
        if (patchProxyResultProxy.isSupported) {
            return (Boolean) patchProxyResultProxy.result;
        }
        return Boolean.valueOf(this.editContentView.getText() != null ? !com.max.hbcommon.utils.c.u(this.editContentView.getText().toString()) : false);
    }

    private void l3(SpannableStringBuilder spannableStringBuilder) {
        if (PatchProxy.proxy(new Object[]{spannableStringBuilder}, this, changeQuickRedirect, false, 26383, new Class[]{SpannableStringBuilder.class}, Void.TYPE).isSupported) {
            return;
        }
        this.T += new mc.b(this.f66601b, spannableStringBuilder, (int) this.editContentView.getPaint().getTextSize()).a();
    }

    private void n3() {
        int i10;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26384, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.u(this.f79843a0)) {
            this.textCountView.setText(String.valueOf(this.Q));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f79843a0);
        Pattern patternCompile = Pattern.compile("</?p>");
        for (Matcher matcher = patternCompile.matcher(spannableStringBuilder); matcher.find(); matcher = patternCompile.matcher(spannableStringBuilder)) {
            spannableStringBuilder.replace(matcher.start(), matcher.end(), "");
        }
        l3(spannableStringBuilder);
        Matcher matcher2 = Pattern.compile("#(?!#|heybox:)(((?!heybox:|\\[.+?]).)*?)#(?!heybox:)").matcher(spannableStringBuilder);
        while (matcher2.find()) {
            matcher2.group(1);
            HighlightInfo highlightInfo = new HighlightInfo("info_hashtag", matcher2.start(), matcher2.group(0));
            this.f79849x1.put(Integer.valueOf(highlightInfo.getStart()), highlightInfo);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f66601b.getResources().getColor(R.color.click_blue)), highlightInfo.getStart(), highlightInfo.getEnd(), 33);
        }
        Pattern patternCompile2 = Pattern.compile("(<a.?data-user-id=\\\"(.*?)\\\".*?>(@.*?)</a>)");
        Matcher matcher3 = patternCompile2.matcher(spannableStringBuilder);
        while (true) {
            i10 = 2;
            if (!matcher3.find()) {
                break;
            }
            HighlightInfo highlightInfo2 = new HighlightInfo("info_at", matcher3.start(), matcher3.group(3), matcher3.group(2));
            spannableStringBuilder.replace(matcher3.start(), matcher3.end(), "");
            p3(matcher3.start(), matcher3.group(3).length() - matcher3.group(0).length());
            int start = highlightInfo2.getStart();
            this.f79849x1.put(Integer.valueOf(start), highlightInfo2);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(highlightInfo2.getName());
            spannableStringBuilder2.setSpan(com.max.xiaoheihe.accelworld.e.b(this.f66601b, highlightInfo2.getName(), this.editContentView.getTextSize()), 0, spannableStringBuilder2.length(), 33);
            this.T++;
            spannableStringBuilder.insert(start, (CharSequence) spannableStringBuilder2);
            matcher3 = patternCompile2.matcher(spannableStringBuilder);
        }
        Pattern patternCompile3 = Pattern.compile("(<a.*?data-urls=\\\"(.*?)\\\".*?>(.*?)</a>)");
        Matcher matcher4 = patternCompile3.matcher(spannableStringBuilder);
        while (matcher4.find()) {
            HighlightInfo highlightInfo3 = new HighlightInfo("info_img", matcher4.start(), "图" + matcher4.group(3), matcher4.group(i10));
            spannableStringBuilder.replace(matcher4.start(), matcher4.end(), "");
            p3(matcher4.start(), (matcher4.group(3).length() + 1) - matcher4.group(0).length());
            int start2 = highlightInfo3.getStart();
            this.f79849x1.put(Integer.valueOf(start2), highlightInfo3);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(highlightInfo3.getName());
            Drawable drawable = getResources().getDrawable(R.drawable.ic_0icon_format_pic_16);
            drawable.setColorFilter(getResources().getColor(R.color.click_blue), PorterDuff.Mode.SRC_IN);
            drawable.setBounds(0, 0, ViewUtils.f(this.f66601b, 16.0f), ViewUtils.f(this.f66601b, 16.0f));
            spannableStringBuilder3.setSpan(new ForegroundColorSpan(this.f66601b.getResources().getColor(R.color.click_blue)), 1, spannableStringBuilder3.length(), 33);
            spannableStringBuilder3.setSpan(new com.max.hbcustomview.spans.b(drawable, 0), 0, 1, 33);
            this.T += spannableStringBuilder3.length();
            spannableStringBuilder.insert(start2, (CharSequence) spannableStringBuilder3);
            matcher4 = patternCompile3.matcher(spannableStringBuilder);
            i10 = 2;
        }
        Pattern patternCompile4 = Pattern.compile(com.max.xiaoheihe.module.expression.core.a.f83581a);
        Matcher matcher5 = patternCompile4.matcher(spannableStringBuilder);
        while (matcher5.find()) {
            Map<String, String> mapE = AccelWorldStringKt.e(matcher5.group(1));
            if ("text".equals(mapE.get("data-link-type"))) {
                String str = mapE.get("href");
                String str2 = mapE.get("icon-url");
                String strGroup = matcher5.group(2);
                HighlightInfo highlightInfo4 = new HighlightInfo("info_link", matcher5.start(), "图" + strGroup, str);
                spannableStringBuilder.replace(matcher5.start(), matcher5.end(), "");
                p3(matcher5.start(), (strGroup.length() + 1) - matcher5.group(0).length());
                int start3 = highlightInfo4.getStart();
                this.f79849x1.put(Integer.valueOf(start3), highlightInfo4);
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(highlightInfo4.getName());
                spannableStringBuilder4.setSpan(new ForegroundColorSpan(this.f66601b.getResources().getColor(R.color.click_blue)), 1, spannableStringBuilder4.length(), 33);
                int iF = ViewUtils.f(this.f66601b, 3.0f);
                if (com.max.hbcommon.utils.c.u(str2)) {
                    Drawable drawable2 = getResources().getDrawable(R.drawable.common_article);
                    drawable2.setColorFilter(getResources().getColor(R.color.click_blue), PorterDuff.Mode.SRC_IN);
                    drawable2.setBounds(0, 0, ViewUtils.f(this.f66601b, 13.0f), ViewUtils.f(this.f66601b, 13.0f));
                    spannableStringBuilder4.setSpan(new com.max.hbcustomview.spans.b(drawable2, 0, 0, iF), 0, 1, 33);
                } else {
                    int iF2 = ViewUtils.f(this.f66601b, 14.0f);
                    spannableStringBuilder4.setSpan(new AsyncCenterImageSpan(this.f66601b, str2, this.editContentView, iF2, iF2, 0, iF, 0, 0), 0, 1, 33);
                }
                this.T += spannableStringBuilder4.length();
                spannableStringBuilder.insert(start3, (CharSequence) spannableStringBuilder4);
                matcher5 = patternCompile4.matcher(spannableStringBuilder);
            }
        }
        Pattern patternCompile5 = Pattern.compile(mc.d.f131848a);
        for (Matcher matcher6 = patternCompile5.matcher(spannableStringBuilder); matcher6.find(); matcher6 = patternCompile5.matcher(spannableStringBuilder)) {
            String strGroup2 = matcher6.group(4);
            HighlightInfo highlightInfo5 = new HighlightInfo(Y3, matcher6.start(), lb.b.f131099o + strGroup2 + lb.b.f131099o, matcher6.group(2));
            spannableStringBuilder.replace(matcher6.start(), matcher6.end(), "");
            p3(matcher6.start(), (strGroup2.length() + 2) - matcher6.group(0).length());
            int start4 = highlightInfo5.getStart();
            this.f79849x1.put(Integer.valueOf(start4), highlightInfo5);
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(highlightInfo5.getName());
            Drawable drawableMutate = getResources().getDrawable(R.drawable.bbs_game_filled_24x24).getConstantState().newDrawable().mutate();
            drawableMutate.setColorFilter(getResources().getColor(R.color.click_blue), PorterDuff.Mode.SRC_IN);
            drawableMutate.setBounds(0, 0, ViewUtils.f(this.f66601b, 16.0f), ViewUtils.f(this.f66601b, 16.0f));
            spannableStringBuilder5.setSpan(new ForegroundColorSpan(this.f66601b.getResources().getColor(R.color.click_blue)), 1, spannableStringBuilder5.length() - 1, 33);
            spannableStringBuilder5.setSpan(new com.max.hbcustomview.spans.b(drawableMutate, 0, ViewUtils.f(this.f66601b, 4.0f), ViewUtils.f(this.f66601b, 4.0f)), 0, 1, 33);
            Drawable drawableMutate2 = getResources().getDrawable(R.color.transparent).getConstantState().newDrawable().mutate();
            drawableMutate2.setBounds(0, 0, ViewUtils.f(this.f66601b, 4.0f), ViewUtils.f(this.f66601b, 4.0f));
            spannableStringBuilder5.setSpan(new com.max.hbcustomview.spans.b(drawableMutate2, 2), spannableStringBuilder5.length() - 1, spannableStringBuilder5.length(), 33);
            this.T += spannableStringBuilder5.length();
            spannableStringBuilder.insert(start4, (CharSequence) spannableStringBuilder5);
        }
        this.P = true;
        this.editContentView.setText(spannableStringBuilder);
        this.P = false;
        this.S = this.editContentView.getText().length();
        this.textCountView.setText(String.valueOf((this.Q.intValue() - this.S) + this.T));
        this.editContentView.requestFocus();
        this.editContentView.setSelection(0);
    }

    private void p3(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 26375, new Class[]{cls, cls}, Void.TYPE).isSupported || this.f79849x1.size() == 0 || i11 == 0) {
            return;
        }
        ArrayList<HighlightInfo> arrayList = new ArrayList();
        Iterator<Integer> it = this.f79849x1.keySet().iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            if (next.intValue() >= i10) {
                HighlightInfo highlightInfo = this.f79849x1.get(next);
                highlightInfo.setStart(next.intValue() + i11);
                arrayList.add(highlightInfo);
                it.remove();
            }
        }
        for (HighlightInfo highlightInfo2 : arrayList) {
            this.f79849x1.put(Integer.valueOf(highlightInfo2.getStart()), highlightInfo2);
        }
    }

    private void q3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26396, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PermissionManager.f71603a.S(this, new b());
    }

    static /* synthetic */ void r2(ForwardEditActiviy forwardEditActiviy) {
        if (PatchProxy.proxy(new Object[]{forwardEditActiviy}, null, changeQuickRedirect, true, 26412, new Class[]{ForwardEditActiviy.class}, Void.TYPE).isSupported) {
            return;
        }
        forwardEditActiviy.K2();
    }

    private void r3(int i10, int i11, Spannable spannable) {
        Object[] objArr = {new Integer(i10), new Integer(i11), spannable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 26373, new Class[]{cls, cls, Spannable.class}, Void.TYPE).isSupported || this.f79849x1.size() == 0) {
            return;
        }
        this.f79846p1 = new SpannableStringBuilder(spannable);
        Iterator<Integer> it = this.f79849x1.keySet().iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            HighlightInfo highlightInfo = this.f79849x1.get(next);
            int i12 = i10 + i11;
            if (next.intValue() < i12 && highlightInfo.getEnd() >= i10) {
                if ("info_at".equals(highlightInfo.getType())) {
                    this.T--;
                } else if ("info_img".equals(highlightInfo.getType()) || "info_link".equals(highlightInfo.getType()) || Y3.equals(highlightInfo.getType())) {
                    this.T -= highlightInfo.getLength();
                }
                it.remove();
                this.f79846p1.replace(next.intValue(), highlightInfo.getEnd(), (CharSequence) "");
                p3(next.intValue(), -highlightInfo.getLength());
                if (next.intValue() < i10) {
                    i11 -= highlightInfo.getEnd() - i10;
                    i10 = next.intValue();
                } else {
                    i11 = i12 < highlightInfo.getEnd() ? i11 - (i12 - next.intValue()) : i11 - highlightInfo.getLength();
                }
                if (i11 == 0) {
                    break;
                } else {
                    it = this.f79849x1.keySet().iterator();
                }
            }
        }
        if (i11 > 0) {
            this.f79846p1.replace(i10, i10 + i11, (CharSequence) "");
            p3(i10, -i11);
        }
        this.R = i10;
    }

    private void s3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26377, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.N = true;
        this.toolPopUpBox.setVisibility(0);
        com.max.hbexpression.q qVar = this.f79852y2;
        if (qVar != null) {
            qVar.q1();
            return;
        }
        com.max.hbexpression.q qVarA = com.max.hbexpression.e.a(true);
        this.f79852y2 = qVarA;
        qVarA.b2(new yh.a() { // from class: com.max.xiaoheihe.module.bbs.o
            @Override // yh.a
            public final Object invoke() {
                return this.f81429b.k3();
            }
        });
        getSupportFragmentManager().u().y(R.id.fl_toolbar_popup_box, this.f79852y2.P()).m();
    }

    private void t3(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 26381, new Class[]{Activity.class}, Void.TYPE).isSupported || activity == null) {
            return;
        }
        ViewUtils.r0(this.editContentView);
    }

    static /* synthetic */ void u2(ForwardEditActiviy forwardEditActiviy, List list, String str) {
        if (PatchProxy.proxy(new Object[]{forwardEditActiviy, list, str}, null, changeQuickRedirect, true, 26413, new Class[]{ForwardEditActiviy.class, List.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        forwardEditActiviy.u3(list, str);
    }

    private void u3(List<String> list, String str) {
        if (PatchProxy.proxy(new Object[]{list, str}, this, changeQuickRedirect, false, 26393, new Class[]{List.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.G2 = new LoadingDialog(this.f66601b, getString(R.string.commiting), true).r();
        com.max.xiaoheihe.module.upload.g.h(this.f66601b, V0(), list, str, new a());
    }

    static /* synthetic */ void z2(ForwardEditActiviy forwardEditActiviy) {
        if (PatchProxy.proxy(new Object[]{forwardEditActiviy}, null, changeQuickRedirect, true, 26414, new Class[]{ForwardEditActiviy.class}, Void.TYPE).isSupported) {
            return;
        }
        forwardEditActiviy.L2();
    }

    @Override // com.max.hbexpression.q.b
    public void expressionDeleteClick(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26399, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        this.editContentView.onKeyDown(67, new KeyEvent(0, 67));
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.x.a
    public void i0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26402, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        q3();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26371, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_forward_edit);
        f3();
        this.f66620u = ButterKnife.a(this.f66601b);
        X2();
        com.max.hbcustomview.c cVar = new com.max.hbcustomview.c(W0());
        this.f79848p3 = cVar;
        cVar.c(this);
        e3();
        a3();
        g3();
        t3(this.f66601b);
    }

    @Override // com.max.hbshare.b
    public void l0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26404, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setResult(-1);
        finish();
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.x.a
    public void m3(int i10) {
        ArrayList<String> arrayList;
        if (!PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 26403, new Class[]{Integer.TYPE}, Void.TYPE).isSupported && (arrayList = this.f79847p2) != null && arrayList.size() > 0 && i10 < this.f79847p2.size()) {
            this.f79847p2.remove(i10);
            this.G3.notifyItemRemoved(i10);
        }
    }

    @Override // com.max.hbexpression.q.a
    public void o0(ExpressionObj expressionObj) {
        if (PatchProxy.proxy(new Object[]{expressionObj}, this, changeQuickRedirect, false, 26398, new Class[]{ExpressionObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (expressionObj.getType() != 0) {
            h3(expressionObj.getEmoji_key());
            return;
        }
        ArrayList arrayList = new ArrayList();
        LinkImageObj linkImageObj = new LinkImageObj();
        linkImageObj.setUrl(expressionObj.getUrl());
        arrayList.add(linkImageObj);
        i3(com.max.hbutils.utils.k.p(arrayList));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, @androidx.annotation.p0 Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 26401, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 124 && i11 == -1) {
                    ArrayList<LocalMedia> arrayListG = com.max.mediaselector.lib.basic.q.g(intent);
                    if (arrayListG != null && arrayListG.size() > 0) {
                        for (int i12 = 0; i12 < arrayListG.size(); i12++) {
                            this.f79847p2.add(arrayListG.get(i12).G());
                        }
                    }
                    this.G3.r(this.f79847p2);
                }
            } else if (intent != null && i11 == -1) {
                if (this.editContentView.getSelectionEnd() > 0 && this.f79845c0.charAt(this.editContentView.getSelectionEnd() - 1) == '#') {
                    this.editContentView.getText().replace(this.editContentView.getSelectionEnd() - 1, this.editContentView.getSelectionEnd(), "");
                }
                H2(new HighlightInfo("info_hashtag", this.editContentView.getSelectionEnd(), "#" + intent.getStringExtra("hashtag_name") + "#"));
            }
        } else if (intent != null && i11 == -1) {
            if (this.editContentView.getSelectionEnd() > 0 && this.f79845c0.charAt(this.editContentView.getSelectionEnd() - 1) == '@') {
                this.editContentView.getText().replace(this.editContentView.getSelectionEnd() - 1, this.editContentView.getSelectionEnd(), "");
            }
            H2(new HighlightInfo("info_at", this.editContentView.getSelectionEnd(), "@" + intent.getStringExtra("user_name"), intent.getStringExtra("user_id")));
        }
        t3(this.f66601b);
        super.onActivityResult(i10, i11, intent);
    }

    @Override // com.max.hbcustomview.c.a
    public void s(boolean z10, int i10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10)}, this, changeQuickRedirect, false, 26400, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            this.O = true;
            this.bottomBarArrow.setRotation(270.0f);
        } else {
            this.O = false;
            this.bottomBarArrow.setRotation(90.0f);
        }
        com.max.hbexpression.q qVar = this.f79852y2;
        if (qVar == null || !z10) {
            return;
        }
        this.N = false;
        qVar.C();
    }
}
