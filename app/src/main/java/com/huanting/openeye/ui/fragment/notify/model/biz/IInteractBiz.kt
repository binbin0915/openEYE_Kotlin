package com.huanting.openeye.ui.fragment.notify.model.biz

import io.reactivex.Observer

/**
 *Created by yicooll
 * on 2020/7/20
 */
interface IInteractBiz {
    fun getInteractData(observer:Observer<Any>)
}