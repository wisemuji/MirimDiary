package wisemuji.kr.hs.mirim.mirimdiary;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by aristata on 2016-07-20.
 */
public class Tab_Pager_Adapter extends FragmentStatePagerAdapter {
    private int tabCount;

    public Tab_Pager_Adapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 1:
                MainActivity.Diary_Write diaryWrite = new MainActivity.Diary_Write();
                return diaryWrite;
            case 2:

                MainActivity.Diary_List diaryList = new MainActivity.Diary_List();
                return diaryList;
            case 0:
                MainActivity.Diary_Setting diarySetting = new MainActivity.Diary_Setting();
                return diarySetting;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}

