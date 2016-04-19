package com.richsjeson.bistua.presenter;

import com.richsjeson.bistua.view.IView;

/**
 * Created by RichsJeson on 2016/4/19.
 * @see <p>设置Presenter的生命周期</p>
 */
public interface IPresenter<V extends IView> {

    void onCreate();

    void setView(V view);

    void onDestroy();

}
