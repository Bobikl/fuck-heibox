package com.umeng.socialize.shareboard;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.common.ResContainer;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.UmengText;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ShareBoardMenuHelper {
    private static String TAG = "ShareBoardMenuHelper";
    private ShareBoardConfig mShareBoardConfig;

    public ShareBoardMenuHelper(ShareBoardConfig shareBoardConfig) {
        this.mShareBoardConfig = shareBoardConfig;
    }

    private View createBtnView(Context context, final SnsPlatform snsPlatform) {
        String str;
        LinearLayout linearLayout = new LinearLayout(context);
        int resourceId = 0;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(17);
        if (snsPlatform != null) {
            ResContainer resContainer = ResContainer.get(context);
            View viewInflate = LayoutInflater.from(context).inflate(resContainer.layout("socialize_share_menu_item"), (ViewGroup) null);
            SocializeImageView socializeImageView = (SocializeImageView) viewInflate.findViewById(resContainer.id("socialize_image_view"));
            TextView textView = (TextView) viewInflate.findViewById(resContainer.id("socialize_text_view"));
            ShareBoardConfig shareBoardConfig = this.mShareBoardConfig;
            int i10 = shareBoardConfig.mMenuBgColor;
            if (i10 == 0 || shareBoardConfig.mMenuBgShape == ShareBoardConfig.BG_SHAPE_NONE) {
                socializeImageView.setPadding(0, 0, 0, 0);
            } else {
                socializeImageView.setBackgroundColor(i10, shareBoardConfig.mMenuBgPressedColor);
                ShareBoardConfig shareBoardConfig2 = this.mShareBoardConfig;
                socializeImageView.setBackgroundShape(shareBoardConfig2.mMenuBgShape, shareBoardConfig2.mMenuBgShapeAngle);
            }
            int i11 = this.mShareBoardConfig.mMenuIconPressedColor;
            if (i11 != 0) {
                socializeImageView.setPressedColor(i11);
            }
            try {
                str = snsPlatform.mShowWord;
            } catch (Exception e10) {
                SHARE_MEDIA share_media = snsPlatform.mPlatform;
                SLog.error(UmengText.SHAREBOARD.NULLNAME + (share_media == null ? "" : share_media.toString()), e10);
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                textView.setText(snsPlatform.mShowWord);
            }
            textView.setGravity(17);
            try {
                resourceId = ResContainer.getResourceId(context, "drawable", snsPlatform.mIcon);
            } catch (Exception e11) {
                SHARE_MEDIA share_media2 = snsPlatform.mPlatform;
                SLog.error(UmengText.SHAREBOARD.NULLNAME + (share_media2 != null ? share_media2.toString() : ""), e11);
            }
            if (resourceId != 0) {
                socializeImageView.setImageResource(resourceId);
            }
            int i12 = this.mShareBoardConfig.mMenuTextColor;
            if (i12 != 0) {
                textView.setTextColor(i12);
            }
            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.umeng.socialize.shareboard.ShareBoardMenuHelper.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    SHARE_MEDIA share_media3 = snsPlatform.mPlatform;
                    if (ShareBoardMenuHelper.this.mShareBoardConfig == null || ShareBoardMenuHelper.this.mShareBoardConfig.getShareBoardlistener() == null) {
                        return;
                    }
                    ShareBoardMenuHelper.this.mShareBoardConfig.getShareBoardlistener().onclick(snsPlatform, share_media3);
                }
            });
            linearLayout.addView(viewInflate);
        }
        return linearLayout;
    }

    private View createRowLayout(Context context, SnsPlatform[] snsPlatformArr, boolean z10) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (z10) {
            layoutParams.topMargin = dip2px(context, 20.0f);
        }
        linearLayout.setLayoutParams(layoutParams);
        for (SnsPlatform snsPlatform : snsPlatformArr) {
            linearLayout.addView(createBtnView(context, snsPlatform));
        }
        return linearLayout;
    }

    private int dip2px(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public View createPageLayout(Context context, SnsPlatform[][] snsPlatformArr) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(48);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int i10 = 0;
        while (i10 < snsPlatformArr.length) {
            linearLayout.addView(createRowLayout(context, snsPlatformArr[i10], i10 != 0));
            i10++;
        }
        return linearLayout;
    }

    public List<SnsPlatform[][]> formatPageData(List<SnsPlatform> list) {
        int i10;
        int i11 = this.mShareBoardConfig.mMenuColumnNum * 2;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i12 = this.mShareBoardConfig.mMenuColumnNum;
        if (size < i12) {
            SnsPlatform[][] snsPlatformArr = (SnsPlatform[][]) Array.newInstance((Class<?>) SnsPlatform.class, 1, size);
            for (int i13 = 0; i13 < list.size(); i13++) {
                snsPlatformArr[0][i13] = list.get(i13);
            }
            arrayList.add(snsPlatformArr);
            return arrayList;
        }
        int i14 = size / i11;
        int i15 = size % i11;
        if (i15 != 0) {
            i10 = (i15 / i12) + (i15 % i12 != 0 ? 1 : 0);
            i14++;
        } else {
            i10 = -1;
        }
        int i16 = 0;
        while (i16 < i14) {
            arrayList.add((SnsPlatform[][]) Array.newInstance((Class<?>) SnsPlatform.class, (i16 != i14 + (-1) || i10 == -1) ? 2 : i10, this.mShareBoardConfig.mMenuColumnNum));
            i16++;
        }
        int i17 = 0;
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            for (SnsPlatform[] snsPlatformArr2 : (SnsPlatform[][]) arrayList.get(i18)) {
                for (int i19 = 0; i19 < snsPlatformArr2.length; i19++) {
                    if (i17 < size) {
                        snsPlatformArr2[i19] = list.get(i17);
                    }
                    i17++;
                }
            }
        }
        return arrayList;
    }
}
