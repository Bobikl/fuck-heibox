package com.starlightc.ucropplus.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.j1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbutils.utils.ViewUtils;
import com.max.network.utils.DownloadResultBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.R;
import com.starlightc.ucropplus.databinding.FragmentTextModuleBinding;
import com.starlightc.ucropplus.model.StrokeObj;
import com.starlightc.ucropplus.model.TextColorInfo;
import com.starlightc.ucropplus.model.TextRenderInfo;
import com.starlightc.ucropplus.model.TextTypefaceInfo;
import com.starlightc.ucropplus.util.CommonRecyclerViewAdapter;
import com.starlightc.ucropplus.util.ModuleUtil;
import com.starlightc.ucropplus.util.TypefaceUtil;
import com.starlightc.ucropplus.view.TextRenderPreview;
import com.starlightc.ucropplus.view.widget.HBRingProgressBar;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.d2;

/* JADX INFO: compiled from: TextModuleFragment.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class TextModuleFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect;
    public CommonRecyclerViewAdapter<TextRenderInfo> advanceTypeFaceAdapter;
    public FragmentTextModuleBinding binding;

    @dl.e
    private d2 checkJob;
    public CommonRecyclerViewAdapter<TextColorInfo> colorAdapter;
    private int curColorIndex;
    private int curTFIndex;
    private boolean isViewCreated;
    public RecyclerView rvAdvanceTypeFace;
    public RecyclerView rvColor;
    public RecyclerView rvTypeFace;
    public CommonRecyclerViewAdapter<TextTypefaceInfo> typeFaceAdapter;

    @dl.d
    private final kotlin.z sampleTypeface$delegate = kotlin.b0.c(new yh.a<Typeface>() { // from class: com.starlightc.ucropplus.ui.TextModuleFragment$sampleTypeface$2
        public static ChangeQuickRedirect changeQuickRedirect;

        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // yh.a
        public final Typeface invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50490, new Class[0], Typeface.class);
            return patchProxyResultProxy.isSupported ? (Typeface) patchProxyResultProxy.result : Typeface.createFromAsset(this.this$0.getResources().getAssets(), "typeface/HelveticaRounded-Bold-T.ttf");
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.Typeface, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ Typeface invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50491, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
        }
    });

    @dl.d
    private final ArrayList<TextTypefaceInfo> tfList = new ArrayList<>();

    @dl.d
    private final ArrayList<TextRenderInfo> advTFList = new ArrayList<>();

    @dl.d
    private final ArrayList<TextColorInfo> colorList = new ArrayList<>();
    private int curAdvTFIndex = -1;

    /* JADX INFO: compiled from: TextModuleFragment.kt */
    public final class TextStyleOptionItemDecoration extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        public TextStyleOptionItemDecoration() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@dl.d Rect outRect, @dl.d View view, @dl.d RecyclerView parent, @dl.d RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{outRect, view, parent, state}, this, changeQuickRedirect, false, 50474, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(outRect, "outRect");
            kotlin.jvm.internal.f0.p(view, "view");
            kotlin.jvm.internal.f0.p(parent, "parent");
            kotlin.jvm.internal.f0.p(state, "state");
            if (parent.getChildAdapterPosition(view) != 0) {
                outRect.left = ViewUtils.f(TextModuleFragment.this.getContext(), 10.0f);
            } else {
                outRect.left = 0;
            }
        }
    }

    public static final /* synthetic */ void access$bindAdvanceTypeface(TextModuleFragment textModuleFragment, CommonRecyclerViewAdapter.CommonViewHolder commonViewHolder, TextRenderInfo textRenderInfo, int i10) {
        if (PatchProxy.proxy(new Object[]{textModuleFragment, commonViewHolder, textRenderInfo, new Integer(i10)}, null, changeQuickRedirect, true, 50471, new Class[]{TextModuleFragment.class, CommonRecyclerViewAdapter.CommonViewHolder.class, TextRenderInfo.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        textModuleFragment.bindAdvanceTypeface(commonViewHolder, textRenderInfo, i10);
    }

    public static final /* synthetic */ void access$bindTextColor(TextModuleFragment textModuleFragment, CommonRecyclerViewAdapter.CommonViewHolder commonViewHolder, TextColorInfo textColorInfo, int i10) {
        if (PatchProxy.proxy(new Object[]{textModuleFragment, commonViewHolder, textColorInfo, new Integer(i10)}, null, changeQuickRedirect, true, 50472, new Class[]{TextModuleFragment.class, CommonRecyclerViewAdapter.CommonViewHolder.class, TextColorInfo.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        textModuleFragment.bindTextColor(commonViewHolder, textColorInfo, i10);
    }

    public static final /* synthetic */ void access$bindTypeface(TextModuleFragment textModuleFragment, CommonRecyclerViewAdapter.CommonViewHolder commonViewHolder, TextTypefaceInfo textTypefaceInfo, int i10) {
        if (PatchProxy.proxy(new Object[]{textModuleFragment, commonViewHolder, textTypefaceInfo, new Integer(i10)}, null, changeQuickRedirect, true, 50470, new Class[]{TextModuleFragment.class, CommonRecyclerViewAdapter.CommonViewHolder.class, TextTypefaceInfo.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        textModuleFragment.bindTypeface(commonViewHolder, textTypefaceInfo, i10);
    }

    public static final /* synthetic */ void access$typefaceChecked(TextModuleFragment textModuleFragment, TextTypefaceInfo textTypefaceInfo, int i10, TextRenderInfo textRenderInfo) {
        if (PatchProxy.proxy(new Object[]{textModuleFragment, textTypefaceInfo, new Integer(i10), textRenderInfo}, null, changeQuickRedirect, true, 50473, new Class[]{TextModuleFragment.class, TextTypefaceInfo.class, Integer.TYPE, TextRenderInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        textModuleFragment.typefaceChecked(textTypefaceInfo, i10, textRenderInfo);
    }

    private final void applyRenderInfo(TextRenderInfo textRenderInfo) {
        TextRenderInfo currentRenderInfo;
        if (PatchProxy.proxy(new Object[]{textRenderInfo}, this, changeQuickRedirect, false, 50458, new Class[]{TextRenderInfo.class}, Void.TYPE).isSupported || (currentRenderInfo = getCurrentRenderInfo()) == null) {
            return;
        }
        currentRenderInfo.setStrokeList(textRenderInfo.getStrokeList());
        currentRenderInfo.setShadowEnable(textRenderInfo.getShadowEnable());
        currentRenderInfo.setShadowColor(textRenderInfo.getShadowColor());
        currentRenderInfo.setShadowOffsetX(textRenderInfo.getShadowOffsetX());
        currentRenderInfo.setShadowOffsetY(textRenderInfo.getShadowOffsetY());
        currentRenderInfo.setTextColor(textRenderInfo.getTextColor());
        currentRenderInfo.setId(textRenderInfo.getId());
        currentRenderInfo.setUseRate(false);
        requestRefreshTextSticker();
    }

    private final void bindAdvanceTypeface(CommonRecyclerViewAdapter.CommonViewHolder commonViewHolder, final TextRenderInfo textRenderInfo, final int i10) {
        if (PatchProxy.proxy(new Object[]{commonViewHolder, textRenderInfo, new Integer(i10)}, this, changeQuickRedirect, false, 50456, new Class[]{CommonRecyclerViewAdapter.CommonViewHolder.class, TextRenderInfo.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        TextRenderPreview textRenderPreview = (TextRenderPreview) commonViewHolder.findViewById(R.id.atp_preview);
        textRenderPreview.setTextSize(15.0f);
        textRenderPreview.initWithRenderInfo(textRenderInfo);
        textRenderPreview.setTypeface(getSampleTypeface());
        if (this.curAdvTFIndex == i10) {
            commonViewHolder.itemView.setBackground(androidx.core.content.res.i.g(getResources(), R.drawable.option_selected_background, null));
        } else {
            commonViewHolder.itemView.setBackground(androidx.core.content.res.i.g(getResources(), R.drawable.option_background, null));
        }
        textRenderPreview.setOnClickListener(new View.OnClickListener() { // from class: com.starlightc.ucropplus.ui.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextModuleFragment.bindAdvanceTypeface$lambda$1(this.f98116b, i10, textRenderInfo, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindAdvanceTypeface$lambda$1(TextModuleFragment this$0, int i10, TextRenderInfo data, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, new Integer(i10), data, view}, null, changeQuickRedirect, true, 50468, new Class[]{TextModuleFragment.class, Integer.TYPE, TextRenderInfo.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(data, "$data");
        int i11 = this$0.curAdvTFIndex;
        this$0.curAdvTFIndex = i10;
        this$0.getAdvanceTypeFaceAdapter().notifyItemChanged(i11);
        this$0.getAdvanceTypeFaceAdapter().notifyItemChanged(this$0.curAdvTFIndex);
        this$0.applyRenderInfo(data);
    }

    private final void bindTextColor(CommonRecyclerViewAdapter.CommonViewHolder commonViewHolder, final TextColorInfo textColorInfo, int i10) {
        if (PatchProxy.proxy(new Object[]{commonViewHolder, textColorInfo, new Integer(i10)}, this, changeQuickRedirect, false, 50455, new Class[]{CommonRecyclerViewAdapter.CommonViewHolder.class, TextColorInfo.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = commonViewHolder.findViewById(R.id.v_color_preview);
        ModuleUtil moduleUtil = ModuleUtil.INSTANCE;
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.f0.o(contextRequireContext, "requireContext(...)");
        viewFindViewById.setBackground(ModuleUtil.generateCircleDrawable$default(moduleUtil, contextRequireContext, textColorInfo.getValue(), false, 4, null));
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.starlightc.ucropplus.ui.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextModuleFragment.bindTextColor$lambda$0(this.f98114b, textColorInfo, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindTextColor$lambda$0(TextModuleFragment this$0, TextColorInfo data, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, data, view}, null, changeQuickRedirect, true, 50467, new Class[]{TextModuleFragment.class, TextColorInfo.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(data, "$data");
        TextRenderInfo currentRenderInfo = this$0.getCurrentRenderInfo();
        if (currentRenderInfo != null) {
            currentRenderInfo.setTextColor(data.getValue());
        }
        this$0.requestRefreshTextSticker();
    }

    private final void bindTypeface(CommonRecyclerViewAdapter.CommonViewHolder commonViewHolder, final TextTypefaceInfo textTypefaceInfo, final int i10) {
        if (PatchProxy.proxy(new Object[]{commonViewHolder, textTypefaceInfo, new Integer(i10)}, this, changeQuickRedirect, false, 50459, new Class[]{CommonRecyclerViewAdapter.CommonViewHolder.class, TextTypefaceInfo.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = (TextView) commonViewHolder.findViewById(R.id.tv_typeface);
        final ImageView imageView = (ImageView) commonViewHolder.findViewById(R.id.iv_download);
        final HBRingProgressBar hBRingProgressBar = (HBRingProgressBar) commonViewHolder.findViewById(R.id.progress);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.f124884b = true;
        textView.setText(textTypefaceInfo.getName());
        imageView.setVisibility(8);
        hBRingProgressBar.setVisibility(8);
        hBRingProgressBar.setProgress(0);
        if (textTypefaceInfo.isOnline()) {
            Context context = getContext();
            if (context != null) {
                textView.setTypeface(TypefaceUtil.INSTANCE.getTypeface(context, textTypefaceInfo.getTypeface(), textTypefaceInfo.getName() + "demo", true));
            }
            if (!textTypefaceInfo.isReady() && booleanRef.f124884b) {
                imageView.setVisibility(0);
            }
        } else {
            Context context2 = getContext();
            if (context2 != null) {
                textView.setTypeface(TypefaceUtil.INSTANCE.getTypeface(context2, textTypefaceInfo.getTypeface(), textTypefaceInfo.getName(), textTypefaceInfo.isOnline()));
            }
            imageView.setVisibility(8);
        }
        if (this.curTFIndex == i10) {
            textView.setBackground(androidx.core.content.res.i.g(getResources(), R.drawable.option_selected_background, null));
        } else {
            textView.setBackground(androidx.core.content.res.i.g(getResources(), R.drawable.option_background, null));
        }
        commonViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.starlightc.ucropplus.ui.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextModuleFragment.bindTypeface$lambda$4(textTypefaceInfo, booleanRef, this, hBRingProgressBar, imageView, i10, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindTypeface$lambda$4(final TextTypefaceInfo data, final Ref.BooleanRef clickable, final TextModuleFragment this$0, final HBRingProgressBar progressBar, ImageView ivDownload, final int i10, View view) {
        if (PatchProxy.proxy(new Object[]{data, clickable, this$0, progressBar, ivDownload, new Integer(i10), view}, null, changeQuickRedirect, true, 50469, new Class[]{TextTypefaceInfo.class, Ref.BooleanRef.class, TextModuleFragment.class, HBRingProgressBar.class, ImageView.class, Integer.TYPE, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(data, "$data");
        kotlin.jvm.internal.f0.p(clickable, "$clickable");
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(progressBar, "$progressBar");
        kotlin.jvm.internal.f0.p(ivDownload, "$ivDownload");
        if (!data.isOnline() || data.isReady()) {
            this$0.typefaceChecked(data, i10, this$0.getCurrentRenderInfo());
            return;
        }
        if (clickable.f124884b) {
            final TextRenderInfo currentRenderInfo = this$0.getCurrentRenderInfo();
            if (currentRenderInfo != null) {
                currentRenderInfo.setSetTypefaceName(data.getName());
            }
            clickable.f124884b = false;
            progressBar.setVisibility(0);
            ivDownload.setVisibility(8);
            progressBar.setProgress(40, 1000L);
            UCropPlusActivity editorActivity = this$0.getEditorActivity();
            if (editorActivity != null) {
                UCropPlusActivity.downloadTypeface$default(editorActivity, data.getName(), null, new yh.l<DownloadResultBuilder<String>, b2>() { // from class: com.starlightc.ucropplus.ui.TextModuleFragment$bindTypeface$3$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(DownloadResultBuilder<String> downloadResultBuilder) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{downloadResultBuilder}, this, changeQuickRedirect, false, 50476, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2(downloadResultBuilder);
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@dl.d DownloadResultBuilder<String> downloadTypeface) {
                        if (PatchProxy.proxy(new Object[]{downloadTypeface}, this, changeQuickRedirect, false, 50475, new Class[]{DownloadResultBuilder.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        kotlin.jvm.internal.f0.p(downloadTypeface, "$this$downloadTypeface");
                        final TextRenderInfo textRenderInfo = currentRenderInfo;
                        final TextTypefaceInfo textTypefaceInfo = data;
                        final TextModuleFragment textModuleFragment = this$0;
                        final int i11 = i10;
                        final Ref.BooleanRef booleanRef = clickable;
                        downloadTypeface.setOnSuccess(new yh.l<String, b2>() { // from class: com.starlightc.ucropplus.ui.TextModuleFragment$bindTypeface$3$1.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(String str) {
                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 50478, new Class[]{Object.class}, Object.class);
                                if (patchProxyResultProxy.isSupported) {
                                    return patchProxyResultProxy.result;
                                }
                                invoke2(str);
                                return b2.f124493a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@dl.e String str) {
                                if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 50477, new Class[]{String.class}, Void.TYPE).isSupported) {
                                    return;
                                }
                                if (str != null) {
                                    TextTypefaceInfo textTypefaceInfo2 = textTypefaceInfo;
                                    Ref.BooleanRef booleanRef2 = booleanRef;
                                    TypefaceUtil typefaceUtil = TypefaceUtil.INSTANCE;
                                    String name = textTypefaceInfo2.getName();
                                    kotlin.jvm.internal.f0.m(name);
                                    typefaceUtil.addCachedTypeface(name, str);
                                    textTypefaceInfo2.setReady(true);
                                    booleanRef2.f124884b = true;
                                }
                                TextRenderInfo textRenderInfo2 = textRenderInfo;
                                if (kotlin.jvm.internal.f0.g(textRenderInfo2 != null ? textRenderInfo2.getSetTypefaceName() : null, textTypefaceInfo.getName())) {
                                    TextModuleFragment.access$typefaceChecked(textModuleFragment, textTypefaceInfo, i11, textRenderInfo);
                                } else {
                                    textModuleFragment.getTypeFaceAdapter().notifyItemChanged(i11);
                                }
                            }
                        });
                        final HBRingProgressBar hBRingProgressBar = progressBar;
                        downloadTypeface.setOnLoading(new yh.p<Long, Long, b2>() { // from class: com.starlightc.ucropplus.ui.TextModuleFragment$bindTypeface$3$1.2
                            public static ChangeQuickRedirect changeQuickRedirect;

                            {
                                super(2);
                            }

                            /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, kotlin.b2] */
                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(Long l10, Long l11) {
                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{l10, l11}, this, changeQuickRedirect, false, 50480, new Class[]{Object.class, Object.class}, Object.class);
                                if (patchProxyResultProxy.isSupported) {
                                    return patchProxyResultProxy.result;
                                }
                                invoke(l10.longValue(), l11.longValue());
                                return b2.f124493a;
                            }

                            public final void invoke(long j10, long j11) {
                                Object[] objArr = {new Long(j10), new Long(j11)};
                                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                                Class cls = Long.TYPE;
                                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50479, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                                    return;
                                }
                                hBRingProgressBar.setProgress(((int) ((((long) 60) * j10) / j11)) + 40);
                            }
                        });
                        final Ref.BooleanRef booleanRef2 = clickable;
                        downloadTypeface.setOnError(new yh.l<Throwable, b2>() { // from class: com.starlightc.ucropplus.ui.TextModuleFragment$bindTypeface$3$1.3
                            public static ChangeQuickRedirect changeQuickRedirect;

                            {
                                super(1);
                            }

                            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 50482, new Class[]{Object.class}, Object.class);
                                if (patchProxyResultProxy.isSupported) {
                                    return patchProxyResultProxy.result;
                                }
                                invoke2(th2);
                                return b2.f124493a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@dl.d Throwable it) {
                                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 50481, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                                    return;
                                }
                                kotlin.jvm.internal.f0.p(it, "it");
                                booleanRef2.f124884b = true;
                            }
                        });
                        final Ref.BooleanRef booleanRef3 = clickable;
                        downloadTypeface.setOnDataEmpty(new yh.a<b2>() { // from class: com.starlightc.ucropplus.ui.TextModuleFragment$bindTypeface$3$1.4
                            public static ChangeQuickRedirect changeQuickRedirect;

                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                            @Override // yh.a
                            public /* bridge */ /* synthetic */ b2 invoke() {
                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50483, new Class[0], Object.class);
                                if (patchProxyResultProxy.isSupported) {
                                    return patchProxyResultProxy.result;
                                }
                                invoke2();
                                return b2.f124493a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                booleanRef3.f124884b = true;
                            }
                        });
                    }
                }, 2, null);
            }
        }
    }

    private final ArrayList<StrokeObj> createStrokeList(String str, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Float(f10)}, this, changeQuickRedirect, false, 50464, new Class[]{String.class, Float.TYPE}, ArrayList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ArrayList) patchProxyResultProxy.result;
        }
        ArrayList<StrokeObj> arrayList = new ArrayList<>();
        arrayList.add(new StrokeObj(str, f10));
        return arrayList;
    }

    private final TextRenderInfo getCurrentRenderInfo() {
        UCropPlusFragment currentCropFragment;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50453, new Class[0], TextRenderInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextRenderInfo) patchProxyResultProxy.result;
        }
        UCropPlusActivity editorActivity = getEditorActivity();
        if (editorActivity == null || (currentCropFragment = editorActivity.getCurrentCropFragment()) == null) {
            return null;
        }
        return currentCropFragment.getCurrentTextRenderInfo();
    }

    private final Typeface getSampleTypeface() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50445, new Class[0], Typeface.class);
        if (patchProxyResultProxy.isSupported) {
            return (Typeface) patchProxyResultProxy.result;
        }
        Object value = this.sampleTypeface$delegate.getValue();
        kotlin.jvm.internal.f0.o(value, "getValue(...)");
        return (Typeface) value;
    }

    private final void loadLocalColor() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50465, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.colorList.addAll(ModuleUtil.INSTANCE.getColorList());
        getColorAdapter().notifyDataSetChanged();
    }

    private final void loadLocalRenderInfo() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50463, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.advTFList.addAll(CollectionsKt__CollectionsKt.r(new TextRenderInfo(0, false, 0.0f, 0.0f, null, 0, 0, 0.0f, null, null, false, null, false, bb.c.k.f33426a5, null), new TextRenderInfo(j1.f21601t, true, 1.0f, 1.0f, createStrokeList("#000000", 0.5f), 1, Color.parseColor("#FFE600"), 0.0f, null, null, false, null, false, bb.c.k.f33632j3, null), new TextRenderInfo(0, false, 0.0f, 0.0f, createStrokeList("#000000", 1.0f), 2, 0, 0.0f, null, null, false, null, false, bb.c.k.K4, null), new TextRenderInfo(0, false, 0.0f, 0.0f, createStrokeList("#FFFFFF", 1.0f), 3, j1.f21601t, 0.0f, null, null, false, null, false, bb.c.k.f33969y3, null), new TextRenderInfo(0, false, 0.0f, 0.0f, createStrokeList("#05FF00", 0.5f), 4, j1.f21601t, 0.0f, null, null, false, null, false, bb.c.k.f33969y3, null), new TextRenderInfo(0, false, 0.0f, 0.0f, createStrokeList("#0038FF", 0.5f), 5, j1.f21601t, 0.0f, null, null, false, null, false, bb.c.k.f33969y3, null), new TextRenderInfo(0, false, 0.0f, 0.0f, createStrokeList("#FFFFFF", 0.25f), 6, j1.f21601t, 0.0f, null, null, false, null, false, bb.c.k.f33969y3, null), new TextRenderInfo(Color.parseColor("#0047FF"), true, 1.0f, 1.0f, createStrokeList("#0047FF", 0.5f), 7, 0, 0.0f, null, null, false, null, false, bb.c.k.f33904v4, null), new TextRenderInfo(Color.parseColor("#E1FFA0"), true, 1.0f, 1.0f, createStrokeList("#000000", 0.25f), 8, -1, 0.0f, null, null, false, null, false, bb.c.k.f33632j3, null), new TextRenderInfo(Color.parseColor("#FFD9A0"), true, 1.0f, 1.0f, createStrokeList("#000000", 0.25f), 9, -1, 0.0f, null, null, false, null, false, bb.c.k.f33632j3, null), new TextRenderInfo(Color.parseColor("#FFC0F1"), true, 1.0f, 1.0f, createStrokeList("#000000", 0.25f), 10, -1, 0.0f, null, null, false, null, false, bb.c.k.f33632j3, null), new TextRenderInfo(0, false, 0.0f, 0.0f, createStrokeList("#FF9090", 1.0f), 11, Color.parseColor("#FFC7C7"), 0.0f, null, null, false, null, false, bb.c.k.f33969y3, null)));
        getAdvanceTypeFaceAdapter().notifyDataSetChanged();
    }

    private final void loadLocalTypeface() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50462, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.tfList.add(new TextTypefaceInfo(false, false, "默认", 0, null, null, 33, null));
    }

    private final void loadRemoteColor() {
    }

    private final void loadRemoteRenderInfo() {
    }

    private final void loadRemoteTypeface() {
        ArrayList<TextTypefaceInfo> remoteTypefaceList;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50466, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        UCropPlusActivity editorActivity = getEditorActivity();
        if (editorActivity != null && (remoteTypefaceList = editorActivity.getRemoteTypefaceList()) != null) {
            this.tfList.addAll(remoteTypefaceList);
        }
        getTypeFaceAdapter().notifyDataSetChanged();
    }

    private final void refreshAdvTFItem(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 50452, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int i11 = this.curAdvTFIndex;
        this.curAdvTFIndex = i10;
        getAdvanceTypeFaceAdapter().notifyItemChanged(i11);
        getAdvanceTypeFaceAdapter().notifyItemChanged(this.curAdvTFIndex);
        getRvAdvanceTypeFace().smoothScrollToPosition(this.curAdvTFIndex);
    }

    private final void refreshTFItem(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 50451, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int i11 = this.curTFIndex;
        this.curTFIndex = i10;
        getTypeFaceAdapter().notifyItemChanged(i11);
        getTypeFaceAdapter().notifyItemChanged(this.curTFIndex);
        getRvTypeFace().smoothScrollToPosition(this.curTFIndex);
    }

    private final void requestRefreshTextSticker() {
        UCropPlusActivity editorActivity;
        UCropPlusFragment currentCropFragment;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50454, new Class[0], Void.TYPE).isSupported || (editorActivity = getEditorActivity()) == null || (currentCropFragment = editorActivity.getCurrentCropFragment()) == null) {
            return;
        }
        currentCropFragment.requestRefresh();
    }

    private final void typefaceChecked(TextTypefaceInfo textTypefaceInfo, int i10, TextRenderInfo textRenderInfo) {
        if (PatchProxy.proxy(new Object[]{textTypefaceInfo, new Integer(i10), textRenderInfo}, this, changeQuickRedirect, false, 50460, new Class[]{TextTypefaceInfo.class, Integer.TYPE, TextRenderInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        int i11 = this.curTFIndex;
        this.curTFIndex = i10;
        getTypeFaceAdapter().notifyItemChanged(i11);
        getTypeFaceAdapter().notifyItemChanged(this.curTFIndex);
        if (textRenderInfo == null) {
            return;
        }
        textRenderInfo.setTypeface(textTypefaceInfo.getTypeface());
        textRenderInfo.setRemoteTypeface(textTypefaceInfo.isOnline());
        textRenderInfo.setTypefaceName(textTypefaceInfo.getName());
        requestRefreshTextSticker();
    }

    public final void bindViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50447, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        FragmentTextModuleBinding fragmentTextModuleBindingInflate = FragmentTextModuleBinding.inflate(this.mInflater);
        kotlin.jvm.internal.f0.o(fragmentTextModuleBindingInflate, "inflate(...)");
        setBinding(fragmentTextModuleBindingInflate);
        setContentView(getBinding());
        RecyclerView rvTypeface = getBinding().rvTypeface;
        kotlin.jvm.internal.f0.o(rvTypeface, "rvTypeface");
        setRvTypeFace(rvTypeface);
        RecyclerView rvAdvancedTypeface = getBinding().rvAdvancedTypeface;
        kotlin.jvm.internal.f0.o(rvAdvancedTypeface, "rvAdvancedTypeface");
        setRvAdvanceTypeFace(rvAdvancedTypeface);
        RecyclerView rvColor = getBinding().rvColor;
        kotlin.jvm.internal.f0.o(rvColor, "rvColor");
        setRvColor(rvColor);
    }

    public final void checkSelectedInfo() {
        boolean z10;
        boolean z11;
        UCropPlusFragment currentCropFragment;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50450, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        UCropPlusActivity editorActivity = getEditorActivity();
        TextRenderInfo currentTextRenderInfo = (editorActivity == null || (currentCropFragment = editorActivity.getCurrentCropFragment()) == null) ? null : currentCropFragment.getCurrentTextRenderInfo();
        if (currentTextRenderInfo == null) {
            refreshTFItem(0);
            refreshAdvTFItem(0);
            return;
        }
        String typeface = currentTextRenderInfo.getTypeface();
        int id2 = currentTextRenderInfo.getId();
        Iterator<TextTypefaceInfo> it = this.tfList.iterator();
        int i10 = 0;
        while (true) {
            z10 = true;
            if (!it.hasNext()) {
                z11 = false;
                break;
            }
            int i11 = i10 + 1;
            if (kotlin.jvm.internal.f0.g(it.next().getTypeface(), typeface)) {
                refreshTFItem(i10);
                z11 = true;
                break;
            }
            i10 = i11;
        }
        if (!z11) {
            refreshTFItem(0);
        }
        Iterator<TextRenderInfo> it2 = this.advTFList.iterator();
        int i12 = 0;
        while (true) {
            if (!it2.hasNext()) {
                z10 = false;
                break;
            }
            int i13 = i12 + 1;
            if (it2.next().getId() == id2) {
                refreshAdvTFItem(i12);
                break;
            }
            i12 = i13;
        }
        if (z10) {
            return;
        }
        refreshAdvTFItem(0);
    }

    public final void clearAdvanceTypefaceCheck() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50457, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.curAdvTFIndex = -1;
        getAdvanceTypeFaceAdapter().notifyDataSetChanged();
    }

    @dl.d
    public final ArrayList<TextRenderInfo> getAdvTFList() {
        return this.advTFList;
    }

    @dl.d
    public final CommonRecyclerViewAdapter<TextRenderInfo> getAdvanceTypeFaceAdapter() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50441, new Class[0], CommonRecyclerViewAdapter.class);
        if (patchProxyResultProxy.isSupported) {
            return (CommonRecyclerViewAdapter) patchProxyResultProxy.result;
        }
        CommonRecyclerViewAdapter<TextRenderInfo> commonRecyclerViewAdapter = this.advanceTypeFaceAdapter;
        if (commonRecyclerViewAdapter != null) {
            return commonRecyclerViewAdapter;
        }
        kotlin.jvm.internal.f0.S("advanceTypeFaceAdapter");
        return null;
    }

    @dl.d
    public final FragmentTextModuleBinding getBinding() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50431, new Class[0], FragmentTextModuleBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (FragmentTextModuleBinding) patchProxyResultProxy.result;
        }
        FragmentTextModuleBinding fragmentTextModuleBinding = this.binding;
        if (fragmentTextModuleBinding != null) {
            return fragmentTextModuleBinding;
        }
        kotlin.jvm.internal.f0.S("binding");
        return null;
    }

    @dl.e
    public final d2 getCheckJob() {
        return this.checkJob;
    }

    @dl.d
    public final CommonRecyclerViewAdapter<TextColorInfo> getColorAdapter() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50443, new Class[0], CommonRecyclerViewAdapter.class);
        if (patchProxyResultProxy.isSupported) {
            return (CommonRecyclerViewAdapter) patchProxyResultProxy.result;
        }
        CommonRecyclerViewAdapter<TextColorInfo> commonRecyclerViewAdapter = this.colorAdapter;
        if (commonRecyclerViewAdapter != null) {
            return commonRecyclerViewAdapter;
        }
        kotlin.jvm.internal.f0.S("colorAdapter");
        return null;
    }

    @dl.d
    public final ArrayList<TextColorInfo> getColorList() {
        return this.colorList;
    }

    @dl.e
    public final UCropPlusActivity getEditorActivity() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50446, new Class[0], UCropPlusActivity.class);
        if (patchProxyResultProxy.isSupported) {
            return (UCropPlusActivity) patchProxyResultProxy.result;
        }
        Activity activity = this.mContext;
        if (activity == null || !(activity instanceof UCropPlusActivity)) {
            return null;
        }
        kotlin.jvm.internal.f0.n(activity, "null cannot be cast to non-null type com.starlightc.ucropplus.ui.UCropPlusActivity");
        return (UCropPlusActivity) activity;
    }

    @dl.d
    public final RecyclerView getRvAdvanceTypeFace() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50435, new Class[0], RecyclerView.class);
        if (patchProxyResultProxy.isSupported) {
            return (RecyclerView) patchProxyResultProxy.result;
        }
        RecyclerView recyclerView = this.rvAdvanceTypeFace;
        if (recyclerView != null) {
            return recyclerView;
        }
        kotlin.jvm.internal.f0.S("rvAdvanceTypeFace");
        return null;
    }

    @dl.d
    public final RecyclerView getRvColor() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50437, new Class[0], RecyclerView.class);
        if (patchProxyResultProxy.isSupported) {
            return (RecyclerView) patchProxyResultProxy.result;
        }
        RecyclerView recyclerView = this.rvColor;
        if (recyclerView != null) {
            return recyclerView;
        }
        kotlin.jvm.internal.f0.S("rvColor");
        return null;
    }

    @dl.d
    public final RecyclerView getRvTypeFace() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50433, new Class[0], RecyclerView.class);
        if (patchProxyResultProxy.isSupported) {
            return (RecyclerView) patchProxyResultProxy.result;
        }
        RecyclerView recyclerView = this.rvTypeFace;
        if (recyclerView != null) {
            return recyclerView;
        }
        kotlin.jvm.internal.f0.S("rvTypeFace");
        return null;
    }

    @dl.d
    public final ArrayList<TextTypefaceInfo> getTfList() {
        return this.tfList;
    }

    @dl.d
    public final CommonRecyclerViewAdapter<TextTypefaceInfo> getTypeFaceAdapter() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50439, new Class[0], CommonRecyclerViewAdapter.class);
        if (patchProxyResultProxy.isSupported) {
            return (CommonRecyclerViewAdapter) patchProxyResultProxy.result;
        }
        CommonRecyclerViewAdapter<TextTypefaceInfo> commonRecyclerViewAdapter = this.typeFaceAdapter;
        if (commonRecyclerViewAdapter != null) {
            return commonRecyclerViewAdapter;
        }
        kotlin.jvm.internal.f0.S("typeFaceAdapter");
        return null;
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.d View rootView) {
        if (PatchProxy.proxy(new Object[]{rootView}, this, changeQuickRedirect, false, 50448, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(rootView, "rootView");
        bindViews();
        getRvColor().setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        getRvTypeFace().setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        getRvAdvanceTypeFace().setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        getRvTypeFace().addItemDecoration(new TextStyleOptionItemDecoration());
        getRvAdvanceTypeFace().addItemDecoration(new TextStyleOptionItemDecoration());
        getRvColor().addItemDecoration(new TextStyleOptionItemDecoration());
        setTypeFaceAdapter(new CommonRecyclerViewAdapter<TextTypefaceInfo>(this.tfList, R.layout.item_typeface) { // from class: com.starlightc.ucropplus.ui.TextModuleFragment.installViews.1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: bindViewHolder, reason: avoid collision after fix types in other method */
            public void bindViewHolder2(@dl.d CommonRecyclerViewAdapter.CommonViewHolder holder, @dl.d TextTypefaceInfo data, int i10) {
                if (PatchProxy.proxy(new Object[]{holder, data, new Integer(i10)}, this, changeQuickRedirect, false, 50484, new Class[]{CommonRecyclerViewAdapter.CommonViewHolder.class, TextTypefaceInfo.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(holder, "holder");
                kotlin.jvm.internal.f0.p(data, "data");
                TextModuleFragment.access$bindTypeface(TextModuleFragment.this, holder, data, i10);
            }

            @Override // com.starlightc.ucropplus.util.CommonRecyclerViewAdapter
            public /* bridge */ /* synthetic */ void bindViewHolder(CommonRecyclerViewAdapter.CommonViewHolder commonViewHolder, TextTypefaceInfo textTypefaceInfo, int i10) {
                if (PatchProxy.proxy(new Object[]{commonViewHolder, textTypefaceInfo, new Integer(i10)}, this, changeQuickRedirect, false, 50485, new Class[]{CommonRecyclerViewAdapter.CommonViewHolder.class, Object.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                bindViewHolder2(commonViewHolder, textTypefaceInfo, i10);
            }
        });
        setAdvanceTypeFaceAdapter(new CommonRecyclerViewAdapter<TextRenderInfo>(this.advTFList, R.layout.item_advanced_typeface) { // from class: com.starlightc.ucropplus.ui.TextModuleFragment.installViews.2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: bindViewHolder, reason: avoid collision after fix types in other method */
            public void bindViewHolder2(@dl.d CommonRecyclerViewAdapter.CommonViewHolder holder, @dl.d TextRenderInfo data, int i10) {
                if (PatchProxy.proxy(new Object[]{holder, data, new Integer(i10)}, this, changeQuickRedirect, false, 50486, new Class[]{CommonRecyclerViewAdapter.CommonViewHolder.class, TextRenderInfo.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(holder, "holder");
                kotlin.jvm.internal.f0.p(data, "data");
                TextModuleFragment.access$bindAdvanceTypeface(TextModuleFragment.this, holder, data, i10);
            }

            @Override // com.starlightc.ucropplus.util.CommonRecyclerViewAdapter
            public /* bridge */ /* synthetic */ void bindViewHolder(CommonRecyclerViewAdapter.CommonViewHolder commonViewHolder, TextRenderInfo textRenderInfo, int i10) {
                if (PatchProxy.proxy(new Object[]{commonViewHolder, textRenderInfo, new Integer(i10)}, this, changeQuickRedirect, false, 50487, new Class[]{CommonRecyclerViewAdapter.CommonViewHolder.class, Object.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                bindViewHolder2(commonViewHolder, textRenderInfo, i10);
            }
        });
        setColorAdapter(new CommonRecyclerViewAdapter<TextColorInfo>(this.colorList, R.layout.item_color) { // from class: com.starlightc.ucropplus.ui.TextModuleFragment.installViews.3
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: bindViewHolder, reason: avoid collision after fix types in other method */
            public void bindViewHolder2(@dl.d CommonRecyclerViewAdapter.CommonViewHolder holder, @dl.d TextColorInfo data, int i10) {
                if (PatchProxy.proxy(new Object[]{holder, data, new Integer(i10)}, this, changeQuickRedirect, false, 50488, new Class[]{CommonRecyclerViewAdapter.CommonViewHolder.class, TextColorInfo.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(holder, "holder");
                kotlin.jvm.internal.f0.p(data, "data");
                TextModuleFragment.access$bindTextColor(TextModuleFragment.this, holder, data, i10);
            }

            @Override // com.starlightc.ucropplus.util.CommonRecyclerViewAdapter
            public /* bridge */ /* synthetic */ void bindViewHolder(CommonRecyclerViewAdapter.CommonViewHolder commonViewHolder, TextColorInfo textColorInfo, int i10) {
                if (PatchProxy.proxy(new Object[]{commonViewHolder, textColorInfo, new Integer(i10)}, this, changeQuickRedirect, false, 50489, new Class[]{CommonRecyclerViewAdapter.CommonViewHolder.class, Object.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                bindViewHolder2(commonViewHolder, textColorInfo, i10);
            }
        });
        getRvTypeFace().setAdapter(getTypeFaceAdapter());
        getRvAdvanceTypeFace().setAdapter(getAdvanceTypeFaceAdapter());
        getRvColor().setAdapter(getColorAdapter());
    }

    public final boolean isViewCreated() {
        return this.isViewCreated;
    }

    @Override // com.max.hbcommon.base.d
    public void loadData() {
        UCropPlusFragment currentCropFragment;
        UCropPlusFragment currentCropFragment2;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50461, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.isViewCreated = true;
        loadLocalTypeface();
        loadLocalRenderInfo();
        loadLocalColor();
        loadRemoteTypeface();
        loadRemoteRenderInfo();
        loadRemoteColor();
        UCropPlusActivity editorActivity = getEditorActivity();
        if ((editorActivity == null || (currentCropFragment2 = editorActivity.getCurrentCropFragment()) == null || !currentCropFragment2.isTextStickerSelected()) ? false : true) {
            checkSelectedInfo();
            return;
        }
        UCropPlusActivity editorActivity2 = getEditorActivity();
        if (editorActivity2 == null || (currentCropFragment = editorActivity2.getCurrentCropFragment()) == null) {
            return;
        }
        UCropPlusFragment.createTextSticker$default(currentCropFragment, null, false, 3, null);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50449, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroyView();
        d2 d2Var = this.checkJob;
        if (d2Var != null) {
            kotlin.jvm.internal.f0.m(d2Var);
            if (d2Var.isActive()) {
                d2 d2Var2 = this.checkJob;
                kotlin.jvm.internal.f0.m(d2Var2);
                d2.a.b(d2Var2, null, 1, null);
            }
        }
    }

    public final void setAdvanceTypeFaceAdapter(@dl.d CommonRecyclerViewAdapter<TextRenderInfo> commonRecyclerViewAdapter) {
        if (PatchProxy.proxy(new Object[]{commonRecyclerViewAdapter}, this, changeQuickRedirect, false, 50442, new Class[]{CommonRecyclerViewAdapter.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(commonRecyclerViewAdapter, "<set-?>");
        this.advanceTypeFaceAdapter = commonRecyclerViewAdapter;
    }

    public final void setBinding(@dl.d FragmentTextModuleBinding fragmentTextModuleBinding) {
        if (PatchProxy.proxy(new Object[]{fragmentTextModuleBinding}, this, changeQuickRedirect, false, 50432, new Class[]{FragmentTextModuleBinding.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(fragmentTextModuleBinding, "<set-?>");
        this.binding = fragmentTextModuleBinding;
    }

    public final void setCheckJob(@dl.e d2 d2Var) {
        this.checkJob = d2Var;
    }

    public final void setColorAdapter(@dl.d CommonRecyclerViewAdapter<TextColorInfo> commonRecyclerViewAdapter) {
        if (PatchProxy.proxy(new Object[]{commonRecyclerViewAdapter}, this, changeQuickRedirect, false, 50444, new Class[]{CommonRecyclerViewAdapter.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(commonRecyclerViewAdapter, "<set-?>");
        this.colorAdapter = commonRecyclerViewAdapter;
    }

    public final void setRvAdvanceTypeFace(@dl.d RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, 50436, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(recyclerView, "<set-?>");
        this.rvAdvanceTypeFace = recyclerView;
    }

    public final void setRvColor(@dl.d RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, 50438, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(recyclerView, "<set-?>");
        this.rvColor = recyclerView;
    }

    public final void setRvTypeFace(@dl.d RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, 50434, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(recyclerView, "<set-?>");
        this.rvTypeFace = recyclerView;
    }

    public final void setTypeFaceAdapter(@dl.d CommonRecyclerViewAdapter<TextTypefaceInfo> commonRecyclerViewAdapter) {
        if (PatchProxy.proxy(new Object[]{commonRecyclerViewAdapter}, this, changeQuickRedirect, false, 50440, new Class[]{CommonRecyclerViewAdapter.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(commonRecyclerViewAdapter, "<set-?>");
        this.typeFaceAdapter = commonRecyclerViewAdapter;
    }

    public final void setViewCreated(boolean z10) {
        this.isViewCreated = z10;
    }
}
