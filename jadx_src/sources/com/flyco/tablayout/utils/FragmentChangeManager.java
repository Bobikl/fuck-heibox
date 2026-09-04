package com.flyco.tablayout.utils;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.p0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class FragmentChangeManager {
    private int mContainerViewId;
    private int mCurrentTab;
    private FragmentManager mFragmentManager;
    private ArrayList<Fragment> mFragments;

    public FragmentChangeManager(FragmentManager fragmentManager, int i10, ArrayList<Fragment> arrayList) {
        this.mFragmentManager = fragmentManager;
        this.mContainerViewId = i10;
        this.mFragments = arrayList;
        initFragments();
    }

    private void initFragments() {
        for (Fragment fragment : this.mFragments) {
            this.mFragmentManager.u().b(this.mContainerViewId, fragment).u(fragment).m();
        }
        setFragments(0);
    }

    public Fragment getCurrentFragment() {
        return this.mFragments.get(this.mCurrentTab);
    }

    public int getCurrentTab() {
        return this.mCurrentTab;
    }

    public void setFragments(int i10) {
        for (int i11 = 0; i11 < this.mFragments.size(); i11++) {
            p0 p0VarU = this.mFragmentManager.u();
            Fragment fragment = this.mFragments.get(i11);
            if (i11 == i10) {
                p0VarU.P(fragment);
            } else {
                p0VarU.u(fragment);
            }
            p0VarU.m();
        }
        this.mCurrentTab = i10;
    }
}
