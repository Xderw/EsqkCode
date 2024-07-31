package com.preciouslove.esqkcode_module2_config.config;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author yuanxin
 * @DATE 2024/7/23
 * @Description TODO
 */
@Slf4j
public class StdoutLogger extends com.p6spy.engine.spy.appender.StdoutLogger {

          public void logText(String text) {
                    String ANSI_RESET = "\u001B[0m";
                    String ANSI_BLUE = "\u001B[34m";
                    log.info("查询sql:{}{}{}", ANSI_BLUE,text,ANSI_RESET);
          }

}
