package com.xuexiang.xnobugdemo.fragment;

import android.util.Log;

import com.xuexiang.xnobug.core.proxy.impl.DefaultInformationCollectorImpl;
import com.xuexiang.xpage.annotation.Page;
import com.xuexiang.xpage.base.XPageSimpleListFragment;

import java.util.List;

/**
 * @author xuexiang
 * @since 2019-05-04 19:26
 */
@Page(name = "测试")
public class TestFragment extends XPageSimpleListFragment {
    /**
     * 初始化例子
     *
     * @param lists
     * @return
     */
    @Override
    protected List<String> initSimpleData(List<String> lists) {
        lists.add("测试");
        return lists;
    }

    /**
     * 条目点击
     *
     * @param position
     */
    @Override
    protected void onItemClick(int position) {
        switch(position) {
            case 0:
                DefaultInformationCollectorImpl info = new DefaultInformationCollectorImpl();
                Log.e("xuexiang", info.getAppInfo(getContext()).toString());
                Log.e("xuexiang", info.getDeviceInfo(getContext()).toString());
                Log.e("xuexiang", info.getDeviceStatusInfo(getContext()).toString());
                try {
                    int a = 12 / 0;
                } catch (Exception e) {
                    Log.e("xuexiang", info.getErrorInfo(e).toString());
                }
                break;
            case 1:

                break;
            default:
                break;
        }
    }
}
