package com.starlightc.ucropplus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.f0;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.v;
import androidx.annotation.x;
import androidx.fragment.app.Fragment;
import com.google.android.material.color.utilities.d;
import com.max.hbcache.c;
import com.max.hbutils.utils.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.model.AspectRatio;
import com.starlightc.ucropplus.model.Draft;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class UCrop {
    public static final String EXTRA_ASPECT_RATIO_X = "HEYBOX_UCROP.AspectRatioX";
    public static final String EXTRA_ASPECT_RATIO_Y = "HEYBOX_UCROP.AspectRatioY";
    public static final String EXTRA_DRAFT_INFO = "HEYBOX_UCROP.Draft_Info";
    public static final String EXTRA_ERROR = "HEYBOX_UCROP.Error";
    public static final String EXTRA_INPUT_URI = "HEYBOX_UCROP.InputUri";
    public static final String EXTRA_MAX_SIZE_X = "HEYBOX_UCROP.MaxSizeX";
    public static final String EXTRA_MAX_SIZE_Y = "HEYBOX_UCROP.MaxSizeY";
    public static final String EXTRA_MULTI_DRAFT = "HEYBOX_UCROP.Multi_Draft";
    public static final String EXTRA_MULTI_HAS_EDITED_FLAG = "HEYBOX_UCROP.Multi_hasEditedFlag";
    public static final String EXTRA_MULTI_INPUT_URI = "HEYBOX_UCROP.Multi_InputUri";
    public static final String EXTRA_MULTI_OUTPUT_URI = "HEYBOX_UCROP.Multi_OutputUri";
    public static final String EXTRA_OUTPUT_CROP_ASPECT_RATIO = "HEYBOX_UCROP.CropAspectRatio";
    public static final String EXTRA_OUTPUT_IMAGE_HEIGHT = "HEYBOX_UCROP.ImageHeight";
    public static final String EXTRA_OUTPUT_IMAGE_WIDTH = "HEYBOX_UCROP.ImageWidth";
    public static final String EXTRA_OUTPUT_OFFSET_X = "HEYBOX_UCROP.OffsetX";
    public static final String EXTRA_OUTPUT_OFFSET_Y = "HEYBOX_UCROP.OffsetY";
    public static final String EXTRA_OUTPUT_URI = "HEYBOX_UCROP.OutputUri";
    private static final String EXTRA_PREFIX = "HEYBOX_UCROP";
    public static final int MIN_SIZE = 10;
    public static final int REQUEST_CROP = 69;
    public static final int RESULT_ERROR = 96;
    public static ChangeQuickRedirect changeQuickRedirect;
    private Intent mCropIntent = new Intent();
    private Bundle mCropOptionsBundle;

    public static class Options {
        public static final String EXTRA_ALLOWED_GESTURES = "HEYBOX_UCROP.AllowedGestures";
        public static final String EXTRA_ASPECT_RATIO_OPTIONS = "HEYBOX_UCROP.AspectRatioOptions";
        public static final String EXTRA_ASPECT_RATIO_SELECTED_BY_DEFAULT = "HEYBOX_UCROP.AspectRatioSelectedByDefault";
        public static final String EXTRA_CIRCLE_DIMMED_LAYER = "HEYBOX_UCROP.CircleDimmedLayer";
        public static final String EXTRA_COMPRESSION_FORMAT_NAME = "HEYBOX_UCROP.CompressionFormatName";
        public static final String EXTRA_COMPRESSION_QUALITY = "HEYBOX_UCROP.CompressionQuality";
        public static final String EXTRA_CROP_FRAME_COLOR = "HEYBOX_UCROP.CropFrameColor";
        public static final String EXTRA_CROP_FRAME_STROKE_WIDTH = "HEYBOX_UCROP.CropFrameStrokeWidth";
        public static final String EXTRA_CROP_GRID_COLOR = "HEYBOX_UCROP.CropGridColor";
        public static final String EXTRA_CROP_GRID_COLUMN_COUNT = "HEYBOX_UCROP.CropGridColumnCount";
        public static final String EXTRA_CROP_GRID_ROW_COUNT = "HEYBOX_UCROP.CropGridRowCount";
        public static final String EXTRA_CROP_GRID_STROKE_WIDTH = "HEYBOX_UCROP.CropGridStrokeWidth";
        public static final String EXTRA_DIMMED_LAYER_COLOR = "HEYBOX_UCROP.DimmedLayerColor";
        public static final String EXTRA_FREE_STYLE_CROP = "HEYBOX_UCROP.FreeStyleCrop";
        public static final String EXTRA_HIDE_BOTTOM_CONTROLS = "HEYBOX_UCROP.HideBottomControls";
        public static final String EXTRA_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION = "HEYBOX_UCROP.ImageToCropBoundsAnimDuration";
        public static final String EXTRA_MAX_BITMAP_SIZE = "HEYBOX_UCROP.MaxBitmapSize";
        public static final String EXTRA_MAX_SCALE_MULTIPLIER = "HEYBOX_UCROP.MaxScaleMultiplier";
        public static final String EXTRA_SHOW_CROP_FRAME = "HEYBOX_UCROP.ShowCropFrame";
        public static final String EXTRA_SHOW_CROP_GRID = "HEYBOX_UCROP.ShowCropGrid";
        public static final String EXTRA_STATUS_BAR_COLOR = "HEYBOX_UCROP.StatusBarColor";
        public static final String EXTRA_TOOL_BAR_COLOR = "HEYBOX_UCROP.ToolbarColor";
        public static final String EXTRA_UCROP_COLOR_CONTROLS_WIDGET_ACTIVE = "HEYBOX_UCROP.UcropColorControlsWidgetActive";
        public static final String EXTRA_UCROP_LOGO_COLOR = "HEYBOX_UCROP.UcropLogoColor";
        public static final String EXTRA_UCROP_ROOT_VIEW_BACKGROUND_COLOR = "HEYBOX_UCROP.UcropRootViewBackgroundColor";
        public static final String EXTRA_UCROP_TITLE_TEXT_TOOLBAR = "HEYBOX_UCROP.UcropToolbarTitleText";
        public static final String EXTRA_UCROP_WIDGET_CANCEL_DRAWABLE = "HEYBOX_UCROP.UcropToolbarCancelDrawable";
        public static final String EXTRA_UCROP_WIDGET_COLOR_TOOLBAR = "HEYBOX_UCROP.UcropToolbarWidgetColor";
        public static final String EXTRA_UCROP_WIDGET_CROP_DRAWABLE = "HEYBOX_UCROP.UcropToolbarCropDrawable";
        public static ChangeQuickRedirect changeQuickRedirect;
        private final Bundle mOptionBundle = new Bundle();

        @n0
        public Bundle getOptionBundle() {
            return this.mOptionBundle;
        }

        public void setActiveControlsWidgetColor(@l int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49793, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.mOptionBundle.putInt(EXTRA_UCROP_COLOR_CONTROLS_WIDGET_ACTIVE, i10);
        }

        public void setAllowedGestures(int i10, int i11, int i12) {
            Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49777, new Class[]{cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            this.mOptionBundle.putIntArray(EXTRA_ALLOWED_GESTURES, new int[]{i10, i11, i12});
        }

        public void setAspectRatioOptions(int i10, AspectRatio... aspectRatioArr) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10), aspectRatioArr}, this, changeQuickRedirect, false, 49801, new Class[]{Integer.TYPE, AspectRatio[].class}, Void.TYPE).isSupported) {
                return;
            }
            if (i10 >= aspectRatioArr.length) {
                throw new IllegalArgumentException(String.format(Locale.US, "Index [selectedByDefault = %d] (0-based) cannot be higher or equal than aspect ratio options count [count = %d].", Integer.valueOf(i10), Integer.valueOf(aspectRatioArr.length)));
            }
            this.mOptionBundle.putInt(EXTRA_ASPECT_RATIO_SELECTED_BY_DEFAULT, i10);
            this.mOptionBundle.putParcelableArrayList(EXTRA_ASPECT_RATIO_OPTIONS, new ArrayList<>(Arrays.asList(aspectRatioArr)));
        }

        public void setCircleDimmedLayer(boolean z10) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 49782, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.mOptionBundle.putBoolean(EXTRA_CIRCLE_DIMMED_LAYER, z10);
        }

        public void setCompressionFormat(@n0 Bitmap.CompressFormat compressFormat) {
            if (PatchProxy.proxy(new Object[]{compressFormat}, this, changeQuickRedirect, false, 49775, new Class[]{Bitmap.CompressFormat.class}, Void.TYPE).isSupported) {
                return;
            }
            this.mOptionBundle.putString(EXTRA_COMPRESSION_FORMAT_NAME, compressFormat.name());
        }

        public void setCompressionQuality(@f0(from = 0) int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49776, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.mOptionBundle.putInt(EXTRA_COMPRESSION_QUALITY, i10);
        }

        public void setCropFrameColor(@l int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49784, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.mOptionBundle.putInt(EXTRA_CROP_FRAME_COLOR, i10);
        }

        public void setCropFrameStrokeWidth(@f0(from = 0) int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49785, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.mOptionBundle.putInt(EXTRA_CROP_FRAME_STROKE_WIDTH, i10);
        }

        public void setCropGridColor(@l int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49789, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.mOptionBundle.putInt(EXTRA_CROP_GRID_COLOR, i10);
        }

        public void setCropGridColumnCount(@f0(from = 0) int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49788, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.mOptionBundle.putInt(EXTRA_CROP_GRID_COLUMN_COUNT, i10);
        }

        public void setCropGridRowCount(@f0(from = 0) int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49787, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.mOptionBundle.putInt(EXTRA_CROP_GRID_ROW_COUNT, i10);
        }

        public void setCropGridStrokeWidth(@f0(from = 0) int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49790, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.mOptionBundle.putInt(EXTRA_CROP_GRID_STROKE_WIDTH, i10);
        }

        public void setDimmedLayerColor(@l int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49781, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.mOptionBundle.putInt(EXTRA_DIMMED_LAYER_COLOR, i10);
        }

        public void setFreeStyleCropEnabled(boolean z10) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 49800, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.mOptionBundle.putBoolean(EXTRA_FREE_STYLE_CROP, z10);
        }

        public void setHideBottomControls(boolean z10) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 49799, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.mOptionBundle.putBoolean(EXTRA_HIDE_BOTTOM_CONTROLS, z10);
        }

        public void setImageToCropBoundsAnimDuration(@f0(from = 10) int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49779, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.mOptionBundle.putInt(EXTRA_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION, i10);
        }

        public void setLogoColor(@l int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49798, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.mOptionBundle.putInt(EXTRA_UCROP_LOGO_COLOR, i10);
        }

        public void setMaxBitmapSize(@f0(from = 10) int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49780, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.mOptionBundle.putInt(EXTRA_MAX_BITMAP_SIZE, i10);
        }

        public void setMaxScaleMultiplier(@x(from = d.f53848a, fromInclusive = false) float f10) {
            if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 49778, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.mOptionBundle.putFloat(EXTRA_MAX_SCALE_MULTIPLIER, f10);
        }

        public void setRootViewBackgroundColor(@l int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49802, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.mOptionBundle.putInt(EXTRA_UCROP_ROOT_VIEW_BACKGROUND_COLOR, i10);
        }

        public void setShowCropFrame(boolean z10) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 49783, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.mOptionBundle.putBoolean(EXTRA_SHOW_CROP_FRAME, z10);
        }

        public void setShowCropGrid(boolean z10) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 49786, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.mOptionBundle.putBoolean(EXTRA_SHOW_CROP_GRID, z10);
        }

        public void setStatusBarColor(@l int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49792, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.mOptionBundle.putInt(EXTRA_STATUS_BAR_COLOR, i10);
        }

        public void setToolbarCancelDrawable(@v int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49796, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.mOptionBundle.putInt(EXTRA_UCROP_WIDGET_CANCEL_DRAWABLE, i10);
        }

        public void setToolbarColor(@l int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49791, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.mOptionBundle.putInt(EXTRA_TOOL_BAR_COLOR, i10);
        }

        public void setToolbarCropDrawable(@v int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49797, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.mOptionBundle.putInt(EXTRA_UCROP_WIDGET_CROP_DRAWABLE, i10);
        }

        public void setToolbarTitle(@p0 String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 49795, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            this.mOptionBundle.putString(EXTRA_UCROP_TITLE_TEXT_TOOLBAR, str);
        }

        public void setToolbarWidgetColor(@l int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49794, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.mOptionBundle.putInt(EXTRA_UCROP_WIDGET_COLOR_TOOLBAR, i10);
        }

        public void useSourceImageAspectRatio() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49804, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.mOptionBundle.putFloat(UCrop.EXTRA_ASPECT_RATIO_X, 0.0f);
            this.mOptionBundle.putFloat(UCrop.EXTRA_ASPECT_RATIO_Y, 0.0f);
        }

        public void withAspectRatio(float f10, float f11) {
            Object[] objArr = {new Float(f10), new Float(f11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Float.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49803, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            this.mOptionBundle.putFloat(UCrop.EXTRA_ASPECT_RATIO_X, f10);
            this.mOptionBundle.putFloat(UCrop.EXTRA_ASPECT_RATIO_Y, f11);
        }

        public void withMaxResultSize(@f0(from = 10) int i10, @f0(from = 10) int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49805, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            this.mOptionBundle.putInt(UCrop.EXTRA_MAX_SIZE_X, i10);
            this.mOptionBundle.putInt(UCrop.EXTRA_MAX_SIZE_Y, i11);
        }
    }

    private UCrop(@n0 Uri uri, @n0 Uri uri2) {
        Bundle bundle = new Bundle();
        this.mCropOptionsBundle = bundle;
        bundle.putParcelable(EXTRA_INPUT_URI, uri);
        this.mCropOptionsBundle.putParcelable(EXTRA_OUTPUT_URI, uri2);
    }

    private UCrop(@n0 ArrayList<Uri> arrayList, @n0 Uri uri) {
        Bundle bundle = new Bundle();
        this.mCropOptionsBundle = bundle;
        bundle.putParcelableArrayList(EXTRA_MULTI_INPUT_URI, arrayList);
        this.mCropOptionsBundle.putParcelable(EXTRA_OUTPUT_URI, uri);
    }

    private UCrop(@n0 ArrayList<Uri> arrayList, @n0 Uri uri, @n0 ArrayList<Draft> arrayList2) {
        Bundle bundle = new Bundle();
        this.mCropOptionsBundle = bundle;
        bundle.putParcelableArrayList(EXTRA_MULTI_INPUT_URI, arrayList);
        this.mCropOptionsBundle.putParcelable(EXTRA_OUTPUT_URI, uri);
        this.mCropOptionsBundle.putSerializable(EXTRA_DRAFT_INFO, arrayList2);
    }

    public static ArrayList<Draft> getDraft(@n0 ArrayList<Uri> arrayList) {
        ArrayList<Draft> arrayList2;
        String src;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList}, null, changeQuickRedirect, true, 49753, new Class[]{ArrayList.class}, ArrayList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ArrayList) patchProxyResultProxy.result;
        }
        String strO = c.o("draft_info", null);
        if (strO != null && (arrayList2 = (ArrayList) k.b(strO, Draft.class)) != null && !arrayList2.isEmpty()) {
            HashMap map = new HashMap();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                Draft draft = arrayList2.get(i10);
                if (draft.getSrc() != null && (src = draft.getSrc()) != null) {
                    map.put(src, draft);
                }
            }
            for (Uri uri : arrayList) {
                if (uri.getPath() != null && map.get(uri.getPath()) != null) {
                    return arrayList2;
                }
            }
        }
        return null;
    }

    @p0
    public static Throwable getError(@n0 Intent intent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{intent}, null, changeQuickRedirect, true, 49774, new Class[]{Intent.class}, Throwable.class);
        return patchProxyResultProxy.isSupported ? (Throwable) patchProxyResultProxy.result : (Throwable) intent.getSerializableExtra(EXTRA_ERROR);
    }

    @p0
    public static Uri getOutput(@n0 Intent intent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{intent}, null, changeQuickRedirect, true, 49770, new Class[]{Intent.class}, Uri.class);
        return patchProxyResultProxy.isSupported ? (Uri) patchProxyResultProxy.result : (Uri) intent.getParcelableExtra(EXTRA_OUTPUT_URI);
    }

    public static float getOutputCropAspectRatio(@n0 Intent intent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{intent}, null, changeQuickRedirect, true, 49773, new Class[]{Intent.class}, Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : intent.getFloatExtra(EXTRA_OUTPUT_CROP_ASPECT_RATIO, 0.0f);
    }

    public static int getOutputImageHeight(@n0 Intent intent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{intent}, null, changeQuickRedirect, true, 49772, new Class[]{Intent.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : intent.getIntExtra(EXTRA_OUTPUT_IMAGE_HEIGHT, -1);
    }

    public static int getOutputImageWidth(@n0 Intent intent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{intent}, null, changeQuickRedirect, true, 49771, new Class[]{Intent.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : intent.getIntExtra(EXTRA_OUTPUT_IMAGE_WIDTH, -1);
    }

    public static UCrop of(@n0 Uri uri, @n0 Uri uri2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri, uri2}, null, changeQuickRedirect, true, 49750, new Class[]{Uri.class, Uri.class}, UCrop.class);
        return patchProxyResultProxy.isSupported ? (UCrop) patchProxyResultProxy.result : new UCrop(uri, uri2);
    }

    public static UCrop of(@n0 ArrayList<Uri> arrayList, @n0 Uri uri) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList, uri}, null, changeQuickRedirect, true, 49751, new Class[]{ArrayList.class, Uri.class}, UCrop.class);
        return patchProxyResultProxy.isSupported ? (UCrop) patchProxyResultProxy.result : new UCrop(arrayList, uri);
    }

    public static UCrop of(@n0 ArrayList<Uri> arrayList, @n0 Uri uri, @n0 ArrayList<Draft> arrayList2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList, uri, arrayList2}, null, changeQuickRedirect, true, 49752, new Class[]{ArrayList.class, Uri.class, ArrayList.class}, UCrop.class);
        return patchProxyResultProxy.isSupported ? (UCrop) patchProxyResultProxy.result : new UCrop(arrayList, uri, arrayList2);
    }

    public Intent getCropIntent() {
        return this.mCropIntent;
    }

    public UCropFragment getFragment() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49768, new Class[0], UCropFragment.class);
        return patchProxyResultProxy.isSupported ? (UCropFragment) patchProxyResultProxy.result : UCropFragment.newInstance(this.mCropOptionsBundle);
    }

    public UCropFragment getFragment(Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 49769, new Class[]{Bundle.class}, UCropFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (UCropFragment) patchProxyResultProxy.result;
        }
        this.mCropOptionsBundle = bundle;
        return getFragment();
    }

    public Intent getIntent(@n0 Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 49766, new Class[]{Context.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : getIntent(context, 0);
    }

    public Intent getIntent(@n0 Context context, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10)}, this, changeQuickRedirect, false, 49767, new Class[]{Context.class, Integer.TYPE}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        if (i10 == 0 || i10 != 1) {
            this.mCropIntent.setClass(context, UCropActivity.class);
        } else {
            this.mCropIntent.setClass(context, UCropPlusActivity.class);
        }
        this.mCropIntent.putExtras(this.mCropOptionsBundle);
        return this.mCropIntent;
    }

    public void start(@n0 Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 49758, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        start(activity, 69);
    }

    public void start(@n0 Activity activity, int i10) {
        if (PatchProxy.proxy(new Object[]{activity, new Integer(i10)}, this, changeQuickRedirect, false, 49760, new Class[]{Activity.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        activity.startActivityForResult(getIntent(activity), i10);
    }

    public void start(@n0 Context context, @n0 Fragment fragment) {
        if (PatchProxy.proxy(new Object[]{context, fragment}, this, changeQuickRedirect, false, 49762, new Class[]{Context.class, Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        start(context, fragment, 69);
    }

    public void start(@n0 Context context, @n0 Fragment fragment, int i10) {
        if (PatchProxy.proxy(new Object[]{context, fragment, new Integer(i10)}, this, changeQuickRedirect, false, 49764, new Class[]{Context.class, Fragment.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        fragment.startActivityForResult(getIntent(context), i10);
    }

    public void startWithType(@n0 Activity activity, int i10) {
        if (PatchProxy.proxy(new Object[]{activity, new Integer(i10)}, this, changeQuickRedirect, false, 49759, new Class[]{Activity.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        startWithType(activity, 69, i10);
    }

    public void startWithType(@n0 Activity activity, int i10, int i11) {
        Object[] objArr = {activity, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49761, new Class[]{Activity.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        activity.startActivityForResult(getIntent(activity, i11), i10);
    }

    public void startWithType(@n0 Context context, @n0 Fragment fragment, int i10) {
        if (PatchProxy.proxy(new Object[]{context, fragment, new Integer(i10)}, this, changeQuickRedirect, false, 49763, new Class[]{Context.class, Fragment.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        fragment.startActivityForResult(getIntent(context, i10), 69);
    }

    public void startWithType(@n0 Context context, @n0 Fragment fragment, int i10, int i11) {
        Object[] objArr = {context, fragment, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49765, new Class[]{Context.class, Fragment.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        fragment.startActivityForResult(getIntent(context, i11), i10);
    }

    public UCrop useSourceImageAspectRatio() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49755, new Class[0], UCrop.class);
        if (patchProxyResultProxy.isSupported) {
            return (UCrop) patchProxyResultProxy.result;
        }
        this.mCropOptionsBundle.putFloat(EXTRA_ASPECT_RATIO_X, 0.0f);
        this.mCropOptionsBundle.putFloat(EXTRA_ASPECT_RATIO_Y, 0.0f);
        return this;
    }

    public UCrop withAspectRatio(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49754, new Class[]{cls, cls}, UCrop.class);
        if (patchProxyResultProxy.isSupported) {
            return (UCrop) patchProxyResultProxy.result;
        }
        this.mCropOptionsBundle.putFloat(EXTRA_ASPECT_RATIO_X, f10);
        this.mCropOptionsBundle.putFloat(EXTRA_ASPECT_RATIO_Y, f11);
        return this;
    }

    public UCrop withMaxResultSize(@f0(from = 10) int i10, @f0(from = 10) int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49756, new Class[]{cls, cls}, UCrop.class);
        if (patchProxyResultProxy.isSupported) {
            return (UCrop) patchProxyResultProxy.result;
        }
        if (i10 < 10) {
            i10 = 10;
        }
        if (i11 < 10) {
            i11 = 10;
        }
        this.mCropOptionsBundle.putInt(EXTRA_MAX_SIZE_X, i10);
        this.mCropOptionsBundle.putInt(EXTRA_MAX_SIZE_Y, i11);
        return this;
    }

    public UCrop withOptions(@n0 Options options) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{options}, this, changeQuickRedirect, false, 49757, new Class[]{Options.class}, UCrop.class);
        if (patchProxyResultProxy.isSupported) {
            return (UCrop) patchProxyResultProxy.result;
        }
        this.mCropOptionsBundle.putAll(options.getOptionBundle());
        return this;
    }
}
