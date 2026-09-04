package com.umeng.socialize.shareboard;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class SocializeMenuPagerAdapter extends a {
    private Context mContext;
    private ShareBoardMenuHelper mMenuHelper;
    private List<SnsPlatform[][]> mPageData;

    public SocializeMenuPagerAdapter(Context context, ShareBoardConfig shareBoardConfig) {
        this(context, shareBoardConfig, null);
    }

    public SocializeMenuPagerAdapter(Context context, ShareBoardConfig shareBoardConfig, List<SnsPlatform> list) {
        this.mPageData = new ArrayList();
        this.mContext = context;
        this.mMenuHelper = new ShareBoardMenuHelper(shareBoardConfig);
        setData(list);
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        List<SnsPlatform[][]> list = this.mPageData;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.viewpager.widget.a
    public Object instantiateItem(ViewGroup viewGroup, int i10) {
        View viewCreatePageLayout = this.mMenuHelper.createPageLayout(this.mContext, this.mPageData.get(i10));
        viewGroup.addView(viewCreatePageLayout);
        return viewCreatePageLayout;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public void setData(List<SnsPlatform> list) {
        this.mPageData.clear();
        if (list != null) {
            this.mPageData.addAll(this.mMenuHelper.formatPageData(list));
        }
        notifyDataSetChanged();
    }
}
