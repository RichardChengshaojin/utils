package log;

import org.apache.commons.logging.Log;

/**
 * DEC
 *
 * @auther chengshaojin
 * @since 2016/12/3
 */
public class UseLogger {

    public static void printAllKindsLogInfo(Log logger) {
        if(logger.isTraceEnabled()) {
            logger.trace("this is trace information");
        }
        if(logger.isDebugEnabled()) {
            logger.debug("this is debug information");
        }
        if(logger.isInfoEnabled()) {
            logger.info("this is info information");
        }
        if(logger.isWarnEnabled()) {
            logger.warn("this is warn information");
        }
        if(logger.isErrorEnabled()) {
            logger.error("this is error information");
        }
        if(logger.isFatalEnabled()) {
            logger.fatal("this is fatal information");
        }
    }
}
