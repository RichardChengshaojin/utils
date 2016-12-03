package third.log;

import org.apache.commons.logging.Log;

/**
 * DEC
 *
 * @auther chengshaojin
 * @since 2016/12/3
 */
public class UseLogger {

    public static void printAllKindsLogInfo(Log logger) {
        logger.trace("this is trace information");
        logger.debug("this is debug information");
        logger.info("this is info information");
        logger.warn("this is warn information");
        logger.error("this is error information");
        logger.fatal("this is fatal information");
    }
}
