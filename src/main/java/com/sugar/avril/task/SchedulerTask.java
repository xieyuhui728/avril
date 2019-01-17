package com.sugar.avril.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Auther: xieyuhui
 * @Date: 2019-01-09 20:26
 * @Description: spring boot 的定时任务 需要在启动类上开启EnableScheduling注解
 */
@Component
public class SchedulerTask {

    private int count = 0;

    /**
     * Description:
     *
     * @Scheduled 参数可以接受两种定时的设置，
     * 一种是我们常用的cron=,
     * 一种是 fixedRate
     * fixedRate 说明
     * @Scheduled(fixedRate = 6000) ：上一次开始执行时间点之后6秒再执行
     * @Scheduled(fixedDelay = 6000) ：上一次执行完毕时间点之后6秒再执行
     * @Scheduled(initialDelay=1000, fixedRate=6000) ：第一次延迟1秒后执行，之后按fixedRate的规则每6秒执行一次
     * <p><p/>
     * @param:
     * @return:
     * @auther: xieyuhui
     * @date: 2019-01-09 20:28
     */
    @Scheduled(cron = "*/6 * * * * ?")
    private void firstTask() {
        System.out.println("this is scheduler task runing  " + (count++));
    }
}
