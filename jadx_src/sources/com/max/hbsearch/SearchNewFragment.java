package com.max.hbsearch;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.activity.OnBackPressedDispatcher;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.google.android.material.timepicker.TimeModel;
import com.google.gson.JsonObject;
import com.max.commentimagepainter.sharecard.ShareCardDrawUtilsKt;
import com.max.hbcommon.base.adapter.RecyclerViewItemWatcher;
import com.max.hbcommon.bean.AdsBannerObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.ListSectionHeader;
import com.max.hbcommon.component.SearchView;
import com.max.hbcustomview.GradientTextView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.hbminiprogram.NativeLittleProgramFragment;
import com.max.hbsearch.bean.HotSearchItemObj;
import com.max.hbsearch.bean.HotSearchObj;
import com.max.hbsearch.bean.SearchFoundObj;
import com.max.hbsearch.bean.SearchHotWelcomeObj;
import com.max.hbsearch.bean.SearchHotwordsObj;
import com.max.hbsearch.bean.SearchSuggestionV2Obj;
import com.max.hbsearch.bean.SearchSuggestionV2Result;
import com.max.hbsearch.bean.WelcomePageList;
import com.max.hbsearch.config.HotHashtagType;
import com.max.hbsearch.config.HotWordTypeV2;
import com.max.hbsearch.config.SearchTabType;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.e1;

/* JADX INFO: compiled from: SearchNewFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@kotlin.jvm.internal.t0({"SMAP\nSearchNewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchNewFragment.kt\ncom/max/hbsearch/SearchNewFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1758:1\n254#2,2:1759\n254#2,2:1761\n254#2,2:1763\n254#2,2:1765\n254#2,2:1767\n254#2,2:1769\n254#2,2:1771\n254#2,2:1773\n254#2,2:1778\n254#2,2:1780\n254#2,2:1782\n766#3:1775\n857#3,2:1776\n*S KotlinDebug\n*F\n+ 1 SearchNewFragment.kt\ncom/max/hbsearch/SearchNewFragment\n*L\n299#1:1759,2\n300#1:1761,2\n301#1:1763,2\n305#1:1765,2\n306#1:1767,2\n307#1:1769,2\n308#1:1771,2\n309#1:1773,2\n1371#1:1778,2\n1372#1:1780,2\n1373#1:1782,2\n1333#1:1775\n1333#1:1776,2\n*E\n"})
@n9.a({com.max.hbminiprogram.d.class})
public final class SearchNewFragment extends NativeLittleProgramFragment implements com.max.hbsearch.m, com.max.hbsearch.n, com.max.hbsearch.e {

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    @dl.d
    public static final a f72177a4 = new a(null);

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    @dl.d
    public static final String f72178b4 = "page_type";

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    @dl.d
    public static final String f72179c4 = "page_extras";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    @dl.d
    public static final String f72180d4 = "only_search";

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    @dl.d
    public static final String f72181e4 = "q";

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    @dl.d
    public static final String f72182f4 = "search_history";

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    @dl.d
    public static final String f72183g4 = "container_config";

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    @dl.d
    public static final String f72184h4 = "topic_id";

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    @dl.d
    public static final String f72185i4 = "quick_from";

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    @dl.d
    public static final String f72186j4 = "user_history";

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    @dl.d
    public static final String f72187k4 = "user_moments";

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    @dl.d
    public static final String f72188l4 = "user_favour_collection";

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    @dl.d
    public static final String f72189m4 = "relevant_search";
    private ListSectionHeader A;
    private RecyclerView B;
    private ViewGroup C;

    @dl.e
    private View D;
    private LinearLayout E;
    private RelativeLayout F;
    private LinearLayout G;
    private EditText G2;
    private ImageView G3;
    private ImageView H;
    private RecyclerView I;
    private CardView J;
    private com.max.hbsearch.k J3;
    private LinearLayout K;
    private View L;

    @dl.e
    private String L3;
    private LinearLayout M;

    @dl.e
    private String M3;
    private HorizontalScrollView N;

    @dl.e
    private PopupWindow N3;
    private ImageView O;

    @dl.e
    private RecyclerView O3;
    private TextView P;
    private TextView Q;

    @dl.e
    private String Q3;
    private ListSectionHeader R;
    private boolean R3;
    private Runnable S;

    @dl.e
    private Fragment S3;

    @dl.e
    private String T;

    @dl.e
    private String T3;

    @dl.e
    private com.max.hbcommon.base.adapter.s<HotSearchItemObj> V;

    @dl.e
    private HotSearchObj W;

    @dl.e
    private HotSearchObj X;
    private boolean X3;

    @dl.e
    private NestedScrollView Y;
    private boolean Y3;

    @dl.e
    private LinearLayout Z;
    private boolean Z3;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @dl.e
    private View f72190a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @dl.e
    private Space f72191b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @dl.e
    private String f72192c0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @dl.e
    private String f72194p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @dl.e
    private ContainerConfig f72195p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private String f72196p3;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ViewGroup f72198r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private LinearLayout f72199s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private View f72200t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private LinearLayout f72201u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private BannerViewPager<AdsBannerObj> f72202v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private LinearLayout f72203w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private ConsecutiveScrollerLayout f72204x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private boolean f72205x1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private View f72207y;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    @dl.e
    private Bundle f72208y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    @dl.e
    private SearchView f72209y2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private View f72210z;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final /* synthetic */ com.max.hbsearch.c f72193p = new com.max.hbsearch.c();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f72197q = 50;

    @dl.d
    private ArrayList<HotSearchItemObj> U = new ArrayList<>();

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @dl.d
    private final kotlin.z f72206x2 = kotlin.b0.c(new yh.a<Boolean>() { // from class: com.max.hbsearch.SearchNewFragment$mUseTitleBarSearch$2
        public static ChangeQuickRedirect changeQuickRedirect;

        {
            super(0);
        }

        @dl.d
        public final Boolean a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33472c5, new Class[0], Boolean.class);
            return patchProxyResultProxy.isSupported ? (Boolean) patchProxyResultProxy.result : Boolean.valueOf(!this.f72242b.d4());
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ Boolean invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33496d5, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    @dl.d
    private final b K3 = new b(this);
    private boolean P3 = true;

    @dl.d
    private final ArrayList<HotSearchItemObj> U3 = new ArrayList<>();

    @dl.d
    private final ArrayList<SearchSuggestionV2Obj> V3 = new ArrayList<>();

    @dl.d
    private final List<WeakReference<io.reactivex.disposables.b>> W3 = new ArrayList();

    /* JADX INFO: compiled from: SearchNewFragment.kt */
    @cj.d
    public static final class ContainerConfig implements Parcelable {

        @dl.d
        public static final Parcelable.Creator<ContainerConfig> CREATOR = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final SearchTabType f72211b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        private final HotWordTypeV2 f72212c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.d
        private final HotHashtagType f72213d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f72214e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f72215f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f72216g;

        /* JADX INFO: compiled from: SearchNewFragment.kt */
        public static final class a implements Parcelable.Creator<ContainerConfig> {
            public static ChangeQuickRedirect changeQuickRedirect;

            @dl.d
            public final ContainerConfig a(@dl.d Parcel parcel) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, bb.c.k.C4, new Class[]{Parcel.class}, ContainerConfig.class);
                if (patchProxyResultProxy.isSupported) {
                    return (ContainerConfig) patchProxyResultProxy.result;
                }
                kotlin.jvm.internal.f0.p(parcel, "parcel");
                return new ContainerConfig(SearchTabType.valueOf(parcel.readString()), HotWordTypeV2.valueOf(parcel.readString()), HotHashtagType.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @dl.d
            public final ContainerConfig[] b(int i10) {
                return new ContainerConfig[i10];
            }

            /* JADX WARN: Type inference failed for: r9v2, types: [com.max.hbsearch.SearchNewFragment$ContainerConfig, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ ContainerConfig createFromParcel(Parcel parcel) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, bb.c.k.E4, new Class[]{Parcel.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [com.max.hbsearch.SearchNewFragment$ContainerConfig[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ ContainerConfig[] newArray(int i10) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.D4, new Class[]{Integer.TYPE}, Object[].class);
                return patchProxyResultProxy.isSupported ? (Object[]) patchProxyResultProxy.result : b(i10);
            }
        }

        public ContainerConfig(@dl.d SearchTabType searchTabType, @dl.d HotWordTypeV2 hotWordType, @dl.d HotHashtagType hotHashtagType, boolean z10, boolean z11, boolean z12) {
            kotlin.jvm.internal.f0.p(searchTabType, "searchTabType");
            kotlin.jvm.internal.f0.p(hotWordType, "hotWordType");
            kotlin.jvm.internal.f0.p(hotHashtagType, "hotHashtagType");
            this.f72211b = searchTabType;
            this.f72212c = hotWordType;
            this.f72213d = hotHashtagType;
            this.f72214e = z10;
            this.f72215f = z11;
            this.f72216g = z12;
        }

        public /* synthetic */ ContainerConfig(SearchTabType searchTabType, HotWordTypeV2 hotWordTypeV2, HotHashtagType hotHashtagType, boolean z10, boolean z11, boolean z12, int i10, kotlin.jvm.internal.u uVar) {
            this(searchTabType, hotWordTypeV2, (i10 & 4) != 0 ? HotHashtagType.GENERAL : hotHashtagType, z10, z11, z12);
        }

        public static /* synthetic */ ContainerConfig k(ContainerConfig containerConfig, SearchTabType searchTabType, HotWordTypeV2 hotWordTypeV2, HotHashtagType hotHashtagType, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
            boolean z13 = z10;
            boolean z14 = z11;
            boolean z15 = z12;
            Object[] objArr = {containerConfig, searchTabType, hotWordTypeV2, hotHashtagType, new Byte(z13 ? (byte) 1 : (byte) 0), new Byte(z14 ? (byte) 1 : (byte) 0), new Byte(z15 ? (byte) 1 : (byte) 0), new Integer(i10), obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.f33970y4, new Class[]{ContainerConfig.class, SearchTabType.class, HotWordTypeV2.class, HotHashtagType.class, cls, cls, cls, Integer.TYPE, Object.class}, ContainerConfig.class);
            if (patchProxyResultProxy.isSupported) {
                return (ContainerConfig) patchProxyResultProxy.result;
            }
            SearchTabType searchTabType2 = (i10 & 1) != 0 ? containerConfig.f72211b : searchTabType;
            HotWordTypeV2 hotWordTypeV3 = (i10 & 2) != 0 ? containerConfig.f72212c : hotWordTypeV2;
            HotHashtagType hotHashtagType2 = (i10 & 4) != 0 ? containerConfig.f72213d : hotHashtagType;
            if ((i10 & 8) != 0) {
                z13 = containerConfig.f72214e;
            }
            if ((i10 & 16) != 0) {
                z14 = containerConfig.f72215f;
            }
            if ((i10 & 32) != 0) {
                z15 = containerConfig.f72216g;
            }
            return containerConfig.j(searchTabType2, hotWordTypeV3, hotHashtagType2, z13, z14, z15);
        }

        @dl.d
        public final SearchTabType a() {
            return this.f72211b;
        }

        @dl.d
        public final HotWordTypeV2 b() {
            return this.f72212c;
        }

        @dl.d
        public final HotHashtagType c() {
            return this.f72213d;
        }

        public final boolean d() {
            return this.f72214e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@dl.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContainerConfig)) {
                return false;
            }
            ContainerConfig containerConfig = (ContainerConfig) obj;
            return this.f72211b == containerConfig.f72211b && this.f72212c == containerConfig.f72212c && this.f72213d == containerConfig.f72213d && this.f72214e == containerConfig.f72214e && this.f72215f == containerConfig.f72215f && this.f72216g == containerConfig.f72216g;
        }

        public final boolean f() {
            return this.f72215f;
        }

        public final boolean h() {
            return this.f72216g;
        }

        public int hashCode() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.A4, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (((((((((this.f72211b.hashCode() * 31) + this.f72212c.hashCode()) * 31) + this.f72213d.hashCode()) * 31) + androidx.compose.foundation.b0.a(this.f72214e)) * 31) + androidx.compose.foundation.b0.a(this.f72215f)) * 31) + androidx.compose.foundation.b0.a(this.f72216g);
        }

        @dl.d
        public final ContainerConfig j(@dl.d SearchTabType searchTabType, @dl.d HotWordTypeV2 hotWordType, @dl.d HotHashtagType hotHashtagType, boolean z10, boolean z11, boolean z12) {
            Object[] objArr = {searchTabType, hotWordType, hotHashtagType, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.k.f33948x4, new Class[]{SearchTabType.class, HotWordTypeV2.class, HotHashtagType.class, cls, cls, cls}, ContainerConfig.class);
            if (patchProxyResultProxy.isSupported) {
                return (ContainerConfig) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(searchTabType, "searchTabType");
            kotlin.jvm.internal.f0.p(hotWordType, "hotWordType");
            kotlin.jvm.internal.f0.p(hotHashtagType, "hotHashtagType");
            return new ContainerConfig(searchTabType, hotWordType, hotHashtagType, z10, z11, z12);
        }

        @dl.d
        public final HotHashtagType l() {
            return this.f72213d;
        }

        @dl.d
        public final HotWordTypeV2 n() {
            return this.f72212c;
        }

        @dl.d
        public final SearchTabType o() {
            return this.f72211b;
        }

        public final boolean p() {
            return this.f72214e;
        }

        public final boolean r() {
            return this.f72215f;
        }

        @dl.d
        public String toString() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33992z4, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            return "ContainerConfig(searchTabType=" + this.f72211b + ", hotWordType=" + this.f72212c + ", hotHashtagType=" + this.f72213d + ", showAdsBanner=" + this.f72214e + ", showHotWordAndHistory=" + this.f72215f + ", useChannelHint=" + this.f72216g + ')';
        }

        public final boolean u() {
            return this.f72216g;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@dl.d Parcel out, int i10) {
            if (PatchProxy.proxy(new Object[]{out, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.B4, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(out, "out");
            out.writeString(this.f72211b.name());
            out.writeString(this.f72212c.name());
            out.writeString(this.f72213d.name());
            out.writeInt(this.f72214e ? 1 : 0);
            out.writeInt(this.f72215f ? 1 : 0);
            out.writeInt(this.f72216g ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: SearchNewFragment.kt */
    public final class SuggestionAdapter extends com.max.hbcommon.base.adapter.s<SearchSuggestionV2Obj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final Context f72217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SearchNewFragment f72218c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SuggestionAdapter(@dl.d SearchNewFragment searchNewFragment, @dl.d Context context, List<SearchSuggestionV2Obj> list) {
            super(context, list, R.layout.hbsearch_item_search_suggestion);
            kotlin.jvm.internal.f0.p(context, "context");
            kotlin.jvm.internal.f0.p(list, "list");
            this.f72218c = searchNewFragment;
            this.f72217b = context;
        }

        public static final /* synthetic */ void p(SuggestionAdapter suggestionAdapter, SearchSuggestionV2Obj searchSuggestionV2Obj) {
            if (PatchProxy.proxy(new Object[]{suggestionAdapter, searchSuggestionV2Obj}, null, changeQuickRedirect, true, bb.c.k.M4, new Class[]{SuggestionAdapter.class, SearchSuggestionV2Obj.class}, Void.TYPE).isSupported) {
                return;
            }
            suggestionAdapter.v(searchSuggestionV2Obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void s(yh.a commonClick, SearchSuggestionV2Obj searchSuggestionV2Obj, SearchNewFragment this$0, View view) {
            if (PatchProxy.proxy(new Object[]{commonClick, searchSuggestionV2Obj, this$0, view}, null, changeQuickRedirect, true, bb.c.k.I4, new Class[]{yh.a.class, SearchSuggestionV2Obj.class, SearchNewFragment.class, View.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(commonClick, "$commonClick");
            kotlin.jvm.internal.f0.p(this$0, "this$0");
            commonClick.invoke();
            String text = searchSuggestionV2Obj.getText();
            if (text != null) {
                this$0.Q3 = this$0.r();
                this$0.s1(new KeyDescObj(text), com.max.hbsearch.l.U);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void t(yh.a commonClick, SearchSuggestionV2Obj searchSuggestionV2Obj, SearchNewFragment this$0, View view) {
            if (PatchProxy.proxy(new Object[]{commonClick, searchSuggestionV2Obj, this$0, view}, null, changeQuickRedirect, true, bb.c.k.J4, new Class[]{yh.a.class, SearchSuggestionV2Obj.class, SearchNewFragment.class, View.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(commonClick, "$commonClick");
            kotlin.jvm.internal.f0.p(this$0, "this$0");
            commonClick.invoke();
            if (com.max.hbcommon.utils.c.u(searchSuggestionV2Obj.getProtocol())) {
                String text = searchSuggestionV2Obj.getText();
                if (text != null) {
                    this$0.Q3 = this$0.r();
                    this$0.s1(new KeyDescObj(text), com.max.hbsearch.l.U);
                    return;
                }
                return;
            }
            pb.p pVarP = ob.a.p();
            Activity activity = ((com.max.hbcommon.base.d) this$0).mContext;
            kotlin.jvm.internal.f0.o(activity, "access$getMContext$p$s1867659560(...)");
            String protocol = searchSuggestionV2Obj.getProtocol();
            kotlin.jvm.internal.f0.m(protocol);
            pVarP.c(activity, protocol);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void u(yh.a commonClick, SearchSuggestionV2Obj searchSuggestionV2Obj, SearchNewFragment this$0, View view) {
            if (PatchProxy.proxy(new Object[]{commonClick, searchSuggestionV2Obj, this$0, view}, null, changeQuickRedirect, true, bb.c.k.K4, new Class[]{yh.a.class, SearchSuggestionV2Obj.class, SearchNewFragment.class, View.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(commonClick, "$commonClick");
            kotlin.jvm.internal.f0.p(this$0, "this$0");
            commonClick.invoke();
            if (com.max.hbcommon.utils.c.u(searchSuggestionV2Obj.getProtocol())) {
                String text = searchSuggestionV2Obj.getText();
                if (text != null) {
                    this$0.Q3 = this$0.r();
                    this$0.s1(new KeyDescObj(text), com.max.hbsearch.l.U);
                    return;
                }
                return;
            }
            EditText editText = this$0.G2;
            if (editText == null) {
                kotlin.jvm.internal.f0.S("mSearchEditText");
                editText = null;
            }
            editText.setText((CharSequence) null);
            pb.p pVarP = ob.a.p();
            Activity activity = ((com.max.hbcommon.base.d) this$0).mContext;
            kotlin.jvm.internal.f0.o(activity, "access$getMContext$p$s1867659560(...)");
            String protocol = searchSuggestionV2Obj.getProtocol();
            kotlin.jvm.internal.f0.m(protocol);
            pVarP.c(activity, protocol);
            this$0.v1(searchSuggestionV2Obj.getText(), searchSuggestionV2Obj.getProtocol(), searchSuggestionV2Obj.getCard_img());
        }

        private final void v(SearchSuggestionV2Obj searchSuggestionV2Obj) {
            if (PatchProxy.proxy(new Object[]{searchSuggestionV2Obj}, this, changeQuickRedirect, false, bb.c.k.G4, new Class[]{SearchSuggestionV2Obj.class}, Void.TYPE).isSupported) {
                return;
            }
            JsonObject report_extra = searchSuggestionV2Obj.getReport_extra();
            com.max.hbcommon.analytics.d.d("4", lb.d.D, null, report_extra != null ? report_extra.deepCopy() : null);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, SearchSuggestionV2Obj searchSuggestionV2Obj) {
            if (PatchProxy.proxy(new Object[]{eVar, searchSuggestionV2Obj}, this, changeQuickRedirect, false, bb.c.k.L4, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            r(eVar, searchSuggestionV2Obj);
        }

        @dl.d
        public final Context q() {
            return this.f72217b;
        }

        public void r(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e final SearchSuggestionV2Obj searchSuggestionV2Obj) {
            SpannableStringBuilder spannableStringBuilder;
            if (PatchProxy.proxy(new Object[]{eVar, searchSuggestionV2Obj}, this, changeQuickRedirect, false, bb.c.k.H4, new Class[]{com.max.hbcommon.base.adapter.s.e.class, SearchSuggestionV2Obj.class}, Void.TYPE).isSupported || eVar == null) {
                return;
            }
            final SearchNewFragment searchNewFragment = this.f72218c;
            if (searchSuggestionV2Obj != null) {
                eVar.itemView.setTag(searchSuggestionV2Obj);
                View viewB = eVar.b();
                View viewFindViewById = viewB.findViewById(R.id.tv_title);
                kotlin.jvm.internal.f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) viewFindViewById;
                ViewGroup viewGroup = (ViewGroup) viewB.findViewById(R.id.vg_tool);
                TextView textView2 = (TextView) viewB.findViewById(R.id.tv_tool_name);
                ImageView imageView = (ImageView) viewB.findViewById(R.id.iv_search_icon);
                TextView textView3 = (TextView) viewB.findViewById(R.id.tv_desc);
                ImageView imageView2 = (ImageView) viewB.findViewById(R.id.iv_card_img);
                String strR = searchNewFragment.r();
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(searchSuggestionV2Obj.getText());
                if (com.max.hbcommon.utils.c.u(searchSuggestionV2Obj.getText()) || com.max.hbcommon.utils.c.u(strR)) {
                    spannableStringBuilder = spannableStringBuilder2;
                } else {
                    String text = searchSuggestionV2Obj.getText();
                    kotlin.jvm.internal.f0.m(text);
                    spannableStringBuilder = spannableStringBuilder2;
                    int iS3 = StringsKt__StringsKt.s3(text, strR, 0, true, 2, null);
                    if (iS3 >= 0) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f72217b.getResources().getColor(R.color.text_primary_1_color)), iS3, strR.length() + iS3, 33);
                    }
                }
                textView.setText(spannableStringBuilder);
                final yh.a<b2> aVar = new yh.a<b2>() { // from class: com.max.hbsearch.SearchNewFragment$SuggestionAdapter$onBindViewHolder$1$1$commonClick$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.O4, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.N4, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        EditText editText = searchNewFragment.G2;
                        if (editText == null) {
                            kotlin.jvm.internal.f0.S("mSearchEditText");
                            editText = null;
                        }
                        editText.clearFocus();
                        SearchNewFragment.SuggestionAdapter.p(this, searchSuggestionV2Obj);
                    }
                };
                String type = searchSuggestionV2Obj.getType();
                if (type != null) {
                    int iHashCode = type.hashCode();
                    if (iHashCode != -989163880) {
                        if (iHashCode != 3046160) {
                            if (iHashCode == 3556653 && type.equals("text")) {
                                viewB.getLayoutParams().height = ViewUtils.f(((com.max.hbcommon.base.d) searchNewFragment).mContext, 44.0f);
                                viewGroup.setVisibility(8);
                                viewB.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbsearch.l0
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        SearchNewFragment.SuggestionAdapter.s(aVar, searchSuggestionV2Obj, searchNewFragment, view);
                                    }
                                });
                            }
                        } else if (type.equals(sd.b.f139392j)) {
                            viewB.getLayoutParams().height = ViewUtils.f(((com.max.hbcommon.base.d) searchNewFragment).mContext, 62.0f);
                            viewGroup.setVisibility(0);
                            imageView2.setVisibility(0);
                            textView3.setVisibility(0);
                            textView2.setVisibility(8);
                            textView.setText(searchSuggestionV2Obj.getText());
                            textView.setTextColor(((com.max.hbcommon.base.d) searchNewFragment).mContext.getResources().getColor(R.color.text_primary_1_color));
                            textView3.setText(searchSuggestionV2Obj.getDesc());
                            com.max.hbimage.b.d0(searchSuggestionV2Obj.getCard_img(), imageView2, ViewUtils.f(((com.max.hbcommon.base.d) searchNewFragment).mContext, 2.0f));
                            viewB.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbsearch.n0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    SearchNewFragment.SuggestionAdapter.u(aVar, searchSuggestionV2Obj, searchNewFragment, view);
                                }
                            });
                        }
                    } else if (type.equals(SwitchDetailActivity.P)) {
                        viewB.getLayoutParams().height = ViewUtils.f(((com.max.hbcommon.base.d) searchNewFragment).mContext, 44.0f);
                        viewGroup.setVisibility(0);
                        imageView2.setVisibility(8);
                        textView2.setVisibility(0);
                        textView2.setText(searchSuggestionV2Obj.getTarget());
                        viewB.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbsearch.m0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                SearchNewFragment.SuggestionAdapter.t(aVar, searchSuggestionV2Obj, searchNewFragment, view);
                            }
                        });
                    }
                }
                if (com.max.hbcommon.utils.c.u(searchSuggestionV2Obj.getImg())) {
                    imageView.setImageResource(R.drawable.common_search);
                    imageView.setColorFilter(((com.max.hbcommon.base.d) searchNewFragment).mContext.getResources().getColor(R.color.text_secondary_2_color));
                } else {
                    com.max.hbimage.b.K(searchSuggestionV2Obj.getImg(), imageView);
                    imageView.clearColorFilter();
                }
            }
        }
    }

    /* JADX INFO: compiled from: SearchNewFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public static /* synthetic */ SearchNewFragment d(a aVar, String str, Bundle bundle, boolean z10, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, str, bundle, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.k.f33926w4, new Class[]{a.class, String.class, Bundle.class, Boolean.TYPE, Integer.TYPE, Object.class}, SearchNewFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (SearchNewFragment) patchProxyResultProxy.result;
            }
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            return aVar.c(str, bundle, z10);
        }

        @dl.d
        public final SearchNewFragment a(@dl.e Bundle bundle) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.k.f33860t4, new Class[]{Bundle.class}, SearchNewFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (SearchNewFragment) patchProxyResultProxy.result;
            }
            String string = bundle != null ? bundle.getString("q") : null;
            com.max.hbcommon.utils.d.a("SearchNewFragment, newInstance, bundle: " + bundle);
            return b(string, bundle);
        }

        @dl.d
        public final SearchNewFragment b(@dl.e String str, @dl.e Bundle bundle) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, bundle}, this, changeQuickRedirect, false, bb.c.k.f33882u4, new Class[]{String.class, Bundle.class}, SearchNewFragment.class);
            return patchProxyResultProxy.isSupported ? (SearchNewFragment) patchProxyResultProxy.result : c(str, bundle, false);
        }

        @dl.d
        public final SearchNewFragment c(@dl.e String str, @dl.e Bundle bundle, boolean z10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, bundle, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.k.f33904v4, new Class[]{String.class, Bundle.class, Boolean.TYPE}, SearchNewFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (SearchNewFragment) patchProxyResultProxy.result;
            }
            SearchNewFragment searchNewFragment = new SearchNewFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putString("q", str);
            bundle2.putBundle(SearchNewFragment.f72179c4, bundle);
            searchNewFragment.setArguments(bundle2);
            return searchNewFragment;
        }
    }

    /* JADX INFO: compiled from: SearchNewFragment.kt */
    public static final class b extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final WeakReference<SearchNewFragment> f72222a;

        public b(@dl.d SearchNewFragment fragment) {
            kotlin.jvm.internal.f0.p(fragment, "fragment");
            this.f72222a = new WeakReference<>(fragment);
        }

        @Override // android.os.Handler
        public void handleMessage(@dl.d Message msg) {
            if (PatchProxy.proxy(new Object[]{msg}, this, changeQuickRedirect, false, bb.c.k.F4, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(msg, "msg");
            super.handleMessage(msg);
            SearchNewFragment searchNewFragment = this.f72222a.get();
            if (searchNewFragment != null) {
                Object obj = msg.obj;
                kotlin.jvm.internal.f0.n(obj, "null cannot be cast to non-null type kotlin.String");
                searchNewFragment.f6((String) obj);
            }
        }
    }

    /* JADX INFO: compiled from: SearchNewFragment.kt */
    public interface c {
        void e1(@dl.e String str);
    }

    /* JADX INFO: compiled from: SearchNewFragment.kt */
    public static final class d extends com.max.hbcommon.network.d<List<? extends KeyDescObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f72223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f72224c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f72225d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ SearchNewFragment f72226e;

        d(String str, String str2, String str3, SearchNewFragment searchNewFragment) {
            this.f72223b = str;
            this.f72224c = str2;
            this.f72225d = str3;
            this.f72226e = searchNewFragment;
        }

        public void a(@dl.d List<? extends KeyDescObj> t10) {
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, bb.c.k.Q4, new Class[]{List.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(t10, "t");
            List listT5 = CollectionsKt___CollectionsKt.T5(t10);
            super.onNext(listT5);
            Iterator it = listT5.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.f0.g(this.f72223b, ((KeyDescObj) it.next()).getValue())) {
                    it.remove();
                }
            }
            KeyDescObj keyDescObj = new KeyDescObj();
            keyDescObj.setKey(System.currentTimeMillis() + "");
            keyDescObj.setValue(this.f72223b);
            keyDescObj.setProtocol(this.f72224c);
            keyDescObj.setIcon(this.f72225d);
            listT5.add(0, keyDescObj);
            String str = this.f72226e.f72196p3;
            if (str == null) {
                kotlin.jvm.internal.f0.S("mSearchCacheKey");
                str = null;
            }
            com.max.hbcache.b.j("search_history", str, listT5);
            if (this.f72226e.isActive() && com.max.hbcommon.utils.c.u(this.f72224c)) {
                SearchNewFragment.E6(this.f72226e, listT5, false, 2, null);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.k.P4, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            super.onError(e10);
            com.max.heybox.hblog.g.f74531b.v("SEARCH_HISTORY_DIR addSearchHistory q: " + this.f72223b + "  proto: " + this.f72224c + "  icon_url: " + this.f72225d + "  error: " + e10.getMessage());
            ArrayList arrayList = new ArrayList();
            KeyDescObj keyDescObj = new KeyDescObj();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(System.currentTimeMillis());
            sb2.append("");
            keyDescObj.setKey(sb2.toString());
            keyDescObj.setValue(this.f72223b);
            keyDescObj.setProtocol(this.f72224c);
            keyDescObj.setIcon(this.f72225d);
            arrayList.add(keyDescObj);
            String str = this.f72226e.f72196p3;
            if (str == null) {
                kotlin.jvm.internal.f0.S("mSearchCacheKey");
                str = null;
            }
            com.max.hbcache.b.j("search_history", str, arrayList);
            if (this.f72226e.isActive()) {
                SearchNewFragment.E6(this.f72226e, arrayList, false, 2, null);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.R4, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((List) obj);
        }
    }

    /* JADX INFO: compiled from: SearchNewFragment.kt */
    public static final class e extends com.max.hbcommon.network.d<List<? extends KeyDescObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        public void a(@dl.d List<? extends KeyDescObj> list) {
            if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.k.T4, new Class[]{List.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(list, "list");
            if (SearchNewFragment.this.isActive()) {
                super.onNext(list);
                Iterator it = CollectionsKt___CollectionsKt.T5(list).iterator();
                boolean z10 = false;
                while (it.hasNext()) {
                    if (System.currentTimeMillis() - com.max.hbutils.utils.n.r(((KeyDescObj) it.next()).getKey()) > 604800000) {
                        it.remove();
                        z10 = true;
                    }
                }
                if (z10) {
                    String str = SearchNewFragment.this.f72196p3;
                    if (str == null) {
                        kotlin.jvm.internal.f0.S("mSearchCacheKey");
                        str = null;
                    }
                    com.max.hbcache.b.j("search_history", str, list);
                }
                SearchNewFragment.E6(SearchNewFragment.this, list, false, 2, null);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.k.S4, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            super.onError(e10);
            com.max.heybox.hblog.g.f74531b.v("SEARCH_HISTORY_DIR getSearchHistory  error: " + e10.getMessage());
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.U4, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((List) obj);
        }
    }

    /* JADX INFO: compiled from: SearchNewFragment.kt */
    public static final class f extends com.max.hbcommon.network.d<Result<SearchSuggestionV2Result>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f72228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SearchNewFragment f72229c;

        f(String str, SearchNewFragment searchNewFragment) {
            this.f72228b = str;
            this.f72229c = searchNewFragment;
        }

        public void onNext(@dl.d Result<SearchSuggestionV2Result> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.k.V4, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (kotlin.jvm.internal.f0.g(this.f72228b, this.f72229c.r()) && !kotlin.jvm.internal.f0.g(this.f72228b, this.f72229c.M3) && this.f72229c.isActive()) {
                super.onNext(result);
                if (result.getResult() != null) {
                    SearchNewFragment searchNewFragment = this.f72229c;
                    SearchSuggestionV2Result result2 = result.getResult();
                    kotlin.jvm.internal.f0.m(result2);
                    SearchNewFragment.B5(searchNewFragment, result2.getSuggestions());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.W4, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SearchSuggestionV2Result>) obj);
        }
    }

    /* JADX INFO: compiled from: SearchNewFragment.kt */
    public static final class g implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.X4, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            SearchNewFragment.B6(SearchNewFragment.this, false, null, 3, null);
        }
    }

    /* JADX INFO: compiled from: SearchNewFragment.kt */
    @kotlin.jvm.internal.t0({"SMAP\nSearchNewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchNewFragment.kt\ncom/max/hbsearch/SearchNewFragment$initEditView$4\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1758:1\n185#2,3:1759\n*S KotlinDebug\n*F\n+ 1 SearchNewFragment.kt\ncom/max/hbsearch/SearchNewFragment$initEditView$4\n*L\n454#1:1759,3\n*E\n"})
    public static final class h implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: View.kt */
        @kotlin.jvm.internal.t0({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$postDelayed$runnable$1\n+ 2 SearchNewFragment.kt\ncom/max/hbsearch/SearchNewFragment$initEditView$4\n*L\n1#1,411:1\n455#2,2:412\n*E\n"})
        public static final class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ SearchNewFragment f72232b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Editable f72233c;

            public a(SearchNewFragment searchNewFragment, Editable editable) {
                this.f72232b = searchNewFragment;
                this.f72233c = editable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33449b5, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbsearch.k kVar = this.f72232b.J3;
                if (kVar == null) {
                    kotlin.jvm.internal.f0.S("mSearchFragment");
                    kVar = null;
                }
                kVar.n4(this.f72233c.toString());
            }
        }

        h() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@dl.d Editable s10) {
            if (PatchProxy.proxy(new Object[]{s10}, this, changeQuickRedirect, false, bb.c.k.f33426a5, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(s10, "s");
            com.max.hbsearch.k kVar = SearchNewFragment.this.J3;
            ImageView imageView = null;
            if (kVar == null) {
                kotlin.jvm.internal.f0.S("mSearchFragment");
                kVar = null;
            }
            if (kVar.isAdded()) {
                com.max.hbsearch.k kVar2 = SearchNewFragment.this.J3;
                if (kVar2 == null) {
                    kotlin.jvm.internal.f0.S("mSearchFragment");
                    kVar2 = null;
                }
                kVar2.n4(s10.toString());
            } else {
                EditText editText = SearchNewFragment.this.G2;
                if (editText == null) {
                    kotlin.jvm.internal.f0.S("mSearchEditText");
                    editText = null;
                }
                editText.postDelayed(new a(SearchNewFragment.this, s10), 100L);
            }
            String string = s10.toString();
            if (com.max.hbcommon.utils.c.u(string)) {
                SearchNewFragment.K5(SearchNewFragment.this, string, null, 2, null);
                SearchNewFragment.t5(SearchNewFragment.this);
            } else if (kotlin.jvm.internal.f0.g(string, SearchNewFragment.this.L3)) {
                SearchNewFragment.this.L3 = null;
            } else if (SearchNewFragment.this.P3) {
                SearchNewFragment.r5(SearchNewFragment.this, string);
            }
            if (s10.length() > 0) {
                ImageView imageView2 = SearchNewFragment.this.G3;
                if (imageView2 == null) {
                    kotlin.jvm.internal.f0.S("mSearchIvDel");
                } else {
                    imageView = imageView2;
                }
                imageView.setVisibility(0);
            } else {
                ImageView imageView3 = SearchNewFragment.this.G3;
                if (imageView3 == null) {
                    kotlin.jvm.internal.f0.S("mSearchIvDel");
                } else {
                    imageView = imageView3;
                }
                imageView.setVisibility(8);
            }
            SearchNewFragment.b5(SearchNewFragment.this, false);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@dl.d CharSequence s10, int i10, int i11, int i12) {
            Object[] objArr = {s10, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.k.Y4, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(s10, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@dl.d CharSequence s10, int i10, int i11, int i12) {
            Object[] objArr = {s10, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.k.Z4, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(s10, "s");
        }
    }

    /* JADX INFO: compiled from: SearchNewFragment.kt */
    public static final class i extends androidx.activity.o {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
            super(true);
        }

        @Override // androidx.activity.o
        public void handleOnBackPressed() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33519e5, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            if (SearchNewFragment.this.X3) {
                SearchNewFragment.this.requireActivity().finish();
                return;
            }
            PopupWindow popupWindow = SearchNewFragment.this.N3;
            FragmentActivity activity = SearchNewFragment.this.getActivity();
            if (popupWindow != null && popupWindow.isShowing() && activity != null && !activity.isFinishing()) {
                PopupWindow popupWindow2 = SearchNewFragment.this.N3;
                if (popupWindow2 != null) {
                    popupWindow2.dismiss();
                    return;
                }
                return;
            }
            EditText editText = SearchNewFragment.this.G2;
            EditText editText2 = null;
            if (editText == null) {
                kotlin.jvm.internal.f0.S("mSearchEditText");
                editText = null;
            }
            Editable text = editText.getText();
            kotlin.jvm.internal.f0.o(text, "getText(...)");
            if (!(text.length() > 0)) {
                setEnabled(false);
                SearchNewFragment.this.requireActivity().getOnBackPressedDispatcher().f();
                return;
            }
            EditText editText3 = SearchNewFragment.this.G2;
            if (editText3 == null) {
                kotlin.jvm.internal.f0.S("mSearchEditText");
            } else {
                editText2 = editText3;
            }
            editText2.setText("");
        }
    }

    /* JADX INFO: compiled from: SearchNewFragment.kt */
    public static final class j extends com.max.hbcommon.network.d<Result<SearchHotWelcomeObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(SearchNewFragment this$0) {
            if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, bb.c.k.f33588h5, new Class[]{SearchNewFragment.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(this$0, "this$0");
            if (this$0.S == null) {
                kotlin.jvm.internal.f0.S("horWordRunnable");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(SearchNewFragment this$0) {
            if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, bb.c.k.f33611i5, new Class[]{SearchNewFragment.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(this$0, "this$0");
            if (this$0.S == null) {
                kotlin.jvm.internal.f0.S("horWordRunnable");
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.k.f33542f5, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            com.max.hbcommon.network.a.a(e10, true);
            if (SearchNewFragment.this.isActive()) {
                b bVar = SearchNewFragment.this.K3;
                final SearchNewFragment searchNewFragment = SearchNewFragment.this;
                bVar.removeCallbacks(new Runnable() { // from class: com.max.hbsearch.o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SearchNewFragment.j.c(searchNewFragment);
                    }
                });
                SearchNewFragment.B6(SearchNewFragment.this, false, null, 3, null);
            }
        }

        public void onNext(@dl.d Result<SearchHotWelcomeObj> result) {
            String default_q;
            List<AdsBannerObj> ads_banner;
            List<? extends AdsBannerObj> listN2;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.k.f33565g5, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            SearchHotWelcomeObj result2 = result.getResult();
            if (result2 == null || (default_q = result2.getDefault_q()) == null) {
                default_q = "";
            }
            com.max.hbcache.c.z(com.max.hbcache.c.N, default_q);
            if (SearchNewFragment.this.isActive()) {
                b bVar = SearchNewFragment.this.K3;
                final SearchNewFragment searchNewFragment = SearchNewFragment.this;
                bVar.removeCallbacks(new Runnable() { // from class: com.max.hbsearch.p0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SearchNewFragment.j.d(searchNewFragment);
                    }
                });
                SearchHotWelcomeObj result3 = result.getResult();
                if (result3 != null && (ads_banner = result3.getAds_banner()) != null && (listN2 = CollectionsKt___CollectionsKt.n2(ads_banner)) != null) {
                    com.max.hbsearch.o.f72357a.m(listN2);
                    Log.d("SearchNewFragment-dbg", "[refreshNewHotSearchWelcomePage] ads_banner: " + listN2);
                }
                SearchNewFragment searchNewFragment2 = SearchNewFragment.this;
                SearchHotWelcomeObj result4 = result.getResult();
                SearchNewFragment.B6(searchNewFragment2, false, result4 != null ? result4.getDefault_q() : null, 1, null);
                SearchNewFragment searchNewFragment3 = SearchNewFragment.this;
                SearchHotWelcomeObj result5 = result.getResult();
                searchNewFragment3.w1(result5 != null ? result5.getLists() : null);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.f33634j5, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SearchHotWelcomeObj>) obj);
        }
    }

    /* JADX INFO: compiled from: SearchNewFragment.kt */
    public static final class k extends com.max.hbcommon.network.d<Result<SearchHotwordsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<HotWordTypeV2> f72237c;

        k(Ref.ObjectRef<HotWordTypeV2> objectRef) {
            this.f72237c = objectRef;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(SearchNewFragment this$0) {
            if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, bb.c.k.f33703m5, new Class[]{SearchNewFragment.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(this$0, "this$0");
            if (this$0.S == null) {
                kotlin.jvm.internal.f0.S("horWordRunnable");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(SearchNewFragment this$0) {
            if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, bb.c.k.f33726n5, new Class[]{SearchNewFragment.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(this$0, "this$0");
            if (this$0.S == null) {
                kotlin.jvm.internal.f0.S("horWordRunnable");
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.k.f33657k5, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (SearchNewFragment.this.isActive()) {
                b bVar = SearchNewFragment.this.K3;
                final SearchNewFragment searchNewFragment = SearchNewFragment.this;
                bVar.removeCallbacks(new Runnable() { // from class: com.max.hbsearch.q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SearchNewFragment.k.c(searchNewFragment);
                    }
                });
                SearchNewFragment.B6(SearchNewFragment.this, false, null, 3, null);
            }
        }

        public void onNext(@dl.d Result<SearchHotwordsObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.k.f33680l5, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            com.max.hbcache.c.z(com.max.hbcache.c.M, com.max.hbutils.utils.k.p(result.getResult()));
            if (SearchNewFragment.this.isActive()) {
                HotWordTypeV2 hotWordTypeV2 = this.f72237c.f124891b;
                if (hotWordTypeV2 == HotWordTypeV2.CHANNEL_CONTENT || hotWordTypeV2 == HotWordTypeV2.MALL) {
                    SearchNewFragment searchNewFragment = SearchNewFragment.this;
                    SearchHotwordsObj result2 = result.getResult();
                    searchNewFragment.W = result2 != null ? result2.getHot_search() : null;
                    SearchNewFragment searchNewFragment2 = SearchNewFragment.this;
                    SearchHotwordsObj result3 = result.getResult();
                    searchNewFragment2.X = result3 != null ? result3.getHot_discussion() : null;
                } else {
                    com.max.hbsearch.o oVar = com.max.hbsearch.o.f72357a;
                    com.max.hbsearch.o.f72358b = result.getResult();
                }
                b bVar = SearchNewFragment.this.K3;
                final SearchNewFragment searchNewFragment3 = SearchNewFragment.this;
                bVar.removeCallbacks(new Runnable() { // from class: com.max.hbsearch.r0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SearchNewFragment.k.d(searchNewFragment3);
                    }
                });
                SearchNewFragment.B6(SearchNewFragment.this, false, null, 3, null);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.f33749o5, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SearchHotwordsObj>) obj);
        }
    }

    /* JADX INFO: compiled from: SearchNewFragment.kt */
    public static final class l extends com.max.hbcommon.network.d<Result<SearchFoundObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f72239c;

        l(boolean z10) {
            this.f72239c = z10;
        }

        public void onNext(@dl.d Result<SearchFoundObj> result) {
            List<HotSearchItemObj> list;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.k.f33772p5, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (SearchNewFragment.this.isActive()) {
                if (this.f72239c) {
                    SearchNewFragment.this.U3.clear();
                }
                com.max.hbsearch.o oVar = com.max.hbsearch.o.f72357a;
                SearchFoundObj result2 = result.getResult();
                oVar.l(result2 != null ? result2.getSearch_found() : null);
                HotSearchObj hotSearchObjC = oVar.c();
                if (hotSearchObjC == null || (list = hotSearchObjC.getList()) == null) {
                    return;
                }
                SearchNewFragment searchNewFragment = SearchNewFragment.this;
                searchNewFragment.U.clear();
                searchNewFragment.U.addAll(list);
                SearchNewFragment.A5(searchNewFragment);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.f33795q5, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SearchFoundObj>) obj);
        }
    }

    /* JADX INFO: compiled from: SearchNewFragment.kt */
    @kotlin.jvm.internal.t0({"SMAP\nSearchNewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchNewFragment.kt\ncom/max/hbsearch/SearchNewFragment$removeSearchHistory$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1758:1\n766#2:1759\n857#2,2:1760\n*S KotlinDebug\n*F\n+ 1 SearchNewFragment.kt\ncom/max/hbsearch/SearchNewFragment$removeSearchHistory$1\n*L\n1483#1:1759\n1483#1:1760,2\n*E\n"})
    public static final class m extends com.max.hbcommon.network.d<List<? extends KeyDescObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ KeyDescObj f72240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SearchNewFragment f72241c;

        m(KeyDescObj keyDescObj, SearchNewFragment searchNewFragment) {
            this.f72240b = keyDescObj;
            this.f72241c = searchNewFragment;
        }

        public void a(@dl.d List<? extends KeyDescObj> t10) {
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, bb.c.k.f33839s5, new Class[]{List.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(t10, "t");
            KeyDescObj keyDescObj = this.f72240b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : t10) {
                if (!kotlin.jvm.internal.f0.g(((KeyDescObj) obj).getValue(), keyDescObj.getValue())) {
                    arrayList.add(obj);
                }
            }
            String str = this.f72241c.f72196p3;
            if (str == null) {
                kotlin.jvm.internal.f0.S("mSearchCacheKey");
                str = null;
            }
            com.max.hbcache.b.j("search_history", str, arrayList);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.k.f33817r5, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            super.onError(e10);
            com.max.heybox.hblog.g.f74531b.v("SEARCH_HISTORY_DIR [removeSearchHistory] failed, historyKeyDescObj: " + this.f72240b + "\nerror: " + kotlin.o.i(e10));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("移除搜索历史失败\n");
            sb2.append(kotlin.o.i(e10));
            com.max.hbutils.utils.x.p(sb2.toString());
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.f33861t5, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((List) obj);
        }
    }

    /* JADX INFO: compiled from: SearchNewFragment.kt */
    public static final class n extends com.max.hbcommon.base.adapter.s<HotSearchItemObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HotSearchObj f72243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SearchNewFragment f72244c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(HotSearchObj hotSearchObj, SearchNewFragment searchNewFragment, Activity activity, ArrayList<HotSearchItemObj> arrayList, int i10) {
            super(activity, arrayList, i10);
            this.f72243b = hotSearchObj;
            this.f72244c = searchNewFragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void o(HotSearchItemObj hotSearchItemObj, SearchNewFragment this$0, HotSearchObj hotSearchObj, View view) {
            if (PatchProxy.proxy(new Object[]{hotSearchItemObj, this$0, hotSearchObj, view}, null, changeQuickRedirect, true, bb.c.k.f33905v5, new Class[]{HotSearchItemObj.class, SearchNewFragment.class, HotSearchObj.class, View.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(this$0, "this$0");
            String proto = hotSearchItemObj.getProto();
            if (proto == null || proto.length() == 0) {
                this$0.s1(new KeyDescObj(hotSearchItemObj.getName(), hotSearchItemObj.getProto(), hotSearchItemObj.getIcon_url()), com.max.hbsearch.l.T);
            } else {
                pb.p pVarP = ob.a.p();
                Activity activity = ((com.max.hbcommon.base.d) this$0).mContext;
                kotlin.jvm.internal.f0.o(activity, "access$getMContext$p$s1867659560(...)");
                String proto2 = hotSearchItemObj.getProto();
                kotlin.jvm.internal.f0.m(proto2);
                pVarP.c(activity, proto2);
                this$0.v1(hotSearchItemObj.getName(), hotSearchItemObj.getProto(), hotSearchItemObj.getIcon_url());
            }
            SearchNewFragment.u5(this$0, hotSearchObj != null ? hotSearchObj.getType() : null, hotSearchItemObj, true);
        }

        public void n(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e final HotSearchItemObj hotSearchItemObj) {
            if (PatchProxy.proxy(new Object[]{eVar, hotSearchItemObj}, this, changeQuickRedirect, false, bb.c.k.f33883u5, new Class[]{com.max.hbcommon.base.adapter.s.e.class, HotSearchItemObj.class}, Void.TYPE).isSupported || eVar == null) {
                return;
            }
            final HotSearchObj hotSearchObj = this.f72243b;
            final SearchNewFragment searchNewFragment = this.f72244c;
            if (hotSearchItemObj != null) {
                hotSearchItemObj.setType(hotSearchObj != null ? hotSearchObj.getType() : null);
                View viewI = eVar.i(R.id.root);
                kotlin.jvm.internal.f0.o(viewI, "getView(...)");
                RelativeLayout relativeLayout = (RelativeLayout) viewI;
                View viewI2 = eVar.i(R.id.tv_desc);
                kotlin.jvm.internal.f0.o(viewI2, "getView(...)");
                View viewI3 = eVar.i(R.id.iv_icon);
                kotlin.jvm.internal.f0.o(viewI3, "getView(...)");
                ImageView imageView = (ImageView) viewI3;
                ((TextView) viewI2).setText(hotSearchItemObj.getName());
                String icon_url = hotSearchItemObj.getIcon_url();
                if (icon_url == null || icon_url.length() == 0) {
                    imageView.setVisibility(8);
                } else {
                    imageView.setVisibility(0);
                    com.max.hbimage.b.K(hotSearchItemObj.getIcon_url(), imageView);
                }
                ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
                if (eVar.getPosition() % 2 == 1) {
                    Resources resources = searchNewFragment.getResources();
                    kotlin.jvm.internal.f0.o(resources, "getResources(...)");
                    ((ViewGroup.MarginLayoutParams) layoutParams2).width = (int) ShareCardDrawUtilsKt.d(160.0f, resources);
                    Resources resources2 = searchNewFragment.getResources();
                    kotlin.jvm.internal.f0.o(resources2, "getResources(...)");
                    layoutParams2.setMarginStart((int) ShareCardDrawUtilsKt.d(12.0f, resources2));
                } else {
                    Resources resources3 = searchNewFragment.getResources();
                    kotlin.jvm.internal.f0.o(resources3, "getResources(...)");
                    ((ViewGroup.MarginLayoutParams) layoutParams2).width = (int) ShareCardDrawUtilsKt.d(170.0f, resources3);
                    layoutParams2.setMarginStart(0);
                }
                if (eVar.getPosition() % 2 == 1) {
                    ViewGroup.LayoutParams layoutParams3 = relativeLayout.getLayoutParams();
                    kotlin.jvm.internal.f0.n(layoutParams3, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                    ((RecyclerView.LayoutParams) layoutParams3).setMarginStart(ViewUtils.f(searchNewFragment.getContext(), 13.0f));
                }
                SearchNewFragment.u5(searchNewFragment, hotSearchObj != null ? hotSearchObj.getType() : null, hotSearchItemObj, false);
                relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbsearch.s0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SearchNewFragment.n.o(hotSearchItemObj, searchNewFragment, hotSearchObj, view);
                    }
                });
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, HotSearchItemObj hotSearchItemObj) {
            if (PatchProxy.proxy(new Object[]{eVar, hotSearchItemObj}, this, changeQuickRedirect, false, bb.c.k.f33927w5, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            n(eVar, hotSearchItemObj);
        }
    }

    /* JADX INFO: compiled from: SearchNewFragment.kt */
    public static final class o implements com.max.hbcommon.base.adapter.a0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // com.max.hbcommon.base.adapter.a0
        public void a(int i10, @dl.e RecyclerView.ViewHolder viewHolder, float f10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10), viewHolder, new Float(f10)}, this, changeQuickRedirect, false, bb.c.k.f33971y5, new Class[]{Integer.TYPE, RecyclerView.ViewHolder.class, Float.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.base.adapter.a0.a.a(this, i10, viewHolder, f10);
        }

        @Override // com.max.hbcommon.base.adapter.a0
        public void b(int i10, @dl.e RecyclerView.ViewHolder viewHolder) {
        }

        @Override // com.max.hbcommon.base.adapter.a0
        public void c(int i10, @dl.e RecyclerView.ViewHolder viewHolder) {
            List<SearchSuggestionV2Obj> dataList;
            if (PatchProxy.proxy(new Object[]{new Integer(i10), viewHolder}, this, changeQuickRedirect, false, bb.c.k.f33949x5, new Class[]{Integer.TYPE, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
                return;
            }
            RecyclerView recyclerView = SearchNewFragment.this.O3;
            RecyclerView.Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            SuggestionAdapter suggestionAdapter = adapter instanceof SuggestionAdapter ? (SuggestionAdapter) adapter : null;
            if (suggestionAdapter == null || (dataList = suggestionAdapter.getDataList()) == null) {
                return;
            }
            SearchNewFragment searchNewFragment = SearchNewFragment.this;
            SearchSuggestionV2Obj searchSuggestionV2Obj = dataList.get(i10);
            if (!(!searchNewFragment.V3.contains(searchSuggestionV2Obj))) {
                searchSuggestionV2Obj = null;
            }
            SearchSuggestionV2Obj searchSuggestionV2Obj2 = searchSuggestionV2Obj;
            if (searchSuggestionV2Obj2 != null) {
                searchNewFragment.V3.add(searchSuggestionV2Obj2);
                JsonObject report_extra = searchSuggestionV2Obj2.getReport_extra();
                com.max.hbcommon.analytics.d.d("3", lb.d.D, null, report_extra != null ? report_extra.deepCopy() : null);
            }
        }
    }

    public static final /* synthetic */ void A5(SearchNewFragment searchNewFragment) {
        if (PatchProxy.proxy(new Object[]{searchNewFragment}, null, changeQuickRedirect, true, bb.c.k.f33816r4, new Class[]{SearchNewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        searchNewFragment.N6();
    }

    private final void A6(boolean z10, String str) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), str}, this, changeQuickRedirect, false, bb.c.k.Y2, new Class[]{Boolean.TYPE, String.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        ConsecutiveScrollerLayout consecutiveScrollerLayout = null;
        ConsecutiveScrollerLayout consecutiveScrollerLayout2 = null;
        ViewGroup.LayoutParams layoutParams = null;
        if (this.R3) {
            ConsecutiveScrollerLayout consecutiveScrollerLayout3 = this.f72204x;
            if (consecutiveScrollerLayout3 == null) {
                kotlin.jvm.internal.f0.S("sv_placeholder");
            } else {
                consecutiveScrollerLayout2 = consecutiveScrollerLayout3;
            }
            consecutiveScrollerLayout2.setVisibility(8);
            if (com.max.hbcommon.utils.c.u(r())) {
                r6(true);
                return;
            } else {
                r6(false);
                return;
            }
        }
        if (!com.max.hbcommon.utils.c.u(r()) || !d6()) {
            ConsecutiveScrollerLayout consecutiveScrollerLayout4 = this.f72204x;
            if (consecutiveScrollerLayout4 == null) {
                kotlin.jvm.internal.f0.S("sv_placeholder");
            } else {
                consecutiveScrollerLayout = consecutiveScrollerLayout4;
            }
            consecutiveScrollerLayout.setVisibility(8);
            return;
        }
        if (L2(this.f72195p2)) {
            if (!com.max.hbcommon.utils.c.u(str)) {
                p6(str);
                com.max.hbsearch.o oVar = com.max.hbsearch.o.f72357a;
                com.max.hbsearch.o.f72359c = str;
            }
            w6();
        } else if (com.max.hbsearch.o.f72358b != null) {
            L6(z10);
            w6();
        }
        Q5();
        ConsecutiveScrollerLayout consecutiveScrollerLayout5 = this.f72204x;
        if (consecutiveScrollerLayout5 == null) {
            kotlin.jvm.internal.f0.S("sv_placeholder");
            consecutiveScrollerLayout5 = null;
        }
        consecutiveScrollerLayout5.setVisibility(0);
        ConsecutiveScrollerLayout consecutiveScrollerLayout6 = this.f72204x;
        if (consecutiveScrollerLayout6 == null) {
            kotlin.jvm.internal.f0.S("sv_placeholder");
            consecutiveScrollerLayout6 = null;
        }
        consecutiveScrollerLayout6.setNestedScrollingEnabled(true);
        ConsecutiveScrollerLayout consecutiveScrollerLayout7 = this.f72204x;
        if (consecutiveScrollerLayout7 == null) {
            kotlin.jvm.internal.f0.S("sv_placeholder");
            consecutiveScrollerLayout7 = null;
        }
        consecutiveScrollerLayout7.setOnStickyChangeListener(new ConsecutiveScrollerLayout.i() { // from class: com.max.hbsearch.v
            @Override // com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout.i
            public final void a(View view, View view2) {
                SearchNewFragment.C6(this.f72384a, view, view2);
            }
        });
        if (this.f72204x == null) {
            kotlin.jvm.internal.f0.S("sv_placeholder");
        }
        if (ad.a.a(ad.a.f1211r, false)) {
            return;
        }
        ConsecutiveScrollerLayout consecutiveScrollerLayout8 = this.f72204x;
        if (consecutiveScrollerLayout8 == null) {
            kotlin.jvm.internal.f0.S("sv_placeholder");
            consecutiveScrollerLayout8 = null;
        }
        LinearLayout linearLayout = (LinearLayout) consecutiveScrollerLayout8.findViewById(R.id.ll_hot_search_v3);
        ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
        ConsecutiveScrollerLayout.LayoutParams layoutParams3 = layoutParams2 instanceof ConsecutiveScrollerLayout.LayoutParams ? (ConsecutiveScrollerLayout.LayoutParams) layoutParams2 : null;
        if (layoutParams3 != null) {
            layoutParams3.f42336c = false;
            layoutParams = layoutParams3;
        }
        linearLayout.setLayoutParams(layoutParams);
    }

    public static final /* synthetic */ void B5(SearchNewFragment searchNewFragment, List list) {
        if (PatchProxy.proxy(new Object[]{searchNewFragment, list}, null, changeQuickRedirect, true, bb.c.k.f33771p4, new Class[]{SearchNewFragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        searchNewFragment.P6(list);
    }

    static /* synthetic */ void B6(SearchNewFragment searchNewFragment, boolean z10, String str, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{searchNewFragment, new Byte(z10 ? (byte) 1 : (byte) 0), str, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.k.Z2, new Class[]{SearchNewFragment.class, Boolean.TYPE, String.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        searchNewFragment.A6(z10, str);
    }

    private final void C5(List<HotSearchItemObj> list, ViewGroup viewGroup, final String str) {
        if (PatchProxy.proxy(new Object[]{list, viewGroup, str}, this, changeQuickRedirect, false, bb.c.k.N3, new Class[]{List.class, ViewGroup.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.m(viewGroup);
        viewGroup.removeAllViews();
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            final HotSearchItemObj hotSearchItemObj = list.get(i10);
            View viewInflate = this.mInflater.inflate(R.layout.hbsearch_item_search_hot_word, (ViewGroup) null);
            View viewFindViewById = viewInflate.findViewById(R.id.tv_rank);
            kotlin.jvm.internal.f0.n(viewFindViewById, "null cannot be cast to non-null type com.max.hbcustomview.GradientTextView");
            GradientTextView gradientTextView = (GradientTextView) viewFindViewById;
            View viewFindViewById2 = viewInflate.findViewById(R.id.tv_title);
            kotlin.jvm.internal.f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) viewFindViewById2;
            i10++;
            Pair<Integer, Integer> pairO5 = O5(i10);
            QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) viewInflate.findViewById(R.id.iv_game);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_icon);
            if (com.max.hbcommon.utils.c.u(hotSearchItemObj.getImage_url())) {
                qMUIRadiusImageView.setVisibility(8);
            } else {
                com.max.hbimage.b.K(hotSearchItemObj.getImage_url(), qMUIRadiusImageView);
                qMUIRadiusImageView.setVisibility(0);
            }
            if (com.max.hbcommon.utils.c.u(hotSearchItemObj.getIcon_url())) {
                imageView.setVisibility(8);
            } else {
                com.max.hbimage.b.K(hotSearchItemObj.getIcon_url(), imageView);
                imageView.setVisibility(0);
            }
            Object first = pairO5.first;
            kotlin.jvm.internal.f0.o(first, "first");
            int iIntValue = ((Number) first).intValue();
            Object second = pairO5.second;
            kotlin.jvm.internal.f0.o(second, "second");
            gradientTextView.setColors(iIntValue, ((Number) second).intValue(), GradientDrawable.Orientation.BL_TR);
            kotlin.jvm.internal.v0 v0Var = kotlin.jvm.internal.v0.f124986a;
            String str2 = String.format(Locale.US, TimeModel.f55754j, Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
            kotlin.jvm.internal.f0.o(str2, "format(...)");
            gradientTextView.setText(str2);
            viewGroup.addView(viewInflate);
            textView.setText(hotSearchItemObj.getName());
            n6(str, hotSearchItemObj, false);
            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbsearch.d0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchNewFragment.D5(hotSearchItemObj, this, str, view);
                }
            });
        }
        viewGroup.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C6(SearchNewFragment this$0, View view, View view2) {
        if (PatchProxy.proxy(new Object[]{this$0, view, view2}, null, changeQuickRedirect, true, bb.c.k.f33425a4, new Class[]{SearchNewFragment.class, View.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        if (this$0.Y3 || view2 == null) {
            return;
        }
        com.max.hbcommon.analytics.d.d("3", lb.d.B, null, new JsonObject());
        this$0.Y3 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D5(HotSearchItemObj searchHotwordObj, SearchNewFragment this_run, String str, View view) {
        if (PatchProxy.proxy(new Object[]{searchHotwordObj, this_run, str, view}, null, changeQuickRedirect, true, bb.c.k.f33679l4, new Class[]{HotSearchItemObj.class, SearchNewFragment.class, String.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(searchHotwordObj, "$searchHotwordObj");
        kotlin.jvm.internal.f0.p(this_run, "$this_run");
        if (com.max.hbcommon.utils.c.u(searchHotwordObj.getProto())) {
            this_run.s1(new KeyDescObj(searchHotwordObj.getName(), searchHotwordObj.getProto(), searchHotwordObj.getIcon_url()), "hot");
        } else {
            pb.p pVarP = ob.a.p();
            Activity mContext = this_run.mContext;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            String proto = searchHotwordObj.getProto();
            kotlin.jvm.internal.f0.m(proto);
            pVarP.c(mContext, proto);
            this_run.v1(searchHotwordObj.getName(), searchHotwordObj.getProto(), searchHotwordObj.getIcon_url());
        }
        this_run.n6(str, searchHotwordObj, true);
    }

    private final int E5(TextPaint textPaint, String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{textPaint, str, str2}, this, changeQuickRedirect, false, bb.c.k.G3, new Class[]{TextPaint.class, String.class, String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        return (int) (ViewUtils.S(textPaint, str) + ViewUtils.f(this.mContext, (!(str2 == null || str2.length() == 0) ? 19.0f : 0.0f) + 24.0f + (this.Z3 ? 15.0f : 0.0f)));
    }

    public static /* synthetic */ void E6(SearchNewFragment searchNewFragment, List list, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{searchNewFragment, list, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.k.E3, new Class[]{SearchNewFragment.class, List.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        searchNewFragment.D6(list, z10);
    }

    private final int F5(List<HotSearchItemObj> list, int i10) {
        Object[] objArr = {list, new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.k.f33655k3, new Class[]{List.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int size = list.size();
        Paint paint = new Paint();
        Resources resources = this.mContext.getResources();
        kotlin.jvm.internal.f0.o(resources, "getResources(...)");
        paint.setTextSize(ShareCardDrawUtilsKt.e(13, resources));
        paint.setColor(Color.parseColor("#FFFFFF"));
        paint.setAntiAlias(true);
        int iMax = 0;
        for (int i11 = 0; i11 < size; i11++) {
            HotSearchItemObj hotSearchItemObj = list.get(i11);
            String name = hotSearchItemObj.getName();
            if (name != null) {
                iMax = Math.max(iMax, ((int) paint.measureText(name)) + ViewUtils.f(getContext(), com.max.hbcommon.utils.c.u(hotSearchItemObj.getImage_url()) ? 26.0f : 70.0f) + ViewUtils.f(getContext(), com.max.hbcommon.utils.c.u(hotSearchItemObj.getIcon_url()) ? 7.0f : 26.0f));
                if (iMax >= i10) {
                    return i10;
                }
            }
        }
        return iMax;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F6(SearchNewFragment this$0, List list, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, list, view}, null, changeQuickRedirect, true, bb.c.k.f33495d4, new Class[]{SearchNewFragment.class, List.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.I5(true);
        this$0.D6(list, true);
    }

    private final Pair<Integer, Integer> G5(List<HotSearchItemObj> list, List<HotSearchItemObj> list2) {
        int iMax;
        int iMax2 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, list2}, this, changeQuickRedirect, false, bb.c.k.f33632j3, new Class[]{List.class, List.class}, Pair.class);
        if (patchProxyResultProxy.isSupported) {
            return (Pair) patchProxyResultProxy.result;
        }
        int iL = (ViewUtils.L(getContext()) - ViewUtils.f(this.mContext, 34.0f)) / 2;
        if (list != null && list2 != null) {
            iMax = Math.max(F5(list2, ViewUtils.f(getContext(), 290.0f)), iL);
            iMax2 = iL;
        } else if (list2 != null) {
            iMax = Math.max(F5(list2, ViewUtils.L(getContext()) - ViewUtils.f(getContext(), 24.0f)), iL);
        } else if (list != null) {
            iMax2 = Math.max(F5(list, ViewUtils.L(getContext()) - ViewUtils.f(getContext(), 24.0f)), iL);
            iMax = 0;
        } else {
            iMax = 0;
        }
        return new Pair<>(Integer.valueOf(iMax2), Integer.valueOf(iMax));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G6(View view, View view2) {
        if (PatchProxy.proxy(new Object[]{view, view2}, null, changeQuickRedirect, true, bb.c.k.f33518e4, new Class[]{View.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        view.performClick();
    }

    private final void H5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33540f3, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Iterator<WeakReference<io.reactivex.disposables.b>> it = this.W3.iterator();
        while (it.hasNext()) {
            try {
                io.reactivex.disposables.b bVar = it.next().get();
                if (bVar != null) {
                    bVar.dispose();
                }
            } catch (Throwable th2) {
                com.max.heybox.hblog.g.f74531b.v("cancelSuggestionRequest error: " + th2.getMessage());
            }
        }
        this.W3.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H6(SearchNewFragment this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.k.f33541f4, new Class[]{SearchNewFragment.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.s6();
    }

    private final void I5(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.k.J3, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.Z3 = z10;
        LinearLayout linearLayout = this.f72203w;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            kotlin.jvm.internal.f0.S("ll_search_history");
            linearLayout = null;
        }
        View viewFindViewById = linearLayout.findViewById(R.id.vg_clear);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility((!z10 ? 1 : 0) != 0 ? 0 : 8);
        }
        LinearLayout linearLayout3 = this.f72203w;
        if (linearLayout3 == null) {
            kotlin.jvm.internal.f0.S("ll_search_history");
            linearLayout3 = null;
        }
        View viewFindViewById2 = linearLayout3.findViewById(R.id.v_vg_clear_delegate);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility((!z10 ? 1 : 0) != 0 ? 0 : 8);
        }
        LinearLayout linearLayout4 = this.f72203w;
        if (linearLayout4 == null) {
            kotlin.jvm.internal.f0.S("ll_search_history");
        } else {
            linearLayout2 = linearLayout4;
        }
        View viewFindViewById3 = linearLayout2.findViewById(R.id.vg_clear_action);
        if (viewFindViewById3 == null) {
            return;
        }
        viewFindViewById3.setVisibility(z10 ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I6(SearchNewFragment this$0, List list, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, list, view}, null, changeQuickRedirect, true, bb.c.k.f33564g4, new Class[]{SearchNewFragment.class, List.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.I5(false);
        this$0.D6(list, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J6(SearchNewFragment this$0, KeyDescObj keyDescObj, List list, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, keyDescObj, list, view}, null, changeQuickRedirect, true, bb.c.k.f33587h4, new Class[]{SearchNewFragment.class, KeyDescObj.class, List.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.e6(keyDescObj, list);
    }

    public static /* synthetic */ void K5(SearchNewFragment searchNewFragment, String str, String str2, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{searchNewFragment, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.k.f33517e3, new Class[]{SearchNewFragment.class, String.class, String.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        searchNewFragment.J5(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K6(SearchNewFragment this$0, List list, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, list, view}, null, changeQuickRedirect, true, bb.c.k.f33610i4, new Class[]{SearchNewFragment.class, List.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.D6(list, true);
    }

    private final void L5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.O2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = findViewById(R.id.fragment_container);
        kotlin.jvm.internal.f0.o(viewFindViewById, "findViewById(...)");
        this.f72198r = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.ll_search_hot_words);
        kotlin.jvm.internal.f0.o(viewFindViewById2, "findViewById(...)");
        this.f72199s = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.cv_search_hot_hashtag);
        kotlin.jvm.internal.f0.o(viewFindViewById3, "findViewById(...)");
        this.f72200t = viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.ll_search_hot_hashtag);
        kotlin.jvm.internal.f0.o(viewFindViewById4, "findViewById(...)");
        this.f72201u = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.banner);
        kotlin.jvm.internal.f0.o(viewFindViewById5, "findViewById(...)");
        this.f72202v = (BannerViewPager) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.ll_search_history);
        kotlin.jvm.internal.f0.o(viewFindViewById6, "findViewById(...)");
        this.f72203w = (LinearLayout) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.sv_placeholder);
        kotlin.jvm.internal.f0.o(viewFindViewById7, "findViewById(...)");
        this.f72204x = (ConsecutiveScrollerLayout) viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.view_dap);
        kotlin.jvm.internal.f0.o(viewFindViewById8, "findViewById(...)");
        this.f72210z = viewFindViewById8;
        View viewFindViewById9 = findViewById(R.id.cv_search_hot_words);
        kotlin.jvm.internal.f0.o(viewFindViewById9, "findViewById(...)");
        this.f72207y = viewFindViewById9;
        View viewFindViewById10 = findViewById(R.id.v_list_header);
        kotlin.jvm.internal.f0.o(viewFindViewById10, "findViewById(...)");
        this.A = (ListSectionHeader) viewFindViewById10;
        View viewFindViewById11 = findViewById(R.id.rv_hot_mini_program);
        kotlin.jvm.internal.f0.o(viewFindViewById11, "findViewById(...)");
        this.B = (RecyclerView) viewFindViewById11;
        View viewFindViewById12 = findViewById(R.id.vg_hot);
        kotlin.jvm.internal.f0.o(viewFindViewById12, "findViewById(...)");
        this.C = (ViewGroup) viewFindViewById12;
        View viewFindViewById13 = findViewById(R.id.ll_hot);
        kotlin.jvm.internal.f0.o(viewFindViewById13, "findViewById(...)");
        this.E = (LinearLayout) viewFindViewById13;
        this.D = findViewById(R.id.v_default_gap);
        View viewFindViewById14 = findViewById(R.id.rl_list_header_v2);
        kotlin.jvm.internal.f0.o(viewFindViewById14, "findViewById(...)");
        this.F = (RelativeLayout) viewFindViewById14;
        View viewFindViewById15 = findViewById(R.id.iv_refresh);
        kotlin.jvm.internal.f0.o(viewFindViewById15, "findViewById(...)");
        this.H = (ImageView) viewFindViewById15;
        View viewFindViewById16 = findViewById(R.id.rv_search_recommend_v2);
        kotlin.jvm.internal.f0.o(viewFindViewById16, "findViewById(...)");
        this.I = (RecyclerView) viewFindViewById16;
        View viewFindViewById17 = findViewById(R.id.cv_search_hot_words_v2);
        kotlin.jvm.internal.f0.o(viewFindViewById17, "findViewById(...)");
        this.J = (CardView) viewFindViewById17;
        View viewFindViewById18 = findViewById(R.id.cv_search_hot_hashtag_v2);
        kotlin.jvm.internal.f0.o(viewFindViewById18, "findViewById(...)");
        this.L = viewFindViewById18;
        View viewFindViewById19 = findViewById(R.id.ll_search_hot_hashtag_v2);
        kotlin.jvm.internal.f0.o(viewFindViewById19, "findViewById(...)");
        this.K = (LinearLayout) viewFindViewById19;
        View viewFindViewById20 = findViewById(R.id.ll_search_hot_words_v2);
        kotlin.jvm.internal.f0.o(viewFindViewById20, "findViewById(...)");
        this.M = (LinearLayout) viewFindViewById20;
        View viewFindViewById21 = findViewById(R.id.sv_hot_v2);
        kotlin.jvm.internal.f0.o(viewFindViewById21, "findViewById(...)");
        this.N = (HorizontalScrollView) viewFindViewById21;
        View viewFindViewById22 = findViewById(R.id.iv_hot_tag_bg_v2);
        kotlin.jvm.internal.f0.o(viewFindViewById22, "findViewById(...)");
        this.O = (ImageView) viewFindViewById22;
        View viewFindViewById23 = findViewById(R.id.tv_hot_search_v2);
        kotlin.jvm.internal.f0.o(viewFindViewById23, "findViewById(...)");
        this.P = (TextView) viewFindViewById23;
        View viewFindViewById24 = findViewById(R.id.tv_hot_tag_v2);
        kotlin.jvm.internal.f0.o(viewFindViewById24, "findViewById(...)");
        this.Q = (TextView) viewFindViewById24;
        View viewFindViewById25 = findViewById(R.id.v_list_header_v2);
        kotlin.jvm.internal.f0.o(viewFindViewById25, "findViewById(...)");
        this.R = (ListSectionHeader) viewFindViewById25;
        View viewFindViewById26 = findViewById(R.id.ll_refresh);
        kotlin.jvm.internal.f0.o(viewFindViewById26, "findViewById(...)");
        this.G = (LinearLayout) viewFindViewById26;
        this.Y = (NestedScrollView) findViewById(R.id.nsv_hot_search_v3);
        this.Z = (LinearLayout) findViewById(R.id.ll_hot_search_v3);
        this.f72190a0 = findViewById(R.id.v_top_space_hot_search_v3);
        this.f72191b0 = (Space) findViewById(R.id.space_hot_search_v3);
    }

    private final void L6(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.k.f33586h3, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ContainerConfig containerConfig = this.f72195p2;
        HotWordTypeV2 hotWordTypeV2N = containerConfig != null ? containerConfig.n() : null;
        HorizontalScrollView horizontalScrollView = this.N;
        if (horizontalScrollView == null) {
            kotlin.jvm.internal.f0.S("sv_hot_v2");
            horizontalScrollView = null;
        }
        horizontalScrollView.setVisibility(0);
        HotWordTypeV2 hotWordTypeV2 = HotWordTypeV2.CHANNEL_CONTENT;
        HotSearchObj hotSearchObjN5 = (hotWordTypeV2N == hotWordTypeV2 || hotWordTypeV2N == HotWordTypeV2.MALL) ? this.W : N5();
        HotSearchObj hotSearchObjM5 = (hotWordTypeV2N == hotWordTypeV2 || hotWordTypeV2N == HotWordTypeV2.MALL) ? this.X : M5();
        Pair<Integer, Integer> pairG5 = G5(hotSearchObjN5 != null ? hotSearchObjN5.getList() : null, hotSearchObjM5 != null ? hotSearchObjM5.getList() : null);
        Object first = pairG5.first;
        kotlin.jvm.internal.f0.o(first, "first");
        y6(hotSearchObjN5, z10, ((Number) first).intValue());
        Object second = pairG5.second;
        kotlin.jvm.internal.f0.o(second, "second");
        x6(hotSearchObjM5, z10, ((Number) second).intValue());
        N6();
    }

    private final HotSearchObj M5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33815r3, new Class[0], HotSearchObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (HotSearchObj) patchProxyResultProxy.result;
        }
        ContainerConfig containerConfig = this.f72195p2;
        HotHashtagType hotHashtagTypeL = containerConfig != null ? containerConfig.l() : null;
        if (hotHashtagTypeL == null) {
            hotHashtagTypeL = HotHashtagType.GENERAL;
        }
        return md.a.a(hotHashtagTypeL);
    }

    static /* synthetic */ void M6(SearchNewFragment searchNewFragment, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{searchNewFragment, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.k.f33609i3, new Class[]{SearchNewFragment.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        searchNewFragment.L6(z10);
    }

    private final HotSearchObj N5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33881u3, new Class[0], HotSearchObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (HotSearchObj) patchProxyResultProxy.result;
        }
        ContainerConfig containerConfig = this.f72195p2;
        HotWordTypeV2 hotWordTypeV2N = containerConfig != null ? containerConfig.n() : null;
        if (hotWordTypeV2N == null) {
            hotWordTypeV2N = HotWordTypeV2.GENERAL;
        }
        return md.b.b(hotWordTypeV2N);
    }

    private final void N6() {
        List<HotSearchItemObj> list;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33678l3, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        HotSearchObj hotSearchObjC = com.max.hbsearch.o.f72357a.c();
        if (hotSearchObjC != null && (list = hotSearchObjC.getList()) != null && this.U.isEmpty()) {
            this.U.addAll(list);
        }
        RecyclerView recyclerView = null;
        if (this.V == null) {
            this.V = new n(hotSearchObjC, this, this.mContext, this.U, R.layout.item_search_discover);
            RecyclerView recyclerView2 = this.I;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.f0.S("rv_search_recommend_v2");
                recyclerView2 = null;
            }
            recyclerView2.setAdapter(this.V);
            ImageView imageView = this.H;
            if (imageView == null) {
                kotlin.jvm.internal.f0.S("iv_refresh");
                imageView = null;
            }
            final ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, androidx.constraintlayout.motion.widget.f.f18721i, 360.0f, 0.0f);
            objectAnimatorOfFloat.setDuration(500L);
            LinearLayout linearLayout = this.G;
            if (linearLayout == null) {
                kotlin.jvm.internal.f0.S("ll_refresh");
                linearLayout = null;
            }
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbsearch.w
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchNewFragment.O6(this.f72386b, objectAnimatorOfFloat, view);
                }
            });
            RecyclerView recyclerView3 = this.I;
            if (recyclerView3 == null) {
                kotlin.jvm.internal.f0.S("rv_search_recommend_v2");
                recyclerView3 = null;
            }
            recyclerView3.setLayoutManager(new GridLayoutManager(this.mContext, 2));
        }
        boolean z10 = true;
        if (!this.U.isEmpty()) {
            String name = hotSearchObjC != null ? hotSearchObjC.getName() : null;
            if (name != null && name.length() != 0) {
                z10 = false;
            }
            if (!z10) {
                com.max.hbcommon.base.adapter.s<HotSearchItemObj> sVar = this.V;
                if (sVar != null) {
                    sVar.notifyDataSetChanged();
                }
                ListSectionHeader listSectionHeader = this.R;
                if (listSectionHeader == null) {
                    kotlin.jvm.internal.f0.S("v_list_header_v2");
                    listSectionHeader = null;
                }
                listSectionHeader.setTitleText(hotSearchObjC != null ? hotSearchObjC.getName() : null);
                RelativeLayout relativeLayout = this.F;
                if (relativeLayout == null) {
                    kotlin.jvm.internal.f0.S("rl_list_header_v2");
                    relativeLayout = null;
                }
                relativeLayout.setVisibility(0);
                RecyclerView recyclerView4 = this.I;
                if (recyclerView4 == null) {
                    kotlin.jvm.internal.f0.S("rv_search_recommend_v2");
                } else {
                    recyclerView = recyclerView4;
                }
                recyclerView.setVisibility(0);
                return;
            }
        }
        RelativeLayout relativeLayout2 = this.F;
        if (relativeLayout2 == null) {
            kotlin.jvm.internal.f0.S("rl_list_header_v2");
            relativeLayout2 = null;
        }
        relativeLayout2.setVisibility(8);
        RecyclerView recyclerView5 = this.I;
        if (recyclerView5 == null) {
            kotlin.jvm.internal.f0.S("rv_search_recommend_v2");
        } else {
            recyclerView = recyclerView5;
        }
        recyclerView.setVisibility(8);
    }

    private final Pair<Integer, Integer> O5(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.S3, new Class[]{Integer.TYPE}, Pair.class);
        if (patchProxyResultProxy.isSupported) {
            return (Pair) patchProxyResultProxy.result;
        }
        if (i10 <= 1) {
            return new Pair<>(Integer.valueOf(com.max.hbcommon.utils.l.a(R.color.orange_start)), Integer.valueOf(com.max.hbcommon.utils.l.a(R.color.orange_end)));
        }
        if (i10 <= 2) {
            return new Pair<>(Integer.valueOf(com.max.hbcommon.utils.l.a(R.color.purple_start)), Integer.valueOf(com.max.hbcommon.utils.l.a(R.color.purple_end)));
        }
        if (i10 <= 3) {
            return new Pair<>(Integer.valueOf(com.max.hbcommon.utils.l.a(R.color.blue_start)), Integer.valueOf(com.max.hbcommon.utils.l.a(R.color.blue_end)));
        }
        return i10 <= 4 ? new Pair<>(Integer.valueOf(com.max.hbcommon.utils.l.a(R.color.green_start)), Integer.valueOf(com.max.hbcommon.utils.l.a(R.color.green_end))) : new Pair<>(Integer.valueOf(com.max.hbcommon.utils.l.a(R.color.text_secondary_2_color)), Integer.valueOf(com.max.hbcommon.utils.l.a(R.color.text_secondary_1_color)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O6(SearchNewFragment this$0, ObjectAnimator objectAnimator, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, objectAnimator, view}, null, changeQuickRedirect, true, bb.c.k.f33448b4, new Class[]{SearchNewFragment.class, ObjectAnimator.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        j6(this$0, true, null, 2, null);
        objectAnimator.start();
    }

    private final void P6(List<SearchSuggestionV2Obj> list) {
        RecyclerView.Adapter adapter;
        SearchView searchView;
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.k.A3, new Class[]{List.class}, Void.TYPE).isSupported || this.mContext.isFinishing()) {
            return;
        }
        this.V3.clear();
        if (list == null || list.isEmpty()) {
            S5();
            return;
        }
        if (this.N3 == null) {
            LinearLayout linearLayout = new LinearLayout(this.mContext);
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new WindowManager.LayoutParams(-1, -1));
            linearLayout.setBackgroundColor(this.mContext.getResources().getColor(R.color.background_layer_2_color));
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbsearch.e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchNewFragment.Q6(this.f72286b, view);
                }
            });
            RecyclerView recyclerView = new RecyclerView(this.mContext);
            this.O3 = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
            RecyclerView recyclerView2 = this.O3;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            }
            FragmentActivity activity = getActivity();
            RecyclerView recyclerView3 = this.O3;
            kotlin.jvm.internal.f0.m(recyclerView3);
            new RecyclerViewItemWatcher(activity, recyclerView3, new o(), 0, false, 24, null);
            linearLayout.addView(this.O3);
            PopupWindow popupWindow = new PopupWindow(linearLayout, -1, -1);
            this.N3 = popupWindow;
            kotlin.jvm.internal.f0.m(popupWindow);
            popupWindow.setInputMethodMode(1);
            PopupWindow popupWindow2 = this.N3;
            kotlin.jvm.internal.f0.m(popupWindow2);
            popupWindow2.setSoftInputMode(16);
            PopupWindow popupWindow3 = this.N3;
            kotlin.jvm.internal.f0.m(popupWindow3);
            popupWindow3.setAnimationStyle(R.style.dialogWindowAnim);
        }
        PopupWindow popupWindow4 = this.N3;
        kotlin.jvm.internal.f0.m(popupWindow4);
        if (!popupWindow4.isShowing() && (searchView = this.f72209y2) != null) {
            ViewUtils.q0(this.N3, searchView, 0, 0);
        }
        RecyclerView recyclerView4 = this.O3;
        if (recyclerView4 != null) {
            Activity mContext = this.mContext;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            recyclerView4.setAdapter(new SuggestionAdapter(this, mContext, list));
        }
        RecyclerView recyclerView5 = this.O3;
        if (recyclerView5 != null && (adapter = recyclerView5.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
        kotlinx.coroutines.k.f(kotlinx.coroutines.r0.a(e1.c()), null, null, new SearchNewFragment$updateSearchSuggestion$3(this, null), 3, null);
    }

    @SuppressLint({"AutoDispose"})
    private final void Q5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.K3, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String str = this.f72196p3;
        if (str == null) {
            kotlin.jvm.internal.f0.S("mSearchCacheKey");
            str = null;
        }
        addDisposable((io.reactivex.disposables.b) com.max.hbcache.b.g("search_history", str, KeyDescObj.class).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q6(SearchNewFragment this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.k.f33471c4, new Class[]{SearchNewFragment.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.S5();
    }

    @SuppressLint({"AutoDispose"})
    private final void R5(String str) {
        io.reactivex.z<Result<SearchSuggestionV2Result>> zVarC;
        io.reactivex.z<Result<SearchSuggestionV2Result>> zVarI5;
        io.reactivex.z<Result<SearchSuggestionV2Result>> zVarA4;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.k.f33563g3, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f fVar = null;
        this.M3 = null;
        nd.a aVarA = nd.b.a();
        if (aVarA != null && (zVarC = aVarA.c(str)) != null && (zVarI5 = zVarC.I5(io.reactivex.schedulers.b.d())) != null && (zVarA4 = zVarI5.a4(io.reactivex.android.schedulers.a.c())) != null) {
            fVar = (f) zVarA4.J5(new f(str, this));
        }
        this.W3.add(new WeakReference<>(fVar));
        addDisposable(fVar);
    }

    private final void S5() {
        PopupWindow popupWindow;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.C3, new Class[0], Void.TYPE).isSupported || this.mContext.isFinishing() || (popupWindow = this.N3) == null) {
            return;
        }
        kotlin.jvm.internal.f0.m(popupWindow);
        if (popupWindow.isShowing()) {
            PopupWindow popupWindow2 = this.N3;
            kotlin.jvm.internal.f0.m(popupWindow2);
            popupWindow2.dismiss();
        }
    }

    private final void T5(Context context, View view) {
        if (PatchProxy.proxy(new Object[]{context, view}, this, changeQuickRedirect, false, bb.c.k.R3, new Class[]{Context.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        Object systemService = context.getSystemService("input_method");
        kotlin.jvm.internal.f0.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U5(SearchNewFragment this$0) {
        if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, bb.c.k.U3, new Class[]{SearchNewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        B6(this$0, false, null, 3, null);
    }

    private final void V5() {
        SearchView searchView;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Q2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (P5()) {
            ((ViewGroup) findViewById(R.id.fl_search)).setVisibility(8);
            this.mTitleBar.setInStack();
            this.mTitleBar.a0();
            this.mTitleBarDivider.setVisibility(0);
            if (ob.a.b().t()) {
                this.mTitleBar.setMaxStyle(false);
                this.mTitleBarDivider.setVisibility(8);
            }
            searchView = this.mTitleBar.getSearchView();
        } else {
            ((ViewGroup) findViewById(R.id.fl_search)).setVisibility(0);
            this.mTitleBar.setTitle(R.string.search);
            this.mTitleBar.P();
            this.mTitleBar.a0();
            this.mTitleBarDivider.setVisibility(8);
            searchView = (SearchView) findViewById(R.id.vg_search);
        }
        this.f72209y2 = searchView;
        if (!P5()) {
            searchView.setSearchIconColor(com.max.hbcommon.utils.l.a(R.color.text_secondary_2_color));
        }
        searchView.setVisibility(0);
        t0 t0Var = t0.f72375a;
        com.max.hbsearch.k kVar = this.J3;
        EditText editText = null;
        if (kVar == null) {
            kotlin.jvm.internal.f0.S("mSearchFragment");
            kVar = null;
        }
        if (t0Var.f(kVar.i4())) {
            FrameLayout vg_scan = searchView.getVg_scan();
            vg_scan.setVisibility(0);
            vg_scan.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbsearch.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchNewFragment.W5(this.f72389b, view);
                }
            });
        } else {
            searchView.setPadding(0, searchView.getPaddingTop(), searchView.getPaddingRight(), searchView.getPaddingBottom());
        }
        this.G2 = searchView.getEt_search();
        this.G3 = searchView.getIv_title_del();
        EditText editText2 = this.G2;
        if (editText2 == null) {
            kotlin.jvm.internal.f0.S("mSearchEditText");
            editText2 = null;
        }
        editText2.setFocusable(true);
        EditText editText3 = this.G2;
        if (editText3 == null) {
            kotlin.jvm.internal.f0.S("mSearchEditText");
            editText3 = null;
        }
        editText3.setFocusableInTouchMode(true);
        EditText editText4 = this.G2;
        if (editText4 == null) {
            kotlin.jvm.internal.f0.S("mSearchEditText");
            editText4 = null;
        }
        editText4.setImeOptions(3);
        EditText editText5 = this.G2;
        if (editText5 == null) {
            kotlin.jvm.internal.f0.S("mSearchEditText");
            editText5 = null;
        }
        editText5.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f72197q)});
        ImageView imageView = this.G3;
        if (imageView == null) {
            kotlin.jvm.internal.f0.S("mSearchIvDel");
            imageView = null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbsearch.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchNewFragment.X5(this.f72392b, view);
            }
        });
        EditText editText6 = this.G2;
        if (editText6 == null) {
            kotlin.jvm.internal.f0.S("mSearchEditText");
            editText6 = null;
        }
        editText6.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.max.hbsearch.z
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                return SearchNewFragment.Y5(this.f72404b, textView, i10, keyEvent);
            }
        });
        EditText editText7 = this.G2;
        if (editText7 == null) {
            kotlin.jvm.internal.f0.S("mSearchEditText");
            editText7 = null;
        }
        editText7.addTextChangedListener(new h());
        EditText editText8 = this.G2;
        if (editText8 == null) {
            kotlin.jvm.internal.f0.S("mSearchEditText");
        } else {
            editText = editText8;
        }
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.max.hbsearch.a0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                SearchNewFragment.Z5(this.f72251b, view, z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W5(SearchNewFragment this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.k.V3, new Class[]{SearchNewFragment.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        pb.j jVarL = ob.a.l();
        Activity mContext = this$0.mContext;
        kotlin.jvm.internal.f0.o(mContext, "mContext");
        jVarL.k(mContext, lb.d.f131244r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X5(SearchNewFragment this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.k.W3, new Class[]{SearchNewFragment.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        EditText editText = this$0.G2;
        if (editText == null) {
            kotlin.jvm.internal.f0.S("mSearchEditText");
            editText = null;
        }
        editText.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Y5(SearchNewFragment this$0, TextView textView, int i10, KeyEvent keyEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{this$0, textView, new Integer(i10), keyEvent}, null, changeQuickRedirect, true, bb.c.k.X3, new Class[]{SearchNewFragment.class, TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        if (i10 != 3) {
            return false;
        }
        this$0.K3.removeCallbacksAndMessages(null);
        String strR = this$0.r();
        Activity mContext = this$0.mContext;
        kotlin.jvm.internal.f0.o(mContext, "mContext");
        EditText editText = this$0.G2;
        if (editText == null) {
            kotlin.jvm.internal.f0.S("mSearchEditText");
            editText = null;
        }
        this$0.T5(mContext, editText);
        this$0.S5();
        if (com.max.hbcommon.utils.c.u(strR)) {
            String str = this$0.T3;
            if (str == null) {
                return false;
            }
            kotlin.jvm.internal.f0.m(str);
            com.max.hbsearch.n.a.b(this$0, new KeyDescObj(str), null, 2, null);
        } else {
            com.max.hbsearch.n.a.a(this$0, strR, null, null, 6, null);
            K5(this$0, this$0.r(), null, 2, null);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z5(SearchNewFragment this$0, View view, boolean z10) {
        boolean z11 = false;
        if (PatchProxy.proxy(new Object[]{this$0, view, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.k.Y3, new Class[]{SearchNewFragment.class, View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        if (this$0.f72205x1) {
            this$0.f72205x1 = false;
            return;
        }
        EditText editText = null;
        if (z10) {
            EditText editText2 = this$0.G2;
            if (editText2 == null) {
                kotlin.jvm.internal.f0.S("mSearchEditText");
                editText2 = null;
            }
            if (!com.max.hbcommon.utils.c.u(editText2.getText().toString()) && this$0.P3) {
                PopupWindow popupWindow = this$0.N3;
                if (!(popupWindow != null ? popupWindow.isShowing() : false)) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            EditText editText3 = this$0.G2;
            if (editText3 == null) {
                kotlin.jvm.internal.f0.S("mSearchEditText");
            } else {
                editText = editText3;
            }
            this$0.R5(editText.getText().toString());
        }
    }

    private final void a6() {
        String strY3;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.P2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        t0 t0Var = t0.f72375a;
        com.max.hbsearch.k kVar = this.J3;
        com.max.hbsearch.k kVar2 = null;
        if (kVar == null) {
            kotlin.jvm.internal.f0.S("mSearchFragment");
            kVar = null;
        }
        this.P3 = t0Var.d(kVar.i4());
        ContainerConfig containerConfig = this.f72195p2;
        boolean zU = containerConfig != null ? containerConfig.u() : false;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[initFragmentSetting]\nuseChannelHint: ");
        sb2.append(zU);
        sb2.append("\nsearchHint: ");
        com.max.hbsearch.k kVar3 = this.J3;
        if (kVar3 == null) {
            kotlin.jvm.internal.f0.S("mSearchFragment");
            kVar3 = null;
        }
        sb2.append(kVar3.j4());
        sb2.append("\ncacheKey: ");
        com.max.hbsearch.k kVar4 = this.J3;
        if (kVar4 == null) {
            kotlin.jvm.internal.f0.S("mSearchFragment");
            kVar4 = null;
        }
        sb2.append(kVar4.Y3());
        sb2.append("\nmSearchFragment: ");
        com.max.hbsearch.k kVar5 = this.J3;
        if (kVar5 == null) {
            kotlin.jvm.internal.f0.S("mSearchFragment");
            kVar5 = null;
        }
        sb2.append(kVar5);
        Log.d("SearchNewFragment-dbg", sb2.toString());
        if (zU) {
            p6(this.mContext.getString(R.string.search_all_hint));
        } else {
            com.max.hbsearch.k kVar6 = this.J3;
            if (kVar6 == null) {
                kotlin.jvm.internal.f0.S("mSearchFragment");
                kVar6 = null;
            }
            p6(kVar6.j4());
        }
        com.max.hbsearch.k kVar7 = this.J3;
        if (kVar7 == null) {
            kotlin.jvm.internal.f0.S("mSearchFragment");
            kVar7 = null;
        }
        String strY4 = kVar7.Y3();
        if (strY4 == null || strY4.length() == 0) {
            strY3 = "search_history";
        } else {
            com.max.hbsearch.k kVar8 = this.J3;
            if (kVar8 == null) {
                kotlin.jvm.internal.f0.S("mSearchFragment");
            } else {
                kVar2 = kVar8;
            }
            strY3 = kVar2.Y3();
            kotlin.jvm.internal.f0.m(strY3);
        }
        this.f72196p3 = strY3;
    }

    public static final /* synthetic */ void b5(SearchNewFragment searchNewFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{searchNewFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.k.f33748o4, new Class[]{SearchNewFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        searchNewFragment.I5(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b6(SearchNewFragment this$0) {
        Activity mContext;
        if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, 8100, new Class[]{SearchNewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        if (!this$0.isActive() || (mContext = this$0.mContext) == null) {
            return;
        }
        kotlin.jvm.internal.f0.o(mContext, "mContext");
        EditText editText = this$0.G2;
        if (editText == null) {
            kotlin.jvm.internal.f0.S("mSearchEditText");
            editText = null;
        }
        this$0.v6(mContext, editText);
    }

    private final ImageView c6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.F3, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = new ImageView(this.mContext);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewUtils.f(this.mContext, 10.0f), ViewUtils.f(this.mContext, 10.0f));
        layoutParams.gravity = 16;
        layoutParams.setMargins(0, 0, ViewUtils.f(this.mContext, 10.0f), 0);
        imageView.setLayoutParams(layoutParams);
        imageView.setColorFilter(this.mContext.getColor(R.color.text_secondary_1_color));
        imageView.setImageResource(R.drawable.common_close_line_24x24);
        return imageView;
    }

    private final boolean d6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33424a3, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        ContainerConfig containerConfig = this.f72195p2;
        if (containerConfig != null) {
            return containerConfig.r();
        }
        t0 t0Var = t0.f72375a;
        com.max.hbsearch.k kVar = this.J3;
        if (kVar == null) {
            kotlin.jvm.internal.f0.S("mSearchFragment");
            kVar = null;
        }
        return t0Var.c(kVar.i4());
    }

    private final void e6(KeyDescObj keyDescObj, List<? extends KeyDescObj> list) {
        if (PatchProxy.proxy(new Object[]{keyDescObj, list}, this, changeQuickRedirect, false, bb.c.k.H3, new Class[]{KeyDescObj.class, List.class}, Void.TYPE).isSupported || keyDescObj == null) {
            return;
        }
        if (this.Z3) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!kotlin.jvm.internal.f0.g(((KeyDescObj) obj).getValue(), keyDescObj.getValue())) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                I5(false);
            }
            D6(arrayList, true);
            l6(keyDescObj);
            return;
        }
        String protocol = keyDescObj.getProtocol();
        String value = keyDescObj.getValue();
        String icon = keyDescObj.getIcon();
        if (protocol == null || protocol.length() == 0) {
            s1(new KeyDescObj(value, protocol, icon), com.max.hbsearch.l.R);
            return;
        }
        pb.p pVarP = ob.a.p();
        Activity mContext = this.mContext;
        kotlin.jvm.internal.f0.o(mContext, "mContext");
        kotlin.jvm.internal.f0.m(protocol);
        pVarP.c(mContext, protocol);
        v1(value, protocol, icon);
    }

    @SuppressLint({"AutoDispose"})
    private final void g6() {
        io.reactivex.z<Result<SearchHotWelcomeObj>> zVarI5;
        io.reactivex.z<Result<SearchHotWelcomeObj>> zVarA4;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33770p3, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ContainerConfig containerConfig = this.f72195p2;
        j jVar = null;
        HotWordTypeV2 hotWordTypeV2N = containerConfig != null ? containerConfig.n() : null;
        nd.a aVarA = nd.b.a();
        if (aVarA != null) {
            io.reactivex.z<Result<SearchHotWelcomeObj>> zVarB = aVarA.b(hotWordTypeV2N != null ? hotWordTypeV2N.getValue() : null, this.T);
            if (zVarB != null && (zVarI5 = zVarB.I5(io.reactivex.schedulers.b.d())) != null && (zVarA4 = zVarI5.a4(io.reactivex.android.schedulers.a.c())) != null) {
                jVar = (j) zVarA4.J5(new j());
            }
        }
        addDisposable(jVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"AutoDispose"})
    private final void h6() {
        io.reactivex.z<Result<SearchHotwordsObj>> zVarI5;
        io.reactivex.z<Result<SearchHotwordsObj>> zVarA4;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33747o3, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ContainerConfig containerConfig = this.f72195p2;
        objectRef.f124891b = containerConfig != null ? containerConfig.n() : 0;
        nd.a aVarA = nd.b.a();
        if (aVarA != null) {
            HotWordTypeV2 hotWordTypeV2 = (HotWordTypeV2) objectRef.f124891b;
            io.reactivex.z<Result<SearchHotwordsObj>> zVarE = aVarA.e(hotWordTypeV2 != null ? hotWordTypeV2.getValue() : null, this.T);
            if (zVarE == null || (zVarI5 = zVarE.I5(io.reactivex.schedulers.b.d())) == null || (zVarA4 = zVarI5.a4(io.reactivex.android.schedulers.a.c())) == null) {
                return;
            }
            zVarA4.g(new k(objectRef));
        }
    }

    @SuppressLint({"AutoDispose"})
    private final void i6(boolean z10, String str) {
        nd.a aVarA;
        io.reactivex.z<Result<SearchFoundObj>> zVarI5;
        io.reactivex.z<Result<SearchFoundObj>> zVarA4;
        HotWordTypeV2 hotWordTypeV2N;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), str}, this, changeQuickRedirect, false, bb.c.k.f33701m3, new Class[]{Boolean.TYPE, String.class}, Void.TYPE).isSupported || (aVarA = nd.b.a()) == null) {
            return;
        }
        ContainerConfig containerConfig = this.f72195p2;
        io.reactivex.z<Result<SearchFoundObj>> zVarA = aVarA.a((containerConfig == null || (hotWordTypeV2N = containerConfig.n()) == null) ? null : hotWordTypeV2N.getValue(), z10, str);
        if (zVarA == null || (zVarI5 = zVarA.I5(io.reactivex.schedulers.b.d())) == null || (zVarA4 = zVarI5.a4(io.reactivex.android.schedulers.a.c())) == null) {
            return;
        }
        zVarA4.g(new l(z10));
    }

    static /* synthetic */ void j6(SearchNewFragment searchNewFragment, boolean z10, String str, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{searchNewFragment, new Byte(z10 ? (byte) 1 : (byte) 0), str, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.k.f33724n3, new Class[]{SearchNewFragment.class, Boolean.TYPE, String.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        searchNewFragment.i6(z10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k6(SearchNewFragment this$0) {
        if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, bb.c.k.Z3, new Class[]{SearchNewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        PopupWindow popupWindow = this$0.N3;
        if (popupWindow == null || this$0.f72209y2 == null) {
            return;
        }
        kotlin.jvm.internal.f0.m(popupWindow);
        if (popupWindow.isShowing() && this$0.P3) {
            ViewUtils.q0(this$0.N3, this$0.f72209y2, 0, 0);
        }
    }

    @SuppressLint({"AutoDispose"})
    private final void l6(KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{keyDescObj}, this, changeQuickRedirect, false, bb.c.k.M3, new Class[]{KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        String str = this.f72196p3;
        if (str == null) {
            kotlin.jvm.internal.f0.S("mSearchCacheKey");
            str = null;
        }
        com.max.hbcache.b.g("search_history", str, KeyDescObj.class).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new m(keyDescObj, this));
    }

    private final void m6(String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.k.f33947x3, new Class[]{String.class, Boolean.TYPE}, Void.TYPE).isSupported || str == null) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("key", str);
        com.max.hbcommon.analytics.d.d("4", z10 ? lb.d.f131267v : lb.d.f131281x, null, jsonObject);
    }

    private final synchronized void n6(String str, HotSearchItemObj hotSearchItemObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, hotSearchItemObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.k.f33969y3, new Class[]{String.class, HotSearchItemObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (hotSearchItemObj != null) {
            hotSearchItemObj.setType(str);
            if (!z10) {
                if (this.U3.contains(hotSearchItemObj)) {
                    return;
                } else {
                    this.U3.add(hotSearchItemObj);
                }
            }
            JsonObject report_extra = hotSearchItemObj.getReport_extra();
            if (report_extra == null) {
                report_extra = new JsonObject();
            }
            report_extra.addProperty("card_type", str);
            com.max.hbcommon.analytics.d.d(z10 ? "4" : "3", lb.d.f131295z, null, report_extra);
        }
    }

    private final void o6() {
        int iFindFirstVisibleItemPosition;
        int iFindLastVisibleItemPosition;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.B3, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        try {
            ArrayList<SearchSuggestionV2Obj> arrayList = new ArrayList();
            RecyclerView recyclerView = this.O3;
            RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null && (iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()) <= (iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition())) {
                while (true) {
                    View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                    if (viewFindViewByPosition != null) {
                        Object tag = viewFindViewByPosition.getTag();
                        SearchSuggestionV2Obj searchSuggestionV2Obj = tag instanceof SearchSuggestionV2Obj ? (SearchSuggestionV2Obj) tag : null;
                        if (searchSuggestionV2Obj != null) {
                            arrayList.add(searchSuggestionV2Obj);
                        }
                    }
                    if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                        break;
                    } else {
                        iFindFirstVisibleItemPosition++;
                    }
                }
            }
            if (com.max.hbcommon.utils.c.w(arrayList)) {
                return;
            }
            for (SearchSuggestionV2Obj searchSuggestionV2Obj2 : arrayList) {
                if (!this.V3.contains(searchSuggestionV2Obj2)) {
                    this.V3.add(searchSuggestionV2Obj2);
                    JsonObject report_extra = searchSuggestionV2Obj2.getReport_extra();
                    com.max.hbcommon.analytics.d.d("3", lb.d.D, null, report_extra != null ? report_extra.deepCopy() : null);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private final void p6(String str) {
        EditText editText;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.k.J2, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.T3 = str;
        if (!isActive() || (editText = this.G2) == null) {
            return;
        }
        if (editText == null) {
            kotlin.jvm.internal.f0.S("mSearchEditText");
            editText = null;
        }
        editText.setHint(str);
    }

    private final void q6(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.k.U2, new Class[]{String.class}, Void.TYPE).isSupported || kotlin.jvm.internal.f0.g(r(), str)) {
            return;
        }
        this.L3 = str;
        EditText editText = this.G2;
        EditText editText2 = null;
        if (editText == null) {
            kotlin.jvm.internal.f0.S("mSearchEditText");
            editText = null;
        }
        editText.setText(str);
        if (com.max.hbcommon.utils.c.u(str)) {
            return;
        }
        EditText editText3 = this.G2;
        if (editText3 == null) {
            kotlin.jvm.internal.f0.S("mSearchEditText");
        } else {
            editText2 = editText3;
        }
        int i10 = this.f72197q;
        kotlin.jvm.internal.f0.m(str);
        editText2.setSelection(Math.min(i10, str.length()));
    }

    public static final /* synthetic */ void r5(SearchNewFragment searchNewFragment, String str) {
        if (PatchProxy.proxy(new Object[]{searchNewFragment, str}, null, changeQuickRedirect, true, bb.c.k.f33702m4, new Class[]{SearchNewFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        searchNewFragment.R5(str);
    }

    private final void r6(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.k.X2, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        androidx.fragment.app.p0 p0VarU = getChildFragmentManager().u();
        kotlin.jvm.internal.f0.o(p0VarU, "beginTransaction(...)");
        if (z10) {
            Fragment fragment = this.S3;
            kotlin.jvm.internal.f0.m(fragment);
            p0VarU.P(fragment);
        } else {
            Fragment fragment2 = this.S3;
            kotlin.jvm.internal.f0.m(fragment2);
            p0VarU.u(fragment2);
        }
        p0VarU.n();
        getChildFragmentManager().n0();
    }

    private final void s6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.I3, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.mContext).y(this.mContext.getString(R.string.clear_all_search_history_alert)).u("确认", new DialogInterface.OnClickListener() { // from class: com.max.hbsearch.t
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                SearchNewFragment.t6(this.f72374b, dialogInterface, i10);
            }
        }).o(this.mContext.getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: com.max.hbsearch.u
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                SearchNewFragment.u6(dialogInterface, i10);
            }
        }).F();
    }

    public static final /* synthetic */ void t5(SearchNewFragment searchNewFragment) {
        if (PatchProxy.proxy(new Object[]{searchNewFragment}, null, changeQuickRedirect, true, bb.c.k.f33725n4, new Class[]{SearchNewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        searchNewFragment.S5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t6(SearchNewFragment this$0, DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{this$0, dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.f33633j4, new Class[]{SearchNewFragment.class, DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.I5(false);
        String str = this$0.f72196p3;
        if (str == null) {
            kotlin.jvm.internal.f0.S("mSearchCacheKey");
            str = null;
        }
        com.max.hbcache.b.j("search_history", str, new ArrayList());
        E6(this$0, null, false, 2, null);
        dialogInterface.dismiss();
    }

    public static final /* synthetic */ void u5(SearchNewFragment searchNewFragment, String str, HotSearchItemObj hotSearchItemObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{searchNewFragment, str, hotSearchItemObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.k.f33794q4, new Class[]{SearchNewFragment.class, String.class, HotSearchItemObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        searchNewFragment.n6(str, hotSearchItemObj, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u6(DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.f33656k4, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        dialogInterface.dismiss();
    }

    public static final /* synthetic */ void v5(SearchNewFragment searchNewFragment) {
        if (PatchProxy.proxy(new Object[]{searchNewFragment}, null, changeQuickRedirect, true, bb.c.k.f33838s4, new Class[]{SearchNewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        searchNewFragment.o6();
    }

    private final void v6(Context context, View view) {
        if (PatchProxy.proxy(new Object[]{context, view}, this, changeQuickRedirect, false, bb.c.k.Q3, new Class[]{Context.class, View.class}, Void.TYPE).isSupported || view == null || !view.requestFocus()) {
            return;
        }
        Object systemService = context.getSystemService("input_method");
        kotlin.jvm.internal.f0.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(view, 1);
    }

    private final void w6() {
        List<AdsBannerObj> ads_banner;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33991z3, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ContainerConfig containerConfig = this.f72195p2;
        BannerViewPager<AdsBannerObj> bannerViewPager = null;
        if (L2(containerConfig)) {
            ads_banner = com.max.hbsearch.o.f72357a.d();
        } else {
            SearchHotwordsObj searchHotwordsObj = com.max.hbsearch.o.f72358b;
            ads_banner = searchHotwordsObj != null ? searchHotwordsObj.getAds_banner() : null;
        }
        if (containerConfig != null) {
            if (containerConfig.p()) {
                BannerViewPager<AdsBannerObj> bannerViewPager2 = this.f72202v;
                if (bannerViewPager2 == null) {
                    kotlin.jvm.internal.f0.S("mBanner");
                } else {
                    bannerViewPager = bannerViewPager2;
                }
                com.max.hbcommon.utils.b.f(bannerViewPager, ads_banner);
                return;
            }
            BannerViewPager<AdsBannerObj> bannerViewPager3 = this.f72202v;
            if (bannerViewPager3 == null) {
                kotlin.jvm.internal.f0.S("mBanner");
                bannerViewPager3 = null;
            }
            com.max.hbcommon.utils.b.f(bannerViewPager3, null);
            return;
        }
        t0 t0Var = t0.f72375a;
        com.max.hbsearch.k kVar = this.J3;
        if (kVar == null) {
            kotlin.jvm.internal.f0.S("mSearchFragment");
            kVar = null;
        }
        if (t0Var.e(kVar.i4())) {
            BannerViewPager<AdsBannerObj> bannerViewPager4 = this.f72202v;
            if (bannerViewPager4 == null) {
                kotlin.jvm.internal.f0.S("mBanner");
            } else {
                bannerViewPager = bannerViewPager4;
            }
            com.max.hbcommon.utils.b.f(bannerViewPager, ads_banner);
            return;
        }
        BannerViewPager<AdsBannerObj> bannerViewPager5 = this.f72202v;
        if (bannerViewPager5 == null) {
            kotlin.jvm.internal.f0.S("mBanner");
            bannerViewPager5 = null;
        }
        com.max.hbcommon.utils.b.f(bannerViewPager5, null);
    }

    private final void x6(HotSearchObj hotSearchObj, boolean z10, int i10) {
        if (PatchProxy.proxy(new Object[]{hotSearchObj, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.f33793q3, new Class[]{HotSearchObj.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        View view = null;
        if ((hotSearchObj != null ? hotSearchObj.getList() : null) == null) {
            View view2 = this.L;
            if (view2 == null) {
                kotlin.jvm.internal.f0.S("cv_search_hot_hashtag_v2");
            } else {
                view = view2;
            }
            view.setVisibility(8);
            return;
        }
        TextView textView = this.Q;
        if (textView == null) {
            kotlin.jvm.internal.f0.S("tv_hot_tag_v2");
            textView = null;
        }
        textView.setText(hotSearchObj.getName());
        List<HotSearchItemObj> list = hotSearchObj.getList();
        kotlin.jvm.internal.f0.m(list);
        LinearLayout linearLayout = this.K;
        if (linearLayout == null) {
            kotlin.jvm.internal.f0.S("ll_search_hot_hashtag_v2");
            linearLayout = null;
        }
        C5(list, linearLayout, hotSearchObj.getType());
        View view3 = this.L;
        if (view3 == null) {
            kotlin.jvm.internal.f0.S("cv_search_hot_hashtag_v2");
            view3 = null;
        }
        view3.getLayoutParams().width = i10;
        ImageView imageView = this.O;
        if (imageView == null) {
            kotlin.jvm.internal.f0.S("iv_hot_tag_bg_v2");
            imageView = null;
        }
        imageView.getLayoutParams().width = i10;
        View view4 = this.L;
        if (view4 == null) {
            kotlin.jvm.internal.f0.S("cv_search_hot_hashtag_v2");
        } else {
            view = view4;
        }
        view.setVisibility(0);
    }

    private final void y6(HotSearchObj hotSearchObj, boolean z10, int i10) {
        if (PatchProxy.proxy(new Object[]{hotSearchObj, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.f33837s3, new Class[]{HotSearchObj.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        CardView cardView = null;
        if ((hotSearchObj != null ? hotSearchObj.getList() : null) == null) {
            CardView cardView2 = this.J;
            if (cardView2 == null) {
                kotlin.jvm.internal.f0.S("cv_search_hot_words_v2");
            } else {
                cardView = cardView2;
            }
            cardView.setVisibility(8);
            return;
        }
        TextView textView = this.P;
        if (textView == null) {
            kotlin.jvm.internal.f0.S("tv_hot_search_v2");
            textView = null;
        }
        textView.setText(hotSearchObj.getName());
        List<HotSearchItemObj> list = hotSearchObj.getList();
        kotlin.jvm.internal.f0.m(list);
        LinearLayout linearLayout = this.M;
        if (linearLayout == null) {
            kotlin.jvm.internal.f0.S("mSearchHotWordsLinearLayout_v2");
            linearLayout = null;
        }
        C5(list, linearLayout, hotSearchObj.getType());
        CardView cardView3 = this.J;
        if (cardView3 == null) {
            kotlin.jvm.internal.f0.S("cv_search_hot_words_v2");
            cardView3 = null;
        }
        ViewGroup.LayoutParams layoutParams = cardView3.getLayoutParams();
        layoutParams.width = i10;
        cardView3.setLayoutParams(layoutParams);
        CardView cardView4 = this.J;
        if (cardView4 == null) {
            kotlin.jvm.internal.f0.S("cv_search_hot_words_v2");
        } else {
            cardView = cardView4;
        }
        cardView.setVisibility(0);
    }

    static /* synthetic */ void z6(SearchNewFragment searchNewFragment, HotSearchObj hotSearchObj, boolean z10, int i10, int i11, Object obj) {
        Object[] objArr = {searchNewFragment, hotSearchObj, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.f33859t3, new Class[]{SearchNewFragment.class, HotSearchObj.class, Boolean.TYPE, cls, cls, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i11 & 2) != 0) {
            z10 = true;
        }
        searchNewFragment.y6(hotSearchObj, z10, i10);
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment
    public void A4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.K2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.A4();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f72208y1 = arguments.getBundle(f72179c4);
            this.f72192c0 = arguments.getString("q");
            Bundle bundle = this.f72208y1;
            this.f72194p1 = bundle != null ? bundle.getString("quick_from") : null;
            Bundle bundle2 = this.f72208y1;
            this.T = bundle2 != null ? bundle2.getString("topic_id") : null;
            Bundle bundle3 = this.f72208y1;
            ContainerConfig containerConfig = bundle3 != null ? (ContainerConfig) bundle3.getParcelable(f72183g4) : null;
            this.f72195p2 = containerConfig instanceof ContainerConfig ? containerConfig : null;
            Bundle bundle4 = this.f72208y1;
            this.X3 = bundle4 != null ? bundle4.getBoolean(f72180d4, this.X3) : this.X3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x038d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0390  */
    /* JADX WARN: Code duplicated, block: B:107:0x039a  */
    /* JADX WARN: Code duplicated, block: B:124:0x03b4 A[EDGE_INSN: B:124:0x03b4->B:111:0x03b4 BREAK  A[LOOP:0: B:26:0x00fd->B:109:0x03a0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0252  */
    /* JADX WARN: Code duplicated, block: B:61:0x0271  */
    /* JADX WARN: Code duplicated, block: B:64:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:72:0x0303  */
    /* JADX WARN: Code duplicated, block: B:74:0x0309  */
    /* JADX WARN: Code duplicated, block: B:76:0x030d  */
    /* JADX WARN: Code duplicated, block: B:80:0x031a  */
    /* JADX WARN: Code duplicated, block: B:82:0x033f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0348  */
    /* JADX WARN: Code duplicated, block: B:88:0x034b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0357  */
    /* JADX WARN: Code duplicated, block: B:94:0x0363  */
    /* JADX WARN: Code duplicated, block: B:96:0x0379  */
    /* JADX WARN: Code duplicated, block: B:98:0x0384  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v45, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r12v8, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r18v0, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r2v23, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r6v24, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v6 */
    public final void D6(@dl.e final List<? extends KeyDescObj> list, boolean z10) {
        LinearLayout linearLayout;
        String str;
        LinearLayout linearLayout2;
        int i10;
        ImageView imageView;
        float f10;
        int iMin;
        boolean z11;
        int iU;
        ?? r10;
        ImageView imageView2;
        byte b10;
        boolean z12;
        LinearLayout linearLayout3;
        boolean z13;
        LinearLayout linearLayout4;
        ?? r11;
        LinearLayout linearLayout5;
        if (PatchProxy.proxy(new Object[]{list, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.k.D3, new Class[]{List.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        String str2 = "ll_search_history";
        if (list == null || list.isEmpty()) {
            LinearLayout linearLayout6 = this.f72203w;
            if (linearLayout6 == null) {
                kotlin.jvm.internal.f0.S("ll_search_history");
                linearLayout = null;
            } else {
                linearLayout = linearLayout6;
            }
            linearLayout.setVisibility(8);
            return;
        }
        LinearLayout linearLayout7 = this.f72203w;
        if (linearLayout7 == null) {
            kotlin.jvm.internal.f0.S("ll_search_history");
            linearLayout7 = null;
        }
        linearLayout7.removeAllViews();
        LayoutInflater layoutInflater = this.mInflater;
        int i11 = R.layout.hbsearch_item_search_history_header;
        LinearLayout linearLayout8 = this.f72203w;
        if (linearLayout8 == null) {
            kotlin.jvm.internal.f0.S("ll_search_history");
            linearLayout8 = null;
        }
        View viewInflate = layoutInflater.inflate(i11, (ViewGroup) linearLayout8, false);
        final View viewFindViewById = viewInflate.findViewById(R.id.vg_clear);
        View viewFindViewById2 = viewInflate.findViewById(R.id.v_vg_clear_delegate);
        View viewFindViewById3 = viewInflate.findViewById(R.id.vg_clear_action);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbsearch.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchNewFragment.F6(this.f72287b, list, view);
            }
        });
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbsearch.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchNewFragment.G6(viewFindViewById, view);
            }
        });
        ((TextView) viewFindViewById3.findViewById(R.id.tv_clear_all)).setOnClickListener(new View.OnClickListener() { // from class: com.max.hbsearch.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchNewFragment.H6(this.f72290b, view);
            }
        });
        ((TextView) viewFindViewById3.findViewById(R.id.tv_done_clear_action)).setOnClickListener(new View.OnClickListener() { // from class: com.max.hbsearch.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchNewFragment.I6(this.f72292b, list, view);
            }
        });
        LinearLayout linearLayout9 = this.f72203w;
        if (linearLayout9 == null) {
            kotlin.jvm.internal.f0.S("ll_search_history");
            linearLayout9 = null;
        }
        linearLayout9.addView(viewInflate);
        I5(this.Z3);
        int iF = ViewUtils.f(this.mContext, 8.0f);
        int iF2 = ViewUtils.f(this.mContext, 40.0f);
        int iF3 = ViewUtils.f(this.mContext, 30.0f);
        int iL = ViewUtils.L(this.mContext) - ViewUtils.f(this.mContext, 24.0f);
        LinearLayout linearLayout10 = new LinearLayout(this.mContext);
        linearLayout10.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, iF);
        linearLayout10.setLayoutParams(layoutParams);
        LinearLayout linearLayout11 = this.f72203w;
        ViewGroup viewGroup = linearLayout11;
        if (linearLayout11 == null) {
            kotlin.jvm.internal.f0.S("ll_search_history");
            viewGroup = null;
        }
        viewGroup.addView(linearLayout10);
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        ?? r12 = linearLayout10;
        while (true) {
            if (i13 >= size) {
                str = str2;
                break;
            }
            final KeyDescObj keyDescObj = (KeyDescObj) CollectionsKt___CollectionsKt.R2(list, i13);
            String value = list.get(i13).getValue();
            String icon = list.get(i13).getIcon();
            int i14 = size;
            TextView textView = new TextView(this.mContext);
            ?? r18 = r12;
            ?? linearLayout12 = new LinearLayout(this.mContext);
            str = str2;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            if (com.max.accelworld.h.a(value) > 16) {
                value = com.max.accelworld.h.e(value, 16) + "...";
            }
            layoutParams2.gravity = 16;
            if (i13 == 0) {
                layoutParams2.setMargins(0, 0, 0, 0);
            } else {
                layoutParams2.setMargins(iF, 0, 0, 0);
            }
            linearLayout12.setLayoutParams(layoutParams2);
            ImageView imageView3 = new ImageView(this.mContext);
            int i15 = i12;
            int i16 = iF;
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(ViewUtils.f(this.mContext, 15.0f), ViewUtils.f(this.mContext, 15.0f));
            layoutParams3.setMargins(0, 0, this.Z3 ? ViewUtils.f(this.mContext, 4.0f) : ViewUtils.f(this.mContext, 10.0f), 0);
            layoutParams3.gravity = 16;
            imageView3.setLayoutParams(layoutParams3);
            ImageView imageViewC6 = c6();
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams4.gravity = 16;
            textView.setLayoutParams(layoutParams4);
            textView.setMinWidth(iF2);
            textView.setMinHeight(iF3);
            textView.setGravity(17);
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.text_size_12));
            textView.setTextColor(getResources().getColor(R.color.text_primary_1_color));
            int iF4 = ViewUtils.f(this.mContext, 12.0f);
            int iF5 = ViewUtils.f(this.mContext, 4.0f);
            Activity activity = this.mContext;
            if (icon == null || icon.length() == 0) {
                imageView = imageViewC6;
                if (!this.Z3) {
                    f10 = 12.0f;
                }
                textView.setPadding(iF4, iF5, ViewUtils.f(activity, f10), ViewUtils.f(this.mContext, 4.0f));
                textView.setText(value);
                linearLayout12.setBackground(com.max.hbutils.utils.q.v(getContext(), androidx.core.content.d.f(this.mContext, R.color.divider_secondary_1_color), 3.0f));
                linearLayout12.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbsearch.j0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SearchNewFragment.J6(this.f72296b, keyDescObj, list, view);
                    }
                });
                iMin = Math.min(fi.u.u(E5(textView.getPaint(), value, icon), iF2), iL);
                if (i13 != 0) {
                    iMin += i16;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("[updateSearchHistory]\ntext: ");
                sb2.append(value);
                sb2.append("\nhasIcon: ");
                if (icon != null || icon.length() == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                sb2.append(!z11);
                sb2.append("\ncur needWidth: ");
                sb2.append(iMin);
                sb2.append("\nusedWidth: ");
                sb2.append(i15);
                sb2.append("\nmaxWidth: ");
                sb2.append(iL);
                sb2.append(", targetWidth: ");
                iU = iMin + i15;
                sb2.append(iU);
                Log.d("SearchNew-dbg", sb2.toString());
                if (!z10) {
                    linearLayout5 = this.f72203w;
                    if (linearLayout5 == null) {
                        kotlin.jvm.internal.f0.S(str);
                        linearLayout5 = null;
                    }
                    if (linearLayout5.getChildCount() != 3 && iU + i16 + iF3 > iL) {
                        ImageView imageView4 = new ImageView(this.mContext);
                        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(iF3, iF3);
                        layoutParams5.gravity = 16;
                        imageView4.setLayoutParams(layoutParams5);
                        layoutParams5.setMargins(i16, 0, 0, 0);
                        int iF6 = ViewUtils.f(this.mContext, 3.0f);
                        imageView4.setPadding(iF6, iF6, iF6, iF6);
                        imageView4.setColorFilter(this.mContext.getResources().getColor(R.color.text_secondary_1_color));
                        imageView4.setImageResource(R.drawable.special_down_small_line_24x24);
                        imageView4.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbsearch.k0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                SearchNewFragment.K6(this.f72317b, list, view);
                            }
                        });
                        imageView4.setBackgroundResource(R.drawable.divider_color_2dp);
                        r18.addView(imageView4);
                        break;
                    }
                    r10 = r18;
                    if (iU > iL) {
                        linearLayout3 = this.f72203w;
                        if (linearLayout3 == null) {
                            kotlin.jvm.internal.f0.S(str);
                            linearLayout3 = null;
                        }
                        if (linearLayout3.getChildCount() >= 6) {
                            break;
                            break;
                        }
                        ?? linearLayout13 = new LinearLayout(this.mContext);
                        linearLayout13.setOrientation(0);
                        b10 = -2;
                        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams6.setMargins(0, 0, 0, i16);
                        linearLayout13.setLayoutParams(layoutParams6);
                        linearLayout12.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                        linearLayout12.addView(textView);
                        if (icon != null) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (!z13) {
                            com.max.hbimage.b.K(icon, imageView3);
                            linearLayout12.addView(imageView3);
                        }
                        if (this.Z3) {
                            linearLayout12.addView(imageView);
                        }
                        linearLayout13.addView(linearLayout12);
                        linearLayout4 = this.f72203w;
                        r11 = linearLayout4;
                        if (linearLayout4 == null) {
                            kotlin.jvm.internal.f0.S(str);
                            r11 = 0;
                        }
                        r11.addView(linearLayout13);
                        r10 = linearLayout13;
                        iU = fi.u.u(E5(textView.getPaint(), value, icon), iF2);
                    } else {
                        imageView2 = imageView;
                        b10 = -2;
                        linearLayout12.addView(textView);
                        if (icon != null) {
                            z12 = true;
                        } else {
                            z12 = true;
                        }
                        if (!z12) {
                            com.max.hbimage.b.K(icon, imageView3);
                            linearLayout12.addView(imageView3);
                        }
                        if (this.Z3) {
                            linearLayout12.addView(imageView2);
                        }
                        r10.addView(linearLayout12);
                    }
                    i13++;
                    size = i14;
                    str2 = str;
                    i12 = iU;
                    iF = i16;
                    r12 = r10;
                } else {
                    r10 = r18;
                    if (iU > iL) {
                        linearLayout3 = this.f72203w;
                        if (linearLayout3 == null) {
                            kotlin.jvm.internal.f0.S(str);
                            linearLayout3 = null;
                        }
                        if (linearLayout3.getChildCount() >= 6) {
                            break;
                        }
                        ?? linearLayout14 = new LinearLayout(this.mContext);
                        linearLayout14.setOrientation(0);
                        b10 = -2;
                        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams7.setMargins(0, 0, 0, i16);
                        linearLayout14.setLayoutParams(layoutParams7);
                        linearLayout12.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                        linearLayout12.addView(textView);
                        if (icon != null || icon.length() == 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            com.max.hbimage.b.K(icon, imageView3);
                            linearLayout12.addView(imageView3);
                        }
                        if (this.Z3) {
                            linearLayout12.addView(imageView);
                        }
                        linearLayout14.addView(linearLayout12);
                        linearLayout4 = this.f72203w;
                        r11 = linearLayout4;
                        if (linearLayout4 == null) {
                            kotlin.jvm.internal.f0.S(str);
                            r11 = 0;
                        }
                        r11.addView(linearLayout14);
                        r10 = linearLayout14;
                        iU = fi.u.u(E5(textView.getPaint(), value, icon), iF2);
                    } else {
                        imageView2 = imageView;
                        b10 = -2;
                        linearLayout12.addView(textView);
                        if (icon != null || icon.length() == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            com.max.hbimage.b.K(icon, imageView3);
                            linearLayout12.addView(imageView3);
                        }
                        if (this.Z3) {
                            linearLayout12.addView(imageView2);
                        }
                        r10.addView(linearLayout12);
                    }
                    i13++;
                    size = i14;
                    str2 = str;
                    i12 = iU;
                    iF = i16;
                    r12 = r10;
                }
            } else {
                imageView = imageViewC6;
            }
            f10 = 4.0f;
            textView.setPadding(iF4, iF5, ViewUtils.f(activity, f10), ViewUtils.f(this.mContext, 4.0f));
            textView.setText(value);
            linearLayout12.setBackground(com.max.hbutils.utils.q.v(getContext(), androidx.core.content.d.f(this.mContext, R.color.divider_secondary_1_color), 3.0f));
            linearLayout12.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbsearch.j0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchNewFragment.J6(this.f72296b, keyDescObj, list, view);
                }
            });
            iMin = Math.min(fi.u.u(E5(textView.getPaint(), value, icon), iF2), iL);
            if (i13 != 0) {
                iMin += i16;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("[updateSearchHistory]\ntext: ");
            sb3.append(value);
            sb3.append("\nhasIcon: ");
            if (icon != null) {
                z11 = true;
            } else {
                z11 = true;
            }
            sb3.append(!z11);
            sb3.append("\ncur needWidth: ");
            sb3.append(iMin);
            sb3.append("\nusedWidth: ");
            sb3.append(i15);
            sb3.append("\nmaxWidth: ");
            sb3.append(iL);
            sb3.append(", targetWidth: ");
            iU = iMin + i15;
            sb3.append(iU);
            Log.d("SearchNew-dbg", sb3.toString());
            if (!z10) {
                r10 = r18;
                if (iU > iL) {
                    linearLayout3 = this.f72203w;
                    if (linearLayout3 == null) {
                        kotlin.jvm.internal.f0.S(str);
                        linearLayout3 = null;
                    }
                    if (linearLayout3.getChildCount() >= 6) {
                        break;
                        break;
                    }
                    ?? linearLayout15 = new LinearLayout(this.mContext);
                    linearLayout15.setOrientation(0);
                    b10 = -2;
                    LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams8.setMargins(0, 0, 0, i16);
                    linearLayout15.setLayoutParams(layoutParams8);
                    linearLayout12.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    linearLayout12.addView(textView);
                    if (icon != null) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (!z13) {
                        com.max.hbimage.b.K(icon, imageView3);
                        linearLayout12.addView(imageView3);
                    }
                    if (this.Z3) {
                        linearLayout12.addView(imageView);
                    }
                    linearLayout15.addView(linearLayout12);
                    linearLayout4 = this.f72203w;
                    r11 = linearLayout4;
                    if (linearLayout4 == null) {
                        kotlin.jvm.internal.f0.S(str);
                        r11 = 0;
                    }
                    r11.addView(linearLayout15);
                    r10 = linearLayout15;
                    iU = fi.u.u(E5(textView.getPaint(), value, icon), iF2);
                } else {
                    imageView2 = imageView;
                    b10 = -2;
                    linearLayout12.addView(textView);
                    if (icon != null) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (!z12) {
                        com.max.hbimage.b.K(icon, imageView3);
                        linearLayout12.addView(imageView3);
                    }
                    if (this.Z3) {
                        linearLayout12.addView(imageView2);
                    }
                    r10.addView(linearLayout12);
                }
                i13++;
                size = i14;
                str2 = str;
                i12 = iU;
                iF = i16;
                r12 = r10;
            } else {
                linearLayout5 = this.f72203w;
                if (linearLayout5 == null) {
                    kotlin.jvm.internal.f0.S(str);
                    linearLayout5 = null;
                }
                if (linearLayout5.getChildCount() != 3) {
                    r10 = r18;
                    if (iU > iL) {
                        linearLayout3 = this.f72203w;
                        if (linearLayout3 == null) {
                            kotlin.jvm.internal.f0.S(str);
                            linearLayout3 = null;
                        }
                        if (linearLayout3.getChildCount() >= 6) {
                            break;
                            break;
                        }
                        ?? linearLayout16 = new LinearLayout(this.mContext);
                        linearLayout16.setOrientation(0);
                        b10 = -2;
                        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams9.setMargins(0, 0, 0, i16);
                        linearLayout16.setLayoutParams(layoutParams9);
                        linearLayout12.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                        linearLayout12.addView(textView);
                        if (icon != null) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (!z13) {
                            com.max.hbimage.b.K(icon, imageView3);
                            linearLayout12.addView(imageView3);
                        }
                        if (this.Z3) {
                            linearLayout12.addView(imageView);
                        }
                        linearLayout16.addView(linearLayout12);
                        linearLayout4 = this.f72203w;
                        r11 = linearLayout4;
                        if (linearLayout4 == null) {
                            kotlin.jvm.internal.f0.S(str);
                            r11 = 0;
                        }
                        r11.addView(linearLayout16);
                        r10 = linearLayout16;
                        iU = fi.u.u(E5(textView.getPaint(), value, icon), iF2);
                    } else {
                        imageView2 = imageView;
                        b10 = -2;
                        linearLayout12.addView(textView);
                        if (icon != null) {
                            z12 = true;
                        } else {
                            z12 = true;
                        }
                        if (!z12) {
                            com.max.hbimage.b.K(icon, imageView3);
                            linearLayout12.addView(imageView3);
                        }
                        if (this.Z3) {
                            linearLayout12.addView(imageView2);
                        }
                        r10.addView(linearLayout12);
                    }
                    i13++;
                    size = i14;
                    str2 = str;
                    i12 = iU;
                    iF = i16;
                    r12 = r10;
                } else {
                    r10 = r18;
                    if (iU > iL) {
                        linearLayout3 = this.f72203w;
                        if (linearLayout3 == null) {
                            kotlin.jvm.internal.f0.S(str);
                            linearLayout3 = null;
                        }
                        if (linearLayout3.getChildCount() >= 6) {
                            break;
                            break;
                        }
                        ?? linearLayout17 = new LinearLayout(this.mContext);
                        linearLayout17.setOrientation(0);
                        b10 = -2;
                        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams10.setMargins(0, 0, 0, i16);
                        linearLayout17.setLayoutParams(layoutParams10);
                        linearLayout12.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                        linearLayout12.addView(textView);
                        if (icon != null) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (!z13) {
                            com.max.hbimage.b.K(icon, imageView3);
                            linearLayout12.addView(imageView3);
                        }
                        if (this.Z3) {
                            linearLayout12.addView(imageView);
                        }
                        linearLayout17.addView(linearLayout12);
                        linearLayout4 = this.f72203w;
                        r11 = linearLayout4;
                        if (linearLayout4 == null) {
                            kotlin.jvm.internal.f0.S(str);
                            r11 = 0;
                        }
                        r11.addView(linearLayout17);
                        r10 = linearLayout17;
                        iU = fi.u.u(E5(textView.getPaint(), value, icon), iF2);
                    } else {
                        imageView2 = imageView;
                        b10 = -2;
                        linearLayout12.addView(textView);
                        if (icon != null) {
                            z12 = true;
                        } else {
                            z12 = true;
                        }
                        if (!z12) {
                            com.max.hbimage.b.K(icon, imageView3);
                            linearLayout12.addView(imageView3);
                        }
                        if (this.Z3) {
                            linearLayout12.addView(imageView2);
                        }
                        r10.addView(linearLayout12);
                    }
                    i13++;
                    size = i14;
                    str2 = str;
                    i12 = iU;
                    iF = i16;
                    r12 = r10;
                }
            }
        }
        LinearLayout linearLayout18 = this.f72203w;
        if (linearLayout18 == null) {
            kotlin.jvm.internal.f0.S(str);
            i10 = 0;
            linearLayout2 = null;
        } else {
            linearLayout2 = linearLayout18;
            i10 = 0;
        }
        linearLayout2.setVisibility(i10);
    }

    @Override // com.max.hbsearch.e
    public void J2(@dl.e ViewGroup viewGroup, @dl.e Context context) {
        if (PatchProxy.proxy(new Object[]{viewGroup, context}, this, changeQuickRedirect, false, bb.c.k.E2, new Class[]{ViewGroup.class, Context.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f72193p.J2(viewGroup, context);
    }

    public final void J5(@dl.e String str, @dl.e String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, bb.c.k.f33494d3, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        H5();
        EditText editText = null;
        B6(this, false, null, 3, null);
        com.max.hbsearch.k kVar = this.J3;
        if (kVar == null) {
            kotlin.jvm.internal.f0.S("mSearchFragment");
            kVar = null;
        }
        if (kVar.isAdded()) {
            com.max.hbsearch.k kVar2 = this.J3;
            if (kVar2 == null) {
                kotlin.jvm.internal.f0.S("mSearchFragment");
                kVar2 = null;
            }
            kVar2.z4(str2);
            com.max.hbsearch.k kVar3 = this.J3;
            if (kVar3 == null) {
                kotlin.jvm.internal.f0.S("mSearchFragment");
                kVar3 = null;
            }
            kVar3.O3(str);
            if (com.max.hbcommon.utils.c.u(str)) {
                return;
            }
            Activity mContext = this.mContext;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            EditText editText2 = this.G2;
            if (editText2 == null) {
                kotlin.jvm.internal.f0.S("mSearchEditText");
                editText2 = null;
            }
            T5(mContext, editText2);
            EditText editText3 = this.G2;
            if (editText3 == null) {
                kotlin.jvm.internal.f0.S("mSearchEditText");
            } else {
                editText = editText3;
            }
            editText.clearFocus();
            i6(true, str);
        }
    }

    @Override // com.max.hbsearch.e
    public boolean L2(@dl.e ContainerConfig containerConfig) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{containerConfig}, this, changeQuickRedirect, false, bb.c.k.F2, new Class[]{ContainerConfig.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.f72193p.L2(containerConfig);
    }

    public final boolean P5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.I2, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : ((Boolean) this.f72206x2.getValue()).booleanValue();
    }

    @Override // com.max.hbsearch.m
    public void S(@dl.e String str) {
        this.Q3 = str;
    }

    @Override // com.max.hbsearch.m
    @dl.e
    public String Z2() {
        return this.Q3;
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void a4(@dl.e View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.k.M2, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.a4(view, z10);
        setContentView(R.layout.hbsearch_fragment_new_search);
        L5();
        ViewGroup viewGroup = null;
        if (ob.a.b().t()) {
            ViewGroup viewGroup2 = this.C;
            if (viewGroup2 == null) {
                kotlin.jvm.internal.f0.S("vg_hot");
                viewGroup2 = null;
            }
            viewGroup2.setVisibility(8);
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        int i10 = R.id.fragment_container;
        Fragment fragmentR0 = childFragmentManager.r0(i10);
        if (fragmentR0 != null) {
            this.J3 = (com.max.hbsearch.k) fragmentR0;
        } else {
            fragmentR0 = null;
        }
        if (fragmentR0 == null) {
            pb.k kVarM = ob.a.m();
            Bundle bundle = this.f72208y1;
            if (bundle == null) {
                bundle = new Bundle();
            }
            Fragment fragmentB = kVarM.b(bundle);
            kotlin.jvm.internal.f0.n(fragmentB, "null cannot be cast to non-null type com.max.hbsearch.SearchAbstractFragment");
            this.J3 = (com.max.hbsearch.k) fragmentB;
            androidx.fragment.app.p0 p0VarU = getChildFragmentManager().u();
            com.max.hbsearch.k kVar = this.J3;
            if (kVar == null) {
                kotlin.jvm.internal.f0.S("mSearchFragment");
                kVar = null;
            }
            p0VarU.b(i10, kVar).m();
            com.max.hbsearch.k kVar2 = this.J3;
            if (kVar2 == null) {
                kotlin.jvm.internal.f0.S("mSearchFragment");
                kVar2 = null;
            }
            if (kVar2.i4() == 1) {
                Bundle bundle2 = this.f72208y1;
                kotlin.jvm.internal.f0.m(bundle2);
                if (bundle2.getBoolean(com.max.hbsearch.l.f72320a0)) {
                    this.R3 = true;
                    this.S3 = ob.a.m().a();
                    androidx.fragment.app.p0 p0VarU2 = getChildFragmentManager().u();
                    Fragment fragment = this.S3;
                    kotlin.jvm.internal.f0.m(fragment);
                    p0VarU2.b(i10, fragment).m();
                }
            }
        }
        com.max.hbsearch.k kVar3 = this.J3;
        if (kVar3 == null) {
            kotlin.jvm.internal.f0.S("mSearchFragment");
            kVar3 = null;
        }
        kVar3.w4(this);
        V5();
        a6();
        t0 t0Var = t0.f72375a;
        com.max.hbsearch.k kVar4 = this.J3;
        if (kVar4 == null) {
            kotlin.jvm.internal.f0.S("mSearchFragment");
            kVar4 = null;
        }
        if (t0Var.b(kVar4.i4())) {
            EditText editText = this.G2;
            if (editText == null) {
                kotlin.jvm.internal.f0.S("mSearchEditText");
                editText = null;
            }
            editText.postDelayed(new Runnable() { // from class: com.max.hbsearch.c0
                @Override // java.lang.Runnable
                public final void run() {
                    SearchNewFragment.b6(this.f72282b);
                }
            }, 300L);
        }
        B6(this, false, null, 2, null);
        String str = this.f72192c0;
        if (!(str == null || str.length() == 0)) {
            q6(this.f72192c0);
            v1(this.f72192c0, null, null);
            com.max.hbsearch.k kVar5 = this.J3;
            if (kVar5 == null) {
                kotlin.jvm.internal.f0.S("mSearchFragment");
                kVar5 = null;
            }
            kVar5.z4(this.f72194p1);
            K5(this, this.f72192c0, null, 2, null);
            EditText editText2 = this.G2;
            if (editText2 == null) {
                kotlin.jvm.internal.f0.S("mSearchEditText");
                editText2 = null;
            }
            ViewUtils.X(editText2);
            if (kotlin.jvm.internal.f0.g(this.f72194p1, f72186j4) || kotlin.jvm.internal.f0.g(this.f72194p1, f72187k4) || kotlin.jvm.internal.f0.g(this.f72194p1, "relevant_search")) {
                this.f72205x1 = true;
            }
        }
        if (this.mIsFirst && com.max.hbsearch.o.f72358b == null) {
            showLoading();
        }
        if (!L2(this.f72195p2)) {
            LinearLayout linearLayout = this.E;
            if (linearLayout == null) {
                kotlin.jvm.internal.f0.S("ll_hot");
            } else {
                viewGroup = linearLayout;
            }
            viewGroup.setVisibility(8);
            LinearLayout linearLayout2 = this.Z;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
            NestedScrollView nestedScrollView = this.Y;
            if (nestedScrollView != null) {
                nestedScrollView.setVisibility(8);
            }
            View view2 = this.f72190a0;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            Space space = this.f72191b0;
            if (space == null) {
                return;
            }
            space.setVisibility(8);
            return;
        }
        View view3 = this.D;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 == null) {
            kotlin.jvm.internal.f0.S("ll_hot");
            linearLayout3 = null;
        }
        linearLayout3.setVisibility(8);
        HorizontalScrollView horizontalScrollView = this.N;
        if (horizontalScrollView == null) {
            kotlin.jvm.internal.f0.S("sv_hot_v2");
            horizontalScrollView = null;
        }
        horizontalScrollView.setVisibility(8);
        c2(this);
        ConsecutiveScrollerLayout consecutiveScrollerLayout = this.f72204x;
        if (consecutiveScrollerLayout == null) {
            kotlin.jvm.internal.f0.S("sv_placeholder");
        } else {
            viewGroup = consecutiveScrollerLayout;
        }
        J2(viewGroup, this.mContext);
    }

    @Override // com.max.hbsearch.e
    public void c2(@dl.d com.max.hbsearch.n searchHost) {
        if (PatchProxy.proxy(new Object[]{searchHost}, this, changeQuickRedirect, false, bb.c.k.G2, new Class[]{com.max.hbsearch.n.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(searchHost, "searchHost");
        this.f72193p.c2(searchHost);
    }

    public final void e1(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.k.O3, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbsearch.k kVar = this.J3;
        if (kVar == null) {
            kotlin.jvm.internal.f0.S("mSearchFragment");
            kVar = null;
        }
        c cVar = kVar instanceof c ? (c) kVar : null;
        if (cVar != null) {
            cVar.e1(str);
        }
    }

    public final void f6(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.k.f33447b3, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        K5(this, str, null, 2, null);
    }

    @Override // com.max.hbsearch.m
    public void g(@dl.e String str) {
        this.M3 = str;
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.N2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.initData();
        if (L2(this.f72195p2)) {
            g6();
            j6(this, false, null, 2, null);
            Runnable runnable = new Runnable() { // from class: com.max.hbsearch.b0
                @Override // java.lang.Runnable
                public final void run() {
                    SearchNewFragment.U5(this.f72276b);
                }
            };
            this.S = runnable;
            this.K3.postDelayed(runnable, 300L);
            return;
        }
        h6();
        j6(this, false, null, 2, null);
        g gVar = new g();
        this.S = gVar;
        this.K3.postDelayed(gVar, 300L);
    }

    @Override // com.max.hbcommon.base.d
    public boolean isNotPage() {
        return true;
    }

    @Override // com.max.hbsearch.m
    public void n() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.T2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Activity mContext = this.mContext;
        kotlin.jvm.internal.f0.o(mContext, "mContext");
        EditText editText = this.G2;
        EditText editText2 = null;
        if (editText == null) {
            kotlin.jvm.internal.f0.S("mSearchEditText");
            editText = null;
        }
        T5(mContext, editText);
        EditText editText3 = this.G2;
        if (editText3 == null) {
            kotlin.jvm.internal.f0.S("mSearchEditText");
        } else {
            editText2 = editText3;
        }
        editText2.clearFocus();
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onCreate(@dl.e Bundle bundle) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.k.L2, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
            return;
        }
        onBackPressedDispatcher.c(this, new i());
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.S2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.K3.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.k.f33925w3, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.onHiddenChanged(z10);
        if (z10) {
            I5(false);
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.P3, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onPause();
        Activity mContext = this.mContext;
        kotlin.jvm.internal.f0.o(mContext, "mContext");
        EditText editText = this.G2;
        if (editText == null) {
            kotlin.jvm.internal.f0.S("mSearchEditText");
            editText = null;
        }
        T5(mContext, editText);
        I5(false);
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33903v3, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        if (d6()) {
            B6(this, false, null, 2, null);
        }
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.R2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbsearch.n.a.a(this, r(), null, null, 6, null);
        super.onStop();
    }

    @Override // com.max.hbsearch.m
    @dl.d
    public String r() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.W2, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        EditText editText = this.G2;
        if (editText == null) {
            kotlin.jvm.internal.f0.S("mSearchEditText");
            editText = null;
        }
        return editText.getText().toString();
    }

    @Override // com.max.hbcommon.base.d
    public void registerEvents() {
        ViewTreeObserver viewTreeObserver;
        Window window;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.V2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        FragmentActivity activity = getActivity();
        View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
        if (decorView == null || (viewTreeObserver = decorView.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.max.hbsearch.s
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                SearchNewFragment.k6(this.f72370b);
            }
        });
    }

    @Override // com.max.hbsearch.n
    public void s1(@dl.e KeyDescObj keyDescObj, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{keyDescObj, str}, this, changeQuickRedirect, false, bb.c.k.f33470c3, new Class[]{KeyDescObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        I5(false);
        if (keyDescObj != null) {
            String name = keyDescObj.getName();
            q6(name);
            if (!com.max.hbcommon.utils.c.u(name)) {
                v1(name, keyDescObj.getProtocol(), keyDescObj.getIcon());
                J5(r(), str);
                Activity mContext = this.mContext;
                kotlin.jvm.internal.f0.o(mContext, "mContext");
                EditText editText = this.G2;
                if (editText == null) {
                    kotlin.jvm.internal.f0.S("mSearchEditText");
                    editText = null;
                }
                T5(mContext, editText);
            }
            S5();
        }
    }

    @Override // com.max.hbsearch.n
    @SuppressLint({"AutoDispose"})
    public void v1(@dl.e String str, @dl.e String str2, @dl.e String str3) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, bb.c.k.L3, new Class[]{String.class, String.class, String.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(str)) {
            return;
        }
        String str4 = this.f72196p3;
        if (str4 == null) {
            kotlin.jvm.internal.f0.S("mSearchCacheKey");
            str4 = null;
        }
        com.max.hbcache.b.g("search_history", str4, KeyDescObj.class).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new d(str, str2, str3, this));
    }

    @Override // com.max.hbsearch.e
    public void w1(@dl.e List<WelcomePageList> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.k.H2, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f72193p.w1(list);
    }

    @Override // com.max.hbsearch.m
    @dl.e
    public String x3() {
        return this.f72194p1;
    }
}
