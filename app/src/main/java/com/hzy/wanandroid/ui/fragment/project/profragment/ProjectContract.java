package com.hzy.wanandroid.ui.fragment.project.profragment;

import com.hzy.wanandroid.base.mvp.BasePersenter;
import com.hzy.wanandroid.base.mvp.BaseView;
import com.hzy.wanandroid.bean.ProjectBean;

import java.util.List;

/**
 * Created by hzy on 2019/1/22
 *
 * @author hzy
 * */
public interface ProjectContract {

    interface View extends BaseView {
        void updateProject(List<ProjectBean> projectList);
    }

    interface Presenter extends BasePersenter<View> {
        void getProjectList();
    }
}
